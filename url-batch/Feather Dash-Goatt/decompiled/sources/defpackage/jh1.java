package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jh1 {
    public final jc1 a;
    public final jc1 b;
    public final jc1 c;
    public final jc1 d;

    public jh1(jc1 jc1Var, jc1 jc1Var2, jc1 jc1Var3, jc1 jc1Var4) {
        this.a = jc1Var;
        this.b = jc1Var2;
        this.c = jc1Var3;
        this.d = jc1Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jh1)) {
            return false;
        }
        jh1 jh1Var = (jh1) obj;
        return Intrinsics.a(this.a, jh1Var.a) && Intrinsics.a(this.b, jh1Var.b) && Intrinsics.a(this.c, jh1Var.c) && Intrinsics.a(this.d, jh1Var.d);
    }

    public final int hashCode() {
        jc1 jc1Var = this.a;
        int hashCode = (jc1Var != null ? jc1Var.hashCode() : 0) * 31;
        jc1 jc1Var2 = this.b;
        int hashCode2 = (hashCode + (jc1Var2 != null ? jc1Var2.hashCode() : 0)) * 31;
        jc1 jc1Var3 = this.c;
        int hashCode3 = (hashCode2 + (jc1Var3 != null ? jc1Var3.hashCode() : 0)) * 31;
        jc1 jc1Var4 = this.d;
        return hashCode3 + (jc1Var4 != null ? jc1Var4.hashCode() : 0);
    }
}
