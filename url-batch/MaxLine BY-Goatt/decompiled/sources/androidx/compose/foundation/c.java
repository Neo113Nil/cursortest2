package androidx.compose.foundation;

import defpackage.ap0;
import defpackage.bn1;
import defpackage.cm1;
import defpackage.sl1;
import defpackage.ul1;
import defpackage.vl1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class c {
    static {
        new cm1() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public final boolean equals(Object obj) {
                return this == obj;
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // defpackage.cm1
            public final ul1 i() {
                return new ap0();
            }

            @Override // defpackage.cm1
            public final /* bridge */ /* synthetic */ void m(ul1 ul1Var) {
            }
        };
    }

    public static final vl1 a(vl1 vl1Var, boolean z, bn1 bn1Var) {
        return vl1Var.k(z ? new FocusableElement(bn1Var) : sl1.a);
    }
}
