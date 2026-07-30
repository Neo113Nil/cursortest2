package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uz1 extends l02 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public uz1(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof uz1)) {
            return false;
        }
        uz1 uz1Var = (uz1) obj;
        return Float.compare(this.c, uz1Var.c) == 0 && Float.compare(this.d, uz1Var.d) == 0 && Float.compare(this.e, uz1Var.e) == 0 && Float.compare(this.f, uz1Var.f) == 0 && Float.compare(this.g, uz1Var.g) == 0 && Float.compare(this.h, uz1Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + q40.d(this.g, q40.d(this.f, q40.d(this.e, q40.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
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
        return q40.n(sb, this.h, ')');
    }
}
