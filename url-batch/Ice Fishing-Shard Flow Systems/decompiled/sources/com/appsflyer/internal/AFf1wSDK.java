package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1zSDK;
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
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFf1wSDK extends AFe1bSDK<AFa1mSDK> {
    private int AFInAppEventParameterName;
    private int AFInAppEventType;
    private final List<AFj1zSDK> AFKeystoreWrapper;
    private final CountDownLatch AFLogger;
    private final AFa1pSDK component2;
    private final AFj1rSDK copy;
    private final AFa1oSDK copydefault;
    private final AFc1gSDK equals;
    private final AFc1kSDK hashCode;
    private int registerClient;
    private final AFh1uSDK toString;

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFe1rSDK.values().length];
            try {
                iArr[AFe1rSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1rSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getCurrencyIso4217Code = iArr;
            int[] iArr2 = new int[AFj1zSDK.AFa1ySDK.values().length];
            try {
                iArr2[AFj1zSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1zSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            getMediationNetwork = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1wSDK(AFa1pSDK aFa1pSDK, AFd1zSDK aFd1zSDK) {
        super(AFe1lSDK.DLSDK, new AFe1lSDK[]{AFe1lSDK.RC_CDN, AFe1lSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.component2 = aFa1pSDK;
        this.AFLogger = new CountDownLatch(1);
        this.AFKeystoreWrapper = new ArrayList();
        AFc1kSDK AFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        this.hashCode = AFAdRevenueData;
        AFc1gSDK e7 = aFd1zSDK.e();
        Intrinsics.checkNotNullExpressionValue(e7, "");
        this.equals = e7;
        AFa1oSDK i2 = aFd1zSDK.i();
        Intrinsics.checkNotNullExpressionValue(i2, "");
        this.copydefault = i2;
        AFh1uSDK component2 = aFd1zSDK.component2();
        Intrinsics.checkNotNullExpressionValue(component2, "");
        this.toString = component2;
        AFj1rSDK copydefault = aFd1zSDK.copydefault();
        Intrinsics.checkNotNullExpressionValue(copydefault, "");
        this.copy = copydefault;
        int i5 = 0;
        AFj1zSDK[] aFj1zSDKArr = (AFj1zSDK[]) copydefault.AFAdRevenueData.toArray(new AFj1zSDK[0]);
        Intrinsics.checkNotNullExpressionValue(aFj1zSDKArr, "");
        ArrayList arrayList = new ArrayList();
        for (AFj1zSDK aFj1zSDK : aFj1zSDKArr) {
            if (aFj1zSDK != null && aFj1zSDK.component2 != AFj1zSDK.AFa1ySDK.NOT_STARTED) {
                arrayList.add(aFj1zSDK);
            }
        }
        this.registerClient = arrayList.size();
        int size = arrayList.size();
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            final AFj1zSDK aFj1zSDK2 = (AFj1zSDK) obj;
            AFj1zSDK.AFa1ySDK aFa1ySDK = aFj1zSDK2.component2;
            int i7 = aFa1ySDK == null ? -1 : AFa1tSDK.getMediationNetwork[aFa1ySDK.ordinal()];
            if (i7 == 1) {
                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1zSDK2.getCurrencyIso4217Code.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1zSDK2, "");
                AFAdRevenueData(aFj1zSDK2);
            } else if (i7 == 2) {
                aFj1zSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.k
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj2) {
                        AFf1wSDK.AFAdRevenueData(AFj1zSDK.this, this, observable, obj2);
                    }
                });
            }
        }
    }

    private final boolean equals() {
        Object obj = this.component2.AFAdRevenueData.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.registerClient && !this.component2.AFAdRevenueData.containsKey("referrers");
    }

    private static boolean getRevenue(AFj1zSDK aFj1zSDK) {
        Object obj = aFj1zSDK.getCurrencyIso4217Code.get("click_ts");
        Long l7 = obj instanceof Long ? (Long) obj : null;
        if (l7 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l7.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:5:0x0011, B:9:0x001d, B:11:0x002e, B:12:0x006e, B:17:0x007b, B:19:0x0083, B:20:0x008d, B:23:0x00b6, B:25:0x00c8, B:27:0x00dc, B:29:0x00e0, B:31:0x00e6, B:33:0x00ec, B:35:0x010c, B:36:0x011e, B:38:0x0124, B:40:0x013a, B:42:0x0119, B:43:0x013f, B:45:0x0043, B:46:0x005a), top: B:4:0x0011 }] */
    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1rSDK getMediationNetwork() {
        int i2;
        AFe1rSDK aFe1rSDK = AFe1rSDK.FAILURE;
        try {
            AFe1rSDK mediationNetwork = super.getMediationNetwork();
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            try {
                AFh1uSDK aFh1uSDK = this.toString;
                int i5 = this.AFInAppEventType;
                if (i5 > 0 && i5 <= 2) {
                    int i7 = i5 - 1;
                    aFh1uSDK.component2[i7] = System.currentTimeMillis();
                    long j = aFh1uSDK.areAllFieldsValid[i7];
                    if (j != 0) {
                        long[] jArr = aFh1uSDK.component4;
                        jArr[i7] = aFh1uSDK.component2[i7] - j;
                        aFh1uSDK.getMonetizationNetwork.put("net", jArr);
                    } else {
                        StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                        sb.append(i7);
                        sb.append("] ts is missing");
                        AFLogger.afInfoLog(sb.toString());
                    }
                    i2 = AFa1tSDK.getCurrencyIso4217Code[mediationNetwork.ordinal()];
                    if (i2 == 1) {
                        if (i2 != 2) {
                            return mediationNetwork;
                        }
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
                        AFg1hSDK.d$default(aFLogger, aFg1cSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                        DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                        this.toString.getMediationNetwork(deepLinkResult, this.copydefault.component3);
                        this.copydefault.getCurrencyIso4217Code(deepLinkResult);
                        return mediationNetwork;
                    }
                    ResponseNetwork responseNetwork2 = ((AFe1bSDK) this).component4;
                    Intrinsics.b(responseNetwork2);
                    Object body = responseNetwork2.getBody();
                    Intrinsics.checkNotNullExpressionValue(body, "");
                    AFa1mSDK aFa1mSDK = (AFa1mSDK) body;
                    DeepLink deepLink = aFa1mSDK.getCurrencyIso4217Code;
                    if (deepLink != null) {
                        DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                        this.toString.getMediationNetwork(deepLinkResult2, this.copydefault.component3);
                        this.copydefault.getCurrencyIso4217Code(deepLinkResult2);
                        return mediationNetwork;
                    }
                    if (this.AFInAppEventType > 1 || !aFa1mSDK.getMonetizationNetwork() || !equals()) {
                        DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                        this.toString.getMediationNetwork(deepLinkResult3, this.copydefault.component3);
                        this.copydefault.getCurrencyIso4217Code(deepLinkResult3);
                        return mediationNetwork;
                    }
                    AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Waiting for referrers...", false, 4, null);
                    this.AFLogger.await();
                    AFh1uSDK aFh1uSDK2 = this.toString;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j7 = aFh1uSDK2.component2[0];
                    if (j7 != 0) {
                        aFh1uSDK2.getMonetizationNetwork.put("rfr_wait", Long.valueOf(currentTimeMillis - j7));
                    } else {
                        AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                    }
                    if (this.AFInAppEventParameterName != this.registerClient) {
                        return getMediationNetwork();
                    }
                    DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                    this.toString.getMediationNetwork(deepLinkResult4, this.copydefault.component3);
                    this.copydefault.getCurrencyIso4217Code(deepLinkResult4);
                    return AFe1rSDK.SUCCESS;
                }
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i5))));
                i2 = AFa1tSDK.getCurrencyIso4217Code[mediationNetwork.ordinal()];
                if (i2 == 1) {
                }
            } catch (Exception e7) {
                e = e7;
                aFe1rSDK = mediationNetwork;
                Throwable cause = e.getCause();
                if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                    AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                    AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.AFInAppEventType + " attempt(s) within " + this.copydefault.component3 + " milliseconds", false, 4, null);
                    DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                    this.toString.getMediationNetwork(deepLinkResult5, this.copydefault.component3);
                    this.copydefault.getCurrencyIso4217Code(deepLinkResult5);
                    return AFe1rSDK.TIMEOUT;
                }
                if (cause instanceof IOException) {
                    AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                    DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                    this.toString.getMediationNetwork(deepLinkResult6, this.copydefault.component3);
                    this.copydefault.getCurrencyIso4217Code(deepLinkResult6);
                    return aFe1rSDK;
                }
                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                this.toString.getMediationNetwork(deepLinkResult7, this.copydefault.component3);
                this.copydefault.getCurrencyIso4217Code(deepLinkResult7);
                return aFe1rSDK;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }

    private final void AFAdRevenueData(AFj1zSDK aFj1zSDK) {
        if (getRevenue(aFj1zSDK)) {
            this.AFKeystoreWrapper.add(aFj1zSDK);
            this.AFLogger.countDown();
            AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Added non-organic ".concat(aFj1zSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i2 = this.AFInAppEventParameterName + 1;
            this.AFInAppEventParameterName = i2;
            if (i2 == this.registerClient) {
                this.AFLogger.countDown();
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final long getRevenue() {
        return this.copydefault.component3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFe1bSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFd1fSDK<AFa1mSDK> getRevenue(String str) {
        Map map;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        int i2 = this.AFInAppEventType + 1;
        this.AFInAppEventType = i2;
        AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, C4.p.g(i2, "Preparing request "), false, 4, null);
        Map<String, Object> map2 = this.component2.AFAdRevenueData;
        if (this.AFInAppEventType == 1) {
            map2.put("is_first", Boolean.valueOf(this.hashCode.getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0) == 0));
            map2.put("lang", Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            map2.put("os", Build.VERSION.RELEASE);
            map2.put(com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_KEY, Build.MODEL);
            map2.put("request_id", AFb1iSDK.getCurrencyIso4217Code(this.hashCode.getCurrencyIso4217Code));
            AFb1uSDK aFb1uSDK = this.equals.getMonetizationNetwork;
            if (aFb1uSDK != null && (strArr = aFb1uSDK.getRevenue) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                map2.put("sharing_filter", strArr);
            }
            AFh1rSDK aFh1rSDK = this.hashCode.getMediationNetwork.component2;
            Map<String, String> AFAdRevenueData = AFAdRevenueData(aFh1rSDK != null ? new AFb1mSDK(aFh1rSDK.getMonetizationNetwork, aFh1rSDK.AFAdRevenueData) : null);
            if (AFAdRevenueData != null) {
                map2.put("gaid", AFAdRevenueData);
            }
            Map<String, String> AFAdRevenueData2 = AFAdRevenueData(AFb1jSDK.getRevenue(this.hashCode.getRevenue.getCurrencyIso4217Code));
            if (AFAdRevenueData2 != null) {
                map2.put("oaid", AFAdRevenueData2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map2.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        map2.put("request_count", Integer.valueOf(this.AFInAppEventType));
        List<AFj1zSDK> list = this.AFKeystoreWrapper;
        ArrayList arrayList = new ArrayList();
        for (AFj1zSDK aFj1zSDK : list) {
            if (aFj1zSDK.component2 == AFj1zSDK.AFa1ySDK.FINISHED) {
                Object obj = aFj1zSDK.getCurrencyIso4217Code.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFj1zSDK.getCurrencyIso4217Code.get("source");
                    Intrinsics.c(obj2, "");
                    map = I.e(new Pair("source", (String) obj2), new Pair("value", str2));
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
        AFa1pSDK aFa1pSDK = this.component2;
        AFj1kSDK aFj1kSDK = new AFj1kSDK(this.hashCode, null, 2, null);
        String monetizationNetwork = ((AFe1bSDK) this).component1.getMonetizationNetwork();
        Object obj3 = this.component2.AFAdRevenueData.get("timestamp");
        Intrinsics.c(obj3, "");
        aFa1pSDK.component3 = aFj1kSDK.getCurrencyIso4217Code(monetizationNetwork, (String) obj3);
        AFh1uSDK aFh1uSDK = this.toString;
        int i5 = this.AFInAppEventType;
        if (i5 > 0 && i5 <= 2) {
            int i7 = i5 - 1;
            aFh1uSDK.areAllFieldsValid[i7] = System.currentTimeMillis();
            if (i7 == 0) {
                long j = aFh1uSDK.component1;
                if (j != 0) {
                    aFh1uSDK.getMonetizationNetwork.put("from_fg", Long.valueOf(aFh1uSDK.areAllFieldsValid[i7] - j));
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i5))));
        }
        AFd1fSDK<AFa1mSDK> currencyIso4217Code = ((AFe1bSDK) this).component3.getCurrencyIso4217Code(this.component2);
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        return currencyIso4217Code;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFj1zSDK aFj1zSDK, AFf1wSDK aFf1wSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1wSDK, "");
        AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1zSDK.getCurrencyIso4217Code.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.c(observable, "");
        aFf1wSDK.AFAdRevenueData((AFj1zSDK) observable);
    }

    private static Map<String, String> AFAdRevenueData(AFb1mSDK aFb1mSDK) {
        String str;
        if (aFb1mSDK == null || (str = aFb1mSDK.getRevenue) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1mSDK.getMonetizationNetwork;
        if (bool == null || !bool.booleanValue()) {
            return I.e(new Pair(com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_KEY, "unhashed"), new Pair("value", str));
        }
        return null;
    }
}
