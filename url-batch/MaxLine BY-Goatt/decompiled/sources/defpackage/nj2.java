package defpackage;

import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nj2 implements pf0 {
    public final int a;
    public final int b;

    public nj2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.pf0
    public final void a(qf0 qf0Var) {
        int c = d.c(this.a, 0, qf0Var.a.c());
        int c2 = d.c(this.b, 0, qf0Var.a.c());
        if (c < c2) {
            qf0Var.f(c, c2);
        } else {
            qf0Var.f(c2, c);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj2)) {
            return false;
        }
        nj2 nj2Var = (nj2) obj;
        return this.a == nj2Var.a && this.b == nj2Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return q40.o(sb, this.b, ')');
    }
}
