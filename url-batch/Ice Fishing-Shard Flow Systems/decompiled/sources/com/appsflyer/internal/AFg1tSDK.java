package com.appsflyer.internal;

import R5.InterfaceC0168h;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.AFg1ySDK;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.H;
import kotlin.collections.I;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1tSDK implements AFg1vSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char AFInAppEventType = 63402;
    private static char AFKeystoreWrapper = 61739;
    private static char AFLogger = 47673;

    /* renamed from: i, reason: collision with root package name */
    private static int f4310i = 1;
    private static char registerClient = 16862;
    private static int unregisterClient;
    private final Context AFAdRevenueData;
    private final InterfaceC0168h AFInAppEventParameterName;
    private final AFc1jSDK areAllFieldsValid;
    private final AFg1uSDK component1;
    private final AFh1uSDK component2;
    private final AFc1kSDK component3;
    private final AFi1xSDK component4;
    private final AFg1zSDK copy;
    private final InterfaceC0168h copydefault;
    private final AFc1gSDK equals;
    private final AFj1oSDK getCurrencyIso4217Code;
    private final AFi1lSDK getMediationNetwork;
    private final String getMonetizationNetwork;
    private final AFg1ySDK getRevenue;
    private final AFc1fSDK hashCode;
    private final AFf1kSDK toString;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFg1tSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends kotlin.jvm.internal.p implements Function0<AppsFlyerProperties> {
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

    @Metadata
    /* renamed from: com.appsflyer.internal.AFg1tSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends kotlin.jvm.internal.p implements Function0<SimpleDateFormat> {
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
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1ySDK, "");
        Intrinsics.checkNotNullParameter(aFj1oSDK, "");
        Intrinsics.checkNotNullParameter(aFg1uSDK, "");
        Intrinsics.checkNotNullParameter(aFh1uSDK, "");
        Intrinsics.checkNotNullParameter(aFc1jSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFi1xSDK, "");
        Intrinsics.checkNotNullParameter(aFf1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFg1zSDK, "");
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
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
        this.copydefault = R5.i.b(AnonymousClass3.AFAdRevenueData);
        this.AFInAppEventParameterName = R5.i.b(AnonymousClass4.getCurrencyIso4217Code);
    }

    private void AFAdRevenueData(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        if (getRevenue().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i2 = unregisterClient + 121;
            f4310i = i2 % 128;
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
            int i5 = unregisterClient + 105;
            f4310i = i5 % 128;
            if (i5 % 2 == 0) {
                map.put("imei", revenue);
                throw null;
            }
            map.put("imei", revenue);
        }
        String currencyIso4217Code = getCurrencyIso4217Code(str);
        if (currencyIso4217Code != null) {
            f4310i = (unregisterClient + 71) % 128;
            this.areAllFieldsValid.getMediationNetwork("androidIdCached", currencyIso4217Code);
            map.put("android_id", currencyIso4217Code);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFb1mSDK revenue2 = AFb1jSDK.getRevenue(this.AFAdRevenueData);
        if (revenue2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = revenue2.getCurrencyIso4217Code;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str2 = revenue2.getRevenue;
            Intrinsics.checkNotNullExpressionValue(str2, "");
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
        f4310i = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            j = this.component2.equals;
            if (j == 0) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            j = this.component2.equals;
            if (j == 0) {
                return;
            }
        }
        unregisterClient = (f4310i + 123) % 128;
        map.put("prev_session_dur", Long.valueOf(j));
    }

    private void AFInAppEventType(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, 381318277, -381318268, System.identityHashCode(this));
    }

    private void AFKeystoreWrapper(Map<String, Object> map) {
        unregisterClient = (f4310i + 87) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.copy.getCurrencyIso4217Code());
        f4310i = (unregisterClient + 49) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r2 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r2 != true) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFLogger(Map<String, Object> map) {
        boolean z7;
        String component4;
        String equals;
        String component2;
        Intrinsics.checkNotNullParameter(map, "");
        String component1 = this.component3.component1();
        String monetizationNetwork = getMonetizationNetwork(this.areAllFieldsValid, component1);
        boolean z8 = (monetizationNetwork == null || monetizationNetwork.equals(component1)) ? false : true;
        if (monetizationNetwork != null || component1 == null) {
            unregisterClient = (f4310i + 47) % 128;
            z7 = false;
        } else {
            unregisterClient = (f4310i + 85) % 128;
            z7 = true;
        }
        if (!z8) {
            int i2 = f4310i + 23;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                int i5 = 79 / 0;
            }
            component4 = component4();
            if (component4 != null) {
                f4310i = (unregisterClient + 25) % 128;
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                Object lowerCase = component4.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                map.put("af_installstore", lowerCase);
            }
            equals = equals();
            if (equals != null) {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                Object lowerCase2 = equals.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                map.put("af_preinstall_name", lowerCase2);
            }
            component2 = component2();
            if (component2 == null) {
                Locale locale3 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                Object lowerCase3 = component2.toLowerCase(locale3);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                map.put("af_currentstore", lowerCase3);
                return;
            }
            return;
        }
        map.put("af_latestchannel", component1);
        f4310i = (unregisterClient + 17) % 128;
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
        int i5;
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
            int i7 = aFk1mSDK.getCurrencyIso4217Code;
            if (i7 >= cArr2.length) {
                String str2 = new String(cArr3, 0, i2);
                $11 = ($10 + 23) % 128;
                objArr[0] = str2;
                return;
            }
            int i8 = $10 + 51;
            $11 = i8 % 128;
            int i9 = 58224;
            if (i8 % 2 == 0) {
                cArr4[0] = cArr2[i7];
                cArr4[1] = cArr2[i7];
                i5 = 1;
            } else {
                cArr4[0] = cArr2[i7];
                cArr4[1] = cArr2[i7 + 1];
                i5 = 0;
            }
            while (i5 < 16) {
                $11 = ($10 + 31) % 128;
                char c7 = cArr4[1];
                char c8 = cArr4[0];
                char c9 = (char) (c7 - (((c8 + i9) ^ ((c8 << 4) + ((char) (AFKeystoreWrapper ^ (-8918198944764412327L))))) ^ ((c8 >>> 5) + ((char) (registerClient ^ (-8918198944764412327L))))));
                cArr4[1] = c9;
                cArr4[0] = (char) (c8 - (((c9 >>> 5) + ((char) (AFLogger ^ (-8918198944764412327L)))) ^ ((c9 + i9) ^ ((c9 << 4) + ((char) (AFInAppEventType ^ (-8918198944764412327L)))))));
                i9 -= 40503;
                i5++;
            }
            int i10 = aFk1mSDK.getCurrencyIso4217Code;
            cArr3[i10] = cArr4[0];
            cArr3[i10 + 1] = cArr4[1];
            aFk1mSDK.getCurrencyIso4217Code = i10 + 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void afInfoLog(Map<String, Object> map) {
        int i2;
        Intrinsics.checkNotNullParameter(map, "");
        String monetizationNetwork = this.toString.getMonetizationNetwork();
        if (monetizationNetwork != null) {
            f4310i = (unregisterClient + 63) % 128;
            if (monetizationNetwork.length() != 0) {
                map.put("appsflyerKey", monetizationNetwork);
                i2 = f4310i + 97;
                unregisterClient = i2 % 128;
                if (i2 % 2 == 0) {
                    int i5 = 2 / 0;
                    return;
                }
                return;
            }
        }
        f4310i = (unregisterClient + 67) % 128;
        i2 = f4310i + 97;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        int i2 = unregisterClient + 81;
        f4310i = i2 % 128;
        int i5 = i2 % 2;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) aFg1tSDK.AFInAppEventParameterName.getValue();
        if (i5 != 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    private static long component1() {
        int i2 = f4310i + 39;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            return System.currentTimeMillis() - SystemClock.elapsedRealtime();
        }
        return SystemClock.elapsedRealtime() + System.currentTimeMillis();
    }

    private void component2(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFh1uSDK aFh1uSDK = this.component2;
        HashMap hashMap = new HashMap(aFh1uSDK.getRevenue);
        aFh1uSDK.getRevenue.clear();
        aFh1uSDK.AFAdRevenueData.getCurrencyIso4217Code("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (!hashMap.isEmpty()) {
            int i2 = unregisterClient + 65;
            f4310i = i2 % 128;
            if (i2 % 2 != 0) {
                Map<String, Object> monetizationNetwork = AFa1tSDK.getMonetizationNetwork(map);
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                monetizationNetwork.put("gcd", hashMap);
            }
        }
        int i5 = f4310i + 3;
        unregisterClient = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        r5.put("onelink_id", r0);
        com.appsflyer.internal.AFg1tSDK.unregisterClient = (com.appsflyer.internal.AFg1tSDK.f4310i + 119) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void component3(Map<String, Object> map) {
        String string;
        String string2;
        int i2 = f4310i + 59;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            string = getRevenue().getString(AppsFlyerProperties.ONELINK_ID);
            string2 = getRevenue().getString(AppsFlyerProperties.ONELINK_VERSION);
            int i5 = 79 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            string = getRevenue().getString(AppsFlyerProperties.ONELINK_ID);
            string2 = getRevenue().getString(AppsFlyerProperties.ONELINK_VERSION);
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
    }

    private final void component4(Map<String, Object> map) {
        AFg1ySDK.AFa1tSDK monetizationNetwork = this.getRevenue.getMonetizationNetwork(this.AFAdRevenueData);
        float f7 = monetizationNetwork.getMonetizationNetwork;
        String str = monetizationNetwork.AFAdRevenueData;
        map.put("btl", String.valueOf(f7));
        if (str != null) {
            f4310i = (unregisterClient + 1) % 128;
            map.put("btch", str);
        }
        int i2 = f4310i + 91;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void copy(Map<String, Object> map) {
        int i2 = f4310i + 93;
        int i5 = i2 % 128;
        unregisterClient = i5;
        if (i2 % 2 != 0) {
            String str = this.equals.hashCode;
            throw null;
        }
        String str2 = this.equals.hashCode;
        if (str2 != null) {
            int i7 = i5 + 15;
            f4310i = i7 % 128;
            if (i7 % 2 != 0) {
                map.put("net_token", str2);
            } else {
                map.put("net_token", str2);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r0 > 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void copydefault(Map<String, Object> map) {
        long mediationNetwork;
        long j;
        long seconds;
        int i2 = unregisterClient + 63;
        f4310i = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            mediationNetwork = this.areAllFieldsValid.getMediationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
            j = System.currentTimeMillis();
            this.areAllFieldsValid.getRevenue("AppsFlyerTimePassedSincePrevLaunch", j);
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            mediationNetwork = this.areAllFieldsValid.getMediationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
            long currentTimeMillis = System.currentTimeMillis();
            this.areAllFieldsValid.getRevenue("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
            if (mediationNetwork > 0) {
                j = currentTimeMillis;
                int i5 = unregisterClient + 1;
                f4310i = i5 % 128;
                seconds = i5 % 2 == 0 ? TimeUnit.MILLISECONDS.toSeconds(mediationNetwork ^ j) : TimeUnit.MILLISECONDS.toSeconds(j - mediationNetwork);
            }
            seconds = -1;
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    private static void d(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{map}, -1939346047, 1939346058, (int) System.currentTimeMillis());
    }

    private void e(Map<String, Object> map) {
        unregisterClient = (f4310i + 19) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        boolean revenue = AFf1bSDK.getRevenue(this.AFAdRevenueData);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + revenue);
        if (!revenue) {
            int i2 = f4310i + 29;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("tokenRefreshConfigured", Boolean.FALSE);
                throw null;
            }
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFf1bSDK.getMonetizationNetwork(this.areAllFieldsValid)));
        int i5 = f4310i + 81;
        unregisterClient = i5 % 128;
        if (i5 % 2 != 0) {
            int i7 = 71 / 0;
        }
    }

    private String equals() {
        unregisterClient = (f4310i + 9) % 128;
        String string = getRevenue().getString("preInstallName");
        if (string != null) {
            return string;
        }
        String revenue = this.areAllFieldsValid.getRevenue("preInstallName", (String) null);
        if (revenue != null) {
            f4310i = (unregisterClient + 43) % 128;
            getRevenue().set("preInstallName", revenue);
            f4310i = (unregisterClient + 21) % 128;
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
        Intrinsics.checkNotNullParameter(map, "");
        if (getRevenue().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            f4310i = (unregisterClient + 105) % 128;
            try {
                this.AFAdRevenueData.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                str = this.component3.getCurrencyIso4217Code(this.AFAdRevenueData);
                unregisterClient = (f4310i + 113) % 128;
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                int i2 = f4310i + 99;
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

    private final void getMonetizationNetwork(Map<String, Object> map) {
        try {
            long longValue = getMediationNetwork().longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(longValue)));
            int i2 = f4310i + 95;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Exception e7) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e7);
        }
    }

    private final void hashCode(Map<String, Object> map) {
        int i2 = unregisterClient + 9;
        f4310i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        UiModeManager uiModeManager = (UiModeManager) this.AFAdRevenueData.getSystemService(UiModeManager.class);
        if (uiModeManager != null) {
            int i5 = unregisterClient + 115;
            f4310i = i5 % 128;
            if (i5 % 2 != 0 ? uiModeManager.getCurrentModeType() == 4 : uiModeManager.getCurrentModeType() == 2) {
                map.put("tv", Boolean.TRUE);
            }
        }
        int i7 = unregisterClient + 29;
        f4310i = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 98 / 0;
        }
    }

    private void i(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFb1mSDK l_ = AFb1jSDK.l_(this.AFAdRevenueData.getContentResolver());
        if (l_ != null) {
            unregisterClient = (f4310i + 83) % 128;
            map.put("amazon_aid", l_.getRevenue);
            map.put("amazon_aid_limit", String.valueOf(l_.getMonetizationNetwork));
            unregisterClient = (f4310i + 71) % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean registerClient() {
        boolean z7;
        f4310i = (unregisterClient + 107) % 128;
        if (!getRevenue().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            f4310i = (unregisterClient + 69) % 128;
            if (!getRevenue().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                z7 = false;
                if (!z7) {
                    AFa1tSDK.getMediationNetwork();
                    if (AFa1tSDK.getRevenue(this.AFAdRevenueData)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z7 = true;
        if (!z7) {
        }
        return true;
    }

    private final void toString(Map<String, Object> map) {
        int i2 = f4310i + 13;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            AFg1pSDK.getCurrencyIso4217Code(this.AFAdRevenueData);
            throw null;
        }
        if (AFg1pSDK.getCurrencyIso4217Code(this.AFAdRevenueData)) {
            map.put("inst_app", Boolean.TRUE);
        }
        int i5 = f4310i + 1;
        unregisterClient = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private void unregisterClient(Map<String, Object> map) {
        unregisterClient = (f4310i + 3) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.component3.getMonetizationNetwork(this.AFAdRevenueData)));
        unregisterClient = (f4310i + 123) % 128;
    }

    private void w(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (this.areAllFieldsValid.getMonetizationNetwork("is_stop_tracking_used")) {
            int i2 = unregisterClient + 19;
            f4310i = i2 % 128;
            if (i2 % 2 == 0) {
                map.put("istu", String.valueOf(this.areAllFieldsValid.getRevenue("is_stop_tracking_used")));
                int i5 = 47 / 0;
            } else {
                map.put("istu", String.valueOf(this.areAllFieldsValid.getRevenue("is_stop_tracking_used")));
            }
        }
        unregisterClient = (f4310i + 15) % 128;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        AFi1wSDK aFi1wSDK;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1pSDK aFi1pSDK = this.component4.getRevenue;
        if (aFi1pSDK != null) {
            f4310i = (unregisterClient + 29) % 128;
            aFi1wSDK = aFi1pSDK.AFAdRevenueData();
        } else {
            aFi1wSDK = null;
        }
        if (aFi1wSDK != null) {
            unregisterClient = (f4310i + 121) % 128;
            map.put("network", aFi1wSDK.AFAdRevenueData);
            map.put("ivc", Boolean.valueOf(aFi1wSDK.getRevenue()));
            if (!(!getRevenue().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false))) {
                return;
            }
            int i2 = unregisterClient + 47;
            f4310i = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = aFi1wSDK.getCurrencyIso4217Code;
            if (str != null) {
                map.put("operator", str);
                unregisterClient = (f4310i + 61) % 128;
            }
            String str2 = aFi1wSDK.getMonetizationNetwork;
            if (str2 != null) {
                map.put("carrier", str2);
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMediationNetwork(AFh1sSDK aFh1sSDK) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        if (aFh1sSDK.AFAdRevenueData()) {
            unregisterClient = (f4310i + 111) % 128;
            String str = aFh1sSDK.component2;
            AFc1gSDK aFc1gSDK = this.equals;
            getMonetizationNetwork(aFh1sSDK, str, aFc1gSDK.AFAdRevenueData, aFc1gSDK.getMediationNetwork);
        } else if (!(aFh1sSDK instanceof AFh1iSDK)) {
            unregisterClient = (f4310i + 53) % 128;
            Intrinsics.checkNotNullExpressionValue(map, "");
            String str2 = aFh1sSDK.areAllFieldsValid;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            getRevenue(map, str2);
        }
        AFe1lSDK aFe1lSDK = AFe1lSDK.CONVERSION;
        AFe1lSDK aFe1lSDK2 = AFe1lSDK.LAUNCH;
        if (r.d(aFe1lSDK, aFe1lSDK2, AFe1lSDK.INAPP).contains(aFh1sSDK.getRevenue())) {
            int i2 = unregisterClient + 37;
            f4310i = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                getCurrencyIso4217Code(new Object[]{this, map}, -2036410656, 2036410668, System.identityHashCode(this));
                int i5 = 5 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(map, "");
                getCurrencyIso4217Code(new Object[]{this, map}, -2036410656, 2036410668, System.identityHashCode(this));
            }
        }
        if (r.d(aFe1lSDK, aFe1lSDK2, AFe1lSDK.ATTR).contains(aFh1sSDK.getRevenue())) {
            unregisterClient = (f4310i + 43) % 128;
            Intrinsics.checkNotNullExpressionValue(map, "");
            copy(map);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
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
    public final void getRevenue(AFh1sSDK aFh1sSDK) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        if (this.component3.getMediationNetwork()) {
            AFh1rSDK aFh1rSDK = this.component3.getMediationNetwork.component2;
            if (aFh1rSDK == null) {
                return;
            }
            String str = aFh1rSDK.component3;
            if (str == null || str.length() == 0) {
                f4310i = (unregisterClient + 59) % 128;
            } else {
                aFh1sSDK.getMonetizationNetwork("gaidError", aFh1rSDK.component3);
            }
            String str2 = aFh1rSDK.getMonetizationNetwork;
            if (str2 != null && aFh1rSDK.getMediationNetwork != null) {
                aFh1sSDK.getMonetizationNetwork("advertiserId", str2);
                aFh1sSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(aFh1rSDK.getMediationNetwork));
                aFh1sSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(aFh1rSDK.getCurrencyIso4217Code));
            }
        } else {
            int i2 = f4310i + 121;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                Map<String, Object> monetizationNetwork = AFa1tSDK.getMonetizationNetwork(aFh1sSDK.AFAdRevenueData);
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                monetizationNetwork.put("ad_ids_disabled", Boolean.TRUE);
                int i5 = 49 / 0;
            } else {
                Map<String, Object> monetizationNetwork2 = AFa1tSDK.getMonetizationNetwork(aFh1sSDK.AFAdRevenueData);
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork2, "");
                monetizationNetwork2.put("ad_ids_disabled", Boolean.TRUE);
            }
        }
        AFh1rSDK aFh1rSDK2 = this.component3.getMediationNetwork.component2;
        aFh1sSDK.getMonetizationNetwork("GAID_retry", String.valueOf(aFh1rSDK2 != null ? Intrinsics.a(aFh1rSDK2.component1, Boolean.TRUE) : false));
        if (r.d(AFe1lSDK.CONVERSION, AFe1lSDK.LAUNCH).contains(aFh1sSDK.getRevenue())) {
            int i7 = unregisterClient + 17;
            f4310i = i7 % 128;
            if (i7 % 2 == 0) {
                AFd1dSDK aFd1dSDK = this.equals.component3;
                throw null;
            }
            AFd1dSDK aFd1dSDK2 = this.equals.component3;
            if (aFd1dSDK2 != null) {
                Map<String, Object> monetizationNetwork3 = AFa1tSDK.getMonetizationNetwork(aFh1sSDK.AFAdRevenueData);
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork3, "");
                monetizationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1dSDK2.AFAdRevenueData));
            }
        }
    }

    private static String areAllFieldsValid() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        int i2 = f4310i + 3;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return str;
    }

    private static void component1(Map<String, Object> map) {
        unregisterClient = (f4310i + 41) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("\uf08a兙黴ꥱ蟩䓗", Color.blue(0) + 5, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        unregisterClient = (f4310i + 85) % 128;
    }

    private final String AFKeystoreWrapper() {
        File file = (File) getCurrencyIso4217Code(new Object[]{getRevenue("ro.appsflyer.preinstall.path")}, -1713193942, 1713193943, (int) System.currentTimeMillis());
        if (!(!getRevenue(file))) {
            int i2 = unregisterClient + 55;
            f4310i = i2 % 128;
            if (i2 % 2 != 0) {
                file = (File) getCurrencyIso4217Code(new Object[]{getMediationNetwork("AF_PRE_INSTALL_PATH")}, -1713193942, 1713193943, (int) System.currentTimeMillis());
            } else {
                throw null;
            }
        }
        if (getRevenue(file)) {
            file = (File) getCurrencyIso4217Code(new Object[]{"/data/local/tmp/pre_install.appsflyer"}, -1713193942, 1713193943, (int) System.currentTimeMillis());
            unregisterClient = (f4310i + 121) % 128;
        }
        if (getRevenue(file)) {
            file = (File) getCurrencyIso4217Code(new Object[]{"/etc/pre_install.appsflyer"}, -1713193942, 1713193943, (int) System.currentTimeMillis());
            f4310i = (unregisterClient + 111) % 128;
        }
        if (getRevenue(file)) {
            int i5 = f4310i + 113;
            unregisterClient = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }
        String packageName = this.AFAdRevenueData.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        return (String) getCurrencyIso4217Code(new Object[]{file, packageName}, 1094427933, -1094427925, (int) System.currentTimeMillis());
    }

    private static void registerClient(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{map}, -1435534787, 1435534790, (int) System.currentTimeMillis());
    }

    private static List<AFe1lSDK> copy() {
        f4310i = (unregisterClient + 115) % 128;
        List<AFe1lSDK> d7 = r.d(AFe1lSDK.CONVERSION, AFe1lSDK.LAUNCH, AFe1lSDK.INAPP, AFe1lSDK.MANUAL_PURCHASE_VALIDATION, AFe1lSDK.ARS_VALIDATE, AFe1lSDK.PURCHASE_VALIDATE, AFe1lSDK.ADREVENUE);
        int i2 = f4310i + 19;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            return d7;
        }
        throw null;
    }

    private final void areAllFieldsValid(Map<String, Object> map) {
        if (!getRevenue().isOtherSdkStringDisabled()) {
            int i2 = f4310i + 85;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("batteryLevel", String.valueOf(this.getRevenue.getMonetizationNetwork(this.AFAdRevenueData).getMonetizationNetwork));
                int i5 = 33 / 0;
            } else {
                map.put("batteryLevel", String.valueOf(this.getRevenue.getMonetizationNetwork(this.AFAdRevenueData).getMonetizationNetwork));
            }
        }
        unregisterClient = (f4310i + 45) % 128;
    }

    private String component4() {
        int i2 = f4310i + 37;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            String revenue = this.areAllFieldsValid.getRevenue("INSTALL_STORE", (String) null);
            if (revenue != null) {
                unregisterClient = (f4310i + 93) % 128;
                return revenue;
            }
            String component2 = component2();
            if (component2 != null) {
                this.areAllFieldsValid.getMediationNetwork("INSTALL_STORE", component2);
            }
            return component2;
        }
        this.areAllFieldsValid.getRevenue("INSTALL_STORE", (String) null);
        throw null;
    }

    private void equals(Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -2036410656, 2036410668, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMonetizationNetwork(AFh1sSDK aFh1sSDK) {
        f4310i = (unregisterClient + 43) % 128;
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getRevenue(map, aFh1sSDK.AFAdRevenueData());
        component1(map);
        getCurrencyIso4217Code(new Object[]{map}, -1939346047, 1939346058, (int) System.currentTimeMillis());
        getCurrencyIso4217Code(map);
        AFAdRevenueData(map, this.equals.getCurrencyIso4217Code);
        i(map);
        map.put("cell", I.e(new Pair("mcc", Integer.valueOf(this.AFAdRevenueData.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.AFAdRevenueData.getResources().getConfiguration().mnc))));
        map.put("sig", AFAdRevenueData());
        map.put("last_boot_time", Long.valueOf(component1()));
        map.put("disk", areAllFieldsValid());
        int i2 = unregisterClient + 33;
        f4310i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        Map map = (Map) objArr[0];
        unregisterClient = (f4310i + 119) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
        } catch (Exception e7) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e7);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
            unregisterClient = (f4310i + 69) % 128;
        } catch (Exception e8) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e8);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            int i2 = f4310i + 7;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                int i5 = 67 / 0;
            }
            return null;
        } catch (Exception e9) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e9);
            return null;
        }
    }

    private String component2() {
        int i2 = unregisterClient + 63;
        f4310i = i2 % 128;
        if (i2 % 2 == 0) {
            String string = getRevenue().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            int i5 = 42 / 0;
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
        unregisterClient = (f4310i + 73) % 128;
        return mediationNetwork;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = unregisterClient + 93;
        f4310i = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(aFg1tSDK.AFAdRevenueData.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            unregisterClient = (f4310i + 33) % 128;
            return null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(aFg1tSDK.AFAdRevenueData.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        throw null;
    }

    private final String copydefault() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, -1753918154, 1753918160, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r1.length() == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r1.length() == 0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object component4(Object[] objArr) {
        int i2;
        boolean z7 = false;
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, "");
        String string = aFg1tSDK.getRevenue().getString(AppsFlyerProperties.EXTENSION);
        if (string != null) {
            int i5 = unregisterClient + 43;
            f4310i = i5 % 128;
            if (i5 % 2 == 0) {
                int i7 = 14 / 0;
            }
            if (!z7) {
                unregisterClient = (f4310i + 99) % 128;
                map.put(AppsFlyerProperties.EXTENSION, string);
            }
            i2 = unregisterClient + 1;
            f4310i = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        z7 = true;
        if (!z7) {
        }
        i2 = unregisterClient + 1;
        f4310i = i2 % 128;
        if (i2 % 2 == 0) {
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
    
        com.appsflyer.internal.AFg1tSDK.unregisterClient = (com.appsflyer.internal.AFg1tSDK.f4310i + 69) % 128;
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
        com.appsflyer.internal.AFg1tSDK.f4310i = r4;
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
        int i2 = f4310i + 43;
        int i5 = i2 % 128;
        unregisterClient = i5;
        int i7 = i2 % 2;
        ?? r32 = i7;
        if (i7 != 0) {
            r32 = 89 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i2, int i5, int i7) {
        int i8 = ((~(i2 | i5 | i7)) * (-301)) + (i5 * 302) + (i2 * (-300));
        int i9 = ~i5;
        switch ((((~((~i2) | i7)) | i9) * 301) + (((~(i9 | i7)) | (~((~i7) | i2))) * (-301)) + i8) {
            case 1:
                return getCurrencyIso4217Code(objArr);
            case 2:
                Map map = (Map) objArr[0];
                AFh1sSDK aFh1sSDK = (AFh1sSDK) objArr[1];
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(aFh1sSDK, "");
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
                f4310i = (unregisterClient + 33) % 128;
                Intrinsics.checkNotNullParameter(map3, "");
                String currencyIso4217Code = AFb1iSDK.getCurrencyIso4217Code(aFg1tSDK.component3.getCurrencyIso4217Code);
                if (currencyIso4217Code != null) {
                    map3.put("uid", currencyIso4217Code);
                    boolean revenue = aFg1tSDK.component3.getCurrencyIso4217Code.getRevenue("CUSTOM_INSTALL_ID_APPLIED");
                    Intrinsics.checkNotNullExpressionValue(Boolean.valueOf(revenue), "");
                    if (revenue) {
                        map3.put("custom_install_id", Boolean.TRUE);
                        unregisterClient = (f4310i + 9) % 128;
                    }
                }
                return null;
            case 5:
                return getMonetizationNetwork(objArr);
            case 6:
                return getRevenue(objArr);
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return areAllFieldsValid(objArr);
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                return component2(objArr);
            case 9:
                return component4(objArr);
            case 10:
                AFg1tSDK aFg1tSDK2 = (AFg1tSDK) objArr[0];
                Map map4 = (Map) objArr[1];
                String str2 = (String) objArr[2];
                Intrinsics.checkNotNullParameter(map4, "");
                if (str2 != null && str2.length() != 0) {
                    unregisterClient = (f4310i + 95) % 128;
                    map4.put("referrer", str2);
                }
                String revenue2 = aFg1tSDK2.areAllFieldsValid.getRevenue("extraReferrers", (String) null);
                if (revenue2 != null) {
                    map4.put("extraReferrers", revenue2);
                }
                String referrer = aFg1tSDK2.getRevenue().getReferrer(aFg1tSDK2.areAllFieldsValid);
                if (referrer != null && referrer.length() != 0 && map4.get("referrer") == null) {
                    map4.put("referrer", referrer);
                }
                unregisterClient = (f4310i + 43) % 128;
                return null;
            case RequestError.STOP_TRACKING /* 11 */:
                return component1(objArr);
            case 12:
                return component3(objArr);
            default:
                return AFAdRevenueData(objArr);
        }
    }

    private String AFAdRevenueData() {
        int i2 = unregisterClient + 75;
        f4310i = i2 % 128;
        if (i2 % 2 == 0) {
            AFj1pSDK.N_(this.AFAdRevenueData.getApplicationContext().getPackageManager(), this.AFAdRevenueData.getApplicationContext().getPackageName());
            throw null;
        }
        String N_ = AFj1pSDK.N_(this.AFAdRevenueData.getApplicationContext().getPackageManager(), this.AFAdRevenueData.getApplicationContext().getPackageName());
        int i5 = unregisterClient + 3;
        f4310i = i5 % 128;
        if (i5 % 2 != 0) {
            return N_;
        }
        throw null;
    }

    private boolean component3() {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this}, 1014234818, -1014234818, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void AFAdRevenueData(AFh1sSDK aFh1sSDK) {
        f4310i = (unregisterClient + 1) % 128;
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put("open_referrer", aFh1sSDK.getMonetizationNetwork);
        String str = aFh1sSDK.equals;
        if (str != null) {
            int i2 = f4310i + 109;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                int i5 = 49 / 0;
                if (StringsKt.z(str)) {
                    return;
                }
            } else if (StringsKt.z(str)) {
                return;
            }
            f4310i = (unregisterClient + 117) % 128;
            map.put("af_web_referrer", aFh1sSDK.equals);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (r1.component3() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0045, code lost:
    
        if (r9 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0061, code lost:
    
        com.appsflyer.internal.AFg1tSDK.unregisterClient = (com.appsflyer.internal.AFg1tSDK.f4310i + 109) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        boolean z7 = false;
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        int intValue = ((Number) objArr[2]).intValue();
        int intValue2 = ((Number) objArr[3]).intValue();
        int i2 = f4310i + 9;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(intValue));
            map.put("iaecounter", String.valueOf(intValue2));
            boolean component3 = aFg1tSDK.component3();
            int i5 = 12 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(intValue));
            map.put("iaecounter", String.valueOf(intValue2));
        }
        map.put("isFirstCall", String.valueOf(z7));
        return null;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMediationNetwork(Map<String, Object> map) {
        Object n7;
        AFLogger aFLogger;
        AFg1cSDK aFg1cSDK;
        int i2;
        Object obj;
        String str;
        boolean z7;
        boolean z8;
        boolean z9;
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.equals.getRevenue;
        if (str2 != null) {
            if (map.get("af_deeplink") != null) {
                int i5 = f4310i + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
                unregisterClient = i5 % 128;
                if (i5 % 2 != 0) {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                    throw null;
                }
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    R5.l lVar = R5.n.f2421d;
                    JSONObject jSONObject = new JSONObject(str2);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    n7 = Unit.f6114a;
                    f4310i = (unregisterClient + 71) % 128;
                } catch (Throwable th) {
                    R5.l lVar2 = R5.n.f2421d;
                    n7 = V6.b.n(th);
                }
                Throwable a7 = R5.n.a(n7);
                if (a7 != null) {
                    int i7 = f4310i + 65;
                    unregisterClient = i7 % 128;
                    if (i7 % 2 != 0) {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.GENERAL;
                        i2 = 36;
                        obj = null;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z7 = false;
                        z8 = false;
                        z9 = true;
                    } else {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.GENERAL;
                        i2 = 120;
                        obj = null;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z7 = false;
                        z8 = false;
                        z9 = false;
                    }
                    AFg1hSDK.e$default(aFLogger, aFg1cSDK, str, a7, z7, z8, z9, false, i2, obj);
                }
            }
        }
        this.equals.getRevenue = null;
        int i8 = f4310i + 19;
        unregisterClient = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("AppsFlyer: first launch detected");
        r0 = r11.format(new java.util.Date());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r10.areAllFieldsValid.getMediationNetwork("appsFlyerFirstInstall", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        com.appsflyer.internal.AFg1tSDK.unregisterClient = (com.appsflyer.internal.AFg1tSDK.f4310i + 109) % 128;
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r12 > 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String AFAdRevenueData(SimpleDateFormat simpleDateFormat, int i2) {
        String revenue;
        int i5 = unregisterClient + 97;
        f4310i = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            revenue = this.areAllFieldsValid.getRevenue("appsFlyerFirstInstall", (String) null);
            int i7 = 94 / 0;
        } else {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            revenue = this.areAllFieldsValid.getRevenue("appsFlyerFirstInstall", (String) null);
        }
        AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, r4.f.i("AppsFlyer: first launch date: ", revenue), false, 4, null);
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        return revenue;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getRevenue(Map<String, Object> map) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(map, "");
        String string = getRevenue().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            int i2 = unregisterClient + 53;
            f4310i = i2 % 128;
            if (i2 % 2 == 0) {
                map.put(AppsFlyerProperties.APP_ID, string);
                int i5 = 8 / 0;
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
                String obj = sb.toString();
                Intrinsics.checkNotNullExpressionValue(obj, "");
                AFLogger.afWarnLog(obj);
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
            f4310i = (unregisterClient + 27) % 128;
            map.put("appUserId", string5);
        }
        String string6 = getRevenue().getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        } else {
            unregisterClient = (f4310i + 111) % 128;
        }
        AFb1uSDK aFb1uSDK = this.equals.getMonetizationNetwork;
        if (aFb1uSDK == null || (strArr = aFb1uSDK.getRevenue) == null) {
            return;
        }
        map.put("sharing_filter", strArr);
    }

    private void getMonetizationNetwork(AFh1sSDK aFh1sSDK, String str, String str2, AFb1qSDK aFb1qSDK) {
        int i2 = unregisterClient + 117;
        f4310i = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFh1sSDK, "");
            Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
            if (aFh1sSDK.getRevenue() == AFe1lSDK.CONVERSION) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                areAllFieldsValid(map);
                hashCode(map);
                toString(map);
                AFa1zSDK.getCurrencyIso4217Code(this.hashCode, this.component3);
            }
            Intrinsics.checkNotNullExpressionValue(map, "");
            copydefault(map);
            component3(map);
            component2((Map<String, ? extends Object>) map);
            getMonetizationNetwork(map, str2);
            getCurrencyIso4217Code(new Object[]{this, map, str}, 2080605436, -2080605426, System.identityHashCode(this));
            AFInAppEventParameterName(map);
            if (aFb1qSDK != null) {
                f4310i = (unregisterClient + 15) % 128;
                aFb1qSDK.AFAdRevenueData(map);
                return;
            }
            return;
        }
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Map<String, Object> map2 = aFh1sSDK.AFAdRevenueData;
        aFh1sSDK.getRevenue();
        AFe1lSDK aFe1lSDK = AFe1lSDK.RC_CDN;
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getCurrencyIso4217Code(AFh1sSDK aFh1sSDK) {
        unregisterClient = (f4310i + 69) % 128;
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getMonetizationNetwork(map);
        Map<String, Object> map2 = aFh1sSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        getRevenue(map2, aFh1sSDK.component1);
        Map<String, Object> map3 = aFh1sSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        AFLogger(map3);
        Map<String, Object> map4 = aFh1sSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        unregisterClient(map4);
        Map<String, Object> map5 = aFh1sSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map5, "");
        force(map5);
        Map<String, Object> map6 = aFh1sSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map6, "");
        AFe1lSDK revenue = aFh1sSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        getRevenue(map6, revenue);
        int i2 = f4310i + 15;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void getMediationNetwork(Map<String, Object> map, boolean z7) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.getMonetizationNetwork);
        if (!(!z7)) {
            int i2 = f4310i + 75;
            unregisterClient = i2 % 128;
            if (i2 % 2 == 0) {
                map.put("platform_extension_v2", this.getMediationNetwork.getRevenue());
            } else {
                map.put("platform_extension_v2", this.getMediationNetwork.getRevenue());
                throw null;
            }
        }
        int i5 = unregisterClient + 93;
        f4310i = i5 % 128;
        if (i5 % 2 == 0) {
            int i7 = 23 / 0;
        }
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        int i2 = unregisterClient + 49;
        f4310i = i2 % 128;
        int i5 = i2 % 2;
        String revenue = aFg1tSDK.areAllFieldsValid.getRevenue("sentSuccessfully", (String) null);
        if (i5 != 0) {
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

    private Long getMediationNetwork() {
        int i2 = unregisterClient + 73;
        f4310i = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.valueOf(this.component3.n_().firstInstallTime);
        }
        long j = this.component3.n_().firstInstallTime;
        throw null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        Map map = (Map) objArr[0];
        f4310i = (unregisterClient + 9) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String revenue = AFa1zSDK.getRevenue();
        String currencyIso4217Code = AFa1zSDK.getCurrencyIso4217Code();
        if (revenue != null) {
            int i2 = f4310i;
            int i5 = i2 + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
            unregisterClient = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (currencyIso4217Code != null) {
                int i7 = i2 + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
                unregisterClient = i7 % 128;
                if (i7 % 2 == 0) {
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

    private static void getMonetizationNetwork(Map<String, Object> map, String str) {
        int i2 = f4310i + 59;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (str != null) {
                int i5 = f4310i + 19;
                unregisterClient = i5 % 128;
                if (i5 % 2 == 0) {
                    map.put("phone", str);
                } else {
                    map.put("phone", str);
                    throw null;
                }
            }
            int i7 = unregisterClient + 57;
            f4310i = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 0;
                return;
            }
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final long getCurrencyIso4217Code() {
        int i2 = unregisterClient + 121;
        f4310i = i2 % 128;
        if (i2 % 2 != 0) {
            return System.currentTimeMillis();
        }
        int i5 = 89 / 0;
        return System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (registerClient() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        r6 = (java.lang.String) getCurrencyIso4217Code(new java.lang.Object[]{r5}, -1753918154, 1753918160, java.lang.System.identityHashCode(r5));
        com.appsflyer.internal.AFg1tSDK.unregisterClient = (com.appsflyer.internal.AFg1tSDK.f4310i + 63) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (registerClient() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
    
        r0 = r0 + 51;
        com.appsflyer.internal.AFg1tSDK.unregisterClient = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if ((r0 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r3 = 56 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r6.length() != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        if (r6.length() != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0021, code lost:
    
        if (r6 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r6 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        r6 = com.appsflyer.internal.AFg1tSDK.f4310i + 121;
        com.appsflyer.internal.AFg1tSDK.unregisterClient = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if ((r6 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        r0 = 96 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String getCurrencyIso4217Code(String str) {
        if (getRevenue().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) {
            int i2 = f4310i;
            int i5 = i2 + 125;
            unregisterClient = i5 % 128;
            if (i5 % 2 != 0) {
                int i7 = 86 / 0;
            }
        }
        if (str != null) {
            return str;
        }
        return null;
    }

    private static String getMonetizationNetwork(AFc1jSDK aFc1jSDK, String str) {
        unregisterClient = (f4310i + 113) % 128;
        String revenue = aFc1jSDK.getRevenue("CACHED_CHANNEL", (String) null);
        if (revenue != null) {
            unregisterClient = (f4310i + 71) % 128;
            return revenue;
        }
        aFc1jSDK.getMediationNetwork("CACHED_CHANNEL", str);
        return str;
    }

    private final String getMediationNetwork(String str) {
        unregisterClient = (f4310i + 53) % 128;
        String monetizationNetwork = this.component3.getMonetizationNetwork(str);
        f4310i = (unregisterClient + 33) % 128;
        return monetizationNetwork;
    }

    private static String getMediationNetwork(File file, String str) {
        return (String) getCurrencyIso4217Code(new Object[]{file, str}, 1094427933, -1094427925, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getRevenue(Map<String, Object> map, AFe1lSDK aFe1lSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1lSDK, "");
        if (copy().contains(aFe1lSDK)) {
            if (this.equals.getMonetizationNetwork()) {
                f4310i = (unregisterClient + 49) % 128;
                map.put("app_set_id", H.b(new Pair("app_set_id_disabled", Boolean.TRUE)));
                if (this.equals.equals != null) {
                    AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
                    return;
                }
                AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
                int i2 = f4310i + 15;
                unregisterClient = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            AFb1gSDK aFb1gSDK = this.equals.equals;
            if (aFb1gSDK != null) {
                unregisterClient = (f4310i + 111) % 128;
                map.put("app_set_id", I.e(new Pair("scope", Integer.valueOf(aFb1gSDK.getCurrencyIso4217Code)), new Pair("id", aFb1gSDK.AFAdRevenueData)));
            }
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String str = (String) objArr[0];
        int i2 = f4310i;
        int i5 = i2 + 105;
        unregisterClient = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                throw null;
            }
            if (str != null) {
                int i7 = i2 + 23;
                unregisterClient = i7 % 128;
                if (i7 % 2 == 0) {
                    if (StringsKt.J(str).toString().length() > 0) {
                        return new File(StringsKt.J(str).toString());
                    }
                } else {
                    StringsKt.J(str).toString().getClass();
                    throw null;
                }
            }
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private static void getMonetizationNetwork(Map<String, Object> map, AFh1sSDK aFh1sSDK) {
        getCurrencyIso4217Code(new Object[]{map, aFh1sSDK}, 840096267, -840096265, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMonetizationNetwork(Map<String, Object> map, int i2, int i5) {
        getCurrencyIso4217Code(new Object[]{this, map, Integer.valueOf(i2), Integer.valueOf(i5)}, -2094417187, 2094417192, i2);
    }

    private final SimpleDateFormat getMonetizationNetwork() {
        return (SimpleDateFormat) getCurrencyIso4217Code(new Object[]{this}, 1763970142, -1763970135, System.identityHashCode(this));
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, String str) {
        getCurrencyIso4217Code(new Object[]{this, map, str}, 2080605436, -2080605426, System.identityHashCode(this));
    }

    private void getRevenue(Map<String, Object> map, boolean z7) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", getRevenue("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", getRevenue("ro.product.cpu.abi2"));
        hashMap.put("arch", getRevenue("os.arch"));
        hashMap.put("build_display_id", getRevenue("ro.build.display.id"));
        if (z7) {
            f4310i = (unregisterClient + 125) % 128;
            component4(hashMap);
            if (this.component3.getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0) <= 2) {
                int i2 = unregisterClient + 111;
                f4310i = i2 % 128;
                if (i2 % 2 == 0) {
                    hashMap.putAll(this.getCurrencyIso4217Code.AFAdRevenueData());
                    int i5 = 75 / 0;
                } else {
                    hashMap.putAll(this.getCurrencyIso4217Code.AFAdRevenueData());
                }
                f4310i = (unregisterClient + 15) % 128;
            }
        }
        hashMap.put("dim", this.component1.getMonetizationNetwork(this.AFAdRevenueData));
        map.put("deviceData", hashMap);
        int i7 = f4310i + 83;
        unregisterClient = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private final AppsFlyerProperties getRevenue() {
        f4310i = (unregisterClient + 63) % 128;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) this.copydefault.getValue();
        f4310i = (unregisterClient + 13) % 128;
        return appsFlyerProperties;
    }

    private final void getRevenue(Map<String, Object> map, int i2) {
        unregisterClient = (f4310i + 71) % 128;
        try {
            if (this.component3.n_().versionCode > this.areAllFieldsValid.getCurrencyIso4217Code("versionCode", 0)) {
                this.areAllFieldsValid.AFAdRevenueData("versionCode", this.component3.n_().versionCode);
                f4310i = (unregisterClient + 63) % 128;
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
            Intrinsics.checkNotNullExpressionValue(simpleDateFormat, "");
            map.put(intern, AFAdRevenueData(simpleDateFormat, i2));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
    
        r8.areAllFieldsValid.getMediationNetwork("prev_event_name", r10);
        r8.areAllFieldsValid.getRevenue("prev_event_timestamp", java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        r9 = com.appsflyer.internal.AFg1tSDK.unregisterClient + 15;
        com.appsflyer.internal.AFg1tSDK.f4310i = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
    
        if ((r9 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r4 = new org.json.JSONObject();
        r4.put("prev_event_timestamp", r8.areAllFieldsValid.getMediationNetwork("prev_event_timestamp", -1));
        r4.put("prev_event_name", r0);
        r9.put("prev_event", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        com.appsflyer.internal.AFg1tSDK.f4310i = (com.appsflyer.internal.AFg1tSDK.unregisterClient + 51) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r0 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getRevenue(Map<String, Object> map, String str) {
        String revenue;
        int i2 = f4310i + 119;
        unregisterClient = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                revenue = this.areAllFieldsValid.getRevenue("prev_event_name", (String) null);
                int i5 = 19 / 0;
            } else {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                revenue = this.areAllFieldsValid.getRevenue("prev_event_name", (String) null);
            }
        } catch (Exception e7) {
            AFLogger.afErrorLog("Error while processing previous event.", e7);
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
        } catch (Exception e7) {
            AFLogger.afErrorLog(e7.getMessage(), e7);
        }
        if (revenue != null) {
            AFLogger.afDebugLog("use cached AndroidId: " + revenue);
            unregisterClient = (f4310i + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE) % 128;
            return revenue;
        }
        int i2 = unregisterClient + 125;
        f4310i = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static String getRevenue(String str) {
        f4310i = (unregisterClient + 91) % 128;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.c(invoke, "");
            String str2 = (String) invoke;
            int i2 = unregisterClient + 31;
            f4310i = i2 % 128;
            if (i2 % 2 == 0) {
                int i5 = 57 / 0;
            }
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private static boolean getRevenue(File file) {
        int i2 = unregisterClient + 113;
        f4310i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (file != null && file.exists()) {
            return false;
        }
        f4310i = (unregisterClient + 35) % 128;
        return true;
    }
}
