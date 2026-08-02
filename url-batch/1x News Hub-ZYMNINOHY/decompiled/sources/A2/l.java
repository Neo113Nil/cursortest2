package A2;

import java.util.concurrent.TimeUnit;
import y2.v;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f61a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f62b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f63c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f64d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f65e;
    public static final g f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f66g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f67h;

    static {
        String str;
        int i3 = v.f10868a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f61a = str;
        f62b = y2.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i4 = v.f10868a;
        if (i4 < 2) {
            i4 = 2;
        }
        f63c = y2.a.j(i4, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f64d = y2.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f65e = TimeUnit.SECONDS.toNanos(y2.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = g.f55a;
        f66g = new j(0);
        f67h = new j(1);
    }
}
