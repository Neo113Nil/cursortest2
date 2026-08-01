package u1;

import java.util.concurrent.TimeUnit;
import s1.r;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3772a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f3773b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3774c;
    public static final int d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f3775e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f3776f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f3777g;
    public static final i h;

    static {
        String str;
        int i = r.f3668a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f3772a = str;
        f3773b = s1.a.d("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = r.f3668a;
        if (i2 < 2) {
            i2 = 2;
        }
        f3774c = s1.a.e("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        d = s1.a.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f3775e = TimeUnit.SECONDS.toNanos(s1.a.d("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f3776f = f.f3766a;
        f3777g = new i(0);
        h = new i(1);
    }
}
