package D5;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final H5.b f357a;

    public a(H5.b bVar) {
        this.f357a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f357a.equals(((a) obj).f357a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f357a.hashCode();
    }

    public final String toString() {
        return getClass().getSimpleName() + "{descriptor=" + this.f357a + '}';
    }
}
