package O5;

import D3.A;
import M5.w;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1822a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1823b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1824c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1825d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f1826e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f1827f;

    /* renamed from: g, reason: collision with root package name */
    public static final A f1828g;

    /* renamed from: h, reason: collision with root package name */
    public static final A f1829h;

    static {
        String str;
        int i7 = w.f1626a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f1822a = str;
        f1823b = M5.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i8 = w.f1626a;
        if (i8 < 2) {
            i8 = 2;
        }
        f1824c = M5.a.k("kotlinx.coroutines.scheduler.core.pool.size", i8, 8);
        f1825d = M5.a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f1826e = TimeUnit.SECONDS.toNanos(M5.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1827f = f.f1817a;
        f1828g = new A(0);
        f1829h = new A(1);
    }
}
