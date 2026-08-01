package b0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s implements a2.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final d1.d f893a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f894b;

    public s(d1.d dVar, boolean z10) {
        this.f893a = dVar;
        this.f894b = z10;
    }

    @Override // a2.g0
    public final a2.h0 a(final a2.i0 i0Var, final List list, long j) {
        if (list.isEmpty()) {
            return a2.i0.V(i0Var, x2.a.j(j), x2.a.i(j), new a1.f(4));
        }
        long j3 = this.f894b ? j : (-8589934589L) & j;
        if (list.size() == 1) {
            final a2.f0 f0Var = (a2.f0) list.get(0);
            f0Var.h();
            final a2.o0 c10 = f0Var.c(j3);
            final int max = Math.max(x2.a.j(j), c10.f131d);
            final int max2 = Math.max(x2.a.i(j), c10.f132e);
            return a2.i0.V(i0Var, max, max2, new Function1() { // from class: b0.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    p.b((a2.n0) obj, a2.o0.this, f0Var, i0Var.getLayoutDirection(), max, max2, this.f893a);
                    return Unit.f5554a;
                }
            });
        }
        final a2.o0[] o0VarArr = new a2.o0[list.size()];
        final wd.a0 a0Var = new wd.a0();
        a0Var.f10139d = x2.a.j(j);
        final wd.a0 a0Var2 = new wd.a0();
        a0Var2.f10139d = x2.a.i(j);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            a2.f0 f0Var2 = (a2.f0) list.get(i3);
            f0Var2.h();
            a2.o0 c11 = f0Var2.c(j3);
            o0VarArr[i3] = c11;
            a0Var.f10139d = Math.max(a0Var.f10139d, c11.f131d);
            a0Var2.f10139d = Math.max(a0Var2.f10139d, c11.f132e);
        }
        return a2.i0.V(i0Var, a0Var.f10139d, a0Var2.f10139d, new Function1() { // from class: b0.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                a2.n0 n0Var = (a2.n0) obj;
                a2.o0[] o0VarArr2 = o0VarArr;
                int length = o0VarArr2.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i10;
                    a2.o0 o0Var = o0VarArr2[i11];
                    o0Var.getClass();
                    p.b(n0Var, o0Var, (a2.f0) list.get(i12), i0Var.getLayoutDirection(), a0Var.f10139d, a0Var2.f10139d, this.f893a);
                    i11++;
                    i10 = i12 + 1;
                }
                return Unit.f5554a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.a(this.f893a, sVar.f893a) && this.f894b == sVar.f894b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f894b) + (this.f893a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f893a + ", propagateMinConstraints=" + this.f894b + ')';
    }
}
