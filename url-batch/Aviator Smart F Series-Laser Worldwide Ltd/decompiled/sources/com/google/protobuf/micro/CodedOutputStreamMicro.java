package com.google.protobuf.micro;

import cn.hutool.core.util.l;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class CodedOutputStreamMicro {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private final byte[] buffer;
    private final int limit;
    private final OutputStream output;
    private int position;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private CodedOutputStreamMicro(byte[] bArr, int i8, int i9) {
        this.output = null;
        this.buffer = bArr;
        this.position = i8;
        this.limit = i8 + i9;
    }

    public static int computeBoolSize(int i8, boolean z7) {
        return computeTagSize(i8) + computeBoolSizeNoTag(z7);
    }

    public static int computeBoolSizeNoTag(boolean z7) {
        return 1;
    }

    public static int computeByteArraySize(int i8, byte[] bArr) {
        return computeTagSize(i8) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeBytesSize(int i8, ByteStringMicro byteStringMicro) {
        return computeTagSize(i8) + computeBytesSizeNoTag(byteStringMicro);
    }

    public static int computeBytesSizeNoTag(ByteStringMicro byteStringMicro) {
        return computeRawVarint32Size(byteStringMicro.size()) + byteStringMicro.size();
    }

    public static int computeDoubleSize(int i8, double d8) {
        return computeTagSize(i8) + computeDoubleSizeNoTag(d8);
    }

    public static int computeDoubleSizeNoTag(double d8) {
        return 8;
    }

    public static int computeEnumSize(int i8, int i9) {
        return computeTagSize(i8) + computeEnumSizeNoTag(i9);
    }

    public static int computeEnumSizeNoTag(int i8) {
        return computeRawVarint32Size(i8);
    }

    public static int computeFixed32Size(int i8, int i9) {
        return computeTagSize(i8) + computeFixed32SizeNoTag(i9);
    }

    public static int computeFixed32SizeNoTag(int i8) {
        return 4;
    }

    public static int computeFixed64Size(int i8, long j8) {
        return computeTagSize(i8) + computeFixed64SizeNoTag(j8);
    }

    public static int computeFixed64SizeNoTag(long j8) {
        return 8;
    }

    public static int computeFloatSize(int i8, float f8) {
        return computeTagSize(i8) + computeFloatSizeNoTag(f8);
    }

    public static int computeFloatSizeNoTag(float f8) {
        return 4;
    }

    public static int computeGroupSize(int i8, MessageMicro messageMicro) {
        return (computeTagSize(i8) * 2) + computeGroupSizeNoTag(messageMicro);
    }

    public static int computeGroupSizeNoTag(MessageMicro messageMicro) {
        return messageMicro.getSerializedSize();
    }

    public static int computeInt32Size(int i8, int i9) {
        return computeTagSize(i8) + computeInt32SizeNoTag(i9);
    }

    public static int computeInt32SizeNoTag(int i8) {
        if (i8 >= 0) {
            return computeRawVarint32Size(i8);
        }
        return 10;
    }

    public static int computeInt64Size(int i8, long j8) {
        return computeTagSize(i8) + computeInt64SizeNoTag(j8);
    }

    public static int computeInt64SizeNoTag(long j8) {
        return computeRawVarint64Size(j8);
    }

    public static int computeMessageSize(int i8, MessageMicro messageMicro) {
        return computeTagSize(i8) + computeMessageSizeNoTag(messageMicro);
    }

    public static int computeMessageSizeNoTag(MessageMicro messageMicro) {
        int serializedSize = messageMicro.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i8) {
        if ((i8 & ErrorCode.ERR_OUTPUT_EXCEPTION) == 0) {
            return 1;
        }
        if ((i8 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i8) == 0) {
            return 3;
        }
        return (i8 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j8) {
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (((-16384) & j8) == 0) {
            return 2;
        }
        if (((-2097152) & j8) == 0) {
            return 3;
        }
        if (((-268435456) & j8) == 0) {
            return 4;
        }
        if (((-34359738368L) & j8) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j8) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j8) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j8) == 0) {
            return 8;
        }
        return (j8 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32Size(int i8, int i9) {
        return computeTagSize(i8) + computeSFixed32SizeNoTag(i9);
    }

    public static int computeSFixed32SizeNoTag(int i8) {
        return 4;
    }

    public static int computeSFixed64Size(int i8, long j8) {
        return computeTagSize(i8) + computeSFixed64SizeNoTag(j8);
    }

    public static int computeSFixed64SizeNoTag(long j8) {
        return 8;
    }

    public static int computeSInt32Size(int i8, int i9) {
        return computeTagSize(i8) + computeSInt32SizeNoTag(i9);
    }

    public static int computeSInt32SizeNoTag(int i8) {
        return computeRawVarint32Size(encodeZigZag32(i8));
    }

    public static int computeSInt64Size(int i8, long j8) {
        return computeTagSize(i8) + computeSInt64SizeNoTag(j8);
    }

    public static int computeSInt64SizeNoTag(long j8) {
        return computeRawVarint64Size(encodeZigZag64(j8));
    }

    public static int computeStringSize(int i8, String str) {
        return computeTagSize(i8) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        try {
            byte[] bytes = str.getBytes(l.UTF_8);
            return computeRawVarint32Size(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int computeTagSize(int i8) {
        return computeRawVarint32Size(WireFormatMicro.makeTag(i8, 0));
    }

    public static int computeUInt32Size(int i8, int i9) {
        return computeTagSize(i8) + computeUInt32SizeNoTag(i9);
    }

    public static int computeUInt32SizeNoTag(int i8) {
        return computeRawVarint32Size(i8);
    }

    public static int computeUInt64Size(int i8, long j8) {
        return computeTagSize(i8) + computeUInt64SizeNoTag(j8);
    }

    public static int computeUInt64SizeNoTag(long j8) {
        return computeRawVarint64Size(j8);
    }

    public static int encodeZigZag32(int i8) {
        return (i8 >> 31) ^ (i8 << 1);
    }

    public static long encodeZigZag64(long j8) {
        return (j8 >> 63) ^ (j8 << 1);
    }

    public static CodedOutputStreamMicro newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    private void refreshBuffer() {
        OutputStream outputStream = this.output;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void flush() {
        if (this.output != null) {
            refreshBuffer();
        }
    }

    public int spaceLeft() {
        if (this.output == null) {
            return this.limit - this.position;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public void writeBool(int i8, boolean z7) {
        writeTag(i8, 0);
        writeBoolNoTag(z7);
    }

    public void writeBoolNoTag(boolean z7) {
        writeRawByte(z7 ? 1 : 0);
    }

    public void writeByteArray(int i8, byte[] bArr) {
        writeTag(i8, 2);
        writeByteArrayNoTag(bArr);
    }

    public void writeByteArrayNoTag(byte[] bArr) {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeBytes(int i8, ByteStringMicro byteStringMicro) {
        writeTag(i8, 2);
        writeBytesNoTag(byteStringMicro);
    }

    public void writeBytesNoTag(ByteStringMicro byteStringMicro) {
        byte[] byteArray = byteStringMicro.toByteArray();
        writeRawVarint32(byteArray.length);
        writeRawBytes(byteArray);
    }

    public void writeDouble(int i8, double d8) {
        writeTag(i8, 1);
        writeDoubleNoTag(d8);
    }

    public void writeDoubleNoTag(double d8) {
        writeRawLittleEndian64(Double.doubleToLongBits(d8));
    }

    public void writeEnum(int i8, int i9) {
        writeTag(i8, 0);
        writeEnumNoTag(i9);
    }

    public void writeEnumNoTag(int i8) {
        writeRawVarint32(i8);
    }

    public void writeFixed32(int i8, int i9) {
        writeTag(i8, 5);
        writeFixed32NoTag(i9);
    }

    public void writeFixed32NoTag(int i8) {
        writeRawLittleEndian32(i8);
    }

    public void writeFixed64(int i8, long j8) {
        writeTag(i8, 1);
        writeFixed64NoTag(j8);
    }

    public void writeFixed64NoTag(long j8) {
        writeRawLittleEndian64(j8);
    }

    public void writeFloat(int i8, float f8) {
        writeTag(i8, 5);
        writeFloatNoTag(f8);
    }

    public void writeFloatNoTag(float f8) {
        writeRawLittleEndian32(Float.floatToIntBits(f8));
    }

    public void writeGroup(int i8, MessageMicro messageMicro) {
        writeTag(i8, 3);
        writeGroupNoTag(messageMicro);
        writeTag(i8, 4);
    }

    public void writeGroupNoTag(MessageMicro messageMicro) {
        messageMicro.writeTo(this);
    }

    public void writeInt32(int i8, int i9) {
        writeTag(i8, 0);
        writeInt32NoTag(i9);
    }

    public void writeInt32NoTag(int i8) {
        if (i8 >= 0) {
            writeRawVarint32(i8);
        } else {
            writeRawVarint64(i8);
        }
    }

    public void writeInt64(int i8, long j8) {
        writeTag(i8, 0);
        writeInt64NoTag(j8);
    }

    public void writeInt64NoTag(long j8) {
        writeRawVarint64(j8);
    }

    public void writeMessage(int i8, MessageMicro messageMicro) {
        writeTag(i8, 2);
        writeMessageNoTag(messageMicro);
    }

    public void writeMessageNoTag(MessageMicro messageMicro) {
        writeRawVarint32(messageMicro.getCachedSize());
        messageMicro.writeTo(this);
    }

    public void writeRawByte(byte b8) {
        if (this.position == this.limit) {
            refreshBuffer();
        }
        byte[] bArr = this.buffer;
        int i8 = this.position;
        this.position = i8 + 1;
        bArr[i8] = b8;
    }

    public void writeRawBytes(byte[] bArr) {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawLittleEndian32(int i8) {
        writeRawByte(i8 & 255);
        writeRawByte((i8 >> 8) & 255);
        writeRawByte((i8 >> 16) & 255);
        writeRawByte((i8 >> 24) & 255);
    }

    public void writeRawLittleEndian64(long j8) {
        writeRawByte(((int) j8) & 255);
        writeRawByte(((int) (j8 >> 8)) & 255);
        writeRawByte(((int) (j8 >> 16)) & 255);
        writeRawByte(((int) (j8 >> 24)) & 255);
        writeRawByte(((int) (j8 >> 32)) & 255);
        writeRawByte(((int) (j8 >> 40)) & 255);
        writeRawByte(((int) (j8 >> 48)) & 255);
        writeRawByte(((int) (j8 >> 56)) & 255);
    }

    public void writeRawVarint32(int i8) {
        while ((i8 & ErrorCode.ERR_OUTPUT_EXCEPTION) != 0) {
            writeRawByte((i8 & 127) | 128);
            i8 >>>= 7;
        }
        writeRawByte(i8);
    }

    public void writeRawVarint64(long j8) {
        while (((-128) & j8) != 0) {
            writeRawByte((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        writeRawByte((int) j8);
    }

    public void writeSFixed32(int i8, int i9) {
        writeTag(i8, 5);
        writeSFixed32NoTag(i9);
    }

    public void writeSFixed32NoTag(int i8) {
        writeRawLittleEndian32(i8);
    }

    public void writeSFixed64(int i8, long j8) {
        writeTag(i8, 1);
        writeSFixed64NoTag(j8);
    }

    public void writeSFixed64NoTag(long j8) {
        writeRawLittleEndian64(j8);
    }

    public void writeSInt32(int i8, int i9) {
        writeTag(i8, 0);
        writeSInt32NoTag(i9);
    }

    public void writeSInt32NoTag(int i8) {
        writeRawVarint32(encodeZigZag32(i8));
    }

    public void writeSInt64(int i8, long j8) {
        writeTag(i8, 0);
        writeSInt64NoTag(j8);
    }

    public void writeSInt64NoTag(long j8) {
        writeRawVarint64(encodeZigZag64(j8));
    }

    public void writeString(int i8, String str) {
        writeTag(i8, 2);
        writeStringNoTag(str);
    }

    public void writeStringNoTag(String str) {
        byte[] bytes = str.getBytes(l.UTF_8);
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public void writeTag(int i8, int i9) {
        writeRawVarint32(WireFormatMicro.makeTag(i8, i9));
    }

    public void writeUInt32(int i8, int i9) {
        writeTag(i8, 0);
        writeUInt32NoTag(i9);
    }

    public void writeUInt32NoTag(int i8) {
        writeRawVarint32(i8);
    }

    public void writeUInt64(int i8, long j8) {
        writeTag(i8, 0);
        writeUInt64NoTag(j8);
    }

    public void writeUInt64NoTag(long j8) {
        writeRawVarint64(j8);
    }

    private CodedOutputStreamMicro(OutputStream outputStream, byte[] bArr) {
        this.output = outputStream;
        this.buffer = bArr;
        this.position = 0;
        this.limit = bArr.length;
    }

    public static CodedOutputStreamMicro newInstance(OutputStream outputStream, int i8) {
        return new CodedOutputStreamMicro(outputStream, new byte[i8]);
    }

    public void writeRawBytes(byte[] bArr, int i8, int i9) {
        int i10 = this.limit;
        int i11 = this.position;
        int i12 = i10 - i11;
        if (i12 >= i9) {
            System.arraycopy(bArr, i8, this.buffer, i11, i9);
            this.position += i9;
            return;
        }
        System.arraycopy(bArr, i8, this.buffer, i11, i12);
        int i13 = i8 + i12;
        int i14 = i9 - i12;
        this.position = this.limit;
        refreshBuffer();
        if (i14 > this.limit) {
            this.output.write(bArr, i13, i14);
        } else {
            System.arraycopy(bArr, i13, this.buffer, 0, i14);
            this.position = i14;
        }
    }

    public static CodedOutputStreamMicro newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public void writeRawByte(int i8) {
        writeRawByte((byte) i8);
    }

    public static CodedOutputStreamMicro newInstance(byte[] bArr, int i8, int i9) {
        return new CodedOutputStreamMicro(bArr, i8, i9);
    }
}
