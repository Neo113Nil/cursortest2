package io.appmetrica.analytics.billingv8.impl;

import g4.AbstractC0465j;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements BillingInfoManager {

    /* renamed from: a, reason: collision with root package name */
    public final BillingInfoStorage f6111a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6112b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f6113c;

    public c(BillingInfoStorage billingInfoStorage) {
        this.f6111a = billingInfoStorage;
        this.f6112b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f6113c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final BillingInfo get(String str) {
        return (BillingInfo) this.f6113c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final boolean isFirstInappCheckOccurred() {
        return this.f6112b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void markFirstInappCheckOccurred() {
        if (this.f6112b) {
            return;
        }
        this.f6112b = true;
        this.f6111a.saveInfo(AbstractC0465j.S0(this.f6113c.values()), this.f6112b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void update(Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f6113c.put(billingInfo.productId, billingInfo);
        }
        this.f6111a.saveInfo(AbstractC0465j.S0(this.f6113c.values()), this.f6112b);
    }
}
