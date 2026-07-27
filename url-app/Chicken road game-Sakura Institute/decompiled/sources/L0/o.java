package L0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final o f3518c = new o(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f3519a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3520b;

    public o(float f4, float f5) {
        this.f3519a = f4;
        this.f3520b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f3519a == oVar.f3519a && this.f3520b == oVar.f3520b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3520b) + (Float.hashCode(this.f3519a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f3519a);
        sb.append(", skewX=");
        return AbstractC0017m.k(sb, this.f3520b, ')');
    }
}
