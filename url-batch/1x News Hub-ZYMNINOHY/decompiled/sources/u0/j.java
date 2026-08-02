package u0;

/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f10503a;

    public j(h hVar) {
        this.f10503a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f10518a;
        ((j) qVar).getClass();
        return obj2.equals(obj2) && this.f10503a.equals(((j) qVar).f10503a);
    }

    public final int hashCode() {
        return ((p.f10518a.hashCode() ^ 1000003) * 1000003) ^ this.f10503a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f10518a + ", androidClientInfo=" + this.f10503a + "}";
    }
}
