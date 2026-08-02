package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldr {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;

    static {
        String a2 = ldc.a("kotlinx.coroutines.scheduler.default.name");
        if (a2 == null) {
            a2 = "DefaultDispatcher";
        }
        a = a2;
        b = jav.o("kotlinx.coroutines.scheduler.resolution.ns", 100000L, Long.MAX_VALUE);
        c = jav.n("kotlinx.coroutines.scheduler.core.pool.size", ksl.f(ldc.a, 2), Integer.MAX_VALUE);
        d = jav.n("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 2097150);
        e = TimeUnit.SECONDS.toNanos(jav.o("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, Long.MAX_VALUE));
    }
}
