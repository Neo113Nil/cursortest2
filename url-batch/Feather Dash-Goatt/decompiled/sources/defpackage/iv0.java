package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class iv0 extends zv0 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public iv0(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv0)) {
            return false;
        }
        iv0 iv0Var = (iv0) obj;
        return Float.compare(this.c, iv0Var.c) == 0 && Float.compare(this.d, iv0Var.d) == 0 && Float.compare(this.e, iv0Var.e) == 0 && Float.compare(this.f, iv0Var.f) == 0 && Float.compare(this.g, iv0Var.g) == 0 && Float.compare(this.h, iv0Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + qy0.b(this.g, qy0.b(this.f, qy0.b(this.e, qy0.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        sb.append(this.f);
        sb.append(", x3=");
        sb.append(this.g);
        sb.append(", y3=");
        return qy0.l(sb, this.h, ')');
    }
}
