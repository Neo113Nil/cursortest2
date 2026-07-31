package I;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f519a;

    public d(String str) {
        P0.h.e(str, "name");
        this.f519a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return P0.h.a(this.f519a, ((d) obj).f519a);
    }

    public final int hashCode() {
        return this.f519a.hashCode();
    }

    public final String toString() {
        return this.f519a;
    }
}
