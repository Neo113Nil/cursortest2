package k;

import A.AbstractC0017m;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0735a {

    /* renamed from: a, reason: collision with root package name */
    public final float f7272a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7273b;

    public C0735a(float f4, float f5) {
        this.f7272a = f4;
        this.f7273b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0735a)) {
            return false;
        }
        C0735a c0735a = (C0735a) obj;
        return Float.compare(this.f7272a, c0735a.f7272a) == 0 && Float.compare(this.f7273b, c0735a.f7273b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7273b) + (Float.hashCode(this.f7272a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f7272a);
        sb.append(", velocityCoefficient=");
        return AbstractC0017m.k(sb, this.f7273b, ')');
    }
}
