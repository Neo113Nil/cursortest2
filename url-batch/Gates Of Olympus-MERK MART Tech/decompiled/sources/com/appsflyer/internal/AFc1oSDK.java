package com.appsflyer.internal;

import android.os.Build;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFi1pSDK;
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

/* loaded from: classes3.dex */
public final class AFc1oSDK extends AFh1zSDK {
    private int AFLogger$LogLevel;
    private final ExecutorService afDebugLog;
    private final AFc1pSDK afErrorLog;
    private boolean afErrorLogForExcManagerOnly;
    private final CountDownLatch afInfoLog;
    private int afLogForce;
    private final AFb1bSDK afRDLog;
    private final AFd1qSDK afVerboseLog;
    private final AFi1rSDK afWarnLog;
    private final AFg1gSDK force;
    private int getLevel;
    private final AFd1pSDK i;
    private final AFg1xSDK v;
    private final List<AFi1pSDK> w;

    public AFc1oSDK(AFd1mSDK aFd1mSDK) {
        super(null, "https://%sdlsdk.%s/v1.0/android/", Boolean.FALSE, Boolean.TRUE, null);
        this.w = new ArrayList();
        this.afInfoLog = new CountDownLatch(1);
        this.force = aFd1mSDK.d();
        this.i = aFd1mSDK.values();
        this.v = aFd1mSDK.force();
        this.afWarnLog = aFd1mSDK.w();
        this.afDebugLog = aFd1mSDK.AFInAppEventParameterName();
        this.afRDLog = aFd1mSDK.afInfoLog();
        this.afErrorLog = aFd1mSDK.afVerboseLog();
        this.afVerboseLog = aFd1mSDK.AFLogger$LogLevel();
    }

