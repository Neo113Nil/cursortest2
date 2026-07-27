package androidx.compose.foundation;

import S.l;
import S.n;
import S.o;
import m.F;
import p.C0935k;
import r0.T;

/* loaded from: classes.dex */
public abstract class c {
    static {
        new T() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public final boolean equals(Object obj) {
                return this == obj;
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // r0.T
            public final n l() {
                return new F();
            }

            @Override // r0.T
            public final /* bridge */ /* synthetic */ void m(n nVar) {
            }
        };
    }

    public static final o a(o oVar, boolean z4, C0935k c0935k) {
        return oVar.h(z4 ? new FocusableElement(c0935k) : l.f3977a);
    }
}
