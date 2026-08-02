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
    public final BillingInfoStorage f9547a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9548b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f9549c;

    public c(BillingInfoStorage billingInfoStorage) {
        this.f9547a = billingInfoStorage;
        this.f9548b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f9549c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final BillingInfo get(String str) {
        return (BillingInfo) this.f9549c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final boolean isFirstInappCheckOccurred() {
        return this.f9548b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void markFirstInappCheckOccurred() {
        if (this.f9548b) {
            return;
        }
        this.f9548b = true;
        this.f9547a.saveInfo(d3.i.n0(this.f9549c.values()), this.f9548b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void update(Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f9549c.put(billingInfo.productId, billingInfo);
        }
        this.f9547a.saveInfo(d3.i.n0(this.f9549c.values()), this.f9548b);
    }
}
