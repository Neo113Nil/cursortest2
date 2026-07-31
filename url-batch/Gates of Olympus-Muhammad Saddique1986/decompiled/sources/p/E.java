package p;

import e2.InterfaceC0422a;
import m.C0637w;
import t0.AbstractC0993f;
import u0.AbstractC1101g0;

/* loaded from: classes.dex */
public final class E extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0776m0 f7504f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(C0776m0 c0776m0, int i3) {
        super(0);
        this.f7503e = i3;
        this.f7504f = c0776m0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r0 != false) goto L13;
     */
    @Override // e2.InterfaceC0422a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        boolean z3;
        boolean z4;
        switch (this.f7503e) {
            case 0:
                s2.g gVar = this.f7504f.f7730w;
                if (gVar != null) {
                    gVar.p(r.f7757a);
                }
                return R1.y.f4171a;
            case 1:
                C0793v0 c0793v0 = this.f7504f.f7720F;
                if (!c0793v0.f7778a.e()) {
                    n.l0 l0Var = c0793v0.f7779b;
                    z3 = false;
                    if (l0Var == null) {
                        z4 = false;
                        break;
                    } else {
                        z4 = l0Var.f();
                        break;
                    }
                }
                z3 = true;
                return Boolean.valueOf(!z3);
            default:
                I.X0 x02 = AbstractC1101g0.f9354f;
                C0776m0 c0776m0 = this.f7504f;
                c0776m0.f7719E.f7715a = new C0637w(new B.Y((O0.b) AbstractC0993f.i(c0776m0, x02)));
                return R1.y.f4171a;
        }
    }
}
