package com.google.protobuf.micro;

import cn.hutool.core.util.l;
import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;
import java.util.Vector;

/* loaded from: classes4.dex */
public final class CodedInputStreamMicro {
    private static final int BUFFER_SIZE = 4096;
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private int sizeLimit;
    private int totalBytesRetired;

    private CodedInputStreamMicro(byte[] bArr, int i8, int i9) {
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.buffer = bArr;
        this.bufferSize = i9 + i8;
        this.bufferPos = i8;
        this.input = null;
    }

    public static int decodeZigZag32(int i8) {
        return (-(i8 & 1)) ^ (i8 >>> 1);
    }

    public static long decodeZigZag64(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    public static CodedInputStreamMicro newInstance(InputStream inputStream) {
        return new CodedInputStreamMicro(inputStream);
    }

    private void recomputeBufferSizeAfterLimit() {
        int i8 = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i8;
        int i9 = this.totalBytesRetired + i8;
        int i10 = this.currentLimit;
        if (i9 <= i10) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i11 = i9 - i10;
        this.bufferSizeAfterLimit = i11;
        this.bufferSize = i8 - i11;
    }

    private boolean refillBuffer(boolean z7) {
        int i8 = this.bufferPos;
        int i9 = this.bufferSize;
        if (i8 < i9) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        int i10 = this.totalBytesRetired + i9;
        if (i10 == this.currentLimit) {
            if (z7) {
                throw InvalidProtocolBufferMicroException.truncatedMessage();
            }
            return false;
        }
        this.totalBytesRetired = i10;
        this.bufferPos = 0;
        InputStream inputStream = this.input;
        int read = inputStream == null ? -1 : inputStream.read(this.buffer);
        this.bufferSize = read;
        if (read == 0 || read < -1) {
            throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.bufferSize + "\nThe InputStream implementation is buggy.");
        }
        if (read == -1) {
            this.bufferSize = 0;
            if (z7) {
                throw InvalidProtocolBufferMicroException.truncatedMessage();
            }
            return false;
        }
        recomputeBufferSizeAfterLimit();
        int i11 = this.totalBytesRetired + this.bufferSize + this.bufferSizeAfterLimit;
        if (i11 > this.sizeLimit || i11 < 0) {
            throw InvalidProtocolBufferMicroException.sizeLimitExceeded();
        }
        return true;
    }

