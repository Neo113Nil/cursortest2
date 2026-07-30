package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class by0 implements y81 {
    public final dv2 a;
    public final int b;
    public final xy2 c;
    public final Function0 d;

    public by0(dv2 dv2Var, int i, xy2 xy2Var, Function0 function0) {
        this.a = dv2Var;
        this.b = i;
        this.c = xy2Var;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by0)) {
            return false;
        }
        by0 by0Var = (by0) obj;
        return Intrinsics.b(this.a, by0Var.a) && this.b == by0Var.b && this.c.equals(by0Var.c) && Intrinsics.b(this.d, by0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + q40.e(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    @Override // defpackage.y81
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        long j2;
        pj1 G;
        if (jj1Var.Y(u10.g(j)) < u10.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = u10.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        n12 c = jj1Var.c(j);
        int min = Math.min(c.m, u10.h(j2));
        G = qj1Var.G(min, c.n, mi1.c(), new w5(qj1Var, this, c, min, 1));
        return G;
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
