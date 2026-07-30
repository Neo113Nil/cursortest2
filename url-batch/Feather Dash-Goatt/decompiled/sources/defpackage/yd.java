package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yd implements vk0 {
    public final kd a;
    public final boolean b;

    public yd(kd kdVar, boolean z) {
        this.a = kdVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd)) {
            return false;
        }
        yd ydVar = (yd) obj;
        return this.a.equals(ydVar.a) && this.b == ydVar.b;
    }

    @Override // defpackage.vk0
    public final wk0 f(final ej0 ej0Var, final List list, long j) {
        int j2;
        int i;
        zw0 c;
        if (list.isEmpty()) {
            return xk0.q(ej0Var, mm.j(j), mm.i(j), new q1(3));
        }
        long j3 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final qk0 qk0Var = (qk0) list.get(0);
            Object h = qk0Var.h();
            sd sdVar = h instanceof sd ? (sd) h : null;
            if (sdVar != null ? sdVar.t : false) {
                j2 = mm.j(j);
                i = mm.i(j);
                int j4 = mm.j(j);
                int i2 = mm.i(j);
                if (!((i2 >= 0) & (j4 >= 0))) {
                    q80.a("width and height must be >= 0");
                }
                c = qk0Var.c(nm.g(j4, j4, i2, i2));
            } else {
                c = qk0Var.c(j3);
                j2 = Math.max(mm.j(j), c.d);
                i = Math.max(mm.i(j), c.e);
            }
            final int i3 = i;
            final int i4 = j2;
            final zw0 zw0Var = c;
            return xk0.q(ej0Var, i4, i3, new Function1() { // from class: wd
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    vd.b((yw0) obj, zw0.this, qk0Var, ej0Var.getLayoutDirection(), i4, i3, this.a);
                    return Unit.a;
                }
            });
        }
        final zw0[] zw0VarArr = new zw0[list.size()];
        final x11 x11Var = new x11();
        x11Var.d = mm.j(j);
        final x11 x11Var2 = new x11();
        x11Var2.d = mm.i(j);
        int size = list.size();
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            qk0 qk0Var2 = (qk0) list.get(i5);
            Object h2 = qk0Var2.h();
            sd sdVar2 = h2 instanceof sd ? (sd) h2 : null;
            if (sdVar2 != null ? sdVar2.t : false) {
                z = true;
            } else {
                zw0 c2 = qk0Var2.c(j3);
                zw0VarArr[i5] = c2;
                x11Var.d = Math.max(x11Var.d, c2.d);
                x11Var2.d = Math.max(x11Var2.d, c2.e);
            }
        }
        if (z) {
            int i6 = x11Var.d;
            int i7 = i6 != Integer.MAX_VALUE ? i6 : 0;
            int i8 = x11Var2.d;
            long a = nm.a(i7, i6, i8 != Integer.MAX_VALUE ? i8 : 0, i8);
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                qk0 qk0Var3 = (qk0) list.get(i9);
                Object h3 = qk0Var3.h();
                sd sdVar3 = h3 instanceof sd ? (sd) h3 : null;
                if (sdVar3 != null ? sdVar3.t : false) {
                    zw0VarArr[i9] = qk0Var3.c(a);
                }
            }
        }
        return xk0.q(ej0Var, x11Var.d, x11Var2.d, new Function1() { // from class: xd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                yw0 yw0Var = (yw0) obj;
                zw0[] zw0VarArr2 = zw0VarArr;
                int length = zw0VarArr2.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i10;
                    zw0 zw0Var2 = zw0VarArr2[i11];
                    zw0Var2.getClass();
                    vd.b(yw0Var, zw0Var2, (qk0) list.get(i12), ej0Var.getLayoutDirection(), x11Var.d, x11Var2.d, this.a);
                    i11++;
                    i10 = i12 + 1;
                }
                return Unit.a;
            }
        });
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
