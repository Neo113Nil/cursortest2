package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c23 implements z63 {
    public final z63 a;
    public final z63 b;

    public c23(z63 z63Var, z63 z63Var2) {
        this.a = z63Var;
        this.b = z63Var2;
    }

    @Override // defpackage.z63
    public final int a(ca0 ca0Var) {
        return Math.max(this.a.a(ca0Var), this.b.a(ca0Var));
    }

    @Override // defpackage.z63
    public final int b(ca0 ca0Var) {
        return Math.max(this.a.b(ca0Var), this.b.b(ca0Var));
    }

    @Override // defpackage.z63
    public final int c(ca0 ca0Var, u81 u81Var) {
        return Math.max(this.a.c(ca0Var, u81Var), this.b.c(ca0Var, u81Var));
    }

    @Override // defpackage.z63
    public final int d(ca0 ca0Var, u81 u81Var) {
        return Math.max(this.a.d(ca0Var, u81Var), this.b.d(ca0Var, u81Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c23)) {
            return false;
        }
        c23 c23Var = (c23) obj;
        return Intrinsics.b(c23Var.a, this.a) && Intrinsics.b(c23Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
