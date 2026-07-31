package h7;

import f7.t;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3244a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f3245b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3246c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3247d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f3248e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f3249f;

    static {
        String str;
        int i = t.f2801a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f3244a = str;
        f3245b = f7.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i8 = t.f2801a;
        if (i8 < 2) {
            i8 = 2;
        }
        f3246c = f7.a.j(i8, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f3247d = f7.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f3248e = TimeUnit.SECONDS.toNanos(f7.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f3249f = g.f3239a;
    }
}
