package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final BillingClient f36897a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f36898b = new LinkedHashSet();

    public d(BillingClient billingClient) {
        this.f36897a = billingClient;
    }

    public final void a(Object obj) {
        this.f36898b.remove(obj);
        if (this.f36898b.size() == 0) {
            this.f36897a.endConnection();
        }
    }
}
