package androidx.compose.foundation;

import U.n;
import U.p;
import U.q;
import n.C0665H;
import q.k;
import t0.U;

/* loaded from: classes.dex */
public abstract class c {
    static {
        new U() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public final boolean equals(Object obj) {
                return this == obj;
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // t0.U
            public final p l() {
                return new C0665H();
            }

            @Override // t0.U
            public final /* bridge */ /* synthetic */ void m(p pVar) {
            }
        };
    }

    public static final q a(q qVar, boolean z3, k kVar) {
        return qVar.i(z3 ? new FocusableElement(kVar) : n.f4488a);
    }
}
