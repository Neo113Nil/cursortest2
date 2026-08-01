package y1;

import java.util.concurrent.TimeUnit;
import w1.v;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4755a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f4756b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4757c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4758d;
    public static final long e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f4759f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f4760g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f4761h;

    static {
        String str;
        int i = v.f4502a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f4755a = str;
        f4756b = w1.a.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = v.f4502a;
        if (i2 < 2) {
            i2 = 2;
        }
        f4757c = w1.a.l("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        f4758d = w1.a.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(w1.a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f4759f = f.f4749a;
        f4760g = new i(0);
        f4761h = new i(1);
    }
}
