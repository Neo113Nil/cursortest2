package com.appsflyer.internal;

import R5.InterfaceC0168h;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1vSDK;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import h0.C0464j;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m1.C0686a;

@Metadata
/* loaded from: classes.dex */
public final class AFe1jSDK extends AFe1uSDK<AFh1rSDK> {
    public static final AFa1uSDK AFa1uSDK = new AFa1uSDK(null);
    private final AFh1rSDK areAllFieldsValid;
    private final AFc1kSDK component1;
    private final AFc1fSDK component2;
    private final AFc1gSDK component3;
    private final InterfaceC0168h component4;
    private final InterfaceC0168h toString;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFe1jSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.p implements Function0<Boolean> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFe1jSDK.this.component1.getMonetizationNetwork("com.appsflyer.enable_instant_plays")));
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFe1jSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends kotlin.jvm.internal.p implements Function0<Long> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Long I7;
            String monetizationNetwork = AFe1jSDK.this.component1.getMonetizationNetwork("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((monetizationNetwork == null || (I7 = StringsKt.I(monetizationNetwork)) == null) ? 1000L : I7.longValue());
        }
    }

    @Metadata
    public static final class AFa1tSDK implements CloudDevCallback {
        final /* synthetic */ AFa1vSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1tSDK(AFa1vSDK aFa1vSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1vSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFg1hSDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, r4.f.i("Could not fetch GAID using CloudDevSdk: ", reason), false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    @Metadata
    public static final class AFa1uSDK {
        private AFa1uSDK() {
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    public static final class AFa1vSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1vSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1vSDK copy$default(AFa1vSDK aFa1vSDK, String str, Boolean bool, boolean z7, StringBuilder sb, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aFa1vSDK.advertisingId;
            }
            if ((i2 & 2) != 0) {
                bool = aFa1vSDK.isLimitAdTrackingEnabled;
            }
            if ((i2 & 4) != 0) {
                z7 = aFa1vSDK.advertisingIdWithGps;
            }
            if ((i2 & 8) != 0) {
                sb = aFa1vSDK.gaidError;
            }
            return aFa1vSDK.copy(str, bool, z7, sb);
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

        public final AFa1vSDK copy(String str, Boolean bool, boolean z7, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1vSDK(str, bool, z7, gaidError);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1vSDK)) {
                return false;
            }
            AFa1vSDK aFa1vSDK = (AFa1vSDK) obj;
            return Intrinsics.a(this.advertisingId, aFa1vSDK.advertisingId) && Intrinsics.a(this.isLimitAdTrackingEnabled, aFa1vSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1vSDK.advertisingIdWithGps && Intrinsics.a(this.gaidError, aFa1vSDK.gaidError);
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
            boolean z7 = this.advertisingIdWithGps;
            int i2 = z7;
            if (z7 != 0) {
                i2 = 1;
            }
            return this.gaidError.hashCode() + ((hashCode2 + i2) * 31);
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z7) {
            this.advertisingIdWithGps = z7;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public AFa1vSDK(String str, Boolean bool, boolean z7, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z7;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1vSDK(String str, Boolean bool, boolean z7, StringBuilder sb, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? false : z7, (i2 & 8) != 0 ? new StringBuilder() : sb);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1jSDK(AFd1zSDK aFd1zSDK) {
        super(AFe1lSDK.FETCH_ADVERTISING_ID, new AFe1lSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        AFc1fSDK registerClient = aFd1zSDK.registerClient();
        Intrinsics.checkNotNullExpressionValue(registerClient, "");
        this.component2 = registerClient;
        AFc1kSDK AFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        this.component1 = AFAdRevenueData;
        AFc1gSDK e7 = aFd1zSDK.e();
        Intrinsics.checkNotNullExpressionValue(e7, "");
        this.component3 = e7;
        this.areAllFieldsValid = new AFh1rSDK(null, null, null, null, null, null, null, null, 255, null);
        this.component4 = R5.i.b(new AnonymousClass3());
        this.toString = R5.i.b(new AnonymousClass2());
    }

    private final boolean areAllFieldsValid() {
        return ((Boolean) this.toString.getValue()).booleanValue();
    }

    private static boolean component1() {
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, th instanceof ClassNotFoundException ? "CloudDevSdk not found" : r4.f.i("Unexpected exception while checking if running in cloud environment: ", th.getMessage()), th, true, false, false, false, 112, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[LOOP:0: B:2:0x0005->B:10:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[EDGE_INSN: B:11:0x0048->B:12:0x0048 BREAK  A[LOOP:0: B:2:0x0005->B:10:0x0045], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean copy() {
        boolean z7 = false;
        for (int i2 = 2; i2 > 0; i2--) {
            if (areAllFieldsValid() && getMediationNetwork(i2)) {
                AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else if (!getMonetizationNetwork(i2)) {
                AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                z7 = false;
                if (!z7) {
                    break;
                }
            } else {
                AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
            }
            z7 = true;
            if (!z7) {
            }
        }
        this.component3.component2 = this.areAllFieldsValid;
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMonetizationNetwork(int i2) {
        boolean z7;
        String obj;
        AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        AFa1vSDK aFa1vSDK = new AFa1vSDK(null, null, false, null, 15, null);
        Context context = this.component2.getCurrencyIso4217Code;
        Intrinsics.b(context);
        int mediationNetwork = getMediationNetwork(context);
        Context context2 = this.component2.getCurrencyIso4217Code;
        Intrinsics.b(context2);
        if (!getCurrencyIso4217Code(context2, aFa1vSDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.component2.getCurrencyIso4217Code;
                Intrinsics.b(context3);
                if (getRevenue(context3, aFa1vSDK)) {
                    z7 = true;
                    obj = aFa1vSDK.getGaidError().toString();
                    if (obj != null && !StringsKt.z(obj)) {
                        obj = mediationNetwork + ": " + StringsKt.J(obj).toString();
                    }
                    getMonetizationNetwork(this.areAllFieldsValid, obj);
                    if (!z7) {
                        return false;
                    }
                }
            }
            z7 = false;
            obj = aFa1vSDK.getGaidError().toString();
            if (obj != null) {
                obj = mediationNetwork + ": " + StringsKt.J(obj).toString();
            }
            getMonetizationNetwork(this.areAllFieldsValid, obj);
            if (!z7) {
            }
        }
        AFh1rSDK aFh1rSDK = this.areAllFieldsValid;
        aFh1rSDK.getMonetizationNetwork = aFa1vSDK.getAdvertisingId();
        aFh1rSDK.AFAdRevenueData = aFa1vSDK.isLimitAdTrackingEnabled();
        aFh1rSDK.getMediationNetwork = aFa1vSDK.isLimitAdTrackingEnabled() != null ? Boolean.valueOf(!r1.booleanValue()) : null;
        aFh1rSDK.getCurrencyIso4217Code = Boolean.valueOf(aFa1vSDK.getAdvertisingIdWithGps());
        aFh1rSDK.getRevenue = Boolean.FALSE;
        aFh1rSDK.component1 = Boolean.valueOf(i2 != 2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:2:0x0000, B:4:0x001a, B:7:0x002e, B:11:0x0034, B:12:0x0044, B:14:0x0025), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getRevenue(Context context, AFa1vSDK aFa1vSDK) {
        try {
            AFb1vSDK.AFa1vSDK mediationNetwork = AFb1vSDK.getMediationNetwork(context);
            aFa1vSDK.setAdvertisingId(mediationNetwork.getCurrencyIso4217Code);
            aFa1vSDK.setLimitAdTrackingEnabled(Boolean.valueOf(mediationNetwork.AFAdRevenueData()));
            String advertisingId = aFa1vSDK.getAdvertisingId();
            if (advertisingId != null) {
                if (advertisingId.length() == 0) {
                }
                if (Unit.f6114a == null) {
                    return true;
                }
                aFa1vSDK.getGaidError().append("gpsAdInfo-null (bypass) |");
                throw new IllegalStateException("GpsAdInfo is null (bypass)");
            }
            aFa1vSDK.getGaidError().append("emptyOrNull (bypass) |");
            if (Unit.f6114a == null) {
            }
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFg1hSDK.e$default(aFLogger, aFg1cSDK, r4.f.i("Failed to fetch GAID: ", th.getMessage()), th, true, false, false, false, 64, null);
            StringBuilder gaidError = aFa1vSDK.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFg1hSDK.i$default(aFLogger, aFg1cSDK, localizedMessage, false, 4, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final AFe1rSDK getMediationNetwork() {
        if (this.component3.AFAdRevenueData()) {
            AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1rSDK.FAILURE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Boolean valueOf = Boolean.valueOf(copy());
        Boolean bool = Boolean.FALSE;
        AFe1rSDK aFe1rSDK = r.d(valueOf, bool, bool).contains(Boolean.TRUE) ? AFe1rSDK.SUCCESS : AFe1rSDK.FAILURE;
        AFc1gSDK aFc1gSDK = this.component3;
        AFd1dSDK aFd1dSDK = new AFd1dSDK(System.currentTimeMillis() - currentTimeMillis);
        AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1dSDK.AFAdRevenueData + "ms", false, 4, null);
        aFc1gSDK.getRevenue(aFd1dSDK);
        return aFe1rSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:2:0x0000, B:4:0x001c, B:7:0x0030, B:11:0x0035, B:12:0x0045, B:14:0x0027), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getCurrencyIso4217Code(Context context, AFa1vSDK aFa1vSDK) {
        try {
            C0464j a7 = C0686a.a(context);
            aFa1vSDK.setAdvertisingId(a7.f5108b);
            aFa1vSDK.setLimitAdTrackingEnabled(Boolean.valueOf(a7.f5109c));
            aFa1vSDK.setAdvertisingIdWithGps(true);
            String advertisingId = aFa1vSDK.getAdvertisingId();
            if (advertisingId != null) {
                if (advertisingId.length() == 0) {
                }
                if (Unit.f6114a == null) {
                    return true;
                }
                aFa1vSDK.getGaidError().append("gpsAdInfo-null |");
                throw new IllegalStateException("GpsAdIndo is null");
            }
            aFa1vSDK.getGaidError().append("emptyOrNull |");
            if (Unit.f6114a == null) {
            }
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFg1hSDK.e$default(aFLogger, aFg1cSDK, r4.f.i("Google Play Services is missing ", th.getMessage()), th, false, false, false, false, 88, null);
            StringBuilder gaidError = aFa1vSDK.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFg1hSDK.i$default(aFLogger, aFg1cSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    private static int getMediationNetwork(Context context) {
        try {
            return q1.e.f7323e.b(context, q1.f.f7325a);
        } catch (Throwable th) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    private final boolean getMediationNetwork(int i2) {
        return getRevenue(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
    
        getMonetizationNetwork(r21.areAllFieldsValid, r10.getGaidError().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d4, code lost:
    
        r0 = r10.getAdvertisingId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d8, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00de, code lost:
    
        if (r0.length() != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e1, code lost:
    
        r0 = r21.areAllFieldsValid;
        r0.getMonetizationNetwork = r10.getAdvertisingId();
        r2 = java.lang.Boolean.FALSE;
        r0.AFAdRevenueData = r2;
        r4 = java.lang.Boolean.TRUE;
        r0.getMediationNetwork = r4;
        r0.getCurrencyIso4217Code = r2;
        r0.getRevenue = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f8, code lost:
    
        if (r22 == 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fa, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fb, code lost:
    
        r0.component1 = java.lang.Boolean.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0101, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0102, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        if (r10.getGaidError().length() <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:
    
        if (r10.getGaidError().length() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getRevenue(int i2) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        AFg1hSDK.i$default(aFLogger, aFg1cSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        boolean z7 = false;
        if (component1()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.component2.getCurrencyIso4217Code;
            Intrinsics.b(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1vSDK aFa1vSDK = new AFa1vSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.component2.getCurrencyIso4217Code;
                    Intrinsics.b(context2);
                    cloudDevSdk2.request(context2, q.b("gaid"), new AFa1tSDK(aFa1vSDK, countDownLatch));
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
                        AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
                        StringBuilder gaidError = aFa1vSDK.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
                    } catch (Throwable th2) {
                        if (aFa1vSDK.getGaidError().length() > 0) {
                            getMonetizationNetwork(this.areAllFieldsValid, aFa1vSDK.getGaidError().toString());
                        }
                        throw th2;
                    }
                }
            }
        }
        AFg1hSDK.i$default(aFLogger, aFg1cSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    private static void getMonetizationNetwork(AFh1rSDK aFh1rSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1rSDK.component3;
        if (str2 != null) {
            String str3 = str2 + " | " + str;
            if (str3 != null) {
                str = str3;
            }
        }
        aFh1rSDK.component3 = str;
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final long getRevenue() {
        return ((Number) this.component4.getValue()).longValue();
    }
}
