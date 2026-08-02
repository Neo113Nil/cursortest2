package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.t;

/* loaded from: classes.dex */
public final class RemoteBillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9534a;

    /* renamed from: b, reason: collision with root package name */
    private final BillingConfig f9535b;

    public RemoteBillingConfig(boolean z, BillingConfig billingConfig) {
        this.f9534a = z;
        this.f9535b = billingConfig;
    }

    public final BillingConfig getConfig() {
        return this.f9535b;
    }

    public final boolean getEnabled() {
        return this.f9534a;
    }

    public String toString() {
        return "RemoteBillingConfig(enabled=" + this.f9534a + ", config=" + this.f9535b + ')';
    }

    public RemoteBillingConfig() {
        this(new t().f9478a, new BillingConfig());
    }
}
