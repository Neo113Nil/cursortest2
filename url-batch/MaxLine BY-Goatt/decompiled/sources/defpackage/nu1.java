package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nu1 extends s03 {
    public final tm p;
    public final id1 q;

    public nu1(tm tmVar, id1 id1Var) {
        tmVar.getClass();
        this.p = tmVar;
        this.q = id1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu1)) {
            return false;
        }
        nu1 nu1Var = (nu1) obj;
        return Intrinsics.b(this.p, nu1Var.p) && Intrinsics.b(this.q, nu1Var.q);
    }

    public final int hashCode() {
        int hashCode = this.p.hashCode() * 31;
        id1 id1Var = this.q;
        return hashCode + (id1Var == null ? 0 : id1Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.p + ", owner=" + this.q + ')';
    }
}
