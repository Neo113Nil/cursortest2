package com.appsflyer.internal;

import M2.p;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1ySDK;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import kotlin.text.y;
import y2.C1336k;
import y2.InterfaceC1335j;
import z2.C1440x;
import z2.C1441y;

@Metadata
/* loaded from: classes.dex */
public final class AFf1uSDK extends AFe1dSDK<AFh1uSDK> {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    private final AFd1sSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private final AFd1lSDK f5926d;

    /* renamed from: e, reason: collision with root package name */
    private final AFh1uSDK f5927e;
    private final InterfaceC1335j force;
    private final AFd1pSDK registerClient;
    private final InterfaceC1335j unregisterClient;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFf1uSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends p implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1uSDK.this.AFLogger.AFInAppEventType("com.appsflyer.enable_instant_plays")));
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFf1uSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends p implements Function0<Long> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Long g4;
            String AFInAppEventType = AFf1uSDK.this.AFLogger.AFInAppEventType("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((AFInAppEventType == null || (g4 = t.g(AFInAppEventType)) == null) ? 1000L : g4.longValue());
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
    public static final class AFa1uSDK implements CloudDevCallback {
        final /* synthetic */ AFa1zSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1uSDK(AFa1zSDK aFa1zSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1zSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFLogger.afWarnLog("Could not fetch GAID using CloudDevSdk: " + reason);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFLogger.afRDLog("CloudDevCallback received onSuccess");
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    @Metadata
    public static final class AFa1zSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1zSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1zSDK copy$default(AFa1zSDK aFa1zSDK, String str, Boolean bool, boolean z4, StringBuilder sb, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aFa1zSDK.advertisingId;
            }
            if ((i2 & 2) != 0) {
                bool = aFa1zSDK.isLimitAdTrackingEnabled;
            }
            if ((i2 & 4) != 0) {
                z4 = aFa1zSDK.advertisingIdWithGps;
            }
            if ((i2 & 8) != 0) {
                sb = aFa1zSDK.gaidError;
            }
            return aFa1zSDK.copy(str, bool, z4, sb);
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

        public final AFa1zSDK copy(String str, Boolean bool, boolean z4, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1zSDK(str, bool, z4, gaidError);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
            return Intrinsics.a(this.advertisingId, aFa1zSDK.advertisingId) && Intrinsics.a(this.isLimitAdTrackingEnabled, aFa1zSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1zSDK.advertisingIdWithGps && Intrinsics.a(this.gaidError, aFa1zSDK.gaidError);
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
            int i2 = z4;
            if (z4 != 0) {
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

        public final void setAdvertisingIdWithGps(boolean z4) {
            this.advertisingIdWithGps = z4;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        public final String toString() {
            return "AFa1zSDK(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ')';
        }

        public AFa1zSDK(String str, Boolean bool, boolean z4, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z4;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1zSDK(String str, Boolean bool, boolean z4, StringBuilder sb, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? false : z4, (i2 & 8) != 0 ? new StringBuilder() : sb);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1uSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.FETCH_ADVERTISING_ID, new AFf1zSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        AFd1lSDK w4 = aFd1kSDK.w();
        Intrinsics.checkNotNullExpressionValue(w4, "");
        this.f5926d = w4;
        AFd1sSDK AFInAppEventType = aFd1kSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.AFLogger = AFInAppEventType;
        AFd1pSDK level = aFd1kSDK.getLevel();
        Intrinsics.checkNotNullExpressionValue(level, "");
        this.registerClient = level;
        this.f5927e = new AFh1uSDK(null, null, null, null, null, null, null, null, 255, null);
        this.unregisterClient = C1336k.a(new AnonymousClass2());
        this.force = C1336k.a(new AnonymousClass1());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001b, B:8:0x002d, B:13:0x0032, B:14:0x0042, B:16:0x0024), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean AFInAppEventType(Context context, AFa1zSDK aFa1zSDK) {
        try {
            AFb1ySDK.AFa1uSDK values = AFb1ySDK.values(context);
            aFa1zSDK.setAdvertisingId(values.AFKeystoreWrapper);
            aFa1zSDK.setLimitAdTrackingEnabled(Boolean.valueOf(values.valueOf()));
            String advertisingId = aFa1zSDK.getAdvertisingId();
            if (advertisingId != null) {
                if (advertisingId.length() == 0) {
                }
                if (Unit.f7487a == null) {
                    return true;
                }
                aFa1zSDK.getGaidError().append("gpsAdInfo-null (bypass) |");
                throw new IllegalStateException("GpsAdInfo is null (bypass)");
            }
            aFa1zSDK.getGaidError().append("emptyOrNull (bypass) |");
            if (Unit.f7487a == null) {
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Failed to fetch GAID: ");
            sb.append(th.getMessage());
            AFLogger.afErrorLog(sb.toString(), th, true, false, false);
            StringBuilder gaidError = aFa1zSDK.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFLogger.afInfoLog(localizedMessage);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[LOOP:0: B:2:0x0003->B:10:0x002d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[EDGE_INSN: B:11:0x0030->B:12:0x0030 BREAK  A[LOOP:0: B:2:0x0003->B:10:0x002d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean afInfoLog() {
        boolean z4 = false;
        for (int i2 = 2; i2 > 0; i2--) {
            if (registerClient() && AFKeystoreWrapper(i2)) {
                AFLogger.afRDLog("GAID fetched using Samsung Cloud dev SDK");
            } else if (!AFInAppEventParameterName(i2)) {
                AFLogger.afRDLog("Failed to fetch GAID");
                z4 = false;
                if (!z4) {
                    break;
                }
            } else {
                AFLogger.afRDLog("GAID fetched using GMS");
            }
            z4 = true;
            if (!z4) {
            }
        }
        this.registerClient.AFLogger = this.f5927e;
        return z4;
    }

    private static boolean e() {
        String obj;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            if (th instanceof ClassNotFoundException) {
                obj = "CloudDevSdk not found";
            } else {
                StringBuilder sb = new StringBuilder("Unexpected exception while checking if running in cloud environment: ");
                sb.append(th.getMessage());
                obj = sb.toString();
            }
            AFLogger.afErrorLog(obj, th, true);
            return false;
        }
    }

    private final boolean registerClient() {
        return ((Boolean) this.force.getValue()).booleanValue();
    }

    private static int values(Context context) {
        try {
            return E1.e.f2288d.b(context, E1.f.f2289a);
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("isGooglePlayServicesAvailable error", th);
            return -1;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        if (this.registerClient.valueOf()) {
            AFLogger.afRDLog("QUEUE: Advertising ID collection is disabled. Skipping fetching... ");
            return AFe1bSDK.FAILURE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Boolean valueOf = Boolean.valueOf(afInfoLog());
        Boolean bool = Boolean.FALSE;
        AFe1bSDK aFe1bSDK = C1441y.e(valueOf, bool, bool).contains(Boolean.TRUE) ? AFe1bSDK.SUCCESS : AFe1bSDK.FAILURE;
        AFd1pSDK aFd1pSDK = this.registerClient;
        AFe1mSDK aFe1mSDK = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
        StringBuilder sb = new StringBuilder("QUEUE: FetchAdvertisingIdTask: took ");
        sb.append(aFe1mSDK.AFKeystoreWrapper);
        sb.append("ms");
        AFLogger.afRDLog(sb.toString());
        aFd1pSDK.values(aFe1mSDK);
        return aFe1bSDK;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean AFInAppEventParameterName(int i2) {
        boolean z4;
        String obj;
        AFLogger.afInfoLog("Trying to fetch GAID...");
        AFa1zSDK aFa1zSDK = new AFa1zSDK(null, null, false, null, 15, null);
        Context context = this.f5926d.AFKeystoreWrapper;
        Intrinsics.c(context);
        int values = values(context);
        Context context2 = this.f5926d.AFKeystoreWrapper;
        Intrinsics.c(context2);
        if (!valueOf(context2, aFa1zSDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.f5926d.AFKeystoreWrapper;
                Intrinsics.c(context3);
                if (AFInAppEventType(context3, aFa1zSDK)) {
                    z4 = true;
                    obj = aFa1zSDK.getGaidError().toString();
                    if (obj != null && !y.x(obj)) {
                        String obj2 = y.M(obj).toString();
                        StringBuilder sb = new StringBuilder();
                        sb.append(values);
                        sb.append(": ");
                        sb.append(obj2);
                        obj = sb.toString();
                    }
                    values(this.f5927e, obj);
                    if (!z4) {
                        return false;
                    }
                }
            }
            z4 = false;
            obj = aFa1zSDK.getGaidError().toString();
            if (obj != null) {
                String obj22 = y.M(obj).toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(values);
                sb2.append(": ");
                sb2.append(obj22);
                obj = sb2.toString();
            }
            values(this.f5927e, obj);
            if (!z4) {
            }
        }
        AFh1uSDK aFh1uSDK = this.f5927e;
        aFh1uSDK.AFKeystoreWrapper = aFa1zSDK.getAdvertisingId();
        aFh1uSDK.AFInAppEventParameterName = aFa1zSDK.isLimitAdTrackingEnabled();
        aFh1uSDK.valueOf = aFa1zSDK.isLimitAdTrackingEnabled() != null ? Boolean.valueOf(!r2.booleanValue()) : null;
        aFh1uSDK.AFInAppEventType = Boolean.valueOf(aFa1zSDK.getAdvertisingIdWithGps());
        aFh1uSDK.values = Boolean.FALSE;
        aFh1uSDK.registerClient = Boolean.valueOf(i2 != 2);
        return true;
    }

    private final boolean valueOf(Context context, AFa1zSDK aFa1zSDK) {
        Unit unit;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                aFa1zSDK.setAdvertisingId(advertisingIdInfo.getId());
                aFa1zSDK.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                aFa1zSDK.setAdvertisingIdWithGps(true);
                String advertisingId = aFa1zSDK.getAdvertisingId();
                if (advertisingId != null) {
                    if (advertisingId.length() == 0) {
                    }
                    unit = Unit.f7487a;
                }
                aFa1zSDK.getGaidError().append("emptyOrNull |");
                unit = Unit.f7487a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            aFa1zSDK.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Google Play Services is missing ");
            sb.append(th.getMessage());
            AFLogger.afErrorLog(sb.toString(), th);
            StringBuilder gaidError = aFa1zSDK.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
            return false;
        }
    }

    private static void values(AFh1uSDK aFh1uSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1uSDK.f5952d;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" | ");
            sb.append(str);
            String obj = sb.toString();
            if (obj != null) {
                str = obj;
            }
        }
        aFh1uSDK.f5952d = str;
    }

    private final boolean AFKeystoreWrapper(int i2) {
        return valueOf(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        values(r9.f5927e, r0.getGaidError().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b7, code lost:
    
        r2 = r0.getAdvertisingId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bb, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c1, code lost:
    
        if (r2.length() != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c4, code lost:
    
        r2 = r9.f5927e;
        r2.AFKeystoreWrapper = r0.getAdvertisingId();
        r0 = java.lang.Boolean.FALSE;
        r2.AFInAppEventParameterName = r0;
        r4 = java.lang.Boolean.TRUE;
        r2.valueOf = r4;
        r2.AFInAppEventType = r0;
        r2.values = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d9, code lost:
    
        if (r10 == 2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00db, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dc, code lost:
    
        r2.registerClient = java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        if (r0.getGaidError().length() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0062, code lost:
    
        if (r0.getGaidError().length() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean valueOf(int i2) {
        String obj;
        AFLogger.afInfoLog("Trying to fetch GAID using Samsung Cloud Dev...");
        boolean z4 = false;
        if (e()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.f5926d.AFKeystoreWrapper;
            Intrinsics.c(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1zSDK aFa1zSDK = new AFa1zSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.f5926d.AFKeystoreWrapper;
                    Intrinsics.c(context2);
                    cloudDevSdk2.request(context2, C1440x.a("gaid"), new AFa1uSDK(aFa1zSDK, countDownLatch));
                    countDownLatch.await(((Number) this.unregisterClient.getValue()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            obj = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th instanceof ClassNotFoundException) {
                            obj = "CloudDevSdk not found";
                        } else {
                            StringBuilder sb = new StringBuilder("Unexpected exception while fetching GAID using Samsung Cloud Dev ");
                            sb.append(th.getMessage());
                            obj = sb.toString();
                        }
                        AFLogger.afErrorLog(obj, th, true);
                        StringBuilder gaidError = aFa1zSDK.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
                    } catch (Throwable th2) {
                        if (aFa1zSDK.getGaidError().length() > 0) {
                            values(this.f5927e, aFa1zSDK.getGaidError().toString());
                        }
                        throw th2;
                    }
                }
            }
        }
        AFLogger.afInfoLog("Not running in Samsung Cloud Environment. Try using GMS...");
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return ((Number) this.unregisterClient.getValue()).longValue();
    }
}
