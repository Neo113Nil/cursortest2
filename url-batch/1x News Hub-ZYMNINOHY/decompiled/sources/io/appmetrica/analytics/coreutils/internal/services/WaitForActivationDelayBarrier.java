package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* renamed from: a, reason: collision with root package name */
    private long f5514a;

    /* renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f5515b;

    public static class ActivationBarrierHelper {

        /* renamed from: a, reason: collision with root package name */
        private boolean f5516a = false;

        /* renamed from: b, reason: collision with root package name */
        private final a f5517b;

        /* renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f5518c;

        public ActivationBarrierHelper(Runnable runnable, WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f5517b = new a(this, runnable);
            this.f5518c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j3, ICommonExecutor iCommonExecutor) {
            if (this.f5516a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f5518c.subscribe(j3, iCommonExecutor, this.f5517b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f5514a = this.f5515b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j3, ICommonExecutor iCommonExecutor, ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j3 - (this.f5515b.currentTimeMillis() - this.f5514a), 0L));
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f5515b = systemTimeProvider;
    }
}
