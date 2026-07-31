package l;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575a {

    /* renamed from: a, reason: collision with root package name */
    public final float f6472a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6473b;

    public C0575a(float f3, float f4) {
        this.f6472a = f3;
        this.f6473b = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0575a)) {
            return false;
        }
        C0575a c0575a = (C0575a) obj;
        return Float.compare(this.f6472a, c0575a.f6472a) == 0 && Float.compare(this.f6473b, c0575a.f6473b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6473b) + (Float.hashCode(this.f6472a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f6472a);
        sb.append(", velocityCoefficient=");
        return A.k.i(sb, this.f6473b, ')');
    }
}
