package V3;

/* loaded from: classes.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long f2723a;

    public k(long j4) {
        this.f2723a = j4;
    }

    @Override // V3.g
    public final int a() {
        return 3;
    }

    @Override // V3.g
    public final String b() {
        return String.valueOf(this.f2723a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Long.valueOf(this.f2723a).equals(((g) obj).getValue());
    }

    @Override // V3.g
    public final Object getValue() {
        return Long.valueOf(this.f2723a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f2723a);
    }

    public final String toString() {
        return "ValueLong{" + String.valueOf(this.f2723a) + "}";
    }
}
