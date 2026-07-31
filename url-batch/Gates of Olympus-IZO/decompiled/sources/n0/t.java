package n0;

import M1.B;
import k2.C0536h;

/* loaded from: classes.dex */
public final class t implements M0.b, P1.d {

    /* renamed from: d, reason: collision with root package name */
    public final C0536h f6254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f6255e;

    /* renamed from: f, reason: collision with root package name */
    public C0536h f6256f;

    /* renamed from: g, reason: collision with root package name */
    public h f6257g = h.f6217e;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v f6258h;

    public t(v vVar, C0536h c0536h) {
        this.f6258h = vVar;
        this.f6254d = c0536h;
        this.f6255e = vVar;
    }

    @Override // M0.b
    public final long C(long j3) {
        return this.f6255e.C(j3);
    }

    @Override // M0.b
    public final long D(float f3) {
        return this.f6255e.D(f3);
    }

    @Override // M0.b
    public final float F(float f3) {
        return this.f6255e.a() * f3;
    }

    @Override // M0.b
    public final float G(long j3) {
        return this.f6255e.G(j3);
    }

    @Override // M0.b
    public final long R(float f3) {
        return this.f6255e.R(f3);
    }

    @Override // M0.b
    public final float Z(int i3) {
        return this.f6255e.Z(i3);
    }

    @Override // M0.b
    public final float a() {
        return this.f6255e.a();
    }

    @Override // M0.b
    public final float a0(long j3) {
        return this.f6255e.a0(j3);
    }

    public final Object b(h hVar, R1.a aVar) {
        C0536h c0536h = new C0536h(1, B.G(aVar));
        c0536h.q();
        this.f6257g = hVar;
        this.f6256f = c0536h;
        Object p = c0536h.p();
        Q1.a aVar2 = Q1.a.f3113d;
        return p;
    }

    @Override // M0.b
    public final float c0(float f3) {
        return f3 / this.f6255e.a();
    }

    @Override // P1.d
    public final P1.i getContext() {
        return P1.j.f3073d;
    }

    @Override // M0.b
    public final int k(float f3) {
        return this.f6255e.k(f3);
    }

    @Override // M0.b
    public final float p() {
        return this.f6255e.p();
    }

    @Override // P1.d
    public final void resumeWith(Object obj) {
        v vVar = this.f6258h;
        synchronized (vVar.f6267w) {
            vVar.f6267w.n(this);
        }
        this.f6254d.resumeWith(obj);
    }
}
