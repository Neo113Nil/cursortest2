package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class m80 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final ej f;

    static {
        String str;
        int i = f80.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = kr.e0("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = f80.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = kr.f0("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        d = kr.f0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(kr.e0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = ej.m;
    }
}
