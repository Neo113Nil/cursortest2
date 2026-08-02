package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public final class AllHostsExponentialBackoffPolicy implements ExponentialBackoffPolicy {

    /* renamed from: a, reason: collision with root package name */
    private final ExponentialBackoffDataHolder f13293a;

    public AllHostsExponentialBackoffPolicy(ExponentialBackoffDataHolder exponentialBackoffDataHolder) {
        this.f13293a = exponentialBackoffDataHolder;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public boolean canBeExecuted(RetryPolicyConfig retryPolicyConfig) {
        return this.f13293a.wasLastAttemptLongAgoEnough(retryPolicyConfig);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public void onAllHostsAttemptsFinished(boolean z) {
        if (z) {
            this.f13293a.reset();
        } else {
            this.f13293a.updateLastAttemptInfo();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public void onHostAttemptFinished(boolean z) {
    }
}
