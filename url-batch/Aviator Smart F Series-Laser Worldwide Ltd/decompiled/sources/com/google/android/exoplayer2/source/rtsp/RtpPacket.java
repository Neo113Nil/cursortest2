package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;

@Deprecated
/* loaded from: classes3.dex */
public final class RtpPacket {
    public static final int CSRC_SIZE = 4;
    private static final byte[] EMPTY = new byte[0];
    public static final int MAX_SEQUENCE_NUMBER = 65535;
    public static final int MAX_SIZE = 65507;
    public static final int MIN_HEADER_SIZE = 12;
    public static final int MIN_SEQUENCE_NUMBER = 0;
    public static final int RTP_VERSION = 2;
    public final byte[] csrc;
    public final byte csrcCount;
    public final boolean extension;
    public final boolean marker;
    public final boolean padding;
    public final byte[] payloadData;
    public final byte payloadType;
    public final int sequenceNumber;
    public final int ssrc;
    public final long timestamp;
    public final byte version;

    public static final class Builder {
        private boolean marker;
        private boolean padding;
        private byte payloadType;
        private int sequenceNumber;
        private int ssrc;
        private long timestamp;
        private byte[] csrc = RtpPacket.EMPTY;
        private byte[] payloadData = RtpPacket.EMPTY;

        public RtpPacket build() {
            return new RtpPacket(this);
        }

        @CanIgnoreReturnValue
        public Builder setCsrc(byte[] bArr) {
            Assertions.checkNotNull(bArr);
            this.csrc = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMarker(boolean z7) {
            this.marker = z7;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPadding(boolean z7) {
            this.padding = z7;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPayloadData(byte[] bArr) {
            Assertions.checkNotNull(bArr);
            this.payloadData = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPayloadType(byte b8) {
            this.payloadType = b8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSequenceNumber(int i8) {
            Assertions.checkArgument(i8 >= 0 && i8 <= 65535);
            this.sequenceNumber = i8 & 65535;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSsrc(int i8) {
            this.ssrc = i8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTimestamp(long j8) {
            this.timestamp = j8;
            return this;
        }
    }

    public static int getNextSequenceNumber(int i8) {
        return IntMath.mod(i8 + 1, 65536);
    }

    public static int getPreviousSequenceNumber(int i8) {
        return IntMath.mod(i8 - 1, 65536);
    }

    @Nullable
    public static RtpPacket parse(ParsableByteArray parsableByteArray) {
        byte[] bArr;
        if (parsableByteArray.bytesLeft() < 12) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        byte b8 = (byte) (readUnsignedByte >> 6);
        boolean z7 = ((readUnsignedByte >> 5) & 1) == 1;
        byte b9 = (byte) (readUnsignedByte & 15);
        if (b8 != 2) {
            return null;
        }
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        boolean z8 = ((readUnsignedByte2 >> 7) & 1) == 1;
        byte b10 = (byte) (readUnsignedByte2 & 127);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        int readInt = parsableByteArray.readInt();
        if (b9 > 0) {
            bArr = new byte[b9 * 4];
            for (int i8 = 0; i8 < b9; i8++) {
                parsableByteArray.readBytes(bArr, i8 * 4, 4);
            }
        } else {
            bArr = EMPTY;
        }
        byte[] bArr2 = new byte[parsableByteArray.bytesLeft()];
        parsableByteArray.readBytes(bArr2, 0, parsableByteArray.bytesLeft());
        return new Builder().setPadding(z7).setMarker(z8).setPayloadType(b10).setSequenceNumber(readUnsignedShort).setTimestamp(readUnsignedInt).setSsrc(readInt).setCsrc(bArr).setPayloadData(bArr2).build();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RtpPacket.class != obj.getClass()) {
            return false;
        }
        RtpPacket rtpPacket = (RtpPacket) obj;
        return this.payloadType == rtpPacket.payloadType && this.sequenceNumber == rtpPacket.sequenceNumber && this.marker == rtpPacket.marker && this.timestamp == rtpPacket.timestamp && this.ssrc == rtpPacket.ssrc;
    }

    public int hashCode() {
        int i8 = (((((527 + this.payloadType) * 31) + this.sequenceNumber) * 31) + (this.marker ? 1 : 0)) * 31;
        long j8 = this.timestamp;
        return ((i8 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.ssrc;
    }

    public String toString() {
        return Util.formatInvariant("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.payloadType), Integer.valueOf(this.sequenceNumber), Long.valueOf(this.timestamp), Integer.valueOf(this.ssrc), Boolean.valueOf(this.marker));
    }

    public int writeToBuffer(byte[] bArr, int i8, int i9) {
        int length = (this.csrcCount * 4) + 12 + this.payloadData.length;
        if (i9 < length || bArr.length - i8 < length) {
            return -1;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i8, i9);
        byte b8 = (byte) (((this.padding ? 1 : 0) << 5) | 128 | ((this.extension ? 1 : 0) << 4) | (this.csrcCount & 15));
        wrap.put(b8).put((byte) (((this.marker ? 1 : 0) << 7) | (this.payloadType & Byte.MAX_VALUE))).putShort((short) this.sequenceNumber).putInt((int) this.timestamp).putInt(this.ssrc).put(this.csrc).put(this.payloadData);
        return length;
    }

    private RtpPacket(Builder builder) {
        this.version = (byte) 2;
        this.padding = builder.padding;
        this.extension = false;
        this.marker = builder.marker;
        this.payloadType = builder.payloadType;
        this.sequenceNumber = builder.sequenceNumber;
        this.timestamp = builder.timestamp;
        this.ssrc = builder.ssrc;
        byte[] bArr = builder.csrc;
        this.csrc = bArr;
        this.csrcCount = (byte) (bArr.length / 4);
        this.payloadData = builder.payloadData;
    }

    @Nullable
    public static RtpPacket parse(byte[] bArr, int i8) {
        return parse(new ParsableByteArray(bArr, i8));
    }
}
