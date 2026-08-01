package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1tSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.collections.p0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFf1xSDK extends AFe1fSDK<AFa1oSDK> {
    private int AFInAppEventParameterName;
    private final CountDownLatch AFInAppEventType;
    private int AFKeystoreWrapper;
    private final List<AFj1tSDK> AFLogger;
    private final AFa1rSDK component2;
    private final AFh1xSDK copy;
    private final AFc1oSDK copydefault;
    private final AFj1sSDK equals;
    private final AFa1mSDK hashCode;
    private int registerClient;
    private final AFc1eSDK toString;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1uSDK.values().length];
            try {
                iArr[AFe1uSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1uSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getRevenue = iArr;
            int[] iArr2 = new int[AFj1tSDK.AFa1tSDK.values().length];
            try {
                iArr2[AFj1tSDK.AFa1tSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1tSDK.AFa1tSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            getMonetizationNetwork = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1xSDK(AFa1rSDK aFa1rSDK, AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.DLSDK, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, "DdlSdk");
        aFa1rSDK.getClass();
        aFd1zSDK.getClass();
        this.component2 = aFa1rSDK;
        this.AFInAppEventType = new CountDownLatch(1);
        this.AFLogger = new ArrayList();
        AFc1oSDK AFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        AFAdRevenueData.getClass();
        this.copydefault = AFAdRevenueData;
        AFc1eSDK force = aFd1zSDK.force();
        force.getClass();
        this.toString = force;
        AFa1mSDK i3 = aFd1zSDK.i();
        i3.getClass();
        this.hashCode = i3;
        AFh1xSDK areAllFieldsValid = aFd1zSDK.areAllFieldsValid();
        areAllFieldsValid.getClass();
        this.copy = areAllFieldsValid;
        AFj1sSDK AFLogger = aFd1zSDK.AFLogger();
        AFLogger.getClass();
        this.equals = AFLogger;
        int i10 = 0;
        AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) AFLogger.getRevenue.toArray(new AFj1tSDK[0]);
        aFj1tSDKArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (AFj1tSDK aFj1tSDK : aFj1tSDKArr) {
            if (aFj1tSDK != null && aFj1tSDK.component4 != AFj1tSDK.AFa1tSDK.NOT_STARTED) {
                arrayList.add(aFj1tSDK);
            }
        }
        this.AFInAppEventParameterName = arrayList.size();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            final AFj1tSDK aFj1tSDK2 = (AFj1tSDK) obj;
            AFj1tSDK.AFa1tSDK aFa1tSDK = aFj1tSDK2.component4;
            int i11 = aFa1tSDK == null ? -1 : AFa1uSDK.getMonetizationNetwork[aFa1tSDK.ordinal()];
            if (i11 == 1) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK2.getMediationNetwork.get("source") + " referrer collected earlier", false, 4, null);
                getCurrencyIso4217Code(aFj1tSDK2);
            } else if (i11 == 2) {
                aFj1tSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.m
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj2) {
                        AFf1xSDK.getRevenue(AFj1tSDK.this, this, observable, obj2);
                    }
                });
            }
        }
    }

    private final boolean equals() {
        Object obj = this.component2.AFAdRevenueData.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.AFInAppEventParameterName && !this.component2.AFAdRevenueData.containsKey("referrers");
    }

    private final void getCurrencyIso4217Code(AFj1tSDK aFj1tSDK) {
        if (getRevenue(aFj1tSDK)) {
            this.AFLogger.add(aFj1tSDK);
            this.AFInAppEventType.countDown();
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Added non-organic ".concat(aFj1tSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i3 = this.AFKeystoreWrapper + 1;
            this.AFKeystoreWrapper = i3;
            if (i3 == this.AFInAppEventParameterName) {
                this.AFInAppEventType.countDown();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFe1fSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFd1hSDK<AFa1oSDK> AFAdRevenueData(String str) {
        Map map;
        String[] strArr;
        str.getClass();
        int i3 = this.registerClient + 1;
        this.registerClient = i3;
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, v4.a.j(i3, "Preparing request "), false, 4, null);
        Map<String, Object> map2 = this.component2.AFAdRevenueData;
        if (this.registerClient == 1) {
            map2.put("is_first", Boolean.valueOf(this.copydefault.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 0));
            map2.put("lang", Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            map2.put("os", Build.VERSION.RELEASE);
            map2.put(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, Build.MODEL);
            map2.put("request_id", AFb1kSDK.getCurrencyIso4217Code(this.copydefault.getMediationNetwork));
            AFb1tSDK aFb1tSDK = this.toString.getRevenue;
            if (aFb1tSDK != null && (strArr = aFb1tSDK.AFAdRevenueData) != null) {
                map2.put("sharing_filter", strArr);
            }
            AFh1rSDK aFh1rSDK = this.copydefault.getMonetizationNetwork.component3;
            Map<String, String> currencyIso4217Code = getCurrencyIso4217Code(aFh1rSDK != null ? new AFb1jSDK(aFh1rSDK.getMediationNetwork, aFh1rSDK.component2) : null);
            if (currencyIso4217Code != null) {
                map2.put("gaid", currencyIso4217Code);
            }
            Map<String, String> currencyIso4217Code2 = getCurrencyIso4217Code(AFb1lSDK.getMediationNetwork(this.copydefault.getCurrencyIso4217Code.getMonetizationNetwork));
            if (currencyIso4217Code2 != null) {
                map2.put("oaid", currencyIso4217Code2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map2.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        map2.put("request_count", Integer.valueOf(this.registerClient));
        List<AFj1tSDK> list = this.AFLogger;
        ArrayList arrayList = new ArrayList();
        for (AFj1tSDK aFj1tSDK : list) {
            if (aFj1tSDK.component4 == AFj1tSDK.AFa1tSDK.FINISHED) {
                Object obj = aFj1tSDK.getMediationNetwork.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFj1tSDK.getMediationNetwork.get("source");
                    obj2.getClass();
                    map = p0.d(new Pair("source", (String) obj2), new Pair("value", str2));
                    if (map == null) {
                        arrayList.add(map);
                    }
                }
            }
            map = null;
            if (map == null) {
            }
        }
        if (!arrayList.isEmpty()) {
            map2.put("referrers", arrayList);
        }
        AFa1rSDK aFa1rSDK = this.component2;
        AFj1cSDK aFj1cSDK = new AFj1cSDK(this.copydefault, null, 2, null);
        String mediationNetwork = ((AFe1fSDK) this).component1.getMediationNetwork();
        Object obj3 = this.component2.AFAdRevenueData.get("timestamp");
        obj3.getClass();
        aFa1rSDK.component2 = aFj1cSDK.getMonetizationNetwork(mediationNetwork, (String) obj3);
        AFh1xSDK aFh1xSDK = this.copy;
        int i10 = this.registerClient;
        if (i10 <= 0 || i10 > 2) {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i10))));
        } else {
            int i11 = i10 - 1;
            aFh1xSDK.component3[i11] = System.currentTimeMillis();
            if (i11 == 0) {
                long j = aFh1xSDK.component4;
                if (j != 0) {
                    aFh1xSDK.getMediationNetwork.put("from_fg", Long.valueOf(aFh1xSDK.component3[i11] - j));
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        }
        AFd1hSDK<AFa1oSDK> monetizationNetwork = ((AFe1fSDK) this).component4.getMonetizationNetwork(this.component2);
        monetizationNetwork.getClass();
        return monetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1 A[Catch: Exception -> 0x003b, TryCatch #1 {Exception -> 0x003b, blocks: (B:6:0x000d, B:10:0x0019, B:12:0x002a, B:13:0x006a, B:18:0x0077, B:20:0x007f, B:21:0x0089, B:24:0x00b1, B:26:0x00c3, B:28:0x00d7, B:30:0x00db, B:32:0x00e1, B:34:0x00e7, B:36:0x0107, B:37:0x0119, B:39:0x011f, B:41:0x0135, B:43:0x0114, B:44:0x013a, B:46:0x003f, B:47:0x0056), top: B:5:0x000d }] */
    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1uSDK getRevenue() {
        AFe1uSDK revenue;
        int i3;
        AFe1uSDK aFe1uSDK = AFe1uSDK.FAILURE;
        try {
            revenue = super.getRevenue();
            revenue.getClass();
        } catch (Exception e2) {
            e = e2;
        }
        try {
            AFh1xSDK aFh1xSDK = this.copy;
            int i10 = this.registerClient;
            if (i10 > 0 && i10 <= 2) {
                int i11 = i10 - 1;
                aFh1xSDK.component2[i11] = System.currentTimeMillis();
                long j = aFh1xSDK.component3[i11];
                if (j != 0) {
                    long[] jArr = aFh1xSDK.component1;
                    jArr[i11] = aFh1xSDK.component2[i11] - j;
                    aFh1xSDK.getMediationNetwork.put("net", jArr);
                } else {
                    StringBuilder sb2 = new StringBuilder("Metrics: ddlStart[");
                    sb2.append(i11);
                    sb2.append("] ts is missing");
                    AFLogger.afInfoLog(sb2.toString());
                }
                i3 = AFa1uSDK.getRevenue[revenue.ordinal()];
                if (i3 == 1) {
                    if (i3 != 2) {
                        return revenue;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                    ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
                    AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.copy.getCurrencyIso4217Code(deepLinkResult, this.hashCode.component2);
                    this.hashCode.getRevenue(deepLinkResult);
                    return revenue;
                }
                ResponseNetwork responseNetwork2 = ((AFe1fSDK) this).areAllFieldsValid;
                responseNetwork2.getClass();
                Object body = responseNetwork2.getBody();
                body.getClass();
                AFa1oSDK aFa1oSDK = (AFa1oSDK) body;
                DeepLink deepLink = aFa1oSDK.getCurrencyIso4217Code;
                if (deepLink != null) {
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                    this.copy.getCurrencyIso4217Code(deepLinkResult2, this.hashCode.component2);
                    this.hashCode.getRevenue(deepLinkResult2);
                    return revenue;
                }
                if (this.registerClient > 1 || !aFa1oSDK.getAFAdRevenueData() || !equals()) {
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.copy.getCurrencyIso4217Code(deepLinkResult3, this.hashCode.component2);
                    this.hashCode.getRevenue(deepLinkResult3);
                    return revenue;
                }
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Waiting for referrers...", false, 4, null);
                this.AFInAppEventType.await();
                AFh1xSDK aFh1xSDK2 = this.copy;
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = aFh1xSDK2.component2[0];
                if (j3 != 0) {
                    aFh1xSDK2.getMediationNetwork.put("rfr_wait", Long.valueOf(currentTimeMillis - j3));
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (this.AFKeystoreWrapper != this.AFInAppEventParameterName) {
                    return getRevenue();
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                this.copy.getCurrencyIso4217Code(deepLinkResult4, this.hashCode.component2);
                this.hashCode.getRevenue(deepLinkResult4);
                return AFe1uSDK.SUCCESS;
            }
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i10))));
            i3 = AFa1uSDK.getRevenue[revenue.ordinal()];
            if (i3 == 1) {
            }
        } catch (Exception e9) {
            e = e9;
            aFe1uSDK = revenue;
            Throwable cause = e.getCause();
            if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.registerClient + " attempt(s) within " + this.hashCode.component2 + " milliseconds", false, 4, null);
                DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.copy.getCurrencyIso4217Code(deepLinkResult5, this.hashCode.component2);
                this.hashCode.getRevenue(deepLinkResult5);
                return AFe1uSDK.TIMEOUT;
            }
            if (cause instanceof IOException) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                this.copy.getCurrencyIso4217Code(deepLinkResult6, this.hashCode.component2);
                this.hashCode.getRevenue(deepLinkResult6);
                return aFe1uSDK;
            }
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
            DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            this.copy.getCurrencyIso4217Code(deepLinkResult7, this.hashCode.component2);
            this.hashCode.getRevenue(deepLinkResult7);
            return aFe1uSDK;
        }
    }

    private static Map<String, String> getCurrencyIso4217Code(AFb1jSDK aFb1jSDK) {
        String str;
        if (aFb1jSDK == null || (str = aFb1jSDK.getRevenue) == null) {
            return null;
        }
        Boolean bool = aFb1jSDK.getCurrencyIso4217Code;
        if (bool == null || !bool.booleanValue()) {
            return p0.d(new Pair(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, "unhashed"), new Pair("value", str));
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return this.hashCode.component2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFj1tSDK aFj1tSDK, AFf1xSDK aFf1xSDK, Observable observable, Object obj) {
        aFf1xSDK.getClass();
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK.getMediationNetwork.get("source") + " referrer collected via observer", false, 4, null);
        observable.getClass();
        aFf1xSDK.getCurrencyIso4217Code((AFj1tSDK) observable);
    }

    private static boolean getRevenue(AFj1tSDK aFj1tSDK) {
        Object obj = aFj1tSDK.getMediationNetwork.get("click_ts");
        Long l10 = obj instanceof Long ? (Long) obj : null;
        if (l10 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l10.longValue()) < 86400000) {
                return true;
            }
        }
        return false;
    }
}
