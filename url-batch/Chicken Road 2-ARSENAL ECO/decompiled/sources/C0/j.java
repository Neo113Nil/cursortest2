package C0;

/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f164a;

    public j(h hVar) {
        this.f164a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        ((j) qVar).getClass();
        Object obj2 = p.f181f;
        if (obj2.equals(obj2)) {
            return this.f164a.equals(((j) qVar).f164a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.f181f.hashCode() ^ 1000003) * 1000003) ^ this.f164a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f181f + ", androidClientInfo=" + this.f164a + "}";
    }
}
