package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mw implements ro1 {
    public final ro1 a;
    public final ro1 b;

    public mw(ro1 ro1Var, ro1 ro1Var2) {
        this.a = ro1Var;
        this.b = ro1Var2;
    }

    @Override // defpackage.ro1
    public final int a(nr nrVar) {
        int a = this.a.a(nrVar) - this.b.a(nrVar);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // defpackage.ro1
    public final int b(nr nrVar) {
        int b = this.a.b(nrVar) - this.b.b(nrVar);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // defpackage.ro1
    public final int c(nr nrVar, vc0 vc0Var) {
        int c = this.a.c(nrVar, vc0Var) - this.b.c(nrVar, vc0Var);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // defpackage.ro1
    public final int d(nr nrVar, vc0 vc0Var) {
        int d = this.a.d(nrVar, vc0Var) - this.b.d(nrVar, vc0Var);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw)) {
            return false;
        }
        mw mwVar = (mw) obj;
        return Intrinsics.a(mwVar.a, this.a) && Intrinsics.a(mwVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
