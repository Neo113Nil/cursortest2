package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qz0 {
    public static final qz0 c = new qz0(0.0f, new nh(0.0f));
    public final float a;
    public final nh b;

    public qz0(float f, nh nhVar) {
        this.a = f;
        this.b = nhVar;
        if (Float.isNaN(f)) {
            dd0.e("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz0)) {
            return false;
        }
        qz0 qz0Var = (qz0) obj;
        return this.a == qz0Var.a && this.b.equals(qz0Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}
