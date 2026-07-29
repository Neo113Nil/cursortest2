package c;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RealBufferedSource.java */
/* loaded from: classes.dex */
final class m implements e {

    /* renamed from: a, reason: collision with root package name */
    public final c f2212a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final r f2213b;

    /* renamed from: c, reason: collision with root package name */
    boolean f2214c;

    m(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f2213b = rVar;
    }

    @Override // c.e
    public c c() {
        return this.f2212a;
    }

    @Override // c.r
    public long a(c cVar, long j) throws IOException {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f2214c) {
            throw new IllegalStateException("closed");
        }
        if (this.f2212a.f2186b == 0 && this.f2213b.a(this.f2212a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.f2212a.a(cVar, Math.min(j, this.f2212a.f2186b));
    }

    @Override // c.e
    public boolean f() throws IOException {
        if (this.f2214c) {
            throw new IllegalStateException("closed");
        }
        return this.f2212a.f() && this.f2213b.a(this.f2212a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // c.e
    public void a(long j) throws IOException {
        if (!b(j)) {
            throw new EOFException();
        }
    }

    public boolean b(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f2214c) {
            throw new IllegalStateException("closed");
        }
        while (this.f2212a.f2186b < j) {
            if (this.f2213b.a(this.f2212a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // c.e
    public byte i() throws IOException {
        a(1L);
        return this.f2212a.i();
    }

    @Override // c.e
    public f c(long j) throws IOException {
        a(j);
        return this.f2212a.c(j);
    }

    @Override // c.e
    public byte[] g(long j) throws IOException {
        a(j);
        return this.f2212a.g(j);
    }

    @Override // c.e
    public void a(byte[] bArr) throws IOException {
        try {
            a(bArr.length);
            this.f2212a.a(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f2212a.f2186b > 0) {
                int a2 = this.f2212a.a(bArr, i, (int) this.f2212a.f2186b);
                if (a2 == -1) {
                    throw new AssertionError();
                }
                i += a2;
            }
            throw e;
        }
    }

    @Override // c.e
    public long a(q qVar) throws IOException {
        if (qVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j = 0;
        while (this.f2213b.a(this.f2212a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long h = this.f2212a.h();
            if (h > 0) {
                j += h;
                qVar.a_(this.f2212a, h);
            }
        }
        if (this.f2212a.b() <= 0) {
            return j;
        }
        long b2 = j + this.f2212a.b();
        qVar.a_(this.f2212a, this.f2212a.b());
        return b2;
    }

    @Override // c.e
    public String q() throws IOException {
        return d(Long.MAX_VALUE);
    }

    public String d(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long a2 = a((byte) 10, 0L, j2);
        if (a2 != -1) {
            return this.f2212a.f(a2);
        }
        if (j2 < Long.MAX_VALUE && b(j2) && this.f2212a.b(j2 - 1) == 13 && b(1 + j2) && this.f2212a.b(j2) == 10) {
            return this.f2212a.f(j2);
        }
        c cVar = new c();
        this.f2212a.a(cVar, 0L, Math.min(32L, this.f2212a.b()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f2212a.b(), j) + " content=" + cVar.o().e() + (char) 8230);
    }

    @Override // c.e
    public short j() throws IOException {
        a(2L);
        return this.f2212a.j();
    }

    @Override // c.e
    public short l() throws IOException {
        a(2L);
        return this.f2212a.l();
    }

    @Override // c.e
    public int k() throws IOException {
        a(4L);
        return this.f2212a.k();
    }

    @Override // c.e
    public int m() throws IOException {
        a(4L);
        return this.f2212a.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long n() throws IOException {
        a(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!b(i2)) {
                break;
            }
            byte b2 = this.f2212a.b(i);
            if ((b2 < 48 || b2 > 57) && ((b2 < 97 || b2 > 102) && (b2 < 65 || b2 > 70))) {
                break;
            }
            i = i2;
        }
        return this.f2212a.n();
    }

    @Override // c.e
    public void h(long j) throws IOException {
        if (this.f2214c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.f2212a.f2186b == 0 && this.f2213b.a(this.f2212a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f2212a.b());
            this.f2212a.h(min);
            j -= min;
        }
    }

    @Override // c.e
    public long a(byte b2) throws IOException {
        return a(b2, 0L, Long.MAX_VALUE);
    }

    public long a(byte b2, long j, long j2) throws IOException {
        if (this.f2214c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        while (j < j2) {
            long a2 = this.f2212a.a(b2, j, j2);
            if (a2 != -1) {
                return a2;
            }
            long j3 = this.f2212a.f2186b;
            if (j3 >= j2 || this.f2213b.a(this.f2212a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, j3);
        }
        return -1L;
    }

    @Override // c.e
    public boolean a(long j, f fVar) throws IOException {
        return a(j, fVar, 0, fVar.g());
    }

    public boolean a(long j, f fVar, int i, int i2) throws IOException {
        if (this.f2214c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || fVar.g() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = i3 + j;
            if (!b(1 + j2) || this.f2212a.b(j2) != fVar.a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // c.e
    public InputStream g() {
        return new InputStream() { // from class: c.m.1
            @Override // java.io.InputStream
            public int read() throws IOException {
                if (m.this.f2214c) {
                    throw new IOException("closed");
                }
                if (m.this.f2212a.f2186b == 0 && m.this.f2213b.a(m.this.f2212a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return m.this.f2212a.i() & 255;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                if (m.this.f2214c) {
                    throw new IOException("closed");
                }
                t.a(bArr.length, i, i2);
                if (m.this.f2212a.f2186b == 0 && m.this.f2213b.a(m.this.f2212a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return m.this.f2212a.a(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public int available() throws IOException {
                if (m.this.f2214c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(m.this.f2212a.f2186b, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                m.this.close();
            }

            public String toString() {
                return m.this + ".inputStream()";
            }
        };
    }

    @Override // c.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f2214c) {
            return;
        }
        this.f2214c = true;
        this.f2213b.close();
        this.f2212a.s();
    }

    @Override // c.r
    public s a() {
        return this.f2213b.a();
    }

    public String toString() {
        return "buffer(" + this.f2213b + ")";
    }
}
