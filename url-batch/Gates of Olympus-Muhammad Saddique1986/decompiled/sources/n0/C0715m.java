package n0;

import t0.AbstractC0993f;
import t0.InterfaceC0998k;
import t0.m0;
import t0.r0;
import u0.AbstractC1101g0;
import u0.C1118p;
import u0.J;
import x.N;

/* renamed from: n0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715m extends U.p implements r0, m0, InterfaceC0998k {

    /* renamed from: q, reason: collision with root package name */
    public boolean f7301q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7302r;

    public final void A0() {
        R1.y yVar;
        InterfaceC0718p interfaceC0718p;
        if (this.f7302r) {
            this.f7302r = false;
            if (this.f4501p) {
                f2.u uVar = new f2.u();
                AbstractC0993f.w(this, new C0714l(uVar, 0));
                C0715m c0715m = (C0715m) uVar.f5832d;
                if (c0715m != null) {
                    c0715m.y0();
                    yVar = R1.y.f4171a;
                } else {
                    yVar = null;
                }
                if (yVar != null || (interfaceC0718p = (InterfaceC0718p) AbstractC0993f.i(this, AbstractC1101g0.f9367s)) == null) {
                    return;
                }
                InterfaceC0717o.f7304a.getClass();
                J.f9201a.a(((C1118p) interfaceC0718p).f9417a, q.f7305a);
            }
        }
    }

    @Override // t0.m0
    public final void N() {
        A0();
    }

    @Override // t0.m0
    public final void g0(C0711i c0711i, EnumC0712j enumC0712j, long j3) {
        if (enumC0712j == EnumC0712j.f7296e) {
            if (q.d(c0711i.f7294c, 4)) {
                this.f7302r = true;
                z0();
            } else if (q.d(c0711i.f7294c, 5)) {
                A0();
            }
        }
    }

    @Override // U.p
    public final void r0() {
        A0();
    }

    @Override // t0.r0
    public final /* bridge */ /* synthetic */ Object w() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    public final void y0() {
        C0703a c0703a = N.f9959b;
        f2.u uVar = new f2.u();
        AbstractC0993f.w(this, new C0714l(uVar, 2));
        InterfaceC0718p interfaceC0718p = (InterfaceC0718p) AbstractC0993f.i(this, AbstractC1101g0.f9367s);
        if (interfaceC0718p != null) {
            J.f9201a.a(((C1118p) interfaceC0718p).f9417a, c0703a);
        }
    }

    public final void z0() {
        f2.q qVar = new f2.q();
        qVar.f5828d = true;
        if (!this.f7301q) {
            AbstractC0993f.x(this, new X.c(qVar));
        }
        if (qVar.f5828d) {
            y0();
        }
    }
}
