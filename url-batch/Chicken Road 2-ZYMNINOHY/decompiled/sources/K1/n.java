package K1;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f1517a;

    /* renamed from: b, reason: collision with root package name */
    public final t f1518b;

    public n(u uVar, t tVar) {
        this.f1517a = uVar;
        this.f1518b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f1517a;
            if (uVar != null ? uVar.equals(((n) vVar).f1517a) : ((n) vVar).f1517a == null) {
                t tVar = this.f1518b;
                if (tVar != null ? tVar.equals(((n) vVar).f1518b) : ((n) vVar).f1518b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f1517a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f1518b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f1517a + ", mobileSubtype=" + this.f1518b + "}";
    }
}
