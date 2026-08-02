package io.appmetrica.analytics.billingv8.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements BillingInfoManager {

    /* renamed from: a, reason: collision with root package name */
    public final BillingInfoStorage f5351a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5352b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5353c;

    public c(BillingInfoStorage billingInfoStorage) {
        this.f5351a = billingInfoStorage;
        this.f5352b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f5353c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final BillingInfo get(String str) {
        return (BillingInfo) this.f5353c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final boolean isFirstInappCheckOccurred() {
        return this.f5352b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void markFirstInappCheckOccurred() {
        if (this.f5352b) {
            return;
        }
        this.f5352b = true;
        this.f5351a.saveInfo(c2.e.Y(this.f5353c.values()), this.f5352b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void update(Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f5353c.put(billingInfo.productId, billingInfo);
        }
        this.f5351a.saveInfo(c2.e.Y(this.f5353c.values()), this.f5352b);
    }
}
