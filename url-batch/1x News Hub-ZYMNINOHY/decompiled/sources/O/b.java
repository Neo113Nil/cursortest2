package O;

import E1.AbstractC0033i;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f1082a;

    /* renamed from: b, reason: collision with root package name */
    public int f1083b;

    /* renamed from: c, reason: collision with root package name */
    public ByteOrder f1084c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f1085d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1086e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f1086e = bArr.length;
    }

    public final void a(int i3) {
        int i4 = 0;
        while (i4 < i3) {
            DataInputStream dataInputStream = this.f1082a;
            int i5 = i3 - i4;
            int skip = (int) dataInputStream.skip(i5);
            if (skip <= 0) {
                if (this.f1085d == null) {
                    this.f1085d = new byte[8192];
                }
                skip = dataInputStream.read(this.f1085d, 0, Math.min(8192, i5));
                if (skip == -1) {
                    throw new EOFException(AbstractC0033i.i(i3, "Reached EOF while skipping ", " bytes."));
                }
            }
            i4 += skip;
        }
        this.f1083b += i4;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1082a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i3) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f1083b++;
        return this.f1082a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f1083b++;
        return this.f1082a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f1083b++;
        int read = this.f1082a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f1083b += 2;
        return this.f1082a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i3, int i4) {
        this.f1083b += i4;
        this.f1082a.readFully(bArr, i3, i4);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f1083b += 4;
        DataInputStream dataInputStream = this.f1082a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1084c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f1084c);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j3;
        long j4;
        this.f1083b += 8;
        DataInputStream dataInputStream = this.f1082a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1084c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j3 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j4 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f1084c);
            }
            j3 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j4 = read8;
        }
        return j3 + j4;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f1083b += 2;
        DataInputStream dataInputStream = this.f1082a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1084c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f1084c);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f1083b += 2;
        return this.f1082a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f1083b++;
        return this.f1082a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f1083b += 2;
        DataInputStream dataInputStream = this.f1082a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1084c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f1084c);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i3) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i4) {
        int read = this.f1082a.read(bArr, i3, i4);
        this.f1083b += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f1083b += bArr.length;
        this.f1082a.readFully(bArr);
    }

    public b(InputStream inputStream, int i3) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f1082a = dataInputStream;
        dataInputStream.mark(0);
        this.f1083b = 0;
        this.f1084c = byteOrder;
        this.f1086e = inputStream instanceof b ? ((b) inputStream).f1086e : -1;
    }
}
