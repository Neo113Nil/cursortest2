package a2;

import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La2/j0;", "Lc2/x0;", "La2/k0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class j0 extends c2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final a3.f f112a;

    public j0(a3.f fVar) {
        this.f112a = fVar;
    }

    @Override // c2.x0
    public final d1.k d() {
        k0 k0Var = new k0();
        k0Var.C = this.f112a;
        return k0Var;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        ((k0) kVar).C = this.f112a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return this.f112a == ((j0) obj).f112a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f112a.hashCode();
    }
}
