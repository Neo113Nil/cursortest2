package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class p41 {
    public float a;
    public boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p41)) {
            return false;
        }
        p41 p41Var = (p41) obj;
        return Float.compare(this.a, p41Var.a) == 0 && this.b == p41Var.b;
    }

    public final int hashCode() {
        return qy0.d(Float.hashCode(this.a) * 31, 961, this.b);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}
