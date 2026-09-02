package E3;

import C3.w;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f718a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f719b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f720c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f721d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f722e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f723f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f724g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f725h;

    static {
        String str;
        int i4 = w.f322a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f718a = str;
        f719b = C3.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i5 = w.f322a;
        if (i5 < 2) {
            i5 = 2;
        }
        f720c = C3.a.j(i5, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f721d = C3.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f722e = TimeUnit.SECONDS.toNanos(C3.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f723f = g.f712a;
        f724g = new j(0);
        f725h = new j(1);
    }
}
