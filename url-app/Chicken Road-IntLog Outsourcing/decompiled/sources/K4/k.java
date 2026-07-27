package K4;

import I4.w;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1445a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1446b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1447c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1448d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f1449e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f1450f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f1451g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f1452h;

    static {
        String str;
        int i2 = w.f1325a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f1445a = str;
        f1446b = I4.a.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = w.f1325a;
        if (i3 < 2) {
            i3 = 2;
        }
        f1447c = I4.a.l("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
        f1448d = I4.a.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f1449e = TimeUnit.SECONDS.toNanos(I4.a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1450f = f.f1439a;
        f1451g = new i(0);
        f1452h = new i(1);
    }
}
