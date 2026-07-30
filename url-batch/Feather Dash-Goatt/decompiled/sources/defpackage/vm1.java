package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vm1 {
    public final v7 a;
    public final pu b;

    public vm1(v7 v7Var, pu puVar) {
        this.a = v7Var;
        this.b = puVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm1)) {
            return false;
        }
        vm1 vm1Var = (vm1) obj;
        return Intrinsics.a(this.a, vm1Var.a) && Intrinsics.a(this.b, vm1Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
