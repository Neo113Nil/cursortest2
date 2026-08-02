package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.t;

/* loaded from: classes.dex */
public final class RemoteBillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5289a;

    /* renamed from: b, reason: collision with root package name */
    private final BillingConfig f5290b;

    public RemoteBillingConfig(boolean z, BillingConfig billingConfig) {
        this.f5289a = z;
        this.f5290b = billingConfig;
    }

    public final BillingConfig getConfig() {
        return this.f5290b;
    }

    public final boolean getEnabled() {
        return this.f5289a;
    }

    public String toString() {
        return "RemoteBillingConfig(enabled=" + this.f5289a + ", config=" + this.f5290b + ')';
    }

    public RemoteBillingConfig() {
        this(new t().f5236a, new BillingConfig());
    }
}
