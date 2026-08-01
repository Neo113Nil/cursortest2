package b0;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb0/n0;", "Lc2/x0;", "Lb0/o0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class n0 extends c2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f868a;

    /* renamed from: b, reason: collision with root package name */
    public final float f869b;

    /* renamed from: c, reason: collision with root package name */
    public final float f870c;

    /* renamed from: d, reason: collision with root package name */
    public final float f871d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f872e;

    public n0(float f3, float f10, float f11, float f12, Function1 function1) {
        this.f868a = f3;
        this.f869b = f10;
        this.f870c = f11;
        this.f871d = f12;
        this.f872e = function1;
        boolean z10 = true;
        boolean z11 = (f3 >= 0.0f || Float.isNaN(f3)) & (f10 >= 0.0f || Float.isNaN(f10)) & (f11 >= 0.0f || Float.isNaN(f11));
        if (f12 < 0.0f && !Float.isNaN(f12)) {
            z10 = false;
        }
        if (!z11 || !z10) {
            c0.a.a("Padding must be non-negative");
        }
    }

    @Override // c2.x0
    public final d1.k d() {
        o0 o0Var = new o0();
        o0Var.C = this.f868a;
        o0Var.D = this.f869b;
        o0Var.E = this.f870c;
        o0Var.F = this.f871d;
        o0Var.G = true;
        return o0Var;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        o0 o0Var = (o0) kVar;
        o0Var.C = this.f868a;
        o0Var.D = this.f869b;
        o0Var.E = this.f870c;
        o0Var.F = this.f871d;
        o0Var.G = true;
    }

    public final boolean equals(Object obj) {
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        return n0Var != null && x2.f.b(this.f868a, n0Var.f868a) && x2.f.b(this.f869b, n0Var.f869b) && x2.f.b(this.f870c, n0Var.f870c) && x2.f.b(this.f871d, n0Var.f871d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + n0.l.b(this.f871d, n0.l.b(this.f870c, n0.l.b(this.f869b, Float.hashCode(this.f868a) * 31, 31), 31), 31);
    }
}
