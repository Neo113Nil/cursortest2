package S1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r f2486a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2487b;

    public i(r rVar, boolean z7) {
        this.f2486a = rVar;
        this.f2487b = z7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f2486a.equals(this.f2486a) && iVar.f2487b == this.f2487b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2486a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2487b).hashCode();
    }
}
