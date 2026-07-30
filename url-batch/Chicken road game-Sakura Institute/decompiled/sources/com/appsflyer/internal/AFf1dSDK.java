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

/* loaded from: classes3.dex */
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
    private final AFd1sSDK i;

    @Override // com.appsflyer.internal.AFf1lSDK
    protected final void AFInAppEventParameterName(AFa1qSDK aFa1qSDK) {
        int i = 2 % 2;
        int i2 = afRDLog + 3;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    protected final void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        int i = 2 % 2;
        int i2 = afRDLog + 33;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    protected final void values(AFa1qSDK aFa1qSDK) {
        int i = 2 % 2;
        int i2 = afRDLog + 59;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
    }

    public AFf1dSDK(String str, AFd1kSDK aFd1kSDK) {
        super(new AFg1iSDK(aFd1kSDK.w().AFKeystoreWrapper), aFd1kSDK, str);
        this.i = aFd1kSDK.AFInAppEventType();
        this.afInfoLog = aFd1kSDK.w();
        this.force = str;
        this.afDebugLog = aFd1kSDK.e();
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        int i = 2 % 2;
        int i2 = afErrorLog + 65;
        afRDLog = i2 % 128;
        int i3 = i2 % 2;
        super.AFInAppEventType();
        ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
        if (responseNetwork != null) {
            int i4 = afRDLog + 91;
            afErrorLog = i4 % 128;
            int i5 = i4 % 2;
            if (responseNetwork.isSuccessful()) {
                int i6 = afErrorLog + 61;
                afRDLog = i6 % 128;
                int i7 = i6 % 2;
                afInfoLog();
                if (i7 != 0) {
                    throw null;
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    protected final void valueOf(AFa1qSDK aFa1qSDK) {
        int i = 2 % 2;
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
                Object obj = null;
                obj.hashCode();
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
            int i3 = afRDLog + 55;
            afErrorLog = i3 % 128;
            if (i3 % 2 == 0) {
                aFa1qSDK.AFKeystoreWrapper(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                int i4 = 53 / 0;
            } else {
                aFa1qSDK.AFKeystoreWrapper(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            }
        }
        AFb1zSDK AFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName(context.getContentResolver());
        if (AFInAppEventParameterName != null) {
            aFa1qSDK.AFKeystoreWrapper("amazon_aid", AFInAppEventParameterName.AFInAppEventParameterName);
            aFa1qSDK.AFKeystoreWrapper("amazon_aid_limit", String.valueOf(AFInAppEventParameterName.AFKeystoreWrapper));
        }
        aFa1qSDK.AFKeystoreWrapper("devkey", ((AFf1nSDK) this).d.AFLogger);
        aFa1qSDK.AFKeystoreWrapper("uid", AFb1kSDK.valueOf(this.afInfoLog, this.w));
        aFa1qSDK.AFKeystoreWrapper("af_gcm_token", this.force);
        aFa1qSDK.AFKeystoreWrapper("launch_counter", Integer.toString(this.w.valueOf("appsFlyerCount", 0)));
        aFa1qSDK.AFKeystoreWrapper("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String d = this.i.d();
        if (d != null) {
            aFa1qSDK.AFKeystoreWrapper(AppsFlyerProperties.CHANNEL, d);
        }
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    protected final void AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        int i = 2 % 2;
        String AFKeystoreWrapper = this.i.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            int i2 = afErrorLog + 49;
            afRDLog = i2 % 128;
            int i3 = i2 % 2;
            aFa1qSDK.AFKeystoreWrapper("advertiserId", AFKeystoreWrapper);
        }
        int i4 = afErrorLog + 85;
        afRDLog = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFf1lSDK, com.appsflyer.internal.AFf1nSDK
    protected final boolean i() {
        int i = 2 % 2;
        int i2 = afErrorLog + 91;
        afRDLog = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    private void afInfoLog() {
        int i = 2 % 2;
        int i2 = afErrorLog + 109;
        afRDLog = i2 % 128;
        int i3 = i2 % 2;
        this.w.valueOf("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        int i4 = afErrorLog + 69;
        afRDLog = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r1.AFInAppEventParameterName == r1.AFKeystoreWrapper) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        r1.valueOf = r1.AFInAppEventParameterName / r3;
        r1.registerClient = r1.AFInAppEventParameterName % r3;
        r1.values = r1.AFKeystoreWrapper / r3;
        r1.unregisterClient = r1.AFKeystoreWrapper % r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        if (r1.registerClient != r1.unregisterClient) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        r1.valueOf = ((r1.valueOf + r3) - 1) % r3;
        r1.values = ((r1.values + r3) - 1) % r3;
        r8 = (r1.valueOf * r3) + r1.registerClient;
        r9 = (r1.values * r3) + r1.unregisterClient;
        r4[r1.AFInAppEventType] = r2[r8];
        r4[r1.AFInAppEventType + 1] = r2[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00de, code lost:
    
        if (r1.valueOf != r1.values) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e0, code lost:
    
        r1.registerClient = ((r1.registerClient + r3) - 1) % r3;
        r1.unregisterClient = ((r1.unregisterClient + r3) - 1) % r3;
        r8 = (r1.valueOf * r3) + r1.registerClient;
        r9 = (r1.values * r3) + r1.unregisterClient;
        r4[r1.AFInAppEventType] = r2[r8];
        r4[r1.AFInAppEventType + 1] = r2[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0108, code lost:
    
        r8 = (r1.valueOf * r3) + r1.unregisterClient;
        r9 = (r1.values * r3) + r1.registerClient;
        r4[r1.AFInAppEventType] = r2[r8];
        r4[r1.AFInAppEventType + 1] = r2[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        r4[r1.AFInAppEventType] = (char) (r1.AFInAppEventParameterName - r13);
        r4[r1.AFInAppEventType + 1] = (char) (r1.AFKeystoreWrapper - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (r1.AFInAppEventParameterName == r1.AFKeystoreWrapper) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, byte b, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
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
            for (int i4 = 0; i4 < length; i4++) {
                cArr4[i4] = (char) (cArr3[i4] ^ 8472772857875446112L);
            }
            cArr3 = cArr4;
        }
        char c = (char) (8472772857875446112L ^ afWarnLog);
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = $11 + 65;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            aFk1wSDK.AFInAppEventType = 0;
            while (aFk1wSDK.AFInAppEventType < i2) {
                int i7 = $11 + 93;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    aFk1wSDK.AFInAppEventParameterName = cArr2[aFk1wSDK.AFInAppEventType];
                    aFk1wSDK.AFKeystoreWrapper = cArr2[aFk1wSDK.AFInAppEventType];
                } else {
                    aFk1wSDK.AFInAppEventParameterName = cArr2[aFk1wSDK.AFInAppEventType];
                    aFk1wSDK.AFKeystoreWrapper = cArr2[aFk1wSDK.AFInAppEventType + 1];
                }
                aFk1wSDK.AFInAppEventType += 2;
            }
        }
        int i8 = 0;
        while (i8 < i) {
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
}
