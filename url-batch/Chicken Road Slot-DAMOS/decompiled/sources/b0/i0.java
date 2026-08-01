package b0;

import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb0/i0;", "Lc2/x0;", "Lb0/j0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i0 extends c2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f856a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f857b;

    public i0(float f3, boolean z10) {
        this.f856a = f3;
        this.f857b = z10;
    }

    @Override // c2.x0
    public final d1.k d() {
        j0 j0Var = new j0();
        j0Var.C = this.f856a;
        j0Var.D = this.f857b;
        return j0Var;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        j0 j0Var = (j0) kVar;
        j0Var.C = this.f856a;
        j0Var.D = this.f857b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i0 i0Var = obj instanceof i0 ? (i0) obj : null;
        return i0Var != null && this.f856a == i0Var.f856a && this.f857b == i0Var.f857b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f857b) + (Float.hashCode(this.f856a) * 31);
    }
}
