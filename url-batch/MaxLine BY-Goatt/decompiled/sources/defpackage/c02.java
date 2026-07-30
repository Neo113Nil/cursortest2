package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c02 extends l02 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public c02(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof c02)) {
            return false;
        }
        c02 c02Var = (c02) obj;
        return Float.compare(this.c, c02Var.c) == 0 && Float.compare(this.d, c02Var.d) == 0 && Float.compare(this.e, c02Var.e) == 0 && Float.compare(this.f, c02Var.f) == 0 && Float.compare(this.g, c02Var.g) == 0 && Float.compare(this.h, c02Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + q40.d(this.g, q40.d(this.f, q40.d(this.e, q40.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        sb.append(this.f);
        sb.append(", dx3=");
        sb.append(this.g);
        sb.append(", dy3=");
        return q40.n(sb, this.h, ')');
    }
}
