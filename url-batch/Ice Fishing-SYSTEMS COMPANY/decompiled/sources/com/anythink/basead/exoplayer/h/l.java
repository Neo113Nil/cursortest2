package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.r;
import com.anythink.basead.exoplayer.h.s;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final s f7833a;

    /* renamed from: b, reason: collision with root package name */
    public final s.a f7834b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.b f7835c;

    /* renamed from: d, reason: collision with root package name */
    private r f7836d;

    /* renamed from: e, reason: collision with root package name */
    private r.a f7837e;

    /* renamed from: f, reason: collision with root package name */
    private long f7838f;

    /* renamed from: g, reason: collision with root package name */
    private a f7839g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7840h;
    private long i = com.anythink.basead.exoplayer.b.f6539b;

    public interface a {
        void a(s.a aVar, IOException iOException);
    }

    public l(s sVar, s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        this.f7834b = aVar;
        this.f7835c = bVar;
        this.f7833a = sVar;
    }

    private void h() {
        this.f7837e.a((r.a) this);
    }

    public final void a(a aVar) {
        this.f7839g = aVar;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j9) {
        this.f7836d.a_(j9);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f7836d.b();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        return this.f7836d.c();
    }

    public final void d(long j9) {
        if (this.f7838f != 0 || j9 == 0) {
            return;
        }
        this.i = j9;
        this.f7838f = j9;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        return this.f7836d.e();
    }

    public final void f() {
        r a9 = this.f7833a.a(this.f7834b, this.f7835c);
        this.f7836d = a9;
        if (this.f7837e != null) {
            a9.a(this, this.f7838f);
        }
    }

    public final void g() {
        r rVar = this.f7836d;
        if (rVar != null) {
            this.f7833a.a(rVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j9) {
        this.f7837e = aVar;
        this.f7838f = j9;
        r rVar = this.f7836d;
        if (rVar != null) {
            rVar.a(this, j9);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long b(long j9) {
        return this.f7836d.b(j9);
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j9) {
        r rVar = this.f7836d;
        return rVar != null && rVar.c(j9);
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        return this.f7836d.d();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
        try {
            r rVar = this.f7836d;
            if (rVar != null) {
                rVar.a();
            } else {
                this.f7833a.b();
            }
        } catch (IOException e6) {
            a aVar = this.f7839g;
            if (aVar != null) {
                if (this.f7840h) {
                    return;
                }
                this.f7840h = true;
                aVar.a(this.f7834b, e6);
                return;
            }
            throw e6;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j9) {
        long j10;
        long j11 = this.i;
        if (j11 == com.anythink.basead.exoplayer.b.f6539b || j9 != 0) {
            j10 = j9;
        } else {
            this.i = com.anythink.basead.exoplayer.b.f6539b;
            j10 = j11;
        }
        return this.f7836d.a(fVarArr, zArr, yVarArr, zArr2, j10);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j9, boolean z8) {
        this.f7836d.a(j9, z8);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j9, com.anythink.basead.exoplayer.ac acVar) {
        return this.f7836d.a(j9, acVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.basead.exoplayer.h.r.a
    public final void a(r rVar) {
        this.f7837e.a((r) this);
    }

    @Override // com.anythink.basead.exoplayer.h.z.a
    public final /* bridge */ /* synthetic */ void a(r rVar) {
        this.f7837e.a((r.a) this);
    }
}
