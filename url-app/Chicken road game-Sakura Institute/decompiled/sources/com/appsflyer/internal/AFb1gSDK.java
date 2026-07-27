package com.appsflyer.internal;

import android.content.Context;
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
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1gSDK implements AFb1bSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int AFInAppEventParameterName;
    private static int AFLogger = 0;

    /* renamed from: d, reason: collision with root package name */
    private static char[] f5851d = null;
    private static int force = 1;
    private final AFd1kSDK unregisterClient;
    private List<String> valueOf = new ArrayList();
    private boolean AFInAppEventType = true;
    private final Map<String, Object> values = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private boolean f5852e = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int AFKeystoreWrapper = 0;
    private boolean registerClient = false;

    static {
        AFLogger();
        AFInAppEventParameterName = 98166;
        int i2 = force + 31;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            int i4 = 22 / 0;
        }
    }

    public AFb1gSDK(AFd1kSDK aFd1kSDK) {
        this.unregisterClient = aFd1kSDK;
    }

    public static void AFLogger() {
        f5851d = new char[]{54246, 54193, 54207, 54197, 54204};
    }

    private static void a(int[] iArr, String str, boolean z4, Object[] objArr) {
        String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            $11 = ($10 + 79) % 128;
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFj1dSDK aFj1dSDK = new AFj1dSDK();
        int i2 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = f5851d;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                cArr2[i7] = (char) (cArr[i7] ^ 4656066899128210390L);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i2, cArr3, 0, i4);
        if (bArr2 != null) {
            int i8 = $11 + 9;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i4];
            aFj1dSDK.AFKeystoreWrapper = 0;
            char c4 = 0;
            while (true) {
                int i10 = aFj1dSDK.AFKeystoreWrapper;
                if (i10 >= i4) {
                    break;
                }
                int i11 = $11 + 59;
                $10 = i11 % 128;
                if (i11 % 2 == 0 ? bArr2[i10] != 1 : bArr2[i10] != 0) {
                    cArr4[i10] = (char) ((cArr3[i10] * 2) - c4);
                } else {
                    cArr4[i10] = (char) (((cArr3[i10] * 2) + 1) - c4);
                }
                c4 = cArr4[i10];
                aFj1dSDK.AFKeystoreWrapper = i10 + 1;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (z4) {
            char[] cArr6 = new char[i4];
            aFj1dSDK.AFKeystoreWrapper = 0;
            while (true) {
                int i13 = aFj1dSDK.AFKeystoreWrapper;
                if (i13 >= i4) {
                    break;
                }
                cArr6[i13] = cArr3[(i4 - i13) - 1];
                aFj1dSDK.AFKeystoreWrapper = i13 + 1;
            }
            $10 = ($11 + 19) % 128;
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            aFj1dSDK.AFKeystoreWrapper = 0;
            $11 = ($10 + 123) % 128;
            while (true) {
                int i14 = aFj1dSDK.AFKeystoreWrapper;
                if (i14 >= i4) {
                    break;
                }
                $10 = ($11 + 107) % 128;
                cArr3[i14] = (char) (cArr3[i14] - iArr[2]);
                aFj1dSDK.AFKeystoreWrapper = i14 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private boolean afInfoLog() {
        int i2 = AFLogger + 107;
        force = i2 % 128;
        if (i2 % 2 == 0) {
            this.unregisterClient.valueOf().AFInAppEventType("participantInProxy");
            throw null;
        }
        boolean AFInAppEventType = this.unregisterClient.valueOf().AFInAppEventType("participantInProxy");
        int i4 = AFLogger + 121;
        force = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return AFInAppEventType;
    }

    private static String d() {
        int i2 = force;
        int i4 = i2 + 35;
        AFLogger = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        AFLogger = (i2 + 63) % 128;
        return "6.14.0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r4.registerClient == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4.AFInAppEventType == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r4.AFInAppEventType == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        r2 = r2 + 33;
        com.appsflyer.internal.AFb1gSDK.force = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if ((r2 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r2 = 48 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean force() {
        if (this.f5852e) {
            int i2 = force + 73;
            int i4 = i2 % 128;
            AFLogger = i4;
            if (i2 % 2 != 0) {
                int i5 = 78 / 0;
            }
        }
        return false;
    }

    private void i() {
        int i2 = AFLogger + 1;
        force = i2 % 128;
        if (i2 % 2 == 0) {
            this.unregisterClient.valueOf().AFKeystoreWrapper("participantInProxy");
            throw null;
        }
        this.unregisterClient.valueOf().AFKeystoreWrapper("participantInProxy");
        AFLogger = (force + 23) % 128;
    }

    private synchronized void registerClient() {
        try {
            int i2 = AFLogger + 77;
            int i4 = i2 % 128;
            force = i4;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.registerClient) {
                int i5 = i4 + 59;
                AFLogger = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                } else {
                    throw null;
                }
            }
            this.registerClient = true;
            try {
                AFInAppEventParameterName("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                return;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1aSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
                return;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    private static float unregisterClient() {
        float nextFloat = new Random().nextFloat();
        int i2 = force + 37;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            return nextFloat;
        }
        throw null;
    }

    private synchronized Map<String, Object> v() {
        Map<String, Object> map;
        int i2 = force + 125;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            this.values.put("data", this.valueOf);
            w();
            throw null;
        }
        this.values.put("data", this.valueOf);
        w();
        map = this.values;
        AFLogger = (force + 61) % 128;
        return map;
    }

    private synchronized void w() {
        this.valueOf = new ArrayList();
        this.AFKeystoreWrapper = 0;
        AFLogger = (force + 43) % 128;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventParameterName(String str, String... strArr) {
        force = (AFLogger + 67) % 128;
        AFInAppEventParameterName("public_api_call", str, strArr);
        int i2 = AFLogger + 89;
        force = i2 % 128;
        if (i2 % 2 == 0) {
            int i4 = 74 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void AFInAppEventType() {
        int i2 = (force + 49) % 128;
        AFLogger = i2;
        if (!this.registerClient) {
            force = (i2 + 83) % 128;
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
    public final void AFKeystoreWrapper(String str, int i2, String str2) {
        force = (AFLogger + 77) % 128;
        AFInAppEventParameterName("server_response", str, String.valueOf(i2), str2);
        int i4 = AFLogger + 43;
        force = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean e() {
        int i2 = force;
        boolean z4 = this.registerClient;
        int i4 = i2 + 37;
        AFLogger = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return z4;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void valueOf() {
        try {
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
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean values() {
        int i2;
        boolean AFInAppEventParameterName2 = AFInAppEventParameterName(AFInAppEventType(this.unregisterClient.registerClient().valueOf.valueOf), AFInAppEventType(this.unregisterClient.registerClient().valueOf.values));
        if (AFInAppEventParameterName2) {
            force = (AFLogger + 103) % 128;
            registerClient();
            i2 = force + 95;
        } else {
            AFKeystoreWrapper();
            AFInAppEventType();
            i2 = force + 91;
        }
        AFLogger = i2 % 128;
        return AFInAppEventParameterName2;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventParameterName() {
        int i2 = force + 81;
        int i4 = i2 % 128;
        AFLogger = i4;
        int i5 = i2 % 2;
        this.f5852e = false;
        int i6 = i4 + 57;
        force = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFKeystoreWrapper(String str, String str2) {
        force = (AFLogger + 41) % 128;
        AFInAppEventParameterName(null, str, str2);
        force = (AFLogger + 51) % 128;
    }

    private Map<String, Object> AFInAppEventParameterName(String str, PackageManager packageManager) {
        int i2 = AFLogger + 63;
        force = i2 % 128;
        if (i2 % 2 != 0) {
            valueOf(str, packageManager, this.unregisterClient.i(), this.unregisterClient.getLevel());
            return v();
        }
        valueOf(str, packageManager, this.unregisterClient.i(), this.unregisterClient.getLevel());
        v();
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void AFKeystoreWrapper() {
        AFLogger = (force + 65) % 128;
        this.AFInAppEventType = false;
        valueOf();
        w();
        force = (AFLogger + 41) % 128;
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3, String str4) {
        try {
            this.values.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.values.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                try {
                    int i2 = AFLogger + 31;
                    force = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.values.put("originalAppsFlyerId", str3);
                        int i4 = 19 / 0;
                    } else {
                        this.values.put("originalAppsFlyerId", str3);
                    }
                } finally {
                }
            }
            if (str4 != null && str4.length() > 0) {
                AFLogger = (force + 87) % 128;
                this.values.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String str3, String str4) {
        AFLogger = (force + 45) % 128;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    int i2 = force + 21;
                    AFLogger = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.values.put("app_id", str);
                        force = (AFLogger + 21) % 128;
                    } else {
                        this.values.put("app_id", str);
                        throw null;
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null) {
            int i4 = AFLogger + 107;
            force = i4 % 128;
            if (i4 % 2 != 0) {
                if (str2.length() > 0) {
                    this.values.put("app_version", str2);
                }
            } else {
                throw null;
            }
        }
        if (str3 != null && str3.length() > 0) {
            this.values.put(AppsFlyerProperties.CHANNEL, str3);
        }
        if (str4 != null) {
            force = (AFLogger + 7) % 128;
            if (str4.length() > 0) {
                this.values.put("preInstall", str4);
            }
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void valueOf(String str, String str2) {
        int i2 = AFLogger + 97;
        force = i2 % 128;
        if (i2 % 2 == 0) {
            String[] strArr = new String[1];
            strArr[1] = str2;
            AFInAppEventParameterName("server_request", str, strArr);
        } else {
            AFInAppEventParameterName("server_request", str, str2);
        }
        int i4 = force + 65;
        AFLogger = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private synchronized void AFInAppEventType(String str, String str2, String str3) {
        force = (AFLogger + 33) % 128;
        try {
            Map<String, Object> map = this.values;
            Object[] objArr = new Object[1];
            a(new int[]{0, 5, 0, 3}, "\u0001\u0001\u0000\u0000\u0000", false, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.values.put("model", Build.MODEL);
            this.values.put("platform", "Android");
            this.values.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                AFLogger = (force + 121) % 128;
                if (str.length() > 0) {
                    int i2 = AFLogger + 43;
                    force = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.values.put("advertiserId", str);
                        throw null;
                    }
                    this.values.put("advertiserId", str);
                }
            }
            if (str2 != null) {
                force = (AFLogger + 59) % 128;
                if (str2.length() > 0) {
                    this.values.put("imei", str2);
                }
            }
            if (str3 != null && str3.length() > 0) {
                this.values.put("android_id", str3);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void valueOf(String str, PackageManager packageManager, AFg1wSDK aFg1wSDK, AFd1pSDK aFd1pSDK) {
        try {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.values.clear();
            if (string != null) {
                try {
                    this.values.putAll(AFa1oSDK.AFInAppEventType(new JSONObject(string)));
                    force = (AFLogger + 121) % 128;
                } catch (Throwable unused) {
                }
            } else {
                AFb1vSDK AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper();
                AFh1uSDK aFh1uSDK = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().AFInAppEventType().AFInAppEventType.AFLogger;
                String str2 = null;
                AFb1zSDK aFb1zSDK = aFh1uSDK != null ? new AFb1zSDK(aFh1uSDK.AFKeystoreWrapper, aFh1uSDK.AFInAppEventParameterName) : null;
                if (aFb1zSDK != null) {
                    AFLogger = (force + 19) % 128;
                    str2 = aFb1zSDK.AFInAppEventParameterName;
                }
                AFInAppEventType(str2, aFg1wSDK.unregisterClient, aFd1pSDK.AFInAppEventType);
                StringBuilder sb = new StringBuilder("6.14.0.");
                sb.append(AFb1vSDK.values);
                AFKeystoreWrapper(sb.toString(), AFKeystoreWrapper.AFInAppEventParameterName().i().AFLogger, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
                try {
                    AFInAppEventParameterName(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.values).toString());
            }
            this.values.put("launch_counter", String.valueOf(this.unregisterClient.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0)));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void values(String str, PackageManager packageManager) {
        AFLogger = (force + 33) % 128;
        try {
            AFe1wSDK AFKeystoreWrapper = this.unregisterClient.AFInAppEventParameterName().AFKeystoreWrapper(AFInAppEventParameterName(str, packageManager), this.unregisterClient.i().AFLogger);
            if (AFKeystoreWrapper == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
            } else {
                this.unregisterClient.values().execute(new a(0, AFKeystoreWrapper));
                AFLogger = (force + 33) % 128;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    private boolean AFKeystoreWrapper(AFh1hSDK aFh1hSDK, AFh1hSDK aFh1hSDK2) {
        force = (AFLogger + 25) % 128;
        if (aFh1hSDK.equals(aFh1hSDK2)) {
            int i2 = force + 37;
            AFLogger = i2 % 128;
            if (i2 % 2 == 0) {
                return afInfoLog();
            }
            afInfoLog();
            throw null;
        }
        boolean values = values(aFh1hSDK.values);
        AFKeystoreWrapper(values);
        return values;
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String... strArr) {
        String obj;
        force = (AFLogger + 121) % 128;
        if (force()) {
            AFLogger = (force + 35) % 128;
            if (this.AFKeystoreWrapper < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(currentTimeMillis);
                        sb.append(" ");
                        sb.append(Thread.currentThread().getId());
                        sb.append(" _/AppsFlyer_6.14.0 [");
                        sb.append(str);
                        sb.append("] ");
                        sb.append(str2);
                        sb.append(" ");
                        sb.append(join);
                        obj = sb.toString();
                        AFLogger = (force + 99) % 128;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" ");
                        sb2.append(str2);
                        sb2.append("/AppsFlyer_6.14.0 ");
                        sb2.append(join);
                        obj = sb2.toString();
                    }
                    int length = this.AFKeystoreWrapper + (obj.length() << 1);
                    int i2 = AFInAppEventParameterName;
                    boolean z4 = false;
                    if (length > i2) {
                        obj = obj.substring(0, (i2 - this.AFKeystoreWrapper) / 2);
                        z4 = true;
                    }
                    this.valueOf.add(obj);
                    this.AFKeystoreWrapper += obj.length() << 1;
                    if (z4) {
                        this.valueOf.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.AFKeystoreWrapper += 138;
                        force = (AFLogger + 17) % 128;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static boolean AFInAppEventType(String str) {
        AFLogger = (force + 65) % 128;
        if (AFc1tSDK.AFInAppEventType(str)) {
            return true;
        }
        new AFe1zSDK();
        boolean AFInAppEventType = AFe1zSDK.AFInAppEventType(d(), str);
        force = (AFLogger + 115) % 128;
        return AFInAppEventType;
    }

    private boolean AFKeystoreWrapper(String str) {
        if (AFc1tSDK.AFInAppEventType(str)) {
            AFLogger = (force + 85) % 128;
            return true;
        }
        Context context = this.unregisterClient.AFInAppEventType().valueOf.AFKeystoreWrapper;
        boolean equals = str.equals(AFb1uSDK.AFInAppEventType(context, context.getPackageName()));
        AFLogger = (force + 47) % 128;
        return equals;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void values(Throwable th) {
        String message;
        StackTraceElement[] stackTrace;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            AFLogger = (force + 57) % 128;
            message = th.getMessage();
        } else {
            message = cause.getMessage();
        }
        if (cause == null) {
            int i2 = force + 53;
            AFLogger = i2 % 128;
            if (i2 % 2 != 0) {
                stackTrace = th.getStackTrace();
                int i4 = 26 / 0;
            } else {
                stackTrace = th.getStackTrace();
            }
        } else {
            stackTrace = cause.getStackTrace();
            AFLogger = (force + 85) % 128;
        }
        AFInAppEventParameterName("exception", simpleName, AFInAppEventParameterName(message, stackTrace));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r2 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r2 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        return r2.AFInAppEventType;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static AFh1hSDK AFInAppEventType(AFi1zSDK aFi1zSDK) {
        AFh1gSDK aFh1gSDK;
        if (aFi1zSDK != null) {
            int i2 = AFLogger + 5;
            force = i2 % 128;
            if (i2 % 2 == 0) {
                aFh1gSDK = aFi1zSDK.AFInAppEventParameterName;
                int i4 = 1 / 0;
            } else {
                aFh1gSDK = aFi1zSDK.AFInAppEventParameterName;
            }
        }
        int i5 = AFLogger + 5;
        force = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void AFKeystoreWrapper(boolean z4) {
        int i2 = force + 69;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            this.unregisterClient.valueOf().valueOf("participantInProxy", z4);
            throw null;
        }
        this.unregisterClient.valueOf().valueOf("participantInProxy", z4);
        AFLogger = (force + 57) % 128;
    }

    private static boolean values(float f4) {
        double d4 = f4;
        if (d4 >= 1.0d) {
            force = (AFLogger + 79) % 128;
            return true;
        }
        if (d4 > 0.0d) {
            return unregisterClient() <= f4;
        }
        AFLogger = (force + 117) % 128;
        return false;
    }

    private static String[] AFInAppEventParameterName(String str, StackTraceElement[] stackTraceElementArr) {
        int i2 = AFLogger;
        int i4 = i2 + 73;
        force = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (stackTraceElementArr == null) {
            int i5 = i2 + 95;
            force = i5 % 128;
            if (i5 % 2 != 0) {
                return new String[]{str};
            }
            String[] strArr = new String[1];
            strArr[1] = str;
            return strArr;
        }
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        for (int i6 = 1; i6 < stackTraceElementArr.length; i6++) {
            strArr2[i6] = stackTraceElementArr[i6].toString();
        }
        return strArr2;
    }

    private synchronized boolean AFInAppEventParameterName(AFh1hSDK aFh1hSDK, AFh1hSDK aFh1hSDK2) {
        if (aFh1hSDK == null) {
            i();
            force = (AFLogger + 59) % 128;
            return false;
        }
        if (!aFh1hSDK.AFInAppEventParameterName()) {
            int i2 = force + 93;
            AFLogger = i2 % 128;
            if (i2 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (this.unregisterClient.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0) > aFh1hSDK.AFInAppEventType) {
            int i4 = force + 121;
            AFLogger = i4 % 128;
            return i4 % 2 != 0 ? false : false;
        }
        if (!AFKeystoreWrapper(aFh1hSDK, aFh1hSDK2)) {
            return false;
        }
        if (!AFKeystoreWrapper(aFh1hSDK.AFInAppEventParameterName)) {
            int i5 = AFLogger + 13;
            int i6 = i5 % 128;
            force = i6;
            boolean z4 = i5 % 2 == 0;
            AFLogger = (i6 + 113) % 128;
            return z4;
        }
        if (AFInAppEventType(aFh1hSDK.AFLogger)) {
            return true;
        }
        int i7 = AFLogger + 79;
        force = i7 % 128;
        return i7 % 2 == 0 ? false : false;
    }
}
