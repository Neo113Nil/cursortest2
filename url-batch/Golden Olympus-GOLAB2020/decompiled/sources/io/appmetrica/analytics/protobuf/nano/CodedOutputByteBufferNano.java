package io.appmetrica.analytics.protobuf.nano;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes3.dex */
public final class CodedOutputByteBufferNano {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private static final int MAX_UTF8_EXPANSION = 3;
    private final ByteBuffer buffer;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException(int i4, int i5) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i4 + " limit " + i5 + ").");
        }
    }

    private CodedOutputByteBufferNano(byte[] bArr, int i4, int i5) {
        this(ByteBuffer.wrap(bArr, i4, i5));
    }

    public static int computeBoolSize(int i4, boolean z4) {
        return computeBoolSizeNoTag(z4) + computeTagSize(i4);
    }

    public static int computeBoolSizeNoTag(boolean z4) {
        return 1;
    }

    public static int computeBytesSize(int i4, byte[] bArr) {
        return computeBytesSizeNoTag(bArr) + computeTagSize(i4);
    }

    public static int computeBytesSizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeDoubleSize(int i4, double d4) {
        return computeDoubleSizeNoTag(d4) + computeTagSize(i4);
    }

    public static int computeDoubleSizeNoTag(double d4) {
        return 8;
    }

    public static int computeEnumSize(int i4, int i5) {
        return computeEnumSizeNoTag(i5) + computeTagSize(i4);
    }

    public static int computeEnumSizeNoTag(int i4) {
        return computeRawVarint32Size(i4);
    }

    static int computeFieldSize(int i4, int i5, Object obj) {
        switch (i5) {
            case 1:
                return computeDoubleSize(i4, ((Double) obj).doubleValue());
            case 2:
                return computeFloatSize(i4, ((Float) obj).floatValue());
            case 3:
                return computeInt64Size(i4, ((Long) obj).longValue());
            case 4:
                return computeUInt64Size(i4, ((Long) obj).longValue());
            case 5:
                return computeInt32Size(i4, ((Integer) obj).intValue());
            case 6:
                return computeFixed64Size(i4, ((Long) obj).longValue());
            case 7:
                return computeFixed32Size(i4, ((Integer) obj).intValue());
            case 8:
                return computeBoolSize(i4, ((Boolean) obj).booleanValue());
            case 9:
                return computeStringSize(i4, (String) obj);
            case 10:
                return computeGroupSize(i4, (MessageNano) obj);
            case 11:
                return computeMessageSize(i4, (MessageNano) obj);
            case 12:
                return computeBytesSize(i4, (byte[]) obj);
            case 13:
                return computeUInt32Size(i4, ((Integer) obj).intValue());
            case 14:
                return computeEnumSize(i4, ((Integer) obj).intValue());
            case 15:
                return computeSFixed32Size(i4, ((Integer) obj).intValue());
            case 16:
                return computeSFixed64Size(i4, ((Long) obj).longValue());
            case 17:
                return computeSInt32Size(i4, ((Integer) obj).intValue());
            case 18:
                return computeSInt64Size(i4, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException("Unknown type: " + i5);
        }
    }

    public static int computeFixed32Size(int i4, int i5) {
        return computeFixed32SizeNoTag(i5) + computeTagSize(i4);
    }

    public static int computeFixed32SizeNoTag(int i4) {
        return 4;
    }

    public static int computeFixed64Size(int i4, long j4) {
        return computeFixed64SizeNoTag(j4) + computeTagSize(i4);
    }

    public static int computeFixed64SizeNoTag(long j4) {
        return 8;
    }

    public static int computeFloatSize(int i4, float f4) {
        return computeFloatSizeNoTag(f4) + computeTagSize(i4);
    }

    public static int computeFloatSizeNoTag(float f4) {
        return 4;
    }

    public static int computeGroupSize(int i4, MessageNano messageNano) {
        return computeGroupSizeNoTag(messageNano) + (computeTagSize(i4) * 2);
    }

    public static int computeGroupSizeNoTag(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int computeInt32Size(int i4, int i5) {
        return computeInt32SizeNoTag(i5) + computeTagSize(i4);
    }

    public static int computeInt32SizeNoTag(int i4) {
        if (i4 >= 0) {
            return computeRawVarint32Size(i4);
        }
        return 10;
    }

    public static int computeInt64Size(int i4, long j4) {
        return computeInt64SizeNoTag(j4) + computeTagSize(i4);
    }

    public static int computeInt64SizeNoTag(long j4) {
        return computeRawVarint64Size(j4);
    }

    public static int computeMessageSize(int i4, MessageNano messageNano) {
        return computeMessageSizeNoTag(messageNano) + computeTagSize(i4);
    }

    public static int computeMessageSizeNoTag(MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i4) {
        if ((i4 & (-128)) == 0) {
            return 1;
        }
        if ((i4 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i4) == 0) {
            return 3;
        }
        return (i4 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j4) {
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (((-16384) & j4) == 0) {
            return 2;
        }
        if (((-2097152) & j4) == 0) {
            return 3;
        }
        if (((-268435456) & j4) == 0) {
            return 4;
        }
        if (((-34359738368L) & j4) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j4) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j4) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j4) == 0) {
            return 8;
        }
        return (j4 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32Size(int i4, int i5) {
        return computeSFixed32SizeNoTag(i5) + computeTagSize(i4);
    }

    public static int computeSFixed32SizeNoTag(int i4) {
        return 4;
    }

    public static int computeSFixed64Size(int i4, long j4) {
        return computeSFixed64SizeNoTag(j4) + computeTagSize(i4);
    }

    public static int computeSFixed64SizeNoTag(long j4) {
        return 8;
    }

    public static int computeSInt32Size(int i4, int i5) {
        return computeSInt32SizeNoTag(i5) + computeTagSize(i4);
    }

    public static int computeSInt32SizeNoTag(int i4) {
        return computeRawVarint32Size(encodeZigZag32(i4));
    }

    public static int computeSInt64Size(int i4, long j4) {
        return computeSInt64SizeNoTag(j4) + computeTagSize(i4);
    }

    public static int computeSInt64SizeNoTag(long j4) {
        return computeRawVarint64Size(encodeZigZag64(j4));
    }

    public static int computeStringSize(int i4, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i4);
    }

    public static int computeStringSizeNoTag(String str) {
        int encodedLength = encodedLength(str);
        return computeRawVarint32Size(encodedLength) + encodedLength;
    }

    public static int computeTagSize(int i4) {
        return computeRawVarint32Size(WireFormatNano.makeTag(i4, 0));
    }

    public static int computeUInt32Size(int i4, int i5) {
        return computeUInt32SizeNoTag(i5) + computeTagSize(i4);
    }

    public static int computeUInt32SizeNoTag(int i4) {
        return computeRawVarint32Size(i4);
    }

    public static int computeUInt64Size(int i4, long j4) {
        return computeUInt64SizeNoTag(j4) + computeTagSize(i4);
    }

    public static int computeUInt64SizeNoTag(long j4) {
        return computeRawVarint64Size(j4);
    }

    private static void encode(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            encodeDirect(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(encode(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e4) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e4);
            throw bufferOverflowException;
        }
    }

    private static void encodeDirect(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            if (charAt < 128) {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 2048) {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
            } else {
                if (charAt >= 55296 && 57343 >= charAt) {
                    int i5 = i4 + 1;
                    if (i5 != charSequence.length()) {
                        char charAt2 = charSequence.charAt(i5);
                        if (Character.isSurrogatePair(charAt, charAt2)) {
                            int codePoint = Character.toCodePoint(charAt, charAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byteBuffer.put((byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            i4 = i5;
                        } else {
                            i4 = i5;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
                    sb.append(i4 - 1);
                    throw new IllegalArgumentException(sb.toString());
                }
                byteBuffer.put((byte) ((charAt >>> '\f') | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                byteBuffer.put((byte) ((charAt & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
            }
            i4++;
        }
    }

    public static int encodeZigZag32(int i4) {
        return (i4 >> 31) ^ (i4 << 1);
    }

    public static long encodeZigZag64(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    private static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length && charSequence.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            if (i4 < length) {
                char charAt = charSequence.charAt(i4);
                if (charAt >= 2048) {
                    i5 += encodedLengthGeneral(charSequence, i4);
                    break;
                }
                i5 += (127 - charAt) >>> 31;
                i4++;
            } else {
                break;
            }
        }
        if (i5 >= length) {
            return i5;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i5 + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i4) {
        int length = charSequence.length();
        int i5 = 0;
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            if (charAt < 2048) {
                i5 += (127 - charAt) >>> 31;
            } else {
                i5 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i4) < 65536) {
                        throw new IllegalArgumentException("Unpaired surrogate at index " + i4);
                    }
                    i4++;
                }
            }
            i4++;
        }
        return i5;
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public int position() {
        return this.buffer.position();
    }

    public void reset() {
        this.buffer.clear();
    }

    public int spaceLeft() {
        return this.buffer.remaining();
    }

    public void writeBool(int i4, boolean z4) {
        writeTag(i4, 0);
        writeBoolNoTag(z4);
    }

    public void writeBoolNoTag(boolean z4) {
        writeRawByte(z4 ? 1 : 0);
    }

    public void writeBytes(int i4, byte[] bArr) {
        writeTag(i4, 2);
        writeBytesNoTag(bArr);
    }

    public void writeBytesNoTag(byte[] bArr) {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeDouble(int i4, double d4) {
        writeTag(i4, 1);
        writeDoubleNoTag(d4);
    }

    public void writeDoubleNoTag(double d4) {
        writeRawLittleEndian64(Double.doubleToLongBits(d4));
    }

    public void writeEnum(int i4, int i5) {
        writeTag(i4, 0);
        writeEnumNoTag(i5);
    }

    public void writeEnumNoTag(int i4) {
        writeRawVarint32(i4);
    }

    void writeField(int i4, int i5, Object obj) {
        switch (i5) {
            case 1:
                writeDouble(i4, ((Double) obj).doubleValue());
                return;
            case 2:
                writeFloat(i4, ((Float) obj).floatValue());
                return;
            case 3:
                writeInt64(i4, ((Long) obj).longValue());
                return;
            case 4:
                writeUInt64(i4, ((Long) obj).longValue());
                return;
            case 5:
                writeInt32(i4, ((Integer) obj).intValue());
                return;
            case 6:
                writeFixed64(i4, ((Long) obj).longValue());
                return;
            case 7:
                writeFixed32(i4, ((Integer) obj).intValue());
                return;
            case 8:
                writeBool(i4, ((Boolean) obj).booleanValue());
                return;
            case 9:
                writeString(i4, (String) obj);
                return;
            case 10:
                writeGroup(i4, (MessageNano) obj);
                return;
            case 11:
                writeMessage(i4, (MessageNano) obj);
                return;
            case 12:
                writeBytes(i4, (byte[]) obj);
                return;
            case 13:
                writeUInt32(i4, ((Integer) obj).intValue());
                return;
            case 14:
                writeEnum(i4, ((Integer) obj).intValue());
                return;
            case 15:
                writeSFixed32(i4, ((Integer) obj).intValue());
                return;
            case 16:
                writeSFixed64(i4, ((Long) obj).longValue());
                return;
            case 17:
                writeSInt32(i4, ((Integer) obj).intValue());
                return;
            case 18:
                writeSInt64(i4, ((Long) obj).longValue());
                return;
            default:
                throw new IOException("Unknown type: " + i5);
        }
    }

    public void writeFixed32(int i4, int i5) {
        writeTag(i4, 5);
        writeFixed32NoTag(i5);
    }

    public void writeFixed32NoTag(int i4) {
        writeRawLittleEndian32(i4);
    }

    public void writeFixed64(int i4, long j4) {
        writeTag(i4, 1);
        writeFixed64NoTag(j4);
    }

    public void writeFixed64NoTag(long j4) {
        writeRawLittleEndian64(j4);
    }

    public void writeFloat(int i4, float f4) {
        writeTag(i4, 5);
        writeFloatNoTag(f4);
    }

    public void writeFloatNoTag(float f4) {
        writeRawLittleEndian32(Float.floatToIntBits(f4));
    }

    public void writeGroup(int i4, MessageNano messageNano) {
        writeTag(i4, 3);
        writeGroupNoTag(messageNano);
        writeTag(i4, 4);
    }

    public void writeGroupNoTag(MessageNano messageNano) {
        messageNano.writeTo(this);
    }

    public void writeInt32(int i4, int i5) {
        writeTag(i4, 0);
        writeInt32NoTag(i5);
    }

    public void writeInt32NoTag(int i4) {
        if (i4 >= 0) {
            writeRawVarint32(i4);
        } else {
            writeRawVarint64(i4);
        }
    }

    public void writeInt64(int i4, long j4) {
        writeTag(i4, 0);
        writeInt64NoTag(j4);
    }

    public void writeInt64NoTag(long j4) {
        writeRawVarint64(j4);
    }

    public void writeMessage(int i4, MessageNano messageNano) {
        writeTag(i4, 2);
        writeMessageNoTag(messageNano);
    }

    public void writeMessageNoTag(MessageNano messageNano) {
        writeRawVarint32(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void writeRawByte(byte b4) {
        if (!this.buffer.hasRemaining()) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(b4);
    }

    public void writeRawBytes(byte[] bArr) {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawLittleEndian32(int i4) {
        if (this.buffer.remaining() < 4) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putInt(i4);
    }

    public void writeRawLittleEndian64(long j4) {
        if (this.buffer.remaining() < 8) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putLong(j4);
    }

    public void writeRawVarint32(int i4) {
        while ((i4 & (-128)) != 0) {
            writeRawByte((i4 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            i4 >>>= 7;
        }
        writeRawByte(i4);
    }

    public void writeRawVarint64(long j4) {
        while (((-128) & j4) != 0) {
            writeRawByte((((int) j4) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            j4 >>>= 7;
        }
        writeRawByte((int) j4);
    }

    public void writeSFixed32(int i4, int i5) {
        writeTag(i4, 5);
        writeSFixed32NoTag(i5);
    }

    public void writeSFixed32NoTag(int i4) {
        writeRawLittleEndian32(i4);
    }

    public void writeSFixed64(int i4, long j4) {
        writeTag(i4, 1);
        writeSFixed64NoTag(j4);
    }

    public void writeSFixed64NoTag(long j4) {
        writeRawLittleEndian64(j4);
    }

    public void writeSInt32(int i4, int i5) {
        writeTag(i4, 0);
        writeSInt32NoTag(i5);
    }

    public void writeSInt32NoTag(int i4) {
        writeRawVarint32(encodeZigZag32(i4));
    }

    public void writeSInt64(int i4, long j4) {
        writeTag(i4, 0);
        writeSInt64NoTag(j4);
    }

    public void writeSInt64NoTag(long j4) {
        writeRawVarint64(encodeZigZag64(j4));
    }

    public void writeString(int i4, String str) {
        writeTag(i4, 2);
        writeStringNoTag(str);
    }

    public void writeStringNoTag(String str) {
        try {
            int computeRawVarint32Size = computeRawVarint32Size(str.length());
            if (computeRawVarint32Size != computeRawVarint32Size(str.length() * 3)) {
                writeRawVarint32(encodedLength(str));
                encode(str, this.buffer);
                return;
            }
            int position = this.buffer.position();
            if (this.buffer.remaining() < computeRawVarint32Size) {
                throw new OutOfSpaceException(position + computeRawVarint32Size, this.buffer.limit());
            }
            this.buffer.position(position + computeRawVarint32Size);
            encode(str, this.buffer);
            int position2 = this.buffer.position();
            this.buffer.position(position);
            writeRawVarint32((position2 - position) - computeRawVarint32Size);
            this.buffer.position(position2);
        } catch (BufferOverflowException e4) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
            outOfSpaceException.initCause(e4);
            throw outOfSpaceException;
        }
    }

    public void writeTag(int i4, int i5) {
        writeRawVarint32(WireFormatNano.makeTag(i4, i5));
    }

    public void writeUInt32(int i4, int i5) {
        writeTag(i4, 0);
        writeUInt32NoTag(i5);
    }

    public void writeUInt32NoTag(int i4) {
        writeRawVarint32(i4);
    }

    public void writeUInt64(int i4, long j4) {
        writeTag(i4, 0);
        writeUInt64NoTag(j4);
    }

    public void writeUInt64NoTag(long j4) {
        writeRawVarint64(j4);
    }

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr, int i4, int i5) {
        return new CodedOutputByteBufferNano(bArr, i4, i5);
    }

    public void writeRawBytes(byte[] bArr, int i4, int i5) {
        if (this.buffer.remaining() < i5) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(bArr, i4, i5);
    }

    public void writeRawByte(int i4) {
        writeRawByte((byte) i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int encode(CharSequence charSequence, byte[] bArr, int i4, int i5) {
        int i6;
        char charAt;
        int length = charSequence.length();
        int i7 = i5 + i4;
        int i8 = 0;
        while (i8 < length && (i6 = i8 + i4) < i7 && (charAt = charSequence.charAt(i8)) < 128) {
            bArr[i6] = (byte) charAt;
            i8++;
        }
        int i9 = i4 + i8;
        while (i8 < length) {
            char charAt2 = charSequence.charAt(i8);
            if (charAt2 < 128 && i9 < i7) {
                bArr[i9] = (byte) charAt2;
                i9++;
            } else if (charAt2 < 2048 && i9 <= i7 - 2) {
                int i10 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 >>> 6) | 960);
                i9 += 2;
                bArr[i10] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i9 > i7 - 3) {
                    if (i9 <= i7 - 4) {
                        int i11 = i8 + 1;
                        if (i11 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i11);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                int i12 = i9 + 3;
                                bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i9 += 4;
                                bArr[i12] = (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i8 = i11;
                            } else {
                                i8 = i11;
                            }
                        }
                        StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
                        sb.append(i8 - 1);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i9);
                }
                bArr[i9] = (byte) ((charAt2 >>> '\f') | 480);
                int i13 = i9 + 2;
                bArr[i9 + 1] = (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                i9 += 3;
                bArr[i13] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
            }
            i8++;
        }
        return i9;
    }
}
