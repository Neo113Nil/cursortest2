package com.appsflyer.internal;

import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFi1hSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.json.JSONObject;
import z2.C1412P;

/* loaded from: classes.dex */
public final class AFf1kSDK extends AFf1nSDK<AFc1pSDK> {
    private final CountDownLatch afDebugLog;
    private final List<AFi1hSDK> afErrorLog;
    private final AFd1sSDK afInfoLog;
    private int afRDLog;
    private int afVerboseLog;
    private int afWarnLog;
    private final AFi1aSDK force;

    /* renamed from: i, reason: collision with root package name */
    private final AFh1wSDK f5905i;
    private final AFc1jSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private final AFd1pSDK f5906v;

    /* renamed from: w, reason: collision with root package name */
    private final AFc1vSDK f5907w;

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
        this.f5906v = level;
        AFc1vSDK afRDLog = aFd1kSDK.afRDLog();
        Intrinsics.checkNotNullExpressionValue(afRDLog, "");
        this.f5907w = afRDLog;
        AFh1wSDK AFLogger = aFd1kSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(AFLogger, "");
        this.f5905i = AFLogger;
        AFi1aSDK force = aFd1kSDK.force();
        Intrinsics.checkNotNullExpressionValue(force, "");
        this.force = force;
        AFi1hSDK[] AFKeystoreWrapper = force.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        ArrayList arrayList = new ArrayList();
        for (AFi1hSDK aFi1hSDK : AFKeystoreWrapper) {
            if (aFi1hSDK != null && aFi1hSDK.unregisterClient != AFi1hSDK.AFa1ySDK.NOT_STARTED) {
                arrayList.add(aFi1hSDK);
            }
        }
        this.afRDLog = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final AFi1hSDK aFi1hSDK2 = (AFi1hSDK) it.next();
            AFi1hSDK.AFa1ySDK aFa1ySDK = aFi1hSDK2.unregisterClient;
            int i2 = aFa1ySDK == null ? -1 : AFa1tSDK.values[aFa1ySDK.ordinal()];
            if (i2 == 1) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1aSDK aFg1aSDK = AFg1aSDK.DDL;
                StringBuilder sb = new StringBuilder();
                sb.append(aFi1hSDK2.AFInAppEventParameterName.get("source"));
                sb.append(" referrer collected earlier");
                AFg1fSDK.d$default(aFLogger, aFg1aSDK, sb.toString(), false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFi1hSDK2, "");
                AFInAppEventParameterName(aFi1hSDK2);
            } else if (i2 == 2) {
                aFi1hSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.i
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1kSDK.AFInAppEventType(AFi1hSDK.this, this, observable, obj);
                    }
                });
            }
        }
    }

    private final void AFInAppEventParameterName(AFi1hSDK aFi1hSDK) {
        if (AFKeystoreWrapper(aFi1hSDK)) {
            this.afErrorLog.add(aFi1hSDK);
            this.afDebugLog.countDown();
            AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Added non-organic ".concat(aFi1hSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i2 = this.afVerboseLog + 1;
            this.afVerboseLog = i2;
            if (i2 == this.afRDLog) {
                this.afDebugLog.countDown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFi1hSDK aFi1hSDK, AFf1kSDK aFf1kSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1kSDK, "");
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.DDL;
        StringBuilder sb = new StringBuilder();
        sb.append(aFi1hSDK.AFInAppEventParameterName.get("source"));
        sb.append(" referrer collected via observer");
        AFg1fSDK.d$default(aFLogger, aFg1aSDK, sb.toString(), false, 4, null);
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

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        AFe1bSDK aFe1bSDK = AFe1bSDK.FAILURE;
        try {
            AFe1bSDK AFKeystoreWrapper = super.AFKeystoreWrapper();
            Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
            try {
                AFh1wSDK aFh1wSDK = this.f5905i;
                int i2 = this.afWarnLog;
                if (i2 <= 0 || i2 > 2) {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i2))));
                } else {
                    int i4 = i2 - 1;
                    aFh1wSDK.AFLogger[i4] = System.currentTimeMillis();
                    long j4 = aFh1wSDK.f5954e[i4];
                    if (j4 != 0) {
                        long[] jArr = aFh1wSDK.f5953d;
                        jArr[i4] = aFh1wSDK.AFLogger[i4] - j4;
                        aFh1wSDK.valueOf.put("net", jArr);
                        aFh1wSDK.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(aFh1wSDK.valueOf).toString());
                    } else {
                        StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                        sb.append(i4);
                        sb.append("] ts is missing");
                        AFLogger.afInfoLog(sb.toString());
                    }
                }
                int i5 = AFa1tSDK.valueOf[AFKeystoreWrapper.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        return AFKeystoreWrapper;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1aSDK aFg1aSDK = AFg1aSDK.DDL;
                    StringBuilder sb2 = new StringBuilder("Error occurred. Server response code = ");
                    ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
                    sb2.append(responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null);
                    AFg1fSDK.d$default(aFLogger, aFg1aSDK, sb2.toString(), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.f5905i.AFInAppEventParameterName(deepLinkResult, this.f5907w.registerClient);
                    this.f5907w.values(deepLinkResult);
                    return AFKeystoreWrapper;
                }
                ResponseNetwork responseNetwork2 = ((AFf1nSDK) this).registerClient;
                Intrinsics.c(responseNetwork2);
                Object body = responseNetwork2.getBody();
                Intrinsics.checkNotNullExpressionValue(body, "");
                AFc1pSDK aFc1pSDK = (AFc1pSDK) body;
                DeepLink deepLink = aFc1pSDK.AFInAppEventType;
                if (deepLink != null) {
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                    this.f5905i.AFInAppEventParameterName(deepLinkResult2, this.f5907w.registerClient);
                    this.f5907w.values(deepLinkResult2);
                    return AFKeystoreWrapper;
                }
                if (this.afWarnLog > 1 || !aFc1pSDK.valueOf() || !w()) {
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.f5905i.AFInAppEventParameterName(deepLinkResult3, this.f5907w.registerClient);
                    this.f5907w.values(deepLinkResult3);
                    return AFKeystoreWrapper;
                }
                AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Waiting for referrers...", false, 4, null);
                this.afDebugLog.await();
                AFh1wSDK aFh1wSDK2 = this.f5905i;
                long currentTimeMillis = System.currentTimeMillis();
                long j5 = aFh1wSDK2.AFLogger[0];
                if (j5 != 0) {
                    aFh1wSDK2.valueOf.put("rfr_wait", Long.valueOf(currentTimeMillis - j5));
                    aFh1wSDK2.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(aFh1wSDK2.valueOf).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (this.afVerboseLog != this.afRDLog) {
                    return AFKeystoreWrapper();
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                this.f5905i.AFInAppEventParameterName(deepLinkResult4, this.f5907w.registerClient);
                this.f5907w.values(deepLinkResult4);
                return AFe1bSDK.SUCCESS;
            } catch (Exception e4) {
                e = e4;
                aFe1bSDK = AFKeystoreWrapper;
                Throwable cause = e.getCause();
                if (!(cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException)) {
                    if (cause instanceof IOException) {
                        AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                        DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                        this.f5905i.AFInAppEventParameterName(deepLinkResult5, this.f5907w.registerClient);
                        this.f5907w.values(deepLinkResult5);
                    } else {
                        AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Unexpected Exception: ".concat(String.valueOf(e)), false, 4, null);
                        DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                        this.f5905i.AFInAppEventParameterName(deepLinkResult6, this.f5907w.registerClient);
                        this.f5907w.values(deepLinkResult6);
                    }
                    return aFe1bSDK;
                }
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1aSDK aFg1aSDK2 = AFg1aSDK.DDL;
                StringBuilder sb3 = new StringBuilder("Timeout, didn't manage to find deferred deeplink after ");
                sb3.append(this.afWarnLog);
                sb3.append(" attempt(s) within ");
                sb3.append(this.f5907w.registerClient);
                sb3.append(" milliseconds");
                AFg1fSDK.d$default(aFLogger2, aFg1aSDK2, sb3.toString(), false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.f5905i.AFInAppEventParameterName(deepLinkResult7, this.f5907w.registerClient);
                this.f5907w.values(deepLinkResult7);
                return AFe1bSDK.TIMEOUT;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    private static Map<String, String> valueOf(AFb1zSDK aFb1zSDK) {
        String str;
        if (aFb1zSDK == null || (str = aFb1zSDK.AFInAppEventParameterName) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1zSDK.AFKeystoreWrapper;
        if (bool == null || !bool.booleanValue()) {
            return C1412P.e(new Pair("type", "unhashed"), new Pair("value", str));
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return this.f5907w.registerClient;
    }

    private static boolean AFKeystoreWrapper(AFi1hSDK aFi1hSDK) {
        Object obj = aFi1hSDK.AFInAppEventParameterName.get("click_ts");
        Long l4 = obj instanceof Long ? (Long) obj : null;
        if (l4 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l4.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x015d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFf1nSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1sSDK<AFc1pSDK> AFKeystoreWrapper(String str) {
        Map map;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        this.afWarnLog++;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.DDL;
        StringBuilder sb = new StringBuilder("Preparing request ");
        sb.append(this.afWarnLog);
        AFg1fSDK.d$default(aFLogger, aFg1aSDK, sb.toString(), false, 4, null);
        Map<String, Object> AFInAppEventParameterName = this.unregisterClient.AFInAppEventParameterName();
        if (this.afWarnLog == 1) {
            AFInAppEventParameterName.put("is_first", Boolean.valueOf(this.afInfoLog.AFKeystoreWrapper.valueOf("appsFlyerCount", 0) == 0));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Locale.getDefault().getLanguage());
            sb2.append('-');
            sb2.append(Locale.getDefault().getCountry());
            AFInAppEventParameterName.put("lang", sb2.toString());
            AFInAppEventParameterName.put("os", Build.VERSION.RELEASE);
            AFInAppEventParameterName.put("type", Build.MODEL);
            AFd1sSDK aFd1sSDK = this.afInfoLog;
            AFInAppEventParameterName.put("request_id", AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper));
            AFd1wSDK aFd1wSDK = this.f5906v.AFKeystoreWrapper;
            if (aFd1wSDK != null && (strArr = aFd1wSDK.AFInAppEventType) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                AFInAppEventParameterName.put("sharing_filter", strArr);
            }
            AFh1uSDK aFh1uSDK = this.afInfoLog.AFInAppEventType.AFLogger;
            Map<String, String> valueOf = valueOf(aFh1uSDK != null ? new AFb1zSDK(aFh1uSDK.AFKeystoreWrapper, aFh1uSDK.AFInAppEventParameterName) : null);
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
        AFInAppEventParameterName.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        AFInAppEventParameterName.put("request_count", Integer.valueOf(this.afWarnLog));
        List<AFi1hSDK> list = this.afErrorLog;
        ArrayList arrayList = new ArrayList();
        for (AFi1hSDK aFi1hSDK : list) {
            if (aFi1hSDK.unregisterClient == AFi1hSDK.AFa1ySDK.FINISHED) {
                Object obj = aFi1hSDK.AFInAppEventParameterName.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFi1hSDK.AFInAppEventParameterName.get("source");
                    if (obj2 != null) {
                        map = C1412P.e(new Pair("source", (String) obj2), new Pair("value", str2));
                        if (map == null) {
                            arrayList.add(map);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
            }
            map = null;
            if (map == null) {
            }
        }
        if (!arrayList.isEmpty()) {
            AFInAppEventParameterName.put("referrers", arrayList);
        }
        AFc1jSDK aFc1jSDK = this.unregisterClient;
        AFj1xSDK aFj1xSDK = new AFj1xSDK(this.afInfoLog, null, 2, null);
        String str3 = ((AFf1nSDK) this).f5911d.AFLogger;
        Object obj3 = this.unregisterClient.AFInAppEventParameterName().get("timestamp");
        if (obj3 != null) {
            String str4 = (String) obj3;
            String packageName = aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            String d4 = aFj1xSDK.AFInAppEventType.d();
            if (d4 != null && !y.x(d4)) {
                d4 = "-".concat(String.valueOf(y.M(d4).toString()));
            }
            if (d4 == null) {
                d4 = "";
            }
            String obj4 = y.M(d4).toString();
            Uri.Builder buildUpon = Uri.parse(aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("https://%sdlsdk.%s/v1.0/android/")).buildUpon();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(packageName);
            sb3.append(obj4);
            Uri.Builder appendPath = buildUpon.appendPath(sb3.toString());
            Intrinsics.checkNotNullExpressionValue(appendPath, "");
            String obj5 = AFj1xSDK.AFInAppEventParameterName(appendPath, str3, str4).appendQueryParameter("sdk_version", AFb1vSDK.AFInAppEventParameterName).build().toString();
            Intrinsics.checkNotNullExpressionValue(obj5, "");
            aFc1jSDK.valueOf(obj5);
            AFh1wSDK aFh1wSDK = this.f5905i;
            int i2 = this.afWarnLog;
            if (i2 > 0 && i2 <= 2) {
                int i4 = i2 - 1;
                aFh1wSDK.f5954e[i4] = System.currentTimeMillis();
                if (i4 == 0) {
                    long j4 = aFh1wSDK.unregisterClient;
                    if (j4 != 0) {
                        aFh1wSDK.valueOf.put("from_fg", Long.valueOf(aFh1wSDK.f5954e[i4] - j4));
                        aFh1wSDK.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(aFh1wSDK.valueOf).toString());
                    } else {
                        AFLogger.afInfoLog("Metrics: fg ts is missing");
                    }
                }
            } else {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i2))));
            }
            AFe1sSDK<AFc1pSDK> AFKeystoreWrapper = ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient);
            Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
            return AFKeystoreWrapper;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
