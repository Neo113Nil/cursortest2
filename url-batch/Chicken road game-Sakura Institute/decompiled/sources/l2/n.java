package l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final n f5883c = new n(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f5884a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5885b;

    public n(float f9, float f10) {
        this.f5884a = f9;
        this.f5885b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f5884a == nVar.f5884a && this.f5885b == nVar.f5885b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5885b) + (Float.hashCode(this.f5884a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f5884a);
        sb.append(", skewX=");
        return a0.m.k(sb, this.f5885b, ')');
    }
}
