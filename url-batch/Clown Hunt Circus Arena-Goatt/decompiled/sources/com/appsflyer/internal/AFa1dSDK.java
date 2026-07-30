package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1uSDK;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFd1iSDK;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.appsflyer.internal.AFf1jSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.KeyStoreException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1dSDK extends AppsFlyerLib {
    static AppsFlyerInAppPurchaseValidatorListener AFInAppEventParameterName = null;
    public static final String AFKeystoreWrapper;
    private static AFa1dSDK afErrorLog = null;
    private static String afRDLog = null;
    private static int onAttributionFailure = 0;
    private static int onConversionDataFail = 1;
    private static char[] onResponse;
    static final String valueOf;
    public static final String values;
    private String AFLogger$LogLevel;
    public AFa1bSDK afDebugLog;
    private Map<Long, String> afErrorLogForExcManagerOnly;
    String afInfoLog;
    private boolean init;
    private final AFc1xSDK onAppOpenAttribution;
    private SharedPreferences onAttributionFailureNative;
    private Map<String, Object> onConversionDataSuccess;
    private boolean onInstallConversionDataLoadedNative;
    private Application onInstallConversionFailureNative;
    private AFb1hSDK onResponseErrorNative;
    private String onResponseNative;
    public volatile AppsFlyerConversionListener AFInAppEventType = null;
    private long AFLogger = -1;
    private long afWarnLog = -1;
    private long getLevel = TimeUnit.SECONDS.toMillis(5);
    private boolean AFVersionDeclaration = false;
    private final AFb1xSDK onAppOpenAttributionNative = new AFb1xSDK();
    private boolean AppsFlyer2dXConversionCallback = false;
    private boolean onDeepLinkingNative = false;
    private final Executor onDeepLinking = Executors.newSingleThreadExecutor();

    static void AFInAppEventType() {
        onResponse = new char[]{148, 296, 287, 284, 291, 285, 280, 279, 286, 291, 288, 286, 24, 137, 269, 263, 270, 269, 141, 293, 299, 290, 287, 272, 268, 292, 294, 287, 289, 295, 300, 301, 282, 'k'};
    }

    static /* synthetic */ Map AFInAppEventType(AFa1dSDK aFa1dSDK) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 33;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> map = aFa1dSDK.onConversionDataSuccess;
        if (i3 == 0) {
            return map;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static /* synthetic */ boolean AFInAppEventType(AFa1dSDK aFa1dSDK, boolean z) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 23;
        int i3 = i2 % 128;
        onConversionDataFail = i3;
        int i4 = i2 % 2;
        aFa1dSDK.AppsFlyer2dXConversionCallback = z;
        int i5 = i3 + 15;
        onAttributionFailure = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static /* synthetic */ void valueOf(AFa1dSDK aFa1dSDK) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 125;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        aFa1dSDK.afErrorLogForExcManagerOnly();
        if (i3 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = onAttributionFailure + 103;
        onConversionDataFail = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ long values(AFa1dSDK aFa1dSDK, long j) {
        int i = 2 % 2;
        int i2 = onAttributionFailure;
        int i3 = i2 + 25;
        onConversionDataFail = i3 % 128;
        int i4 = i3 % 2;
        aFa1dSDK.afWarnLog = j;
        int i5 = i2 + 31;
        onConversionDataFail = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    static /* synthetic */ Application values(AFa1dSDK aFa1dSDK) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 45;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        Application application = aFa1dSDK.onInstallConversionFailureNative;
        if (i3 != 0) {
            return application;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static /* synthetic */ void values(AFa1dSDK aFa1dSDK, AFa1qSDK aFa1qSDK) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 109;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        aFa1dSDK.valueOf(aFa1qSDK);
        int i4 = onAttributionFailure + 1;
        onConversionDataFail = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
    }

    static {
        AFInAppEventType();
        valueOf = "253";
        Object[] objArr = new Object[1];
        AFInAppEventParameterName("\u0001", false, new int[]{33, 1, 169, 1}, objArr);
        String substring = "6.12.1".substring(0, "6.12.1".lastIndexOf(((String) objArr[0]).intern()));
        AFKeystoreWrapper = substring;
        afRDLog = "https://%sstats.%s/stats";
        values = new StringBuilder().append(substring).append("/androidevent?buildnumber=6.12.1&app_id=").toString();
        AFInAppEventParameterName = null;
        afErrorLog = new AFa1dSDK();
        int i = onConversionDataFail + 105;
        onAttributionFailure = i % 128;
        int i2 = i % 2;
    }

    public final AFc1zSDK AFInAppEventParameterName() {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 65;
        int i3 = i2 % 128;
        onConversionDataFail = i3;
        int i4 = i2 % 2;
        AFc1xSDK aFc1xSDK = this.onAppOpenAttribution;
        int i5 = i3 + 121;
        onAttributionFailure = i5 % 128;
        int i6 = i5 % 2;
        return aFc1xSDK;
    }

    public AFa1dSDK() {
        AFVersionDeclaration.init();
        this.onAppOpenAttribution = new AFc1xSDK();
        AFd1tSDK level = AFInAppEventParameterName().getLevel();
        level.values.add(new AFa1xSDK(this, (byte) 0));
    }

    public static AFa1dSDK valueOf() {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 27;
        int i3 = i2 % 128;
        onConversionDataFail = i3;
        int i4 = i2 % 2;
        AFa1dSDK aFa1dSDK = afErrorLog;
        int i5 = i3 + 113;
        onAttributionFailure = i5 % 128;
        if (i5 % 2 == 0) {
            return aFa1dSDK;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 11;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (uri == null || uri.toString().isEmpty()) {
            AFInAppEventParameterName().init().AFInAppEventType(new StringBuilder("Link is \"").append(uri).append("\"").toString(), DeepLinkResult.Error.NETWORK);
            int i3 = onAttributionFailure + 61;
            onConversionDataFail = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        if (context == null) {
            AFInAppEventParameterName().init().AFInAppEventType(new StringBuilder("Context is \"").append(context).append("\"").toString(), DeepLinkResult.Error.NETWORK);
            return;
        }
        AFInAppEventParameterName().init().AFInAppEventType(context, new HashMap(), Uri.parse(uri.toString()));
        int i5 = onConversionDataFail + 23;
        onAttributionFailure = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 55;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        setSharingFilterForPartners(strArr);
        int i4 = onConversionDataFail + 47;
        onAttributionFailure = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 41;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            String[] strArr = new String[0];
            strArr[0] = "all";
            setSharingFilterForPartners(strArr);
        } else {
            setSharingFilterForPartners("all");
        }
        int i3 = onConversionDataFail + 51;
        onAttributionFailure = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        int i = 2 % 2;
        this.afDebugLog = new AFa1bSDK(strArr);
        int i2 = onAttributionFailure + 65;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 51;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        AFb1uSDK init = AFInAppEventParameterName().init();
        init.values = str;
        init.AFInAppEventParameterName = map;
        int i4 = onConversionDataFail + 79;
        onAttributionFailure = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 69;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            int i3 = 46 / 0;
        } else {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        }
        int i4 = onAttributionFailure + 51;
        onConversionDataFail = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(final Intent intent, Context context) {
        int i = 2 % 2;
        if (intent == null) {
            int i2 = onAttributionFailure + 35;
            onConversionDataFail = i2 % 128;
            if (i2 % 2 != 0) {
                AFInAppEventParameterName().init().AFInAppEventType("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                AFInAppEventParameterName().init().AFInAppEventType("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                throw null;
            }
        }
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            AFInAppEventType(applicationContext);
            AFInAppEventParameterName().valueOf().execute(new Runnable() { // from class: com.appsflyer.internal.AFa1dSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1dSDK.this.AFInAppEventParameterName(applicationContext, intent);
                }
            });
            return;
        }
        int i3 = onAttributionFailure + 125;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 != 0) {
            AFInAppEventParameterName().init().AFInAppEventType("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else {
            AFInAppEventParameterName().init().AFInAppEventType("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            int i4 = 29 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 91;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 == 0) {
            List<String> asList = Arrays.asList(strArr);
            List<List<String>> list = AFInAppEventParameterName().init().AFKeystoreWrapper;
            if (!list.contains(asList)) {
                list.add(asList);
            }
            int i3 = onConversionDataFail + 59;
            onAttributionFailure = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        AFInAppEventParameterName().init().AFKeystoreWrapper.contains(Arrays.asList(strArr));
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 3;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 != 0) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
            AFa1bSDK.valueOf = Boolean.valueOf(z ^ true);
            AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
            AppsFlyerProperties.getInstance().remove("advertiserId");
            int i3 = onConversionDataFail + 15;
            onAttributionFailure = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 113;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 != 0) {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
            AFKeystoreWrapper(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
        } else {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
            AFKeystoreWrapper(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
            throw null;
        }
    }

    public final void valueOf(Context context, Intent intent) {
        int i = 2 % 2;
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            int i2 = onConversionDataFail + 19;
            onAttributionFailure = i2 % 128;
            int i3 = i2 % 2;
            AFInAppEventParameterName(intent.getStringExtra("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String stringExtra = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra)));
        if (stringExtra != null) {
            valueOf(context).values("referrer", stringExtra);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", stringExtra);
            appsFlyerProperties.AFInAppEventParameterName = stringExtra;
            if (AppsFlyerProperties.getInstance().AFInAppEventType()) {
                int i4 = onConversionDataFail + 23;
                onAttributionFailure = i4 % 128;
                int i5 = i4 % 2;
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                AFInAppEventType(context, AFe1nSDK.onReceive);
                values(context, stringExtra);
                int i6 = onConversionDataFail + 19;
                onAttributionFailure = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        int i8 = onConversionDataFail + 111;
        onAttributionFailure = i8 % 128;
        int i9 = i8 % 2;
    }

    private static void valueOf(JSONObject jSONObject) {
        String str;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        int i2 = onConversionDataFail + 45;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i4)));
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        int i5 = onConversionDataFail + 53;
        onAttributionFailure = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        loop2: while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i7 = onAttributionFailure + 53;
                    onConversionDataFail = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 0;
                    while (i9 < jSONArray2.length()) {
                        int i10 = onConversionDataFail + 73;
                        onAttributionFailure = i10 % 128;
                        int i11 = i10 % 2;
                        if (jSONArray2.getLong(i9) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i9) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i9) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            i9++;
                            str = next;
                        }
                    }
                } catch (JSONException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                }
            }
        }
        if (str != null) {
            int i12 = onConversionDataFail + 77;
            onAttributionFailure = i12 % 128;
            int i13 = i12 % 2;
            jSONObject.remove(str);
            if (i13 == 0) {
                return;
            }
            super.hashCode();
            throw null;
        }
    }

    public final void AFInAppEventParameterName(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        int i = 2 % 2;
        int i2 = onConversionDataFail + 7;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String valueOf2 = valueOf(context).valueOf("extraReferrers", (String) null);
            if (valueOf2 == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(valueOf2);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                    int i4 = onAttributionFailure + 17;
                    onConversionDataFail = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    jSONArray = new JSONArray();
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                int i6 = onConversionDataFail + 63;
                onAttributionFailure = i6 % 128;
                int i7 = i6 % 2;
                jSONArray2.put(currentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                valueOf(jSONObject);
            }
            jSONObject.put(str, jSONArray2.toString());
            valueOf(context).values("extraReferrers", jSONObject.toString());
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Couldn't save referrer - ").append(str).append(": ").toString(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFInAppEventParameterName(AFc1zSDK aFc1zSDK) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 31;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        aFc1zSDK.AppsFlyer2dXConversionCallback().valueOf();
        int i4 = onAttributionFailure + 69;
        onConversionDataFail = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        int i = 2 % 2;
        AFInAppEventType(context);
        final AFc1zSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFInAppEventParameterName2.AFVersionDeclaration().values = z;
        AFInAppEventParameterName2.valueOf().submit(new Runnable() { // from class: com.appsflyer.internal.AFa1dSDK$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AFa1dSDK.AFInAppEventParameterName(AFc1zSDK.this);
            }
        });
        if (z) {
            int i2 = onConversionDataFail + 17;
            onAttributionFailure = i2 % 128;
            int i3 = i2 % 2;
            AFInAppEventParameterName2.AFKeystoreWrapper().valueOf("is_stop_tracking_used", true);
            int i4 = onConversionDataFail + 65;
            onAttributionFailure = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 2;
            }
        }
        int i6 = onConversionDataFail + 57;
        onAttributionFailure = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        AFc1zSDK AFInAppEventParameterName2;
        int i = 2 % 2;
        int i2 = onConversionDataFail + 119;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName2 = AFInAppEventParameterName();
            AFInAppEventParameterName2.afErrorLogForExcManagerOnly().AFInAppEventType("getSdkVersion", new String[1]);
        } else {
            AFInAppEventParameterName2 = AFInAppEventParameterName();
            AFInAppEventParameterName2.afErrorLogForExcManagerOnly().AFInAppEventType("getSdkVersion", new String[0]);
        }
        AFInAppEventParameterName2.AFInAppEventParameterName();
        String AFInAppEventParameterName3 = AFb1cSDK.AFInAppEventParameterName();
        int i3 = onAttributionFailure + 39;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 != 0) {
            return AFInAppEventParameterName3;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 69;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        AFInAppEventParameterName().onDeepLinkingNative().valueOf(context);
        if (i3 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = onAttributionFailure + 119;
        onConversionDataFail = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        AFInAppEventType(context);
        AFe1sSDK aFe1sSDK = new AFe1sSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.afWarnLog("[register] Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.afInfoLog("[register] Firebase Refreshed Token = ".concat(String.valueOf(str)));
        AFb1oSDK AFKeystoreWrapper2 = aFe1sSDK.AFKeystoreWrapper();
        if (AFKeystoreWrapper2 == null || !str.equals(AFKeystoreWrapper2.AFKeystoreWrapper)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = AFKeystoreWrapper2 == null || currentTimeMillis - AFKeystoreWrapper2.values > TimeUnit.SECONDS.toMillis(2L);
            AFb1oSDK aFb1oSDK = new AFb1oSDK(str, currentTimeMillis, !z);
            aFe1sSDK.values.values("afUninstallToken", aFb1oSDK.AFKeystoreWrapper);
            aFe1sSDK.values.AFInAppEventType("afUninstallToken_received_time", aFb1oSDK.values);
            aFe1sSDK.values.valueOf("afUninstallToken_queued", aFb1oSDK.valueOf());
            if (z) {
                AFe1sSDK.AFKeystoreWrapper(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r5 = com.appsflyer.AFLogger.LogLevel.DEBUG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r4 = com.appsflyer.AFLogger.LogLevel.DEBUG;
        r4 = null;
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        if (r5 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if ((!r5) != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        r5 = com.appsflyer.AFLogger.LogLevel.NONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r1 = r1 + 101;
        com.appsflyer.internal.AFa1dSDK.onAttributionFailure = r1 % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        int i = 2 % 2;
        int i2 = onConversionDataFail;
        int i3 = i2 + 115;
        onAttributionFailure = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
        setLogLevel(logLevel);
        int i5 = onAttributionFailure + 75;
        onConversionDataFail = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 15;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1wSDK afErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
            String[] strArr = new String[1];
            strArr[1] = str;
            afErrorLogForExcManagerOnly.AFInAppEventType("setOaidData", strArr);
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setOaidData", str);
        }
        AFa1bSDK.AFInAppEventParameterName = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 69;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setAndroidIdData", str);
        this.afInfoLog = str;
        int i4 = onConversionDataFail + 123;
        onAttributionFailure = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    private static void AFKeystoreWrapper(String str, String str2) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 105;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i4 = onAttributionFailure + 105;
        onConversionDataFail = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    private static void AFKeystoreWrapper(String str, boolean z) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 23;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, z);
            int i3 = 54 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, z);
        }
        int i4 = onAttributionFailure + 71;
        onConversionDataFail = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
    }

    private static String valueOf(String str) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 55;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i4 = onAttributionFailure + 69;
        onConversionDataFail = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return string;
    }

    private static boolean AFInAppEventParameterName(String str, boolean z) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 105;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (i3 == 0) {
            return appsFlyerProperties.getBoolean(str, z);
        }
        appsFlyerProperties.getBoolean(str, z);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public final boolean AFKeystoreWrapper() {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 107;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        if (!AFInAppEventParameterName(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) || values() != null) {
            int i4 = onAttributionFailure + 79;
            onConversionDataFail = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onAttributionFailure + 69;
        int i7 = i6 % 128;
        onConversionDataFail = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 15;
        onAttributionFailure = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        String concat;
        boolean z2;
        int i = 2 % 2;
        int i2 = onAttributionFailure + 125;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            concat = "initAfterCustomerUserID: ".concat(String.valueOf(z));
            z2 = false;
        } else {
            concat = "initAfterCustomerUserID: ".concat(String.valueOf(z));
            z2 = true;
        }
        AFLogger.afInfoLog(concat, z2);
        AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
        int i3 = onAttributionFailure + 23;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        String str2;
        int i = 2 % 2;
        int i2 = onAttributionFailure + 13;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (context != null) {
            if (AFKeystoreWrapper()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog(new StringBuilder("CustomerUserId set: ").append(str).append(" - Initializing AppsFlyer Tacking").toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().AFKeystoreWrapper());
                AFInAppEventType(context, AFe1nSDK.setCustomerIdAndLogSession);
                String str3 = AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType;
                if (referrer == null) {
                    int i3 = onConversionDataFail + 29;
                    onAttributionFailure = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 80 / 0;
                    }
                    str2 = "";
                } else {
                    str2 = referrer;
                }
                if (context instanceof Activity) {
                    ((Activity) context).getIntent();
                }
                AFKeystoreWrapper(context, null, null, str2, null);
                return;
            }
            setCustomerUserId(str);
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
            int i5 = onAttributionFailure + 31;
            onConversionDataFail = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 75;
        onAttributionFailure = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string != null) {
                return string;
            }
            String AFKeystoreWrapper2 = AFKeystoreWrapper(context, "AF_STORE");
            if (AFKeystoreWrapper2 != null) {
                int i3 = onAttributionFailure + 77;
                onConversionDataFail = i3 % 128;
                int i4 = i3 % 2;
                return AFKeystoreWrapper2;
            }
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 23;
        onAttributionFailure = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            int i3 = onAttributionFailure + 115;
            onConversionDataFail = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            super.hashCode();
            throw null;
        }
        AFLogger.AFInAppEventType("Cannot set setOutOfStore with null");
        int i4 = onAttributionFailure + 97;
        onConversionDataFail = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 113;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        AFKeystoreWrapper(AppsFlyerProperties.ONELINK_ID, str);
        int i4 = onConversionDataFail + 97;
        onAttributionFailure = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 43;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        if (map != null) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            int i4 = onAttributionFailure + 5;
            onConversionDataFail = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = onConversionDataFail + 55;
        onAttributionFailure = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a0  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        String valueOf2;
        int i;
        long j;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i2 = 2;
        int i3 = 2 % 2;
        if (activity != null) {
            int i4 = onConversionDataFail + 49;
            onAttributionFailure = i4 % 128;
            int i5 = i4 % 2;
            if (activity.getIntent() != null) {
                AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("sendPushNotificationData", activity.getLocalClassName(), new StringBuilder("activity_intent_").append(activity.getIntent().toString()).toString());
                valueOf2 = valueOf(activity);
                this.AFLogger$LogLevel = valueOf2;
                if (valueOf2 == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (this.afErrorLogForExcManagerOnly == null) {
                        AFLogger.afInfoLog("pushes: initializing pushes history..");
                        this.afErrorLogForExcManagerOnly = new ConcurrentHashMap();
                        i = 2;
                        j = currentTimeMillis;
                    } else {
                        try {
                            long j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                            j = currentTimeMillis;
                            for (Long l : this.afErrorLogForExcManagerOnly.keySet()) {
                                try {
                                    jSONObject = new JSONObject(this.AFLogger$LogLevel);
                                    jSONObject2 = new JSONObject(this.afErrorLogForExcManagerOnly.get(l));
                                    i = i2;
                                } catch (Throwable th) {
                                    th = th;
                                    i = i2;
                                }
                                try {
                                    if (jSONObject.opt("pid").equals(jSONObject2.opt("pid"))) {
                                        int i6 = onAttributionFailure + 23;
                                        onConversionDataFail = i6 % 128;
                                        int i7 = i6 % 2;
                                        if (jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                            AFLogger.afInfoLog(new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ").append(jSONObject2).append(", new: ").append(jSONObject).append(")").toString());
                                            this.AFLogger$LogLevel = null;
                                            return;
                                        }
                                    }
                                    if (currentTimeMillis - l.longValue() > j2) {
                                        this.afErrorLogForExcManagerOnly.remove(l);
                                    }
                                    if (l.longValue() <= j) {
                                        j = l.longValue();
                                    }
                                    i2 = i;
                                } catch (Throwable th2) {
                                    th = th2;
                                    AFLogger.afErrorLog(new StringBuilder("Error while handling push notification measurement: ").append(th.getClass().getSimpleName()).toString(), th);
                                    if (this.afErrorLogForExcManagerOnly.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", i)) {
                                    }
                                    this.afErrorLogForExcManagerOnly.put(Long.valueOf(currentTimeMillis), this.AFLogger$LogLevel);
                                    start(activity);
                                    return;
                                }
                            }
                            i = i2;
                        } catch (Throwable th3) {
                            th = th3;
                            i = 2;
                            j = currentTimeMillis;
                        }
                    }
                    if (this.afErrorLogForExcManagerOnly.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", i)) {
                        AFLogger.afInfoLog(new StringBuilder("pushes: removing oldest overflowing push (oldest push:").append(j).append(")").toString());
                        this.afErrorLogForExcManagerOnly.remove(Long.valueOf(j));
                    }
                    this.afErrorLogForExcManagerOnly.put(Long.valueOf(currentTimeMillis), this.AFLogger$LogLevel);
                    start(activity);
                    return;
                }
                return;
            }
        }
        if (activity != null) {
            int i8 = onConversionDataFail + 31;
            onAttributionFailure = i8 % 128;
            if (i8 % 2 != 0) {
                AFb1wSDK afErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
                String[] strArr = new String[3];
                strArr[1] = activity.getLocalClassName();
                strArr[1] = "activity_intent_null";
                afErrorLogForExcManagerOnly.AFInAppEventType("sendPushNotificationData", strArr);
            } else {
                AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            }
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("sendPushNotificationData", "activity_null");
        }
        valueOf2 = valueOf(activity);
        this.AFLogger$LogLevel = valueOf2;
        if (valueOf2 == null) {
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 61;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i3 = onConversionDataFail + 91;
            onAttributionFailure = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        throw null;
    }

    /* renamed from: com.appsflyer.internal.AFa1dSDK$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AFInAppEventParameterName;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            AFInAppEventParameterName = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFInAppEventParameterName[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int i2 = onConversionDataFail + 47;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 4;
        }
        String str = null;
        for (String str2 : strArr) {
            if (AnonymousClass2.AFInAppEventParameterName[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFb1zSDK.AFInAppEventParameterName(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                int i4 = onConversionDataFail + 21;
                onAttributionFailure = i4 % 128;
                int i5 = i4 % 2;
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 19;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCollectAndroidID", String.valueOf(z));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        int i4 = onConversionDataFail + 121;
        onAttributionFailure = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 83;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCollectIMEI", String.valueOf(z));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        int i4 = onAttributionFailure + 81;
        onConversionDataFail = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 23;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCollectOaid", String.valueOf(z));
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCollectOaid", String.valueOf(z));
        }
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        int i3 = onAttributionFailure + 101;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(AFe1zSDK aFe1zSDK) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 115;
        onAttributionFailure = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (aFe1zSDK == AFe1zSDK.SUCCESS) {
                int i3 = onAttributionFailure + 9;
                onConversionDataFail = i3 % 128;
                int i4 = i3 % 2;
                AFInAppEventParameterName().onResponseErrorNative().values();
                if (i4 != 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }
            return;
        }
        AFe1zSDK aFe1zSDK2 = AFe1zSDK.SUCCESS;
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        String str2;
        int i = 2 % 2;
        if (!this.init) {
            this.init = true;
            AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType = str;
            AFc1pSDK.AFInAppEventParameterName(str);
            if (context != null) {
                this.onInstallConversionFailureNative = (Application) context.getApplicationContext();
                AFInAppEventType(context);
                AFInAppEventParameterName().AFLogger().valueOf = System.currentTimeMillis();
                AFInAppEventParameterName().onResponseErrorNative().AFInAppEventType();
                AFInAppEventParameterName().afDebugLog().valueOf(new AFd1cSDK() { // from class: com.appsflyer.internal.AFa1dSDK$$ExternalSyntheticLambda5
                    @Override // com.appsflyer.internal.AFd1cSDK
                    public final void onRemoteConfigUpdateFinished(AFe1zSDK aFe1zSDK) {
                        AFa1dSDK.this.AFInAppEventParameterName(aFe1zSDK);
                    }
                });
                afDebugLog();
                this.onAppOpenAttribution.AFVersionDeclaration().AFInAppEventParameterName();
            } else {
                AFLogger.afWarnLog("context is null, Google Install Referrer will be not initialized");
            }
            AFb1wSDK afErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
            String[] strArr = new String[2];
            strArr[0] = str;
            if (appsFlyerConversionListener != null) {
                int i2 = onConversionDataFail + 105;
                onAttributionFailure = i2 % 128;
                int i3 = i2 % 2;
                str2 = "conversionDataListener";
            } else {
                str2 = "null";
            }
            strArr[1] = str2;
            afErrorLogForExcManagerOnly.AFInAppEventType("init", strArr);
            AFLogger.AFInAppEventParameterName(String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.12.1", valueOf));
            this.AFInAppEventType = appsFlyerConversionListener;
            return this;
        }
        int i4 = onConversionDataFail + 15;
        onAttributionFailure = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    private void afDebugLog() {
        int i = 2 % 2;
        AFf1kSDK AFLogger$LogLevel = AFInAppEventParameterName().AFLogger$LogLevel();
        AFf1pSDK afRDLog2 = afRDLog();
        Runnable AFInAppEventType = AFInAppEventType(afRDLog2);
        AFLogger$LogLevel.values(afRDLog2);
        AFLogger$LogLevel.values(new AFf1cSDK(AFInAppEventType));
        AFLogger$LogLevel.values(new AFf1gSDK(AFInAppEventType, AFInAppEventParameterName()));
        AFLogger$LogLevel.values(new AFf1hSDK(AFInAppEventType, AFInAppEventParameterName()));
        if (!afErrorLog()) {
            AFLogger$LogLevel.AFInAppEventParameterName(this.onInstallConversionFailureNative, AFInAppEventType, AFInAppEventParameterName());
        }
        AFf1jSDK[] AFInAppEventType2 = AFLogger$LogLevel.AFInAppEventType();
        int i2 = onAttributionFailure + 75;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 3;
        }
        for (AFf1jSDK aFf1jSDK : AFInAppEventType2) {
            int i4 = onAttributionFailure + 65;
            onConversionDataFail = i4 % 128;
            int i5 = i4 % 2;
            aFf1jSDK.AFKeystoreWrapper(this.onInstallConversionFailureNative);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getLevel() {
        ScheduledExecutorService values2;
        Runnable runnable;
        int i = 2 % 2;
        int i2 = onConversionDataFail + 101;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            values2 = AFInAppEventParameterName().values();
            runnable = new Runnable() { // from class: com.appsflyer.internal.AFa1dSDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1dSDK.this.AFVersionDeclaration();
                }
            };
        } else {
            values2 = AFInAppEventParameterName().values();
            runnable = new Runnable() { // from class: com.appsflyer.internal.AFa1dSDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1dSDK.this.AFVersionDeclaration();
                }
            };
        }
        AFInAppEventType(values2, runnable, 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFVersionDeclaration() {
        int i = 2 % 2;
        try {
            AFe1hSDK aFe1hSDK = new AFe1hSDK();
            if (AFInAppEventParameterName(aFe1hSDK, valueOf(this.onInstallConversionFailureNative))) {
                int i2 = onConversionDataFail + 123;
                onAttributionFailure = i2 % 128;
                int i3 = i2 % 2;
                valueOf(aFe1hSDK);
                int i4 = onAttributionFailure + 83;
                onConversionDataFail = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    private AFf1pSDK afRDLog() {
        int i = 2 % 2;
        AFf1pSDK aFf1pSDK = new AFf1pSDK(new Runnable() { // from class: com.appsflyer.internal.AFa1dSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFa1dSDK.this.getLevel();
            }
        }, AFInAppEventParameterName().valueOf());
        int i2 = onConversionDataFail + 31;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
        return aFf1pSDK;
    }

    private Runnable AFInAppEventType(final AFf1pSDK aFf1pSDK) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 75;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            new Runnable() { // from class: com.appsflyer.internal.AFa1dSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1dSDK.this.AFKeystoreWrapper(aFf1pSDK);
                }
            };
            throw null;
        }
        Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFa1dSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFa1dSDK.this.AFKeystoreWrapper(aFf1pSDK);
            }
        };
        int i3 = onAttributionFailure + 49;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 != 0) {
            return runnable;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(AFf1pSDK aFf1pSDK) {
        int i = 2 % 2;
        AFb1fSDK valueOf2 = valueOf(this.onInstallConversionFailureNative);
        boolean z = false;
        int AFInAppEventType = AFInAppEventParameterName().AFInAppEventParameterName().AFInAppEventType.AFInAppEventType("appsFlyerCount", 0);
        boolean AFKeystoreWrapper2 = valueOf2.AFKeystoreWrapper(AppsFlyerProperties.NEW_REFERRER_SENT);
        if (aFf1pSDK.afRDLog == AFf1jSDK.AFa1vSDK.NOT_STARTED) {
            int i2 = onConversionDataFail + 15;
            onAttributionFailure = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        if (AFInAppEventType == 1) {
            int i4 = onConversionDataFail + 91;
            onAttributionFailure = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (z || AFKeystoreWrapper2) {
                valueOf(new AFe1hSDK());
                int i5 = onAttributionFailure + 11;
                onConversionDataFail = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    private boolean afErrorLog() {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 89;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        boolean AFInAppEventType = AFInAppEventParameterName().AFInAppEventParameterName().AFInAppEventType("AF_PREINSTALL_DISABLED");
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return AFInAppEventType;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 113;
        int i3 = i2 % 128;
        onAttributionFailure = i3;
        int i4 = i2 % 2;
        this.onDeepLinkingNative = z;
        int i5 = i3 + 47;
        onConversionDataFail = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 107;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        start(context, null);
        int i4 = onAttributionFailure + 55;
        onConversionDataFail = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 37;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        start(context, str, null);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        int i = 2 % 2;
        if (AFInAppEventParameterName().onDeepLinkingNative().AFKeystoreWrapper()) {
            return;
        }
        if (!this.init) {
            int i2 = onConversionDataFail + 17;
            onAttributionFailure = i2 % 128;
            int i3 = i2 % 2;
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
        }
        AFInAppEventType(context);
        final AFe1lSDK AFLogger = AFInAppEventParameterName().AFLogger();
        AFLogger.values(AFa1rSDK.AFKeystoreWrapper(context));
        this.onInstallConversionFailureNative = (Application) context.getApplicationContext();
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("start", str);
        String str2 = valueOf;
        AFLogger.afInfoLog(String.format("Starting AppsFlyer: (v%s.%s)", "6.12.1", str2));
        AFLogger.afInfoLog(new StringBuilder("Build Number: ").append(str2).toString());
        AppsFlyerProperties.getInstance().loadProperties(AFInAppEventParameterName().AFKeystoreWrapper());
        if (!TextUtils.isEmpty(str)) {
            int i4 = onAttributionFailure + 87;
            onConversionDataFail = i4 % 128;
            if (i4 % 2 == 0) {
                AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType = str;
                AFc1pSDK.AFInAppEventParameterName(str);
                int i5 = 66 / 0;
            } else {
                AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType = str;
                AFc1pSDK.AFInAppEventParameterName(str);
            }
        } else if (TextUtils.isEmpty(AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType)) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        AFInAppEventParameterName().afDebugLog().valueOf(null);
        afErrorLogForExcManagerOnly();
        afInfoLog(this.onInstallConversionFailureNative.getBaseContext());
        if (this.onDeepLinkingNative) {
            int i6 = onAttributionFailure + 77;
            onConversionDataFail = i6 % 128;
            int i7 = i6 % 2;
            AFInAppEventParameterName(this.onInstallConversionFailureNative.getApplicationContext());
        }
        this.onAppOpenAttribution.onDeepLinkingNative().AFInAppEventParameterName(context, new AFb1iSDK.AFa1wSDK() { // from class: com.appsflyer.internal.AFa1dSDK.5
            @Override // com.appsflyer.internal.AFb1iSDK.AFa1wSDK
            public final void values(Activity activity) {
                AFLogger.AFInAppEventParameterName();
                AFa1dSDK.this.AFInAppEventParameterName().afDebugLog().valueOf(null);
                AFa1dSDK.valueOf(AFa1dSDK.this);
                AFa1dSDK aFa1dSDK = AFa1dSDK.this;
                int AFInAppEventType = aFa1dSDK.AFInAppEventType(aFa1dSDK.valueOf((Context) activity), false);
                AFLogger.afInfoLog("onBecameForeground");
                if (AFInAppEventType < 2) {
                    AFa1dSDK.this.AFInAppEventParameterName().afWarnLog().AFInAppEventType();
                }
                AFe1bSDK aFe1bSDK = new AFe1bSDK();
                if (activity != null) {
                    AFa1dSDK.this.AFInAppEventParameterName().init().valueOf(aFe1bSDK.AFInAppEventType(), activity.getIntent(), activity.getApplication());
                }
                AFa1dSDK aFa1dSDK2 = AFa1dSDK.this;
                aFe1bSDK.AFInAppEventType = appsFlyerRequestListener;
                aFa1dSDK2.values(aFe1bSDK, activity);
            }

            @Override // com.appsflyer.internal.AFb1iSDK.AFa1wSDK
            public final void AFKeystoreWrapper(Context context2) {
                AFLogger.afInfoLog("onBecameBackground");
                AFe1lSDK aFe1lSDK = AFLogger;
                long currentTimeMillis = System.currentTimeMillis();
                if (aFe1lSDK.afDebugLog != 0) {
                    long j = currentTimeMillis - aFe1lSDK.afDebugLog;
                    if (j > 0 && j < 1000) {
                        j = 1000;
                    }
                    aFe1lSDK.afErrorLogForExcManagerOnly = TimeUnit.MILLISECONDS.toSeconds(j);
                    aFe1lSDK.AFKeystoreWrapper.AFInAppEventType("prev_session_dur", aFe1lSDK.afErrorLogForExcManagerOnly);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFa1dSDK.this.AFInAppEventType(new WeakReference<>(context2));
                AFa1dSDK.this.AFInAppEventParameterName().onResponseErrorNative().AFKeystoreWrapper();
                AFb1wSDK afErrorLogForExcManagerOnly = AFa1dSDK.this.AFInAppEventParameterName().afErrorLogForExcManagerOnly();
                if (afErrorLogForExcManagerOnly.afErrorLog()) {
                    afErrorLogForExcManagerOnly.valueOf();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        afErrorLogForExcManagerOnly.AFInAppEventType(context2.getPackageName(), context2.getPackageManager(), AFa1dSDK.this.AFInAppEventParameterName());
                    }
                    afErrorLogForExcManagerOnly.AFInAppEventType();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1dSDK.this.AFInAppEventParameterName().afWarnLog().values();
            }
        });
    }

    private static void afInfoLog(Context context) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 15;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                int i4 = onConversionDataFail + 33;
                onAttributionFailure = i4 % 128;
                if (i4 % 2 != 0) {
                    context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName());
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    int i5 = onAttributionFailure + 65;
                    onConversionDataFail = i5 % 128;
                    int i6 = i5 % 2;
                    AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    return;
                }
                AFLogger.AFInAppEventType("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
            }
            int i7 = onAttributionFailure + 57;
            onConversionDataFail = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 27 / 0;
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("checkBackupRules Exception", e);
            AFLogger.afRDLog("checkBackupRules Exception: ".concat(String.valueOf(e)));
        }
    }

    private void afDebugLog(Context context) {
        int i;
        if (AFa1cSDK.valueOf()) {
            AFLogger.afRDLog("OPPO device found");
            i = 23;
        } else {
            i = 18;
        }
        if (Build.VERSION.SDK_INT >= i && !AFInAppEventParameterName(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog(new StringBuilder("OS SDK is=").append(Build.VERSION.SDK_INT).append("; use KeyStore").toString());
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
            if (!aFKeystoreWrapper.valueOf()) {
                aFKeystoreWrapper.AFKeystoreWrapper = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper());
                aFKeystoreWrapper.AFInAppEventType = 0;
                aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventParameterName());
            } else {
                String AFInAppEventParameterName2 = aFKeystoreWrapper.AFInAppEventParameterName();
                synchronized (aFKeystoreWrapper.AFInAppEventParameterName) {
                    aFKeystoreWrapper.AFInAppEventType++;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFInAppEventParameterName2)));
                    try {
                        synchronized (aFKeystoreWrapper.AFInAppEventParameterName) {
                            aFKeystoreWrapper.values.deleteEntry(AFInAppEventParameterName2);
                        }
                    } catch (KeyStoreException e) {
                        AFLogger.afErrorLog(new StringBuilder("Exception ").append(e.getMessage()).append(" occurred").toString(), e);
                    }
                }
                aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventParameterName());
            }
            AFKeystoreWrapper("KSAppsFlyerId", aFKeystoreWrapper.AFKeystoreWrapper());
            AFKeystoreWrapper("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.AFInAppEventType()));
            return;
        }
        AFLogger.afRDLog(new StringBuilder("OS SDK is=").append(Build.VERSION.SDK_INT).append("; no KeyStore usage").toString());
    }

    public static String values() {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 93;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        String valueOf2 = valueOf(AppsFlyerProperties.APP_USER_ID);
        int i4 = onConversionDataFail + 103;
        onAttributionFailure = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return valueOf2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 99;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFKeystoreWrapper(AppsFlyerProperties.APP_USER_ID, str);
        AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i4 = onConversionDataFail + 63;
        onAttributionFailure = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 81;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        this.onResponseNative = AFb1zSDK.AFInAppEventParameterName(str);
        if (i3 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = onConversionDataFail + 101;
        onAttributionFailure = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static String AFLogger() {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 79;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        String valueOf2 = valueOf(AppsFlyerProperties.APP_ID);
        int i4 = onConversionDataFail + 101;
        onAttributionFailure = i4 % 128;
        if (i4 % 2 == 0) {
            return valueOf2;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 77;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setAppId", str);
        AFKeystoreWrapper(AppsFlyerProperties.APP_ID, str);
        int i4 = onAttributionFailure + 19;
        onConversionDataFail = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 45;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i4 = onConversionDataFail + 53;
        onAttributionFailure = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 7;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i4 = onConversionDataFail + 11;
        onAttributionFailure = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 97;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i4 = onConversionDataFail + 77;
        onAttributionFailure = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        int i = 2 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        valueOf(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        int i2 = onAttributionFailure + 79;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
    }

    final void AFInAppEventType(WeakReference<Context> weakReference) {
        int i = 2 % 2;
        if (weakReference.get() == null) {
            return;
        }
        AFLogger.afInfoLog("app went to background");
        AFb1fSDK valueOf2 = valueOf(weakReference.get());
        AppsFlyerProperties.getInstance().saveProperties(valueOf2);
        long j = AFInAppEventParameterName().AFLogger().afErrorLogForExcManagerOnly;
        HashMap hashMap = new HashMap();
        String str = AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType;
        Object obj = null;
        if (str == null) {
            int i2 = onConversionDataFail + 11;
            onAttributionFailure = i2 % 128;
            if (i2 % 2 == 0) {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            } else {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                super.hashCode();
                throw null;
            }
        }
        String valueOf3 = valueOf("KSAppsFlyerId");
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        AFc1uSDK.AFa1wSDK values2 = AFa1bSDK.values(weakReference.get().getContentResolver());
        if (values2 != null) {
            hashMap.put("amazon_aid", values2.AFInAppEventParameterName);
            hashMap.put("amazon_aid_limit", String.valueOf(values2.AFInAppEventType));
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            int i3 = onConversionDataFail + 39;
            onAttributionFailure = i3 % 128;
            int i4 = i3 % 2;
            hashMap.put("advertiserId", string);
        }
        hashMap.put("app_id", weakReference.get().getPackageName());
        hashMap.put("devkey", str);
        hashMap.put("uid", AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper()));
        hashMap.put("time_in_app", String.valueOf(j));
        hashMap.put("statType", "user_closed_app");
        hashMap.put("platform", "Android");
        hashMap.put("launch_counter", Integer.toString(AFInAppEventType(valueOf2, false)));
        hashMap.put(AppsFlyerProperties.CHANNEL, AFInAppEventParameterName().AFInAppEventParameterName().AFKeystoreWrapper());
        if (valueOf3 != null) {
            int i5 = onConversionDataFail + 15;
            onAttributionFailure = i5 % 128;
            if (i5 % 2 != 0) {
                super.hashCode();
                throw null;
            }
        } else {
            int i6 = onAttributionFailure + 61;
            onConversionDataFail = i6 % 128;
            int i7 = i6 % 2;
            valueOf3 = "";
        }
        hashMap.put("originalAppsflyerId", valueOf3);
        if (!this.AppsFlyer2dXConversionCallback) {
            AFLogger.afDebugLog("Stats call is disabled, ignore ...");
            return;
        }
        AFf1wSDK aFf1wSDK = new AFf1wSDK();
        aFf1wSDK.afWarnLog = isStopped();
        AFd1eSDK aFd1eSDK = new AFd1eSDK((AFf1wSDK) aFf1wSDK.valueOf(AFInAppEventParameterName().AFInAppEventParameterName().AFInAppEventType.AFInAppEventType("appsFlyerCount", 0)).AFInAppEventType(hashMap).valueOf(String.format(afRDLog, AppsFlyerLib.getInstance().getHostPrefix(), valueOf().getHostName())), AFInAppEventParameterName());
        AFd1tSDK level = AFInAppEventParameterName().getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1eSDK));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 73;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("logSession", new String[0]);
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().values();
        AFInAppEventType(context, AFe1nSDK.logSession);
        Object obj = null;
        valueOf(context, (String) null, (Map<String, Object>) null);
        int i4 = onAttributionFailure + 111;
        onConversionDataFail = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    private void AFInAppEventType(Context context, AFe1nSDK aFe1nSDK) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 117;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType(context);
        AFe1lSDK AFLogger = AFInAppEventParameterName().AFLogger();
        AFe1oSDK AFKeystoreWrapper2 = AFa1rSDK.AFKeystoreWrapper(context);
        if (!(!AFLogger.values())) {
            AFLogger.values.put("api_name", aFe1nSDK.toString());
            AFLogger.values(AFKeystoreWrapper2);
            int i4 = onConversionDataFail + 3;
            onAttributionFailure = i4 % 128;
            int i5 = i4 % 2;
        }
        AFLogger.AFInAppEventParameterName();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int i = 2 % 2;
        int AFInAppEventParameterName2 = AFInAppEventParameterName(valueOf(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adrevenue_counter", Integer.valueOf(AFInAppEventParameterName2));
        AFInAppEventType(context, hashMap, new AFe1gSDK());
        int i2 = onAttributionFailure + 25;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdImpression(Context context, Map<String, Object> map) {
        int i = 2 % 2;
        int AFKeystoreWrapper2 = AFKeystoreWrapper(valueOf(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adimpression_counter", Integer.valueOf(AFKeystoreWrapper2));
        AFInAppEventType(context, hashMap, new AFe1jSDK());
        int i2 = onAttributionFailure + 117;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AFInAppEventType(Context context, Map<String, Object> map, AFa1qSDK aFa1qSDK) {
        Activity activity;
        int i = 2 % 2;
        int i2 = onConversionDataFail + 19;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType(context);
        aFa1qSDK.AFInAppEventType(map);
        if (!(!(context instanceof Activity))) {
            int i4 = onConversionDataFail;
            int i5 = i4 + 83;
            onAttributionFailure = i5 % 128;
            int i6 = i5 % 2;
            activity = (Activity) context;
            int i7 = i4 + 107;
            onAttributionFailure = i7 % 128;
            int i8 = i7 % 2;
        } else {
            activity = null;
        }
        values(aFa1qSDK, activity);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 73;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        logEvent(context, str, map, null);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onAttributionFailure + 81;
        onConversionDataFail = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void valueOf(Context context, String str, Map<String, Object> map) {
        Activity activity;
        int i = 2 % 2;
        AFe1aSDK aFe1aSDK = new AFe1aSDK();
        aFe1aSDK.afDebugLog = str;
        aFe1aSDK.AFKeystoreWrapper = map;
        if (context instanceof Activity) {
            int i2 = onConversionDataFail + 29;
            onAttributionFailure = i2 % 128;
            int i3 = i2 % 2;
            activity = (Activity) context;
        } else {
            int i4 = onConversionDataFail + 25;
            onAttributionFailure = i4 % 128;
            int i5 = i4 % 2;
            activity = null;
        }
        values(aFe1aSDK, activity);
    }

    final void values(AFa1qSDK aFa1qSDK, Activity activity) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 23;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType(aFa1qSDK, activity);
        if (AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType != null) {
            String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().AFKeystoreWrapper());
            if (referrer == null) {
                referrer = "";
            }
            aFa1qSDK.AFLogger = referrer;
            AFInAppEventType(aFa1qSDK);
            return;
        }
        AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.AFInAppEventType;
        if (appsFlyerRequestListener != null) {
            int i4 = onAttributionFailure + 99;
            onConversionDataFail = i4 % 128;
            int i5 = i4 % 2;
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 1;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("anonymizeUser", String.valueOf(z));
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("anonymizeUser", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        int i3 = onConversionDataFail + 11;
        onAttributionFailure = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 111;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("registerConversionListener", new String[0]);
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("registerConversionListener", new String[0]);
        }
        AFInAppEventParameterName(appsFlyerConversionListener);
        int i3 = onConversionDataFail + 73;
        onAttributionFailure = i3 % 128;
        int i4 = i3 % 2;
    }

    private void AFInAppEventParameterName(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 97;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (appsFlyerConversionListener == null) {
            return;
        }
        this.AFInAppEventType = appsFlyerConversionListener;
        int i3 = onConversionDataFail + 21;
        onAttributionFailure = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 63;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("unregisterConversionListener", new String[0]);
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("unregisterConversionListener", new String[0]);
        }
        this.AFInAppEventType = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0048, code lost:
    
        com.appsflyer.internal.AFa1dSDK.AFInAppEventParameterName = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
        r3 = com.appsflyer.internal.AFa1dSDK.onAttributionFailure + 51;
        com.appsflyer.internal.AFa1dSDK.onConversionDataFail = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 81;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("registerValidatorListener", new String[1]);
            AFLogger.afDebugLog("registerValidatorListener called");
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("registerValidatorListener", new String[0]);
            AFLogger.afDebugLog("registerValidatorListener called");
        }
    }

    public static String values(SimpleDateFormat simpleDateFormat, long j) {
        int i = 2 % 2;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        int i2 = onConversionDataFail + 59;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 == 0) {
            return format;
        }
        throw null;
    }

    private void AFKeystoreWrapper(Context context, String str, Map<String, Object> map, String str2, String str3) {
        AFa1qSDK aFe1bSDK;
        int i;
        int i2 = 2 % 2;
        int i3 = onAttributionFailure + 45;
        onConversionDataFail = i3 % 128;
        int i4 = i3 % 2;
        if (str == null || str.trim().isEmpty()) {
            aFe1bSDK = new AFe1bSDK();
            i = onAttributionFailure + 115;
        } else {
            aFe1bSDK = new AFe1aSDK();
            i = onAttributionFailure + 125;
        }
        onConversionDataFail = i % 128;
        int i5 = i % 2;
        AFInAppEventType(context);
        aFe1bSDK.afDebugLog = str;
        aFe1bSDK.AFKeystoreWrapper = map;
        aFe1bSDK.AFLogger = str2;
        aFe1bSDK.values = str3;
        AFInAppEventType(aFe1bSDK);
        int i6 = onConversionDataFail + 105;
        onAttributionFailure = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        boolean z;
        int i = 2 % 2;
        byte b = 0;
        if (aFa1qSDK.afDebugLog == null) {
            int i2 = onAttributionFailure + 97;
            onConversionDataFail = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (AFKeystoreWrapper()) {
            int i4 = onConversionDataFail + 71;
            onAttributionFailure = i4 % 128;
            int i5 = i4 % 2;
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z) {
            int i6 = onConversionDataFail + 125;
            onAttributionFailure = i6 % 128;
            int i7 = i6 % 2;
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else if (afInfoLog()) {
                int i8 = onConversionDataFail + 77;
                onAttributionFailure = i8 % 128;
                int i9 = i8 % 2;
                AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.AFInAppEventType;
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                    return;
                }
                return;
            }
            this.AFLogger = System.currentTimeMillis();
        }
        AFInAppEventType(AFInAppEventParameterName().values(), new AFa1vSDK(this, aFa1qSDK, b), 0L, TimeUnit.MILLISECONDS);
    }

    private boolean afInfoLog() {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 125;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        if (this.AFLogger > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.AFLogger;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            String values2 = values(simpleDateFormat, this.AFLogger);
            String values3 = values(simpleDateFormat, this.afWarnLog);
            if (currentTimeMillis < this.getLevel && !isStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", values2, values3, Long.valueOf(currentTimeMillis), Long.valueOf(this.getLevel)));
                return true;
            }
            if (!isStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", values2, values3, Long.valueOf(currentTimeMillis)));
            }
        } else if (!isStopped()) {
            int i4 = onAttributionFailure + 37;
            onConversionDataFail = i4 % 128;
            int i5 = i4 % 2;
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        int i6 = onAttributionFailure + 81;
        onConversionDataFail = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 8 / 0;
        }
        return false;
    }

    private void values(Context context, String str) {
        int i = 2 % 2;
        byte b = 0;
        AFa1qSDK valueOf2 = new AFe1iSDK().valueOf(AFInAppEventParameterName().AFInAppEventParameterName().AFInAppEventType.AFInAppEventType("appsFlyerCount", 0));
        valueOf2.AFLogger = str;
        if (str != null) {
            int i2 = onConversionDataFail + 121;
            onAttributionFailure = i2 % 128;
            if (i2 % 2 == 0 ? str.length() > 5 : str.length() > 4) {
                if (AFInAppEventParameterName(valueOf2, valueOf(context))) {
                    AFInAppEventType(AFInAppEventParameterName().values(), new AFa1vSDK(this, valueOf2, b), 5L, TimeUnit.MILLISECONDS);
                    int i3 = onAttributionFailure + 27;
                    onConversionDataFail = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
        }
        int i5 = onConversionDataFail + 11;
        onAttributionFailure = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void valueOf(AFa1qSDK aFa1qSDK) {
        String str;
        long j;
        int i = 2 % 2;
        Context context = AFInAppEventParameterName().onAppOpenAttributionNative().AFInAppEventParameterName;
        if (context == null) {
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        AFb1fSDK valueOf2 = valueOf(context);
        AppsFlyerProperties.getInstance().saveProperties(valueOf2);
        if (!AFInAppEventParameterName().AFVersionDeclaration().values()) {
            AFLogger.afInfoLog(new StringBuilder("sendWithEvent from activity: ").append(context.getClass().getName()).toString());
            int i2 = onAttributionFailure + 61;
            onConversionDataFail = i2 % 128;
            int i3 = i2 % 2;
        }
        boolean values2 = aFa1qSDK.values();
        Map<String, ?> values3 = values(aFa1qSDK);
        String str2 = (String) values3.get("appsflyerKey");
        if (str2 != null) {
            int i4 = onConversionDataFail + 101;
            onAttributionFailure = i4 % 128;
            if (i4 % 2 != 0) {
                str2.length();
                super.hashCode();
                throw null;
            }
            if (str2.length() != 0) {
                if (!isStopped()) {
                    AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
                }
                byte b = 0;
                int i5 = 0;
                int AFInAppEventType = AFInAppEventType(valueOf2, false);
                AFg1zSDK aFg1zSDK = new AFg1zSDK(this.onAppOpenAttribution);
                Intrinsics.checkNotNullParameter(aFa1qSDK, "");
                boolean values4 = aFa1qSDK.values();
                boolean z = aFa1qSDK instanceof AFe1gSDK;
                boolean z2 = aFa1qSDK instanceof AFe1jSDK;
                boolean z3 = aFa1qSDK instanceof AFe1iSDK;
                if ((aFa1qSDK instanceof AFe1hSDK) || z3) {
                    str = AFg1zSDK.afErrorLog;
                    if (str == null) {
                        int i6 = onConversionDataFail + 77;
                        onAttributionFailure = i6 % 128;
                        if (i6 % 2 != 0) {
                            aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.valueOf);
                            super.hashCode();
                            throw null;
                        }
                        str = aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.valueOf);
                    }
                } else if (z2) {
                    str = AFg1zSDK.afWarnLog;
                    if (str == null) {
                        int i7 = onAttributionFailure + 81;
                        onConversionDataFail = i7 % 128;
                        if (i7 % 2 == 0) {
                            aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.AFInAppEventType);
                            throw null;
                        }
                        str = aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.AFInAppEventType);
                    }
                } else if (z) {
                    int i8 = onAttributionFailure + 11;
                    onConversionDataFail = i8 % 128;
                    int i9 = i8 % 2;
                    str = AFg1zSDK.afInfoLog;
                    if (str == null) {
                        str = aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.AFKeystoreWrapper);
                    }
                } else if (!values4) {
                    str = AFg1zSDK.getLevel;
                    if (str == null) {
                        str = aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.afRDLog);
                    }
                } else if (AFInAppEventType < 2) {
                    int i10 = onAttributionFailure + 51;
                    onConversionDataFail = i10 % 128;
                    int i11 = i10 % 2;
                    str = AFg1zSDK.AFLogger$LogLevel;
                    if (str == null) {
                        str = aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.AFLogger);
                    }
                    int i12 = onConversionDataFail + 67;
                    onAttributionFailure = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    str = AFg1zSDK.AFVersionDeclaration;
                    if (str == null) {
                        str = aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.afDebugLog);
                    }
                }
                StringBuilder append = new StringBuilder().append(AFg1zSDK.valueOf(new StringBuilder().append(str).append(aFg1zSDK.valueOf.AFInAppEventParameterName().values.AFInAppEventParameterName.getPackageName()).toString(), z));
                String AFKeystoreWrapper2 = aFg1zSDK.valueOf.AFInAppEventParameterName().AFKeystoreWrapper();
                r6 = AFKeystoreWrapper2 != null ? "&channel=".concat(String.valueOf(AFKeystoreWrapper2)) : null;
                String obj = append.append(r6 != null ? r6 : "").toString();
                valueOf(values3);
                AFa1ySDK aFa1ySDK = new AFa1ySDK(this, aFa1qSDK.valueOf(obj).AFInAppEventType(values3).valueOf(AFInAppEventType), b);
                if (values2) {
                    AFf1jSDK[] AFLogger$LogLevel = AFLogger$LogLevel();
                    int length = AFLogger$LogLevel.length;
                    boolean z4 = false;
                    while (i5 < length) {
                        AFf1jSDK aFf1jSDK = AFLogger$LogLevel[i5];
                        if (aFf1jSDK.afRDLog == AFf1jSDK.AFa1vSDK.STARTED) {
                            AFLogger.afDebugLog(new StringBuilder("Failed to get ").append(aFf1jSDK.AFInAppEventParameterName).append(" referrer, wait ...").toString());
                            z4 = true;
                        }
                        i5++;
                        z4 = z4;
                    }
                    if (this.onDeepLinkingNative) {
                        int i14 = onConversionDataFail + 107;
                        onAttributionFailure = i14 % 128;
                        int i15 = i14 % 2;
                        if (!afWarnLog()) {
                            AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                            b = 1;
                            if (AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType()) {
                                b = 1;
                            }
                        }
                    }
                    b = z4 ? 1 : 0;
                    if (AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType()) {
                    }
                }
                ScheduledExecutorService values5 = AFInAppEventParameterName().values();
                if (b != 0) {
                    j = 500;
                } else {
                    int i16 = onAttributionFailure + 65;
                    onConversionDataFail = i16 % 128;
                    int i17 = i16 % 2;
                    j = 0;
                }
                AFInAppEventType(values5, aFa1ySDK, j, TimeUnit.MILLISECONDS);
                return;
            }
        }
        AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.AFInAppEventType;
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    private boolean AFInAppEventParameterName(AFa1qSDK aFa1qSDK, AFb1fSDK aFb1fSDK) {
        boolean z;
        int i = 2 % 2;
        int i2 = onConversionDataFail + 49;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        int AFInAppEventType = AFInAppEventType(aFb1fSDK, false);
        if (AFInAppEventType == 1) {
            int i4 = onAttributionFailure + 109;
            int i5 = i4 % 128;
            onConversionDataFail = i5;
            int i6 = i4 % 2;
            if (!(aFa1qSDK instanceof AFe1hSDK)) {
                int i7 = i5 + 89;
                onAttributionFailure = i7 % 128;
                int i8 = i7 % 2;
                z = true;
                return (!aFb1fSDK.AFKeystoreWrapper(AppsFlyerProperties.NEW_REFERRER_SENT) && AFInAppEventType == 1) || z;
            }
        }
        z = false;
        if (aFb1fSDK.AFKeystoreWrapper(AppsFlyerProperties.NEW_REFERRER_SENT)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r5.remove("android_id") != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r5.remove("android_id") != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void valueOf(Map<String, Object> map) {
        int i = 2 % 2;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return;
        }
        int i2 = onConversionDataFail + 53;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        if (map.get("advertiserId") != null) {
            try {
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
                return;
            }
            if (AFb1vSDK.AFInAppEventParameterName(this.afInfoLog)) {
                int i4 = onAttributionFailure + 51;
                onConversionDataFail = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 17 / 0;
                }
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
                return;
            }
            if (!AFb1vSDK.AFInAppEventParameterName(AFInAppEventParameterName().AFVersionDeclaration().valueOf) || map.remove("imei") == null) {
                return;
            }
            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
        }
    }

    private boolean afWarnLog() {
        int i = 2 % 2;
        int i2 = onConversionDataFail;
        int i3 = i2 + 113;
        onAttributionFailure = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.onConversionDataSuccess;
        if (map == null) {
            return false;
        }
        int i5 = i2 + 87;
        onAttributionFailure = i5 % 128;
        int i6 = i5 % 2;
        if (map.isEmpty()) {
            return false;
        }
        int i7 = onConversionDataFail + 11;
        onAttributionFailure = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x041f A[Catch: Exception -> 0x0425, all -> 0x0722, TRY_LEAVE, TryCatch #11 {Exception -> 0x0425, blocks: (B:132:0x0409, B:134:0x041f), top: B:131:0x0409, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04bf A[Catch: all -> 0x0561, TryCatch #0 {all -> 0x0561, blocks: (B:147:0x04a8, B:151:0x04bb, B:153:0x04bf, B:154:0x04c8), top: B:146:0x04a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0589 A[Catch: all -> 0x0722, TryCatch #1 {all -> 0x0722, blocks: (B:13:0x00af, B:15:0x00b5, B:18:0x00c2, B:19:0x00d3, B:21:0x00de, B:23:0x00fa, B:24:0x00ff, B:26:0x0107, B:27:0x010c, B:29:0x0112, B:31:0x011a, B:33:0x0126, B:35:0x01a5, B:37:0x01ab, B:39:0x01b1, B:40:0x01c8, B:42:0x01d5, B:44:0x01dc, B:45:0x01e3, B:47:0x01e9, B:48:0x01f0, B:50:0x0207, B:51:0x020c, B:54:0x0214, B:55:0x0217, B:57:0x021d, B:58:0x0220, B:60:0x0232, B:62:0x0238, B:63:0x023b, B:65:0x0243, B:66:0x024c, B:68:0x0250, B:71:0x025a, B:72:0x025f, B:74:0x0267, B:75:0x027b, B:78:0x028b, B:80:0x0291, B:81:0x029b, B:83:0x02a3, B:84:0x02a8, B:86:0x02bb, B:88:0x02c1, B:89:0x02c4, B:91:0x02da, B:93:0x02e4, B:94:0x02e9, B:96:0x02ef, B:97:0x02fc, B:99:0x0302, B:100:0x030f, B:102:0x0315, B:105:0x0326, B:107:0x032c, B:108:0x0345, B:110:0x034b, B:111:0x0350, B:113:0x0358, B:115:0x0371, B:116:0x037b, B:118:0x0381, B:119:0x038a, B:121:0x0392, B:123:0x0399, B:124:0x03b1, B:125:0x03b6, B:127:0x03be, B:128:0x03c3, B:235:0x03ff, B:130:0x0404, B:132:0x0409, B:134:0x041f, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:143:0x0478, B:145:0x0489, B:161:0x056b, B:163:0x0589, B:165:0x0592, B:167:0x0596, B:169:0x059e, B:170:0x05a4, B:171:0x05b9, B:173:0x05cd, B:203:0x05d6, B:175:0x0602, B:177:0x0608, B:180:0x0616, B:182:0x061d, B:184:0x0627, B:185:0x0639, B:188:0x0658, B:191:0x0668, B:192:0x066a, B:194:0x06ac, B:195:0x06b9, B:197:0x070c, B:199:0x0710, B:206:0x05e7, B:209:0x0565, B:221:0x04a3, B:224:0x0473, B:227:0x045f, B:229:0x044b, B:231:0x0426, B:239:0x03eb, B:242:0x03f1, B:243:0x035e, B:245:0x0366, B:246:0x0330, B:248:0x033c, B:250:0x0342, B:251:0x0716, B:255:0x0278, B:257:0x0121, B:259:0x00ce, B:233:0x03d9), top: B:12:0x00af, inners: #2, #3, #4, #5, #6, #7, #9, #11, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0592 A[Catch: all -> 0x0722, TryCatch #1 {all -> 0x0722, blocks: (B:13:0x00af, B:15:0x00b5, B:18:0x00c2, B:19:0x00d3, B:21:0x00de, B:23:0x00fa, B:24:0x00ff, B:26:0x0107, B:27:0x010c, B:29:0x0112, B:31:0x011a, B:33:0x0126, B:35:0x01a5, B:37:0x01ab, B:39:0x01b1, B:40:0x01c8, B:42:0x01d5, B:44:0x01dc, B:45:0x01e3, B:47:0x01e9, B:48:0x01f0, B:50:0x0207, B:51:0x020c, B:54:0x0214, B:55:0x0217, B:57:0x021d, B:58:0x0220, B:60:0x0232, B:62:0x0238, B:63:0x023b, B:65:0x0243, B:66:0x024c, B:68:0x0250, B:71:0x025a, B:72:0x025f, B:74:0x0267, B:75:0x027b, B:78:0x028b, B:80:0x0291, B:81:0x029b, B:83:0x02a3, B:84:0x02a8, B:86:0x02bb, B:88:0x02c1, B:89:0x02c4, B:91:0x02da, B:93:0x02e4, B:94:0x02e9, B:96:0x02ef, B:97:0x02fc, B:99:0x0302, B:100:0x030f, B:102:0x0315, B:105:0x0326, B:107:0x032c, B:108:0x0345, B:110:0x034b, B:111:0x0350, B:113:0x0358, B:115:0x0371, B:116:0x037b, B:118:0x0381, B:119:0x038a, B:121:0x0392, B:123:0x0399, B:124:0x03b1, B:125:0x03b6, B:127:0x03be, B:128:0x03c3, B:235:0x03ff, B:130:0x0404, B:132:0x0409, B:134:0x041f, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:143:0x0478, B:145:0x0489, B:161:0x056b, B:163:0x0589, B:165:0x0592, B:167:0x0596, B:169:0x059e, B:170:0x05a4, B:171:0x05b9, B:173:0x05cd, B:203:0x05d6, B:175:0x0602, B:177:0x0608, B:180:0x0616, B:182:0x061d, B:184:0x0627, B:185:0x0639, B:188:0x0658, B:191:0x0668, B:192:0x066a, B:194:0x06ac, B:195:0x06b9, B:197:0x070c, B:199:0x0710, B:206:0x05e7, B:209:0x0565, B:221:0x04a3, B:224:0x0473, B:227:0x045f, B:229:0x044b, B:231:0x0426, B:239:0x03eb, B:242:0x03f1, B:243:0x035e, B:245:0x0366, B:246:0x0330, B:248:0x033c, B:250:0x0342, B:251:0x0716, B:255:0x0278, B:257:0x0121, B:259:0x00ce, B:233:0x03d9), top: B:12:0x00af, inners: #2, #3, #4, #5, #6, #7, #9, #11, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0608 A[Catch: all -> 0x0722, TryCatch #1 {all -> 0x0722, blocks: (B:13:0x00af, B:15:0x00b5, B:18:0x00c2, B:19:0x00d3, B:21:0x00de, B:23:0x00fa, B:24:0x00ff, B:26:0x0107, B:27:0x010c, B:29:0x0112, B:31:0x011a, B:33:0x0126, B:35:0x01a5, B:37:0x01ab, B:39:0x01b1, B:40:0x01c8, B:42:0x01d5, B:44:0x01dc, B:45:0x01e3, B:47:0x01e9, B:48:0x01f0, B:50:0x0207, B:51:0x020c, B:54:0x0214, B:55:0x0217, B:57:0x021d, B:58:0x0220, B:60:0x0232, B:62:0x0238, B:63:0x023b, B:65:0x0243, B:66:0x024c, B:68:0x0250, B:71:0x025a, B:72:0x025f, B:74:0x0267, B:75:0x027b, B:78:0x028b, B:80:0x0291, B:81:0x029b, B:83:0x02a3, B:84:0x02a8, B:86:0x02bb, B:88:0x02c1, B:89:0x02c4, B:91:0x02da, B:93:0x02e4, B:94:0x02e9, B:96:0x02ef, B:97:0x02fc, B:99:0x0302, B:100:0x030f, B:102:0x0315, B:105:0x0326, B:107:0x032c, B:108:0x0345, B:110:0x034b, B:111:0x0350, B:113:0x0358, B:115:0x0371, B:116:0x037b, B:118:0x0381, B:119:0x038a, B:121:0x0392, B:123:0x0399, B:124:0x03b1, B:125:0x03b6, B:127:0x03be, B:128:0x03c3, B:235:0x03ff, B:130:0x0404, B:132:0x0409, B:134:0x041f, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:143:0x0478, B:145:0x0489, B:161:0x056b, B:163:0x0589, B:165:0x0592, B:167:0x0596, B:169:0x059e, B:170:0x05a4, B:171:0x05b9, B:173:0x05cd, B:203:0x05d6, B:175:0x0602, B:177:0x0608, B:180:0x0616, B:182:0x061d, B:184:0x0627, B:185:0x0639, B:188:0x0658, B:191:0x0668, B:192:0x066a, B:194:0x06ac, B:195:0x06b9, B:197:0x070c, B:199:0x0710, B:206:0x05e7, B:209:0x0565, B:221:0x04a3, B:224:0x0473, B:227:0x045f, B:229:0x044b, B:231:0x0426, B:239:0x03eb, B:242:0x03f1, B:243:0x035e, B:245:0x0366, B:246:0x0330, B:248:0x033c, B:250:0x0342, B:251:0x0716, B:255:0x0278, B:257:0x0121, B:259:0x00ce, B:233:0x03d9), top: B:12:0x00af, inners: #2, #3, #4, #5, #6, #7, #9, #11, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0627 A[Catch: all -> 0x0722, TryCatch #1 {all -> 0x0722, blocks: (B:13:0x00af, B:15:0x00b5, B:18:0x00c2, B:19:0x00d3, B:21:0x00de, B:23:0x00fa, B:24:0x00ff, B:26:0x0107, B:27:0x010c, B:29:0x0112, B:31:0x011a, B:33:0x0126, B:35:0x01a5, B:37:0x01ab, B:39:0x01b1, B:40:0x01c8, B:42:0x01d5, B:44:0x01dc, B:45:0x01e3, B:47:0x01e9, B:48:0x01f0, B:50:0x0207, B:51:0x020c, B:54:0x0214, B:55:0x0217, B:57:0x021d, B:58:0x0220, B:60:0x0232, B:62:0x0238, B:63:0x023b, B:65:0x0243, B:66:0x024c, B:68:0x0250, B:71:0x025a, B:72:0x025f, B:74:0x0267, B:75:0x027b, B:78:0x028b, B:80:0x0291, B:81:0x029b, B:83:0x02a3, B:84:0x02a8, B:86:0x02bb, B:88:0x02c1, B:89:0x02c4, B:91:0x02da, B:93:0x02e4, B:94:0x02e9, B:96:0x02ef, B:97:0x02fc, B:99:0x0302, B:100:0x030f, B:102:0x0315, B:105:0x0326, B:107:0x032c, B:108:0x0345, B:110:0x034b, B:111:0x0350, B:113:0x0358, B:115:0x0371, B:116:0x037b, B:118:0x0381, B:119:0x038a, B:121:0x0392, B:123:0x0399, B:124:0x03b1, B:125:0x03b6, B:127:0x03be, B:128:0x03c3, B:235:0x03ff, B:130:0x0404, B:132:0x0409, B:134:0x041f, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:143:0x0478, B:145:0x0489, B:161:0x056b, B:163:0x0589, B:165:0x0592, B:167:0x0596, B:169:0x059e, B:170:0x05a4, B:171:0x05b9, B:173:0x05cd, B:203:0x05d6, B:175:0x0602, B:177:0x0608, B:180:0x0616, B:182:0x061d, B:184:0x0627, B:185:0x0639, B:188:0x0658, B:191:0x0668, B:192:0x066a, B:194:0x06ac, B:195:0x06b9, B:197:0x070c, B:199:0x0710, B:206:0x05e7, B:209:0x0565, B:221:0x04a3, B:224:0x0473, B:227:0x045f, B:229:0x044b, B:231:0x0426, B:239:0x03eb, B:242:0x03f1, B:243:0x035e, B:245:0x0366, B:246:0x0330, B:248:0x033c, B:250:0x0342, B:251:0x0716, B:255:0x0278, B:257:0x0121, B:259:0x00ce, B:233:0x03d9), top: B:12:0x00af, inners: #2, #3, #4, #5, #6, #7, #9, #11, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0666 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06ac A[Catch: all -> 0x0722, TryCatch #1 {all -> 0x0722, blocks: (B:13:0x00af, B:15:0x00b5, B:18:0x00c2, B:19:0x00d3, B:21:0x00de, B:23:0x00fa, B:24:0x00ff, B:26:0x0107, B:27:0x010c, B:29:0x0112, B:31:0x011a, B:33:0x0126, B:35:0x01a5, B:37:0x01ab, B:39:0x01b1, B:40:0x01c8, B:42:0x01d5, B:44:0x01dc, B:45:0x01e3, B:47:0x01e9, B:48:0x01f0, B:50:0x0207, B:51:0x020c, B:54:0x0214, B:55:0x0217, B:57:0x021d, B:58:0x0220, B:60:0x0232, B:62:0x0238, B:63:0x023b, B:65:0x0243, B:66:0x024c, B:68:0x0250, B:71:0x025a, B:72:0x025f, B:74:0x0267, B:75:0x027b, B:78:0x028b, B:80:0x0291, B:81:0x029b, B:83:0x02a3, B:84:0x02a8, B:86:0x02bb, B:88:0x02c1, B:89:0x02c4, B:91:0x02da, B:93:0x02e4, B:94:0x02e9, B:96:0x02ef, B:97:0x02fc, B:99:0x0302, B:100:0x030f, B:102:0x0315, B:105:0x0326, B:107:0x032c, B:108:0x0345, B:110:0x034b, B:111:0x0350, B:113:0x0358, B:115:0x0371, B:116:0x037b, B:118:0x0381, B:119:0x038a, B:121:0x0392, B:123:0x0399, B:124:0x03b1, B:125:0x03b6, B:127:0x03be, B:128:0x03c3, B:235:0x03ff, B:130:0x0404, B:132:0x0409, B:134:0x041f, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:143:0x0478, B:145:0x0489, B:161:0x056b, B:163:0x0589, B:165:0x0592, B:167:0x0596, B:169:0x059e, B:170:0x05a4, B:171:0x05b9, B:173:0x05cd, B:203:0x05d6, B:175:0x0602, B:177:0x0608, B:180:0x0616, B:182:0x061d, B:184:0x0627, B:185:0x0639, B:188:0x0658, B:191:0x0668, B:192:0x066a, B:194:0x06ac, B:195:0x06b9, B:197:0x070c, B:199:0x0710, B:206:0x05e7, B:209:0x0565, B:221:0x04a3, B:224:0x0473, B:227:0x045f, B:229:0x044b, B:231:0x0426, B:239:0x03eb, B:242:0x03f1, B:243:0x035e, B:245:0x0366, B:246:0x0330, B:248:0x033c, B:250:0x0342, B:251:0x0716, B:255:0x0278, B:257:0x0121, B:259:0x00ce, B:233:0x03d9), top: B:12:0x00af, inners: #2, #3, #4, #5, #6, #7, #9, #11, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x070c A[Catch: all -> 0x0722, TryCatch #1 {all -> 0x0722, blocks: (B:13:0x00af, B:15:0x00b5, B:18:0x00c2, B:19:0x00d3, B:21:0x00de, B:23:0x00fa, B:24:0x00ff, B:26:0x0107, B:27:0x010c, B:29:0x0112, B:31:0x011a, B:33:0x0126, B:35:0x01a5, B:37:0x01ab, B:39:0x01b1, B:40:0x01c8, B:42:0x01d5, B:44:0x01dc, B:45:0x01e3, B:47:0x01e9, B:48:0x01f0, B:50:0x0207, B:51:0x020c, B:54:0x0214, B:55:0x0217, B:57:0x021d, B:58:0x0220, B:60:0x0232, B:62:0x0238, B:63:0x023b, B:65:0x0243, B:66:0x024c, B:68:0x0250, B:71:0x025a, B:72:0x025f, B:74:0x0267, B:75:0x027b, B:78:0x028b, B:80:0x0291, B:81:0x029b, B:83:0x02a3, B:84:0x02a8, B:86:0x02bb, B:88:0x02c1, B:89:0x02c4, B:91:0x02da, B:93:0x02e4, B:94:0x02e9, B:96:0x02ef, B:97:0x02fc, B:99:0x0302, B:100:0x030f, B:102:0x0315, B:105:0x0326, B:107:0x032c, B:108:0x0345, B:110:0x034b, B:111:0x0350, B:113:0x0358, B:115:0x0371, B:116:0x037b, B:118:0x0381, B:119:0x038a, B:121:0x0392, B:123:0x0399, B:124:0x03b1, B:125:0x03b6, B:127:0x03be, B:128:0x03c3, B:235:0x03ff, B:130:0x0404, B:132:0x0409, B:134:0x041f, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:143:0x0478, B:145:0x0489, B:161:0x056b, B:163:0x0589, B:165:0x0592, B:167:0x0596, B:169:0x059e, B:170:0x05a4, B:171:0x05b9, B:173:0x05cd, B:203:0x05d6, B:175:0x0602, B:177:0x0608, B:180:0x0616, B:182:0x061d, B:184:0x0627, B:185:0x0639, B:188:0x0658, B:191:0x0668, B:192:0x066a, B:194:0x06ac, B:195:0x06b9, B:197:0x070c, B:199:0x0710, B:206:0x05e7, B:209:0x0565, B:221:0x04a3, B:224:0x0473, B:227:0x045f, B:229:0x044b, B:231:0x0426, B:239:0x03eb, B:242:0x03f1, B:243:0x035e, B:245:0x0366, B:246:0x0330, B:248:0x033c, B:250:0x0342, B:251:0x0716, B:255:0x0278, B:257:0x0121, B:259:0x00ce, B:233:0x03d9), top: B:12:0x00af, inners: #2, #3, #4, #5, #6, #7, #9, #11, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ff A[Catch: all -> 0x0722, TryCatch #1 {all -> 0x0722, blocks: (B:13:0x00af, B:15:0x00b5, B:18:0x00c2, B:19:0x00d3, B:21:0x00de, B:23:0x00fa, B:24:0x00ff, B:26:0x0107, B:27:0x010c, B:29:0x0112, B:31:0x011a, B:33:0x0126, B:35:0x01a5, B:37:0x01ab, B:39:0x01b1, B:40:0x01c8, B:42:0x01d5, B:44:0x01dc, B:45:0x01e3, B:47:0x01e9, B:48:0x01f0, B:50:0x0207, B:51:0x020c, B:54:0x0214, B:55:0x0217, B:57:0x021d, B:58:0x0220, B:60:0x0232, B:62:0x0238, B:63:0x023b, B:65:0x0243, B:66:0x024c, B:68:0x0250, B:71:0x025a, B:72:0x025f, B:74:0x0267, B:75:0x027b, B:78:0x028b, B:80:0x0291, B:81:0x029b, B:83:0x02a3, B:84:0x02a8, B:86:0x02bb, B:88:0x02c1, B:89:0x02c4, B:91:0x02da, B:93:0x02e4, B:94:0x02e9, B:96:0x02ef, B:97:0x02fc, B:99:0x0302, B:100:0x030f, B:102:0x0315, B:105:0x0326, B:107:0x032c, B:108:0x0345, B:110:0x034b, B:111:0x0350, B:113:0x0358, B:115:0x0371, B:116:0x037b, B:118:0x0381, B:119:0x038a, B:121:0x0392, B:123:0x0399, B:124:0x03b1, B:125:0x03b6, B:127:0x03be, B:128:0x03c3, B:235:0x03ff, B:130:0x0404, B:132:0x0409, B:134:0x041f, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:143:0x0478, B:145:0x0489, B:161:0x056b, B:163:0x0589, B:165:0x0592, B:167:0x0596, B:169:0x059e, B:170:0x05a4, B:171:0x05b9, B:173:0x05cd, B:203:0x05d6, B:175:0x0602, B:177:0x0608, B:180:0x0616, B:182:0x061d, B:184:0x0627, B:185:0x0639, B:188:0x0658, B:191:0x0668, B:192:0x066a, B:194:0x06ac, B:195:0x06b9, B:197:0x070c, B:199:0x0710, B:206:0x05e7, B:209:0x0565, B:221:0x04a3, B:224:0x0473, B:227:0x045f, B:229:0x044b, B:231:0x0426, B:239:0x03eb, B:242:0x03f1, B:243:0x035e, B:245:0x0366, B:246:0x0330, B:248:0x033c, B:250:0x0342, B:251:0x0716, B:255:0x0278, B:257:0x0121, B:259:0x00ce, B:233:0x03d9), top: B:12:0x00af, inners: #2, #3, #4, #5, #6, #7, #9, #11, #13 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Map<String, Object> values(AFa1qSDK aFa1qSDK) {
        String str;
        String str2;
        String str3;
        boolean z;
        AFc1uSDK.AFa1wSDK values2;
        AFa1bSDK aFa1bSDK;
        String[] strArr;
        PackageInfo packageInfo;
        String AFInAppEventParameterName2;
        Context context = AFInAppEventParameterName().onAppOpenAttributionNative().AFInAppEventParameterName;
        String str4 = AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType;
        String str5 = aFa1qSDK.afDebugLog;
        String jSONObject = new JSONObject(aFa1qSDK.AFKeystoreWrapper == null ? new HashMap() : aFa1qSDK.AFKeystoreWrapper).toString();
        String str6 = aFa1qSDK.AFLogger;
        AFb1fSDK valueOf2 = valueOf(context);
        boolean values3 = aFa1qSDK.values();
        Map<String, ? extends Object> map = aFa1qSDK.AFInAppEventParameterName;
        AFa1bSDK.valueOf(context, map);
        Boolean bool = AFa1bSDK.valueOf;
        if (bool == null || bool.booleanValue()) {
            str = "yyyy-MM-dd_HHmmssZ";
        } else {
            str = "yyyy-MM-dd_HHmmssZ";
            AFInAppEventParameterName(map).put("ad_ids_disabled", Boolean.TRUE);
        }
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        AFInAppEventParameterName("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", false, new int[]{0, 12, 181, 5}, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        String valueOf3 = AFb1eSDK.valueOf(context, time);
        if (valueOf3 != null) {
            map.put("cksm_v1", valueOf3);
        }
        try {
            if (isStopped()) {
                AFLogger.afInfoLog("Reporting has been stopped");
            } else {
                AFLogger.afInfoLog(new StringBuilder("******* sendTrackingWithEvent: ").append(values3 ? "Launch" : str5).toString());
            }
            AFInAppEventParameterName().AppsFlyer2dXConversionCallback().AFInAppEventParameterName();
            try {
                List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                if (!asList.contains("android.permission.INTERNET")) {
                    AFLogger.afWarnLog("Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
                if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                    AFLogger.afWarnLog("Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                }
                if (Build.VERSION.SDK_INT > 32 && !asList.contains("com.google.android.gms.permission.AD_ID")) {
                    AFLogger.afWarnLog("Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("Exception while validation permissions. ", e);
            }
            AFe1tSDK afRDLog2 = AFInAppEventParameterName().afRDLog();
            Object[] objArr2 = new Object[1];
            AFInAppEventParameterName("\u0001", true, new int[]{12, 1, 0, 1}, objArr2);
            map.put("af_events_api", ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            AFInAppEventParameterName("\u0000\u0000\u0000\u0000\u0001", false, new int[]{13, 5, 164, 2}, objArr3);
            map.put(((String) objArr3[0]).intern(), Build.BRAND);
            map.put("device", Build.DEVICE);
            map.put("product", Build.PRODUCT);
            map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
            map.put("model", Build.MODEL);
            map.put("deviceType", Build.TYPE);
            afRDLog2.AFKeystoreWrapper(map);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            AFe1lSDK AFLogger = AFInAppEventParameterName().AFLogger();
            if (values3) {
                if (afRDLog2.afErrorLog()) {
                    if (!appsFlyerProperties.isOtherSdkStringDisabled()) {
                        map.put("batteryLevel", String.valueOf(AFInAppEventParameterName().onConversionDataSuccess().AFInAppEventParameterName(context).AFKeystoreWrapper));
                    }
                    afDebugLog(context);
                    UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
                    if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                        map.put("tv", Boolean.TRUE);
                    }
                    if (AFe1mSDK.AFInAppEventParameterName(context)) {
                        map.put("inst_app", Boolean.TRUE);
                    }
                }
                map.put("timepassedsincelastlaunch", Long.toString(afErrorLog(context)));
                afRDLog2.AFInAppEventType(map);
                afRDLog2.values(map);
                String str7 = this.onResponseNative;
                if (str7 != null) {
                    map.put("phone", str7);
                }
                if (!TextUtils.isEmpty(str6)) {
                    map.put("referrer", str6);
                }
                String valueOf4 = valueOf2.valueOf("extraReferrers", (String) null);
                if (valueOf4 != null) {
                    map.put("extraReferrers", valueOf4);
                }
                String referrer = appsFlyerProperties.getReferrer(AFInAppEventParameterName().AFKeystoreWrapper());
                if (!TextUtils.isEmpty(referrer) && map.get("referrer") == null) {
                    map.put("referrer", referrer);
                }
                long j = AFLogger.afErrorLogForExcManagerOnly;
                if (j != 0) {
                    map.put("prev_session_dur", Long.valueOf(j));
                }
                AFb1hSDK aFb1hSDK = this.onResponseErrorNative;
                if (aFb1hSDK != null) {
                    if (!aFb1hSDK.AFInAppEventParameterName.isEmpty()) {
                        map.put("partner_data", aFb1hSDK.AFInAppEventParameterName);
                    }
                    if (!aFb1hSDK.AFInAppEventType.isEmpty()) {
                        AFInAppEventParameterName(map).put("partner_data", aFb1hSDK.AFInAppEventType);
                        aFb1hSDK.AFInAppEventType = new HashMap();
                    }
                }
            } else {
                afRDLog2.AFKeystoreWrapper(map, str5);
            }
            String valueOf5 = valueOf("KSAppsFlyerId");
            String valueOf6 = valueOf("KSAppsFlyerRICounter");
            if (valueOf5 != null && valueOf6 != null && Integer.parseInt(valueOf6) > 0) {
                map.put("reinstallCounter", valueOf6);
                map.put("originalAppsflyerId", valueOf5);
            }
            String valueOf7 = valueOf(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
            if (valueOf7 != null) {
                map.put("customData", valueOf7);
            }
            map.putAll(this.onAppOpenAttribution.afErrorLog().AFInAppEventType());
            String string = appsFlyerProperties.getString(AppsFlyerProperties.EXTENSION);
            if (string != null && string.length() > 0) {
                map.put(AppsFlyerProperties.EXTENSION, string);
            }
            String AFKeystoreWrapper2 = AFInAppEventParameterName().AFInAppEventParameterName().AFKeystoreWrapper();
            String values4 = values(valueOf(context), AFKeystoreWrapper2);
            if ((values4 != null && !values4.equals(AFKeystoreWrapper2)) || (values4 == null && AFKeystoreWrapper2 != null)) {
                map.put("af_latestchannel", AFKeystoreWrapper2);
            }
            String AFInAppEventParameterName3 = afRDLog2.AFInAppEventParameterName();
            if (AFInAppEventParameterName3 != null) {
                map.put("af_installstore", AFInAppEventParameterName3.toLowerCase(Locale.getDefault()));
            }
            String afDebugLog = afRDLog2.afDebugLog();
            if (afDebugLog != null) {
                map.put("af_preinstall_name", afDebugLog.toLowerCase(Locale.getDefault()));
            }
            String AFInAppEventType = afRDLog2.AFInAppEventType();
            if (AFInAppEventType != null) {
                map.put("af_currentstore", AFInAppEventType.toLowerCase(Locale.getDefault()));
            }
            if (str4 != null && str4.length() > 0) {
                map.put("appsflyerKey", str4);
            } else {
                String str8 = AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType;
                if (str8 != null && str8.length() > 0) {
                    map.put("appsflyerKey", str8);
                } else {
                    AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
                    AFLogger.afInfoLog("AppsFlyer will not track this event.");
                    return null;
                }
            }
            String values5 = values();
            if (values5 != null) {
                map.put("appUserId", values5);
            }
            String string2 = appsFlyerProperties.getString(AppsFlyerProperties.USER_EMAILS);
            if (string2 != null) {
                map.put("user_emails", string2);
            } else {
                String valueOf8 = valueOf(AppsFlyerProperties.USER_EMAIL);
                if (valueOf8 != null) {
                    map.put("sha1_el", AFb1zSDK.values(valueOf8));
                }
            }
            if (str5 != null) {
                map.put("eventName", str5);
                map.put("eventValue", jSONObject);
            }
            if (AFLogger() != null) {
                map.put(AppsFlyerProperties.APP_ID, valueOf(AppsFlyerProperties.APP_ID));
            }
            String valueOf9 = valueOf(AppsFlyerProperties.CURRENCY_CODE);
            if (valueOf9 != null) {
                if (valueOf9.length() != 3) {
                    AFLogger.afWarnLog(new StringBuilder("WARNING: currency code should be 3 characters!!! '").append(valueOf9).append("' is not a legal value.").toString());
                }
                map.put(FirebaseAnalytics.Param.CURRENCY, valueOf9);
            }
            String valueOf10 = valueOf(AppsFlyerProperties.IS_UPDATE);
            if (valueOf10 != null) {
                map.put("isUpdate", valueOf10);
            }
            map.put("af_preinstalled", Boolean.toString(isPreInstalledApp(context)));
            if (appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                try {
                    try {
                        context.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                        str2 = getAttributionId(context);
                    } catch (Throwable th) {
                        AFLogger.afErrorLog("Exception while collecting facebook's attribution ID. ", th);
                        str2 = null;
                        if (str2 != null) {
                        }
                        afRDLog2.AFInAppEventType(map, this.afInfoLog);
                        AFInAppEventParameterName2 = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper());
                        if (AFInAppEventParameterName2 != null) {
                        }
                        map.put("lang", Locale.getDefault().getDisplayLanguage());
                        map.put("lang_code", Locale.getDefault().getLanguage());
                        map.put("country", Locale.getDefault().getCountry());
                        afRDLog2.values(map, values3);
                        afRDLog2.valueOf(map);
                        String str9 = str;
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str9, Locale.US);
                        map.put("installDate", values(simpleDateFormat, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
                        z = false;
                        packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                        if (packageInfo.versionCode > valueOf2.AFInAppEventType("versionCode", 0)) {
                        }
                        AFb1cSDK AFInAppEventParameterName4 = AFInAppEventParameterName().AFInAppEventParameterName();
                        map.put("app_version_code", Integer.toString(packageInfo.versionCode));
                        map.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(AFInAppEventParameterName4.values.AFInAppEventParameterName, AFInAppEventParameterName4.values.AFInAppEventParameterName.getPackageName()));
                        map.put("targetSDKver", Integer.valueOf(AFInAppEventParameterName4.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                        long j2 = packageInfo.firstInstallTime;
                        long j3 = packageInfo.lastUpdateTime;
                        str3 = str5;
                        try {
                            map.put("date1", new SimpleDateFormat(str9, Locale.US).format(new Date(j2)));
                            map.put("date2", new SimpleDateFormat(str9, Locale.US).format(new Date(j3)));
                            String AFInAppEventParameterName5 = afRDLog2.AFInAppEventParameterName(simpleDateFormat);
                            Object[] objArr4 = new Object[1];
                            z = false;
                            try {
                                AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr4);
                                map.put(((String) objArr4[0]).intern(), AFInAppEventParameterName5);
                            } catch (Throwable th2) {
                                th = th2;
                                AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
                                this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                                AFLogger.afDebugLog(new StringBuilder("didConfigureTokenRefreshService=").append(this.onInstallConversionDataLoadedNative).toString());
                                if (!this.onInstallConversionDataLoadedNative) {
                                }
                                if (values3) {
                                }
                                if (!values3) {
                                }
                                if (valueOf("advertiserId") == null) {
                                }
                                values2 = AFa1bSDK.values(context.getContentResolver());
                                if (values2 != null) {
                                }
                                map.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(valueOf2)));
                                int AFInAppEventType2 = AFInAppEventType(valueOf2, values3);
                                map.put("counter", Integer.toString(AFInAppEventType2));
                                if (str3 != null) {
                                }
                                map.put("iaecounter", Integer.toString(values(valueOf2, z)));
                                if (values3) {
                                }
                                map.put("isFirstCall", Boolean.toString(!afRDLog2.AFLogger()));
                                afRDLog2.AFInAppEventParameterName(values3, map, AFInAppEventType2);
                                new AFb1zSDK();
                                map.put("af_v", AFb1zSDK.values(map));
                                new AFb1zSDK();
                                map.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map));
                                map.put("ivc", Boolean.valueOf(afRDLog2.afInfoLog()));
                                if (valueOf2.valueOf("is_stop_tracking_used")) {
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                                hashMap.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                                map.put("cell", hashMap);
                                map.put("sig", afRDLog2.valueOf());
                                map.put("last_boot_time", Long.valueOf(afRDLog2.AFKeystoreWrapper()));
                                map.put("disk", afRDLog2.values());
                                aFa1bSDK = this.afDebugLog;
                                if (aFa1bSDK != null) {
                                }
                                return map;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z = false;
                            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
                            this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                            AFLogger.afDebugLog(new StringBuilder("didConfigureTokenRefreshService=").append(this.onInstallConversionDataLoadedNative).toString());
                            if (!this.onInstallConversionDataLoadedNative) {
                            }
                            if (values3) {
                            }
                            if (!values3) {
                            }
                            if (valueOf("advertiserId") == null) {
                            }
                            values2 = AFa1bSDK.values(context.getContentResolver());
                            if (values2 != null) {
                            }
                            map.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(valueOf2)));
                            int AFInAppEventType22 = AFInAppEventType(valueOf2, values3);
                            map.put("counter", Integer.toString(AFInAppEventType22));
                            if (str3 != null) {
                            }
                            map.put("iaecounter", Integer.toString(values(valueOf2, z)));
                            if (values3) {
                            }
                            map.put("isFirstCall", Boolean.toString(!afRDLog2.AFLogger()));
                            afRDLog2.AFInAppEventParameterName(values3, map, AFInAppEventType22);
                            new AFb1zSDK();
                            map.put("af_v", AFb1zSDK.values(map));
                            new AFb1zSDK();
                            map.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map));
                            map.put("ivc", Boolean.valueOf(afRDLog2.afInfoLog()));
                            if (valueOf2.valueOf("is_stop_tracking_used")) {
                            }
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                            hashMap2.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                            map.put("cell", hashMap2);
                            map.put("sig", afRDLog2.valueOf());
                            map.put("last_boot_time", Long.valueOf(afRDLog2.AFKeystoreWrapper()));
                            map.put("disk", afRDLog2.values());
                            aFa1bSDK = this.afDebugLog;
                            if (aFa1bSDK != null) {
                            }
                            return map;
                        }
                        this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                        AFLogger.afDebugLog(new StringBuilder("didConfigureTokenRefreshService=").append(this.onInstallConversionDataLoadedNative).toString());
                        if (!this.onInstallConversionDataLoadedNative) {
                        }
                        if (values3) {
                        }
                        if (!values3) {
                        }
                        if (valueOf("advertiserId") == null) {
                        }
                        values2 = AFa1bSDK.values(context.getContentResolver());
                        if (values2 != null) {
                        }
                        map.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(valueOf2)));
                        int AFInAppEventType222 = AFInAppEventType(valueOf2, values3);
                        map.put("counter", Integer.toString(AFInAppEventType222));
                        if (str3 != null) {
                        }
                        map.put("iaecounter", Integer.toString(values(valueOf2, z)));
                        if (values3) {
                            appsFlyerProperties.valueOf = true;
                        }
                        map.put("isFirstCall", Boolean.toString(!afRDLog2.AFLogger()));
                        afRDLog2.AFInAppEventParameterName(values3, map, AFInAppEventType222);
                        new AFb1zSDK();
                        map.put("af_v", AFb1zSDK.values(map));
                        new AFb1zSDK();
                        map.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map));
                        map.put("ivc", Boolean.valueOf(afRDLog2.afInfoLog()));
                        if (valueOf2.valueOf("is_stop_tracking_used")) {
                        }
                        HashMap hashMap22 = new HashMap();
                        hashMap22.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                        hashMap22.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                        map.put("cell", hashMap22);
                        map.put("sig", afRDLog2.valueOf());
                        map.put("last_boot_time", Long.valueOf(afRDLog2.AFKeystoreWrapper()));
                        map.put("disk", afRDLog2.values());
                        aFa1bSDK = this.afDebugLog;
                        if (aFa1bSDK != null) {
                            map.put("sharing_filter", strArr);
                        }
                        return map;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("com.facebook.katana not found", e2, true);
                    AFLogger.afWarnLog("Exception while collecting facebook's attribution ID. ");
                    str2 = null;
                    if (str2 != null) {
                    }
                    afRDLog2.AFInAppEventType(map, this.afInfoLog);
                    AFInAppEventParameterName2 = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper());
                    if (AFInAppEventParameterName2 != null) {
                    }
                    map.put("lang", Locale.getDefault().getDisplayLanguage());
                    map.put("lang_code", Locale.getDefault().getLanguage());
                    map.put("country", Locale.getDefault().getCountry());
                    afRDLog2.values(map, values3);
                    afRDLog2.valueOf(map);
                    String str92 = str;
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str92, Locale.US);
                    map.put("installDate", values(simpleDateFormat2, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
                    z = false;
                    packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    if (packageInfo.versionCode > valueOf2.AFInAppEventType("versionCode", 0)) {
                    }
                    AFb1cSDK AFInAppEventParameterName42 = AFInAppEventParameterName().AFInAppEventParameterName();
                    map.put("app_version_code", Integer.toString(packageInfo.versionCode));
                    map.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(AFInAppEventParameterName42.values.AFInAppEventParameterName, AFInAppEventParameterName42.values.AFInAppEventParameterName.getPackageName()));
                    map.put("targetSDKver", Integer.valueOf(AFInAppEventParameterName42.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                    long j22 = packageInfo.firstInstallTime;
                    long j32 = packageInfo.lastUpdateTime;
                    str3 = str5;
                    map.put("date1", new SimpleDateFormat(str92, Locale.US).format(new Date(j22)));
                    map.put("date2", new SimpleDateFormat(str92, Locale.US).format(new Date(j32)));
                    String AFInAppEventParameterName52 = afRDLog2.AFInAppEventParameterName(simpleDateFormat2);
                    Object[] objArr42 = new Object[1];
                    z = false;
                    AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr42);
                    map.put(((String) objArr42[0]).intern(), AFInAppEventParameterName52);
                    this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                    AFLogger.afDebugLog(new StringBuilder("didConfigureTokenRefreshService=").append(this.onInstallConversionDataLoadedNative).toString());
                    if (!this.onInstallConversionDataLoadedNative) {
                    }
                    if (values3) {
                    }
                    if (!values3) {
                    }
                    if (valueOf("advertiserId") == null) {
                    }
                    values2 = AFa1bSDK.values(context.getContentResolver());
                    if (values2 != null) {
                    }
                    map.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(valueOf2)));
                    int AFInAppEventType2222 = AFInAppEventType(valueOf2, values3);
                    map.put("counter", Integer.toString(AFInAppEventType2222));
                    if (str3 != null) {
                    }
                    map.put("iaecounter", Integer.toString(values(valueOf2, z)));
                    if (values3) {
                    }
                    map.put("isFirstCall", Boolean.toString(!afRDLog2.AFLogger()));
                    afRDLog2.AFInAppEventParameterName(values3, map, AFInAppEventType2222);
                    new AFb1zSDK();
                    map.put("af_v", AFb1zSDK.values(map));
                    new AFb1zSDK();
                    map.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map));
                    map.put("ivc", Boolean.valueOf(afRDLog2.afInfoLog()));
                    if (valueOf2.valueOf("is_stop_tracking_used")) {
                    }
                    HashMap hashMap222 = new HashMap();
                    hashMap222.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                    hashMap222.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                    map.put("cell", hashMap222);
                    map.put("sig", afRDLog2.valueOf());
                    map.put("last_boot_time", Long.valueOf(afRDLog2.AFKeystoreWrapper()));
                    map.put("disk", afRDLog2.values());
                    aFa1bSDK = this.afDebugLog;
                    if (aFa1bSDK != null) {
                    }
                    return map;
                }
                if (str2 != null) {
                    map.put("fb", str2);
                }
            }
            afRDLog2.AFInAppEventType(map, this.afInfoLog);
            try {
                AFInAppEventParameterName2 = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper());
                if (AFInAppEventParameterName2 != null) {
                    map.put("uid", AFInAppEventParameterName2);
                }
            } catch (Exception e3) {
                AFLogger.afErrorLog(new StringBuilder("ERROR: could not get uid ").append(e3.getMessage()).toString(), e3);
            }
            try {
                map.put("lang", Locale.getDefault().getDisplayLanguage());
            } catch (Exception e4) {
                AFLogger.afErrorLog("Exception while collecting display language name. ", e4);
            }
            try {
                map.put("lang_code", Locale.getDefault().getLanguage());
            } catch (Exception e5) {
                AFLogger.afErrorLog("Exception while collecting display language code. ", e5);
            }
            try {
                map.put("country", Locale.getDefault().getCountry());
            } catch (Exception e6) {
                AFLogger.afErrorLog("Exception while collecting country name. ", e6);
            }
            afRDLog2.values(map, values3);
            afRDLog2.valueOf(map);
            String str922 = str;
            SimpleDateFormat simpleDateFormat22 = new SimpleDateFormat(str922, Locale.US);
            try {
                map.put("installDate", values(simpleDateFormat22, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
            } catch (Exception e7) {
                AFLogger.afErrorLog("Exception while collecting install date. ", e7);
            }
            try {
                z = false;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    if (packageInfo.versionCode > valueOf2.AFInAppEventType("versionCode", 0)) {
                        valueOf(context).valueOf("versionCode", packageInfo.versionCode);
                    }
                    AFb1cSDK AFInAppEventParameterName422 = AFInAppEventParameterName().AFInAppEventParameterName();
                    map.put("app_version_code", Integer.toString(packageInfo.versionCode));
                    map.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(AFInAppEventParameterName422.values.AFInAppEventParameterName, AFInAppEventParameterName422.values.AFInAppEventParameterName.getPackageName()));
                    map.put("targetSDKver", Integer.valueOf(AFInAppEventParameterName422.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                    long j222 = packageInfo.firstInstallTime;
                    long j322 = packageInfo.lastUpdateTime;
                    str3 = str5;
                    map.put("date1", new SimpleDateFormat(str922, Locale.US).format(new Date(j222)));
                    map.put("date2", new SimpleDateFormat(str922, Locale.US).format(new Date(j322)));
                    String AFInAppEventParameterName522 = afRDLog2.AFInAppEventParameterName(simpleDateFormat22);
                    Object[] objArr422 = new Object[1];
                    z = false;
                    AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr422);
                    map.put(((String) objArr422[0]).intern(), AFInAppEventParameterName522);
                } catch (Throwable th4) {
                    th = th4;
                    str3 = str5;
                }
            } catch (Throwable th5) {
                th = th5;
                str3 = str5;
            }
            this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
            AFLogger.afDebugLog(new StringBuilder("didConfigureTokenRefreshService=").append(this.onInstallConversionDataLoadedNative).toString());
            if (!this.onInstallConversionDataLoadedNative) {
                map.put("tokenRefreshConfigured", Boolean.FALSE);
            }
            if (values3) {
                if (this.AFLogger$LogLevel != null) {
                    if (map.get("af_deeplink") != null) {
                        AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                    } else {
                        JSONObject jSONObject2 = new JSONObject(this.AFLogger$LogLevel);
                        jSONObject2.put("isPush", "true");
                        map.put("af_deeplink", jSONObject2.toString());
                    }
                }
                this.AFLogger$LogLevel = null;
                map.put("open_referrer", aFa1qSDK.values);
                if (!AFb1vSDK.valueOf(aFa1qSDK.afRDLog)) {
                    map.put("af_web_referrer", aFa1qSDK.afRDLog);
                }
            }
            if (!values3) {
                try {
                    map.putAll(AFInAppEventParameterName().afWarnLog().valueOf());
                } catch (Exception e8) {
                    AFLogger.afErrorLogForExcManagerOnly("error while getting sensors data", e8);
                    AFLogger.afRDLog(new StringBuilder("Unexpected exception from AFSensorManager: ").append(e8.getMessage()).toString());
                }
            }
            if (valueOf("advertiserId") == null) {
                AFa1bSDK.valueOf(context, map);
                map.put("GAID_retry", String.valueOf(valueOf("advertiserId") != null ? true : z));
            }
            values2 = AFa1bSDK.values(context.getContentResolver());
            if (values2 != null) {
                map.put("amazon_aid", values2.AFInAppEventParameterName);
                map.put("amazon_aid_limit", String.valueOf(values2.AFInAppEventType));
            }
            map.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(valueOf2)));
            int AFInAppEventType22222 = AFInAppEventType(valueOf2, values3);
            map.put("counter", Integer.toString(AFInAppEventType22222));
            if (str3 != null) {
                z = true;
            }
            map.put("iaecounter", Integer.toString(values(valueOf2, z)));
            if (values3 && AFInAppEventType22222 == 1) {
                appsFlyerProperties.valueOf = true;
            }
            map.put("isFirstCall", Boolean.toString(!afRDLog2.AFLogger()));
            afRDLog2.AFInAppEventParameterName(values3, map, AFInAppEventType22222);
            new AFb1zSDK();
            map.put("af_v", AFb1zSDK.values(map));
            new AFb1zSDK();
            map.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map));
            map.put("ivc", Boolean.valueOf(afRDLog2.afInfoLog()));
            if (valueOf2.valueOf("is_stop_tracking_used")) {
                map.put("istu", String.valueOf(valueOf2.AFKeystoreWrapper("is_stop_tracking_used")));
            }
            HashMap hashMap2222 = new HashMap();
            hashMap2222.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
            hashMap2222.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
            map.put("cell", hashMap2222);
            map.put("sig", afRDLog2.valueOf());
            map.put("last_boot_time", Long.valueOf(afRDLog2.AFKeystoreWrapper()));
            map.put("disk", afRDLog2.values());
            aFa1bSDK = this.afDebugLog;
            if (aFa1bSDK != null && (strArr = aFa1bSDK.AFInAppEventType) != null) {
                map.put("sharing_filter", strArr);
            }
        } catch (Throwable th6) {
            AFLogger.afErrorLog(th6.getLocalizedMessage(), th6, true);
        }
        return map;
    }

    public static Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 65;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        if (!map.containsKey("meta")) {
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            return hashMap;
        }
        int i4 = onAttributionFailure + 63;
        onConversionDataFail = i4 % 128;
        int i5 = i4 % 2;
        return (Map) map.get("meta");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String valueOf(Activity activity) {
        int i;
        int i2 = 2 % 2;
        int i3 = onAttributionFailure + 13;
        int i4 = i3 % 128;
        onConversionDataFail = i4;
        int i5 = i3 % 2;
        String str = null;
        if (activity != null) {
            int i6 = i4 + 83;
            onAttributionFailure = i6 % 128;
            int i7 = i6 % 2;
            Intent intent = activity.getIntent();
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        int i8 = onConversionDataFail + 63;
                        onAttributionFailure = i8 % 128;
                        if (i8 % 2 != 0) {
                            String string = extras.getString("af");
                            try {
                                throw null;
                            } catch (Throwable th) {
                                str = string;
                                th = th;
                                AFLogger.afErrorLog(th.getMessage(), th);
                                i = onAttributionFailure + 53;
                                onConversionDataFail = i % 128;
                                if (i % 2 == 0) {
                                }
                                return str;
                            }
                        }
                        str = extras.getString("af");
                        if (str != null) {
                            int i9 = onAttributionFailure + 11;
                            onConversionDataFail = i9 % 128;
                            int i10 = i9 % 2;
                            AFLogger.afInfoLog("Push Notification received af payload = ".concat(String.valueOf(str)));
                            extras.remove("af");
                            activity.setIntent(intent.putExtras(extras));
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        i = onAttributionFailure + 53;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            int i11 = 61 / 0;
        }
        return str;
    }

    private int AFInAppEventParameterName(AFb1fSDK aFb1fSDK) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 27;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        return valueOf(aFb1fSDK, "appsFlyerAdRevenueCount", true);
    }

    private int AFKeystoreWrapper(AFb1fSDK aFb1fSDK) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 15;
        onConversionDataFail = i2 % 128;
        return valueOf(aFb1fSDK, "appsFlyerAdImpressionCount", i2 % 2 != 0);
    }

    public final void values(Context context, Map<String, Object> map, Uri uri) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 45;
        onAttributionFailure = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            AFInAppEventType(context);
            map.containsKey("af_deeplink");
            throw null;
        }
        AFInAppEventType(context);
        if (!map.containsKey("af_deeplink")) {
            String AFKeystoreWrapper2 = AFKeystoreWrapper(uri.toString());
            AFb1uSDK init = AFInAppEventParameterName().init();
            if (init.values != null) {
                int i3 = onConversionDataFail + 29;
                onAttributionFailure = i3 % 128;
                int i4 = i3 % 2;
                if (init.AFInAppEventParameterName != null) {
                    int i5 = onAttributionFailure + 63;
                    onConversionDataFail = i5 % 128;
                    if (i5 % 2 == 0) {
                        AFKeystoreWrapper2.contains(init.values);
                        super.hashCode();
                        throw null;
                    }
                    if (!(!AFKeystoreWrapper2.contains(init.values))) {
                        Uri.Builder buildUpon = Uri.parse(AFKeystoreWrapper2).buildUpon();
                        Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                        for (Map.Entry<String, String> entry : init.AFInAppEventParameterName.entrySet()) {
                            int i6 = onAttributionFailure + 31;
                            onConversionDataFail = i6 % 128;
                            int i7 = i6 % 2;
                            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                            buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                        }
                        AFKeystoreWrapper2 = buildUpon.build().toString();
                        map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
                    }
                }
            }
            map.put("af_deeplink", AFKeystoreWrapper2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        AFd1iSDK aFd1iSDK = new AFd1iSDK(AFInAppEventParameterName(), UUID.randomUUID(), uri);
        if (aFd1iSDK.getLevel()) {
            map.put("isBrandedDomain", Boolean.TRUE);
        }
        AFa1cSDK.values(context, hashMap, uri);
        if (!aFd1iSDK.AFLogger$LogLevel()) {
            AFInAppEventParameterName().init().AFInAppEventParameterName(hashMap);
            return;
        }
        aFd1iSDK.afInfoLog = values(hashMap);
        AFd1tSDK level = AFInAppEventParameterName().getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1iSDK));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r10.contains("access_token") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r1 = values(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r1.length() != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r2 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r1.contains("&") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r2 = new java.util.ArrayList(java.util.Arrays.asList(r1.split("&")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        r6 = new java.lang.StringBuilder();
        r7 = r2.iterator();
        r2 = com.appsflyer.internal.AFa1dSDK.onAttributionFailure + 17;
        com.appsflyer.internal.AFa1dSDK.onConversionDataFail = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (r7.hasNext() == true) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        r2 = com.appsflyer.internal.AFa1dSDK.onAttributionFailure + 109;
        com.appsflyer.internal.AFa1dSDK.onConversionDataFail = r2 % 128;
        r2 = r2 % 2;
        r2 = (java.lang.String) r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        if (r2.contains("access_token") == true) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        r2 = com.appsflyer.internal.AFa1dSDK.onConversionDataFail + 111;
        com.appsflyer.internal.AFa1dSDK.onAttributionFailure = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
    
        if ((r2 % 2) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ce, code lost:
    
        r7.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        r7.remove();
        r2 = 89 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (r6.length() == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        r6.append("&");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
    
        r6.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (r2.startsWith("?") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        r6.append("?");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        return r10.replace(r1, r6.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0069, code lost:
    
        r2.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0038, code lost:
    
        if (r10.contains("access_token") != true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFKeystoreWrapper(String str) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 111;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str == null) {
            return null;
        }
        if (str.matches("fb\\d*?://authorize.*")) {
            int i3 = onAttributionFailure + 7;
            onConversionDataFail = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 25 / 0;
            }
        }
        int i5 = onAttributionFailure + 1;
        onConversionDataFail = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static String values(String str) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 105;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        int indexOf = str.indexOf(63);
        if (indexOf != -1) {
            return str.substring(indexOf);
        }
        int i4 = onConversionDataFail;
        int i5 = i4 + 95;
        onAttributionFailure = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        int i7 = i4 + 97;
        onAttributionFailure = i7 % 128;
        int i8 = i7 % 2;
        return "";
    }

    private AFd1iSDK.AFa1xSDK values(final Map<String, String> map) {
        int i = 2 % 2;
        AFd1iSDK.AFa1xSDK aFa1xSDK = new AFd1iSDK.AFa1xSDK() { // from class: com.appsflyer.internal.AFa1dSDK.3
            @Override // com.appsflyer.internal.AFd1iSDK.AFa1xSDK
            public final void AFKeystoreWrapper(String str) {
                AFa1dSDK.this.AFInAppEventParameterName().init().AFInAppEventType(str, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFd1iSDK.AFa1xSDK
            public final void AFKeystoreWrapper(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFa1dSDK.this.AFInAppEventParameterName().init().AFInAppEventParameterName(map);
            }
        };
        int i2 = onAttributionFailure + 89;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
        return aFa1xSDK;
    }

    public static boolean AFKeystoreWrapper(Context context) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 71;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        try {
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
            return true;
        }
        int i4 = onConversionDataFail + 25;
        onAttributionFailure = i4 % 128;
        int i5 = i4 % 2;
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        AFInAppEventType(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        return AFInAppEventParameterName().AFInAppEventParameterName().valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 5;
        com.appsflyer.internal.AFa1dSDK.onAttributionFailure = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String AFKeystoreWrapper(Context context, String str) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 83;
        int i3 = i2 % 128;
        onConversionDataFail = i3;
        if (i2 % 2 == 0) {
            int i4 = 74 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        int i = 2 % 2;
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if (str != null) {
                int i2 = onConversionDataFail + 37;
                onAttributionFailure = i2 % 128;
                if (i2 % 2 != 0) {
                    jSONObject.put("pid", str);
                    int i3 = 49 / 0;
                } else {
                    jSONObject.put("pid", str);
                }
            }
            if (str2 != null) {
                int i4 = onAttributionFailure + 1;
                onConversionDataFail = i4 % 128;
                if (i4 % 2 == 0) {
                    jSONObject.put("c", str2);
                    int i5 = 65 / 0;
                } else {
                    jSONObject.put("c", str2);
                }
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        } catch (JSONException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (jSONObject.has("pid")) {
            int i6 = onConversionDataFail + 95;
            onAttributionFailure = i6 % 128;
            if (i6 % 2 == 0) {
                AFKeystoreWrapper("preInstallName", jSONObject.toString());
                return;
            } else {
                AFKeystoreWrapper("preInstallName", jSONObject.toString());
                throw null;
            }
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
    }

    private static void AFInAppEventParameterName(String str) {
        int i = 2 % 2;
        try {
            if (new JSONObject(str).has("pid")) {
                int i2 = onAttributionFailure + 121;
                onConversionDataFail = i2 % 128;
                int i3 = i2 % 2;
                AFKeystoreWrapper("preInstallName", str);
                return;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            int i4 = onConversionDataFail + 39;
            onAttributionFailure = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if ((r4.getPackageManager().getApplicationInfo(r4.getPackageName(), 0).flags & 1) != 0) goto L10;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isPreInstalledApp(Context context) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 37;
        onConversionDataFail = i2 % 128;
        try {
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
        if (i2 % 2 == 0) {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags | 1) != 0) {
                return true;
            }
            int i3 = onConversionDataFail + 121;
            onAttributionFailure = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
    }

    public static String values(AFb1fSDK aFb1fSDK, String str) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 45;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        String valueOf2 = aFb1fSDK.valueOf("CACHED_CHANNEL", (String) null);
        if (valueOf2 == null) {
            aFb1fSDK.values("CACHED_CHANNEL", str);
            return str;
        }
        int i4 = onAttributionFailure + 113;
        onConversionDataFail = i4 % 128;
        if (i4 % 2 != 0) {
            return valueOf2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        int i = 2 % 2;
        try {
            String AFInAppEventParameterName2 = new AFa1eSDK(context, AFInAppEventParameterName()).AFInAppEventParameterName();
            int i2 = onConversionDataFail + 113;
            onAttributionFailure = i2 % 128;
            if (i2 % 2 == 0) {
                return AFInAppEventParameterName2;
            }
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    public static synchronized SharedPreferences values(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (AFa1dSDK.class) {
            int i = 2 % 2;
            int i2 = onAttributionFailure + 31;
            onConversionDataFail = i2 % 128;
            int i3 = i2 % 2;
            if (valueOf().onAttributionFailureNative == null) {
                int i4 = onConversionDataFail + 37;
                onAttributionFailure = i4 % 128;
                StrictMode.ThreadPolicy threadPolicy = i4 % 2;
                try {
                    if (threadPolicy != 0) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        valueOf().onAttributionFailureNative = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        threadPolicy = allowThreadDiskReads;
                    } else {
                        StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        valueOf().onAttributionFailureNative = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        threadPolicy = allowThreadDiskReads2;
                    }
                    StrictMode.setThreadPolicy(threadPolicy);
                    int i5 = 2 % 2;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            }
            sharedPreferences = valueOf().onAttributionFailureNative;
        }
        return sharedPreferences;
    }

    public final AFb1fSDK valueOf(Context context) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 61;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType(context);
        AFb1fSDK AFKeystoreWrapper2 = AFInAppEventParameterName().AFKeystoreWrapper();
        int i4 = onConversionDataFail + 1;
        onAttributionFailure = i4 % 128;
        if (i4 % 2 == 0) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    public final int AFInAppEventType(AFb1fSDK aFb1fSDK, boolean z) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 75;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            valueOf(aFb1fSDK, "appsFlyerCount", z);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int valueOf2 = valueOf(aFb1fSDK, "appsFlyerCount", z);
        int i3 = onAttributionFailure + 41;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 71 / 0;
        }
        return valueOf2;
    }

    private int values(AFb1fSDK aFb1fSDK, boolean z) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 123;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        int valueOf2 = valueOf(aFb1fSDK, "appsFlyerInAppEventCount", z);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return valueOf2;
    }

    private int valueOf(AFb1fSDK aFb1fSDK, String str, boolean z) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 21;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        int AFInAppEventType = aFb1fSDK.AFInAppEventType(str, 0);
        if (z) {
            int i4 = onAttributionFailure + 89;
            onConversionDataFail = i4 % 128;
            int i5 = i4 % 2;
            AFInAppEventType++;
            aFb1fSDK.valueOf(str, AFInAppEventType);
        }
        if (AFInAppEventParameterName().afErrorLogForExcManagerOnly().afErrorLog()) {
            int i6 = onConversionDataFail + 83;
            onAttributionFailure = i6 % 128;
            if (i6 % 2 != 0) {
                AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType(String.valueOf(AFInAppEventType));
                int i7 = 92 / 0;
            } else {
                AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType(String.valueOf(AFInAppEventType));
            }
        }
        return AFInAppEventType;
    }

    private long afErrorLog(Context context) {
        int i = 2 % 2;
        AFb1fSDK valueOf2 = valueOf(context);
        long values2 = valueOf2.values("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        valueOf2.AFInAppEventType("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        Object obj = null;
        if (values2 <= 0) {
            int i2 = onConversionDataFail + 5;
            onAttributionFailure = i2 % 128;
            if (i2 % 2 == 0) {
                return -1L;
            }
            super.hashCode();
            throw null;
        }
        long j = currentTimeMillis - values2;
        int i3 = onAttributionFailure;
        int i4 = i3 + 53;
        onConversionDataFail = i4 % 128;
        long j2 = i4 % 2 == 0 ? j ^ 1000 : j / 1000;
        int i5 = i3 + 11;
        onConversionDataFail = i5 % 128;
        if (i5 % 2 != 0) {
            return j2;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AFb1wSDK afErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        strArr[5] = map == null ? "" : map.toString();
        afErrorLogForExcManagerOnly.AFInAppEventType("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            AFLogger.afInfoLog(new StringBuilder("Validate in app called with parameters: ").append(str3).append(" ").append(str4).append(" ").append(str5).toString());
        }
        if (str == null || str4 == null || str2 == null || str5 == null || str3 == null) {
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFInAppEventParameterName;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return;
            }
            return;
        }
        new Thread(new AFa1kSDK(context.getApplicationContext(), AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType, str, str2, str3, str4, str5, map, context instanceof Activity ? ((Activity) context).getIntent() : null)).start();
    }

    private static void AFInAppEventType(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 107;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        try {
            scheduledExecutorService.schedule(runnable, j, timeUnit);
            int i4 = onConversionDataFail + 109;
            onAttributionFailure = i4 % 128;
            int i5 = i4 % 2;
        } catch (RejectedExecutionException e) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 79;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AFe1xSDK AFVersionDeclaration = AFInAppEventParameterName().AFVersionDeclaration();
        if (i3 != 0) {
            AFVersionDeclaration.values();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        boolean values2 = AFVersionDeclaration.values();
        int i4 = onAttributionFailure + 89;
        onConversionDataFail = i4 % 128;
        int i5 = i4 % 2;
        return values2;
    }

    @Deprecated
    public static String AFInAppEventType(HttpURLConnection httpURLConnection) {
        String obj;
        InputStreamReader inputStreamReader;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    errorStream = httpURLConnection.getInputStream();
                }
                inputStreamReader = new InputStreamReader(errorStream, Charset.defaultCharset());
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    boolean z = false;
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            int i2 = onAttributionFailure + 41;
                            onConversionDataFail = i2 % 128;
                            int i3 = i2 % 2;
                            sb.append(z ? '\n' : "").append(readLine);
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            try {
                                AFLogger.afErrorLog(new StringBuilder("Could not read connection response from: ").append(httpURLConnection.getURL().toString()).toString(), th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                int i4 = onAttributionFailure + 69;
                                onConversionDataFail = i4 % 128;
                                int i5 = i4 % 2;
                                obj = sb.toString();
                                new JSONObject(obj);
                                return obj;
                            } catch (Throwable th2) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th3) {
                                        AFLogger.afErrorLogForExcManagerOnly("readServerResponse error", th3);
                                        throw th2;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    int i6 = onConversionDataFail + 117;
                                    onAttributionFailure = i6 % 128;
                                    int i7 = i6 % 2;
                                    inputStreamReader.close();
                                }
                                throw th2;
                            }
                        }
                    }
                    bufferedReader2.close();
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
            }
        } catch (Throwable th6) {
            AFLogger.afErrorLogForExcManagerOnly("readServerResponse error", th6);
        }
        obj = sb.toString();
        try {
            new JSONObject(obj);
            return obj;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error while parsing readServerResponse", e);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("string_response", obj);
                return jSONObject.toString();
            } catch (JSONException e2) {
                AFLogger.afErrorLogForExcManagerOnly("RESPONSE_NOT_JSON error", e2);
                return new JSONObject().toString();
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String str3;
        int i = 2 % 2;
        if (AFb1vSDK.valueOf(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i2 = onConversionDataFail;
        int i3 = i2 + 49;
        int i4 = i3 % 128;
        onAttributionFailure = i4;
        int i5 = i3 % 2;
        if (str != null) {
            int i6 = i2 + 27;
            onAttributionFailure = i6 % 128;
            int i7 = i6 % 2;
            str3 = str.trim();
        } else {
            int i8 = i4 + 109;
            onConversionDataFail = i8 % 128;
            int i9 = i8 % 2;
            str3 = "";
        }
        AFc1cSDK.AFInAppEventType(new AFc1dSDK(str3, str2.trim()));
        int i10 = onConversionDataFail + 33;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 59;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        String AFInAppEventType = AFInAppEventParameterName().onInstallConversionDataLoadedNative().AFInAppEventType();
        int i4 = onAttributionFailure + 115;
        onConversionDataFail = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return AFInAppEventType;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 83;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        String valueOf2 = AFInAppEventParameterName().onInstallConversionDataLoadedNative().valueOf();
        int i4 = onConversionDataFail + 89;
        onAttributionFailure = i4 % 128;
        int i5 = i4 % 2;
        return valueOf2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i2 = 2 % 2;
        int i3 = onConversionDataFail + 91;
        onAttributionFailure = i3 % 128;
        int i4 = i3 % 2;
        this.getLevel = TimeUnit.SECONDS.toMillis(i);
        int i5 = onConversionDataFail + 79;
        onAttributionFailure = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    private AFf1jSDK[] AFLogger$LogLevel() {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 75;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AFf1jSDK[] AFInAppEventType = AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType();
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return AFInAppEventType;
    }

    class AFa1vSDK implements Runnable {
        private final AFa1qSDK AFInAppEventParameterName;

        /* synthetic */ AFa1vSDK(AFa1dSDK aFa1dSDK, AFa1qSDK aFa1qSDK, byte b) {
            this(aFa1qSDK);
        }

        private AFa1vSDK(AFa1qSDK aFa1qSDK) {
            this.AFInAppEventParameterName = aFa1qSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFa1dSDK.values(AFa1dSDK.this, this.AFInAppEventParameterName);
        }
    }

    class AFa1ySDK implements Runnable {
        private final AFa1qSDK valueOf;

        /* synthetic */ AFa1ySDK(AFa1dSDK aFa1dSDK, AFa1qSDK aFa1qSDK, byte b) {
            this(aFa1qSDK);
        }

        private AFa1ySDK(AFa1qSDK aFa1qSDK) {
            this.valueOf = aFa1qSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFd1eSDK aFd1eSDK;
            if (this.valueOf.values()) {
                AFd1hSDK aFd1hSDK = new AFd1hSDK(this.valueOf, AFa1dSDK.this.AFInAppEventParameterName());
                aFd1hSDK.getLevel = AFa1dSDK.AFInAppEventType(AFa1dSDK.this);
                aFd1eSDK = aFd1hSDK;
            } else {
                aFd1eSDK = new AFd1eSDK(this.valueOf, AFa1dSDK.this.AFInAppEventParameterName());
            }
            AFd1tSDK level = AFa1dSDK.this.AFInAppEventParameterName().getLevel();
            level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1eSDK));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 9;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 == 0) {
            Objects.requireNonNull(pluginInfo);
            AFInAppEventParameterName().onInstallConversionFailureNative().values(pluginInfo);
            int i3 = onAttributionFailure + 109;
            onConversionDataFail = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        Objects.requireNonNull(pluginInfo);
        AFInAppEventParameterName().onInstallConversionFailureNative().values(pluginInfo);
        throw null;
    }

    class AFa1xSDK implements AFd1zSDK {
        @Override // com.appsflyer.internal.AFd1zSDK
        public final void AFKeystoreWrapper(AFd1uSDK<?> aFd1uSDK) {
        }

        private AFa1xSDK() {
        }

        /* synthetic */ AFa1xSDK(AFa1dSDK aFa1dSDK, byte b) {
            this();
        }

        @Override // com.appsflyer.internal.AFd1zSDK
        public final void AFInAppEventType(AFd1uSDK<?> aFd1uSDK) {
            if (aFd1uSDK instanceof AFd1hSDK) {
                AFa1dSDK.this.AFInAppEventParameterName().AFLogger().AFKeystoreWrapper(((AFd1eSDK) aFd1uSDK).afInfoLog.afErrorLog);
            }
        }

        @Override // com.appsflyer.internal.AFd1zSDK
        public final void AFInAppEventType(AFd1uSDK<?> aFd1uSDK, AFd1ySDK aFd1ySDK) {
            JSONObject AFInAppEventParameterName;
            AFb1oSDK AFKeystoreWrapper;
            if (aFd1uSDK instanceof AFd1eSDK) {
                AFd1eSDK aFd1eSDK = (AFd1eSDK) aFd1uSDK;
                boolean z = aFd1uSDK instanceof AFd1hSDK;
                if (z && valueOf()) {
                    AFd1hSDK aFd1hSDK = (AFd1hSDK) aFd1uSDK;
                    if (aFd1hSDK.AFKeystoreWrapper == AFd1ySDK.SUCCESS || aFd1hSDK.AFInAppEventParameterName == 1) {
                        AFe1kSDK aFe1kSDK = new AFe1kSDK(aFd1hSDK, AFa1dSDK.this.AFInAppEventParameterName().AFKeystoreWrapper());
                        AFd1tSDK level = AFa1dSDK.this.AFInAppEventParameterName().getLevel();
                        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFe1kSDK));
                    }
                }
                if (aFd1ySDK == AFd1ySDK.SUCCESS) {
                    AFa1dSDK aFa1dSDK = AFa1dSDK.this;
                    aFa1dSDK.valueOf(AFa1dSDK.values(aFa1dSDK)).values("sentSuccessfully", "true");
                    if (!(aFd1uSDK instanceof AFd1gSDK) && (AFKeystoreWrapper = new AFe1sSDK(AFa1dSDK.values(AFa1dSDK.this)).AFKeystoreWrapper()) != null && AFKeystoreWrapper.valueOf()) {
                        String str = AFKeystoreWrapper.AFKeystoreWrapper;
                        AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFe1sSDK.AFKeystoreWrapper(str);
                    }
                    ResponseNetwork responseNetwork = ((AFd1nSDK) aFd1eSDK).AFLogger;
                    if (responseNetwork != null && (AFInAppEventParameterName = AFb1tSDK.AFInAppEventParameterName((String) responseNetwork.getBody())) != null) {
                        AFa1dSDK.AFInAppEventType(AFa1dSDK.this, AFInAppEventParameterName.optBoolean("send_background", false));
                    }
                    if (z) {
                        AFa1dSDK.values(AFa1dSDK.this, System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(aFd1uSDK instanceof AFe1kSDK) || aFd1ySDK == AFd1ySDK.SUCCESS) {
                return;
            }
            AFe1rSDK aFe1rSDK = new AFe1rSDK(AFa1dSDK.this.AFInAppEventParameterName());
            AFd1tSDK level2 = AFa1dSDK.this.AFInAppEventParameterName().getLevel();
            level2.AFKeystoreWrapper.execute(level2.new AnonymousClass5(aFe1rSDK));
        }

        private boolean valueOf() {
            return AFa1dSDK.this.AFInAppEventType != null;
        }
    }

    public final void AFInAppEventType(Context context) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 25;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 == 0) {
            AFc1xSDK aFc1xSDK = this.onAppOpenAttribution;
            if (context != null) {
                AFb1bSDK aFb1bSDK = aFc1xSDK.AFInAppEventParameterName;
                if (context != null) {
                    aFb1bSDK.AFInAppEventParameterName = context.getApplicationContext();
                    int i3 = onConversionDataFail + 91;
                    onAttributionFailure = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            int i5 = onAttributionFailure + 73;
            onConversionDataFail = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 15 / 0;
                return;
            }
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 69;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType(context);
        PurchaseHandler afInfoLog = AFInAppEventParameterName().afInfoLog();
        if (afInfoLog.AFInAppEventParameterName(map, purchaseValidationCallback, "subscriptions")) {
            AFd1pSDK aFd1pSDK = new AFd1pSDK(map, purchaseValidationCallback, afInfoLog.valueOf);
            AFd1tSDK aFd1tSDK = afInfoLog.AFInAppEventParameterName;
            aFd1tSDK.AFKeystoreWrapper.execute(aFd1tSDK.new AnonymousClass5(aFd1pSDK));
        }
        int i4 = onAttributionFailure + 5;
        onConversionDataFail = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r6 = new com.appsflyer.internal.AFd1kSDK(r7, r8, r5.valueOf);
        r5 = r5.AFInAppEventParameterName;
        r5.AFKeystoreWrapper.execute(new com.appsflyer.internal.AFd1tSDK.AnonymousClass5(r5, r6));
        r5 = com.appsflyer.internal.AFa1dSDK.onAttributionFailure + 3;
        com.appsflyer.internal.AFa1dSDK.onConversionDataFail = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r5.AFInAppEventParameterName(r7, r8, "purchases") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r5.AFInAppEventParameterName(r7, r8, r6) != false) goto L9;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler afInfoLog;
        int i = 2 % 2;
        int i2 = onAttributionFailure + 117;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventType(context);
            afInfoLog = AFInAppEventParameterName().afInfoLog();
            String[] strArr = new String[0];
            strArr[1] = "purchases";
        } else {
            AFInAppEventType(context);
            afInfoLog = AFInAppEventParameterName().afInfoLog();
        }
        int i3 = onAttributionFailure + 33;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 77;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName().init().valueOf = deepLinkListener;
            AFInAppEventParameterName().init().afRDLog = j;
            int i3 = onConversionDataFail + 125;
            onAttributionFailure = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        AFInAppEventParameterName().init().valueOf = deepLinkListener;
        AFInAppEventParameterName().init().afRDLog = j;
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        String concat;
        int i = 2 % 2;
        int i2 = onConversionDataFail + 73;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        if (this.onResponseErrorNative == null) {
            this.onResponseErrorNative = new AFb1hSDK();
        }
        AFb1hSDK aFb1hSDK = this.onResponseErrorNative;
        if (str == null || str.isEmpty()) {
            AFLogger.afWarnLog("Partner ID is missing or `null`");
            return;
        }
        if (map == null || !(!map.isEmpty())) {
            if (aFb1hSDK.AFInAppEventParameterName.remove(str) != null) {
                concat = "Cleared partner data for ".concat(String.valueOf(str));
            } else {
                int i4 = onAttributionFailure + 97;
                onConversionDataFail = i4 % 128;
                int i5 = i4 % 2;
                concat = "Partner data is missing or `null`";
            }
            AFLogger.afWarnLog(concat);
            return;
        }
        AFLogger.afDebugLog(new StringBuilder("Setting partner data for ").append(str).append(": ").append(map).toString());
        int length = new JSONObject(map).toString().length();
        if (length > 1000) {
            AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "limit exceeded: ".concat(String.valueOf(length)));
            aFb1hSDK.AFInAppEventType.put(str, hashMap);
            return;
        }
        aFb1hSDK.AFInAppEventParameterName.put(str, map);
        aFb1hSDK.AFInAppEventType.remove(str);
        int i6 = onConversionDataFail + 121;
        onAttributionFailure = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 119;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1wSDK afErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
            String[] strArr = new String[1];
            strArr[1] = str;
            afErrorLogForExcManagerOnly.AFInAppEventType("setImeiData", strArr);
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setImeiData", str);
        }
        AFInAppEventParameterName().AFVersionDeclaration().valueOf = str;
        int i3 = onAttributionFailure + 81;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 50 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 71;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFb1uSDK init = AFInAppEventParameterName().init();
        init.afDebugLog.clear();
        init.afDebugLog.addAll(Arrays.asList(strArr));
        int i4 = onConversionDataFail + 79;
        onAttributionFailure = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        String format;
        int i = 2 % 2;
        int i2 = onAttributionFailure + 111;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[1] = Arrays.toString(strArr);
            format = String.format("setOneLinkCustomDomain %s", objArr);
        } else {
            format = String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr));
        }
        AFLogger.afDebugLog(format);
        AFInAppEventParameterName().init().afInfoLog = strArr;
        int i3 = onAttributionFailure + 65;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    private void AFInAppEventParameterName(Context context) {
        int i = 2 % 2;
        this.onConversionDataSuccess = new HashMap();
        final long currentTimeMillis = System.currentTimeMillis();
        final AFa1uSDK.AFa1xSDK aFa1xSDK = new AFa1uSDK.AFa1xSDK() { // from class: com.appsflyer.internal.AFa1dSDK.4
            @Override // com.appsflyer.internal.AFa1uSDK.AFa1xSDK
            public final void AFInAppEventType(String str, String str2, String str3) {
                if (str == null) {
                    AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("link", "");
                } else {
                    AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(String.valueOf(str)));
                    AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("link", str);
                    if (str2 != null) {
                        AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("target_url", str2);
                    }
                    if (str3 != null) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("promo_code", str3);
                        hashMap.put("deeplink_context", hashMap2);
                        AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("extras", hashMap);
                    }
                }
                AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }

            @Override // com.appsflyer.internal.AFa1uSDK.AFa1xSDK
            public final void AFInAppEventParameterName(String str) {
                AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
            }
        };
        try {
            Object obj = null;
            Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
            final Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
            Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
            Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
            Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1uSDK.1
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method2, Object[] objArr) throws Throwable {
                    String str;
                    String str2;
                    String str3;
                    Bundle bundle;
                    if (method2.getName().equals("onDeferredAppLinkDataFetched")) {
                        Object obj3 = objArr[0];
                        if (obj3 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", new Class[0]).invoke(cls.cast(obj3), new Object[0]));
                            if (bundle2 != null) {
                                str2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                str3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle("extras");
                                str = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                str = null;
                                str2 = null;
                                str3 = null;
                            }
                            AFa1xSDK aFa1xSDK2 = aFa1xSDK;
                            if (aFa1xSDK2 != null) {
                                aFa1xSDK2.AFInAppEventType(str2, str3, str);
                            }
                        } else {
                            AFa1xSDK aFa1xSDK3 = aFa1xSDK;
                            if (aFa1xSDK3 != null) {
                                aFa1xSDK3.AFInAppEventType(null, null, null);
                            }
                        }
                        return null;
                    }
                    AFa1xSDK aFa1xSDK4 = aFa1xSDK;
                    if (aFa1xSDK4 != null) {
                        aFa1xSDK4.AFInAppEventParameterName("onDeferredAppLinkDataFetched invocation failed");
                    }
                    return null;
                }
            });
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
            if (!TextUtils.isEmpty(string)) {
                method.invoke(null, context, string, newProxyInstance);
                int i2 = onAttributionFailure + 21;
                onConversionDataFail = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }
            int i3 = onConversionDataFail + 55;
            onAttributionFailure = i3 % 128;
            if (i3 % 2 == 0) {
                aFa1xSDK.AFInAppEventParameterName("Facebook app id not defined in resources");
            } else {
                aFa1xSDK.AFInAppEventParameterName("Facebook app id not defined in resources");
                super.hashCode();
                throw null;
            }
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e);
            aFa1xSDK.AFInAppEventParameterName(e.toString());
        } catch (IllegalAccessException e2) {
            AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e2);
            aFa1xSDK.AFInAppEventParameterName(e2.toString());
        } catch (NoSuchMethodException e3) {
            AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e3);
            aFa1xSDK.AFInAppEventParameterName(e3.toString());
        } catch (InvocationTargetException e4) {
            AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e4);
            aFa1xSDK.AFInAppEventParameterName(e4.toString());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        AFInAppEventType(context);
        AFe1aSDK aFe1aSDK = new AFe1aSDK();
        aFe1aSDK.afDebugLog = str;
        aFe1aSDK.AFInAppEventType = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.AFInAppEventType("Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFe1aSDK.AFInAppEventType(singletonMap);
        }
        aFe1aSDK.AFKeystoreWrapper = hashMap;
        AFb1wSDK afErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = new JSONObject(aFe1aSDK.AFKeystoreWrapper == null ? new HashMap() : aFe1aSDK.AFKeystoreWrapper).toString();
        afErrorLogForExcManagerOnly.AFInAppEventType("logEvent", strArr);
        if (str == null) {
            AFInAppEventType(context, AFe1nSDK.logEvent);
        }
        values(aFe1aSDK, context instanceof Activity ? (Activity) context : null);
    }

    private void AFInAppEventType(AFa1qSDK aFa1qSDK, Activity activity) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 75;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AFf1tSDK onResponseNative = AFInAppEventParameterName().onResponseNative();
        aFa1qSDK.values = onResponseNative.AFInAppEventType(activity);
        aFa1qSDK.afRDLog = onResponseNative.valueOf(activity);
        int i4 = onConversionDataFail + 35;
        onAttributionFailure = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
    }

    private void afErrorLogForExcManagerOnly() {
        int i = 2 % 2;
        int i2 = onAttributionFailure + 61;
        onConversionDataFail = i2 % 128;
        int i3 = i2 % 2;
        if (AFd1mSDK.afRDLog()) {
            return;
        }
        AFc1zSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFd1tSDK level = AFInAppEventParameterName2.getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(new AFd1mSDK(AFInAppEventParameterName2)));
        int i4 = onConversionDataFail + 105;
        onAttributionFailure = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) {
        int i = 2 % 2;
        int i2 = onConversionDataFail + 35;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("getAppsFlyerUID", new String[0]);
        if (context != null) {
            AFInAppEventType(context);
            AFb1cSDK AFInAppEventParameterName2 = AFInAppEventParameterName().AFInAppEventParameterName();
            String AFInAppEventParameterName3 = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName2.values, AFInAppEventParameterName2.AFInAppEventType);
            int i4 = onConversionDataFail + 69;
            onAttributionFailure = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
            }
            return AFInAppEventParameterName3;
        }
        int i6 = onAttributionFailure + 47;
        onConversionDataFail = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z;
        int i = 2 % 2;
        int i2 = onConversionDataFail + 87;
        onAttributionFailure = i2 % 128;
        int i3 = i2 % 2;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            int i4 = onConversionDataFail + 89;
            onAttributionFailure = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        int i6 = onAttributionFailure + 9;
        onConversionDataFail = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if ((r4 % 2) == 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void AFInAppEventParameterName(Context context, Intent intent) {
        Uri uri;
        int i = 2 % 2;
        AFInAppEventType(context);
        AFb1uSDK init = AFInAppEventParameterName().init();
        AFb1fSDK AFKeystoreWrapper2 = AFInAppEventParameterName().AFKeystoreWrapper();
        boolean z = true;
        Object obj = null;
        if (intent != null) {
            int i2 = onConversionDataFail + 25;
            onAttributionFailure = i2 % 128;
            if (i2 % 2 != 0) {
                "android.intent.action.VIEW".equals(intent.getAction());
                super.hashCode();
                throw null;
            }
            if (!(!"android.intent.action.VIEW".equals(intent.getAction()))) {
                uri = intent.getData();
                if (uri != null) {
                    int i3 = onAttributionFailure + 15;
                    onConversionDataFail = i3 % 128;
                    int i4 = i3 % 2;
                    if (!uri.toString().isEmpty()) {
                        int i5 = onAttributionFailure + 49;
                        onConversionDataFail = i5 % 128;
                    }
                }
                z = false;
                if (AFKeystoreWrapper2.AFKeystoreWrapper("ddl_sent")) {
                    int i6 = onConversionDataFail + 81;
                    int i7 = i6 % 128;
                    onAttributionFailure = i7;
                    int i8 = i6 % 2;
                    if (!z) {
                        int i9 = i7 + 69;
                        onConversionDataFail = i9 % 128;
                        if (i9 % 2 != 0) {
                            init.AFInAppEventType("No direct deep link", (DeepLinkResult.Error) null);
                            return;
                        } else {
                            init.AFInAppEventType("No direct deep link", (DeepLinkResult.Error) null);
                            super.hashCode();
                            throw null;
                        }
                    }
                }
                init.valueOf(new HashMap(), intent, context);
            }
        }
        uri = null;
        if (uri != null) {
        }
        z = false;
        if (AFKeystoreWrapper2.AFKeystoreWrapper("ddl_sent")) {
        }
        init.valueOf(new HashMap(), intent, context);
    }

    private static void AFInAppEventParameterName(String str, boolean z, int[] iArr, Object[] objArr) {
        String str2;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        synchronized (AFg1mSDK.AFInAppEventType) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(onResponse, i, cArr, 0, i2);
            if (bArr2 != null) {
                char[] cArr2 = new char[i2];
                AFg1mSDK.AFKeystoreWrapper = 0;
                char c = 0;
                while (AFg1mSDK.AFKeystoreWrapper < i2) {
                    if (bArr2[AFg1mSDK.AFKeystoreWrapper] == 1) {
                        cArr2[AFg1mSDK.AFKeystoreWrapper] = (char) (((cArr[AFg1mSDK.AFKeystoreWrapper] << 1) + 1) - c);
                    } else {
                        cArr2[AFg1mSDK.AFKeystoreWrapper] = (char) ((cArr[AFg1mSDK.AFKeystoreWrapper] << 1) - c);
                    }
                    c = cArr2[AFg1mSDK.AFKeystoreWrapper];
                    AFg1mSDK.AFKeystoreWrapper++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                AFg1mSDK.AFKeystoreWrapper = 0;
                while (AFg1mSDK.AFKeystoreWrapper < i2) {
                    cArr4[AFg1mSDK.AFKeystoreWrapper] = cArr[(i2 - AFg1mSDK.AFKeystoreWrapper) - 1];
                    AFg1mSDK.AFKeystoreWrapper++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                AFg1mSDK.AFKeystoreWrapper = 0;
                while (AFg1mSDK.AFKeystoreWrapper < i2) {
                    cArr[AFg1mSDK.AFKeystoreWrapper] = (char) (cArr[AFg1mSDK.AFKeystoreWrapper] - iArr[2]);
                    AFg1mSDK.AFKeystoreWrapper++;
                }
            }
            str2 = new String(cArr);
        }
        objArr[0] = str2;
    }
}
