package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yi implements vk0, o41 {
    public final j9 a;
    public final id b;

    public yi(j9 j9Var, id idVar) {
        this.a = j9Var;
        this.b = idVar;
    }

    @Override // defpackage.o41
    public final void a(int i, int[] iArr, int[] iArr2, ej0 ej0Var) {
        this.a.l(ej0Var, i, iArr, iArr2);
    }

    @Override // defpackage.o41
    public final wk0 b(final zw0[] zw0VarArr, final ej0 ej0Var, final int[] iArr, int i, final int i2) {
        return xk0.q(ej0Var, i2, i, new Function1() { // from class: xi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                yw0 yw0Var = (yw0) obj;
                zw0[] zw0VarArr2 = zw0VarArr;
                int length = zw0VarArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    zw0 zw0Var = zw0VarArr2[i3];
                    zw0Var.getClass();
                    zw0Var.h();
                    yw0.h(yw0Var, zw0Var, this.b.a(zw0Var.d, i2, ej0Var.getLayoutDirection()), iArr[i4]);
                    i3++;
                    i4++;
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.o41
    public final long c(int i, int i2, int i3, boolean z) {
        return !z ? nm.a(0, i3, i, i2) : la0.D(0, i3, i, i2);
    }

    @Override // defpackage.o41
    public final int d(zw0 zw0Var) {
        return zw0Var.d;
    }

    @Override // defpackage.o41
    public final int e(zw0 zw0Var) {
        return zw0Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi)) {
            return false;
        }
        yi yiVar = (yi) obj;
        return this.a.equals(yiVar.a) && this.b.equals(yiVar.b);
    }

    @Override // defpackage.vk0
    public final wk0 f(ej0 ej0Var, List list, long j) {
        return gb0.E(this, mm.i(j), mm.j(j), mm.g(j), mm.h(j), ej0Var.H(this.a.a()), ej0Var, list, new zw0[list.size()], list.size());
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
