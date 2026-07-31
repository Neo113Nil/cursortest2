package x;

import e2.InterfaceC0424c;
import l2.InterfaceC0604e;
import u0.C1109k0;

/* renamed from: x.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1209w extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I0.G f10277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I0.z f10278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f10279g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f10280h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I0.m f10281i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q f10282j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I0.t f10283k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B.a0 f10284l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z.p f10285m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209w(I0.G g3, I0.z zVar, boolean z3, boolean z4, I0.m mVar, Q q3, I0.t tVar, B.a0 a0Var, Z.p pVar) {
        super(1);
        this.f10277e = g3;
        this.f10278f = zVar;
        this.f10279g = z3;
        this.f10280h = z4;
        this.f10281i = mVar;
        this.f10282j = q3;
        this.f10283k = tVar;
        this.f10284l = a0Var;
        this.f10285m = pVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        Q q3;
        A0.i iVar = (A0.i) obj;
        I0.G g3 = this.f10277e;
        InterfaceC0604e[] interfaceC0604eArr = A0.u.f193a;
        A0.v vVar = A0.s.f189x;
        InterfaceC0604e[] interfaceC0604eArr2 = A0.u.f193a;
        InterfaceC0604e interfaceC0604e = interfaceC0604eArr2[16];
        vVar.a(iVar, g3.f3031a);
        I0.z zVar = this.f10278f;
        A0.v vVar2 = A0.s.f190y;
        InterfaceC0604e interfaceC0604e2 = interfaceC0604eArr2[17];
        long j3 = zVar.f3098b;
        vVar2.a(iVar, new C0.J(j3));
        R1.y yVar = R1.y.f4171a;
        boolean z3 = this.f10279g;
        if (!z3) {
            iVar.c(A0.s.f174i, yVar);
        }
        boolean z4 = this.f10280h;
        boolean z5 = z3 && !z4;
        A0.v vVar3 = A0.s.f164F;
        InterfaceC0604e interfaceC0604e3 = interfaceC0604eArr2[23];
        vVar3.a(iVar, Boolean.valueOf(z5));
        Q q4 = this.f10282j;
        A0.u.c(iVar, new C1204q(q4, 2));
        if (z5) {
            iVar.c(A0.h.f111i, new A0.a(null, new C1204q(q4, iVar)));
            q3 = q4;
            iVar.c(A0.h.f115m, new A0.a(null, new C1208v(this.f10280h, this.f10279g, q4, iVar, zVar)));
        } else {
            q3 = q4;
        }
        I0.t tVar = this.f10283k;
        B.a0 a0Var = this.f10284l;
        Q q5 = q3;
        iVar.c(A0.h.f110h, new A0.a(null, new o.h(tVar, this.f10279g, zVar, a0Var, q5)));
        I0.m mVar = this.f10281i;
        int i3 = mVar.f3076e;
        B.f0 f0Var = new B.f0(q5, 15, mVar);
        iVar.c(A0.s.f191z, new I0.l(i3));
        iVar.c(A0.h.f116n, new A0.a(null, f0Var));
        iVar.c(A0.h.f104b, new A0.a(null, new C1109k0(q5, this.f10285m, z4)));
        iVar.c(A0.h.f105c, new A0.a(null, new B.Z(a0Var, 5)));
        if (!C0.J.b(j3)) {
            iVar.c(A0.h.f117o, new A0.a(null, new B.Z(a0Var, 6)));
            if (z3 && !z4) {
                iVar.c(A0.h.f118p, new A0.a(null, new B.Z(a0Var, 7)));
            }
        }
        if (z3 && !z4) {
            iVar.c(A0.h.f119q, new A0.a(null, new B.Z(a0Var, 4)));
        }
        return yVar;
    }
}
