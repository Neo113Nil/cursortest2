package l;

import g0.m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 implements m2 {

    /* renamed from: f, reason: collision with root package name */
    public Number f5473f;

    /* renamed from: g, reason: collision with root package name */
    public Number f5474g;

    /* renamed from: h, reason: collision with root package name */
    public final w1 f5475h;

    /* renamed from: i, reason: collision with root package name */
    public final g0.g1 f5476i;

    /* renamed from: j, reason: collision with root package name */
    public i1 f5477j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5478k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5479l;

    /* renamed from: m, reason: collision with root package name */
    public long f5480m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h0 f5481n;

    public f0(h0 h0Var, Number number, Number number2, w1 w1Var, e0 e0Var) {
        this.f5481n = h0Var;
        this.f5473f = number;
        this.f5474g = number2;
        this.f5475h = w1Var;
        this.f5476i = g0.d.J(number, g0.t0.f3903k);
        this.f5477j = new i1(e0Var, w1Var, this.f5473f, this.f5474g, null);
    }

    @Override // g0.m2
    public final Object getValue() {
        return this.f5476i.getValue();
    }
}
