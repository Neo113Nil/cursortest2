package V3;

/* loaded from: classes.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    public final double f2722a;

    public j(double d7) {
        this.f2722a = d7;
    }

    @Override // V3.g
    public final int a() {
        return 4;
    }

    @Override // V3.g
    public final String b() {
        return String.valueOf(this.f2722a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Double.valueOf(this.f2722a).equals(((g) obj).getValue());
    }

    @Override // V3.g
    public final Object getValue() {
        return Double.valueOf(this.f2722a);
    }

    public final int hashCode() {
        return Double.hashCode(this.f2722a);
    }

    public final String toString() {
        return "ValueDouble{" + String.valueOf(this.f2722a) + "}";
    }
}
