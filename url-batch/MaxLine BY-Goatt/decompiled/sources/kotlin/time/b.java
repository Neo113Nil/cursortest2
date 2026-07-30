package kotlin.time;

import defpackage.re0;
import defpackage.se0;
import java.util.concurrent.TimeUnit;
import kotlin.ranges.d;
import kotlin.time.a;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class b {
    public static final long a(long j) {
        long j2 = (j << 1) + 1;
        a.C0002a c0002a = a.m;
        int i = re0.a;
        return j2;
    }

    public static final long b(long j, se0 se0Var) {
        se0 se0Var2 = se0.NANOSECONDS;
        TimeUnit timeUnit = se0Var.m;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) > j || j > convert) {
            se0 se0Var3 = se0.NANOSECONDS;
            return a(d.d(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long convert2 = timeUnit2.convert(j, timeUnit) << 1;
        a.C0002a c0002a = a.m;
        int i = re0.a;
        return convert2;
    }
}
