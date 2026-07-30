package e5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final t f2783a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2784b;

    public k(t tVar, boolean z8) {
        this.f2783a = tVar;
        this.f2784b = z8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.f2783a.equals(this.f2783a) && kVar.f2784b == this.f2784b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2783a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2784b).hashCode();
    }
}
