package R3;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final V3.b f2622a;

    public a(V3.b bVar) {
        this.f2622a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f2622a.equals(((a) obj).f2622a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2622a.hashCode();
    }

    public final String toString() {
        return getClass().getSimpleName() + "{descriptor=" + this.f2622a + '}';
    }
}
