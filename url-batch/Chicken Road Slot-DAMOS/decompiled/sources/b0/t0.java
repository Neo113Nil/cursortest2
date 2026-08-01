package b0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t0 implements a2.g0, p0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f902a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.c f903b;

    public t0(c cVar, d1.c cVar2) {
        this.f902a = cVar;
        this.f903b = cVar2;
    }

    @Override // a2.g0
    public final a2.h0 a(a2.i0 i0Var, List list, long j) {
        return i.f(this, x2.a.j(j), x2.a.i(j), x2.a.h(j), x2.a.g(j), i0Var.y(this.f902a.a()), i0Var, list, new a2.o0[list.size()], list.size());
    }

    @Override // b0.p0
    public final a2.h0 b(a2.o0[] o0VarArr, a2.i0 i0Var, int[] iArr, int i3, int i10) {
        return a2.i0.V(i0Var, i3, i10, new s0(o0VarArr, this, i10, iArr));
    }

    @Override // b0.p0
    public final int c(a2.o0 o0Var) {
        return o0Var.f131d;
    }

    @Override // b0.p0
    public final long d(int i3, int i10, int i11, boolean z10) {
        return !z10 ? x2.b.a(i3, i10, 0, i11) : k7.e.r(i3, i10, 0, i11);
    }

    @Override // b0.p0
    public final int e(a2.o0 o0Var) {
        return o0Var.f132e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.a(this.f902a, t0Var.f902a) && this.f903b.equals(t0Var.f903b);
    }

    @Override // b0.p0
    public final void f(int i3, a2.i0 i0Var, int[] iArr, int[] iArr2) {
        this.f902a.b(i0Var, i3, iArr, i0Var.getLayoutDirection(), iArr2);
    }

    public final int hashCode() {
        return Float.hashCode(this.f903b.f3295a) + (this.f902a.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f902a + ", verticalAlignment=" + this.f903b + ')';
    }
}
