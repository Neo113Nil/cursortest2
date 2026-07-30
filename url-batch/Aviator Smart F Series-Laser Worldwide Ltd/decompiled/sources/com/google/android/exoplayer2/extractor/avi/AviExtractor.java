package com.google.android.exoplayer2.extractor.avi;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.DummyExtractorOutput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes3.dex */
public final class AviExtractor implements Extractor {
    private static final int AVIIF_KEYFRAME = 16;
    public static final int FOURCC_AVI_ = 541677121;
    public static final int FOURCC_JUNK = 1263424842;
    public static final int FOURCC_LIST = 1414744396;
    public static final int FOURCC_RIFF = 1179011410;
    public static final int FOURCC_auds = 1935963489;
    public static final int FOURCC_avih = 1751742049;
    public static final int FOURCC_hdrl = 1819436136;
    public static final int FOURCC_idx1 = 829973609;
    public static final int FOURCC_movi = 1769369453;
    public static final int FOURCC_strf = 1718776947;
    public static final int FOURCC_strh = 1752331379;
    public static final int FOURCC_strl = 1819440243;
    public static final int FOURCC_strn = 1852994675;
    public static final int FOURCC_txts = 1937012852;
    public static final int FOURCC_vids = 1935960438;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_FINDING_IDX1_HEADER = 4;
    private static final int STATE_FINDING_MOVI_HEADER = 3;
    private static final int STATE_READING_HDRL_BODY = 2;
    private static final int STATE_READING_HDRL_HEADER = 1;
    private static final int STATE_READING_IDX1_BODY = 5;
    private static final int STATE_READING_SAMPLES = 6;
    private static final int STATE_SKIPPING_TO_HDRL = 0;
    private static final String TAG = "AviExtractor";
    private AviMainHeaderChunk aviHeader;

    @Nullable
    private ChunkReader currentChunkReader;
    private int idx1BodySize;
    private long pendingReposition;
    private boolean seekMapHasBeenOutput;
    private int state;
    private final ParsableByteArray scratch = new ParsableByteArray(12);
    private final ChunkHeaderHolder chunkHeaderHolder = new ChunkHeaderHolder();
    private ExtractorOutput extractorOutput = new DummyExtractorOutput();
    private ChunkReader[] chunkReaders = new ChunkReader[0];
    private long moviStart = -1;
    private long moviEnd = -1;
    private int hdrlSize = -1;
    private long durationUs = C.TIME_UNSET;

    private class AviSeekMap implements SeekMap {
        private final long durationUs;

        public AviSeekMap(long j8) {
            this.durationUs = j8;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j8) {
            SeekMap.SeekPoints seekPoints = AviExtractor.this.chunkReaders[0].getSeekPoints(j8);
            for (int i8 = 1; i8 < AviExtractor.this.chunkReaders.length; i8++) {
                SeekMap.SeekPoints seekPoints2 = AviExtractor.this.chunkReaders[i8].getSeekPoints(j8);
                if (seekPoints2.first.position < seekPoints.first.position) {
                    seekPoints = seekPoints2;
                }
            }
            return seekPoints;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }
    }

    private static class ChunkHeaderHolder {
        public int chunkType;
        public int listType;
        public int size;

        private ChunkHeaderHolder() {
        }

        public void populateFrom(ParsableByteArray parsableByteArray) {
            this.chunkType = parsableByteArray.readLittleEndianInt();
            this.size = parsableByteArray.readLittleEndianInt();
            this.listType = 0;
        }

        public void populateWithListHeaderFrom(ParsableByteArray parsableByteArray) {
            populateFrom(parsableByteArray);
            if (this.chunkType == 1414744396) {
                this.listType = parsableByteArray.readLittleEndianInt();
                return;
            }
            throw ParserException.createForMalformedContainer("LIST expected, found: " + this.chunkType, null);
        }
    }

    private static void alignInputToEvenPosition(ExtractorInput extractorInput) {
        if ((extractorInput.getPosition() & 1) == 1) {
            extractorInput.skipFully(1);
        }
    }

    @Nullable
    private ChunkReader getChunkReader(int i8) {
        for (ChunkReader chunkReader : this.chunkReaders) {
            if (chunkReader.handlesChunkId(i8)) {
                return chunkReader;
            }
        }
        return null;
    }

