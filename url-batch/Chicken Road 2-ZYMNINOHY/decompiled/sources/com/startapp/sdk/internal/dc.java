package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class dc {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicInteger f6801g = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final Handler f6802a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f6803b;

    /* renamed from: c, reason: collision with root package name */
    public Thread f6804c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f6805d;

    /* renamed from: e, reason: collision with root package name */
    public long f6806e;

    /* renamed from: f, reason: collision with root package name */
    public int f6807f;

    public dc(Looper looper) {
        this.f6802a = new Handler(looper, new bc(this));
        this.f6803b = new Handler(looper);
    }

    public final void a(Runnable runnable) {
        boolean z;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                long j4 = -SystemClock.elapsedRealtime();
                synchronized (this) {
                    this.f6805d = false;
                    this.f6802a.sendEmptyMessage(0);
                    wait(2000L);
                    z = this.f6805d;
                }
                long elapsedRealtime = j4 + SystemClock.elapsedRealtime();
                int i4 = this.f6807f;
                if (i4 < 8) {
                    this.f6807f = i4 + 1;
                    this.f6806e += elapsedRealtime;
                } else {
                    long j5 = this.f6806e;
                    this.f6806e = (elapsedRealtime - (j5 / i4)) + j5;
                }
                if (!z) {
                    this.f6806e = 0L;
                    this.f6807f = 0;
                    synchronized (this) {
                        wait(5000L);
                    }
                } else {
                    if (this.f6806e < 160) {
                        this.f6803b.post(runnable);
                        this.f6806e = 0L;
                        this.f6807f = 0;
                        return;
                    }
                    synchronized (this) {
                        wait(200L);
                    }
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                d9.a(th);
                return;
            }
        }
    }
}
