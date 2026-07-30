package defpackage;

import android.util.Log;
import com.facebook.internal.Utility;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ij0 extends InputStream implements DataInput {
    public final DataInputStream m;
    public int n;
    public ByteOrder o;
    public byte[] p;
    public final int q;

    public ij0(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.m = dataInputStream;
        dataInputStream.mark(0);
        this.n = 0;
        this.o = byteOrder;
        this.q = inputStream instanceof ij0 ? ((ij0) inputStream).q : -1;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.m.available();
    }

    public final void b(int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.m;
            int skip = (int) dataInputStream.skip(i3);
            if (skip <= 0) {
                if (this.p == null) {
                    this.p = new byte[Utility.DEFAULT_STREAM_BUFFER_SIZE];
                }
                skip = dataInputStream.read(this.p, 0, Math.min(Utility.DEFAULT_STREAM_BUFFER_SIZE, i3));
                if (skip == -1) {
                    throw new EOFException(in1.l(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += skip;
        }
        this.n += i2;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.n++;
        return this.m.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.n++;
        return this.m.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.n++;
        int read = this.m.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.n += 2;
        return this.m.readChar();
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
        this.n += bArr.length;
        this.m.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.n += 4;
        DataInputStream dataInputStream = this.m;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.o;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        ey.l(this.o, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.n += 8;
        DataInputStream dataInputStream = this.m;
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
        ByteOrder byteOrder = this.o;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        ey.l(this.o, "Invalid byte order: ");
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.n += 2;
        DataInputStream dataInputStream = this.m;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.o;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        ey.l(this.o, "Invalid byte order: ");
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.n += 2;
        return this.m.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.n++;
        return this.m.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.n += 2;
        DataInputStream dataInputStream = this.m;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.o;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        ey.l(this.o, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.n += i2;
        this.m.readFully(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.m.read(bArr, i, i2);
        this.n += read;
        return read;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ij0(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ij0(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.q = bArr.length;
    }
}
