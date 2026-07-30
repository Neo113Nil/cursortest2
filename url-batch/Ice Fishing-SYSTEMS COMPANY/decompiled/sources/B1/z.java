package B1;

import com.google.android.gms.internal.ads.C3112dq;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class z extends FilterInputStream {

    /* renamed from: n, reason: collision with root package name */
    public volatile byte[] f135n;

    /* renamed from: u, reason: collision with root package name */
    public int f136u;

    /* renamed from: v, reason: collision with root package name */
    public int f137v;

    /* renamed from: w, reason: collision with root package name */
    public int f138w;

    /* renamed from: x, reason: collision with root package name */
    public int f139x;

    /* renamed from: y, reason: collision with root package name */
    public final C3112dq f140y;

    public z(InputStream inputStream, C3112dq c3112dq) {
        super(inputStream);
        this.f138w = -1;
        this.f140y = c3112dq;
        this.f135n = (byte[]) c3112dq.f(com.anythink.basead.exoplayer.b.aX, byte[].class);
    }

    public static void j() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i = this.f138w;
        if (i != -1) {
            int i4 = this.f139x - i;
            int i9 = this.f137v;
            if (i4 < i9) {
                if (i == 0 && i9 > bArr.length && this.f136u == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i9) {
                        i9 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f140y.f(i9, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f135n = bArr2;
                    this.f140y.k(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i10 = this.f139x - this.f138w;
                this.f139x = i10;
                this.f138w = 0;
                this.f136u = 0;
                int read = inputStream.read(bArr, i10, bArr.length - i10);
                int i11 = this.f139x;
                if (read > 0) {
                    i11 += read;
                }
                this.f136u = i11;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f138w = -1;
            this.f139x = 0;
            this.f136u = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f135n == null || inputStream == null) {
            j();
            throw null;
        }
        return (this.f136u - this.f139x) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.f135n != null) {
            this.f140y.k(this.f135n);
            this.f135n = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f135n != null) {
            this.f140y.k(this.f135n);
            this.f135n = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f137v = Math.max(this.f137v, i);
        this.f138w = this.f139x;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f135n;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            j();
            throw null;
        }
        if (this.f139x >= this.f136u && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f135n && (bArr = this.f135n) == null) {
            j();
            throw null;
        }
        int i = this.f136u;
        int i4 = this.f139x;
        if (i - i4 <= 0) {
            return -1;
        }
        this.f139x = i4 + 1;
        return bArr[i4] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f135n == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f138w;
        if (-1 == i) {
            throw new y("Mark has been invalidated, pos: " + this.f139x + " markLimit: " + this.f137v);
        }
        this.f139x = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j9) {
        if (j9 < 1) {
            return 0L;
        }
        byte[] bArr = this.f135n;
        if (bArr == null) {
            j();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            j();
            throw null;
        }
        int i = this.f136u;
        int i4 = this.f139x;
        if (i - i4 >= j9) {
            this.f139x = (int) (i4 + j9);
            return j9;
        }
        long j10 = i - i4;
        this.f139x = i;
        if (this.f138w == -1 || j9 > this.f137v) {
            long skip = inputStream.skip(j9 - j10);
            if (skip > 0) {
                this.f138w = -1;
            }
            return j10 + skip;
        }
        if (a(inputStream, bArr) == -1) {
            return j10;
        }
        int i9 = this.f136u;
        int i10 = this.f139x;
        if (i9 - i10 >= j9 - j10) {
            this.f139x = (int) ((i10 + j9) - j10);
            return j9;
        }
        long j11 = (j10 + i9) - i10;
        this.f139x = i9;
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i4) {
        int i9;
        int i10;
        byte[] bArr2 = this.f135n;
        if (bArr2 == null) {
            j();
            throw null;
        }
        if (i4 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i11 = this.f139x;
            int i12 = this.f136u;
            if (i11 < i12) {
                int i13 = i12 - i11;
                if (i13 >= i4) {
                    i13 = i4;
                }
                System.arraycopy(bArr2, i11, bArr, i, i13);
                this.f139x += i13;
                if (i13 == i4 || inputStream.available() == 0) {
                    return i13;
                }
                i += i13;
                i9 = i4 - i13;
            } else {
                i9 = i4;
            }
            while (true) {
                if (this.f138w == -1 && i9 >= bArr2.length) {
                    i10 = inputStream.read(bArr, i, i9);
                    if (i10 == -1) {
                        return i9 != i4 ? i4 - i9 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i9 != i4 ? i4 - i9 : -1;
                    }
                    if (bArr2 != this.f135n && (bArr2 = this.f135n) == null) {
                        j();
                        throw null;
                    }
                    int i14 = this.f136u;
                    int i15 = this.f139x;
                    i10 = i14 - i15;
                    if (i10 >= i9) {
                        i10 = i9;
                    }
                    System.arraycopy(bArr2, i15, bArr, i, i10);
                    this.f139x += i10;
                }
                i9 -= i10;
                if (i9 == 0) {
                    return i4;
                }
                if (inputStream.available() == 0) {
                    return i4 - i9;
                }
                i += i10;
            }
        } else {
            j();
            throw null;
        }
    }
}
