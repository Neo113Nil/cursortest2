package c7;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: n, reason: collision with root package name */
    public final g7.b f5714n;

    public a(g7.b bVar) {
        this.f5714n = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f5714n.equals(((a) obj).f5714n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5714n.hashCode();
    }

    public final String toString() {
        return getClass().getSimpleName() + "{descriptor=" + this.f5714n + '}';
    }
}
