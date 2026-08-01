package ne;

import java.util.concurrent.TimeUnit;
import le.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7283a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f7284b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7285c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7286d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f7287e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f7288f;

    static {
        String str;
        int i3 = u.f6001a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f7283a = str;
        f7284b = le.b.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = u.f6001a;
        if (i10 < 2) {
            i10 = 2;
        }
        f7285c = le.b.k("kotlinx.coroutines.scheduler.core.pool.size", i10, 8);
        f7286d = le.b.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f7287e = TimeUnit.SECONDS.toNanos(le.b.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f7288f = g.f7279a;
    }
}
