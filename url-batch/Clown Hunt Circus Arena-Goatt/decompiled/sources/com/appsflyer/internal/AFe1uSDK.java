package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.WindowManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1iSDK;
import com.appsflyer.internal.AFb1jSDK;
import com.appsflyer.internal.AFc1uSDK;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFe1uSDK implements AFe1tSDK {
    private final Context AFInAppEventParameterName;
    private final AFb1jSDK AFInAppEventType;
    private final AFf1fSDK AFKeystoreWrapper;
    private final AFe1lSDK AFLogger;
    private final AFb1cSDK afDebugLog;
    private final AFe1xSDK afErrorLog;
    private final AFb1fSDK afInfoLog;
    private final AFa1iSDK afRDLog;
    private final AFb1xSDK getLevel;
    private final AFf1mSDK valueOf;
    private final AFa1gSDK values;

    public AFe1uSDK() {
    }

    public AFe1uSDK(Context context, AFf1mSDK aFf1mSDK, AFb1jSDK aFb1jSDK, AFf1fSDK aFf1fSDK, AFa1gSDK aFa1gSDK, AFe1lSDK aFe1lSDK, AFb1fSDK aFb1fSDK, AFb1cSDK aFb1cSDK, AFa1iSDK aFa1iSDK, AFe1xSDK aFe1xSDK, AFb1xSDK aFb1xSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFf1mSDK, "");
        Intrinsics.checkNotNullParameter(aFb1jSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(aFa1gSDK, "");
        Intrinsics.checkNotNullParameter(aFe1lSDK, "");
        Intrinsics.checkNotNullParameter(aFb1fSDK, "");
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        Intrinsics.checkNotNullParameter(aFa1iSDK, "");
        Intrinsics.checkNotNullParameter(aFe1xSDK, "");
        Intrinsics.checkNotNullParameter(aFb1xSDK, "");
        this.AFInAppEventParameterName = context;
        this.valueOf = aFf1mSDK;
        this.AFInAppEventType = aFb1jSDK;
        this.AFKeystoreWrapper = aFf1fSDK;
        this.values = aFa1gSDK;
        this.AFLogger = aFe1lSDK;
        this.afInfoLog = aFb1fSDK;
        this.afDebugLog = aFb1cSDK;
        this.afRDLog = aFa1iSDK;
        this.afErrorLog = aFe1xSDK;
        this.getLevel = aFb1xSDK;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final String valueOf() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        return AFa1cSDK.AFInAppEventType(this.AFInAppEventParameterName.getApplicationContext().getPackageManager(), this.AFInAppEventParameterName.getApplicationContext().getPackageName());
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final long AFKeystoreWrapper() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final String values() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        return new StringBuilder().append((long) (availableBlocksLong / pow)).append('/').append((long) (blockCountLong / pow)).toString();
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void values(Map<String, Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "");
        String values = this.getLevel.values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        map.put("platformextension", values);
        if (z) {
            map.put("platform_extension_v2", this.valueOf.AFInAppEventParameterName());
        }
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void AFKeystoreWrapper(Map<String, Object> map) {
        String str = "";
        Intrinsics.checkNotNullParameter(map, "");
        Object systemService = this.AFInAppEventParameterName.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null) {
            return;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 0) {
            str = "p";
        } else if (rotation == 1) {
            str = "l";
        } else if (rotation == 2) {
            str = "pr";
        } else if (rotation == 3) {
            str = "lr";
        }
        map.put("sc_o", str);
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void AFInAppEventParameterName(boolean z, Map<String, Object> map, int i) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", AFInAppEventParameterName("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", AFInAppEventParameterName("ro.product.cpu.abi2"));
        hashMap.put("arch", AFInAppEventParameterName("os.arch"));
        hashMap.put("build_display_id", AFInAppEventParameterName("ro.build.display.id"));
        if (z) {
            AFb1jSDK.AFa1xSDK AFInAppEventParameterName = this.AFInAppEventType.AFInAppEventParameterName(this.AFInAppEventParameterName);
            float f = AFInAppEventParameterName.AFKeystoreWrapper;
            String str = AFInAppEventParameterName.AFInAppEventType;
            hashMap.put("btl", String.valueOf(f));
            if (str != null) {
                hashMap.put("btch", str);
            }
            if (i <= 2) {
                hashMap.putAll(this.AFKeystoreWrapper.AFKeystoreWrapper());
            }
        }
        hashMap.put("dim", this.values.AFInAppEventType(this.AFInAppEventParameterName));
        map.put("deviceData", hashMap);
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void AFInAppEventType(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void values(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFe1lSDK aFe1lSDK = this.AFLogger;
        HashMap hashMap = new HashMap(aFe1lSDK.AFInAppEventParameterName);
        aFe1lSDK.AFInAppEventParameterName.clear();
        this.AFLogger.AFKeystoreWrapper.AFInAppEventType("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (hashMap.isEmpty()) {
            return;
        }
        Map<String, Object> AFInAppEventParameterName = AFa1dSDK.AFInAppEventParameterName(map);
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        AFInAppEventParameterName.put("gcd", hashMap);
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void AFKeystoreWrapper(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String valueOf = this.afInfoLog.valueOf("prev_event_name", (String) null);
            if (valueOf != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.afInfoLog.values("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", valueOf);
                map.put("prev_event", jSONObject);
            }
            this.afInfoLog.values("prev_event_name", str);
            this.afInfoLog.AFInAppEventType("prev_event_timestamp", System.currentTimeMillis());
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
        }
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final String AFInAppEventParameterName() {
        String str = null;
        if (this.afInfoLog.valueOf("INSTALL_STORE")) {
            return this.afInfoLog.valueOf("INSTALL_STORE", (String) null);
        }
        if (afErrorLog()) {
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string == null) {
                string = this.afDebugLog.valueOf("AF_STORE");
            }
            str = string;
        }
        this.afInfoLog.values("INSTALL_STORE", str);
        return str;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final String AFInAppEventType() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        return string == null ? this.afDebugLog.valueOf("AF_STORE") : string;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final String AFInAppEventParameterName(SimpleDateFormat simpleDateFormat) {
        String str = "";
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String valueOf = this.afInfoLog.valueOf("appsFlyerFirstInstall", (String) null);
        if (valueOf == null) {
            if (afErrorLog()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            }
            this.afInfoLog.values("appsFlyerFirstInstall", str);
            valueOf = str;
        }
        AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(valueOf)));
        return valueOf;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final boolean afErrorLog() {
        return !this.afInfoLog.valueOf("appsFlyerCount");
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final boolean AFLogger() {
        return Boolean.parseBoolean(this.afInfoLog.valueOf("sentSuccessfully", (String) null));
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void valueOf(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false);
        AFa1iSDK.AFa1vSDK valueOf = this.afRDLog.valueOf(this.AFInAppEventParameterName);
        String str = valueOf.AFKeystoreWrapper;
        Intrinsics.checkNotNullExpressionValue(str, "");
        map.put("network", str);
        if (z) {
            return;
        }
        String str2 = valueOf.values;
        if (str2 != null) {
            map.put("operator", str2);
        }
        String str3 = valueOf.AFInAppEventType;
        if (str3 != null) {
            map.put("carrier", str3);
        }
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final boolean afInfoLog() {
        try {
            Object systemService = this.AFInAppEventParameterName.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            Intrinsics.checkNotNullExpressionValue(allNetworks, "");
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            AFLogger.afErrorLog("Failed collecting ivc data", e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final String afDebugLog() {
        String str;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("preInstallName");
        if (string != null) {
            return string;
        }
        String str2 = null;
        if (this.afInfoLog.valueOf("preInstallName")) {
            str = this.afInfoLog.valueOf("preInstallName", (String) null);
        } else {
            if (afErrorLog()) {
                File AFInAppEventType = AFInAppEventType(AFInAppEventParameterName("ro.appsflyer.preinstall.path"));
                if (AFKeystoreWrapper(AFInAppEventType)) {
                    AFInAppEventType = AFInAppEventType(this.afDebugLog.valueOf("AF_PRE_INSTALL_PATH"));
                }
                if (AFKeystoreWrapper(AFInAppEventType)) {
                    AFInAppEventType = AFInAppEventType("/data/local/tmp/pre_install.appsflyer");
                }
                if (AFKeystoreWrapper(AFInAppEventType)) {
                    AFInAppEventType = AFInAppEventType("/etc/pre_install.appsflyer");
                }
                if (AFKeystoreWrapper(AFInAppEventType)) {
                } else {
                    String packageName = this.AFInAppEventParameterName.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "");
                    str2 = AFInAppEventType(AFInAppEventType, packageName);
                }
                string = str2 == null ? this.afDebugLog.valueOf("AF_PRE_INSTALL_NAME") : str2;
            }
            if (string != null) {
                this.afInfoLog.values("preInstallName", string);
            }
            str = string;
        }
        if (str != null) {
            appsFlyerProperties.set("preInstallName", str);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        if (r9 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    @Override // com.appsflyer.internal.AFe1tSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFInAppEventType(Map<String, Object> map, String str) {
        AFc1uSDK.AFa1wSDK AFKeystoreWrapper;
        String str2;
        Intrinsics.checkNotNullParameter(map, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (appsFlyerProperties.getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            return;
        }
        Object AFInAppEventType = this.afErrorLog.AFInAppEventType(this.afInfoLog);
        String str3 = (CharSequence) AFInAppEventType;
        if (str3 != null && str3.length() != 0) {
            map.put("imei", AFInAppEventType);
        }
        boolean z = appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false);
        String valueOf = this.afInfoLog.valueOf("androidIdCached", (String) null);
        if (z && ((str2 = str) == null || str2.length() == 0)) {
            if (afRDLog()) {
                try {
                    str = Settings.Secure.getString(this.AFInAppEventParameterName.getContentResolver(), "android_id");
                } catch (Exception e) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(valueOf)));
                    } else {
                        valueOf = null;
                    }
                    AFLogger.afErrorLog(e.getMessage(), e);
                }
                if (str != null) {
                    if (str != null) {
                    }
                    AFKeystoreWrapper = AFa1bSDK.AFKeystoreWrapper(this.AFInAppEventParameterName);
                    if (AFKeystoreWrapper != null) {
                    }
                } else if (valueOf != null) {
                    AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(valueOf)));
                    str = valueOf;
                    if (str != null) {
                        this.afInfoLog.values("androidIdCached", str);
                        map.put("android_id", str);
                    } else {
                        AFLogger.afInfoLog("Android ID was not collected.");
                    }
                    AFKeystoreWrapper = AFa1bSDK.AFKeystoreWrapper(this.AFInAppEventParameterName);
                    if (AFKeystoreWrapper != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Boolean bool = AFKeystoreWrapper.values;
                        Intrinsics.checkNotNullExpressionValue(bool, "");
                        linkedHashMap.put("isManual", bool);
                        String str4 = AFKeystoreWrapper.AFInAppEventParameterName;
                        Intrinsics.checkNotNullExpressionValue(str4, "");
                        linkedHashMap.put("val", str4);
                        Boolean bool2 = AFKeystoreWrapper.AFInAppEventType;
                        if (bool2 != null) {
                            linkedHashMap.put("isLat", bool2);
                        }
                        map.put("oaid", linkedHashMap);
                        return;
                    }
                    return;
                }
            }
            str = null;
            if (str != null) {
            }
            AFKeystoreWrapper = AFa1bSDK.AFKeystoreWrapper(this.AFInAppEventParameterName);
            if (AFKeystoreWrapper != null) {
            }
        }
    }

    private static String AFInAppEventParameterName(String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (invoke != null) {
                return (String) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private static File AFInAppEventType(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (StringsKt.trim((CharSequence) str).toString().length() > 0) {
                return new File(StringsKt.trim((CharSequence) str).toString());
            }
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private static boolean AFKeystoreWrapper(File file) {
        return file == null || !file.exists();
    }

    private static String AFInAppEventType(File file, String str) {
        InputStreamReader inputStreamReader;
        Properties properties;
        try {
            try {
                if (file == null) {
                    return null;
                }
                try {
                    properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                } catch (FileNotFoundException unused) {
                    inputStreamReader = null;
                } catch (Throwable th) {
                    th = th;
                    inputStreamReader = null;
                }
                try {
                    properties.load(inputStreamReader);
                    AFLogger.afInfoLog("Found PreInstall property!");
                    String property = properties.getProperty(str);
                    try {
                        inputStreamReader.close();
                        return property;
                    } catch (Throwable th2) {
                        AFLogger.afErrorLog(th2.getMessage(), th2);
                        return property;
                    }
                } catch (FileNotFoundException unused2) {
                    AFLogger.afDebugLog(new StringBuilder("PreInstall file wasn't found: ").append(file.getAbsolutePath()).toString());
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    AFLogger.afErrorLog(th.getMessage(), th);
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    return null;
                }
            } catch (Throwable th4) {
                AFLogger.afErrorLog(th4.getMessage(), th4);
            }
        } catch (Throwable th5) {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th6) {
                    AFLogger.afErrorLog(th6.getMessage(), th6);
                }
            }
            throw th5;
        }
    }

    private boolean afRDLog() {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFa1dSDK.valueOf();
        return !AFa1dSDK.AFKeystoreWrapper(this.AFInAppEventParameterName);
    }
}
