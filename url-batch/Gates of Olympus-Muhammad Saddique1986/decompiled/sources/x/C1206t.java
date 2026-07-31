package x;

import I.C0156j0;
import a0.C0239d;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import r0.C0929z;
import r0.InterfaceC0919p;
import u0.U0;
import u0.V0;

/* renamed from: x.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1206t extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f10261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U0 f10263g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ B.a0 f10264h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I0.z f10265i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I0.t f10266j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1206t(Q q3, boolean z3, U0 u02, B.a0 a0Var, I0.z zVar, I0.t tVar) {
        super(1);
        this.f10261e = q3;
        this.f10262f = z3;
        this.f10263g = u02;
        this.f10264h = a0Var;
        this.f10265i = zVar;
        this.f10266j = tVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        I0.F f3;
        InterfaceC0919p interfaceC0919p;
        InterfaceC0919p interfaceC0919p2;
        InterfaceC0919p interfaceC0919p3 = (InterfaceC0919p) obj;
        Q q3 = this.f10261e;
        q3.f9982h = interfaceC0919p3;
        p0 d3 = q3.d();
        if (d3 != null) {
            d3.f10231b = interfaceC0919p3;
        }
        if (this.f10262f) {
            F a3 = q3.a();
            F f4 = F.f9945e;
            I0.z zVar = this.f10265i;
            B.a0 a0Var = this.f10264h;
            C0156j0 c0156j0 = q3.f9989o;
            if (a3 == f4) {
                if (((Boolean) q3.f9986l.getValue()).booleanValue() && ((V0) this.f10263g).a()) {
                    a0Var.o();
                } else {
                    a0Var.k();
                }
                q3.f9987m.setValue(Boolean.valueOf(O2.d.W(a0Var, true)));
                q3.f9988n.setValue(Boolean.valueOf(O2.d.W(a0Var, false)));
                c0156j0.setValue(Boolean.valueOf(C0.J.b(zVar.f3098b)));
            } else if (q3.a() == F.f9946f) {
                c0156j0.setValue(Boolean.valueOf(O2.d.W(a0Var, true)));
            }
            I0.t tVar = this.f10266j;
            N.q(q3, zVar, tVar);
            p0 d4 = q3.d();
            if (d4 != null && (f3 = q3.f9979e) != null && q3.b() && (interfaceC0919p = d4.f10231b) != null && interfaceC0919p.o() && (interfaceC0919p2 = d4.f10232c) != null) {
                C0929z c0929z = new C0929z(14, interfaceC0919p);
                C0239d a02 = AbstractC0508a.a0(interfaceC0919p);
                C0239d B3 = interfaceC0919p.B(interfaceC0919p2, false);
                if (f2.j.a((I0.F) f3.f3029a.f3006b.get(), f3)) {
                    f3.f3030b.g(zVar, tVar, d4.f10230a, c0929z, a02, B3);
                }
            }
        }
        return R1.y.f4171a;
    }
}
