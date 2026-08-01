package q0;

import E.D;
import java.util.concurrent.TimeUnit;
import p0.AbstractC0084a;
import p0.x;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1218a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1219b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1220c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1221d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f1222e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f1223f;

    /* renamed from: g, reason: collision with root package name */
    public static final D f1224g;

    /* renamed from: h, reason: collision with root package name */
    public static final D f1225h;

    static {
        String str;
        int i2 = x.f1181a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f1218a = str;
        f1219b = AbstractC0084a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = x.f1181a;
        if (i3 < 2) {
            i3 = 2;
        }
        f1220c = AbstractC0084a.k("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
        f1221d = AbstractC0084a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f1222e = TimeUnit.SECONDS.toNanos(AbstractC0084a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1223f = f.f1213a;
        f1224g = new D(0);
        f1225h = new D(1);
    }
}
