package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.AFg1ySDK;
import defpackage.ae0;
import defpackage.ee0;
import defpackage.hk0;
import defpackage.i31;
import defpackage.ik0;
import defpackage.j31;
import defpackage.k31;
import defpackage.pc0;
import defpackage.qy0;
import defpackage.ry0;
import defpackage.zh;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFg1tSDK implements AFg1vSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char AFInAppEventType = 63402;
    private static char AFKeystoreWrapper = 61739;
    private static char AFLogger = 47673;
    private static int i = 1;
    private static char registerClient = 16862;
    private static int unregisterClient;
    private final Context AFAdRevenueData;
    private final ae0 AFInAppEventParameterName;
    private final AFc1jSDK areAllFieldsValid;
    private final AFg1uSDK component1;
    private final AFh1uSDK component2;
    private final AFc1kSDK component3;
    private final AFi1xSDK component4;
    private final AFg1zSDK copy;
    private final ae0 copydefault;
    private final AFc1gSDK equals;
    private final AFj1oSDK getCurrencyIso4217Code;
    private final AFi1lSDK getMediationNetwork;
    private final String getMonetizationNetwork;
    private final AFg1ySDK getRevenue;
    private final AFc1fSDK hashCode;
    private final AFf1kSDK toString;

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/AppsFlyerProperties;", "getMediationNetwork", "()Lcom/appsflyer/AppsFlyerProperties;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1tSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends pc0 implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass3 AFAdRevenueData = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/text/SimpleDateFormat;", "getCurrencyIso4217Code", "()Ljava/text/SimpleDateFormat;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1tSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends pc0 implements Function0<SimpleDateFormat> {
        public static final AnonymousClass4 getCurrencyIso4217Code = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    public AFg1tSDK(String str, Context context, AFi1lSDK aFi1lSDK, AFg1ySDK aFg1ySDK, AFj1oSDK aFj1oSDK, AFg1uSDK aFg1uSDK, AFh1uSDK aFh1uSDK, AFc1jSDK aFc1jSDK, AFc1kSDK aFc1kSDK, AFi1xSDK aFi1xSDK, AFf1kSDK aFf1kSDK, AFc1fSDK aFc1fSDK, AFg1zSDK aFg1zSDK, AFc1gSDK aFc1gSDK) {
        str.getClass();
        context.getClass();
        aFi1lSDK.getClass();
        aFg1ySDK.getClass();
        aFj1oSDK.getClass();
        aFg1uSDK.getClass();
        aFh1uSDK.getClass();
        aFc1jSDK.getClass();
        aFc1kSDK.getClass();
        aFi1xSDK.getClass();
        aFf1kSDK.getClass();
        aFc1fSDK.getClass();
        aFg1zSDK.getClass();
        aFc1gSDK.getClass();
        this.getMonetizationNetwork = str;
        this.AFAdRevenueData = context;
        this.getMediationNetwork = aFi1lSDK;
        this.getRevenue = aFg1ySDK;
        this.getCurrencyIso4217Code = aFj1oSDK;
        this.component1 = aFg1uSDK;
        this.component2 = aFh1uSDK;
        this.areAllFieldsValid = aFc1jSDK;
        this.component3 = aFc1kSDK;
        this.component4 = aFi1xSDK;
        this.toString = aFf1kSDK;
        this.hashCode = aFc1fSDK;
        this.copy = aFg1zSDK;
        this.equals = aFc1gSDK;
        this.copydefault = ee0.b(AnonymousClass3.AFAdRevenueData);
        this.AFInAppEventParameterName = ee0.b(AnonymousClass4.getCurrencyIso4217Code);
    }

    private void AFAdRevenueData(Map<String, Object> map, String str) {
        map.getClass();
        if (getRevenue().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i2 = unregisterClient + 121;
            i = i2 % 128;
            if (i2 % 2 != 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                return;
            } else {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                throw null;
            }
        }
        String revenue = this.toString.getRevenue(this.areAllFieldsValid);
        if (revenue != null && revenue.length() != 0) {
            int i3 = unregisterClient + 105;
            i = i3 % 128;
            if (i3 % 2 == 0) {
                map.put("imei", revenue);
                throw null;
            }
            map.put("imei", revenue);
        }
        String currencyIso4217Code = getCurrencyIso4217Code(str);
        if (currencyIso4217Code != null) {
            i = (unregisterClient + 71) % 128;
            this.areAllFieldsValid.getMediationNetwork("androidIdCached", currencyIso4217Code);
            map.put("android_id", currencyIso4217Code);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFb1mSDK revenue2 = AFb1jSDK.getRevenue(this.AFAdRevenueData);
        if (revenue2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = revenue2.getCurrencyIso4217Code;
            bool.getClass();
            linkedHashMap.put("isManual", bool);
            String str2 = revenue2.getRevenue;
            str2.getClass();
            linkedHashMap.put("val", str2);
            Boolean bool2 = revenue2.getMonetizationNetwork;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
        }
    }

    private void AFInAppEventParameterName(Map<String, Object> map) {
        long j;
        int i2 = unregisterClient + 69;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            map.getClass();
            j = this.component2.equals;
            if (j == 0) {
                return;
            }
        } else {
            map.getClass();
            j = this.component2.equals;
            if (j == 0) {
                return;
            }
        }
        unregisterClient = (i + 123) % 128;
        map.put("prev_session_dur", Long.valueOf(j));
    }

    private void AFInAppEventType(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, 381318277, -381318268, System.identityHashCode(this));
    }

    private final String AFKeystoreWrapper() {
        File file = (File) getCurrencyIso4217Code(new Object[]{getRevenue("ro.appsflyer.preinstall.path")}, -1713193942, 1713193943, (int) System.currentTimeMillis());
        if (getRevenue(file)) {
            int i2 = unregisterClient + 55;
            i = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            file = (File) getCurrencyIso4217Code(new Object[]{getMediationNetwork("AF_PRE_INSTALL_PATH")}, -1713193942, 1713193943, (int) System.currentTimeMillis());
        }
        if (getRevenue(file)) {
            file = (File) getCurrencyIso4217Code(new Object[]{"/data/local/tmp/pre_install.appsflyer"}, -1713193942, 1713193943, (int) System.currentTimeMillis());
            unregisterClient = (i + 121) % 128;
        }
        if (getRevenue(file)) {
            file = (File) getCurrencyIso4217Code(new Object[]{"/etc/pre_install.appsflyer"}, -1713193942, 1713193943, (int) System.currentTimeMillis());
            i = (unregisterClient + 111) % 128;
        }
        if (!getRevenue(file)) {
            String packageName = this.AFAdRevenueData.getPackageName();
            packageName.getClass();
            return (String) getCurrencyIso4217Code(new Object[]{file, packageName}, 1094427933, -1094427925, (int) System.currentTimeMillis());
        }
        int i3 = i + 113;
        unregisterClient = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r2 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r2 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFLogger(Map<String, Object> map) {
        String component4;
        String equals;
        String component2;
        map.getClass();
        String component1 = this.component3.component1();
        String monetizationNetwork = getMonetizationNetwork(this.areAllFieldsValid, component1);
        boolean z = true;
        boolean z2 = (monetizationNetwork == null || monetizationNetwork.equals(component1)) ? false : true;
        if (monetizationNetwork != null || component1 == null) {
            unregisterClient = (i + 47) % 128;
            z = false;
        } else {
            unregisterClient = (i + 85) % 128;
        }
        if (!z2) {
            int i2 = i + 23;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 79 / 0;
            }
            component4 = component4();
            if (component4 != null) {
                i = (unregisterClient + 25) % 128;
                Locale locale = Locale.getDefault();
                locale.getClass();
                Object lowerCase = component4.toLowerCase(locale);
                lowerCase.getClass();
                map.put("af_installstore", lowerCase);
            }
            equals = equals();
            if (equals != null) {
                Locale locale2 = Locale.getDefault();
                locale2.getClass();
                Object lowerCase2 = equals.toLowerCase(locale2);
                lowerCase2.getClass();
                map.put("af_preinstall_name", lowerCase2);
            }
            component2 = component2();
            if (component2 == null) {
                Locale locale3 = Locale.getDefault();
                locale3.getClass();
                Object lowerCase3 = component2.toLowerCase(locale3);
                lowerCase3.getClass();
                map.put("af_currentstore", lowerCase3);
                return;
            }
            return;
        }
        map.put("af_latestchannel", component1);
        i = (unregisterClient + 17) % 128;
        component4 = component4();
        if (component4 != null) {
        }
        equals = equals();
        if (equals != null) {
        }
        component2 = component2();
        if (component2 == null) {
        }
    }

    private static void a(String str, int i2, Object[] objArr) {
        char[] cArr;
        int i3;
        if (str != null) {
            $10 = ($11 + 113) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        char[] cArr3 = new char[cArr2.length];
        aFk1mSDK.getCurrencyIso4217Code = 0;
        char[] cArr4 = new char[2];
        while (true) {
            int i4 = aFk1mSDK.getCurrencyIso4217Code;
            if (i4 >= cArr2.length) {
                String str2 = new String(cArr3, 0, i2);
                $11 = ($10 + 23) % 128;
                objArr[0] = str2;
                return;
            }
            int i5 = $10 + 51;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 == 0) {
                cArr4[0] = cArr2[i4];
                cArr4[1] = cArr2[i4];
                i3 = 1;
            } else {
                cArr4[0] = cArr2[i4];
                cArr4[1] = cArr2[i4 + 1];
                i3 = 0;
            }
            while (i3 < 16) {
                $11 = ($10 + 31) % 128;
                char c = cArr4[1];
                char c2 = cArr4[0];
                char c3 = (char) (c - (((c2 + i6) ^ ((c2 << 4) + ((char) (AFKeystoreWrapper ^ (-8918198944764412327L))))) ^ ((c2 >>> 5) + ((char) (registerClient ^ (-8918198944764412327L))))));
                cArr4[1] = c3;
                cArr4[0] = (char) (c2 - (((c3 >>> 5) + ((char) (AFLogger ^ (-8918198944764412327L)))) ^ ((c3 + i6) ^ ((c3 << 4) + ((char) (AFInAppEventType ^ (-8918198944764412327L)))))));
                i6 -= 40503;
                i3++;
            }
            int i7 = aFk1mSDK.getCurrencyIso4217Code;
            cArr3[i7] = cArr4[0];
            cArr3[i7 + 1] = cArr4[1];
            aFk1mSDK.getCurrencyIso4217Code = i7 + 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void afInfoLog(Map<String, Object> map) {
        int i2;
        map.getClass();
        String monetizationNetwork = this.toString.getMonetizationNetwork();
        if (monetizationNetwork != null) {
            i = (unregisterClient + 63) % 128;
            if (monetizationNetwork.length() != 0) {
                map.put("appsflyerKey", monetizationNetwork);
                i2 = i + 97;
                unregisterClient = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 / 0;
                    return;
                }
                return;
            }
        }
        i = (unregisterClient + 67) % 128;
        i2 = i + 97;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
        }
    }

    private static String areAllFieldsValid() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        int i2 = i + 3;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        Map map = (Map) objArr[0];
        unregisterClient = (i + 119) % 128;
        map.getClass();
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
            unregisterClient = (i + 69) % 128;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e2);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            int i2 = i + 7;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 67 / 0;
            }
            return null;
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e3);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r1 = new java.util.Properties();
        r3 = new java.io.InputStreamReader(new java.io.FileInputStream(r2), java.nio.charset.Charset.defaultCharset());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r1.load(r3);
        com.appsflyer.AFLogger.afInfoLog("Found PreInstall property!");
        r7 = r1.getProperty(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("PreInstall file wasn't found: " + r2.getAbsolutePath());
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r7.getMessage(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r7.getMessage(), r7);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r3 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        com.appsflyer.internal.AFg1tSDK.unregisterClient = (com.appsflyer.internal.AFg1tSDK.i + 69) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0063, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0064, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x001f, code lost:
    
        if (r2 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r2 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        r4 = (r4 + 5) % 128;
        com.appsflyer.internal.AFg1tSDK.i = r4;
        r4 = r4 + 11;
        com.appsflyer.internal.AFg1tSDK.unregisterClient = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if ((r4 % 2) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        r7 = 33 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.Reader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object component2(Object[] objArr) {
        File file = (File) objArr[0];
        String str = (String) objArr[1];
        int i2 = i + 43;
        int i3 = i2 % 128;
        unregisterClient = i3;
        int i4 = i2 % 2;
        ?? r3 = i4;
        if (i4 != 0) {
            r3 = 89 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = unregisterClient + 93;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            map.getClass();
            map.put("is_pc", Boolean.valueOf(aFg1tSDK.AFAdRevenueData.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            throw null;
        }
        map.getClass();
        map.put("is_pc", Boolean.valueOf(aFg1tSDK.AFAdRevenueData.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        unregisterClient = (i + 33) % 128;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r1.length() == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        com.appsflyer.internal.AFg1tSDK.unregisterClient = (com.appsflyer.internal.AFg1tSDK.i + 99) % 128;
        r6.put(com.appsflyer.AppsFlyerProperties.EXTENSION, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r1.length() == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        map.getClass();
        String string = aFg1tSDK.getRevenue().getString(AppsFlyerProperties.EXTENSION);
        if (string != null) {
            int i2 = unregisterClient + 43;
            i = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 14 / 0;
            }
        }
        int i4 = unregisterClient + 1;
        i = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static List<AFe1lSDK> copy() {
        i = (unregisterClient + 115) % 128;
        List<AFe1lSDK> e = zh.e(AFe1lSDK.CONVERSION, AFe1lSDK.LAUNCH, AFe1lSDK.INAPP, AFe1lSDK.MANUAL_PURCHASE_VALIDATION, AFe1lSDK.ARS_VALIDATE, AFe1lSDK.PURCHASE_VALIDATE, AFe1lSDK.ADREVENUE);
        int i2 = i + 19;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            return e;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r0 > 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void copydefault(Map<String, Object> map) {
        long j;
        long j2;
        long j3;
        int i2 = unregisterClient + 63;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            map.getClass();
            j = this.areAllFieldsValid.getMediationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
            j2 = System.currentTimeMillis();
            this.areAllFieldsValid.getRevenue("AppsFlyerTimePassedSincePrevLaunch", j2);
        } else {
            map.getClass();
            long mediationNetwork = this.areAllFieldsValid.getMediationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
            long currentTimeMillis = System.currentTimeMillis();
            this.areAllFieldsValid.getRevenue("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
            if (mediationNetwork > 0) {
                j = mediationNetwork;
                j2 = currentTimeMillis;
                int i3 = unregisterClient + 1;
                i = i3 % 128;
                j3 = i3 % 2 == 0 ? (j ^ j2) / 1000 : (j2 - j) / 1000;
            }
            j3 = -1;
        }
        map.put("timepassedsincelastlaunch", String.valueOf(j3));
    }

    private static void d(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{map}, -1939346047, 1939346058, (int) System.currentTimeMillis());
    }

    private void e(Map<String, Object> map) {
        unregisterClient = (i + 19) % 128;
        map.getClass();
        boolean revenue = AFf1bSDK.getRevenue(this.AFAdRevenueData);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + revenue);
        if (!revenue) {
            int i2 = i + 29;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("tokenRefreshConfigured", Boolean.FALSE);
                throw null;
            }
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFf1bSDK.getMonetizationNetwork(this.areAllFieldsValid)));
        int i3 = i + 81;
        unregisterClient = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 71 / 0;
        }
    }

    private String equals() {
        unregisterClient = (i + 9) % 128;
        String string = getRevenue().getString("preInstallName");
        if (string != null) {
            return string;
        }
        String revenue = this.areAllFieldsValid.getRevenue("preInstallName", (String) null);
        if (revenue != null) {
            i = (unregisterClient + 43) % 128;
            getRevenue().set("preInstallName", revenue);
            i = (unregisterClient + 21) % 128;
            return revenue;
        }
        String AFKeystoreWrapper2 = AFKeystoreWrapper();
        if (AFKeystoreWrapper2 == null) {
            AFKeystoreWrapper2 = getMediationNetwork("AF_PRE_INSTALL_NAME");
        }
        if (AFKeystoreWrapper2 != null) {
            this.areAllFieldsValid.getMediationNetwork("preInstallName", AFKeystoreWrapper2);
            getRevenue().set("preInstallName", AFKeystoreWrapper2);
        }
        return AFKeystoreWrapper2;
    }

    private void force(Map<String, Object> map) {
        String str;
        map.getClass();
        if (getRevenue().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            i = (unregisterClient + 105) % 128;
            try {
                this.AFAdRevenueData.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                str = this.component3.getCurrencyIso4217Code(this.AFAdRevenueData);
                unregisterClient = (i + 113) % 128;
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                int i2 = i + 99;
                unregisterClient = i2 % 128;
                if (i2 % 2 == 0) {
                    map.put("fb", str);
                } else {
                    map.put("fb", str);
                    throw null;
                }
            }
        }
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i2, int i3, int i4) {
        int i5 = ((~(i2 | i3 | i4)) * (-301)) + (i3 * 302) + (i2 * (-300));
        int i6 = ~i3;
        switch ((((~((~i2) | i4)) | i6) * 301) + (((~(i6 | i4)) | (~((~i4) | i2))) * (-301)) + i5) {
            case 1:
                return getCurrencyIso4217Code(objArr);
            case 2:
                Map map = (Map) objArr[0];
                AFh1sSDK aFh1sSDK = (AFh1sSDK) objArr[1];
                map.getClass();
                aFh1sSDK.getClass();
                String str = aFh1sSDK.areAllFieldsValid;
                if (str != null) {
                    map.put("eventName", str);
                    Map map2 = aFh1sSDK.getMediationNetwork;
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    map.put("eventValue", new JSONObject(map2).toString());
                }
                return null;
            case 3:
                return getMediationNetwork(objArr);
            case 4:
                AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
                Map map3 = (Map) objArr[1];
                i = (unregisterClient + 33) % 128;
                map3.getClass();
                String currencyIso4217Code = AFb1iSDK.getCurrencyIso4217Code(aFg1tSDK.component3.getCurrencyIso4217Code);
                if (currencyIso4217Code != null) {
                    map3.put("uid", currencyIso4217Code);
                    if (aFg1tSDK.component3.getCurrencyIso4217Code.getRevenue("CUSTOM_INSTALL_ID_APPLIED")) {
                        map3.put("custom_install_id", Boolean.TRUE);
                        unregisterClient = (i + 9) % 128;
                    }
                }
                return null;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return getMonetizationNetwork(objArr);
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return getRevenue(objArr);
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return areAllFieldsValid(objArr);
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return component2(objArr);
            case 9:
                return component4(objArr);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                AFg1tSDK aFg1tSDK2 = (AFg1tSDK) objArr[0];
                Map map4 = (Map) objArr[1];
                String str2 = (String) objArr[2];
                map4.getClass();
                if (str2 != null && str2.length() != 0) {
                    unregisterClient = (i + 95) % 128;
                    map4.put("referrer", str2);
                }
                String revenue = aFg1tSDK2.areAllFieldsValid.getRevenue("extraReferrers", (String) null);
                if (revenue != null) {
                    map4.put("extraReferrers", revenue);
                }
                String referrer = aFg1tSDK2.getRevenue().getReferrer(aFg1tSDK2.areAllFieldsValid);
                if (referrer != null && referrer.length() != 0 && map4.get("referrer") == null) {
                    map4.put("referrer", referrer);
                }
                unregisterClient = (i + 43) % 128;
                return null;
            case RequestError.STOP_TRACKING /* 11 */:
                return component1(objArr);
            case 12:
                return component3(objArr);
            default:
                return AFAdRevenueData(objArr);
        }
    }

    private final void getRevenue(Map<String, Object> map, int i2) {
        unregisterClient = (i + 71) % 128;
        try {
            if (this.component3.n_().versionCode > this.areAllFieldsValid.getCurrencyIso4217Code("versionCode", 0)) {
                this.areAllFieldsValid.AFAdRevenueData("versionCode", this.component3.n_().versionCode);
                i = (unregisterClient + 63) % 128;
            }
            map.put("app_version_code", String.valueOf(this.component3.n_().versionCode));
            map.put("app_version_name", this.component3.n_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.component3.getRevenue.getCurrencyIso4217Code.getApplicationInfo().targetSdkVersion));
            map.put("date1", ((SimpleDateFormat) getCurrencyIso4217Code(new Object[]{this}, 1763970142, -1763970135, System.identityHashCode(this))).format(new Date(getMediationNetwork().longValue())));
            map.put("date2", ((SimpleDateFormat) getCurrencyIso4217Code(new Object[]{this}, 1763970142, -1763970135, System.identityHashCode(this))).format(new Date(this.component3.n_().lastUpdateTime)));
            Object[] objArr = new Object[1];
            a("맜㰣䟶抶⊃瘜던몔ꃴ説둻䚈䠷虙\uf39b×", KeyEvent.keyCodeFromString("") + 15, objArr);
            String intern = ((String) objArr[0]).intern();
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) getCurrencyIso4217Code(new Object[]{this}, 1763970142, -1763970135, System.identityHashCode(this));
            simpleDateFormat.getClass();
            map.put(intern, AFAdRevenueData(simpleDateFormat, i2));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
    }

    private final void hashCode(Map<String, Object> map) {
        int i2 = unregisterClient + 9;
        i = i2 % 128;
        int i3 = i2 % 2;
        Context context = this.AFAdRevenueData;
        if (i3 == 0) {
            throw null;
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
        if (uiModeManager != null) {
            int i4 = unregisterClient + 115;
            i = i4 % 128;
            if (i4 % 2 != 0 ? uiModeManager.getCurrentModeType() == 4 : uiModeManager.getCurrentModeType() == 2) {
                map.put("tv", Boolean.TRUE);
            }
        }
        int i5 = unregisterClient + 29;
        i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
    }

    private void i(Map<String, Object> map) {
        map.getClass();
        AFb1mSDK l_ = AFb1jSDK.l_(this.AFAdRevenueData.getContentResolver());
        if (l_ != null) {
            unregisterClient = (i + 83) % 128;
            map.put("amazon_aid", l_.getRevenue);
            map.put("amazon_aid_limit", String.valueOf(l_.getMonetizationNetwork));
            unregisterClient = (i + 71) % 128;
        }
    }

    private final boolean registerClient() {
        i = (unregisterClient + 107) % 128;
        if (getRevenue().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return true;
        }
        i = (unregisterClient + 69) % 128;
        if (getRevenue().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFa1tSDK.getMediationNetwork();
        return !AFa1tSDK.getRevenue(this.AFAdRevenueData);
    }

    private final void toString(Map<String, Object> map) {
        int i2 = i + 13;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        Context context = this.AFAdRevenueData;
        if (i3 != 0) {
            AFg1pSDK.getCurrencyIso4217Code(context);
            throw null;
        }
        if (AFg1pSDK.getCurrencyIso4217Code(context)) {
            map.put("inst_app", Boolean.TRUE);
        }
        int i4 = i + 1;
        unregisterClient = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void unregisterClient(Map<String, Object> map) {
        unregisterClient = (i + 3) % 128;
        map.getClass();
        map.put("af_preinstalled", String.valueOf(this.component3.getMonetizationNetwork(this.AFAdRevenueData)));
        unregisterClient = (i + 123) % 128;
    }

    private void w(Map<String, Object> map) {
        map.getClass();
        if (this.areAllFieldsValid.getMonetizationNetwork("is_stop_tracking_used")) {
            int i2 = unregisterClient + 19;
            i = i2 % 128;
            int i3 = i2 % 2;
            AFc1jSDK aFc1jSDK = this.areAllFieldsValid;
            if (i3 == 0) {
                map.put("istu", String.valueOf(aFc1jSDK.getRevenue("is_stop_tracking_used")));
                int i4 = 47 / 0;
            } else {
                map.put("istu", String.valueOf(aFc1jSDK.getRevenue("is_stop_tracking_used")));
            }
        }
        unregisterClient = (i + 15) % 128;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMediationNetwork(AFh1sSDK aFh1sSDK) {
        aFh1sSDK.getClass();
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        if (aFh1sSDK.AFAdRevenueData()) {
            unregisterClient = (i + 111) % 128;
            String str = aFh1sSDK.component2;
            AFc1gSDK aFc1gSDK = this.equals;
            getMonetizationNetwork(aFh1sSDK, str, aFc1gSDK.AFAdRevenueData, aFc1gSDK.getMediationNetwork);
        } else if (!(aFh1sSDK instanceof AFh1iSDK)) {
            unregisterClient = (i + 53) % 128;
            map.getClass();
            String str2 = aFh1sSDK.areAllFieldsValid;
            str2.getClass();
            getRevenue(map, str2);
        }
        AFe1lSDK aFe1lSDK = AFe1lSDK.CONVERSION;
        AFe1lSDK aFe1lSDK2 = AFe1lSDK.LAUNCH;
        if (zh.e(aFe1lSDK, aFe1lSDK2, AFe1lSDK.INAPP).contains(aFh1sSDK.getRevenue())) {
            int i2 = unregisterClient + 37;
            i = i2 % 128;
            if (i2 % 2 == 0) {
                map.getClass();
                getCurrencyIso4217Code(new Object[]{this, map}, -2036410656, 2036410668, System.identityHashCode(this));
                int i3 = 5 / 0;
            } else {
                map.getClass();
                getCurrencyIso4217Code(new Object[]{this, map}, -2036410656, 2036410668, System.identityHashCode(this));
            }
        }
        if (zh.e(aFe1lSDK, aFe1lSDK2, AFe1lSDK.ATTR).contains(aFh1sSDK.getRevenue())) {
            unregisterClient = (i + 43) % 128;
            map.getClass();
            copy(map);
        }
        map.getClass();
        afInfoLog(map);
        getCurrencyIso4217Code(new Object[]{map}, -1435534787, 1435534790, (int) System.currentTimeMillis());
        AFKeystoreWrapper(map);
        getCurrencyIso4217Code(new Object[]{this, map}, 381318277, -381318268, System.identityHashCode(this));
        getCurrencyIso4217Code(new Object[]{this, map}, -140518467, 140518471, System.identityHashCode(this));
        getMediationNetwork(map, aFh1sSDK.AFAdRevenueData());
        e(map);
        w(map);
        getCurrencyIso4217Code(new Object[]{map, aFh1sSDK}, 840096267, -840096265, (int) System.currentTimeMillis());
        map.put("af_events_api", "1");
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMonetizationNetwork(AFh1sSDK aFh1sSDK) {
        i = (unregisterClient + 43) % 128;
        aFh1sSDK.getClass();
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        map.getClass();
        getRevenue(map, aFh1sSDK.AFAdRevenueData());
        component1(map);
        getCurrencyIso4217Code(new Object[]{map}, -1939346047, 1939346058, (int) System.currentTimeMillis());
        getCurrencyIso4217Code(map);
        AFAdRevenueData(map, this.equals.getCurrencyIso4217Code);
        i(map);
        map.put("cell", ik0.c(new Pair("mcc", Integer.valueOf(this.AFAdRevenueData.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.AFAdRevenueData.getResources().getConfiguration().mnc))));
        map.put("sig", AFAdRevenueData());
        map.put("last_boot_time", Long.valueOf(component1()));
        map.put("disk", areAllFieldsValid());
        int i2 = unregisterClient + 33;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void copy(Map<String, Object> map) {
        int i2 = i + 93;
        int i3 = i2 % 128;
        unregisterClient = i3;
        int i4 = i2 % 2;
        AFc1gSDK aFc1gSDK = this.equals;
        if (i4 == 0) {
            String str = aFc1gSDK.hashCode;
            if (str != null) {
                int i5 = i3 + 15;
                i = i5 % 128;
                if (i5 % 2 != 0) {
                    map.put("net_token", str);
                    return;
                } else {
                    map.put("net_token", str);
                    throw null;
                }
            }
            return;
        }
        String str2 = aFc1gSDK.hashCode;
        throw null;
    }

    private static void registerClient(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{map}, -1435534787, 1435534790, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        int i2 = unregisterClient + 81;
        i = i2 % 128;
        int i3 = i2 % 2;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) aFg1tSDK.AFInAppEventParameterName.getValue();
        if (i3 != 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    private final void areAllFieldsValid(Map<String, Object> map) {
        if (!getRevenue().isOtherSdkStringDisabled()) {
            int i2 = i + 85;
            unregisterClient = i2 % 128;
            int i3 = i2 % 2;
            AFg1ySDK aFg1ySDK = this.getRevenue;
            if (i3 != 0) {
                map.put("batteryLevel", String.valueOf(aFg1ySDK.getMonetizationNetwork(this.AFAdRevenueData).getMonetizationNetwork));
                int i4 = 33 / 0;
            } else {
                map.put("batteryLevel", String.valueOf(aFg1ySDK.getMonetizationNetwork(this.AFAdRevenueData).getMonetizationNetwork));
            }
        }
        unregisterClient = (i + 45) % 128;
    }

    private String component4() {
        int i2 = i + 37;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        AFc1jSDK aFc1jSDK = this.areAllFieldsValid;
        if (i3 == 0) {
            String revenue = aFc1jSDK.getRevenue("INSTALL_STORE", (String) null);
            if (revenue != null) {
                unregisterClient = (i + 93) % 128;
                return revenue;
            }
            String component2 = component2();
            if (component2 != null) {
                this.areAllFieldsValid.getMediationNetwork("INSTALL_STORE", component2);
            }
            return component2;
        }
        aFc1jSDK.getRevenue("INSTALL_STORE", (String) null);
        throw null;
    }

    private void equals(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -2036410656, 2036410668, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        r4.put("onelink_id", r0);
        com.appsflyer.internal.AFg1tSDK.unregisterClient = (com.appsflyer.internal.AFg1tSDK.i + 119) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void component3(Map<String, Object> map) {
        String string;
        String string2;
        int i2 = i + 59;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            map.getClass();
            string = getRevenue().getString(AppsFlyerProperties.ONELINK_ID);
            string2 = getRevenue().getString(AppsFlyerProperties.ONELINK_VERSION);
            int i3 = 79 / 0;
        } else {
            map.getClass();
            string = getRevenue().getString(AppsFlyerProperties.ONELINK_ID);
            string2 = getRevenue().getString(AppsFlyerProperties.ONELINK_VERSION);
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
    }

    private final void component4(Map<String, Object> map) {
        AFg1ySDK.AFa1tSDK monetizationNetwork = this.getRevenue.getMonetizationNetwork(this.AFAdRevenueData);
        float f = monetizationNetwork.getMonetizationNetwork;
        String str = monetizationNetwork.AFAdRevenueData;
        map.put("btl", String.valueOf(f));
        if (str != null) {
            i = (unregisterClient + 1) % 128;
            map.put("btch", str);
        }
        int i2 = i + 91;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private boolean component3() {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this}, 1014234818, -1014234818, System.identityHashCode(this))).booleanValue();
    }

    private final String copydefault() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, -1753918154, 1753918160, System.identityHashCode(this));
    }

    private static void component1(Map<String, Object> map) {
        unregisterClient = (i + 41) % 128;
        map.getClass();
        Object[] objArr = new Object[1];
        a("\uf08a兙黴ꥱ蟩䓗", Color.blue(0) + 5, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        unregisterClient = (i + 85) % 128;
    }

    private static long component1() {
        int i2 = i + 39;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            return System.currentTimeMillis() - SystemClock.elapsedRealtime();
        }
        return SystemClock.elapsedRealtime() + System.currentTimeMillis();
    }

    private String AFAdRevenueData() {
        int i2 = unregisterClient + 75;
        i = i2 % 128;
        int i3 = i2 % 2;
        Context context = this.AFAdRevenueData;
        if (i3 == 0) {
            AFj1pSDK.N_(context.getApplicationContext().getPackageManager(), this.AFAdRevenueData.getApplicationContext().getPackageName());
            throw null;
        }
        String N_ = AFj1pSDK.N_(context.getApplicationContext().getPackageManager(), this.AFAdRevenueData.getApplicationContext().getPackageName());
        int i4 = unregisterClient + 3;
        i = i4 % 128;
        if (i4 % 2 != 0) {
            return N_;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void AFAdRevenueData(AFh1sSDK aFh1sSDK) {
        i = (unregisterClient + 1) % 128;
        aFh1sSDK.getClass();
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        map.getClass();
        map.put("open_referrer", aFh1sSDK.getMonetizationNetwork);
        String str = aFh1sSDK.equals;
        if (str != null) {
            int i2 = i + 109;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 49 / 0;
                if (StringsKt.n(str)) {
                    return;
                }
            } else if (StringsKt.n(str)) {
                return;
            }
            i = (unregisterClient + 117) % 128;
            map.put("af_web_referrer", aFh1sSDK.equals);
        }
    }

    private final void getMonetizationNetwork(Map<String, Object> map) {
        try {
            long longValue = getMediationNetwork().longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(longValue)));
            int i2 = i + 95;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (r1.component3() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        if (r8 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005f, code lost:
    
        com.appsflyer.internal.AFg1tSDK.unregisterClient = (com.appsflyer.internal.AFg1tSDK.i + 109) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        boolean z = false;
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        int intValue = ((Number) objArr[2]).intValue();
        int intValue2 = ((Number) objArr[3]).intValue();
        int i2 = i + 9;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            map.getClass();
            map.put("counter", String.valueOf(intValue));
            map.put("iaecounter", String.valueOf(intValue2));
            boolean component3 = aFg1tSDK.component3();
            int i3 = 12 / 0;
        } else {
            map.getClass();
            map.put("counter", String.valueOf(intValue));
            map.put("iaecounter", String.valueOf(intValue2));
        }
        map.put("isFirstCall", String.valueOf(z));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("AppsFlyer: first launch detected");
        r8 = r8.format(new java.util.Date());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r7.areAllFieldsValid.getMediationNetwork("appsFlyerFirstInstall", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        com.appsflyer.internal.AFg1tSDK.unregisterClient = (com.appsflyer.internal.AFg1tSDK.i + 109) % 128;
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r9 > 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String AFAdRevenueData(SimpleDateFormat simpleDateFormat, int i2) {
        String revenue;
        int i3 = unregisterClient + 97;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            simpleDateFormat.getClass();
            revenue = this.areAllFieldsValid.getRevenue("appsFlyerFirstInstall", (String) null);
            int i4 = 94 / 0;
        } else {
            simpleDateFormat.getClass();
            revenue = this.areAllFieldsValid.getRevenue("appsFlyerFirstInstall", (String) null);
        }
        AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, qy0.j("AppsFlyer: first launch date: ", revenue), false, 4, null);
        revenue.getClass();
        return revenue;
    }

    private String component2() {
        int i2 = unregisterClient + 63;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            String string = getRevenue().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            int i3 = 42 / 0;
            if (string != null) {
                return string;
            }
        } else {
            String string2 = getRevenue().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string2 != null) {
                return string2;
            }
        }
        String mediationNetwork = getMediationNetwork("AF_STORE");
        unregisterClient = (i + 73) % 128;
        return mediationNetwork;
    }

    private void component2(Map<String, ? extends Object> map) {
        map.getClass();
        AFh1uSDK aFh1uSDK = this.component2;
        HashMap hashMap = new HashMap(aFh1uSDK.getRevenue);
        aFh1uSDK.getRevenue.clear();
        aFh1uSDK.AFAdRevenueData.getCurrencyIso4217Code("gcd");
        if (!hashMap.isEmpty()) {
            int i2 = unregisterClient + 65;
            i = i2 % 128;
            if (i2 % 2 != 0) {
                Map<String, Object> monetizationNetwork = AFa1tSDK.getMonetizationNetwork(map);
                monetizationNetwork.getClass();
                monetizationNetwork.put("gcd", hashMap);
            }
        }
        int i3 = i + 3;
        unregisterClient = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private void getMonetizationNetwork(AFh1sSDK aFh1sSDK, String str, String str2, AFb1qSDK aFb1qSDK) {
        int i2 = unregisterClient + 117;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            aFh1sSDK.getClass();
            Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
            if (aFh1sSDK.getRevenue() == AFe1lSDK.CONVERSION) {
                map.getClass();
                areAllFieldsValid(map);
                hashCode(map);
                toString(map);
                AFa1zSDK.getCurrencyIso4217Code(this.hashCode, this.component3);
            }
            map.getClass();
            copydefault(map);
            component3(map);
            component2((Map<String, ? extends Object>) map);
            getMonetizationNetwork(map, str2);
            getCurrencyIso4217Code(new Object[]{this, map, str}, 2080605436, -2080605426, System.identityHashCode(this));
            AFInAppEventParameterName(map);
            if (aFb1qSDK != null) {
                i = (unregisterClient + 15) % 128;
                aFb1qSDK.AFAdRevenueData(map);
                return;
            }
            return;
        }
        aFh1sSDK.getClass();
        Map<String, Object> map2 = aFh1sSDK.AFAdRevenueData;
        aFh1sSDK.getRevenue();
        AFe1lSDK aFe1lSDK = AFe1lSDK.RC_CDN;
        throw null;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        int i2 = unregisterClient + 49;
        i = i2 % 128;
        int i3 = i2 % 2;
        String revenue = aFg1tSDK.areAllFieldsValid.getRevenue("sentSuccessfully", (String) null);
        if (i3 != 0) {
            return Boolean.valueOf(Boolean.parseBoolean(revenue));
        }
        Boolean.parseBoolean(revenue);
        throw null;
    }

    private static File AFAdRevenueData(String str) {
        return (File) getCurrencyIso4217Code(new Object[]{str}, -1713193942, 1713193943, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void AFAdRevenueData(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -140518467, 140518471, System.identityHashCode(this));
    }

    private static void getMonetizationNetwork(Map<String, Object> map, String str) {
        int i2 = i + 59;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            map.getClass();
            if (str != null) {
                int i3 = i + 19;
                unregisterClient = i3 % 128;
                if (i3 % 2 == 0) {
                    map.put("phone", str);
                } else {
                    map.put("phone", str);
                    throw null;
                }
            }
            int i4 = unregisterClient + 57;
            i = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 0;
                return;
            }
            return;
        }
        map.getClass();
        throw null;
    }

    private void AFKeystoreWrapper(Map<String, Object> map) {
        unregisterClient = (i + 87) % 128;
        map.getClass();
        map.putAll(this.copy.getCurrencyIso4217Code());
        i = (unregisterClient + 49) % 128;
    }

    private static String getMonetizationNetwork(AFc1jSDK aFc1jSDK, String str) {
        unregisterClient = (i + 113) % 128;
        String revenue = aFc1jSDK.getRevenue("CACHED_CHANNEL", (String) null);
        if (revenue != null) {
            unregisterClient = (i + 71) % 128;
            return revenue;
        }
        aFc1jSDK.getMediationNetwork("CACHED_CHANNEL", str);
        return str;
    }

    private static void getMonetizationNetwork(Map<String, Object> map, AFh1sSDK aFh1sSDK) {
        getCurrencyIso4217Code(new Object[]{map, aFh1sSDK}, 840096267, -840096265, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMonetizationNetwork(Map<String, Object> map, int i2, int i3) {
        getCurrencyIso4217Code(new Object[]{this, map, Integer.valueOf(i2), Integer.valueOf(i3)}, -2094417187, 2094417192, i2);
    }

    private final SimpleDateFormat getMonetizationNetwork() {
        return (SimpleDateFormat) getCurrencyIso4217Code(new Object[]{this}, 1763970142, -1763970135, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getRevenue(Map<String, Object> map) {
        String[] strArr;
        map.getClass();
        String string = getRevenue().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            int i2 = unregisterClient + 53;
            i = i2 % 128;
            if (i2 % 2 == 0) {
                map.put(AppsFlyerProperties.APP_ID, string);
                int i3 = 8 / 0;
            } else {
                map.put(AppsFlyerProperties.APP_ID, string);
            }
        }
        String string2 = getRevenue().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(string2);
                sb.append("' is not a legal value.");
                AFLogger.afWarnLog(sb.toString());
            }
            map.put("currency", string2);
        }
        String string3 = getRevenue().getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            map.put("isUpdate", string3);
        }
        String string4 = getRevenue().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        String string5 = getRevenue().getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            i = (unregisterClient + 27) % 128;
            map.put("appUserId", string5);
        }
        String string6 = getRevenue().getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        } else {
            unregisterClient = (i + 111) % 128;
        }
        AFb1uSDK aFb1uSDK = this.equals.getMonetizationNetwork;
        if (aFb1uSDK == null || (strArr = aFb1uSDK.getRevenue) == null) {
            return;
        }
        map.put("sharing_filter", strArr);
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMediationNetwork(Map<String, Object> map) {
        Object j31Var;
        AFLogger aFLogger;
        AFg1cSDK aFg1cSDK;
        int i2;
        Object obj;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        map.getClass();
        String str2 = this.equals.getRevenue;
        if (str2 != null) {
            if (map.get("af_deeplink") != null) {
                int i3 = i + 101;
                unregisterClient = i3 % 128;
                if (i3 % 2 != 0) {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                    throw null;
                }
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    i31 i31Var = k31.d;
                    JSONObject jSONObject = new JSONObject(str2);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    j31Var = Unit.a;
                    i = (unregisterClient + 71) % 128;
                } catch (Throwable th) {
                    i31 i31Var2 = k31.d;
                    j31Var = new j31(th);
                }
                Throwable a = k31.a(j31Var);
                if (a != null) {
                    int i4 = i + 65;
                    unregisterClient = i4 % 128;
                    if (i4 % 2 != 0) {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.GENERAL;
                        i2 = 36;
                        obj = null;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z = false;
                        z2 = false;
                        z3 = true;
                    } else {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.GENERAL;
                        i2 = 120;
                        obj = null;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z = false;
                        z2 = false;
                        z3 = false;
                    }
                    AFg1hSDK.e$default(aFLogger, aFg1cSDK, str, a, z, z2, z3, false, i2, obj);
                }
            }
        }
        this.equals.getRevenue = null;
        int i5 = i + 19;
        unregisterClient = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getRevenue(Map<String, Object> map, AFe1lSDK aFe1lSDK) {
        map.getClass();
        aFe1lSDK.getClass();
        if (copy().contains(aFe1lSDK)) {
            if (this.equals.getMonetizationNetwork()) {
                i = (unregisterClient + 49) % 128;
                map.put("app_set_id", hk0.b(new Pair("app_set_id_disabled", Boolean.TRUE)));
                if (this.equals.equals != null) {
                    AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
                    return;
                }
                AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
                int i2 = i + 15;
                unregisterClient = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            AFb1gSDK aFb1gSDK = this.equals.equals;
            if (aFb1gSDK != null) {
                unregisterClient = (i + 111) % 128;
                map.put("app_set_id", ik0.c(new Pair("scope", Integer.valueOf(aFb1gSDK.getCurrencyIso4217Code)), new Pair("id", aFb1gSDK.AFAdRevenueData)));
            }
        }
    }

    private void getMediationNetwork(Map<String, Object> map, boolean z) {
        map.getClass();
        map.put("platformextension", this.getMonetizationNetwork);
        if (z) {
            int i2 = i + 75;
            unregisterClient = i2 % 128;
            int i3 = i2 % 2;
            AFi1lSDK aFi1lSDK = this.getMediationNetwork;
            if (i3 == 0) {
                map.put("platform_extension_v2", aFi1lSDK.getRevenue());
            } else {
                map.put("platform_extension_v2", aFi1lSDK.getRevenue());
                throw null;
            }
        }
        int i4 = unregisterClient + 93;
        i = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        AFi1wSDK aFi1wSDK;
        map.getClass();
        AFi1pSDK aFi1pSDK = this.component4.getRevenue;
        if (aFi1pSDK != null) {
            i = (unregisterClient + 29) % 128;
            aFi1wSDK = aFi1pSDK.AFAdRevenueData();
        } else {
            aFi1wSDK = null;
        }
        if (aFi1wSDK != null) {
            unregisterClient = (i + 121) % 128;
            map.put("network", aFi1wSDK.AFAdRevenueData);
            map.put("ivc", Boolean.valueOf(aFi1wSDK.getRevenue()));
            if (getRevenue().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                return;
            }
            int i2 = unregisterClient + 47;
            i = i2 % 128;
            int i3 = i2 % 2;
            String str = aFi1wSDK.getCurrencyIso4217Code;
            if (i3 != 0) {
                if (str != null) {
                    map.put("operator", str);
                    unregisterClient = (i + 61) % 128;
                }
                String str2 = aFi1wSDK.getMonetizationNetwork;
                if (str2 != null) {
                    map.put("carrier", str2);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    private Long getMediationNetwork() {
        int i2 = unregisterClient + 73;
        i = i2 % 128;
        int i3 = i2 % 2;
        PackageInfo n_ = this.component3.n_();
        if (i3 != 0) {
            return Long.valueOf(n_.firstInstallTime);
        }
        long j = n_.firstInstallTime;
        throw null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        Map map = (Map) objArr[0];
        i = (unregisterClient + 9) % 128;
        map.getClass();
        String revenue = AFa1zSDK.getRevenue();
        String currencyIso4217Code = AFa1zSDK.getCurrencyIso4217Code();
        if (revenue != null) {
            int i2 = i;
            int i3 = i2 + 101;
            unregisterClient = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (currencyIso4217Code != null) {
                int i4 = i2 + 101;
                unregisterClient = i4 % 128;
                if (i4 % 2 == 0) {
                    if (Integer.parseInt(currencyIso4217Code) > 0) {
                        map.put("reinstallCounter", currencyIso4217Code);
                        map.put("originalAppsflyerId", revenue);
                    }
                } else {
                    Integer.parseInt(currencyIso4217Code);
                    throw null;
                }
            }
        }
        return null;
    }

    private void getRevenue(Map<String, Object> map, boolean z) {
        map.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", getRevenue("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", getRevenue("ro.product.cpu.abi2"));
        hashMap.put("arch", getRevenue("os.arch"));
        hashMap.put("build_display_id", getRevenue("ro.build.display.id"));
        if (z) {
            i = (unregisterClient + 125) % 128;
            component4(hashMap);
            if (this.component3.getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0) <= 2) {
                int i2 = unregisterClient + 111;
                i = i2 % 128;
                int i3 = i2 % 2;
                AFj1oSDK aFj1oSDK = this.getCurrencyIso4217Code;
                if (i3 == 0) {
                    hashMap.putAll(aFj1oSDK.AFAdRevenueData());
                    int i4 = 75 / 0;
                } else {
                    hashMap.putAll(aFj1oSDK.AFAdRevenueData());
                }
                i = (unregisterClient + 15) % 128;
            }
        }
        hashMap.put("dim", this.component1.getMonetizationNetwork(this.AFAdRevenueData));
        map.put("deviceData", hashMap);
        int i5 = i + 83;
        unregisterClient = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final String getMediationNetwork(String str) {
        unregisterClient = (i + 53) % 128;
        String monetizationNetwork = this.component3.getMonetizationNetwork(str);
        i = (unregisterClient + 33) % 128;
        return monetizationNetwork;
    }

    private static String getMediationNetwork(File file, String str) {
        return (String) getCurrencyIso4217Code(new Object[]{file, str}, 1094427933, -1094427925, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getCurrencyIso4217Code(AFh1sSDK aFh1sSDK) {
        unregisterClient = (i + 69) % 128;
        aFh1sSDK.getClass();
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        map.getClass();
        getMonetizationNetwork(map);
        Map<String, Object> map2 = aFh1sSDK.AFAdRevenueData;
        map2.getClass();
        getRevenue(map2, aFh1sSDK.component1);
        Map<String, Object> map3 = aFh1sSDK.AFAdRevenueData;
        map3.getClass();
        AFLogger(map3);
        Map<String, Object> map4 = aFh1sSDK.AFAdRevenueData;
        map4.getClass();
        unregisterClient(map4);
        Map<String, Object> map5 = aFh1sSDK.AFAdRevenueData;
        map5.getClass();
        force(map5);
        Map<String, Object> map6 = aFh1sSDK.AFAdRevenueData;
        map6.getClass();
        AFe1lSDK revenue = aFh1sSDK.getRevenue();
        revenue.getClass();
        getRevenue(map6, revenue);
        int i2 = i + 15;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final AppsFlyerProperties getRevenue() {
        i = (unregisterClient + 63) % 128;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) this.copydefault.getValue();
        i = (unregisterClient + 13) % 128;
        return appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getRevenue(AFh1sSDK aFh1sSDK) {
        aFh1sSDK.getClass();
        if (!this.component3.getMediationNetwork()) {
            int i2 = i + 121;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                Map<String, Object> monetizationNetwork = AFa1tSDK.getMonetizationNetwork(aFh1sSDK.AFAdRevenueData);
                monetizationNetwork.getClass();
                monetizationNetwork.put("ad_ids_disabled", Boolean.TRUE);
                int i3 = 49 / 0;
            } else {
                Map<String, Object> monetizationNetwork2 = AFa1tSDK.getMonetizationNetwork(aFh1sSDK.AFAdRevenueData);
                monetizationNetwork2.getClass();
                monetizationNetwork2.put("ad_ids_disabled", Boolean.TRUE);
            }
        } else {
            AFh1rSDK aFh1rSDK = this.component3.getMediationNetwork.component2;
            if (aFh1rSDK == null) {
                return;
            }
            String str = aFh1rSDK.getCurrencyIso4217Code;
            if (str != null && str.length() != 0) {
                aFh1sSDK.getMonetizationNetwork("gaidError", aFh1rSDK.getCurrencyIso4217Code);
            } else {
                i = (unregisterClient + 59) % 128;
            }
            String str2 = aFh1rSDK.AFAdRevenueData;
            if (str2 != null && aFh1rSDK.getMediationNetwork != null) {
                aFh1sSDK.getMonetizationNetwork("advertiserId", str2);
                aFh1sSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(aFh1rSDK.getMediationNetwork));
                aFh1sSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(aFh1rSDK.getMonetizationNetwork));
            }
        }
        AFh1rSDK aFh1rSDK2 = this.component3.getMediationNetwork.component2;
        aFh1sSDK.getMonetizationNetwork("GAID_retry", String.valueOf(aFh1rSDK2 != null ? Intrinsics.a(aFh1rSDK2.component2, Boolean.TRUE) : false));
        if (zh.e(AFe1lSDK.CONVERSION, AFe1lSDK.LAUNCH).contains(aFh1sSDK.getRevenue())) {
            int i4 = unregisterClient + 17;
            i = i4 % 128;
            int i5 = i4 % 2;
            AFc1gSDK aFc1gSDK = this.equals;
            if (i5 != 0) {
                AFd1dSDK aFd1dSDK = aFc1gSDK.component3;
                if (aFd1dSDK != null) {
                    Map<String, Object> monetizationNetwork3 = AFa1tSDK.getMonetizationNetwork(aFh1sSDK.AFAdRevenueData);
                    monetizationNetwork3.getClass();
                    monetizationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1dSDK.AFAdRevenueData));
                    return;
                }
                return;
            }
            AFd1dSDK aFd1dSDK2 = aFc1gSDK.component3;
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final long getCurrencyIso4217Code() {
        int i2 = unregisterClient + 121;
        i = i2 % 128;
        int i3 = i2 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return currentTimeMillis;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        if (registerClient() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        r5 = (java.lang.String) getCurrencyIso4217Code(new java.lang.Object[]{r5}, -1753918154, 1753918160, java.lang.System.identityHashCode(r5));
        com.appsflyer.internal.AFg1tSDK.unregisterClient = (com.appsflyer.internal.AFg1tSDK.i + 63) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (registerClient() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        r0 = r0 + 51;
        com.appsflyer.internal.AFg1tSDK.unregisterClient = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if ((r0 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        r3 = 56 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (r6.length() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r6.length() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0020, code lost:
    
        if (r6 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r6 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        r6 = com.appsflyer.internal.AFg1tSDK.i + 121;
        com.appsflyer.internal.AFg1tSDK.unregisterClient = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if ((r6 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        r0 = 96 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String getCurrencyIso4217Code(String str) {
        if (getRevenue().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) {
            int i2 = i;
            int i3 = i2 + 125;
            unregisterClient = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 86 / 0;
            }
        }
        if (str != null) {
            return str;
        }
        return null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String str = (String) objArr[0];
        int i2 = i;
        int i3 = i2 + 105;
        unregisterClient = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                throw null;
            }
            if (str != null) {
                int i4 = i2 + 23;
                unregisterClient = i4 % 128;
                if (i4 % 2 == 0) {
                    if (StringsKt.s(str).toString().length() > 0) {
                        return new File(StringsKt.s(str).toString());
                    }
                } else {
                    StringsKt.s(str).toString().getClass();
                    throw null;
                }
            }
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, String str) {
        getCurrencyIso4217Code(new Object[]{this, map, str}, 2080605436, -2080605426, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        r8.areAllFieldsValid.getMediationNetwork("prev_event_name", r10);
        r8.areAllFieldsValid.getRevenue("prev_event_timestamp", java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        r8 = com.appsflyer.internal.AFg1tSDK.unregisterClient + 15;
        com.appsflyer.internal.AFg1tSDK.i = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        if ((r8 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r4 = new org.json.JSONObject();
        r4.put("prev_event_timestamp", r8.areAllFieldsValid.getMediationNetwork("prev_event_timestamp", -1));
        r4.put("prev_event_name", r0);
        r9.put("prev_event", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        com.appsflyer.internal.AFg1tSDK.i = (com.appsflyer.internal.AFg1tSDK.unregisterClient + 51) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r0 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getRevenue(Map<String, Object> map, String str) {
        String revenue;
        int i2 = i + 119;
        unregisterClient = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                map.getClass();
                str.getClass();
                revenue = this.areAllFieldsValid.getRevenue("prev_event_name", (String) null);
                int i3 = 19 / 0;
            } else {
                map.getClass();
                str.getClass();
                revenue = this.areAllFieldsValid.getRevenue("prev_event_name", (String) null);
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        String revenue = aFg1tSDK.areAllFieldsValid.getRevenue("androidIdCached", (String) null);
        try {
            String string = Settings.Secure.getString(aFg1tSDK.AFAdRevenueData.getContentResolver(), "android_id");
            if (string != null) {
                return string;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (revenue != null) {
            AFLogger.afDebugLog("use cached AndroidId: " + revenue);
            unregisterClient = (i + 101) % 128;
            return revenue;
        }
        int i2 = unregisterClient + 125;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static String getRevenue(String str) {
        i = (unregisterClient + 91) % 128;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            invoke.getClass();
            String str2 = (String) invoke;
            int i2 = unregisterClient + 31;
            i = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 57 / 0;
            }
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private static boolean getRevenue(File file) {
        int i2 = unregisterClient + 113;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (file != null && file.exists()) {
            return false;
        }
        i = (unregisterClient + 35) % 128;
        return true;
    }
}
