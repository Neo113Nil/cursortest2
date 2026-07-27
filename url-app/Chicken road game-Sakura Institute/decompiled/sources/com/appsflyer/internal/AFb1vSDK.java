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
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import com.appsflyer.internal.AFf1hSDK;
import com.appsflyer.internal.AFg1uSDK;
import com.appsflyer.internal.AFi1hSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
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

    /* renamed from: d, reason: collision with root package name */
    private Map<Long, String> f5858d;
    private final AFd1nSDK force;

    /* renamed from: v, reason: collision with root package name */
    private Application f5861v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f5862w;
    public volatile AppsFlyerConversionListener AFInAppEventType = null;

    /* renamed from: e, reason: collision with root package name */
    private long f5859e = -1;
    private long registerClient = -1;
    private long unregisterClient = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: i, reason: collision with root package name */
    private boolean f5860i = false;

    /* renamed from: com.appsflyer.internal.AFb1vSDK$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
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

    public class AFa1uSDK implements AFe1fSDK {
        private AFa1uSDK() {
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void AFInAppEventType(AFe1dSDK<?> aFe1dSDK) {
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void values(AFe1dSDK<?> aFe1dSDK) {
            if (aFe1dSDK instanceof AFf1cSDK) {
                AFb1vSDK.this.AFInAppEventParameterName().AFLogger().values(((AFf1lSDK) aFe1dSDK).unregisterClient.AFLogger);
            }
        }

        public /* synthetic */ AFa1uSDK(AFb1vSDK aFb1vSDK, byte b4) {
            this();
        }

        private boolean AFInAppEventType() {
            return AFb1vSDK.this.AFInAppEventType != null;
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void values(AFe1dSDK<?> aFe1dSDK, AFe1bSDK aFe1bSDK) {
            JSONObject valueOf;
            AFg1oSDK valueOf2;
            if (aFe1dSDK instanceof AFf1lSDK) {
                AFf1lSDK aFf1lSDK = (AFf1lSDK) aFe1dSDK;
                boolean z4 = aFe1dSDK instanceof AFf1cSDK;
                if (z4 && AFInAppEventType()) {
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
                    if (z4) {
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
    }

    public class AFa1vSDK implements Runnable {
        private final AFa1qSDK values;

        public /* synthetic */ AFa1vSDK(AFb1vSDK aFb1vSDK, AFa1qSDK aFa1qSDK, byte b4) {
            this(aFa1qSDK);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1vSDK.values(AFb1vSDK.this, this.values);
        }

        private AFa1vSDK(AFa1qSDK aFa1qSDK) {
            this.values = aFa1qSDK;
        }
    }

    static {
        AFInAppEventType();
        values = "288";
        AFInAppEventParameterName = "6.14";
        StringBuilder sb = new StringBuilder();
        sb.append("6.14");
        sb.append("/androidevent?buildnumber=6.14.0&app_id=");
        valueOf = sb.toString();
        AFKeystoreWrapper = null;
        AFLogger = new AFb1vSDK();
        int i2 = AFPurchaseDetails + 51;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public AFb1vSDK() {
        AFVersionDeclaration.init();
        this.force = new AFd1nSDK();
        AFInAppEventParameterName().AFLogger$LogLevel().values();
        AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType();
        AFe1cSDK afInfoLog = AFInAppEventParameterName().afInfoLog();
        afInfoLog.AFInAppEventParameterName.add(new AFa1uSDK(this, (byte) 0));
    }

    public static /* synthetic */ Application AFInAppEventParameterName(AFb1vSDK aFb1vSDK) {
        int i2 = (afLogForce + 15) % 128;
        AFPurchaseDetails = i2;
        Application application = aFb1vSDK.f5861v;
        afLogForce = (i2 + 39) % 128;
        return application;
    }

    public static void AFInAppEventType() {
        afWarnLog = 908301821;
        afVerboseLog = 401442715;
        afDebugLog = 221303939;
        afErrorLog = new byte[]{-26, -23, 8, -28, -21, 29, -31, 16, -16, 28, -32, -27};
    }

    public static /* synthetic */ AFf1eSDK AFKeystoreWrapper(AFb1vSDK aFb1vSDK) {
        AFPurchaseDetails = (afLogForce + 115) % 128;
        AFf1eSDK e4 = aFb1vSDK.e();
        int i2 = AFPurchaseDetails + 115;
        afLogForce = i2 % 128;
        if (i2 % 2 != 0) {
            return e4;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFLogger() {
        values(new AFh1oSDK());
        int i2 = afLogForce + 125;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void registerClient(Context context) {
        AFPurchaseDetails = (afLogForce + 23) % 128;
        try {
            List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!asList.contains("android.permission.INTERNET")) {
                afLogForce = (AFPurchaseDetails + 91) % 128;
                AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                afLogForce = (AFPurchaseDetails + 93) % 128;
            }
            if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT <= 32 || asList.contains("com.google.android.gms.permission.AD_ID")) {
                return;
            }
            AFPurchaseDetails = (afLogForce + 105) % 128;
            AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
        } catch (Exception e4) {
            AFLogger.INSTANCE.e(AFg1aSDK.GENERAL, "Exception while validation permissions. ", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String unregisterClient(Context context) {
        afLogForce = (AFPurchaseDetails + 109) % 128;
        String attributionId = getAttributionId(context);
        afLogForce = (AFPurchaseDetails + 105) % 128;
        return attributionId;
    }

    public static /* synthetic */ long valueOf(AFb1vSDK aFb1vSDK, long j4) {
        int i2 = AFPurchaseDetails + 89;
        int i4 = i2 % 128;
        afLogForce = i4;
        int i5 = i2 % 2;
        aFb1vSDK.registerClient = j4;
        if (i5 == 0) {
            throw null;
        }
        AFPurchaseDetails = (i4 + 97) % 128;
        return j4;
    }

    public static /* synthetic */ void values(AFb1vSDK aFb1vSDK, AFa1qSDK aFa1qSDK) {
        int i2 = AFPurchaseDetails + 121;
        afLogForce = i2 % 128;
        int i4 = i2 % 2;
        aFb1vSDK.values(aFa1qSDK);
        if (i4 == 0) {
            throw null;
        }
        int i5 = AFPurchaseDetails + 17;
        afLogForce = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        AFPurchaseDetails = (afLogForce + 97) % 128;
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = AFInAppEventParameterName().afRDLog().AFKeystoreWrapper;
        if (list.contains(asList)) {
            return;
        }
        afLogForce = (AFPurchaseDetails + 83) % 128;
        list.add(asList);
        afLogForce = (AFPurchaseDetails + 41) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z4) {
        AFPurchaseDetails = (afLogForce + 9) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("anonymizeUser", String.valueOf(z4));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z4);
        AFPurchaseDetails = (afLogForce + 55) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
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
    public final void enableFacebookDeferredApplinks(boolean z4) {
        afLogForce = (AFPurchaseDetails + 55) % 128;
        AFInAppEventParameterName().afDebugLog().values(z4);
        int i2 = AFPurchaseDetails + 49;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z4) {
        AFPurchaseDetails = (afLogForce + 93) % 128;
        AFInAppEventType(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z4));
        AFPurchaseDetails = (afLogForce + 103) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) {
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
        afLogForce = (AFPurchaseDetails + 59) % 128;
        return valueOf2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
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

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        AFPurchaseDetails = (afLogForce + 29) % 128;
        String AFInAppEventParameterName2 = AFInAppEventParameterName().afVerboseLog().AFInAppEventParameterName();
        afLogForce = (AFPurchaseDetails + 73) % 128;
        return AFInAppEventParameterName2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i2 = AFPurchaseDetails + 81;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().afVerboseLog().AFInAppEventType();
            throw null;
        }
        String AFInAppEventType = AFInAppEventParameterName().afVerboseLog().AFInAppEventType();
        int i4 = AFPurchaseDetails + 19;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return AFInAppEventType;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i2 = afLogForce + 23;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            throw null;
        }
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            afLogForce = (AFPurchaseDetails + 75) % 128;
            return string;
        }
        String AFInAppEventType = AFInAppEventType(context, "AF_STORE");
        if (AFInAppEventType == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i4 = afLogForce + 57;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 == 0) {
            return AFInAppEventType;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        AFPurchaseDetails = (afLogForce + 43) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("getSdkVersion", new String[0]);
        String registerClient = AFd1sSDK.registerClient();
        int i2 = AFPurchaseDetails + 5;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            int i4 = 36 / 0;
        }
        return registerClient;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        long j4;
        if (this.f5862w) {
            return this;
        }
        this.f5862w = true;
        AFInAppEventParameterName().i().AFLogger = str;
        AFb1mSDK.valueOf(str);
        if (context != null) {
            int i2 = afLogForce + 17;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 != 0) {
                valueOf(context);
                AFb1uSDK.AFInAppEventParameterName(context);
                throw null;
            }
            valueOf(context);
            Application AFInAppEventParameterName2 = AFb1uSDK.AFInAppEventParameterName(context);
            if (AFInAppEventParameterName2 == null) {
                afLogForce = (AFPurchaseDetails + 19) % 128;
                return this;
            }
            this.f5861v = AFInAppEventParameterName2;
            AFInAppEventParameterName().afErrorLog().AFInAppEventParameterName();
            AFInAppEventParameterName().AFLogger().values = System.currentTimeMillis();
            AFe1cSDK afInfoLog = AFInAppEventParameterName().afInfoLog();
            afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(new AFf1uSDK(AFInAppEventParameterName())));
            AFh1cSDK afLogForce2 = AFInAppEventParameterName().afLogForce();
            afLogForce2.valueOf = Build.VERSION.SDK_INT >= 31 ? new AFi1uSDK(afLogForce2.AFKeystoreWrapper) : new AFi1ySDK(afLogForce2.AFKeystoreWrapper);
            AFInAppEventParameterName().getCurrency().values(new d(this));
            AFInAppEventParameterName().registerClient().AFKeystoreWrapper(e());
            AFi1aSDK force = AFInAppEventParameterName().force();
            a aVar = new a(1, this);
            AFi1lSDK valueOf2 = force.valueOf(aVar);
            Runnable AFInAppEventType = force.AFInAppEventType(valueOf2, aVar);
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
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1aSDK aFg1aSDK = AFg1aSDK.PREINSTALL;
                        StringBuilder sb = new StringBuilder("Detected ");
                        sb.append(arrayList.size());
                        sb.append(" valid preinstall provider(s)");
                        aFLogger.d(aFg1aSDK, sb.toString());
                    }
                }
            }
            for (AFi1hSDK aFi1hSDK : force.AFKeystoreWrapper()) {
                aFi1hSDK.values(force.AFInAppEventParameterName.w().AFKeystoreWrapper);
            }
            final AFg1wSDK i4 = this.force.i();
            AFd1sSDK AFInAppEventType2 = AFInAppEventParameterName().AFInAppEventType();
            i4.valueOf = System.currentTimeMillis();
            AFg1uSDK aFg1uSDK = i4.AFInAppEventParameterName;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AFb1kSDK.valueOf(AFInAppEventType2.valueOf, AFInAppEventType2.AFKeystoreWrapper));
            sb2.append(i4.valueOf);
            byte[] values2 = AFb1lSDK.values(sb2.toString());
            if (values2 == null || values2.length <= 0) {
                j4 = -1;
            } else {
                if (values2.length > 8) {
                    values2 = Arrays.copyOfRange(values2, 0, 8);
                }
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.put(values2);
                allocate.flip();
                j4 = allocate.getLong();
            }
            i4.values = aFg1uSDK.AFKeystoreWrapper(j4, i4.AFKeystoreWrapper.AFKeystoreWrapper, new AFg1uSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFg1wSDK.3
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
                        message = "unknown";
                    }
                    AFg1wSDK.this.values();
                    AFg1wSDK.this.AFInAppEventType.put("error", message);
                    AFLogger.afErrorLog(str2, exc, true, true, false);
                }
            });
        } else {
            AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFInAppEventParameterName().v().AFInAppEventParameterName("init", str, appsFlyerConversionListener == null ? "null" : "conversionDataListener");
        AFLogger.INSTANCE.force(AFg1aSDK.GENERAL, "Initializing AppsFlyer SDK: (v6.14.0." + values + ")");
        this.AFInAppEventType = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        try {
        } catch (PackageManager.NameNotFoundException e4) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e4);
        }
        if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) == 0) {
            AFPurchaseDetails = (afLogForce + 89) % 128;
            return false;
        }
        int i2 = (afLogForce + 15) % 128;
        AFPurchaseDetails = i2;
        afLogForce = (i2 + 81) % 128;
        return true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        int i2 = afLogForce + 49;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName().i().AFKeystoreWrapper();
            throw null;
        }
        boolean AFKeystoreWrapper2 = AFInAppEventParameterName().i().AFKeystoreWrapper();
        int i4 = AFPurchaseDetails + 53;
        afLogForce = i4 % 128;
        if (i4 % 2 != 0) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i2 = afLogForce + 7;
        AFPurchaseDetails = i2 % 128;
        int i4 = i2 % 2;
        logEvent(context, str, map, null);
        if (i4 != 0) {
            int i5 = 98 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d4, double d5) {
        AFInAppEventParameterName().v().AFInAppEventParameterName("logLocation", String.valueOf(d4), String.valueOf(d5));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d5));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d4));
        values(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        int i2 = AFPurchaseDetails + 19;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            int i4 = 14 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        afLogForce = (AFPurchaseDetails + 105) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("logSession", new String[0]);
        AFInAppEventParameterName().v().AFInAppEventParameterName();
        values(context, AFh1tSDK.logSession);
        values(context, null, null);
        int i2 = AFPurchaseDetails + 123;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i2 = AFPurchaseDetails + 103;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType();
            throw null;
        }
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType();
        afLogForce = (AFPurchaseDetails + 105) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        r4 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        valueOf(r4);
        AFInAppEventParameterName().afRDLog().AFKeystoreWrapper(r4, com.appsflyer.internal.AFc1oSDK.AFKeystoreWrapper(AFInAppEventParameterName().getPurchaseToken()), android.net.Uri.parse(r5.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r5.toString().isEmpty() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r5.toString().isEmpty() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r4 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        r5 = AFInAppEventParameterName().afRDLog();
        r0 = new java.lang.StringBuilder("Context is \"");
        r0.append(r4);
        r0.append("\"");
        r5.values(r0.toString(), com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK);
        r4 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails + 67;
        com.appsflyer.internal.AFb1vSDK.afLogForce = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if ((r4 % 2) != 0) goto L21;
     */
    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performOnAppAttribution(Context context, URI uri) {
        int i2 = (AFPurchaseDetails + 47) % 128;
        afLogForce = i2;
        if (uri != null) {
            int i4 = i2 + 35;
            AFPurchaseDetails = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 45 / 0;
            }
        }
        AFc1vSDK afRDLog = AFInAppEventParameterName().afRDLog();
        StringBuilder sb = new StringBuilder("Link is \"");
        sb.append(uri);
        sb.append("\"");
        afRDLog.values(sb.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(Intent intent, Context context) {
        int i2 = AFPurchaseDetails;
        afLogForce = (i2 + 101) % 128;
        if (intent == null) {
            AFInAppEventParameterName().afRDLog().values("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            valueOf(applicationContext);
            AFInAppEventParameterName().values().execute(new c(this, applicationContext, intent, 0));
            return;
        }
        int i4 = i2 + 55;
        afLogForce = i4 % 128;
        if (i4 % 2 != 0) {
            AFInAppEventParameterName().afRDLog().values("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else {
            AFInAppEventParameterName().afRDLog().values("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            int i5 = 1 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        afLogForce = (AFPurchaseDetails + 105) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("registerConversionListener", new String[0]);
        values(appsFlyerConversionListener);
        afLogForce = (AFPurchaseDetails + 119) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        AFInAppEventParameterName().v().AFInAppEventParameterName("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            afLogForce = (AFPurchaseDetails + 115) % 128;
            AFLogger.afDebugLog("registerValidatorListener null listener");
        } else {
            AFKeystoreWrapper = appsFlyerInAppPurchaseValidatorListener;
            afLogForce = (AFPurchaseDetails + 83) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdImpression(Context context, Map<String, Object> map) {
        int AFInAppEventParameterName2 = AFInAppEventParameterName(AFInAppEventParameterName(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adimpression_counter", Integer.valueOf(AFInAppEventParameterName2));
        valueOf(context, hashMap, new AFh1vSDK());
        afLogForce = (AFPurchaseDetails + 99) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int valueOf2 = valueOf(AFInAppEventParameterName(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adrevenue_counter", Integer.valueOf(valueOf2));
        valueOf(context, hashMap, new AFh1sSDK());
        afLogForce = (AFPurchaseDetails + 57) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r4.valueOf(r5, r6, "purchases") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r4.valueOf(r5, r6, r2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        r0 = new com.appsflyer.internal.AFf1mSDK(r5, r6, r4.AFInAppEventParameterName);
        r4 = r4.valueOf;
        r4.valueOf.execute(new com.appsflyer.internal.AFe1cSDK.AnonymousClass2(r4, r0));
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler unregisterClient;
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
        afLogForce = (AFPurchaseDetails + 121) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFPurchaseDetails = (afLogForce + 95) % 128;
        valueOf(context);
        PurchaseHandler unregisterClient = AFInAppEventParameterName().unregisterClient();
        if (unregisterClient.valueOf(map, purchaseValidationCallback, "subscriptions")) {
            AFf1ySDK aFf1ySDK = new AFf1ySDK(map, purchaseValidationCallback, unregisterClient.AFInAppEventParameterName);
            AFe1cSDK aFe1cSDK = unregisterClient.valueOf;
            aFe1cSDK.valueOf.execute(aFe1cSDK.new AnonymousClass2(aFf1ySDK));
        }
        int i2 = AFPurchaseDetails + 117;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0177  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        long j4;
        int i2 = AFPurchaseDetails + 11;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (activity != null && activity.getIntent() != null) {
            AFb1bSDK v4 = AFInAppEventParameterName().v();
            String localClassName = activity.getLocalClassName();
            StringBuilder sb = new StringBuilder("activity_intent_");
            sb.append(activity.getIntent().toString());
            v4.AFInAppEventParameterName("sendPushNotificationData", localClassName, sb.toString());
        } else if (activity != null) {
            int i4 = afLogForce + 73;
            AFPurchaseDetails = i4 % 128;
            if (i4 % 2 != 0) {
                AFb1bSDK v5 = AFInAppEventParameterName().v();
                String[] strArr = new String[2];
                strArr[0] = activity.getLocalClassName();
                strArr[0] = "activity_intent_null";
                v5.AFInAppEventParameterName("sendPushNotificationData", strArr);
            } else {
                AFInAppEventParameterName().v().AFInAppEventParameterName("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            }
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("sendPushNotificationData", "activity_null");
        }
        AFd1pSDK level = AFInAppEventParameterName().getLevel();
        String valueOf2 = valueOf(activity);
        level.values = valueOf2;
        if (valueOf2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f5858d == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.f5858d = new ConcurrentHashMap();
                j4 = currentTimeMillis;
            } else {
                try {
                    long j5 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    Iterator<Long> it = this.f5858d.keySet().iterator();
                    j4 = currentTimeMillis;
                    while (it.hasNext()) {
                        try {
                            Long next = it.next();
                            JSONObject jSONObject = new JSONObject(level.values);
                            JSONObject jSONObject2 = new JSONObject(this.f5858d.get(next));
                            Iterator<Long> it2 = it;
                            if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                StringBuilder sb2 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                sb2.append(jSONObject2);
                                sb2.append(", new: ");
                                sb2.append(jSONObject);
                                sb2.append(")");
                                AFLogger.afInfoLog(sb2.toString());
                                level.values = null;
                                return;
                            }
                            if (currentTimeMillis - next.longValue() > j5) {
                                this.f5858d.remove(next);
                            }
                            if (next.longValue() <= j4) {
                                j4 = next.longValue();
                            }
                            it = it2;
                        } catch (Throwable th) {
                            th = th;
                            AFLogger.afErrorLog("Error while handling push notification measurement: ".concat(th.getClass().getSimpleName()), th);
                            if (this.f5858d.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                            }
                            this.f5858d.put(Long.valueOf(currentTimeMillis), level.values);
                            start(activity);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j4 = currentTimeMillis;
                }
            }
            if (this.f5858d.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                StringBuilder sb3 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb3.append(j4);
                sb3.append(")");
                AFLogger.afInfoLog(sb3.toString());
                this.f5858d.remove(Long.valueOf(j4));
            }
            this.f5858d.put(Long.valueOf(currentTimeMillis), level.values);
            start(activity);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        afLogForce = (AFPurchaseDetails + 41) % 128;
        if (map != null) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            AFPurchaseDetails = (afLogForce + 21) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        afLogForce = (AFPurchaseDetails + 33) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setAndroidIdData", str);
        AFInAppEventParameterName().getLevel().AFInAppEventType = str;
        afLogForce = (AFPurchaseDetails + 109) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i2 = afLogForce + 99;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setAppId", str);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setAppId", str);
        }
        AFInAppEventType(AppsFlyerProperties.APP_ID, str);
        AFPurchaseDetails = (afLogForce + 37) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        AFInAppEventParameterName().v().AFInAppEventParameterName("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
            AFPurchaseDetails = (afLogForce + 51) % 128;
        }
        AFInAppEventType(AppsFlyerProperties.ONELINK_ID, str);
        int i2 = AFPurchaseDetails + 49;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z4) {
        afLogForce = (AFPurchaseDetails + 49) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectAndroidID", String.valueOf(z4));
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z4));
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z4));
        afLogForce = (AFPurchaseDetails + 117) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z4) {
        int i2 = AFPurchaseDetails + 123;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectIMEI", String.valueOf(z4));
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectIMEI", String.valueOf(z4));
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z4));
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z4));
        afLogForce = (AFPurchaseDetails + 117) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z4) {
        int i2 = AFPurchaseDetails + 117;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFb1bSDK v4 = AFInAppEventParameterName().v();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z4);
            v4.AFInAppEventParameterName("setCollectOaid", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectOaid", String.valueOf(z4));
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z4));
        AFPurchaseDetails = (afLogForce + 27) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        int i2 = AFPurchaseDetails + 61;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            Objects.requireNonNull(appsFlyerConsent);
            AFInAppEventParameterName().getLevel().f5874d = appsFlyerConsent;
            int i4 = 1 / 0;
        } else {
            Objects.requireNonNull(appsFlyerConsent);
            AFInAppEventParameterName().getLevel().f5874d = appsFlyerConsent;
        }
        afLogForce = (AFPurchaseDetails + 91) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i2 = AFPurchaseDetails + 23;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFb1bSDK v4 = AFInAppEventParameterName().v();
            String[] strArr = new String[0];
            strArr[1] = str;
            v4.AFInAppEventParameterName("setCurrencyCode", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCurrencyCode", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        if (context != null) {
            if (values()) {
                setCustomerUserId(str);
                StringBuilder sb = new StringBuilder("CustomerUserId set: ");
                sb.append(str);
                sb.append(" - Initializing AppsFlyer Tacking");
                AFLogger.afInfoLog(sb.toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().valueOf());
                values(context, AFh1tSDK.setCustomerIdAndLogSession);
                String str2 = AFInAppEventParameterName().i().AFLogger;
                if (referrer == null) {
                    referrer = "";
                }
                if (context instanceof Activity) {
                    afLogForce = (AFPurchaseDetails + 43) % 128;
                    ((Activity) context).getIntent();
                }
                AFKeystoreWrapper(context, referrer);
                afLogForce = (AFPurchaseDetails + 99) % 128;
                return;
            }
            setCustomerUserId(str);
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
        int i2 = afLogForce + 69;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        AFPurchaseDetails = (afLogForce + 39) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFInAppEventType(AppsFlyerProperties.APP_USER_ID, str);
        AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        AFPurchaseDetails = (afLogForce + 103) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
    
        r3 = com.appsflyer.AFLogger.LogLevel.DEBUG;
        com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = (com.appsflyer.internal.AFb1vSDK.afLogForce + 87) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0013, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r3 = com.appsflyer.AFLogger.LogLevel.NONE;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setDebugLog(boolean z4) {
        AFLogger.LogLevel logLevel;
        int i2 = AFPurchaseDetails + 39;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            int i4 = 89 / 0;
        }
        setLogLevel(logLevel);
        int i5 = AFPurchaseDetails + 53;
        afLogForce = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z4) {
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z4)));
        AFb1rSDK.AFInAppEventType = Boolean.valueOf(!z4);
        AFd1kSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFInAppEventParameterName2.getLevel().unregisterClient = z4;
        if (!z4) {
            AFe1cSDK afInfoLog = AFInAppEventParameterName2.afInfoLog();
            afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(new AFf1uSDK(AFInAppEventParameterName())));
            AFPurchaseDetails = (afLogForce + 51) % 128;
            return;
        }
        int i2 = AFPurchaseDetails + 71;
        afLogForce = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName2.getLevel().AFLogger = null;
        } else {
            AFInAppEventParameterName2.getLevel().AFLogger = null;
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z4) {
        AFPurchaseDetails = (afLogForce + 47) % 128;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z4)));
        AFInAppEventType(AppsFlyerProperties.DISABLE_NETWORK_DATA, z4);
        AFPurchaseDetails = (afLogForce + 83) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i2 = AFPurchaseDetails + 43;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFb1bSDK v4 = AFInAppEventParameterName().v();
            String[] strArr = new String[0];
            strArr[1] = str;
            v4.AFInAppEventParameterName("setExtension", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i4 = AFPurchaseDetails + 47;
        afLogForce = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String str3;
        int i2 = AFPurchaseDetails + 5;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFc1tSDK.AFInAppEventType(str2);
            throw null;
        }
        if (AFc1tSDK.AFInAppEventType(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i4 = afLogForce + 95;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            str3 = str.trim();
            afLogForce = (AFPurchaseDetails + 53) % 128;
        } else {
            str3 = "";
        }
        AFe1gSDK.valueOf(new AFe1kSDK(str3, str2.trim()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i2 = afLogForce + 15;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1bSDK v4 = AFInAppEventParameterName().v();
            String[] strArr = new String[0];
            strArr[1] = str;
            v4.AFInAppEventParameterName("setImeiData", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setImeiData", str);
        }
        AFInAppEventParameterName().i().unregisterClient = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z4) {
        AFPurchaseDetails = (afLogForce + 117) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setIsUpdate", String.valueOf(z4));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z4);
        afLogForce = (AFPurchaseDetails + 115) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        int i2 = AFPurchaseDetails + 111;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            logLevel.getLevel();
            AFLogger.LogLevel.NONE.getLevel();
            throw null;
        }
        boolean z4 = logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel();
        AFInAppEventParameterName().v().AFInAppEventParameterName("log", String.valueOf(z4));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z4) {
            AFInAppEventParameterName().AFLogger$LogLevel().registerClient();
        } else {
            AFPurchaseDetails = (afLogForce + 71) % 128;
            AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i2) {
        int i4 = afLogForce + 59;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 == 0) {
            this.unregisterClient = TimeUnit.SECONDS.toMillis(i2);
        } else {
            this.unregisterClient = TimeUnit.SECONDS.toMillis(i2);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        afLogForce = (AFPurchaseDetails + 13) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setOaidData", str);
        AFb1rSDK.values = str;
        int i2 = AFPurchaseDetails + 99;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        afLogForce = (AFPurchaseDetails + 87) % 128;
        AFLogger.afDebugLog("setOneLinkCustomDomain " + Arrays.toString(strArr));
        AFInAppEventParameterName().afRDLog().unregisterClient = strArr;
        afLogForce = (AFPurchaseDetails + 67) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i2 = AFPurchaseDetails;
        afLogForce = (i2 + 27) % 128;
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        afLogForce = (i2 + 97) % 128;
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r5 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r5.isEmpty() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r1 = new java.lang.StringBuilder("Setting partner data for ");
        r1.append(r4);
        r1.append(": ");
        r1.append(r5);
        com.appsflyer.AFLogger.afDebugLog(r1.toString());
        r1 = new org.json.JSONObject(r5).toString().length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        if (r1 <= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
        r5 = new java.util.HashMap();
        r5.put("error", "limit exceeded: ".concat(java.lang.String.valueOf(r1)));
        r0.values.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        r0.AFInAppEventParameterName.put(r4, r5);
        r0.values.remove(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        if (r0.AFInAppEventParameterName.remove(r4) != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        r4 = "Partner data is missing or `null`";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        com.appsflyer.AFLogger.afWarnLog(r4);
        com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = (com.appsflyer.internal.AFb1vSDK.afLogForce + 123) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        r4 = "Cleared partner data for ".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        if ((!r4.isEmpty()) != true) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r4.isEmpty() != false) goto L31;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPartnerData(String str, Map<String, Object> map) {
        AFd1pSDK level = AFInAppEventParameterName().getLevel();
        if (level.AFInAppEventParameterName == null) {
            level.AFInAppEventParameterName = new AFc1cSDK();
            afLogForce = (AFPurchaseDetails + 53) % 128;
        }
        AFc1cSDK aFc1cSDK = level.AFInAppEventParameterName;
        if (str != null) {
            int i2 = AFPurchaseDetails + 23;
            afLogForce = i2 % 128;
            if (i2 % 2 == 0) {
                int i4 = 79 / 0;
            }
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i2 = afLogForce + 91;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName().getLevel().valueOf = AFb1lSDK.AFKeystoreWrapper(str);
            throw null;
        }
        AFInAppEventParameterName().getLevel().valueOf = AFb1lSDK.AFKeystoreWrapper(str);
        int i4 = afLogForce + 83;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        AFPurchaseDetails = (afLogForce + 47) % 128;
        Objects.requireNonNull(pluginInfo);
        AFInAppEventParameterName().afWarnLog().AFKeystoreWrapper(pluginInfo);
        AFPurchaseDetails = (afLogForce + 83) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e4) {
                AFLogger.afErrorLog(e4.getMessage(), e4);
            }
        }
        if (str2 != null) {
            AFPurchaseDetails = (afLogForce + 63) % 128;
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
            AFPurchaseDetails = (afLogForce + 103) % 128;
        }
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            afLogForce = (AFPurchaseDetails + 1) % 128;
            return;
        }
        int i2 = afLogForce + 21;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventType("preInstallName", jSONObject.toString());
        } else {
            AFInAppEventType("preInstallName", jSONObject.toString());
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFPurchaseDetails = (afLogForce + 15) % 128;
        AFLogger.afDebugLog("setResolveDeepLinkURLs " + Arrays.toString(strArr));
        AFc1vSDK afRDLog = AFInAppEventParameterName().afRDLog();
        afRDLog.AFLogger.clear();
        afRDLog.AFLogger.addAll(Arrays.asList(strArr));
        afLogForce = (AFPurchaseDetails + 115) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        int i2 = afLogForce + 3;
        AFPurchaseDetails = i2 % 128;
        int i4 = i2 % 2;
        setSharingFilterForPartners(strArr);
        if (i4 != 0) {
            throw null;
        }
        int i5 = afLogForce + 35;
        AFPurchaseDetails = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        afLogForce = (AFPurchaseDetails + 69) % 128;
        setSharingFilterForPartners("all");
        int i2 = afLogForce + 35;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            int i4 = 14 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        AFInAppEventParameterName().getLevel().AFKeystoreWrapper = new AFd1wSDK(strArr);
        int i2 = afLogForce + 91;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i2 = afLogForce + 107;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        afLogForce = (AFPurchaseDetails + 17) % 128;
        start(context, null);
        AFPurchaseDetails = (afLogForce + 57) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z4, Context context) {
        afLogForce = (AFPurchaseDetails + 21) % 128;
        valueOf(context);
        AFd1kSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFInAppEventParameterName2.i().registerClient = z4;
        AFInAppEventParameterName2.values().submit(new a(2, AFInAppEventParameterName2));
        if (z4) {
            AFInAppEventParameterName2.valueOf().valueOf("is_stop_tracking_used", true);
            afLogForce = (AFPurchaseDetails + 73) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i2 = afLogForce + 41;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 == 0) {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        } else {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            int i4 = 85 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i2 = AFPurchaseDetails + 25;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
        }
        this.AFInAppEventType = null;
        int i4 = afLogForce + 79;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        valueOf(context);
        AFg1nSDK aFg1nSDK = new AFg1nSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFg1aSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFg1aSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFg1oSDK valueOf2 = aFg1nSDK.valueOf();
        if (valueOf2 == null || !str.equals(valueOf2.values)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z4 = valueOf2 == null || currentTimeMillis - valueOf2.AFInAppEventParameterName > TimeUnit.SECONDS.toMillis(2L);
            AFg1oSDK aFg1oSDK = new AFg1oSDK(str, currentTimeMillis, !z4);
            aFg1nSDK.values.AFInAppEventParameterName("afUninstallToken", aFg1oSDK.values);
            aFg1nSDK.values.AFKeystoreWrapper("afUninstallToken_received_time", aFg1oSDK.AFInAppEventParameterName);
            aFg1nSDK.values.valueOf("afUninstallToken_queued", aFg1oSDK.values());
            if (z4) {
                AFg1nSDK.values(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = (com.appsflyer.internal.AFb1vSDK.afLogForce + 75) % 128;
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r19 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r19 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0053, code lost:
    
        r3 = r19.toString();
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AFb1bSDK v4;
        String[] strArr;
        char c4;
        String str6;
        int i2 = afLogForce + 101;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            v4 = AFInAppEventParameterName().v();
            strArr = new String[100];
            strArr[0] = str;
            strArr[1] = str2;
            strArr[4] = str3;
            strArr[2] = str4;
            strArr[3] = str5;
            c4 = 2;
        } else {
            v4 = AFInAppEventParameterName().v();
            strArr = new String[6];
            strArr[0] = str;
            strArr[1] = str2;
            strArr[2] = str3;
            strArr[3] = str4;
            strArr[4] = str5;
            c4 = 5;
        }
        strArr[c4] = str6;
        v4.AFInAppEventParameterName("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1aSDK aFg1aSDK = AFg1aSDK.PURCHASE_VALIDATION;
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str5);
            aFLogger.i(aFg1aSDK, sb.toString());
        }
        if (str != null && str4 != null && str2 != null) {
            int i4 = AFPurchaseDetails + 87;
            afLogForce = i4 % 128;
            if (i4 % 2 == 0) {
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
    public final void waitForCustomerUserId(boolean z4) {
        int i2 = AFPurchaseDetails + 79;
        afLogForce = i2 % 128;
        int i4 = i2 % 2;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z4)), true);
        AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z4);
    }

    public static /* synthetic */ boolean AFInAppEventType(AFb1vSDK aFb1vSDK, boolean z4) {
        int i2 = AFPurchaseDetails + 63;
        afLogForce = i2 % 128;
        int i4 = i2 % 2;
        aFb1vSDK.f5860i = z4;
        if (i4 != 0) {
            return z4;
        }
        throw null;
    }

    public static AFb1vSDK AFKeystoreWrapper() {
        int i2 = AFPurchaseDetails + 121;
        int i4 = i2 % 128;
        afLogForce = i4;
        if (i2 % 2 == 0) {
            throw null;
        }
        AFb1vSDK aFb1vSDK = AFLogger;
        AFPurchaseDetails = (i4 + 47) % 128;
        return aFb1vSDK;
    }

    private static void AFLogger(String str) {
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                return;
            }
            int i2 = afLogForce + 7;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 != 0) {
                AFInAppEventType("preInstallName", str);
                throw null;
            }
            AFInAppEventType("preInstallName", str);
            afLogForce = (AFPurchaseDetails + 25) % 128;
        } catch (JSONException e4) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b4, short s4, int i2, int i4, int i5, Object[] objArr) {
        int i6;
        byte[] bArr;
        boolean z4;
        AFj1fSDK aFj1fSDK = new AFj1fSDK();
        StringBuilder sb = new StringBuilder();
        int i7 = i5 + ((int) (afVerboseLog ^ (-9170317761439758363L)));
        boolean z5 = i7 == -1;
        if (z5) {
            int i8 = $11;
            $10 = (i8 + 101) % 128;
            byte[] bArr2 = afErrorLog;
            if (bArr2 != null) {
                int length = bArr2.length;
                byte[] bArr3 = new byte[length];
                $10 = (i8 + 51) % 128;
                for (int i9 = 0; i9 < length; i9++) {
                    bArr3[i9] = (byte) (bArr2[i9] ^ (-9170317761439758363L));
                }
                bArr2 = bArr3;
            }
            i7 = bArr2 != null ? (byte) (((byte) (afErrorLog[((int) (afWarnLog ^ (-9170317761439758363L))) + i2] ^ (-9170317761439758363L))) + ((int) (afVerboseLog ^ (-9170317761439758363L)))) : (short) (((short) (getLevel[((int) (afWarnLog ^ (-9170317761439758363L))) + i2] ^ (-9170317761439758363L))) + ((int) (afVerboseLog ^ (-9170317761439758363L))));
        }
        if (i7 > 0) {
            int i10 = ((i2 + i7) - 2) + ((int) (afWarnLog ^ (-9170317761439758363L)));
            if (z5) {
                int i11 = $11 + 75;
                $10 = i11 % 128;
                if (i11 % 2 == 0) {
                    i6 = 1;
                    aFj1fSDK.values = i10 + i6;
                    char c4 = (char) (i4 + ((int) (afDebugLog ^ (-9170317761439758363L))));
                    aFj1fSDK.AFKeystoreWrapper = c4;
                    sb.append(c4);
                    aFj1fSDK.AFInAppEventParameterName = aFj1fSDK.AFKeystoreWrapper;
                    bArr = afErrorLog;
                    if (bArr != null) {
                        int length2 = bArr.length;
                        byte[] bArr4 = new byte[length2];
                        for (int i12 = 0; i12 < length2; i12++) {
                            bArr4[i12] = (byte) (bArr[i12] ^ (-9170317761439758363L));
                        }
                        bArr = bArr4;
                    }
                    if (bArr == null) {
                        $11 = ($10 + 57) % 128;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    aFj1fSDK.AFInAppEventType = 1;
                    while (aFj1fSDK.AFInAppEventType < i7) {
                        if (z4) {
                            byte[] bArr5 = afErrorLog;
                            aFj1fSDK.values = aFj1fSDK.values - 1;
                            aFj1fSDK.AFKeystoreWrapper = (char) (aFj1fSDK.AFInAppEventParameterName + (((byte) (((byte) (bArr5[r9] ^ (-9170317761439758363L))) + s4)) ^ b4));
                        } else {
                            short[] sArr = getLevel;
                            aFj1fSDK.values = aFj1fSDK.values - 1;
                            aFj1fSDK.AFKeystoreWrapper = (char) (aFj1fSDK.AFInAppEventParameterName + (((short) (((short) (sArr[r9] ^ (-9170317761439758363L))) + s4)) ^ b4));
                        }
                        sb.append(aFj1fSDK.AFKeystoreWrapper);
                        aFj1fSDK.AFInAppEventParameterName = aFj1fSDK.AFKeystoreWrapper;
                        aFj1fSDK.AFInAppEventType++;
                    }
                }
            }
            i6 = 0;
            aFj1fSDK.values = i10 + i6;
            char c42 = (char) (i4 + ((int) (afDebugLog ^ (-9170317761439758363L))));
            aFj1fSDK.AFKeystoreWrapper = c42;
            sb.append(c42);
            aFj1fSDK.AFInAppEventParameterName = aFj1fSDK.AFKeystoreWrapper;
            bArr = afErrorLog;
            if (bArr != null) {
            }
            if (bArr == null) {
            }
            aFj1fSDK.AFInAppEventType = 1;
            while (aFj1fSDK.AFInAppEventType < i7) {
            }
        }
        objArr[0] = sb.toString();
    }

    private boolean d() {
        if (this.f5859e <= 0) {
            if (isStopped()) {
                return false;
            }
            AFLogger.afInfoLog("Sending first launch for this session!");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f5859e;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
        String AFKeystoreWrapper2 = AFKeystoreWrapper(simpleDateFormat, this.f5859e);
        String AFKeystoreWrapper3 = AFKeystoreWrapper(simpleDateFormat, this.registerClient);
        if (currentTimeMillis < this.unregisterClient && !isStopped()) {
            AFLogger.afInfoLog("Last Launch attempt: " + AFKeystoreWrapper2 + ";\nLast successful Launch event: " + AFKeystoreWrapper3 + ";\nThis launch is blocked: " + currentTimeMillis + " ms < " + this.unregisterClient + " ms");
            return true;
        }
        if (isStopped()) {
            return false;
        }
        AFPurchaseDetails = (afLogForce + 21) % 128;
        AFLogger.afInfoLog("Last Launch attempt: " + AFKeystoreWrapper2 + ";\nLast successful Launch event: " + AFKeystoreWrapper3 + ";\nSending launch (+" + currentTimeMillis + " ms)");
        afLogForce = (AFPurchaseDetails + 75) % 128;
        return false;
    }

    private synchronized AFf1eSDK e() {
        try {
            int i2 = afLogForce;
            AFPurchaseDetails = (i2 + 125) % 128;
            if (this.afRDLog == null) {
                this.afRDLog = new d(this);
                AFPurchaseDetails = (i2 + 79) % 128;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afRDLog;
    }

    private void unregisterClient() {
        int i2 = afLogForce + 57;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            int i4 = 77 / 0;
            if (AFf1oSDK.e()) {
                return;
            }
        } else if (AFf1oSDK.e()) {
            return;
        }
        AFd1kSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFe1cSDK afInfoLog = AFInAppEventParameterName2.afInfoLog();
        afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(new AFf1oSDK(AFInAppEventParameterName2)));
        int i5 = afLogForce + 121;
        AFPurchaseDetails = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void valueOf(AFb1vSDK aFb1vSDK) {
        AFPurchaseDetails = (afLogForce + 31) % 128;
        aFb1vSDK.unregisterClient();
        afLogForce = (AFPurchaseDetails + 49) % 128;
    }

    public final AFd1kSDK AFInAppEventParameterName() {
        int i2 = (AFPurchaseDetails + 117) % 128;
        afLogForce = i2;
        AFd1nSDK aFd1nSDK = this.force;
        int i4 = i2 + 35;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 == 0) {
            return aFd1nSDK;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        valueOf(context);
        AFh1jSDK aFh1jSDK = new AFh1jSDK();
        aFh1jSDK.f5849e = str;
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
        AFb1bSDK v4 = AFInAppEventParameterName().v();
        Map map2 = aFh1jSDK.AFInAppEventParameterName;
        if (map2 == null) {
            map2 = new HashMap();
        }
        v4.AFInAppEventParameterName("logEvent", str, new JSONObject(map2).toString());
        if (str == null) {
            values(context, AFh1tSDK.logEvent);
        }
        AFInAppEventType(aFh1jSDK, e(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        int i2 = AFPurchaseDetails + 27;
        afLogForce = i2 % 128;
        int i4 = i2 % 2;
        start(context, str, null);
        if (i4 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j4) {
        int i2 = AFPurchaseDetails + 79;
        afLogForce = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventParameterName().afRDLog().valueOf = deepLinkListener;
            AFInAppEventParameterName().afRDLog().registerClient = j4;
        } else {
            AFInAppEventParameterName().afRDLog().valueOf = deepLinkListener;
            AFInAppEventParameterName().afRDLog().registerClient = j4;
            int i4 = 56 / 0;
        }
    }

    public final boolean values() {
        int i2 = afLogForce + 87;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID);
            throw null;
        }
        if (!AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) || valueOf() != null) {
            return false;
        }
        int i4 = afLogForce + 33;
        AFPurchaseDetails = i4 % 128;
        return i4 % 2 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(AFf1gSDK aFf1gSDK) {
        afLogForce = (AFPurchaseDetails + 95) % 128;
        AFd1kSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        if (aFf1gSDK == AFf1gSDK.SUCCESS) {
            AFInAppEventParameterName2.getCurrency().AFInAppEventParameterName();
            AFPurchaseDetails = (afLogForce + 81) % 128;
        }
        if (!AFInAppEventParameterName2.v().values()) {
            afLogForce = (AFPurchaseDetails + 33) % 128;
            AFInAppEventParameterName2.AFLogger$LogLevel().AFInAppEventParameterName();
        } else {
            AFInAppEventParameterName2.AFLogger$LogLevel().values();
        }
    }

    private static void AFInAppEventType(String str, String str2) {
        AFPurchaseDetails = (afLogForce + 59) % 128;
        AppsFlyerProperties.getInstance().set(str, str2);
        AFPurchaseDetails = (afLogForce + 13) % 128;
    }

    private void values(Context context, String str, Map<String, Object> map) {
        AFh1jSDK aFh1jSDK = new AFh1jSDK();
        aFh1jSDK.f5849e = str;
        aFh1jSDK.AFInAppEventParameterName = map;
        AFInAppEventType(aFh1jSDK, e(context));
        int i2 = AFPurchaseDetails + 39;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void AFKeystoreWrapper(Context context, Intent intent) {
        AFj1ySDK aFj1ySDK = new AFj1ySDK(intent);
        if (aFj1ySDK.AFInAppEventParameterName("appsflyer_preinstall") != null) {
            AFLogger(aFj1ySDK.AFInAppEventParameterName("appsflyer_preinstall"));
            AFPurchaseDetails = (afLogForce + 51) % 128;
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String AFInAppEventParameterName2 = aFj1ySDK.AFInAppEventParameterName("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(AFInAppEventParameterName2)));
        if (AFInAppEventParameterName2 != null) {
            afLogForce = (AFPurchaseDetails + 107) % 128;
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

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (AFInAppEventParameterName().afErrorLogForExcManagerOnly().values()) {
            return;
        }
        if (!this.f5862w) {
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
        if (this.f5861v == null) {
            afLogForce = (AFPurchaseDetails + 89) % 128;
            Application AFInAppEventParameterName2 = AFb1uSDK.AFInAppEventParameterName(context);
            if (AFInAppEventParameterName2 == null) {
                return;
            } else {
                this.f5861v = AFInAppEventParameterName2;
            }
        }
        AFInAppEventParameterName().v().AFInAppEventParameterName("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.GENERAL;
        String str2 = values;
        aFLogger.i(aFg1aSDK, "Starting AppsFlyer: (v6.14.0." + str2 + ")");
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str2);
        aFLogger.i(aFg1aSDK, sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(AFInAppEventParameterName().valueOf());
        if (!TextUtils.isEmpty(str)) {
            AFInAppEventParameterName().i().AFLogger = str;
            AFb1mSDK.valueOf(str);
            afLogForce = (AFPurchaseDetails + 15) % 128;
        } else if (TextUtils.isEmpty(AFInAppEventParameterName().i().AFLogger)) {
            int i2 = afLogForce + 117;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 == 0) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
                if (appsFlyerRequestListener != null) {
                    int i4 = AFPurchaseDetails + 111;
                    afLogForce = i4 % 128;
                    if (i4 % 2 != 0) {
                        appsFlyerRequestListener.onError(41, "No dev key");
                        return;
                    } else {
                        appsFlyerRequestListener.onError(3, "No dev key");
                        return;
                    }
                }
                return;
            }
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            throw null;
        }
        AFInAppEventParameterName().registerClient().AFKeystoreWrapper(e());
        unregisterClient();
        AFInAppEventType(this.f5861v.getBaseContext());
        AFInAppEventParameterName().afDebugLog().AFKeystoreWrapper();
        this.force.afErrorLogForExcManagerOnly().AFInAppEventType(context, new AFd1xSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFb1vSDK.5
            @Override // com.appsflyer.internal.AFd1xSDK.AFa1zSDK
            public final void valueOf() {
                Context context2 = AFb1vSDK.this.AFInAppEventParameterName().w().AFKeystoreWrapper;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1wSDK aFh1wSDK = AFLogger2;
                long currentTimeMillis = System.currentTimeMillis();
                long j4 = aFh1wSDK.unregisterClient;
                if (j4 != 0) {
                    long j5 = currentTimeMillis - j4;
                    if (j5 > 0 && j5 < 1000) {
                        j5 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j5);
                    aFh1wSDK.f5956v = seconds;
                    aFh1wSDK.AFInAppEventParameterName.AFKeystoreWrapper("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFb1vSDK.this.AFInAppEventParameterName().getCurrency().AFInAppEventType();
                AFb1bSDK v4 = AFb1vSDK.this.AFInAppEventParameterName().v();
                if (v4.e()) {
                    v4.AFInAppEventType();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        v4.values(context2.getPackageName(), context2.getPackageManager());
                    }
                    v4.valueOf();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFb1vSDK.this.AFInAppEventParameterName().d().AFInAppEventParameterName();
                AFb1vSDK.this.AFInAppEventParameterName().getPurchaseToken().AFInAppEventType();
            }

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
        });
    }

    public final void valueOf(Context context) {
        AFd1nSDK aFd1nSDK = this.force;
        if (context != null) {
            afLogForce = (AFPurchaseDetails + 57) % 128;
            AFd1lSDK aFd1lSDK = aFd1nSDK.AFInAppEventParameterName;
            if (context != null) {
                aFd1lSDK.AFKeystoreWrapper = context.getApplicationContext();
                AFPurchaseDetails = (afLogForce + 11) % 128;
            }
        }
    }

    private static void AFInAppEventType(String str, boolean z4) {
        afLogForce = (AFPurchaseDetails + 59) % 128;
        AppsFlyerProperties.getInstance().set(str, z4);
        int i2 = afLogForce + 83;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static boolean AFInAppEventType(String str) {
        int i2 = afLogForce + 103;
        AFPurchaseDetails = i2 % 128;
        int i4 = i2 % 2;
        boolean z4 = AppsFlyerProperties.getInstance().getBoolean(str, false);
        int i5 = afLogForce + 21;
        AFPurchaseDetails = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return z4;
    }

    private static void AFInAppEventType(Context context) {
        afLogForce = (AFPurchaseDetails + 65) % 128;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                AFPurchaseDetails = (afLogForce + 25) % 128;
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    AFLogger.INSTANCE.i(AFg1aSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                } else {
                    AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules", true);
                }
            }
        } catch (Exception e4) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1aSDK aFg1aSDK = AFg1aSDK.GENERAL;
            aFLogger.e(aFg1aSDK, "checkBackupRules Exception", e4, false, false);
            aFLogger.v(aFg1aSDK, "checkBackupRules Exception: ".concat(String.valueOf(e4)));
        }
    }

    private AFh1xSDK e(Context context) {
        int i2 = afLogForce;
        int i4 = i2 + 37;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 != 0) {
            boolean z4 = context instanceof Activity;
            throw null;
        }
        if (context instanceof Activity) {
            return new AFh1xSDK((Activity) context, AFInAppEventParameterName().AFPurchaseDetails());
        }
        AFPurchaseDetails = (i2 + 47) % 128;
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        AFInAppEventParameterName().v().AFInAppEventParameterName("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            AFPurchaseDetails = (afLogForce + 77) % 128;
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
        int i2 = AFPurchaseDetails + 59;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            int i4 = 86 / 0;
        }
    }

    private static void valueOf(JSONObject jSONObject) {
        String str;
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
            } catch (JSONException e4) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e4);
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
                    int i4 = 0;
                    while (i4 < jSONArray2.length()) {
                        afLogForce = (AFPurchaseDetails + 123) % 128;
                        if (jSONArray2.getLong(i4) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i4) != ((Long) arrayList.get(1)).longValue()) {
                            AFPurchaseDetails = (afLogForce + 15) % 128;
                            if (jSONArray2.getLong(i4) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            }
                            i4++;
                            str = next;
                        }
                    }
                } catch (JSONException e5) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e5);
                }
            }
        }
        if (str != null) {
            AFPurchaseDetails = (afLogForce + 81) % 128;
            jSONObject.remove(str);
        }
    }

    private void values(AppsFlyerConversionListener appsFlyerConversionListener) {
        if (appsFlyerConversionListener == null) {
            int i2 = afLogForce + 89;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.AFInAppEventType = appsFlyerConversionListener;
        int i4 = afLogForce + 33;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
    }

    private void values(AFa1qSDK aFa1qSDK) {
        String AFInAppEventParameterName2;
        AFPurchaseDetails = (afLogForce + 37) % 128;
        Context context = AFInAppEventParameterName().w().AFKeystoreWrapper;
        if (context == null) {
            afLogForce = (AFPurchaseDetails + 89) % 128;
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        String str = AFInAppEventParameterName().i().AFLogger;
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.values;
        if (str != null) {
            afLogForce = (AFPurchaseDetails + 65) % 128;
            if (str.length() != 0) {
                AFd1qSDK AFInAppEventParameterName3 = AFInAppEventParameterName(context);
                AppsFlyerProperties.getInstance().saveProperties(AFInAppEventParameterName3);
                if (!AFInAppEventParameterName().i().AFKeystoreWrapper()) {
                    AFLogger.afInfoLog("sendWithEvent from activity: ".concat(context.getClass().getName()));
                }
                boolean AFInAppEventType = aFa1qSDK.AFInAppEventType();
                Map<String, ?> AFKeystoreWrapper2 = AFKeystoreWrapper(aFa1qSDK);
                if (!isStopped()) {
                    AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
                }
                boolean z4 = false;
                int AFInAppEventType2 = AFInAppEventType(AFInAppEventParameterName3, false);
                AFj1xSDK aFj1xSDK = new AFj1xSDK(AFInAppEventParameterName().AFInAppEventType());
                Intrinsics.checkNotNullParameter(aFa1qSDK, "");
                boolean AFInAppEventType3 = aFa1qSDK.AFInAppEventType();
                boolean z5 = aFa1qSDK instanceof AFh1sSDK;
                boolean z6 = aFa1qSDK instanceof AFh1vSDK;
                boolean z7 = aFa1qSDK instanceof AFh1rSDK;
                if ((aFa1qSDK instanceof AFh1oSDK) || z7) {
                    AFInAppEventParameterName2 = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.values);
                } else if (z6) {
                    afLogForce = (AFPurchaseDetails + 67) % 128;
                    AFInAppEventParameterName2 = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.valueOf);
                } else if (z5) {
                    AFInAppEventParameterName2 = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.AFInAppEventParameterName);
                } else if (AFInAppEventType3) {
                    if (aFj1xSDK.AFInAppEventType.AFKeystoreWrapper.valueOf("appsFlyerCount", 0) < 2) {
                        AFInAppEventParameterName2 = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.AFLogger);
                    } else {
                        AFInAppEventParameterName2 = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.f5976e);
                    }
                } else {
                    AFInAppEventParameterName2 = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.registerClient);
                    AFPurchaseDetails = (afLogForce + 125) % 128;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(AFInAppEventParameterName2);
                sb.append(aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName());
                String valueOf2 = aFj1xSDK.valueOf(AFj1xSDK.AFInAppEventType(sb.toString(), z5));
                values(AFKeystoreWrapper2);
                AFc1uSDK aFc1uSDK = new AFc1uSDK(AFInAppEventParameterName(), aFa1qSDK.valueOf(valueOf2).valueOf(AFKeystoreWrapper2).AFInAppEventType(AFInAppEventType2), AFInAppEventParameterName().afDebugLog().AFInAppEventType());
                if (AFInAppEventType) {
                    afLogForce = (AFPurchaseDetails + 87) % 128;
                    boolean z8 = false;
                    for (AFi1hSDK aFi1hSDK : registerClient()) {
                        if (aFi1hSDK.unregisterClient == AFi1hSDK.AFa1ySDK.STARTED) {
                            StringBuilder sb2 = new StringBuilder("Failed to get ");
                            sb2.append(aFi1hSDK.values);
                            sb2.append(" referrer, wait ...");
                            AFLogger.afDebugLog(sb2.toString());
                            z8 = true;
                        }
                    }
                    if (AFInAppEventParameterName().afDebugLog().valueOf()) {
                        AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                        z8 = true;
                    }
                    if (AFInAppEventParameterName().i().valueOf()) {
                        int i2 = afLogForce + 49;
                        AFPurchaseDetails = i2 % 128;
                        if (i2 % 2 == 0) {
                            z4 = true;
                        }
                    } else {
                        z4 = z8;
                    }
                }
                AFj1rSDK.values(AFInAppEventParameterName().AFKeystoreWrapper(), aFc1uSDK, z4 ? 500L : 0L, TimeUnit.MILLISECONDS);
                return;
            }
        }
        AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
        AFLogger.afInfoLog("AppsFlyer will not track this event.");
        if (appsFlyerRequestListener != null) {
            afLogForce = (AFPurchaseDetails + 23) % 128;
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(boolean z4) {
        if (z4) {
            AFPurchaseDetails = (afLogForce + 111) % 128;
            AFInAppEventParameterName().AFLogger$LogLevel().valueOf();
        } else {
            AFInAppEventParameterName().AFLogger$LogLevel().AFKeystoreWrapper();
            AFPurchaseDetails = (afLogForce + 45) % 128;
        }
    }

    private void AFInAppEventParameterName(String str) {
        byte b4 = 0;
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
                AFj1rSDK.values(AFInAppEventParameterName().AFKeystoreWrapper(), new AFa1vSDK(this, AFInAppEventType, b4), 5L, TimeUnit.MILLISECONDS);
                AFPurchaseDetails = (afLogForce + 75) % 128;
            }
        }
    }

    private AFi1hSDK[] registerClient() {
        int i2 = afLogForce + 83;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 == 0) {
            return AFInAppEventParameterName().force().AFKeystoreWrapper();
        }
        AFInAppEventParameterName().force().AFKeystoreWrapper();
        throw null;
    }

    public final void AFInAppEventType(AFa1qSDK aFa1qSDK, AFh1xSDK aFh1xSDK) {
        AFKeystoreWrapper(aFa1qSDK, aFh1xSDK);
        if (AFInAppEventParameterName().i().AFLogger == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.values;
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
                afLogForce = (AFPurchaseDetails + 73) % 128;
            }
            int i2 = AFPurchaseDetails + 49;
            afLogForce = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().valueOf());
        if (referrer == null) {
            int i4 = AFPurchaseDetails + 67;
            afLogForce = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            referrer = "";
        } else {
            afLogForce = (AFPurchaseDetails + 37) % 128;
        }
        aFa1qSDK.unregisterClient = referrer;
        valueOf(aFa1qSDK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1cSDK afInfoLog = this.force.afInfoLog();
        afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(new AFf1pSDK(this.force, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i2 = AFPurchaseDetails + 1;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            int i4 = 14 / 0;
        }
    }

    private static String AFKeystoreWrapper(String str) {
        int i2 = afLogForce + 33;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 == 0) {
            return AppsFlyerProperties.getInstance().getString(str);
        }
        AppsFlyerProperties.getInstance().getString(str);
        throw null;
    }

    public static String AFKeystoreWrapper(SimpleDateFormat simpleDateFormat, long j4) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j4));
        afLogForce = (AFPurchaseDetails + 117) % 128;
        return format;
    }

    private void AFKeystoreWrapper(Context context, String str) {
        AFh1mSDK aFh1mSDK = new AFh1mSDK();
        valueOf(context);
        aFh1mSDK.f5849e = null;
        aFh1mSDK.AFInAppEventParameterName = null;
        aFh1mSDK.unregisterClient = str;
        aFh1mSDK.valueOf = null;
        valueOf(aFh1mSDK);
        AFPurchaseDetails = (afLogForce + 39) % 128;
    }

    public static Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        int i2 = afLogForce + 121;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 == 0) {
            if (map.containsKey("meta")) {
                Map<String, Object> map2 = (Map) map.get("meta");
                afLogForce = (AFPurchaseDetails + 75) % 128;
                return map2;
            }
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            return hashMap;
        }
        map.containsKey("meta");
        throw null;
    }

    private String AFInAppEventType(Context context, String str) {
        if (context == null) {
            int i2 = afLogForce + 65;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        valueOf(context);
        String AFInAppEventType = AFInAppEventParameterName().AFInAppEventType().AFInAppEventType(str);
        int i4 = afLogForce + 37;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return AFInAppEventType;
    }

    public final void valueOf(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        afLogForce = (AFPurchaseDetails + 51) % 128;
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
            int i2 = AFPurchaseDetails + 11;
            afLogForce = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (JSONException e4) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e4);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    public final Map<String, Object> AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        String str;
        final Context context = AFInAppEventParameterName().w().AFKeystoreWrapper;
        AFd1qSDK AFInAppEventParameterName2 = AFInAppEventParameterName(context);
        AFg1mSDK e4 = AFInAppEventParameterName().e();
        boolean AFInAppEventType = aFa1qSDK.AFInAppEventType();
        Map<String, Object> map = aFa1qSDK.AFInAppEventType;
        long time = new Date().getTime();
        boolean z4 = false;
        Object[] objArr = new Object[1];
        a((byte) TextUtils.getCapsMode("", 0, 0), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-567153175) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-450712325) - TextUtils.indexOf("", "", 0, 0), MotionEvent.axisFromString("") - 113, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (!isStopped()) {
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (!AFInAppEventType) {
                    str = aFa1qSDK.f5849e;
                } else {
                    AFPurchaseDetails = (afLogForce + 89) % 128;
                    str = "Launch";
                }
                sb.append(str);
                AFLogger.afInfoLog(sb.toString());
            } else {
                AFLogger.afInfoLog("Reporting has been stopped");
            }
            registerClient(context);
            e4.AFInAppEventType(map, isPreInstalledApp(context), new Function0() { // from class: com.appsflyer.internal.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unregisterClient;
                    unregisterClient = AFb1vSDK.this.unregisterClient(context);
                    return unregisterClient;
                }
            });
            int AFInAppEventType2 = AFInAppEventType(AFInAppEventParameterName2, AFInAppEventType);
            if (aFa1qSDK.f5849e != null) {
                afLogForce = (AFPurchaseDetails + 59) % 128;
                z4 = true;
            }
            int values2 = values(AFInAppEventParameterName2, z4);
            if (AFInAppEventType && AFInAppEventType2 == 1) {
                AppsFlyerProperties.getInstance().AFInAppEventType = true;
            }
            e4.valueOf(map, AFInAppEventType2, values2);
            afLogForce = (AFPurchaseDetails + 73) % 128;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th, true);
        }
        afLogForce = (AFPurchaseDetails + 117) % 128;
        return map;
    }

    private static int AFInAppEventParameterName(AFd1qSDK aFd1qSDK) {
        afLogForce = (AFPurchaseDetails + 21) % 128;
        int AFInAppEventType = AFInAppEventType(aFd1qSDK, "appsFlyerAdImpressionCount", true);
        afLogForce = (AFPurchaseDetails + 77) % 128;
        return AFInAppEventType;
    }

    public static int AFInAppEventType(AFd1qSDK aFd1qSDK, boolean z4) {
        int i2 = AFPurchaseDetails + 125;
        afLogForce = i2 % 128;
        if (i2 % 2 != 0) {
            return AFInAppEventType(aFd1qSDK, "appsFlyerCount", z4);
        }
        AFInAppEventType(aFd1qSDK, "appsFlyerCount", z4);
        throw null;
    }

    private static int AFInAppEventType(AFd1qSDK aFd1qSDK, String str, boolean z4) {
        int valueOf2 = aFd1qSDK.valueOf(str, 0);
        if (!z4) {
            return valueOf2;
        }
        afLogForce = (AFPurchaseDetails + 15) % 128;
        int i2 = valueOf2 + 1;
        aFd1qSDK.AFInAppEventParameterName(str, i2);
        AFPurchaseDetails = (afLogForce + 73) % 128;
        return i2;
    }

    public final AFd1qSDK AFInAppEventParameterName(Context context) {
        afLogForce = (AFPurchaseDetails + 87) % 128;
        valueOf(context);
        AFd1qSDK valueOf2 = AFInAppEventParameterName().valueOf();
        AFPurchaseDetails = (afLogForce + 61) % 128;
        return valueOf2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventType(Context context, Intent intent) {
        Uri uri;
        AFPurchaseDetails = (afLogForce + 117) % 128;
        valueOf(context);
        AFc1vSDK afRDLog = AFInAppEventParameterName().afRDLog();
        AFd1qSDK valueOf2 = AFInAppEventParameterName().valueOf();
        boolean z4 = true;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            AFPurchaseDetails = (afLogForce + 15) % 128;
            uri = intent.getData();
        }
        if (uri != null) {
            AFPurchaseDetails = (afLogForce + 9) % 128;
            if (!uri.toString().isEmpty()) {
                afLogForce = (AFPurchaseDetails + 43) % 128;
                if (!valueOf2.AFInAppEventType("ddl_sent") && !z4) {
                    afRDLog.values("No direct deep link", (DeepLinkResult.Error) null);
                    return;
                } else {
                    afRDLog.AFInAppEventParameterName(AFc1oSDK.AFKeystoreWrapper(afRDLog.f5863e.getPurchaseToken()), intent, context);
                }
            }
        }
        z4 = false;
        if (!valueOf2.AFInAppEventType("ddl_sent")) {
        }
        afRDLog.AFInAppEventParameterName(AFc1oSDK.AFKeystoreWrapper(afRDLog.f5863e.getPurchaseToken()), intent, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void valueOf(AFd1kSDK aFd1kSDK) {
        int i2 = afLogForce + 9;
        AFPurchaseDetails = i2 % 128;
        int i4 = i2 % 2;
        aFd1kSDK.afErrorLog().valueOf();
        if (i4 != 0) {
            int i5 = 18 / 0;
        }
    }

    public static String valueOf() {
        AFPurchaseDetails = (afLogForce + 117) % 128;
        String AFKeystoreWrapper2 = AFKeystoreWrapper(AppsFlyerProperties.APP_USER_ID);
        AFPurchaseDetails = (afLogForce + 73) % 128;
        return AFKeystoreWrapper2;
    }

    private void valueOf(Context context, Map<String, Object> map, AFa1qSDK aFa1qSDK) {
        int i2 = afLogForce + 33;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            valueOf(context);
            aFa1qSDK.valueOf((Map<String, ?>) map);
            AFInAppEventType(aFa1qSDK, e(context));
            int i4 = 72 / 0;
            return;
        }
        valueOf(context);
        aFa1qSDK.valueOf((Map<String, ?>) map);
        AFInAppEventType(aFa1qSDK, e(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void valueOf(AFa1qSDK aFa1qSDK) {
        boolean z4;
        int i2 = (AFPurchaseDetails + 109) % 128;
        afLogForce = i2;
        byte b4 = 0;
        if (aFa1qSDK.f5849e == null) {
            int i4 = i2 + 9;
            AFPurchaseDetails = i4 % 128;
            if (i4 % 2 == 0) {
                z4 = true;
                if (!values()) {
                    AFPurchaseDetails = (afLogForce + 67) % 128;
                    AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                    return;
                }
                if (z4) {
                    if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                        afLogForce = (AFPurchaseDetails + 49) % 128;
                        if (d()) {
                            int i5 = AFPurchaseDetails + 35;
                            afLogForce = i5 % 128;
                            if (i5 % 2 != 0) {
                                AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.values;
                                if (appsFlyerRequestListener != null) {
                                    appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                                    return;
                                }
                                return;
                            }
                            throw null;
                        }
                    } else {
                        AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                    }
                    this.f5859e = System.currentTimeMillis();
                }
                AFj1rSDK.values(AFInAppEventParameterName().AFKeystoreWrapper(), new AFa1vSDK(this, aFa1qSDK, b4), 0L, TimeUnit.MILLISECONDS);
                int i6 = AFPurchaseDetails + 69;
                afLogForce = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        z4 = false;
        if (!values()) {
        }
    }

    public final void AFKeystoreWrapper(Context context, AFc1oSDK aFc1oSDK, Uri uri, Uri uri2) {
        valueOf(context);
        if (!aFc1oSDK.AFKeystoreWrapper("af_deeplink")) {
            String values2 = values(uri.toString());
            AFc1vSDK afRDLog = AFInAppEventParameterName().afRDLog();
            String str = afRDLog.AFInAppEventParameterName;
            if (str != null && afRDLog.values != null && values2.contains(str)) {
                afLogForce = (AFPurchaseDetails + 45) % 128;
                Uri.Builder buildUpon = Uri.parse(values2).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : afRDLog.values.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                values2 = buildUpon.build().toString();
                String encodedQuery = buildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFc1oSDK.AFInAppEventParameterName.put("appended_query_params", encodedQuery);
                AFc1kSDK aFc1kSDK = aFc1oSDK.values;
                if (aFc1kSDK != null) {
                    aFc1kSDK.values(aFc1oSDK.AFInAppEventParameterName);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFc1oSDK.AFInAppEventParameterName.put("af_deeplink", values2);
            AFc1kSDK aFc1kSDK2 = aFc1oSDK.values;
            if (aFc1kSDK2 != null) {
                aFc1kSDK2.values(aFc1oSDK.AFInAppEventParameterName);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            int i2 = afLogForce + 27;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 != 0) {
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
            aFc1oSDK.AFInAppEventParameterName.put("isBrandedDomain", bool);
            AFc1kSDK aFc1kSDK3 = aFc1oSDK.values;
            if (aFc1kSDK3 != null) {
                afLogForce = (AFPurchaseDetails + 61) % 128;
                aFc1kSDK3.values(aFc1oSDK.AFInAppEventParameterName);
            }
        }
        if (aFf1hSDK.v()) {
            aFf1hSDK.unregisterClient = AFKeystoreWrapper(hashMap);
            AFe1cSDK afInfoLog = AFInAppEventParameterName().afInfoLog();
            afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(aFf1hSDK));
            return;
        }
        AFInAppEventParameterName().afRDLog().AFKeystoreWrapper(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String valueOf(Activity activity) {
        Intent intent;
        Bundle extras;
        afLogForce = (AFPurchaseDetails + 103) % 128;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            int i2 = AFPurchaseDetails + 101;
            afLogForce = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    extras = intent.getExtras();
                    int i4 = 83 / 0;
                    if (extras != null) {
                    }
                } else {
                    extras = intent.getExtras();
                }
                str = extras.getString("af");
                if (str != null) {
                    AFLogger.INSTANCE.w(AFg1aSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(str));
                    extras.remove("af");
                    activity.setIntent(intent.putExtras(extras));
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1aSDK.ENGAGEMENT, th.getMessage(), th);
            }
        }
        AFPurchaseDetails = (afLogForce + 101) % 128;
        return str;
    }

    private void values(Map<String, Object> map) {
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) && !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            afLogForce = (AFPurchaseDetails + 115) % 128;
            if (map.get("advertiserId") != null) {
                afLogForce = (AFPurchaseDetails + 79) % 128;
                try {
                    if (AFc1tSDK.values(AFInAppEventParameterName().getLevel().AFInAppEventType)) {
                        afLogForce = (AFPurchaseDetails + 77) % 128;
                        if (map.remove("android_id") != null) {
                            int i2 = afLogForce + 37;
                            AFPurchaseDetails = i2 % 128;
                            if (i2 % 2 != 0) {
                                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                                throw null;
                            }
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        }
                    }
                    if (AFc1tSDK.values(AFInAppEventParameterName().i().unregisterClient) && map.remove("imei") != null) {
                        afLogForce = (AFPurchaseDetails + 107) % 128;
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e4);
                }
            }
        }
        afLogForce = (AFPurchaseDetails + 119) % 128;
    }

    private static int valueOf(AFd1qSDK aFd1qSDK) {
        int i2 = AFPurchaseDetails + 45;
        afLogForce = i2 % 128;
        int AFInAppEventType = AFInAppEventType(aFd1qSDK, "appsFlyerAdRevenueCount", i2 % 2 != 0);
        int i4 = afLogForce + 9;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 == 0) {
            return AFInAppEventType;
        }
        throw null;
    }

    private static String valueOf(String str) {
        int indexOf;
        int i2 = afLogForce + 79;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 == 0 ? (indexOf = str.indexOf(63)) == -1 : (indexOf = str.indexOf(12)) == -1) {
            int i4 = AFPurchaseDetails + 19;
            afLogForce = i4 % 128;
            if (i4 % 2 != 0) {
                return "";
            }
            throw null;
        }
        String substring = str.substring(indexOf);
        afLogForce = (AFPurchaseDetails + 67) % 128;
        return substring;
    }

    private AFf1hSDK.AFa1uSDK AFKeystoreWrapper(final Map<String, String> map) {
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
        afLogForce = (AFPurchaseDetails + 25) % 128;
        return aFa1uSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        r4.AFInAppEventParameterName("CACHED_CHANNEL", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r4 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails + 33;
        com.appsflyer.internal.AFb1vSDK.afLogForce = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String AFKeystoreWrapper(AFd1qSDK aFd1qSDK, String str) {
        String AFKeystoreWrapper2;
        int i2 = afLogForce + 85;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            AFKeystoreWrapper2 = aFd1qSDK.AFKeystoreWrapper("CACHED_CHANNEL", (String) null);
            int i4 = 69 / 0;
        } else {
            AFKeystoreWrapper2 = aFd1qSDK.AFKeystoreWrapper("CACHED_CHANNEL", (String) null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r1.length() == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r1.contains("&") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r3 = new java.util.ArrayList(java.util.Arrays.asList(r1.split("&")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        r5 = new java.lang.StringBuilder();
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if ((!r3.hasNext()) == true) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        r6 = (java.lang.String) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r6.contains("access_token") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = (com.appsflyer.internal.AFb1vSDK.afLogForce + 87) % 128;
        r3.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r5.length() == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r5.append("&");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        r5.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r6.startsWith("?") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        r5.append("?");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        return r9.replace(r1, r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
    
        r3.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0048, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0046, code lost:
    
        if (r1.length() == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String values(String str) {
        String valueOf2;
        int i2 = AFPurchaseDetails + 17;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str == null) {
            return null;
        }
        if (!str.matches("fb\\d*?://authorize.*") || !str.contains("access_token")) {
            return str;
        }
        int i4 = afLogForce + 29;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 != 0) {
            valueOf2 = valueOf(str);
            int i5 = 69 / 0;
        } else {
            valueOf2 = valueOf(str);
        }
    }

    public static synchronized SharedPreferences AFKeystoreWrapper(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (AFb1vSDK.class) {
            try {
                if (AFKeystoreWrapper().afInfoLog == null) {
                    afLogForce = (AFPurchaseDetails + 35) % 128;
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
                int i2 = afLogForce + 103;
                AFPurchaseDetails = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }

    private static void AFKeystoreWrapper(AFa1qSDK aFa1qSDK, AFh1xSDK aFh1xSDK) {
        if (aFh1xSDK != null) {
            int i2 = afLogForce;
            AFPurchaseDetails = (i2 + 103) % 128;
            aFa1qSDK.valueOf = aFh1xSDK.AFInAppEventType;
            aFa1qSDK.f5848d = aFh1xSDK.AFInAppEventParameterName;
            AFPurchaseDetails = (i2 + 5) % 128;
        }
        int i4 = afLogForce + 13;
        AFPurchaseDetails = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0026, code lost:
    
        if (r0 == 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean values(Context context) {
        Context context2;
        int i2 = AFPurchaseDetails + 93;
        afLogForce = i2 % 128;
        try {
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
            context2 = context;
        }
        if (i2 % 2 == 0) {
            int b4 = E1.e.f2288d.b(context, E1.f.f2289a);
            int i4 = 19 / 0;
            context2 = context;
            if (b4 == 0) {
            }
            try {
                context2.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                int i5 = afLogForce + 29;
                AFPurchaseDetails = i5 % 128;
                if (i5 % 2 == 0) {
                    return true;
                }
                throw null;
            } catch (PackageManager.NameNotFoundException e4) {
                AFLogger.INSTANCE.e(AFg1aSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e4);
                return false;
            }
        }
        int b5 = E1.e.f2288d.b(context, E1.f.f2289a);
        context2 = context;
        int i6 = AFPurchaseDetails + 51;
        afLogForce = i6 % 128;
        context = i6 % 2;
        return context != 0;
    }

    private static int values(AFd1qSDK aFd1qSDK, boolean z4) {
        AFPurchaseDetails = (afLogForce + 47) % 128;
        int AFInAppEventType = AFInAppEventType(aFd1qSDK, "appsFlyerInAppEventCount", z4);
        AFPurchaseDetails = (afLogForce + 9) % 128;
        return AFInAppEventType;
    }

    private void values(Context context, AFh1tSDK aFh1tSDK) {
        AFPurchaseDetails = (afLogForce + 47) % 128;
        valueOf(context);
        AFh1wSDK AFLogger2 = AFInAppEventParameterName().AFLogger();
        AFg1cSDK AFInAppEventParameterName2 = AFa1oSDK.AFInAppEventParameterName(context);
        if (AFLogger2.values()) {
            int i2 = AFPurchaseDetails + 27;
            afLogForce = i2 % 128;
            if (i2 % 2 != 0) {
                AFLogger2.AFKeystoreWrapper.put("api_name", aFh1tSDK.toString());
                AFLogger2.AFInAppEventParameterName(AFInAppEventParameterName2);
            } else {
                AFLogger2.AFKeystoreWrapper.put("api_name", aFh1tSDK.toString());
                AFLogger2.AFInAppEventParameterName(AFInAppEventParameterName2);
                throw null;
            }
        }
        AFLogger2.AFInAppEventType();
    }
}
