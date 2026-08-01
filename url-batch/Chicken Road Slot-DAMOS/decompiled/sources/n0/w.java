package n0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w implements p2 {
    @Override // n0.p2
    public final Object a(x0.h hVar) {
        v vVar = AndroidCompositionLocals_androidKt.f464a;
        hVar.getClass();
        h.s(hVar, vVar);
        return ((Context) h.s(hVar, AndroidCompositionLocals_androidKt.f465b)).getResources();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        Object obj2 = d2.r.f3517r;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return d2.r.f3517r.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + d2.r.f3517r + ')';
    }
}
