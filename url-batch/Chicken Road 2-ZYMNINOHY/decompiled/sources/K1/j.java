package K1;

/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f1502a;

    public j(h hVar) {
        this.f1502a = hVar;
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
        Object obj2 = p.f1519a;
        if (obj2.equals(obj2)) {
            return this.f1502a.equals(((j) qVar).f1502a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.f1519a.hashCode() ^ 1000003) * 1000003) ^ this.f1502a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f1519a + ", androidClientInfo=" + this.f1502a + "}";
    }
}
