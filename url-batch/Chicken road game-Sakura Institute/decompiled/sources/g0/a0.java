package g0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 implements p2 {
    @Override // g0.p2
    public final Object a(k1 k1Var) {
        n2 n2Var = AndroidCompositionLocals_androidKt.f739b;
        k1Var.getClass();
        if (((Context) d.K(k1Var, n2Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
            return o.g.f6620b;
        }
        o.d.f6587a.getClass();
        return o.c.f6572c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        Object obj2 = o.e.f6594h;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return o.e.f6594h.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + o.e.f6594h + ')';
    }
}
