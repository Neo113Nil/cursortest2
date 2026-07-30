package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFb1rSDK implements AFb1wSDK {
    private static int afErrorLog = 1;
    private static char[] afInfoLog = {'h', 214, 212, 214, 215};
    private static int afRDLog;
    private List<String> AFInAppEventType = new ArrayList();
    private boolean AFInAppEventParameterName = true;
    private final Map<String, Object> values = new HashMap();
    private String AFLogger = "-1";
    private boolean afDebugLog = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int valueOf = 0;
    private boolean AFKeystoreWrapper = false;

    private synchronized void AFInAppEventParameterName(String str, String str2, String... strArr) {
        String obj;
        if (afInfoLog()) {
            afErrorLog = (afRDLog + 25) % 128;
            if (this.valueOf < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(currentTimeMillis);
                        sb.append(" ");
                        sb.append(Thread.currentThread().getId());
                        sb.append(" _/AppsFlyer_6.12.1 [");
                        sb.append(str);
                        sb.append("] ");
                        sb.append(str2);
                        sb.append(" ");
                        sb.append(join);
                        obj = sb.toString();
                        afErrorLog = (afRDLog + 5) % 128;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" ");
                        sb2.append(str2);
                        sb2.append("/AppsFlyer_6.12.1 ");
                        sb2.append(join);
                        obj = sb2.toString();
                    }
                    this.AFInAppEventType.add(obj);
                    this.valueOf += obj.length() << 1;
                } catch (Throwable unused) {
                }
            }
        }
    }

    private synchronized void AFInAppEventType(String str, PackageManager packageManager, AFe1xSDK aFe1xSDK) {
        try {
            int i = afRDLog + 105;
            afErrorLog = i % 128;
            if (i % 2 == 0) {
                AppsFlyerProperties.getInstance().getString("remote_debug_static_data");
                this.values.clear();
                throw null;
            }
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.values.clear();
            if (string != null) {
                try {
                    this.values.putAll(AFa1rSDK.values(new JSONObject(string)));
                } catch (Throwable unused) {
                }
            } else {
                AFa1dSDK valueOf = AFa1dSDK.valueOf();
                AFKeystoreWrapper(appsFlyerProperties.getString("advertiserId"), aFe1xSDK.valueOf, valueOf.afInfoLog);
                StringBuilder sb = new StringBuilder("6.12.1.");
                sb.append(AFa1dSDK.valueOf);
                valueOf(sb.toString(), valueOf.AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
                try {
                    int i2 = packageManager.getPackageInfo(str, 0).versionCode;
                    values(str, String.valueOf(i2), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                    afErrorLog = (afRDLog + 47) % 128;
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.values).toString());
                afErrorLog = (afRDLog + 97) % 128;
            }
            this.values.put("launch_counter", this.AFLogger);
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3) {
        try {
            afErrorLog = (afRDLog + 107) % 128;
            try {
                Map<String, Object> map = this.values;
                Object[] objArr = new Object[1];
                AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0000", true, new int[]{0, 5, 109, 0}, objArr);
                map.put(((String) objArr[0]).intern(), Build.BRAND);
                this.values.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
                this.values.put("platform", "Android");
                this.values.put("platform_version", Build.VERSION.RELEASE);
                if (str != null && str.length() > 0) {
                    this.values.put("advertiserId", str);
                }
                if (str2 != null && str2.length() > 0) {
                    int i = afErrorLog + 113;
                    afRDLog = i % 128;
                    int i2 = i % 2;
                    Map<String, Object> map2 = this.values;
                    if (i2 != 0) {
                        map2.put("imei", str2);
                        throw null;
                    }
                    map2.put("imei", str2);
                }
                if (str3 != null && str3.length() > 0) {
                    this.values.put("android_id", str3);
                }
            } catch (Throwable unused) {
            }
        } finally {
        }
    }

    private synchronized void afDebugLog() {
        this.AFInAppEventType = new ArrayList();
        this.valueOf = 0;
        afRDLog = (afErrorLog + 65) % 128;
    }

    private boolean afInfoLog() {
        int i = afRDLog;
        int i2 = i + 27;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.afDebugLog;
        if (i3 == 0) {
            throw null;
        }
        if (!z) {
            return false;
        }
        int i4 = i + 37;
        afErrorLog = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.AFInAppEventParameterName;
        if (i5 == 0) {
            throw null;
        }
        if (!z2) {
            afErrorLog = (i + 101) % 128;
            if (!this.AFKeystoreWrapper) {
                return false;
            }
        }
        int i6 = i + 117;
        afErrorLog = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private synchronized Map<String, Object> afRDLog() {
        afRDLog = (afErrorLog + 117) % 128;
        this.values.put("data", this.AFInAppEventType);
        afDebugLog();
        Map<String, Object> map = this.values;
        int i = afErrorLog + 55;
        afRDLog = i % 128;
        if (i % 2 == 0) {
            return map;
        }
        int i2 = 51 / 0;
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r5.length() > 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0020, code lost:
    
        if (r4 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void valueOf(String str, String str2, String str3, String str4) {
        try {
            int i = afErrorLog + 91;
            afRDLog = i % 128;
            int i2 = i % 2;
            Map<String, Object> map = this.values;
            try {
                if (i2 != 0) {
                    map.put("sdk_version", str);
                    int i3 = 62 / 0;
                    if (str2 != null) {
                        if (str2.length() > 0) {
                            afRDLog = (afErrorLog + 5) % 128;
                            this.values.put("devkey", str2);
                            afErrorLog = (afRDLog + 3) % 128;
                        }
                    }
                    if (str3 != null) {
                        int i4 = afErrorLog + 119;
                        afRDLog = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 69 / 0;
                            if (str3.length() > 0) {
                                this.values.put("originalAppsFlyerId", str3);
                                afRDLog = (afErrorLog + 59) % 128;
                            }
                        }
                    }
                    if (str4 != null && str4.length() > 0) {
                        int i6 = afErrorLog + 7;
                        afRDLog = i6 % 128;
                        int i7 = i6 % 2;
                        Map<String, Object> map2 = this.values;
                        if (i7 != 0) {
                            map2.put("uid", str4);
                            int i8 = 21 / 0;
                        } else {
                            map2.put("uid", str4);
                        }
                    }
                } else {
                    map.put("sdk_version", str);
                }
            } catch (Throwable unused) {
                return;
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r5.length() > 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void values(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                afErrorLog = (afRDLog + 5) % 128;
                try {
                    if (str.length() > 0) {
                        afErrorLog = (afRDLog + 65) % 128;
                        this.values.put("app_id", str);
                    }
                } catch (Throwable unused) {
                    return;
                }
            } finally {
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.values.put("app_version", str2);
        }
        if (str3 != null) {
            int i = afErrorLog + 33;
            afRDLog = i % 128;
            if (i % 2 != 0) {
                int i2 = 57 / 0;
                if (str3.length() > 0) {
                    afErrorLog = (afRDLog + 53) % 128;
                    this.values.put(AppsFlyerProperties.CHANNEL, str3);
                }
            }
        }
        if (str4 != null && str4.length() > 0) {
            this.values.put("preInstall", str4);
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final boolean afErrorLog() {
        int i = afRDLog;
        int i2 = i + 39;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.AFKeystoreWrapper;
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        int i5 = i + 59;
        afErrorLog = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void values(String str, int i, String str2) {
        int i2 = afRDLog + 81;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            String[] strArr = new String[5];
            strArr[1] = String.valueOf(i);
            strArr[0] = str2;
            AFInAppEventParameterName("server_response", str, strArr);
        } else {
            AFInAppEventParameterName("server_response", str, String.valueOf(i), str2);
        }
        int i3 = afRDLog + 69;
        afErrorLog = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void values() {
        int i = afRDLog + 93;
        afErrorLog = i % 128;
        this.afDebugLog = i % 2 == 0;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void AFKeystoreWrapper() {
        this.AFKeystoreWrapper = true;
        AFInAppEventParameterName("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        int i = afErrorLog + 87;
        afRDLog = i % 128;
        if (i % 2 != 0) {
            int i2 = 25 / 0;
        }
    }

    private static String[] AFKeystoreWrapper(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            int i = afRDLog + 35;
            afErrorLog = i % 128;
            if (i % 2 != 0) {
                return new String[]{str};
            }
            String[] strArr = new String[0];
            strArr[1] = str;
            return strArr;
        }
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        afErrorLog = (afRDLog + 75) % 128;
        for (int i2 = 1; i2 < stackTraceElementArr.length; i2++) {
            afErrorLog = (afRDLog + 119) % 128;
            strArr2[i2] = stackTraceElementArr[i2].toString();
        }
        return strArr2;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void valueOf() {
        AFInAppEventParameterName("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.AFKeystoreWrapper = false;
        this.AFInAppEventParameterName = false;
        int i = afErrorLog + 39;
        afRDLog = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void valueOf(String str, String str2) {
        int i = afRDLog + 77;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            AFInAppEventParameterName("server_request", str, strArr);
        } else {
            AFInAppEventParameterName("server_request", str, str2);
        }
        int i2 = afErrorLog + 115;
        afRDLog = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        r2 = r5.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        r2 = r0.getMessage();
     */
    @Override // com.appsflyer.internal.AFb1wSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFInAppEventParameterName(Throwable th) {
        Throwable cause;
        String simpleName;
        String message;
        StackTraceElement[] stackTrace;
        int i = afRDLog + 115;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            cause = th.getCause();
            simpleName = th.getClass().getSimpleName();
            int i2 = 96 / 0;
        } else {
            cause = th.getCause();
            simpleName = th.getClass().getSimpleName();
        }
        if (cause == null) {
            int i3 = afErrorLog + 125;
            afRDLog = i3 % 128;
            if (i3 % 2 == 0) {
                stackTrace = th.getStackTrace();
            } else {
                th.getStackTrace();
                throw null;
            }
        } else {
            stackTrace = cause.getStackTrace();
        }
        AFInAppEventParameterName("exception", simpleName, AFKeystoreWrapper(message, stackTrace));
        afErrorLog = (afRDLog + 27) % 128;
    }

    private Map<String, Object> AFInAppEventParameterName(String str, PackageManager packageManager, AFc1zSDK aFc1zSDK) {
        afErrorLog = (afRDLog + 75) % 128;
        AFInAppEventType(str, packageManager, aFc1zSDK.AFVersionDeclaration());
        Map<String, Object> afRDLog2 = afRDLog();
        int i = afRDLog + 65;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            return afRDLog2;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void AFInAppEventParameterName() {
        int i = afRDLog + 29;
        afErrorLog = i % 128;
        int i2 = i % 2;
        this.AFInAppEventParameterName = false;
        afDebugLog();
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
                System.arraycopy(afInfoLog, i, cArr, 0, i2);
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

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void AFInAppEventType() {
        try {
            int i = afRDLog + 3;
            afErrorLog = i % 128;
            int i2 = i % 2;
            Map<String, Object> map = this.values;
            if (i2 == 0) {
                map.clear();
                this.AFInAppEventType.clear();
                this.valueOf = 1;
            } else {
                map.clear();
                this.AFInAppEventType.clear();
                this.valueOf = 0;
            }
            afRDLog = (afErrorLog + 123) % 128;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void AFInAppEventType(String str, PackageManager packageManager, AFc1zSDK aFc1zSDK) {
        try {
            AFd1dSDK aFd1dSDK = new AFd1dSDK(AFInAppEventParameterName(str, packageManager, aFc1zSDK), aFc1zSDK);
            AFd1tSDK level = aFc1zSDK.getLevel();
            level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1dSDK));
            int i = afErrorLog + 57;
            afRDLog = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void AFInAppEventType(String str, String... strArr) {
        int i = afErrorLog + 11;
        afRDLog = i % 128;
        int i2 = i % 2;
        AFInAppEventParameterName("public_api_call", str, strArr);
        if (i2 != 0) {
            throw null;
        }
        afRDLog = (afErrorLog + 103) % 128;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void AFInAppEventType(String str, String str2) {
        int i = afErrorLog + 23;
        afRDLog = i % 128;
        if (i % 2 == 0) {
            AFInAppEventParameterName((String) null, str, str2);
            return;
        }
        String[] strArr = new String[0];
        strArr[0] = str2;
        AFInAppEventParameterName((String) null, str, strArr);
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void AFInAppEventType(String str) {
        try {
            int i = afErrorLog + 109;
            int i2 = i % 128;
            afRDLog = i2;
            if (i % 2 != 0) {
                this.AFLogger = str;
                int i3 = 77 / 0;
            } else {
                this.AFLogger = str;
            }
            int i4 = i2 + 113;
            afErrorLog = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
