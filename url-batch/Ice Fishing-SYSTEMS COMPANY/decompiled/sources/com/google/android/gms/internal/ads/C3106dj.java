package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.dj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3106dj implements InterfaceC4156x8 {

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f30182n;

    /* renamed from: u, reason: collision with root package name */
    public final S2.a f30183u;

    /* renamed from: v, reason: collision with root package name */
    public ScheduledFuture f30184v;

    /* renamed from: w, reason: collision with root package name */
    public long f30185w = -1;

    /* renamed from: x, reason: collision with root package name */
    public long f30186x = -1;

    /* renamed from: y, reason: collision with root package name */
    public RunnableC3601mt f30187y = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f30188z = false;

    public C3106dj(ScheduledExecutorService scheduledExecutorService, S2.a aVar) {
        this.f30182n = scheduledExecutorService;
        this.f30183u = aVar;
        p2.j.f39798C.f39807g.i(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4156x8
    public final void i0(boolean z8) {
        ScheduledFuture scheduledFuture;
        if (z8) {
            synchronized (this) {
                try {
                    if (this.f30188z) {
                        if (this.f30186x > 0 && (scheduledFuture = this.f30184v) != null && scheduledFuture.isCancelled()) {
                            this.f30184v = this.f30182n.schedule(this.f30187y, this.f30186x, TimeUnit.MILLISECONDS);
                        }
                        this.f30188z = false;
                        return;
                    }
                    return;
                } finally {
                }
            }
        }
        synchronized (this) {
            try {
                if (this.f30188z) {
                    return;
                }
                ScheduledFuture scheduledFuture2 = this.f30184v;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.f30186x = -1L;
                } else {
                    this.f30184v.cancel(true);
                    long j9 = this.f30185w;
                    this.f30183u.getClass();
                    this.f30186x = j9 - SystemClock.elapsedRealtime();
                }
                this.f30188z = true;
            } finally {
            }
        }
    }
}
