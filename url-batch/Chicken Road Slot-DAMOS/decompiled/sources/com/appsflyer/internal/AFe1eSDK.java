package com.appsflyer.internal;

import android.content.Context;
import c7.p0;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1vSDK;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0014\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u0016*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u000e\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u000e\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0014\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0015\u0010!\u001a\u00020\u00188BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010\u0013\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b&\u0010\tR\u0014\u0010\u0019\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\t"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK;", "Lcom/appsflyer/internal/AFe1mSDK;", "Lcom/appsflyer/internal/AFh1rSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFd1zSDK;)V", "", "copydefault", "()Z", "", "getCurrencyIso4217Code", "(I)Z", "Landroid/content/Context;", "getRevenue", "(Landroid/content/Context;)I", "Lcom/appsflyer/internal/AFe1eSDK$AFa1uSDK;", "p1", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1eSDK$AFa1uSDK;)Z", "getMonetizationNetwork", "getMediationNetwork", "", "", "(Lcom/appsflyer/internal/AFh1rSDK;Ljava/lang/String;)V", "", "AFAdRevenueData", "()J", "Lcom/appsflyer/internal/AFe1uSDK;", "()Lcom/appsflyer/internal/AFe1uSDK;", "Lcom/appsflyer/internal/AFc1hSDK;", "component4", "Lcom/appsflyer/internal/AFc1hSDK;", "Lcom/appsflyer/internal/AFc1oSDK;", "component1", "Lcom/appsflyer/internal/AFc1oSDK;", "Lcom/appsflyer/internal/AFc1eSDK;", "component2", "Lcom/appsflyer/internal/AFc1eSDK;", "component3", "Lcom/appsflyer/internal/AFh1rSDK;", "areAllFieldsValid", "Lhd/g;", "copy", "AFa1tSDK", "AFa1uSDK"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1eSDK extends AFe1mSDK<AFh1rSDK> {

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    private final hd.g component1;

    /* renamed from: component1, reason: from kotlin metadata */
    private final AFc1oSDK getMediationNetwork;

    /* renamed from: component2, reason: from kotlin metadata */
    private final AFc1eSDK component3;

    /* renamed from: component3, reason: from kotlin metadata */
    private final AFh1rSDK getCurrencyIso4217Code;

    /* renamed from: component4, reason: from kotlin metadata */
    private final AFc1hSDK getRevenue;

    /* renamed from: copy, reason: from kotlin metadata */
    private final hd.g getMonetizationNetwork;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Boolean;"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1eSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends wd.p implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFe1eSDK.this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.enable_instant_plays")));
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Long;"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1eSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends wd.p implements Function0<Long> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Long x10;
            String currencyIso4217Code = AFe1eSDK.this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((currencyIso4217Code == null || (x10 = StringsKt.x(currencyIso4217Code)) == null) ? 1000L : x10.longValue());
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "SDK_prodRelease"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    public static final class AFa1ySDK implements CloudDevCallback {
        final /* synthetic */ AFa1uSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1ySDK(AFa1uSDK aFa1uSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1uSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            reason.getClass();
            AFh1ySDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, v4.a.k("Could not fetch GAID using CloudDevSdk: ", reason), false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            kinds.getClass();
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1eSDK(AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.FETCH_ADVERTISING_ID, new AFe1pSDK[0], "FetchAdvertisingIdTask");
        aFd1zSDK.getClass();
        AFc1hSDK AFInAppEventParameterName = aFd1zSDK.AFInAppEventParameterName();
        AFInAppEventParameterName.getClass();
        this.getRevenue = AFInAppEventParameterName;
        AFc1oSDK AFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        AFAdRevenueData.getClass();
        this.getMediationNetwork = AFAdRevenueData;
        AFc1eSDK force = aFd1zSDK.force();
        force.getClass();
        this.component3 = force;
        this.getCurrencyIso4217Code = new AFh1rSDK(null, null, null, null, null, null, null, null, 255, null);
        this.component1 = hd.h.b(new AnonymousClass4());
        this.getMonetizationNetwork = hd.h.b(new AnonymousClass1());
    }

    private static boolean component2() {
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, th instanceof ClassNotFoundException ? "CloudDevSdk not found" : v4.a.k("Unexpected exception while checking if running in cloud environment: ", th.getMessage()), th, true, false, false, false, 112, null);
            return false;
        }
    }

    private final boolean component3() {
        return ((Boolean) this.getMonetizationNetwork.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[LOOP:0: B:2:0x0005->B:10:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[EDGE_INSN: B:11:0x0048->B:12:0x0048 BREAK  A[LOOP:0: B:2:0x0005->B:10:0x0045], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean copydefault() {
        boolean z10 = false;
        for (int i3 = 2; i3 > 0; i3--) {
            if (component3() && getMonetizationNetwork(i3)) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else if (!getCurrencyIso4217Code(i3)) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                z10 = false;
                if (!z10) {
                    break;
                }
            } else {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
            }
            z10 = true;
            if (!z10) {
            }
        }
        this.component3.component3 = this.getCurrencyIso4217Code;
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getCurrencyIso4217Code(int p02) {
        boolean z10;
        String obj;
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        AFa1uSDK aFa1uSDK = new AFa1uSDK(null, null, false, null, 15, null);
        Context context = this.getRevenue.getMonetizationNetwork;
        context.getClass();
        int revenue = getRevenue(context);
        Context context2 = this.getRevenue.getMonetizationNetwork;
        context2.getClass();
        if (!getCurrencyIso4217Code(context2, aFa1uSDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.getRevenue.getMonetizationNetwork;
                context3.getClass();
                if (getRevenue(context3, aFa1uSDK)) {
                    z10 = true;
                    obj = aFa1uSDK.getGaidError().toString();
                    if (!StringsKt.r(obj)) {
                        obj = revenue + ": " + StringsKt.y(obj).toString();
                    }
                    getRevenue(this.getCurrencyIso4217Code, obj);
                    if (!z10) {
                        return false;
                    }
                }
            }
            z10 = false;
            obj = aFa1uSDK.getGaidError().toString();
            if (!StringsKt.r(obj)) {
            }
            getRevenue(this.getCurrencyIso4217Code, obj);
            if (!z10) {
            }
        }
        AFh1rSDK aFh1rSDK = this.getCurrencyIso4217Code;
        aFh1rSDK.getMediationNetwork = aFa1uSDK.getAdvertisingId();
        aFh1rSDK.component2 = aFa1uSDK.isLimitAdTrackingEnabled();
        aFh1rSDK.getMonetizationNetwork = aFa1uSDK.isLimitAdTrackingEnabled() != null ? Boolean.valueOf(!r1.booleanValue()) : null;
        aFh1rSDK.getCurrencyIso4217Code = Boolean.valueOf(aFa1uSDK.getAdvertisingIdWithGps());
        aFh1rSDK.AFAdRevenueData = Boolean.FALSE;
        aFh1rSDK.areAllFieldsValid = Boolean.valueOf(p02 != 2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
    
        getRevenue(r21.getCurrencyIso4217Code, r10.getGaidError().toString());
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
    
        r0 = r21.getCurrencyIso4217Code;
        r0.getMediationNetwork = r10.getAdvertisingId();
        r2 = java.lang.Boolean.FALSE;
        r0.component2 = r2;
        r4 = java.lang.Boolean.TRUE;
        r0.getMonetizationNetwork = r4;
        r0.getCurrencyIso4217Code = r2;
        r0.AFAdRevenueData = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f8, code lost:
    
        if (r22 == 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fa, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fb, code lost:
    
        r0.areAllFieldsValid = java.lang.Boolean.valueOf(r9);
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
    private final boolean getMediationNetwork(int p02) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        boolean z10 = false;
        if (component2()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.getRevenue.getMonetizationNetwork;
            context.getClass();
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1uSDK aFa1uSDK = new AFa1uSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.getRevenue.getMonetizationNetwork;
                    context2.getClass();
                    cloudDevSdk2.request(context2, x.c("gaid"), new AFa1ySDK(aFa1uSDK, countDownLatch));
                    countDownLatch.await(((Number) this.component1.getValue()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th.getMessage();
                        }
                        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
                        StringBuilder gaidError = aFa1uSDK.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
                    } catch (Throwable th2) {
                        if (aFa1uSDK.getGaidError().length() > 0) {
                            getRevenue(this.getCurrencyIso4217Code, aFa1uSDK.getGaidError().toString());
                        }
                        throw th2;
                    }
                }
            }
        }
        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    private final boolean getMonetizationNetwork(int p02) {
        return getMediationNetwork(p02);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:2:0x0000, B:4:0x001a, B:7:0x002e, B:11:0x0034, B:12:0x0044, B:14:0x0025), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getRevenue(Context p02, AFa1uSDK p12) {
        try {
            AFb1vSDK.AFa1ySDK AFAdRevenueData = AFb1vSDK.AFAdRevenueData(p02);
            p12.setAdvertisingId(AFAdRevenueData.getCurrencyIso4217Code);
            p12.setLimitAdTrackingEnabled(Boolean.valueOf(AFAdRevenueData.AFAdRevenueData()));
            String advertisingId = p12.getAdvertisingId();
            if (advertisingId != null) {
                if (advertisingId.length() == 0) {
                }
                if (Unit.f5554a == null) {
                    return true;
                }
                p12.getGaidError().append("gpsAdInfo-null (bypass) |");
                throw new IllegalStateException("GpsAdInfo is null (bypass)");
            }
            p12.getGaidError().append("emptyOrNull (bypass) |");
            if (Unit.f5554a == null) {
            }
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, v4.a.k("Failed to fetch GAID: ", th.getMessage()), th, true, false, false, false, 64, null);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, localizedMessage, false, 4, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return ((Number) this.component1.getValue()).longValue();
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK$AFa1uSDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1eSDK$AFa1uSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    public static final /* data */ class AFa1uSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public /* synthetic */ AFa1uSDK(String str, Boolean bool, boolean z10, StringBuilder sb2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : bool, (i3 & 4) != 0 ? false : z10, (i3 & 8) != 0 ? new StringBuilder() : sb2);
        }

        public static /* synthetic */ AFa1uSDK copy$default(AFa1uSDK aFa1uSDK, String str, Boolean bool, boolean z10, StringBuilder sb2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = aFa1uSDK.advertisingId;
            }
            if ((i3 & 2) != 0) {
                bool = aFa1uSDK.isLimitAdTrackingEnabled;
            }
            if ((i3 & 4) != 0) {
                z10 = aFa1uSDK.advertisingIdWithGps;
            }
            if ((i3 & 8) != 0) {
                sb2 = aFa1uSDK.gaidError;
            }
            return aFa1uSDK.copy(str, bool, z10, sb2);
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

        public final AFa1uSDK copy(String advertisingId, Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, StringBuilder gaidError) {
            gaidError.getClass();
            return new AFa1uSDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) other;
            return Intrinsics.a(this.advertisingId, aFa1uSDK.advertisingId) && Intrinsics.a(this.isLimitAdTrackingEnabled, aFa1uSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1uSDK.advertisingIdWithGps && Intrinsics.a(this.gaidError, aFa1uSDK.gaidError);
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
            boolean z10 = this.advertisingIdWithGps;
            int i3 = z10;
            if (z10 != 0) {
                i3 = 1;
            }
            return this.gaidError.hashCode() + ((hashCode2 + i3) * 31);
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z10) {
            this.advertisingIdWithGps = z10;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public AFa1uSDK(String str, Boolean bool, boolean z10, StringBuilder sb2) {
            sb2.getClass();
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z10;
            this.gaidError = sb2;
        }

        public AFa1uSDK() {
            this(null, null, false, null, 15, null);
        }
    }

    private static int getRevenue(Context p02) {
        try {
            return z6.f.f10879e.b(p02, z6.g.f10881a);
        } catch (Throwable th) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() {
        AFe1uSDK aFe1uSDK;
        if (this.component3.AFAdRevenueData()) {
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1uSDK.FAILURE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Boolean valueOf = Boolean.valueOf(copydefault());
        Boolean bool = Boolean.FALSE;
        if (y.f(valueOf, bool, bool).contains(Boolean.TRUE)) {
            aFe1uSDK = AFe1uSDK.SUCCESS;
        } else {
            aFe1uSDK = AFe1uSDK.FAILURE;
        }
        AFc1eSDK aFc1eSDK = this.component3;
        AFd1aSDK aFd1aSDK = new AFd1aSDK(System.currentTimeMillis() - currentTimeMillis);
        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1aSDK.getMediationNetwork + "ms", false, 4, null);
        aFc1eSDK.getMediationNetwork(aFd1aSDK);
        return aFe1uSDK;
    }

    private static void getRevenue(AFh1rSDK aFh1rSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1rSDK.getRevenue;
        if (str2 != null) {
            str = str2 + " | " + str;
        }
        aFh1rSDK.getRevenue = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:2:0x0000, B:4:0x001c, B:7:0x0030, B:11:0x0035, B:12:0x0045, B:14:0x0027), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getCurrencyIso4217Code(Context p02, AFa1uSDK p12) {
        try {
            p0 a9 = v6.a.a(p02);
            p12.setAdvertisingId(a9.f1971b);
            p12.setLimitAdTrackingEnabled(Boolean.valueOf(a9.f1972c));
            p12.setAdvertisingIdWithGps(true);
            String advertisingId = p12.getAdvertisingId();
            if (advertisingId != null) {
                if (advertisingId.length() == 0) {
                }
                if (Unit.f5554a == null) {
                    return true;
                }
                p12.getGaidError().append("gpsAdInfo-null |");
                throw new IllegalStateException("GpsAdIndo is null");
            }
            p12.getGaidError().append("emptyOrNull |");
            if (Unit.f5554a == null) {
            }
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, v4.a.k("Google Play Services is missing ", th.getMessage()), th, false, false, false, false, 88, null);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }
}
