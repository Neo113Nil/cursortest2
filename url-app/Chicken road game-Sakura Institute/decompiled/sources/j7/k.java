package j7;

import h7.t;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5159a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f5160b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5161c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5162d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f5163e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f5164f;

    static {
        String str;
        int i7 = t.f4708a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f5159a = str;
        f5160b = h7.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i8 = t.f4708a;
        if (i8 < 2) {
            i8 = 2;
        }
        f5161c = h7.a.j(i8, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f5162d = h7.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f5163e = TimeUnit.SECONDS.toNanos(h7.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f5164f = g.f5154a;
    }
}
