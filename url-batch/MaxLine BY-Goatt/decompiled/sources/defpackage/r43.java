package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r43 implements y81 {
    public final dv2 a;
    public final int b;
    public final xy2 c;
    public final Function0 d;

    public r43(dv2 dv2Var, int i, xy2 xy2Var, Function0 function0) {
        this.a = dv2Var;
        this.b = i;
        this.c = xy2Var;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r43)) {
            return false;
        }
        r43 r43Var = (r43) obj;
        return Intrinsics.b(this.a, r43Var.a) && this.b == r43Var.b && this.c.equals(r43Var.c) && Intrinsics.b(this.d, r43Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + q40.e(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    @Override // defpackage.y81
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        n12 c = jj1Var.c(u10.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(c.n, u10.g(j));
        G = qj1Var.G(c.m, min, mi1.c(), new w5(qj1Var, this, c, min, 3));
        return G;
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
