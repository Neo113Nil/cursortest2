package j6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f5094a;

    /* renamed from: b, reason: collision with root package name */
    public final t f5095b;

    public n(u uVar, t tVar) {
        this.f5094a = uVar;
        this.f5095b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f5094a;
            if (uVar != null ? uVar.equals(((n) vVar).f5094a) : ((n) vVar).f5094a == null) {
                t tVar = this.f5095b;
                if (tVar != null ? tVar.equals(((n) vVar).f5095b) : ((n) vVar).f5095b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f5094a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f5095b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f5094a + ", mobileSubtype=" + this.f5095b + "}";
    }
}
