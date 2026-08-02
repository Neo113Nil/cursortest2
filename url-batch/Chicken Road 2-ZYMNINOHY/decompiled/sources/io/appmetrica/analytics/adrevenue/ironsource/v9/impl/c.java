package io.appmetrica.analytics.adrevenue.ironsource.v9.impl;

import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import java.math.BigDecimal;
import java.util.Currency;

/* loaded from: classes.dex */
public final class c implements LevelPlayImpressionDataListener {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9430a;

    /* renamed from: b, reason: collision with root package name */
    public final b f9431b = new b();

    public c(ClientContext clientContext) {
        this.f9430a = clientContext;
    }

    public final void onImpressionSuccess(LevelPlayImpressionData levelPlayImpressionData) {
        ModuleAdType moduleAdType;
        if (levelPlayImpressionData != null) {
            InternalClientModuleFacade internalClientModuleFacade = this.f9430a.getInternalClientModuleFacade();
            this.f9431b.getClass();
            String adFormat = levelPlayImpressionData.getAdFormat();
            BigDecimal valueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefaultNullable(levelPlayImpressionData.getRevenue(), 0.0d));
            Currency currency = Currency.getInstance("USD");
            if (adFormat != null) {
                switch (adFormat) {
                    case "banner":
                        moduleAdType = ModuleAdType.BANNER;
                        break;
                    case "rewarded_video":
                        moduleAdType = ModuleAdType.REWARDED;
                        break;
                    case "interstitial":
                        moduleAdType = ModuleAdType.INTERSTITIAL;
                        break;
                    default:
                        moduleAdType = ModuleAdType.OTHER;
                        break;
                }
            } else {
                moduleAdType = null;
            }
            internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(valueOf, currency, moduleAdType, levelPlayImpressionData.getAdNetwork(), levelPlayImpressionData.getMediationAdUnitId(), levelPlayImpressionData.getMediationAdUnitName(), null, levelPlayImpressionData.getPlacement(), levelPlayImpressionData.getPrecision(), new a(adFormat), true));
        }
    }
}
