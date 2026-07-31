package F;

import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import r0.InterfaceC0887I;

/* loaded from: classes.dex */
public final class N0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f1288g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1289h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1290i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1291j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f1292k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1293l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1294m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f1295n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1296o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1297p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f1298q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1299r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887I f1300s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(AbstractC0893O abstractC0893O, boolean z3, float f3, AbstractC0893O abstractC0893O2, int i3, float f4, float f5, AbstractC0893O abstractC0893O3, int i4, float f6, AbstractC0893O abstractC0893O4, int i5, float f7, int i6, InterfaceC0887I interfaceC0887I) {
        super(1);
        this.f1286e = abstractC0893O;
        this.f1287f = z3;
        this.f1288g = f3;
        this.f1289h = abstractC0893O2;
        this.f1290i = i3;
        this.f1291j = f4;
        this.f1292k = f5;
        this.f1293l = abstractC0893O3;
        this.f1294m = i4;
        this.f1295n = f6;
        this.f1296o = abstractC0893O4;
        this.f1297p = i5;
        this.f1298q = f7;
        this.f1299r = i6;
        this.f1300s = interfaceC0887I;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
        float f3 = this.f1295n;
        float f4 = this.f1292k;
        AbstractC0893O abstractC0893O = this.f1286e;
        if (abstractC0893O != null) {
            AbstractC0892N.f(abstractC0892N, abstractC0893O, (this.f1299r - abstractC0893O.f8126d) / 2, AbstractC0508a.Q((f3 - this.f1300s.l(O0.f1307e)) + f4));
        }
        if (this.f1287f || this.f1288g != 0.0f) {
            AbstractC0892N.f(abstractC0892N, this.f1289h, this.f1290i, AbstractC0508a.Q(this.f1291j + f4));
        }
        AbstractC0892N.f(abstractC0892N, this.f1293l, this.f1294m, AbstractC0508a.Q(f3 + f4));
        AbstractC0892N.f(abstractC0892N, this.f1296o, this.f1297p, AbstractC0508a.Q(this.f1298q + f4));
        return R1.y.f4171a;
    }
}
