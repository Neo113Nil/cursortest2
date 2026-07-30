package X;

import C4.p;
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

    /* renamed from: d, reason: collision with root package name */
    public final DataInputStream f2793d;

    /* renamed from: e, reason: collision with root package name */
    public int f2794e;

    /* renamed from: i, reason: collision with root package name */
    public ByteOrder f2795i;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f2796l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2797m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f2797m = bArr.length;
    }

    public final void a(int i2) {
        int i5 = 0;
        while (i5 < i2) {
            int i7 = i2 - i5;
            DataInputStream dataInputStream = this.f2793d;
            int skip = (int) dataInputStream.skip(i7);
            if (skip <= 0) {
                if (this.f2796l == null) {
                    this.f2796l = new byte[8192];
                }
                skip = dataInputStream.read(this.f2796l, 0, Math.min(8192, i7));
                if (skip == -1) {
                    throw new EOFException(p.h(i2, "Reached EOF while skipping ", " bytes."));
                }
            }
            i5 += skip;
        }
        this.f2794e += i5;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f2793d.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f2794e++;
        return this.f2793d.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f2794e++;
        return this.f2793d.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f2794e++;
        int read = this.f2793d.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f2794e += 2;
        return this.f2793d.readChar();
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
    public final void readFully(byte[] bArr, int i2, int i5) {
        this.f2794e += i5;
        this.f2793d.readFully(bArr, i2, i5);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f2794e += 4;
        DataInputStream dataInputStream = this.f2793d;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2795i;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f2795i);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j;
        long j7;
        this.f2794e += 8;
        DataInputStream dataInputStream = this.f2793d;
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
        ByteOrder byteOrder = this.f2795i;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j7 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f2795i);
            }
            j = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j7 = read8;
        }
        return j + j7;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f2794e += 2;
        DataInputStream dataInputStream = this.f2793d;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2795i;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f2795i);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f2794e += 2;
        return this.f2793d.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f2794e++;
        return this.f2793d.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f2794e += 2;
        DataInputStream dataInputStream = this.f2793d;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2795i;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f2795i);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i2) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i5) {
        int read = this.f2793d.read(bArr, i2, i5);
        this.f2794e += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f2794e += bArr.length;
        this.f2793d.readFully(bArr);
    }

    public b(InputStream inputStream, int i2) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f2793d = dataInputStream;
        dataInputStream.mark(0);
        this.f2794e = 0;
        this.f2795i = byteOrder;
        this.f2797m = inputStream instanceof b ? ((b) inputStream).f2797m : -1;
    }
}
