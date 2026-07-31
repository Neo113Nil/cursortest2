package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c implements BillingInfoManager {

    /* renamed from: a, reason: collision with root package name */
    public final BillingInfoStorage f36894a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f36895b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f36896c;

    public c(@NotNull BillingInfoStorage billingInfoStorage) {
        this.f36894a = billingInfoStorage;
        this.f36895b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f36896c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @Nullable
    public final BillingInfo get(@NotNull String str) {
        return (BillingInfo) this.f36896c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final boolean isFirstInappCheckOccurred() {
        return this.f36895b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void markFirstInappCheckOccurred() {
        if (this.f36895b) {
            return;
        }
        this.f36895b = true;
        this.f36894a.saveInfo(CollectionsKt.toList(this.f36896c.values()), this.f36895b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void update(@NotNull Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f36896c.put(billingInfo.productId, billingInfo);
        }
        this.f36894a.saveInfo(CollectionsKt.toList(this.f36896c.values()), this.f36895b);
    }
}
