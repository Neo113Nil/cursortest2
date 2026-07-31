package t;

import o.N;
import s.C0873p;
import t0.D;

/* loaded from: classes.dex */
public final class w extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f7682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7683f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7684g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, int i3, int i4, P1.d dVar) {
        super(2, dVar);
        this.f7682e = yVar;
        this.f7683f = i3;
        this.f7684g = i4;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new w(this.f7682e, this.f7683f, this.f7684g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        w wVar = (w) create((N) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        wVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        y yVar = this.f7682e;
        C0873p c0873p = yVar.f7689b;
        int g3 = c0873p.f7452b.g();
        int i3 = this.f7683f;
        int i4 = this.f7684g;
        if (g3 != i3 || c0873p.f7453c.g() != i4) {
            yVar.f7698k.d();
        }
        c0873p.a(i3, i4);
        c0873p.f7455e = null;
        D d3 = yVar.f7695h;
        if (d3 != null) {
            d3.k();
        }
        return L1.z.f2729a;
    }
}
