package x;

import I.C0159l;
import I.C0167p;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import u.C1076c;

/* renamed from: x.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1202o extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f10187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0.K f10188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10189g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10190h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0 f10191i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I0.z f10192j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ B.r f10193k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U.q f10194l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U.q f10195m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U.q f10196n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ U.q f10197o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1076c f10198p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B.a0 f10199q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f10200r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f10201s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f10202t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ I0.t f10203u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ O0.b f10204v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1202o(Q q3, C0.K k3, int i3, int i4, n0 n0Var, I0.z zVar, B.r rVar, U.q qVar, U.q qVar2, U.q qVar3, U.q qVar4, C1076c c1076c, B.a0 a0Var, boolean z3, boolean z4, InterfaceC0424c interfaceC0424c, I0.t tVar, O0.b bVar) {
        super(2);
        this.f10187e = q3;
        this.f10188f = k3;
        this.f10189g = i3;
        this.f10190h = i4;
        this.f10191i = n0Var;
        this.f10192j = zVar;
        this.f10193k = rVar;
        this.f10194l = qVar;
        this.f10195m = qVar2;
        this.f10196n = qVar3;
        this.f10197o = qVar4;
        this.f10198p = c1076c;
        this.f10199q = a0Var;
        this.f10200r = z3;
        this.f10201s = z4;
        this.f10202t = interfaceC0424c;
        this.f10203u = tVar;
        this.f10204v = bVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        U.q r0Var;
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            U.n nVar = U.n.f4488a;
            Q q3 = this.f10187e;
            U.q f3 = androidx.compose.foundation.layout.c.f(nVar, ((O0.e) q3.f9981g.getValue()).f3731d, 0.0f, 2);
            int i3 = this.f10189g;
            int i4 = this.f10190h;
            C0.K k3 = this.f10188f;
            U.q b3 = U.a.b(f3, new G(i3, i4, k3));
            boolean h3 = c0167p.h(q3);
            Object G3 = c0167p.G();
            if (h3 || G3 == C0159l.f2829a) {
                G3 = new t0.D(12, q3);
                c0167p.a0(G3);
            }
            InterfaceC0422a interfaceC0422a = (InterfaceC0422a) G3;
            n0 n0Var = this.f10191i;
            p.P p3 = (p.P) n0Var.f10186e.getValue();
            I0.z zVar = this.f10192j;
            int i5 = C0.J.f568c;
            long j3 = zVar.f3098b;
            int i6 = (int) (j3 >> 32);
            long j4 = n0Var.f10185d;
            if (i6 == ((int) (j4 >> 32)) && (i6 = (int) (j3 & 4294967295L)) == ((int) (4294967295L & j4))) {
                i6 = C0.J.e(j3);
            }
            n0Var.f10185d = j3;
            I0.G l3 = N.l(this.f10193k, zVar.f3097a);
            int ordinal = p3.ordinal();
            if (ordinal == 0) {
                r0Var = new r0(n0Var, i6, l3, interfaceC0422a);
            } else {
                if (ordinal != 1) {
                    throw new C1.c();
                }
                r0Var = new H(n0Var, i6, l3, interfaceC0422a);
            }
            l0.c.f(androidx.compose.foundation.relocation.a.a(U.a.b(AbstractC0508a.v(b3).i(r0Var).i(this.f10194l).i(this.f10195m), new B.h0(8, k3)).i(this.f10196n).i(this.f10197o), this.f10198p), Q.f.b(-363167407, new C1201n(this.f10199q, q3, this.f10200r, this.f10201s, this.f10202t, zVar, this.f10203u, this.f10204v, this.f10190h), c0167p), c0167p, 48);
        }
        return R1.y.f4171a;
    }
}
