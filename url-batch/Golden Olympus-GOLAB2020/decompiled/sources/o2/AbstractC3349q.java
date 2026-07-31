package o2;

import t2.C3440k;

/* renamed from: o2.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3349q {
    public static final void a(InterfaceC3343n interfaceC3343n, InterfaceC3320b0 interfaceC3320b0) {
        c(interfaceC3343n, new C3322c0(interfaceC3320b0));
    }

    public static final C3345o b(kotlin.coroutines.d dVar) {
        if (!(dVar instanceof C3440k)) {
            return new C3345o(dVar, 1);
        }
        C3345o m4 = ((C3440k) dVar).m();
        if (m4 != null) {
            if (!m4.N()) {
                m4 = null;
            }
            if (m4 != null) {
                return m4;
            }
        }
        return new C3345o(dVar, 2);
    }

    public static final void c(InterfaceC3343n interfaceC3343n, InterfaceC3341m interfaceC3341m) {
        if (!(interfaceC3343n instanceof C3345o)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C3345o) interfaceC3343n).H(interfaceC3341m);
    }
}
