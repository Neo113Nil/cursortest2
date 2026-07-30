package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class id {
    public final float a;

    public id(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, vc0 vc0Var) {
        float f = (i2 - i) / 2.0f;
        vc0 vc0Var2 = vc0.d;
        float f2 = this.a;
        if (vc0Var != vc0Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id) && Float.compare(this.a, ((id) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return qy0.l(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
