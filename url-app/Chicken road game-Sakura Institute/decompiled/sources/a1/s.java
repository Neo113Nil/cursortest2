package a1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final float f287a;

    /* renamed from: b, reason: collision with root package name */
    public final float f288b;

    public s(float f9, float f10) {
        this.f287a = f9;
        this.f288b = f10;
    }

    public final float[] a() {
        float f9 = this.f287a;
        float f10 = this.f288b;
        return new float[]{f9 / f10, 1.0f, ((1.0f - f9) - f10) / f10};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f287a, sVar.f287a) == 0 && Float.compare(this.f288b, sVar.f288b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f288b) + (Float.hashCode(this.f287a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f287a);
        sb.append(", y=");
        return a0.m.k(sb, this.f288b, ')');
    }
}
