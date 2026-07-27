package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class AFf1dSDK extends AFf1lSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afErrorLog = 1;
    private static int afRDLog;
    private static char[] afVerboseLog = {47458, 47457, 35995, 47459, 35998, 35976, 35988, 47460, 35992};
    private static char afWarnLog = 47459;
    private final AFg1mSDK afDebugLog;
    private final AFd1lSDK afInfoLog;
    private final String force;

    /* renamed from: i, reason: collision with root package name */
    private final AFd1sSDK f5894i;

    public AFf1dSDK(String str, AFd1kSDK aFd1kSDK) {
        super(new AFg1iSDK(aFd1kSDK.w().AFKeystoreWrapper), aFd1kSDK, str);
        this.f5894i = aFd1kSDK.AFInAppEventType();
        this.afInfoLog = aFd1kSDK.w();
        this.force = str;
        this.afDebugLog = aFd1kSDK.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r8 == r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        r8 = r0.AFInAppEventParameterName;
        r9 = r8 / r2;
        r0.valueOf = r9;
        r8 = r8 % r2;
        r0.registerClient = r8;
        r10 = r0.AFKeystoreWrapper;
        r11 = r10 / r2;
        r0.values = r11;
        r10 = r10 % r2;
        r0.unregisterClient = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r8 != r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        r9 = ((r9 + r2) - 1) % r2;
        r0.valueOf = r9;
        r11 = ((r11 + r2) - 1) % r2;
        r0.values = r11;
        r3[r7] = r1[(r9 * r2) + r8];
        r3[r7 + 1] = r1[(r11 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        if (r9 != r11) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
    
        r8 = ((r8 + r2) - 1) % r2;
        r0.registerClient = r8;
        r10 = ((r10 + r2) - 1) % r2;
        r0.unregisterClient = r10;
        r3[r7] = r1[(r9 * r2) + r8];
        r3[r7 + 1] = r1[(r11 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        r3[r7] = r1[(r9 * r2) + r10];
        r3[r7 + 1] = r1[(r11 * r2) + r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        r3[r7] = (char) (r0.AFInAppEventParameterName - r14);
        r3[r7 + 1] = (char) (r0.AFKeystoreWrapper - r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r8 == r9) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i2, byte b4, Object[] objArr) {
        int i4;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1wSDK aFk1wSDK = new AFk1wSDK();
        char[] cArr3 = afVerboseLog;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr4[i5] = (char) (cArr3[i5] ^ 8472772857875446112L);
            }
            cArr3 = cArr4;
        }
        char c4 = (char) (8472772857875446112L ^ afWarnLog);
        char[] cArr5 = new char[i2];
        if (i2 % 2 != 0) {
            i4 = i2 - 1;
            cArr5[i4] = (char) (cArr2[i4] - b4);
        } else {
            i4 = i2;
        }
        if (i4 > 1) {
            $10 = ($11 + 65) % 128;
            aFk1wSDK.AFInAppEventType = 0;
            while (true) {
                int i6 = aFk1wSDK.AFInAppEventType;
                if (i6 >= i4) {
                    break;
                }
                int i7 = $11 + 93;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    char c5 = cArr2[i6];
                    aFk1wSDK.AFInAppEventParameterName = c5;
                    char c6 = cArr2[i6];
                    aFk1wSDK.AFKeystoreWrapper = c6;
                } else {
                    char c7 = cArr2[i6];
                    aFk1wSDK.AFInAppEventParameterName = c7;
                    char c8 = cArr2[i6 + 1];
                    aFk1wSDK.AFKeystoreWrapper = c8;
                }
                aFk1wSDK.AFInAppEventType = i6 + 2;
            }
        }
        int i8 = 0;
        while (i8 < i2) {
            int i9 = $10 + 9;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr5[i8] = (char) (cArr5[i8] | 7482);
                i8 += 70;
            } else {
                cArr5[i8] = (char) (cArr5[i8] ^ 13722);
                i8++;
            }
        }
        objArr[0] = new String(cArr5);
    }

    private void afInfoLog() {
        afRDLog = (afErrorLog + 109) % 128;
        this.f5910w.valueOf("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        afRDLog = (afErrorLog + 69) % 128;
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void AFInAppEventParameterName(AFa1qSDK aFa1qSDK) {
        afErrorLog = (afRDLog + 3) % 128;
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        int i2 = afRDLog + 33;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        String AFKeystoreWrapper = this.f5894i.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            afRDLog = (afErrorLog + 49) % 128;
            aFa1qSDK.AFKeystoreWrapper("advertiserId", AFKeystoreWrapper);
        }
        afRDLog = (afErrorLog + 85) % 128;
    }

    @Override // com.appsflyer.internal.AFf1lSDK, com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        afRDLog = (afErrorLog + 91) % 128;
        return false;
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void valueOf(AFa1qSDK aFa1qSDK) {
        super.valueOf(aFa1qSDK);
        Context context = this.afInfoLog.AFKeystoreWrapper;
        AFb1vSDK AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper();
        if (context == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (AFKeystoreWrapper.values()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            aFa1qSDK.AFKeystoreWrapper("app_version_code", Integer.toString(packageInfo.versionCode));
            aFa1qSDK.AFKeystoreWrapper("app_version_name", packageInfo.versionName);
            aFa1qSDK.AFKeystoreWrapper("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFa1qSDK.AFKeystoreWrapper("installDate", AFb1vSDK.AFKeystoreWrapper(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        this.afDebugLog.values(aFa1qSDK.AFInAppEventParameterName());
        aFa1qSDK.AFInAppEventParameterName().remove("ivc");
        String valueOf = AFb1vSDK.valueOf();
        if (valueOf != null) {
            int i2 = afRDLog + 9;
            afErrorLog = i2 % 128;
            if (i2 % 2 == 0) {
                aFa1qSDK.AFKeystoreWrapper("appUserId", valueOf);
                throw null;
            }
            aFa1qSDK.AFKeystoreWrapper("appUserId", valueOf);
        }
        try {
            aFa1qSDK.AFKeystoreWrapper("model", Build.MODEL);
            Object[] objArr = new Object[1];
            a("\u0002\b\u0000\b㙅", ((byte) KeyEvent.getModifierMetaStateMask()) + 6, (byte) (71 - View.combineMeasuredStates(0, 0)), objArr);
            aFa1qSDK.AFKeystoreWrapper(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i4 = afRDLog + 55;
            afErrorLog = i4 % 128;
            if (i4 % 2 == 0) {
                aFa1qSDK.AFKeystoreWrapper(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                int i5 = 53 / 0;
            } else {
                aFa1qSDK.AFKeystoreWrapper(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            }
        }
        AFb1zSDK AFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName(context.getContentResolver());
        if (AFInAppEventParameterName != null) {
            aFa1qSDK.AFKeystoreWrapper("amazon_aid", AFInAppEventParameterName.AFInAppEventParameterName);
            aFa1qSDK.AFKeystoreWrapper("amazon_aid_limit", String.valueOf(AFInAppEventParameterName.AFKeystoreWrapper));
        }
        aFa1qSDK.AFKeystoreWrapper("devkey", ((AFf1nSDK) this).f5911d.AFLogger);
        aFa1qSDK.AFKeystoreWrapper("uid", AFb1kSDK.valueOf(this.afInfoLog, this.f5910w));
        aFa1qSDK.AFKeystoreWrapper("af_gcm_token", this.force);
        aFa1qSDK.AFKeystoreWrapper("launch_counter", Integer.toString(this.f5910w.valueOf("appsFlyerCount", 0)));
        aFa1qSDK.AFKeystoreWrapper("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String d4 = this.f5894i.d();
        if (d4 != null) {
            aFa1qSDK.AFKeystoreWrapper(AppsFlyerProperties.CHANNEL, d4);
        }
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void values(AFa1qSDK aFa1qSDK) {
        afErrorLog = (afRDLog + 59) % 128;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        afRDLog = (afErrorLog + 65) % 128;
        super.AFInAppEventType();
        ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
        if (responseNetwork != null) {
            afErrorLog = (afRDLog + 91) % 128;
            if (responseNetwork.isSuccessful()) {
                int i2 = afErrorLog + 61;
                afRDLog = i2 % 128;
                int i4 = i2 % 2;
                afInfoLog();
                if (i4 != 0) {
                    throw null;
                }
            }
        }
    }
}
