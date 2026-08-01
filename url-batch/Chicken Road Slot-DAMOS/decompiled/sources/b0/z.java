package b0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z implements a2.g0, p0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f927a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.b f928b;

    public z(f fVar, d1.b bVar) {
        this.f927a = fVar;
        this.f928b = bVar;
    }

    @Override // a2.g0
    public final a2.h0 a(a2.i0 i0Var, List list, long j) {
        return i.f(this, x2.a.i(j), x2.a.j(j), x2.a.g(j), x2.a.h(j), i0Var.y(this.f927a.a()), i0Var, list, new a2.o0[list.size()], list.size());
    }

    @Override // b0.p0
    public final a2.h0 b(final a2.o0[] o0VarArr, final a2.i0 i0Var, final int[] iArr, int i3, final int i10) {
        return a2.i0.V(i0Var, i10, i3, new Function1() { // from class: b0.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                a2.n0 n0Var = (a2.n0) obj;
                a2.o0[] o0VarArr2 = o0VarArr;
                int length = o0VarArr2.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    a2.o0 o0Var = o0VarArr2[i11];
                    int i13 = i12 + 1;
                    o0Var.getClass();
                    o0Var.h();
                    x2.l layoutDirection = i0Var.getLayoutDirection();
                    d1.b bVar = this.f928b;
                    int i14 = o0Var.f131d;
                    bVar.getClass();
                    float f3 = (i10 - i14) / 2.0f;
                    x2.l lVar = x2.l.f10330d;
                    float f10 = bVar.f3294a;
                    if (layoutDirection != lVar) {
                        f10 *= -1;
                    }
                    n0Var.h(o0Var, Math.round((1 + f10) * f3), iArr[i12], 0.0f);
                    i11++;
                    i12 = i13;
                }
                return Unit.f5554a;
            }
        });
    }

    @Override // b0.p0
    public final int c(a2.o0 o0Var) {
        return o0Var.f132e;
    }

    @Override // b0.p0
    public final long d(int i3, int i10, int i11, boolean z10) {
        return !z10 ? x2.b.a(0, i11, i3, i10) : k7.e.q(0, i11, i3, i10);
    }

    @Override // b0.p0
    public final int e(a2.o0 o0Var) {
        return o0Var.f131d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.a(this.f927a, zVar.f927a) && this.f928b.equals(zVar.f928b);
    }

    @Override // b0.p0
    public final void f(int i3, a2.i0 i0Var, int[] iArr, int[] iArr2) {
        this.f927a.c(i3, i0Var, iArr, iArr2);
    }

    public final int hashCode() {
        return Float.hashCode(this.f928b.f3294a) + (this.f927a.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f927a + ", horizontalAlignment=" + this.f928b + ')';
    }
}
