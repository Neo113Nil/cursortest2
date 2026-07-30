package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFd1jSDK;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import com.appsflyer.internal.AFf1hSDK;
import com.appsflyer.internal.AFg1uSDK;
import com.appsflyer.internal.AFi1hSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import java.net.URI;
import java.nio.ByteBuffer;
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
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFb1vSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFInAppEventParameterName;
    static AppsFlyerInAppPurchaseValidatorListener AFKeystoreWrapper = null;
    private static AFb1vSDK AFLogger = null;
    private static int AFPurchaseDetails = 0;
    private static int afDebugLog = 0;
    private static byte[] afErrorLog = null;
    private static int afLogForce = 1;
    private static int afVerboseLog;
    private static int afWarnLog;
    private static short[] getLevel;
    public static final String valueOf;
    static final String values;
    private SharedPreferences afInfoLog;
    private AFf1eSDK afRDLog;
    private Map<Long, String> d;
    private final AFd1nSDK force;
    private Application v;
    private boolean w;
    public volatile AppsFlyerConversionListener AFInAppEventType = null;
    private long e = -1;
    private long registerClient = -1;
    private long unregisterClient = TimeUnit.SECONDS.toMillis(5);
    private boolean i = false;

    static void AFInAppEventType() {
        afWarnLog = 908301821;
        afVerboseLog = 401442715;
        afDebugLog = 221303939;
        afErrorLog = new byte[]{-26, -23, 8, -28, -21, 29, -31, 16, -16, 28, -32, -27};
    }

    static /* synthetic */ Application AFInAppEventParameterName(AFb1vSDK aFb1vSDK) {
        int i = 2 % 2;
        int i2 = afLogForce + 15;
        int i3 = i2 % 128;
        AFPurchaseDetails = i3;
        int i4 = i2 % 2;
        Application application = aFb1vSDK.v;
        int i5 = i3 + 39;
        afLogForce = i5 % 128;
        int i6 = i5 % 2;
        return application;
    }

    static /* synthetic */ boolean AFInAppEventType(AFb1vSDK aFb1vSDK, boolean z) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 63;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        aFb1vSDK.i = z;
        if (i3 != 0) {
            return z;
        }
        throw null;
    }

    static /* synthetic */ AFf1eSDK AFKeystoreWrapper(AFb1vSDK aFb1vSDK) {
        int i = 2 % 2;
        int i2 = afLogForce + 115;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        AFf1eSDK e = aFb1vSDK.e();
        int i4 = AFPurchaseDetails + 115;
        afLogForce = i4 % 128;
        if (i4 % 2 != 0) {
            return e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ long valueOf(AFb1vSDK aFb1vSDK, long j) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 89;
        int i3 = i2 % 128;
        afLogForce = i3;
        int i4 = i2 % 2;
        aFb1vSDK.registerClient = j;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 97;
        AFPurchaseDetails = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    static /* synthetic */ void valueOf(AFb1vSDK aFb1vSDK) {
        int i = 2 % 2;
        int i2 = afLogForce + 31;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        aFb1vSDK.unregisterClient();
        int i4 = AFPurchaseDetails + 49;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void values(AFb1vSDK aFb1vSDK, AFa1qSDK aFa1qSDK) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 121;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        aFb1vSDK.values(aFa1qSDK);
        if (i3 == 0) {
            throw null;
        }
        int i4 = AFPurchaseDetails + 17;
        afLogForce = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        AFInAppEventType();
        values = "288";
        AFInAppEventParameterName = "6.14";
        valueOf = new StringBuilder().append("6.14").append("/androidevent?buildnumber=6.14.0&app_id=").toString();
        Object obj = null;
        AFKeystoreWrapper = null;
        AFLogger = new AFb1vSDK();
        int i = AFPurchaseDetails + 51;
        afLogForce = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final AFd1kSDK AFInAppEventParameterName() {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 117;
        int i3 = i2 % 128;
        afLogForce = i3;
        int i4 = i2 % 2;
        AFd1nSDK aFd1nSDK = this.force;
        int i5 = i3 + 35;
        AFPurchaseDetails = i5 % 128;
        if (i5 % 2 == 0) {
            return aFd1nSDK;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(AFf1gSDK aFf1gSDK) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 95;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AFd1kSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        if (aFf1gSDK == AFf1gSDK.SUCCESS) {
            AFInAppEventParameterName2.getCurrency().AFInAppEventParameterName();
            int i4 = afLogForce + 81;
            AFPurchaseDetails = i4 % 128;
            int i5 = i4 % 2;
        }
        if (AFInAppEventParameterName2.v().values()) {
            AFInAppEventParameterName2.AFLogger$LogLevel().values();
            return;
        }
        int i6 = AFPurchaseDetails + 33;
        afLogForce = i6 % 128;
        int i7 = i6 % 2;
        AFInAppEventParameterName2.AFLogger$LogLevel().AFInAppEventParameterName();
    }

    private synchronized AFf1eSDK e() {
        int i = 2 % 2;
        int i2 = afLogForce + 125;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        if (this.afRDLog == null) {
            this.afRDLog = new AFf1eSDK() { // from class: com.appsflyer.internal.AFb1vSDK$$ExternalSyntheticLambda5
                @Override // com.appsflyer.internal.AFf1eSDK
                public final void onRemoteConfigUpdateFinished(AFf1gSDK aFf1gSDK) {
                    AFb1vSDK.this.AFInAppEventParameterName(aFf1gSDK);
                }
            };
            int i4 = afLogForce + 79;
            AFPurchaseDetails = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        return this.afRDLog;
    }

    public AFb1vSDK() {
        AFVersionDeclaration.init();
        this.force = new AFd1nSDK();
        AFInAppEventParameterName().AFLogger$LogLevel().values();
        AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType();
        AFe1cSDK afInfoLog = AFInAppEventParameterName().afInfoLog();
        afInfoLog.AFInAppEventParameterName.add(new AFa1uSDK(this, (byte) 0));
    }

    public static AFb1vSDK AFKeystoreWrapper() {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 121;
        int i3 = i2 % 128;
        afLogForce = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        AFb1vSDK aFb1vSDK = AFLogger;
        int i4 = i3 + 47;
        AFPurchaseDetails = i4 % 128;
        int i5 = i4 % 2;
        return aFb1vSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        r5 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        valueOf(r5);
        AFInAppEventParameterName().afRDLog().AFKeystoreWrapper(r5, com.appsflyer.internal.AFc1oSDK.AFKeystoreWrapper(AFInAppEventParameterName().getPurchaseToken()), android.net.Uri.parse(r6.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r6.toString().isEmpty() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r6.toString().isEmpty() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        if (r5 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        AFInAppEventParameterName().afRDLog().values(new java.lang.StringBuilder("Context is \"").append(r5).append("\"").toString(), com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK);
        r5 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails + 67;
        com.appsflyer.internal.AFb1vSDK.afLogForce = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        if ((r5 % 2) != 0) goto L21;
     */
    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performOnAppAttribution(Context context, URI uri) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 47;
        int i3 = i2 % 128;
        afLogForce = i3;
        int i4 = i2 % 2;
        if (uri != null) {
            int i5 = i3 + 35;
            AFPurchaseDetails = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 45 / 0;
            }
        }
        AFInAppEventParameterName().afRDLog().values(new StringBuilder("Link is \"").append(uri).append("\"").toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        int i = 2 % 2;
        int i2 = afLogForce + 3;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        setSharingFilterForPartners(strArr);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = afLogForce + 35;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 69;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        setSharingFilterForPartners("all");
        int i4 = afLogForce + 35;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 9;
        afLogForce = i2 % 128;
        if (i2 % 2 != 0) {
            AFc1vSDK afRDLog = AFInAppEventParameterName().afRDLog();
            afRDLog.AFInAppEventParameterName = str;
            afRDLog.values = map;
        } else {
            AFc1vSDK afRDLog2 = AFInAppEventParameterName().afRDLog();
            afRDLog2.AFInAppEventParameterName = str;
            afRDLog2.values = map;
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i = 2 % 2;
        int i2 = afLogForce + 41;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (i3 == 0) {
            subscribeForDeepLink(deepLinkListener, timeUnit.toMillis(3L));
        } else {
            subscribeForDeepLink(deepLinkListener, timeUnit.toMillis(3L));
            int i4 = 85 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(final Intent intent, Context context) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails;
        int i3 = i2 + 101;
        afLogForce = i3 % 128;
        int i4 = i3 % 2;
        if (intent == null) {
            AFInAppEventParameterName().afRDLog().values("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            valueOf(applicationContext);
            AFInAppEventParameterName().values().execute(new Runnable() { // from class: com.appsflyer.internal.AFb1vSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1vSDK.this.AFInAppEventType(applicationContext, intent);
                }
            });
            return;
        }
        int i5 = i2 + 55;
        afLogForce = i5 % 128;
        if (i5 % 2 != 0) {
            AFInAppEventParameterName().afRDLog().values("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else {
            AFInAppEventParameterName().afRDLog().values("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            int i6 = 1 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = 2 % 2;
        int i2 = afLogForce + 97;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = AFInAppEventParameterName().afRDLog().AFKeystoreWrapper;
        if (list.contains(asList)) {
            return;
        }
        int i4 = AFPurchaseDetails + 83;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
        list.add(asList);
        int i6 = AFPurchaseDetails + 41;
        afLogForce = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        int i = 2 % 2;
        int i2 = afLogForce + 47;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
        AFInAppEventType(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
        int i4 = afLogForce + 83;
        AFPurchaseDetails = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void AFKeystoreWrapper(Context context, Intent intent) {
        int i = 2 % 2;
        AFj1ySDK aFj1ySDK = new AFj1ySDK(intent);
        if (aFj1ySDK.AFInAppEventParameterName("appsflyer_preinstall") != null) {
            AFLogger(aFj1ySDK.AFInAppEventParameterName("appsflyer_preinstall"));
            int i2 = afLogForce + 51;
            AFPurchaseDetails = i2 % 128;
            int i3 = i2 % 2;
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String AFInAppEventParameterName2 = aFj1ySDK.AFInAppEventParameterName("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(AFInAppEventParameterName2)));
        if (AFInAppEventParameterName2 != null) {
            int i4 = AFPurchaseDetails + 107;
            afLogForce = i4 % 128;
            int i5 = i4 % 2;
            AFInAppEventParameterName(context).AFInAppEventParameterName("referrer", AFInAppEventParameterName2);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", AFInAppEventParameterName2);
            appsFlyerProperties.AFInAppEventParameterName = AFInAppEventParameterName2;
            if (AppsFlyerProperties.getInstance().AFKeystoreWrapper()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                values(context, AFh1tSDK.onReceive);
                AFInAppEventParameterName(AFInAppEventParameterName2);
            }
        }
    }

    private static void valueOf(JSONObject jSONObject) {
        String str;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i2)));
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i3 = 0;
                    while (i3 < jSONArray2.length()) {
                        int i4 = AFPurchaseDetails + 123;
                        afLogForce = i4 % 128;
                        int i5 = i4 % 2;
                        if (jSONArray2.getLong(i3) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i3) != ((Long) arrayList.get(1)).longValue()) {
                            int i6 = afLogForce + 15;
                            AFPurchaseDetails = i6 % 128;
                            int i7 = i6 % 2;
                            if (jSONArray2.getLong(i3) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            }
                            i3++;
                            str = next;
                        }
                    }
                } catch (JSONException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                }
            }
        }
        if (str != null) {
            int i8 = afLogForce + 81;
            AFPurchaseDetails = i8 % 128;
            int i9 = i8 % 2;
            jSONObject.remove(str);
        }
    }

    public final void valueOf(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 51;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String AFKeystoreWrapper2 = AFInAppEventParameterName(context).AFKeystoreWrapper("extraReferrers", (String) null);
            if (AFKeystoreWrapper2 == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(AFKeystoreWrapper2);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray = new JSONArray();
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                jSONArray2.put(currentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                valueOf(jSONObject);
            }
            jSONObject.put(str, jSONArray2.toString());
            AFInAppEventParameterName(context).AFInAppEventParameterName("extraReferrers", jSONObject.toString());
            int i4 = AFPurchaseDetails + 11;
            afLogForce = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Couldn't save referrer - ").append(str).append(": ").toString(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void valueOf(AFd1kSDK aFd1kSDK) {
        int i = 2 % 2;
        int i2 = afLogForce + 9;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        aFd1kSDK.afErrorLog().valueOf();
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 21;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        valueOf(context);
        final AFd1kSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFInAppEventParameterName2.i().registerClient = z;
        AFInAppEventParameterName2.values().submit(new Runnable() { // from class: com.appsflyer.internal.AFb1vSDK$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AFb1vSDK.valueOf(AFd1kSDK.this);
            }
        });
        if (z) {
            AFInAppEventParameterName2.valueOf().valueOf("is_stop_tracking_used", true);
            int i4 = AFPurchaseDetails + 73;
            afLogForce = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i = 2 % 2;
        int i2 = afLogForce + 43;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("getSdkVersion", new String[0]);
        String registerClient = AFd1sSDK.registerClient();
        int i4 = AFPurchaseDetails + 5;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return registerClient;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        int i = 2 % 2;
        int i2 = afLogForce + 93;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
        int i4 = afLogForce + 103;
        AFPurchaseDetails = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 103;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType();
            throw null;
        }
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType();
        int i3 = AFPurchaseDetails + 105;
        afLogForce = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        valueOf(context);
        AFg1nSDK aFg1nSDK = new AFg1nSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFg1aSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFg1aSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(String.valueOf(str)));
        AFg1oSDK valueOf2 = aFg1nSDK.valueOf();
        if (valueOf2 == null || !str.equals(valueOf2.values)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = valueOf2 == null || currentTimeMillis - valueOf2.AFInAppEventParameterName > TimeUnit.SECONDS.toMillis(2L);
            AFg1oSDK aFg1oSDK = new AFg1oSDK(str, currentTimeMillis, !z);
            aFg1nSDK.values.AFInAppEventParameterName("afUninstallToken", aFg1oSDK.values);
            aFg1nSDK.values.AFKeystoreWrapper("afUninstallToken_received_time", aFg1oSDK.AFInAppEventParameterName);
            aFg1nSDK.values.valueOf("afUninstallToken_queued", aFg1oSDK.values());
            if (z) {
                AFg1nSDK.values(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        r4 = com.appsflyer.AFLogger.LogLevel.DEBUG;
        r1 = com.appsflyer.internal.AFb1vSDK.afLogForce + 87;
        com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0015, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        r4 = com.appsflyer.AFLogger.LogLevel.NONE;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 39;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        setLogLevel(logLevel);
        int i4 = AFPurchaseDetails + 53;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 13;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setOaidData", str);
        AFb1rSDK.values = str;
        int i4 = AFPurchaseDetails + 99;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void AFInAppEventType(String str, String str2) {
        int i = 2 % 2;
        int i2 = afLogForce + 59;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i4 = afLogForce + 13;
        AFPurchaseDetails = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void AFInAppEventType(String str, boolean z) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 59;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties.getInstance().set(str, z);
        int i4 = afLogForce + 83;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static String AFKeystoreWrapper(String str) {
        int i = 2 % 2;
        int i2 = afLogForce + 33;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (i3 == 0) {
            return appsFlyerProperties.getString(str);
        }
        appsFlyerProperties.getString(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static boolean AFInAppEventType(String str) {
        int i = 2 % 2;
        int i2 = afLogForce + 103;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(str, false);
        int i4 = afLogForce + 21;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return z;
    }

    public final boolean values() {
        int i = 2 % 2;
        int i2 = afLogForce + 87;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) || valueOf() != null) {
            return false;
        }
        int i3 = afLogForce + 33;
        AFPurchaseDetails = i3 % 128;
        return i3 % 2 == 0;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 79;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        int i = 2 % 2;
        if (context != null) {
            if (values()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog(new StringBuilder("CustomerUserId set: ").append(str).append(" - Initializing AppsFlyer Tacking").toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().valueOf());
                values(context, AFh1tSDK.setCustomerIdAndLogSession);
                String str2 = AFInAppEventParameterName().i().AFLogger;
                if (referrer == null) {
                    referrer = "";
                }
                if (!(!(context instanceof Activity))) {
                    int i2 = AFPurchaseDetails + 43;
                    afLogForce = i2 % 128;
                    int i3 = i2 % 2;
                    ((Activity) context).getIntent();
                }
                AFKeystoreWrapper(context, referrer);
                int i4 = AFPurchaseDetails + 99;
                afLogForce = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            setCustomerUserId(str);
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
        int i6 = afLogForce + 69;
        AFPurchaseDetails = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i = 2 % 2;
        int i2 = afLogForce + 23;
        AFPurchaseDetails = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string == null) {
                String AFInAppEventType = AFInAppEventType(context, "AF_STORE");
                if (AFInAppEventType == null) {
                    AFLogger.afInfoLog("No out-of-store value set");
                    return null;
                }
                int i3 = afLogForce + 57;
                AFPurchaseDetails = i3 % 128;
                if (i3 % 2 == 0) {
                    return AFInAppEventType;
                }
                obj.hashCode();
                throw null;
            }
            int i4 = AFPurchaseDetails + 75;
            afLogForce = i4 % 128;
            int i5 = i4 % 2;
            return string;
        }
        AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails;
        int i3 = i2 + 27;
        afLogForce = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            int i5 = i2 + 97;
            afLogForce = i5 % 128;
            int i6 = i5 % 2;
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        int i = 2 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
            int i2 = afLogForce + 51;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 3;
            }
        }
        AFInAppEventType(AppsFlyerProperties.ONELINK_ID, str);
        int i4 = AFPurchaseDetails + 49;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 41;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        if (map != null) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            int i4 = afLogForce + 21;
            AFPurchaseDetails = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x018f  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        long j;
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 11;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (activity != null && activity.getIntent() != null) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("sendPushNotificationData", activity.getLocalClassName(), new StringBuilder("activity_intent_").append(activity.getIntent().toString()).toString());
        } else if (activity == null) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("sendPushNotificationData", "activity_null");
        } else {
            int i3 = afLogForce + 73;
            AFPurchaseDetails = i3 % 128;
            if (i3 % 2 == 0) {
                AFInAppEventParameterName().v().AFInAppEventParameterName("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            } else {
                AFb1bSDK v = AFInAppEventParameterName().v();
                String[] strArr = new String[2];
                strArr[0] = activity.getLocalClassName();
                strArr[0] = "activity_intent_null";
                v.AFInAppEventParameterName("sendPushNotificationData", strArr);
            }
        }
        AFd1pSDK level = AFInAppEventParameterName().getLevel();
        level.values = valueOf(activity);
        if (level.values != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.d == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.d = new ConcurrentHashMap();
                j = currentTimeMillis;
            } else {
                try {
                    long j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    Iterator<Long> it = this.d.keySet().iterator();
                    j = currentTimeMillis;
                    while (it.hasNext()) {
                        try {
                            Long next = it.next();
                            JSONObject jSONObject = new JSONObject(level.values);
                            JSONObject jSONObject2 = new JSONObject(this.d.get(next));
                            Iterator<Long> it2 = it;
                            if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                AFLogger.afInfoLog(new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ").append(jSONObject2).append(", new: ").append(jSONObject).append(")").toString());
                                level.values = null;
                                return;
                            } else {
                                if (currentTimeMillis - next.longValue() > j2) {
                                    this.d.remove(next);
                                }
                                if (next.longValue() <= j) {
                                    j = next.longValue();
                                }
                                it = it2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            AFLogger.afErrorLog(new StringBuilder("Error while handling push notification measurement: ").append(th.getClass().getSimpleName()).toString(), th);
                            if (this.d.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                            }
                            this.d.put(Long.valueOf(currentTimeMillis), level.values);
                            start(activity);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = currentTimeMillis;
                }
            }
            if (this.d.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                AFLogger.afInfoLog(new StringBuilder("pushes: removing oldest overflowing push (oldest push:").append(j).append(")").toString());
                this.d.remove(Long.valueOf(j));
            }
            this.d.put(Long.valueOf(currentTimeMillis), level.values);
            start(activity);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = 2 % 2;
        int i2 = afLogForce + 107;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* renamed from: com.appsflyer.internal.AFb1vSDK$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
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
        AFInAppEventParameterName().v().AFInAppEventParameterName("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            int i2 = afLogForce + 77;
            AFPurchaseDetails = i2 % 128;
            int i3 = i2 % 2;
            if (AnonymousClass1.AFKeystoreWrapper[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFb1lSDK.AFKeystoreWrapper(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
        int i4 = AFPurchaseDetails + 59;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 49;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectAndroidID", String.valueOf(z));
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        int i4 = AFPurchaseDetails + 117;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 123;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectIMEI", String.valueOf(z));
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectIMEI", String.valueOf(z));
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        int i3 = AFPurchaseDetails + 117;
        afLogForce = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 117;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFb1bSDK v = AFInAppEventParameterName().v();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            v.AFInAppEventParameterName("setCollectOaid", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectOaid", String.valueOf(z));
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        int i3 = afLogForce + 27;
        AFPurchaseDetails = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = afLogForce + 111;
            AFPurchaseDetails = i2 % 128;
            int i3 = i2 % 2;
            AFInAppEventParameterName().AFLogger$LogLevel().valueOf();
            return;
        }
        AFInAppEventParameterName().AFLogger$LogLevel().AFKeystoreWrapper();
        int i4 = afLogForce + 45;
        AFPurchaseDetails = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFLogger() {
        int i = 2 % 2;
        values(new AFh1oSDK());
        int i2 = afLogForce + 125;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        long j;
        int i = 2 % 2;
        if (this.w) {
            return this;
        }
        this.w = true;
        AFInAppEventParameterName().i().AFLogger = str;
        AFb1mSDK.valueOf(str);
        if (context == null) {
            AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        } else {
            int i2 = afLogForce + 17;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 == 0) {
                valueOf(context);
                Application AFInAppEventParameterName2 = AFb1uSDK.AFInAppEventParameterName(context);
                if (AFInAppEventParameterName2 == null) {
                    int i3 = AFPurchaseDetails + 19;
                    afLogForce = i3 % 128;
                    int i4 = i3 % 2;
                    return this;
                }
                this.v = AFInAppEventParameterName2;
                AFInAppEventParameterName().afErrorLog().AFInAppEventParameterName();
                AFInAppEventParameterName().AFLogger().values = System.currentTimeMillis();
                AFe1cSDK afInfoLog = AFInAppEventParameterName().afInfoLog();
                afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(new AFf1uSDK(AFInAppEventParameterName())));
                AFh1cSDK afLogForce2 = AFInAppEventParameterName().afLogForce();
                afLogForce2.valueOf = Build.VERSION.SDK_INT >= 31 ? new AFi1uSDK(afLogForce2.AFKeystoreWrapper) : new AFi1ySDK(afLogForce2.AFKeystoreWrapper);
                AFInAppEventParameterName().getCurrency().values(new AFd1jSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFb1vSDK$$ExternalSyntheticLambda2
                    @Override // com.appsflyer.internal.AFd1jSDK.AFa1zSDK
                    public final void onConfigurationChanged(boolean z) {
                        AFb1vSDK.this.AFInAppEventParameterName(z);
                    }
                });
                AFInAppEventParameterName().registerClient().AFKeystoreWrapper(e());
                AFi1aSDK force = AFInAppEventParameterName().force();
                Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFb1vSDK$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFb1vSDK.this.AFLogger();
                    }
                };
                AFi1lSDK valueOf2 = force.valueOf(runnable);
                Runnable AFInAppEventType = force.AFInAppEventType(valueOf2, runnable);
                force.AFInAppEventParameterName(valueOf2);
                force.AFInAppEventParameterName(new AFi1eSDK(force.AFInAppEventParameterName.AFInAppEventType(), AFInAppEventType));
                force.AFInAppEventParameterName(new AFi1nSDK(AFInAppEventType, force.AFInAppEventParameterName, new AFi1oSDK()));
                force.AFInAppEventParameterName(new AFi1bSDK(AFInAppEventType, force.AFInAppEventParameterName));
                force.AFInAppEventParameterName(AFInAppEventType);
                if (!force.values()) {
                    Context context2 = force.AFInAppEventParameterName.w().AFKeystoreWrapper;
                    AFd1kSDK aFd1kSDK = force.AFInAppEventParameterName;
                    List<ResolveInfo> queryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                    if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
                        while (it.hasNext()) {
                            ProviderInfo providerInfo = it.next().providerInfo;
                            if (providerInfo != null) {
                                arrayList.add(new AFi1iSDK(providerInfo, AFInAppEventType, aFd1kSDK));
                            } else {
                                AFLogger.INSTANCE.w(AFg1aSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            force.AFKeystoreWrapper.addAll(arrayList);
                            AFLogger.INSTANCE.d(AFg1aSDK.PREINSTALL, new StringBuilder("Detected ").append(arrayList.size()).append(" valid preinstall provider(s)").toString());
                        }
                    }
                }
                for (AFi1hSDK aFi1hSDK : force.AFKeystoreWrapper()) {
                    aFi1hSDK.values(force.AFInAppEventParameterName.w().AFKeystoreWrapper);
                }
                final AFg1wSDK i5 = this.force.i();
                AFd1sSDK AFInAppEventType2 = AFInAppEventParameterName().AFInAppEventType();
                i5.valueOf = System.currentTimeMillis();
                AFg1uSDK aFg1uSDK = i5.AFInAppEventParameterName;
                byte[] values2 = AFb1lSDK.values(new StringBuilder().append(AFb1kSDK.valueOf(AFInAppEventType2.valueOf, AFInAppEventType2.AFKeystoreWrapper)).append(i5.valueOf).toString());
                if (values2 == null || values2.length <= 0) {
                    j = -1;
                } else {
                    if (values2.length > 8) {
                        values2 = Arrays.copyOfRange(values2, 0, 8);
                    }
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    allocate.put(values2);
                    allocate.flip();
                    j = allocate.getLong();
                }
                i5.values = aFg1uSDK.AFKeystoreWrapper(j, i5.AFKeystoreWrapper.AFKeystoreWrapper, new AFg1uSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFg1wSDK.3
                    public AnonymousClass3() {
                    }

                    @Override // com.appsflyer.internal.AFg1uSDK.AFa1zSDK
                    public final void AFInAppEventType(String str2, String str3) {
                        AFg1wSDK.this.AFInAppEventType = new ConcurrentHashMap();
                        AFg1wSDK.this.AFInAppEventType.put("signedData", str2);
                        AFg1wSDK.this.AFInAppEventType.put("signature", str3);
                        AFg1wSDK.this.values();
                        AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                    }

                    @Override // com.appsflyer.internal.AFg1uSDK.AFa1zSDK
                    public final void AFInAppEventType(String str2, Exception exc) {
                        AFg1wSDK.this.AFInAppEventType = new ConcurrentHashMap();
                        String message = exc.getMessage();
                        if (message == null) {
                            message = EnvironmentCompat.MEDIA_UNKNOWN;
                        }
                        AFg1wSDK.this.values();
                        AFg1wSDK.this.AFInAppEventType.put("error", message);
                        AFLogger.afErrorLog(str2, exc, true, true, false);
                    }
                });
            } else {
                valueOf(context);
                AFb1uSDK.AFInAppEventParameterName(context);
                throw null;
            }
        }
        AFb1bSDK v = AFInAppEventParameterName().v();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = appsFlyerConversionListener == null ? AbstractJsonLexerKt.NULL : "conversionDataListener";
        v.AFInAppEventParameterName("init", strArr);
        AFLogger.INSTANCE.force(AFg1aSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.14.0", values));
        this.AFInAppEventType = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 55;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().afDebugLog().values(z);
        int i4 = AFPurchaseDetails + 49;
        afLogForce = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 17;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        start(context, null);
        int i4 = afLogForce + 57;
        AFPurchaseDetails = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 27;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        start(context, str, null);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        int i = 2 % 2;
        if (AFInAppEventParameterName().afErrorLogForExcManagerOnly().values()) {
            return;
        }
        if (!this.w) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
        }
        valueOf(context);
        final AFh1wSDK AFLogger2 = AFInAppEventParameterName().AFLogger();
        AFLogger2.AFInAppEventParameterName(AFa1oSDK.AFInAppEventParameterName(context));
        if (this.v == null) {
            int i2 = AFPurchaseDetails + 89;
            afLogForce = i2 % 128;
            int i3 = i2 % 2;
            Application AFInAppEventParameterName2 = AFb1uSDK.AFInAppEventParameterName(context);
            if (AFInAppEventParameterName2 == null) {
                return;
            } else {
                this.v = AFInAppEventParameterName2;
            }
        }
        AFInAppEventParameterName().v().AFInAppEventParameterName("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.GENERAL;
        String str2 = values;
        aFLogger.i(aFg1aSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.14.0", str2));
        AFLogger.INSTANCE.i(AFg1aSDK.GENERAL, new StringBuilder("Build Number: ").append(str2).toString());
        AppsFlyerProperties.getInstance().loadProperties(AFInAppEventParameterName().valueOf());
        if (true ^ TextUtils.isEmpty(str)) {
            AFInAppEventParameterName().i().AFLogger = str;
            AFb1mSDK.valueOf(str);
            int i4 = AFPurchaseDetails + 15;
            afLogForce = i4 % 128;
            int i5 = i4 % 2;
        } else if (TextUtils.isEmpty(AFInAppEventParameterName().i().AFLogger)) {
            int i6 = afLogForce + 117;
            AFPurchaseDetails = i6 % 128;
            if (i6 % 2 != 0) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
                throw null;
            }
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            if (appsFlyerRequestListener != null) {
                int i7 = AFPurchaseDetails + 111;
                afLogForce = i7 % 128;
                if (i7 % 2 == 0) {
                    appsFlyerRequestListener.onError(3, "No dev key");
                    return;
                } else {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
            }
            return;
        }
        AFInAppEventParameterName().registerClient().AFKeystoreWrapper(e());
        unregisterClient();
        AFInAppEventType(this.v.getBaseContext());
        AFInAppEventParameterName().afDebugLog().AFKeystoreWrapper();
        this.force.afErrorLogForExcManagerOnly().AFInAppEventType(context, new AFd1xSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFb1vSDK.5
            @Override // com.appsflyer.internal.AFd1xSDK.AFa1zSDK
            public final void values(AFh1xSDK aFh1xSDK) {
                AFLogger2.AFInAppEventType();
                AFd1kSDK AFInAppEventParameterName3 = AFb1vSDK.this.AFInAppEventParameterName();
                AFInAppEventParameterName3.registerClient().AFKeystoreWrapper(AFb1vSDK.AFKeystoreWrapper(AFb1vSDK.this));
                AFb1vSDK.valueOf(AFb1vSDK.this);
                int valueOf2 = AFInAppEventParameterName3.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (valueOf2 < 2) {
                    AFb1vSDK.this.AFInAppEventParameterName().d().values();
                }
                AFh1mSDK aFh1mSDK = new AFh1mSDK();
                if (aFh1xSDK != null) {
                    AFb1vSDK.this.AFInAppEventParameterName().afRDLog().AFInAppEventParameterName(AFc1oSDK.AFInAppEventParameterName(aFh1mSDK), aFh1xSDK.values, AFInAppEventParameterName3.w().AFKeystoreWrapper);
                }
                AFb1vSDK aFb1vSDK = AFb1vSDK.this;
                aFh1mSDK.values = appsFlyerRequestListener;
                aFb1vSDK.AFInAppEventType(aFh1mSDK, aFh1xSDK);
            }

            @Override // com.appsflyer.internal.AFd1xSDK.AFa1zSDK
            public final void valueOf() {
                Context context2 = AFb1vSDK.this.AFInAppEventParameterName().w().AFKeystoreWrapper;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1wSDK aFh1wSDK = AFLogger2;
                long currentTimeMillis = System.currentTimeMillis();
                if (aFh1wSDK.unregisterClient != 0) {
                    long j = currentTimeMillis - aFh1wSDK.unregisterClient;
                    if (j > 0 && j < 1000) {
                        j = 1000;
                    }
                    aFh1wSDK.v = TimeUnit.MILLISECONDS.toSeconds(j);
                    aFh1wSDK.AFInAppEventParameterName.AFKeystoreWrapper("prev_session_dur", aFh1wSDK.v);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFb1vSDK.this.AFInAppEventParameterName().getCurrency().AFInAppEventType();
                AFb1bSDK v = AFb1vSDK.this.AFInAppEventParameterName().v();
                if (v.e()) {
                    v.AFInAppEventType();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        v.values(context2.getPackageName(), context2.getPackageManager());
                    }
                    v.valueOf();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFb1vSDK.this.AFInAppEventParameterName().d().AFInAppEventParameterName();
                AFb1vSDK.this.AFInAppEventParameterName().getPurchaseToken().AFInAppEventType();
            }
        });
    }

    private static void AFInAppEventType(Context context) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 65;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                int i4 = afLogForce + 25;
                AFPurchaseDetails = i4 % 128;
                int i5 = i4 % 2;
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    AFLogger.INSTANCE.i(AFg1aSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                } else {
                    AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules", true);
                }
            }
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1aSDK.GENERAL, "checkBackupRules Exception", e, false, false);
            AFLogger.INSTANCE.v(AFg1aSDK.GENERAL, "checkBackupRules Exception: ".concat(String.valueOf(e)));
        }
    }

    public static String valueOf() {
        int i = 2 % 2;
        int i2 = afLogForce + 117;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        String AFKeystoreWrapper2 = AFKeystoreWrapper(AppsFlyerProperties.APP_USER_ID);
        int i4 = afLogForce + 73;
        AFPurchaseDetails = i4 % 128;
        int i5 = i4 % 2;
        return AFKeystoreWrapper2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        int i = 2 % 2;
        int i2 = afLogForce + 39;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFInAppEventType(AppsFlyerProperties.APP_USER_ID, str);
        AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i4 = afLogForce + 103;
        AFPurchaseDetails = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i = 2 % 2;
        int i2 = afLogForce + 99;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setAppId", str);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setAppId", str);
        }
        AFInAppEventType(AppsFlyerProperties.APP_ID, str);
        int i3 = afLogForce + 37;
        AFPurchaseDetails = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 43;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFb1bSDK v = AFInAppEventParameterName().v();
            String[] strArr = new String[0];
            strArr[1] = str;
            v.AFInAppEventParameterName("setExtension", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i3 = AFPurchaseDetails + 47;
        afLogForce = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i = 2 % 2;
        int i2 = afLogForce + 117;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i4 = AFPurchaseDetails + 115;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 23;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFb1bSDK v = AFInAppEventParameterName().v();
            String[] strArr = new String[0];
            strArr[1] = str;
            v.AFInAppEventParameterName("setCurrencyCode", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCurrencyCode", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        int i = 2 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        values(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        int i2 = AFPurchaseDetails + 19;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 105;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("logSession", new String[0]);
        AFInAppEventParameterName().v().AFInAppEventParameterName();
        values(context, AFh1tSDK.logSession);
        values(context, null, null);
        int i4 = AFPurchaseDetails + 123;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void values(Context context, AFh1tSDK aFh1tSDK) {
        int i = 2 % 2;
        int i2 = afLogForce + 47;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        valueOf(context);
        AFh1wSDK AFLogger2 = AFInAppEventParameterName().AFLogger();
        AFg1cSDK AFInAppEventParameterName2 = AFa1oSDK.AFInAppEventParameterName(context);
        if (AFLogger2.values()) {
            int i4 = AFPurchaseDetails + 27;
            afLogForce = i4 % 128;
            if (i4 % 2 != 0) {
                AFLogger2.AFKeystoreWrapper.put("api_name", aFh1tSDK.toString());
                AFLogger2.AFInAppEventParameterName(AFInAppEventParameterName2);
            } else {
                AFLogger2.AFKeystoreWrapper.put("api_name", aFh1tSDK.toString());
                AFLogger2.AFInAppEventParameterName(AFInAppEventParameterName2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        AFLogger2.AFInAppEventType();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int i = 2 % 2;
        int valueOf2 = valueOf(AFInAppEventParameterName(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adrevenue_counter", Integer.valueOf(valueOf2));
        valueOf(context, hashMap, new AFh1sSDK());
        int i2 = AFPurchaseDetails + 57;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdImpression(Context context, Map<String, Object> map) {
        int i = 2 % 2;
        int AFInAppEventParameterName2 = AFInAppEventParameterName(AFInAppEventParameterName(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adimpression_counter", Integer.valueOf(AFInAppEventParameterName2));
        valueOf(context, hashMap, new AFh1vSDK());
        int i2 = AFPurchaseDetails + 99;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
    }

    private void valueOf(Context context, Map<String, Object> map, AFa1qSDK aFa1qSDK) {
        int i = 2 % 2;
        int i2 = afLogForce + 33;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            valueOf(context);
            aFa1qSDK.valueOf((Map<String, ?>) map);
            AFInAppEventType(aFa1qSDK, e(context));
            int i3 = 72 / 0;
            return;
        }
        valueOf(context);
        aFa1qSDK.valueOf((Map<String, ?>) map);
        AFInAppEventType(aFa1qSDK, e(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afLogForce + 7;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        logEvent(context, str, map, null);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
    }

    private AFh1xSDK e(Context context) {
        int i = 2 % 2;
        int i2 = afLogForce;
        int i3 = i2 + 37;
        AFPurchaseDetails = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = context instanceof Activity;
            obj.hashCode();
            throw null;
        }
        if (!(context instanceof Activity)) {
            int i4 = i2 + 47;
            AFPurchaseDetails = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        return new AFh1xSDK((Activity) context, AFInAppEventParameterName().AFPurchaseDetails());
    }

    private void values(Context context, String str, Map<String, Object> map) {
        int i = 2 % 2;
        AFh1jSDK aFh1jSDK = new AFh1jSDK();
        aFh1jSDK.e = str;
        aFh1jSDK.AFInAppEventParameterName = map;
        AFInAppEventType(aFh1jSDK, e(context));
        int i2 = AFPurchaseDetails + 39;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    final void AFInAppEventType(AFa1qSDK aFa1qSDK, AFh1xSDK aFh1xSDK) {
        int i = 2 % 2;
        AFKeystoreWrapper(aFa1qSDK, aFh1xSDK);
        if (AFInAppEventParameterName().i().AFLogger == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.values;
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
                int i2 = AFPurchaseDetails + 73;
                afLogForce = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = AFPurchaseDetails + 49;
            afLogForce = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().valueOf());
        if (referrer == null) {
            int i5 = AFPurchaseDetails + 67;
            afLogForce = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 89 / 0;
            }
            referrer = "";
        } else {
            int i7 = AFPurchaseDetails + 37;
            afLogForce = i7 % 128;
            int i8 = i7 % 2;
        }
        aFa1qSDK.unregisterClient = referrer;
        valueOf(aFa1qSDK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = 2 % 2;
        int i2 = afLogForce + 9;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("anonymizeUser", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        int i4 = afLogForce + 55;
        AFPurchaseDetails = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 105;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("registerConversionListener", new String[0]);
        values(appsFlyerConversionListener);
        int i4 = AFPurchaseDetails + 119;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    private void values(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = 2 % 2;
        if (appsFlyerConversionListener == null) {
            int i2 = afLogForce + 89;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.AFInAppEventType = appsFlyerConversionListener;
        int i3 = afLogForce + 33;
        AFPurchaseDetails = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 11 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 25;
        afLogForce = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
        }
        this.AFInAppEventType = null;
        int i3 = afLogForce + 79;
        AFPurchaseDetails = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i = 2 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            int i2 = AFPurchaseDetails + 115;
            afLogForce = i2 % 128;
            int i3 = i2 % 2;
            AFLogger.afDebugLog("registerValidatorListener null listener");
            return;
        }
        AFKeystoreWrapper = appsFlyerInAppPurchaseValidatorListener;
        int i4 = AFPurchaseDetails + 83;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    public static String AFKeystoreWrapper(SimpleDateFormat simpleDateFormat, long j) {
        int i = 2 % 2;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        int i2 = AFPurchaseDetails + 117;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        return format;
    }

    private void AFKeystoreWrapper(Context context, String str) {
        int i = 2 % 2;
        AFh1mSDK aFh1mSDK = new AFh1mSDK();
        valueOf(context);
        aFh1mSDK.e = null;
        aFh1mSDK.AFInAppEventParameterName = null;
        aFh1mSDK.unregisterClient = str;
        aFh1mSDK.valueOf = null;
        valueOf(aFh1mSDK);
        int i2 = afLogForce + 39;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void valueOf(AFa1qSDK aFa1qSDK) {
        boolean z;
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 109;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        byte b = 0;
        if (aFa1qSDK.e == null) {
            int i4 = afLogForce + 9;
            AFPurchaseDetails = i4 % 128;
            if (i4 % 2 == 0) {
                z = true;
                if (!values()) {
                    int i5 = afLogForce + 67;
                    AFPurchaseDetails = i5 % 128;
                    int i6 = i5 % 2;
                    AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                    return;
                }
                Object obj = null;
                if (z) {
                    if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                        int i7 = AFPurchaseDetails + 49;
                        afLogForce = i7 % 128;
                        int i8 = i7 % 2;
                        if (d()) {
                            int i9 = AFPurchaseDetails + 35;
                            afLogForce = i9 % 128;
                            if (i9 % 2 == 0) {
                                AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.values;
                                obj.hashCode();
                                throw null;
                            }
                            AppsFlyerRequestListener appsFlyerRequestListener2 = aFa1qSDK.values;
                            if (appsFlyerRequestListener2 != null) {
                                appsFlyerRequestListener2.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                                return;
                            }
                            return;
                        }
                    } else {
                        AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                    }
                    this.e = System.currentTimeMillis();
                }
                AFj1rSDK.values(AFInAppEventParameterName().AFKeystoreWrapper(), new AFa1vSDK(this, aFa1qSDK, b), 0L, TimeUnit.MILLISECONDS);
                int i10 = AFPurchaseDetails + 69;
                afLogForce = i10 % 128;
                if (i10 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        z = false;
        if (!values()) {
        }
    }

    private boolean d() {
        int i = 2 % 2;
        if (this.e > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.e;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            String AFKeystoreWrapper2 = AFKeystoreWrapper(simpleDateFormat, this.e);
            String AFKeystoreWrapper3 = AFKeystoreWrapper(simpleDateFormat, this.registerClient);
            if (currentTimeMillis < this.unregisterClient && (!isStopped())) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", AFKeystoreWrapper2, AFKeystoreWrapper3, Long.valueOf(currentTimeMillis), Long.valueOf(this.unregisterClient)));
                return true;
            }
            if (isStopped()) {
                return false;
            }
            int i2 = afLogForce + 21;
            AFPurchaseDetails = i2 % 128;
            int i3 = i2 % 2;
            AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", AFKeystoreWrapper2, AFKeystoreWrapper3, Long.valueOf(currentTimeMillis)));
            int i4 = AFPurchaseDetails + 75;
            afLogForce = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (isStopped()) {
            return false;
        }
        AFLogger.afInfoLog("Sending first launch for this session!");
        return false;
    }

    private void AFInAppEventParameterName(String str) {
        int i = 2 % 2;
        byte b = 0;
        AFa1qSDK AFInAppEventType = new AFh1rSDK().AFInAppEventType(AFInAppEventParameterName().AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0));
        AFInAppEventType.unregisterClient = str;
        if (str != null) {
            int i2 = afLogForce + 51;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 != 0) {
                if (str.length() <= 4) {
                    return;
                }
            } else if (str.length() <= 5) {
                return;
            }
            if (AFInAppEventParameterName().force().AFKeystoreWrapper(AFInAppEventType)) {
                AFj1rSDK.values(AFInAppEventParameterName().AFKeystoreWrapper(), new AFa1vSDK(this, AFInAppEventType, b), 5L, TimeUnit.MILLISECONDS);
                int i3 = afLogForce + 75;
                AFPurchaseDetails = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x01bb, code lost:
    
        if ((r13 % 2) != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void values(AFa1qSDK aFa1qSDK) {
        String AFInAppEventParameterName2;
        int i = 2 % 2;
        int i2 = afLogForce + 37;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        Context context = AFInAppEventParameterName().w().AFKeystoreWrapper;
        if (context == null) {
            int i4 = AFPurchaseDetails + 89;
            afLogForce = i4 % 128;
            int i5 = i4 % 2;
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        String str = AFInAppEventParameterName().i().AFLogger;
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.values;
        if (str != null) {
            int i6 = AFPurchaseDetails + 65;
            afLogForce = i6 % 128;
            int i7 = i6 % 2;
            if (str.length() != 0) {
                AFd1qSDK AFInAppEventParameterName3 = AFInAppEventParameterName(context);
                AppsFlyerProperties.getInstance().saveProperties(AFInAppEventParameterName3);
                if (!AFInAppEventParameterName().i().AFKeystoreWrapper()) {
                    AFLogger.afInfoLog(new StringBuilder("sendWithEvent from activity: ").append(context.getClass().getName()).toString());
                }
                boolean AFInAppEventType = aFa1qSDK.AFInAppEventType();
                Map<String, ?> AFKeystoreWrapper2 = AFKeystoreWrapper(aFa1qSDK);
                boolean z = true;
                if (!isStopped()) {
                    AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
                }
                int AFInAppEventType2 = AFInAppEventType(AFInAppEventParameterName3, false);
                AFj1xSDK aFj1xSDK = new AFj1xSDK(AFInAppEventParameterName().AFInAppEventType());
                Intrinsics.checkNotNullParameter(aFa1qSDK, "");
                boolean AFInAppEventType3 = aFa1qSDK.AFInAppEventType();
                boolean z2 = aFa1qSDK instanceof AFh1sSDK;
                boolean z3 = aFa1qSDK instanceof AFh1vSDK;
                boolean z4 = aFa1qSDK instanceof AFh1rSDK;
                if ((aFa1qSDK instanceof AFh1oSDK) || z4) {
                    AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName(AFj1xSDK.values);
                } else if (z3) {
                    int i8 = AFPurchaseDetails + 67;
                    afLogForce = i8 % 128;
                    int i9 = i8 % 2;
                    AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName(AFj1xSDK.valueOf);
                } else if (z2) {
                    AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName(AFj1xSDK.AFInAppEventParameterName);
                } else if (AFInAppEventType3) {
                    AFInAppEventParameterName2 = aFj1xSDK.valueOf.AFKeystoreWrapper.valueOf("appsFlyerCount", 0) < 2 ? aFj1xSDK.values.AFInAppEventParameterName(AFj1xSDK.AFLogger) : aFj1xSDK.values.AFInAppEventParameterName(AFj1xSDK.e);
                } else {
                    AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName(AFj1xSDK.registerClient);
                    int i10 = afLogForce + 125;
                    AFPurchaseDetails = i10 % 128;
                    int i11 = i10 % 2;
                }
                String valueOf2 = aFj1xSDK.valueOf(AFj1xSDK.AFInAppEventType(new StringBuilder().append(AFInAppEventParameterName2).append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName()).toString(), z2));
                values(AFKeystoreWrapper2);
                AFc1uSDK aFc1uSDK = new AFc1uSDK(AFInAppEventParameterName(), aFa1qSDK.valueOf(valueOf2).valueOf(AFKeystoreWrapper2).AFInAppEventType(AFInAppEventType2), AFInAppEventParameterName().afDebugLog().AFInAppEventType());
                if (AFInAppEventType) {
                    int i12 = AFPurchaseDetails + 87;
                    afLogForce = i12 % 128;
                    int i13 = i12 % 2;
                    boolean z5 = false;
                    for (AFi1hSDK aFi1hSDK : registerClient()) {
                        if (aFi1hSDK.unregisterClient == AFi1hSDK.AFa1ySDK.STARTED) {
                            AFLogger.afDebugLog(new StringBuilder("Failed to get ").append(aFi1hSDK.values).append(" referrer, wait ...").toString());
                            z5 = true;
                        }
                    }
                    if (AFInAppEventParameterName().afDebugLog().valueOf()) {
                        AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                        z5 = true;
                    }
                    if (AFInAppEventParameterName().i().valueOf()) {
                        int i14 = afLogForce + 49;
                        AFPurchaseDetails = i14 % 128;
                    } else {
                        z = z5;
                    }
                    AFj1rSDK.values(AFInAppEventParameterName().AFKeystoreWrapper(), aFc1uSDK, !z ? 500L : 0L, TimeUnit.MILLISECONDS);
                    return;
                }
                z = false;
                AFj1rSDK.values(AFInAppEventParameterName().AFKeystoreWrapper(), aFc1uSDK, !z ? 500L : 0L, TimeUnit.MILLISECONDS);
                return;
            }
        }
        AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
        AFLogger.afInfoLog("AppsFlyer will not track this event.");
        if (appsFlyerRequestListener != null) {
            int i15 = AFPurchaseDetails + 23;
            afLogForce = i15 % 128;
            int i16 = i15 % 2;
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    private void values(Map<String, Object> map) {
        int i = 2 % 2;
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) && !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            int i2 = AFPurchaseDetails + 115;
            afLogForce = i2 % 128;
            int i3 = i2 % 2;
            if (map.get("advertiserId") != null) {
                int i4 = AFPurchaseDetails + 79;
                afLogForce = i4 % 128;
                int i5 = i4 % 2;
                try {
                    if (AFc1tSDK.values(AFInAppEventParameterName().getLevel().AFInAppEventType)) {
                        int i6 = AFPurchaseDetails + 77;
                        afLogForce = i6 % 128;
                        int i7 = i6 % 2;
                        if (map.remove("android_id") != null) {
                            int i8 = afLogForce + 37;
                            AFPurchaseDetails = i8 % 128;
                            if (i8 % 2 != 0) {
                                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        }
                    }
                    if ((!AFc1tSDK.values(AFInAppEventParameterName().i().unregisterClient)) || map.remove("imei") == null) {
                        return;
                    }
                    int i9 = AFPurchaseDetails + 107;
                    afLogForce = i9 % 128;
                    int i10 = i9 % 2;
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                    return;
                } catch (Exception e) {
                    AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
                }
            }
        }
        int i11 = AFPurchaseDetails + 119;
        afLogForce = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String unregisterClient(Context context) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 109;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        String attributionId = getAttributionId(context);
        int i4 = AFPurchaseDetails + 105;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
        return attributionId;
    }

    final Map<String, Object> AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        String str;
        int i = 2 % 2;
        final Context context = AFInAppEventParameterName().w().AFKeystoreWrapper;
        AFd1qSDK AFInAppEventParameterName2 = AFInAppEventParameterName(context);
        AFg1mSDK e = AFInAppEventParameterName().e();
        boolean AFInAppEventType = aFa1qSDK.AFInAppEventType();
        Map<String, Object> map = aFa1qSDK.AFInAppEventType;
        long time = new Date().getTime();
        boolean z = false;
        Object[] objArr = new Object[1];
        a((byte) TextUtils.getCapsMode("", 0, 0), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-567153175) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-450712325) - TextUtils.indexOf("", "", 0, 0), MotionEvent.axisFromString("") - 113, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (isStopped()) {
                AFLogger.afInfoLog("Reporting has been stopped");
            } else {
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (!AFInAppEventType) {
                    str = aFa1qSDK.e;
                } else {
                    int i2 = afLogForce + 89;
                    AFPurchaseDetails = i2 % 128;
                    int i3 = i2 % 2;
                    str = "Launch";
                }
                AFLogger.afInfoLog(sb.append(str).toString());
            }
            registerClient(context);
            e.AFInAppEventType(map, isPreInstalledApp(context), new Function0() { // from class: com.appsflyer.internal.AFb1vSDK$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unregisterClient;
                    unregisterClient = AFb1vSDK.this.unregisterClient(context);
                    return unregisterClient;
                }
            });
            int AFInAppEventType2 = AFInAppEventType(AFInAppEventParameterName2, AFInAppEventType);
            if (aFa1qSDK.e != null) {
                int i4 = AFPurchaseDetails + 59;
                afLogForce = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
            int values2 = values(AFInAppEventParameterName2, z);
            if (AFInAppEventType && AFInAppEventType2 == 1) {
                AppsFlyerProperties.getInstance().AFInAppEventType = true;
            }
            e.valueOf(map, AFInAppEventType2, values2);
            int i6 = AFPurchaseDetails + 73;
            afLogForce = i6 % 128;
            int i7 = i6 % 2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th, true);
        }
        int i8 = AFPurchaseDetails + 117;
        afLogForce = i8 % 128;
        int i9 = i8 % 2;
        return map;
    }

    private static void registerClient(Context context) {
        int i = 2 % 2;
        int i2 = afLogForce + 23;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        try {
            List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!asList.contains("android.permission.INTERNET")) {
                int i4 = AFPurchaseDetails + 91;
                afLogForce = i4 % 128;
                int i5 = i4 % 2;
                AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                int i6 = AFPurchaseDetails + 93;
                afLogForce = i6 % 128;
                int i7 = i6 % 2;
            }
            if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT <= 32 || asList.contains("com.google.android.gms.permission.AD_ID")) {
                return;
            }
            int i8 = afLogForce + 105;
            AFPurchaseDetails = i8 % 128;
            int i9 = i8 % 2;
            AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1aSDK.GENERAL, "Exception while validation permissions. ", e);
        }
    }

    public static Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afLogForce + 121;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 == 0) {
            if (map.containsKey("meta")) {
                Map<String, Object> map2 = (Map) map.get("meta");
                int i3 = AFPurchaseDetails + 75;
                afLogForce = i3 % 128;
                int i4 = i3 % 2;
                return map2;
            }
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            return hashMap;
        }
        map.containsKey("meta");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r4 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String valueOf(Activity activity) {
        Intent intent;
        Bundle extras;
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 103;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            int i4 = AFPurchaseDetails + 101;
            afLogForce = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    extras = intent.getExtras();
                    int i5 = 83 / 0;
                    if (extras != null) {
                    }
                } else {
                    extras = intent.getExtras();
                }
                str = extras.getString("af");
                if (str != null) {
                    AFLogger.INSTANCE.w(AFg1aSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(str)));
                    extras.remove("af");
                    activity.setIntent(intent.putExtras(extras));
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1aSDK.ENGAGEMENT, th.getMessage(), th);
            }
        }
        int i6 = afLogForce + 101;
        AFPurchaseDetails = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static int valueOf(AFd1qSDK aFd1qSDK) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 45;
        afLogForce = i2 % 128;
        int AFInAppEventType = AFInAppEventType(aFd1qSDK, "appsFlyerAdRevenueCount", i2 % 2 != 0);
        int i3 = afLogForce + 9;
        AFPurchaseDetails = i3 % 128;
        if (i3 % 2 == 0) {
            return AFInAppEventType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int AFInAppEventParameterName(AFd1qSDK aFd1qSDK) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 21;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        int AFInAppEventType = AFInAppEventType(aFd1qSDK, "appsFlyerAdImpressionCount", true);
        int i4 = AFPurchaseDetails + 77;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
        return AFInAppEventType;
    }

    public final void AFKeystoreWrapper(Context context, AFc1oSDK aFc1oSDK, Uri uri, Uri uri2) {
        int i = 2 % 2;
        valueOf(context);
        if (!aFc1oSDK.AFKeystoreWrapper("af_deeplink")) {
            String values2 = values(uri.toString());
            AFc1vSDK afRDLog = AFInAppEventParameterName().afRDLog();
            if (afRDLog.AFInAppEventParameterName != null && afRDLog.values != null && values2.contains(afRDLog.AFInAppEventParameterName)) {
                int i2 = AFPurchaseDetails + 45;
                afLogForce = i2 % 128;
                int i3 = i2 % 2;
                Uri.Builder buildUpon = Uri.parse(values2).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : afRDLog.values.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                values2 = buildUpon.build().toString();
                String encodedQuery = buildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFc1oSDK.AFInAppEventType.put("appended_query_params", encodedQuery);
                AFc1kSDK aFc1kSDK = aFc1oSDK.AFInAppEventParameterName;
                if (aFc1kSDK != null) {
                    aFc1kSDK.values(aFc1oSDK.AFInAppEventType);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFc1oSDK.AFInAppEventType.put("af_deeplink", values2);
            AFc1kSDK aFc1kSDK2 = aFc1oSDK.AFInAppEventParameterName;
            if (aFc1kSDK2 != null) {
                aFc1kSDK2.values(aFc1oSDK.AFInAppEventType);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            int i4 = afLogForce + 27;
            AFPurchaseDetails = i4 % 128;
            if (i4 % 2 != 0) {
                hashMap.put("original_link", uri2.toString());
                throw null;
            }
            hashMap.put("original_link", uri2.toString());
        }
        AFb1uSDK.AFInAppEventParameterName(context, hashMap, uri);
        AFf1hSDK aFf1hSDK = new AFf1hSDK(AFInAppEventParameterName(), UUID.randomUUID(), uri);
        if (aFf1hSDK.afInfoLog()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFc1oSDK.AFInAppEventType.put("isBrandedDomain", bool);
            AFc1kSDK aFc1kSDK3 = aFc1oSDK.AFInAppEventParameterName;
            if (aFc1kSDK3 != null) {
                int i5 = AFPurchaseDetails + 61;
                afLogForce = i5 % 128;
                int i6 = i5 % 2;
                aFc1kSDK3.values(aFc1oSDK.AFInAppEventType);
            }
        }
        if (!aFf1hSDK.v()) {
            AFInAppEventParameterName().afRDLog().AFKeystoreWrapper(hashMap);
            return;
        }
        aFf1hSDK.unregisterClient = AFKeystoreWrapper(hashMap);
        AFe1cSDK afInfoLog = AFInAppEventParameterName().afInfoLog();
        afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(aFf1hSDK));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r2.length() == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r2.contains("&") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        r4 = new java.util.ArrayList(java.util.Arrays.asList(r2.split("&")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        r6 = new java.lang.StringBuilder();
        r4 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if ((!r4.hasNext()) == true) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        r7 = (java.lang.String) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if ((!r7.contains("access_token")) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        r7 = com.appsflyer.internal.AFb1vSDK.afLogForce + 87;
        com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r7 % 128;
        r7 = r7 % 2;
        r4.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r6.length() == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        r6.append("&");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        r6.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (r7.startsWith("?") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        r6.append("?");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        return r10.replace(r2, r6.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        r4.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0049, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0047, code lost:
    
        if (r2.length() == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String values(String str) {
        String valueOf2;
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 17;
        afLogForce = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            return null;
        }
        if (!str.matches("fb\\d*?://authorize.*") || !str.contains("access_token")) {
            return str;
        }
        int i3 = afLogForce + 29;
        AFPurchaseDetails = i3 % 128;
        if (i3 % 2 != 0) {
            valueOf2 = valueOf(str);
            int i4 = 69 / 0;
        } else {
            valueOf2 = valueOf(str);
        }
    }

    private static String valueOf(String str) {
        int indexOf;
        int i = 2 % 2;
        int i2 = afLogForce + 79;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 == 0 ? (indexOf = str.indexOf(63)) == -1 : (indexOf = str.indexOf(12)) == -1) {
            int i3 = AFPurchaseDetails + 19;
            afLogForce = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return "";
        }
        String substring = str.substring(indexOf);
        int i4 = AFPurchaseDetails + 67;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
        return substring;
    }

    private AFf1hSDK.AFa1uSDK AFKeystoreWrapper(final Map<String, String> map) {
        int i = 2 % 2;
        AFf1hSDK.AFa1uSDK aFa1uSDK = new AFf1hSDK.AFa1uSDK() { // from class: com.appsflyer.internal.AFb1vSDK.2
            @Override // com.appsflyer.internal.AFf1hSDK.AFa1uSDK
            public final void AFKeystoreWrapper(String str) {
                AFb1vSDK.this.AFInAppEventParameterName().afRDLog().values(str, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1hSDK.AFa1uSDK
            public final void valueOf(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFb1vSDK.this.AFInAppEventParameterName().afRDLog().AFKeystoreWrapper(map);
            }
        };
        int i2 = AFPurchaseDetails + 25;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        return aFa1uSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0026, code lost:
    
        if (r1 == 0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean values(Context context) {
        Context context2;
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 93;
        afLogForce = i2 % 128;
        try {
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
            context2 = context;
        }
        if (i2 % 2 == 0) {
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
            int i3 = 19 / 0;
            context2 = context;
            if (isGooglePlayServicesAvailable == 0) {
            }
            try {
                context2.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                int i4 = afLogForce + 29;
                AFPurchaseDetails = i4 % 128;
                if (i4 % 2 == 0) {
                    return true;
                }
                throw null;
            } catch (PackageManager.NameNotFoundException e) {
                AFLogger.INSTANCE.e(AFg1aSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
                return false;
            }
        }
        int isGooglePlayServicesAvailable2 = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        context2 = context;
        int i5 = AFPurchaseDetails + 51;
        afLogForce = i5 % 128;
        context = i5 % 2;
        return context != 0;
    }

    private String AFInAppEventType(Context context, String str) {
        int i = 2 % 2;
        if (context == null) {
            int i2 = afLogForce + 65;
            AFPurchaseDetails = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        valueOf(context);
        String AFInAppEventType = AFInAppEventParameterName().AFInAppEventType().AFInAppEventType(str);
        int i3 = afLogForce + 37;
        AFPurchaseDetails = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 27 / 0;
        }
        return AFInAppEventType;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        int i = 2 % 2;
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            int i2 = afLogForce + 63;
            AFPurchaseDetails = i2 % 128;
            int i3 = i2 % 2;
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
            int i4 = afLogForce + 103;
            AFPurchaseDetails = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            int i6 = AFPurchaseDetails + 1;
            afLogForce = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = afLogForce + 21;
        AFPurchaseDetails = i8 % 128;
        if (i8 % 2 == 0) {
            AFInAppEventType("preInstallName", jSONObject.toString());
        } else {
            AFInAppEventType("preInstallName", jSONObject.toString());
            throw null;
        }
    }

    private static void AFLogger(String str) {
        int i = 2 % 2;
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                return;
            }
            int i2 = afLogForce + 7;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 != 0) {
                AFInAppEventType("preInstallName", str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AFInAppEventType("preInstallName", str);
            int i3 = AFPurchaseDetails + 25;
            afLogForce = i3 % 128;
            int i4 = i3 % 2;
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        int i = 2 % 2;
        try {
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
        if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) == 0) {
            int i2 = afLogForce + 89;
            AFPurchaseDetails = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = afLogForce + 15;
        int i5 = i4 % 128;
        AFPurchaseDetails = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 81;
        afLogForce = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r5.AFInAppEventParameterName("CACHED_CHANNEL", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r5 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails + 33;
        com.appsflyer.internal.AFb1vSDK.afLogForce = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if ((r5 % 2) == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String AFKeystoreWrapper(AFd1qSDK aFd1qSDK, String str) {
        String AFKeystoreWrapper2;
        int i = 2 % 2;
        int i2 = afLogForce + 85;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            AFKeystoreWrapper2 = aFd1qSDK.AFKeystoreWrapper("CACHED_CHANNEL", (String) null);
            int i3 = 69 / 0;
        } else {
            AFKeystoreWrapper2 = aFd1qSDK.AFKeystoreWrapper("CACHED_CHANNEL", (String) null);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        int i = 2 % 2;
        try {
            String values2 = new AFb1jSDK(context, AFInAppEventParameterName()).values();
            int i2 = afLogForce + 19;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 == 0) {
                return values2;
            }
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    public static synchronized SharedPreferences AFKeystoreWrapper(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (AFb1vSDK.class) {
            int i = 2 % 2;
            if (AFKeystoreWrapper().afInfoLog == null) {
                int i2 = AFPurchaseDetails + 35;
                afLogForce = i2 % 128;
                int i3 = i2 % 2;
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    AFKeystoreWrapper().afInfoLog = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            }
            sharedPreferences = AFKeystoreWrapper().afInfoLog;
            int i4 = afLogForce + 103;
            AFPurchaseDetails = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return sharedPreferences;
    }

    public final AFd1qSDK AFInAppEventParameterName(Context context) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 87;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        valueOf(context);
        AFd1qSDK valueOf2 = AFInAppEventParameterName().valueOf();
        int i4 = afLogForce + 61;
        AFPurchaseDetails = i4 % 128;
        int i5 = i4 % 2;
        return valueOf2;
    }

    public static int AFInAppEventType(AFd1qSDK aFd1qSDK, boolean z) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 125;
        afLogForce = i2 % 128;
        if (i2 % 2 != 0) {
            return AFInAppEventType(aFd1qSDK, "appsFlyerCount", z);
        }
        AFInAppEventType(aFd1qSDK, "appsFlyerCount", z);
        throw null;
    }

    private static int values(AFd1qSDK aFd1qSDK, boolean z) {
        int i = 2 % 2;
        int i2 = afLogForce + 47;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        int AFInAppEventType = AFInAppEventType(aFd1qSDK, "appsFlyerInAppEventCount", z);
        int i4 = afLogForce + 9;
        AFPurchaseDetails = i4 % 128;
        int i5 = i4 % 2;
        return AFInAppEventType;
    }

    private static int AFInAppEventType(AFd1qSDK aFd1qSDK, String str, boolean z) {
        int i = 2 % 2;
        int valueOf2 = aFd1qSDK.valueOf(str, 0);
        if (!z) {
            return valueOf2;
        }
        int i2 = AFPurchaseDetails + 15;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        int i4 = valueOf2 + 1;
        aFd1qSDK.AFInAppEventParameterName(str, i4);
        int i5 = afLogForce + 73;
        AFPurchaseDetails = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        r3 = com.appsflyer.internal.AFb1vSDK.afLogForce + 75;
        com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r3 % 128;
        r3 = r3 % 2;
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r19 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r19 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0056, code lost:
    
        r3 = r19.toString();
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AFb1bSDK v;
        String[] strArr;
        char c;
        String str6;
        int i = 2 % 2;
        int i2 = afLogForce + 101;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            v = AFInAppEventParameterName().v();
            strArr = new String[100];
            strArr[0] = str;
            strArr[1] = str2;
            strArr[4] = str3;
            strArr[2] = str4;
            strArr[3] = str5;
            c = 2;
        } else {
            v = AFInAppEventParameterName().v();
            strArr = new String[6];
            strArr[0] = str;
            strArr[1] = str2;
            strArr[2] = str3;
            strArr[3] = str4;
            strArr[4] = str5;
            c = 5;
        }
        strArr[c] = str6;
        v.AFInAppEventParameterName("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            AFLogger.INSTANCE.i(AFg1aSDK.PURCHASE_VALIDATION, new StringBuilder("Validate in app called with parameters: ").append(str3).append(" ").append(str4).append(" ").append(str5).toString());
        }
        if (str != null && str4 != null && str2 != null) {
            int i3 = AFPurchaseDetails + 87;
            afLogForce = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str5 != null && str3 != null) {
                new Thread(new AFa1aSDK(context.getApplicationContext(), AFInAppEventParameterName().i().AFLogger, AFInAppEventParameterName().AFInAppEventType(), str, str2, str3, str4, str5, map)).start();
                return;
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFKeystoreWrapper;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        int i = 2 % 2;
        int i2 = afLogForce + 49;
        AFPurchaseDetails = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName().i().AFKeystoreWrapper();
            obj.hashCode();
            throw null;
        }
        boolean AFKeystoreWrapper2 = AFInAppEventParameterName().i().AFKeystoreWrapper();
        int i3 = AFPurchaseDetails + 53;
        afLogForce = i3 % 128;
        if (i3 % 2 != 0) {
            return AFKeystoreWrapper2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 111;
        afLogForce = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel();
            AFInAppEventParameterName().v().AFInAppEventParameterName("log", String.valueOf(z));
            AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
            if (!z) {
                int i3 = afLogForce + 71;
                AFPurchaseDetails = i3 % 128;
                int i4 = i3 % 2;
                AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType();
                return;
            }
            AFInAppEventParameterName().AFLogger$LogLevel().registerClient();
            return;
        }
        logLevel.getLevel();
        AFLogger.LogLevel.NONE.getLevel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String str3;
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 5;
        afLogForce = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AFc1tSDK.AFInAppEventType(str2);
            obj.hashCode();
            throw null;
        }
        if (AFc1tSDK.AFInAppEventType(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i3 = afLogForce + 95;
        AFPurchaseDetails = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            str3 = str.trim();
            int i4 = AFPurchaseDetails + 53;
            afLogForce = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 5;
            }
        } else {
            str3 = "";
        }
        AFe1gSDK.valueOf(new AFe1kSDK(str3, str2.trim()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i = 2 % 2;
        int i2 = afLogForce + 29;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        String AFInAppEventParameterName2 = AFInAppEventParameterName().afVerboseLog().AFInAppEventParameterName();
        int i4 = AFPurchaseDetails + 73;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
        return AFInAppEventParameterName2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 81;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().afVerboseLog().AFInAppEventType();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String AFInAppEventType = AFInAppEventParameterName().afVerboseLog().AFInAppEventType();
        int i3 = AFPurchaseDetails + 19;
        afLogForce = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
        return AFInAppEventType;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i2 = 2 % 2;
        int i3 = afLogForce + 59;
        AFPurchaseDetails = i3 % 128;
        int i4 = i3 % 2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (i4 == 0) {
            this.unregisterClient = timeUnit.toMillis(i);
        } else {
            this.unregisterClient = timeUnit.toMillis(i);
            throw null;
        }
    }

    private AFi1hSDK[] registerClient() {
        int i = 2 % 2;
        int i2 = afLogForce + 83;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        AFi1aSDK force = AFInAppEventParameterName().force();
        if (i3 == 0) {
            return force.AFKeystoreWrapper();
        }
        force.AFKeystoreWrapper();
        throw null;
    }

    class AFa1vSDK implements Runnable {
        private final AFa1qSDK values;

        /* synthetic */ AFa1vSDK(AFb1vSDK aFb1vSDK, AFa1qSDK aFa1qSDK, byte b) {
            this(aFa1qSDK);
        }

        private AFa1vSDK(AFa1qSDK aFa1qSDK) {
            this.values = aFa1qSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1vSDK.values(AFb1vSDK.this, this.values);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        int i = 2 % 2;
        int i2 = afLogForce + 47;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(pluginInfo);
        AFInAppEventParameterName().afWarnLog().AFKeystoreWrapper(pluginInfo);
        int i4 = afLogForce + 83;
        AFPurchaseDetails = i4 % 128;
        int i5 = i4 % 2;
    }

    class AFa1uSDK implements AFe1fSDK {
        @Override // com.appsflyer.internal.AFe1fSDK
        public final void AFInAppEventType(AFe1dSDK<?> aFe1dSDK) {
        }

        private AFa1uSDK() {
        }

        /* synthetic */ AFa1uSDK(AFb1vSDK aFb1vSDK, byte b) {
            this();
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void values(AFe1dSDK<?> aFe1dSDK) {
            if (aFe1dSDK instanceof AFf1cSDK) {
                AFb1vSDK.this.AFInAppEventParameterName().AFLogger().values(((AFf1lSDK) aFe1dSDK).unregisterClient.AFLogger);
            }
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void values(AFe1dSDK<?> aFe1dSDK, AFe1bSDK aFe1bSDK) {
            JSONObject valueOf;
            AFg1oSDK valueOf2;
            if (aFe1dSDK instanceof AFf1lSDK) {
                AFf1lSDK aFf1lSDK = (AFf1lSDK) aFe1dSDK;
                boolean z = aFe1dSDK instanceof AFf1cSDK;
                if (z && AFInAppEventType()) {
                    AFf1cSDK aFf1cSDK = (AFf1cSDK) aFe1dSDK;
                    if (aFf1cSDK.values == AFe1bSDK.SUCCESS || aFf1cSDK.AFKeystoreWrapper == 1) {
                        AFg1eSDK aFg1eSDK = new AFg1eSDK(aFf1cSDK, AFb1vSDK.this.AFInAppEventParameterName().valueOf());
                        AFe1cSDK afInfoLog = AFb1vSDK.this.AFInAppEventParameterName().afInfoLog();
                        afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(aFg1eSDK));
                    }
                }
                if (aFe1bSDK == AFe1bSDK.SUCCESS) {
                    AFb1vSDK aFb1vSDK = AFb1vSDK.this;
                    aFb1vSDK.AFInAppEventParameterName(AFb1vSDK.AFInAppEventParameterName(aFb1vSDK)).AFInAppEventParameterName("sentSuccessfully", "true");
                    if (!(aFe1dSDK instanceof AFf1dSDK) && (valueOf2 = new AFg1nSDK(AFb1vSDK.AFInAppEventParameterName(AFb1vSDK.this)).valueOf()) != null && valueOf2.values()) {
                        String str = valueOf2.values;
                        AFLogger.INSTANCE.d(AFg1aSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFg1nSDK.values(str);
                    }
                    ResponseNetwork responseNetwork = ((AFf1nSDK) aFf1lSDK).registerClient;
                    if (responseNetwork != null && (valueOf = AFc1sSDK.valueOf((String) responseNetwork.getBody())) != null) {
                        AFb1vSDK.AFInAppEventType(AFb1vSDK.this, valueOf.optBoolean("send_background", false));
                    }
                    if (z) {
                        AFb1vSDK.valueOf(AFb1vSDK.this, System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(aFe1dSDK instanceof AFg1eSDK) || aFe1bSDK == AFe1bSDK.SUCCESS) {
                return;
            }
            AFg1lSDK aFg1lSDK = new AFg1lSDK(AFb1vSDK.this.AFInAppEventParameterName());
            AFe1cSDK afInfoLog2 = AFb1vSDK.this.AFInAppEventParameterName().afInfoLog();
            afInfoLog2.valueOf.execute(afInfoLog2.new AnonymousClass2(aFg1lSDK));
        }

        private boolean AFInAppEventType() {
            return AFb1vSDK.this.AFInAppEventType != null;
        }
    }

    public final void valueOf(Context context) {
        int i = 2 % 2;
        AFd1nSDK aFd1nSDK = this.force;
        if (context != null) {
            int i2 = AFPurchaseDetails + 57;
            afLogForce = i2 % 128;
            int i3 = i2 % 2;
            AFd1lSDK aFd1lSDK = aFd1nSDK.AFInAppEventParameterName;
            if (context != null) {
                aFd1lSDK.AFKeystoreWrapper = context.getApplicationContext();
                int i4 = afLogForce + 11;
                AFPurchaseDetails = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        int i = 2 % 2;
        AFInAppEventParameterName().getLevel().AFKeystoreWrapper = new AFd1wSDK(strArr);
        int i2 = afLogForce + 91;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        int i = 2 % 2;
        int i2 = afLogForce + 95;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        valueOf(context);
        PurchaseHandler unregisterClient = AFInAppEventParameterName().unregisterClient();
        if (unregisterClient.valueOf(map, purchaseValidationCallback, "subscriptions")) {
            AFf1ySDK aFf1ySDK = new AFf1ySDK(map, purchaseValidationCallback, unregisterClient.AFInAppEventParameterName);
            AFe1cSDK aFe1cSDK = unregisterClient.valueOf;
            aFe1cSDK.valueOf.execute(aFe1cSDK.new AnonymousClass2(aFf1ySDK));
        }
        int i4 = AFPurchaseDetails + 117;
        afLogForce = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r5.valueOf(r6, r7, "purchases") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r5.valueOf(r6, r7, r1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        r1 = new com.appsflyer.internal.AFf1mSDK(r6, r7, r5.AFInAppEventParameterName);
        r5 = r5.valueOf;
        r5.valueOf.execute(new com.appsflyer.internal.AFe1cSDK.AnonymousClass2(r5, r1));
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler unregisterClient;
        int i = 2 % 2;
        int i2 = afLogForce + 39;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            valueOf(context);
            unregisterClient = AFInAppEventParameterName().unregisterClient();
            String[] strArr = new String[1];
            strArr[1] = "purchases";
        } else {
            valueOf(context);
            unregisterClient = AFInAppEventParameterName().unregisterClient();
        }
        int i3 = AFPurchaseDetails + 121;
        afLogForce = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 79;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().afRDLog().valueOf = deepLinkListener;
            AFInAppEventParameterName().afRDLog().registerClient = j;
            int i3 = 56 / 0;
        } else {
            AFInAppEventParameterName().afRDLog().valueOf = deepLinkListener;
            AFInAppEventParameterName().afRDLog().registerClient = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r6 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r6.isEmpty() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        com.appsflyer.AFLogger.afDebugLog(new java.lang.StringBuilder("Setting partner data for ").append(r5).append(": ").append(r6).toString());
        r0 = new org.json.JSONObject(r6).toString().length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        if (r0 <= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
        r6 = new java.util.HashMap();
        r6.put("error", "limit exceeded: ".concat(java.lang.String.valueOf(r0)));
        r1.values.put(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        r1.AFInAppEventParameterName.put(r5, r6);
        r1.values.remove(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if (r1.AFInAppEventParameterName.remove(r5) != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        r5 = "Partner data is missing or `null`";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
    
        com.appsflyer.AFLogger.afWarnLog(r5);
        r5 = com.appsflyer.internal.AFb1vSDK.afLogForce + 123;
        com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        r5 = "Cleared partner data for ".concat(java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if ((!r5.isEmpty()) != true) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r5.isEmpty() != false) goto L31;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPartnerData(String str, Map<String, Object> map) {
        int i = 2 % 2;
        AFd1pSDK level = AFInAppEventParameterName().getLevel();
        if (level.AFInAppEventParameterName == null) {
            level.AFInAppEventParameterName = new AFc1cSDK();
            int i2 = AFPurchaseDetails + 53;
            afLogForce = i2 % 128;
            int i3 = i2 % 2;
        }
        AFc1cSDK aFc1cSDK = level.AFInAppEventParameterName;
        if (str != null) {
            int i4 = AFPurchaseDetails + 23;
            afLogForce = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 79 / 0;
            }
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        int i = 2 % 2;
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        AFb1rSDK.AFInAppEventType = Boolean.valueOf(!z);
        AFd1kSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFInAppEventParameterName2.getLevel().unregisterClient = z;
        if (!z) {
            AFe1cSDK afInfoLog = AFInAppEventParameterName2.afInfoLog();
            afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(new AFf1uSDK(AFInAppEventParameterName())));
            int i2 = afLogForce + 51;
            AFPurchaseDetails = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = AFPurchaseDetails + 71;
        afLogForce = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            AFInAppEventParameterName2.getLevel().AFLogger = null;
        } else {
            AFInAppEventParameterName2.getLevel().AFLogger = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i = 2 % 2;
        int i2 = afLogForce + 15;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1bSDK v = AFInAppEventParameterName().v();
            String[] strArr = new String[0];
            strArr[1] = str;
            v.AFInAppEventParameterName("setImeiData", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setImeiData", str);
        }
        AFInAppEventParameterName().i().unregisterClient = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 33;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setAndroidIdData", str);
        AFInAppEventParameterName().getLevel().AFInAppEventType = str;
        int i4 = AFPurchaseDetails + 109;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        int i = 2 % 2;
        int i2 = afLogForce + 15;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFc1vSDK afRDLog = AFInAppEventParameterName().afRDLog();
        afRDLog.AFLogger.clear();
        afRDLog.AFLogger.addAll(Arrays.asList(strArr));
        int i4 = AFPurchaseDetails + 115;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 87;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        AFInAppEventParameterName().afRDLog().unregisterClient = strArr;
        int i4 = AFPurchaseDetails + 67;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = afLogForce + 91;
        AFPurchaseDetails = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().getLevel().valueOf = AFb1lSDK.AFKeystoreWrapper(str);
            int i3 = afLogForce + 83;
            AFPurchaseDetails = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        AFInAppEventParameterName().getLevel().valueOf = AFb1lSDK.AFKeystoreWrapper(str);
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        valueOf(context);
        AFh1jSDK aFh1jSDK = new AFh1jSDK();
        aFh1jSDK.e = str;
        aFh1jSDK.values = appsFlyerRequestListener;
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
                AFLogger.INSTANCE.w(AFg1aSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1jSDK.valueOf(singletonMap);
        }
        aFh1jSDK.AFInAppEventParameterName = hashMap;
        AFb1bSDK v = AFInAppEventParameterName().v();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = new JSONObject(aFh1jSDK.AFInAppEventParameterName == null ? new HashMap() : aFh1jSDK.AFInAppEventParameterName).toString();
        v.AFInAppEventParameterName("logEvent", strArr);
        if (str == null) {
            values(context, AFh1tSDK.logEvent);
        }
        AFInAppEventType(aFh1jSDK, e(context));
    }

    private static void AFKeystoreWrapper(AFa1qSDK aFa1qSDK, AFh1xSDK aFh1xSDK) {
        int i = 2 % 2;
        if (aFh1xSDK != null) {
            int i2 = afLogForce + 103;
            AFPurchaseDetails = i2 % 128;
            int i3 = i2 % 2;
            aFa1qSDK.valueOf = aFh1xSDK.AFInAppEventType;
            aFa1qSDK.d = aFh1xSDK.AFInAppEventParameterName;
            int i4 = afLogForce + 5;
            AFPurchaseDetails = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = afLogForce + 13;
        AFPurchaseDetails = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private void unregisterClient() {
        int i = 2 % 2;
        int i2 = afLogForce + 57;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
            if (AFf1oSDK.e()) {
                return;
            }
        } else if (AFf1oSDK.e()) {
            return;
        }
        AFd1kSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFe1cSDK afInfoLog = AFInAppEventParameterName2.afInfoLog();
        afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(new AFf1oSDK(AFInAppEventParameterName2)));
        int i4 = afLogForce + 121;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) {
        int i = 2 % 2;
        int i2 = afLogForce + 5;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("getAppsFlyerUID", new String[1]);
            if (context == null) {
                return null;
            }
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("getAppsFlyerUID", new String[0]);
            if (context == null) {
                return null;
            }
        }
        valueOf(context);
        AFd1sSDK AFInAppEventType = AFInAppEventParameterName().AFInAppEventType();
        String valueOf2 = AFb1kSDK.valueOf(AFInAppEventType.valueOf, AFInAppEventType.AFKeystoreWrapper);
        int i3 = AFPurchaseDetails + 59;
        afLogForce = i3 % 128;
        int i4 = i3 % 2;
        return valueOf2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        int i = 2 % 2;
        int i2 = AFPurchaseDetails + 61;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            Objects.requireNonNull(appsFlyerConsent);
            AFInAppEventParameterName().getLevel().d = appsFlyerConsent;
            int i3 = 1 / 0;
        } else {
            Objects.requireNonNull(appsFlyerConsent);
            AFInAppEventParameterName().getLevel().d = appsFlyerConsent;
        }
        int i4 = AFPurchaseDetails + 91;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        int i = 2 % 2;
        AFe1cSDK afInfoLog = this.force.afInfoLog();
        afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(new AFf1pSDK(this.force, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i2 = AFPurchaseDetails + 1;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventType(Context context, Intent intent) {
        Uri uri;
        int i = 2 % 2;
        int i2 = afLogForce + 117;
        AFPurchaseDetails = i2 % 128;
        int i3 = i2 % 2;
        valueOf(context);
        AFc1vSDK afRDLog = AFInAppEventParameterName().afRDLog();
        AFd1qSDK valueOf2 = AFInAppEventParameterName().valueOf();
        boolean z = true;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            int i4 = afLogForce + 15;
            AFPurchaseDetails = i4 % 128;
            int i5 = i4 % 2;
            uri = intent.getData();
        }
        if (uri != null) {
            int i6 = afLogForce + 9;
            AFPurchaseDetails = i6 % 128;
            int i7 = i6 % 2;
            if (!uri.toString().isEmpty()) {
                int i8 = AFPurchaseDetails + 43;
                afLogForce = i8 % 128;
                int i9 = i8 % 2;
                if (valueOf2.AFInAppEventType("ddl_sent") || z) {
                    afRDLog.AFInAppEventParameterName(AFc1oSDK.AFKeystoreWrapper(afRDLog.e.getPurchaseToken()), intent, context);
                } else {
                    afRDLog.values("No direct deep link", (DeepLinkResult.Error) null);
                    return;
                }
            }
        }
        z = false;
        if (valueOf2.AFInAppEventType("ddl_sent")) {
        }
        afRDLog.AFInAppEventParameterName(AFc1oSDK.AFKeystoreWrapper(afRDLog.e.getPurchaseToken()), intent, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, int i, int i2, int i3, Object[] objArr) {
        int i4;
        byte[] bArr;
        boolean z;
        int i5 = 2 % 2;
        AFj1fSDK aFj1fSDK = new AFj1fSDK();
        StringBuilder sb = new StringBuilder();
        int i6 = i3 + ((int) (afVerboseLog ^ (-9170317761439758363L)));
        boolean z2 = i6 == -1;
        if (z2) {
            int i7 = $11;
            int i8 = i7 + 101;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            byte[] bArr2 = afErrorLog;
            if (bArr2 != null) {
                int length = bArr2.length;
                byte[] bArr3 = new byte[length];
                int i10 = i7 + 51;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                for (int i12 = 0; i12 < length; i12++) {
                    bArr3[i12] = (byte) (bArr2[i12] ^ (-9170317761439758363L));
                }
                bArr2 = bArr3;
            }
            i6 = bArr2 != null ? (byte) (((byte) (afErrorLog[i + ((int) (afWarnLog ^ (-9170317761439758363L)))] ^ (-9170317761439758363L))) + ((int) (afVerboseLog ^ (-9170317761439758363L)))) : (short) (((short) (getLevel[i + ((int) (afWarnLog ^ (-9170317761439758363L)))] ^ (-9170317761439758363L))) + ((int) (afVerboseLog ^ (-9170317761439758363L))));
        }
        if (i6 > 0) {
            int i13 = ((i + i6) - 2) + ((int) (afWarnLog ^ (-9170317761439758363L)));
            if (z2) {
                int i14 = $11 + 75;
                $10 = i14 % 128;
                if (i14 % 2 == 0) {
                    i4 = 1;
                    aFj1fSDK.values = i13 + i4;
                    aFj1fSDK.AFKeystoreWrapper = (char) (i2 + ((int) (afDebugLog ^ (-9170317761439758363L))));
                    sb.append(aFj1fSDK.AFKeystoreWrapper);
                    aFj1fSDK.AFInAppEventParameterName = aFj1fSDK.AFKeystoreWrapper;
                    bArr = afErrorLog;
                    if (bArr != null) {
                        int length2 = bArr.length;
                        byte[] bArr4 = new byte[length2];
                        for (int i15 = 0; i15 < length2; i15++) {
                            bArr4[i15] = (byte) (bArr[i15] ^ (-9170317761439758363L));
                        }
                        bArr = bArr4;
                    }
                    if (bArr == null) {
                        int i16 = $10 + 57;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    aFj1fSDK.AFInAppEventType = 1;
                    while (aFj1fSDK.AFInAppEventType < i6) {
                        if (z) {
                            byte[] bArr5 = afErrorLog;
                            aFj1fSDK.values = aFj1fSDK.values - 1;
                            aFj1fSDK.AFKeystoreWrapper = (char) (aFj1fSDK.AFInAppEventParameterName + (((byte) (((byte) (bArr5[r9] ^ (-9170317761439758363L))) + s)) ^ b));
                        } else {
                            short[] sArr = getLevel;
                            aFj1fSDK.values = aFj1fSDK.values - 1;
                            aFj1fSDK.AFKeystoreWrapper = (char) (aFj1fSDK.AFInAppEventParameterName + (((short) (((short) (sArr[r9] ^ (-9170317761439758363L))) + s)) ^ b));
                        }
                        sb.append(aFj1fSDK.AFKeystoreWrapper);
                        aFj1fSDK.AFInAppEventParameterName = aFj1fSDK.AFKeystoreWrapper;
                        aFj1fSDK.AFInAppEventType++;
                    }
                }
            }
            i4 = 0;
            aFj1fSDK.values = i13 + i4;
            aFj1fSDK.AFKeystoreWrapper = (char) (i2 + ((int) (afDebugLog ^ (-9170317761439758363L))));
            sb.append(aFj1fSDK.AFKeystoreWrapper);
            aFj1fSDK.AFInAppEventParameterName = aFj1fSDK.AFKeystoreWrapper;
            bArr = afErrorLog;
            if (bArr != null) {
            }
            if (bArr == null) {
            }
            aFj1fSDK.AFInAppEventType = 1;
            while (aFj1fSDK.AFInAppEventType < i6) {
            }
        }
        objArr[0] = sb.toString();
    }
}
