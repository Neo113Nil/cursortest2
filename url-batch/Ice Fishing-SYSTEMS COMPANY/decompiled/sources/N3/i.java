package N3;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r f2175a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2176b;

    public i(r rVar, boolean z8) {
        this.f2175a = rVar;
        this.f2176b = z8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f2175a.equals(this.f2175a) && iVar.f2176b == this.f2176b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2175a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2176b).hashCode();
    }
}
