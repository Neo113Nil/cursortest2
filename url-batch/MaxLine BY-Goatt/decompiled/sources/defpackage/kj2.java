package defpackage;

import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kj2 implements pf0 {
    public final int a;
    public final int b;

    public kj2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.pf0
    public final void a(qf0 qf0Var) {
        boolean z = qf0Var.d != -1;
        sg sgVar = qf0Var.a;
        if (z) {
            qf0Var.d = -1;
            qf0Var.e = -1;
        }
        int c = d.c(this.a, 0, sgVar.c());
        int c2 = d.c(this.b, 0, sgVar.c());
        if (c != c2) {
            if (c < c2) {
                qf0Var.e(c, c2);
            } else {
                qf0Var.e(c2, c);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj2)) {
            return false;
        }
        kj2 kj2Var = (kj2) obj;
        return this.a == kj2Var.a && this.b == kj2Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return q40.o(sb, this.b, ')');
    }
}
