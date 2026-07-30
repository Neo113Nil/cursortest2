package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1ySDK;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0007\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\b\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\b\u0010\u0012J\u000f\u0010\u000b\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u000b\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\n\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\n\u0010\u0005J\u001d\u0010\u0015\u001a\u00020\u0018*\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0015\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0015\u001a\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0005R\u001b\u0010\b\u001a\u00020\u00038CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0005R\u0014\u0010'\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010&R\u0013\u0010\u001d\u001a\u00020\u0011X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b'\u0010#"}, d2 = {"Lcom/appsflyer/internal/AFf1uSDK;", "Lcom/appsflyer/internal/AFe1dSDK;", "Lcom/appsflyer/internal/AFh1uSDK;", "", "afInfoLog", "()Z", "", "p0", "AFInAppEventParameterName", "(I)Z", "valueOf", "AFKeystoreWrapper", "Landroid/content/Context;", "Lcom/appsflyer/internal/AFf1uSDK$AFa1zSDK;", "p1", "AFInAppEventType", "(Landroid/content/Context;Lcom/appsflyer/internal/AFf1uSDK$AFa1zSDK;)Z", "", "()J", "Lcom/appsflyer/internal/AFe1bSDK;", "()Lcom/appsflyer/internal/AFe1bSDK;", "values", "(Landroid/content/Context;)I", "", "", "(Lcom/appsflyer/internal/AFh1uSDK;Ljava/lang/String;)V", "e", "Lcom/appsflyer/internal/AFh1uSDK;", "Lcom/appsflyer/internal/AFd1lSDK;", "d", "Lcom/appsflyer/internal/AFd1lSDK;", "Lcom/appsflyer/internal/AFd1sSDK;", "AFLogger", "Lcom/appsflyer/internal/AFd1sSDK;", "force", "Lkotlin/Lazy;", "registerClient", "Lcom/appsflyer/internal/AFd1pSDK;", "Lcom/appsflyer/internal/AFd1pSDK;", "unregisterClient", "Lcom/appsflyer/internal/AFd1kSDK;", "<init>", "(Lcom/appsflyer/internal/AFd1kSDK;)V", "AFa1tSDK", "AFa1zSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFf1uSDK extends AFe1dSDK<AFh1uSDK> {

    /* renamed from: AFLogger, reason: from kotlin metadata */
    private final AFd1sSDK valueOf;

    /* renamed from: d, reason: from kotlin metadata */
    private final AFd1lSDK AFKeystoreWrapper;

    /* renamed from: e, reason: from kotlin metadata */
    private final AFh1uSDK AFInAppEventType;

    /* renamed from: force, reason: from kotlin metadata */
    private final Lazy AFInAppEventParameterName;

    /* renamed from: registerClient, reason: from kotlin metadata */
    private final AFd1pSDK unregisterClient;

    /* renamed from: unregisterClient, reason: from kotlin metadata */
    private final Lazy d;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1uSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.FETCH_ADVERTISING_ID, new AFf1zSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        AFd1lSDK w = aFd1kSDK.w();
        Intrinsics.checkNotNullExpressionValue(w, "");
        this.AFKeystoreWrapper = w;
        AFd1sSDK AFInAppEventType = aFd1kSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.valueOf = AFInAppEventType;
        AFd1pSDK level = aFd1kSDK.getLevel();
        Intrinsics.checkNotNullExpressionValue(level, "");
        this.unregisterClient = level;
        this.AFInAppEventType = new AFh1uSDK(null, null, null, null, null, null, null, null, 255, null);
        this.d = LazyKt.lazy(new Function0<Long>() { // from class: com.appsflyer.internal.AFf1uSDK.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                Long longOrNull;
                String AFInAppEventType2 = AFf1uSDK.this.valueOf.AFInAppEventType("com.appsflyer.fetch_ids.timeout");
                return Long.valueOf((AFInAppEventType2 == null || (longOrNull = StringsKt.toLongOrNull(AFInAppEventType2)) == null) ? 1000L : longOrNull.longValue());
            }
        });
        this.AFInAppEventParameterName = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1uSDK.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1uSDK.this.valueOf.AFInAppEventType("com.appsflyer.enable_instant_plays")));
            }
        });
    }

    private final boolean registerClient() {
        return ((Boolean) this.AFInAppEventParameterName.getValue()).booleanValue();
    }

    private static boolean e() {
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th instanceof ClassNotFoundException ? "CloudDevSdk not found" : new StringBuilder("Unexpected exception while checking if running in cloud environment: ").append(th.getMessage()).toString(), th, true);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        AFe1bSDK aFe1bSDK;
        if (this.unregisterClient.valueOf()) {
            AFLogger.afRDLog("QUEUE: Advertising ID collection is disabled. Skipping fetching... ");
            return AFe1bSDK.FAILURE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(afInfoLog()), Boolean.FALSE, Boolean.FALSE}).contains(Boolean.TRUE)) {
            aFe1bSDK = AFe1bSDK.SUCCESS;
        } else {
            aFe1bSDK = AFe1bSDK.FAILURE;
        }
        AFd1pSDK aFd1pSDK = this.unregisterClient;
        AFe1mSDK aFe1mSDK = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
        AFLogger.afRDLog(new StringBuilder("QUEUE: FetchAdvertisingIdTask: took ").append(aFe1mSDK.AFKeystoreWrapper).append("ms").toString());
        aFd1pSDK.values(aFe1mSDK);
        return aFe1bSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[LOOP:0: B:2:0x0003->B:10:0x002d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[EDGE_INSN: B:11:0x0030->B:12:0x0030 BREAK  A[LOOP:0: B:2:0x0003->B:10:0x002d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean afInfoLog() {
        boolean z = false;
        for (int i = 2; i > 0; i--) {
            if (registerClient() && AFKeystoreWrapper(i)) {
                AFLogger.afRDLog("GAID fetched using Samsung Cloud dev SDK");
            } else if (AFInAppEventParameterName(i)) {
                AFLogger.afRDLog("GAID fetched using GMS");
            } else {
                AFLogger.afRDLog("Failed to fetch GAID");
                z = false;
                if (!z) {
                    break;
                }
            }
            z = true;
            if (!z) {
            }
        }
        this.unregisterClient.AFLogger = this.AFInAppEventType;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean AFInAppEventParameterName(int p0) {
        boolean z;
        String obj;
        String str;
        AFLogger.afInfoLog("Trying to fetch GAID...");
        AFa1zSDK aFa1zSDK = new AFa1zSDK(null, null, false, null, 15, null);
        Context context = this.AFKeystoreWrapper.AFKeystoreWrapper;
        Intrinsics.checkNotNull(context);
        int values = values(context);
        Context context2 = this.AFKeystoreWrapper.AFKeystoreWrapper;
        Intrinsics.checkNotNull(context2);
        if (!valueOf(context2, aFa1zSDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.AFKeystoreWrapper.AFKeystoreWrapper;
                Intrinsics.checkNotNull(context3);
                if (AFInAppEventType(context3, aFa1zSDK)) {
                    z = true;
                    obj = aFa1zSDK.getGaidError().toString();
                    str = obj;
                    if (str != null && !StringsKt.isBlank(str)) {
                        obj = new StringBuilder().append(values).append(": ").append(StringsKt.trim((CharSequence) str).toString()).toString();
                    }
                    values(this.AFInAppEventType, obj);
                    if (!z) {
                        return false;
                    }
                }
            }
            z = false;
            obj = aFa1zSDK.getGaidError().toString();
            str = obj;
            if (str != null) {
                obj = new StringBuilder().append(values).append(": ").append(StringsKt.trim((CharSequence) str).toString()).toString();
            }
            values(this.AFInAppEventType, obj);
            if (!z) {
            }
        }
        AFh1uSDK aFh1uSDK = this.AFInAppEventType;
        aFh1uSDK.values = aFa1zSDK.getAdvertisingId();
        aFh1uSDK.registerClient = aFa1zSDK.isLimitAdTrackingEnabled();
        aFh1uSDK.AFInAppEventParameterName = aFa1zSDK.isLimitAdTrackingEnabled() != null ? Boolean.valueOf(!r2.booleanValue()) : null;
        aFh1uSDK.AFInAppEventType = Boolean.valueOf(aFa1zSDK.getAdvertisingIdWithGps());
        aFh1uSDK.valueOf = Boolean.FALSE;
        aFh1uSDK.unregisterClient = Boolean.valueOf(p0 != 2);
        return true;
    }

    private static int values(Context p0) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(p0);
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("isGooglePlayServicesAvailable error", th);
            return -1;
        }
    }

    private final boolean AFInAppEventType(Context p0, AFa1zSDK p1) throws IllegalStateException {
        try {
            AFb1ySDK.AFa1uSDK values = AFb1ySDK.values(p0);
            p1.setAdvertisingId(values.AFKeystoreWrapper);
            p1.setLimitAdTrackingEnabled(Boolean.valueOf(values.valueOf()));
            String advertisingId = p1.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                p1.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.INSTANCE != null) {
                return true;
            }
            AFf1uSDK aFf1uSDK = this;
            p1.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)".toString());
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Failed to fetch GAID: ").append(th.getMessage()).toString(), th, true, false, false);
            p1.getGaidError().append(th.getClass().getSimpleName()).append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFLogger.afInfoLog(localizedMessage);
            return false;
        }
    }

    private final boolean valueOf(Context p0, AFa1zSDK p1) throws IllegalStateException {
        Unit unit;
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p0);
            if (advertisingIdInfo != null) {
                p1.setAdvertisingId(advertisingIdInfo.getId());
                p1.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p1.setAdvertisingIdWithGps(true);
                String advertisingId = p1.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    p1.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            AFf1uSDK aFf1uSDK = this;
            p1.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null".toString());
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Google Play Services is missing ").append(th.getMessage()).toString(), th);
            p1.getGaidError().append(th.getClass().getSimpleName()).append(" |");
            AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
            return false;
        }
    }

    private final boolean AFKeystoreWrapper(int p0) {
        return valueOf(p0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bb, code lost:
    
        r2 = r0.getAdvertisingId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c1, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c7, code lost:
    
        if (r2.length() != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ca, code lost:
    
        r2 = r9.AFInAppEventType;
        r2.values = r0.getAdvertisingId();
        r2.registerClient = java.lang.Boolean.FALSE;
        r2.AFInAppEventParameterName = java.lang.Boolean.TRUE;
        r2.AFInAppEventType = java.lang.Boolean.FALSE;
        r2.valueOf = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e3, code lost:
    
        if (r10 == 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e5, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e6, code lost:
    
        r2.unregisterClient = java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ec, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ed, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        if (r0.getGaidError().length() <= 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean valueOf(int p0) {
        String obj;
        AFLogger.afInfoLog("Trying to fetch GAID using Samsung Cloud Dev...");
        boolean z = false;
        if (e()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.AFKeystoreWrapper.AFKeystoreWrapper;
            Intrinsics.checkNotNull(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1zSDK aFa1zSDK = new AFa1zSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.AFKeystoreWrapper.AFKeystoreWrapper;
                    Intrinsics.checkNotNull(context2);
                    cloudDevSdk2.request(context2, CollectionsKt.listOf("gaid"), new AFa1uSDK(aFa1zSDK, countDownLatch));
                    countDownLatch.await(((Number) this.d.getValue()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            obj = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else {
                            obj = th instanceof ClassNotFoundException ? "CloudDevSdk not found" : new StringBuilder("Unexpected exception while fetching GAID using Samsung Cloud Dev ").append(th.getMessage()).toString();
                        }
                        AFLogger.afErrorLog(obj, th, true);
                        aFa1zSDK.getGaidError().append(th.getClass().getSimpleName()).append(" |");
                    } finally {
                        if (aFa1zSDK.getGaidError().length() > 0) {
                            values(this.AFInAppEventType, aFa1zSDK.getGaidError().toString());
                        }
                    }
                }
            }
        }
        AFLogger.afInfoLog("Not running in Samsung Cloud Environment. Try using GMS...");
        return false;
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "SDK_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AFa1uSDK implements CloudDevCallback {
        final /* synthetic */ AFa1zSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        AFa1uSDK(AFa1zSDK aFa1zSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1zSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFLogger.afWarnLog("Could not fetch GAID using CloudDevSdk: " + reason);
            this.$fetchGaidData.getGaidError().append(reason).append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFLogger.afRDLog("CloudDevCallback received onSuccess");
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\f\b\u0002\u0010\u0011\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b(\u0010)J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\f\u001a\u00060\nj\u0002`\u000bHÇ\u0003¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\f\b\u0002\u0010\u0011\u001a\u00060\nj\u0002`\u000bHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u0004R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0010\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\"R\u001e\u0010\u0011\u001a\u00060\nj\u0002`\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010%\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b&\u0010'"}, d2 = {"Lcom/appsflyer/internal/AFf1uSDK$AFa1zSDK;", "", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "component4", "()Ljava/lang/StringBuilder;", "advertisingId", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "gaidError", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFf1uSDK$AFa1zSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    static final /* data */ class AFa1zSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1zSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1zSDK copy$default(AFa1zSDK aFa1zSDK, String str, Boolean bool, boolean z, StringBuilder sb, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aFa1zSDK.advertisingId;
            }
            if ((i & 2) != 0) {
                bool = aFa1zSDK.isLimitAdTrackingEnabled;
            }
            if ((i & 4) != 0) {
                z = aFa1zSDK.advertisingIdWithGps;
            }
            if ((i & 8) != 0) {
                sb = aFa1zSDK.gaidError;
            }
            return aFa1zSDK.copy(str, bool, z, sb);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        /* renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        public final AFa1zSDK copy(String advertisingId, Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1zSDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) other;
            return Intrinsics.areEqual(this.advertisingId, aFa1zSDK.advertisingId) && Intrinsics.areEqual(this.isLimitAdTrackingEnabled, aFa1zSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1zSDK.advertisingIdWithGps && Intrinsics.areEqual(this.gaidError, aFa1zSDK.gaidError);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.advertisingId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z = this.advertisingIdWithGps;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((hashCode2 + i) * 31) + this.gaidError.hashCode();
        }

        public final String toString() {
            return "AFa1zSDK(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ')';
        }

        public AFa1zSDK(String str, Boolean bool, boolean z, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z;
            this.gaidError = gaidError;
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        public final void setAdvertisingIdWithGps(boolean z) {
            this.advertisingIdWithGps = z;
        }

        public /* synthetic */ AFa1zSDK(String str, Boolean bool, boolean z, StringBuilder sb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new StringBuilder() : sb);
        }

        public final StringBuilder getGaidError() {
            return this.gaidError;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return ((Number) this.d.getValue()).longValue();
    }

    private static void values(AFh1uSDK aFh1uSDK, String str) {
        String obj;
        if (str == null) {
            return;
        }
        String str2 = aFh1uSDK.AFKeystoreWrapper;
        if (str2 != null && (obj = new StringBuilder().append(str2).append(" | ").append(str).toString()) != null) {
            str = obj;
        }
        aFh1uSDK.AFKeystoreWrapper = str;
    }
}
