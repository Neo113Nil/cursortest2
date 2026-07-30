package com.anythink.core.common.n.b.a.k;

import com.anythink.core.common.n.c.c;
import com.anythink.core.common.n.c.f;
import com.anythink.core.common.n.c.v;
import com.anythink.core.common.n.c.x;
import java.io.IOException;
import java.util.Random;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    final boolean f15606a;

    /* renamed from: b, reason: collision with root package name */
    final Random f15607b;

    /* renamed from: c, reason: collision with root package name */
    final com.anythink.core.common.n.c.d f15608c;

    /* renamed from: d, reason: collision with root package name */
    final com.anythink.core.common.n.c.c f15609d;

    /* renamed from: e, reason: collision with root package name */
    boolean f15610e;

    /* renamed from: f, reason: collision with root package name */
    final com.anythink.core.common.n.c.c f15611f = new com.anythink.core.common.n.c.c();

    /* renamed from: g, reason: collision with root package name */
    final a f15612g = new a();

    /* renamed from: h, reason: collision with root package name */
    boolean f15613h;
    private final byte[] i;

    /* renamed from: j, reason: collision with root package name */
    private final c.a f15614j;

    public d(boolean z8, com.anythink.core.common.n.c.d dVar, Random random) {
        if (dVar == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.f15606a = z8;
        this.f15608c = dVar;
        this.f15609d = dVar.c();
        this.f15607b = random;
        this.i = z8 ? new byte[4] : null;
        this.f15614j = z8 ? new c.a() : null;
    }

    public final void a(f fVar) {
        b(9, fVar);
    }

    public final void b(f fVar) {
        b(10, fVar);
    }

    private void b(int i, f fVar) {
        if (this.f15610e) {
            throw new IOException("closed");
        }
        int j9 = fVar.j();
        if (j9 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f15609d.l(i | 128);
        if (this.f15606a) {
            this.f15609d.l(j9 | 128);
            this.f15607b.nextBytes(this.i);
            this.f15609d.d(this.i);
            if (j9 > 0) {
                long b9 = this.f15609d.b();
                this.f15609d.d(fVar);
                this.f15609d.a(this.f15614j);
                this.f15614j.a(b9);
                b.a(this.f15614j, this.i);
                this.f15614j.close();
            }
        } else {
            this.f15609d.l(j9);
            this.f15609d.d(fVar);
        }
        this.f15608c.flush();
    }

    public final void a(int i, f fVar) {
        f fVar2 = f.f16016b;
        if (i != 0 || fVar != null) {
            if (i != 0) {
                b.b(i);
            }
            com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
            cVar.k(i);
            if (fVar != null) {
                cVar.d(fVar);
            }
            fVar2 = cVar.t();
        }
        try {
            b(8, fVar2);
        } finally {
            this.f15610e = true;
        }
    }

    public final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        int f15615a;

        /* renamed from: b, reason: collision with root package name */
        long f15616b;

        /* renamed from: c, reason: collision with root package name */
        boolean f15617c;

        /* renamed from: d, reason: collision with root package name */
        boolean f15618d;

        public a() {
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j9) {
            if (this.f15618d) {
                throw new IOException("closed");
            }
            d.this.f15611f.a(cVar, j9);
            boolean z8 = this.f15617c && this.f15616b != -1 && d.this.f15611f.b() > this.f15616b - 8192;
            long j10 = d.this.f15611f.j();
            if (j10 <= 0 || z8) {
                return;
            }
            d.this.a(this.f15615a, j10, this.f15617c, false);
            this.f15617c = false;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15618d) {
                throw new IOException("closed");
            }
            d dVar = d.this;
            dVar.a(this.f15615a, dVar.f15611f.b(), this.f15617c, true);
            this.f15618d = true;
            d.this.f15613h = false;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            if (this.f15618d) {
                throw new IOException("closed");
            }
            d dVar = d.this;
            dVar.a(this.f15615a, dVar.f15611f.b(), this.f15617c, false);
            this.f15617c = false;
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return d.this.f15608c.a();
        }
    }

    private v a(int i, long j9) {
        if (!this.f15613h) {
            this.f15613h = true;
            a aVar = this.f15612g;
            aVar.f15615a = i;
            aVar.f15616b = j9;
            aVar.f15617c = true;
            aVar.f15618d = false;
            return aVar;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    public final void a(int i, long j9, boolean z8, boolean z9) {
        if (!this.f15610e) {
            if (!z8) {
                i = 0;
            }
            if (z9) {
                i |= 128;
            }
            this.f15609d.l(i);
            int i4 = this.f15606a ? 128 : 0;
            if (j9 <= 125) {
                this.f15609d.l(((int) j9) | i4);
            } else if (j9 <= 65535) {
                this.f15609d.l(i4 | com.anythink.expressad.video.module.a.a.f21885Q);
                this.f15609d.k((int) j9);
            } else {
                this.f15609d.l(i4 | com.anythink.expressad.video.module.a.a.f21886R);
                this.f15609d.q(j9);
            }
            if (this.f15606a) {
                this.f15607b.nextBytes(this.i);
                this.f15609d.d(this.i);
                if (j9 > 0) {
                    long b9 = this.f15609d.b();
                    this.f15609d.a(this.f15611f, j9);
                    this.f15609d.a(this.f15614j);
                    this.f15614j.a(b9);
                    b.a(this.f15614j, this.i);
                    this.f15614j.close();
                }
            } else {
                this.f15609d.a(this.f15611f, j9);
            }
            this.f15608c.f();
            return;
        }
        throw new IOException("closed");
    }
}
