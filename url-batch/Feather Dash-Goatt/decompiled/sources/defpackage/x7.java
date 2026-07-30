package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class x7 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public x7(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        p80.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        return Intrinsics.a(this.a, x7Var.a) && this.b == x7Var.b && this.c == x7Var.c && Intrinsics.a(this.d, x7Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + qy0.c(this.c, qy0.c(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }

    public x7(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
