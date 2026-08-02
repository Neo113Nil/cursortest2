package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import w0.AbstractC1234c;

/* loaded from: classes.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f8888a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeProvider f8889b;

    /* renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f8890c;

    /* renamed from: d, reason: collision with root package name */
    private long f8891d;

    /* renamed from: e, reason: collision with root package name */
    private int f8892e;
    private final String f;

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f8892e = 1;
        this.f8891d = 0L;
        this.f8890c.saveNextSendAttemptNumber(1);
        this.f8890c.saveLastAttemptTimeSeconds(this.f8891d);
    }

    public void updateLastAttemptInfo() {
        long currentTimeSeconds = this.f8889b.currentTimeSeconds();
        this.f8891d = currentTimeSeconds;
        this.f8892e++;
        this.f8890c.saveLastAttemptTimeSeconds(currentTimeSeconds);
        this.f8890c.saveNextSendAttemptNumber(this.f8892e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j3 = this.f8891d;
            if (j3 != 0) {
                TimePassedChecker timePassedChecker = this.f8888a;
                int i3 = ((1 << (this.f8892e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i4 = retryPolicyConfig.maxIntervalSeconds;
                if (i3 > i4) {
                    i3 = i4;
                }
                return timePassedChecker.didTimePassSeconds(j3, i3, this.f);
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f8890c = hostRetryInfoProvider;
        this.f8889b = systemTimeProvider;
        this.f8888a = timePassedChecker;
        this.f8891d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f8892e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f = AbstractC1234c.a("[ExponentialBackoffDataHolder-", str, "]");
    }
}
