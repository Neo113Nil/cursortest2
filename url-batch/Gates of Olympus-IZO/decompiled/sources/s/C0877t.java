package s;

import o.N;
import t0.D;

/* renamed from: s.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0877t extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0880w f7466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7467f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7468g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0877t(C0880w c0880w, int i3, int i4, P1.d dVar) {
        super(2, dVar);
        this.f7466e = c0880w;
        this.f7467f = i3;
        this.f7468g = i4;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0877t(this.f7466e, this.f7467f, this.f7468g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0877t c0877t = (C0877t) create((N) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        c0877t.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        C0880w c0880w = this.f7466e;
        C0873p c0873p = c0880w.f7477d;
        int g3 = c0873p.f7452b.g();
        int i3 = this.f7467f;
        int i4 = this.f7468g;
        if (g3 != i3 || c0873p.f7453c.g() != i4) {
            c0880w.f7486m.d();
        }
        c0873p.a(i3, i4);
        c0873p.f7455e = null;
        D d3 = c0880w.f7483j;
        if (d3 != null) {
            d3.k();
        }
        return L1.z.f2729a;
    }
}
