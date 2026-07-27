package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o implements UpdatePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f6094a;

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (kotlin.jvm.internal.i.a(r3.purchaseToken, r2.purchaseToken) != false) goto L22;
     */
    @Override // io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, BillingInfo> getBillingInfoToUpdate(BillingConfig billingConfig, Map<String, ? extends BillingInfo> map, BillingInfoManager billingInfoManager) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends BillingInfo> entry : map.entrySet()) {
            BillingInfo value = entry.getValue();
            if (value.type != ProductType.INAPP || billingInfoManager.isFirstInappCheckOccurred()) {
                BillingInfo billingInfo = billingInfoManager.get(value.productId);
                if (billingInfo != null) {
                }
                if (this.f6094a.currentTimeMillis() - value.purchaseTime > TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds)) {
                    if (value.type == ProductType.SUBS) {
                    }
                    if (billingInfo != null && value.type == ProductType.SUBS && this.f6094a.currentTimeMillis() - billingInfo.sendTime >= TimeUnit.SECONDS.toMillis(billingConfig.sendFrequencySeconds)) {
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            } else if (this.f6094a.currentTimeMillis() - value.purchaseTime <= TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public o(SystemTimeProvider systemTimeProvider) {
        this.f6094a = systemTimeProvider;
    }

    public /* synthetic */ o(SystemTimeProvider systemTimeProvider, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new SystemTimeProvider() : systemTimeProvider);
    }
}
