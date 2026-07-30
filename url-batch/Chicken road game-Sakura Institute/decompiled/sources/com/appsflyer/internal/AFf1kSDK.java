package com.appsflyer.internal;

import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFi1hSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.firebase.database.core.ServerValues;
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
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFf1kSDK extends AFf1nSDK<AFc1pSDK> {
    private final CountDownLatch afDebugLog;
    private final List<AFi1hSDK> afErrorLog;
    private final AFd1sSDK afInfoLog;
    private int afRDLog;
    private int afVerboseLog;
    private int afWarnLog;
    private final AFi1aSDK force;
    private final AFh1wSDK i;
    private final AFc1jSDK unregisterClient;
    private final AFd1pSDK v;
    private final AFc1vSDK w;

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] valueOf;
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFe1bSDK.values().length];
            iArr[AFe1bSDK.SUCCESS.ordinal()] = 1;
            iArr[AFe1bSDK.FAILURE.ordinal()] = 2;
            valueOf = iArr;
            int[] iArr2 = new int[AFi1hSDK.AFa1ySDK.values().length];
            iArr2[AFi1hSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            iArr2[AFi1hSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            values = iArr2;
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1kSDK(AFc1jSDK aFc1jSDK, AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.DLSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFc1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.unregisterClient = aFc1jSDK;
        this.afDebugLog = new CountDownLatch(1);
        this.afErrorLog = new ArrayList();
        AFd1sSDK AFInAppEventType = aFd1kSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.afInfoLog = AFInAppEventType;
        AFd1pSDK level = aFd1kSDK.getLevel();
        Intrinsics.checkNotNullExpressionValue(level, "");
        this.v = level;
        AFc1vSDK afRDLog = aFd1kSDK.afRDLog();
        Intrinsics.checkNotNullExpressionValue(afRDLog, "");
        this.w = afRDLog;
        AFh1wSDK AFLogger = aFd1kSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(AFLogger, "");
        this.i = AFLogger;
        AFi1aSDK force = aFd1kSDK.force();
        Intrinsics.checkNotNullExpressionValue(force, "");
        this.force = force;
        AFi1hSDK[] AFKeystoreWrapper = force.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        ArrayList arrayList = new ArrayList();
        for (AFi1hSDK aFi1hSDK : AFKeystoreWrapper) {
            AFi1hSDK aFi1hSDK2 = aFi1hSDK;
            if (aFi1hSDK2 != null && aFi1hSDK2.unregisterClient != AFi1hSDK.AFa1ySDK.NOT_STARTED) {
                arrayList.add(aFi1hSDK);
            }
        }
        ArrayList<AFi1hSDK> arrayList2 = arrayList;
        this.afRDLog = arrayList2.size();
        for (final AFi1hSDK aFi1hSDK3 : arrayList2) {
            AFi1hSDK.AFa1ySDK aFa1ySDK = aFi1hSDK3.unregisterClient;
            int i = aFa1ySDK == null ? -1 : AFa1tSDK.values[aFa1ySDK.ordinal()];
            if (i == 1) {
                AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, new StringBuilder().append(aFi1hSDK3.AFInAppEventParameterName.get("source")).append(" referrer collected earlier").toString(), false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFi1hSDK3, "");
                AFInAppEventParameterName(aFi1hSDK3);
            } else if (i == 2) {
                aFi1hSDK3.addObserver(new Observer() { // from class: com.appsflyer.internal.AFf1kSDK$$ExternalSyntheticLambda0
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1kSDK.AFInAppEventType(AFi1hSDK.this, this, observable, obj);
                    }
                });
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        AFe1bSDK AFKeystoreWrapper;
        AFe1bSDK aFe1bSDK = AFe1bSDK.FAILURE;
        try {
            AFKeystoreWrapper = super.AFKeystoreWrapper();
            Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        } catch (Exception e) {
            e = e;
        }
        try {
            AFh1wSDK aFh1wSDK = this.i;
            int i = this.afWarnLog;
            if (i <= 0 || i > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
            } else {
                int i2 = i - 1;
                aFh1wSDK.AFLogger[i2] = System.currentTimeMillis();
                if (aFh1wSDK.e[i2] != 0) {
                    aFh1wSDK.d[i2] = aFh1wSDK.AFLogger[i2] - aFh1wSDK.e[i2];
                    aFh1wSDK.valueOf.put("net", aFh1wSDK.d);
                    aFh1wSDK.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(aFh1wSDK.valueOf).toString());
                } else {
                    AFLogger.afInfoLog(new StringBuilder("Metrics: ddlStart[").append(i2).append("] ts is missing").toString());
                }
            }
            int i3 = AFa1tSDK.valueOf[AFKeystoreWrapper.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    return AFKeystoreWrapper;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1aSDK aFg1aSDK = AFg1aSDK.DDL;
                StringBuilder sb = new StringBuilder("Error occurred. Server response code = ");
                ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
                AFg1fSDK.d$default(aFLogger, aFg1aSDK, sb.append(responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null).toString(), false, 4, null);
                DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                this.i.AFInAppEventParameterName(deepLinkResult, this.w.registerClient);
                this.w.values(deepLinkResult);
                return AFKeystoreWrapper;
            }
            ResponseNetwork responseNetwork2 = ((AFf1nSDK) this).registerClient;
            Intrinsics.checkNotNull(responseNetwork2);
            Object body = responseNetwork2.getBody();
            Intrinsics.checkNotNullExpressionValue(body, "");
            AFc1pSDK aFc1pSDK = (AFc1pSDK) body;
            if (aFc1pSDK.values == null) {
                if (this.afWarnLog <= 1 && aFc1pSDK.getAFInAppEventType() && w()) {
                    AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Waiting for referrers...", false, 4, null);
                    this.afDebugLog.await();
                    AFh1wSDK aFh1wSDK2 = this.i;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (aFh1wSDK2.AFLogger[0] != 0) {
                        aFh1wSDK2.valueOf.put("rfr_wait", Long.valueOf(currentTimeMillis - aFh1wSDK2.AFLogger[0]));
                        aFh1wSDK2.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(aFh1wSDK2.valueOf).toString());
                    } else {
                        AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                    }
                    if (this.afVerboseLog != this.afRDLog) {
                        return AFKeystoreWrapper();
                    }
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(null, null);
                    this.i.AFInAppEventParameterName(deepLinkResult2, this.w.registerClient);
                    this.w.values(deepLinkResult2);
                    return AFe1bSDK.SUCCESS;
                }
                DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                this.i.AFInAppEventParameterName(deepLinkResult3, this.w.registerClient);
                this.w.values(deepLinkResult3);
                return AFKeystoreWrapper;
            }
            DeepLinkResult deepLinkResult4 = new DeepLinkResult(aFc1pSDK.values, null);
            this.i.AFInAppEventParameterName(deepLinkResult4, this.w.registerClient);
            this.w.values(deepLinkResult4);
            return AFKeystoreWrapper;
        } catch (Exception e2) {
            e = e2;
            aFe1bSDK = AFKeystoreWrapper;
            Throwable cause = e.getCause();
            if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, new StringBuilder("Timeout, didn't manage to find deferred deeplink after ").append(this.afWarnLog).append(" attempt(s) within ").append(this.w.registerClient).append(" milliseconds").toString(), false, 4, null);
                DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.i.AFInAppEventParameterName(deepLinkResult5, this.w.registerClient);
                this.w.values(deepLinkResult5);
                return AFe1bSDK.TIMEOUT;
            }
            if (cause instanceof IOException) {
                AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                this.i.AFInAppEventParameterName(deepLinkResult6, this.w.registerClient);
                this.w.values(deepLinkResult6);
            } else {
                AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Unexpected Exception: ".concat(String.valueOf(e)), false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                this.i.AFInAppEventParameterName(deepLinkResult7, this.w.registerClient);
                this.w.values(deepLinkResult7);
            }
            return aFe1bSDK;
        }
    }

    private final void AFInAppEventParameterName(AFi1hSDK aFi1hSDK) {
        if (AFKeystoreWrapper(aFi1hSDK)) {
            this.afErrorLog.add(aFi1hSDK);
            this.afDebugLog.countDown();
            AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, new StringBuilder("Added non-organic ").append(aFi1hSDK.getClass().getSimpleName()).toString(), false, 4, null);
        } else {
            int i = this.afVerboseLog + 1;
            this.afVerboseLog = i;
            if (i == this.afRDLog) {
                this.afDebugLog.countDown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFi1hSDK aFi1hSDK, AFf1kSDK aFf1kSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1kSDK, "");
        AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, new StringBuilder().append(aFi1hSDK.AFInAppEventParameterName.get("source")).append(" referrer collected via observer").toString(), false, 4, null);
        if (observable == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.referrer.Referrer");
        }
        aFf1kSDK.AFInAppEventParameterName((AFi1hSDK) observable);
    }

    private final boolean w() {
        Object obj = this.unregisterClient.AFInAppEventParameterName().get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.afRDLog && !this.unregisterClient.AFInAppEventParameterName().containsKey("referrers");
    }

    private static boolean AFKeystoreWrapper(AFi1hSDK aFi1hSDK) {
        Object obj = aFi1hSDK.AFInAppEventParameterName.get("click_ts");
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return this.w.registerClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFf1nSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFe1sSDK<AFc1pSDK> AFKeystoreWrapper(String str) {
        Map map;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        this.afWarnLog++;
        AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, new StringBuilder("Preparing request ").append(this.afWarnLog).toString(), false, 4, null);
        Map<String, Object> AFInAppEventParameterName = this.unregisterClient.AFInAppEventParameterName();
        if (this.afWarnLog == 1) {
            AFInAppEventParameterName.put("is_first", Boolean.valueOf(this.afInfoLog.AFKeystoreWrapper.valueOf("appsFlyerCount", 0) == 0));
            AFInAppEventParameterName.put("lang", new StringBuilder().append(Locale.getDefault().getLanguage()).append('-').append(Locale.getDefault().getCountry()).toString());
            AFInAppEventParameterName.put("os", Build.VERSION.RELEASE);
            AFInAppEventParameterName.put("type", Build.MODEL);
            AFd1sSDK aFd1sSDK = this.afInfoLog;
            AFInAppEventParameterName.put("request_id", AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper));
            AFd1wSDK aFd1wSDK = this.v.AFKeystoreWrapper;
            if (aFd1wSDK != null && (strArr = aFd1wSDK.AFInAppEventType) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                AFInAppEventParameterName.put("sharing_filter", strArr);
            }
            AFh1uSDK aFh1uSDK = this.afInfoLog.AFInAppEventType.AFLogger;
            Map<String, String> valueOf = valueOf(aFh1uSDK != null ? new AFb1zSDK(aFh1uSDK.values, aFh1uSDK.registerClient) : null);
            if (valueOf != null) {
                AFInAppEventParameterName.put("gaid", valueOf);
            }
            Map<String, String> valueOf2 = valueOf(AFb1rSDK.AFInAppEventType(this.afInfoLog.valueOf.AFKeystoreWrapper));
            if (valueOf2 != null) {
                AFInAppEventParameterName.put("oaid", valueOf2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        AFInAppEventParameterName.put(ServerValues.NAME_OP_TIMESTAMP, simpleDateFormat.format(new Date(currentTimeMillis)));
        AFInAppEventParameterName.put("request_count", Integer.valueOf(this.afWarnLog));
        List<AFi1hSDK> list = this.afErrorLog;
        ArrayList arrayList = new ArrayList();
        for (AFi1hSDK aFi1hSDK : list) {
            if (aFi1hSDK.unregisterClient == AFi1hSDK.AFa1ySDK.FINISHED) {
                Object obj = aFi1hSDK.AFInAppEventParameterName.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Pair[] pairArr = new Pair[2];
                    Object obj2 = aFi1hSDK.AFInAppEventParameterName.get("source");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    pairArr[0] = TuplesKt.to("source", (String) obj2);
                    pairArr[1] = TuplesKt.to("value", str2);
                    map = MapsKt.mapOf(pairArr);
                    if (map == null) {
                        arrayList.add(map);
                    }
                }
            }
            map = null;
            if (map == null) {
            }
        }
        ArrayList arrayList2 = arrayList;
        if (true ^ arrayList2.isEmpty()) {
            AFInAppEventParameterName.put("referrers", arrayList2);
        }
        AFc1jSDK aFc1jSDK = this.unregisterClient;
        AFj1xSDK aFj1xSDK = new AFj1xSDK(this.afInfoLog, null, 2, null);
        String str3 = ((AFf1nSDK) this).d.AFLogger;
        Object obj3 = this.unregisterClient.AFInAppEventParameterName().get(ServerValues.NAME_OP_TIMESTAMP);
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str4 = (String) obj3;
        String packageName = aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String d = aFj1xSDK.valueOf.d();
        String str5 = d;
        if (str5 != null && !StringsKt.isBlank(str5)) {
            d = "-".concat(String.valueOf(StringsKt.trim((CharSequence) str5).toString()));
        }
        if (d == null) {
            d = "";
        }
        Uri.Builder appendPath = Uri.parse(aFj1xSDK.values.AFInAppEventParameterName("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(new StringBuilder().append(packageName).append(StringsKt.trim((CharSequence) d).toString()).toString());
        Intrinsics.checkNotNullExpressionValue(appendPath, "");
        String obj4 = AFj1xSDK.AFInAppEventParameterName(appendPath, str3, str4).appendQueryParameter("sdk_version", AFb1vSDK.AFInAppEventParameterName).build().toString();
        Intrinsics.checkNotNullExpressionValue(obj4, "");
        aFc1jSDK.valueOf(obj4);
        AFh1wSDK aFh1wSDK = this.i;
        int i = this.afWarnLog;
        if (i <= 0 || i > 2) {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
        } else {
            int i2 = i - 1;
            aFh1wSDK.e[i2] = System.currentTimeMillis();
            if (i2 == 0) {
                if (aFh1wSDK.unregisterClient != 0) {
                    aFh1wSDK.valueOf.put("from_fg", Long.valueOf(aFh1wSDK.e[i2] - aFh1wSDK.unregisterClient));
                    aFh1wSDK.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(aFh1wSDK.valueOf).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        }
        AFe1sSDK<AFc1pSDK> AFKeystoreWrapper = ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient);
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        return AFKeystoreWrapper;
    }

    private static Map<String, String> valueOf(AFb1zSDK aFb1zSDK) {
        String str;
        if (aFb1zSDK == null || (str = aFb1zSDK.AFInAppEventParameterName) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1zSDK.AFKeystoreWrapper;
        if (bool == null || !bool.booleanValue()) {
            return MapsKt.mapOf(TuplesKt.to("type", "unhashed"), TuplesKt.to("value", str));
        }
        return null;
    }
}
