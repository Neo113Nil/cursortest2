package d1;

import a2.f0;
import a2.h0;
import a2.i0;
import c2.o0;
import c2.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends k implements v {
    public float C;

    public final String toString() {
        return v4.a.l(new StringBuilder("ZIndexModifier(zIndex="), this.C, ')');
    }

    @Override // c2.v
    public final h0 v(o0 o0Var, f0 f0Var, long j) {
        a2.o0 c10 = f0Var.c(j);
        return i0.V(o0Var, c10.f131d, c10.f132e, new a3.d(1, c10, this));
    }
}
