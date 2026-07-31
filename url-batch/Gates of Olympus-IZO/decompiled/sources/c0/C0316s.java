package c0;

import H2.AbstractC0080b;

/* renamed from: c0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316s {

    /* renamed from: a, reason: collision with root package name */
    public final float f4416a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4417b;

    public C0316s(float f3, float f4) {
        this.f4416a = f3;
        this.f4417b = f4;
    }

    public final float[] a() {
        float f3 = this.f4416a;
        float f4 = this.f4417b;
        return new float[]{f3 / f4, 1.0f, ((1.0f - f3) - f4) / f4};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0316s)) {
            return false;
        }
        C0316s c0316s = (C0316s) obj;
        return Float.compare(this.f4416a, c0316s.f4416a) == 0 && Float.compare(this.f4417b, c0316s.f4417b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4417b) + (Float.hashCode(this.f4416a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f4416a);
        sb.append(", y=");
        return AbstractC0080b.j(sb, this.f4417b, ')');
    }
}
