package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* loaded from: classes3.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f40593a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeProvider f40594b;

    /* renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f40595c;

    /* renamed from: d, reason: collision with root package name */
    private long f40596d;

    /* renamed from: e, reason: collision with root package name */
    private int f40597e;

    /* renamed from: f, reason: collision with root package name */
    private final String f40598f;

    public ExponentialBackoffDataHolder(@NonNull HostRetryInfoProvider hostRetryInfoProvider, @NonNull String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f40597e = 1;
        this.f40596d = 0L;
        this.f40595c.saveNextSendAttemptNumber(1);
        this.f40595c.saveLastAttemptTimeSeconds(this.f40596d);
    }

    public void updateLastAttemptInfo() {
        long currentTimeSeconds = this.f40594b.currentTimeSeconds();
        this.f40596d = currentTimeSeconds;
        this.f40597e++;
        this.f40595c.saveLastAttemptTimeSeconds(currentTimeSeconds);
        this.f40595c.saveNextSendAttemptNumber(this.f40597e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j4 = this.f40596d;
            if (j4 != 0) {
                TimePassedChecker timePassedChecker = this.f40593a;
                int i4 = ((1 << (this.f40597e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i5 = retryPolicyConfig.maxIntervalSeconds;
                if (i4 > i5) {
                    i4 = i5;
                }
                return timePassedChecker.didTimePassSeconds(j4, i4, this.f40598f);
            }
        }
        return true;
    }

    ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f40595c = hostRetryInfoProvider;
        this.f40594b = systemTimeProvider;
        this.f40593a = timePassedChecker;
        this.f40596d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f40597e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f40598f = String.format("[ExponentialBackoffDataHolder-%s]", str);
    }
}