    private void parseHdrlBody(ParsableByteArray parsableByteArray) {
        ListChunk parseFrom = ListChunk.parseFrom(FOURCC_hdrl, parsableByteArray);
        if (parseFrom.getType() != 1819436136) {
            throw ParserException.createForMalformedContainer("Unexpected header list type " + parseFrom.getType(), null);
        }
        AviMainHeaderChunk aviMainHeaderChunk = (AviMainHeaderChunk) parseFrom.getChild(AviMainHeaderChunk.class);
        if (aviMainHeaderChunk == null) {
            throw ParserException.createForMalformedContainer("AviHeader not found", null);
        }
        this.aviHeader = aviMainHeaderChunk;
        this.durationUs = aviMainHeaderChunk.totalFrames * aviMainHeaderChunk.frameDurationUs;
        ArrayList arrayList = new ArrayList();
        UnmodifiableIterator<AviChunk> it = parseFrom.children.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            AviChunk next = it.next();
            if (next.getType() == 1819440243) {
                int i9 = i8 + 1;
                ChunkReader processStreamList = processStreamList((ListChunk) next, i8);
                if (processStreamList != null) {
                    arrayList.add(processStreamList);
                }
                i8 = i9;
            }
        }
        this.chunkReaders = (ChunkReader[]) arrayList.toArray(new ChunkReader[0]);
        this.extractorOutput.endTracks();
    }

    private void parseIdx1Body(ParsableByteArray parsableByteArray) {
        long peekSeekOffset = peekSeekOffset(parsableByteArray);
        while (parsableByteArray.bytesLeft() >= 16) {
            int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
            int readLittleEndianInt2 = parsableByteArray.readLittleEndianInt();
            long readLittleEndianInt3 = parsableByteArray.readLittleEndianInt() + peekSeekOffset;
            parsableByteArray.readLittleEndianInt();
            ChunkReader chunkReader = getChunkReader(readLittleEndianInt);
            if (chunkReader != null) {
                if ((readLittleEndianInt2 & 16) == 16) {
                    chunkReader.appendKeyFrameToIndex(readLittleEndianInt3);
                }
                chunkReader.incrementIndexChunkCount();
            }
        }
        for (ChunkReader chunkReader2 : this.chunkReaders) {
            chunkReader2.compactIndex();
        }
        this.seekMapHasBeenOutput = true;
        this.extractorOutput.seekMap(new AviSeekMap(this.durationUs));
    }

    private long peekSeekOffset(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 16) {
            return 0L;
        }
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(8);
        long readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        long j8 = this.moviStart;
        long j9 = readLittleEndianInt <= j8 ? j8 + 8 : 0L;
        parsableByteArray.setPosition(position);
        return j9;
    }

    @Nullable
    private ChunkReader processStreamList(ListChunk listChunk, int i8) {
        AviStreamHeaderChunk aviStreamHeaderChunk = (AviStreamHeaderChunk) listChunk.getChild(AviStreamHeaderChunk.class);
        StreamFormatChunk streamFormatChunk = (StreamFormatChunk) listChunk.getChild(StreamFormatChunk.class);
        if (aviStreamHeaderChunk == null) {
            Log.w(TAG, "Missing Stream Header");
            return null;
        }
        if (streamFormatChunk == null) {
            Log.w(TAG, "Missing Stream Format");
            return null;
        }
        long durationUs = aviStreamHeaderChunk.getDurationUs();
        Format format = streamFormatChunk.format;
        Format.Builder buildUpon = format.buildUpon();
        buildUpon.setId(i8);
        int i9 = aviStreamHeaderChunk.suggestedBufferSize;
        if (i9 != 0) {
            buildUpon.setMaxInputSize(i9);
        }
        StreamNameChunk streamNameChunk = (StreamNameChunk) listChunk.getChild(StreamNameChunk.class);
        if (streamNameChunk != null) {
            buildUpon.setLabel(streamNameChunk.name);
        }
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != 1 && trackType != 2) {
            return null;
        }
        TrackOutput track = this.extractorOutput.track(i8, trackType);
        track.format(buildUpon.build());
        ChunkReader chunkReader = new ChunkReader(i8, trackType, durationUs, aviStreamHeaderChunk.length, track);
        this.durationUs = durationUs;
        return chunkReader;
    }

    private int readMoviChunks(ExtractorInput extractorInput) {
        if (extractorInput.getPosition() >= this.moviEnd) {
            return -1;
        }
        ChunkReader chunkReader = this.currentChunkReader;
        if (chunkReader == null) {
            alignInputToEvenPosition(extractorInput);
            extractorInput.peekFully(this.scratch.getData(), 0, 12);
            this.scratch.setPosition(0);
            int readLittleEndianInt = this.scratch.readLittleEndianInt();
            if (readLittleEndianInt == 1414744396) {
                this.scratch.setPosition(8);
                extractorInput.skipFully(this.scratch.readLittleEndianInt() != 1769369453 ? 8 : 12);
                extractorInput.resetPeekPosition();
                return 0;
            }
            int readLittleEndianInt2 = this.scratch.readLittleEndianInt();
            if (readLittleEndianInt == 1263424842) {
                this.pendingReposition = extractorInput.getPosition() + readLittleEndianInt2 + 8;
                return 0;
            }
            extractorInput.skipFully(8);
            extractorInput.resetPeekPosition();
            ChunkReader chunkReader2 = getChunkReader(readLittleEndianInt);
            if (chunkReader2 == null) {
                this.pendingReposition = extractorInput.getPosition() + readLittleEndianInt2;
                return 0;
            }
            chunkReader2.onChunkStart(readLittleEndianInt2);
            this.currentChunkReader = chunkReader2;
        } else if (chunkReader.onChunkData(extractorInput)) {
            this.currentChunkReader = null;
        }
        return 0;
    }

    private boolean resolvePendingReposition(ExtractorInput extractorInput, PositionHolder positionHolder) {
        boolean z7;
        if (this.pendingReposition != -1) {
            long position = extractorInput.getPosition();
            long j8 = this.pendingReposition;
            if (j8 < position || j8 > 262144 + position) {
                positionHolder.position = j8;
                z7 = true;
                this.pendingReposition = -1L;
                return z7;
            }
            extractorInput.skipFully((int) (j8 - position));
        }
        z7 = false;
        this.pendingReposition = -1L;
        return z7;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.state = 0;
        this.extractorOutput = extractorOutput;
        this.pendingReposition = -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        if (resolvePendingReposition(extractorInput, positionHolder)) {
            return 1;
        }
        switch (this.state) {
            case 0:
                if (!sniff(extractorInput)) {
                    throw ParserException.createForMalformedContainer("AVI Header List not found", null);
                }
                extractorInput.skipFully(12);
                this.state = 1;
                return 0;
            case 1:
                extractorInput.readFully(this.scratch.getData(), 0, 12);
                this.scratch.setPosition(0);
                this.chunkHeaderHolder.populateWithListHeaderFrom(this.scratch);
                ChunkHeaderHolder chunkHeaderHolder = this.chunkHeaderHolder;
                if (chunkHeaderHolder.listType == 1819436136) {
                    this.hdrlSize = chunkHeaderHolder.size;
                    this.state = 2;
                    return 0;
                }
                throw ParserException.createForMalformedContainer("hdrl expected, found: " + this.chunkHeaderHolder.listType, null);
            case 2:
                int i8 = this.hdrlSize - 4;
                ParsableByteArray parsableByteArray = new ParsableByteArray(i8);
                extractorInput.readFully(parsableByteArray.getData(), 0, i8);
                parseHdrlBody(parsableByteArray);
                this.state = 3;
                return 0;
            case 3:
                if (this.moviStart != -1) {
                    long position = extractorInput.getPosition();
                    long j8 = this.moviStart;
                    if (position != j8) {
                        this.pendingReposition = j8;
                        return 0;
                    }
                }
                extractorInput.peekFully(this.scratch.getData(), 0, 12);
                extractorInput.resetPeekPosition();
                this.scratch.setPosition(0);
                this.chunkHeaderHolder.populateFrom(this.scratch);
                int readLittleEndianInt = this.scratch.readLittleEndianInt();
                int i9 = this.chunkHeaderHolder.chunkType;
                if (i9 == 1179011410) {
                    extractorInput.skipFully(12);
                    return 0;
                }
                if (i9 != 1414744396 || readLittleEndianInt != 1769369453) {
                    this.pendingReposition = extractorInput.getPosition() + this.chunkHeaderHolder.size + 8;
                    return 0;
                }
                long position2 = extractorInput.getPosition();
                this.moviStart = position2;
                this.moviEnd = position2 + this.chunkHeaderHolder.size + 8;
                if (!this.seekMapHasBeenOutput) {
                    if (((AviMainHeaderChunk) Assertions.checkNotNull(this.aviHeader)).hasIndex()) {
                        this.state = 4;
                        this.pendingReposition = this.moviEnd;
                        return 0;
                    }
                    this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                    this.seekMapHasBeenOutput = true;
                }
                this.pendingReposition = extractorInput.getPosition() + 12;
                this.state = 6;
                return 0;
            case 4:
                extractorInput.readFully(this.scratch.getData(), 0, 8);
                this.scratch.setPosition(0);
                int readLittleEndianInt2 = this.scratch.readLittleEndianInt();
                int readLittleEndianInt3 = this.scratch.readLittleEndianInt();
                if (readLittleEndianInt2 == 829973609) {
                    this.state = 5;
                    this.idx1BodySize = readLittleEndianInt3;
                } else {
                    this.pendingReposition = extractorInput.getPosition() + readLittleEndianInt3;
                }
                return 0;
            case 5:
                ParsableByteArray parsableByteArray2 = new ParsableByteArray(this.idx1BodySize);
                extractorInput.readFully(parsableByteArray2.getData(), 0, this.idx1BodySize);
                parseIdx1Body(parsableByteArray2);
                this.state = 6;
                this.pendingReposition = this.moviStart;
                return 0;
            case 6:
                return readMoviChunks(extractorInput);
            default:
                throw new AssertionError();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j8, long j9) {
        this.pendingReposition = -1L;
        this.currentChunkReader = null;
        for (ChunkReader chunkReader : this.chunkReaders) {
            chunkReader.seekToPosition(j8);
        }
        if (j8 != 0) {
            this.state = 6;
        } else if (this.chunkReaders.length == 0) {
            this.state = 0;
        } else {
            this.state = 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        extractorInput.peekFully(this.scratch.getData(), 0, 12);
        this.scratch.setPosition(0);
        if (this.scratch.readLittleEndianInt() != 1179011410) {
            return false;
        }
        this.scratch.skipBytes(4);
        return this.scratch.readLittleEndianInt() == 541677121;
    }
}
