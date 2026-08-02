package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f9439a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9440b;

    public A(int i4, int i5) {
        this.f9439a = i4;
        this.f9440b = i5;
    }

    public final String toString() {
        return "ServiceSideBillingConfig(sendFrequencySeconds=" + this.f9439a + ", firstCollectingInappMaxAgeSeconds=" + this.f9440b + ')';
    }

    public A(BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }
}
