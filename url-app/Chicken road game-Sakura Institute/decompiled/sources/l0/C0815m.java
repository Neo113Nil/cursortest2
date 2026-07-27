package l0;

import M2.E;
import kotlin.Unit;
import r0.AbstractC1065f;
import r0.InterfaceC1071l;
import r0.l0;
import r0.q0;
import s0.AbstractC1144g0;
import s0.C1123I;
import s0.C1161p;
import w.M;

/* renamed from: l0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815m extends S.n implements q0, l0, InterfaceC1071l {

    /* renamed from: t, reason: collision with root package name */
    public boolean f7916t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7917u;

    public final void B0() {
        C0803a c0803a = M.f11038b;
        E e4 = new E();
        AbstractC1065f.y(this, new C0814l(e4, 2));
        InterfaceC0818p interfaceC0818p = (InterfaceC0818p) AbstractC1065f.i(this, AbstractC1144g0.f10231s);
        if (interfaceC0818p != null) {
            C1123I.f10055a.a(((C1161p) interfaceC0818p).f10283a, c0803a);
        }
    }

    public final void C0() {
        M2.A a4 = new M2.A();
        a4.f3576d = true;
        if (!this.f7916t) {
            AbstractC1065f.z(this, new V.c(a4, 1));
        }
        if (a4.f3576d) {
            B0();
        }
    }

    public final void D0() {
        Unit unit;
        InterfaceC0818p interfaceC0818p;
        if (this.f7917u) {
            this.f7917u = false;
            if (this.f3990s) {
                E e4 = new E();
                AbstractC1065f.y(this, new C0814l(e4, 0));
                C0815m c0815m = (C0815m) e4.f3580d;
                if (c0815m != null) {
                    c0815m.B0();
                    unit = Unit.f7487a;
                } else {
                    unit = null;
                }
                if (unit != null || (interfaceC0818p = (InterfaceC0818p) AbstractC1065f.i(this, AbstractC1144g0.f10231s)) == null) {
                    return;
                }
                InterfaceC0817o.f7919a.getClass();
                C1123I.f10055a.a(((C1161p) interfaceC0818p).f10283a, AbstractC0819q.f7920a);
            }
        }
    }

    @Override // r0.l0
    public final void S() {
        D0();
    }

    @Override // r0.l0
    public final void Z(C0811i c0811i, EnumC0812j enumC0812j, long j4) {
        if (enumC0812j == EnumC0812j.f7911e) {
            if (AbstractC0819q.d(c0811i.f7909c, 4)) {
                this.f7917u = true;
                C0();
            } else if (AbstractC0819q.d(c0811i.f7909c, 5)) {
                D0();
            }
        }
    }

    @Override // r0.q0
    public final /* bridge */ /* synthetic */ Object u() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // S.n
    public final void u0() {
        D0();
    }
}
