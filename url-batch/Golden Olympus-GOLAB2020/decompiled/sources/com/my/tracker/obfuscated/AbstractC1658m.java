package com.my.tracker.obfuscated;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.my.tracker.obfuscated.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1658m {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f21416a;

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f21417b;

    /* renamed from: c, reason: collision with root package name */
    public static final Executor f21418c;

    /* renamed from: d, reason: collision with root package name */
    public static final Executor f21419d;

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f21420e;

    /* renamed from: f, reason: collision with root package name */
    public static final Executor f21421f;

    /* renamed from: g, reason: collision with root package name */
    private static final Executor f21422g;

    /* renamed from: h, reason: collision with root package name */
    private static final a f21423h;

    /* renamed from: com.my.tracker.obfuscated.m$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayDeque f21424a = new ArrayDeque();

        /* renamed from: com.my.tracker.obfuscated.m$a$a, reason: collision with other inner class name */
        static final class RunnableC0174a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final a f21425a;

            /* renamed from: b, reason: collision with root package name */
            volatile Runnable f21426b;

            RunnableC0174a(a aVar) {
                this.f21425a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Runnable runnable = this.f21426b;
                    if (runnable != null) {
                        runnable.run();
                    }
                    a aVar = this.f21425a;
                    if (aVar == null) {
                    }
                } catch (Throwable th) {
                    try {
                        AbstractC1708y2.b("RunnableThrowableDecorator: exception has been caught", th);
                    } finally {
                        a aVar2 = this.f21425a;
                        if (aVar2 != null) {
                            aVar2.a(this);
                        }
                    }
                }
            }
        }

        a() {
            for (int i4 = 0; i4 < 64; i4++) {
                this.f21424a.add(new RunnableC0174a(this));
            }
        }

        void a(RunnableC0174a runnableC0174a) {
            synchronized (this) {
                runnableC0174a.f21426b = null;
                this.f21424a.add(runnableC0174a);
            }
        }

        public Runnable a(Runnable runnable) {
            RunnableC0174a runnableC0174a;
            synchronized (this) {
                runnableC0174a = (RunnableC0174a) this.f21424a.pollFirst();
            }
            if (runnableC0174a == null) {
                runnableC0174a = new RunnableC0174a(null);
            }
            runnableC0174a.f21426b = runnable;
            return runnableC0174a;
        }
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        f21416a = handler;
        f21417b = Executors.newSingleThreadExecutor();
        f21418c = Executors.newSingleThreadExecutor();
        f21419d = Executors.newSingleThreadExecutor();
        f21420e = Executors.newSingleThreadExecutor();
        f21421f = Executors.newSingleThreadExecutor();
        f21422g = new Z2(handler);
        f21423h = new a();
    }

    public static void a(Runnable runnable) {
        f21417b.execute(f21423h.a(runnable));
    }

    public static void b(Runnable runnable) {
        f21418c.execute(f21423h.a(runnable));
    }

    public static void c(Runnable runnable) {
        f21419d.execute(f21423h.a(runnable));
    }

    public static void d(Runnable runnable) {
        f21420e.execute(f21423h.a(runnable));
    }

    public static void e(Runnable runnable) {
        f21421f.execute(f21423h.a(runnable));
    }

    public static void f(Runnable runnable) {
        Runnable a4 = f21423h.a(runnable);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            a4.run();
        } else {
            f21422g.execute(a4);
        }
    }
}
