package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sz1 extends l02 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public sz1(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
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
        if (!(obj instanceof sz1)) {
            return false;
        }
        sz1 sz1Var = (sz1) obj;
        return Float.compare(this.c, sz1Var.c) == 0 && Float.compare(this.d, sz1Var.d) == 0 && Float.compare(this.e, sz1Var.e) == 0 && this.f == sz1Var.f && this.g == sz1Var.g && Float.compare(this.h, sz1Var.h) == 0 && Float.compare(this.i, sz1Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + q40.d(this.h, in1.i(in1.i(q40.d(this.e, q40.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
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
        return q40.n(sb, this.i, ')');
    }
}
