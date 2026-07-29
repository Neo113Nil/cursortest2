package c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource.java */
/* loaded from: classes.dex */
public final class j implements r {

    /* renamed from: a, reason: collision with root package name */
    private final e f2199a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f2200b;

    /* renamed from: c, reason: collision with root package name */
    private int f2201c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2202d;

    j(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f2199a = eVar;
        this.f2200b = inflater;
    }

    @Override // c.r
    public long a(c cVar, long j) throws IOException {
        boolean b2;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f2202d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            b2 = b();
            try {
                n e = cVar.e(1);
                int inflate = this.f2200b.inflate(e.f2216a, e.f2218c, 8192 - e.f2218c);
                if (inflate > 0) {
                    e.f2218c += inflate;
                    long j2 = inflate;
                    cVar.f2186b += j2;
                    return j2;
                }
                if (!this.f2200b.finished() && !this.f2200b.needsDictionary()) {
                }
                c();
                if (e.f2217b != e.f2218c) {
                    return -1L;
                }
                cVar.f2185a = e.a();
                o.a(e);
                return -1L;
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        } while (!b2);
        throw new EOFException("source exhausted prematurely");
    }

    public boolean b() throws IOException {
        if (!this.f2200b.needsInput()) {
            return false;
        }
        c();
        if (this.f2200b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f2199a.f()) {
            return true;
        }
        n nVar = this.f2199a.c().f2185a;
        this.f2201c = nVar.f2218c - nVar.f2217b;
        this.f2200b.setInput(nVar.f2216a, nVar.f2217b, this.f2201c);
        return false;
    }

    private void c() throws IOException {
        if (this.f2201c == 0) {
            return;
        }
        int remaining = this.f2201c - this.f2200b.getRemaining();
        this.f2201c -= remaining;
        this.f2199a.h(remaining);
    }

    @Override // c.r
    public s a() {
        return this.f2199a.a();
    }

    @Override // c.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f2202d) {
            return;
        }
        this.f2200b.end();
        this.f2202d = true;
        this.f2199a.close();
    }
}
