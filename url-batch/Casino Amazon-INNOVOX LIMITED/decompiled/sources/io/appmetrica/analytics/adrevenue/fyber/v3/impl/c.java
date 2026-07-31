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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class c implements ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final b f561a;
    public final ClientContext b;

    public c(b bVar, ClientContext clientContext) {
        this.f561a = bVar;
        this.b = clientContext;
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
        InternalClientModuleFacade internalClientModuleFacade = this.b.getInternalClientModuleFacade();
        this.f561a.getClass();
        PlacementType placementType = impressionData.getPlacementType();
        BigDecimal valueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(impressionData.getNetPayout(), 0.0d));
        Currency currency = Currency.getInstance(impressionData.getCurrency());
        if (placementType == null) {
            moduleAdType = null;
        } else {
            int i = a.f560a[placementType.ordinal()];
            moduleAdType = i != 1 ? i != 2 ? i != 3 ? ModuleAdType.OTHER : ModuleAdType.INTERSTITIAL : ModuleAdType.REWARDED : ModuleAdType.BANNER;
        }
        String demandSource = impressionData.getDemandSource();
        String creativeId = impressionData.getCreativeId();
        String obj = impressionData.getPriceAccuracy().toString();
        HashMap hashMap = new HashMap();
        hashMap.put("source", "fyber");
        hashMap.put(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-fyber-v3");
        hashMap.put(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, placementType == null ? AbstractJsonLexerKt.NULL : placementType.name());
        internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(valueOf, currency, moduleAdType, demandSource, creativeId, null, null, null, obj, hashMap, false));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from Fyber was reported", new Object[0]);
        return true;
    }
}
