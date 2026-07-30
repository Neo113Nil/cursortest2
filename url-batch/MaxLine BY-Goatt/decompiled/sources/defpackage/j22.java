package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j22 {
    public final e22 a;
    public final a22 b;

    public j22(e22 e22Var, a22 a22Var) {
        this.a = e22Var;
        this.b = a22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j22)) {
            return false;
        }
        j22 j22Var = (j22) obj;
        return Intrinsics.b(this.b, j22Var.b) && Intrinsics.b(this.a, j22Var.a);
    }

    public final int hashCode() {
        e22 e22Var = this.a;
        int hashCode = (e22Var != null ? e22Var.hashCode() : 0) * 31;
        a22 a22Var = this.b;
        return hashCode + (a22Var != null ? a22Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}
