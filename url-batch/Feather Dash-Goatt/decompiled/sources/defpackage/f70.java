package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class f70 {
    public final e70 a;
    public final int b;

    public f70(e70 e70Var, int i) {
        this.a = e70Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f70)) {
            return false;
        }
        f70 f70Var = (f70) obj;
        return this.a.equals(f70Var.a) && this.b == f70Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return qy0.m(sb, this.b, ')');
    }
}
