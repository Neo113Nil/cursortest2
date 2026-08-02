package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.s;

/* loaded from: classes.dex */
public final class BillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final int f5287a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5288b;

    public BillingConfig(int i3, int i4) {
        this.f5287a = i3;
        this.f5288b = i4;
    }

    public final int getFirstCollectingInappMaxAgeSeconds() {
        return this.f5288b;
    }

    public final int getSendFrequencySeconds() {
        return this.f5287a;
    }

    public String toString() {
        return "BillingConfig(sendFrequencySeconds=" + this.f5287a + ", firstCollectingInappMaxAgeSeconds=" + this.f5288b + ')';
    }

    public BillingConfig() {
        this(new s().f5233a, new s().f5234b);
    }
}