    public void checkLastTagWas(int i8) {
        if (this.lastTag != i8) {
            throw InvalidProtocolBufferMicroException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i8 = this.currentLimit;
        if (i8 == Integer.MAX_VALUE) {
            return -1;
        }
        return i8 - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() {
        return this.bufferPos == this.bufferSize && !refillBuffer(false);
    }

    public void popLimit(int i8) {
        this.currentLimit = i8;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i8) {
        if (i8 < 0) {
            throw InvalidProtocolBufferMicroException.negativeSize();
        }
        int i9 = i8 + this.totalBytesRetired + this.bufferPos;
        int i10 = this.currentLimit;
        if (i9 > i10) {
            throw InvalidProtocolBufferMicroException.truncatedMessage();
        }
        this.currentLimit = i9;
        recomputeBufferSizeAfterLimit();
        return i10;
    }

    public boolean readBool() {
        return readRawVarint32() != 0;
    }

    public ByteStringMicro readBytes() {
        int readRawVarint32 = readRawVarint32();
        int i8 = this.bufferSize;
        int i9 = this.bufferPos;
        if (readRawVarint32 > i8 - i9 || readRawVarint32 <= 0) {
            return ByteStringMicro.copyFrom(readRawBytes(readRawVarint32));
        }
        ByteStringMicro copyFrom = ByteStringMicro.copyFrom(this.buffer, i9, readRawVarint32);
        this.bufferPos += readRawVarint32;
        return copyFrom;
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

    public void readGroup(MessageMicro messageMicro, int i8) {
        int i9 = this.recursionDepth;
        if (i9 >= this.recursionLimit) {
            throw InvalidProtocolBufferMicroException.recursionLimitExceeded();
        }
        this.recursionDepth = i9 + 1;
        messageMicro.mergeFrom(this);
        checkLastTagWas(WireFormatMicro.makeTag(i8, 4));
        this.recursionDepth--;
    }

    public int readInt32() {
        return readRawVarint32();
    }

    public long readInt64() {
        return readRawVarint64();
    }

    public void readMessage(MessageMicro messageMicro) {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferMicroException.recursionLimitExceeded();
        }
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        messageMicro.mergeFrom(this);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(pushLimit);
    }

    public byte readRawByte() {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(true);
        }
        byte[] bArr = this.buffer;
        int i8 = this.bufferPos;
        this.bufferPos = i8 + 1;
        return bArr[i8];
    }

    public byte[] readRawBytes(int i8) {
        if (i8 < 0) {
            throw InvalidProtocolBufferMicroException.negativeSize();
        }
        int i9 = this.totalBytesRetired;
        int i10 = this.bufferPos;
        int i11 = i9 + i10 + i8;
        int i12 = this.currentLimit;
        if (i11 > i12) {
            skipRawBytes((i12 - i9) - i10);
            throw InvalidProtocolBufferMicroException.truncatedMessage();
        }
        int i13 = this.bufferSize;
        int i14 = i13 - i10;
        if (i8 <= i14) {
            byte[] bArr = new byte[i8];
            System.arraycopy(this.buffer, i10, bArr, 0, i8);
            this.bufferPos += i8;
            return bArr;
        }
        if (i8 >= 4096) {
            this.totalBytesRetired = i9 + i13;
            this.bufferPos = 0;
            this.bufferSize = 0;
            int i15 = i8 - i14;
            Vector vector = new Vector();
            while (i15 > 0) {
                int min = Math.min(i15, 4096);
                byte[] bArr2 = new byte[min];
                int i16 = 0;
                while (i16 < min) {
                    InputStream inputStream = this.input;
                    int read = inputStream == null ? -1 : inputStream.read(bArr2, i16, min - i16);
                    if (read == -1) {
                        throw InvalidProtocolBufferMicroException.truncatedMessage();
                    }
                    this.totalBytesRetired += read;
                    i16 += read;
                }
                i15 -= min;
                vector.addElement(bArr2);
            }
            byte[] bArr3 = new byte[i8];
            System.arraycopy(this.buffer, i10, bArr3, 0, i14);
            for (int i17 = 0; i17 < vector.size(); i17++) {
                byte[] bArr4 = (byte[]) vector.elementAt(i17);
                System.arraycopy(bArr4, 0, bArr3, i14, bArr4.length);
                i14 += bArr4.length;
            }
            return bArr3;
        }
        byte[] bArr5 = new byte[i8];
        System.arraycopy(this.buffer, i10, bArr5, 0, i14);
        this.bufferPos = this.bufferSize;
        refillBuffer(true);
        while (true) {
            int i18 = i8 - i14;
            int i19 = this.bufferSize;
            if (i18 <= i19) {
                System.arraycopy(this.buffer, 0, bArr5, i14, i18);
                this.bufferPos = i18;
                return bArr5;
            }
            System.arraycopy(this.buffer, 0, bArr5, i14, i19);
            int i20 = this.bufferSize;
            i14 += i20;
            this.bufferPos = i20;
            refillBuffer(true);
        }
    }

    public int readRawLittleEndian32() {
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
    }

    public long readRawLittleEndian64() {
        return ((readRawByte() & 255) << 8) | (readRawByte() & 255) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
    }

    public int readRawVarint32() {
        int i8;
        byte readRawByte = readRawByte();
        if (readRawByte >= 0) {
            return readRawByte;
        }
        int i9 = readRawByte & Byte.MAX_VALUE;
        byte readRawByte2 = readRawByte();
        if (readRawByte2 >= 0) {
            i8 = readRawByte2 << 7;
        } else {
            i9 |= (readRawByte2 & Byte.MAX_VALUE) << 7;
            byte readRawByte3 = readRawByte();
            if (readRawByte3 >= 0) {
                i8 = readRawByte3 << 14;
            } else {
                i9 |= (readRawByte3 & Byte.MAX_VALUE) << 14;
                byte readRawByte4 = readRawByte();
                if (readRawByte4 < 0) {
                    int i10 = i9 | ((readRawByte4 & Byte.MAX_VALUE) << 21);
                    byte readRawByte5 = readRawByte();
                    int i11 = i10 | (readRawByte5 << 28);
                    if (readRawByte5 >= 0) {
                        return i11;
                    }
                    for (int i12 = 0; i12 < 5; i12++) {
                        if (readRawByte() >= 0) {
                            return i11;
                        }
                    }
                    throw InvalidProtocolBufferMicroException.malformedVarint();
                }
                i8 = readRawByte4 << 21;
            }
        }
        return i9 | i8;
    }

    public long readRawVarint64() {
        long j8 = 0;
        for (int i8 = 0; i8 < 64; i8 += 7) {
            j8 |= (r3 & Byte.MAX_VALUE) << i8;
            if ((readRawByte() & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j8;
            }
        }
        throw InvalidProtocolBufferMicroException.malformedVarint();
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
        int i8 = this.bufferSize;
        int i9 = this.bufferPos;
        if (readRawVarint32 > i8 - i9 || readRawVarint32 <= 0) {
            return new String(readRawBytes(readRawVarint32), l.UTF_8);
        }
        String str = new String(this.buffer, i9, readRawVarint32, l.UTF_8);
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
        throw InvalidProtocolBufferMicroException.invalidTag();
    }

    public int readUInt32() {
        return readRawVarint32();
    }

    public long readUInt64() {
        return readRawVarint64();
    }

    public void resetSizeCounter() {
        this.totalBytesRetired = 0;
    }

    public int setRecursionLimit(int i8) {
        if (i8 >= 0) {
            int i9 = this.recursionLimit;
            this.recursionLimit = i8;
            return i9;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i8);
    }

    public int setSizeLimit(int i8) {
        if (i8 >= 0) {
            int i9 = this.sizeLimit;
            this.sizeLimit = i8;
            return i9;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i8);
    }

    public boolean skipField(int i8) {
        int tagWireType = WireFormatMicro.getTagWireType(i8);
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
            checkLastTagWas(WireFormatMicro.makeTag(WireFormatMicro.getTagFieldNumber(i8), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferMicroException.invalidWireType();
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

    public void skipRawBytes(int i8) {
        if (i8 < 0) {
            throw InvalidProtocolBufferMicroException.negativeSize();
        }
        int i9 = this.totalBytesRetired;
        int i10 = this.bufferPos;
        int i11 = i9 + i10 + i8;
        int i12 = this.currentLimit;
        if (i11 > i12) {
            skipRawBytes((i12 - i9) - i10);
            throw InvalidProtocolBufferMicroException.truncatedMessage();
        }
        int i13 = this.bufferSize;
        int i14 = i13 - i10;
        if (i8 <= i14) {
            this.bufferPos = i10 + i8;
            return;
        }
        this.totalBytesRetired = i9 + i13;
        this.bufferPos = 0;
        this.bufferSize = 0;
        while (i14 < i8) {
            InputStream inputStream = this.input;
            int skip = inputStream == null ? -1 : (int) inputStream.skip(i8 - i14);
            if (skip <= 0) {
                throw InvalidProtocolBufferMicroException.truncatedMessage();
            }
            i14 += skip;
            this.totalBytesRetired += skip;
        }
    }

    private CodedInputStreamMicro(InputStream inputStream) {
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.buffer = new byte[4096];
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.input = inputStream;
    }

    public static CodedInputStreamMicro newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStreamMicro newInstance(byte[] bArr, int i8, int i9) {
        return new CodedInputStreamMicro(bArr, i8, i9);
    }

    static int readRawVarint32(InputStream inputStream) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferMicroException.truncatedMessage();
            }
            i9 |= (read & 127) << i8;
            if ((read & 128) == 0) {
                return i9;
            }
            i8 += 7;
        }
        while (i8 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferMicroException.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i9;
            }
            i8 += 7;
        }
        throw InvalidProtocolBufferMicroException.malformedVarint();
    }
}
