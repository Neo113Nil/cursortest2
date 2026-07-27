package com.appsflyer.internal;

import M2.p;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1vSDK;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.json.JSONObject;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1336k;
import y2.InterfaceC1335j;
import z2.C1412P;
import z2.C1441y;

/* loaded from: classes.dex */
public final class AFg1jSDK implements AFg1mSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afErrorLog = 0;
    private static int afVerboseLog = 1;
    private final AFd1vSDK AFInAppEventParameterName;
    private final AFa1bSDK AFInAppEventType;
    private final Context AFKeystoreWrapper;
    private final AFd1qSDK AFLogger;
    private final AFd1pSDK afInfoLog;
    private final InterfaceC1335j afRDLog;

    /* renamed from: d, reason: collision with root package name */
    private final AFg1wSDK f5941d;

    /* renamed from: e, reason: collision with root package name */
    private final AFh1wSDK f5942e;
    private final AFd1lSDK force;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1335j f5943i;
    private final AFh1cSDK registerClient;
    private final AFd1sSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private final AFg1rSDK f5944v;
    private final AFi1sSDK valueOf;
    private final AFi1cSDK values;

    /* renamed from: w, reason: collision with root package name */
    private final AFb1hSDK f5945w;
    private static char[] afDebugLog = {35987, 35999, 35977, 35989, 35983, 35976, 35995, 35986, 35993, 35992, 36022, 35988, 35996, 35982, 36030, 35998};
    private static char afWarnLog = 47460;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFg1jSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends p implements Function0<SimpleDateFormat> {
        public static final AnonymousClass1 values = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFg1jSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends p implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass5 valueOf = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    public AFg1jSDK(Context context, AFi1sSDK aFi1sSDK, AFd1vSDK aFd1vSDK, AFi1cSDK aFi1cSDK, AFa1bSDK aFa1bSDK, AFh1wSDK aFh1wSDK, AFd1qSDK aFd1qSDK, AFd1sSDK aFd1sSDK, AFh1cSDK aFh1cSDK, AFg1wSDK aFg1wSDK, AFb1hSDK aFb1hSDK, AFd1lSDK aFd1lSDK, AFg1rSDK aFg1rSDK, AFd1pSDK aFd1pSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1sSDK, "");
        Intrinsics.checkNotNullParameter(aFd1vSDK, "");
        Intrinsics.checkNotNullParameter(aFi1cSDK, "");
        Intrinsics.checkNotNullParameter(aFa1bSDK, "");
        Intrinsics.checkNotNullParameter(aFh1wSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFh1cSDK, "");
        Intrinsics.checkNotNullParameter(aFg1wSDK, "");
        Intrinsics.checkNotNullParameter(aFb1hSDK, "");
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        this.AFKeystoreWrapper = context;
        this.valueOf = aFi1sSDK;
        this.AFInAppEventParameterName = aFd1vSDK;
        this.values = aFi1cSDK;
        this.AFInAppEventType = aFa1bSDK;
        this.f5942e = aFh1wSDK;
        this.AFLogger = aFd1qSDK;
        this.unregisterClient = aFd1sSDK;
        this.registerClient = aFh1cSDK;
        this.f5941d = aFg1wSDK;
        this.f5945w = aFb1hSDK;
        this.force = aFd1lSDK;
        this.f5944v = aFg1rSDK;
        this.afInfoLog = aFd1pSDK;
        this.f5943i = C1336k.a(AnonymousClass5.valueOf);
        this.afRDLog = C1336k.a(AnonymousClass1.values);
    }

    private final void AFInAppEventParameterName(Map<String, Object> map) {
        try {
            long j4 = this.AFKeystoreWrapper.getPackageManager().getPackageInfo(this.AFKeystoreWrapper.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j4)));
            int i2 = afErrorLog + 19;
            afVerboseLog = i2 % 128;
            if (i2 % 2 == 0) {
                int i4 = 60 / 0;
            }
        } catch (Exception e4) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e4);
        }
    }

    private final AppsFlyerProperties AFKeystoreWrapper() {
        int i2 = afErrorLog + 43;
        afVerboseLog = i2 % 128;
        if (i2 % 2 != 0) {
            return (AppsFlyerProperties) this.f5943i.getValue();
        }
        throw null;
    }

    private static long AFLogger() {
        int i2 = afVerboseLog + 35;
        afErrorLog = i2 % 128;
        return i2 % 2 != 0 ? System.currentTimeMillis() & SystemClock.elapsedRealtime() : System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    private void AFLogger$LogLevel(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFb1zSDK AFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName(this.AFKeystoreWrapper.getContentResolver());
        if (AFInAppEventParameterName != null) {
            afErrorLog = (afVerboseLog + 33) % 128;
            map.put("amazon_aid", AFInAppEventParameterName.AFInAppEventParameterName);
            map.put("amazon_aid_limit", String.valueOf(AFInAppEventParameterName.AFKeystoreWrapper));
            int i2 = afErrorLog + 15;
            afVerboseLog = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    private void AFPurchaseDetails(Map<String, Object> map) {
        int i2 = afErrorLog + 117;
        afVerboseLog = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            String str = this.f5941d.AFLogger;
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.f5941d.AFLogger;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        afVerboseLog = (afErrorLog + 23) % 128;
        map.put("appsflyerKey", str2);
        afVerboseLog = (afErrorLog + 123) % 128;
    }

    private static void a(String str, int i2, byte b4, Object[] objArr) {
        int i4;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1wSDK aFk1wSDK = new AFk1wSDK();
        char[] cArr = afDebugLog;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ 8472772857875446112L);
            }
            $10 = ($11 + 9) % 128;
            cArr = cArr2;
        }
        char c4 = (char) (8472772857875446112L ^ afWarnLog);
        char[] cArr3 = new char[i2];
        if (i2 % 2 != 0) {
            int i6 = $10 + 57;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                i4 = i2 + 103;
                cArr3[i4] = (char) (charArray[i4] / b4);
            } else {
                i4 = i2 - 1;
                cArr3[i4] = (char) (charArray[i4] - b4);
            }
        } else {
            i4 = i2;
        }
        if (i4 > 1) {
            aFk1wSDK.AFInAppEventType = 0;
            while (true) {
                int i7 = aFk1wSDK.AFInAppEventType;
                if (i7 >= i4) {
                    break;
                }
                char c5 = charArray[i7];
                aFk1wSDK.AFInAppEventParameterName = c5;
                char c6 = charArray[i7 + 1];
                aFk1wSDK.AFKeystoreWrapper = c6;
                if (c5 == c6) {
                    cArr3[i7] = (char) (c5 - b4);
                    cArr3[i7 + 1] = (char) (c6 - b4);
                    $11 = ($10 + 9) % 128;
                } else {
                    int i8 = c5 / c4;
                    aFk1wSDK.valueOf = i8;
                    int i9 = c5 % c4;
                    aFk1wSDK.registerClient = i9;
                    int i10 = c6 / c4;
                    aFk1wSDK.values = i10;
                    int i11 = c6 % c4;
                    aFk1wSDK.unregisterClient = i11;
                    if (i9 == i11) {
                        $11 = ($10 + 67) % 128;
                        int i12 = ((i8 + c4) - 1) % c4;
                        aFk1wSDK.valueOf = i12;
                        int i13 = ((i10 + c4) - 1) % c4;
                        aFk1wSDK.values = i13;
                        cArr3[i7] = cArr[(i12 * c4) + i9];
                        cArr3[i7 + 1] = cArr[(i13 * c4) + i11];
                    } else if (i8 == i10) {
                        int i14 = ((i9 + c4) - 1) % c4;
                        aFk1wSDK.registerClient = i14;
                        int i15 = ((i11 + c4) - 1) % c4;
                        aFk1wSDK.unregisterClient = i15;
                        cArr3[i7] = cArr[(i8 * c4) + i14];
                        cArr3[i7 + 1] = cArr[(i10 * c4) + i15];
                    } else {
                        cArr3[i7] = cArr[(i8 * c4) + i11];
                        cArr3[i7 + 1] = cArr[(i10 * c4) + i9];
                    }
                }
                aFk1wSDK.AFInAppEventType = i7 + 2;
            }
        }
        for (int i16 = 0; i16 < i2; i16++) {
            cArr3[i16] = (char) (cArr3[i16] ^ 13722);
        }
        String str2 = new String(cArr3);
        $11 = ($10 + 83) % 128;
        objArr[0] = str2;
    }

    private void afDebugLog(Map<String, Object> map) {
        afErrorLog = (afVerboseLog + 27) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.f5944v.values());
        int i2 = afErrorLog + 117;
        afVerboseLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void afErrorLog(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        try {
            String valueOf = AFb1kSDK.valueOf(this.force, this.AFLogger);
            if (valueOf != null) {
                afErrorLog = (afVerboseLog + 87) % 128;
                map.put("uid", valueOf);
                return;
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("ERROR: could not get uid ");
            sb.append(th.getMessage());
            String obj = sb.toString();
            Intrinsics.checkNotNullExpressionValue(obj, "");
            AFLogger.afErrorLog(obj, th);
        }
        int i2 = afErrorLog + 41;
        afVerboseLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void afErrorLogForExcManagerOnly(Map<String, Object> map) {
        afErrorLog = (afVerboseLog + 45) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (this.AFLogger.values("is_stop_tracking_used")) {
            afVerboseLog = (afErrorLog + 75) % 128;
            map.put("istu", String.valueOf(this.AFLogger.AFInAppEventType("is_stop_tracking_used")));
            afErrorLog = (afVerboseLog + 71) % 128;
        }
    }

    private boolean afInfoLog() {
        afVerboseLog = (afErrorLog + 93) % 128;
        boolean parseBoolean = Boolean.parseBoolean(this.AFLogger.AFKeystoreWrapper("sentSuccessfully", (String) null));
        int i2 = afVerboseLog + 41;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            return parseBoolean;
        }
        throw null;
    }

    private void afLogForce(Map<String, Object> map) {
        int i2 = afErrorLog + 79;
        afVerboseLog = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFLogger.afDebugLog("didConfigureTokenRefreshService=".concat(String.valueOf(AFg1nSDK.AFInAppEventParameterName(this.AFKeystoreWrapper))));
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        boolean AFInAppEventParameterName = AFg1nSDK.AFInAppEventParameterName(this.AFKeystoreWrapper);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=".concat(String.valueOf(AFInAppEventParameterName)));
        if (!AFInAppEventParameterName) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
            afErrorLog = (afVerboseLog + 23) % 128;
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1nSDK.valueOf(this.AFLogger)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if ((r2 % 2) == 0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void afRDLog(Map<String, Object> map) {
        boolean z4;
        String d4;
        String w4;
        String e4;
        afErrorLog = (afVerboseLog + 99) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String d5 = this.unregisterClient.d();
        String values = values(this.AFLogger, d5);
        boolean z5 = true;
        if (values != null) {
            int i2 = afErrorLog + 87;
            afVerboseLog = i2 % 128;
            if (i2 % 2 == 0) {
                values.equals(d5);
                throw null;
            }
            if (!values.equals(d5)) {
                z4 = true;
                if (values == null && d5 != null) {
                    int i4 = afVerboseLog + 117;
                    afErrorLog = i4 % 128;
                }
                z5 = false;
                if (!z4 || z5) {
                    map.put("af_latestchannel", d5);
                }
                d4 = d();
                if (d4 != null) {
                    int i5 = afVerboseLog + 25;
                    afErrorLog = i5 % 128;
                    if (i5 % 2 != 0) {
                        Locale locale = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "");
                        Object lowerCase = d4.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        map.put("af_installstore", lowerCase);
                        throw null;
                    }
                    Locale locale2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "");
                    Object lowerCase2 = d4.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    map.put("af_installstore", lowerCase2);
                }
                w4 = w();
                if (w4 != null) {
                    Locale locale3 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale3, "");
                    Object lowerCase3 = w4.toLowerCase(locale3);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                    map.put("af_preinstall_name", lowerCase3);
                }
                e4 = e();
                if (e4 != null) {
                    afVerboseLog = (afErrorLog + 85) % 128;
                    return;
                }
                Locale locale4 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale4, "");
                Object lowerCase4 = e4.toLowerCase(locale4);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                map.put("af_currentstore", lowerCase4);
                return;
            }
        }
        z4 = false;
        if (values == null) {
            int i42 = afVerboseLog + 117;
            afErrorLog = i42 % 128;
        }
        z5 = false;
        if (!z4) {
        }
        map.put("af_latestchannel", d5);
        d4 = d();
        if (d4 != null) {
        }
        w4 = w();
        if (w4 != null) {
        }
        e4 = e();
        if (e4 != null) {
        }
    }

    private void afVerboseLog(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.EXTENSION);
        if (!(!(string == null || string.length() == 0))) {
            return;
        }
        afErrorLog = (afVerboseLog + 45) % 128;
        map.put(AppsFlyerProperties.EXTENSION, string);
        afVerboseLog = (afErrorLog + 119) % 128;
    }

    private static void afWarnLog(Map<String, Object> map) {
        int i2 = afVerboseLog + 41;
        afErrorLog = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
                int i4 = 37 / 0;
            } else {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
            }
        } catch (Exception e4) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e4);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
            afVerboseLog = (afErrorLog + 117) % 128;
        } catch (Exception e5) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e5);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
        } catch (Exception e6) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e6);
        }
    }

    private void d(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AFKeystoreWrapper().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            int i2 = afVerboseLog + 51;
            afErrorLog = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("onelink_id", string);
                throw null;
            }
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
        int i4 = afErrorLog + 125;
        afVerboseLog = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void e(Map<String, Object> map) {
        afErrorLog = (afVerboseLog + 21) % 128;
        AFd1vSDK.AFa1uSDK AFInAppEventParameterName = this.AFInAppEventParameterName.AFInAppEventParameterName(this.AFKeystoreWrapper);
        float f4 = AFInAppEventParameterName.valueOf;
        String str = AFInAppEventParameterName.values;
        map.put("btl", String.valueOf(f4));
        if (str != null) {
            int i2 = afErrorLog + 43;
            afVerboseLog = i2 % 128;
            int i4 = i2 % 2;
            map.put("btch", str);
            if (i4 == 0) {
                int i5 = 91 / 0;
            }
        }
        int i6 = afVerboseLog + 91;
        afErrorLog = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private final void force(Map<String, Object> map) {
        UiModeManager uiModeManager = (UiModeManager) this.AFKeystoreWrapper.getSystemService(UiModeManager.class);
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        int i2 = afErrorLog + 103;
        afVerboseLog = i2 % 128;
        if (i2 % 2 != 0) {
            map.put("tv", Boolean.TRUE);
        } else {
            map.put("tv", Boolean.TRUE);
            int i4 = 12 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String i() {
        String str;
        int i2 = afErrorLog + 7;
        afVerboseLog = i2 % 128;
        int i4 = i2 % 2;
        try {
        } catch (Exception e4) {
            AFLogger.afErrorLog(e4.getMessage(), e4);
            str = i4;
        }
        if (i4 == 0) {
            this.AFLogger.AFKeystoreWrapper("androidIdCached", (String) null);
            Settings.Secure.getString(this.AFKeystoreWrapper.getContentResolver(), "android_id");
            throw null;
        }
        String AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("androidIdCached", (String) null);
        String string = Settings.Secure.getString(this.AFKeystoreWrapper.getContentResolver(), "android_id");
        str = AFKeystoreWrapper;
        if (string != null) {
            return string;
        }
        if (str == 0) {
            return null;
        }
        afErrorLog = (afVerboseLog + 61) % 128;
        AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(str)));
        return str;
    }

    private boolean registerClient() {
        afErrorLog = (afVerboseLog + 59) % 128;
        if (this.AFLogger.values("appsFlyerCount")) {
            return false;
        }
        int i2 = afVerboseLog + 41;
        afErrorLog = i2 % 128;
        return i2 % 2 == 0;
    }

    private static String unregisterClient() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        StringBuilder sb = new StringBuilder();
        sb.append((long) (availableBlocksLong / pow));
        sb.append('/');
        sb.append((long) (blockCountLong / pow));
        String obj = sb.toString();
        int i2 = afErrorLog + 35;
        afVerboseLog = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    private void v(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        long j4 = this.f5942e.f5956v;
        if (j4 != 0) {
            afErrorLog = (afVerboseLog + 41) % 128;
            map.put("prev_session_dur", Long.valueOf(j4));
            afErrorLog = (afVerboseLog + 63) % 128;
        }
        int i2 = afVerboseLog + 117;
        afErrorLog = i2 % 128;
        if (i2 % 2 != 0) {
            int i4 = 76 / 0;
        }
    }

    private String valueOf() {
        afVerboseLog = (afErrorLog + 125) % 128;
        String AFInAppEventParameterName = AFb1uSDK.AFInAppEventParameterName(this.AFKeystoreWrapper.getApplicationContext().getPackageManager(), this.AFKeystoreWrapper.getApplicationContext().getPackageName());
        int i2 = afErrorLog + 117;
        afVerboseLog = i2 % 128;
        if (i2 % 2 != 0) {
            return AFInAppEventParameterName;
        }
        throw null;
    }

    private final SimpleDateFormat values() {
        afErrorLog = (afVerboseLog + 41) % 128;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.afRDLog.getValue();
        int i2 = afVerboseLog + 111;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        r0 = valueOf("AF_PRE_INSTALL_NAME");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String w() {
        afVerboseLog = (afErrorLog + 63) % 128;
        String string = AFKeystoreWrapper().getString("preInstallName");
        if (string != null) {
            return string;
        }
        if (this.AFLogger.values("preInstallName")) {
            string = this.AFLogger.AFKeystoreWrapper("preInstallName", (String) null);
        } else {
            if (registerClient()) {
                int i2 = afErrorLog + 63;
                afVerboseLog = i2 % 128;
                if (i2 % 2 == 0) {
                    string = v();
                    int i4 = 13 / 0;
                } else {
                    string = v();
                }
            }
            if (string != null) {
                this.AFLogger.AFInAppEventParameterName("preInstallName", string);
            }
        }
        if (string != null) {
            AFKeystoreWrapper().set("preInstallName", string);
        }
        afErrorLog = (afVerboseLog + 27) % 128;
        return string;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType(Map<String, Object> map, boolean z4, Function0<String> function0) {
        afVerboseLog = (afErrorLog + 45) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AFInAppEventParameterName(map);
        AFKeystoreWrapper(map);
        afRDLog(map);
        valueOf(map, z4);
        valueOf(map, function0);
        int i2 = afErrorLog + 45;
        afVerboseLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r1.versionCode > r10.AFLogger.valueOf("versionCode", 0)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AFKeystoreWrapper(Map<String, Object> map) {
        PackageInfo packageInfo;
        int i2 = afErrorLog + 55;
        afVerboseLog = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                packageInfo = this.AFKeystoreWrapper.getPackageManager().getPackageInfo(this.AFKeystoreWrapper.getPackageName(), 0);
                if (packageInfo.versionCode > this.AFLogger.valueOf("versionCode", 1)) {
                    afErrorLog = (afVerboseLog + 117) % 128;
                    this.AFLogger.AFInAppEventParameterName("versionCode", packageInfo.versionCode);
                    afErrorLog = (afVerboseLog + 7) % 128;
                }
                map.put("app_version_code", String.valueOf(packageInfo.versionCode));
                Context context = this.unregisterClient.valueOf.AFKeystoreWrapper;
                map.put("app_version_name", AFb1uSDK.AFInAppEventType(context, context.getPackageName()));
                map.put("targetSDKver", Integer.valueOf(this.unregisterClient.valueOf.AFKeystoreWrapper.getApplicationInfo().targetSdkVersion));
                long j4 = packageInfo.firstInstallTime;
                long j5 = packageInfo.lastUpdateTime;
                map.put("date1", values().format(new Date(j4)));
                map.put("date2", values().format(new Date(j5)));
                Object[] objArr = new Object[1];
                a("\u0000\u0004\u0006\u0001\u000e\t\u0007\u0005\b\t\u0006\u000f\u0005\u000e㘉", TextUtils.getOffsetAfter("", 0) + 15, (byte) (10 - View.resolveSize(0, 0)), objArr);
                String intern = ((String) objArr[0]).intern();
                SimpleDateFormat values = values();
                Intrinsics.checkNotNullExpressionValue(values, "");
                map.put(intern, AFInAppEventParameterName(values));
                return;
            }
            packageInfo = this.AFKeystoreWrapper.getPackageManager().getPackageInfo(this.AFKeystoreWrapper.getPackageName(), 0);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
        AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
    }

    private final void AFLogger(Map<String, Object> map) {
        afErrorLog = (afVerboseLog + 25) % 128;
        if (!AFKeystoreWrapper().isOtherSdkStringDisabled()) {
            map.put("batteryLevel", String.valueOf(this.AFInAppEventParameterName.AFInAppEventParameterName(this.AFKeystoreWrapper).valueOf));
        }
        int i2 = afErrorLog + 13;
        afVerboseLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void afInfoLog(Map<String, Object> map) {
        afVerboseLog = (afErrorLog + 93) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object AFInAppEventType = AFb1cSDK.AFInAppEventType();
        String AFKeystoreWrapper = AFb1cSDK.AFKeystoreWrapper();
        if (AFInAppEventType != null) {
            int i2 = afErrorLog + 31;
            afVerboseLog = i2 % 128;
            if (i2 % 2 == 0) {
                int i4 = 29 / 0;
                if (AFKeystoreWrapper == null) {
                    return;
                }
            } else if (AFKeystoreWrapper == null) {
                return;
            }
            if (Integer.parseInt(AFKeystoreWrapper) > 0) {
                map.put("reinstallCounter", AFKeystoreWrapper);
                map.put("originalAppsflyerId", AFInAppEventType);
                afVerboseLog = (afErrorLog + 99) % 128;
            }
        }
    }

    private static void registerClient(Map<String, Object> map) {
        afVerboseLog = (afErrorLog + 75) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("\r\t\u0007\n㙑", 4 - TextUtils.lastIndexOf("", '0'), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 83), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        afErrorLog = (afVerboseLog + 93) % 128;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf(Map<String, Object> map, int i2, int i4) {
        int i5 = afErrorLog + 57;
        afVerboseLog = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(i2));
            map.put("iaecounter", String.valueOf(i4));
            afInfoLog();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i2));
        map.put("iaecounter", String.valueOf(i4));
        map.put("isFirstCall", String.valueOf(!afInfoLog()));
        afVerboseLog = (afErrorLog + 95) % 128;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void values(AFa1qSDK aFa1qSDK) {
        afVerboseLog = (afErrorLog + 1) % 128;
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        if (aFa1qSDK.AFInAppEventType()) {
            afErrorLog = (afVerboseLog + 39) % 128;
            String str = aFa1qSDK.unregisterClient;
            AFd1pSDK aFd1pSDK = this.afInfoLog;
            AFInAppEventType(aFa1qSDK, str, aFd1pSDK.valueOf, aFd1pSDK.AFInAppEventParameterName);
        } else if (!(aFa1qSDK instanceof AFh1kSDK)) {
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            String str2 = aFa1qSDK.f5849e;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            AFKeystoreWrapper(AFInAppEventParameterName, str2);
            afErrorLog = (afVerboseLog + 41) % 128;
        }
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        AFPurchaseDetails(AFInAppEventParameterName);
        afInfoLog(AFInAppEventParameterName);
        afDebugLog(AFInAppEventParameterName);
        afVerboseLog(AFInAppEventParameterName);
        afErrorLog(AFInAppEventParameterName);
        values(AFInAppEventParameterName, aFa1qSDK.AFInAppEventType());
        afLogForce(AFInAppEventParameterName);
        afErrorLogForExcManagerOnly(AFInAppEventParameterName);
        AFInAppEventParameterName(AFInAppEventParameterName, aFa1qSDK);
        AFInAppEventParameterName.put("af_events_api", "1");
    }

    private final boolean force() {
        if (AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        int i2 = (afVerboseLog + 69) % 128;
        afErrorLog = i2;
        int i4 = i2 + 55;
        afVerboseLog = i4 % 128;
        int i5 = i4 % 2;
        AFb1vSDK.AFKeystoreWrapper();
        if (i5 != 0) {
            return !AFb1vSDK.values(this.AFKeystoreWrapper);
        }
        AFb1vSDK.values(this.AFKeystoreWrapper);
        throw null;
    }

    private final String v() {
        afVerboseLog = (afErrorLog + 109) % 128;
        File AFInAppEventParameterName = AFInAppEventParameterName(AFInAppEventType("ro.appsflyer.preinstall.path"));
        if (AFKeystoreWrapper(AFInAppEventParameterName)) {
            int i2 = afErrorLog + 93;
            afVerboseLog = i2 % 128;
            if (i2 % 2 == 0) {
                AFInAppEventParameterName = AFInAppEventParameterName(valueOf("AF_PRE_INSTALL_PATH"));
                int i4 = 93 / 0;
            } else {
                AFInAppEventParameterName = AFInAppEventParameterName(valueOf("AF_PRE_INSTALL_PATH"));
            }
        }
        if (AFKeystoreWrapper(AFInAppEventParameterName)) {
            int i5 = afVerboseLog + 37;
            afErrorLog = i5 % 128;
            if (i5 % 2 != 0) {
                AFInAppEventParameterName("/data/local/tmp/pre_install.appsflyer");
                throw null;
            }
            AFInAppEventParameterName = AFInAppEventParameterName("/data/local/tmp/pre_install.appsflyer");
        }
        if (AFKeystoreWrapper(AFInAppEventParameterName)) {
            AFInAppEventParameterName = AFInAppEventParameterName("/etc/pre_install.appsflyer");
        }
        if (AFKeystoreWrapper(AFInAppEventParameterName)) {
            return null;
        }
        String packageName = this.AFKeystoreWrapper.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String valueOf = valueOf(AFInAppEventParameterName, packageName);
        int i6 = afVerboseLog + 97;
        afErrorLog = i6 % 128;
        if (i6 % 2 == 0) {
            return valueOf;
        }
        throw null;
    }

    private String d() {
        int i2 = afVerboseLog + 103;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.AFLogger.values("INSTALL_STORE")) {
                int i4 = afVerboseLog + 97;
                afErrorLog = i4 % 128;
                if (i4 % 2 == 0) {
                    return this.AFLogger.AFKeystoreWrapper("INSTALL_STORE", (String) null);
                }
                this.AFLogger.AFKeystoreWrapper("INSTALL_STORE", (String) null);
                throw null;
            }
            String e4 = !(registerClient() ^ true) ? e() : null;
            this.AFLogger.AFInAppEventParameterName("INSTALL_STORE", e4);
            return e4;
        }
        this.AFLogger.values("INSTALL_STORE");
        throw null;
    }

    private String e() {
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            afVerboseLog = (afErrorLog + 55) % 128;
            string = valueOf("AF_STORE");
        }
        afVerboseLog = (afErrorLog + 121) % 128;
        return string;
    }

    private void unregisterClient(Map<String, ? extends Object> map) {
        boolean z4;
        Intrinsics.checkNotNullParameter(map, "");
        AFh1wSDK aFh1wSDK = this.f5942e;
        HashMap hashMap = new HashMap(aFh1wSDK.AFInAppEventType);
        aFh1wSDK.AFInAppEventType.clear();
        this.f5942e.AFInAppEventParameterName.AFKeystoreWrapper("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (hashMap.isEmpty()) {
            afVerboseLog = (afErrorLog + 3) % 128;
            z4 = false;
        } else {
            afErrorLog = (afVerboseLog + 125) % 128;
            z4 = true;
        }
        if (z4) {
            int i2 = afVerboseLog + 85;
            afErrorLog = i2 % 128;
            if (i2 % 2 == 0) {
                Map<String, Object> AFInAppEventParameterName = AFb1vSDK.AFInAppEventParameterName(map);
                Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
                AFInAppEventParameterName.put("gcd", hashMap);
            } else {
                Map<String, Object> AFInAppEventParameterName2 = AFb1vSDK.AFInAppEventParameterName(map);
                Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName2, "");
                AFInAppEventParameterName2.put("gcd", hashMap);
                throw null;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        afErrorLog = (afVerboseLog + 9) % 128;
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        AFInAppEventType(AFInAppEventParameterName, aFa1qSDK.AFInAppEventType());
        registerClient(AFInAppEventParameterName);
        afWarnLog(AFInAppEventParameterName);
        values(AFInAppEventParameterName);
        AFInAppEventParameterName(AFInAppEventParameterName, this.afInfoLog.AFInAppEventType);
        AFLogger$LogLevel(AFInAppEventParameterName);
        AFInAppEventParameterName.put("cell", C1412P.e(new Pair("mcc", Integer.valueOf(this.AFKeystoreWrapper.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.AFKeystoreWrapper.getResources().getConfiguration().mnc))));
        AFInAppEventParameterName.put("sig", valueOf());
        AFInAppEventParameterName.put("last_boot_time", Long.valueOf(AFLogger()));
        AFInAppEventParameterName.put("disk", unregisterClient());
        int i2 = afErrorLog + 81;
        afVerboseLog = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r4 = com.appsflyer.internal.AFg1jSDK.afVerboseLog + 113;
        com.appsflyer.internal.AFg1jSDK.afErrorLog = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if ((r4 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r0 = r0.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r0 = values(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        return java.lang.Long.valueOf(r0.firstInstallTime);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        r0 = r0.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        values(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0023, code lost:
    
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog + 57;
        com.appsflyer.internal.AFg1jSDK.afErrorLog = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005c, code lost:
    
        if ((r0 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        r3 = 73 / 0;
     */
    @Override // com.appsflyer.internal.AFg1mSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Long AFInAppEventParameterName() {
        PackageManager packageManager;
        Context context = this.force.AFKeystoreWrapper;
        if (context != null) {
            int i2 = afVerboseLog + 73;
            afErrorLog = i2 % 128;
            if (i2 % 2 != 0) {
                packageManager = context.getPackageManager();
                int i4 = 92 / 0;
            } else {
                packageManager = context.getPackageManager();
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf(Map<String, Object> map) {
        Object a4;
        AFLogger aFLogger;
        AFg1aSDK aFg1aSDK;
        boolean z4;
        boolean z5;
        String str;
        boolean z6;
        boolean z7;
        int i2;
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.afInfoLog.values;
        if (str2 != null) {
            if (map.get("af_deeplink") != null) {
                int i4 = afVerboseLog + 105;
                afErrorLog = i4 % 128;
                if (i4 % 2 != 0) {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                    throw null;
                }
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                    JSONObject jSONObject = new JSONObject(str2);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    a4 = Unit.f7487a;
                } catch (Throwable th) {
                    AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                    a4 = AbstractC1343r.a(th);
                }
                Throwable a5 = AbstractC1341p.a(a4);
                if (a5 != null) {
                    int i5 = afErrorLog + 71;
                    afVerboseLog = i5 % 128;
                    if (i5 % 2 == 0) {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1aSDK = AFg1aSDK.GENERAL;
                        z4 = false;
                        z5 = true;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z6 = false;
                        z7 = false;
                        i2 = 31;
                    } else {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1aSDK = AFg1aSDK.GENERAL;
                        z4 = false;
                        z5 = false;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z6 = false;
                        z7 = false;
                        i2 = 120;
                    }
                    AFg1fSDK.e$default(aFLogger, aFg1aSDK, str, a5, z6, z7, z4, z5, i2, null);
                }
            }
        }
        this.afInfoLog.values = null;
    }

    private final void i(Map<String, Object> map) {
        if (AFg1dSDK.values(this.AFKeystoreWrapper)) {
            afVerboseLog = (afErrorLog + 115) % 128;
            map.put("inst_app", Boolean.TRUE);
            afErrorLog = (afVerboseLog + 51) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r0 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r0 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004f, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r5 - r0);
        com.appsflyer.internal.AFg1jSDK.afErrorLog = (com.appsflyer.internal.AFg1jSDK.afVerboseLog + 95) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void w(Map<String, Object> map) {
        long values;
        long currentTimeMillis;
        long seconds;
        int i2 = afErrorLog + 59;
        afVerboseLog = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            values = this.AFLogger.values("AppsFlyerTimePassedSincePrevLaunch", 0L);
            currentTimeMillis = System.currentTimeMillis();
            this.AFLogger.AFKeystoreWrapper("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            values = this.AFLogger.values("AppsFlyerTimePassedSincePrevLaunch", 0L);
            currentTimeMillis = System.currentTimeMillis();
            this.AFLogger.AFKeystoreWrapper("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    private String AFInAppEventParameterName(SimpleDateFormat simpleDateFormat) {
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("appsFlyerFirstInstall", (String) null);
        if (AFKeystoreWrapper == null) {
            int i2 = afErrorLog + 3;
            afVerboseLog = i2 % 128;
            if (i2 % 2 != 0) {
                if (registerClient()) {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    AFKeystoreWrapper = simpleDateFormat.format(new Date());
                } else {
                    AFKeystoreWrapper = "";
                }
                this.AFLogger.AFInAppEventParameterName("appsFlyerFirstInstall", AFKeystoreWrapper);
            } else {
                registerClient();
                throw null;
            }
        }
        AFg1fSDK.i$default(AFLogger.INSTANCE, AFg1aSDK.GENERAL, "AppsFlyer: first launch date: ".concat(String.valueOf(AFKeystoreWrapper)), false, 4, null);
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        afErrorLog = (afVerboseLog + 59) % 128;
        return AFKeystoreWrapper;
    }

    private static PackageInfo values(PackageManager packageManager, String str) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        int i2 = afVerboseLog + 59;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0 ? Build.VERSION.SDK_INT >= 33 : Build.VERSION.SDK_INT >= 28) {
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(str, of);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "");
            afVerboseLog = (afErrorLog + 77) % 128;
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 0);
        Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
        return packageInfo2;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf(AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        AFInAppEventParameterName.put("open_referrer", aFa1qSDK.valueOf);
        String str = aFa1qSDK.f5848d;
        if (str != null) {
            int i2 = afErrorLog + 37;
            afVerboseLog = i2 % 128;
            if (i2 % 2 == 0) {
                int i4 = 18 / 0;
                if (y.x(str)) {
                    return;
                }
            } else if (y.x(str)) {
                return;
            }
            int i5 = afVerboseLog + 79;
            afErrorLog = i5 % 128;
            if (i5 % 2 == 0) {
                AFInAppEventParameterName.put("af_web_referrer", aFa1qSDK.f5848d);
            } else {
                AFInAppEventParameterName.put("af_web_referrer", aFa1qSDK.f5848d);
                throw null;
            }
        }
    }

    private void AFInAppEventParameterName(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        if (AFKeystoreWrapper().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i2 = afVerboseLog + 67;
            afErrorLog = i2 % 128;
            if (i2 % 2 == 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                return;
            } else {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                int i4 = 50 / 0;
                return;
            }
        }
        String AFInAppEventParameterName = this.f5941d.AFInAppEventParameterName(this.AFLogger);
        if (AFInAppEventParameterName != null && AFInAppEventParameterName.length() != 0) {
            int i5 = afVerboseLog + 59;
            afErrorLog = i5 % 128;
            if (i5 % 2 != 0) {
                map.put("imei", AFInAppEventParameterName);
                throw null;
            }
            map.put("imei", AFInAppEventParameterName);
        }
        String AFKeystoreWrapper = AFKeystoreWrapper(str);
        if (AFKeystoreWrapper != null) {
            afVerboseLog = (afErrorLog + 49) % 128;
            this.AFLogger.AFInAppEventParameterName("androidIdCached", AFKeystoreWrapper);
            map.put("android_id", AFKeystoreWrapper);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFb1zSDK AFInAppEventType = AFb1rSDK.AFInAppEventType(this.AFKeystoreWrapper);
        if (AFInAppEventType != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = AFInAppEventType.values;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str2 = AFInAppEventType.AFInAppEventParameterName;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            linkedHashMap.put("val", str2);
            Boolean bool2 = AFInAppEventType.AFKeystoreWrapper;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType(Map<String, Object> map) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
            afVerboseLog = (afErrorLog + 21) % 128;
        }
        String string2 = AFKeystoreWrapper().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            int i2 = afVerboseLog + 47;
            afErrorLog = i2 % 128;
            if (i2 % 2 == 0 ? string2.length() != 3 : string2.length() != 3) {
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(string2);
                sb.append("' is not a legal value.");
                String obj = sb.toString();
                Intrinsics.checkNotNullExpressionValue(obj, "");
                AFLogger.afWarnLog(obj);
            }
            map.put("currency", string2);
        }
        String string3 = AFKeystoreWrapper().getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            afErrorLog = (afVerboseLog + 117) % 128;
            map.put("isUpdate", string3);
        }
        String string4 = AFKeystoreWrapper().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        String string5 = AFKeystoreWrapper().getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            map.put("appUserId", string5);
        }
        String string6 = AFKeystoreWrapper().getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        }
        AFd1wSDK aFd1wSDK = this.afInfoLog.AFKeystoreWrapper;
        if (aFd1wSDK != null) {
            int i4 = afVerboseLog + 105;
            afErrorLog = i4 % 128;
            if (i4 % 2 != 0) {
                strArr = aFd1wSDK.AFInAppEventType;
                int i5 = 72 / 0;
                if (strArr == null) {
                    return;
                }
            } else {
                strArr = aFd1wSDK.AFInAppEventType;
                if (strArr == null) {
                    return;
                }
            }
            map.put("sharing_filter", strArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
    
        if (r3.length() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        r7.AFKeystoreWrapper("gaidError", r1.f5952d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        if (r3.length() == 0) goto L22;
     */
    @Override // com.appsflyer.internal.AFg1mSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        boolean z4 = false;
        if (!this.unregisterClient.unregisterClient()) {
            afVerboseLog = (afErrorLog + 111) % 128;
            Map<String, Object> AFInAppEventParameterName = AFb1vSDK.AFInAppEventParameterName(aFa1qSDK.AFInAppEventParameterName());
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            AFInAppEventParameterName.put("ad_ids_disabled", Boolean.TRUE);
        } else {
            AFh1uSDK aFh1uSDK = this.unregisterClient.AFInAppEventType.AFLogger;
            if (aFh1uSDK == null) {
                int i2 = afErrorLog + 91;
                afVerboseLog = i2 % 128;
                if (i2 % 2 == 0) {
                    int i4 = 59 / 0;
                    return;
                }
                return;
            }
            String str = aFh1uSDK.f5952d;
            if (str != null) {
                int i5 = afVerboseLog + 57;
                afErrorLog = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 54 / 0;
                }
            }
            String str2 = aFh1uSDK.AFKeystoreWrapper;
            if (str2 != null && aFh1uSDK.valueOf != null) {
                aFa1qSDK.AFKeystoreWrapper("advertiserId", str2);
                aFa1qSDK.AFKeystoreWrapper("advertiserIdEnabled", String.valueOf(aFh1uSDK.valueOf));
                aFa1qSDK.AFKeystoreWrapper("isGaidWithGps", String.valueOf(aFh1uSDK.AFInAppEventType));
            }
        }
        AFh1uSDK aFh1uSDK2 = this.unregisterClient.AFInAppEventType.AFLogger;
        if (aFh1uSDK2 != null) {
            int i7 = afErrorLog + 41;
            afVerboseLog = i7 % 128;
            if (i7 % 2 != 0) {
                z4 = Intrinsics.a(aFh1uSDK2.registerClient, Boolean.TRUE);
            } else {
                Intrinsics.a(aFh1uSDK2.registerClient, Boolean.TRUE);
                throw null;
            }
        }
        aFa1qSDK.AFKeystoreWrapper("GAID_retry", String.valueOf(z4));
        if (C1441y.e(AFf1zSDK.CONVERSION, AFf1zSDK.LAUNCH).contains(aFa1qSDK.values())) {
            afErrorLog = (afVerboseLog + 7) % 128;
            AFe1mSDK aFe1mSDK = this.afInfoLog.registerClient;
            if (aFe1mSDK != null) {
                Map<String, Object> AFInAppEventParameterName2 = AFb1vSDK.AFInAppEventParameterName(aFa1qSDK.AFInAppEventParameterName());
                Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName2, "");
                AFInAppEventParameterName2.put("fetchAdIdLatency", Long.valueOf(aFe1mSDK.AFKeystoreWrapper));
                return;
            }
        }
        int i8 = afVerboseLog + 55;
        afErrorLog = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    private void values(Map<String, Object> map, boolean z4) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.f5945w.valueOf());
        if (z4) {
            afVerboseLog = (afErrorLog + 75) % 128;
            map.put("platform_extension_v2", this.valueOf.values());
            afVerboseLog = (afErrorLog + 13) % 128;
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void values(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFi1xSDK aFi1xSDK = this.registerClient.valueOf;
        AFi1wSDK AFInAppEventType = aFi1xSDK != null ? aFi1xSDK.AFInAppEventType() : null;
        if (AFInAppEventType == null) {
            afErrorLog = (afVerboseLog + 61) % 128;
            return;
        }
        map.put("network", AFInAppEventType.AFInAppEventParameterName);
        map.put("ivc", Boolean.valueOf(AFInAppEventType.values()));
        if (!(!AFKeystoreWrapper().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false))) {
            return;
        }
        String str = AFInAppEventType.AFKeystoreWrapper;
        if (str != null) {
            map.put("operator", str);
        }
        String str2 = AFInAppEventType.values;
        if (str2 != null) {
            map.put("carrier", str2);
            afErrorLog = (afVerboseLog + 71) % 128;
        }
    }

    private static void valueOf(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            afVerboseLog = (afErrorLog + 125) % 128;
            map.put("phone", str);
            afVerboseLog = (afErrorLog + 81) % 128;
        }
    }

    private static void valueOf(Map<String, Object> map, boolean z4) {
        int i2 = afErrorLog + 71;
        afVerboseLog = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(z4));
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(z4));
        int i4 = afErrorLog + 105;
        afVerboseLog = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void valueOf(Map<String, Object> map, Function0<String> function0) {
        Object invoke;
        afVerboseLog = (afErrorLog + 33) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            int i2 = afErrorLog + 103;
            afVerboseLog = i2 % 128;
            String str = null;
            try {
                if (i2 % 2 == 0) {
                    this.AFKeystoreWrapper.getPackageManager().getApplicationInfo("com.facebook.katana", 1);
                    invoke = function0.invoke();
                } else {
                    this.AFKeystoreWrapper.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                    invoke = function0.invoke();
                }
                str = (String) invoke;
            } catch (PackageManager.NameNotFoundException e4) {
                AFLogger.afErrorLogForExcManagerOnly("com.facebook.katana not found", e4, true);
                AFLogger.afWarnLog("Exception while collecting facebook's attribution ID. ");
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while collecting facebook's attribution ID. ", th);
            }
            if (str != null) {
                afErrorLog = (afVerboseLog + 25) % 128;
                map.put("fb", str);
            }
        }
    }

    private static String values(AFd1qSDK aFd1qSDK, String str) {
        String AFKeystoreWrapper = aFd1qSDK.AFKeystoreWrapper("CACHED_CHANNEL", (String) null);
        if (AFKeystoreWrapper != null) {
            afVerboseLog = (afErrorLog + 39) % 128;
            return AFKeystoreWrapper;
        }
        aFd1qSDK.AFInAppEventParameterName("CACHED_CHANNEL", str);
        afVerboseLog = (afErrorLog + 97) % 128;
        return str;
    }

    private static File AFInAppEventParameterName(String str) {
        if (str == null) {
            return null;
        }
        afErrorLog = (afVerboseLog + 101) % 128;
        try {
            if (y.M(str).toString().length() > 0) {
                afErrorLog = (afVerboseLog + 125) % 128;
                return new File(y.M(str).toString());
            }
            afErrorLog = (afVerboseLog + 79) % 128;
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private final String valueOf(String str) {
        afErrorLog = (afVerboseLog + 3) % 128;
        String AFInAppEventType = this.unregisterClient.AFInAppEventType(str);
        afVerboseLog = (afErrorLog + 73) % 128;
        return AFInAppEventType;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String valueOf(File file, String str) {
        InputStreamReader inputStreamReader;
        int i2;
        int i4 = afVerboseLog;
        afErrorLog = (i4 + 9) % 128;
        try {
            try {
                if (file == null) {
                    int i5 = i4 + 45;
                    afErrorLog = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 9 / 0;
                    }
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
                        } catch (Throwable th) {
                            AFLogger.afErrorLog(th.getMessage(), th);
                        }
                        return property;
                    } catch (FileNotFoundException unused) {
                        StringBuilder sb = new StringBuilder("PreInstall file wasn't found: ");
                        sb.append(file.getAbsolutePath());
                        AFLogger.afDebugLog(sb.toString());
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        i2 = afErrorLog + 97;
                        afVerboseLog = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i7 = 43 / 0;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        i2 = afErrorLog + 97;
                        afVerboseLog = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                        return null;
                    }
                } catch (FileNotFoundException unused2) {
                    inputStreamReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                }
            } catch (Throwable th4) {
                if (inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th5) {
                        AFLogger.afErrorLog(th5.getMessage(), th5);
                    }
                }
                throw th4;
            }
        } catch (Throwable th6) {
            AFLogger.afErrorLog(th6.getMessage(), th6);
        }
    }

    private static void AFInAppEventParameterName(Map<String, Object> map, AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        String str = aFa1qSDK.f5849e;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFa1qSDK.AFInAppEventParameterName;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final long AFInAppEventType() {
        afErrorLog = (afVerboseLog + 23) % 128;
        long currentTimeMillis = System.currentTimeMillis();
        afVerboseLog = (afErrorLog + 51) % 128;
        return currentTimeMillis;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
    
        if (r4.unregisterClient.AFKeystoreWrapper.valueOf("appsFlyerCount", 1) <= 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0063, code lost:
    
        r0.putAll(r4.values.valueOf());
        com.appsflyer.internal.AFg1jSDK.afErrorLog = (com.appsflyer.internal.AFg1jSDK.afVerboseLog + 27) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        if (r4.unregisterClient.AFKeystoreWrapper.valueOf("appsFlyerCount", 0) <= 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFInAppEventType(Map<String, Object> map, boolean z4) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", AFInAppEventType("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", AFInAppEventType("ro.product.cpu.abi2"));
        hashMap.put("arch", AFInAppEventType("os.arch"));
        hashMap.put("build_display_id", AFInAppEventType("ro.build.display.id"));
        if (z4) {
            int i2 = afErrorLog + 5;
            afVerboseLog = i2 % 128;
            if (i2 % 2 == 0) {
                e(hashMap);
            } else {
                e(hashMap);
            }
        }
        hashMap.put("dim", this.AFInAppEventType.valueOf(this.AFKeystoreWrapper));
        map.put("deviceData", hashMap);
    }

    private void AFKeystoreWrapper(Map<String, Object> map, String str) {
        afErrorLog = (afVerboseLog + 43) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("prev_event_name", (String) null);
            if (AFKeystoreWrapper != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.AFLogger.values("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", AFKeystoreWrapper);
                map.put("prev_event", jSONObject);
            }
            this.AFLogger.AFInAppEventParameterName("prev_event_name", str);
            this.AFLogger.AFKeystoreWrapper("prev_event_timestamp", System.currentTimeMillis());
            afVerboseLog = (afErrorLog + 59) % 128;
        } catch (Exception e4) {
            AFLogger.afErrorLog("Error while processing previous event.", e4);
        }
    }

    private void AFInAppEventType(AFa1qSDK aFa1qSDK, String str, String str2, AFc1cSDK aFc1cSDK) {
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        if (aFa1qSDK.values() == AFf1zSDK.CONVERSION) {
            afErrorLog = (afVerboseLog + 115) % 128;
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            AFLogger(AFInAppEventParameterName);
            force(AFInAppEventParameterName);
            i(AFInAppEventParameterName);
            AFb1cSDK.valueOf(this.force, this.AFLogger);
        }
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        w(AFInAppEventParameterName);
        d(AFInAppEventParameterName);
        unregisterClient(AFInAppEventParameterName);
        valueOf(AFInAppEventParameterName, str2);
        AFInAppEventType(AFInAppEventParameterName, str);
        v(AFInAppEventParameterName);
        if (aFc1cSDK != null) {
            aFc1cSDK.values(AFInAppEventParameterName);
            int i2 = afErrorLog + 35;
            afVerboseLog = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r6.length() == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r6.length() == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String AFKeystoreWrapper(String str) {
        int i2 = afVerboseLog + 93;
        afErrorLog = i2 % 128;
        boolean z4 = false;
        if (i2 % 2 == 0 ? AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) : AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, true)) {
            if (str != null) {
                int i4 = afVerboseLog + 11;
                afErrorLog = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 99 / 0;
                }
            }
            z4 = true;
            if (z4) {
                if (force()) {
                    return i();
                }
                return null;
            }
        }
        if (str != null) {
            afVerboseLog = (afErrorLog + 99) % 128;
            return str;
        }
        return null;
    }

    private static boolean AFKeystoreWrapper(File file) {
        int i2 = afErrorLog + 31;
        int i4 = i2 % 128;
        afVerboseLog = i4;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (file == null) {
            return true;
        }
        int i5 = i4 + 65;
        afErrorLog = i5 % 128;
        int i6 = i5 % 2;
        boolean exists = file.exists();
        if (i6 != 0) {
            int i7 = 30 / 0;
            if (!exists) {
                return true;
            }
        } else if (!exists) {
            return true;
        }
        return false;
    }

    private void AFInAppEventType(Map<String, Object> map, String str) {
        afVerboseLog = (afErrorLog + 95) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (!(str == null || str.length() == 0)) {
            map.put("referrer", str);
        }
        String AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("extraReferrers", (String) null);
        if (AFKeystoreWrapper != null) {
            int i2 = afVerboseLog + 93;
            afErrorLog = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("extraReferrers", AFKeystoreWrapper);
                int i4 = 25 / 0;
            } else {
                map.put("extraReferrers", AFKeystoreWrapper);
            }
        }
        String referrer = AFKeystoreWrapper().getReferrer(this.AFLogger);
        if (referrer == null || referrer.length() == 0) {
            afErrorLog = (afVerboseLog + 25) % 128;
            return;
        }
        if (map.get("referrer") == null) {
            int i5 = afVerboseLog + 51;
            afErrorLog = i5 % 128;
            if (i5 % 2 == 0) {
                map.put("referrer", referrer);
            } else {
                map.put("referrer", referrer);
                int i6 = 32 / 0;
            }
        }
    }

    private static String AFInAppEventType(String str) {
        afErrorLog = (afVerboseLog + 73) % 128;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (invoke != null) {
                String str2 = (String) invoke;
                afErrorLog = (afVerboseLog + 35) % 128;
                return str2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }
}
