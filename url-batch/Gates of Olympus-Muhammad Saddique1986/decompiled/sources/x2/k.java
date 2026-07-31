package x2;

import java.util.concurrent.TimeUnit;
import v2.t;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10354a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f10355b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10356c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10357d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f10358e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f10359f;

    static {
        String str;
        int i3 = t.f9828a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f10354a = str;
        f10355b = v2.a.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i4 = t.f9828a;
        if (i4 < 2) {
            i4 = 2;
        }
        f10356c = v2.a.l("kotlinx.coroutines.scheduler.core.pool.size", i4, 1, 0, 8);
        f10357d = v2.a.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f10358e = TimeUnit.SECONDS.toNanos(v2.a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f10359f = g.f10349a;
    }
}
