package b0;

import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb0/h;", "Lc2/x0;", "Lb0/k;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class h extends c2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f849a;

    public h(float f3) {
        this.f849a = f3;
        if (f3 > 0.0f) {
            return;
        }
        c0.a.a("aspectRatio " + f3 + " must be > 0");
    }

    @Override // c2.x0
    public final d1.k d() {
        k kVar = new k();
        kVar.C = this.f849a;
        return kVar;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        ((k) kVar).C = this.f849a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h hVar = obj instanceof h ? (h) obj : null;
        if (hVar == null || this.f849a != hVar.f849a) {
            return false;
        }
        ((h) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.f849a) * 31);
    }
}
