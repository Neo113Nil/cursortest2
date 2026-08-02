package io.appmetrica.analytics.adrevenue.ironsource.v7.impl;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import java.math.BigDecimal;
import java.util.Currency;

/* loaded from: classes.dex */
public final class c implements ImpressionDataListener {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f5190a;

    /* renamed from: b, reason: collision with root package name */
    public final b f5191b = new b();

    public c(ClientContext clientContext) {
        this.f5190a = clientContext;
    }

    public final void onImpressionSuccess(ImpressionData impressionData) {
        ModuleAdType moduleAdType;
        if (impressionData != null) {
            InternalClientModuleFacade internalClientModuleFacade = this.f5190a.getInternalClientModuleFacade();
            this.f5191b.getClass();
            String adUnit = impressionData.getAdUnit();
            BigDecimal valueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(impressionData.getRevenue().doubleValue(), 0.0d));
            Currency currency = Currency.getInstance("USD");
            if (adUnit != null) {
                switch (adUnit) {
                    case "Rewarded Video":
                        moduleAdType = ModuleAdType.REWARDED;
                        break;
                    case "Interstitial":
                        moduleAdType = ModuleAdType.INTERSTITIAL;
                        break;
                    case "Banner":
                        moduleAdType = ModuleAdType.BANNER;
                        break;
                    default:
                        moduleAdType = ModuleAdType.OTHER;
                        break;
                }
            } else {
                moduleAdType = null;
            }
            internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(valueOf, currency, moduleAdType, impressionData.getAdNetwork(), null, null, null, impressionData.getPlacement(), impressionData.getPrecision(), new a(adUnit), true));
        }
    }
}
