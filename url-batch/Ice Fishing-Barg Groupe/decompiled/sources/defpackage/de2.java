package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class de2 {
    public static final String PxuCJdSBwIXG;
    public static final int TSizfFm2Yiuu;
    public static final int Y1f8riQaR6yg;
    public static final jx1 a92UlCVFR9N8;
    public static final long e9gEMXR7LXtO;
    public static final long lS5Rgt96tfkO;

    static {
        String str;
        int i = yc2.PxuCJdSBwIXG;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        PxuCJdSBwIXG = str;
        lS5Rgt96tfkO = ni0.i68hK7ahKtgp("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = yc2.PxuCJdSBwIXG;
        if (i2 < 2) {
            i2 = 2;
        }
        TSizfFm2Yiuu = ni0.zf8DYfih6EZu(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        Y1f8riQaR6yg = ni0.zf8DYfih6EZu(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e9gEMXR7LXtO = TimeUnit.SECONDS.toNanos(ni0.i68hK7ahKtgp("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        a92UlCVFR9N8 = jx1.RfyTYNmI9Srp;
    }
}
