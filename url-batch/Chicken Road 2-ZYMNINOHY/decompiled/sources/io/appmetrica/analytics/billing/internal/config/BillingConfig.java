package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.s;

/* loaded from: classes.dex */
public final class BillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final int f9532a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9533b;

    public BillingConfig(int i4, int i5) {
        this.f9532a = i4;
        this.f9533b = i5;
    }

    public final int getFirstCollectingInappMaxAgeSeconds() {
        return this.f9533b;
    }

    public final int getSendFrequencySeconds() {
        return this.f9532a;
    }

    public String toString() {
        return "BillingConfig(sendFrequencySeconds=" + this.f9532a + ", firstCollectingInappMaxAgeSeconds=" + this.f9533b + ')';
    }

    public BillingConfig() {
        this(new s().f9475a, new s().f9476b);
    }
}
