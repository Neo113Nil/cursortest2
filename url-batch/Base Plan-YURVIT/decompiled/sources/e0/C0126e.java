package e0;

import N.P;
import P0.h;
import android.app.Activity;
import r0.InterfaceC0225a;
import s0.InterfaceC0227a;
import v0.InterfaceC0241f;

/* renamed from: e0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126e implements InterfaceC0225a, InterfaceC0227a {

    /* renamed from: e, reason: collision with root package name */
    public C0125d f1864e;

    @Override // s0.InterfaceC0227a
    public final void a() {
        C0125d c0125d = this.f1864e;
        if (c0125d == null) {
            return;
        }
        c0125d.h(null);
    }

    @Override // s0.InterfaceC0227a
    public final void b(C0125d c0125d) {
        h.e(c0125d, "binding");
        d(c0125d);
    }

    @Override // r0.InterfaceC0225a
    public final void c(P p2) {
        h.e(p2, "binding");
        this.f1864e = new C0125d(0);
        C0123b c0123b = InterfaceC0124c.f1857a;
        InterfaceC0241f interfaceC0241f = (InterfaceC0241f) p2.f699g;
        h.d(interfaceC0241f, "getBinaryMessenger(...)");
        C0123b.a(c0123b, interfaceC0241f, this.f1864e);
    }

    @Override // s0.InterfaceC0227a
    public final void d(C0125d c0125d) {
        h.e(c0125d, "binding");
        C0125d c0125d2 = this.f1864e;
        if (c0125d2 == null) {
            return;
        }
        c0125d2.h((Activity) c0125d.f1863g);
    }

    @Override // s0.InterfaceC0227a
    public final void e() {
        a();
    }

    @Override // r0.InterfaceC0225a
    public final void i(P p2) {
        h.e(p2, "binding");
        if (this.f1864e == null) {
            return;
        }
        C0123b c0123b = InterfaceC0124c.f1857a;
        InterfaceC0241f interfaceC0241f = (InterfaceC0241f) p2.f699g;
        h.d(interfaceC0241f, "getBinaryMessenger(...)");
        C0123b.a(c0123b, interfaceC0241f, null);
        this.f1864e = null;
    }
}
