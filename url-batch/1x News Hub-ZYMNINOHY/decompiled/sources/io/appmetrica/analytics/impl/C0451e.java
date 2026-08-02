package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451e {

    /* renamed from: g, reason: collision with root package name */
    public static final long f7201g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f7202h = "WatchDog-" + Gd.f6039a.incrementAndGet();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f7203a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f7204b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f7205c;

    /* renamed from: d, reason: collision with root package name */
    public C0426d f7206d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7207e;
    public final Runnable f;

    public C0451e(Kb kb) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f7203a = copyOnWriteArrayList;
        this.f7204b = new AtomicInteger();
        this.f7205c = new Handler(Looper.getMainLooper());
        this.f7207e = new AtomicBoolean();
        this.f = new B0.n(19, this);
        copyOnWriteArrayList.add(kb);
    }

    public final /* synthetic */ void a() {
        this.f7207e.set(true);
    }

    public final synchronized void b() {
        C0426d c0426d = this.f7206d;
        if (c0426d != null) {
            c0426d.f7162a.set(false);
            this.f7206d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i3) {
        AtomicInteger atomicInteger = this.f7204b;
        int i4 = 5;
        if (i3 >= 5) {
            i4 = i3;
        }
        atomicInteger.set(i4);
        if (this.f7206d == null) {
            C0426d c0426d = new C0426d(this);
            this.f7206d = c0426d;
            try {
                c0426d.setName(f7202h);
            } catch (SecurityException unused) {
            }
            this.f7206d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i3));
        }
    }
}
