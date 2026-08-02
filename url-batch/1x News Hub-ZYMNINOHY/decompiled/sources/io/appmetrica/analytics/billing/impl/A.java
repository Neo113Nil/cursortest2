package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f5199a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5200b;

    public A(int i3, int i4) {
        this.f5199a = i3;
        this.f5200b = i4;
    }

    public final String toString() {
        return "ServiceSideBillingConfig(sendFrequencySeconds=" + this.f5199a + ", firstCollectingInappMaxAgeSeconds=" + this.f5200b + ')';
    }

    public A(BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }
}
