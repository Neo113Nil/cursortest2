package v2;

import java.util.concurrent.TimeUnit;
import t2.H;
import t2.J;

/* renamed from: v2.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3477l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f46475a = H.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public static final long f46476b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f46477c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f46478d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f46479e;

    /* renamed from: f, reason: collision with root package name */
    public static AbstractC3472g f46480f;

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC3474i f46481g;

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC3474i f46482h;

    static {
        long f4;
        int e4;
        int e5;
        long f5;
        f4 = J.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f46476b = f4;
        e4 = J.e("kotlinx.coroutines.scheduler.core.pool.size", kotlin.ranges.g.d(H.a(), 2), 1, 0, 8, null);
        f46477c = e4;
        e5 = J.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f46478d = e5;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f5 = J.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f46479e = timeUnit.toNanos(f5);
        f46480f = C3470e.f46465a;
        f46481g = new C3475j(0);
        f46482h = new C3475j(1);
    }
}
