package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.t;

/* loaded from: classes.dex */
public final class RemoteBillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6045a;

    /* renamed from: b, reason: collision with root package name */
    private final BillingConfig f6046b;

    public RemoteBillingConfig(boolean z, BillingConfig billingConfig) {
        this.f6045a = z;
        this.f6046b = billingConfig;
    }

    public final BillingConfig getConfig() {
        return this.f6046b;
    }

    public final boolean getEnabled() {
        return this.f6045a;
    }

    public String toString() {
        return "RemoteBillingConfig(enabled=" + this.f6045a + ", config=" + this.f6046b + ')';
    }

    public RemoteBillingConfig() {
        this(new t().f5987a, new BillingConfig());
    }
}
