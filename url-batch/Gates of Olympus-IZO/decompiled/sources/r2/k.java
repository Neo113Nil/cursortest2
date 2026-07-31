package r2;

import java.util.concurrent.TimeUnit;
import p2.u;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7329a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f7330b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7331c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7332d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f7333e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f7334f;

    static {
        String str;
        int i3 = u.f6808a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f7329a = str;
        f7330b = p2.a.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i4 = u.f6808a;
        if (i4 < 2) {
            i4 = 2;
        }
        f7331c = p2.a.l("kotlinx.coroutines.scheduler.core.pool.size", i4, 1, 0, 8);
        f7332d = p2.a.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f7333e = TimeUnit.SECONDS.toNanos(p2.a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f7334f = g.f7324a;
    }
}
