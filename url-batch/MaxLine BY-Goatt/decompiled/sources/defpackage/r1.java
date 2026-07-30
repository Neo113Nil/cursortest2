package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r1 {
    public final String a;
    public final tt0 b;

    public r1(String str, tt0 tt0Var) {
        this.a = str;
        this.b = tt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return Intrinsics.b(this.a, r1Var.a) && Intrinsics.b(this.b, r1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        tt0 tt0Var = this.b;
        return hashCode + (tt0Var != null ? tt0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
