package C4;

/* loaded from: classes.dex */
public final class o implements j {

    /* renamed from: a, reason: collision with root package name */
    public final long f317a;

    public o(long j) {
        this.f317a = j;
    }

    @Override // C4.j
    public final String a() {
        return String.valueOf(this.f317a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Long.valueOf(this.f317a).equals(((j) obj).getValue());
    }

    @Override // C4.j
    public final int getType() {
        return 3;
    }

    @Override // C4.j
    public final Object getValue() {
        return Long.valueOf(this.f317a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f317a);
    }

    public final String toString() {
        return "ValueLong{" + String.valueOf(this.f317a) + "}";
    }
}
