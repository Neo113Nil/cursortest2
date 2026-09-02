package m;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0068b extends InputStream implements DataInput {

    /* renamed from: b, reason: collision with root package name */
    public final DataInputStream f934b;

    /* renamed from: c, reason: collision with root package name */
    public int f935c;

    /* renamed from: d, reason: collision with root package name */
    public ByteOrder f936d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f937e;

    /* renamed from: f, reason: collision with root package name */
    public final int f938f;

    public C0068b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f938f = bArr.length;
    }

    public final void a(int i2) {
        int i3 = 0;
        while (i3 < i2) {
            DataInputStream dataInputStream = this.f934b;
            int i4 = i2 - i3;
            int skip = (int) dataInputStream.skip(i4);
            if (skip <= 0) {
                if (this.f937e == null) {
                    this.f937e = new byte[8192];
                }
                skip = dataInputStream.read(this.f937e, 0, Math.min(8192, i4));
                if (skip == -1) {
                    throw new EOFException("Reached EOF while skipping " + i2 + " bytes.");
                }
            }
            i3 += skip;
        }
        this.f935c += i3;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f934b.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f935c++;
        return this.f934b.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f935c++;
        return this.f934b.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f935c++;
        int read = this.f934b.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f935c += 2;
        return this.f934b.readChar();
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
    public final void readFully(byte[] bArr, int i2, int i3) {
        this.f935c += i3;
        this.f934b.readFully(bArr, i2, i3);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f935c += 4;
        DataInputStream dataInputStream = this.f934b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f936d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f936d);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f935c += 8;
        DataInputStream dataInputStream = this.f934b;
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
        ByteOrder byteOrder = this.f936d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new IOException("Invalid byte order: " + this.f936d);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f935c += 2;
        DataInputStream dataInputStream = this.f934b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f936d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f936d);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f935c += 2;
        return this.f934b.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f935c++;
        return this.f934b.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f935c += 2;
        DataInputStream dataInputStream = this.f934b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f936d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f936d);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i2) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C0068b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        int read = this.f934b.read(bArr, i2, i3);
        this.f935c += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f935c += bArr.length;
        this.f934b.readFully(bArr);
    }

    public C0068b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f934b = dataInputStream;
        dataInputStream.mark(0);
        this.f935c = 0;
        this.f936d = byteOrder;
        this.f938f = inputStream instanceof C0068b ? ((C0068b) inputStream).f938f : -1;
    }
}
