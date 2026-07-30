package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.google.firebase.messaging.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Typography;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1rSDK implements AFb1wSDK {
    private static int afErrorLog = 1;
    private static char[] afInfoLog = {'h', 214, 212, 214, Typography.times};
    private static int afRDLog;
    private List<String> AFInAppEventType = new ArrayList();
    private boolean AFInAppEventParameterName = true;
    private final Map<String, Object> values = new HashMap();
    private String AFLogger = "-1";
    private boolean afDebugLog = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int valueOf = 0;
    private boolean AFKeystoreWrapper = false;

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void AFInAppEventType(String str) {
        int i = 2 % 2;
        int i2 = afErrorLog + 109;
        int i3 = i2 % 128;
        afRDLog = i3;
        if (i2 % 2 != 0) {
            this.AFLogger = str;
            int i4 = 77 / 0;
        } else {
            this.AFLogger = str;
        }
        int i5 = i3 + 113;
        afErrorLog = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void AFKeystoreWrapper() {
        int i = 2 % 2;
        this.AFKeystoreWrapper = true;
        AFInAppEventParameterName("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        int i2 = afErrorLog + 87;
        afRDLog = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void valueOf() {
        int i = 2 % 2;
        AFInAppEventParameterName("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.AFKeystoreWrapper = false;
        this.AFInAppEventParameterName = false;
        int i2 = afErrorLog + 39;
        afRDLog = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void AFInAppEventType() {
        int i = 2 % 2;
        int i2 = afRDLog + 3;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            this.values.clear();
            this.AFInAppEventType.clear();
            this.valueOf = 1;
        } else {
            this.values.clear();
            this.AFInAppEventType.clear();
            this.valueOf = 0;
        }
        int i3 = afErrorLog + 123;
        afRDLog = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void AFInAppEventType(String str, PackageManager packageManager, AFc1zSDK aFc1zSDK) {
        int i = 2 % 2;
        try {
            AFd1dSDK aFd1dSDK = new AFd1dSDK(AFInAppEventParameterName(str, packageManager, aFc1zSDK), aFc1zSDK);
            AFd1tSDK level = aFc1zSDK.getLevel();
            level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1dSDK));
            int i2 = afErrorLog + 57;
            afRDLog = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    private Map<String, Object> AFInAppEventParameterName(String str, PackageManager packageManager, AFc1zSDK aFc1zSDK) {
        int i = 2 % 2;
        int i2 = afRDLog + 75;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType(str, packageManager, aFc1zSDK.AFVersionDeclaration());
        Map<String, Object> afRDLog2 = afRDLog();
        int i4 = afRDLog + 65;
        afErrorLog = i4 % 128;
        if (i4 % 2 != 0) {
            return afRDLog2;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    private boolean afInfoLog() {
        int i = 2 % 2;
        int i2 = afRDLog;
        int i3 = i2 + 27;
        afErrorLog = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (!this.afDebugLog) {
            return false;
        }
        int i4 = i2 + 37;
        afErrorLog = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (!this.AFInAppEventParameterName) {
            int i5 = i2 + 101;
            afErrorLog = i5 % 128;
            int i6 = i5 % 2;
            if (!this.AFKeystoreWrapper) {
                return false;
            }
        }
        int i7 = i2 + 117;
        afErrorLog = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = afRDLog + 107;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        try {
            Map<String, Object> map = this.values;
            Object[] objArr = new Object[1];
            AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0000", true, new int[]{0, 5, 109, 0}, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.values.put("model", Build.MODEL);
            this.values.put("platform", "Android");
            this.values.put("platform_version", Build.VERSION.RELEASE);
            if (str != null && str.length() > 0) {
                this.values.put("advertiserId", str);
            }
            if (str2 != null && str2.length() > 0) {
                int i4 = afErrorLog + 113;
                afRDLog = i4 % 128;
                if (i4 % 2 != 0) {
                    this.values.put("imei", str2);
                    throw null;
                }
                this.values.put("imei", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.values.put("android_id", str3);
                int i5 = 2 % 2;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r6.length() > 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0024, code lost:
    
        if (r5 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void valueOf(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = afErrorLog + 91;
        afRDLog = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.values.put("sdk_version", str);
                int i3 = 62 / 0;
                if (str2 != null) {
                    if (str2.length() > 0) {
                        int i4 = afErrorLog + 5;
                        afRDLog = i4 % 128;
                        int i5 = i4 % 2;
                        this.values.put("devkey", str2);
                        int i6 = afRDLog + 3;
                        afErrorLog = i6 % 128;
                        int i7 = i6 % 2;
                        int i8 = 2 % 2;
                    }
                }
                if (str3 != null) {
                    int i9 = afErrorLog + 119;
                    afRDLog = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 69 / 0;
                        if (str3.length() > 0) {
                            this.values.put("originalAppsFlyerId", str3);
                            int i11 = afErrorLog + 59;
                            afRDLog = i11 % 128;
                            if (i11 % 2 == 0) {
                                int i12 = 2 % 2;
                            }
                        }
                    }
                }
                if (str4 != null && str4.length() > 0) {
                    int i13 = afErrorLog + 7;
                    afRDLog = i13 % 128;
                    if (i13 % 2 != 0) {
                        this.values.put("uid", str4);
                        int i14 = 21 / 0;
                    } else {
                        this.values.put("uid", str4);
                    }
                }
            } else {
                this.values.put("sdk_version", str);
            }
        } catch (Throwable unused) {
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (r6.length() > 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void values(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        if (str != null) {
            int i2 = afRDLog + 5;
            afErrorLog = i2 % 128;
            int i3 = i2 % 2;
            try {
                if (str.length() > 0) {
                    int i4 = afRDLog + 65;
                    afErrorLog = i4 % 128;
                    int i5 = i4 % 2;
                    this.values.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.values.put("app_version", str2);
        }
        if (str3 != null) {
            int i6 = afErrorLog + 33;
            afRDLog = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 57 / 0;
                if (str3.length() > 0) {
                    int i8 = afRDLog + 53;
                    afErrorLog = i8 % 128;
                    int i9 = i8 % 2;
                    this.values.put(AppsFlyerProperties.CHANNEL, str3);
                }
            }
        }
        if (str4 != null && str4.length() > 0) {
            this.values.put("preInstall", str4);
            int i10 = 2 % 2;
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void AFInAppEventType(String str, String... strArr) {
        int i = 2 % 2;
        int i2 = afErrorLog + 11;
        afRDLog = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName("public_api_call", str, strArr);
        if (i3 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = afErrorLog + 103;
        afRDLog = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r3 = r6.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        r3 = r1.getMessage();
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
        int i = 2 % 2;
        int i2 = afRDLog + 115;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            cause = th.getCause();
            simpleName = th.getClass().getSimpleName();
            int i3 = 96 / 0;
        } else {
            cause = th.getCause();
            simpleName = th.getClass().getSimpleName();
        }
        if (cause == null) {
            int i4 = afErrorLog + 125;
            afRDLog = i4 % 128;
            if (i4 % 2 != 0) {
                th.getStackTrace();
                throw null;
            }
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
        }
        AFInAppEventParameterName("exception", simpleName, AFKeystoreWrapper(message, stackTrace));
        int i5 = afRDLog + 27;
        afErrorLog = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void valueOf(String str, String str2) {
        int i = 2 % 2;
        int i2 = afRDLog + 77;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            AFInAppEventParameterName("server_request", str, strArr);
        } else {
            AFInAppEventParameterName("server_request", str, str2);
        }
        int i3 = afErrorLog + 115;
        afRDLog = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void values(String str, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = afRDLog + 81;
        afErrorLog = i3 % 128;
        if (i3 % 2 == 0) {
            String[] strArr = new String[5];
            strArr[1] = String.valueOf(i);
            strArr[0] = str2;
            AFInAppEventParameterName("server_response", str, strArr);
        } else {
            AFInAppEventParameterName("server_response", str, String.valueOf(i), str2);
        }
        int i4 = afRDLog + 69;
        afErrorLog = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void AFInAppEventType(String str, String str2) {
        int i = 2 % 2;
        int i2 = afErrorLog + 23;
        afRDLog = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName((String) null, str, str2);
            return;
        }
        String[] strArr = new String[0];
        strArr[0] = str2;
        AFInAppEventParameterName((String) null, str, strArr);
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String... strArr) {
        String obj;
        int i = 2 % 2;
        if (afInfoLog()) {
            int i2 = afRDLog + 25;
            afErrorLog = i2 % 128;
            int i3 = i2 % 2;
            if (this.valueOf < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        obj = new StringBuilder().append(currentTimeMillis).append(" ").append(Thread.currentThread().getId()).append(" _/AppsFlyer_6.12.1 [").append(str).append("] ").append(str2).append(" ").append(join).toString();
                        int i4 = afRDLog + 5;
                        afErrorLog = i4 % 128;
                        int i5 = i4 % 2;
                        int i6 = 2 % 2;
                    } else {
                        obj = new StringBuilder().append(currentTimeMillis).append(" ").append(Thread.currentThread().getId()).append(" ").append(str2).append("/AppsFlyer_6.12.1 ").append(join).toString();
                    }
                    this.AFInAppEventType.add(obj);
                    this.valueOf += obj.length() << 1;
                } catch (Throwable unused) {
                }
            }
        }
    }

    private synchronized Map<String, Object> afRDLog() {
        int i = 2 % 2;
        int i2 = afErrorLog + 117;
        afRDLog = i2 % 128;
        int i3 = i2 % 2;
        this.values.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.AFInAppEventType);
        afDebugLog();
        Map<String, Object> map = this.values;
        int i4 = afErrorLog + 55;
        afRDLog = i4 % 128;
        if (i4 % 2 == 0) {
            return map;
        }
        int i5 = 51 / 0;
        return map;
    }

    private synchronized void AFInAppEventType(String str, PackageManager packageManager, AFe1xSDK aFe1xSDK) {
        int i = 2 % 2;
        int i2 = afRDLog + 105;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
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
            valueOf(new StringBuilder("6.12.1.").append(AFa1dSDK.valueOf).toString(), valueOf.AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                int i3 = packageManager.getPackageInfo(str, 0).versionCode;
                values(str, String.valueOf(i3), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                int i4 = afRDLog + 47;
                afErrorLog = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.values).toString());
            int i7 = afRDLog + 97;
            afErrorLog = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        }
        this.values.put("launch_counter", this.AFLogger);
    }

    private static String[] AFKeystoreWrapper(String str, StackTraceElement[] stackTraceElementArr) {
        int i = 2 % 2;
        if (stackTraceElementArr == null) {
            int i2 = afRDLog + 35;
            afErrorLog = i2 % 128;
            if (i2 % 2 != 0) {
                return new String[]{str};
            }
            String[] strArr = new String[0];
            strArr[1] = str;
            return strArr;
        }
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        int i3 = afRDLog + 75;
        afErrorLog = i3 % 128;
        int i4 = i3 % 2;
        for (int i5 = 1; i5 < stackTraceElementArr.length; i5++) {
            int i6 = afRDLog + 119;
            afErrorLog = i6 % 128;
            int i7 = i6 % 2;
            strArr2[i5] = stackTraceElementArr[i5].toString();
        }
        return strArr2;
    }

    private synchronized void afDebugLog() {
        int i = 2 % 2;
        this.AFInAppEventType = new ArrayList();
        this.valueOf = 0;
        int i2 = afErrorLog + 65;
        afRDLog = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void AFInAppEventParameterName() {
        int i = 2 % 2;
        int i2 = afRDLog + 29;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            this.AFInAppEventParameterName = false;
        } else {
            this.AFInAppEventParameterName = false;
        }
        afDebugLog();
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void values() {
        int i = 2 % 2;
        int i2 = afRDLog + 93;
        afErrorLog = i2 % 128;
        this.afDebugLog = i2 % 2 == 0;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final boolean afErrorLog() {
        int i = 2 % 2;
        int i2 = afRDLog;
        int i3 = i2 + 39;
        afErrorLog = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.AFKeystoreWrapper;
        if (i4 == 0) {
            int i5 = 15 / 0;
        }
        int i6 = i2 + 59;
        afErrorLog = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    private static void AFInAppEventParameterName(String str, boolean z, int[] iArr, Object[] objArr) {
        String str2;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        synchronized (AFg1mSDK.AFInAppEventType) {
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
                while (AFg1mSDK.AFKeystoreWrapper < i2) {
                    if (bArr2[AFg1mSDK.AFKeystoreWrapper] == 1) {
                        cArr2[AFg1mSDK.AFKeystoreWrapper] = (char) (((cArr[AFg1mSDK.AFKeystoreWrapper] << 1) + 1) - c);
                    } else {
                        cArr2[AFg1mSDK.AFKeystoreWrapper] = (char) ((cArr[AFg1mSDK.AFKeystoreWrapper] << 1) - c);
                    }
                    c = cArr2[AFg1mSDK.AFKeystoreWrapper];
                    AFg1mSDK.AFKeystoreWrapper++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                AFg1mSDK.AFKeystoreWrapper = 0;
                while (AFg1mSDK.AFKeystoreWrapper < i2) {
                    cArr4[AFg1mSDK.AFKeystoreWrapper] = cArr[(i2 - AFg1mSDK.AFKeystoreWrapper) - 1];
                    AFg1mSDK.AFKeystoreWrapper++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                AFg1mSDK.AFKeystoreWrapper = 0;
                while (AFg1mSDK.AFKeystoreWrapper < i2) {
                    cArr[AFg1mSDK.AFKeystoreWrapper] = (char) (cArr[AFg1mSDK.AFKeystoreWrapper] - iArr[2]);
                    AFg1mSDK.AFKeystoreWrapper++;
                }
            }
            str2 = new String(cArr);
        }
        objArr[0] = str2;
    }
}
