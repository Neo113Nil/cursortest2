package T0;

import R0.AbstractC0068a;
import R0.x;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f978a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f979b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f980c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f981d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f982e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f983f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f984g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f985h;

    static {
        String str;
        int i2 = x.f940a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f978a = str;
        f979b = AbstractC0068a.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = x.f940a;
        if (i3 < 2) {
            i3 = 2;
        }
        f980c = AbstractC0068a.l("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
        f981d = AbstractC0068a.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f982e = TimeUnit.SECONDS.toNanos(AbstractC0068a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f983f = f.f972a;
        f984g = new i(0);
        f985h = new i(1);
    }
}
