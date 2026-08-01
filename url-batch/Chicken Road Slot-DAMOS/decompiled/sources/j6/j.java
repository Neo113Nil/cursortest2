package j6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f5080a;

    public j(h hVar) {
        this.f5080a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f5096d;
        if (obj2.equals(obj2)) {
            return this.f5080a.equals(((j) qVar).f5080a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.f5096d.hashCode() ^ 1000003) * 1000003) ^ this.f5080a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f5096d + ", androidClientInfo=" + this.f5080a + "}";
    }
}
