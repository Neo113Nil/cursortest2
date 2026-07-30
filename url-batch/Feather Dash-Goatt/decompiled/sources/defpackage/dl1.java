package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class dl1 implements ro1 {
    public final ro1 a;
    public final ro1 b;

    public dl1(ro1 ro1Var, ro1 ro1Var2) {
        this.a = ro1Var;
        this.b = ro1Var2;
    }

    @Override // defpackage.ro1
    public final int a(nr nrVar) {
        return Math.max(this.a.a(nrVar), this.b.a(nrVar));
    }

    @Override // defpackage.ro1
    public final int b(nr nrVar) {
        return Math.max(this.a.b(nrVar), this.b.b(nrVar));
    }

    @Override // defpackage.ro1
    public final int c(nr nrVar, vc0 vc0Var) {
        return Math.max(this.a.c(nrVar, vc0Var), this.b.c(nrVar, vc0Var));
    }

    @Override // defpackage.ro1
    public final int d(nr nrVar, vc0 vc0Var) {
        return Math.max(this.a.d(nrVar, vc0Var), this.b.d(nrVar, vc0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl1)) {
            return false;
        }
        dl1 dl1Var = (dl1) obj;
        return Intrinsics.a(dl1Var.a, this.a) && Intrinsics.a(dl1Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
