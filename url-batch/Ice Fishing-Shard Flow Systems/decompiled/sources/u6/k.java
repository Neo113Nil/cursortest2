package u6;

import java.util.concurrent.TimeUnit;
import s6.AbstractC0898a;
import s6.t;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8114a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f8115b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8116c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8117d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f8118e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f8119f;

    static {
        String str;
        int i2 = t.f7856a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f8114a = str;
        f8115b = AbstractC0898a.h("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i5 = t.f7856a;
        if (i5 < 2) {
            i5 = 2;
        }
        f8116c = AbstractC0898a.i("kotlinx.coroutines.scheduler.core.pool.size", i5, 8);
        f8117d = AbstractC0898a.i("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f8118e = TimeUnit.SECONDS.toNanos(AbstractC0898a.h("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f8119f = g.f8109a;
    }
}
