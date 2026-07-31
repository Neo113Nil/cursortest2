package c0;

/* renamed from: c0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373s {

    /* renamed from: a, reason: collision with root package name */
    public final float f5543a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5544b;

    public C0373s(float f3, float f4) {
        this.f5543a = f3;
        this.f5544b = f4;
    }

    public final float[] a() {
        float f3 = this.f5543a;
        float f4 = this.f5544b;
        return new float[]{f3 / f4, 1.0f, ((1.0f - f3) - f4) / f4};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0373s)) {
            return false;
        }
        C0373s c0373s = (C0373s) obj;
        return Float.compare(this.f5543a, c0373s.f5543a) == 0 && Float.compare(this.f5544b, c0373s.f5544b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5544b) + (Float.hashCode(this.f5543a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f5543a);
        sb.append(", y=");
        return A.k.i(sb, this.f5544b, ')');
    }
}
