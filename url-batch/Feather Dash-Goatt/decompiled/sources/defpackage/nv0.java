package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nv0 extends zv0 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public nv0(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv0)) {
            return false;
        }
        nv0 nv0Var = (nv0) obj;
        return Float.compare(this.c, nv0Var.c) == 0 && Float.compare(this.d, nv0Var.d) == 0 && Float.compare(this.e, nv0Var.e) == 0 && Float.compare(this.f, nv0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + qy0.b(this.e, qy0.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        return qy0.l(sb, this.f, ')');
    }
}
