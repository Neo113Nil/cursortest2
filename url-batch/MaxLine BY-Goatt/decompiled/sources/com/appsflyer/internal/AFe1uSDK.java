package com.appsflyer.internal;

import android.content.Context;
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
import com.facebook.internal.ServerProtocol;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.up2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
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

    public AFe1uSDK(Context context, AFf1mSDK aFf1mSDK, AFb1jSDK aFb1jSDK, AFf1fSDK aFf1fSDK, AFa1gSDK aFa1gSDK, AFe1lSDK aFe1lSDK, AFb1fSDK aFb1fSDK, AFb1cSDK aFb1cSDK, AFa1iSDK aFa1iSDK, AFe1xSDK aFe1xSDK, AFb1xSDK aFb1xSDK) {
        context.getClass();
        aFf1mSDK.getClass();
        aFb1jSDK.getClass();
        aFf1fSDK.getClass();
        aFa1gSDK.getClass();
        aFe1lSDK.getClass();
        aFb1fSDK.getClass();
        aFb1cSDK.getClass();
        aFa1iSDK.getClass();
        aFe1xSDK.getClass();
        aFb1xSDK.getClass();
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

    private boolean afRDLog() {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFa1dSDK.valueOf();
        return !AFa1dSDK.AFKeystoreWrapper(this.AFInAppEventParameterName);
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void AFInAppEventParameterName(boolean z, Map<String, Object> map, int i) {
        map.getClass();
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

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (r8 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    @Override // com.appsflyer.internal.AFe1tSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFInAppEventType(Map<String, Object> map, String str) {
        AFc1uSDK.AFa1wSDK AFKeystoreWrapper;
        map.getClass();
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (appsFlyerProperties.getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            return;
        }
        String AFInAppEventType = this.afErrorLog.AFInAppEventType(this.afInfoLog);
        if (AFInAppEventType != null && AFInAppEventType.length() != 0) {
            map.put("imei", AFInAppEventType);
        }
        boolean z = appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false);
        String valueOf = this.afInfoLog.valueOf("androidIdCached", (String) null);
        if (z && (str == null || str.length() == 0)) {
            if (afRDLog()) {
                try {
                    str = Settings.Secure.getString(this.AFInAppEventParameterName.getContentResolver(), "android_id");
                } catch (Exception e) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached AndroidId: ".concat(valueOf));
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
                    AFLogger.afDebugLog("use cached AndroidId: ".concat(valueOf));
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
                        bool.getClass();
                        linkedHashMap.put("isManual", bool);
                        String str2 = AFKeystoreWrapper.AFInAppEventParameterName;
                        str2.getClass();
                        linkedHashMap.put("val", str2);
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

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void AFKeystoreWrapper(Map<String, Object> map, String str) {
        map.getClass();
        str.getClass();
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
    public final boolean AFLogger() {
        return Boolean.parseBoolean(this.afInfoLog.valueOf("sentSuccessfully", (String) null));
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
                if (!AFKeystoreWrapper(AFInAppEventType)) {
                    String packageName = this.AFInAppEventParameterName.getPackageName();
                    packageName.getClass();
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

    @Override // com.appsflyer.internal.AFe1tSDK
    public final boolean afErrorLog() {
        return !this.afInfoLog.valueOf("appsFlyerCount");
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
            allNetworks.getClass();
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
    public final void valueOf(Map<String, Object> map) {
        map.getClass();
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false);
        AFa1iSDK.AFa1vSDK valueOf = this.afRDLog.valueOf(this.AFInAppEventParameterName);
        String str = valueOf.AFKeystoreWrapper;
        str.getClass();
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
    public final String values() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        StringBuilder sb = new StringBuilder();
        sb.append((long) (availableBlocksLong / pow));
        sb.append('/');
        sb.append((long) (blockCountLong / pow));
        return sb.toString();
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final String valueOf() {
        return AFa1cSDK.AFInAppEventType(this.AFInAppEventParameterName.getApplicationContext().getPackageManager(), this.AFInAppEventParameterName.getApplicationContext().getPackageName());
    }

    public AFe1uSDK() {
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void values(Map<String, Object> map, boolean z) {
        map.getClass();
        String values = this.getLevel.values();
        values.getClass();
        map.put("platformextension", values);
        if (z) {
            map.put("platform_extension_v2", this.valueOf.AFInAppEventParameterName());
        }
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void values(Map<String, ? extends Object> map) {
        map.getClass();
        AFe1lSDK aFe1lSDK = this.AFLogger;
        HashMap hashMap = new HashMap(aFe1lSDK.AFInAppEventParameterName);
        aFe1lSDK.AFInAppEventParameterName.clear();
        this.AFLogger.AFKeystoreWrapper.AFInAppEventType("gcd");
        if (hashMap.isEmpty()) {
            return;
        }
        Map<String, Object> AFInAppEventParameterName = AFa1dSDK.AFInAppEventParameterName(map);
        AFInAppEventParameterName.getClass();
        AFInAppEventParameterName.put("gcd", hashMap);
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void AFKeystoreWrapper(Map<String, Object> map) {
        String str;
        map.getClass();
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
        } else if (rotation != 3) {
            str = BuildConfig.FLAVOR;
        } else {
            str = "lr";
        }
        map.put("sc_o", str);
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final long AFKeystoreWrapper() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    private static boolean AFKeystoreWrapper(File file) {
        return file == null || !file.exists();
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
    public final String AFInAppEventParameterName(SimpleDateFormat simpleDateFormat) {
        String str;
        simpleDateFormat.getClass();
        String valueOf = this.afInfoLog.valueOf("appsFlyerFirstInstall", (String) null);
        if (valueOf == null) {
            if (afErrorLog()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            } else {
                str = BuildConfig.FLAVOR;
            }
            valueOf = str;
            this.afInfoLog.values("appsFlyerFirstInstall", valueOf);
        }
        AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(valueOf)));
        return valueOf;
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

    @Override // com.appsflyer.internal.AFe1tSDK
    public final String AFInAppEventType() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        return string == null ? this.afDebugLog.valueOf("AF_STORE") : string;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final void AFInAppEventType(Map<String, Object> map) {
        map.getClass();
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
    }

    private static File AFInAppEventType(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (up2.K(str).toString().length() > 0) {
                return new File(up2.K(str).toString());
            }
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r2 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFInAppEventType(File file, String str) {
        InputStreamReader inputStreamReader;
        try {
            if (file == null) {
                return null;
            }
            try {
                Properties properties = new Properties();
                inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                try {
                    properties.load(inputStreamReader);
                    AFLogger.afInfoLog("Found PreInstall property!");
                    String property = properties.getProperty(str);
                    try {
                        inputStreamReader.close();
                        return property;
                    } catch (Throwable th) {
                        AFLogger.afErrorLog(th.getMessage(), th);
                        return property;
                    }
                } catch (FileNotFoundException unused) {
                    StringBuilder sb = new StringBuilder("PreInstall file wasn't found: ");
                    sb.append(file.getAbsolutePath());
                    AFLogger.afDebugLog(sb.toString());
                } catch (Throwable th2) {
                    th = th2;
                    AFLogger.afErrorLog(th.getMessage(), th);
                }
            } catch (FileNotFoundException unused2) {
                inputStreamReader = null;
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
            return null;
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    AFLogger.afErrorLog(th4.getMessage(), th4);
                }
            }
        }
    }
}
