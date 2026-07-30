package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.ranges.d;
import kotlin.time.a;
import kotlin.time.b;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ux2 {
    public static final Object a(long j, ed edVar, a10 a10Var) {
        long j2;
        Object gxVar;
        Object V;
        long j3 = j;
        a.C0002a c0002a = a.m;
        boolean z = j3 > 0;
        if (z) {
            se0 se0Var = se0.NANOSECONDS;
            long b = b.b(999999L, se0Var);
            if (a.b(j3)) {
                if (a.b(b) && (b ^ j3) < 0) {
                    lh.e("Summing infinite durations of different signs yields an undefined result.");
                    return null;
                }
            } else if (a.b(b)) {
                j3 = b;
            } else {
                int i = ((int) j3) & 1;
                if (i == (((int) b) & 1)) {
                    long j4 = (j3 >> 1) + (b >> 1);
                    if (i == 0) {
                        if (-4611686018426999999L > j4 || j4 >= 4611686018427000000L) {
                            j3 = b.a(j4 / 1000000);
                        } else {
                            j3 = j4 << 1;
                            int i2 = re0.a;
                        }
                    } else if (-4611686018426L > j4 || j4 >= 4611686018427L) {
                        j3 = b.a(d.d(j4, -4611686018427387903L, 4611686018427387903L));
                    } else {
                        j3 = (j4 * 1000000) << 1;
                        int i3 = re0.a;
                    }
                } else {
                    j3 = i == 1 ? a.a(j3 >> 1, b >> 1) : a.a(b >> 1, j3 >> 1);
                }
            }
            int i4 = ((int) j3) & 1;
            if (i4 != 1 || a.b(j3)) {
                se0 se0Var2 = se0.MILLISECONDS;
                if (j3 == a.n) {
                    j2 = Long.MAX_VALUE;
                } else if (j3 == a.o) {
                    j2 = Long.MIN_VALUE;
                } else {
                    long j5 = j3 >> 1;
                    if (i4 != 0) {
                        se0Var = se0Var2;
                    }
                    j2 = TimeUnit.MILLISECONDS.convert(j5, se0Var.m);
                }
            } else {
                j2 = j3 >> 1;
            }
        } else {
            if (z) {
                a.b();
                return null;
            }
            j2 = 0;
        }
        if (j2 <= 0) {
            throw new sx2("Timed out immediately", null);
        }
        tx2 tx2Var = new tx2(j2, a10Var);
        l41.K(tx2Var, true, new ic0(n90.b(tx2Var.r.getContext()).A(tx2Var.s, tx2Var, tx2Var.q)));
        try {
            if (edVar instanceof hn) {
                s03.f(2, edVar);
                gxVar = edVar.invoke(tx2Var, tx2Var);
            } else {
                gxVar = q41.c(edVar, tx2Var, tx2Var);
            }
        } catch (Throwable th) {
            gxVar = new gx(th, false);
        }
        Object obj = b50.m;
        if (gxVar != obj && (V = tx2Var.V(gxVar)) != j8.h) {
            if (V instanceof gx) {
                Throwable th2 = ((gx) V).a;
                if (!(th2 instanceof sx2)) {
                    throw th2;
                }
                if (((sx2) th2).m != tx2Var) {
                    throw th2;
                }
                if (gxVar instanceof gx) {
                    throw ((gx) gxVar).a;
                }
            } else {
                gxVar = j8.Y(V);
            }
            obj = gxVar;
        }
        b50 b50Var = b50.m;
        return obj;
    }
}
