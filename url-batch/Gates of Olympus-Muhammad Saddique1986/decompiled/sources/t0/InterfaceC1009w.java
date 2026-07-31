package t0;

import r0.C0913j;
import r0.C0918o;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;

/* renamed from: t0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1009w extends InterfaceC0999l {
    default int b(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return g(new C0918o(p3, p3.getLayoutDirection()), new C0913j(interfaceC0884F, 2, 1, 2), O2.d.b(0, i3, 7)).f();
    }

    default int c(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return g(new C0918o(p3, p3.getLayoutDirection()), new C0913j(interfaceC0884F, 1, 2, 2), O2.d.b(i3, 0, 13)).h();
    }

    default int e(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        int i4 = 1;
        return g(new C0918o(p3, p3.getLayoutDirection()), new C0913j(interfaceC0884F, i4, i4, 2), O2.d.b(0, i3, 7)).f();
    }

    default int f(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        int i4 = 2;
        return g(new C0918o(p3, p3.getLayoutDirection()), new C0913j(interfaceC0884F, i4, i4, 2), O2.d.b(i3, 0, 13)).h();
    }

    InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3);
}
