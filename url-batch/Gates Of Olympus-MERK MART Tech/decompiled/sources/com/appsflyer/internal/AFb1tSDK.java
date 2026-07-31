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
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.ComposerImplKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
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
import com.appsflyer.internal.AFd1hSDK;
import com.appsflyer.internal.AFd1uSDK;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass5;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFg1zSDK;
import com.appsflyer.internal.AFi1pSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.messaging.Constants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.charset.Charset;
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
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFb1tSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    static final String AFInAppEventParameterName;
    public static final String AFInAppEventType;
    static AppsFlyerInAppPurchaseValidatorListener AFKeystoreWrapper = null;
    private static int AFVersionDeclaration = 0;
    private static char afDebugLog = 0;
    private static int afLogForce = 1;
    private static char afRDLog;
    private static char afVerboseLog;
    private static char afWarnLog;
    private static AFb1tSDK unregisterClient;
    public static final String values;
    private Map<Long, String> AFLogger;
    private AFf1jSDK afErrorLog;
    private boolean force;
    private Application i;
    private final AFd1kSDK v;
    private SharedPreferences w;
    public volatile AppsFlyerConversionListener valueOf = null;
    private long registerClient = -1;
    private long e = -1;
    private long d = TimeUnit.SECONDS.toMillis(5);
    private boolean afInfoLog = false;

    static void valueOf() {
        afDebugLog = (char) 35002;
        afVerboseLog = (char) 15364;
        afRDLog = (char) 36697;
        afWarnLog = (char) 49990;
    }

    static /* synthetic */ Application AFInAppEventParameterName(AFb1tSDK aFb1tSDK) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 105;
        int i3 = i2 % 128;
        afLogForce = i3;
        int i4 = i2 % 2;
        Application application = aFb1tSDK.i;
        if (i4 == 0) {
            int i5 = 55 / 0;
        }
        int i6 = i3 + 77;
        AFVersionDeclaration = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 72 / 0;
        }
        return application;
    }

    static /* synthetic */ void AFKeystoreWrapper(AFb1tSDK aFb1tSDK) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 103;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        aFb1tSDK.e();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void AFKeystoreWrapper(AFb1tSDK aFb1tSDK, AFa1rSDK aFa1rSDK) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 81;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        aFb1tSDK.valueOf(aFa1rSDK);
        int i4 = afLogForce + 33;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ long valueOf(AFb1tSDK aFb1tSDK, long j) {
        int i = 2 % 2;
        int i2 = afLogForce;
        int i3 = i2 + 79;
        AFVersionDeclaration = i3 % 128;
        int i4 = i3 % 2;
        aFb1tSDK.e = j;
        int i5 = i2 + 99;
        AFVersionDeclaration = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return j;
    }

    static /* synthetic */ AFf1jSDK valueOf(AFb1tSDK aFb1tSDK) {
        int i = 2 % 2;
        int i2 = afLogForce + ModuleDescriptor.MODULE_VERSION;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        AFf1jSDK AFLogger = aFb1tSDK.AFLogger();
        int i4 = afLogForce + 45;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
        return AFLogger;
    }

    static /* synthetic */ boolean valueOf(AFb1tSDK aFb1tSDK, boolean z) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 37;
        int i3 = i2 % 128;
        afLogForce = i3;
        int i4 = i2 % 2;
        aFb1tSDK.afInfoLog = z;
        int i5 = i3 + 13;
        AFVersionDeclaration = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        valueOf();
        AFInAppEventParameterName = "279";
        String substring = "6.12.6".substring(0, "6.12.6".lastIndexOf("."));
        AFInAppEventType = substring;
        values = new StringBuilder().append(substring).append("/androidevent?buildnumber=6.12.6&app_id=").toString();
        AFKeystoreWrapper = null;
        unregisterClient = new AFb1tSDK();
        int i = afLogForce + 69;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            int i2 = 14 / 0;
        }
    }

    public final AFd1mSDK values() {
        int i = 2 % 2;
        int i2 = afLogForce;
        int i3 = i2 + 75;
        AFVersionDeclaration = i3 % 128;
        int i4 = i3 % 2;
        AFd1kSDK aFd1kSDK = this.v;
        int i5 = i2 + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        AFVersionDeclaration = i5 % 128;
        if (i5 % 2 == 0) {
            return aFd1kSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(AFf1kSDK aFf1kSDK) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 55;
        afLogForce = i2 % 128;
        if (i2 % 2 != 0) {
            AFd1mSDK values2 = values();
            if (aFf1kSDK == AFf1kSDK.SUCCESS) {
                int i3 = AFVersionDeclaration + 105;
                afLogForce = i3 % 128;
                if (i3 % 2 == 0) {
                    values2.onInstallConversionFailureNative().AFInAppEventType();
                    throw null;
                }
                values2.onInstallConversionFailureNative().AFInAppEventType();
            }
            if (!values2.afInfoLog().values()) {
                int i4 = AFVersionDeclaration + 69;
                afLogForce = i4 % 128;
                int i5 = i4 % 2;
                values2.afErrorLogForExcManagerOnly().AFInAppEventParameterName();
                return;
            }
            values2.afErrorLogForExcManagerOnly().AFInAppEventType();
            return;
        }
        values();
        AFf1kSDK aFf1kSDK2 = AFf1kSDK.SUCCESS;
        throw null;
    }

    private synchronized AFf1jSDK AFLogger() {
        int i = 2 % 2;
        if (this.afErrorLog == null) {
            int i2 = afLogForce + 51;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
            this.afErrorLog = new AFf1jSDK() { // from class: com.appsflyer.internal.AFb1tSDK$$ExternalSyntheticLambda2
                @Override // com.appsflyer.internal.AFf1jSDK
                public final void onRemoteConfigUpdateFinished(AFf1kSDK aFf1kSDK) {
                    AFb1tSDK.this.AFKeystoreWrapper(aFf1kSDK);
                }
            };
            int i4 = afLogForce + 25;
            AFVersionDeclaration = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 2;
            } else {
                int i6 = 2 % 2;
            }
        }
        return this.afErrorLog;
    }

    public AFb1tSDK() {
        AFVersionDeclaration.init();
        this.v = new AFd1kSDK();
        values().afErrorLogForExcManagerOnly().AFInAppEventType();
        values().afErrorLogForExcManagerOnly().valueOf();
        AFe1cSDK i = values().i();
        i.valueOf.add(new AFa1vSDK(this, (byte) 0));
    }

    public static AFb1tSDK AFInAppEventType() {
        int i = 2 % 2;
        int i2 = afLogForce;
        int i3 = i2 + 81;
        AFVersionDeclaration = i3 % 128;
        int i4 = i3 % 2;
        AFb1tSDK aFb1tSDK = unregisterClient;
        int i5 = i2 + ModuleDescriptor.MODULE_VERSION;
        AFVersionDeclaration = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return aFb1tSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        valueOf(r5);
        values().afVerboseLog().values(r5, com.appsflyer.internal.AFc1kSDK.AFInAppEventType(values().init()), android.net.Uri.parse(r6.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r6.toString().isEmpty() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r6.toString().isEmpty() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        if (r5 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        values().afVerboseLog().AFKeystoreWrapper(new java.lang.StringBuilder("Context is \"").append(r5).append("\"").toString(), com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performOnAppAttribution(Context context, URI uri) {
        int i = 2 % 2;
        int i2 = afLogForce + 89;
        int i3 = i2 % 128;
        AFVersionDeclaration = i3;
        int i4 = i2 % 2;
        if (uri != null) {
            int i5 = i3 + 65;
            afLogForce = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
        }
        values().afVerboseLog().AFKeystoreWrapper(new StringBuilder("Link is \"").append(uri).append("\"").toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 79;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        setSharingFilterForPartners(strArr);
        int i4 = AFVersionDeclaration + 7;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 67;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = "all";
            setSharingFilterForPartners(strArr);
        } else {
            setSharingFilterForPartners("all");
        }
        int i3 = afLogForce + 25;
        AFVersionDeclaration = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 39;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AFc1pSDK afVerboseLog2 = values().afVerboseLog();
        afVerboseLog2.values = str;
        afVerboseLog2.AFInAppEventType = map;
        int i4 = AFVersionDeclaration + 13;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 45;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (i3 != 0) {
            subscribeForDeepLink(deepLinkListener, timeUnit.toMillis(3L));
            return;
        }
        subscribeForDeepLink(deepLinkListener, timeUnit.toMillis(3L));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(final Intent intent, Context context) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 103;
        int i3 = i2 % 128;
        afLogForce = i3;
        int i4 = i2 % 2;
        if (intent == null) {
            values().afVerboseLog().AFKeystoreWrapper("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            valueOf(applicationContext);
            values().AFInAppEventParameterName().execute(new Runnable() { // from class: com.appsflyer.internal.AFb1tSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1tSDK.this.valueOf(applicationContext, intent);
                }
            });
            int i5 = AFVersionDeclaration + 47;
            afLogForce = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = i3 + 115;
        AFVersionDeclaration = i7 % 128;
        if (i7 % 2 == 0) {
            values().afVerboseLog().AFKeystoreWrapper("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        values().afVerboseLog().AFKeystoreWrapper("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = 2 % 2;
        int i2 = afLogForce + 13;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = values().afVerboseLog().AFInAppEventParameterName;
        if (!list.contains(asList)) {
            list.add(asList);
        }
        int i4 = AFVersionDeclaration + 77;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        boolean z2;
        int i = 2 % 2;
        int i2 = afLogForce + 97;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 == 0) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
            if (z) {
                int i3 = AFVersionDeclaration + 35;
                afLogForce = i3 % 128;
                int i4 = i3 % 2;
                z2 = false;
            } else {
                z2 = true;
            }
            AFb1qSDK.AFKeystoreWrapper = Boolean.valueOf(z2);
            AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
            AppsFlyerProperties.getInstance().remove("advertiserId");
            return;
        }
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        int i = 2 % 2;
        int i2 = afLogForce + 103;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 == 0) {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
            values(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
        } else {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
            values(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
            throw null;
        }
    }

    public final void AFInAppEventType(Context context, Intent intent) {
        int i = 2 % 2;
        AFi1oSDK aFi1oSDK = new AFi1oSDK(intent);
        Object obj = null;
        if (aFi1oSDK.AFInAppEventType("appsflyer_preinstall") != null) {
            int i2 = AFVersionDeclaration + 121;
            afLogForce = i2 % 128;
            if (i2 % 2 == 0) {
                d(aFi1oSDK.AFInAppEventType("appsflyer_preinstall"));
                obj.hashCode();
                throw null;
            }
            d(aFi1oSDK.AFInAppEventType("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String AFInAppEventType2 = aFi1oSDK.AFInAppEventType("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(AFInAppEventType2)));
        if (AFInAppEventType2 != null) {
            values(context).valueOf("referrer", AFInAppEventType2);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", AFInAppEventType2);
            appsFlyerProperties.AFKeystoreWrapper = AFInAppEventType2;
            if (AppsFlyerProperties.getInstance().valueOf()) {
                int i3 = AFVersionDeclaration + 13;
                afLogForce = i3 % 128;
                if (i3 % 2 == 0) {
                    AFLogger.afInfoLog("onReceive: isLaunchCalled");
                    AFKeystoreWrapper(context, AFg1hSDK.onReceive);
                    AFInAppEventParameterName(AFInAppEventType2);
                    obj.hashCode();
                    throw null;
                }
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                AFKeystoreWrapper(context, AFg1hSDK.onReceive);
                AFInAppEventParameterName(AFInAppEventType2);
            }
        }
        int i4 = afLogForce + 113;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void values(JSONObject jSONObject) {
        String str;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        int i2 = afLogForce + 61;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            int i4 = 0;
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                while (i4 < jSONArray.length()) {
                    int i5 = afLogForce + TypedValues.TYPE_TARGET;
                    AFVersionDeclaration = i5 % 128;
                    if (i5 % 2 != 0) {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i4)));
                        i4 += 75;
                    } else {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i4)));
                        i4++;
                    }
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
                    int i6 = 0;
                    while (i6 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i6) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i6) != ((Long) arrayList.get(1)).longValue()) {
                            int i7 = afLogForce + 119;
                            AFVersionDeclaration = i7 % 128;
                            if (i7 % 2 != 0) {
                                if (jSONArray2.getLong(i6) == ((Long) arrayList.get(arrayList.size())).longValue()) {
                                    break;
                                }
                                i6++;
                                str = next;
                            } else {
                                if (jSONArray2.getLong(i6) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                    break;
                                }
                                i6++;
                                str = next;
                            }
                        }
                    }
                } catch (JSONException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    public final void valueOf(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        int i = 2 % 2;
        int i2 = afLogForce + 53;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String AFInAppEventType2 = values(context).AFInAppEventType("extraReferrers", (String) null);
            if (AFInAppEventType2 == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(AFInAppEventType2);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                    int i4 = afLogForce + 11;
                    AFVersionDeclaration = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 4 / 4;
                    }
                } else {
                    jSONArray = new JSONArray();
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                int i6 = afLogForce + ComposerImplKt.nodeKey;
                AFVersionDeclaration = i6 % 128;
                int i7 = i6 % 2;
                jSONArray2.put(currentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                values(jSONObject);
            }
            jSONObject.put(str, jSONArray2.toString());
            values(context).valueOf("extraReferrers", jSONObject.toString());
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Couldn't save referrer - ").append(str).append(": ").toString(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFKeystoreWrapper(AFd1mSDK aFd1mSDK) {
        int i = 2 % 2;
        int i2 = afLogForce + 69;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        aFd1mSDK.afWarnLog().values();
        int i4 = afLogForce + 61;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        int i = 2 % 2;
        valueOf(context);
        final AFd1mSDK values2 = values();
        values2.force().d = z;
        values2.AFInAppEventParameterName().submit(new Runnable() { // from class: com.appsflyer.internal.AFb1tSDK$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AFb1tSDK.AFKeystoreWrapper(AFd1mSDK.this);
            }
        });
        if (z) {
            int i2 = AFVersionDeclaration + 37;
            afLogForce = i2 % 128;
            values2.valueOf().AFInAppEventParameterName("is_stop_tracking_used", i2 % 2 != 0);
        }
        int i3 = AFVersionDeclaration + 91;
        afLogForce = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 61;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            values().afInfoLog().AFInAppEventType("getSdkVersion", new String[1]);
        } else {
            values().afInfoLog().AFInAppEventType("getSdkVersion", new String[0]);
        }
        return AFd1pSDK.valueOf();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 15;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        values().afLogForce().valueOf();
        int i4 = AFVersionDeclaration + 71;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        valueOf(context);
        AFf1bSDK aFf1bSDK = new AFf1bSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFg1jSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFg1jSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(String.valueOf(str)));
        AFg1ySDK valueOf = aFf1bSDK.valueOf();
        if (valueOf == null || !str.equals(valueOf.AFInAppEventType)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = valueOf == null || currentTimeMillis - valueOf.values > TimeUnit.SECONDS.toMillis(2L);
            AFg1ySDK aFg1ySDK = new AFg1ySDK(str, currentTimeMillis, !z);
            aFf1bSDK.AFKeystoreWrapper.valueOf("afUninstallToken", aFg1ySDK.AFInAppEventType);
            aFf1bSDK.AFKeystoreWrapper.AFInAppEventParameterName("afUninstallToken_received_time", aFg1ySDK.values);
            aFf1bSDK.AFKeystoreWrapper.AFInAppEventParameterName("afUninstallToken_queued", aFg1ySDK.AFInAppEventParameterName());
            if (z) {
                AFf1bSDK.AFInAppEventParameterName(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        r4 = com.appsflyer.AFLogger.LogLevel.DEBUG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r4 = com.appsflyer.AFLogger.LogLevel.NONE;
        r1 = com.appsflyer.internal.AFb1tSDK.afLogForce + 19;
        com.appsflyer.internal.AFb1tSDK.AFVersionDeclaration = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        r0 = 4 / 3;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 81;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i = 2 % 2;
        int i2 = afLogForce + 69;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        values().afInfoLog().AFInAppEventType("setOaidData", str);
        AFb1qSDK.valueOf = str;
        int i4 = afLogForce + 49;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void AFInAppEventParameterName(String str, String str2) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 39;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i4 = AFVersionDeclaration + 23;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }

    private static void values(String str, boolean z) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 23;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, z);
            int i3 = 60 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, z);
        }
        int i4 = afLogForce + 85;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
    }

    private static String AFInAppEventType(String str) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + TypedValues.TYPE_TARGET;
        afLogForce = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AppsFlyerProperties.getInstance().getString(str);
            obj.hashCode();
            throw null;
        }
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i3 = AFVersionDeclaration + 103;
        afLogForce = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    private static boolean valueOf(String str) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 17;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(str, false);
        int i4 = afLogForce + 17;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return z;
    }

    public final boolean AFInAppEventParameterName() {
        int i = 2 % 2;
        if (valueOf(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) {
            int i2 = AFVersionDeclaration + 5;
            afLogForce = i2 % 128;
            int i3 = i2 % 2;
            if (AFKeystoreWrapper() == null) {
                return true;
            }
        }
        int i4 = AFVersionDeclaration + ComposerImplKt.nodeKey;
        afLogForce = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        int i = 2 % 2;
        int i2 = afLogForce + 51;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
        int i4 = afLogForce + 3;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        int i = 2 % 2;
        if (context != null) {
            if (!AFInAppEventParameterName()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            setCustomerUserId(str);
            AFLogger.afInfoLog(new StringBuilder("CustomerUserId set: ").append(str).append(" - Initializing AppsFlyer Tacking").toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(values().valueOf());
            AFKeystoreWrapper(context, AFg1hSDK.setCustomerIdAndLogSession);
            String str2 = values().force().unregisterClient;
            if (referrer == null) {
                referrer = "";
            }
            if (context instanceof Activity) {
                int i2 = afLogForce + 15;
                AFVersionDeclaration = i2 % 128;
                if (i2 % 2 != 0) {
                    ((Activity) context).getIntent();
                    int i3 = 72 / 0;
                } else {
                    ((Activity) context).getIntent();
                }
                int i4 = afLogForce + 11;
                AFVersionDeclaration = i4 % 128;
                int i5 = i4 % 2;
            }
            AFKeystoreWrapper(context, referrer);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i = 2 % 2;
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            String AFInAppEventParameterName2 = AFInAppEventParameterName(context, "AF_STORE");
            if (AFInAppEventParameterName2 == null) {
                AFLogger.afInfoLog("No out-of-store value set");
                return null;
            }
            int i2 = afLogForce + 89;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
            return AFInAppEventParameterName2;
        }
        int i4 = afLogForce + 89;
        int i5 = i4 % 128;
        AFVersionDeclaration = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 105;
        afLogForce = i7 % 128;
        int i8 = i7 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r5 = r5.toLowerCase(java.util.Locale.getDefault());
        com.appsflyer.AppsFlyerProperties.getInstance().set(com.appsflyer.AppsFlyerProperties.AF_STORE_FROM_API, r5);
        com.appsflyer.AFLogger.afInfoLog("Store API set with value: ".concat(java.lang.String.valueOf(r5)), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r5 = r5.toLowerCase(java.util.Locale.getDefault());
        com.appsflyer.AppsFlyerProperties.getInstance().set(com.appsflyer.AppsFlyerProperties.AF_STORE_FROM_API, r5);
        com.appsflyer.AFLogger.afInfoLog("Store API set with value: ".concat(java.lang.String.valueOf(r5)), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0016, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005b, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
        r5 = com.appsflyer.internal.AFb1tSDK.afLogForce + 35;
        com.appsflyer.internal.AFb1tSDK.AFVersionDeclaration = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0069, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 119;
        com.appsflyer.internal.AFb1tSDK.AFVersionDeclaration = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setOutOfStore(String str) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 39;
        int i3 = i2 % 128;
        afLogForce = i3;
        if (i2 % 2 == 0) {
            int i4 = 11 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003f, code lost:
    
        if (r5.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) == false) goto L11;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAppInviteOneLink(String str) {
        int i = 2 % 2;
        values().afInfoLog().AFInAppEventType("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str != null) {
            int i2 = afLogForce + 9;
            AFVersionDeclaration = i2 % 128;
            if (i2 % 2 != 0) {
                str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID));
                throw null;
            }
        }
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        int i3 = afLogForce + 55;
        AFVersionDeclaration = i3 % 128;
        int i4 = i3 % 2;
        AFInAppEventParameterName(AppsFlyerProperties.ONELINK_ID, str);
        int i5 = AFVersionDeclaration + 25;
        afLogForce = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 11;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (map != null) {
            values().afInfoLog().AFInAppEventType("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            int i3 = afLogForce + 31;
            AFVersionDeclaration = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01cf  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        int i;
        long j;
        int i2 = 2;
        int i3 = 2 % 2;
        if (activity != null && activity.getIntent() != null) {
            values().afInfoLog().AFInAppEventType("sendPushNotificationData", activity.getLocalClassName(), new StringBuilder("activity_intent_").append(activity.getIntent().toString()).toString());
        } else if (activity != null) {
            int i4 = AFVersionDeclaration + 35;
            afLogForce = i4 % 128;
            if (i4 % 2 == 0) {
                AFb1bSDK afInfoLog = values().afInfoLog();
                String[] strArr = new String[3];
                strArr[0] = activity.getLocalClassName();
                strArr[1] = "activity_intent_null";
                afInfoLog.AFInAppEventType("sendPushNotificationData", strArr);
            } else {
                values().afInfoLog().AFInAppEventType("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            }
        } else {
            values().afInfoLog().AFInAppEventType("sendPushNotificationData", "activity_null");
        }
        AFd1qSDK AFLogger$LogLevel = values().AFLogger$LogLevel();
        AFLogger$LogLevel.AFInAppEventParameterName = AFKeystoreWrapper(activity);
        if (AFLogger$LogLevel.AFInAppEventParameterName != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.AFLogger == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.AFLogger = new ConcurrentHashMap();
                i = 2;
                j = currentTimeMillis;
            } else {
                try {
                    long j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    j = currentTimeMillis;
                    for (Long l : this.AFLogger.keySet()) {
                        try {
                            JSONObject jSONObject = new JSONObject(AFLogger$LogLevel.AFInAppEventParameterName);
                            JSONObject jSONObject2 = new JSONObject(this.AFLogger.get(l));
                            i = i2;
                            try {
                                if (jSONObject.opt("pid").equals(jSONObject2.opt("pid"))) {
                                    int i5 = afLogForce + 77;
                                    AFVersionDeclaration = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        jSONObject.opt("c").equals(jSONObject2.opt("c"));
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                        AFLogger.afInfoLog(new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ").append(jSONObject2).append(", new: ").append(jSONObject).append(")").toString());
                                        AFLogger$LogLevel.AFInAppEventParameterName = null;
                                        return;
                                    }
                                }
                                if (currentTimeMillis - l.longValue() > j2) {
                                    int i6 = AFVersionDeclaration + 21;
                                    afLogForce = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        this.AFLogger.remove(l);
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    this.AFLogger.remove(l);
                                }
                                if (l.longValue() <= j) {
                                    j = l.longValue();
                                    int i7 = afLogForce + 81;
                                    AFVersionDeclaration = i7 % 128;
                                    int i8 = i7 % 2;
                                }
                                i2 = i;
                            } catch (Throwable th) {
                                th = th;
                                AFLogger.afErrorLog(new StringBuilder("Error while handling push notification measurement: ").append(th.getClass().getSimpleName()).toString(), th);
                                if (this.AFLogger.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", i)) {
                                }
                                this.AFLogger.put(Long.valueOf(currentTimeMillis), AFLogger$LogLevel.AFInAppEventParameterName);
                                start(activity);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i = i2;
                        }
                    }
                    i = i2;
                } catch (Throwable th3) {
                    th = th3;
                    i = 2;
                    j = currentTimeMillis;
                }
            }
            if (this.AFLogger.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", i)) {
                AFLogger.afInfoLog(new StringBuilder("pushes: removing oldest overflowing push (oldest push:").append(j).append(")").toString());
                this.AFLogger.remove(Long.valueOf(j));
            }
            this.AFLogger.put(Long.valueOf(currentTimeMillis), AFLogger$LogLevel.AFInAppEventParameterName);
            start(activity);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 69;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        values().afInfoLog().AFInAppEventType("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        int i4 = afLogForce + 3;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: com.appsflyer.internal.AFb1tSDK$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            values = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
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
        values().afInfoLog().AFInAppEventType("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        int i2 = afLogForce + 41;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        String str = null;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = afLogForce + 83;
            AFVersionDeclaration = i5 % 128;
            if (i5 % 2 != 0) {
                String str2 = strArr[i4];
                int i6 = AnonymousClass5.values[emailsCryptType.ordinal()];
                throw null;
            }
            String str3 = strArr[i4];
            if (AnonymousClass5.values[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFb1lSDK.values(str3));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str3);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 29;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        values().afInfoLog().AFInAppEventType("setCollectAndroidID", String.valueOf(z));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        int i4 = AFVersionDeclaration + 41;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        int i = 2 % 2;
        int i2 = afLogForce + 37;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        values().afInfoLog().AFInAppEventType("setCollectIMEI", String.valueOf(z));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        int i4 = afLogForce + 1;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        int i = 2 % 2;
        int i2 = afLogForce + 121;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1bSDK afInfoLog = values().afInfoLog();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            afInfoLog.AFInAppEventType("setCollectOaid", strArr);
        } else {
            values().afInfoLog().AFInAppEventType("setCollectOaid", String.valueOf(z));
        }
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0015, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        values().afErrorLogForExcManagerOnly().values();
        r3 = com.appsflyer.internal.AFb1tSDK.afLogForce + 73;
        com.appsflyer.internal.AFb1tSDK.AFVersionDeclaration = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if ((r3 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        r3 = null;
        r3.hashCode();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void AFInAppEventType(boolean z) {
        int i = 2 % 2;
        int i2 = afLogForce + 27;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void unregisterClient() {
        int i = 2 % 2;
        valueOf(new AFg1aSDK());
        int i2 = afLogForce + 111;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b5, code lost:
    
        if (r2.length > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01be, code lost:
    
        if (r2.length <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c0, code lost:
    
        r2 = java.util.Arrays.copyOfRange(r2, 0, 8);
        r5 = com.appsflyer.internal.AFb1tSDK.afLogForce + 65;
        com.appsflyer.internal.AFb1tSDK.AFVersionDeclaration = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01cd, code lost:
    
        if ((r5 % 2) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01cf, code lost:
    
        r5 = 3 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01d1, code lost:
    
        r5 = java.nio.ByteBuffer.allocate(8);
        r5.put(r2);
        r5.flip();
        r5 = r5.getLong();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b9, code lost:
    
        if (r2.length > 0) goto L42;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        String str2;
        int i = 2 % 2;
        int i2 = afLogForce + 31;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        if (this.force) {
            return this;
        }
        this.force = true;
        values().force().unregisterClient = str;
        AFb1hSDK.AFKeystoreWrapper(str);
        if (context != null) {
            valueOf(context);
            Application values2 = AFb1rSDK.values(context);
            if (values2 == null) {
                return this;
            }
            this.i = values2;
            values().afWarnLog().AFInAppEventType();
            values().d().AFInAppEventParameterName = System.currentTimeMillis();
            AFh1lSDK level = values().getLevel();
            level.values = Build.VERSION.SDK_INT >= 31 ? new AFh1fSDK(level.AFInAppEventType) : new AFh1eSDK(level.AFInAppEventType);
            values().onInstallConversionFailureNative().AFInAppEventParameterName(new AFd1hSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFb1tSDK$$ExternalSyntheticLambda0
                @Override // com.appsflyer.internal.AFd1hSDK.AFa1ySDK
                public final void onConfigurationChanged(boolean z) {
                    AFb1tSDK.this.AFInAppEventType(z);
                }
            });
            values().registerClient().valueOf(AFLogger());
            AFi1rSDK w = values().w();
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFb1tSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1tSDK.this.unregisterClient();
                }
            };
            AFi1xSDK values3 = w.values(runnable);
            Runnable AFKeystoreWrapper2 = w.AFKeystoreWrapper(values3, runnable);
            w.valueOf(values3);
            w.valueOf(new AFi1sSDK(w.values.values(), AFKeystoreWrapper2));
            w.valueOf(new AFi1vSDK(AFKeystoreWrapper2, w.values));
            w.valueOf(new AFi1tSDK(AFKeystoreWrapper2, w.values));
            w.valueOf(AFKeystoreWrapper2);
            if (!w.values()) {
                Context context2 = w.values.v().AFKeystoreWrapper;
                AFd1mSDK aFd1mSDK = w.values;
                List<ResolveInfo> queryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
                    while (it.hasNext()) {
                        int i4 = AFVersionDeclaration + 47;
                        afLogForce = i4 % 128;
                        int i5 = i4 % 2;
                        ProviderInfo providerInfo = it.next().providerInfo;
                        if (providerInfo != null) {
                            arrayList.add(new AFi1qSDK(providerInfo, AFKeystoreWrapper2, aFd1mSDK));
                        } else {
                            AFLogger.INSTANCE.w(AFg1jSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        w.valueOf.addAll(arrayList);
                        AFLogger.INSTANCE.d(AFg1jSDK.PREINSTALL, new StringBuilder("Detected ").append(arrayList.size()).append(" valid preinstall provider(s)").toString());
                    }
                }
            }
            for (AFi1pSDK aFi1pSDK : w.AFKeystoreWrapper()) {
                int i6 = afLogForce + 67;
                AFVersionDeclaration = i6 % 128;
                int i7 = i6 % 2;
                aFi1pSDK.AFInAppEventType(w.values.v().AFKeystoreWrapper);
            }
            final AFg1xSDK force = this.v.force();
            AFd1pSDK values4 = values().values();
            force.valueOf = System.currentTimeMillis();
            AFg1zSDK aFg1zSDK = force.AFInAppEventParameterName;
            byte[] AFInAppEventParameterName2 = AFb1lSDK.AFInAppEventParameterName(new StringBuilder().append(AFb1iSDK.AFKeystoreWrapper(values4.AFInAppEventParameterName, values4.valueOf)).append(force.valueOf).toString());
            if (AFInAppEventParameterName2 != null) {
                int i8 = afLogForce + 35;
                AFVersionDeclaration = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 68 / 0;
                }
                force.AFInAppEventType = aFg1zSDK.AFInAppEventType(r5, force.AFKeystoreWrapper.AFKeystoreWrapper, new AFg1zSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFg1xSDK.3
                    public AnonymousClass3() {
                    }

                    @Override // com.appsflyer.internal.AFg1zSDK.AFa1ySDK
                    public final void AFKeystoreWrapper(String str3, String str4) {
                        AFg1xSDK.this.values = new ConcurrentHashMap();
                        AFg1xSDK.this.values.put("signedData", str3);
                        AFg1xSDK.this.values.put("signature", str4);
                        AFg1xSDK.this.AFInAppEventParameterName();
                        AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                    }

                    @Override // com.appsflyer.internal.AFg1zSDK.AFa1ySDK
                    public final void AFInAppEventType(String str3, Exception exc) {
                        AFg1xSDK.this.values = new ConcurrentHashMap();
                        String message = exc.getMessage();
                        if (message == null) {
                            message = EnvironmentCompat.MEDIA_UNKNOWN;
                        }
                        AFg1xSDK.this.AFInAppEventParameterName();
                        AFg1xSDK.this.values.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, message);
                        AFLogger.afErrorLog(str3, exc, true, true, false);
                    }
                });
            }
            long j = -1;
            force.AFInAppEventType = aFg1zSDK.AFInAppEventType(j, force.AFKeystoreWrapper.AFKeystoreWrapper, new AFg1zSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFg1xSDK.3
                public AnonymousClass3() {
                }

                @Override // com.appsflyer.internal.AFg1zSDK.AFa1ySDK
                public final void AFKeystoreWrapper(String str3, String str4) {
                    AFg1xSDK.this.values = new ConcurrentHashMap();
                    AFg1xSDK.this.values.put("signedData", str3);
                    AFg1xSDK.this.values.put("signature", str4);
                    AFg1xSDK.this.AFInAppEventParameterName();
                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                }

                @Override // com.appsflyer.internal.AFg1zSDK.AFa1ySDK
                public final void AFInAppEventType(String str3, Exception exc) {
                    AFg1xSDK.this.values = new ConcurrentHashMap();
                    String message = exc.getMessage();
                    if (message == null) {
                        message = EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    AFg1xSDK.this.AFInAppEventParameterName();
                    AFg1xSDK.this.values.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, message);
                    AFLogger.afErrorLog(str3, exc, true, true, false);
                }
            });
        } else {
            AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFb1bSDK afInfoLog = values().afInfoLog();
        String[] strArr = new String[2];
        strArr[0] = str;
        if (appsFlyerConversionListener == null) {
            str2 = AbstractJsonLexerKt.NULL;
        } else {
            int i10 = afLogForce + 25;
            AFVersionDeclaration = i10 % 128;
            int i11 = i10 % 2;
            str2 = "conversionDataListener";
        }
        strArr[1] = str2;
        afInfoLog.AFInAppEventType("init", strArr);
        AFLogger.INSTANCE.force(AFg1jSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.12.6", AFInAppEventParameterName));
        this.valueOf = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 33;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        values().afRDLog().AFInAppEventType(z);
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 33;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        start(context, null);
        if (i3 == 0) {
            throw null;
        }
        int i4 = afLogForce + 9;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + ComposerImplKt.nodeKey;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        start(context, str, null);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r11 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r12 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        r12.onError(41, "No dev key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r11 == null) goto L19;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        int i = 2 % 2;
        int i2 = afLogForce + 9;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
            if (values().afLogForce().AFKeystoreWrapper()) {
                return;
            }
        } else if (values().afLogForce().AFKeystoreWrapper()) {
            return;
        }
        if (!this.force) {
            int i4 = afLogForce + 123;
            AFVersionDeclaration = i4 % 128;
            if (i4 % 2 != 0) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
                int i5 = 38 / 0;
            } else {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            }
        }
        valueOf(context);
        final AFg1gSDK d = values().d();
        d.AFKeystoreWrapper(AFa1oSDK.AFInAppEventType(context));
        if (this.i == null) {
            Application values2 = AFb1rSDK.values(context);
            if (values2 == null) {
                int i6 = AFVersionDeclaration + 93;
                afLogForce = i6 % 128;
                int i7 = i6 % 2;
                return;
            } else {
                this.i = values2;
                int i8 = afLogForce + 81;
                AFVersionDeclaration = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        values().afInfoLog().AFInAppEventType("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1jSDK aFg1jSDK = AFg1jSDK.GENERAL;
        String str2 = AFInAppEventParameterName;
        aFLogger.i(aFg1jSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.12.6", str2));
        AFLogger.INSTANCE.i(AFg1jSDK.GENERAL, new StringBuilder("Build Number: ").append(str2).toString());
        AppsFlyerProperties.getInstance().loadProperties(values().valueOf());
        if (!TextUtils.isEmpty(str)) {
            values().force().unregisterClient = str;
            AFb1hSDK.AFKeystoreWrapper(str);
        } else if (TextUtils.isEmpty(values().force().unregisterClient)) {
            int i10 = AFVersionDeclaration + 53;
            afLogForce = i10 % 128;
            int i11 = i10 % 2;
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        values().registerClient().valueOf(AFLogger());
        e();
        AFInAppEventType(this.i.getBaseContext());
        values().afRDLog().AFInAppEventType();
        this.v.afLogForce().valueOf(context, new AFd1uSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFb1tSDK.2
            @Override // com.appsflyer.internal.AFd1uSDK.AFa1tSDK
            public final void values(AFg1fSDK aFg1fSDK) {
                d.AFInAppEventParameterName();
                AFd1mSDK values3 = AFb1tSDK.this.values();
                values3.registerClient().valueOf(AFb1tSDK.valueOf(AFb1tSDK.this));
                AFb1tSDK.AFKeystoreWrapper(AFb1tSDK.this);
                int AFKeystoreWrapper2 = values3.values().valueOf.AFKeystoreWrapper("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (AFKeystoreWrapper2 < 2) {
                    AFb1tSDK.this.values().e().valueOf();
                }
                AFh1xSDK aFh1xSDK = new AFh1xSDK();
                if (aFg1fSDK != null) {
                    AFb1tSDK.this.values().afVerboseLog().valueOf(AFc1kSDK.AFInAppEventParameterName(aFh1xSDK), aFg1fSDK.values, values3.v().AFKeystoreWrapper);
                }
                AFb1tSDK aFb1tSDK = AFb1tSDK.this;
                aFh1xSDK.valueOf = appsFlyerRequestListener;
                aFb1tSDK.valueOf(aFh1xSDK, aFg1fSDK);
            }

            @Override // com.appsflyer.internal.AFd1uSDK.AFa1tSDK
            public final void AFInAppEventParameterName() {
                Context context2 = AFb1tSDK.this.values().v().AFKeystoreWrapper;
                AFLogger.afInfoLog("onBecameBackground");
                AFg1gSDK aFg1gSDK = d;
                long currentTimeMillis = System.currentTimeMillis();
                if (aFg1gSDK.e != 0) {
                    long j = currentTimeMillis - aFg1gSDK.e;
                    if (j > 0 && j < 1000) {
                        j = 1000;
                    }
                    aFg1gSDK.force = TimeUnit.MILLISECONDS.toSeconds(j);
                    aFg1gSDK.valueOf.AFInAppEventParameterName("prev_session_dur", aFg1gSDK.force);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFb1tSDK.this.values().onInstallConversionFailureNative().AFInAppEventParameterName();
                AFb1bSDK afInfoLog = AFb1tSDK.this.values().afInfoLog();
                if (afInfoLog.d()) {
                    afInfoLog.AFInAppEventParameterName();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        afInfoLog.AFInAppEventType(context2.getPackageName(), context2.getPackageManager());
                    }
                    afInfoLog.AFKeystoreWrapper();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFb1tSDK.this.values().e().AFInAppEventParameterName();
                AFb1tSDK.this.values().init().AFInAppEventType();
            }
        });
        int i12 = AFVersionDeclaration + 23;
        afLogForce = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void AFInAppEventType(Context context) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 95;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    int i4 = AFVersionDeclaration + 97;
                    afLogForce = i4 % 128;
                    int i5 = i4 % 2;
                    AFLogger.INSTANCE.i(AFg1jSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    return;
                }
                AFLogger.INSTANCE.w(AFg1jSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules", true);
            }
            int i6 = afLogForce + 95;
            AFVersionDeclaration = i6 % 128;
            int i7 = i6 % 2;
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1jSDK.GENERAL, "checkBackupRules Exception", e, false, false);
            AFLogger.INSTANCE.v(AFg1jSDK.GENERAL, "checkBackupRules Exception: ".concat(String.valueOf(e)));
        }
    }

    public static String AFKeystoreWrapper() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 37;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        String AFInAppEventType2 = AFInAppEventType(AppsFlyerProperties.APP_USER_ID);
        int i4 = AFVersionDeclaration + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        afLogForce = i4 % 128;
        if (i4 % 2 != 0) {
            return AFInAppEventType2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 119;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        values().afInfoLog().AFInAppEventType("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFInAppEventParameterName(AppsFlyerProperties.APP_USER_ID, str);
        values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i4 = AFVersionDeclaration + 5;
        afLogForce = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 59;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        values().afInfoLog().AFInAppEventType("setAppId", str);
        AFInAppEventParameterName(AppsFlyerProperties.APP_ID, str);
        int i4 = AFVersionDeclaration + 61;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 121;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        values().afInfoLog().AFInAppEventType("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i4 = afLogForce + 91;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i = 2 % 2;
        int i2 = afLogForce + 73;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1bSDK afInfoLog = values().afInfoLog();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            afInfoLog.AFInAppEventType("setIsUpdate", strArr);
        } else {
            values().afInfoLog().AFInAppEventType("setIsUpdate", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i3 = AFVersionDeclaration + 59;
        afLogForce = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i = 2 % 2;
        int i2 = afLogForce + 87;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1bSDK afInfoLog = values().afInfoLog();
            String[] strArr = new String[0];
            strArr[1] = str;
            afInfoLog.AFInAppEventType("setCurrencyCode", strArr);
        } else {
            values().afInfoLog().AFInAppEventType("setCurrencyCode", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i3 = AFVersionDeclaration + 3;
        afLogForce = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        int i = 2 % 2;
        values().afInfoLog().AFInAppEventType("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        values(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        int i2 = AFVersionDeclaration + 21;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + ComposerImplKt.nodeKey;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        values().afInfoLog().AFInAppEventType("logSession", new String[0]);
        values().afInfoLog().AFInAppEventType();
        AFKeystoreWrapper(context, AFg1hSDK.logSession);
        values(context, null, null);
        int i4 = AFVersionDeclaration + 43;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    private void AFKeystoreWrapper(Context context, AFg1hSDK aFg1hSDK) {
        int i = 2 % 2;
        valueOf(context);
        AFg1gSDK d = values().d();
        AFg1iSDK AFInAppEventType2 = AFa1oSDK.AFInAppEventType(context);
        if (d.AFKeystoreWrapper()) {
            int i2 = afLogForce + 41;
            AFVersionDeclaration = i2 % 128;
            if (i2 % 2 == 0) {
                d.AFKeystoreWrapper.put("api_name", aFg1hSDK.toString());
                d.AFKeystoreWrapper(AFInAppEventType2);
            } else {
                d.AFKeystoreWrapper.put("api_name", aFg1hSDK.toString());
                d.AFKeystoreWrapper(AFInAppEventType2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        d.AFInAppEventParameterName();
        int i3 = afLogForce + 123;
        AFVersionDeclaration = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int i = 2 % 2;
        int AFInAppEventParameterName2 = AFInAppEventParameterName(values(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adrevenue_counter", Integer.valueOf(AFInAppEventParameterName2));
        AFKeystoreWrapper(context, hashMap, new AFg1eSDK());
        int i2 = afLogForce + 119;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdImpression(Context context, Map<String, Object> map) {
        int i = 2 % 2;
        int values2 = values(values(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adimpression_counter", Integer.valueOf(values2));
        AFKeystoreWrapper(context, hashMap, new AFg1dSDK());
        int i2 = AFVersionDeclaration + 37;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AFKeystoreWrapper(Context context, Map<String, Object> map, AFa1rSDK aFa1rSDK) {
        int i = 2 % 2;
        int i2 = afLogForce + 83;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        valueOf(context);
        aFa1rSDK.values((Map<String, ?>) map);
        valueOf(aFa1rSDK, d(context));
        int i4 = AFVersionDeclaration + 123;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 55;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        logEvent(context, str, map, null);
        int i4 = afLogForce + 5;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
    }

    private AFg1fSDK d(Context context) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration;
        int i3 = i2 + 49;
        afLogForce = i3 % 128;
        int i4 = i3 % 2;
        if (context instanceof Activity) {
            return new AFg1fSDK((Activity) context, values().AFVersionDeclaration());
        }
        int i5 = i2 + TypedValues.TYPE_TARGET;
        afLogForce = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void values(Context context, String str, Map<String, Object> map) {
        int i = 2 % 2;
        AFh1ySDK aFh1ySDK = new AFh1ySDK();
        aFh1ySDK.e = str;
        aFh1ySDK.AFInAppEventType = map;
        valueOf(aFh1ySDK, d(context));
        int i2 = AFVersionDeclaration + 121;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
    }

    final void valueOf(AFa1rSDK aFa1rSDK, AFg1fSDK aFg1fSDK) {
        int i = 2 % 2;
        AFInAppEventParameterName(aFa1rSDK, aFg1fSDK);
        if (values().force().unregisterClient != null) {
            String referrer = AppsFlyerProperties.getInstance().getReferrer(values().valueOf());
            if (referrer == null) {
                int i2 = AFVersionDeclaration + 25;
                afLogForce = i2 % 128;
                int i3 = i2 % 2;
                referrer = "";
            }
            aFa1rSDK.d = referrer;
            values(aFa1rSDK);
            return;
        }
        AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1rSDK.valueOf;
        if (appsFlyerRequestListener != null) {
            int i4 = AFVersionDeclaration + 115;
            afLogForce = i4 % 128;
            int i5 = i4 % 2;
            appsFlyerRequestListener.onError(41, "No dev key");
            int i6 = afLogForce + 29;
            AFVersionDeclaration = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = afLogForce + 69;
        AFVersionDeclaration = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = 2 % 2;
        int i2 = afLogForce + 81;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1bSDK afInfoLog = values().afInfoLog();
            String[] strArr = new String[0];
            strArr[0] = String.valueOf(z);
            afInfoLog.AFInAppEventType("anonymizeUser", strArr);
        } else {
            values().afInfoLog().AFInAppEventType("anonymizeUser", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        int i3 = afLogForce + 39;
        AFVersionDeclaration = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 105;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        values().afInfoLog().AFInAppEventType("registerConversionListener", new String[0]);
        AFInAppEventType(appsFlyerConversionListener);
        int i4 = AFVersionDeclaration + 73;
        afLogForce = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void AFInAppEventType(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = 2 % 2;
        int i2 = afLogForce + 83;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (appsFlyerConversionListener == null) {
            return;
        }
        this.valueOf = appsFlyerConversionListener;
        int i3 = AFVersionDeclaration + 35;
        afLogForce = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = 2 % 2;
        int i2 = afLogForce + 89;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        values().afInfoLog().AFInAppEventType("unregisterConversionListener", new String[0]);
        this.valueOf = null;
        int i4 = AFVersionDeclaration + 15;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r6 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r6 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004b, code lost:
    
        com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
        r4 = com.appsflyer.internal.AFb1tSDK.AFVersionDeclaration + 103;
        com.appsflyer.internal.AFb1tSDK.afLogForce = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 1;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            values().afInfoLog().AFInAppEventType("registerValidatorListener", new String[0]);
            AFLogger.afDebugLog("registerValidatorListener called");
        } else {
            values().afInfoLog().AFInAppEventType("registerValidatorListener", new String[0]);
            AFLogger.afDebugLog("registerValidatorListener called");
        }
    }

    public static String valueOf(SimpleDateFormat simpleDateFormat, long j) {
        int i = 2 % 2;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        int i2 = afLogForce + 105;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 == 0) {
            return format;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void AFKeystoreWrapper(Context context, String str) {
        int i = 2 % 2;
        AFh1xSDK aFh1xSDK = new AFh1xSDK();
        valueOf(context);
        aFh1xSDK.e = null;
        aFh1xSDK.AFInAppEventType = null;
        aFh1xSDK.d = str;
        aFh1xSDK.values = null;
        values(aFh1xSDK);
        int i2 = afLogForce + 37;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
    }

    private void values(AFa1rSDK aFa1rSDK) {
        boolean z;
        int i = 2 % 2;
        int i2 = afLogForce + 105;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            String str = aFa1rSDK.e;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        byte b = 0;
        if (aFa1rSDK.e == null) {
            int i3 = AFVersionDeclaration + 37;
            afLogForce = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (AFInAppEventParameterName()) {
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z) {
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else if (registerClient()) {
                AppsFlyerRequestListener appsFlyerRequestListener = aFa1rSDK.valueOf;
                if (appsFlyerRequestListener != null) {
                    int i5 = afLogForce + 85;
                    AFVersionDeclaration = i5 % 128;
                    int i6 = i5 % 2;
                    appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                    return;
                }
                return;
            }
            this.registerClient = System.currentTimeMillis();
        }
        AFi1iSDK.AFInAppEventParameterName(values().AFInAppEventType(), new AFa1tSDK(this, aFa1rSDK, b), 0L, TimeUnit.MILLISECONDS);
    }

    private boolean registerClient() {
        int i = 2 % 2;
        if (this.registerClient > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.registerClient;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            String valueOf = valueOf(simpleDateFormat, this.registerClient);
            String valueOf2 = valueOf(simpleDateFormat, this.e);
            if (currentTimeMillis < this.d && !isStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", valueOf, valueOf2, Long.valueOf(currentTimeMillis), Long.valueOf(this.d)));
                return true;
            }
            if (!isStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", valueOf, valueOf2, Long.valueOf(currentTimeMillis)));
            }
        } else if (!isStopped()) {
            int i2 = AFVersionDeclaration + 97;
            afLogForce = i2 % 128;
            int i3 = i2 % 2;
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        int i4 = afLogForce + 19;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return false;
    }

    private void AFInAppEventParameterName(String str) {
        int i = 2 % 2;
        byte b = 0;
        AFa1rSDK AFInAppEventParameterName2 = new AFg1bSDK().AFInAppEventParameterName(values().values().valueOf.AFKeystoreWrapper("appsFlyerCount", 0));
        AFInAppEventParameterName2.d = str;
        if (str != null) {
            int i2 = AFVersionDeclaration + 113;
            afLogForce = i2 % 128;
            if (i2 % 2 != 0 ? str.length() > 5 : str.length() > 2) {
                int i3 = AFVersionDeclaration + 43;
                afLogForce = i3 % 128;
                if (i3 % 2 != 0) {
                    if (values().w().valueOf(AFInAppEventParameterName2)) {
                        AFi1iSDK.AFInAppEventParameterName(values().AFInAppEventType(), new AFa1tSDK(this, AFInAppEventParameterName2, b), 5L, TimeUnit.MILLISECONDS);
                    }
                } else {
                    values().w().valueOf(AFInAppEventParameterName2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        }
        int i4 = AFVersionDeclaration + ModuleDescriptor.MODULE_VERSION;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    private void valueOf(AFa1rSDK aFa1rSDK) {
        String AFKeystoreWrapper2;
        long j;
        int i = 2 % 2;
        Context context = values().v().AFKeystoreWrapper;
        if (context == null) {
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        String str = values().force().unregisterClient;
        if (str == null || str.length() == 0) {
            AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
            AFLogger.afInfoLog("AppsFlyer will not track this event.");
            return;
        }
        AFd1xSDK values2 = values(context);
        AppsFlyerProperties.getInstance().saveProperties(values2);
        if (!values().force().AFInAppEventType()) {
            AFLogger.afInfoLog(new StringBuilder("sendWithEvent from activity: ").append(context.getClass().getName()).toString());
        }
        boolean AFInAppEventParameterName2 = aFa1rSDK.AFInAppEventParameterName();
        Map<String, ?> AFKeystoreWrapper3 = AFKeystoreWrapper(aFa1rSDK);
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1rSDK.valueOf;
        String str2 = (String) AFKeystoreWrapper3.get("appsflyerKey");
        if (str2 != null) {
            int i2 = afLogForce + 35;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
            if (str2.length() != 0) {
                if (!isStopped()) {
                    AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
                }
                int i4 = 0;
                int valueOf = valueOf(values2, false);
                AFi1fSDK aFi1fSDK = new AFi1fSDK(values().values());
                Intrinsics.checkNotNullParameter(aFa1rSDK, "");
                boolean AFInAppEventParameterName3 = aFa1rSDK.AFInAppEventParameterName();
                boolean z = aFa1rSDK instanceof AFg1eSDK;
                boolean z2 = aFa1rSDK instanceof AFg1dSDK;
                boolean z3 = aFa1rSDK instanceof AFg1bSDK;
                if ((aFa1rSDK instanceof AFg1aSDK) || z3) {
                    AFKeystoreWrapper2 = aFi1fSDK.AFKeystoreWrapper.AFKeystoreWrapper(AFi1fSDK.values);
                } else if (z2) {
                    AFKeystoreWrapper2 = aFi1fSDK.AFKeystoreWrapper.AFKeystoreWrapper(AFi1fSDK.valueOf);
                } else if (z) {
                    int i5 = afLogForce + 25;
                    AFVersionDeclaration = i5 % 128;
                    int i6 = i5 % 2;
                    AFKeystoreWrapper2 = aFi1fSDK.AFKeystoreWrapper.AFKeystoreWrapper(AFi1fSDK.AFKeystoreWrapper);
                } else if (AFInAppEventParameterName3) {
                    int i7 = AFVersionDeclaration + 73;
                    afLogForce = i7 % 128;
                    AFKeystoreWrapper2 = (i7 % 2 != 0 ? aFi1fSDK.valueOf.valueOf.AFKeystoreWrapper("appsFlyerCount", 0) >= 2 : aFi1fSDK.valueOf.valueOf.AFKeystoreWrapper("appsFlyerCount", 1) >= 2) ? aFi1fSDK.AFKeystoreWrapper.AFKeystoreWrapper(AFi1fSDK.AFLogger) : aFi1fSDK.AFKeystoreWrapper.AFKeystoreWrapper(AFi1fSDK.unregisterClient);
                } else {
                    AFKeystoreWrapper2 = aFi1fSDK.AFKeystoreWrapper.AFKeystoreWrapper(AFi1fSDK.d);
                }
                String AFInAppEventType2 = aFi1fSDK.AFInAppEventType(AFi1fSDK.valueOf(new StringBuilder().append(AFKeystoreWrapper2).append(aFi1fSDK.valueOf.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName()).toString(), z));
                valueOf(AFKeystoreWrapper3);
                AFc1rSDK aFc1rSDK = new AFc1rSDK(values(), aFa1rSDK.values(AFInAppEventType2).values(AFKeystoreWrapper3).AFInAppEventParameterName(valueOf), values().afRDLog().valueOf());
                Object obj = null;
                if (AFInAppEventParameterName2) {
                    AFi1pSDK[] d = d();
                    int length = d.length;
                    int i8 = 0;
                    while (i4 < length) {
                        int i9 = afLogForce + 7;
                        AFVersionDeclaration = i9 % 128;
                        if (i9 % 2 != 0) {
                            AFi1pSDK.AFa1tSDK aFa1tSDK = d[i4].registerClient;
                            AFi1pSDK.AFa1tSDK aFa1tSDK2 = AFi1pSDK.AFa1tSDK.STARTED;
                            throw null;
                        }
                        AFi1pSDK aFi1pSDK = d[i4];
                        if (aFi1pSDK.registerClient == AFi1pSDK.AFa1tSDK.STARTED) {
                            AFLogger.afDebugLog(new StringBuilder("Failed to get ").append(aFi1pSDK.AFInAppEventType).append(" referrer, wait ...").toString());
                            i8 = 1;
                        }
                        i4++;
                    }
                    if (values().afRDLog().values()) {
                        AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                        i4 = 1;
                    } else {
                        i4 = i8;
                    }
                    if (values().force().AFKeystoreWrapper()) {
                        int i10 = AFVersionDeclaration + 65;
                        afLogForce = i10 % 128;
                        int i11 = i10 % 2;
                        i4 = 1;
                    }
                }
                ScheduledExecutorService AFInAppEventType3 = values().AFInAppEventType();
                if (i4 != 0) {
                    int i12 = afLogForce + 73;
                    AFVersionDeclaration = i12 % 128;
                    if (i12 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    j = 500;
                } else {
                    j = 0;
                }
                AFi1iSDK.AFInAppEventParameterName(AFInAppEventType3, aFc1rSDK, j, TimeUnit.MILLISECONDS);
                return;
            }
        }
        AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    private void valueOf(Map<String, Object> map) {
        int i = 2 % 2;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return;
        }
        int i2 = AFVersionDeclaration + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                return;
            }
        } else if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return;
        }
        if (map.get("advertiserId") != null) {
            int i3 = AFVersionDeclaration + ModuleDescriptor.MODULE_VERSION;
            afLogForce = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    AFc1vSDK.AFKeystoreWrapper(values().AFLogger$LogLevel().values);
                    throw null;
                }
                if (AFc1vSDK.AFKeystoreWrapper(values().AFLogger$LogLevel().values)) {
                    int i4 = afLogForce + 93;
                    AFVersionDeclaration = i4 % 128;
                    int i5 = i4 % 2;
                    if (map.remove("android_id") != null) {
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                    }
                }
                if (!AFc1vSDK.AFKeystoreWrapper(values().force().AFLogger) || map.remove("imei") == null) {
                    return;
                }
                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String e(Context context) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 3;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        String attributionId = getAttributionId(context);
        int i4 = AFVersionDeclaration + 121;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return attributionId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (r7.booleanValue() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        AFInAppEventParameterName(r6).put("ad_ids_disabled", java.lang.Boolean.TRUE);
        r7 = com.appsflyer.internal.AFb1tSDK.AFVersionDeclaration + 75;
        com.appsflyer.internal.AFb1tSDK.afLogForce = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        if (r7.booleanValue() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Map<String, Object> AFKeystoreWrapper(AFa1rSDK aFa1rSDK) {
        int i = 2 % 2;
        final Context context = values().v().AFKeystoreWrapper;
        AFd1xSDK values2 = values(context);
        AFg1sSDK unregisterClient2 = values().unregisterClient();
        AFd1qSDK AFLogger$LogLevel = values().AFLogger$LogLevel();
        boolean AFInAppEventParameterName2 = aFa1rSDK.AFInAppEventParameterName();
        Map<String, Object> map = aFa1rSDK.AFKeystoreWrapper;
        AFb1qSDK.values(context, map);
        Boolean bool = AFb1qSDK.AFKeystoreWrapper;
        boolean z = false;
        if (bool != null) {
            int i2 = afLogForce + 93;
            AFVersionDeclaration = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 15 / 0;
            }
        }
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a("൦\u05cc③Ᏻ↳⏺\ud809椵台\ude9f㭵퇓", KeyEvent.normalizeMetaState(0) + 12, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (!isStopped()) {
                AFLogger.afInfoLog(new StringBuilder("******* sendTrackingWithEvent: ").append(AFInAppEventParameterName2 ? "Launch" : aFa1rSDK.e).toString());
            } else {
                AFLogger.afInfoLog("Reporting has been stopped");
            }
            unregisterClient(context);
            unregisterClient2.valueOf(aFa1rSDK);
            unregisterClient2.values(map, isPreInstalledApp(context), new Function0() { // from class: com.appsflyer.internal.AFb1tSDK$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String e;
                    e = AFb1tSDK.this.e(context);
                    return e;
                }
            });
            if (AFInAppEventParameterName2) {
                unregisterClient2.values(map);
                AFLogger$LogLevel.AFInAppEventParameterName = null;
            }
            unregisterClient2.AFInAppEventType(map);
            int valueOf = valueOf(values2, AFInAppEventParameterName2);
            if (aFa1rSDK.e != null) {
                int i4 = afLogForce + 103;
                AFVersionDeclaration = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
            int values3 = values(values2, z);
            if (AFInAppEventParameterName2 && valueOf == 1) {
                int i6 = AFVersionDeclaration + 47;
                afLogForce = i6 % 128;
                int i7 = i6 % 2;
                AppsFlyerProperties.getInstance().valueOf = true;
            }
            unregisterClient2.valueOf(map, valueOf, values3);
            return map;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th, true);
            return map;
        }
    }

    private static void unregisterClient(Context context) {
        int i = 2 % 2;
        try {
            List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!asList.contains("android.permission.INTERNET")) {
                AFLogger.INSTANCE.w(AFg1jSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
            }
            if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFLogger.INSTANCE.w(AFg1jSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                int i2 = afLogForce + 105;
                AFVersionDeclaration = i2 % 128;
                int i3 = i2 % 2;
            }
            if (Build.VERSION.SDK_INT > 32) {
                int i4 = AFVersionDeclaration + 59;
                afLogForce = i4 % 128;
                int i5 = i4 % 2;
                if (asList.contains("com.google.android.gms.permission.AD_ID")) {
                    return;
                }
                int i6 = AFVersionDeclaration + 37;
                afLogForce = i6 % 128;
                int i7 = i6 % 2;
                AFLogger.INSTANCE.w(AFg1jSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
            }
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1jSDK.GENERAL, "Exception while validation permissions. ", e);
        }
    }

    public static Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        int i = 2 % 2;
        if (!map.containsKey("meta")) {
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            return hashMap;
        }
        int i2 = afLogForce + 71;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 == 0) {
            Map<String, Object> map2 = (Map) map.get("meta");
            int i3 = AFVersionDeclaration + 15;
            afLogForce = i3 % 128;
            int i4 = i3 % 2;
            return map2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String AFKeystoreWrapper(Activity activity) {
        Intent intent;
        int i = 2 % 2;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            int i2 = afLogForce + 11;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i4 = afLogForce + 25;
                    AFVersionDeclaration = i4 % 128;
                    if (i4 % 2 != 0) {
                        String string = extras.getString("af");
                        try {
                            throw null;
                        } catch (Throwable th) {
                            str = string;
                            th = th;
                            AFLogger.INSTANCE.e(AFg1jSDK.ENGAGEMENT, th.getMessage(), th);
                            return str;
                        }
                    }
                    str = extras.getString("af");
                    if (str != null) {
                        AFLogger.INSTANCE.w(AFg1jSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(str)));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                        int i5 = afLogForce + 39;
                        AFVersionDeclaration = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
                int i7 = AFVersionDeclaration + 95;
                afLogForce = i7 % 128;
                int i8 = i7 % 2;
                return str;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return str;
    }

    private static int AFInAppEventParameterName(AFd1xSDK aFd1xSDK) {
        int i = 2 % 2;
        int i2 = afLogForce + 15;
        AFVersionDeclaration = i2 % 128;
        int AFInAppEventType2 = i2 % 2 != 0 ? AFInAppEventType(aFd1xSDK, "appsFlyerAdRevenueCount", false) : AFInAppEventType(aFd1xSDK, "appsFlyerAdRevenueCount", true);
        int i3 = afLogForce + 99;
        AFVersionDeclaration = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 55 / 0;
        }
        return AFInAppEventType2;
    }

    private static int values(AFd1xSDK aFd1xSDK) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 115;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        int AFInAppEventType2 = AFInAppEventType(aFd1xSDK, "appsFlyerAdImpressionCount", true);
        int i4 = AFVersionDeclaration + 123;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
        return AFInAppEventType2;
    }

    public final void AFKeystoreWrapper(Context context, AFc1kSDK aFc1kSDK, Uri uri, Uri uri2) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 31;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            valueOf(context);
            aFc1kSDK.AFKeystoreWrapper("af_deeplink");
            throw null;
        }
        valueOf(context);
        if (!aFc1kSDK.AFKeystoreWrapper("af_deeplink")) {
            String values2 = values(uri.toString());
            AFc1pSDK afVerboseLog2 = values().afVerboseLog();
            if (afVerboseLog2.values != null && afVerboseLog2.AFInAppEventType != null && values2.contains(afVerboseLog2.values)) {
                Uri.Builder buildUpon = Uri.parse(values2).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : afVerboseLog2.AFInAppEventType.entrySet()) {
                    int i3 = AFVersionDeclaration + 19;
                    afLogForce = i3 % 128;
                    int i4 = i3 % 2;
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                values2 = buildUpon.build().toString();
                String encodedQuery = buildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFc1kSDK.values.put("appended_query_params", encodedQuery);
                AFc1qSDK aFc1qSDK = aFc1kSDK.AFKeystoreWrapper;
                if (aFc1qSDK != null) {
                    int i5 = AFVersionDeclaration + 99;
                    afLogForce = i5 % 128;
                    if (i5 % 2 == 0) {
                        aFc1qSDK.AFInAppEventType(aFc1kSDK.values);
                        throw null;
                    }
                    aFc1qSDK.AFInAppEventType(aFc1kSDK.values);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFc1kSDK.values.put("af_deeplink", values2);
            AFc1qSDK aFc1qSDK2 = aFc1kSDK.AFKeystoreWrapper;
            if (aFc1qSDK2 != null) {
                int i6 = AFVersionDeclaration + 21;
                afLogForce = i6 % 128;
                int i7 = i6 % 2;
                aFc1qSDK2.AFInAppEventType(aFc1kSDK.values);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            hashMap.put("original_link", uri2.toString());
        }
        AFb1rSDK.AFInAppEventType(context, hashMap, uri);
        AFf1oSDK aFf1oSDK = new AFf1oSDK(values(), UUID.randomUUID(), uri);
        if (aFf1oSDK.i()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFc1kSDK.values.put("isBrandedDomain", bool);
            AFc1qSDK aFc1qSDK3 = aFc1kSDK.AFKeystoreWrapper;
            if (aFc1qSDK3 != null) {
                aFc1qSDK3.AFInAppEventType(aFc1kSDK.values);
            }
        }
        if (!aFf1oSDK.v()) {
            values().afVerboseLog().values(hashMap);
            return;
        }
        aFf1oSDK.e = AFInAppEventType(hashMap);
        AFe1cSDK i8 = values().i();
        i8.AFInAppEventParameterName.execute(i8.new AnonymousClass5(aFf1oSDK));
    }

    private static String values(String str) {
        int i = 2 % 2;
        Object obj = null;
        if (str == null) {
            return null;
        }
        if (!str.matches("fb\\d*?://authorize.*") || !str.contains("access_token")) {
            return str;
        }
        String AFKeystoreWrapper2 = AFKeystoreWrapper(str);
        if (AFKeystoreWrapper2.length() == 0) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        if (AFKeystoreWrapper2.contains("&")) {
            arrayList = new ArrayList(Arrays.asList(AFKeystoreWrapper2.split("&")));
        } else {
            arrayList.add(AFKeystoreWrapper2);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i2 = afLogForce + 39;
            AFVersionDeclaration = i2 % 128;
            if (i2 % 2 == 0) {
                String str2 = (String) it.next();
                if (str2.contains("access_token")) {
                    it.remove();
                } else {
                    if (sb.length() != 0) {
                        sb.append("&");
                    } else if (!str2.startsWith("?")) {
                        int i3 = AFVersionDeclaration + 17;
                        afLogForce = i3 % 128;
                        if (i3 % 2 == 0) {
                            sb.append("?");
                            obj.hashCode();
                            throw null;
                        }
                        sb.append("?");
                    }
                    sb.append(str2);
                    int i4 = afLogForce + 53;
                    AFVersionDeclaration = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                ((String) it.next()).contains("access_token");
                throw null;
            }
        }
        return str.replace(AFKeystoreWrapper2, sb.toString());
    }

    private static String AFKeystoreWrapper(String str) {
        int i = 2 % 2;
        int indexOf = str.indexOf(63);
        if (indexOf != -1) {
            return str.substring(indexOf);
        }
        int i2 = afLogForce;
        int i3 = i2 + 81;
        AFVersionDeclaration = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 45;
        AFVersionDeclaration = i5 % 128;
        if (i5 % 2 == 0) {
            return "";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AFf1oSDK.AFa1tSDK AFInAppEventType(final Map<String, String> map) {
        int i = 2 % 2;
        AFf1oSDK.AFa1tSDK aFa1tSDK = new AFf1oSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFb1tSDK.4
            @Override // com.appsflyer.internal.AFf1oSDK.AFa1tSDK
            public final void AFKeystoreWrapper(String str) {
                AFb1tSDK.this.values().afVerboseLog().AFKeystoreWrapper(str, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1oSDK.AFa1tSDK
            public final void AFInAppEventParameterName(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFb1tSDK.this.values().afVerboseLog().values(map);
            }
        };
        int i2 = AFVersionDeclaration + 97;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        return aFa1tSDK;
    }

    public static boolean AFInAppEventParameterName(Context context) {
        int i;
        int i2 = 2 % 2;
        try {
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                i = AFVersionDeclaration + 25;
                afLogForce = i % 128;
                int i3 = i % 2;
                return true;
            }
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            i = AFVersionDeclaration + ModuleDescriptor.MODULE_VERSION;
            afLogForce = i % 128;
            int i32 = i % 2;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(AFg1jSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    private String AFInAppEventParameterName(Context context, String str) {
        int i = 2 % 2;
        int i2 = afLogForce;
        int i3 = i2 + 5;
        AFVersionDeclaration = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (context == null) {
            int i4 = i2 + 1;
            AFVersionDeclaration = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
            }
            return null;
        }
        valueOf(context);
        return values().values().AFInAppEventParameterName(str);
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
            int i2 = afLogForce + 115;
            AFVersionDeclaration = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObject.put("c", str2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
        }
        int i3 = AFVersionDeclaration + 119;
        afLogForce = i3 % 128;
        int i4 = i3 % 2;
        if (jSONObject.has("pid")) {
            AFInAppEventParameterName("preInstallName", jSONObject.toString());
        } else {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        }
    }

    private static void d(String str) {
        int i = 2 % 2;
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                return;
            }
            int i2 = afLogForce + 17;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
            AFInAppEventParameterName("preInstallName", str);
            int i4 = AFVersionDeclaration + 85;
            afLogForce = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 47 / 0;
            }
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if ((r4.getPackageManager().getApplicationInfo(r4.getPackageName(), 0).flags & 1) != 0) goto L10;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isPreInstalledApp(Context context) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 51;
        afLogForce = i2 % 128;
        try {
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
        if (i2 % 2 == 0) {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 1).flags | 1) != 0) {
            }
            return false;
        }
        int i3 = afLogForce + 85;
        AFVersionDeclaration = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        r4.valueOf("CACHED_CHANNEL", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r4 = com.appsflyer.internal.AFb1tSDK.AFVersionDeclaration + 21;
        com.appsflyer.internal.AFb1tSDK.afLogForce = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String AFInAppEventType(AFd1xSDK aFd1xSDK, String str) {
        String AFInAppEventType2;
        int i = 2 % 2;
        int i2 = afLogForce + 7;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventType2 = aFd1xSDK.AFInAppEventType("CACHED_CHANNEL", (String) null);
            int i3 = 51 / 0;
        } else {
            AFInAppEventType2 = aFd1xSDK.AFInAppEventType("CACHED_CHANNEL", (String) null);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        int i = 2 % 2;
        Object obj = null;
        try {
            String AFKeystoreWrapper2 = new AFb1kSDK(context, values()).AFKeystoreWrapper();
            int i2 = AFVersionDeclaration + 73;
            afLogForce = i2 % 128;
            if (i2 % 2 != 0) {
                return AFKeystoreWrapper2;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    public static synchronized SharedPreferences AFKeystoreWrapper(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (AFb1tSDK.class) {
            int i = 2 % 2;
            int i2 = AFVersionDeclaration + 23;
            afLogForce = i2 % 128;
            if (i2 % 2 == 0) {
                SharedPreferences sharedPreferences2 = AFInAppEventType().w;
                throw null;
            }
            if (AFInAppEventType().w == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    AFInAppEventType().w = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            }
            sharedPreferences = AFInAppEventType().w;
            int i3 = afLogForce + 19;
            AFVersionDeclaration = i3 % 128;
            int i4 = i3 % 2;
        }
        return sharedPreferences;
    }

    public final AFd1xSDK values(Context context) {
        AFd1xSDK valueOf;
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 63;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            valueOf(context);
            valueOf = values().valueOf();
            int i3 = 45 / 0;
        } else {
            valueOf(context);
            valueOf = values().valueOf();
        }
        int i4 = AFVersionDeclaration + 15;
        afLogForce = i4 % 128;
        if (i4 % 2 != 0) {
            return valueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int valueOf(AFd1xSDK aFd1xSDK, boolean z) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 61;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventType(aFd1xSDK, "appsFlyerCount", z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int AFInAppEventType2 = AFInAppEventType(aFd1xSDK, "appsFlyerCount", z);
        int i3 = AFVersionDeclaration + 69;
        afLogForce = i3 % 128;
        int i4 = i3 % 2;
        return AFInAppEventType2;
    }

    private static int values(AFd1xSDK aFd1xSDK, boolean z) {
        int i = 2 % 2;
        int i2 = afLogForce + 11;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        int AFInAppEventType2 = AFInAppEventType(aFd1xSDK, "appsFlyerInAppEventCount", z);
        int i4 = afLogForce + 5;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
        return AFInAppEventType2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r1 = r1 + 1;
        r3.AFInAppEventParameterName(r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r5 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r5 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int AFInAppEventType(AFd1xSDK aFd1xSDK, String str, boolean z) {
        int AFKeystoreWrapper2;
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 59;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFKeystoreWrapper2 = aFd1xSDK.AFKeystoreWrapper(str, 0);
        } else {
            AFKeystoreWrapper2 = aFd1xSDK.AFKeystoreWrapper(str, 0);
        }
        int i3 = afLogForce + 55;
        AFVersionDeclaration = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
        return AFKeystoreWrapper2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a9, code lost:
    
        if (r18 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ae, code lost:
    
        if (r16 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        new java.lang.Thread(new com.appsflyer.internal.AFb1ySDK(r13.getApplicationContext(), values().force().unregisterClient, values().values(), r14, r15, r16, r17, r18, r19)).start();
        r12 = com.appsflyer.internal.AFb1tSDK.AFVersionDeclaration + 83;
        com.appsflyer.internal.AFb1tSDK.afLogForce = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        if (r18 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r19 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r19 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004c, code lost:
    
        r2 = r19.toString();
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AFb1bSDK afInfoLog;
        String[] strArr;
        String str6;
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 99;
        afLogForce = i2 % 128;
        char c = 4;
        if (i2 % 2 == 0) {
            afInfoLog = values().afInfoLog();
            strArr = new String[78];
            strArr[0] = str;
            strArr[1] = str2;
            strArr[2] = str3;
            strArr[3] = str4;
            strArr[3] = str5;
        } else {
            afInfoLog = values().afInfoLog();
            strArr = new String[6];
            strArr[0] = str;
            strArr[1] = str2;
            strArr[2] = str3;
            strArr[3] = str4;
            strArr[4] = str5;
            c = 5;
        }
        strArr[c] = str6;
        afInfoLog.AFInAppEventType("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            AFLogger.INSTANCE.i(AFg1jSDK.PURCHASE_VALIDATION, new StringBuilder("Validate in app called with parameters: ").append(str3).append(" ").append(str4).append(" ").append(str5).toString());
            int i3 = afLogForce + 7;
            AFVersionDeclaration = i3 % 128;
            int i4 = i3 % 2;
        }
        if (str != null && str4 != null) {
            int i5 = AFVersionDeclaration + 83;
            int i6 = i5 % 128;
            afLogForce = i6;
            int i7 = i5 % 2;
            if (str2 != null) {
                int i8 = i6 + 95;
                AFVersionDeclaration = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 13 / 0;
                }
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
        int i2 = afLogForce + 11;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        boolean AFInAppEventType2 = values().force().AFInAppEventType();
        int i4 = afLogForce + 37;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return AFInAppEventType2;
    }

    @Deprecated
    public static String valueOf(HttpURLConnection httpURLConnection) {
        String obj;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        Object obj2;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object obj3 = null;
        try {
            try {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    errorStream = httpURLConnection.getInputStream();
                }
                InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                    boolean z = false;
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            if (z) {
                                int i2 = AFVersionDeclaration + 61;
                                afLogForce = i2 % 128;
                                int i3 = i2 % 2;
                                obj2 = '\n';
                            } else {
                                obj2 = "";
                            }
                            sb.append(obj2).append(readLine);
                            z = true;
                        } catch (Throwable th) {
                            bufferedReader = bufferedReader2;
                            th = th;
                            inputStreamReader = inputStreamReader2;
                            try {
                                AFLogger.afErrorLog(new StringBuilder("Could not read connection response from: ").append(httpURLConnection.getURL().toString()).toString(), th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader != null) {
                                    int i4 = AFVersionDeclaration + 55;
                                    afLogForce = i4 % 128;
                                    int i5 = i4 % 2;
                                    inputStreamReader.close();
                                }
                                obj = sb.toString();
                                new JSONObject(obj);
                                int i6 = AFVersionDeclaration + 51;
                                afLogForce = i6 % 128;
                                int i7 = i6 % 2;
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
                                    int i8 = AFVersionDeclaration + 119;
                                    afLogForce = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        inputStreamReader.close();
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    inputStreamReader.close();
                                }
                                throw th2;
                            }
                        }
                    }
                    bufferedReader2.close();
                    inputStreamReader2.close();
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = inputStreamReader2;
                    bufferedReader = null;
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
                inputStreamReader = null;
            }
        } catch (Throwable th6) {
            AFLogger.afErrorLogForExcManagerOnly("readServerResponse error", th6);
        }
        obj = sb.toString();
        try {
            new JSONObject(obj);
            int i62 = AFVersionDeclaration + 51;
            afLogForce = i62 % 128;
            int i72 = i62 % 2;
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r7.getLevel() > com.appsflyer.AFLogger.LogLevel.NONE.getLevel()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r7.getLevel() > com.appsflyer.AFLogger.LogLevel.NONE.getLevel()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        r1 = false;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z;
        int i = 2 % 2;
        int i2 = afLogForce + 41;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
        values().afInfoLog().AFInAppEventType("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getCom.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL java.lang.String());
        if (!z) {
            int i4 = afLogForce + 21;
            AFVersionDeclaration = i4 % 128;
            int i5 = i4 % 2;
            values().afErrorLogForExcManagerOnly().valueOf();
            return;
        }
        values().afErrorLogForExcManagerOnly().registerClient();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ((r0 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r2 = r3.trim();
        r3 = 74 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        com.appsflyer.internal.AFe1gSDK.values(new com.appsflyer.internal.AFe1hSDK(r2, r4.trim()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r2 = r3.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
    
        if (com.appsflyer.internal.AFc1vSDK.values(r4) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (com.appsflyer.internal.AFc1vSDK.values(r4) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0049, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r3 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r0 = com.appsflyer.internal.AFb1tSDK.afLogForce + 39;
        com.appsflyer.internal.AFb1tSDK.AFVersionDeclaration = r0 % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setHost(String str, String str2) {
        int i = 2 % 2;
        int i2 = afLogForce + 105;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 11 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i = 2 % 2;
        int i2 = afLogForce + 9;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        String AFKeystoreWrapper2 = values().afErrorLog().AFKeystoreWrapper();
        int i4 = afLogForce + 19;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
        return AFKeystoreWrapper2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 69;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        String AFInAppEventParameterName2 = values().afErrorLog().AFInAppEventParameterName();
        int i4 = AFVersionDeclaration + 75;
        afLogForce = i4 % 128;
        if (i4 % 2 != 0) {
            return AFInAppEventParameterName2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i2 = 2 % 2;
        int i3 = AFVersionDeclaration + 119;
        afLogForce = i3 % 128;
        int i4 = i3 % 2;
        this.d = TimeUnit.SECONDS.toMillis(i);
        int i5 = AFVersionDeclaration + 65;
        afLogForce = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
    }

    private AFi1pSDK[] d() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 47;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AFi1pSDK[] AFKeystoreWrapper2 = values().w().AFKeystoreWrapper();
        int i4 = AFVersionDeclaration + 89;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
        return AFKeystoreWrapper2;
    }

    class AFa1tSDK implements Runnable {
        private final AFa1rSDK valueOf;

        /* synthetic */ AFa1tSDK(AFb1tSDK aFb1tSDK, AFa1rSDK aFa1rSDK, byte b) {
            this(aFa1rSDK);
        }

        private AFa1tSDK(AFa1rSDK aFa1rSDK) {
            this.valueOf = aFa1rSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1tSDK.AFKeystoreWrapper(AFb1tSDK.this, this.valueOf);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        int i = 2 % 2;
        int i2 = afLogForce + 35;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 == 0) {
            Objects.requireNonNull(pluginInfo);
            values().afDebugLog().values(pluginInfo);
            int i3 = afLogForce + 43;
            AFVersionDeclaration = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Objects.requireNonNull(pluginInfo);
        values().afDebugLog().values(pluginInfo);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    class AFa1vSDK implements AFe1fSDK {
        @Override // com.appsflyer.internal.AFe1fSDK
        public final void valueOf(AFe1dSDK<?> aFe1dSDK) {
        }

        private AFa1vSDK() {
        }

        /* synthetic */ AFa1vSDK(AFb1tSDK aFb1tSDK, byte b) {
            this();
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void AFKeystoreWrapper(AFe1dSDK<?> aFe1dSDK) {
            if (aFe1dSDK instanceof AFf1iSDK) {
                AFb1tSDK.this.values().d().AFKeystoreWrapper(((AFf1nSDK) aFe1dSDK).e.AFLogger);
            }
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void valueOf(AFe1dSDK<?> aFe1dSDK, AFe1bSDK aFe1bSDK) {
            JSONObject valueOf;
            AFg1ySDK valueOf2;
            if (aFe1dSDK instanceof AFf1nSDK) {
                AFf1nSDK aFf1nSDK = (AFf1nSDK) aFe1dSDK;
                boolean z = aFe1dSDK instanceof AFf1iSDK;
                if (z && valueOf()) {
                    AFf1iSDK aFf1iSDK = (AFf1iSDK) aFe1dSDK;
                    if (aFf1iSDK.AFKeystoreWrapper == AFe1bSDK.SUCCESS || aFf1iSDK.values == 1) {
                        AFg1rSDK aFg1rSDK = new AFg1rSDK(aFf1iSDK, AFb1tSDK.this.values().valueOf());
                        AFe1cSDK i = AFb1tSDK.this.values().i();
                        i.AFInAppEventParameterName.execute(i.new AnonymousClass5(aFg1rSDK));
                    }
                }
                if (aFe1bSDK == AFe1bSDK.SUCCESS) {
                    AFb1tSDK aFb1tSDK = AFb1tSDK.this;
                    aFb1tSDK.values(AFb1tSDK.AFInAppEventParameterName(aFb1tSDK)).valueOf("sentSuccessfully", "true");
                    if (!(aFe1dSDK instanceof AFf1hSDK) && (valueOf2 = new AFf1bSDK(AFb1tSDK.AFInAppEventParameterName(AFb1tSDK.this)).valueOf()) != null && valueOf2.AFInAppEventParameterName()) {
                        String str = valueOf2.AFInAppEventType;
                        AFLogger.INSTANCE.d(AFg1jSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFf1bSDK.AFInAppEventParameterName(str);
                    }
                    ResponseNetwork responseNetwork = ((AFf1rSDK) aFf1nSDK).d;
                    if (responseNetwork != null && (valueOf = AFc1sSDK.valueOf((String) responseNetwork.getBody())) != null) {
                        AFb1tSDK.valueOf(AFb1tSDK.this, valueOf.optBoolean("send_background", false));
                    }
                    if (z) {
                        AFb1tSDK.valueOf(AFb1tSDK.this, System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(aFe1dSDK instanceof AFg1rSDK) || aFe1bSDK == AFe1bSDK.SUCCESS) {
                return;
            }
            AFg1tSDK aFg1tSDK = new AFg1tSDK(AFb1tSDK.this.values());
            AFe1cSDK i2 = AFb1tSDK.this.values().i();
            i2.AFInAppEventParameterName.execute(i2.new AnonymousClass5(aFg1tSDK));
        }

        private boolean valueOf() {
            return AFb1tSDK.this.valueOf != null;
        }
    }

    public final void valueOf(Context context) {
        int i = 2 % 2;
        AFd1kSDK aFd1kSDK = this.v;
        if (context != null) {
            int i2 = afLogForce + 123;
            AFVersionDeclaration = i2 % 128;
            if (i2 % 2 == 0) {
                AFd1nSDK aFd1nSDK = aFd1kSDK.values;
                if (context != null) {
                    aFd1nSDK.AFKeystoreWrapper = context.getApplicationContext();
                }
            } else {
                AFd1nSDK aFd1nSDK2 = aFd1kSDK.values;
                throw null;
            }
        }
        int i3 = afLogForce + 51;
        AFVersionDeclaration = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        int i = 2 % 2;
        values().AFLogger$LogLevel().AFInAppEventType = new AFd1zSDK(strArr);
        int i2 = AFVersionDeclaration + 103;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        int i = 2 % 2;
        int i2 = afLogForce + 5;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        valueOf(context);
        PurchaseHandler AFLogger = values().AFLogger();
        if (AFLogger.valueOf(map, purchaseValidationCallback, "subscriptions")) {
            AFe1aSDK aFe1aSDK = new AFe1aSDK(map, purchaseValidationCallback, AFLogger.valueOf);
            AFe1cSDK aFe1cSDK = AFLogger.AFInAppEventParameterName;
            aFe1cSDK.AFInAppEventParameterName.execute(aFe1cSDK.new AnonymousClass5(aFe1aSDK));
            int i4 = afLogForce + 17;
            AFVersionDeclaration = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        int i = 2 % 2;
        int i2 = afLogForce + 93;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        valueOf(context);
        PurchaseHandler AFLogger = values().AFLogger();
        if (AFLogger.valueOf(map, purchaseValidationCallback, "purchases")) {
            AFf1uSDK aFf1uSDK = new AFf1uSDK(map, purchaseValidationCallback, AFLogger.valueOf);
            AFe1cSDK aFe1cSDK = AFLogger.AFInAppEventParameterName;
            aFe1cSDK.AFInAppEventParameterName.execute(aFe1cSDK.new AnonymousClass5(aFf1uSDK));
            int i4 = afLogForce + 15;
            AFVersionDeclaration = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        int i = 2 % 2;
        int i2 = afLogForce + 33;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 == 0) {
            values().afVerboseLog().AFKeystoreWrapper = deepLinkListener;
            values().afVerboseLog().d = j;
        } else {
            values().afVerboseLog().AFKeystoreWrapper = deepLinkListener;
            values().afVerboseLog().d = j;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        String concat;
        int i = 2 % 2;
        AFd1qSDK AFLogger$LogLevel = values().AFLogger$LogLevel();
        if (AFLogger$LogLevel.valueOf == null) {
            AFLogger$LogLevel.valueOf = new AFc1dSDK();
        }
        AFc1dSDK aFc1dSDK = AFLogger$LogLevel.valueOf;
        if (str == null || str.isEmpty()) {
            AFLogger.afWarnLog("Partner ID is missing or `null`");
            return;
        }
        if (map != null) {
            int i2 = AFVersionDeclaration + 63;
            afLogForce = i2 % 128;
            int i3 = i2 % 2;
            if (!map.isEmpty()) {
                AFLogger.afDebugLog(new StringBuilder("Setting partner data for ").append(str).append(": ").append(map).toString());
                int length = new JSONObject(map).toString().length();
                if (length <= 1000) {
                    aFc1dSDK.AFKeystoreWrapper.put(str, map);
                    aFc1dSDK.AFInAppEventParameterName.remove(str);
                    return;
                } else {
                    AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                    HashMap hashMap = new HashMap();
                    hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "limit exceeded: ".concat(String.valueOf(length)));
                    aFc1dSDK.AFInAppEventParameterName.put(str, hashMap);
                    return;
                }
            }
        }
        if (aFc1dSDK.AFKeystoreWrapper.remove(str) == null) {
            int i4 = AFVersionDeclaration + 45;
            afLogForce = i4 % 128;
            int i5 = i4 % 2;
            concat = "Partner data is missing or `null`";
        } else {
            concat = "Cleared partner data for ".concat(String.valueOf(str));
        }
        AFLogger.afWarnLog(concat);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 97;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        values().afInfoLog().AFInAppEventType("setImeiData", str);
        values().force().AFLogger = str;
        int i4 = AFVersionDeclaration + 113;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 55;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFb1bSDK afInfoLog = values().afInfoLog();
            String[] strArr = new String[1];
            strArr[1] = str;
            afInfoLog.AFInAppEventType("setAndroidIdData", strArr);
        } else {
            values().afInfoLog().AFInAppEventType("setAndroidIdData", str);
        }
        values().AFLogger$LogLevel().values = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 121;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFc1pSDK afVerboseLog2 = values().afVerboseLog();
        afVerboseLog2.e.clear();
        afVerboseLog2.e.addAll(Arrays.asList(strArr));
        int i4 = AFVersionDeclaration + 113;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        int i = 2 % 2;
        int i2 = afLogForce + ComposerImplKt.nodeKey;
        AFVersionDeclaration = i2 % 128;
        AFLogger.afDebugLog(i2 % 2 != 0 ? String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)) : String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        values().afVerboseLog().AFLogger = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 31;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
        values().AFLogger$LogLevel().AFKeystoreWrapper = AFb1lSDK.values(str);
        int i4 = AFVersionDeclaration + 63;
        afLogForce = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        valueOf(context);
        AFh1ySDK aFh1ySDK = new AFh1ySDK();
        aFh1ySDK.e = str;
        aFh1ySDK.valueOf = appsFlyerRequestListener;
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
                AFLogger.INSTANCE.w(AFg1jSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1ySDK.values(singletonMap);
        }
        aFh1ySDK.AFInAppEventType = hashMap;
        AFb1bSDK afInfoLog = values().afInfoLog();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = new JSONObject(aFh1ySDK.AFInAppEventType == null ? new HashMap() : aFh1ySDK.AFInAppEventType).toString();
        afInfoLog.AFInAppEventType("logEvent", strArr);
        if (str == null) {
            AFKeystoreWrapper(context, AFg1hSDK.logEvent);
        }
        valueOf(aFh1ySDK, d(context));
    }

    private static void AFInAppEventParameterName(AFa1rSDK aFa1rSDK, AFg1fSDK aFg1fSDK) {
        int i = 2 % 2;
        int i2 = afLogForce + 107;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        if (aFg1fSDK != null) {
            aFa1rSDK.values = aFg1fSDK.valueOf;
            aFa1rSDK.unregisterClient = aFg1fSDK.AFKeystoreWrapper;
            int i4 = afLogForce + 41;
            AFVersionDeclaration = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (com.appsflyer.internal.AFf1sSDK.unregisterClient() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (com.appsflyer.internal.AFf1sSDK.unregisterClient() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        r3 = values();
        r0 = r3.i();
        r0.AFInAppEventParameterName.execute(new com.appsflyer.internal.AFe1cSDK.AnonymousClass5(r0, new com.appsflyer.internal.AFf1sSDK(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r3 = com.appsflyer.internal.AFb1tSDK.afLogForce + 11;
        com.appsflyer.internal.AFb1tSDK.AFVersionDeclaration = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e() {
        int i = 2 % 2;
        int i2 = afLogForce + 81;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
    
        valueOf(r5);
        r4 = values().values();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        return com.appsflyer.internal.AFb1iSDK.AFKeystoreWrapper(r4.AFInAppEventParameterName, r4.valueOf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        r4 = com.appsflyer.internal.AFb1tSDK.afLogForce + 105;
        com.appsflyer.internal.AFb1tSDK.AFVersionDeclaration = r4 % 128;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getAppsFlyerUID(Context context) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 83;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            values().afInfoLog().AFInAppEventType("getAppsFlyerUID", new String[0]);
        } else {
            values().afInfoLog().AFInAppEventType("getAppsFlyerUID", new String[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        if (r3.toString().isEmpty() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r3.toString().isEmpty() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void valueOf(Context context, Intent intent) {
        Uri uri;
        boolean z;
        int i = 2 % 2;
        valueOf(context);
        AFc1pSDK afVerboseLog2 = values().afVerboseLog();
        AFd1xSDK valueOf = values().valueOf();
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            int i2 = afLogForce + 65;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
            uri = intent.getData();
        }
        if (uri != null) {
            int i4 = AFVersionDeclaration + 19;
            afLogForce = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 42 / 0;
            }
            if (valueOf.values("ddl_sent") || z) {
                afVerboseLog2.valueOf(AFc1kSDK.AFInAppEventType(afVerboseLog2.registerClient.init()), intent, context);
            }
            int i6 = afLogForce + 47;
            AFVersionDeclaration = i6 % 128;
            if (i6 % 2 == 0) {
                afVerboseLog2.AFKeystoreWrapper("No direct deep link", null);
                return;
            } else {
                afVerboseLog2.AFKeystoreWrapper("No direct deep link", null);
                int i7 = 60 / 0;
                return;
            }
        }
        z = false;
        if (valueOf.values("ddl_sent")) {
        }
        afVerboseLog2.valueOf(AFc1kSDK.AFInAppEventType(afVerboseLog2.registerClient.init()), intent, context);
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2 = 2 % 2;
        int i3 = $10 + 121;
        int i4 = i3 % 128;
        $11 = i4;
        int i5 = i3 % 2;
        if (str != null) {
            int i6 = i4 + 75;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr = str.toCharArray();
            int i8 = $11 + 73;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFj1uSDK aFj1uSDK = new AFj1uSDK();
        char[] cArr3 = new char[cArr2.length];
        aFj1uSDK.values = 0;
        char[] cArr4 = new char[2];
        while (aFj1uSDK.values < cArr2.length) {
            cArr4[0] = cArr2[aFj1uSDK.values];
            cArr4[1] = cArr2[aFj1uSDK.values + 1];
            int i10 = 58224;
            for (int i11 = 0; i11 < 16; i11++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                char c3 = (char) (c - (((c2 + i10) ^ ((c2 << 4) + ((char) (afWarnLog ^ (-7551638670892174108L))))) ^ ((c2 >>> 5) + ((char) (afVerboseLog ^ (-7551638670892174108L))))));
                cArr4[1] = c3;
                cArr4[0] = (char) (c2 - (((c3 >>> 5) + ((char) (afDebugLog ^ (-7551638670892174108L)))) ^ ((c3 + i10) ^ ((c3 << 4) + ((char) (afRDLog ^ (-7551638670892174108L)))))));
                i10 -= 40503;
            }
            cArr3[aFj1uSDK.values] = cArr4[0];
            cArr3[aFj1uSDK.values + 1] = cArr4[1];
            aFj1uSDK.values += 2;
            int i12 = $11 + 17;
            $10 = i12 % 128;
            int i13 = i12 % 2;
        }
        String str2 = new String(cArr3, 0, i);
        int i14 = $10 + 35;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str2;
    }
}
