package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f13304a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeProvider f13305b;

    /* renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f13306c;

    /* renamed from: d, reason: collision with root package name */
    private long f13307d;

    /* renamed from: e, reason: collision with root package name */
    private int f13308e;

    /* renamed from: f, reason: collision with root package name */
    private final String f13309f;

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f13308e = 1;
        this.f13307d = 0L;
        this.f13306c.saveNextSendAttemptNumber(1);
        this.f13306c.saveLastAttemptTimeSeconds(this.f13307d);
    }

    public void updateLastAttemptInfo() {
        long currentTimeSeconds = this.f13305b.currentTimeSeconds();
        this.f13307d = currentTimeSeconds;
        this.f13308e++;
        this.f13306c.saveLastAttemptTimeSeconds(currentTimeSeconds);
        this.f13306c.saveNextSendAttemptNumber(this.f13308e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j4 = this.f13307d;
            if (j4 != 0) {
                TimePassedChecker timePassedChecker = this.f13304a;
                int i4 = ((1 << (this.f13308e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i5 = retryPolicyConfig.maxIntervalSeconds;
                if (i4 > i5) {
                    i4 = i5;
                }
                return timePassedChecker.didTimePassSeconds(j4, i4, this.f13309f);
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f13306c = hostRetryInfoProvider;
        this.f13305b = systemTimeProvider;
        this.f13304a = timePassedChecker;
        this.f13307d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f13308e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f13309f = AbstractC1514c.a("[ExponentialBackoffDataHolder-", str, "]");
    }
}
