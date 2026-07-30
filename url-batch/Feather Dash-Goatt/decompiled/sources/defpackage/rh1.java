package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rh1 {
    public final String a;
    public String b;
    public boolean c = false;
    public tu0 d = null;

    public rh1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh1)) {
            return false;
        }
        rh1 rh1Var = (rh1) obj;
        return Intrinsics.a(this.a, rh1Var.a) && Intrinsics.a(this.b, rh1Var.b) && this.c == rh1Var.c && Intrinsics.a(this.d, rh1Var.d);
    }

    public final int hashCode() {
        int d = qy0.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        tu0 tu0Var = this.d;
        return d + (tu0Var == null ? 0 : tu0Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ')';
    }
}
