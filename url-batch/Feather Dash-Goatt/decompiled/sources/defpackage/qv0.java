package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qv0 extends zv0 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public qv0(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof qv0)) {
            return false;
        }
        qv0 qv0Var = (qv0) obj;
        return Float.compare(this.c, qv0Var.c) == 0 && Float.compare(this.d, qv0Var.d) == 0 && Float.compare(this.e, qv0Var.e) == 0 && Float.compare(this.f, qv0Var.f) == 0 && Float.compare(this.g, qv0Var.g) == 0 && Float.compare(this.h, qv0Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + qy0.b(this.g, qy0.b(this.f, qy0.b(this.e, qy0.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
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
        return qy0.l(sb, this.h, ')');
    }
}
