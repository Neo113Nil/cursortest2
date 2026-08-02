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
public final class C0573e {

    /* renamed from: g, reason: collision with root package name */
    public static final long f11711g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f11712h = "WatchDog-" + ThreadFactoryC1131zd.f13101a.incrementAndGet();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f11713a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f11714b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f11715c;

    /* renamed from: d, reason: collision with root package name */
    public C0548d f11716d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f11717e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f11718f;

    public C0573e(Db db) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f11713a = copyOnWriteArrayList;
        this.f11714b = new AtomicInteger();
        this.f11715c = new Handler(Looper.getMainLooper());
        this.f11717e = new AtomicBoolean();
        this.f11718f = new R1.n(28, this);
        copyOnWriteArrayList.add(db);
    }

    public final /* synthetic */ void a() {
        this.f11717e.set(true);
    }

    public final synchronized void b() {
        C0548d c0548d = this.f11716d;
        if (c0548d != null) {
            c0548d.f11636a.set(false);
            this.f11716d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i4) {
        AtomicInteger atomicInteger = this.f11714b;
        int i5 = 5;
        if (i4 >= 5) {
            i5 = i4;
        }
        atomicInteger.set(i5);
        if (this.f11716d == null) {
            C0548d c0548d = new C0548d(this);
            this.f11716d = c0548d;
            try {
                c0548d.setName(f11712h);
            } catch (SecurityException unused) {
            }
            this.f11716d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i4));
        }
    }
}
