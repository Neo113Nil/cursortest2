package l8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r f5918a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5919b;

    public i(r rVar, boolean z10) {
        this.f5918a = rVar;
        this.f5919b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f5918a.equals(this.f5918a) && iVar.f5919b == this.f5919b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5918a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f5919b).hashCode();
    }
}
