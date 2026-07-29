package com.tapjoy.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ho {
    private static String e;
    private static boolean f;

    /* renamed from: a, reason: collision with root package name */
    public static final ScheduledExecutorService f8306a = Executors.newScheduledThreadPool(1);

    /* renamed from: b, reason: collision with root package name */
    public static final CountDownLatch f8307b = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    private static final Runnable f8309d = new Runnable() { // from class: com.tapjoy.internal.ho.1
        @Override // java.lang.Runnable
        public final void run() {
            if (v.c()) {
                ho.f8307b.countDown();
            } else if (v.a()) {
                ho.f8307b.countDown();
            } else {
                ho.f8306a.schedule(this, 300L, TimeUnit.SECONDS);
            }
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final CountDownLatch f8308c = new CountDownLatch(1);

    public static void a() {
        f8306a.execute(f8309d);
    }

    public static void a(String str, boolean z) {
        e = str;
        f = z;
        f8308c.countDown();
    }

    public static String b() {
        return e;
    }

    public static boolean c() {
        return f;
    }
}
