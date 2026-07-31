package I1;

/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f2464a;

    public d(int i3) {
        this.f2464a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f2464a == ((d) obj).f2464a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2464a);
    }

    public final String toString() {
        return "Flip(key=" + this.f2464a + ")";
    }
}
