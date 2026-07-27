package a0;

import A.AbstractC0017m;

/* renamed from: a0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364s {

    /* renamed from: a, reason: collision with root package name */
    public final float f4830a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4831b;

    public C0364s(float f4, float f5) {
        this.f4830a = f4;
        this.f4831b = f5;
    }

    public final float[] a() {
        float f4 = this.f4830a;
        float f5 = this.f4831b;
        return new float[]{f4 / f5, 1.0f, ((1.0f - f4) - f5) / f5};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0364s)) {
            return false;
        }
        C0364s c0364s = (C0364s) obj;
        return Float.compare(this.f4830a, c0364s.f4830a) == 0 && Float.compare(this.f4831b, c0364s.f4831b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4831b) + (Float.hashCode(this.f4830a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f4830a);
        sb.append(", y=");
        return AbstractC0017m.k(sb, this.f4831b, ')');
    }
}
