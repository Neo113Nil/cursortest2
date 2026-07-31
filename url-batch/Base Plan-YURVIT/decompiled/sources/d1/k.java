package d1;

import b1.AbstractC0115a;
import b1.x;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1838a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1839b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1840c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1841d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f1842e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f1843f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f1844g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f1845h;

    static {
        String str;
        int i2 = x.f1779a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f1838a = str;
        f1839b = AbstractC0115a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = x.f1779a;
        if (i3 < 2) {
            i3 = 2;
        }
        f1840c = AbstractC0115a.j("kotlinx.coroutines.scheduler.core.pool.size", i3, 8);
        f1841d = AbstractC0115a.j("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f1842e = TimeUnit.SECONDS.toNanos(AbstractC0115a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1843f = f.f1832a;
        f1844g = new i(0);
        f1845h = new i(1);
    }
}
