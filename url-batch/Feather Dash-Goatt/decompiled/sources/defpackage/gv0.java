package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gv0 extends zv0 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public gv0(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv0)) {
            return false;
        }
        gv0 gv0Var = (gv0) obj;
        return Float.compare(this.c, gv0Var.c) == 0 && Float.compare(this.d, gv0Var.d) == 0 && Float.compare(this.e, gv0Var.e) == 0 && this.f == gv0Var.f && this.g == gv0Var.g && Float.compare(this.h, gv0Var.h) == 0 && Float.compare(this.i, gv0Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + qy0.b(this.h, qy0.d(qy0.d(qy0.b(this.e, qy0.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartX=");
        sb.append(this.h);
        sb.append(", arcStartY=");
        return qy0.l(sb, this.i, ')');
    }
}
