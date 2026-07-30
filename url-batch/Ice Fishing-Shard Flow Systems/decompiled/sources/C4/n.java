package C4;

/* loaded from: classes.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final double f316a;

    public n(double d7) {
        this.f316a = d7;
    }

    @Override // C4.j
    public final String a() {
        return String.valueOf(this.f316a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Double.valueOf(this.f316a).equals(((j) obj).getValue());
    }

    @Override // C4.j
    public final int getType() {
        return 4;
    }

    @Override // C4.j
    public final Object getValue() {
        return Double.valueOf(this.f316a);
    }

    public final int hashCode() {
        return Double.hashCode(this.f316a);
    }

    public final String toString() {
        return "ValueDouble{" + String.valueOf(this.f316a) + "}";
    }
}
