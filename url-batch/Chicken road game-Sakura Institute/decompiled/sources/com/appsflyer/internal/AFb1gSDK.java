package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFb1gSDK implements AFb1bSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int AFInAppEventParameterName;
    private static int AFLogger = 0;
    private static char[] d = null;
    private static int force = 1;
    private final AFd1kSDK unregisterClient;
    private List<String> valueOf = new ArrayList();
    private boolean AFInAppEventType = true;
    private final Map<String, Object> values = new HashMap();
    private boolean e = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int AFKeystoreWrapper = 0;
    private boolean registerClient = false;

    static void AFLogger() {
        d = new char[]{54246, 54193, 54207, 54197, 54204};
    }

    static {
        AFLogger();
        AFInAppEventParameterName = 98166;
        int i = force + 31;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            int i2 = 22 / 0;
        }
    }

    public AFb1gSDK(AFd1kSDK aFd1kSDK) {
        this.unregisterClient = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean values() {
        int i;
        int i2 = 2 % 2;
        boolean AFInAppEventParameterName2 = AFInAppEventParameterName(AFInAppEventType(this.unregisterClient.registerClient().valueOf.valueOf), AFInAppEventType(this.unregisterClient.registerClient().valueOf.values));
        if (AFInAppEventParameterName2) {
            int i3 = AFLogger + 103;
            force = i3 % 128;
            int i4 = i3 % 2;
            registerClient();
            i = force + 95;
        } else {
            AFKeystoreWrapper();
            AFInAppEventType();
            i = force + 91;
        }
        AFLogger = i % 128;
        int i5 = i % 2;
        return AFInAppEventParameterName2;
    }

    private synchronized void registerClient() {
        int i = 2 % 2;
        int i2 = AFLogger + 77;
        int i3 = i2 % 128;
        force = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.registerClient) {
            int i4 = i3 + 59;
            AFLogger = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.registerClient = true;
        try {
            AFInAppEventParameterName("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            return;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1aSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
            return;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void AFInAppEventType() {
        int i = 2 % 2;
        int i2 = force + 49;
        int i3 = i2 % 128;
        AFLogger = i3;
        int i4 = i2 % 2;
        if (!this.registerClient) {
            int i5 = i3 + 83;
            force = i5 % 128;
            int i6 = i5 % 2;
            if (!this.AFInAppEventType) {
                return;
            }
        }
        this.registerClient = false;
        this.AFInAppEventType = false;
        try {
            AFInAppEventParameterName("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1aSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void valueOf() {
        int i = 2 % 2;
        int i2 = force + 87;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            this.values.clear();
            this.valueOf.clear();
        } else {
            this.values.clear();
            this.valueOf.clear();
        }
        this.AFKeystoreWrapper = 0;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void values(String str, PackageManager packageManager) {
        int i = 2 % 2;
        int i2 = force + 33;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        try {
            final AFe1wSDK AFKeystoreWrapper = this.unregisterClient.AFInAppEventParameterName().AFKeystoreWrapper(AFInAppEventParameterName(str, packageManager), this.unregisterClient.i().AFLogger);
            if (AFKeystoreWrapper == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                return;
            }
            ExecutorService values = this.unregisterClient.values();
            Objects.requireNonNull(AFKeystoreWrapper);
            values.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1gSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFe1wSDK.this.AFKeystoreWrapper();
                }
            });
            int i4 = force + 33;
            AFLogger = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventParameterName(String str, String... strArr) {
        int i = 2 % 2;
        int i2 = AFLogger + 67;
        force = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName("public_api_call", str, strArr);
        int i4 = AFLogger + 89;
        force = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void values(Throwable th) {
        String message;
        StackTraceElement[] stackTrace;
        int i = 2 % 2;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            int i2 = force + 57;
            AFLogger = i2 % 128;
            int i3 = i2 % 2;
            message = th.getMessage();
        } else {
            message = cause.getMessage();
        }
        if (cause == null) {
            int i4 = force + 53;
            AFLogger = i4 % 128;
            if (i4 % 2 != 0) {
                stackTrace = th.getStackTrace();
                int i5 = 26 / 0;
            } else {
                stackTrace = th.getStackTrace();
            }
        } else {
            stackTrace = cause.getStackTrace();
            int i6 = force + 85;
            AFLogger = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 5;
            }
        }
        AFInAppEventParameterName("exception", simpleName, AFInAppEventParameterName(message, stackTrace));
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void valueOf(String str, String str2) {
        int i = 2 % 2;
        int i2 = AFLogger + 97;
        force = i2 % 128;
        if (i2 % 2 == 0) {
            String[] strArr = new String[1];
            strArr[1] = str2;
            AFInAppEventParameterName("server_request", str, strArr);
        } else {
            AFInAppEventParameterName("server_request", str, str2);
        }
        int i3 = force + 65;
        AFLogger = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFKeystoreWrapper(String str, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = AFLogger + 77;
        force = i3 % 128;
        int i4 = i3 % 2;
        AFInAppEventParameterName("server_response", str, String.valueOf(i), str2);
        int i5 = AFLogger + 43;
        force = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFKeystoreWrapper(String str, String str2) {
        int i = 2 % 2;
        int i2 = AFLogger + 41;
        force = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName(null, str, str2);
        int i4 = AFLogger + 51;
        force = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void AFKeystoreWrapper() {
        int i = 2 % 2;
        int i2 = force + 65;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        this.AFInAppEventType = false;
        valueOf();
        w();
        int i4 = AFLogger + 41;
        force = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventParameterName() {
        int i = 2 % 2;
        int i2 = force + 81;
        int i3 = i2 % 128;
        AFLogger = i3;
        int i4 = i2 % 2;
        this.e = false;
        int i5 = i3 + 57;
        force = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean e() {
        int i = 2 % 2;
        int i2 = force;
        int i3 = i2 + 15;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.registerClient;
        int i5 = i2 + 37;
        AFLogger = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return z;
    }

    private static float unregisterClient() {
        int i = 2 % 2;
        float nextFloat = new Random().nextFloat();
        int i2 = force + 37;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            return nextFloat;
        }
        throw null;
    }

    private Map<String, Object> AFInAppEventParameterName(String str, PackageManager packageManager) {
        int i = 2 % 2;
        int i2 = AFLogger + 63;
        force = i2 % 128;
        if (i2 % 2 != 0) {
            valueOf(str, packageManager, this.unregisterClient.i(), this.unregisterClient.getLevel());
            return v();
        }
        valueOf(str, packageManager, this.unregisterClient.i(), this.unregisterClient.getLevel());
        v();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String d() {
        int i = 2 % 2;
        int i2 = force;
        int i3 = i2 + 35;
        AFLogger = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        int i5 = i2 + 63;
        AFLogger = i5 % 128;
        int i6 = i5 % 2;
        return "6.14.0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r5.registerClient == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        if (r5.AFInAppEventType == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r5.AFInAppEventType == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        r3 = r3 + 33;
        com.appsflyer.internal.AFb1gSDK.force = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if ((r3 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r1 = 48 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean force() {
        int i = 2 % 2;
        if (this.e) {
            int i2 = force + 73;
            int i3 = i2 % 128;
            AFLogger = i3;
            if (i2 % 2 != 0) {
                int i4 = 78 / 0;
            }
        }
        return false;
    }

    private synchronized void AFInAppEventType(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = AFLogger + 33;
        force = i2 % 128;
        int i3 = i2 % 2;
        try {
            Map<String, Object> map = this.values;
            Object[] objArr = new Object[1];
            a(new int[]{0, 5, 0, 3}, "\u0001\u0001\u0000\u0000\u0000", false, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.values.put("model", Build.MODEL);
            this.values.put("platform", "Android");
            this.values.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                int i4 = force + 121;
                AFLogger = i4 % 128;
                int i5 = i4 % 2;
                if (str.length() > 0) {
                    int i6 = AFLogger + 43;
                    force = i6 % 128;
                    if (i6 % 2 == 0) {
                        this.values.put("advertiserId", str);
                        throw null;
                    }
                    this.values.put("advertiserId", str);
                }
            }
            if (str2 != null) {
                int i7 = AFLogger + 59;
                force = i7 % 128;
                int i8 = i7 % 2;
                if (str2.length() > 0) {
                    this.values.put("imei", str2);
                    int i9 = 2 % 2;
                }
            }
            if (str3 != null && str3.length() > 0) {
                this.values.put("android_id", str3);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        try {
            this.values.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.values.put("devkey", str2);
                int i2 = 2 % 2;
            }
            if (str3 != null && str3.length() > 0) {
                int i3 = AFLogger + 31;
                force = i3 % 128;
                if (i3 % 2 == 0) {
                    this.values.put("originalAppsFlyerId", str3);
                    int i4 = 19 / 0;
                } else {
                    this.values.put("originalAppsFlyerId", str3);
                }
            }
            if (str4 != null && str4.length() > 0) {
                int i5 = force + 87;
                AFLogger = i5 % 128;
                int i6 = i5 % 2;
                this.values.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = force + 45;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    int i4 = force + 21;
                    AFLogger = i4 % 128;
                    if (i4 % 2 != 0) {
                        this.values.put("app_id", str);
                        obj.hashCode();
                        throw null;
                    }
                    this.values.put("app_id", str);
                    int i5 = AFLogger + 21;
                    force = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null) {
            int i8 = AFLogger + 107;
            force = i8 % 128;
            if (i8 % 2 == 0) {
                str2.length();
                obj.hashCode();
                throw null;
            }
            if (str2.length() > 0) {
                this.values.put("app_version", str2);
                int i9 = 2 % 2;
            }
        }
        if (str3 != null && str3.length() > 0) {
            this.values.put(AppsFlyerProperties.CHANNEL, str3);
            int i10 = 2 % 2;
        }
        if (str4 != null) {
            int i11 = AFLogger + 7;
            force = i11 % 128;
            int i12 = i11 % 2;
            if (str4.length() > 0) {
                this.values.put("preInstall", str4);
            }
        }
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String... strArr) {
        String obj;
        int i = 2 % 2;
        int i2 = AFLogger + 121;
        force = i2 % 128;
        int i3 = i2 % 2;
        if (force()) {
            int i4 = force + 35;
            AFLogger = i4 % 128;
            int i5 = i4 % 2;
            if (this.AFKeystoreWrapper < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        obj = new StringBuilder().append(currentTimeMillis).append(" ").append(Thread.currentThread().getId()).append(" _/AppsFlyer_6.14.0 [").append(str).append("] ").append(str2).append(" ").append(join).toString();
                        int i6 = force + 99;
                        AFLogger = i6 % 128;
                        int i7 = i6 % 2;
                        int i8 = 2 % 2;
                    } else {
                        obj = new StringBuilder().append(currentTimeMillis).append(" ").append(Thread.currentThread().getId()).append(" ").append(str2).append("/AppsFlyer_6.14.0 ").append(join).toString();
                    }
                    int length = this.AFKeystoreWrapper + (obj.length() << 1);
                    int i9 = AFInAppEventParameterName;
                    boolean z = false;
                    if (length > i9) {
                        obj = obj.substring(0, (i9 - this.AFKeystoreWrapper) / 2);
                        z = true;
                    }
                    this.valueOf.add(obj);
                    this.AFKeystoreWrapper += obj.length() << 1;
                    if (z) {
                        this.valueOf.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.AFKeystoreWrapper += 138;
                        int i10 = AFLogger + 17;
                        force = i10 % 128;
                        int i11 = i10 % 2;
                        int i12 = 2 % 2;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private synchronized Map<String, Object> v() {
        Map<String, Object> map;
        int i = 2 % 2;
        int i2 = force + 125;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            this.values.put("data", this.valueOf);
            w();
            map = this.values;
            int i3 = force + 61;
            AFLogger = i3 % 128;
            int i4 = i3 % 2;
        } else {
            this.values.put("data", this.valueOf);
            w();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return map;
    }

    private synchronized void valueOf(String str, PackageManager packageManager, AFg1wSDK aFg1wSDK, AFd1pSDK aFd1pSDK) {
        int i = 2 % 2;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        this.values.clear();
        if (string != null) {
            try {
                this.values.putAll(AFa1oSDK.AFInAppEventType(new JSONObject(string)));
                int i2 = AFLogger + 121;
                force = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (Throwable unused) {
            }
        } else {
            AFb1vSDK AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper();
            AFh1uSDK aFh1uSDK = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().AFInAppEventType().AFInAppEventType.AFLogger;
            String str2 = null;
            AFb1zSDK aFb1zSDK = aFh1uSDK != null ? new AFb1zSDK(aFh1uSDK.values, aFh1uSDK.registerClient) : null;
            if (aFb1zSDK != null) {
                int i4 = force + 19;
                AFLogger = i4 % 128;
                int i5 = i4 % 2;
                str2 = aFb1zSDK.AFInAppEventParameterName;
            }
            AFInAppEventType(str2, aFg1wSDK.unregisterClient, aFd1pSDK.AFInAppEventType);
            AFKeystoreWrapper(new StringBuilder("6.14.0.").append(AFb1vSDK.values).toString(), AFKeystoreWrapper.AFInAppEventParameterName().i().AFLogger, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                AFInAppEventParameterName(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.values).toString());
        }
        this.values.put("launch_counter", String.valueOf(this.unregisterClient.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0)));
    }

    private static String[] AFInAppEventParameterName(String str, StackTraceElement[] stackTraceElementArr) {
        int i = 2 % 2;
        int i2 = AFLogger;
        int i3 = i2 + 73;
        force = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (stackTraceElementArr != null) {
            String[] strArr = new String[stackTraceElementArr.length + 1];
            strArr[0] = str;
            for (int i4 = 1; i4 < stackTraceElementArr.length; i4++) {
                strArr[i4] = stackTraceElementArr[i4].toString();
            }
            return strArr;
        }
        int i5 = i2 + 95;
        force = i5 % 128;
        if (i5 % 2 != 0) {
            return new String[]{str};
        }
        String[] strArr2 = new String[1];
        strArr2[1] = str;
        return strArr2;
    }

    private synchronized void w() {
        int i = 2 % 2;
        this.valueOf = new ArrayList();
        this.AFKeystoreWrapper = 0;
        int i2 = force + 43;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
    }

    private synchronized boolean AFInAppEventParameterName(AFh1hSDK aFh1hSDK, AFh1hSDK aFh1hSDK2) {
        int i = 2 % 2;
        if (aFh1hSDK == null) {
            i();
            int i2 = AFLogger + 59;
            force = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!aFh1hSDK.AFInAppEventParameterName()) {
            int i4 = force + 93;
            AFLogger = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!(this.unregisterClient.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0) > aFh1hSDK.AFInAppEventParameterName))) {
            int i5 = force + 121;
            AFLogger = i5 % 128;
            return i5 % 2 != 0 ? false : false;
        }
        if (!AFKeystoreWrapper(aFh1hSDK, aFh1hSDK2)) {
            return false;
        }
        if (AFKeystoreWrapper(aFh1hSDK.valueOf)) {
            if (AFInAppEventType(aFh1hSDK.AFKeystoreWrapper)) {
                return true;
            }
            int i6 = AFLogger + 79;
            force = i6 % 128;
            return i6 % 2 == 0 ? false : false;
        }
        int i7 = AFLogger + 13;
        int i8 = i7 % 128;
        force = i8;
        boolean z = i7 % 2 == 0;
        int i9 = i8 + 113;
        AFLogger = i9 % 128;
        int i10 = i9 % 2;
        return z;
    }

    private boolean AFKeystoreWrapper(AFh1hSDK aFh1hSDK, AFh1hSDK aFh1hSDK2) {
        int i = 2 % 2;
        int i2 = AFLogger + 25;
        force = i2 % 128;
        int i3 = i2 % 2;
        if (!aFh1hSDK.equals(aFh1hSDK2)) {
            boolean values = values(aFh1hSDK.AFInAppEventType);
            AFKeystoreWrapper(values);
            return values;
        }
        int i4 = force + 37;
        AFLogger = i4 % 128;
        if (i4 % 2 == 0) {
            return afInfoLog();
        }
        afInfoLog();
        throw null;
    }

    private static boolean AFInAppEventType(String str) {
        int i = 2 % 2;
        int i2 = force + 65;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        if (!(!AFc1tSDK.AFInAppEventType(str))) {
            return true;
        }
        new AFe1zSDK();
        boolean AFInAppEventType = AFe1zSDK.AFInAppEventType(d(), str);
        int i4 = AFLogger + 115;
        force = i4 % 128;
        int i5 = i4 % 2;
        return AFInAppEventType;
    }

    private boolean AFKeystoreWrapper(String str) {
        int i = 2 % 2;
        if (AFc1tSDK.AFInAppEventType(str)) {
            int i2 = force + 85;
            AFLogger = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        AFd1sSDK AFInAppEventType = this.unregisterClient.AFInAppEventType();
        boolean equals = str.equals(AFb1uSDK.AFInAppEventType(AFInAppEventType.valueOf.AFKeystoreWrapper, AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName()));
        int i4 = force + 47;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
        return equals;
    }

    private static boolean values(float f) {
        int i = 2 % 2;
        double d2 = f;
        if (d2 >= 1.0d) {
            int i2 = AFLogger + 79;
            force = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (d2 > 0.0d) {
            return unregisterClient() <= f;
        }
        int i4 = force + 117;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        return r3.AFInAppEventType;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static AFh1hSDK AFInAppEventType(AFi1zSDK aFi1zSDK) {
        AFh1gSDK aFh1gSDK;
        int i = 2 % 2;
        if (aFi1zSDK != null) {
            int i2 = AFLogger + 5;
            force = i2 % 128;
            if (i2 % 2 == 0) {
                aFh1gSDK = aFi1zSDK.AFInAppEventParameterName;
                int i3 = 1 / 0;
            } else {
                aFh1gSDK = aFi1zSDK.AFInAppEventParameterName;
            }
        }
        int i4 = AFLogger + 5;
        force = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void i() {
        int i = 2 % 2;
        int i2 = AFLogger + 1;
        force = i2 % 128;
        if (i2 % 2 == 0) {
            this.unregisterClient.valueOf().AFKeystoreWrapper("participantInProxy");
            throw null;
        }
        this.unregisterClient.valueOf().AFKeystoreWrapper("participantInProxy");
        int i3 = force + 23;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
    }

    private void AFKeystoreWrapper(boolean z) {
        int i = 2 % 2;
        int i2 = force + 69;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            this.unregisterClient.valueOf().valueOf("participantInProxy", z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.unregisterClient.valueOf().valueOf("participantInProxy", z);
        int i3 = force + 57;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
    }

    private boolean afInfoLog() {
        int i = 2 % 2;
        int i2 = AFLogger + 107;
        force = i2 % 128;
        if (i2 % 2 == 0) {
            this.unregisterClient.valueOf().AFInAppEventType("participantInProxy");
            throw null;
        }
        boolean AFInAppEventType = this.unregisterClient.valueOf().AFInAppEventType("participantInProxy");
        int i3 = AFLogger + 121;
        force = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
        return AFInAppEventType;
    }

    private static void a(int[] iArr, String str, boolean z, Object[] objArr) {
        String str2 = str;
        int i = 2 % 2;
        byte[] bArr = str2;
        if (str2 != null) {
            int i2 = $10 + 79;
            $11 = i2 % 128;
            int i3 = i2 % 2;
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFj1dSDK aFj1dSDK = new AFj1dSDK();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = d;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                cArr2[i8] = (char) (cArr[i8] ^ 4656066899128210390L);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr2 != null) {
            int i9 = $11 + 9;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i5];
            aFj1dSDK.AFKeystoreWrapper = 0;
            char c = 0;
            while (aFj1dSDK.AFKeystoreWrapper < i5) {
                int i11 = $11 + 59;
                $10 = i11 % 128;
                if (i11 % 2 == 0 ? bArr2[aFj1dSDK.AFKeystoreWrapper] != 1 : bArr2[aFj1dSDK.AFKeystoreWrapper] != 0) {
                    cArr4[aFj1dSDK.AFKeystoreWrapper] = (char) ((cArr3[aFj1dSDK.AFKeystoreWrapper] * 2) - c);
                } else {
                    cArr4[aFj1dSDK.AFKeystoreWrapper] = (char) (((cArr3[aFj1dSDK.AFKeystoreWrapper] * 2) + 1) - c);
                }
                c = cArr4[aFj1dSDK.AFKeystoreWrapper];
                aFj1dSDK.AFKeystoreWrapper++;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i12 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i12, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            aFj1dSDK.AFKeystoreWrapper = 0;
            while (aFj1dSDK.AFKeystoreWrapper < i5) {
                cArr6[aFj1dSDK.AFKeystoreWrapper] = cArr3[(i5 - aFj1dSDK.AFKeystoreWrapper) - 1];
                aFj1dSDK.AFKeystoreWrapper++;
            }
            int i13 = $11 + 19;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            aFj1dSDK.AFKeystoreWrapper = 0;
            int i15 = $10 + 123;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            while (aFj1dSDK.AFKeystoreWrapper < i5) {
                int i17 = $11 + 107;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[aFj1dSDK.AFKeystoreWrapper] = (char) (cArr3[aFj1dSDK.AFKeystoreWrapper] - iArr[2]);
                aFj1dSDK.AFKeystoreWrapper++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
