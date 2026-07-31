package L0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final k f2687c = new k(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f2688a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2689b;

    public k(float f3, float f4) {
        this.f2688a = f3;
        this.f2689b = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f2688a == kVar.f2688a && this.f2689b == kVar.f2689b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2689b) + (Float.hashCode(this.f2688a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f2688a);
        sb.append(", skewX=");
        return AbstractC0080b.j(sb, this.f2689b, ')');
    }
}
