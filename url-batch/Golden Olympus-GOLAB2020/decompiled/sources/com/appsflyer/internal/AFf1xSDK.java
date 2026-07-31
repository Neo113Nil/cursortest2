package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.ironsource.da;
import com.ironsource.ge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
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
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFf1xSDK extends AFe1dSDK<AFa1mSDK> {
    private int AFInAppEventParameterName;
    private final List<AFj1qSDK> AFInAppEventType;
    private int AFKeystoreWrapper;
    private int AFLogger;
    private final AFa1pSDK component2;
    private final AFh1vSDK copy;
    private final AFc1kSDK copydefault;
    private final AFc1pSDK equals;
    private final AFa1oSDK hashCode;
    private final CountDownLatch registerClient;
    private final AFj1sSDK toString;

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;
        public static final /* synthetic */ int[] getRevenue;

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
            getRevenue = iArr;
            int[] iArr2 = new int[AFj1qSDK.AFa1ySDK.values().length];
            try {
                iArr2[AFj1qSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1qSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            AFAdRevenueData = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1xSDK(AFa1pSDK aFa1pSDK, AFc1dSDK aFc1dSDK) {
        super(AFe1mSDK.DLSDK, new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, aFc1dSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        this.component2 = aFa1pSDK;
        this.registerClient = new CountDownLatch(1);
        this.AFInAppEventType = new ArrayList();
        AFc1pSDK revenue = aFc1dSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        this.equals = revenue;
        AFc1kSDK afInfoLog = aFc1dSDK.afInfoLog();
        Intrinsics.checkNotNullExpressionValue(afInfoLog, "");
        this.copydefault = afInfoLog;
        AFa1oSDK d4 = aFc1dSDK.d();
        Intrinsics.checkNotNullExpressionValue(d4, "");
        this.hashCode = d4;
        AFh1vSDK areAllFieldsValid = aFc1dSDK.areAllFieldsValid();
        Intrinsics.checkNotNullExpressionValue(areAllFieldsValid, "");
        this.copy = areAllFieldsValid;
        AFj1sSDK AFLogger = aFc1dSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(AFLogger, "");
        this.toString = AFLogger;
        AFj1qSDK[] revenue2 = AFLogger.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue2, "");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (AFj1qSDK aFj1qSDK : revenue2) {
            if (aFj1qSDK != null && aFj1qSDK.component4 != AFj1qSDK.AFa1ySDK.NOT_STARTED) {
                arrayList.add(aFj1qSDK);
            }
        }
        this.AFInAppEventParameterName = arrayList.size();
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            final AFj1qSDK aFj1qSDK2 = (AFj1qSDK) obj;
            AFj1qSDK.AFa1ySDK aFa1ySDK = aFj1qSDK2.component4;
            int i5 = aFa1ySDK == null ? -1 : AFa1tSDK.AFAdRevenueData[aFa1ySDK.ordinal()];
            if (i5 == 1) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1qSDK2.AFAdRevenueData.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1qSDK2, "");
                getMediationNetwork(aFj1qSDK2);
            } else if (i5 == 2) {
                aFj1qSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.u
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj2) {
                        AFf1xSDK.getMonetizationNetwork(AFj1qSDK.this, this, observable, obj2);
                    }
                });
            }
        }
    }

    private static Map<String, String> AFAdRevenueData(AFb1mSDK aFb1mSDK) {
        String str;
        if (aFb1mSDK == null || (str = aFb1mSDK.getMonetizationNetwork) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1mSDK.getMediationNetwork;
        if (bool == null || !bool.booleanValue()) {
            return MapsKt.mapOf(TuplesKt.to("type", "unhashed"), TuplesKt.to("value", str));
        }
        return null;
    }

    private final boolean copy() {
        Object obj = this.component2.AFAdRevenueData.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.AFInAppEventParameterName && !this.component2.AFAdRevenueData.containsKey("referrers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFj1qSDK aFj1qSDK, AFf1xSDK aFf1xSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1xSDK, "");
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1qSDK.AFAdRevenueData.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.checkNotNull(observable, "");
        aFf1xSDK.getMediationNetwork((AFj1qSDK) observable);
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener component3() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final AFe1rSDK getCurrencyIso4217Code() {
        AFe1rSDK aFe1rSDK = AFe1rSDK.FAILURE;
        try {
            AFe1rSDK currencyIso4217Code = super.getCurrencyIso4217Code();
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            try {
                AFh1vSDK aFh1vSDK = this.copy;
                int i4 = this.AFLogger;
                if (i4 <= 0 || i4 > 2) {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i4))));
                } else {
                    int i5 = i4 - 1;
                    aFh1vSDK.component2[i5] = System.currentTimeMillis();
                    long j4 = aFh1vSDK.component1[i5];
                    if (j4 != 0) {
                        long[] jArr = aFh1vSDK.component4;
                        jArr[i5] = aFh1vSDK.component2[i5] - j4;
                        aFh1vSDK.getMonetizationNetwork.put("net", jArr);
                        aFh1vSDK.getCurrencyIso4217Code.getMediationNetwork("ddl", new JSONObject(aFh1vSDK.getMonetizationNetwork).toString());
                    } else {
                        StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                        sb.append(i5);
                        sb.append("] ts is missing");
                        AFLogger.afInfoLog(sb.toString());
                    }
                }
                int i6 = AFa1tSDK.getRevenue[currencyIso4217Code.ordinal()];
                if (i6 != 1) {
                    if (i6 != 2) {
                        return currencyIso4217Code;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                    ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
                    AFg1gSDK.d$default(aFLogger, aFg1cSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.copy.getMediationNetwork(deepLinkResult, this.hashCode.component3);
                    this.hashCode.getRevenue(deepLinkResult);
                    return currencyIso4217Code;
                }
                ResponseNetwork responseNetwork2 = ((AFe1dSDK) this).component1;
                Intrinsics.checkNotNull(responseNetwork2);
                Object body = responseNetwork2.getBody();
                Intrinsics.checkNotNullExpressionValue(body, "");
                AFa1mSDK aFa1mSDK = (AFa1mSDK) body;
                DeepLink deepLink = aFa1mSDK.getCurrencyIso4217Code;
                if (deepLink != null) {
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                    this.copy.getMediationNetwork(deepLinkResult2, this.hashCode.component3);
                    this.hashCode.getRevenue(deepLinkResult2);
                    return currencyIso4217Code;
                }
                if (this.AFLogger > 1 || !aFa1mSDK.getRevenue() || !copy()) {
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.copy.getMediationNetwork(deepLinkResult3, this.hashCode.component3);
                    this.hashCode.getRevenue(deepLinkResult3);
                    return currencyIso4217Code;
                }
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Waiting for referrers...", false, 4, null);
                this.registerClient.await();
                AFh1vSDK aFh1vSDK2 = this.copy;
                long currentTimeMillis = System.currentTimeMillis();
                long j5 = aFh1vSDK2.component2[0];
                if (j5 != 0) {
                    aFh1vSDK2.getMonetizationNetwork.put("rfr_wait", Long.valueOf(currentTimeMillis - j5));
                    aFh1vSDK2.getCurrencyIso4217Code.getMediationNetwork("ddl", new JSONObject(aFh1vSDK2.getMonetizationNetwork).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (this.AFKeystoreWrapper != this.AFInAppEventParameterName) {
                    return getCurrencyIso4217Code();
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                this.copy.getMediationNetwork(deepLinkResult4, this.hashCode.component3);
                this.hashCode.getRevenue(deepLinkResult4);
                return AFe1rSDK.SUCCESS;
            } catch (Exception e4) {
                e = e4;
                aFe1rSDK = currencyIso4217Code;
                Throwable cause = e.getCause();
                if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                    AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.AFLogger + " attempt(s) within " + this.hashCode.component3 + " milliseconds", false, 4, null);
                    DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                    this.copy.getMediationNetwork(deepLinkResult5, this.hashCode.component3);
                    this.hashCode.getRevenue(deepLinkResult5);
                    return AFe1rSDK.TIMEOUT;
                }
                if (cause instanceof IOException) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                    DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                    this.copy.getMediationNetwork(deepLinkResult6, this.hashCode.component3);
                    this.hashCode.getRevenue(deepLinkResult6);
                    return aFe1rSDK;
                }
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                this.copy.getMediationNetwork(deepLinkResult7, this.hashCode.component3);
                this.hashCode.getRevenue(deepLinkResult7);
                return aFe1rSDK;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFe1dSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFd1nSDK<AFa1mSDK> getRevenue(String str) {
        Map map;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        int i4 = this.AFLogger + 1;
        this.AFLogger = i4;
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Preparing request " + i4, false, 4, null);
        Map<String, Object> map2 = this.component2.AFAdRevenueData;
        if (this.AFLogger == 1) {
            map2.put("is_first", Boolean.valueOf(this.equals.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) == 0));
            map2.put(ge.f16487q, Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            map2.put(ge.f16395E, Build.VERSION.RELEASE);
            map2.put("type", Build.MODEL);
            map2.put(CommonUrlParts.REQUEST_ID, AFb1iSDK.getRevenue(this.equals.getMonetizationNetwork));
            AFb1uSDK aFb1uSDK = this.copydefault.getRevenue;
            if (aFb1uSDK != null && (strArr = aFb1uSDK.getMediationNetwork) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                map2.put("sharing_filter", strArr);
            }
            AFh1oSDK aFh1oSDK = this.equals.getCurrencyIso4217Code.component3;
            Map<String, String> AFAdRevenueData = AFAdRevenueData(aFh1oSDK != null ? new AFb1mSDK(aFh1oSDK.AFAdRevenueData, aFh1oSDK.getRevenue) : null);
            if (AFAdRevenueData != null) {
                map2.put(ge.f16424S0, AFAdRevenueData);
            }
            Map<String, String> AFAdRevenueData2 = AFAdRevenueData(AFb1jSDK.getMediationNetwork(this.equals.getRevenue.getMonetizationNetwork));
            if (AFAdRevenueData2 != null) {
                map2.put(CommonUrlParts.HUAWEI_OAID, AFAdRevenueData2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map2.put(da.a.f15878d, simpleDateFormat.format(new Date(currentTimeMillis)));
        map2.put("request_count", Integer.valueOf(this.AFLogger));
        List<AFj1qSDK> list = this.AFInAppEventType;
        ArrayList arrayList = new ArrayList();
        for (AFj1qSDK aFj1qSDK : list) {
            if (aFj1qSDK.component4 == AFj1qSDK.AFa1ySDK.FINISHED) {
                Object obj = aFj1qSDK.AFAdRevenueData.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFj1qSDK.AFAdRevenueData.get("source");
                    Intrinsics.checkNotNull(obj2, "");
                    map = MapsKt.mapOf(TuplesKt.to("source", (String) obj2), TuplesKt.to("value", str2));
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
        AFj1fSDK aFj1fSDK = new AFj1fSDK(this.equals, null, 2, null);
        String mediationNetwork = ((AFe1dSDK) this).component3.getMediationNetwork();
        Object obj3 = this.component2.AFAdRevenueData.get(da.a.f15878d);
        Intrinsics.checkNotNull(obj3, "");
        aFa1pSDK.component1 = aFj1fSDK.AFAdRevenueData(mediationNetwork, (String) obj3);
        AFh1vSDK aFh1vSDK = this.copy;
        int i5 = this.AFLogger;
        if (i5 <= 0 || i5 > 2) {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i5))));
        } else {
            int i6 = i5 - 1;
            aFh1vSDK.component1[i6] = System.currentTimeMillis();
            if (i6 == 0) {
                long j4 = aFh1vSDK.component3;
                if (j4 != 0) {
                    aFh1vSDK.getMonetizationNetwork.put("from_fg", Long.valueOf(aFh1vSDK.component1[i6] - j4));
                    aFh1vSDK.getCurrencyIso4217Code.getMediationNetwork("ddl", new JSONObject(aFh1vSDK.getMonetizationNetwork).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        }
        AFd1nSDK<AFa1mSDK> AFAdRevenueData3 = this.component4.AFAdRevenueData(this.component2);
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData3, "");
        return AFAdRevenueData3;
    }

    private final void getMediationNetwork(AFj1qSDK aFj1qSDK) {
        if (!getMonetizationNetwork(aFj1qSDK)) {
            int i4 = this.AFKeystoreWrapper + 1;
            this.AFKeystoreWrapper = i4;
            if (i4 == this.AFInAppEventParameterName) {
                this.registerClient.countDown();
                return;
            }
            return;
        }
        this.AFInAppEventType.add(aFj1qSDK);
        this.registerClient.countDown();
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Added non-organic " + aFj1qSDK.getClass().getSimpleName(), false, 4, null);
    }

    private static boolean getMonetizationNetwork(AFj1qSDK aFj1qSDK) {
        Object obj = aFj1qSDK.AFAdRevenueData.get("click_ts");
        Long l4 = obj instanceof Long ? (Long) obj : null;
        if (l4 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l4.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return this.hashCode.component3;
    }
}
