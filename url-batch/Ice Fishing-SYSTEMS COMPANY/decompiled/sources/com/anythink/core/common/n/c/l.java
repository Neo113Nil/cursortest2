package com.anythink.core.common.n.c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f16032a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final byte f16033b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final byte f16034c = 3;

    /* renamed from: d, reason: collision with root package name */
    private static final byte f16035d = 4;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f16036e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final byte f16037f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final byte f16038g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final byte f16039h = 3;

    /* renamed from: j, reason: collision with root package name */
    private final e f16040j;

    /* renamed from: k, reason: collision with root package name */
    private final Inflater f16041k;

    /* renamed from: l, reason: collision with root package name */
    private final m f16042l;
    private int i = 0;

    /* renamed from: m, reason: collision with root package name */
    private final CRC32 f16043m = new CRC32();

    public l(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f16041k = inflater;
        e a9 = n.a(wVar);
        this.f16040j = a9;
        this.f16042l = new m(a9, inflater);
    }

    private void b() {
        this.f16040j.a(10L);
        byte c4 = this.f16040j.c().c(3L);
        boolean z8 = ((c4 >> 1) & 1) == 1;
        if (z8) {
            a(this.f16040j.c(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f16040j.l());
        this.f16040j.i(8L);
        if (((c4 >> 2) & 1) == 1) {
            this.f16040j.a(2L);
            if (z8) {
                a(this.f16040j.c(), 0L, 2L);
            }
            long a9 = y.a(this.f16040j.c().l());
            this.f16040j.a(a9);
            if (z8) {
                a(this.f16040j.c(), 0L, a9);
            }
            this.f16040j.i(a9);
        }
        if (((c4 >> 3) & 1) == 1) {
            long a10 = this.f16040j.a(f16036e);
            if (a10 == -1) {
                throw new EOFException();
            }
            if (z8) {
                a(this.f16040j.c(), 0L, a10 + 1);
            }
            this.f16040j.i(a10 + 1);
        }
        if (((c4 >> 4) & 1) == 1) {
            long a11 = this.f16040j.a(f16036e);
            if (a11 == -1) {
                throw new EOFException();
            }
            if (z8) {
                a(this.f16040j.c(), 0L, a11 + 1);
            }
            this.f16040j.i(a11 + 1);
        }
        if (z8) {
            a("FHCRC", this.f16040j.o(), (short) this.f16043m.getValue());
            this.f16043m.reset();
        }
    }

    private void c() {
        a("CRC", this.f16040j.p(), (int) this.f16043m.getValue());
        a("ISIZE", this.f16040j.p(), (int) this.f16041k.getBytesWritten());
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f16040j.a();
    }

    @Override // com.anythink.core.common.n.c.w
    public final long a_(c cVar, long j9) {
        if (j9 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j9)));
        }
        if (j9 == 0) {
            return 0L;
        }
        if (this.i == 0) {
            this.f16040j.a(10L);
            byte c4 = this.f16040j.c().c(3L);
            boolean z8 = ((c4 >> 1) & 1) == 1;
            if (z8) {
                a(this.f16040j.c(), 0L, 10L);
            }
            a("ID1ID2", 8075, this.f16040j.l());
            this.f16040j.i(8L);
            if (((c4 >> 2) & 1) == 1) {
                this.f16040j.a(2L);
                if (z8) {
                    a(this.f16040j.c(), 0L, 2L);
                }
                long o9 = this.f16040j.c().o();
                this.f16040j.a(o9);
                if (z8) {
                    a(this.f16040j.c(), 0L, o9);
                }
                this.f16040j.i(o9);
            }
            if (((c4 >> 3) & 1) == 1) {
                long a9 = this.f16040j.a(f16036e);
                if (a9 == -1) {
                    throw new EOFException();
                }
                if (z8) {
                    a(this.f16040j.c(), 0L, a9 + 1);
                }
                this.f16040j.i(a9 + 1);
            }
            if (((c4 >> 4) & 1) == 1) {
                long a10 = this.f16040j.a(f16036e);
                if (a10 == -1) {
                    throw new EOFException();
                }
                if (z8) {
                    a(this.f16040j.c(), 0L, a10 + 1);
                }
                this.f16040j.i(a10 + 1);
            }
            if (z8) {
                a("FHCRC", this.f16040j.o(), (short) this.f16043m.getValue());
                this.f16043m.reset();
            }
            this.i = 1;
        }
        if (this.i == 1) {
            long j10 = cVar.f16005c;
            long a_ = this.f16042l.a_(cVar, j9);
            if (a_ != -1) {
                a(cVar, j10, a_);
                return a_;
            }
            this.i = 2;
        }
        if (this.i == 2) {
            a("CRC", this.f16040j.p(), (int) this.f16043m.getValue());
            a("ISIZE", this.f16040j.p(), (int) this.f16041k.getBytesWritten());
            this.i = 3;
            if (!this.f16040j.g()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16042l.close();
    }

    private void a(c cVar, long j9, long j10) {
        s sVar = cVar.f16004b;
        while (true) {
            int i = sVar.f16074e;
            int i4 = sVar.f16073d;
            if (j9 < i - i4) {
                break;
            }
            j9 -= i - i4;
            sVar = sVar.f16077h;
        }
        while (j10 > 0) {
            int min = (int) Math.min(sVar.f16074e - r6, j10);
            this.f16043m.update(sVar.f16072c, (int) (sVar.f16073d + j9), min);
            j10 -= min;
            sVar = sVar.f16077h;
            j9 = 0;
        }
    }

    private static void a(String str, int i, int i4) {
        if (i4 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }
}
