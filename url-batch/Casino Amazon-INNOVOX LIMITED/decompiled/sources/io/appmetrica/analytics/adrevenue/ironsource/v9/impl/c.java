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

/* loaded from: classes3.dex */
public final class c implements LevelPlayImpressionDataListener {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f565a;
    public final b b = new b();

    public c(ClientContext clientContext) {
        this.f565a = clientContext;
    }

    public final void onImpressionSuccess(LevelPlayImpressionData levelPlayImpressionData) {
        ModuleAdType moduleAdType;
        if (levelPlayImpressionData != null) {
            InternalClientModuleFacade internalClientModuleFacade = this.f565a.getInternalClientModuleFacade();
            this.b.getClass();
            String adFormat = levelPlayImpressionData.getAdFormat();
            BigDecimal valueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefaultNullable(levelPlayImpressionData.getRevenue(), 0.0d));
            Currency currency = Currency.getInstance("USD");
            if (adFormat != null) {
                adFormat.hashCode();
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
