package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* renamed from: a, reason: collision with root package name */
    private long f9768a;

    /* renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f9769b;

    public static class ActivationBarrierHelper {

        /* renamed from: a, reason: collision with root package name */
        private boolean f9770a = false;

        /* renamed from: b, reason: collision with root package name */
        private final a f9771b;

        /* renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f9772c;

        public ActivationBarrierHelper(Runnable runnable, WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f9771b = new a(this, runnable);
            this.f9772c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j4, ICommonExecutor iCommonExecutor) {
            if (this.f9770a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f9772c.subscribe(j4, iCommonExecutor, this.f9771b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f9768a = this.f9769b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j4, ICommonExecutor iCommonExecutor, ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j4 - (this.f9769b.currentTimeMillis() - this.f9768a), 0L));
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f9769b = systemTimeProvider;
    }
}
