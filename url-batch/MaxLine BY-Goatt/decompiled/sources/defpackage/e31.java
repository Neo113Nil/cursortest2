package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e31 implements yx1 {
    public final z63 a;
    public final ca0 b;

    public e31(z63 z63Var, ca0 ca0Var) {
        this.a = z63Var;
        this.b = ca0Var;
    }

    @Override // defpackage.yx1
    public final float a(u81 u81Var) {
        z63 z63Var = this.a;
        ca0 ca0Var = this.b;
        return ca0Var.p0(z63Var.d(ca0Var, u81Var));
    }

    @Override // defpackage.yx1
    public final float b(u81 u81Var) {
        z63 z63Var = this.a;
        ca0 ca0Var = this.b;
        return ca0Var.p0(z63Var.c(ca0Var, u81Var));
    }

    @Override // defpackage.yx1
    public final float c() {
        z63 z63Var = this.a;
        ca0 ca0Var = this.b;
        return ca0Var.p0(z63Var.a(ca0Var));
    }

    @Override // defpackage.yx1
    public final float d() {
        z63 z63Var = this.a;
        ca0 ca0Var = this.b;
        return ca0Var.p0(z63Var.b(ca0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e31)) {
            return false;
        }
        e31 e31Var = (e31) obj;
        return Intrinsics.b(this.a, e31Var.a) && Intrinsics.b(this.b, e31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
