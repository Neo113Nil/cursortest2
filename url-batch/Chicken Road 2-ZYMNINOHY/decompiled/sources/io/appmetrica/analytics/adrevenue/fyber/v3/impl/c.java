package io.appmetrica.analytics.adrevenue.fyber.v3.impl;

import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.PlacementType;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c implements ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final b f9423a;

    /* renamed from: b, reason: collision with root package name */
    public final ClientContext f9424b;

    public c(b bVar, ClientContext clientContext) {
        this.f9423a = bVar;
        this.f9424b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "Fyber";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        ModuleAdType moduleAdType;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, ImpressionData.class)) {
            return false;
        }
        ImpressionData impressionData = (ImpressionData) objArr[0];
        InternalClientModuleFacade internalClientModuleFacade = this.f9424b.getInternalClientModuleFacade();
        this.f9423a.getClass();
        PlacementType placementType = impressionData.getPlacementType();
        BigDecimal valueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(impressionData.getNetPayout(), 0.0d));
        Currency currency = Currency.getInstance(impressionData.getCurrency());
        if (placementType == null) {
            moduleAdType = null;
        } else {
            int i4 = a.f9422a[placementType.ordinal()];
            moduleAdType = i4 != 1 ? i4 != 2 ? i4 != 3 ? ModuleAdType.OTHER : ModuleAdType.INTERSTITIAL : ModuleAdType.REWARDED : ModuleAdType.BANNER;
        }
        String demandSource = impressionData.getDemandSource();
        ModuleAdType moduleAdType2 = moduleAdType;
        String creativeId = impressionData.getCreativeId();
        String obj = impressionData.getPriceAccuracy().toString();
        HashMap hashMap = new HashMap();
        hashMap.put(AdRevenueConstants.SOURCE_KEY, "fyber");
        hashMap.put(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-fyber-v3");
        hashMap.put(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, placementType == null ? "null" : placementType.name());
        internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(valueOf, currency, moduleAdType2, demandSource, creativeId, null, null, null, obj, hashMap, false));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from Fyber was reported", new Object[0]);
        return true;
    }
}
