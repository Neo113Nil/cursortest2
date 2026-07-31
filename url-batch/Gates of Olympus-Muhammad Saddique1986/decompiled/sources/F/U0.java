package F;

import I.C0167p;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;

/* loaded from: classes.dex */
public final class U0 extends f2.k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f1367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1369g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ B.r f1370h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q.k f1371i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1372j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1373k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1374l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1375m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1376n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1377o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1378p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1379q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s1 f1380r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b0.Q f1381s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(String str, boolean z3, boolean z4, B.r rVar, q.k kVar, boolean z5, InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, InterfaceC0426e interfaceC0426e4, InterfaceC0426e interfaceC0426e5, InterfaceC0426e interfaceC0426e6, InterfaceC0426e interfaceC0426e7, s1 s1Var, b0.Q q3) {
        super(3);
        this.f1367e = str;
        this.f1368f = z3;
        this.f1369g = z4;
        this.f1370h = rVar;
        this.f1371i = kVar;
        this.f1372j = z5;
        this.f1373k = interfaceC0426e;
        this.f1374l = interfaceC0426e2;
        this.f1375m = interfaceC0426e3;
        this.f1376n = interfaceC0426e4;
        this.f1377o = interfaceC0426e5;
        this.f1378p = interfaceC0426e6;
        this.f1379q = interfaceC0426e7;
        this.f1380r = s1Var;
        this.f1381s = q3;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        InterfaceC0426e interfaceC0426e = (InterfaceC0426e) obj;
        C0167p c0167p = (C0167p) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c0167p.h(interfaceC0426e) ? 4 : 2;
        }
        int i3 = intValue;
        if ((i3 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            S0 s02 = S0.f1353a;
            s1 s1Var = this.f1380r;
            b0.Q q3 = this.f1381s;
            boolean z3 = this.f1368f;
            boolean z4 = this.f1372j;
            q.k kVar = this.f1371i;
            s02.b((i3 << 3) & 112, 14155776, this.f1370h, s1Var, c0167p, interfaceC0426e, this.f1373k, this.f1374l, this.f1375m, this.f1376n, this.f1377o, this.f1378p, this.f1379q, Q.f.b(2108828640, new T0(z3, z4, kVar, s1Var, q3), c0167p), this.f1367e, kVar, null, z3, this.f1369g, z4);
        }
        return R1.y.f4171a;
    }
}
