package x;

import I.C0143d;
import I.C0167p;
import I.InterfaceC0164n0;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import r0.InterfaceC0919p;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* renamed from: x.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1201n extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B.a0 f10172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q f10173f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f10174g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f10175h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f10176i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I0.z f10177j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I0.t f10178k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O0.b f10179l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10180m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1201n(B.a0 a0Var, Q q3, boolean z3, boolean z4, InterfaceC0424c interfaceC0424c, I0.z zVar, I0.t tVar, O0.b bVar, int i3) {
        super(2);
        this.f10172e = a0Var;
        this.f10173f = q3;
        this.f10174g = z3;
        this.f10175h = z4;
        this.f10176i = interfaceC0424c;
        this.f10177j = zVar;
        this.f10178k = tVar;
        this.f10179l = bVar;
        this.f10180m = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        if (r2 != false) goto L26;
     */
    @Override // e2.InterfaceC0426e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            I0.z zVar = this.f10177j;
            I0.t tVar = this.f10178k;
            Q q3 = this.f10173f;
            C1200m c1200m = new C1200m(q3, this.f10176i, zVar, tVar, this.f10179l, this.f10180m);
            U.n nVar = U.n.f4488a;
            int i3 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, nVar);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, c1200m);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i3))) {
                A.k.o(i3, c0167p, i3, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            boolean z3 = true;
            c0167p.p(true);
            F a3 = q3.a();
            F f3 = F.f9944d;
            boolean z4 = this.f10174g;
            if (a3 != f3 && q3.c() != null) {
                InterfaceC0919p c2 = q3.c();
                f2.j.c(c2);
                if (c2.o()) {
                }
            }
            z3 = false;
            B.a0 a0Var = this.f10172e;
            N.f(a0Var, z3, c0167p, 0);
            if (q3.a() == F.f9946f && !this.f10175h && z4) {
                c0167p.Q(-2032274);
                N.e(a0Var, c0167p, 0);
                c0167p.p(false);
            } else {
                c0167p.Q(-1955394);
                c0167p.p(false);
            }
        }
        return R1.y.f4171a;
    }
}
