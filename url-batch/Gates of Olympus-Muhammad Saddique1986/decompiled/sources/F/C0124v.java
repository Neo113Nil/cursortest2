package F;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;

/* renamed from: F.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124v extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U.q f1825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q.a f1826f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0.K f1827g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1828h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0427f f1829i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1830j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r.X f1831k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y1 f1832l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1833m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0124v(U.q qVar, Q.a aVar, C0.K k3, InterfaceC0426e interfaceC0426e, InterfaceC0427f interfaceC0427f, float f3, r.X x3, y1 y1Var, int i3) {
        super(2);
        this.f1825e = qVar;
        this.f1826f = aVar;
        this.f1827g = k3;
        this.f1828h = interfaceC0426e;
        this.f1829i = interfaceC0427f;
        this.f1830j = f3;
        this.f1831k = x3;
        this.f1832l = y1Var;
        this.f1833m = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f1833m | 1);
        Q.a aVar = this.f1826f;
        r.X x3 = this.f1831k;
        y1 y1Var = this.f1832l;
        AbstractC0132z.b(this.f1825e, aVar, this.f1827g, this.f1828h, this.f1829i, this.f1830j, x3, y1Var, (C0167p) obj, U3);
        return R1.y.f4171a;
    }
}
