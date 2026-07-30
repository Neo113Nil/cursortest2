package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class b2 {
    public final d2 a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public b2(d2 d2Var, int i, boolean z, boolean z2) {
        d2Var.getClass();
        this.a = d2Var;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Intrinsics.a(this.a, b2Var.a) && this.b == b2Var.b && this.c == b2Var.c && this.d == b2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qy0.d(qy0.c(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Achievement(definition=" + this.a + ", progress=" + this.b + ", completed=" + this.c + ", claimed=" + this.d + ")";
    }
}
