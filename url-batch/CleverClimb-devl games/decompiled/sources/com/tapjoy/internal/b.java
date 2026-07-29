package com.tapjoy.internal;

import android.app.Activity;
import android.app.Application;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static Application f7844a;

    /* renamed from: b, reason: collision with root package name */
    private static int f7845b;

    /* renamed from: c, reason: collision with root package name */
    private static final by f7846c = new by();

    /* renamed from: d, reason: collision with root package name */
    private static final Set f7847d = Collections.synchronizedSet(new ay());
    private static final by e = new by();

    public static boolean b() {
        return f7845b > 0;
    }

    @Nullable
    public static Activity c() {
        Activity activity;
        Activity activity2 = (Activity) f7846c.a();
        if (activity2 != null) {
            return activity2;
        }
        synchronized (f7847d) {
            activity = (Activity) ju.a(f7847d.iterator());
        }
        return activity;
    }

    public static void a(Activity activity) {
        f7846c.a(activity);
    }

    public static synchronized void a(Application application) {
        synchronized (b.class) {
            if (f7844a != application) {
                f7844a = application;
            }
        }
    }

    public static void b(Activity activity) {
        f7845b++;
        f7846c.a(activity);
        f7847d.add(activity);
    }

    public static void c(Activity activity) {
        f7845b--;
        f7846c.f7876a = null;
        f7847d.remove(activity);
        if (f7845b < 0) {
            f7845b = 0;
        }
    }

    @Nullable
    public static Activity a() {
        Activity activity = (Activity) e.a();
        return activity == null ? c() : activity;
    }
}
