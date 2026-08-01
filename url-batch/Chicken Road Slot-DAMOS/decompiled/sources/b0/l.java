package b0;

import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb0/l;", "Lc2/x0;", "Lb0/m;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class l extends c2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final d1.d f862a;

    public l(d1.d dVar) {
        this.f862a = dVar;
    }

    @Override // c2.x0
    public final d1.k d() {
        m mVar = new m();
        mVar.C = this.f862a;
        return mVar;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        ((m) kVar).C = this.f862a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        l lVar = obj instanceof l ? (l) obj : null;
        return lVar != null && this.f862a.equals(lVar.f862a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f862a.hashCode() * 31);
    }
}
