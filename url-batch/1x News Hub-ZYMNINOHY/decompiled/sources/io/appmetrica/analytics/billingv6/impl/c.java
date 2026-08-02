package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements BillingInfoManager {

    /* renamed from: a, reason: collision with root package name */
    public final BillingInfoStorage f5302a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5303b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5304c;

    public c(BillingInfoStorage billingInfoStorage) {
        this.f5302a = billingInfoStorage;
        this.f5303b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f5304c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final BillingInfo get(String str) {
        return (BillingInfo) this.f5304c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final boolean isFirstInappCheckOccurred() {
        return this.f5303b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void markFirstInappCheckOccurred() {
        if (this.f5303b) {
            return;
        }
        this.f5303b = true;
        this.f5302a.saveInfo(c2.e.Y(this.f5304c.values()), this.f5303b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void update(Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f5304c.put(billingInfo.productId, billingInfo);
        }
        this.f5302a.saveInfo(c2.e.Y(this.f5304c.values()), this.f5303b);
    }
}
