package d3;

import b3.u;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6124a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f6125b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6126c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6127d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f6128e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f6129f;

    static {
        String str;
        int i2 = u.f5690a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f6124a = str;
        f6125b = b3.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i4 = u.f5690a;
        if (i4 < 2) {
            i4 = 2;
        }
        f6126c = b3.a.k(i4, 1, 0, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f6127d = b3.a.k(2097150, 0, 2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f6128e = TimeUnit.SECONDS.toNanos(b3.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f6129f = g.f6119a;
    }
}
