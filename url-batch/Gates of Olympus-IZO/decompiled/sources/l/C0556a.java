package l;

import H2.AbstractC0080b;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556a {

    /* renamed from: a, reason: collision with root package name */
    public final float f5451a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5452b;

    public C0556a(float f3, float f4) {
        this.f5451a = f3;
        this.f5452b = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0556a)) {
            return false;
        }
        C0556a c0556a = (C0556a) obj;
        return Float.compare(this.f5451a, c0556a.f5451a) == 0 && Float.compare(this.f5452b, c0556a.f5452b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5452b) + (Float.hashCode(this.f5451a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f5451a);
        sb.append(", velocityCoefficient=");
        return AbstractC0080b.j(sb, this.f5452b, ')');
    }
}
