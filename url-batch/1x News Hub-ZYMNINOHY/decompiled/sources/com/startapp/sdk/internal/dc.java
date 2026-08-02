package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class dc {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicInteger f3688g = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3689a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3690b;

    /* renamed from: c, reason: collision with root package name */
    public Thread f3691c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f3692d;

    /* renamed from: e, reason: collision with root package name */
    public long f3693e;
    public int f;

    public dc(Looper looper) {
        this.f3689a = new Handler(looper, new bc(this));
        this.f3690b = new Handler(looper);
    }

    public final void a(Runnable runnable) {
        boolean z;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                long j3 = -SystemClock.elapsedRealtime();
                synchronized (this) {
                    this.f3692d = false;
                    this.f3689a.sendEmptyMessage(0);
                    wait(2000L);
                    z = this.f3692d;
                }
                long elapsedRealtime = j3 + SystemClock.elapsedRealtime();
                int i3 = this.f;
                if (i3 < 8) {
                    this.f = i3 + 1;
                    this.f3693e += elapsedRealtime;
                } else {
                    long j4 = this.f3693e;
                    this.f3693e = (elapsedRealtime - (j4 / i3)) + j4;
                }
                if (!z) {
                    this.f3693e = 0L;
                    this.f = 0;
                    synchronized (this) {
                        wait(5000L);
                    }
                } else {
                    if (this.f3693e < 160) {
                        this.f3690b.post(runnable);
                        this.f3693e = 0L;
                        this.f = 0;
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
