package B;

import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class e0 extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o.n f388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f389g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(o.n nVar, a0 a0Var, int i3) {
        super(0);
        this.f387e = i3;
        this.f388f = nVar;
        this.f389g = a0Var;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f387e) {
            case 0:
                this.f389g.d();
                this.f388f.f7419a.setValue(o.k.f7417a);
                break;
            case 1:
                this.f389g.b(false);
                this.f388f.f7419a.setValue(o.k.f7417a);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f389g.l();
                this.f388f.f7419a.setValue(o.k.f7417a);
                break;
            default:
                this.f389g.m();
                this.f388f.f7419a.setValue(o.k.f7417a);
                break;
        }
        return R1.y.f4171a;
    }
}
