package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFf1iSDK {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    private static final long getMonetizationNetwork = TimeUnit.HOURS.toSeconds(24);
    private final AFf1lSDK AFAdRevenueData;
    private final W1.h getCurrencyIso4217Code;
    private final AFc1pSDK getMediationNetwork;
    private final W1.h getRevenue;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFf1iSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.jvm.internal.s implements Function0<Boolean> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1iSDK.this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.sandbox")));
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFf1iSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends kotlin.jvm.internal.s implements Function0<Boolean> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1iSDK.this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.staging")));
        }
    }

    @Metadata
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFf1iSDK(AFc1pSDK aFc1pSDK, AFf1lSDK aFf1lSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1lSDK, "");
        this.getMediationNetwork = aFc1pSDK;
        this.AFAdRevenueData = aFf1lSDK;
        this.getRevenue = W1.i.b(new AnonymousClass4());
        this.getCurrencyIso4217Code = W1.i.b(new AnonymousClass5());
    }

    public final long AFAdRevenueData() {
        Object m243constructorimpl;
        String currencyIso4217Code = this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.cache.max-age-fallback");
        if (currencyIso4217Code == null) {
            return getMonetizationNetwork;
        }
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(Long.valueOf(Long.parseLong(currencyIso4217Code)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + d4.getMessage(), d4);
            m243constructorimpl = Long.valueOf(getMonetizationNetwork);
        }
        return ((Number) m243constructorimpl).longValue();
    }

    public final boolean getMediationNetwork() {
        AFi1xSDK aFi1xSDK;
        AFi1wSDK aFi1wSDK = this.AFAdRevenueData.getCurrencyIso4217Code;
        if (aFi1wSDK == null) {
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1cSDK aFh1cSDK = aFi1wSDK.getMonetizationNetwork;
        boolean currencyIso4217Code = (aFh1cSDK == null || (aFi1xSDK = aFh1cSDK.AFAdRevenueData) == null) ? false : aFi1xSDK.getCurrencyIso4217Code();
        long currentTimeMillis = System.currentTimeMillis();
        AFf1lSDK aFf1lSDK = this.AFAdRevenueData;
        return currencyIso4217Code || currentTimeMillis - aFf1lSDK.getMediationNetwork > TimeUnit.SECONDS.toMillis(aFf1lSDK.getRevenue);
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }

    public final boolean getRevenue() {
        return ((Boolean) this.getCurrencyIso4217Code.getValue()).booleanValue();
    }
}
