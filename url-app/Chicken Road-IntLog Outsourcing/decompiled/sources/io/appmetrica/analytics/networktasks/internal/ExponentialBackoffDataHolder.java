package io.appmetrica.analytics.networktasks.internal;

import b2.AbstractC0279e;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* loaded from: classes.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f9861a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeProvider f9862b;

    /* renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f9863c;

    /* renamed from: d, reason: collision with root package name */
    private long f9864d;

    /* renamed from: e, reason: collision with root package name */
    private int f9865e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9866f;

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f9865e = 1;
        this.f9864d = 0L;
        this.f9863c.saveNextSendAttemptNumber(1);
        this.f9863c.saveLastAttemptTimeSeconds(this.f9864d);
    }

    public void updateLastAttemptInfo() {
        long currentTimeSeconds = this.f9862b.currentTimeSeconds();
        this.f9864d = currentTimeSeconds;
        this.f9865e++;
        this.f9863c.saveLastAttemptTimeSeconds(currentTimeSeconds);
        this.f9863c.saveNextSendAttemptNumber(this.f9865e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j2 = this.f9864d;
            if (j2 != 0) {
                TimePassedChecker timePassedChecker = this.f9861a;
                int i2 = ((1 << (this.f9865e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i3 = retryPolicyConfig.maxIntervalSeconds;
                if (i2 > i3) {
                    i2 = i3;
                }
                return timePassedChecker.didTimePassSeconds(j2, i2, this.f9866f);
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f9863c = hostRetryInfoProvider;
        this.f9862b = systemTimeProvider;
        this.f9861a = timePassedChecker;
        this.f9864d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f9865e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f9866f = AbstractC0279e.f("[ExponentialBackoffDataHolder-", str, "]");
    }
}
