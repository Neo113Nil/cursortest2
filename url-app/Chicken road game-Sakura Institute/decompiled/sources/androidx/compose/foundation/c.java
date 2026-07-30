package androidx.compose.foundation;

import m.x;
import p.j;
import r1.s0;
import s0.l;
import s0.n;
import s0.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c {
    static {
        new s0() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public final boolean equals(Object obj) {
                return this == obj;
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // r1.s0
            public final n l() {
                return new x();
            }

            @Override // r1.s0
            public final /* bridge */ /* synthetic */ void m(n nVar) {
            }
        };
    }

    public static final o a(o oVar, boolean z8, j jVar) {
        return oVar.j(z8 ? new FocusableElement(jVar) : l.f8103a);
    }
}
