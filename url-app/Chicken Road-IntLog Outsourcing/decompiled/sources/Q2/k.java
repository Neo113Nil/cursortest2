package Q2;

/* loaded from: classes.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long f2492a;

    public k(long j2) {
        this.f2492a = j2;
    }

    @Override // Q2.g
    public final String a() {
        return String.valueOf(this.f2492a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Long.valueOf(this.f2492a).equals(((g) obj).getValue());
    }

    @Override // Q2.g
    public final int getType() {
        return 3;
    }

    @Override // Q2.g
    public final Object getValue() {
        return Long.valueOf(this.f2492a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f2492a);
    }

    public final String toString() {
        return "ValueLong{" + String.valueOf(this.f2492a) + "}";
    }
}
