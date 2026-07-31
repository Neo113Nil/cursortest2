package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.wf;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xf {
    public static final xf a = new xf();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[wf.b.values().length];
            try {
                iArr[wf.b.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wf.b.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wf.b.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final r6 b(wf wfVar, g6 densityProvider, int i, int i2) {
        Intrinsics.checkNotNullParameter(wfVar, "<this>");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        int i3 = a.a[wfVar.h().ordinal()];
        if (i3 == 1) {
            return a(wfVar, i, i2);
        }
        if (i3 == 2) {
            return a(wfVar, densityProvider, i, i2);
        }
        if (i3 == 3) {
            return c(wfVar, densityProvider, i, i2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final r6 a(wf wfVar, g6 g6Var, int i, int i2) {
        Pair pair;
        Integer p = wfVar.p();
        int a2 = p != null ? g6Var.a(p.intValue()) : i;
        Integer i3 = wfVar.i();
        int a3 = i3 != null ? g6Var.a(i3.intValue()) : i2;
        if (a3 != 0 && a2 != 0) {
            float f = a2 / a3;
            float f2 = i;
            float f3 = i2;
            if (f > f2 / f3) {
                pair = TuplesKt.to(Integer.valueOf(i), Integer.valueOf((int) (f2 / f)));
            } else {
                pair = TuplesKt.to(Integer.valueOf((int) (f3 * f)), Integer.valueOf(i2));
            }
            return new r6(((Number) pair.component1()).intValue(), ((Number) pair.component2()).intValue());
        }
        return a(wfVar, i, i2);
    }

    public final r6 a(wf wfVar, int i, int i2) {
        return new r6(i, i2);
    }

    public final r6 c(wf wfVar, g6 g6Var, int i, int i2) {
        Integer p = wfVar.p();
        if (p != null) {
            i = g6Var.a(p.intValue());
        }
        Integer i3 = wfVar.i();
        if (i3 != null) {
            i2 = g6Var.a(i3.intValue());
        }
        return new r6(i, i2);
    }
}
