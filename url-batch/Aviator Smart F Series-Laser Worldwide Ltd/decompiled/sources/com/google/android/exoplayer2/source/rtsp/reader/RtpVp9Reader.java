package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
final class RtpVp9Reader implements RtpPayloadReader {
    private static final int MEDIA_CLOCK_FREQUENCY = 90000;
    private static final int SCALABILITY_STRUCTURE_SIZE = 4;
    private static final String TAG = "RtpVp9Reader";
    private boolean gotFirstPacketOfVp9Frame;
    private boolean isKeyFrame;
    private final RtpPayloadFormat payloadFormat;
    private boolean reportedOutputFormat;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = C.TIME_UNSET;
    private int fragmentedSampleSizeBytes = -1;
    private long fragmentedSampleTimeUs = C.TIME_UNSET;
    private long startTimeOffsetUs = 0;
    private int previousSequenceNumber = -1;
    private int width = -1;
    private int height = -1;

    public RtpVp9Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private void outputSampleMetadataForFragmentedPackets() {
        TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.trackOutput);
        long j8 = this.fragmentedSampleTimeUs;
        boolean z7 = this.isKeyFrame;
        trackOutput.sampleMetadata(j8, z7 ? 1 : 0, this.fragmentedSampleSizeBytes, 0, null);
        this.fragmentedSampleSizeBytes = -1;
        this.fragmentedSampleTimeUs = C.TIME_UNSET;
        this.gotFirstPacketOfVp9Frame = false;
    }

    private boolean validateVp9Descriptor(ParsableByteArray parsableByteArray, int i8) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 8) == 8) {
            if (this.gotFirstPacketOfVp9Frame && this.fragmentedSampleSizeBytes > 0) {
                outputSampleMetadataForFragmentedPackets();
            }
            this.gotFirstPacketOfVp9Frame = true;
        } else {
            if (!this.gotFirstPacketOfVp9Frame) {
                Log.w(TAG, "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                return false;
            }
            int nextSequenceNumber = RtpPacket.getNextSequenceNumber(this.previousSequenceNumber);
            if (i8 < nextSequenceNumber) {
                Log.w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i8)));
                return false;
            }
        }
        if ((readUnsignedByte & 128) != 0 && (parsableByteArray.readUnsignedByte() & 128) != 0 && parsableByteArray.bytesLeft() < 1) {
            return false;
        }
        int i9 = readUnsignedByte & 16;
        Assertions.checkArgument(i9 == 0, "VP9 flexible mode is not supported.");
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(1);
            if (parsableByteArray.bytesLeft() < 1) {
                return false;
            }
            if (i9 == 0) {
                parsableByteArray.skipBytes(1);
            }
        }
        if ((readUnsignedByte & 2) != 0) {
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int i10 = (readUnsignedByte2 >> 5) & 7;
            if ((readUnsignedByte2 & 16) != 0) {
                int i11 = i10 + 1;
                if (parsableByteArray.bytesLeft() < i11 * 4) {
                    return false;
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    this.width = parsableByteArray.readUnsignedShort();
                    this.height = parsableByteArray.readUnsignedShort();
                }
            }
            if ((readUnsignedByte2 & 8) != 0) {
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                if (parsableByteArray.bytesLeft() < readUnsignedByte3) {
                    return false;
                }
                for (int i13 = 0; i13 < readUnsignedByte3; i13++) {
                    int readUnsignedShort = (parsableByteArray.readUnsignedShort() & 12) >> 2;
                    if (parsableByteArray.bytesLeft() < readUnsignedShort) {
                        return false;
                    }
                    parsableByteArray.skipBytes(readUnsignedShort);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j8, int i8, boolean z7) {
        int i9;
        int i10;
        Assertions.checkStateNotNull(this.trackOutput);
        if (validateVp9Descriptor(parsableByteArray, i8)) {
            if (this.fragmentedSampleSizeBytes == -1 && this.gotFirstPacketOfVp9Frame) {
                this.isKeyFrame = (parsableByteArray.peekUnsignedByte() & 4) == 0;
            }
            if (!this.reportedOutputFormat && (i9 = this.width) != -1 && (i10 = this.height) != -1) {
                Format format = this.payloadFormat.format;
                if (i9 != format.width || i10 != format.height) {
                    this.trackOutput.format(format.buildUpon().setWidth(this.width).setHeight(this.height).build());
                }
                this.reportedOutputFormat = true;
            }
            int bytesLeft = parsableByteArray.bytesLeft();
            this.trackOutput.sampleData(parsableByteArray, bytesLeft);
            int i11 = this.fragmentedSampleSizeBytes;
            if (i11 == -1) {
                this.fragmentedSampleSizeBytes = bytesLeft;
            } else {
                this.fragmentedSampleSizeBytes = i11 + bytesLeft;
            }
            this.fragmentedSampleTimeUs = RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j8, this.firstReceivedTimestamp, MEDIA_CLOCK_FREQUENCY);
            if (z7) {
                outputSampleMetadataForFragmentedPackets();
            }
            this.previousSequenceNumber = i8;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i8) {
        TrackOutput track = extractorOutput.track(i8, 2);
        this.trackOutput = track;
        track.format(this.payloadFormat.format);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j8, int i8) {
        Assertions.checkState(this.firstReceivedTimestamp == C.TIME_UNSET);
        this.firstReceivedTimestamp = j8;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void seek(long j8, long j9) {
        this.firstReceivedTimestamp = j8;
        this.fragmentedSampleSizeBytes = -1;
        this.startTimeOffsetUs = j9;
    }
}
