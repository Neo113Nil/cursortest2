package N0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final n f3554c = new n(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f3555a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3556b;

    public n(float f3, float f4) {
        this.f3555a = f3;
        this.f3556b = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f3555a == nVar.f3555a && this.f3556b == nVar.f3556b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3556b) + (Float.hashCode(this.f3555a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f3555a);
        sb.append(", skewX=");
        return A.k.i(sb, this.f3556b, ')');
    }
}
