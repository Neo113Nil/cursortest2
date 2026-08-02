package kotlin.reflect.jvm.internal.impl.protobuf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class CodedOutputStream {
    public final byte[] buffer;
    public final int limit;
    public final OutputStream output;
    public int position;

    public static class OutOfSpaceException extends IOException {
    }

    public CodedOutputStream(byte[] bArr, int i, int i2) {
        this.output = null;
        this.buffer = bArr;
        this.position = i;
        this.limit = i + i2;
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeBoolSizeNoTag(z) + computeTagSize(i);
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return byteString.size() + computeRawVarint32Size(byteString.size());
    }

    public static int computeDoubleSize(int i, double d) {
        return computeDoubleSizeNoTag(d) + computeTagSize(i);
    }

    public static int computeDoubleSizeNoTag(double d) {
        return 8;
    }

    public static int computeEnumSize(int i, int i2) {
        return computeEnumSizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSize(int i, float f) {
        return computeFloatSizeNoTag(f) + computeTagSize(i);
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i, int i2) {
        return computeInt32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeRawVarint32Size(i);
        }
        return 10;
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        int serializedSize = lazyFieldLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeMessageSize(int i, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long j) {
        return computeSInt64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeRawVarint64Size(encodeZigZag64(j));
    }

    public static int computeStringSizeNoTag(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return computeRawVarint32Size(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("UTF-8 not supported.", (Throwable) e);
            return 0;
        }
    }

    public static int computeTagSize(int i) {
        return computeRawVarint32Size(i << 3);
    }

    public static int computeUInt32SizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeUInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() == 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Did not write as much data as expected.");
    }

    public void flush() {
        if (this.output != null) {
            refreshBuffer();
        }
    }

    public final void refreshBuffer() {
        OutputStream outputStream = this.output;
        if (outputStream == null) {
            throw new OutOfSpaceException("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    public int spaceLeft() {
        if (this.output == null) {
            return this.limit - this.position;
        }
        a$$ExternalSyntheticBUOutline0.m("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
        return 0;
    }

    public void writeBool(int i, boolean z) {
        writeTag(i, 0);
        writeBoolNoTag(z);
    }

    public void writeBoolNoTag(boolean z) {
        writeRawByte(z ? 1 : 0);
    }

    public void writeByteArrayNoTag(byte[] bArr) {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeBytes(int i, ByteString byteString) {
        writeTag(i, 2);
        writeBytesNoTag(byteString);
    }

    public void writeBytesNoTag(ByteString byteString) {
        writeRawVarint32(byteString.size());
        writeRawBytes(byteString);
    }

    public void writeDouble(int i, double d) {
        writeTag(i, 1);
        writeDoubleNoTag(d);
    }

    public void writeDoubleNoTag(double d) {
        writeRawLittleEndian64(Double.doubleToRawLongBits(d));
    }

    public void writeEnum(int i, int i2) {
        writeTag(i, 0);
        writeEnumNoTag(i2);
    }

    public void writeEnumNoTag(int i) {
        writeInt32NoTag(i);
    }

    public void writeFixed32NoTag(int i) {
        writeRawLittleEndian32(i);
    }

    public void writeFixed64NoTag(long j) {
        writeRawLittleEndian64(j);
    }

    public void writeFloat(int i, float f) {
        writeTag(i, 5);
        writeFloatNoTag(f);
    }

    public void writeFloatNoTag(float f) {
        writeRawLittleEndian32(Float.floatToRawIntBits(f));
    }

    public void writeGroup(int i, MessageLite messageLite) {
        writeTag(i, 3);
        writeGroupNoTag(messageLite);
        writeTag(i, 4);
    }

    public void writeGroupNoTag(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    public void writeInt32(int i, int i2) {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    public void writeInt32NoTag(int i) {
        if (i >= 0) {
            writeRawVarint32(i);
        } else {
            writeRawVarint64(i);
        }
    }

    public void writeInt64NoTag(long j) {
        writeRawVarint64(j);
    }

    public void writeMessage(int i, MessageLite messageLite) {
        writeTag(i, 2);
        writeMessageNoTag(messageLite);
    }

    public void writeMessageNoTag(MessageLite messageLite) {
        writeRawVarint32(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    public void writeMessageSetExtension(int i, MessageLite messageLite) {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    public void writeRawByte(byte b) {
        if (this.position == this.limit) {
            refreshBuffer();
        }
        int i = this.position;
        this.position = i + 1;
        this.buffer[i] = b;
    }

    public void writeRawBytes(ByteString byteString, int i, int i2) {
        int i3 = this.position;
        int i4 = this.limit;
        int i5 = i4 - i3;
        byte[] bArr = this.buffer;
        if (i5 >= i2) {
            byteString.copyTo(bArr, i, i3, i2);
            this.position += i2;
            return;
        }
        byteString.copyTo(bArr, i, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.position = i4;
        refreshBuffer();
        if (i7 <= i4) {
            byteString.copyTo(bArr, i6, 0, i7);
            this.position = i7;
            return;
        }
        if (i6 < 0) {
            f$$ExternalSyntheticLambda0.m(30, i6, "Source offset < 0: ");
            return;
        }
        if (i7 < 0) {
            f$$ExternalSyntheticLambda0.m(23, i7, "Length < 0: ");
            return;
        }
        int i8 = i6 + i7;
        if (i8 > byteString.size()) {
            f$$ExternalSyntheticLambda0.m(39, i8, "Source end offset exceeded: ");
        } else if (i7 > 0) {
            byteString.writeToInternal(this.output, i6, i7);
        }
    }

    public void writeRawLittleEndian32(int i) {
        writeRawByte(i & 255);
        writeRawByte((i >> 8) & 255);
        writeRawByte((i >> 16) & 255);
        writeRawByte((i >> 24) & 255);
    }

    public void writeRawLittleEndian64(long j) {
        writeRawByte(((int) j) & 255);
        writeRawByte(((int) (j >> 8)) & 255);
        writeRawByte(((int) (j >> 16)) & 255);
        writeRawByte(((int) (j >> 24)) & 255);
        writeRawByte(((int) (j >> 32)) & 255);
        writeRawByte(((int) (j >> 40)) & 255);
        writeRawByte(((int) (j >> 48)) & 255);
        writeRawByte(((int) (j >> 56)) & 255);
    }

    public void writeRawVarint32(int i) {
        while ((i & (-128)) != 0) {
            writeRawByte((i & 127) | 128);
            i >>>= 7;
        }
        writeRawByte(i);
    }

    public void writeRawVarint64(long j) {
        while (((-128) & j) != 0) {
            writeRawByte((((int) j) & 127) | 128);
            j >>>= 7;
        }
        writeRawByte((int) j);
    }

    public void writeSFixed32NoTag(int i) {
        writeRawLittleEndian32(i);
    }

    public void writeSFixed64NoTag(long j) {
        writeRawLittleEndian64(j);
    }

    public void writeSInt32NoTag(int i) {
        writeRawVarint32(encodeZigZag32(i));
    }

    public void writeSInt64(int i, long j) {
        writeTag(i, 0);
        writeSInt64NoTag(j);
    }

    public void writeSInt64NoTag(long j) {
        writeRawVarint64(encodeZigZag64(j));
    }

    public void writeStringNoTag(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public void writeTag(int i, int i2) {
        writeRawVarint32((i << 3) | i2);
    }

    public void writeUInt32(int i, int i2) {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    public void writeUInt32NoTag(int i) {
        writeRawVarint32(i);
    }

    public void writeUInt64NoTag(long j) {
        writeRawVarint64(j);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i, int i2) {
        return new CodedOutputStream(bArr, i, i2);
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.output = outputStream;
        this.buffer = bArr;
        this.position = 0;
        this.limit = bArr.length;
    }

    public void writeRawByte(int i) {
        writeRawByte((byte) i);
    }

    public void writeRawBytes(byte[] bArr) {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawBytes(byte[] bArr, int i, int i2) {
        int i3 = this.position;
        int i4 = this.limit;
        int i5 = i4 - i3;
        byte[] bArr2 = this.buffer;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.position += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.position = i4;
        refreshBuffer();
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.position = i7;
        } else {
            this.output.write(bArr, i6, i7);
        }
    }

    public void writeRawBytes(ByteString byteString) {
        writeRawBytes(byteString, 0, byteString.size());
    }
}
