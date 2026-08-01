package a2;

import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La2/o;", "Lc2/x0;", "La2/p;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class o extends c2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final vd.n f130a;

    public o(vd.n nVar) {
        this.f130a = nVar;
    }

    @Override // c2.x0
    public final d1.k d() {
        p pVar = new p();
        pVar.C = this.f130a;
        return pVar;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        ((p) kVar).C = this.f130a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return this.f130a == ((o) obj).f130a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f130a.hashCode();
    }
}
