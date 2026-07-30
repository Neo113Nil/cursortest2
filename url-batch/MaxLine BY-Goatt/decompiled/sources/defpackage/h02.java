package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h02 extends l02 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public h02(float f, float f2, float f3, float f4) {
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
        if (!(obj instanceof h02)) {
            return false;
        }
        h02 h02Var = (h02) obj;
        return Float.compare(this.c, h02Var.c) == 0 && Float.compare(this.d, h02Var.d) == 0 && Float.compare(this.e, h02Var.e) == 0 && Float.compare(this.f, h02Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + q40.d(this.e, q40.d(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        return q40.n(sb, this.f, ')');
    }
}
