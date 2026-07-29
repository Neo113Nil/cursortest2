package c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: GzipSource.java */
/* loaded from: classes.dex */
public final class i implements r {

    /* renamed from: b, reason: collision with root package name */
    private final e f2196b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f2197c;

    /* renamed from: d, reason: collision with root package name */
    private final j f2198d;

    /* renamed from: a, reason: collision with root package name */
    private int f2195a = 0;
    private final CRC32 e = new CRC32();

    public i(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.f2197c = new Inflater(true);
        this.f2196b = k.a(rVar);
        this.f2198d = new j(this.f2196b, this.f2197c);
    }

    @Override // c.r
    public long a(c cVar, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f2195a == 0) {
            b();
            this.f2195a = 1;
        }
        if (this.f2195a == 1) {
            long j2 = cVar.f2186b;
            long a2 = this.f2198d.a(cVar, j);
            if (a2 != -1) {
                a(cVar, j2, a2);
                return a2;
            }
            this.f2195a = 2;
        }
        if (this.f2195a == 2) {
            c();
            this.f2195a = 3;
            if (!this.f2196b.f()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    private void b() throws IOException {
        this.f2196b.a(10L);
        byte b2 = this.f2196b.c().b(3L);
        boolean z = ((b2 >> 1) & 1) == 1;
        if (z) {
            a(this.f2196b.c(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f2196b.j());
        this.f2196b.h(8L);
        if (((b2 >> 2) & 1) == 1) {
            this.f2196b.a(2L);
            if (z) {
                a(this.f2196b.c(), 0L, 2L);
            }
            long l = this.f2196b.c().l();
            this.f2196b.a(l);
            if (z) {
                a(this.f2196b.c(), 0L, l);
            }
            this.f2196b.h(l);
        }
        if (((b2 >> 3) & 1) == 1) {
            long a2 = this.f2196b.a((byte) 0);
            if (a2 == -1) {
                throw new EOFException();
            }
            if (z) {
                a(this.f2196b.c(), 0L, a2 + 1);
            }
            this.f2196b.h(a2 + 1);
        }
        if (((b2 >> 4) & 1) == 1) {
            long a3 = this.f2196b.a((byte) 0);
            if (a3 == -1) {
                throw new EOFException();
            }
            if (z) {
                a(this.f2196b.c(), 0L, a3 + 1);
            }
            this.f2196b.h(a3 + 1);
        }
        if (z) {
            a("FHCRC", this.f2196b.l(), (short) this.e.getValue());
            this.e.reset();
        }
    }

    private void c() throws IOException {
        a("CRC", this.f2196b.m(), (int) this.e.getValue());
        a("ISIZE", this.f2196b.m(), (int) this.f2197c.getBytesWritten());
    }

    @Override // c.r
    public s a() {
        return this.f2196b.a();
    }

    @Override // c.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2198d.close();
    }

    private void a(c cVar, long j, long j2) {
        n nVar = cVar.f2185a;
        while (j >= nVar.f2218c - nVar.f2217b) {
            j -= nVar.f2218c - nVar.f2217b;
            nVar = nVar.f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(nVar.f2218c - r6, j2);
            this.e.update(nVar.f2216a, (int) (nVar.f2217b + j), min);
            j2 -= min;
            nVar = nVar.f;
            j = 0;
        }
    }

    private void a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
