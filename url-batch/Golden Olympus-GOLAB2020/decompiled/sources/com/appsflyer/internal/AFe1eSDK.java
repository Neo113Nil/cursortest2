package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1vSDK;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.ge;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
/* loaded from: classes.dex */
public final class AFe1eSDK extends AFe1sSDK<AFh1oSDK> {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    private final AFc1iSDK areAllFieldsValid;
    private final AFh1oSDK component1;
    private final AFc1kSDK component2;
    private final AFc1pSDK component3;
    private final W1.h component4;
    private final W1.h equals;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFe1eSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.jvm.internal.s implements Function0<Boolean> {
        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFe1eSDK.this.component3.getCurrencyIso4217Code("com.appsflyer.enable_instant_plays")));
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFe1eSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.jvm.internal.s implements Function0<Long> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Long n4;
            String currencyIso4217Code = AFe1eSDK.this.component3.getCurrencyIso4217Code("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((currencyIso4217Code == null || (n4 = StringsKt.n(currencyIso4217Code)) == null) ? 1000L : n4.longValue());
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

    @Metadata
    static final class AFa1ySDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1ySDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1ySDK copy$default(AFa1ySDK aFa1ySDK, String str, Boolean bool, boolean z4, StringBuilder sb, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = aFa1ySDK.advertisingId;
            }
            if ((i4 & 2) != 0) {
                bool = aFa1ySDK.isLimitAdTrackingEnabled;
            }
            if ((i4 & 4) != 0) {
                z4 = aFa1ySDK.advertisingIdWithGps;
            }
            if ((i4 & 8) != 0) {
                sb = aFa1ySDK.gaidError;
            }
            return aFa1ySDK.copy(str, bool, z4, sb);
        }

        public final String component1() {
            return this.advertisingId;
        }

        public final Boolean component2() {
            return this.isLimitAdTrackingEnabled;
        }

        public final boolean component3() {
            return this.advertisingIdWithGps;
        }

        public final StringBuilder component4() {
            return this.gaidError;
        }

        public final AFa1ySDK copy(String str, Boolean bool, boolean z4, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1ySDK(str, bool, z4, gaidError);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1ySDK)) {
                return false;
            }
            AFa1ySDK aFa1ySDK = (AFa1ySDK) obj;
            return Intrinsics.areEqual(this.advertisingId, aFa1ySDK.advertisingId) && Intrinsics.areEqual(this.isLimitAdTrackingEnabled, aFa1ySDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1ySDK.advertisingIdWithGps && Intrinsics.areEqual(this.gaidError, aFa1ySDK.gaidError);
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.advertisingId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z4 = this.advertisingIdWithGps;
            int i4 = z4;
            if (z4 != 0) {
                i4 = 1;
            }
            return ((hashCode2 + i4) * 31) + this.gaidError.hashCode();
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z4) {
            this.advertisingIdWithGps = z4;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public AFa1ySDK(String str, Boolean bool, boolean z4, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z4;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1ySDK(String str, Boolean bool, boolean z4, StringBuilder sb, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : bool, (i4 & 4) != 0 ? false : z4, (i4 & 8) != 0 ? new StringBuilder() : sb);
        }
    }

    @Metadata
    public static final class AFa1zSDK implements CloudDevCallback {
        final /* synthetic */ AFa1ySDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        AFa1zSDK(AFa1ySDK aFa1ySDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1ySDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFg1gSDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: " + reason, false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get(ge.f16424S0));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1eSDK(AFc1dSDK aFc1dSDK) {
        super(AFe1mSDK.FETCH_ADVERTISING_ID, new AFe1mSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        AFc1iSDK AFInAppEventType = aFc1dSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.areAllFieldsValid = AFInAppEventType;
        AFc1pSDK revenue = aFc1dSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        this.component3 = revenue;
        AFc1kSDK afInfoLog = aFc1dSDK.afInfoLog();
        Intrinsics.checkNotNullExpressionValue(afInfoLog, "");
        this.component2 = afInfoLog;
        this.component1 = new AFh1oSDK(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
        this.component4 = W1.i.b(new AnonymousClass4());
        this.equals = W1.i.b(new AnonymousClass3());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean AFAdRevenueData(int i4) {
        boolean z4;
        String obj;
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        AFa1ySDK aFa1ySDK = new AFa1ySDK(null, null, false, null, 15, null);
        Context context = this.areAllFieldsValid.getMonetizationNetwork;
        Intrinsics.checkNotNull(context);
        int currencyIso4217Code = getCurrencyIso4217Code(context);
        Context context2 = this.areAllFieldsValid.getMonetizationNetwork;
        Intrinsics.checkNotNull(context2);
        if (!getCurrencyIso4217Code(context2, aFa1ySDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.areAllFieldsValid.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                if (AFAdRevenueData(context3, aFa1ySDK)) {
                    z4 = true;
                    obj = aFa1ySDK.getGaidError().toString();
                    if (obj != null && !StringsKt.z(obj)) {
                        obj = currencyIso4217Code + ": " + StringsKt.W0(obj).toString();
                    }
                    AFAdRevenueData(this.component1, obj);
                    if (!z4) {
                        return false;
                    }
                }
            }
            z4 = false;
            obj = aFa1ySDK.getGaidError().toString();
            if (obj != null) {
                obj = currencyIso4217Code + ": " + StringsKt.W0(obj).toString();
            }
            AFAdRevenueData(this.component1, obj);
            if (!z4) {
            }
        }
        AFh1oSDK aFh1oSDK = this.component1;
        aFh1oSDK.AFAdRevenueData = aFa1ySDK.getAdvertisingId();
        aFh1oSDK.getRevenue = aFa1ySDK.isLimitAdTrackingEnabled();
        aFh1oSDK.getMonetizationNetwork = aFa1ySDK.isLimitAdTrackingEnabled() != null ? Boolean.valueOf(!r1.booleanValue()) : null;
        aFh1oSDK.getMediationNetwork = Boolean.valueOf(aFa1ySDK.getAdvertisingIdWithGps());
        aFh1oSDK.getCurrencyIso4217Code = Boolean.FALSE;
        aFh1oSDK.component2 = Boolean.valueOf(i4 != 2);
        return true;
    }

    private final boolean component1() {
        return ((Boolean) this.equals.getValue()).booleanValue();
    }

    private static boolean component3() {
        String str;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            if (th instanceof ClassNotFoundException) {
                str = "CloudDevSdk not found";
            } else {
                str = "Unexpected exception while checking if running in cloud environment: " + th.getMessage();
            }
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th, true, false, false, false, InterfaceC1490j3.d.b.f16818j, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[LOOP:0: B:2:0x0005->B:10:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[EDGE_INSN: B:11:0x0048->B:12:0x0048 BREAK  A[LOOP:0: B:2:0x0005->B:10:0x0045], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean equals() {
        boolean z4 = false;
        for (int i4 = 2; i4 > 0; i4--) {
            if (component1() && getMediationNetwork(i4)) {
                AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else if (!AFAdRevenueData(i4)) {
                AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                z4 = false;
                if (!z4) {
                    break;
                }
            } else {
                AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
            }
            z4 = true;
            if (!z4) {
            }
        }
        this.component2.component3 = this.component1;
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        AFAdRevenueData(r20.component1, r9.getGaidError().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d5, code lost:
    
        r0 = r9.getAdvertisingId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d9, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00df, code lost:
    
        if (r0.length() != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e2, code lost:
    
        r0 = r20.component1;
        r0.AFAdRevenueData = r9.getAdvertisingId();
        r3 = java.lang.Boolean.FALSE;
        r0.getRevenue = r3;
        r4 = java.lang.Boolean.TRUE;
        r0.getMonetizationNetwork = r4;
        r0.getMediationNetwork = r3;
        r0.getCurrencyIso4217Code = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f9, code lost:
    
        if (r21 == 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fb, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fc, code lost:
    
        r0.component2 = java.lang.Boolean.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0102, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0103, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        if (r9.getGaidError().length() <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        if (r9.getGaidError().length() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMonetizationNetwork(int i4) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        boolean z4 = false;
        if (component3()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.areAllFieldsValid.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1ySDK aFa1ySDK = new AFa1ySDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.areAllFieldsValid.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context2);
                    cloudDevSdk2.request(context2, CollectionsKt.listOf(ge.f16424S0), new AFa1zSDK(aFa1ySDK, countDownLatch));
                    countDownLatch.await(((Number) this.component4.getValue()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th.getMessage();
                        }
                        AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th, true, false, false, false, InterfaceC1490j3.d.b.f16818j, null);
                        StringBuilder gaidError = aFa1ySDK.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
                    } catch (Throwable th2) {
                        if (aFa1ySDK.getGaidError().length() > 0) {
                            AFAdRevenueData(this.component1, aFa1ySDK.getGaidError().toString());
                        }
                        throw th2;
                    }
                }
            }
        }
        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final AFe1rSDK getCurrencyIso4217Code() {
        if (this.component2.getMonetizationNetwork()) {
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1rSDK.FAILURE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Boolean valueOf = Boolean.valueOf(equals());
        Boolean bool = Boolean.FALSE;
        AFe1rSDK aFe1rSDK = CollectionsKt.listOf((Object[]) new Boolean[]{valueOf, bool, bool}).contains(Boolean.TRUE) ? AFe1rSDK.SUCCESS : AFe1rSDK.FAILURE;
        AFc1kSDK aFc1kSDK = this.component2;
        AFd1hSDK aFd1hSDK = new AFd1hSDK(System.currentTimeMillis() - currentTimeMillis);
        AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1hSDK.getRevenue + "ms", false, 4, null);
        aFc1kSDK.getRevenue(aFd1hSDK);
        return aFe1rSDK;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    private final boolean getMediationNetwork(int i4) {
        return getMonetizationNetwork(i4);
    }

    private static int getCurrencyIso4217Code(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    private final boolean getCurrencyIso4217Code(Context context, AFa1ySDK aFa1ySDK) {
        Unit unit;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                aFa1ySDK.setAdvertisingId(advertisingIdInfo.getId());
                aFa1ySDK.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                aFa1ySDK.setAdvertisingIdWithGps(true);
                String advertisingId = aFa1ySDK.getAdvertisingId();
                if (advertisingId != null) {
                    if (advertisingId.length() == 0) {
                    }
                    unit = Unit.f41027a;
                }
                aFa1ySDK.getGaidError().append("emptyOrNull |");
                unit = Unit.f41027a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            aFa1ySDK.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFg1gSDK.e$default(aFLogger, aFg1cSDK, "Google Play Services is missing " + th.getMessage(), th, false, false, false, false, 88, null);
            StringBuilder gaidError = aFa1ySDK.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:2:0x0000, B:4:0x001a, B:7:0x002e, B:11:0x0034, B:12:0x0044, B:14:0x0025), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean AFAdRevenueData(Context context, AFa1ySDK aFa1ySDK) {
        try {
            AFb1vSDK.AFa1vSDK AFAdRevenueData = AFb1vSDK.AFAdRevenueData(context);
            aFa1ySDK.setAdvertisingId(AFAdRevenueData.AFAdRevenueData);
            aFa1ySDK.setLimitAdTrackingEnabled(Boolean.valueOf(AFAdRevenueData.getCurrencyIso4217Code()));
            String advertisingId = aFa1ySDK.getAdvertisingId();
            if (advertisingId != null) {
                if (advertisingId.length() == 0) {
                }
                if (Unit.f41027a == null) {
                    return true;
                }
                aFa1ySDK.getGaidError().append("gpsAdInfo-null (bypass) |");
                throw new IllegalStateException("GpsAdInfo is null (bypass)");
            }
            aFa1ySDK.getGaidError().append("emptyOrNull (bypass) |");
            if (Unit.f41027a == null) {
            }
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFg1gSDK.e$default(aFLogger, aFg1cSDK, "Failed to fetch GAID: " + th.getMessage(), th, true, false, false, false, 64, null);
            StringBuilder gaidError = aFa1ySDK.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, localizedMessage, false, 4, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return ((Number) this.component4.getValue()).longValue();
    }

    private static void AFAdRevenueData(AFh1oSDK aFh1oSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1oSDK.areAllFieldsValid;
        if (str2 != null) {
            String str3 = str2 + " | " + str;
            if (str3 != null) {
                str = str3;
            }
        }
        aFh1oSDK.areAllFieldsValid = str;
    }
}
