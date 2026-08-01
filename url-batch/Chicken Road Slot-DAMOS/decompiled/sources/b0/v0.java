package b0;

import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb0/v0;", "Lc2/x0;", "Lb0/x0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class v0 extends c2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f912a;

    /* renamed from: b, reason: collision with root package name */
    public final float f913b;

    /* renamed from: c, reason: collision with root package name */
    public final float f914c;

    /* renamed from: d, reason: collision with root package name */
    public final float f915d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f916e;

    public /* synthetic */ v0(float f3, float f10, float f11, float f12, int i3) {
        this((i3 & 1) != 0 ? Float.NaN : f3, (i3 & 2) != 0 ? Float.NaN : f10, (i3 & 4) != 0 ? Float.NaN : f11, (i3 & 8) != 0 ? Float.NaN : f12);
    }

    @Override // c2.x0
    public final d1.k d() {
        x0 x0Var = new x0();
        x0Var.C = this.f912a;
        x0Var.D = this.f913b;
        x0Var.E = this.f914c;
        x0Var.F = this.f915d;
        x0Var.G = this.f916e;
        return x0Var;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        x0 x0Var = (x0) kVar;
        x0Var.C = this.f912a;
        x0Var.D = this.f913b;
        x0Var.E = this.f914c;
        x0Var.F = this.f915d;
        x0Var.G = this.f916e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return x2.f.b(this.f912a, v0Var.f912a) && x2.f.b(this.f913b, v0Var.f913b) && x2.f.b(this.f914c, v0Var.f914c) && x2.f.b(this.f915d, v0Var.f915d) && this.f916e == v0Var.f916e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f916e) + n0.l.b(this.f915d, n0.l.b(this.f914c, n0.l.b(this.f913b, Float.hashCode(this.f912a) * 31, 31), 31), 31);
    }

    public v0(float f3, float f10, float f11, float f12) {
        this.f912a = f3;
        this.f913b = f10;
        this.f914c = f11;
        this.f915d = f12;
        this.f916e = true;
    }
}
