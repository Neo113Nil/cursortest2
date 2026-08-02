package f1;

import d1.AbstractC0184a;
import d1.x;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2208a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2209b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2210c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2211d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f2212e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f2213f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f2214g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f2215h;

    static {
        String str;
        int i2 = x.f2109a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f2208a = str;
        f2209b = AbstractC0184a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = x.f2109a;
        if (i3 < 2) {
            i3 = 2;
        }
        f2210c = AbstractC0184a.k("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
        f2211d = AbstractC0184a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f2212e = TimeUnit.SECONDS.toNanos(AbstractC0184a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f2213f = f.f2202a;
        f2214g = new i(0);
        f2215h = new i(1);
    }
}
