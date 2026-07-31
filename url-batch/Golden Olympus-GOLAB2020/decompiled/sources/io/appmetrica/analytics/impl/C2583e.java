package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2583e {

    /* renamed from: g, reason: collision with root package name */
    public static final long f38888g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f38889h = "WatchDog-" + Od.f38077a.incrementAndGet();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f38890a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f38891b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f38892c;

    /* renamed from: d, reason: collision with root package name */
    public C2557d f38893d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f38894e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f38895f;

    public C2583e(Yb yb) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f38890a = copyOnWriteArrayList;
        this.f38891b = new AtomicInteger();
        this.f38892c = new Handler(Looper.getMainLooper());
        this.f38894e = new AtomicBoolean();
        this.f38895f = new Runnable() { // from class: io.appmetrica.analytics.impl.gp
            @Override // java.lang.Runnable
            public final void run() {
                C2583e.this.a();
            }
        };
        copyOnWriteArrayList.add(yb);
    }

    public final /* synthetic */ void a() {
        this.f38894e.set(true);
    }

    public final synchronized void b() {
        C2557d c2557d = this.f38893d;
        if (c2557d != null) {
            c2557d.f38807a.set(false);
            this.f38893d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i4) {
        AtomicInteger atomicInteger = this.f38891b;
        int i5 = 5;
        if (i4 >= 5) {
            i5 = i4;
        }
        atomicInteger.set(i5);
        if (this.f38893d == null) {
            C2557d c2557d = new C2557d(this);
            this.f38893d = c2557d;
            try {
                c2557d.setName(f38889h);
            } catch (SecurityException unused) {
            }
            this.f38893d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i4));
        }
    }
}
