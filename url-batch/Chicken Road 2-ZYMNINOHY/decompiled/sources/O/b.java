package O;

import E.AbstractC0005f;
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
    public final DataInputStream f1952a;

    /* renamed from: b, reason: collision with root package name */
    public int f1953b;

    /* renamed from: c, reason: collision with root package name */
    public ByteOrder f1954c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f1955d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1956e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f1956e = bArr.length;
    }

    public final void a(int i4) {
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i4 - i5;
            DataInputStream dataInputStream = this.f1952a;
            int skip = (int) dataInputStream.skip(i6);
            if (skip <= 0) {
                if (this.f1955d == null) {
                    this.f1955d = new byte[8192];
                }
                skip = dataInputStream.read(this.f1955d, 0, Math.min(8192, i6));
                if (skip == -1) {
                    throw new EOFException(AbstractC0005f.k(i4, "Reached EOF while skipping ", " bytes."));
                }
            }
            i5 += skip;
        }
        this.f1953b += i5;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1952a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i4) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f1953b++;
        return this.f1952a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f1953b++;
        return this.f1952a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f1953b++;
        int read = this.f1952a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f1953b += 2;
        return this.f1952a.readChar();
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
    public final void readFully(byte[] bArr, int i4, int i5) {
        this.f1953b += i5;
        this.f1952a.readFully(bArr, i4, i5);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f1953b += 4;
        DataInputStream dataInputStream = this.f1952a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1954c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f1954c);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j4;
        long j5;
        this.f1953b += 8;
        DataInputStream dataInputStream = this.f1952a;
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
        ByteOrder byteOrder = this.f1954c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j4 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j5 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f1954c);
            }
            j4 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j5 = read8;
        }
        return j4 + j5;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f1953b += 2;
        DataInputStream dataInputStream = this.f1952a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1954c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f1954c);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f1953b += 2;
        return this.f1952a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f1953b++;
        return this.f1952a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f1953b += 2;
        DataInputStream dataInputStream = this.f1952a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1954c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f1954c);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i4) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        int read = this.f1952a.read(bArr, i4, i5);
        this.f1953b += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f1953b += bArr.length;
        this.f1952a.readFully(bArr);
    }

    public b(InputStream inputStream, int i4) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f1952a = dataInputStream;
        dataInputStream.mark(0);
        this.f1953b = 0;
        this.f1954c = byteOrder;
        this.f1956e = inputStream instanceof b ? ((b) inputStream).f1956e : -1;
    }
}
