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
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.dfu.utils.DfuAdapter;

@Deprecated
/* loaded from: classes3.dex */
final class RtpH263Reader implements RtpPayloadReader {
    private static final int I_VOP = 0;
    private static final int MEDIA_CLOCK_FREQUENCY = 90000;
    private static final int PICTURE_START_CODE = 128;
    private static final String TAG = "RtpH263Reader";
    private int fragmentedSampleSizeBytes;
    private long fragmentedSampleTimeUs;
    private boolean gotFirstPacketOfH263Frame;
    private int height;
    private boolean isKeyFrame;
    private boolean isOutputFormatSet;
    private final RtpPayloadFormat payloadFormat;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private int width;
    private long firstReceivedTimestamp = C.TIME_UNSET;
    private int previousSequenceNumber = -1;

    public RtpH263Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private void outputSampleMetadataForFragmentedPackets() {
        TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.trackOutput);
        long j8 = this.fragmentedSampleTimeUs;
        boolean z7 = this.isKeyFrame;
        trackOutput.sampleMetadata(j8, z7 ? 1 : 0, this.fragmentedSampleSizeBytes, 0, null);
        this.fragmentedSampleSizeBytes = 0;
        this.fragmentedSampleTimeUs = C.TIME_UNSET;
        this.isKeyFrame = false;
        this.gotFirstPacketOfH263Frame = false;
    }

    private void parseVopHeader(ParsableByteArray parsableByteArray, boolean z7) {
        int position = parsableByteArray.getPosition();
        if (((parsableByteArray.readUnsignedInt() >> 10) & 63) != 32) {
            parsableByteArray.setPosition(position);
            this.isKeyFrame = false;
            return;
        }
        int peekUnsignedByte = parsableByteArray.peekUnsignedByte();
        int i8 = (peekUnsignedByte >> 1) & 1;
        if (!z7 && i8 == 0) {
            int i9 = (peekUnsignedByte >> 2) & 7;
            if (i9 == 1) {
                this.width = 128;
                this.height = 96;
            } else {
                int i10 = i9 - 2;
                this.width = DfuAdapter.ConnectState.REQUEST_MTU << i10;
                this.height = GattError.GATT_DUP_REG << i10;
            }
        }
        parsableByteArray.setPosition(position);
        this.isKeyFrame = i8 == 0;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j8, int i8, boolean z7) {
        Assertions.checkStateNotNull(this.trackOutput);
        int position = parsableByteArray.getPosition();
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        boolean z8 = (readUnsignedShort & 1024) > 0;
        if ((readUnsignedShort & 512) != 0 || (readUnsignedShort & 504) != 0 || (readUnsignedShort & 7) != 0) {
            Log.w(TAG, "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
            return;
        }
        if (z8) {
            if (this.gotFirstPacketOfH263Frame && this.fragmentedSampleSizeBytes > 0) {
                outputSampleMetadataForFragmentedPackets();
            }
            this.gotFirstPacketOfH263Frame = true;
            if ((parsableByteArray.peekUnsignedByte() & 252) < 128) {
                Log.w(TAG, "Picture start Code (PSC) missing, dropping packet.");
                return;
            } else {
                parsableByteArray.getData()[position] = 0;
                parsableByteArray.getData()[position + 1] = 0;
                parsableByteArray.setPosition(position);
            }
        } else {
            if (!this.gotFirstPacketOfH263Frame) {
                Log.w(TAG, "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                return;
            }
            int nextSequenceNumber = RtpPacket.getNextSequenceNumber(this.previousSequenceNumber);
            if (i8 < nextSequenceNumber) {
                Log.w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i8)));
                return;
            }
        }
        if (this.fragmentedSampleSizeBytes == 0) {
            parseVopHeader(parsableByteArray, this.isOutputFormatSet);
            if (!this.isOutputFormatSet && this.isKeyFrame) {
                int i9 = this.width;
                Format format = this.payloadFormat.format;
                if (i9 != format.width || this.height != format.height) {
                    this.trackOutput.format(format.buildUpon().setWidth(this.width).setHeight(this.height).build());
                }
                this.isOutputFormatSet = true;
            }
        }
        int bytesLeft = parsableByteArray.bytesLeft();
        this.trackOutput.sampleData(parsableByteArray, bytesLeft);
        this.fragmentedSampleSizeBytes += bytesLeft;
        this.fragmentedSampleTimeUs = RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j8, this.firstReceivedTimestamp, MEDIA_CLOCK_FREQUENCY);
        if (z7) {
            outputSampleMetadataForFragmentedPackets();
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
        Assertions.checkState(this.firstReceivedTimestamp == C.TIME_UNSET);
        this.firstReceivedTimestamp = j8;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void seek(long j8, long j9) {
        this.firstReceivedTimestamp = j8;
        this.fragmentedSampleSizeBytes = 0;
        this.startTimeOffsetUs = j9;
    }
}
