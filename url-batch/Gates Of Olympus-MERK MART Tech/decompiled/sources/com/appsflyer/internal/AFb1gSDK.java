package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.ComposerImplKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.messaging.Constants;
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
    private static char e = 0;
    private static int force = 1;
    private static char i;
    private static char unregisterClient;
    private static int v;
    private static char w;
    private final AFd1mSDK AFLogger;
    private List<String> values = new ArrayList();
    private boolean AFInAppEventType = true;
    private final Map<String, Object> valueOf = new HashMap();
    private boolean registerClient = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int AFKeystoreWrapper = 0;
    private boolean d = false;

    static void e() {
        unregisterClient = (char) 54106;
        w = (char) 976;
        e = (char) 10507;
        i = (char) 14993;
    }

    static {
        e();
        AFInAppEventParameterName = 98166;
        int i2 = force + 47;
        v = i2 % 128;
        int i3 = i2 % 2;
    }

    public AFb1gSDK(AFd1mSDK aFd1mSDK) {
        this.AFLogger = aFd1mSDK;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean values() {
        int i2 = 2 % 2;
        int i3 = force + 59;
        v = i3 % 128;
        if (i3 % 2 != 0) {
            values(values(this.AFLogger.registerClient().AFInAppEventParameterName.valueOf), values(this.AFLogger.registerClient().AFInAppEventParameterName.AFKeystoreWrapper));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean values = values(values(this.AFLogger.registerClient().AFInAppEventParameterName.valueOf), values(this.AFLogger.registerClient().AFInAppEventParameterName.AFKeystoreWrapper));
        if (values) {
            AFLogger();
            return values;
        }
        valueOf();
        AFInAppEventParameterName();
        int i4 = force + 119;
        v = i4 % 128;
        int i5 = i4 % 2;
        return values;
    }

    private synchronized void AFLogger() {
        int i2 = 2 % 2;
        int i3 = v + 81;
        force = i3 % 128;
        int i4 = i3 % 2;
        if (this.d) {
            return;
        }
        this.d = true;
        values("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        int i5 = force + TypedValues.TYPE_TARGET;
        v = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r6.d == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        values("r_debugging_off", new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", java.util.Locale.ENGLISH).format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), new java.lang.String[0]);
        r6.d = false;
        r6.AFInAppEventType = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        r1 = r1 + 25;
        r2 = r1 % 128;
        com.appsflyer.internal.AFb1gSDK.v = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if ((r1 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r6.AFInAppEventType != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        r2 = r2 + 55;
        com.appsflyer.internal.AFb1gSDK.force = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x001c, code lost:
    
        if (r6.d == false) goto L15;
     */
    @Override // com.appsflyer.internal.AFb1bSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void AFInAppEventParameterName() {
        int i2 = 2 % 2;
        int i3 = force;
        int i4 = i3 + 19;
        v = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void AFKeystoreWrapper() {
        List<String> list;
        int i2 = 2 % 2;
        int i3 = force + 45;
        v = i3 % 128;
        if (i3 % 2 != 0) {
            this.valueOf.clear();
            list = this.values;
        } else {
            this.valueOf.clear();
            list = this.values;
        }
        list.clear();
        this.AFKeystoreWrapper = 0;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventType(String str, PackageManager packageManager) {
        int i2 = 2 % 2;
        int i3 = force + 21;
        v = i3 % 128;
        int i4 = i3 % 2;
        try {
            final AFe1vSDK AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper().AFKeystoreWrapper(values(str, packageManager), this.AFLogger.force().unregisterClient);
            if (AFKeystoreWrapper == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                int i5 = force + 93;
                v = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            ExecutorService AFInAppEventParameterName2 = this.AFLogger.AFInAppEventParameterName();
            Objects.requireNonNull(AFKeystoreWrapper);
            AFInAppEventParameterName2.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1gSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFe1vSDK.this.values();
                }
            });
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventType(String str, String... strArr) {
        int i2 = 2 % 2;
        int i3 = force + 25;
        v = i3 % 128;
        int i4 = i3 % 2;
        values("public_api_call", str, strArr);
        int i5 = v + 87;
        force = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFKeystoreWrapper(Throwable th) {
        String message;
        StackTraceElement[] stackTrace;
        int i2 = 2 % 2;
        int i3 = v + TypedValues.TYPE_TARGET;
        force = i3 % 128;
        if (i3 % 2 != 0) {
            Throwable cause = th.getCause();
            String simpleName = th.getClass().getSimpleName();
            if (cause == null) {
                message = th.getMessage();
            } else {
                message = cause.getMessage();
                int i4 = v + 83;
                force = i4 % 128;
                int i5 = i4 % 2;
            }
            if (cause == null) {
                stackTrace = th.getStackTrace();
                int i6 = force + 31;
                v = i6 % 128;
                int i7 = i6 % 2;
            } else {
                stackTrace = cause.getStackTrace();
            }
            values("exception", simpleName, AFKeystoreWrapper(message, stackTrace));
            return;
        }
        th.getCause();
        th.getClass().getSimpleName();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventParameterName(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = v + 1;
        force = i3 % 128;
        int i4 = i3 % 2;
        values("server_request", str, str2);
        int i5 = force + 3;
        v = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventParameterName(String str, int i2, String str2) {
        int i3 = 2 % 2;
        int i4 = force + ModuleDescriptor.MODULE_VERSION;
        v = i4 % 128;
        if (i4 % 2 != 0) {
            String[] strArr = new String[4];
            strArr[0] = String.valueOf(i2);
            strArr[1] = str2;
            values("server_response", str, strArr);
        } else {
            values("server_response", str, String.valueOf(i2), str2);
        }
        int i5 = v + 99;
        force = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void values(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = v + 75;
        force = i3 % 128;
        int i4 = i3 % 2;
        values((String) null, str, str2);
        int i5 = v + 77;
        force = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void valueOf() {
        int i2 = 2 % 2;
        int i3 = force + 3;
        v = i3 % 128;
        int i4 = i3 % 2;
        this.AFInAppEventType = false;
        AFKeystoreWrapper();
        afInfoLog();
        int i5 = v + 39;
        force = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventType() {
        int i2 = 2 % 2;
        int i3 = force;
        int i4 = i3 + 71;
        v = i4 % 128;
        int i5 = i4 % 2;
        this.registerClient = false;
        int i6 = i3 + 67;
        v = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = force + 67;
        int i4 = i3 % 128;
        v = i4;
        int i5 = i3 % 2;
        boolean z = this.d;
        int i6 = i4 + 37;
        force = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    private static float unregisterClient() {
        int i2 = 2 % 2;
        float nextFloat = new Random().nextFloat();
        int i3 = v + 65;
        force = i3 % 128;
        if (i3 % 2 != 0) {
            return nextFloat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Map<String, Object> values(String str, PackageManager packageManager) {
        int i2 = 2 % 2;
        int i3 = force + 65;
        v = i3 % 128;
        int i4 = i3 % 2;
        valueOf(str, packageManager, this.AFLogger.force(), this.AFLogger.AFLogger$LogLevel());
        Map<String, Object> w2 = w();
        int i5 = force + 75;
        v = i5 % 128;
        if (i5 % 2 == 0) {
            return w2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String registerClient() {
        int i2 = 2 % 2;
        int i3 = force + 73;
        int i4 = i3 % 128;
        v = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 35;
        force = i6 % 128;
        int i7 = i6 % 2;
        return "6.12.6";
    }

    private boolean i() {
        int i2 = 2 % 2;
        if (this.registerClient) {
            int i3 = v + 83;
            force = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this.AFInAppEventType || this.d) {
                return true;
            }
        }
        int i4 = force + 103;
        v = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private synchronized void values(String str, String str2, String str3) {
        int i2 = 2 % 2;
        try {
            Map<String, Object> map = this.valueOf;
            Object[] objArr = new Object[1];
            a("\uefadዐ呒ꆤ藏但", KeyEvent.normalizeMetaState(0) + 5, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.valueOf.put("model", Build.MODEL);
            this.valueOf.put("platform", "Android");
            this.valueOf.put("platform_version", Build.VERSION.RELEASE);
            if (str != null && str.length() > 0) {
                this.valueOf.put("advertiserId", str);
            }
            if (str2 != null && str2.length() > 0) {
                this.valueOf.put("imei", str2);
            }
            if (str3 != null) {
                int i3 = v + 47;
                force = i3 % 128;
                int i4 = i3 % 2;
                if (str3.length() > 0) {
                    int i5 = v + ComposerImplKt.nodeKey;
                    force = i5 % 128;
                    int i6 = i5 % 2;
                    this.valueOf.put("android_id", str3);
                    int i7 = v + 63;
                    force = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 2 % 2;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        if (r6.length() > 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void values(String str, String str2, String str3, String str4) {
        int i2 = 2 % 2;
        try {
            this.valueOf.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.valueOf.put("devkey", str2);
                int i3 = 2 % 2;
            }
            if (str3 != null) {
                int i4 = v + 7;
                force = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 49 / 0;
                    if (str3.length() > 0) {
                        int i6 = v + 97;
                        force = i6 % 128;
                        if (i6 % 2 == 0) {
                            this.valueOf.put("originalAppsFlyerId", str3);
                            int i7 = 12 / 0;
                        } else {
                            this.valueOf.put("originalAppsFlyerId", str3);
                        }
                    }
                }
            }
            if (str4 != null && str4.length() > 0) {
                this.valueOf.put("uid", str4);
            }
            int i8 = force + 49;
            v = i8 % 128;
            int i9 = i8 % 2;
        } catch (Throwable unused) {
        }
    }

    private synchronized void valueOf(String str, String str2, String str3, String str4) {
        int i2 = 2 % 2;
        if (str != null) {
            int i3 = force + 47;
            v = i3 % 128;
            int i4 = i3 % 2;
            try {
                if (str.length() > 0) {
                    this.valueOf.put("app_id", str);
                    int i5 = 2 % 2;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            int i6 = v + 57;
            force = i6 % 128;
            if (i6 % 2 == 0) {
                this.valueOf.put("app_version", str2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.valueOf.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.valueOf.put(AppsFlyerProperties.CHANNEL, str3);
        }
        if (str4 != null) {
            int i7 = force + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
            v = i7 % 128;
            int i8 = i7 % 2;
            if (str4.length() > 0) {
                this.valueOf.put("preInstall", str4);
            }
        }
        int i9 = v + TypedValues.TYPE_TARGET;
        force = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9 A[Catch: all -> 0x00fc, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:6:0x0013, B:13:0x0065, B:15:0x0070, B:19:0x00b9, B:22:0x00d7, B:33:0x0074), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9 A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #0 {all -> 0x00f8, blocks: (B:10:0x001c, B:12:0x0028, B:16:0x00ab, B:21:0x00c4, B:24:0x00ce, B:26:0x00d8, B:28:0x00e9, B:34:0x0077), top: B:9:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void values(String str, String str2, String... strArr) {
        String obj;
        int length;
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = force + 9;
        v = i4 % 128;
        int i5 = i4 % 2;
        if (!i() || this.AFKeystoreWrapper >= 98304) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String join = TextUtils.join(", ", strArr);
            if (str != null) {
                obj = new StringBuilder().append(currentTimeMillis).append(" ").append(Thread.currentThread().getId()).append(" _/AppsFlyer_6.12.6 [").append(str).append("] ").append(str2).append(" ").append(join).toString();
                int i6 = v + 121;
                force = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 4;
                    length = this.AFKeystoreWrapper + (obj.length() << 1);
                    i2 = AFInAppEventParameterName;
                    z = false;
                    if (length > i2) {
                        int i8 = v + 19;
                        force = i8 % 128;
                        if (i8 % 2 == 0) {
                            obj = obj.substring(0, (i2 - this.AFKeystoreWrapper) + 4);
                        } else {
                            obj = obj.substring(0, (i2 - this.AFKeystoreWrapper) / 2);
                            z = true;
                        }
                        int i9 = 2 % 2;
                    }
                    this.values.add(obj);
                    this.AFKeystoreWrapper += obj.length() << 1;
                    if (z) {
                        this.values.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.AFKeystoreWrapper += 138;
                    }
                }
            } else {
                obj = new StringBuilder().append(currentTimeMillis).append(" ").append(Thread.currentThread().getId()).append(" ").append(str2).append("/AppsFlyer_6.12.6 ").append(join).toString();
            }
            int i10 = 2 % 2;
            length = this.AFKeystoreWrapper + (obj.length() << 1);
            i2 = AFInAppEventParameterName;
            z = false;
            if (length > i2) {
            }
            this.values.add(obj);
            this.AFKeystoreWrapper += obj.length() << 1;
            if (z) {
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized Map<String, Object> w() {
        Map<String, Object> map;
        int i2 = 2 % 2;
        int i3 = force + 99;
        v = i3 % 128;
        int i4 = i3 % 2;
        this.valueOf.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.values);
        afInfoLog();
        map = this.valueOf;
        int i5 = force + 45;
        v = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return map;
    }

    private synchronized void valueOf(String str, PackageManager packageManager, AFg1xSDK aFg1xSDK, AFd1qSDK aFd1qSDK) {
        int i2 = 2 % 2;
        int i3 = v + 21;
        force = i3 % 128;
        if (i3 % 2 == 0) {
            AppsFlyerProperties.getInstance().getString("remote_debug_static_data");
            this.valueOf.clear();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        this.valueOf.clear();
        if (string != null) {
            try {
                this.valueOf.putAll(AFa1oSDK.AFInAppEventParameterName(new JSONObject(string)));
                int i4 = 2 % 2;
            } catch (Throwable unused) {
            }
        } else {
            AFb1tSDK AFInAppEventType = AFb1tSDK.AFInAppEventType();
            values(appsFlyerProperties.getString("advertiserId"), aFg1xSDK.AFLogger, aFd1qSDK.values);
            values(new StringBuilder("6.12.6.").append(AFb1tSDK.AFInAppEventParameterName).toString(), AFInAppEventType.values().force().unregisterClient, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                int i5 = packageManager.getPackageInfo(str, 0).versionCode;
                valueOf(str, String.valueOf(i5), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                int i6 = v + 41;
                force = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.valueOf).toString());
        }
        this.valueOf.put("launch_counter", String.valueOf(this.AFLogger.values().valueOf.AFKeystoreWrapper("appsFlyerCount", 0)));
    }

    private static String[] AFKeystoreWrapper(String str, StackTraceElement[] stackTraceElementArr) {
        int i2 = 2 % 2;
        if (stackTraceElementArr == null) {
            int i3 = force + 91;
            v = i3 % 128;
            int i4 = i3 % 2;
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        for (int i5 = 1; i5 < stackTraceElementArr.length; i5++) {
            int i6 = v + 95;
            force = i6 % 128;
            int i7 = i6 % 2;
            strArr[i5] = stackTraceElementArr[i5].toString();
        }
        return strArr;
    }

    private synchronized void afInfoLog() {
        int i2 = 2 % 2;
        this.values = new ArrayList();
        this.AFKeystoreWrapper = 0;
        int i3 = v + 1;
        force = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private synchronized boolean values(AFh1sSDK aFh1sSDK, AFh1sSDK aFh1sSDK2) {
        int i2 = 2 % 2;
        int i3 = force + 93;
        v = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (aFh1sSDK == null) {
            force();
            return false;
        }
        if (!aFh1sSDK.valueOf()) {
            return false;
        }
        if (this.AFLogger.values().valueOf.AFKeystoreWrapper("appsFlyerCount", 0) > aFh1sSDK.values) {
            int i4 = 2 % 2;
            int i5 = v + TypedValues.TYPE_TARGET;
            force = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!AFInAppEventType(aFh1sSDK, aFh1sSDK2)) {
            int i6 = force + 73;
            v = i6 % 128;
            return i6 % 2 != 0;
        }
        if (AFInAppEventParameterName(aFh1sSDK.valueOf)) {
            return valueOf(aFh1sSDK.AFInAppEventParameterName);
        }
        return false;
    }

    private boolean AFInAppEventType(AFh1sSDK aFh1sSDK, AFh1sSDK aFh1sSDK2) {
        int i2 = 2 % 2;
        int i3 = force + 33;
        v = i3 % 128;
        int i4 = i3 % 2;
        if (!aFh1sSDK.equals(aFh1sSDK2)) {
            boolean values = values(aFh1sSDK.AFInAppEventType);
            AFInAppEventType(values);
            int i5 = v + 93;
            force = i5 % 128;
            int i6 = i5 % 2;
            return values;
        }
        int i7 = v + 63;
        force = i7 % 128;
        if (i7 % 2 != 0) {
            return v();
        }
        v();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r3 = com.appsflyer.internal.AFb1gSDK.v + com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        com.appsflyer.internal.AFb1gSDK.force = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if ((r3 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        if (com.appsflyer.internal.AFc1vSDK.values(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (com.appsflyer.internal.AFc1vSDK.values(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        new com.appsflyer.internal.AFd1dSDK();
        r3 = com.appsflyer.internal.AFd1dSDK.AFInAppEventType(registerClient(), r3);
        r1 = com.appsflyer.internal.AFb1gSDK.v + com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        com.appsflyer.internal.AFb1gSDK.force = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if ((r1 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        r0 = 61 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = v + 19;
        force = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 26 / 0;
        }
    }

    private boolean AFInAppEventParameterName(String str) {
        int i2 = 2 % 2;
        if (AFc1vSDK.values(str)) {
            int i3 = force;
            int i4 = i3 + 29;
            v = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 93;
            v = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        AFd1pSDK values = this.AFLogger.values();
        return str.equals(AFb1rSDK.AFInAppEventType(values.AFInAppEventParameterName.AFKeystoreWrapper, values.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName()));
    }

    private static boolean values(float f) {
        int i2 = 2 % 2;
        int i3 = v + 25;
        force = i3 % 128;
        int i4 = i3 % 2;
        double d = f;
        if (d >= 1.0d) {
            return true;
        }
        if (d <= 0.0d || unregisterClient() > f) {
            return false;
        }
        int i5 = v + 71;
        force = i5 % 128;
        return i5 % 2 != 0;
    }

    private static AFh1sSDK values(AFh1oSDK aFh1oSDK) {
        AFh1qSDK aFh1qSDK;
        int i2 = 2 % 2;
        int i3 = v + 13;
        force = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (aFh1oSDK == null || (aFh1qSDK = aFh1oSDK.AFInAppEventParameterName) == null) {
            return null;
        }
        int i4 = force + 93;
        v = i4 % 128;
        int i5 = i4 % 2;
        return aFh1qSDK.values;
    }

    private void force() {
        int i2 = 2 % 2;
        int i3 = force + 123;
        v = i3 % 128;
        int i4 = i3 % 2;
        this.AFLogger.valueOf().AFKeystoreWrapper("participantInProxy");
        int i5 = force + 23;
        v = i5 % 128;
        int i6 = i5 % 2;
    }

    private void AFInAppEventType(boolean z) {
        int i2 = 2 % 2;
        int i3 = force + ModuleDescriptor.MODULE_VERSION;
        v = i3 % 128;
        int i4 = i3 % 2;
        this.AFLogger.valueOf().AFInAppEventParameterName("participantInProxy", z);
        int i5 = v + 121;
        force = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
    }

    private boolean v() {
        int i2 = 2 % 2;
        int i3 = force + 19;
        v = i3 % 128;
        int i4 = i3 % 2;
        boolean values = this.AFLogger.valueOf().values("participantInProxy");
        int i5 = force + ComposerImplKt.nodeKey;
        v = i5 % 128;
        if (i5 % 2 == 0) {
            return values;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(String str, int i2, Object[] objArr) {
        char[] cArr;
        int i3 = 2 % 2;
        int i4 = $11 + 15;
        int i5 = i4 % 128;
        $10 = i5;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str != null) {
            int i6 = i5 + 27;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr = str.toCharArray();
                int i7 = 96 / 0;
            } else {
                cArr = str.toCharArray();
            }
            int i8 = $11 + 113;
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
            int i10 = $11 + 105;
            $10 = i10 % 128;
            int i11 = 58224;
            if (i10 % 2 != 0) {
                cArr4[1] = cArr2[aFj1uSDK.values];
                cArr4[0] = cArr2[aFj1uSDK.values];
            } else {
                cArr4[0] = cArr2[aFj1uSDK.values];
                cArr4[1] = cArr2[aFj1uSDK.values + 1];
            }
            for (int i12 = 0; i12 < 16; i12++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                char c3 = (char) (c - (((c2 + i11) ^ ((c2 << 4) + ((char) (i ^ (-7551638670892174108L))))) ^ ((c2 >>> 5) + ((char) (w ^ (-7551638670892174108L))))));
                cArr4[1] = c3;
                cArr4[0] = (char) (c2 - (((c3 >>> 5) + ((char) (unregisterClient ^ (-7551638670892174108L)))) ^ ((c3 + i11) ^ ((c3 << 4) + ((char) (e ^ (-7551638670892174108L)))))));
                i11 -= 40503;
            }
            cArr3[aFj1uSDK.values] = cArr4[0];
            cArr3[aFj1uSDK.values + 1] = cArr4[1];
            aFj1uSDK.values += 2;
            int i13 = $10 + 87;
            $11 = i13 % 128;
            int i14 = i13 % 2;
        }
        objArr[0] = new String(cArr3, 0, i2);
    }
}
