package defpackage;

import kotlin.coroutines.h;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class uy1 {
    public static final ky1 a;
    public static final sy1 b;

    static {
        ah0 ah0Var = ah0.m;
        by1 by1Var = by1.A;
        wa1 wa1Var = new wa1(1);
        j8.b(h.m);
        a = new ky1(ah0Var, 0, 0, 0, 0, 0, by1Var, wa1Var);
        b = new sy1(0);
    }

    public static final long a(ky1 ky1Var, int i) {
        long j = (i * (ky1Var.c + ky1Var.b)) + (-ky1Var.f) + ky1Var.d;
        ww1 ww1Var = ky1Var.e;
        ww1 ww1Var2 = ww1.n;
        long f = ky1Var.f();
        int i2 = (int) (ww1Var == ww1Var2 ? f >> 32 : f & 4294967295L);
        ky1Var.m.getClass();
        long c = j - (i2 - d.c(0, 0, i2));
        if (c < 0) {
            return 0L;
        }
        return c;
    }
}
