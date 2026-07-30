package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dc2 {
    public float a = 0.0f;
    public boolean b = true;
    public j50 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc2)) {
            return false;
        }
        dc2 dc2Var = (dc2) obj;
        return Float.compare(this.a, dc2Var.a) == 0 && this.b == dc2Var.b && Intrinsics.b(this.c, dc2Var.c);
    }

    public final int hashCode() {
        int i = in1.i(Float.hashCode(this.a) * 31, 31, this.b);
        j50 j50Var = this.c;
        return (i + (j50Var == null ? 0 : j50Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
