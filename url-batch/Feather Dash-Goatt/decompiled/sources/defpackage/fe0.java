package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fe0 {
    public final int a;
    public final int b;

    public fe0(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            r80.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        r80.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe0)) {
            return false;
        }
        fe0 fe0Var = (fe0) obj;
        return this.a == fe0Var.a && this.b == fe0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return qy0.m(sb, this.b, ')');
    }
}
