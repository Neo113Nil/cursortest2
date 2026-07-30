package com.appsflyer.internal;

import R5.InterfaceC0168h;
import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFf1oSDK {
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);
    private static final long component4 = TimeUnit.HOURS.toSeconds(24);
    private final InterfaceC0168h AFAdRevenueData;
    private final AFf1pSDK getCurrencyIso4217Code;
    private final AFc1gSDK getMediationNetwork;
    private final InterfaceC0168h getMonetizationNetwork;
    private final AFc1kSDK getRevenue;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFf1oSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.p implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1oSDK.this.getRevenue.getMonetizationNetwork("com.appsflyer.rc.sandbox")));
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFf1oSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends kotlin.jvm.internal.p implements Function0<Boolean> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1oSDK.this.getRevenue.getMonetizationNetwork("com.appsflyer.rc.staging")));
        }
    }

    @Metadata
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFf1oSDK(AFc1kSDK aFc1kSDK, AFf1pSDK aFf1pSDK, AFc1gSDK aFc1gSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFf1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        this.getRevenue = aFc1kSDK;
        this.getCurrencyIso4217Code = aFf1pSDK;
        this.getMediationNetwork = aFc1gSDK;
        this.AFAdRevenueData = R5.i.b(new AnonymousClass1());
        this.getMonetizationNetwork = R5.i.b(new AnonymousClass5());
    }

    public final boolean AFAdRevenueData() {
        return ((Boolean) this.AFAdRevenueData.getValue()).booleanValue();
    }

    public final boolean getCurrencyIso4217Code() {
        return ((Boolean) this.getMonetizationNetwork.getValue()).booleanValue();
    }

    public final boolean getMonetizationNetwork() {
        AFi1zSDK aFi1zSDK;
        if (this.getMediationNetwork.hashCode == null) {
            AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "Cold start - fetching config", false, 4, null);
            return true;
        }
        AFh1cSDK aFh1cSDK = this.getCurrencyIso4217Code.AFAdRevenueData;
        if (aFh1cSDK == null) {
            AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1aSDK aFh1aSDK = aFh1cSDK.getMediationNetwork;
        boolean monetizationNetwork = (aFh1aSDK == null || (aFi1zSDK = aFh1aSDK.AFAdRevenueData) == null) ? false : aFi1zSDK.getMonetizationNetwork();
        long currentTimeMillis = System.currentTimeMillis();
        AFf1pSDK aFf1pSDK = this.getCurrencyIso4217Code;
        return monetizationNetwork || currentTimeMillis - aFf1pSDK.getRevenue > TimeUnit.SECONDS.toMillis(aFf1pSDK.getMediationNetwork);
    }

    public final long getRevenue() {
        Object n7;
        String monetizationNetwork = this.getRevenue.getMonetizationNetwork("com.appsflyer.rc.cache.max-age-fallback");
        if (monetizationNetwork == null) {
            return component4;
        }
        try {
            R5.l lVar = R5.n.f2421d;
            n7 = Long.valueOf(Long.parseLong(monetizationNetwork));
        } catch (Throwable th) {
            R5.l lVar2 = R5.n.f2421d;
            n7 = V6.b.n(th);
        }
        Throwable a7 = R5.n.a(n7);
        if (a7 != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + a7.getMessage(), a7);
            n7 = Long.valueOf(component4);
        }
        return ((Number) n7).longValue();
    }
}
