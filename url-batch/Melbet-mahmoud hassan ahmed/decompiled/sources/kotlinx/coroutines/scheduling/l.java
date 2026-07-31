package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.z;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final long f18430a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f18431b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18432c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f18433d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f18434e;

    /* renamed from: f, reason: collision with root package name */
    public static h f18435f;

    static {
        long e7;
        int d7;
        int a7;
        int d8;
        int e8;
        int d9;
        long e9;
        e7 = b0.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f18430a = e7;
        d7 = b0.d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        f18431b = d7;
        a7 = i6.f.a(z.a(), 2);
        d8 = b0.d("kotlinx.coroutines.scheduler.core.pool.size", a7, 1, 0, 8, null);
        f18432c = d8;
        e8 = i6.f.e(z.a() * 128, d8, 2097150);
        d9 = b0.d("kotlinx.coroutines.scheduler.max.pool.size", e8, 0, 2097150, 4, null);
        f18433d = d9;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e9 = b0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f18434e = timeUnit.toNanos(e9);
        f18435f = f.f18424a;
    }
}
