package D;

import u0.C0247g;

/* loaded from: classes.dex */
public final class A implements P0.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f57e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f58f;

    public /* synthetic */ A(int i2, Object obj) {
        this.f57e = i2;
        this.f58f = obj;
    }

    @Override // P0.e
    public final Object a(Object obj, w0.d dVar) {
        Object d2;
        switch (this.f57e) {
            case 0:
                S s2 = (S) this.f58f;
                boolean z2 = s2.f133l.x() instanceof d0;
                C0247g c0247g = C0247g.f3005a;
                return (z2 || (d2 = S.d(s2, true, dVar)) != x0.a.f3094e) ? c0247g : d2;
            case 1:
                ((F0.p) this.f58f).f324e = obj;
                throw new Q0.a(this);
            default:
                ((U.i) this.f58f).accept(obj);
                return C0247g.f3005a;
        }
    }
}
