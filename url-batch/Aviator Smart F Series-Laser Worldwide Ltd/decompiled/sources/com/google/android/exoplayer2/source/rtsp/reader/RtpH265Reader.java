package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.UnsignedBytes;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@Deprecated
/* loaded from: classes3.dex */
final class RtpH265Reader implements RtpPayloadReader {
    private static final int FU_PAYLOAD_OFFSET = 3;
    private static final int MEDIA_CLOCK_FREQUENCY = 90000;
    private static final int NAL_IDR_N_LP = 20;
    private static final int NAL_IDR_W_RADL = 19;
    private static final int RTP_PACKET_TYPE_AP = 48;
    private static final int RTP_PACKET_TYPE_FU = 49;
    private static final String TAG = "RtpH265Reader";
    private int bufferFlags;
    private int fragmentedSampleSizeBytes;
    private final RtpPayloadFormat payloadFormat;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private final ParsableByteArray fuScratchBuffer = new ParsableByteArray();
    private final ParsableByteArray nalStartCodeArray = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
    private long firstReceivedTimestamp = C.TIME_UNSET;
    private int previousSequenceNumber = -1;

    public RtpH265Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private static int getBufferFlagsFromNalType(int i8) {
        return (i8 == 19 || i8 == 20) ? 1 : 0;
    }

    @RequiresNonNull({"trackOutput"})
    private void processFragmentationUnitPacket(ParsableByteArray parsableByteArray, int i8) {
        if (parsableByteArray.getData().length < 3) {
            throw ParserException.createForMalformedManifest("Malformed FU header.", null);
        }
        int i9 = parsableByteArray.getData()[1] & 7;
        byte b8 = parsableByteArray.getData()[2];
        int i10 = b8 & 63;
        boolean z7 = (b8 & UnsignedBytes.MAX_POWER_OF_TWO) > 0;
        boolean z8 = (b8 & 64) > 0;
        if (z7) {
            this.fragmentedSampleSizeBytes += writeStartCode();
            parsableByteArray.getData()[1] = (byte) ((i10 << 1) & 127);
            parsableByteArray.getData()[2] = (byte) i9;
            this.fuScratchBuffer.reset(parsableByteArray.getData());
            this.fuScratchBuffer.setPosition(1);
        } else {
            int i11 = (this.previousSequenceNumber + 1) % 65535;
            if (i8 != i11) {
                Log.w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i11), Integer.valueOf(i8)));
                return;
            } else {
                this.fuScratchBuffer.reset(parsableByteArray.getData());
                this.fuScratchBuffer.setPosition(3);
            }
        }
        int bytesLeft = this.fuScratchBuffer.bytesLeft();
        this.trackOutput.sampleData(this.fuScratchBuffer, bytesLeft);
        this.fragmentedSampleSizeBytes += bytesLeft;
        if (z8) {
            this.bufferFlags = getBufferFlagsFromNalType(i10);
        }
    }

    @RequiresNonNull({"trackOutput"})
    private void processSingleNalUnitPacket(ParsableByteArray parsableByteArray) {
        int bytesLeft = parsableByteArray.bytesLeft();
        this.fragmentedSampleSizeBytes += writeStartCode();
        this.trackOutput.sampleData(parsableByteArray, bytesLeft);
        this.fragmentedSampleSizeBytes += bytesLeft;
        this.bufferFlags = getBufferFlagsFromNalType((parsableByteArray.getData()[0] >> 1) & 63);
    }

    private int writeStartCode() {
        this.nalStartCodeArray.setPosition(0);
        int bytesLeft = this.nalStartCodeArray.bytesLeft();
        ((TrackOutput) Assertions.checkNotNull(this.trackOutput)).sampleData(this.nalStartCodeArray, bytesLeft);
        return bytesLeft;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j8, int i8, boolean z7) {
        if (parsableByteArray.getData().length == 0) {
            throw ParserException.createForMalformedManifest("Empty RTP data packet.", null);
        }
        int i9 = (parsableByteArray.getData()[0] >> 1) & 63;
        Assertions.checkStateNotNull(this.trackOutput);
        if (i9 >= 0 && i9 < 48) {
            processSingleNalUnitPacket(parsableByteArray);
        } else {
            if (i9 == 48) {
                throw new UnsupportedOperationException("need to implement processAggregationPacket");
            }
            if (i9 != 49) {
                throw ParserException.createForMalformedManifest(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i9)), null);
            }
            processFragmentationUnitPacket(parsableByteArray, i8);
        }
        if (z7) {
            if (this.firstReceivedTimestamp == C.TIME_UNSET) {
                this.firstReceivedTimestamp = j8;
            }
            this.trackOutput.sampleMetadata(RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j8, this.firstReceivedTimestamp, MEDIA_CLOCK_FREQUENCY), this.bufferFlags, this.fragmentedSampleSizeBytes, 0, null);
            this.fragmentedSampleSizeBytes = 0;
        }
        this.previousSequenceNumber = i8;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i8) {
        TrackOutput track = extractorOutput.track(i8, 2);
        this.trackOutput = track;
        track.format(this.payloadFormat.format);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j8, int i8) {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void seek(long j8, long j9) {
        this.firstReceivedTimestamp = j8;
        this.fragmentedSampleSizeBytes = 0;
        this.startTimeOffsetUs = j9;
    }
}
