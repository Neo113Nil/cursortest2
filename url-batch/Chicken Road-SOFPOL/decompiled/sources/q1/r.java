package q1;

import x1.u1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r implements r2.c, g6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f6023d;

    /* renamed from: e, reason: collision with root package name */
    public final a7.h f6024e;

    /* renamed from: f, reason: collision with root package name */
    public a7.h f6025f;

    /* renamed from: g, reason: collision with root package name */
    public g f6026g = g.f5989e;

    /* renamed from: h, reason: collision with root package name */
    public final g6.i f6027h = g6.i.f3046d;
    public final /* synthetic */ s i;

    public r(s sVar, a7.h hVar) {
        this.i = sVar;
        this.f6023d = sVar;
        this.f6024e = hVar;
    }

    @Override // r2.c
    public final float E(long j7) {
        return this.f6023d.E(j7);
    }

    @Override // r2.c
    public final int H(float f6) {
        return this.f6023d.H(f6);
    }

    @Override // r2.c
    public final long O(long j7) {
        return this.f6023d.O(j7);
    }

    @Override // r2.c
    public final float R(long j7) {
        return this.f6023d.R(j7);
    }

    @Override // r2.c
    public final long V(float f6) {
        return this.f6023d.V(f6);
    }

    public final Object a(g gVar, i6.a aVar) {
        a7.h hVar = new a7.h(1, m.a.G(aVar));
        hVar.t();
        this.f6026g = gVar;
        this.f6025f = hVar;
        return hVar.s();
    }

    @Override // r2.c
    public final float a0(int i) {
        return this.f6023d.a0(i);
    }

    @Override // r2.c
    public final float b() {
        return this.f6023d.b();
    }

    @Override // r2.c
    public final float c0(float f6) {
        return f6 / this.f6023d.b();
    }

    public final u1 d() {
        s sVar = this.i;
        sVar.getClass();
        return w1.f.u(sVar).A;
    }

    @Override // g6.c
    public final g6.h f() {
        return this.f6027h;
    }

    @Override // r2.c
    public final float i() {
        return this.f6023d.i();
    }

    @Override // g6.c
    public final void k(Object obj) {
        s sVar = this.i;
        synchronized (sVar.f6034x) {
            sVar.f6033w.j(this);
        }
        this.f6024e.k(obj);
    }

    @Override // r2.c
    public final long s(float f6) {
        return this.f6023d.s(f6);
    }

    @Override // r2.c
    public final float u(float f6) {
        return this.f6023d.b() * f6;
    }
}
