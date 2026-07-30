package n;

import android.util.Log;
import f0.l;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: b, reason: collision with root package name */
    public final DataInputStream f888b;

    /* renamed from: c, reason: collision with root package name */
    public int f889c;

    /* renamed from: d, reason: collision with root package name */
    public ByteOrder f890d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f891e;

    /* renamed from: f, reason: collision with root package name */
    public final int f892f;

    public b(InputStream inputStream, int i2) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f888b = dataInputStream;
        dataInputStream.mark(0);
        this.f889c = 0;
        this.f890d = byteOrder;
        this.f892f = inputStream instanceof b ? ((b) inputStream).f892f : -1;
    }

    public final void a(int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i2 - i3;
            DataInputStream dataInputStream = this.f888b;
            int skip = (int) dataInputStream.skip(i4);
            if (skip <= 0) {
                if (this.f891e == null) {
                    this.f891e = new byte[8192];
                }
                skip = dataInputStream.read(this.f891e, 0, Math.min(8192, i4));
                if (skip == -1) {
                    throw new EOFException("Reached EOF while skipping " + i2 + " bytes.");
                }
            }
            i3 += skip;
        }
        this.f889c += i3;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f888b.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f889c++;
        return this.f888b.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f889c++;
        return this.f888b.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f889c++;
        int read = this.f888b.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f889c += 2;
        return this.f888b.readChar();
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
    public final void readFully(byte[] bArr) {
        this.f889c += bArr.length;
        this.f888b.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f889c += 4;
        DataInputStream dataInputStream = this.f888b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f890d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        l.i("Invalid byte order: ", this.f890d);
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j2;
        long j3;
        this.f889c += 8;
        DataInputStream dataInputStream = this.f888b;
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
        ByteOrder byteOrder = this.f890d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j2 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j3 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                l.i("Invalid byte order: ", this.f890d);
                return 0L;
            }
            j2 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j3 = read8;
        }
        return j2 + j3;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f889c += 2;
        DataInputStream dataInputStream = this.f888b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f890d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        l.i("Invalid byte order: ", this.f890d);
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f889c += 2;
        return this.f888b.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f889c++;
        return this.f888b.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f889c += 2;
        DataInputStream dataInputStream = this.f888b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f890d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        l.i("Invalid byte order: ", this.f890d);
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i2) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i2, int i3) {
        this.f889c += i3;
        this.f888b.readFully(bArr, i2, i3);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        int read = this.f888b.read(bArr, i2, i3);
        this.f889c += read;
        return read;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f892f = bArr.length;
    }
}
