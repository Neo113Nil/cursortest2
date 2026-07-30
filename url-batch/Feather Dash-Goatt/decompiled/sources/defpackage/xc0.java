package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xc0 {
    public final int a;
    public final int b;
    public final boolean c;

    public xc0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc0)) {
            return false;
        }
        xc0 xc0Var = (xc0) obj;
        return this.a == xc0Var.a && this.b == xc0Var.b && this.c == xc0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qy0.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
    }
}
