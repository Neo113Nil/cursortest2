package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import c3.C0292d;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import d3.g;
import d3.t;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;

/* loaded from: classes.dex */
public final class b implements ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final a f9419a;

    /* renamed from: b, reason: collision with root package name */
    public final ClientContext f9420b;

    public b(a aVar, ClientContext clientContext) {
        this.f9419a = aVar;
        this.f9420b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "AppLovin";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        String str;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, MaxAd.class, AppLovinSdk.class)) {
            return false;
        }
        Object U4 = g.U(0, objArr);
        if (U4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.mediation.MaxAd");
        }
        MaxAd maxAd = (MaxAd) U4;
        Object U5 = g.U(1, objArr);
        if (U5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
        }
        AppLovinSdk appLovinSdk = (AppLovinSdk) U5;
        this.f9419a.getClass();
        MaxAdFormat format = maxAd.getFormat();
        ModuleAdType moduleAdType = format == null ? null : format.equals(MaxAdFormat.NATIVE) ? ModuleAdType.NATIVE : format.equals(MaxAdFormat.BANNER) ? ModuleAdType.BANNER : format.equals(MaxAdFormat.REWARDED) ? ModuleAdType.REWARDED : format.equals(MaxAdFormat.INTERSTITIAL) ? ModuleAdType.INTERSTITIAL : format.equals(MaxAdFormat.MREC) ? ModuleAdType.MREC : ModuleAdType.OTHER;
        C0292d c0292d = new C0292d("countryCode", appLovinSdk.getConfiguration().getCountryCode());
        C0292d c0292d2 = new C0292d(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-applovin-v12");
        MaxAdFormat format2 = maxAd.getFormat();
        if (format2 == null || (str = format2.getLabel()) == null) {
            str = "null";
        }
        this.f9420b.getInternalClientModuleFacade().reportAdRevenue(new ModuleAdRevenue(BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), 0.0d)), Currency.getInstance("USD"), moduleAdType, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), t.C(c0292d, c0292d2, new C0292d(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str), new C0292d(AdRevenueConstants.SOURCE_KEY, "applovin")), false, 32, null));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AppLovin with values " + Arrays.toString(objArr) + " was reported", new Object[0]);
        return true;
    }
}
