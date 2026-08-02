package L;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f762a;

    public d(String str) {
        Q0.h.e(str, "name");
        this.f762a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return Q0.h.a(this.f762a, ((d) obj).f762a);
    }

    public final int hashCode() {
        return this.f762a.hashCode();
    }

    public final String toString() {
        return this.f762a;
    }
}
