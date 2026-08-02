package kotlin.reflect.jvm.internal.impl.protobuf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes9.dex */
public final class CodedInputStream {
    public final byte[] buffer;
    public int bufferPos;
    public int bufferSize;
    public int bufferSizeAfterLimit;
    public int currentLimit;
    public final InputStream input;
    public int lastTag;
    public int recursionDepth;
    public int totalBytesRetired;

    public CodedInputStream(LiteralByteString literalByteString) {
        this.currentLimit = Integer.MAX_VALUE;
        byte[] bArr = literalByteString.bytes;
        this.buffer = bArr;
        this.bufferPos = 0;
        this.bufferSize = bArr.length;
        this.totalBytesRetired = -0;
        this.input = null;
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    public void checkLastTagWas(int i) {
        if (this.lastTag != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public void checkRecursionLimit() {
        if (this.recursionDepth >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public int getBytesUntilLimit() {
        int i = this.currentLimit;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    public void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i) {
        if (i < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.totalBytesRetired + this.bufferPos + i;
        int i3 = this.currentLimit;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.currentLimit = i2;
        recomputeBufferSizeAfterLimit();
        return i3;
    }

    public boolean readBool() {
        return readRawVarint64() != 0;
    }

    public ByteString readBytes() {
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
            return readRawVarint32 == 0 ? ByteString.EMPTY : new LiteralByteString(readRawBytesSlowPath(readRawVarint32));
        }
        ByteString copyFrom = ByteString.copyFrom(this.buffer, i2, readRawVarint32);
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

    public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
        checkRecursionLimit();
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas((i << 3) | 4);
        this.recursionDepth--;
    }

    public int readInt32() {
        return readRawVarint32();
    }

    public long readInt64() {
        return readRawVarint64();
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(pushLimit);
        return parsePartialFrom;
    }

    public byte readRawByte() {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        int i = this.bufferPos;
        this.bufferPos = i + 1;
        return this.buffer[i];
    }

    public final byte[] readRawBytesSlowPath(int i) {
        if (i <= 0) {
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.totalBytesRetired;
        int i3 = this.bufferPos;
        int i4 = i2 + i3 + i;
        int i5 = this.currentLimit;
        if (i4 > i5) {
            skipRawBytes((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = this.buffer;
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i6 = this.bufferSize - i3;
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            this.bufferPos = this.bufferSize;
            int i7 = i - i6;
            if (i7 > 0) {
                refillBuffer(i7);
            }
            System.arraycopy(bArr, 0, bArr2, i6, i7);
            this.bufferPos = i7;
            return bArr2;
        }
        int i8 = this.bufferSize;
        this.totalBytesRetired = i2 + i8;
        this.bufferPos = 0;
        this.bufferSize = 0;
        int i9 = i8 - i3;
        int i10 = i - i9;
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr3 = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                InputStream inputStream = this.input;
                int read = inputStream == null ? -1 : inputStream.read(bArr3, i11, min - i11);
                if (read == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += read;
                i11 += read;
            }
            i10 -= min;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr, i3, bArr4, 0, i9);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr5 = (byte[]) it.next();
            System.arraycopy(bArr5, 0, bArr4, i9, bArr5.length);
            i9 += bArr5.length;
        }
        return bArr4;
    }

    public int readRawLittleEndian32() {
        int i = this.bufferPos;
        if (this.bufferSize - i < 4) {
            refillBuffer(4);
            i = this.bufferPos;
        }
        this.bufferPos = i + 4;
        byte[] bArr = this.buffer;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public long readRawLittleEndian64() {
        int i = this.bufferPos;
        if (this.bufferSize - i < 8) {
            refillBuffer(8);
            i = this.bufferPos;
        }
        this.bufferPos = i + 8;
        byte[] bArr = this.buffer;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public int readRawVarint32() {
        int i;
        int i2 = this.bufferPos;
        int i3 = this.bufferSize;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.buffer;
            byte b = bArr[i2];
            if (b >= 0) {
                this.bufferPos = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        long j3 = i8 ^ (bArr[i7] << 21);
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            int i10 = (int) ((r1 ^ (r2 << 28)) ^ 266354560);
                            if (bArr[i9] < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i11 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i11;
                                                    i = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i10;
                            }
                            i = i10;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.bufferPos = i5;
                return i;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readRawVarint64() {
        long j;
        long j2;
        long j3;
        int i = this.bufferPos;
        int i2 = this.bufferSize;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.buffer;
            byte b = bArr[i];
            if (b >= 0) {
                this.bufferPos = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                long j4 = (bArr[i3] << 7) ^ b;
                if (j4 >= 0) {
                    int i5 = i + 3;
                    long j5 = j4 ^ (bArr[i4] << 14);
                    if (j5 >= 0) {
                        j3 = 16256;
                    } else {
                        i4 = i + 4;
                        j4 = j5 ^ (bArr[i5] << 21);
                        if (j4 < 0) {
                            j2 = -2080896;
                        } else {
                            i5 = i + 5;
                            j5 = j4 ^ (bArr[i4] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i4 = i + 6;
                                j4 = j5 ^ (bArr[i5] << 35);
                                if (j4 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i5 = i + 7;
                                    j5 = j4 ^ (bArr[i4] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j4 = j5 ^ (bArr[i5] << 49);
                                        if (j4 >= 0) {
                                            long j6 = (j4 ^ (bArr[i4] << 56)) ^ 71499008037633920L;
                                            i4 = j6 < 0 ? i + 10 : i + 9;
                                            j = j6;
                                            this.bufferPos = i4;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                            }
                        }
                    }
                    i4 = i5;
                    j = j3 ^ j5;
                    this.bufferPos = i4;
                    return j;
                }
                j2 = -128;
                j = j2 ^ j4;
                this.bufferPos = i4;
                return j;
            }
        }
        return readRawVarint64SlowPath();
    }

    public final long readRawVarint64SlowPath() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((readRawByte() & 128) == 0) {
                return j;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
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
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
            return readRawVarint32 == 0 ? "" : new String(readRawBytesSlowPath(readRawVarint32), "UTF-8");
        }
        String str = new String(this.buffer, i2, readRawVarint32, "UTF-8");
        this.bufferPos += readRawVarint32;
        return str;
    }

    public String readStringRequireUtf8() {
        byte[] readRawBytesSlowPath;
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferPos;
        if (readRawVarint32 <= this.bufferSize - i && readRawVarint32 > 0) {
            this.bufferPos = i + readRawVarint32;
            readRawBytesSlowPath = this.buffer;
        } else {
            if (readRawVarint32 == 0) {
                return "";
            }
            readRawBytesSlowPath = readRawBytesSlowPath(readRawVarint32);
            i = 0;
        }
        if (Utf8.partialIsValidUtf8(readRawBytesSlowPath, i, i + readRawVarint32) == 0) {
            return new String(readRawBytesSlowPath, i, readRawVarint32, "UTF-8");
        }
        throw new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    public int readTag() {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.lastTag = readRawVarint32;
        if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
            return this.lastTag;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public int readUInt32() {
        return readRawVarint32();
    }

    public long readUInt64() {
        return readRawVarint64();
    }

    public final void recomputeBufferSizeAfterLimit() {
        int i = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i;
        int i2 = this.totalBytesRetired + i;
        int i3 = this.currentLimit;
        if (i2 <= i3) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i4 = i2 - i3;
        this.bufferSizeAfterLimit = i4;
        this.bufferSize = i - i4;
    }

    public final void refillBuffer(int i) {
        if (!tryRefillBuffer(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public boolean skipField(int i, CodedOutputStream codedOutputStream) {
        int i2 = i & 7;
        if (i2 == 0) {
            long readInt64 = readInt64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeUInt64NoTag(readInt64);
            return true;
        }
        if (i2 == 1) {
            long readRawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
            return true;
        }
        if (i2 == 2) {
            ByteString readBytes = readBytes();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeBytesNoTag(readBytes);
            return true;
        }
        if (i2 == 3) {
            codedOutputStream.writeRawVarint32(i);
            skipMessage(codedOutputStream);
            int tagFieldNumber = (WireFormat.getTagFieldNumber(i) << 3) | 4;
            checkLastTagWas(tagFieldNumber);
            codedOutputStream.writeRawVarint32(tagFieldNumber);
            return true;
        }
        if (i2 == 4) {
            return false;
        }
        if (i2 != 5) {
            throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
        }
        int readRawLittleEndian32 = readRawLittleEndian32();
        codedOutputStream.writeRawVarint32(i);
        codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
        return true;
    }

    public void skipMessage(CodedOutputStream codedOutputStream) {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            this.recursionDepth--;
        } while (skipField(readTag, codedOutputStream));
    }

    public void skipRawBytes(int i) {
        int i2 = this.bufferSize;
        int i3 = this.bufferPos;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.bufferPos = i3 + i;
            return;
        }
        if (i < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.totalBytesRetired;
        int i6 = i5 + i3 + i;
        int i7 = this.currentLimit;
        if (i6 > i7) {
            skipRawBytes((i7 - i5) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.bufferPos = i2;
        refillBuffer(1);
        while (true) {
            int i8 = i - i4;
            int i9 = this.bufferSize;
            if (i8 <= i9) {
                this.bufferPos = i8;
                return;
            } else {
                i4 += i9;
                this.bufferPos = i9;
                refillBuffer(1);
            }
        }
    }

    public final boolean tryRefillBuffer(int i) {
        InputStream inputStream;
        int i2 = this.bufferPos;
        int i3 = i2 + i;
        int i4 = this.bufferSize;
        if (i3 <= i4) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        if (this.totalBytesRetired + i2 + i <= this.currentLimit && (inputStream = this.input) != null) {
            byte[] bArr = this.buffer;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.totalBytesRetired += i2;
                this.bufferSize -= i2;
                this.bufferPos = 0;
            }
            int i5 = this.bufferSize;
            int read = inputStream.read(bArr, i5, bArr.length - i5);
            if (read == 0 || read < -1 || read > bArr.length) {
                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(read, "InputStream#read(byte[]) returned invalid result: ", "\nThe InputStream implementation is buggy."));
            } else if (read > 0) {
                this.bufferSize += read;
                if ((this.totalBytesRetired + i) - 67108864 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                recomputeBufferSizeAfterLimit();
                if (this.bufferSize >= i) {
                    return true;
                }
                return tryRefillBuffer(i);
            }
        }
        return false;
    }

    public CodedInputStream(InputStream inputStream) {
        this.currentLimit = Integer.MAX_VALUE;
        this.buffer = new byte[4096];
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(pushLimit);
    }

    public static int readRawVarint32(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }
}
