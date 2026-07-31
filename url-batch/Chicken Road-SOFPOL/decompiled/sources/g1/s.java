package g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final float f2892a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2893b;

    public s(float f6, float f8) {
        this.f2892a = f6;
        this.f2893b = f8;
    }

    public final float[] a() {
        float f6 = this.f2892a;
        float f8 = this.f2893b;
        return new float[]{f6 / f8, 1.0f, ((1.0f - f6) - f8) / f8};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f2892a, sVar.f2892a) == 0 && Float.compare(this.f2893b, sVar.f2893b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2893b) + (Float.hashCode(this.f2892a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f2892a);
        sb.append(", y=");
        return a0.q.j(sb, this.f2893b, ')');
    }
}
