package Z0;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f2999a;

    /* renamed from: b, reason: collision with root package name */
    public final t f3000b;

    public n(u uVar, t tVar) {
        this.f2999a = uVar;
        this.f3000b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f2999a;
            if (uVar != null ? uVar.equals(((n) vVar).f2999a) : ((n) vVar).f2999a == null) {
                t tVar = this.f3000b;
                if (tVar != null ? tVar.equals(((n) vVar).f3000b) : ((n) vVar).f3000b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f2999a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f3000b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f2999a + ", mobileSubtype=" + this.f3000b + "}";
    }
}