    public final DeepLinkResult registerClient() {
        DeepLinkResult.Error error;
        AFLogger.INSTANCE.d(AFg1jSDK.DDL, "start");
        FutureTask futureTask = new FutureTask(new Callable<DeepLinkResult>() { // from class: com.appsflyer.internal.AFc1oSDK.3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ DeepLinkResult call() throws Exception {
                AFc1oSDK.values(AFc1oSDK.this);
                AFc1oSDK.this.w();
                return AFc1oSDK.AFInAppEventParameterName(AFc1oSDK.this);
            }
        });
        this.afDebugLog.execute(futureTask);
        try {
            DeepLinkResult deepLinkResult = (DeepLinkResult) futureTask.get(this.afErrorLog.d, TimeUnit.MILLISECONDS);
            this.force.AFKeystoreWrapper(deepLinkResult, this.afErrorLog.d);
            this.afErrorLog.AFInAppEventType(deepLinkResult);
            return deepLinkResult;
        } catch (InterruptedException | ExecutionException e) {
            AFLogger.INSTANCE.e(AFg1jSDK.DDL, "AppsFlyer SDK is stopped: the request was not sent to the server", e, true, true, false, true);
            if (e.getCause() instanceof IOException) {
                error = DeepLinkResult.Error.NETWORK;
            } else {
                error = DeepLinkResult.Error.UNEXPECTED;
            }
            DeepLinkResult deepLinkResult2 = new DeepLinkResult(null, error);
            this.force.AFKeystoreWrapper(deepLinkResult2, this.afErrorLog.d);
            this.afErrorLog.AFInAppEventType(deepLinkResult2);
            return deepLinkResult2;
        } catch (TimeoutException e2) {
            AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", e2);
            AFLogger.INSTANCE.d(AFg1jSDK.DDL, new StringBuilder("Timeout, didn't manage to find deferred deep link after ").append(this.getLevel).append(" attempt(s) within ").append(this.afErrorLog.d).append(" milliseconds").toString());
            DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
            this.force.AFKeystoreWrapper(deepLinkResult3, this.afErrorLog.d);
            this.afErrorLog.AFInAppEventType(deepLinkResult3);
            return deepLinkResult3;
        }
    }

    private boolean force() {
        List list = (List) this.AFKeystoreWrapper.get("referrers");
        return (list != null ? list.size() : 0) < this.afLogForce && !this.AFKeystoreWrapper.containsKey("referrers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        String[] strArr;
        this.getLevel++;
        AFLogger.INSTANCE.d(AFg1jSDK.DDL, new StringBuilder("Preparing request ").append(this.getLevel).toString());
        if (this.getLevel == 1) {
            this.AFKeystoreWrapper.put("is_first", Boolean.valueOf(this.i.valueOf.AFKeystoreWrapper("appsFlyerCount", 0) == 0));
            this.AFKeystoreWrapper.put("lang", new StringBuilder().append(Locale.getDefault().getLanguage()).append("-").append(Locale.getDefault().getCountry()).toString());
            this.AFKeystoreWrapper.put("os", Build.VERSION.RELEASE);
            this.AFKeystoreWrapper.put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, Build.MODEL);
            Map<String, Object> map = this.AFKeystoreWrapper;
            AFd1pSDK aFd1pSDK = this.i;
            map.put("request_id", AFb1iSDK.AFKeystoreWrapper(aFd1pSDK.AFInAppEventParameterName, aFd1pSDK.valueOf));
            AFd1zSDK aFd1zSDK = this.afVerboseLog.AFInAppEventType;
            if (aFd1zSDK != null && (strArr = aFd1zSDK.AFInAppEventType) != null) {
                this.AFKeystoreWrapper.put("sharing_filter", strArr);
            }
            Map<String, Object> values = values(AFb1qSDK.values(this.i.AFInAppEventParameterName.AFKeystoreWrapper, new HashMap()));
            Map<String, Object> values2 = values(AFb1qSDK.AFInAppEventType(this.i.AFInAppEventParameterName.AFKeystoreWrapper));
            if (values != null) {
                this.AFKeystoreWrapper.put("gaid", values);
            }
            if (values2 != null) {
                this.AFKeystoreWrapper.put("oaid", values2);
            }
        }
        Map<String, Object> map2 = this.AFKeystoreWrapper;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        long currentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map2.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        this.AFKeystoreWrapper.put("request_count", Integer.valueOf(this.getLevel));
        ArrayList arrayList = new ArrayList();
        Iterator<AFi1pSDK> it = this.w.iterator();
        while (it.hasNext()) {
            Map<String, String> values3 = values(it.next());
            if (values3 != null) {
                arrayList.add(values3);
            }
        }
        if (!arrayList.isEmpty()) {
            this.AFKeystoreWrapper.put("referrers", arrayList);
        }
        values(afRDLog());
    }

    private String afRDLog() {
        return new AFi1fSDK(this.i).values(this.v.unregisterClient, (String) this.AFKeystoreWrapper.get("timestamp"));
    }

    /* renamed from: com.appsflyer.internal.AFc1oSDK$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AFInAppEventParameterName;

        static {
            int[] iArr = new int[AFi1pSDK.AFa1tSDK.values().length];
            AFInAppEventParameterName = iArr;
            try {
                iArr[AFi1pSDK.AFa1tSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFInAppEventParameterName[AFi1pSDK.AFa1tSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFKeystoreWrapper(AFi1pSDK aFi1pSDK) {
        if (AFInAppEventType(aFi1pSDK)) {
            this.w.add(aFi1pSDK);
            this.afInfoLog.countDown();
            AFLogger.INSTANCE.d(AFg1jSDK.DDL, new StringBuilder("Added non-organic ").append(aFi1pSDK.getClass().getSimpleName()).toString());
        } else {
            int i = this.AFLogger$LogLevel + 1;
            this.AFLogger$LogLevel = i;
            if (i == this.afLogForce) {
                this.afInfoLog.countDown();
            }
        }
    }

    private static boolean AFInAppEventType(AFi1pSDK aFi1pSDK) {
        Long l = (Long) aFi1pSDK.values.get("click_ts");
        return l != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1L);
    }

    @Override // com.appsflyer.internal.AFa1rSDK
    public final AFe1eSDK valueOf() {
        return AFe1eSDK.DLSDK;
    }

    private Map<String, Object> values(final AFa1bSDK aFa1bSDK) {
        if (aFa1bSDK == null || aFa1bSDK.valueOf == null) {
            return null;
        }
        Boolean bool = aFa1bSDK.AFInAppEventType;
        if (bool == null || !bool.booleanValue()) {
            return new HashMap<String, Object>() { // from class: com.appsflyer.internal.AFc1oSDK.2
                {
                    put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "unhashed");
                    put("value", aFa1bSDK.valueOf);
                }
            };
        }
        return null;
    }

    private static Map<String, String> values(AFi1pSDK aFi1pSDK) {
        if (aFi1pSDK.registerClient != AFi1pSDK.AFa1tSDK.FINISHED) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = (String) aFi1pSDK.values.get("referrer");
        if (str == null) {
            return null;
        }
        hashMap.put("source", (String) aFi1pSDK.values.get("source"));
        hashMap.put("value", str);
        return hashMap;
    }

    static /* synthetic */ void values(AFc1oSDK aFc1oSDK) {
        ArrayList<AFi1pSDK> arrayList = new ArrayList();
        for (AFi1pSDK aFi1pSDK : aFc1oSDK.afWarnLog.AFKeystoreWrapper()) {
            if (aFi1pSDK != null && aFi1pSDK.registerClient != AFi1pSDK.AFa1tSDK.NOT_STARTED) {
                arrayList.add(aFi1pSDK);
            }
        }
        aFc1oSDK.afLogForce = arrayList.size();
        for (final AFi1pSDK aFi1pSDK2 : arrayList) {
            int i = AnonymousClass1.AFInAppEventParameterName[aFi1pSDK2.registerClient.ordinal()];
            if (i == 1) {
                AFLogger.INSTANCE.d(AFg1jSDK.DDL, new StringBuilder().append(aFi1pSDK2.values.get("source")).append(" referrer collected earlier").toString());
                aFc1oSDK.AFKeystoreWrapper(aFi1pSDK2);
            } else if (i == 2) {
                aFi1pSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.AFc1oSDK.5
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFLogger.INSTANCE.d(AFg1jSDK.DDL, new StringBuilder().append(aFi1pSDK2.values.get("source")).append(" referrer collected via observer").toString());
                        AFc1oSDK.this.AFKeystoreWrapper((AFi1pSDK) observable);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x017e, code lost:
    
        return new com.appsflyer.deeplink.DeepLinkResult(null, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ DeepLinkResult AFInAppEventParameterName(AFc1oSDK aFc1oSDK) throws IOException, JSONException, InterruptedException {
        DeepLink valueOf;
        while (true) {
            AFg1gSDK aFg1gSDK = aFc1oSDK.force;
            int i = aFc1oSDK.getLevel;
            if (i <= 0 || i > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
            } else {
                int i2 = i - 1;
                aFg1gSDK.registerClient[i2] = System.currentTimeMillis();
                if (i2 == 0) {
                    if (aFg1gSDK.e != 0) {
                        aFg1gSDK.values.put("from_fg", Long.valueOf(aFg1gSDK.registerClient[i2] - aFg1gSDK.e));
                        aFg1gSDK.valueOf.valueOf("ddl", new JSONObject(aFg1gSDK.values).toString());
                    } else {
                        AFLogger.afInfoLog("Metrics: fg ts is missing");
                    }
                }
            }
            HttpURLConnection AFKeystoreWrapper = new AFb1vSDK(aFc1oSDK, aFc1oSDK.afRDLog).AFKeystoreWrapper(aFc1oSDK.v.unregisterClient);
            AFg1gSDK aFg1gSDK2 = aFc1oSDK.force;
            int i3 = aFc1oSDK.getLevel;
            if (i3 <= 0 || i3 > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i3))));
            } else {
                int i4 = i3 - 1;
                aFg1gSDK2.AFLogger[i4] = System.currentTimeMillis();
                if (aFg1gSDK2.registerClient[i4] != 0) {
                    aFg1gSDK2.unregisterClient[i4] = aFg1gSDK2.AFLogger[i4] - aFg1gSDK2.registerClient[i4];
                    aFg1gSDK2.values.put("net", aFg1gSDK2.unregisterClient);
                    aFg1gSDK2.valueOf.valueOf("ddl", new JSONObject(aFg1gSDK2.values).toString());
                } else {
                    AFLogger.afInfoLog(new StringBuilder("Metrics: ddlStart[").append(i4).append("] ts is missing").toString());
                }
            }
            if (AFKeystoreWrapper.getResponseCode() != 200) {
                AFLogger.INSTANCE.d(AFg1jSDK.DDL, new StringBuilder("Error occurred. Server response code = ").append(AFKeystoreWrapper.getResponseCode()).toString());
                return new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
            }
            JSONObject jSONObject = new JSONObject(AFb1tSDK.valueOf(AFKeystoreWrapper));
            aFc1oSDK.afErrorLogForExcManagerOnly = jSONObject.optBoolean("is_second_ping", true);
            if (jSONObject.optBoolean("found")) {
                valueOf = DeepLink.valueOf(jSONObject.optJSONObject("click_event"));
                valueOf.values.put("is_deferred", true);
            } else {
                valueOf = null;
            }
            if (valueOf != null) {
                return new DeepLinkResult(valueOf, null);
            }
            if (aFc1oSDK.getLevel > 1 || !aFc1oSDK.force() || !aFc1oSDK.afErrorLogForExcManagerOnly) {
                break;
            }
            AFLogger.INSTANCE.d(AFg1jSDK.DDL, "Waiting for referrers...");
            aFc1oSDK.afInfoLog.await();
            AFg1gSDK aFg1gSDK3 = aFc1oSDK.force;
            long currentTimeMillis = System.currentTimeMillis();
            if (aFg1gSDK3.AFLogger[0] != 0) {
                aFg1gSDK3.values.put("rfr_wait", Long.valueOf(currentTimeMillis - aFg1gSDK3.AFLogger[0]));
                aFg1gSDK3.valueOf.valueOf("ddl", new JSONObject(aFg1gSDK3.values).toString());
            } else {
                AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
            }
            if (aFc1oSDK.AFLogger$LogLevel != aFc1oSDK.afLogForce) {
                aFc1oSDK.w();
            } else {
                return new DeepLinkResult(null, null);
            }
        }
    }
}
