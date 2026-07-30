package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aj0 implements z63 {
    public final z63 a;
    public final z63 b;

    public aj0(z63 z63Var, z63 z63Var2) {
        this.a = z63Var;
        this.b = z63Var2;
    }

    @Override // defpackage.z63
    public final int a(ca0 ca0Var) {
        int a = this.a.a(ca0Var) - this.b.a(ca0Var);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // defpackage.z63
    public final int b(ca0 ca0Var) {
        int b = this.a.b(ca0Var) - this.b.b(ca0Var);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // defpackage.z63
    public final int c(ca0 ca0Var, u81 u81Var) {
        int c = this.a.c(ca0Var, u81Var) - this.b.c(ca0Var, u81Var);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // defpackage.z63
    public final int d(ca0 ca0Var, u81 u81Var) {
        int d = this.a.d(ca0Var, u81Var) - this.b.d(ca0Var, u81Var);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj0)) {
            return false;
        }
        aj0 aj0Var = (aj0) obj;
        return Intrinsics.b(aj0Var.a, this.a) && Intrinsics.b(aj0Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
