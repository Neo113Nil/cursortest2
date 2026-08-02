package u0;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f10516a;

    /* renamed from: b, reason: collision with root package name */
    public final t f10517b;

    public n(u uVar, t tVar) {
        this.f10516a = uVar;
        this.f10517b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f10516a;
            if (uVar != null ? uVar.equals(((n) vVar).f10516a) : ((n) vVar).f10516a == null) {
                t tVar = this.f10517b;
                if (tVar != null ? tVar.equals(((n) vVar).f10517b) : ((n) vVar).f10517b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f10516a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f10517b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f10516a + ", mobileSubtype=" + this.f10517b + "}";
    }
}
