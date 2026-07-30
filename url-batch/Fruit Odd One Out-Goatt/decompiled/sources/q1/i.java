package q1;

import e0.c0;
import java.util.concurrent.TimeUnit;
import p1.w;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1117a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1118b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1119c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1120d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f1121e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f1122f;

    /* renamed from: g, reason: collision with root package name */
    public static final c0 f1123g;

    /* renamed from: h, reason: collision with root package name */
    public static final c0 f1124h;

    static {
        String str;
        int i2 = w.f1077a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f1117a = str;
        f1118b = p1.a.h("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = w.f1077a;
        if (i3 < 2) {
            i3 = 2;
        }
        f1119c = p1.a.i("kotlinx.coroutines.scheduler.core.pool.size", i3, 8);
        f1120d = p1.a.i("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f1121e = TimeUnit.SECONDS.toNanos(p1.a.h("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1122f = f.f1113a;
        f1123g = new c0(0);
        f1124h = new c0(1);
    }
}
