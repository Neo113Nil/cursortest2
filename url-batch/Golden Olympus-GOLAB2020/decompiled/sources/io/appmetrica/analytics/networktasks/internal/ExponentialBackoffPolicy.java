package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes3.dex */
public interface ExponentialBackoffPolicy {
    boolean canBeExecuted(RetryPolicyConfig retryPolicyConfig);

    void onAllHostsAttemptsFinished(boolean z4);

    void onHostAttemptFinished(boolean z4);
}
