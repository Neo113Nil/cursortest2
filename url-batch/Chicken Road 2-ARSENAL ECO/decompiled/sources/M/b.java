package M;

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

    /* renamed from: f, reason: collision with root package name */
    public final DataInputStream f1527f;

    /* renamed from: g, reason: collision with root package name */
    public int f1528g;

    /* renamed from: h, reason: collision with root package name */
    public ByteOrder f1529h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f1530i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1531j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f1531j = bArr.length;
    }

    public final void a(int i7) {
        int i8 = 0;
        while (i8 < i7) {
            int i9 = i7 - i8;
            DataInputStream dataInputStream = this.f1527f;
            int skip = (int) dataInputStream.skip(i9);
            if (skip <= 0) {
                if (this.f1530i == null) {
                    this.f1530i = new byte[8192];
                }
                skip = dataInputStream.read(this.f1530i, 0, Math.min(8192, i9));
                if (skip == -1) {
                    throw new EOFException(C1.c.g("Reached EOF while skipping ", i7, " bytes."));
                }
            }
            i8 += skip;
        }
        this.f1528g += i8;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1527f.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f1528g++;
        return this.f1527f.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f1528g++;
        return this.f1527f.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f1528g++;
        int read = this.f1527f.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f1528g += 2;
        return this.f1527f.readChar();
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
    public final void readFully(byte[] bArr, int i7, int i8) {
        this.f1528g += i8;
        this.f1527f.readFully(bArr, i7, i8);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f1528g += 4;
        DataInputStream dataInputStream = this.f1527f;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1529h;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f1529h);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j4;
        long j7;
        this.f1528g += 8;
        DataInputStream dataInputStream = this.f1527f;
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
        ByteOrder byteOrder = this.f1529h;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j4 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j7 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f1529h);
            }
            j4 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j7 = read8;
        }
        return j4 + j7;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f1528g += 2;
        DataInputStream dataInputStream = this.f1527f;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1529h;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f1529h);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f1528g += 2;
        return this.f1527f.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f1528g++;
        return this.f1527f.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f1528g += 2;
        DataInputStream dataInputStream = this.f1527f;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1529h;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f1529h);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i7) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int read = this.f1527f.read(bArr, i7, i8);
        this.f1528g += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f1528g += bArr.length;
        this.f1527f.readFully(bArr);
    }

    public b(InputStream inputStream, int i7) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f1527f = dataInputStream;
        dataInputStream.mark(0);
        this.f1528g = 0;
        this.f1529h = byteOrder;
        this.f1531j = inputStream instanceof b ? ((b) inputStream).f1531j : -1;
    }
}
