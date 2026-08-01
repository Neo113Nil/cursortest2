package y1;

import java.util.concurrent.TimeUnit;
import w1.r;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4600a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f4601b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4602c;
    public static final int d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f4603e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f4604f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f4605g;
    public static final i h;

    static {
        String str;
        int i = r.f4517a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f4600a = str;
        f4601b = w1.a.d("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = r.f4517a;
        if (i2 < 2) {
            i2 = 2;
        }
        f4602c = w1.a.e("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        d = w1.a.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f4603e = TimeUnit.SECONDS.toNanos(w1.a.d("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f4604f = f.f4594a;
        f4605g = new i(0);
        h = new i(1);
    }
}
