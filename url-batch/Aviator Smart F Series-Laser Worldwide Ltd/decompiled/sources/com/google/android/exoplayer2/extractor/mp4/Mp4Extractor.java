package com.google.android.exoplayer2.extractor.mp4;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.extractor.e;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.AtomParsers;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Function;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public final class Mp4Extractor implements Extractor, SeekMap {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.mp4.c
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] lambda$static$0;
            lambda$static$0 = Mp4Extractor.lambda$static$0();
            return lambda$static$0;
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return e.a(this, uri, map);
        }
    };
    private static final int FILE_TYPE_HEIC = 2;
    private static final int FILE_TYPE_MP4 = 0;
    private static final int FILE_TYPE_QUICKTIME = 1;
    public static final int FLAG_READ_MOTION_PHOTO_METADATA = 2;
    public static final int FLAG_READ_SEF_DATA = 4;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private static final int STATE_READING_SEF = 3;
    private long[][] accumulatedSampleSizes;

    @Nullable
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private final ArrayDeque<Atom.ContainerAtom> containerAtoms;
    private long durationUs;
    private ExtractorOutput extractorOutput;
    private int fileType;
    private int firstVideoTrackIndex;
    private final int flags;

    @Nullable
    private MotionPhotoMetadata motionPhotoMetadata;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleTrackIndex;
    private final ParsableByteArray scratch;
    private final SefReader sefReader;
    private final List<Metadata.Entry> slowMotionMetadataEntries;
    private Mp4Track[] tracks;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static final class Mp4Track {
        public int sampleIndex;
        public final TrackSampleTable sampleTable;
        public final Track track;
        public final TrackOutput trackOutput;

        @Nullable
        public final TrueHdSampleRechunker trueHdSampleRechunker;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.track = track;
            this.sampleTable = trackSampleTable;
            this.trackOutput = trackOutput;
            this.trueHdSampleRechunker = MimeTypes.AUDIO_TRUEHD.equals(track.format.sampleMimeType) ? new TrueHdSampleRechunker() : null;
        }
    }

    public Mp4Extractor() {
        this(0);
    }

    private static int brandToFileType(int i8) {
        if (i8 != 1751476579) {
            return i8 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] calculateAccumulatedSampleSizes(Mp4Track[] mp4TrackArr) {
        long[][] jArr = new long[mp4TrackArr.length][];
        int[] iArr = new int[mp4TrackArr.length];
        long[] jArr2 = new long[mp4TrackArr.length];
        boolean[] zArr = new boolean[mp4TrackArr.length];
        for (int i8 = 0; i8 < mp4TrackArr.length; i8++) {
            jArr[i8] = new long[mp4TrackArr[i8].sampleTable.sampleCount];
            jArr2[i8] = mp4TrackArr[i8].sampleTable.timestampsUs[0];
        }
        long j8 = 0;
        int i9 = 0;
        while (i9 < mp4TrackArr.length) {
            long j9 = Long.MAX_VALUE;
            int i10 = -1;
            for (int i11 = 0; i11 < mp4TrackArr.length; i11++) {
                if (!zArr[i11]) {
                    long j10 = jArr2[i11];
                    if (j10 <= j9) {
                        i10 = i11;
                        j9 = j10;
                    }
                }
            }
            int i12 = iArr[i10];
            long[] jArr3 = jArr[i10];
            jArr3[i12] = j8;
            TrackSampleTable trackSampleTable = mp4TrackArr[i10].sampleTable;
            j8 += trackSampleTable.sizes[i12];
            int i13 = i12 + 1;
            iArr[i10] = i13;
            if (i13 < jArr3.length) {
                jArr2[i10] = trackSampleTable.timestampsUs[i13];
            } else {
                zArr[i10] = true;
                i9++;
            }
        }
        return jArr;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private static int getSynchronizationSampleIndex(TrackSampleTable trackSampleTable, long j8) {
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j8);
        return indexOfEarlierOrEqualSynchronizationSample == -1 ? trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j8) : indexOfEarlierOrEqualSynchronizationSample;
    }

    private int getTrackIndexOfNextReadSample(long j8) {
        int i8 = -1;
        int i9 = -1;
        int i10 = 0;
        long j9 = Long.MAX_VALUE;
        boolean z7 = true;
        long j10 = Long.MAX_VALUE;
        boolean z8 = true;
        long j11 = Long.MAX_VALUE;
        while (true) {
            Mp4Track[] mp4TrackArr = this.tracks;
            if (i10 >= mp4TrackArr.length) {
                break;
            }
            Mp4Track mp4Track = mp4TrackArr[i10];
            int i11 = mp4Track.sampleIndex;
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            if (i11 != trackSampleTable.sampleCount) {
                long j12 = trackSampleTable.offsets[i11];
                long j13 = ((long[][]) Util.castNonNull(this.accumulatedSampleSizes))[i10][i11];
                long j14 = j12 - j8;
                boolean z9 = j14 < 0 || j14 >= 262144;
                if ((!z9 && z8) || (z9 == z8 && j14 < j11)) {
                    z8 = z9;
                    j11 = j14;
                    i9 = i10;
                    j10 = j13;
                }
                if (j13 < j9) {
                    z7 = z9;
                    i8 = i10;
                    j9 = j13;
                }
            }
            i10++;
        }
        return (j9 == Long.MAX_VALUE || !z7 || j10 < j9 + MAXIMUM_READ_AHEAD_BYTES_STREAM) ? i9 : i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Track lambda$processMoovAtom$1(Track track) {
        return track;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new Mp4Extractor()};
    }

    private static long maybeAdjustSeekOffset(TrackSampleTable trackSampleTable, long j8, long j9) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j8);
        return synchronizationSampleIndex == -1 ? j9 : Math.min(trackSampleTable.offsets[synchronizationSampleIndex], j9);
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ExtractorInput extractorInput) {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        AtomParsers.maybeSkipRemainingMetaAtomHeaderBytes(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    private void processAtomEnded(long j8) {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j8) {
            Atom.ContainerAtom pop = this.containerAtoms.pop();
            if (pop.type == 1836019574) {
                processMoovAtom(pop);
                this.containerAtoms.clear();
                this.parserState = 2;
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(pop);
            }
        }
        if (this.parserState != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private void processEndOfStreamReadingAtomHeader() {
        if (this.fileType != 2 || (this.flags & 2) == 0) {
            return;
        }
        this.extractorOutput.track(0, 4).format(new Format.Builder().setMetadata(this.motionPhotoMetadata == null ? null : new Metadata(this.motionPhotoMetadata)).build());
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
    }

    private static int processFtypAtom(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int brandToFileType = brandToFileType(parsableByteArray.readInt());
        if (brandToFileType != 0) {
            return brandToFileType;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            int brandToFileType2 = brandToFileType(parsableByteArray.readInt());
            if (brandToFileType2 != 0) {
                return brandToFileType2;
            }
        }
        return 0;
    }

    private void processMoovAtom(Atom.ContainerAtom containerAtom) {
        Metadata metadata;
        Metadata metadata2;
        Metadata metadata3;
        List<TrackSampleTable> list;
        int i8;
        int i9;
        ArrayList arrayList = new ArrayList();
        boolean z7 = this.fileType == 1;
        GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_udta);
        if (leafAtomOfType != null) {
            AtomParsers.UdtaInfo parseUdta = AtomParsers.parseUdta(leafAtomOfType);
            Metadata metadata4 = parseUdta.metaMetadata;
            Metadata metadata5 = parseUdta.smtaMetadata;
            Metadata metadata6 = parseUdta.xyzMetadata;
            if (metadata4 != null) {
                gaplessInfoHolder.setFromMetadata(metadata4);
            }
            metadata = metadata6;
            metadata2 = metadata4;
            metadata3 = metadata5;
        } else {
            metadata = null;
            metadata2 = null;
            metadata3 = null;
        }
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_meta);
        Metadata parseMdtaFromMeta = containerAtomOfType != null ? AtomParsers.parseMdtaFromMeta(containerAtomOfType) : null;
        Metadata metadata7 = AtomParsers.parseMvhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd))).data).metadata;
        Metadata metadata8 = parseMdtaFromMeta;
        List<TrackSampleTable> parseTraks = AtomParsers.parseTraks(containerAtom, gaplessInfoHolder, C.TIME_UNSET, null, (this.flags & 1) != 0, z7, new Function() { // from class: com.google.android.exoplayer2.extractor.mp4.d
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                Track lambda$processMoovAtom$1;
                lambda$processMoovAtom$1 = Mp4Extractor.lambda$processMoovAtom$1((Track) obj);
                return lambda$processMoovAtom$1;
            }
        });
        int size = parseTraks.size();
        long j8 = C.TIME_UNSET;
        long j9 = -9223372036854775807L;
        int i10 = 0;
        int i11 = -1;
        while (i10 < size) {
            TrackSampleTable trackSampleTable = parseTraks.get(i10);
            if (trackSampleTable.sampleCount == 0) {
                list = parseTraks;
                i8 = size;
            } else {
                Track track = trackSampleTable.track;
                list = parseTraks;
                i8 = size;
                long j10 = track.durationUs;
                if (j10 == j8) {
                    j10 = trackSampleTable.durationUs;
                }
                long max = Math.max(j9, j10);
                Mp4Track mp4Track = new Mp4Track(track, trackSampleTable, this.extractorOutput.track(i10, track.type));
                int i12 = MimeTypes.AUDIO_TRUEHD.equals(track.format.sampleMimeType) ? trackSampleTable.maximumSize * 16 : trackSampleTable.maximumSize + 30;
                Format.Builder buildUpon = track.format.buildUpon();
                buildUpon.setMaxInputSize(i12);
                if (track.type == 2 && j10 > 0 && (i9 = trackSampleTable.sampleCount) > 1) {
                    buildUpon.setFrameRate(i9 / (j10 / 1000000.0f));
                }
                MetadataUtil.setFormatGaplessInfo(track.type, gaplessInfoHolder, buildUpon);
                int i13 = track.type;
                Metadata[] metadataArr = new Metadata[4];
                metadataArr[0] = metadata3;
                metadataArr[1] = this.slowMotionMetadataEntries.isEmpty() ? null : new Metadata(this.slowMotionMetadataEntries);
                metadataArr[2] = metadata;
                metadataArr[3] = metadata7;
                MetadataUtil.setFormatMetadata(i13, metadata2, metadata8, buildUpon, metadataArr);
                mp4Track.trackOutput.format(buildUpon.build());
                if (track.type == 2 && i11 == -1) {
                    i11 = arrayList.size();
                }
                arrayList.add(mp4Track);
                j9 = max;
            }
            i10++;
            parseTraks = list;
            size = i8;
            j8 = C.TIME_UNSET;
        }
        this.firstVideoTrackIndex = i11;
        this.durationUs = j9;
        Mp4Track[] mp4TrackArr = (Mp4Track[]) arrayList.toArray(new Mp4Track[0]);
        this.tracks = mp4TrackArr;
        this.accumulatedSampleSizes = calculateAccumulatedSampleSizes(mp4TrackArr);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(this);
    }

    private void processUnparsedAtom(long j8) {
        if (this.atomType == 1836086884) {
            int i8 = this.atomHeaderBytesRead;
            this.motionPhotoMetadata = new MotionPhotoMetadata(0L, j8, C.TIME_UNSET, j8 + i8, this.atomSize - i8);
        }
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) {
        Atom.ContainerAtom peek;
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                processEndOfStreamReadingAtomHeader();
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j8 = this.atomSize;
        if (j8 == 1) {
            extractorInput.readFully(this.atomHeader.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j8 == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && (peek = this.containerAtoms.peek()) != null) {
                length = peek.endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (shouldParseContainerAtom(this.atomType)) {
            long position = extractorInput.getPosition();
            long j9 = this.atomSize;
            int i8 = this.atomHeaderBytesRead;
            long j10 = (position + j9) - i8;
            if (j9 != i8 && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            this.containerAtoms.push(new Atom.ContainerAtom(this.atomType, j10));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j10);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            Assertions.checkState(this.atomHeaderBytesRead == 8);
            Assertions.checkState(this.atomSize <= 2147483647L);
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            processUnparsedAtom(extractorInput.getPosition() - this.atomHeaderBytesRead);
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private boolean readAtomPayload(ExtractorInput extractorInput, PositionHolder positionHolder) {
        boolean z7;
        long j8 = this.atomSize - this.atomHeaderBytesRead;
        long position = extractorInput.getPosition() + j8;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), this.atomHeaderBytesRead, (int) j8);
            if (this.atomType == 1718909296) {
                this.fileType = processFtypAtom(parsableByteArray);
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(new Atom.LeafAtom(this.atomType, parsableByteArray));
            }
        } else {
            if (j8 >= 262144) {
                positionHolder.position = extractorInput.getPosition() + j8;
                z7 = true;
                processAtomEnded(position);
                return (z7 || this.parserState == 2) ? false : true;
            }
            extractorInput.skipFully((int) j8);
        }
        z7 = false;
        processAtomEnded(position);
        if (z7) {
        }
    }

    private int readSample(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i8;
        PositionHolder positionHolder2;
        long position = extractorInput.getPosition();
        if (this.sampleTrackIndex == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        Mp4Track mp4Track = this.tracks[this.sampleTrackIndex];
        TrackOutput trackOutput = mp4Track.trackOutput;
        int i9 = mp4Track.sampleIndex;
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        long j8 = trackSampleTable.offsets[i9];
        int i10 = trackSampleTable.sizes[i9];
        TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
        long j9 = (j8 - position) + this.sampleBytesRead;
        if (j9 < 0) {
            i8 = 1;
            positionHolder2 = positionHolder;
        } else {
            if (j9 < 262144) {
                if (mp4Track.track.sampleTransformation == 1) {
                    j9 += 8;
                    i10 -= 8;
                }
                extractorInput.skipFully((int) j9);
                Track track = mp4Track.track;
                if (track.nalUnitLengthFieldLength == 0) {
                    if (MimeTypes.AUDIO_AC4.equals(track.format.sampleMimeType)) {
                        if (this.sampleBytesWritten == 0) {
                            Ac4Util.getAc4SampleHeader(i10, this.scratch);
                            trackOutput.sampleData(this.scratch, 7);
                            this.sampleBytesWritten += 7;
                        }
                        i10 += 7;
                    } else if (trueHdSampleRechunker != null) {
                        trueHdSampleRechunker.startSample(extractorInput);
                    }
                    while (true) {
                        int i11 = this.sampleBytesWritten;
                        if (i11 >= i10) {
                            break;
                        }
                        int sampleData = trackOutput.sampleData((DataReader) extractorInput, i10 - i11, false);
                        this.sampleBytesRead += sampleData;
                        this.sampleBytesWritten += sampleData;
                        this.sampleCurrentNalBytesRemaining -= sampleData;
                    }
                } else {
                    byte[] data = this.nalLength.getData();
                    data[0] = 0;
                    data[1] = 0;
                    data[2] = 0;
                    int i12 = mp4Track.track.nalUnitLengthFieldLength;
                    int i13 = 4 - i12;
                    while (this.sampleBytesWritten < i10) {
                        int i14 = this.sampleCurrentNalBytesRemaining;
                        if (i14 == 0) {
                            extractorInput.readFully(data, i13, i12);
                            this.sampleBytesRead += i12;
                            this.nalLength.setPosition(0);
                            int readInt = this.nalLength.readInt();
                            if (readInt < 0) {
                                throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                            }
                            this.sampleCurrentNalBytesRemaining = readInt;
                            this.nalStartCode.setPosition(0);
                            trackOutput.sampleData(this.nalStartCode, 4);
                            this.sampleBytesWritten += 4;
                            i10 += i13;
                        } else {
                            int sampleData2 = trackOutput.sampleData((DataReader) extractorInput, i14, false);
                            this.sampleBytesRead += sampleData2;
                            this.sampleBytesWritten += sampleData2;
                            this.sampleCurrentNalBytesRemaining -= sampleData2;
                        }
                    }
                }
                int i15 = i10;
                TrackSampleTable trackSampleTable2 = mp4Track.sampleTable;
                long j10 = trackSampleTable2.timestampsUs[i9];
                int i16 = trackSampleTable2.flags[i9];
                if (trueHdSampleRechunker != null) {
                    trueHdSampleRechunker.sampleMetadata(trackOutput, j10, i16, i15, 0, null);
                    if (i9 + 1 == mp4Track.sampleTable.sampleCount) {
                        trueHdSampleRechunker.outputPendingSampleMetadata(trackOutput, null);
                    }
                } else {
                    trackOutput.sampleMetadata(j10, i16, i15, 0, null);
                }
                mp4Track.sampleIndex++;
                this.sampleTrackIndex = -1;
                this.sampleBytesRead = 0;
                this.sampleBytesWritten = 0;
                this.sampleCurrentNalBytesRemaining = 0;
                return 0;
            }
            positionHolder2 = positionHolder;
            i8 = 1;
        }
        positionHolder2.position = j8;
        return i8;
    }

    private int readSefData(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int read = this.sefReader.read(extractorInput, positionHolder, this.slowMotionMetadataEntries);
        if (read == 1 && positionHolder.position == 0) {
            enterReadingAtomHeaderState();
        }
        return read;
    }

    private static boolean shouldParseContainerAtom(int i8) {
        return i8 == 1836019574 || i8 == 1953653099 || i8 == 1835297121 || i8 == 1835626086 || i8 == 1937007212 || i8 == 1701082227 || i8 == 1835365473;
    }

    private static boolean shouldParseLeafAtom(int i8) {
        return i8 == 1835296868 || i8 == 1836476516 || i8 == 1751411826 || i8 == 1937011556 || i8 == 1937011827 || i8 == 1937011571 || i8 == 1668576371 || i8 == 1701606260 || i8 == 1937011555 || i8 == 1937011578 || i8 == 1937013298 || i8 == 1937007471 || i8 == 1668232756 || i8 == 1953196132 || i8 == 1718909296 || i8 == 1969517665 || i8 == 1801812339 || i8 == 1768715124;
    }

    private void updateSampleIndex(Mp4Track mp4Track, long j8) {
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j8);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j8);
        }
        mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j8) {
        return getSeekPoints(j8, -1);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        while (true) {
            int i8 = this.parserState;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        return readSample(extractorInput, positionHolder);
                    }
                    if (i8 == 3) {
                        return readSefData(extractorInput, positionHolder);
                    }
                    throw new IllegalStateException();
                }
                if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j8, long j9) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        if (j8 == 0) {
            if (this.parserState != 3) {
                enterReadingAtomHeaderState();
                return;
            } else {
                this.sefReader.reset();
                this.slowMotionMetadataEntries.clear();
                return;
            }
        }
        for (Mp4Track mp4Track : this.tracks) {
            updateSampleIndex(mp4Track, j9);
            TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return Sniffer.sniffUnfragmented(extractorInput, (this.flags & 2) != 0);
    }

    public Mp4Extractor(int i8) {
        this.flags = i8;
        this.parserState = (i8 & 4) != 0 ? 3 : 0;
        this.sefReader = new SefReader();
        this.slowMotionMetadataEntries = new ArrayList();
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque<>();
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.scratch = new ParsableByteArray();
        this.sampleTrackIndex = -1;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.tracks = new Mp4Track[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SeekMap.SeekPoints getSeekPoints(long j8, int i8) {
        long j9;
        long j10;
        long j11;
        long j12;
        int indexOfLaterOrEqualSynchronizationSample;
        Mp4Track[] mp4TrackArr = this.tracks;
        if (mp4TrackArr.length == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int i9 = i8 != -1 ? i8 : this.firstVideoTrackIndex;
        if (i9 != -1) {
            TrackSampleTable trackSampleTable = mp4TrackArr[i9].sampleTable;
            int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j8);
            if (synchronizationSampleIndex == -1) {
                return new SeekMap.SeekPoints(SeekPoint.START);
            }
            j10 = trackSampleTable.timestampsUs[synchronizationSampleIndex];
            j9 = trackSampleTable.offsets[synchronizationSampleIndex];
            if (j10 < j8 && synchronizationSampleIndex < trackSampleTable.sampleCount - 1 && (indexOfLaterOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j8)) != -1 && indexOfLaterOrEqualSynchronizationSample != synchronizationSampleIndex) {
                j12 = trackSampleTable.timestampsUs[indexOfLaterOrEqualSynchronizationSample];
                j11 = trackSampleTable.offsets[indexOfLaterOrEqualSynchronizationSample];
                if (i8 == -1) {
                    int i10 = 0;
                    while (true) {
                        Mp4Track[] mp4TrackArr2 = this.tracks;
                        if (i10 >= mp4TrackArr2.length) {
                            break;
                        }
                        if (i10 != this.firstVideoTrackIndex) {
                            TrackSampleTable trackSampleTable2 = mp4TrackArr2[i10].sampleTable;
                            long maybeAdjustSeekOffset = maybeAdjustSeekOffset(trackSampleTable2, j10, j9);
                            if (j12 != C.TIME_UNSET) {
                                j11 = maybeAdjustSeekOffset(trackSampleTable2, j12, j11);
                            }
                            j9 = maybeAdjustSeekOffset;
                        }
                        i10++;
                    }
                }
                SeekPoint seekPoint = new SeekPoint(j10, j9);
                return j12 != C.TIME_UNSET ? new SeekMap.SeekPoints(seekPoint) : new SeekMap.SeekPoints(seekPoint, new SeekPoint(j12, j11));
            }
        } else {
            j9 = Long.MAX_VALUE;
            j10 = j8;
        }
        j11 = -1;
        j12 = -9223372036854775807L;
        if (i8 == -1) {
        }
        SeekPoint seekPoint2 = new SeekPoint(j10, j9);
        if (j12 != C.TIME_UNSET) {
        }
    }
}
