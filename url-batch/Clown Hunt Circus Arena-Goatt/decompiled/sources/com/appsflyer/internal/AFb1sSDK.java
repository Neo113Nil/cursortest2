package com.appsflyer.internal;

import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFf1jSDK;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1sSDK extends AFe1fSDK {
    private static String getLevel = "https://%sdlsdk.%s/v1.0/android/";
    private final CountDownLatch AFLogger$LogLevel;
    private final List<AFf1jSDK> AFVersionDeclaration;
    private final AFf1kSDK AppsFlyer2dXConversionCallback;
    private final AFe1lSDK afErrorLogForExcManagerOnly;
    private final AFb1wSDK init;
    private final AFb1cSDK onAppOpenAttributionNative;
    private int onAttributionFailureNative;
    private int onConversionDataSuccess;
    private int onDeepLinkingNative;
    private final ExecutorService onInstallConversionDataLoadedNative;
    private final AFe1xSDK onInstallConversionFailureNative;
    private final AFb1uSDK onResponseErrorNative;
    private boolean onResponseNative;

    public AFb1sSDK(AFc1zSDK aFc1zSDK) {
        super(null, getLevel, Boolean.FALSE, Boolean.TRUE, null);
        this.AFVersionDeclaration = new ArrayList();
        this.AFLogger$LogLevel = new CountDownLatch(1);
        this.afErrorLogForExcManagerOnly = aFc1zSDK.AFLogger();
        this.onAppOpenAttributionNative = aFc1zSDK.AFInAppEventParameterName();
        this.onInstallConversionFailureNative = aFc1zSDK.AFVersionDeclaration();
        this.AppsFlyer2dXConversionCallback = aFc1zSDK.AFLogger$LogLevel();
        this.onInstallConversionDataLoadedNative = aFc1zSDK.valueOf();
        this.init = aFc1zSDK.afErrorLogForExcManagerOnly();
        this.onResponseErrorNative = aFc1zSDK.init();
    }

    public final DeepLinkResult AFLogger() {
        DeepLinkResult.Error error;
        AFLogger.afDebugLog("[DDL] start");
        FutureTask futureTask = new FutureTask(new Callable<DeepLinkResult>() { // from class: com.appsflyer.internal.AFb1sSDK.5
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ DeepLinkResult call() throws Exception {
                AFb1sSDK.values(AFb1sSDK.this);
                AFb1sSDK.this.afErrorLogForExcManagerOnly();
                return AFb1sSDK.AFInAppEventParameterName(AFb1sSDK.this);
            }
        });
        this.onInstallConversionDataLoadedNative.execute(futureTask);
        try {
            DeepLinkResult deepLinkResult = (DeepLinkResult) futureTask.get(this.onResponseErrorNative.afRDLog, TimeUnit.MILLISECONDS);
            this.afErrorLogForExcManagerOnly.values(deepLinkResult, this.onResponseErrorNative.afRDLog);
            this.onResponseErrorNative.AFInAppEventParameterName(deepLinkResult);
            return deepLinkResult;
        } catch (InterruptedException | ExecutionException e) {
            AFLogger.afErrorLog("[DDL] Error occurred", e, true);
            if (e.getCause() instanceof IOException) {
                error = DeepLinkResult.Error.NETWORK;
            } else {
                error = DeepLinkResult.Error.UNEXPECTED;
            }
            DeepLinkResult deepLinkResult2 = new DeepLinkResult(null, error);
            this.afErrorLogForExcManagerOnly.values(deepLinkResult2, this.onResponseErrorNative.afRDLog);
            this.onResponseErrorNative.AFInAppEventParameterName(deepLinkResult2);
            return deepLinkResult2;
        } catch (TimeoutException e2) {
            AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", e2);
            AFLogger.afDebugLog(new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ").append(this.onConversionDataSuccess).append(" attempt(s) within ").append(this.onResponseErrorNative.afRDLog).append(" milliseconds").toString());
            DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
            this.afErrorLogForExcManagerOnly.values(deepLinkResult3, this.onResponseErrorNative.afRDLog);
            this.onResponseErrorNative.AFInAppEventParameterName(deepLinkResult3);
            return deepLinkResult3;
        }
    }

    private boolean AFLogger$LogLevel() {
        List list = (List) this.AFInAppEventParameterName.get("referrers");
        return (list != null ? list.size() : 0) < this.onDeepLinkingNative && !this.AFInAppEventParameterName.containsKey("referrers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void afErrorLogForExcManagerOnly() {
        String[] strArr;
        this.onConversionDataSuccess++;
        AFLogger.afDebugLog(new StringBuilder("[DDL] Preparing request ").append(this.onConversionDataSuccess).toString());
        if (this.onConversionDataSuccess == 1) {
            AFa1dSDK valueOf = AFa1dSDK.valueOf();
            this.AFInAppEventParameterName.put("is_first", Boolean.valueOf(this.onAppOpenAttributionNative.AFInAppEventType.AFInAppEventType("appsFlyerCount", 0) == 0));
            this.AFInAppEventParameterName.put("lang", new StringBuilder().append(Locale.getDefault().getLanguage()).append("-").append(Locale.getDefault().getCountry()).toString());
            this.AFInAppEventParameterName.put("os", Build.VERSION.RELEASE);
            this.AFInAppEventParameterName.put("type", Build.MODEL);
            Map<String, Object> map = this.AFInAppEventParameterName;
            AFb1cSDK aFb1cSDK = this.onAppOpenAttributionNative;
            map.put("request_id", AFa1aSDK.AFInAppEventParameterName(aFb1cSDK.values, aFb1cSDK.AFInAppEventType));
            AFa1bSDK aFa1bSDK = valueOf.afDebugLog;
            if (aFa1bSDK != null && (strArr = aFa1bSDK.AFInAppEventType) != null) {
                this.AFInAppEventParameterName.put("sharing_filter", strArr);
            }
            Map<String, Object> AFInAppEventType = AFInAppEventType(AFa1bSDK.valueOf(this.onAppOpenAttributionNative.values.AFInAppEventParameterName, new HashMap()));
            Map<String, Object> AFInAppEventType2 = AFInAppEventType(AFa1bSDK.AFKeystoreWrapper(this.onAppOpenAttributionNative.values.AFInAppEventParameterName));
            if (AFInAppEventType != null) {
                this.AFInAppEventParameterName.put("gaid", AFInAppEventType);
            }
            if (AFInAppEventType2 != null) {
                this.AFInAppEventParameterName.put("oaid", AFInAppEventType2);
            }
        }
        Map<String, Object> map2 = this.AFInAppEventParameterName;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        long currentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map2.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        this.AFInAppEventParameterName.put("request_count", Integer.valueOf(this.onConversionDataSuccess));
        ArrayList arrayList = new ArrayList();
        Iterator<AFf1jSDK> it = this.AFVersionDeclaration.iterator();
        while (it.hasNext()) {
            Map<String, String> AFInAppEventType3 = AFInAppEventType(it.next());
            if (AFInAppEventType3 != null) {
                arrayList.add(AFInAppEventType3);
            }
        }
        if (!arrayList.isEmpty()) {
            this.AFInAppEventParameterName.put("referrers", arrayList);
        }
        valueOf(onAppOpenAttributionNative());
    }

    private String onAppOpenAttributionNative() {
        String str;
        String str2 = this.onInstallConversionFailureNative.AFInAppEventType;
        String packageName = this.onAppOpenAttributionNative.values.AFInAppEventParameterName.getPackageName();
        String AFKeystoreWrapper = this.onAppOpenAttributionNative.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null && !AFKeystoreWrapper.trim().isEmpty()) {
            str = "-".concat(String.valueOf(AFKeystoreWrapper));
        } else {
            str = "";
        }
        return Uri.parse(String.format(getLevel, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName())).buildUpon().appendPath(new StringBuilder().append(packageName).append(str).toString()).appendQueryParameter("af_sig", AFb1zSDK.AFKeystoreWrapper(new StringBuilder().append(this.AFInAppEventParameterName.get("timestamp")).append(str2).toString(), str2)).appendQueryParameter("sdk_version", AFa1dSDK.AFKeystoreWrapper).build().toString();
    }

    /* renamed from: com.appsflyer.internal.AFb1sSDK$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFf1jSDK.AFa1vSDK.values().length];
            values = iArr;
            try {
                iArr[AFf1jSDK.AFa1vSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[AFf1jSDK.AFa1vSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFKeystoreWrapper(AFf1jSDK aFf1jSDK) {
        if (AFInAppEventParameterName(aFf1jSDK)) {
            this.AFVersionDeclaration.add(aFf1jSDK);
            this.AFLogger$LogLevel.countDown();
            AFLogger.afDebugLog(new StringBuilder("[DDL] Added non-organic ").append(aFf1jSDK.getClass().getSimpleName()).toString());
        } else {
            int i = this.onAttributionFailureNative + 1;
            this.onAttributionFailureNative = i;
            if (i == this.onDeepLinkingNative) {
                this.AFLogger$LogLevel.countDown();
            }
        }
    }

    private static boolean AFInAppEventParameterName(AFf1jSDK aFf1jSDK) {
        Long l = (Long) aFf1jSDK.AFKeystoreWrapper.get("click_ts");
        return l != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1L);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventParameterName() {
        return AFd1vSDK.DLSDK;
    }

    private Map<String, Object> AFInAppEventType(final AFc1uSDK.AFa1wSDK aFa1wSDK) {
        if (aFa1wSDK == null || aFa1wSDK.AFInAppEventParameterName == null) {
            return null;
        }
        Boolean bool = aFa1wSDK.AFInAppEventType;
        if (bool == null || !bool.booleanValue()) {
            return new HashMap<String, Object>() { // from class: com.appsflyer.internal.AFb1sSDK.2
                {
                    put("type", "unhashed");
                    put("value", aFa1wSDK.AFInAppEventParameterName);
                }
            };
        }
        return null;
    }

    private static Map<String, String> AFInAppEventType(AFf1jSDK aFf1jSDK) {
        if (aFf1jSDK.afRDLog != AFf1jSDK.AFa1vSDK.FINISHED) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = (String) aFf1jSDK.AFKeystoreWrapper.get("referrer");
        if (str == null) {
            return null;
        }
        hashMap.put("source", (String) aFf1jSDK.AFKeystoreWrapper.get("source"));
        hashMap.put("value", str);
        return hashMap;
    }

    static /* synthetic */ void values(AFb1sSDK aFb1sSDK) {
        ArrayList<AFf1jSDK> arrayList = new ArrayList();
        for (AFf1jSDK aFf1jSDK : aFb1sSDK.AppsFlyer2dXConversionCallback.AFInAppEventType()) {
            if (aFf1jSDK != null && aFf1jSDK.afRDLog != AFf1jSDK.AFa1vSDK.NOT_STARTED) {
                arrayList.add(aFf1jSDK);
            }
        }
        aFb1sSDK.onDeepLinkingNative = arrayList.size();
        for (final AFf1jSDK aFf1jSDK2 : arrayList) {
            int i = AnonymousClass4.values[aFf1jSDK2.afRDLog.ordinal()];
            if (i == 1) {
                AFLogger.afDebugLog(new StringBuilder("[DDL] ").append(aFf1jSDK2.AFKeystoreWrapper.get("source")).append(" referrer collected earlier").toString());
                aFb1sSDK.AFKeystoreWrapper(aFf1jSDK2);
            } else if (i == 2) {
                aFf1jSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.AFb1sSDK.3
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFLogger.afDebugLog(new StringBuilder("[DDL] ").append(aFf1jSDK2.AFKeystoreWrapper.get("source")).append(" referrer collected via observer").toString());
                        AFb1sSDK.this.AFKeystoreWrapper((AFf1jSDK) observable);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x017a, code lost:
    
        return new com.appsflyer.deeplink.DeepLinkResult(null, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ DeepLinkResult AFInAppEventParameterName(AFb1sSDK aFb1sSDK) throws IOException, JSONException, InterruptedException {
        DeepLink AFKeystoreWrapper;
        while (true) {
            AFe1lSDK aFe1lSDK = aFb1sSDK.afErrorLogForExcManagerOnly;
            int i = aFb1sSDK.onConversionDataSuccess;
            if (i <= 0 || i > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
            } else {
                int i2 = i - 1;
                aFe1lSDK.afErrorLog[i2] = System.currentTimeMillis();
                if (i2 == 0) {
                    if (aFe1lSDK.afDebugLog != 0) {
                        aFe1lSDK.AFInAppEventType.put("from_fg", Long.valueOf(aFe1lSDK.afErrorLog[i2] - aFe1lSDK.afDebugLog));
                        aFe1lSDK.AFKeystoreWrapper.values("ddl", new JSONObject(aFe1lSDK.AFInAppEventType).toString());
                    } else {
                        AFLogger.afInfoLog("Metrics: fg ts is missing");
                    }
                }
            }
            HttpURLConnection AFInAppEventType = new AFa1uSDK(aFb1sSDK, aFb1sSDK.init).AFInAppEventType(aFb1sSDK.onInstallConversionFailureNative.AFInAppEventType);
            AFe1lSDK aFe1lSDK2 = aFb1sSDK.afErrorLogForExcManagerOnly;
            int i3 = aFb1sSDK.onConversionDataSuccess;
            if (i3 <= 0 || i3 > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i3))));
            } else {
                int i4 = i3 - 1;
                aFe1lSDK2.afInfoLog[i4] = System.currentTimeMillis();
                if (aFe1lSDK2.afErrorLog[i4] != 0) {
                    aFe1lSDK2.afRDLog[i4] = aFe1lSDK2.afInfoLog[i4] - aFe1lSDK2.afErrorLog[i4];
                    aFe1lSDK2.AFInAppEventType.put("net", aFe1lSDK2.afRDLog);
                    aFe1lSDK2.AFKeystoreWrapper.values("ddl", new JSONObject(aFe1lSDK2.AFInAppEventType).toString());
                } else {
                    AFLogger.afInfoLog(new StringBuilder("Metrics: ddlStart[").append(i4).append("] ts is missing").toString());
                }
            }
            if (AFInAppEventType.getResponseCode() != 200) {
                AFLogger.afDebugLog(new StringBuilder("[DDL] Error occurred. Server response code = ").append(AFInAppEventType.getResponseCode()).toString());
                return new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
            }
            JSONObject jSONObject = new JSONObject(AFa1dSDK.AFInAppEventType(AFInAppEventType));
            aFb1sSDK.onResponseNative = jSONObject.optBoolean("is_second_ping", true);
            if (jSONObject.optBoolean("found")) {
                AFKeystoreWrapper = DeepLink.AFKeystoreWrapper(jSONObject.optJSONObject("click_event"));
                AFKeystoreWrapper.valueOf.put("is_deferred", true);
            } else {
                AFKeystoreWrapper = null;
            }
            if (AFKeystoreWrapper != null) {
                return new DeepLinkResult(AFKeystoreWrapper, null);
            }
            if (aFb1sSDK.onConversionDataSuccess > 1 || !aFb1sSDK.AFLogger$LogLevel() || !aFb1sSDK.onResponseNative) {
                break;
            }
            AFLogger.afDebugLog("[DDL] Waiting for referrers...");
            aFb1sSDK.AFLogger$LogLevel.await();
            AFe1lSDK aFe1lSDK3 = aFb1sSDK.afErrorLogForExcManagerOnly;
            long currentTimeMillis = System.currentTimeMillis();
            if (aFe1lSDK3.afInfoLog[0] != 0) {
                aFe1lSDK3.AFInAppEventType.put("rfr_wait", Long.valueOf(currentTimeMillis - aFe1lSDK3.afInfoLog[0]));
                aFe1lSDK3.AFKeystoreWrapper.values("ddl", new JSONObject(aFe1lSDK3.AFInAppEventType).toString());
            } else {
                AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
            }
            if (aFb1sSDK.onAttributionFailureNative != aFb1sSDK.onDeepLinkingNative) {
                aFb1sSDK.afErrorLogForExcManagerOnly();
            } else {
                return new DeepLinkResult(null, null);
            }
        }
    }
}
