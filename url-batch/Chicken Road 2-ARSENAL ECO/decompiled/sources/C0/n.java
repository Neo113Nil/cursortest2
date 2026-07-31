package C0;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f179a;

    /* renamed from: b, reason: collision with root package name */
    public final t f180b;

    public n(u uVar, t tVar) {
        this.f179a = uVar;
        this.f180b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f179a;
            if (uVar != null ? uVar.equals(((n) vVar).f179a) : ((n) vVar).f179a == null) {
                t tVar = this.f180b;
                if (tVar != null ? tVar.equals(((n) vVar).f180b) : ((n) vVar).f180b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f179a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f180b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f179a + ", mobileSubtype=" + this.f180b + "}";
    }
}
