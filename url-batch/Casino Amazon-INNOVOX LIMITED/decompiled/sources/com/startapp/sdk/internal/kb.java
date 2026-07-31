package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.onesignal.debug.internal.crash.AnrConstants;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class kb {
    public static final AtomicInteger g = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final Handler f303a;
    public final Handler b;
    public Thread c;
    public volatile boolean d;
    public long e;
    public int f;

    public kb(Looper looper) {
        this.f303a = new Handler(looper, new ib(this));
        this.b = new Handler(looper);
    }

    public final void a(Runnable runnable) {
        boolean z;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                long j = -SystemClock.elapsedRealtime();
                synchronized (this) {
                    this.d = false;
                    this.f303a.sendEmptyMessage(0);
                    wait(AnrConstants.DEFAULT_CHECK_INTERVAL_MS);
                    z = this.d;
                }
                long elapsedRealtime = j + SystemClock.elapsedRealtime();
                int i = this.f;
                if (i < 8) {
                    this.f = i + 1;
                    this.e += elapsedRealtime;
                } else {
                    long j2 = this.e;
                    this.e = (elapsedRealtime - (j2 / i)) + j2;
                }
                if (!z) {
                    this.e = 0L;
                    this.f = 0;
                    synchronized (this) {
                        wait(5000L);
                    }
                } else {
                    if (this.e < 160) {
                        this.b.post(runnable);
                        this.e = 0L;
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
                n8.a(th);
                return;
            }
        }
    }
}
