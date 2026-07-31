package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes3.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* renamed from: a, reason: collision with root package name */
    private long f37053a;

    /* renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f37054b;

    public static class ActivationBarrierHelper {

        /* renamed from: a, reason: collision with root package name */
        private boolean f37055a = false;

        /* renamed from: b, reason: collision with root package name */
        private final a f37056b;

        /* renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f37057c;

        public ActivationBarrierHelper(@NonNull Runnable runnable, @NonNull WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f37056b = new a(this, runnable);
            this.f37057c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j4, @NonNull ICommonExecutor iCommonExecutor) {
            if (this.f37055a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f37057c.subscribe(j4, iCommonExecutor, this.f37056b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f37053a = this.f37054b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j4, @NonNull ICommonExecutor iCommonExecutor, @NonNull ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j4 - (this.f37054b.currentTimeMillis() - this.f37053a), 0L));
    }

    WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f37054b = systemTimeProvider;
    }
}
