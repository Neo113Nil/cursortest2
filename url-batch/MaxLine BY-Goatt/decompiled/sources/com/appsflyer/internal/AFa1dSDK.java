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
import com.facebook.FacebookSdk;
import com.facebook.appevents.UserDataStore;
import com.facebook.applinks.AppLinkData;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.s50;
import defpackage.sv0;
import defpackage.tv0;
import j$.util.DesugarTimeZone;
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
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
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
    private long getLevel = 5000;
    private boolean AFVersionDeclaration = false;
    private final AFb1xSDK onAppOpenAttributionNative = new AFb1xSDK();
    private boolean AppsFlyer2dXConversionCallback = false;
    private boolean onDeepLinkingNative = false;
    private final Executor onDeepLinking = Executors.newSingleThreadExecutor();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFa1dSDK$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
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

    static {
        AFInAppEventType();
        valueOf = "253";
        Object[] objArr = new Object[1];
        AFInAppEventParameterName("\u0001", false, new int[]{33, 1, 169, 1}, objArr);
        String substring = "6.12.1".substring(0, "6.12.1".lastIndexOf(((String) objArr[0]).intern()));
        AFKeystoreWrapper = substring;
        afRDLog = "https://%sstats.%s/stats";
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append("/androidevent?buildnumber=6.12.1&app_id=");
        values = sb.toString();
        AFInAppEventParameterName = null;
        afErrorLog = new AFa1dSDK();
        onAttributionFailure = (onConversionDataFail + 105) % 128;
    }

    public AFa1dSDK() {
        AFVersionDeclaration.init();
        this.onAppOpenAttribution = new AFc1xSDK();
        AFd1tSDK level = AFInAppEventParameterName().getLevel();
        level.values.add(new AFa1xSDK(this, (byte) 0));
    }

    private void AFInAppEventParameterName(Context context) {
        this.onConversionDataSuccess = new HashMap();
        final long currentTimeMillis = System.currentTimeMillis();
        final AFa1uSDK.AFa1xSDK aFa1xSDK = new AFa1uSDK.AFa1xSDK() { // from class: com.appsflyer.internal.AFa1dSDK.4
            @Override // com.appsflyer.internal.AFa1uSDK.AFa1xSDK
            public final void AFInAppEventParameterName(String str) {
                AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("error", str);
            }

            @Override // com.appsflyer.internal.AFa1uSDK.AFa1xSDK
            public final void AFInAppEventType(String str, String str2, String str3) {
                if (str != null) {
                    AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                    AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("link", str);
                    if (str2 != null) {
                        AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("target_url", str2);
                    }
                    if (str3 != null) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(ShareConstants.PROMO_CODE, str3);
                        hashMap.put(ShareConstants.DEEPLINK_CONTEXT, hashMap2);
                        AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("extras", hashMap);
                    }
                } else {
                    AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("link", BuildConfig.FLAVOR);
                }
                AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        };
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            FacebookSdk.class.getMethod("sdkInitialize", Context.class).invoke(null, context);
            final Class<AppLinkData> cls = AppLinkData.class;
            Method method = AppLinkData.class.getMethod("fetchDeferredAppLinkData", Context.class, String.class, AppLinkData.CompletionHandler.class);
            Object newProxyInstance = Proxy.newProxyInstance(AppLinkData.CompletionHandler.class.getClassLoader(), new Class[]{AppLinkData.CompletionHandler.class}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1uSDK.1
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    String str;
                    String str2;
                    String str3;
                    Bundle bundle;
                    if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                        AFa1xSDK aFa1xSDK2 = aFa1xSDK;
                        if (aFa1xSDK2 != null) {
                            aFa1xSDK2.AFInAppEventParameterName("onDeferredAppLinkDataFetched invocation failed");
                        }
                        return null;
                    }
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", null).invoke(cls.cast(obj2), null));
                        if (bundle2 != null) {
                            str2 = bundle2.getString(AppLinkData.ARGUMENTS_NATIVE_URL);
                            str3 = bundle2.getString("target_url");
                            Bundle bundle3 = bundle2.getBundle("extras");
                            str = (bundle3 == null || (bundle = bundle3.getBundle(ShareConstants.DEEPLINK_CONTEXT)) == null) ? null : bundle.getString(ShareConstants.PROMO_CODE);
                        } else {
                            str = null;
                            str2 = null;
                            str3 = null;
                        }
                        AFa1xSDK aFa1xSDK3 = aFa1xSDK;
                        if (aFa1xSDK3 != null) {
                            aFa1xSDK3.AFInAppEventType(str2, str3, str);
                        }
                    } else {
                        AFa1xSDK aFa1xSDK4 = aFa1xSDK;
                        if (aFa1xSDK4 != null) {
                            aFa1xSDK4.AFInAppEventType(null, null, null);
                        }
                    }
                    return null;
                }
            });
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
            if (!TextUtils.isEmpty(string)) {
                method.invoke(null, context, string, newProxyInstance);
                int i = onAttributionFailure + 21;
                onConversionDataFail = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i2 = onConversionDataFail + 55;
            onAttributionFailure = i2 % 128;
            if (i2 % 2 == 0) {
                aFa1xSDK.AFInAppEventParameterName("Facebook app id not defined in resources");
            } else {
                aFa1xSDK.AFInAppEventParameterName("Facebook app id not defined in resources");
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r8.contains("access_token") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r0 = values(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r0.length() != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r2 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r0.contains("&") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r2 = new java.util.ArrayList(java.util.Arrays.asList(r0.split("&")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        r4 = new java.lang.StringBuilder();
        r2 = r2.iterator();
        com.appsflyer.internal.AFa1dSDK.onConversionDataFail = (com.appsflyer.internal.AFa1dSDK.onAttributionFailure + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r2.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        com.appsflyer.internal.AFa1dSDK.onConversionDataFail = (com.appsflyer.internal.AFa1dSDK.onAttributionFailure + 109) % 128;
        r5 = (java.lang.String) r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (r5.contains("access_token") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (r4.length() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        r4.append("&");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        r4.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (r5.startsWith("?") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        r4.append("?");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        r5 = com.appsflyer.internal.AFa1dSDK.onConversionDataFail + 111;
        com.appsflyer.internal.AFa1dSDK.onAttributionFailure = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        if ((r5 % 2) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        r2.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        r2.remove();
        r5 = 89 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        return r8.replace(r0, r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005d, code lost:
    
        r2.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0035, code lost:
    
        if (r8.contains("access_token") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFKeystoreWrapper(String str) {
        int i = onAttributionFailure + 111;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (str == null) {
            return null;
        }
        if (str.matches("fb\\d*?://authorize.*")) {
            int i2 = onAttributionFailure + 7;
            onConversionDataFail = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 25 / 0;
            }
        }
        onConversionDataFail = (onAttributionFailure + 1) % 128;
        return str;
    }

    private static String AFLogger() {
        onConversionDataFail = (onAttributionFailure + 79) % 128;
        String valueOf2 = valueOf(AppsFlyerProperties.APP_ID);
        int i = onConversionDataFail + 101;
        onAttributionFailure = i % 128;
        if (i % 2 == 0) {
            return valueOf2;
        }
        throw null;
    }

    private AFf1jSDK[] AFLogger$LogLevel() {
        int i = onConversionDataFail + 75;
        onAttributionFailure = i % 128;
        int i2 = i % 2;
        AFf1jSDK[] AFInAppEventType = AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType();
        if (i2 != 0) {
            int i3 = 5 / 0;
        }
        return AFInAppEventType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFVersionDeclaration() {
        try {
            AFe1hSDK aFe1hSDK = new AFe1hSDK();
            if (AFInAppEventParameterName(aFe1hSDK, valueOf(this.onInstallConversionFailureNative))) {
                onAttributionFailure = (onConversionDataFail + 123) % 128;
                valueOf(aFe1hSDK);
                onConversionDataFail = (onAttributionFailure + 83) % 128;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    private void afDebugLog(Context context) {
        if (AFa1cSDK.valueOf()) {
            AFLogger.afRDLog("OPPO device found");
        }
        if (AFInAppEventParameterName(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb = new StringBuilder("OS SDK is=");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("; no KeyStore usage");
            AFLogger.afRDLog(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("OS SDK is=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("; use KeyStore");
        AFLogger.afRDLog(sb2.toString());
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
        if (aFKeystoreWrapper.valueOf()) {
            String AFInAppEventParameterName2 = aFKeystoreWrapper.AFInAppEventParameterName();
            synchronized (aFKeystoreWrapper.AFInAppEventParameterName) {
                aFKeystoreWrapper.AFInAppEventType++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFInAppEventParameterName2)));
                try {
                    synchronized (aFKeystoreWrapper.AFInAppEventParameterName) {
                        aFKeystoreWrapper.values.deleteEntry(AFInAppEventParameterName2);
                    }
                } catch (KeyStoreException e) {
                    StringBuilder sb3 = new StringBuilder("Exception ");
                    sb3.append(e.getMessage());
                    sb3.append(" occurred");
                    AFLogger.afErrorLog(sb3.toString(), e);
                }
            }
            aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventParameterName());
        } else {
            aFKeystoreWrapper.AFKeystoreWrapper = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper());
            aFKeystoreWrapper.AFInAppEventType = 0;
            aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventParameterName());
        }
        AFKeystoreWrapper("KSAppsFlyerId", aFKeystoreWrapper.AFKeystoreWrapper());
        AFKeystoreWrapper("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.AFInAppEventType()));
    }

    private long afErrorLog(Context context) {
        AFb1fSDK valueOf2 = valueOf(context);
        long values2 = valueOf2.values("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        valueOf2.AFInAppEventType("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        if (values2 <= 0) {
            int i = onConversionDataFail + 5;
            onAttributionFailure = i % 128;
            if (i % 2 == 0) {
                return -1L;
            }
            throw null;
        }
        long j = currentTimeMillis - values2;
        int i2 = onAttributionFailure;
        int i3 = i2 + 53;
        onConversionDataFail = i3 % 128;
        long j2 = i3 % 2 == 0 ? j ^ 1000 : j / 1000;
        int i4 = i2 + 11;
        onConversionDataFail = i4 % 128;
        if (i4 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    private void afErrorLogForExcManagerOnly() {
        onConversionDataFail = (onAttributionFailure + 61) % 128;
        if (AFd1mSDK.afRDLog()) {
            return;
        }
        AFc1zSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFd1tSDK level = AFInAppEventParameterName2.getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(new AFd1mSDK(AFInAppEventParameterName2)));
        onAttributionFailure = (onConversionDataFail + 105) % 128;
    }

    private boolean afInfoLog() {
        onConversionDataFail = (onAttributionFailure + 125) % 128;
        if (this.AFLogger > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.AFLogger;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            String values2 = values(simpleDateFormat, this.AFLogger);
            String values3 = values(simpleDateFormat, this.afWarnLog);
            if (currentTimeMillis < this.getLevel && !isStopped()) {
                AFLogger.afInfoLog("Last Launch attempt: " + values2 + ";\nLast successful Launch event: " + values3 + ";\nThis launch is blocked: " + currentTimeMillis + " ms < " + this.getLevel + " ms");
                return true;
            }
            if (!isStopped()) {
                AFLogger.afInfoLog("Last Launch attempt: " + values2 + ";\nLast successful Launch event: " + values3 + ";\nSending launch (+" + currentTimeMillis + " ms)");
            }
        } else if (!isStopped()) {
            onConversionDataFail = (onAttributionFailure + 37) % 128;
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        int i = onAttributionFailure + 81;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            int i2 = 8 / 0;
        }
        return false;
    }

    private AFf1pSDK afRDLog() {
        AFf1pSDK aFf1pSDK = new AFf1pSDK(new b(this, 0), AFInAppEventParameterName().valueOf());
        int i = onConversionDataFail + 31;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            int i2 = 30 / 0;
        }
        return aFf1pSDK;
    }

    private boolean afWarnLog() {
        int i = onConversionDataFail;
        onAttributionFailure = (i + 113) % 128;
        Map<String, Object> map = this.onConversionDataSuccess;
        if (map == null) {
            return false;
        }
        onAttributionFailure = (i + 87) % 128;
        if (map.isEmpty()) {
            return false;
        }
        onAttributionFailure = (onConversionDataFail + 11) % 128;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getLevel() {
        ScheduledExecutorService values2;
        b bVar;
        int i = onConversionDataFail + 101;
        onAttributionFailure = i % 128;
        int i2 = i % 2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (i2 != 0) {
            values2 = AFInAppEventParameterName().values();
            bVar = new b(this, 1);
        } else {
            values2 = AFInAppEventParameterName().values();
            bVar = new b(this, 1);
        }
        AFInAppEventType(values2, bVar, 0L, timeUnit);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void valueOf(AFa1qSDK aFa1qSDK) {
        String str;
        String AFInAppEventParameterName2;
        long j;
        Context context = AFInAppEventParameterName().onAppOpenAttributionNative().AFInAppEventParameterName;
        if (context == null) {
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        AFb1fSDK valueOf2 = valueOf(context);
        AppsFlyerProperties.getInstance().saveProperties(valueOf2);
        if (!AFInAppEventParameterName().AFVersionDeclaration().values()) {
            AFLogger.afInfoLog("sendWithEvent from activity: ".concat(context.getClass().getName()));
            onConversionDataFail = (onAttributionFailure + 61) % 128;
        }
        boolean values2 = aFa1qSDK.values();
        Map<String, ?> values3 = values(aFa1qSDK);
        String str2 = (String) values3.get("appsflyerKey");
        if (str2 != null) {
            int i = onConversionDataFail + 101;
            onAttributionFailure = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            if (str2.length() != 0) {
                if (!isStopped()) {
                    AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
                }
                byte b = 0;
                int i2 = 0;
                int AFInAppEventType = AFInAppEventType(valueOf2, false);
                AFg1zSDK aFg1zSDK = new AFg1zSDK(this.onAppOpenAttribution);
                boolean values4 = aFa1qSDK.values();
                boolean z = aFa1qSDK instanceof AFe1gSDK;
                boolean z2 = aFa1qSDK instanceof AFe1jSDK;
                boolean z3 = aFa1qSDK instanceof AFe1iSDK;
                if ((aFa1qSDK instanceof AFe1hSDK) || z3) {
                    str = AFg1zSDK.afErrorLog;
                    if (str == null) {
                        int i3 = onConversionDataFail + 77;
                        onAttributionFailure = i3 % 128;
                        int i4 = i3 % 2;
                        AFg1wSDK aFg1wSDK = aFg1zSDK.values;
                        if (i4 != 0) {
                            aFg1wSDK.AFInAppEventParameterName(AFg1zSDK.valueOf);
                            throw null;
                        }
                        AFInAppEventParameterName2 = aFg1wSDK.AFInAppEventParameterName(AFg1zSDK.valueOf);
                        str = AFInAppEventParameterName2;
                    }
                } else if (z2) {
                    str = AFg1zSDK.afWarnLog;
                    if (str == null) {
                        int i5 = onAttributionFailure + 81;
                        onConversionDataFail = i5 % 128;
                        int i6 = i5 % 2;
                        AFg1wSDK aFg1wSDK2 = aFg1zSDK.values;
                        if (i6 == 0) {
                            aFg1wSDK2.AFInAppEventParameterName(AFg1zSDK.AFInAppEventType);
                            throw null;
                        }
                        str = aFg1wSDK2.AFInAppEventParameterName(AFg1zSDK.AFInAppEventType);
                    }
                } else {
                    if (z) {
                        onConversionDataFail = (onAttributionFailure + 11) % 128;
                        AFInAppEventParameterName2 = AFg1zSDK.afInfoLog;
                        if (AFInAppEventParameterName2 == null) {
                            AFInAppEventParameterName2 = aFg1zSDK.values.AFInAppEventParameterName(AFg1zSDK.AFKeystoreWrapper);
                        }
                    } else if (!values4) {
                        str = AFg1zSDK.getLevel;
                        if (str == null) {
                            str = aFg1zSDK.values.AFInAppEventParameterName(AFg1zSDK.afRDLog);
                        }
                    } else if (AFInAppEventType < 2) {
                        onConversionDataFail = (onAttributionFailure + 51) % 128;
                        String str3 = AFg1zSDK.AFLogger$LogLevel;
                        if (str3 == null) {
                            str3 = aFg1zSDK.values.AFInAppEventParameterName(AFg1zSDK.AFLogger);
                        }
                        str = str3;
                        onAttributionFailure = (onConversionDataFail + 67) % 128;
                    } else {
                        AFInAppEventParameterName2 = AFg1zSDK.AFVersionDeclaration;
                        if (AFInAppEventParameterName2 == null) {
                            AFInAppEventParameterName2 = aFg1zSDK.values.AFInAppEventParameterName(AFg1zSDK.afDebugLog);
                        }
                    }
                    str = AFInAppEventParameterName2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(aFg1zSDK.AFInAppEventParameterName.AFInAppEventParameterName().values.AFInAppEventParameterName.getPackageName());
                String valueOf3 = AFg1zSDK.valueOf(sb.toString(), z);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(valueOf3);
                String AFKeystoreWrapper2 = aFg1zSDK.AFInAppEventParameterName.AFInAppEventParameterName().AFKeystoreWrapper();
                String concat = AFKeystoreWrapper2 != null ? "&channel=".concat(AFKeystoreWrapper2) : null;
                if (concat == null) {
                    concat = BuildConfig.FLAVOR;
                }
                sb2.append(concat);
                String obj = sb2.toString();
                valueOf(values3);
                AFa1ySDK aFa1ySDK = new AFa1ySDK(this, aFa1qSDK.valueOf(obj).AFInAppEventType(values3).valueOf(AFInAppEventType), b);
                if (values2) {
                    AFf1jSDK[] AFLogger$LogLevel = AFLogger$LogLevel();
                    int length = AFLogger$LogLevel.length;
                    boolean z4 = false;
                    while (i2 < length) {
                        AFf1jSDK aFf1jSDK = AFLogger$LogLevel[i2];
                        if (aFf1jSDK.afRDLog == AFf1jSDK.AFa1vSDK.STARTED) {
                            StringBuilder sb3 = new StringBuilder("Failed to get ");
                            sb3.append(aFf1jSDK.AFInAppEventParameterName);
                            sb3.append(" referrer, wait ...");
                            AFLogger.afDebugLog(sb3.toString());
                            z4 = true;
                        }
                        i2++;
                        z4 = z4;
                    }
                    if (this.onDeepLinkingNative) {
                        onAttributionFailure = (onConversionDataFail + 107) % 128;
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
                    onConversionDataFail = (onAttributionFailure + 65) % 128;
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

    public final void AFInAppEventType(WeakReference<Context> weakReference) {
        if (weakReference.get() == null) {
            return;
        }
        AFLogger.afInfoLog("app went to background");
        AFb1fSDK valueOf2 = valueOf(weakReference.get());
        AppsFlyerProperties.getInstance().saveProperties(valueOf2);
        long j = AFInAppEventParameterName().AFLogger().afErrorLogForExcManagerOnly;
        HashMap hashMap = new HashMap();
        String str = AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType;
        if (str == null) {
            int i = onConversionDataFail + 11;
            onAttributionFailure = i % 128;
            if (i % 2 == 0) {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            } else {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                throw null;
            }
        }
        String valueOf3 = valueOf("KSAppsFlyerId");
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        }
        AFc1uSDK.AFa1wSDK values2 = AFa1bSDK.values(weakReference.get().getContentResolver());
        if (values2 != null) {
            hashMap.put("amazon_aid", values2.AFInAppEventParameterName);
            hashMap.put("amazon_aid_limit", String.valueOf(values2.AFInAppEventType));
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            onAttributionFailure = (onConversionDataFail + 39) % 128;
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
            int i2 = onConversionDataFail + 15;
            onAttributionFailure = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } else {
            onConversionDataFail = (onAttributionFailure + 61) % 128;
            valueOf3 = BuildConfig.FLAVOR;
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
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = onConversionDataFail + 91;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            AFInAppEventParameterName().init().AFKeystoreWrapper.contains(Arrays.asList(strArr));
            throw null;
        }
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = AFInAppEventParameterName().init().AFKeystoreWrapper;
        if (!list.contains(asList)) {
            list.add(asList);
        }
        onAttributionFailure = (onConversionDataFail + 59) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = onConversionDataFail + 1;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("anonymizeUser", String.valueOf(z));
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("anonymizeUser", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        onAttributionFailure = (onConversionDataFail + 11) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        onConversionDataFail = (onAttributionFailure + 51) % 128;
        AFb1uSDK init = AFInAppEventParameterName().init();
        init.values = str;
        init.AFInAppEventParameterName = map;
        int i = onConversionDataFail + 79;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        int i = (onConversionDataFail + 113) % 128;
        onAttributionFailure = i;
        this.onDeepLinkingNative = z;
        onConversionDataFail = (i + 47) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) {
        onAttributionFailure = (onConversionDataFail + 35) % 128;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("getAppsFlyerUID", new String[0]);
        if (context == null) {
            int i = onAttributionFailure + 47;
            onConversionDataFail = i % 128;
            if (i % 2 != 0) {
                return null;
            }
            throw null;
        }
        AFInAppEventType(context);
        AFb1cSDK AFInAppEventParameterName2 = AFInAppEventParameterName().AFInAppEventParameterName();
        String AFInAppEventParameterName3 = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName2.values, AFInAppEventParameterName2.AFInAppEventType);
        int i2 = onConversionDataFail + 69;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
        }
        return AFInAppEventParameterName3;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            String AFInAppEventParameterName2 = new AFa1eSDK(context, AFInAppEventParameterName()).AFInAppEventParameterName();
            int i = onConversionDataFail + 113;
            onAttributionFailure = i % 128;
            if (i % 2 == 0) {
                return AFInAppEventParameterName2;
            }
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        onAttributionFailure = (onConversionDataFail + 59) % 128;
        String AFInAppEventType = AFInAppEventParameterName().onInstallConversionDataLoadedNative().AFInAppEventType();
        int i = onAttributionFailure + 115;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
        return AFInAppEventType;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        onConversionDataFail = (onAttributionFailure + 83) % 128;
        String valueOf2 = AFInAppEventParameterName().onInstallConversionDataLoadedNative().valueOf();
        onAttributionFailure = (onConversionDataFail + 89) % 128;
        return valueOf2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i = onConversionDataFail + 75;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            throw null;
        }
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        String AFKeystoreWrapper2 = AFKeystoreWrapper(context, "AF_STORE");
        if (AFKeystoreWrapper2 != null) {
            onConversionDataFail = (onAttributionFailure + 77) % 128;
            return AFKeystoreWrapper2;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        AFc1zSDK AFInAppEventParameterName2;
        int i = onConversionDataFail + 119;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            AFInAppEventParameterName2 = AFInAppEventParameterName();
            AFInAppEventParameterName2.afErrorLogForExcManagerOnly().AFInAppEventType("getSdkVersion", new String[1]);
        } else {
            AFInAppEventParameterName2 = AFInAppEventParameterName();
            AFInAppEventParameterName2.afErrorLogForExcManagerOnly().AFInAppEventType("getSdkVersion", new String[0]);
        }
        AFInAppEventParameterName2.AFInAppEventParameterName();
        String AFInAppEventParameterName3 = AFb1cSDK.AFInAppEventParameterName();
        int i2 = onAttributionFailure + 39;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 != 0) {
            return AFInAppEventParameterName3;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        String str2;
        if (this.init) {
            onAttributionFailure = (onConversionDataFail + 15) % 128;
            return this;
        }
        this.init = true;
        AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType = str;
        AFc1pSDK.AFInAppEventParameterName(str);
        if (context != null) {
            this.onInstallConversionFailureNative = (Application) context.getApplicationContext();
            AFInAppEventType(context);
            AFInAppEventParameterName().AFLogger().valueOf = System.currentTimeMillis();
            AFInAppEventParameterName().onResponseErrorNative().AFInAppEventType();
            AFInAppEventParameterName().afDebugLog().valueOf(new AFd1cSDK() { // from class: com.appsflyer.internal.d
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
        if (appsFlyerConversionListener == null) {
            str2 = "null";
        } else {
            onAttributionFailure = (onConversionDataFail + 105) % 128;
            str2 = "conversionDataListener";
        }
        afErrorLogForExcManagerOnly.AFInAppEventType("init", str, str2);
        AFLogger.AFInAppEventParameterName("Initializing AppsFlyer SDK: (v6.12.1." + valueOf + ")");
        this.AFInAppEventType = appsFlyerConversionListener;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if ((r3.getPackageManager().getApplicationInfo(r3.getPackageName(), 0).flags & 1) != 0) goto L12;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isPreInstalledApp(Context context) {
        int i = onAttributionFailure + 37;
        onConversionDataFail = i % 128;
        try {
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
        if (i % 2 == 0) {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags | 1) != 0) {
                return true;
            }
            onAttributionFailure = (onConversionDataFail + 121) % 128;
            return false;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        int i = onConversionDataFail + 79;
        onAttributionFailure = i % 128;
        int i2 = i % 2;
        AFe1xSDK AFVersionDeclaration = AFInAppEventParameterName().AFVersionDeclaration();
        if (i2 != 0) {
            AFVersionDeclaration.values();
            throw null;
        }
        boolean values2 = AFVersionDeclaration.values();
        onConversionDataFail = (onAttributionFailure + 89) % 128;
        return values2;
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
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.AFInAppEventType("Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFe1aSDK.AFInAppEventType(singletonMap);
        }
        aFe1aSDK.AFKeystoreWrapper = hashMap;
        AFb1wSDK afErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
        Map map2 = aFe1aSDK.AFKeystoreWrapper;
        if (map2 == null) {
            map2 = new HashMap();
        }
        afErrorLogForExcManagerOnly.AFInAppEventType("logEvent", str, new JSONObject(map2).toString());
        if (str == null) {
            AFInAppEventType(context, AFe1nSDK.logEvent);
        }
        values(aFe1aSDK, context instanceof Activity ? (Activity) context : null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        valueOf(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        onConversionDataFail = (onAttributionFailure + 79) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        onConversionDataFail = (onAttributionFailure + 73) % 128;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("logSession", new String[0]);
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().values();
        AFInAppEventType(context, AFe1nSDK.logSession);
        valueOf(context, (String) null, (Map<String, Object>) null);
        int i = onAttributionFailure + 111;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = onAttributionFailure + 69;
        onConversionDataFail = i % 128;
        int i2 = i % 2;
        AFInAppEventParameterName().onDeepLinkingNative().valueOf(context);
        if (i2 == 0) {
            throw null;
        }
        int i3 = onAttributionFailure + 119;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        int i = onConversionDataFail + 11;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (uri == null || uri.toString().isEmpty()) {
            AFb1uSDK init = AFInAppEventParameterName().init();
            StringBuilder sb = new StringBuilder("Link is \"");
            sb.append(uri);
            sb.append("\"");
            init.AFInAppEventType(sb.toString(), DeepLinkResult.Error.NETWORK);
            onConversionDataFail = (onAttributionFailure + 61) % 128;
            return;
        }
        if (context != null) {
            AFInAppEventParameterName().init().AFInAppEventType(context, new HashMap(), Uri.parse(uri.toString()));
            onAttributionFailure = (onConversionDataFail + 23) % 128;
            return;
        }
        AFb1uSDK init2 = AFInAppEventParameterName().init();
        StringBuilder sb2 = new StringBuilder("Context is \"");
        sb2.append(context);
        sb2.append("\"");
        init2.AFInAppEventType(sb2.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(Intent intent, Context context) {
        if (intent == null) {
            int i = onAttributionFailure + 35;
            onConversionDataFail = i % 128;
            if (i % 2 != 0) {
                AFInAppEventParameterName().init().AFInAppEventType("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                AFInAppEventParameterName().init().AFInAppEventType("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                throw null;
            }
        }
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            AFInAppEventType(applicationContext);
            AFInAppEventParameterName().valueOf().execute(new s50(this, applicationContext, intent, 8));
            return;
        }
        int i2 = onAttributionFailure + 125;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName().init().AFInAppEventType("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else {
            AFInAppEventParameterName().init().AFInAppEventType("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            int i3 = 29 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = onAttributionFailure + 111;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("registerConversionListener", new String[0]);
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("registerConversionListener", new String[0]);
        }
        AFInAppEventParameterName(appsFlyerConversionListener);
        onAttributionFailure = (onConversionDataFail + 73) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0045, code lost:
    
        com.appsflyer.internal.AFa1dSDK.AFInAppEventParameterName = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
        com.appsflyer.internal.AFa1dSDK.onConversionDataFail = (com.appsflyer.internal.AFa1dSDK.onAttributionFailure + 51) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i = onConversionDataFail + 81;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("registerValidatorListener", new String[1]);
            AFLogger.afDebugLog("registerValidatorListener called");
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("registerValidatorListener", new String[0]);
            AFLogger.afDebugLog("registerValidatorListener called");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdImpression(Context context, Map<String, Object> map) {
        int AFKeystoreWrapper2 = AFKeystoreWrapper(valueOf(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adimpression_counter", Integer.valueOf(AFKeystoreWrapper2));
        AFInAppEventType(context, hashMap, new AFe1jSDK());
        onConversionDataFail = (onAttributionFailure + 117) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int AFInAppEventParameterName2 = AFInAppEventParameterName(valueOf(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adrevenue_counter", Integer.valueOf(AFInAppEventParameterName2));
        AFInAppEventType(context, hashMap, new AFe1gSDK());
        onConversionDataFail = (onAttributionFailure + 25) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r3 = new com.appsflyer.internal.AFd1kSDK(r4, r5, r2.valueOf);
        r2 = r2.AFInAppEventParameterName;
        r2.AFKeystoreWrapper.execute(new com.appsflyer.internal.AFd1tSDK.AnonymousClass5(r2, r3));
        com.appsflyer.internal.AFa1dSDK.onConversionDataFail = (com.appsflyer.internal.AFa1dSDK.onAttributionFailure + 3) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r2.AFInAppEventParameterName(r4, r5, "purchases") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r2.AFInAppEventParameterName(r4, r5, r3) != false) goto L9;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler afInfoLog;
        int i = onAttributionFailure + 117;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            AFInAppEventType(context);
            afInfoLog = AFInAppEventParameterName().afInfoLog();
            String[] strArr = new String[0];
            strArr[1] = "purchases";
        } else {
            AFInAppEventType(context);
            afInfoLog = AFInAppEventParameterName().afInfoLog();
        }
        int i2 = onAttributionFailure + 33;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        onAttributionFailure = (onConversionDataFail + 69) % 128;
        AFInAppEventType(context);
        PurchaseHandler afInfoLog = AFInAppEventParameterName().afInfoLog();
        if (afInfoLog.AFInAppEventParameterName(map, purchaseValidationCallback, "subscriptions")) {
            AFd1pSDK aFd1pSDK = new AFd1pSDK(map, purchaseValidationCallback, afInfoLog.valueOf);
            AFd1tSDK aFd1tSDK = afInfoLog.AFInAppEventParameterName;
            aFd1tSDK.AFKeystoreWrapper.execute(aFd1tSDK.new AnonymousClass5(aFd1pSDK));
        }
        onConversionDataFail = (onAttributionFailure + 5) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0097  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        String valueOf2;
        long j;
        if (activity != null) {
            onAttributionFailure = (onConversionDataFail + 49) % 128;
            if (activity.getIntent() != null) {
                AFb1wSDK afErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
                String localClassName = activity.getLocalClassName();
                StringBuilder sb = new StringBuilder("activity_intent_");
                sb.append(activity.getIntent().toString());
                afErrorLogForExcManagerOnly.AFInAppEventType("sendPushNotificationData", localClassName, sb.toString());
                valueOf2 = valueOf(activity);
                this.AFLogger$LogLevel = valueOf2;
                if (valueOf2 == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (this.afErrorLogForExcManagerOnly == null) {
                        AFLogger.afInfoLog("pushes: initializing pushes history..");
                        this.afErrorLogForExcManagerOnly = new ConcurrentHashMap();
                        j = currentTimeMillis;
                    } else {
                        try {
                            long j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                            j = currentTimeMillis;
                            for (Long l : this.afErrorLogForExcManagerOnly.keySet()) {
                                try {
                                    JSONObject jSONObject = new JSONObject(this.AFLogger$LogLevel);
                                    JSONObject jSONObject2 = new JSONObject(this.afErrorLogForExcManagerOnly.get(l));
                                    if (jSONObject.opt("pid").equals(jSONObject2.opt("pid"))) {
                                        onConversionDataFail = (onAttributionFailure + 23) % 128;
                                        if (jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                            StringBuilder sb2 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                            sb2.append(jSONObject2);
                                            sb2.append(", new: ");
                                            sb2.append(jSONObject);
                                            sb2.append(")");
                                            AFLogger.afInfoLog(sb2.toString());
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
                                } catch (Throwable th) {
                                    th = th;
                                    AFLogger.afErrorLog("Error while handling push notification measurement: ".concat(th.getClass().getSimpleName()), th);
                                    if (this.afErrorLogForExcManagerOnly.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                                    }
                                    this.afErrorLogForExcManagerOnly.put(Long.valueOf(currentTimeMillis), this.AFLogger$LogLevel);
                                    start(activity);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j = currentTimeMillis;
                        }
                    }
                    if (this.afErrorLogForExcManagerOnly.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                        StringBuilder sb3 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                        sb3.append(j);
                        sb3.append(")");
                        AFLogger.afInfoLog(sb3.toString());
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
            int i = onConversionDataFail + 31;
            onAttributionFailure = i % 128;
            if (i % 2 != 0) {
                AFb1wSDK afErrorLogForExcManagerOnly2 = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
                String[] strArr = new String[3];
                strArr[1] = activity.getLocalClassName();
                strArr[1] = "activity_intent_null";
                afErrorLogForExcManagerOnly2.AFInAppEventType("sendPushNotificationData", strArr);
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
    public final void setAdditionalData(Map<String, Object> map) {
        onAttributionFailure = (onConversionDataFail + 43) % 128;
        if (map != null) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            onConversionDataFail = (onAttributionFailure + 5) % 128;
        }
        onAttributionFailure = (onConversionDataFail + 55) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        onAttributionFailure = (onConversionDataFail + 69) % 128;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setAndroidIdData", str);
        this.afInfoLog = str;
        int i = onConversionDataFail + 123;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        onConversionDataFail = (onAttributionFailure + 77) % 128;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setAppId", str);
        AFKeystoreWrapper(AppsFlyerProperties.APP_ID, str);
        onConversionDataFail = (onAttributionFailure + 19) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        onAttributionFailure = (onConversionDataFail + 113) % 128;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        AFKeystoreWrapper(AppsFlyerProperties.ONELINK_ID, str);
        int i = onConversionDataFail + 97;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        onConversionDataFail = (onAttributionFailure + 19) % 128;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCollectAndroidID", String.valueOf(z));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        onAttributionFailure = (onConversionDataFail + 121) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        onConversionDataFail = (onAttributionFailure + 83) % 128;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCollectIMEI", String.valueOf(z));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        int i = onAttributionFailure + 81;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            int i2 = 9 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        int i = onAttributionFailure + 23;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCollectOaid", String.valueOf(z));
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCollectOaid", String.valueOf(z));
        }
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        int i2 = onAttributionFailure + 101;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        onConversionDataFail = (onAttributionFailure + 97) % 128;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        onAttributionFailure = (onConversionDataFail + 77) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        String str2;
        int i = onAttributionFailure + 13;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (context != null) {
            if (!AFKeystoreWrapper()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                onConversionDataFail = (onAttributionFailure + 31) % 128;
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().AFKeystoreWrapper());
            AFInAppEventType(context, AFe1nSDK.setCustomerIdAndLogSession);
            String str3 = AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType;
            if (referrer == null) {
                int i2 = onConversionDataFail + 29;
                onAttributionFailure = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 80 / 0;
                }
                str2 = BuildConfig.FLAVOR;
            } else {
                str2 = referrer;
            }
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
            }
            AFKeystoreWrapper(context, null, null, str2, null);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        onConversionDataFail = (onAttributionFailure + 99) % 128;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFKeystoreWrapper(AppsFlyerProperties.APP_USER_ID, str);
        AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i = onConversionDataFail + 63;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if ((r0 % 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r4 = com.appsflyer.AFLogger.LogLevel.DEBUG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r3 = com.appsflyer.AFLogger.LogLevel.NONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0013, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        r4 = com.appsflyer.AFLogger.LogLevel.NONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        r0 = r0 + 101;
        com.appsflyer.internal.AFa1dSDK.onAttributionFailure = r0 % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        int i = onConversionDataFail;
        int i2 = i + 115;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
        setLogLevel(logLevel);
        onConversionDataFail = (onAttributionFailure + 75) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        int i = onAttributionFailure + 3;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
            throw null;
        }
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        AFa1bSDK.valueOf = Boolean.valueOf(!z);
        AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
        AppsFlyerProperties.getInstance().remove("advertiserId");
        onAttributionFailure = (onConversionDataFail + 15) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        int i = onAttributionFailure + 113;
        onConversionDataFail = i % 128;
        if (i % 2 != 0) {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
            AFKeystoreWrapper(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
        } else {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
            AFKeystoreWrapper(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        onAttributionFailure = (onConversionDataFail + 45) % 128;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i = onConversionDataFail + 53;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String str3;
        if (AFb1vSDK.valueOf(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i = onConversionDataFail;
        int i2 = (i + 49) % 128;
        onAttributionFailure = i2;
        if (str != null) {
            onAttributionFailure = (i + 27) % 128;
            str3 = str.trim();
        } else {
            onConversionDataFail = (i2 + 109) % 128;
            str3 = BuildConfig.FLAVOR;
        }
        AFc1cSDK.AFInAppEventType(new AFc1dSDK(str3, str2.trim()));
        onAttributionFailure = (onConversionDataFail + 33) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i = onConversionDataFail + 119;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            AFb1wSDK afErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
            String[] strArr = new String[1];
            strArr[1] = str;
            afErrorLogForExcManagerOnly.AFInAppEventType("setImeiData", strArr);
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setImeiData", str);
        }
        AFInAppEventParameterName().AFVersionDeclaration().valueOf = str;
        int i2 = onAttributionFailure + 81;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        onAttributionFailure = (onConversionDataFail + 7) % 128;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i = onConversionDataFail + 11;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z;
        onAttributionFailure = (onConversionDataFail + 87) % 128;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            onAttributionFailure = (onConversionDataFail + 89) % 128;
            z = true;
        } else {
            z = false;
        }
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        onConversionDataFail = (onAttributionFailure + 9) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        onAttributionFailure = (onConversionDataFail + 91) % 128;
        this.getLevel = TimeUnit.SECONDS.toMillis(i);
        int i2 = onConversionDataFail + 79;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i = onConversionDataFail + 15;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
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
    public final void setOneLinkCustomDomain(String... strArr) {
        String str;
        int i = onAttributionFailure + 111;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[1] = Arrays.toString(strArr);
            str = String.format("setOneLinkCustomDomain %s", objArr);
        } else {
            str = "setOneLinkCustomDomain " + Arrays.toString(strArr);
        }
        AFLogger.afDebugLog(str);
        AFInAppEventParameterName().init().afInfoLog = strArr;
        int i2 = onAttributionFailure + 65;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i = onConversionDataFail + 23;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (str == null) {
            AFLogger.AFInAppEventType("Cannot set setOutOfStore with null");
            int i2 = onAttributionFailure + 97;
            onConversionDataFail = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        int i3 = onAttributionFailure + 115;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        String concat;
        onAttributionFailure = (onConversionDataFail + 73) % 128;
        if (this.onResponseErrorNative == null) {
            this.onResponseErrorNative = new AFb1hSDK();
        }
        AFb1hSDK aFb1hSDK = this.onResponseErrorNative;
        if (str == null || str.isEmpty()) {
            AFLogger.afWarnLog("Partner ID is missing or `null`");
            return;
        }
        if (map == null || map.isEmpty()) {
            if (aFb1hSDK.AFInAppEventParameterName.remove(str) == null) {
                onConversionDataFail = (onAttributionFailure + 97) % 128;
                concat = "Partner data is missing or `null`";
            } else {
                concat = "Cleared partner data for ".concat(str);
            }
            AFLogger.afWarnLog(concat);
            return;
        }
        StringBuilder sb = new StringBuilder("Setting partner data for ");
        sb.append(str);
        sb.append(": ");
        sb.append(map);
        AFLogger.afDebugLog(sb.toString());
        int length = new JSONObject(map).toString().length();
        if (length > 1000) {
            AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
            HashMap hashMap = new HashMap();
            hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
            aFb1hSDK.AFInAppEventType.put(str, hashMap);
            return;
        }
        aFb1hSDK.AFInAppEventParameterName.put(str, map);
        aFb1hSDK.AFInAppEventType.remove(str);
        int i = onConversionDataFail + 121;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i = onAttributionFailure + 81;
        onConversionDataFail = i % 128;
        int i2 = i % 2;
        this.onResponseNative = AFb1zSDK.AFInAppEventParameterName(str);
        if (i2 == 0) {
            throw null;
        }
        int i3 = onConversionDataFail + 101;
        onAttributionFailure = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        int i = onConversionDataFail + 9;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            Objects.requireNonNull(pluginInfo);
            AFInAppEventParameterName().onInstallConversionFailureNative().values(pluginInfo);
            throw null;
        }
        Objects.requireNonNull(pluginInfo);
        AFInAppEventParameterName().onInstallConversionFailureNative().values(pluginInfo);
        int i2 = onAttributionFailure + 109;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if (str != null) {
                int i = onConversionDataFail + 37;
                onAttributionFailure = i % 128;
                if (i % 2 != 0) {
                    jSONObject.put("pid", str);
                    int i2 = 49 / 0;
                } else {
                    jSONObject.put("pid", str);
                }
            }
            if (str2 != null) {
                int i3 = onAttributionFailure + 1;
                onConversionDataFail = i3 % 128;
                if (i3 % 2 == 0) {
                    jSONObject.put("c", str2);
                    int i4 = 65 / 0;
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
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            return;
        }
        int i5 = onConversionDataFail + 95;
        onAttributionFailure = i5 % 128;
        if (i5 % 2 == 0) {
            AFKeystoreWrapper("preInstallName", jSONObject.toString());
        } else {
            AFKeystoreWrapper("preInstallName", jSONObject.toString());
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        onConversionDataFail = (onAttributionFailure + 71) % 128;
        AFLogger.afDebugLog("setResolveDeepLinkURLs " + Arrays.toString(strArr));
        AFb1uSDK init = AFInAppEventParameterName().init();
        init.afDebugLog.clear();
        init.afDebugLog.addAll(Arrays.asList(strArr));
        int i = onConversionDataFail + 79;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        onAttributionFailure = (onConversionDataFail + 55) % 128;
        setSharingFilterForPartners(strArr);
        int i = onConversionDataFail + 47;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            int i2 = 30 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = onConversionDataFail + 41;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            String[] strArr = new String[0];
            strArr[0] = "all";
            setSharingFilterForPartners(strArr);
        } else {
            setSharingFilterForPartners("all");
        }
        onAttributionFailure = (onConversionDataFail + 51) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        this.afDebugLog = new AFa1bSDK(strArr);
        int i = onAttributionFailure + 65;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        onAttributionFailure = (onConversionDataFail + 47) % 128;
        String str = null;
        for (String str2 : strArr) {
            if (AnonymousClass2.AFInAppEventParameterName[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFb1zSDK.AFInAppEventParameterName(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                onAttributionFailure = (onConversionDataFail + 21) % 128;
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (AFInAppEventParameterName().onDeepLinkingNative().AFKeystoreWrapper()) {
            return;
        }
        if (!this.init) {
            onAttributionFailure = (onConversionDataFail + 17) % 128;
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
        AFLogger.afInfoLog("Starting AppsFlyer: (v6.12.1." + str2 + ")");
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str2);
        AFLogger.afInfoLog(sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(AFInAppEventParameterName().AFKeystoreWrapper());
        if (!TextUtils.isEmpty(str)) {
            int i = onAttributionFailure + 87;
            onConversionDataFail = i % 128;
            if (i % 2 == 0) {
                AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType = str;
                AFc1pSDK.AFInAppEventParameterName(str);
                int i2 = 66 / 0;
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
            onConversionDataFail = (onAttributionFailure + 77) % 128;
            AFInAppEventParameterName(this.onInstallConversionFailureNative.getApplicationContext());
        }
        this.onAppOpenAttribution.onDeepLinkingNative().AFInAppEventParameterName(context, new AFb1iSDK.AFa1wSDK() { // from class: com.appsflyer.internal.AFa1dSDK.5
            @Override // com.appsflyer.internal.AFb1iSDK.AFa1wSDK
            public final void AFKeystoreWrapper(Context context2) {
                AFLogger.afInfoLog("onBecameBackground");
                AFe1lSDK aFe1lSDK = AFLogger;
                long currentTimeMillis = System.currentTimeMillis();
                long j = aFe1lSDK.afDebugLog;
                if (j != 0) {
                    long j2 = currentTimeMillis - j;
                    if (j2 > 0 && j2 < 1000) {
                        j2 = 1000;
                    }
                    long j3 = j2 / 1000;
                    aFe1lSDK.afErrorLogForExcManagerOnly = j3;
                    aFe1lSDK.AFKeystoreWrapper.AFInAppEventType("prev_session_dur", j3);
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
        });
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        AFInAppEventType(context);
        AFc1zSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFInAppEventParameterName2.AFVersionDeclaration().values = z;
        AFInAppEventParameterName2.valueOf().submit(new c(0, AFInAppEventParameterName2));
        if (z) {
            onAttributionFailure = (onConversionDataFail + 17) % 128;
            AFInAppEventParameterName2.AFKeystoreWrapper().valueOf("is_stop_tracking_used", true);
            onAttributionFailure = (onConversionDataFail + 65) % 128;
        }
        onAttributionFailure = (onConversionDataFail + 57) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        int i = onAttributionFailure + 77;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            AFInAppEventParameterName().init().valueOf = deepLinkListener;
            AFInAppEventParameterName().init().afRDLog = j;
            throw null;
        }
        AFInAppEventParameterName().init().valueOf = deepLinkListener;
        AFInAppEventParameterName().init().afRDLog = j;
        onAttributionFailure = (onConversionDataFail + 125) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = onConversionDataFail + 63;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("unregisterConversionListener", new String[0]);
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("unregisterConversionListener", new String[0]);
        }
        this.AFInAppEventType = null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        AFInAppEventType(context);
        AFe1sSDK aFe1sSDK = new AFe1sSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.afWarnLog("[register] Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.afInfoLog("[register] Firebase Refreshed Token = ".concat(str));
        AFb1oSDK AFKeystoreWrapper2 = aFe1sSDK.AFKeystoreWrapper();
        if (AFKeystoreWrapper2 == null || !str.equals(AFKeystoreWrapper2.AFKeystoreWrapper)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = AFKeystoreWrapper2 == null || currentTimeMillis - AFKeystoreWrapper2.values > 2000;
            AFb1oSDK aFb1oSDK = new AFb1oSDK(str, currentTimeMillis, !z);
            aFe1sSDK.values.values("afUninstallToken", aFb1oSDK.AFKeystoreWrapper);
            aFe1sSDK.values.AFInAppEventType("afUninstallToken_received_time", aFb1oSDK.values);
            aFe1sSDK.values.valueOf("afUninstallToken_queued", aFb1oSDK.valueOf());
            if (z) {
                AFe1sSDK.AFKeystoreWrapper(str);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, map == null ? BuildConfig.FLAVOR : map.toString());
        if (!isStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str5);
            AFLogger.afInfoLog(sb.toString());
        }
        if (str != null && str4 != null && str2 != null && str5 != null && str3 != null) {
            new Thread(new AFa1kSDK(context.getApplicationContext(), AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType, str, str2, str3, str4, str5, map, context instanceof Activity ? ((Activity) context).getIntent() : null)).start();
            return;
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFInAppEventParameterName;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0420 A[Catch: all -> 0x00be, Exception -> 0x0426, TRY_LEAVE, TryCatch #10 {Exception -> 0x0426, blocks: (B:132:0x040a, B:134:0x0420), top: B:131:0x040a, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04c0 A[Catch: all -> 0x04ca, TryCatch #4 {all -> 0x04ca, blocks: (B:148:0x04a9, B:152:0x04bc, B:154:0x04c0, B:155:0x04d0), top: B:147:0x04a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058a A[Catch: all -> 0x00be, TryCatch #12 {all -> 0x00be, blocks: (B:13:0x00ac, B:15:0x00b2, B:18:0x00c2, B:19:0x00d2, B:21:0x00dd, B:23:0x00f9, B:24:0x0101, B:26:0x0109, B:27:0x010e, B:29:0x0114, B:31:0x011c, B:33:0x0127, B:35:0x01a6, B:37:0x01ac, B:39:0x01b2, B:40:0x01c9, B:42:0x01d6, B:44:0x01dd, B:45:0x01e4, B:47:0x01ea, B:48:0x01f1, B:50:0x0208, B:51:0x020d, B:54:0x0215, B:55:0x0218, B:57:0x021e, B:58:0x0221, B:60:0x0233, B:62:0x0239, B:63:0x023c, B:65:0x0244, B:66:0x024d, B:68:0x0251, B:71:0x025b, B:72:0x0260, B:74:0x0268, B:75:0x027c, B:78:0x028c, B:80:0x0292, B:81:0x029c, B:83:0x02a4, B:84:0x02a9, B:86:0x02bc, B:88:0x02c2, B:89:0x02c5, B:91:0x02db, B:93:0x02e5, B:94:0x02ea, B:96:0x02f0, B:97:0x02fd, B:99:0x0303, B:100:0x0310, B:102:0x0316, B:105:0x0327, B:107:0x032d, B:108:0x0346, B:110:0x034c, B:111:0x0351, B:113:0x0359, B:115:0x0372, B:116:0x037c, B:118:0x0382, B:119:0x038b, B:121:0x0393, B:123:0x039a, B:124:0x03b0, B:125:0x03b5, B:127:0x03bd, B:128:0x03c2, B:237:0x0400, B:130:0x0405, B:132:0x040a, B:134:0x0420, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:144:0x047b, B:146:0x048a, B:162:0x056d, B:164:0x058a, B:166:0x0593, B:168:0x0597, B:170:0x059f, B:171:0x05a6, B:173:0x05bc, B:175:0x05cf, B:205:0x05d8, B:177:0x0603, B:179:0x0609, B:182:0x0617, B:184:0x061e, B:186:0x0628, B:187:0x063a, B:190:0x0659, B:193:0x0669, B:194:0x066b, B:196:0x06ad, B:197:0x06ba, B:199:0x070d, B:201:0x0711, B:208:0x05e9, B:211:0x0567, B:223:0x04a4, B:226:0x0475, B:229:0x045f, B:231:0x044b, B:233:0x0427, B:245:0x03ef, B:241:0x03f4, B:246:0x035f, B:248:0x0367, B:249:0x0331, B:251:0x033d, B:253:0x0343, B:254:0x0717, B:258:0x0279, B:261:0x0122, B:263:0x00cd, B:235:0x03d8), top: B:12:0x00ac, inners: #2, #5, #7, #8, #9, #10, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0593 A[Catch: all -> 0x00be, TryCatch #12 {all -> 0x00be, blocks: (B:13:0x00ac, B:15:0x00b2, B:18:0x00c2, B:19:0x00d2, B:21:0x00dd, B:23:0x00f9, B:24:0x0101, B:26:0x0109, B:27:0x010e, B:29:0x0114, B:31:0x011c, B:33:0x0127, B:35:0x01a6, B:37:0x01ac, B:39:0x01b2, B:40:0x01c9, B:42:0x01d6, B:44:0x01dd, B:45:0x01e4, B:47:0x01ea, B:48:0x01f1, B:50:0x0208, B:51:0x020d, B:54:0x0215, B:55:0x0218, B:57:0x021e, B:58:0x0221, B:60:0x0233, B:62:0x0239, B:63:0x023c, B:65:0x0244, B:66:0x024d, B:68:0x0251, B:71:0x025b, B:72:0x0260, B:74:0x0268, B:75:0x027c, B:78:0x028c, B:80:0x0292, B:81:0x029c, B:83:0x02a4, B:84:0x02a9, B:86:0x02bc, B:88:0x02c2, B:89:0x02c5, B:91:0x02db, B:93:0x02e5, B:94:0x02ea, B:96:0x02f0, B:97:0x02fd, B:99:0x0303, B:100:0x0310, B:102:0x0316, B:105:0x0327, B:107:0x032d, B:108:0x0346, B:110:0x034c, B:111:0x0351, B:113:0x0359, B:115:0x0372, B:116:0x037c, B:118:0x0382, B:119:0x038b, B:121:0x0393, B:123:0x039a, B:124:0x03b0, B:125:0x03b5, B:127:0x03bd, B:128:0x03c2, B:237:0x0400, B:130:0x0405, B:132:0x040a, B:134:0x0420, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:144:0x047b, B:146:0x048a, B:162:0x056d, B:164:0x058a, B:166:0x0593, B:168:0x0597, B:170:0x059f, B:171:0x05a6, B:173:0x05bc, B:175:0x05cf, B:205:0x05d8, B:177:0x0603, B:179:0x0609, B:182:0x0617, B:184:0x061e, B:186:0x0628, B:187:0x063a, B:190:0x0659, B:193:0x0669, B:194:0x066b, B:196:0x06ad, B:197:0x06ba, B:199:0x070d, B:201:0x0711, B:208:0x05e9, B:211:0x0567, B:223:0x04a4, B:226:0x0475, B:229:0x045f, B:231:0x044b, B:233:0x0427, B:245:0x03ef, B:241:0x03f4, B:246:0x035f, B:248:0x0367, B:249:0x0331, B:251:0x033d, B:253:0x0343, B:254:0x0717, B:258:0x0279, B:261:0x0122, B:263:0x00cd, B:235:0x03d8), top: B:12:0x00ac, inners: #2, #5, #7, #8, #9, #10, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0609 A[Catch: all -> 0x00be, TryCatch #12 {all -> 0x00be, blocks: (B:13:0x00ac, B:15:0x00b2, B:18:0x00c2, B:19:0x00d2, B:21:0x00dd, B:23:0x00f9, B:24:0x0101, B:26:0x0109, B:27:0x010e, B:29:0x0114, B:31:0x011c, B:33:0x0127, B:35:0x01a6, B:37:0x01ac, B:39:0x01b2, B:40:0x01c9, B:42:0x01d6, B:44:0x01dd, B:45:0x01e4, B:47:0x01ea, B:48:0x01f1, B:50:0x0208, B:51:0x020d, B:54:0x0215, B:55:0x0218, B:57:0x021e, B:58:0x0221, B:60:0x0233, B:62:0x0239, B:63:0x023c, B:65:0x0244, B:66:0x024d, B:68:0x0251, B:71:0x025b, B:72:0x0260, B:74:0x0268, B:75:0x027c, B:78:0x028c, B:80:0x0292, B:81:0x029c, B:83:0x02a4, B:84:0x02a9, B:86:0x02bc, B:88:0x02c2, B:89:0x02c5, B:91:0x02db, B:93:0x02e5, B:94:0x02ea, B:96:0x02f0, B:97:0x02fd, B:99:0x0303, B:100:0x0310, B:102:0x0316, B:105:0x0327, B:107:0x032d, B:108:0x0346, B:110:0x034c, B:111:0x0351, B:113:0x0359, B:115:0x0372, B:116:0x037c, B:118:0x0382, B:119:0x038b, B:121:0x0393, B:123:0x039a, B:124:0x03b0, B:125:0x03b5, B:127:0x03bd, B:128:0x03c2, B:237:0x0400, B:130:0x0405, B:132:0x040a, B:134:0x0420, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:144:0x047b, B:146:0x048a, B:162:0x056d, B:164:0x058a, B:166:0x0593, B:168:0x0597, B:170:0x059f, B:171:0x05a6, B:173:0x05bc, B:175:0x05cf, B:205:0x05d8, B:177:0x0603, B:179:0x0609, B:182:0x0617, B:184:0x061e, B:186:0x0628, B:187:0x063a, B:190:0x0659, B:193:0x0669, B:194:0x066b, B:196:0x06ad, B:197:0x06ba, B:199:0x070d, B:201:0x0711, B:208:0x05e9, B:211:0x0567, B:223:0x04a4, B:226:0x0475, B:229:0x045f, B:231:0x044b, B:233:0x0427, B:245:0x03ef, B:241:0x03f4, B:246:0x035f, B:248:0x0367, B:249:0x0331, B:251:0x033d, B:253:0x0343, B:254:0x0717, B:258:0x0279, B:261:0x0122, B:263:0x00cd, B:235:0x03d8), top: B:12:0x00ac, inners: #2, #5, #7, #8, #9, #10, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0628 A[Catch: all -> 0x00be, TryCatch #12 {all -> 0x00be, blocks: (B:13:0x00ac, B:15:0x00b2, B:18:0x00c2, B:19:0x00d2, B:21:0x00dd, B:23:0x00f9, B:24:0x0101, B:26:0x0109, B:27:0x010e, B:29:0x0114, B:31:0x011c, B:33:0x0127, B:35:0x01a6, B:37:0x01ac, B:39:0x01b2, B:40:0x01c9, B:42:0x01d6, B:44:0x01dd, B:45:0x01e4, B:47:0x01ea, B:48:0x01f1, B:50:0x0208, B:51:0x020d, B:54:0x0215, B:55:0x0218, B:57:0x021e, B:58:0x0221, B:60:0x0233, B:62:0x0239, B:63:0x023c, B:65:0x0244, B:66:0x024d, B:68:0x0251, B:71:0x025b, B:72:0x0260, B:74:0x0268, B:75:0x027c, B:78:0x028c, B:80:0x0292, B:81:0x029c, B:83:0x02a4, B:84:0x02a9, B:86:0x02bc, B:88:0x02c2, B:89:0x02c5, B:91:0x02db, B:93:0x02e5, B:94:0x02ea, B:96:0x02f0, B:97:0x02fd, B:99:0x0303, B:100:0x0310, B:102:0x0316, B:105:0x0327, B:107:0x032d, B:108:0x0346, B:110:0x034c, B:111:0x0351, B:113:0x0359, B:115:0x0372, B:116:0x037c, B:118:0x0382, B:119:0x038b, B:121:0x0393, B:123:0x039a, B:124:0x03b0, B:125:0x03b5, B:127:0x03bd, B:128:0x03c2, B:237:0x0400, B:130:0x0405, B:132:0x040a, B:134:0x0420, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:144:0x047b, B:146:0x048a, B:162:0x056d, B:164:0x058a, B:166:0x0593, B:168:0x0597, B:170:0x059f, B:171:0x05a6, B:173:0x05bc, B:175:0x05cf, B:205:0x05d8, B:177:0x0603, B:179:0x0609, B:182:0x0617, B:184:0x061e, B:186:0x0628, B:187:0x063a, B:190:0x0659, B:193:0x0669, B:194:0x066b, B:196:0x06ad, B:197:0x06ba, B:199:0x070d, B:201:0x0711, B:208:0x05e9, B:211:0x0567, B:223:0x04a4, B:226:0x0475, B:229:0x045f, B:231:0x044b, B:233:0x0427, B:245:0x03ef, B:241:0x03f4, B:246:0x035f, B:248:0x0367, B:249:0x0331, B:251:0x033d, B:253:0x0343, B:254:0x0717, B:258:0x0279, B:261:0x0122, B:263:0x00cd, B:235:0x03d8), top: B:12:0x00ac, inners: #2, #5, #7, #8, #9, #10, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0667 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x06ad A[Catch: all -> 0x00be, TryCatch #12 {all -> 0x00be, blocks: (B:13:0x00ac, B:15:0x00b2, B:18:0x00c2, B:19:0x00d2, B:21:0x00dd, B:23:0x00f9, B:24:0x0101, B:26:0x0109, B:27:0x010e, B:29:0x0114, B:31:0x011c, B:33:0x0127, B:35:0x01a6, B:37:0x01ac, B:39:0x01b2, B:40:0x01c9, B:42:0x01d6, B:44:0x01dd, B:45:0x01e4, B:47:0x01ea, B:48:0x01f1, B:50:0x0208, B:51:0x020d, B:54:0x0215, B:55:0x0218, B:57:0x021e, B:58:0x0221, B:60:0x0233, B:62:0x0239, B:63:0x023c, B:65:0x0244, B:66:0x024d, B:68:0x0251, B:71:0x025b, B:72:0x0260, B:74:0x0268, B:75:0x027c, B:78:0x028c, B:80:0x0292, B:81:0x029c, B:83:0x02a4, B:84:0x02a9, B:86:0x02bc, B:88:0x02c2, B:89:0x02c5, B:91:0x02db, B:93:0x02e5, B:94:0x02ea, B:96:0x02f0, B:97:0x02fd, B:99:0x0303, B:100:0x0310, B:102:0x0316, B:105:0x0327, B:107:0x032d, B:108:0x0346, B:110:0x034c, B:111:0x0351, B:113:0x0359, B:115:0x0372, B:116:0x037c, B:118:0x0382, B:119:0x038b, B:121:0x0393, B:123:0x039a, B:124:0x03b0, B:125:0x03b5, B:127:0x03bd, B:128:0x03c2, B:237:0x0400, B:130:0x0405, B:132:0x040a, B:134:0x0420, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:144:0x047b, B:146:0x048a, B:162:0x056d, B:164:0x058a, B:166:0x0593, B:168:0x0597, B:170:0x059f, B:171:0x05a6, B:173:0x05bc, B:175:0x05cf, B:205:0x05d8, B:177:0x0603, B:179:0x0609, B:182:0x0617, B:184:0x061e, B:186:0x0628, B:187:0x063a, B:190:0x0659, B:193:0x0669, B:194:0x066b, B:196:0x06ad, B:197:0x06ba, B:199:0x070d, B:201:0x0711, B:208:0x05e9, B:211:0x0567, B:223:0x04a4, B:226:0x0475, B:229:0x045f, B:231:0x044b, B:233:0x0427, B:245:0x03ef, B:241:0x03f4, B:246:0x035f, B:248:0x0367, B:249:0x0331, B:251:0x033d, B:253:0x0343, B:254:0x0717, B:258:0x0279, B:261:0x0122, B:263:0x00cd, B:235:0x03d8), top: B:12:0x00ac, inners: #2, #5, #7, #8, #9, #10, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x070d A[Catch: all -> 0x00be, TryCatch #12 {all -> 0x00be, blocks: (B:13:0x00ac, B:15:0x00b2, B:18:0x00c2, B:19:0x00d2, B:21:0x00dd, B:23:0x00f9, B:24:0x0101, B:26:0x0109, B:27:0x010e, B:29:0x0114, B:31:0x011c, B:33:0x0127, B:35:0x01a6, B:37:0x01ac, B:39:0x01b2, B:40:0x01c9, B:42:0x01d6, B:44:0x01dd, B:45:0x01e4, B:47:0x01ea, B:48:0x01f1, B:50:0x0208, B:51:0x020d, B:54:0x0215, B:55:0x0218, B:57:0x021e, B:58:0x0221, B:60:0x0233, B:62:0x0239, B:63:0x023c, B:65:0x0244, B:66:0x024d, B:68:0x0251, B:71:0x025b, B:72:0x0260, B:74:0x0268, B:75:0x027c, B:78:0x028c, B:80:0x0292, B:81:0x029c, B:83:0x02a4, B:84:0x02a9, B:86:0x02bc, B:88:0x02c2, B:89:0x02c5, B:91:0x02db, B:93:0x02e5, B:94:0x02ea, B:96:0x02f0, B:97:0x02fd, B:99:0x0303, B:100:0x0310, B:102:0x0316, B:105:0x0327, B:107:0x032d, B:108:0x0346, B:110:0x034c, B:111:0x0351, B:113:0x0359, B:115:0x0372, B:116:0x037c, B:118:0x0382, B:119:0x038b, B:121:0x0393, B:123:0x039a, B:124:0x03b0, B:125:0x03b5, B:127:0x03bd, B:128:0x03c2, B:237:0x0400, B:130:0x0405, B:132:0x040a, B:134:0x0420, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:144:0x047b, B:146:0x048a, B:162:0x056d, B:164:0x058a, B:166:0x0593, B:168:0x0597, B:170:0x059f, B:171:0x05a6, B:173:0x05bc, B:175:0x05cf, B:205:0x05d8, B:177:0x0603, B:179:0x0609, B:182:0x0617, B:184:0x061e, B:186:0x0628, B:187:0x063a, B:190:0x0659, B:193:0x0669, B:194:0x066b, B:196:0x06ad, B:197:0x06ba, B:199:0x070d, B:201:0x0711, B:208:0x05e9, B:211:0x0567, B:223:0x04a4, B:226:0x0475, B:229:0x045f, B:231:0x044b, B:233:0x0427, B:245:0x03ef, B:241:0x03f4, B:246:0x035f, B:248:0x0367, B:249:0x0331, B:251:0x033d, B:253:0x0343, B:254:0x0717, B:258:0x0279, B:261:0x0122, B:263:0x00cd, B:235:0x03d8), top: B:12:0x00ac, inners: #2, #5, #7, #8, #9, #10, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0400 A[Catch: all -> 0x00be, TryCatch #12 {all -> 0x00be, blocks: (B:13:0x00ac, B:15:0x00b2, B:18:0x00c2, B:19:0x00d2, B:21:0x00dd, B:23:0x00f9, B:24:0x0101, B:26:0x0109, B:27:0x010e, B:29:0x0114, B:31:0x011c, B:33:0x0127, B:35:0x01a6, B:37:0x01ac, B:39:0x01b2, B:40:0x01c9, B:42:0x01d6, B:44:0x01dd, B:45:0x01e4, B:47:0x01ea, B:48:0x01f1, B:50:0x0208, B:51:0x020d, B:54:0x0215, B:55:0x0218, B:57:0x021e, B:58:0x0221, B:60:0x0233, B:62:0x0239, B:63:0x023c, B:65:0x0244, B:66:0x024d, B:68:0x0251, B:71:0x025b, B:72:0x0260, B:74:0x0268, B:75:0x027c, B:78:0x028c, B:80:0x0292, B:81:0x029c, B:83:0x02a4, B:84:0x02a9, B:86:0x02bc, B:88:0x02c2, B:89:0x02c5, B:91:0x02db, B:93:0x02e5, B:94:0x02ea, B:96:0x02f0, B:97:0x02fd, B:99:0x0303, B:100:0x0310, B:102:0x0316, B:105:0x0327, B:107:0x032d, B:108:0x0346, B:110:0x034c, B:111:0x0351, B:113:0x0359, B:115:0x0372, B:116:0x037c, B:118:0x0382, B:119:0x038b, B:121:0x0393, B:123:0x039a, B:124:0x03b0, B:125:0x03b5, B:127:0x03bd, B:128:0x03c2, B:237:0x0400, B:130:0x0405, B:132:0x040a, B:134:0x0420, B:137:0x043c, B:140:0x0450, B:142:0x0464, B:144:0x047b, B:146:0x048a, B:162:0x056d, B:164:0x058a, B:166:0x0593, B:168:0x0597, B:170:0x059f, B:171:0x05a6, B:173:0x05bc, B:175:0x05cf, B:205:0x05d8, B:177:0x0603, B:179:0x0609, B:182:0x0617, B:184:0x061e, B:186:0x0628, B:187:0x063a, B:190:0x0659, B:193:0x0669, B:194:0x066b, B:196:0x06ad, B:197:0x06ba, B:199:0x070d, B:201:0x0711, B:208:0x05e9, B:211:0x0567, B:223:0x04a4, B:226:0x0475, B:229:0x045f, B:231:0x044b, B:233:0x0427, B:245:0x03ef, B:241:0x03f4, B:246:0x035f, B:248:0x0367, B:249:0x0331, B:251:0x033d, B:253:0x0343, B:254:0x0717, B:258:0x0279, B:261:0x0122, B:263:0x00cd, B:235:0x03d8), top: B:12:0x00ac, inners: #2, #5, #7, #8, #9, #10, #11, #14 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> values(AFa1qSDK aFa1qSDK) {
        String str;
        AFe1tSDK afRDLog2;
        AppsFlyerProperties appsFlyerProperties;
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
        Map map = aFa1qSDK.AFKeystoreWrapper;
        if (map == null) {
            map = new HashMap();
        }
        String jSONObject = new JSONObject(map).toString();
        String str6 = aFa1qSDK.AFLogger;
        AFb1fSDK valueOf2 = valueOf(context);
        boolean values3 = aFa1qSDK.values();
        Map<String, ? extends Object> map2 = aFa1qSDK.AFInAppEventParameterName;
        AFa1bSDK.valueOf(context, map2);
        Boolean bool = AFa1bSDK.valueOf;
        if (bool == null || bool.booleanValue()) {
            str = "yyyy-MM-dd_HHmmssZ";
        } else {
            str = "yyyy-MM-dd_HHmmssZ";
            AFInAppEventParameterName(map2).put("ad_ids_disabled", Boolean.TRUE);
        }
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        AFInAppEventParameterName("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", false, new int[]{0, 12, 181, 5}, objArr);
        map2.put(((String) objArr[0]).intern(), Long.toString(time));
        String valueOf3 = AFb1eSDK.valueOf(context, time);
        if (valueOf3 != null) {
            map2.put("cksm_v1", valueOf3);
        }
        try {
            if (isStopped()) {
                AFLogger.afInfoLog("Reporting has been stopped");
            } else {
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                sb.append(values3 ? "Launch" : str5);
                AFLogger.afInfoLog(sb.toString());
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
            afRDLog2 = AFInAppEventParameterName().afRDLog();
            Object[] objArr2 = new Object[1];
            AFInAppEventParameterName("\u0001", true, new int[]{12, 1, 0, 1}, objArr2);
            map2.put("af_events_api", ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            AFInAppEventParameterName("\u0000\u0000\u0000\u0000\u0001", false, new int[]{13, 5, 164, 2}, objArr3);
            map2.put(((String) objArr3[0]).intern(), Build.BRAND);
            map2.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, Build.DEVICE);
            map2.put("product", Build.PRODUCT);
            map2.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, Integer.toString(Build.VERSION.SDK_INT));
            map2.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
            map2.put("deviceType", Build.TYPE);
            afRDLog2.AFKeystoreWrapper(map2);
            appsFlyerProperties = AppsFlyerProperties.getInstance();
            AFe1lSDK AFLogger = AFInAppEventParameterName().AFLogger();
            if (values3) {
                if (afRDLog2.afErrorLog()) {
                    if (!appsFlyerProperties.isOtherSdkStringDisabled()) {
                        map2.put("batteryLevel", String.valueOf(AFInAppEventParameterName().onConversionDataSuccess().AFInAppEventParameterName(context).AFKeystoreWrapper));
                    }
                    afDebugLog(context);
                    UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
                    if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                        map2.put("tv", Boolean.TRUE);
                    }
                    if (AFe1mSDK.AFInAppEventParameterName(context)) {
                        map2.put("inst_app", Boolean.TRUE);
                    }
                }
                map2.put("timepassedsincelastlaunch", Long.toString(afErrorLog(context)));
                afRDLog2.AFInAppEventType(map2);
                afRDLog2.values(map2);
                String str7 = this.onResponseNative;
                if (str7 != null) {
                    map2.put("phone", str7);
                }
                if (!TextUtils.isEmpty(str6)) {
                    map2.put("referrer", str6);
                }
                String valueOf4 = valueOf2.valueOf("extraReferrers", (String) null);
                if (valueOf4 != null) {
                    map2.put("extraReferrers", valueOf4);
                }
                String referrer = appsFlyerProperties.getReferrer(AFInAppEventParameterName().AFKeystoreWrapper());
                if (!TextUtils.isEmpty(referrer) && map2.get("referrer") == null) {
                    map2.put("referrer", referrer);
                }
                long j = AFLogger.afErrorLogForExcManagerOnly;
                if (j != 0) {
                    map2.put("prev_session_dur", Long.valueOf(j));
                }
                AFb1hSDK aFb1hSDK = this.onResponseErrorNative;
                if (aFb1hSDK != null) {
                    if (!aFb1hSDK.AFInAppEventParameterName.isEmpty()) {
                        map2.put("partner_data", aFb1hSDK.AFInAppEventParameterName);
                    }
                    if (!aFb1hSDK.AFInAppEventType.isEmpty()) {
                        AFInAppEventParameterName(map2).put("partner_data", aFb1hSDK.AFInAppEventType);
                        aFb1hSDK.AFInAppEventType = new HashMap();
                    }
                }
            } else {
                afRDLog2.AFKeystoreWrapper(map2, str5);
            }
            String valueOf5 = valueOf("KSAppsFlyerId");
            String valueOf6 = valueOf("KSAppsFlyerRICounter");
            if (valueOf5 != null && valueOf6 != null && Integer.parseInt(valueOf6) > 0) {
                map2.put("reinstallCounter", valueOf6);
                map2.put("originalAppsflyerId", valueOf5);
            }
            String valueOf7 = valueOf(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
            if (valueOf7 != null) {
                map2.put("customData", valueOf7);
            }
            map2.putAll(this.onAppOpenAttribution.afErrorLog().AFInAppEventType());
            String string = appsFlyerProperties.getString(AppsFlyerProperties.EXTENSION);
            if (string != null && string.length() > 0) {
                map2.put(AppsFlyerProperties.EXTENSION, string);
            }
            String AFKeystoreWrapper2 = AFInAppEventParameterName().AFInAppEventParameterName().AFKeystoreWrapper();
            String values4 = values(valueOf(context), AFKeystoreWrapper2);
            if ((values4 != null && !values4.equals(AFKeystoreWrapper2)) || (values4 == null && AFKeystoreWrapper2 != null)) {
                map2.put("af_latestchannel", AFKeystoreWrapper2);
            }
            String AFInAppEventParameterName3 = afRDLog2.AFInAppEventParameterName();
            if (AFInAppEventParameterName3 != null) {
                map2.put("af_installstore", AFInAppEventParameterName3.toLowerCase(Locale.getDefault()));
            }
            String afDebugLog = afRDLog2.afDebugLog();
            if (afDebugLog != null) {
                map2.put("af_preinstall_name", afDebugLog.toLowerCase(Locale.getDefault()));
            }
            String AFInAppEventType = afRDLog2.AFInAppEventType();
            if (AFInAppEventType != null) {
                map2.put("af_currentstore", AFInAppEventType.toLowerCase(Locale.getDefault()));
            }
            if (str4 == null || str4.length() <= 0) {
                String str8 = AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType;
                if (str8 == null || str8.length() <= 0) {
                    AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
                    AFLogger.afInfoLog("AppsFlyer will not track this event.");
                    return null;
                }
                map2.put("appsflyerKey", str8);
            } else {
                map2.put("appsflyerKey", str4);
            }
            String values5 = values();
            if (values5 != null) {
                map2.put("appUserId", values5);
            }
            String string2 = appsFlyerProperties.getString(AppsFlyerProperties.USER_EMAILS);
            if (string2 != null) {
                map2.put("user_emails", string2);
            } else {
                String valueOf8 = valueOf(AppsFlyerProperties.USER_EMAIL);
                if (valueOf8 != null) {
                    map2.put("sha1_el", AFb1zSDK.values(valueOf8));
                }
            }
            if (str5 != null) {
                map2.put("eventName", str5);
                map2.put("eventValue", jSONObject);
            }
            if (AFLogger() != null) {
                map2.put(AppsFlyerProperties.APP_ID, valueOf(AppsFlyerProperties.APP_ID));
            }
            String valueOf9 = valueOf(AppsFlyerProperties.CURRENCY_CODE);
            if (valueOf9 != null) {
                if (valueOf9.length() != 3) {
                    StringBuilder sb2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                    sb2.append(valueOf9);
                    sb2.append("' is not a legal value.");
                    AFLogger.afWarnLog(sb2.toString());
                }
                map2.put(FirebaseAnalytics.Param.CURRENCY, valueOf9);
            }
            String valueOf10 = valueOf(AppsFlyerProperties.IS_UPDATE);
            if (valueOf10 != null) {
                map2.put("isUpdate", valueOf10);
            }
            map2.put("af_preinstalled", Boolean.toString(isPreInstalledApp(context)));
            if (appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                try {
                    context.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                    str2 = getAttributionId(context);
                } catch (PackageManager.NameNotFoundException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("com.facebook.katana not found", e2, true);
                    AFLogger.afWarnLog("Exception while collecting facebook's attribution ID. ");
                    str2 = null;
                    if (str2 != null) {
                    }
                    afRDLog2.AFInAppEventType(map2, this.afInfoLog);
                    AFInAppEventParameterName2 = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper());
                    if (AFInAppEventParameterName2 != null) {
                    }
                    map2.put("lang", Locale.getDefault().getDisplayLanguage());
                    map2.put("lang_code", Locale.getDefault().getLanguage());
                    map2.put(UserDataStore.COUNTRY, Locale.getDefault().getCountry());
                    afRDLog2.values(map2, values3);
                    afRDLog2.valueOf(map2);
                    String str9 = str;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str9, Locale.US);
                    map2.put("installDate", values(simpleDateFormat, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
                    z = false;
                    try {
                        packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                        if (packageInfo.versionCode > valueOf2.AFInAppEventType("versionCode", 0)) {
                        }
                        AFb1cSDK AFInAppEventParameterName4 = AFInAppEventParameterName().AFInAppEventParameterName();
                        map2.put("app_version_code", Integer.toString(packageInfo.versionCode));
                        Context context2 = AFInAppEventParameterName4.values.AFInAppEventParameterName;
                        map2.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context2, context2.getPackageName()));
                        map2.put("targetSDKver", Integer.valueOf(AFInAppEventParameterName4.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                        long j2 = packageInfo.firstInstallTime;
                        long j3 = packageInfo.lastUpdateTime;
                        str3 = str5;
                        try {
                            Locale locale = Locale.US;
                            map2.put("date1", new SimpleDateFormat(str9, locale).format(new Date(j2)));
                            map2.put("date2", new SimpleDateFormat(str9, locale).format(new Date(j3)));
                            String AFInAppEventParameterName5 = afRDLog2.AFInAppEventParameterName(simpleDateFormat);
                            Object[] objArr4 = new Object[1];
                            z = false;
                            AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr4);
                            map2.put(((String) objArr4[0]).intern(), AFInAppEventParameterName5);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
                            this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                            StringBuilder sb3 = new StringBuilder("didConfigureTokenRefreshService=");
                            sb3.append(this.onInstallConversionDataLoadedNative);
                            AFLogger.afDebugLog(sb3.toString());
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
                            map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(valueOf2)));
                            int AFInAppEventType2 = AFInAppEventType(valueOf2, values3);
                            map2.put("counter", Integer.toString(AFInAppEventType2));
                            if (str3 != null) {
                            }
                            map2.put("iaecounter", Integer.toString(values(valueOf2, z)));
                            if (values3) {
                                appsFlyerProperties.valueOf = true;
                            }
                            map2.put("isFirstCall", Boolean.toString(!afRDLog2.AFLogger()));
                            afRDLog2.AFInAppEventParameterName(values3, map2, AFInAppEventType2);
                            new AFb1zSDK();
                            map2.put("af_v", AFb1zSDK.values(map2));
                            new AFb1zSDK();
                            map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
                            map2.put("ivc", Boolean.valueOf(afRDLog2.afInfoLog()));
                            if (valueOf2.valueOf("is_stop_tracking_used")) {
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                            hashMap.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                            map2.put("cell", hashMap);
                            map2.put("sig", afRDLog2.valueOf());
                            map2.put("last_boot_time", Long.valueOf(afRDLog2.AFKeystoreWrapper()));
                            map2.put("disk", afRDLog2.values());
                            aFa1bSDK = this.afDebugLog;
                            if (aFa1bSDK != null) {
                                map2.put("sharing_filter", strArr);
                            }
                            return map2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str3 = str5;
                    }
                    this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                    StringBuilder sb32 = new StringBuilder("didConfigureTokenRefreshService=");
                    sb32.append(this.onInstallConversionDataLoadedNative);
                    AFLogger.afDebugLog(sb32.toString());
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
                    map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(valueOf2)));
                    int AFInAppEventType22 = AFInAppEventType(valueOf2, values3);
                    map2.put("counter", Integer.toString(AFInAppEventType22));
                    if (str3 != null) {
                    }
                    map2.put("iaecounter", Integer.toString(values(valueOf2, z)));
                    if (values3) {
                    }
                    map2.put("isFirstCall", Boolean.toString(!afRDLog2.AFLogger()));
                    afRDLog2.AFInAppEventParameterName(values3, map2, AFInAppEventType22);
                    new AFb1zSDK();
                    map2.put("af_v", AFb1zSDK.values(map2));
                    new AFb1zSDK();
                    map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
                    map2.put("ivc", Boolean.valueOf(afRDLog2.afInfoLog()));
                    if (valueOf2.valueOf("is_stop_tracking_used")) {
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                    hashMap2.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                    map2.put("cell", hashMap2);
                    map2.put("sig", afRDLog2.valueOf());
                    map2.put("last_boot_time", Long.valueOf(afRDLog2.AFKeystoreWrapper()));
                    map2.put("disk", afRDLog2.values());
                    aFa1bSDK = this.afDebugLog;
                    if (aFa1bSDK != null) {
                    }
                    return map2;
                } catch (Throwable th3) {
                    AFLogger.afErrorLog("Exception while collecting facebook's attribution ID. ", th3);
                    str2 = null;
                    if (str2 != null) {
                    }
                    afRDLog2.AFInAppEventType(map2, this.afInfoLog);
                    AFInAppEventParameterName2 = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper());
                    if (AFInAppEventParameterName2 != null) {
                    }
                    map2.put("lang", Locale.getDefault().getDisplayLanguage());
                    map2.put("lang_code", Locale.getDefault().getLanguage());
                    map2.put(UserDataStore.COUNTRY, Locale.getDefault().getCountry());
                    afRDLog2.values(map2, values3);
                    afRDLog2.valueOf(map2);
                    String str92 = str;
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str92, Locale.US);
                    map2.put("installDate", values(simpleDateFormat2, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
                    z = false;
                    packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    if (packageInfo.versionCode > valueOf2.AFInAppEventType("versionCode", 0)) {
                    }
                    AFb1cSDK AFInAppEventParameterName42 = AFInAppEventParameterName().AFInAppEventParameterName();
                    map2.put("app_version_code", Integer.toString(packageInfo.versionCode));
                    Context context22 = AFInAppEventParameterName42.values.AFInAppEventParameterName;
                    map2.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context22, context22.getPackageName()));
                    map2.put("targetSDKver", Integer.valueOf(AFInAppEventParameterName42.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                    long j22 = packageInfo.firstInstallTime;
                    long j32 = packageInfo.lastUpdateTime;
                    str3 = str5;
                    Locale locale2 = Locale.US;
                    map2.put("date1", new SimpleDateFormat(str92, locale2).format(new Date(j22)));
                    map2.put("date2", new SimpleDateFormat(str92, locale2).format(new Date(j32)));
                    String AFInAppEventParameterName52 = afRDLog2.AFInAppEventParameterName(simpleDateFormat2);
                    Object[] objArr42 = new Object[1];
                    z = false;
                    AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr42);
                    map2.put(((String) objArr42[0]).intern(), AFInAppEventParameterName52);
                    this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                    StringBuilder sb322 = new StringBuilder("didConfigureTokenRefreshService=");
                    sb322.append(this.onInstallConversionDataLoadedNative);
                    AFLogger.afDebugLog(sb322.toString());
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
                    map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(valueOf2)));
                    int AFInAppEventType222 = AFInAppEventType(valueOf2, values3);
                    map2.put("counter", Integer.toString(AFInAppEventType222));
                    if (str3 != null) {
                    }
                    map2.put("iaecounter", Integer.toString(values(valueOf2, z)));
                    if (values3) {
                    }
                    map2.put("isFirstCall", Boolean.toString(!afRDLog2.AFLogger()));
                    afRDLog2.AFInAppEventParameterName(values3, map2, AFInAppEventType222);
                    new AFb1zSDK();
                    map2.put("af_v", AFb1zSDK.values(map2));
                    new AFb1zSDK();
                    map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
                    map2.put("ivc", Boolean.valueOf(afRDLog2.afInfoLog()));
                    if (valueOf2.valueOf("is_stop_tracking_used")) {
                    }
                    HashMap hashMap22 = new HashMap();
                    hashMap22.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                    hashMap22.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                    map2.put("cell", hashMap22);
                    map2.put("sig", afRDLog2.valueOf());
                    map2.put("last_boot_time", Long.valueOf(afRDLog2.AFKeystoreWrapper()));
                    map2.put("disk", afRDLog2.values());
                    aFa1bSDK = this.afDebugLog;
                    if (aFa1bSDK != null) {
                    }
                    return map2;
                }
                if (str2 != null) {
                    map2.put("fb", str2);
                }
            }
            afRDLog2.AFInAppEventType(map2, this.afInfoLog);
            try {
                AFInAppEventParameterName2 = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper());
                if (AFInAppEventParameterName2 != null) {
                    map2.put("uid", AFInAppEventParameterName2);
                }
            } catch (Exception e3) {
                StringBuilder sb4 = new StringBuilder("ERROR: could not get uid ");
                sb4.append(e3.getMessage());
                AFLogger.afErrorLog(sb4.toString(), e3);
            }
            try {
                map2.put("lang", Locale.getDefault().getDisplayLanguage());
            } catch (Exception e4) {
                AFLogger.afErrorLog("Exception while collecting display language name. ", e4);
            }
            try {
                map2.put("lang_code", Locale.getDefault().getLanguage());
            } catch (Exception e5) {
                AFLogger.afErrorLog("Exception while collecting display language code. ", e5);
            }
            try {
                map2.put(UserDataStore.COUNTRY, Locale.getDefault().getCountry());
            } catch (Exception e6) {
                AFLogger.afErrorLog("Exception while collecting country name. ", e6);
            }
            afRDLog2.values(map2, values3);
            afRDLog2.valueOf(map2);
            String str922 = str;
            SimpleDateFormat simpleDateFormat22 = new SimpleDateFormat(str922, Locale.US);
            try {
                map2.put("installDate", values(simpleDateFormat22, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
            } catch (Exception e7) {
                AFLogger.afErrorLog("Exception while collecting install date. ", e7);
            }
            try {
                z = false;
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo.versionCode > valueOf2.AFInAppEventType("versionCode", 0)) {
                    valueOf(context).valueOf("versionCode", packageInfo.versionCode);
                }
                AFb1cSDK AFInAppEventParameterName422 = AFInAppEventParameterName().AFInAppEventParameterName();
                map2.put("app_version_code", Integer.toString(packageInfo.versionCode));
                Context context222 = AFInAppEventParameterName422.values.AFInAppEventParameterName;
                map2.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context222, context222.getPackageName()));
                map2.put("targetSDKver", Integer.valueOf(AFInAppEventParameterName422.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                long j222 = packageInfo.firstInstallTime;
                long j322 = packageInfo.lastUpdateTime;
                str3 = str5;
                Locale locale22 = Locale.US;
                map2.put("date1", new SimpleDateFormat(str922, locale22).format(new Date(j222)));
                map2.put("date2", new SimpleDateFormat(str922, locale22).format(new Date(j322)));
                String AFInAppEventParameterName522 = afRDLog2.AFInAppEventParameterName(simpleDateFormat22);
                Object[] objArr422 = new Object[1];
                z = false;
            } catch (Throwable th4) {
                th = th4;
                str3 = str5;
            }
        } catch (Throwable th5) {
            AFLogger.afErrorLog(th5.getLocalizedMessage(), th5, true);
        }
        try {
            AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr422);
            map2.put(((String) objArr422[0]).intern(), AFInAppEventParameterName522);
        } catch (Throwable th6) {
            th = th6;
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
            this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
            StringBuilder sb3222 = new StringBuilder("didConfigureTokenRefreshService=");
            sb3222.append(this.onInstallConversionDataLoadedNative);
            AFLogger.afDebugLog(sb3222.toString());
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
            map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(valueOf2)));
            int AFInAppEventType2222 = AFInAppEventType(valueOf2, values3);
            map2.put("counter", Integer.toString(AFInAppEventType2222));
            if (str3 != null) {
            }
            map2.put("iaecounter", Integer.toString(values(valueOf2, z)));
            if (values3) {
            }
            map2.put("isFirstCall", Boolean.toString(!afRDLog2.AFLogger()));
            afRDLog2.AFInAppEventParameterName(values3, map2, AFInAppEventType2222);
            new AFb1zSDK();
            map2.put("af_v", AFb1zSDK.values(map2));
            new AFb1zSDK();
            map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
            map2.put("ivc", Boolean.valueOf(afRDLog2.afInfoLog()));
            if (valueOf2.valueOf("is_stop_tracking_used")) {
            }
            HashMap hashMap222 = new HashMap();
            hashMap222.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
            hashMap222.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
            map2.put("cell", hashMap222);
            map2.put("sig", afRDLog2.valueOf());
            map2.put("last_boot_time", Long.valueOf(afRDLog2.AFKeystoreWrapper()));
            map2.put("disk", afRDLog2.values());
            aFa1bSDK = this.afDebugLog;
            if (aFa1bSDK != null) {
            }
            return map2;
        }
        this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
        StringBuilder sb32222 = new StringBuilder("didConfigureTokenRefreshService=");
        sb32222.append(this.onInstallConversionDataLoadedNative);
        AFLogger.afDebugLog(sb32222.toString());
        if (!this.onInstallConversionDataLoadedNative) {
            map2.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        if (values3) {
            if (this.AFLogger$LogLevel != null) {
                if (map2.get("af_deeplink") != null) {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                } else {
                    JSONObject jSONObject2 = new JSONObject(this.AFLogger$LogLevel);
                    jSONObject2.put("isPush", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                    map2.put("af_deeplink", jSONObject2.toString());
                }
            }
            this.AFLogger$LogLevel = null;
            map2.put("open_referrer", aFa1qSDK.values);
            if (!AFb1vSDK.valueOf(aFa1qSDK.afRDLog)) {
                map2.put("af_web_referrer", aFa1qSDK.afRDLog);
            }
        }
        if (!values3) {
            try {
                map2.putAll(AFInAppEventParameterName().afWarnLog().valueOf());
            } catch (Exception e8) {
                AFLogger.afErrorLogForExcManagerOnly("error while getting sensors data", e8);
                StringBuilder sb5 = new StringBuilder("Unexpected exception from AFSensorManager: ");
                sb5.append(e8.getMessage());
                AFLogger.afRDLog(sb5.toString());
            }
        }
        if (valueOf("advertiserId") == null) {
            AFa1bSDK.valueOf(context, map2);
            map2.put("GAID_retry", String.valueOf(valueOf("advertiserId") != null ? true : z));
        }
        values2 = AFa1bSDK.values(context.getContentResolver());
        if (values2 != null) {
            map2.put("amazon_aid", values2.AFInAppEventParameterName);
            map2.put("amazon_aid_limit", String.valueOf(values2.AFInAppEventType));
        }
        map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(valueOf2)));
        int AFInAppEventType22222 = AFInAppEventType(valueOf2, values3);
        map2.put("counter", Integer.toString(AFInAppEventType22222));
        if (str3 != null) {
            z = true;
        }
        map2.put("iaecounter", Integer.toString(values(valueOf2, z)));
        if (values3 && AFInAppEventType22222 == 1) {
            appsFlyerProperties.valueOf = true;
        }
        map2.put("isFirstCall", Boolean.toString(!afRDLog2.AFLogger()));
        afRDLog2.AFInAppEventParameterName(values3, map2, AFInAppEventType22222);
        new AFb1zSDK();
        map2.put("af_v", AFb1zSDK.values(map2));
        new AFb1zSDK();
        map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
        map2.put("ivc", Boolean.valueOf(afRDLog2.afInfoLog()));
        if (valueOf2.valueOf("is_stop_tracking_used")) {
            map2.put("istu", String.valueOf(valueOf2.AFKeystoreWrapper("is_stop_tracking_used")));
        }
        HashMap hashMap2222 = new HashMap();
        hashMap2222.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
        hashMap2222.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
        map2.put("cell", hashMap2222);
        map2.put("sig", afRDLog2.valueOf());
        map2.put("last_boot_time", Long.valueOf(afRDLog2.AFKeystoreWrapper()));
        map2.put("disk", afRDLog2.values());
        aFa1bSDK = this.afDebugLog;
        if (aFa1bSDK != null && (strArr = aFa1bSDK.AFInAppEventType) != null) {
            map2.put("sharing_filter", strArr);
        }
        return map2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        String concat;
        boolean z2;
        int i = onAttributionFailure + 125;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            concat = "initAfterCustomerUserID: ".concat(String.valueOf(z));
            z2 = false;
        } else {
            concat = "initAfterCustomerUserID: ".concat(String.valueOf(z));
            z2 = true;
        }
        AFLogger.afInfoLog(concat, z2);
        AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
        int i2 = onAttributionFailure + 23;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public class AFa1xSDK implements AFd1zSDK {
        private AFa1xSDK() {
        }

        private boolean valueOf() {
            return AFa1dSDK.this.AFInAppEventType != null;
        }

        @Override // com.appsflyer.internal.AFd1zSDK
        public final void AFInAppEventType(AFd1uSDK<?> aFd1uSDK, AFd1ySDK aFd1ySDK) {
            JSONObject AFInAppEventParameterName;
            AFb1oSDK AFKeystoreWrapper;
            if (!(aFd1uSDK instanceof AFd1eSDK)) {
                if (!(aFd1uSDK instanceof AFe1kSDK) || aFd1ySDK == AFd1ySDK.SUCCESS) {
                    return;
                }
                AFe1rSDK aFe1rSDK = new AFe1rSDK(AFa1dSDK.this.AFInAppEventParameterName());
                AFd1tSDK level = AFa1dSDK.this.AFInAppEventParameterName().getLevel();
                level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFe1rSDK));
                return;
            }
            AFd1eSDK aFd1eSDK = (AFd1eSDK) aFd1uSDK;
            boolean z = aFd1uSDK instanceof AFd1hSDK;
            if (z && valueOf()) {
                AFd1hSDK aFd1hSDK = (AFd1hSDK) aFd1uSDK;
                if (aFd1hSDK.AFKeystoreWrapper == AFd1ySDK.SUCCESS || aFd1hSDK.AFInAppEventParameterName == 1) {
                    AFe1kSDK aFe1kSDK = new AFe1kSDK(aFd1hSDK, AFa1dSDK.this.AFInAppEventParameterName().AFKeystoreWrapper());
                    AFd1tSDK level2 = AFa1dSDK.this.AFInAppEventParameterName().getLevel();
                    level2.AFKeystoreWrapper.execute(level2.new AnonymousClass5(aFe1kSDK));
                }
            }
            if (aFd1ySDK == AFd1ySDK.SUCCESS) {
                AFa1dSDK aFa1dSDK = AFa1dSDK.this;
                aFa1dSDK.valueOf(AFa1dSDK.values(aFa1dSDK)).values("sentSuccessfully", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
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
                }
            }
        }

        public /* synthetic */ AFa1xSDK(AFa1dSDK aFa1dSDK, byte b) {
            this();
        }

        @Override // com.appsflyer.internal.AFd1zSDK
        public final void AFKeystoreWrapper(AFd1uSDK<?> aFd1uSDK) {
        }

        @Override // com.appsflyer.internal.AFd1zSDK
        public final void AFInAppEventType(AFd1uSDK<?> aFd1uSDK) {
            if (aFd1uSDK instanceof AFd1hSDK) {
                AFa1dSDK.this.AFInAppEventParameterName().AFLogger().AFKeystoreWrapper(((AFd1eSDK) aFd1uSDK).afInfoLog.afErrorLog);
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public class AFa1vSDK implements Runnable {
        private final AFa1qSDK AFInAppEventParameterName;

        private AFa1vSDK(AFa1qSDK aFa1qSDK) {
            this.AFInAppEventParameterName = aFa1qSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFa1dSDK.values(AFa1dSDK.this, this.AFInAppEventParameterName);
        }

        public /* synthetic */ AFa1vSDK(AFa1dSDK aFa1dSDK, AFa1qSDK aFa1qSDK, byte b) {
            this(aFa1qSDK);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public class AFa1ySDK implements Runnable {
        private final AFa1qSDK valueOf;

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

        public /* synthetic */ AFa1ySDK(AFa1dSDK aFa1dSDK, AFa1qSDK aFa1qSDK, byte b) {
            this(aFa1qSDK);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i = onAttributionFailure + 69;
        onConversionDataFail = i % 128;
        int i2 = i % 2;
        subscribeForDeepLink(deepLinkListener, 3000L);
        if (i2 == 0) {
            int i3 = 46 / 0;
        }
        onConversionDataFail = (onAttributionFailure + 51) % 128;
    }

    private boolean afErrorLog() {
        int i = onAttributionFailure + 89;
        onConversionDataFail = i % 128;
        int i2 = i % 2;
        boolean AFInAppEventType = AFInAppEventParameterName().AFInAppEventParameterName().AFInAppEventType("AF_PREINSTALL_DISABLED");
        if (i2 == 0) {
            int i3 = 59 / 0;
        }
        return AFInAppEventType;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = onConversionDataFail + 61;
        onAttributionFailure = i % 128;
        if (i % 2 == 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i2 = onConversionDataFail + 91;
            onAttributionFailure = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        throw null;
    }

    private static void afInfoLog(Context context) {
        onConversionDataFail = (onAttributionFailure + 15) % 128;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                int i = onConversionDataFail + 33;
                onAttributionFailure = i % 128;
                if (i % 2 == 0) {
                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                        int i2 = onAttributionFailure + 65;
                        onConversionDataFail = i2 % 128;
                        int i3 = i2 % 2;
                        AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    }
                    AFLogger.AFInAppEventType("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                } else {
                    context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName());
                    throw null;
                }
            }
            int i4 = onAttributionFailure + 57;
            onConversionDataFail = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 27 / 0;
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("checkBackupRules Exception", e);
            AFLogger.afRDLog("checkBackupRules Exception: ".concat(String.valueOf(e)));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = onConversionDataFail + 73;
        onAttributionFailure = i % 128;
        int i2 = i % 2;
        logEvent(context, str, map, null);
        if (i2 != 0) {
            throw null;
        }
        int i3 = onAttributionFailure + 81;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void AFInAppEventParameterName(Context context, Intent intent) {
        Uri uri;
        AFInAppEventType(context);
        AFb1uSDK init = AFInAppEventParameterName().init();
        AFb1fSDK AFKeystoreWrapper2 = AFInAppEventParameterName().AFKeystoreWrapper();
        if (intent != null) {
            int i = onConversionDataFail + 25;
            onAttributionFailure = i % 128;
            if (i % 2 == 0) {
                if ("android.intent.action.VIEW".equals(intent.getAction())) {
                    uri = intent.getData();
                    boolean z = false;
                    if (uri != null) {
                        onConversionDataFail = (onAttributionFailure + 15) % 128;
                        if (!uri.toString().isEmpty()) {
                            int i2 = onAttributionFailure + 49;
                            onConversionDataFail = i2 % 128;
                            if (i2 % 2 != 0) {
                                z = true;
                            }
                        }
                    }
                    if (AFKeystoreWrapper2.AFKeystoreWrapper("ddl_sent")) {
                        int i3 = (onConversionDataFail + 81) % 128;
                        onAttributionFailure = i3;
                        if (!z) {
                            int i4 = i3 + 69;
                            onConversionDataFail = i4 % 128;
                            if (i4 % 2 != 0) {
                                init.AFInAppEventType("No direct deep link", (DeepLinkResult.Error) null);
                                return;
                            } else {
                                init.AFInAppEventType("No direct deep link", (DeepLinkResult.Error) null);
                                throw null;
                            }
                        }
                    }
                    init.valueOf(new HashMap(), intent, context);
                }
            } else {
                "android.intent.action.VIEW".equals(intent.getAction());
                throw null;
            }
        }
        uri = null;
        boolean z2 = false;
        if (uri != null) {
        }
        if (AFKeystoreWrapper2.AFKeystoreWrapper("ddl_sent")) {
        }
        init.valueOf(new HashMap(), intent, context);
    }

    private static void AFKeystoreWrapper(String str, boolean z) {
        int i = onConversionDataFail + 23;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, z);
            int i2 = 54 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, z);
        }
        int i3 = onAttributionFailure + 71;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 70 / 0;
        }
    }

    public final boolean AFKeystoreWrapper() {
        onConversionDataFail = (onAttributionFailure + 107) % 128;
        if (!AFInAppEventParameterName(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) || values() != null) {
            onConversionDataFail = (onAttributionFailure + 79) % 128;
            return false;
        }
        int i = (onAttributionFailure + 69) % 128;
        onConversionDataFail = i;
        onAttributionFailure = (i + 15) % 128;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(AFf1pSDK aFf1pSDK) {
        AFb1fSDK valueOf2 = valueOf(this.onInstallConversionFailureNative);
        boolean z = false;
        int AFInAppEventType = AFInAppEventParameterName().AFInAppEventParameterName().AFInAppEventType.AFInAppEventType("appsFlyerCount", 0);
        boolean AFKeystoreWrapper2 = valueOf2.AFKeystoreWrapper(AppsFlyerProperties.NEW_REFERRER_SENT);
        if (aFf1pSDK.afRDLog == AFf1jSDK.AFa1vSDK.NOT_STARTED) {
            onAttributionFailure = (onConversionDataFail + 15) % 128;
            z = true;
        }
        if (AFInAppEventType == 1) {
            int i = onConversionDataFail + 91;
            onAttributionFailure = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            if (z || AFKeystoreWrapper2) {
                valueOf(new AFe1hSDK());
                onConversionDataFail = (onAttributionFailure + 11) % 128;
            }
        }
    }

    private void afDebugLog() {
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
        onConversionDataFail = (onAttributionFailure + 75) % 128;
        for (AFf1jSDK aFf1jSDK : AFInAppEventType2) {
            onConversionDataFail = (onAttributionFailure + 65) % 128;
            aFf1jSDK.AFKeystoreWrapper(this.onInstallConversionFailureNative);
        }
    }

    public final void AFInAppEventParameterName(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        onAttributionFailure = (onConversionDataFail + 7) % 128;
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
                    onConversionDataFail = (onAttributionFailure + 17) % 128;
                } else {
                    jSONArray = new JSONArray();
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                onAttributionFailure = (onConversionDataFail + 63) % 128;
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
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    private void AFKeystoreWrapper(Context context, String str, Map<String, Object> map, String str2, String str3) {
        AFa1qSDK aFe1bSDK;
        int i;
        onConversionDataFail = (onAttributionFailure + 45) % 128;
        if (str != null && !str.trim().isEmpty()) {
            aFe1bSDK = new AFe1aSDK();
            i = onAttributionFailure + 125;
        } else {
            aFe1bSDK = new AFe1bSDK();
            i = onAttributionFailure + 115;
        }
        onConversionDataFail = i % 128;
        AFInAppEventType(context);
        aFe1bSDK.afDebugLog = str;
        aFe1bSDK.AFKeystoreWrapper = map;
        aFe1bSDK.AFLogger = str2;
        aFe1bSDK.values = str3;
        AFInAppEventType(aFe1bSDK);
        int i2 = onConversionDataFail + 105;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private int AFKeystoreWrapper(AFb1fSDK aFb1fSDK) {
        int i = onAttributionFailure + 15;
        onConversionDataFail = i % 128;
        return valueOf(aFb1fSDK, "appsFlyerAdImpressionCount", i % 2 != 0);
    }

    private static void AFKeystoreWrapper(String str, String str2) {
        onAttributionFailure = (onConversionDataFail + 105) % 128;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i = onAttributionFailure + 105;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static boolean AFKeystoreWrapper(Context context) {
        onAttributionFailure = (onConversionDataFail + 71) % 128;
        try {
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        if (sv0.d.b(context, tv0.a) == 0) {
            return true;
        }
        onAttributionFailure = (onConversionDataFail + 25) % 128;
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFInAppEventParameterName(AFc1zSDK aFc1zSDK) {
        onAttributionFailure = (onConversionDataFail + 31) % 128;
        aFc1zSDK.AppsFlyer2dXConversionCallback().valueOf();
        onConversionDataFail = (onAttributionFailure + 69) % 128;
    }

    private static boolean AFInAppEventParameterName(String str, boolean z) {
        int i = onConversionDataFail + 105;
        onAttributionFailure = i % 128;
        if (i % 2 == 0) {
            return AppsFlyerProperties.getInstance().getBoolean(str, z);
        }
        AppsFlyerProperties.getInstance().getBoolean(str, z);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r3 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r3 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        AFInAppEventType(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        return AFInAppEventParameterName().AFInAppEventParameterName().valueOf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        com.appsflyer.internal.AFa1dSDK.onAttributionFailure = (r1 + 5) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String AFKeystoreWrapper(Context context, String str) {
        int i = onAttributionFailure + 83;
        int i2 = i % 128;
        onConversionDataFail = i2;
        if (i % 2 == 0) {
            int i3 = 74 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(AFe1zSDK aFe1zSDK) {
        int i = onConversionDataFail + 115;
        onAttributionFailure = i % 128;
        if (i % 2 == 0) {
            if (aFe1zSDK == AFe1zSDK.SUCCESS) {
                int i2 = onAttributionFailure + 9;
                onConversionDataFail = i2 % 128;
                int i3 = i2 % 2;
                AFInAppEventParameterName().onResponseErrorNative().values();
                if (i3 == 0) {
                    throw null;
                }
                return;
            }
            return;
        }
        AFe1zSDK aFe1zSDK2 = AFe1zSDK.SUCCESS;
        throw null;
    }

    private void AFInAppEventParameterName(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = onConversionDataFail + 97;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (appsFlyerConversionListener == null) {
            return;
        }
        this.AFInAppEventType = appsFlyerConversionListener;
        onAttributionFailure = (onConversionDataFail + 21) % 128;
    }

    private boolean AFInAppEventParameterName(AFa1qSDK aFa1qSDK, AFb1fSDK aFb1fSDK) {
        boolean z;
        onAttributionFailure = (onConversionDataFail + 49) % 128;
        int AFInAppEventType = AFInAppEventType(aFb1fSDK, false);
        if (AFInAppEventType == 1) {
            int i = (onAttributionFailure + 109) % 128;
            onConversionDataFail = i;
            if (!(aFa1qSDK instanceof AFe1hSDK)) {
                onAttributionFailure = (i + 89) % 128;
                z = true;
                return (aFb1fSDK.AFKeystoreWrapper(AppsFlyerProperties.NEW_REFERRER_SENT) && AFInAppEventType == 1) || z;
            }
        }
        z = false;
        if (aFb1fSDK.AFKeystoreWrapper(AppsFlyerProperties.NEW_REFERRER_SENT)) {
        }
    }

    public static Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        onConversionDataFail = (onAttributionFailure + 65) % 128;
        if (map.containsKey("meta")) {
            onConversionDataFail = (onAttributionFailure + 63) % 128;
            return (Map) map.get("meta");
        }
        HashMap hashMap = new HashMap();
        map.put("meta", hashMap);
        return hashMap;
    }

    private int AFInAppEventParameterName(AFb1fSDK aFb1fSDK) {
        int i = onConversionDataFail + 27;
        onAttributionFailure = i % 128;
        int i2 = i % 2;
        return valueOf(aFb1fSDK, "appsFlyerAdRevenueCount", true);
    }

    private static void AFInAppEventParameterName(String str) {
        try {
            if (new JSONObject(str).has("pid")) {
                onConversionDataFail = (onAttributionFailure + 121) % 128;
                AFKeystoreWrapper("preInstallName", str);
            } else {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                onAttributionFailure = (onConversionDataFail + 39) % 128;
            }
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
        }
    }

    public final AFc1zSDK AFInAppEventParameterName() {
        int i = (onAttributionFailure + 65) % 128;
        onConversionDataFail = i;
        AFc1xSDK aFc1xSDK = this.onAppOpenAttribution;
        onAttributionFailure = (i + 121) % 128;
        return aFc1xSDK;
    }

    private static void AFInAppEventParameterName(String str, boolean z, int[] iArr, Object[] objArr) {
        String str2;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        synchronized (AFg1mSDK.AFInAppEventType) {
            try {
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
                    while (true) {
                        int i5 = AFg1mSDK.AFKeystoreWrapper;
                        if (i5 >= i2) {
                            break;
                        }
                        if (bArr2[i5] == 1) {
                            cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                        } else {
                            cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                        }
                        c = cArr2[i5];
                        AFg1mSDK.AFKeystoreWrapper = i5 + 1;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i6 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i6, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i6);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    AFg1mSDK.AFKeystoreWrapper = 0;
                    while (true) {
                        int i7 = AFg1mSDK.AFKeystoreWrapper;
                        if (i7 >= i2) {
                            break;
                        }
                        cArr4[i7] = cArr[(i2 - i7) - 1];
                        AFg1mSDK.AFKeystoreWrapper = i7 + 1;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    AFg1mSDK.AFKeystoreWrapper = 0;
                    while (true) {
                        int i8 = AFg1mSDK.AFKeystoreWrapper;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr[i8] = (char) (cArr[i8] - iArr[2]);
                        AFg1mSDK.AFKeystoreWrapper = i8 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        int i = onConversionDataFail + 37;
        onAttributionFailure = i % 128;
        int i2 = i % 2;
        start(context, str, null);
        if (i2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        onAttributionFailure = (onConversionDataFail + 107) % 128;
        start(context, null);
        onConversionDataFail = (onAttributionFailure + 55) % 128;
    }

    public static /* synthetic */ Map AFInAppEventType(AFa1dSDK aFa1dSDK) {
        int i = onConversionDataFail + 33;
        onAttributionFailure = i % 128;
        int i2 = i % 2;
        Map<String, Object> map = aFa1dSDK.onConversionDataSuccess;
        if (i2 == 0) {
            return map;
        }
        throw null;
    }

    public static /* synthetic */ boolean AFInAppEventType(AFa1dSDK aFa1dSDK, boolean z) {
        int i = (onAttributionFailure + 23) % 128;
        onConversionDataFail = i;
        aFa1dSDK.AppsFlyer2dXConversionCallback = z;
        int i2 = i + 15;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private Runnable AFInAppEventType(AFf1pSDK aFf1pSDK) {
        int i = onConversionDataFail + 75;
        int i2 = i % 128;
        onAttributionFailure = i2;
        if (i % 2 != 0) {
            throw null;
        }
        a aVar = new a(0, this, aFf1pSDK);
        int i3 = i2 + 49;
        onConversionDataFail = i3 % 128;
        if (i3 % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    public static void AFInAppEventType() {
        onResponse = new char[]{148, 296, 287, 284, 291, 285, 280, 279, 286, 291, 288, 286, 24, 137, 269, 263, 270, 269, 141, 293, 299, 290, 287, 272, 268, 292, 294, 287, 289, 295, 300, 301, 282, 'k'};
    }

    private void AFInAppEventType(Context context, AFe1nSDK aFe1nSDK) {
        onAttributionFailure = (onConversionDataFail + 117) % 128;
        AFInAppEventType(context);
        AFe1lSDK AFLogger = AFInAppEventParameterName().AFLogger();
        AFe1oSDK AFKeystoreWrapper2 = AFa1rSDK.AFKeystoreWrapper(context);
        if (AFLogger.values()) {
            AFLogger.values.put("api_name", aFe1nSDK.toString());
            AFLogger.values(AFKeystoreWrapper2);
            onAttributionFailure = (onConversionDataFail + 3) % 128;
        }
        AFLogger.AFInAppEventParameterName();
    }

    private void AFInAppEventType(Context context, Map<String, Object> map, AFa1qSDK aFa1qSDK) {
        Activity activity;
        onAttributionFailure = (onConversionDataFail + 19) % 128;
        AFInAppEventType(context);
        aFa1qSDK.AFInAppEventType(map);
        if (context instanceof Activity) {
            int i = onConversionDataFail;
            onAttributionFailure = (i + 83) % 128;
            activity = (Activity) context;
            onAttributionFailure = (i + 107) % 128;
        } else {
            activity = null;
        }
        values(aFa1qSDK, activity);
    }

    public final int AFInAppEventType(AFb1fSDK aFb1fSDK, boolean z) {
        int i = onAttributionFailure + 75;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            valueOf(aFb1fSDK, "appsFlyerCount", z);
            throw null;
        }
        int valueOf2 = valueOf(aFb1fSDK, "appsFlyerCount", z);
        int i2 = onAttributionFailure + 41;
        onConversionDataFail = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
        return valueOf2;
    }

    private static void AFInAppEventType(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        onAttributionFailure = (onConversionDataFail + 107) % 128;
        try {
            scheduledExecutorService.schedule(runnable, j, timeUnit);
            onAttributionFailure = (onConversionDataFail + 109) % 128;
        } catch (RejectedExecutionException e) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th);
        }
    }

    @Deprecated
    public static String AFInAppEventType(HttpURLConnection httpURLConnection) {
        InputStreamReader inputStreamReader;
        String obj;
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
                            onConversionDataFail = (onAttributionFailure + 41) % 128;
                            sb.append(z ? '\n' : BuildConfig.FLAVOR);
                            sb.append(readLine);
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            try {
                                StringBuilder sb2 = new StringBuilder("Could not read connection response from: ");
                                sb2.append(httpURLConnection.getURL().toString());
                                AFLogger.afErrorLog(sb2.toString(), th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                onConversionDataFail = (onAttributionFailure + 69) % 128;
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
                                    onAttributionFailure = (onConversionDataFail + 117) % 128;
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
                AFLogger.afErrorLogForExcManagerOnly("readServerResponse error", th5);
            }
        } catch (Throwable th6) {
            th = th6;
            inputStreamReader = null;
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

    public final void AFInAppEventType(Context context) {
        int i = onConversionDataFail + 25;
        onAttributionFailure = i % 128;
        int i2 = i % 2;
        AFc1xSDK aFc1xSDK = this.onAppOpenAttribution;
        if (i2 == 0) {
            if (context != null) {
                AFb1bSDK aFb1bSDK = aFc1xSDK.AFInAppEventParameterName;
                if (context != null) {
                    aFb1bSDK.AFInAppEventParameterName = context.getApplicationContext();
                    onAttributionFailure = (onConversionDataFail + 91) % 128;
                }
            }
            int i3 = onAttributionFailure + 73;
            onConversionDataFail = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 15 / 0;
                return;
            }
            return;
        }
        throw null;
    }

    private void AFInAppEventType(AFa1qSDK aFa1qSDK, Activity activity) {
        onAttributionFailure = (onConversionDataFail + 75) % 128;
        AFf1tSDK onResponseNative = AFInAppEventParameterName().onResponseNative();
        aFa1qSDK.values = onResponseNative.AFInAppEventType(activity);
        aFa1qSDK.afRDLog = onResponseNative.valueOf(activity);
        int i = onConversionDataFail + 35;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            int i2 = 18 / 0;
        }
    }

    private void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        boolean z;
        byte b = 0;
        if (aFa1qSDK.afDebugLog == null) {
            onConversionDataFail = (onAttributionFailure + 97) % 128;
            z = true;
        } else {
            z = false;
        }
        if (AFKeystoreWrapper()) {
            onAttributionFailure = (onConversionDataFail + 71) % 128;
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z) {
            onAttributionFailure = (onConversionDataFail + 125) % 128;
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                if (afInfoLog()) {
                    onAttributionFailure = (onConversionDataFail + 77) % 128;
                    AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.AFInAppEventType;
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        return;
                    }
                    return;
                }
            } else {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            this.AFLogger = System.currentTimeMillis();
        }
        AFInAppEventType(AFInAppEventParameterName().values(), new AFa1vSDK(this, aFa1qSDK, b), 0L, TimeUnit.MILLISECONDS);
    }

    public static AFa1dSDK valueOf() {
        int i = (onAttributionFailure + 27) % 128;
        onConversionDataFail = i;
        AFa1dSDK aFa1dSDK = afErrorLog;
        int i2 = i + 113;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 == 0) {
            return aFa1dSDK;
        }
        throw null;
    }

    public final void valueOf(Context context, Intent intent) {
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            onAttributionFailure = (onConversionDataFail + 19) % 128;
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
                onAttributionFailure = (onConversionDataFail + 23) % 128;
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                AFInAppEventType(context, AFe1nSDK.onReceive);
                values(context, stringExtra);
                onAttributionFailure = (onConversionDataFail + 19) % 128;
            }
        }
        onAttributionFailure = (onConversionDataFail + 111) % 128;
    }

    private static void valueOf(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        onAttributionFailure = (onConversionDataFail + 45) % 128;
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        onAttributionFailure = (onConversionDataFail + 53) % 128;
        loop2: while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    onConversionDataFail = (onAttributionFailure + 53) % 128;
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        onAttributionFailure = (onConversionDataFail + 73) % 128;
                        if (jSONArray2.getLong(i2) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            i2++;
                            str = next;
                        }
                    }
                } catch (JSONException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                }
            }
        }
        if (str != null) {
            int i3 = onConversionDataFail + 77;
            onAttributionFailure = i3 % 128;
            int i4 = i3 % 2;
            jSONObject.remove(str);
            if (i4 != 0) {
                throw null;
            }
        }
    }

    private static String valueOf(String str) {
        onAttributionFailure = (onConversionDataFail + 55) % 128;
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i = onAttributionFailure + 69;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            int i2 = 40 / 0;
        }
        return string;
    }

    private void valueOf(Context context, String str, Map<String, Object> map) {
        Activity activity;
        AFe1aSDK aFe1aSDK = new AFe1aSDK();
        aFe1aSDK.afDebugLog = str;
        aFe1aSDK.AFKeystoreWrapper = map;
        if (context instanceof Activity) {
            onAttributionFailure = (onConversionDataFail + 29) % 128;
            activity = (Activity) context;
        } else {
            onAttributionFailure = (onConversionDataFail + 25) % 128;
            activity = null;
        }
        values(aFe1aSDK, activity);
    }

    public static /* synthetic */ void valueOf(AFa1dSDK aFa1dSDK) {
        int i = onAttributionFailure + 125;
        onConversionDataFail = i % 128;
        int i2 = i % 2;
        aFa1dSDK.afErrorLogForExcManagerOnly();
        if (i2 == 0) {
            throw null;
        }
        onConversionDataFail = (onAttributionFailure + 103) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r4.remove("android_id") != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r4.remove("android_id") != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void valueOf(Map<String, Object> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return;
        }
        onAttributionFailure = (onConversionDataFail + 53) % 128;
        if (map.get("advertiserId") != null) {
            try {
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
                return;
            }
            if (AFb1vSDK.AFInAppEventParameterName(this.afInfoLog)) {
                int i = onAttributionFailure + 51;
                onConversionDataFail = i % 128;
                if (i % 2 == 0) {
                    int i2 = 17 / 0;
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String valueOf(Activity activity) {
        int i;
        int i2 = (onAttributionFailure + 13) % 128;
        onConversionDataFail = i2;
        String str = null;
        if (activity != null) {
            onAttributionFailure = (i2 + 83) % 128;
            Intent intent = activity.getIntent();
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        int i3 = onConversionDataFail + 63;
                        onAttributionFailure = i3 % 128;
                        if (i3 % 2 == 0) {
                            str = extras.getString("af");
                            if (str != null) {
                                onConversionDataFail = (onAttributionFailure + 11) % 128;
                                AFLogger.afInfoLog("Push Notification received af payload = ".concat(String.valueOf(str)));
                                extras.remove("af");
                                activity.setIntent(intent.putExtras(extras));
                            }
                        } else {
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
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        i = onAttributionFailure + 53;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            int i4 = 61 / 0;
        }
        return str;
    }

    public final AFb1fSDK valueOf(Context context) {
        onAttributionFailure = (onConversionDataFail + 61) % 128;
        AFInAppEventType(context);
        AFb1fSDK AFKeystoreWrapper2 = AFInAppEventParameterName().AFKeystoreWrapper();
        int i = onConversionDataFail + 1;
        onAttributionFailure = i % 128;
        if (i % 2 == 0) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    private int valueOf(AFb1fSDK aFb1fSDK, String str, boolean z) {
        onConversionDataFail = (onAttributionFailure + 21) % 128;
        int AFInAppEventType = aFb1fSDK.AFInAppEventType(str, 0);
        if (z) {
            onConversionDataFail = (onAttributionFailure + 89) % 128;
            AFInAppEventType++;
            aFb1fSDK.valueOf(str, AFInAppEventType);
        }
        if (AFInAppEventParameterName().afErrorLogForExcManagerOnly().afErrorLog()) {
            int i = onConversionDataFail + 83;
            onAttributionFailure = i % 128;
            if (i % 2 != 0) {
                AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType(String.valueOf(AFInAppEventType));
                int i2 = 92 / 0;
            } else {
                AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType(String.valueOf(AFInAppEventType));
            }
        }
        return AFInAppEventType;
    }

    public static /* synthetic */ Application values(AFa1dSDK aFa1dSDK) {
        int i = onAttributionFailure + 45;
        onConversionDataFail = i % 128;
        int i2 = i % 2;
        Application application = aFa1dSDK.onInstallConversionFailureNative;
        if (i2 != 0) {
            return application;
        }
        throw null;
    }

    public static /* synthetic */ void values(AFa1dSDK aFa1dSDK, AFa1qSDK aFa1qSDK) {
        onConversionDataFail = (onAttributionFailure + 109) % 128;
        aFa1dSDK.valueOf(aFa1qSDK);
        int i = onAttributionFailure + 1;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            int i2 = 91 / 0;
        }
    }

    public static String values() {
        onAttributionFailure = (onConversionDataFail + 93) % 128;
        String valueOf2 = valueOf(AppsFlyerProperties.APP_USER_ID);
        int i = onConversionDataFail + 103;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
            int i2 = 33 / 0;
        }
        return valueOf2;
    }

    public final void values(AFa1qSDK aFa1qSDK, Activity activity) {
        onConversionDataFail = (onAttributionFailure + 23) % 128;
        AFInAppEventType(aFa1qSDK, activity);
        if (AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.AFInAppEventType;
            if (appsFlyerRequestListener != null) {
                onConversionDataFail = (onAttributionFailure + 99) % 128;
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().AFKeystoreWrapper());
        if (referrer == null) {
            referrer = BuildConfig.FLAVOR;
        }
        aFa1qSDK.AFLogger = referrer;
        AFInAppEventType(aFa1qSDK);
    }

    public static String values(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        int i = onConversionDataFail + 59;
        onAttributionFailure = i % 128;
        if (i % 2 == 0) {
            return format;
        }
        throw null;
    }

    private void values(Context context, String str) {
        byte b = 0;
        AFa1qSDK valueOf2 = new AFe1iSDK().valueOf(AFInAppEventParameterName().AFInAppEventParameterName().AFInAppEventType.AFInAppEventType("appsFlyerCount", 0));
        valueOf2.AFLogger = str;
        if (str != null) {
            int i = onConversionDataFail + 121;
            onAttributionFailure = i % 128;
            if (i % 2 == 0 ? str.length() > 5 : str.length() > 4) {
                if (AFInAppEventParameterName(valueOf2, valueOf(context))) {
                    AFInAppEventType(AFInAppEventParameterName().values(), new AFa1vSDK(this, valueOf2, b), 5L, TimeUnit.MILLISECONDS);
                    onConversionDataFail = (onAttributionFailure + 27) % 128;
                }
            }
        }
        int i2 = onConversionDataFail + 11;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ long values(AFa1dSDK aFa1dSDK, long j) {
        int i = onAttributionFailure;
        onConversionDataFail = (i + 25) % 128;
        aFa1dSDK.afWarnLog = j;
        onConversionDataFail = (i + 31) % 128;
        return j;
    }

    public final void values(Context context, Map<String, Object> map, Uri uri) {
        int i = onConversionDataFail + 45;
        onAttributionFailure = i % 128;
        if (i % 2 == 0) {
            AFInAppEventType(context);
            if (!map.containsKey("af_deeplink")) {
                String AFKeystoreWrapper2 = AFKeystoreWrapper(uri.toString());
                AFb1uSDK init = AFInAppEventParameterName().init();
                String str = init.values;
                if (str != null) {
                    int i2 = (onConversionDataFail + 29) % 128;
                    onAttributionFailure = i2;
                    if (init.AFInAppEventParameterName != null) {
                        int i3 = i2 + 63;
                        onConversionDataFail = i3 % 128;
                        if (i3 % 2 != 0) {
                            if (AFKeystoreWrapper2.contains(str)) {
                                Uri.Builder buildUpon = Uri.parse(AFKeystoreWrapper2).buildUpon();
                                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                                for (Map.Entry<String, String> entry : init.AFInAppEventParameterName.entrySet()) {
                                    onConversionDataFail = (onAttributionFailure + 31) % 128;
                                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                                }
                                AFKeystoreWrapper2 = buildUpon.build().toString();
                                map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
                            }
                        } else {
                            AFKeystoreWrapper2.contains(str);
                            throw null;
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
            if (aFd1iSDK.AFLogger$LogLevel()) {
                aFd1iSDK.afInfoLog = values(hashMap);
                AFd1tSDK level = AFInAppEventParameterName().getLevel();
                level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1iSDK));
                return;
            }
            AFInAppEventParameterName().init().AFInAppEventParameterName(hashMap);
            return;
        }
        AFInAppEventType(context);
        map.containsKey("af_deeplink");
        throw null;
    }

    private static String values(String str) {
        onConversionDataFail = (onAttributionFailure + 105) % 128;
        int indexOf = str.indexOf(63);
        if (indexOf != -1) {
            return str.substring(indexOf);
        }
        int i = onConversionDataFail;
        int i2 = i + 95;
        onAttributionFailure = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
        onAttributionFailure = (i + 97) % 128;
        return BuildConfig.FLAVOR;
    }

    private AFd1iSDK.AFa1xSDK values(final Map<String, String> map) {
        AFd1iSDK.AFa1xSDK aFa1xSDK = new AFd1iSDK.AFa1xSDK() { // from class: com.appsflyer.internal.AFa1dSDK.3
            @Override // com.appsflyer.internal.AFd1iSDK.AFa1xSDK
            public final void AFKeystoreWrapper(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFa1dSDK.this.AFInAppEventParameterName().init().AFInAppEventParameterName(map);
            }

            @Override // com.appsflyer.internal.AFd1iSDK.AFa1xSDK
            public final void AFKeystoreWrapper(String str) {
                AFa1dSDK.this.AFInAppEventParameterName().init().AFInAppEventType(str, DeepLinkResult.Error.NETWORK);
            }
        };
        int i = onAttributionFailure + 89;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            int i2 = 87 / 0;
        }
        return aFa1xSDK;
    }

    public static String values(AFb1fSDK aFb1fSDK, String str) {
        onAttributionFailure = (onConversionDataFail + 45) % 128;
        String valueOf2 = aFb1fSDK.valueOf("CACHED_CHANNEL", (String) null);
        if (valueOf2 != null) {
            int i = onAttributionFailure + 113;
            onConversionDataFail = i % 128;
            if (i % 2 != 0) {
                return valueOf2;
            }
            throw null;
        }
        aFb1fSDK.values("CACHED_CHANNEL", str);
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public static synchronized SharedPreferences values(Context context) {
        SharedPreferences sharedPreferences;
        AFa1dSDK valueOf2;
        SharedPreferences sharedPreferences2;
        synchronized (AFa1dSDK.class) {
            try {
                onConversionDataFail = (onAttributionFailure + 31) % 128;
                if (valueOf().onAttributionFailureNative == null) {
                    int i = onConversionDataFail + 37;
                    onAttributionFailure = i % 128;
                    StrictMode.ThreadPolicy threadPolicy = i % 2;
                    try {
                        if (threadPolicy != 0) {
                            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            valueOf2 = valueOf();
                            sharedPreferences2 = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                            threadPolicy = allowThreadDiskReads;
                        } else {
                            StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                            valueOf2 = valueOf();
                            sharedPreferences2 = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                            threadPolicy = allowThreadDiskReads2;
                        }
                        valueOf2.onAttributionFailureNative = sharedPreferences2;
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                }
                sharedPreferences = valueOf().onAttributionFailureNative;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }

    private int values(AFb1fSDK aFb1fSDK, boolean z) {
        int i = onAttributionFailure + 123;
        onConversionDataFail = i % 128;
        int i2 = i % 2;
        int valueOf2 = valueOf(aFb1fSDK, "appsFlyerInAppEventCount", z);
        if (i2 == 0) {
            int i3 = 9 / 0;
        }
        return valueOf2;
    }
}
