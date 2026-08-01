package b0;

import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb0/c0;", "Lc2/x0;", "Lb0/d0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class c0 extends c2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f810a;

    /* renamed from: b, reason: collision with root package name */
    public final float f811b;

    public c0(b0 b0Var, float f3) {
        this.f810a = b0Var;
        this.f811b = f3;
    }

    @Override // c2.x0
    public final d1.k d() {
        d0 d0Var = new d0();
        d0Var.C = this.f810a;
        d0Var.D = this.f811b;
        return d0Var;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        d0 d0Var = (d0) kVar;
        d0Var.C = this.f810a;
        d0Var.D = this.f811b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f810a == c0Var.f810a && this.f811b == c0Var.f811b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f811b) + (this.f810a.hashCode() * 31);
    }
}
