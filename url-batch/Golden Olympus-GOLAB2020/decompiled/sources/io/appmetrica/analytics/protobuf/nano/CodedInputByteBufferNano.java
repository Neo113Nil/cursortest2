package io.appmetrica.analytics.protobuf.nano;

/* loaded from: classes3.dex */
public final class CodedInputByteBufferNano {
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferStart;
    private int lastTag;
    private int recursionDepth;
    private int currentLimit = Integer.MAX_VALUE;
    private int recursionLimit = 64;
    private int sizeLimit = DEFAULT_SIZE_LIMIT;

    private CodedInputByteBufferNano(byte[] bArr, int i4, int i5) {
        this.buffer = bArr;
        this.bufferStart = i4;
        this.bufferSize = i5 + i4;
        this.bufferPos = i4;
    }

    public static int decodeZigZag32(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    public static long decodeZigZag64(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    private void recomputeBufferSizeAfterLimit() {
        int i4 = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i4;
        int i5 = this.currentLimit;
        if (i4 <= i5) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i6 = i4 - i5;
        this.bufferSizeAfterLimit = i6;
        this.bufferSize = i4 - i6;
    }

    public void checkLastTagWas(int i4) {
        if (this.lastTag != i4) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i4 = this.currentLimit;
        if (i4 == Integer.MAX_VALUE) {
            return -1;
        }
        return i4 - this.bufferPos;
    }

    public byte[] getData(int i4, int i5) {
        if (i5 == 0) {
            return WireFormatNano.EMPTY_BYTES;
        }
        byte[] bArr = new byte[i5];
        System.arraycopy(this.buffer, this.bufferStart + i4, bArr, 0, i5);
        return bArr;
    }

    public int getPosition() {
        return this.bufferPos - this.bufferStart;
    }

    public boolean isAtEnd() {
        return this.bufferPos == this.bufferSize;
    }

    public void popLimit(int i4) {
        this.currentLimit = i4;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i4) {
        if (i4 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i5 = i4 + this.bufferPos;
        int i6 = this.currentLimit;
        if (i5 > i6) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.currentLimit = i5;
        recomputeBufferSizeAfterLimit();
        return i6;
    }

    public boolean readBool() {
        return readRawVarint32() != 0;
    }

    public byte[] readBytes() {
        int readRawVarint32 = readRawVarint32();
        int i4 = this.bufferSize;
        int i5 = this.bufferPos;
        if (readRawVarint32 > i4 - i5 || readRawVarint32 <= 0) {
            return readRawVarint32 == 0 ? WireFormatNano.EMPTY_BYTES : readRawBytes(readRawVarint32);
        }
        byte[] bArr = new byte[readRawVarint32];
        System.arraycopy(this.buffer, i5, bArr, 0, readRawVarint32);
        this.bufferPos += readRawVarint32;
        return bArr;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() {
        return readRawVarint32();
    }

    public int readFixed32() {
        return readRawLittleEndian32();
    }

    public long readFixed64() {
        return readRawLittleEndian64();
    }

    public float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(MessageNano messageNano, int i4) {
        int i5 = this.recursionDepth;
        if (i5 >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        this.recursionDepth = i5 + 1;
        messageNano.mergeFrom(this);
        checkLastTagWas(WireFormatNano.makeTag(i4, 4));
        this.recursionDepth--;
    }

    public int readInt32() {
        return readRawVarint32();
    }

    public long readInt64() {
        return readRawVarint64();
    }

    public void readMessage(MessageNano messageNano) {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        messageNano.mergeFrom(this);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(pushLimit);
    }

    Object readPrimitiveField(int i4) {
        switch (i4) {
            case 1:
                return Double.valueOf(readDouble());
            case 2:
                return Float.valueOf(readFloat());
            case 3:
                return Long.valueOf(readInt64());
            case 4:
                return Long.valueOf(readUInt64());
            case 5:
                return Integer.valueOf(readInt32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Integer.valueOf(readFixed32());
            case 8:
                return Boolean.valueOf(readBool());
            case 9:
                return readString();
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException("Unknown type " + i4);
            case 12:
                return readBytes();
            case 13:
                return Integer.valueOf(readUInt32());
            case 14:
                return Integer.valueOf(readEnum());
            case 15:
                return Integer.valueOf(readSFixed32());
            case 16:
                return Long.valueOf(readSFixed64());
            case 17:
                return Integer.valueOf(readSInt32());
            case 18:
                return Long.valueOf(readSInt64());
        }
    }

    public byte readRawByte() {
        int i4 = this.bufferPos;
        if (i4 == this.bufferSize) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i4 + 1;
        return bArr[i4];
    }

    public byte[] readRawBytes(int i4) {
        if (i4 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i5 = this.bufferPos;
        int i6 = i5 + i4;
        int i7 = this.currentLimit;
        if (i6 > i7) {
            skipRawBytes(i7 - i5);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i4 > this.bufferSize - i5) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = new byte[i4];
        System.arraycopy(this.buffer, i5, bArr, 0, i4);
        this.bufferPos += i4;
        return bArr;
    }

    public int readRawLittleEndian32() {
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
    }

    public long readRawLittleEndian64() {
        return ((readRawByte() & 255) << 8) | (readRawByte() & 255) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
    }

    public int readRawVarint32() {
        int i4;
        byte readRawByte = readRawByte();
        if (readRawByte >= 0) {
            return readRawByte;
        }
        int i5 = readRawByte & Byte.MAX_VALUE;
        byte readRawByte2 = readRawByte();
        if (readRawByte2 >= 0) {
            i4 = readRawByte2 << 7;
        } else {
            i5 |= (readRawByte2 & Byte.MAX_VALUE) << 7;
            byte readRawByte3 = readRawByte();
            if (readRawByte3 >= 0) {
                i4 = readRawByte3 << 14;
            } else {
                i5 |= (readRawByte3 & Byte.MAX_VALUE) << 14;
                byte readRawByte4 = readRawByte();
                if (readRawByte4 < 0) {
                    int i6 = i5 | ((readRawByte4 & Byte.MAX_VALUE) << 21);
                    byte readRawByte5 = readRawByte();
                    int i7 = i6 | (readRawByte5 << 28);
                    if (readRawByte5 < 0) {
                        for (int i8 = 0; i8 < 5; i8++) {
                            if (readRawByte() < 0) {
                            }
                        }
                        throw InvalidProtocolBufferNanoException.malformedVarint();
                    }
                    return i7;
                }
                i4 = readRawByte4 << 21;
            }
        }
        return i5 | i4;
    }

    public long readRawVarint64() {
        long j4 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            j4 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((readRawByte() & 128) == 0) {
                return j4;
            }
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int readSFixed32() {
        return readRawLittleEndian32();
    }

    public long readSFixed64() {
        return readRawLittleEndian64();
    }

    public int readSInt32() {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() {
        int readRawVarint32 = readRawVarint32();
        int i4 = this.bufferSize;
        int i5 = this.bufferPos;
        if (readRawVarint32 > i4 - i5 || readRawVarint32 <= 0) {
            return new String(readRawBytes(readRawVarint32), InternalNano.UTF_8);
        }
        String str = new String(this.buffer, i5, readRawVarint32, InternalNano.UTF_8);
        this.bufferPos += readRawVarint32;
        return str;
    }

    public int readTag() {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.lastTag = readRawVarint32;
        if (readRawVarint32 != 0) {
            return readRawVarint32;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    public int readUInt32() {
        return readRawVarint32();
    }

    public long readUInt64() {
        return readRawVarint64();
    }

    public void resetSizeCounter() {
    }

    public void rewindToPosition(int i4) {
        int i5 = this.bufferPos;
        int i6 = this.bufferStart;
        if (i4 > i5 - i6) {
            throw new IllegalArgumentException("Position " + i4 + " is beyond current " + (this.bufferPos - this.bufferStart));
        }
        if (i4 >= 0) {
            this.bufferPos = i6 + i4;
        } else {
            throw new IllegalArgumentException("Bad position " + i4);
        }
    }

    public int setRecursionLimit(int i4) {
        if (i4 >= 0) {
            int i5 = this.recursionLimit;
            this.recursionLimit = i4;
            return i5;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i4);
    }

    public int setSizeLimit(int i4) {
        if (i4 >= 0) {
            int i5 = this.sizeLimit;
            this.sizeLimit = i4;
            return i5;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i4);
    }

    public boolean skipField(int i4) {
        int tagWireType = WireFormatNano.getTagWireType(i4);
        if (tagWireType == 0) {
            readInt32();
            return true;
        }
        if (tagWireType == 1) {
            readRawLittleEndian64();
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(i4), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferNanoException.invalidWireType();
        }
        readRawLittleEndian32();
        return true;
    }

    public void skipMessage() {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag));
    }

    public void skipRawBytes(int i4) {
        if (i4 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i5 = this.bufferPos;
        int i6 = i5 + i4;
        int i7 = this.currentLimit;
        if (i6 > i7) {
            skipRawBytes(i7 - i5);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i4 > this.bufferSize - i5) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.bufferPos = i6;
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr, int i4, int i5) {
        return new CodedInputByteBufferNano(bArr, i4, i5);
    }
}
