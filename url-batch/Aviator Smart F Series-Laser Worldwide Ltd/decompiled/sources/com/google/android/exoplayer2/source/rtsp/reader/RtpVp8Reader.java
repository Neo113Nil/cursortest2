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
final class RtpVp8Reader implements RtpPayloadReader {
    private static final int MEDIA_CLOCK_FREQUENCY = 90000;
    private static final String TAG = "RtpVP8Reader";
    private boolean gotFirstPacketOfVp8Frame;
    private boolean isKeyFrame;
    private boolean isOutputFormatSet;
    private final RtpPayloadFormat payloadFormat;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = C.TIME_UNSET;
    private int previousSequenceNumber = -1;
    private int fragmentedSampleSizeBytes = -1;
    private long fragmentedSampleTimeUs = C.TIME_UNSET;
    private long startTimeOffsetUs = 0;

    public RtpVp8Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private void outputSampleMetadataForFragmentedPackets() {
        TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.trackOutput);
        long j8 = this.fragmentedSampleTimeUs;
        boolean z7 = this.isKeyFrame;
        trackOutput.sampleMetadata(j8, z7 ? 1 : 0, this.fragmentedSampleSizeBytes, 0, null);
        this.fragmentedSampleSizeBytes = -1;
        this.fragmentedSampleTimeUs = C.TIME_UNSET;
        this.gotFirstPacketOfVp8Frame = false;
    }

    private boolean validateVp8Descriptor(ParsableByteArray parsableByteArray, int i8) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 16) == 16 && (readUnsignedByte & 7) == 0) {
            if (this.gotFirstPacketOfVp8Frame && this.fragmentedSampleSizeBytes > 0) {
                outputSampleMetadataForFragmentedPackets();
            }
            this.gotFirstPacketOfVp8Frame = true;
        } else {
            if (!this.gotFirstPacketOfVp8Frame) {
                Log.w(TAG, "RTP packet is not the start of a new VP8 partition, skipping.");
                return false;
            }
            int nextSequenceNumber = RtpPacket.getNextSequenceNumber(this.previousSequenceNumber);
            if (i8 < nextSequenceNumber) {
                Log.w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i8)));
                return false;
            }
        }
        if ((readUnsignedByte & 128) != 0) {
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            if ((readUnsignedByte2 & 128) != 0 && (parsableByteArray.readUnsignedByte() & 128) != 0) {
                parsableByteArray.skipBytes(1);
            }
            if ((readUnsignedByte2 & 64) != 0) {
                parsableByteArray.skipBytes(1);
            }
            if ((readUnsignedByte2 & 32) != 0 || (readUnsignedByte2 & 16) != 0) {
                parsableByteArray.skipBytes(1);
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j8, int i8, boolean z7) {
        Assertions.checkStateNotNull(this.trackOutput);
        if (validateVp8Descriptor(parsableByteArray, i8)) {
            if (this.fragmentedSampleSizeBytes == -1 && this.gotFirstPacketOfVp8Frame) {
                this.isKeyFrame = (parsableByteArray.peekUnsignedByte() & 1) == 0;
            }
            if (!this.isOutputFormatSet) {
                int position = parsableByteArray.getPosition();
                parsableByteArray.setPosition(position + 6);
                int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort() & 16383;
                int readLittleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort() & 16383;
                parsableByteArray.setPosition(position);
                Format format = this.payloadFormat.format;
                if (readLittleEndianUnsignedShort != format.width || readLittleEndianUnsignedShort2 != format.height) {
                    this.trackOutput.format(format.buildUpon().setWidth(readLittleEndianUnsignedShort).setHeight(readLittleEndianUnsignedShort2).build());
                }
                this.isOutputFormatSet = true;
            }
            int bytesLeft = parsableByteArray.bytesLeft();
            this.trackOutput.sampleData(parsableByteArray, bytesLeft);
            int i9 = this.fragmentedSampleSizeBytes;
            if (i9 == -1) {
                this.fragmentedSampleSizeBytes = bytesLeft;
            } else {
                this.fragmentedSampleSizeBytes = i9 + bytesLeft;
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
