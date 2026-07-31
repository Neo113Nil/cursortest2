package com.appsflyer.internal;

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
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFg1uSDK;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.b9;
import com.ironsource.ge;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1oSDK implements AFg1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: d, reason: collision with root package name */
    private static int f13370d = 1;

    /* renamed from: w, reason: collision with root package name */
    private static int f13371w;
    private final AFj1lSDK AFAdRevenueData;
    private final W1.h AFLogger;
    private final AFh1vSDK areAllFieldsValid;
    private final AFi1tSDK component1;
    private final AFg1vSDK component2;
    private final AFc1pSDK component3;
    private final AFc1qSDK component4;
    private final AFc1kSDK copy;
    private final W1.h copydefault;
    private final AFf1gSDK equals;
    private final String getCurrencyIso4217Code;
    private final AFg1uSDK getMediationNetwork;
    private final Context getMonetizationNetwork;
    private final AFi1lSDK getRevenue;
    private final AFg1xSDK hashCode;
    private final AFc1iSDK toString;
    private static char[] registerClient = {8582, 8581, 8594, 8595, 8592, 8312, 8589, 8593, 8606, 8579, 8580, 8288, 8577, 8578, 8576};
    private static int AFKeystoreWrapper = -771284948;
    private static boolean AFInAppEventParameterName = true;
    private static boolean AFInAppEventType = true;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFg1oSDK$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.jvm.internal.s implements Function0<SimpleDateFormat> {
        public static final AnonymousClass1 AFAdRevenueData = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFg1oSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.jvm.internal.s implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass4 getMediationNetwork = new AnonymousClass4();

        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    public AFg1oSDK(String str, Context context, AFi1lSDK aFi1lSDK, AFg1uSDK aFg1uSDK, AFj1lSDK aFj1lSDK, AFg1vSDK aFg1vSDK, AFh1vSDK aFh1vSDK, AFc1qSDK aFc1qSDK, AFc1pSDK aFc1pSDK, AFi1tSDK aFi1tSDK, AFf1gSDK aFf1gSDK, AFc1iSDK aFc1iSDK, AFg1xSDK aFg1xSDK, AFc1kSDK aFc1kSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1uSDK, "");
        Intrinsics.checkNotNullParameter(aFj1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFi1tSDK, "");
        Intrinsics.checkNotNullParameter(aFf1gSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = context;
        this.getRevenue = aFi1lSDK;
        this.getMediationNetwork = aFg1uSDK;
        this.AFAdRevenueData = aFj1lSDK;
        this.component2 = aFg1vSDK;
        this.areAllFieldsValid = aFh1vSDK;
        this.component4 = aFc1qSDK;
        this.component3 = aFc1pSDK;
        this.component1 = aFi1tSDK;
        this.equals = aFf1gSDK;
        this.toString = aFc1iSDK;
        this.hashCode = aFg1xSDK;
        this.copy = aFc1kSDK;
        this.copydefault = W1.i.b(AnonymousClass4.getMediationNetwork);
        this.AFLogger = W1.i.b(AnonymousClass1.AFAdRevenueData);
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        boolean z4 = false;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        AFh1rSDK aFh1rSDK = (AFh1rSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        if (aFg1oSDK.component3.component4()) {
            AFh1oSDK aFh1oSDK = aFg1oSDK.component3.getCurrencyIso4217Code.component3;
            if (aFh1oSDK == null) {
                return null;
            }
            String str = aFh1oSDK.areAllFieldsValid;
            if (str != null) {
                f13370d = (f13371w + InterfaceC1490j3.d.b.f16815g) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (str.length() != 0) {
                    aFh1rSDK.getMediationNetwork("gaidError", aFh1oSDK.areAllFieldsValid);
                    f13371w = (f13370d + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
            }
            String str2 = aFh1oSDK.AFAdRevenueData;
            if (str2 != null && aFh1oSDK.getMonetizationNetwork != null) {
                aFh1rSDK.getMediationNetwork("advertiserId", str2);
                aFh1rSDK.getMediationNetwork("advertiserIdEnabled", String.valueOf(aFh1oSDK.getMonetizationNetwork));
                aFh1rSDK.getMediationNetwork("isGaidWithGps", String.valueOf(aFh1oSDK.getMediationNetwork));
            }
        } else {
            Map<String, Object> revenue = AFa1tSDK.getRevenue(aFh1rSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            revenue.put("ad_ids_disabled", Boolean.TRUE);
        }
        AFh1oSDK aFh1oSDK2 = aFg1oSDK.component3.getCurrencyIso4217Code.component3;
        if (aFh1oSDK2 != null) {
            int i4 = f13370d + 23;
            f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                Intrinsics.areEqual(aFh1oSDK2.component2, Boolean.TRUE);
                throw null;
            }
            z4 = Intrinsics.areEqual(aFh1oSDK2.component2, Boolean.TRUE);
        }
        aFh1rSDK.getMediationNetwork("GAID_retry", String.valueOf(z4));
        if (CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH}).contains(aFh1rSDK.getCurrencyIso4217Code())) {
            f13370d = (f13371w + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFd1hSDK aFd1hSDK = aFg1oSDK.copy.component4;
            if (aFd1hSDK != null) {
                Map<String, Object> revenue2 = AFa1tSDK.getRevenue(aFh1rSDK.AFAdRevenueData);
                Intrinsics.checkNotNullExpressionValue(revenue2, "");
                revenue2.put("fetchAdIdLatency", Long.valueOf(aFd1hSDK.getRevenue));
                return null;
            }
        }
        int i5 = f13371w + 35;
        f13370d = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String AFInAppEventParameterName() {
        String str;
        int i4 = f13371w + 67;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i5 = i4 % 2;
        try {
        } catch (Exception e4) {
            AFLogger.afErrorLog(e4.getMessage(), e4);
            str = i5;
        }
        if (i5 == 0) {
            this.component4.AFAdRevenueData("androidIdCached", (String) null);
            Settings.Secure.getString(this.getMonetizationNetwork.getContentResolver(), "android_id");
            throw null;
        }
        String AFAdRevenueData = this.component4.AFAdRevenueData("androidIdCached", (String) null);
        String string = Settings.Secure.getString(this.getMonetizationNetwork.getContentResolver(), "android_id");
        str = AFAdRevenueData;
        if (string != null) {
            return string;
        }
        if (str == 0) {
            return null;
        }
        f13370d = (f13371w + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger.afDebugLog("use cached AndroidId: " + str);
        int i6 = f13370d + 125;
        f13371w = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 != 0) {
            int i7 = 82 / 0;
        }
        return str;
    }

    private static void AFInAppEventType(Map<String, Object> map) {
        int i4 = f13370d + InterfaceC1490j3.d.b.f16815g;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFa1zSDK.getCurrencyIso4217Code();
            AFa1zSDK.getRevenue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        Object currencyIso4217Code = AFa1zSDK.getCurrencyIso4217Code();
        String revenue = AFa1zSDK.getRevenue();
        if (currencyIso4217Code == null || revenue == null || Integer.parseInt(revenue) <= 0) {
            return;
        }
        int i5 = f13371w + 27;
        f13370d = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            map.put("reinstallCounter", revenue);
            map.put("originalAppsflyerId", currencyIso4217Code);
        } else {
            map.put("reinstallCounter", revenue);
            map.put("originalAppsflyerId", currencyIso4217Code);
            throw null;
        }
    }

    private void AFKeystoreWrapper(Map<String, Object> map) {
        int i4 = f13371w + InterfaceC1490j3.d.b.f16817i;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
        if (string != null) {
            f13371w = (f13370d + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (string.length() == 0) {
                return;
            }
            map.put(AppsFlyerProperties.EXTENSION, string);
        }
    }

    private void AFLogger(Map<String, Object> map) {
        getMediationNetwork(new Object[]{this, map}, -140518465, 140518471, System.identityHashCode(this));
    }

    private static void a(String str, int[] iArr, String str2, int i4, Object[] objArr) {
        int i5;
        char[] cArr = str2;
        if (str2 != null) {
            $11 = ($10 + 17) % UserVerificationMethods.USER_VERIFY_PATTERN;
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        char[] cArr3 = registerClient;
        if (cArr3 != null) {
            $11 = ($10 + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr4[i6] = (char) (cArr3[i6] ^ (-5879130172463570806L));
            }
            cArr3 = cArr4;
        }
        int i7 = (int) ((-5879130172463570806L) ^ AFKeystoreWrapper);
        if (AFInAppEventType) {
            int length2 = bArr2.length;
            aFk1nSDK.getMonetizationNetwork = length2;
            char[] cArr5 = new char[length2];
            aFk1nSDK.AFAdRevenueData = 0;
            while (true) {
                int i8 = aFk1nSDK.AFAdRevenueData;
                int i9 = aFk1nSDK.getMonetizationNetwork;
                if (i8 >= i9) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i8] = (char) (cArr3[bArr2[(i9 - 1) - i8] + i4] - i7);
                    aFk1nSDK.AFAdRevenueData = i8 + 1;
                }
            }
        } else if (AFInAppEventParameterName) {
            $10 = ($11 + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
            int length3 = cArr2.length;
            aFk1nSDK.getMonetizationNetwork = length3;
            char[] cArr6 = new char[length3];
            aFk1nSDK.AFAdRevenueData = 0;
            while (true) {
                int i10 = aFk1nSDK.AFAdRevenueData;
                int i11 = aFk1nSDK.getMonetizationNetwork;
                if (i10 >= i11) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i12 = $10 + 13;
                $11 = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i12 % 2 == 0) {
                    cArr6[i10] = (char) (cArr3[cArr2[i11 * i10] - i4] / i7);
                    i5 = i10 % 0;
                } else {
                    cArr6[i10] = (char) (cArr3[cArr2[(i11 - 1) - i10] - i4] - i7);
                    i5 = i10 + 1;
                }
                aFk1nSDK.AFAdRevenueData = i5;
            }
        } else {
            int length4 = iArr.length;
            aFk1nSDK.getMonetizationNetwork = length4;
            char[] cArr7 = new char[length4];
            aFk1nSDK.AFAdRevenueData = 0;
            while (true) {
                int i13 = aFk1nSDK.AFAdRevenueData;
                int i14 = aFk1nSDK.getMonetizationNetwork;
                if (i13 >= i14) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i13] = (char) (cArr3[iArr[(i14 - 1) - i13] - i4] - i7);
                    aFk1nSDK.AFAdRevenueData = i13 + 1;
                }
            }
        }
    }

    private void afDebugLog(Map<String, Object> map) {
        String str;
        int i4 = f13371w + InterfaceC1490j3.d.b.f16817i;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                return;
            }
        }
        try {
            this.getMonetizationNetwork.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
            str = this.component3.getCurrencyIso4217Code(this.getMonetizationNetwork);
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            int i5 = f13370d + 113;
            f13371w = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 == 0) {
                map.put("fb", str);
            } else {
                map.put("fb", str);
                throw null;
            }
        }
    }

    private void afErrorLog(Map<String, Object> map) {
        int i4 = f13370d + 89;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.copy.AFAdRevenueData();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        if (!this.copy.AFAdRevenueData()) {
            AFb1gSDK aFb1gSDK = this.copy.toString;
            if (aFb1gSDK != null) {
                f13371w = (f13370d + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
                map.put(CommonUrlParts.APP_SET_ID, MapsKt.mapOf(TuplesKt.to("scope", Integer.valueOf(aFb1gSDK.AFAdRevenueData)), TuplesKt.to("id", aFb1gSDK.getMonetizationNetwork)));
                return;
            }
            return;
        }
        map.put(CommonUrlParts.APP_SET_ID, MapsKt.mapOf(TuplesKt.to("app_set_id_disabled", Boolean.TRUE)));
        if (this.copy.toString == null) {
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
            return;
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
        int i5 = f13370d + InterfaceC1490j3.d.b.f16815g;
        f13371w = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private void afInfoLog(Map<String, Object> map) {
        f13370d = (f13371w + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component4.getMediationNetwork("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.component4.getMediationNetwork("is_stop_tracking_used", false)));
        }
        f13370d = (f13371w + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private void areAllFieldsValid(Map<String, Object> map) {
        f13371w = (f13370d + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        AFf1gSDK.getRevenue(map, this.component3);
        int i4 = f13370d + 85;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static long component1() {
        f13371w = (f13370d + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        int i4 = f13371w + 67;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return currentTimeMillis;
        }
        throw null;
    }

    private String component2() {
        int i4 = f13370d + 119;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            throw null;
        }
        String string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            string = AFAdRevenueData("AF_STORE");
        }
        int i5 = f13370d + 11;
        f13371w = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            return string;
        }
        throw null;
    }

    private static String component3() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        f13371w = (f13370d + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return str;
    }

    private String component4() {
        f13371w = (f13370d + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String N_ = AFj1iSDK.N_(this.getMonetizationNetwork.getApplicationContext().getPackageManager(), this.getMonetizationNetwork.getApplicationContext().getPackageName());
        int i4 = f13371w + 19;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return N_;
        }
        throw null;
    }

    private String copy() {
        f13371w = (f13370d + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString("preInstallName");
        if (string != null) {
            int i4 = f13371w + 77;
            f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                return string;
            }
            throw null;
        }
        if (this.component4.getMediationNetwork("preInstallName")) {
            f13370d = (f13371w + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
            string = this.component4.AFAdRevenueData("preInstallName", (String) null);
        } else {
            if (copydefault() && (string = (String) getMediationNetwork(new Object[]{this}, -1713193940, 1713193943, System.identityHashCode(this))) == null) {
                int i5 = f13371w + 119;
                f13370d = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i5 % 2 == 0) {
                    AFAdRevenueData("AF_PRE_INSTALL_NAME");
                    throw null;
                }
                string = AFAdRevenueData("AF_PRE_INSTALL_NAME");
            }
            if (string != null) {
                this.component4.getMediationNetwork("preInstallName", string);
            }
        }
        if (string != null) {
            ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).set("preInstallName", string);
        }
        return string;
    }

    private boolean copydefault() {
        int i4 = f13371w + 93;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0 ? this.component3.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) > 1 : this.component3.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 1) > 1) {
            return false;
        }
        f13370d = (f13371w + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return true;
    }

    private void d(Map<String, Object> map) {
        f13370d = (f13371w + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        String revenue = AFb1iSDK.getRevenue(this.component3.getMonetizationNetwork);
        if (revenue != null) {
            int i4 = f13370d + 13;
            f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                map.put("uid", revenue);
                boolean mediationNetwork = this.component3.getMonetizationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", true);
                Intrinsics.checkNotNullExpressionValue(Boolean.valueOf(mediationNetwork), "");
                if (!mediationNetwork) {
                    return;
                }
            } else {
                map.put("uid", revenue);
                boolean mediationNetwork2 = this.component3.getMonetizationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false);
                Intrinsics.checkNotNullExpressionValue(Boolean.valueOf(mediationNetwork2), "");
                if (!mediationNetwork2) {
                    return;
                }
            }
            int i5 = f13371w + 117;
            f13370d = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 != 0) {
                map.put("custom_install_id", Boolean.TRUE);
            } else {
                map.put("custom_install_id", Boolean.TRUE);
                throw null;
            }
        }
    }

    private void e(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        boolean monetizationNetwork = AFg1ySDK.getMonetizationNetwork(this.getMonetizationNetwork);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork);
        if (!monetizationNetwork) {
            f13370d = (f13371w + 55) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("tokenRefreshConfigured", Boolean.FALSE);
            f13371w = (f13370d + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1ySDK.getMonetizationNetwork(this.component4)));
    }

    private boolean equals() {
        f13370d = (f13371w + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
        boolean parseBoolean = Boolean.parseBoolean(this.component4.AFAdRevenueData("sentSuccessfully", (String) null));
        int i4 = f13370d + 49;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            return parseBoolean;
        }
        throw null;
    }

    private void force(Map<String, Object> map) {
        f13370d = (f13371w + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        String mediationNetwork = this.equals.getMediationNetwork();
        if (mediationNetwork != null) {
            int i4 = f13371w + InterfaceC1490j3.d.b.f16815g;
            f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                mediationNetwork.length();
                throw null;
            }
            if (mediationNetwork.length() == 0) {
                return;
            }
            int i5 = f13370d + 41;
            f13371w = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 == 0) {
                map.put("appsflyerKey", mediationNetwork);
            } else {
                map.put("appsflyerKey", mediationNetwork);
                throw null;
            }
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String[] strArr;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i4 = f13370d + 51;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString("appid");
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString("appid");
        if (string != null) {
            f13371w = (f13370d + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("appid", string);
        }
        String string2 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.CURRENCY_CODE);
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
        String string3 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            map.put("isUpdate", string3);
        }
        String string4 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            int i5 = f13371w + 5;
            f13370d = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 == 0) {
                map.put("customData", string4);
                throw null;
            }
            map.put("customData", string4);
        }
        String string5 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            int i6 = f13371w + 69;
            f13370d = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i6 % 2 == 0) {
                map.put("appUserId", string5);
                throw null;
            }
            map.put("appUserId", string5);
        }
        String string6 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        }
        AFb1uSDK aFb1uSDK = aFg1oSDK.copy.getRevenue;
        if (aFb1uSDK != null && (strArr = aFb1uSDK.getMediationNetwork) != null) {
            f13371w = (f13370d + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("sharing_filter", strArr);
        }
        return null;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i4, int i5, int i6) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        int i7 = ~i6;
        int i8 = (i4 * 522) + (i5 * (-520)) + (((~(i7 | i5)) | i4) * (-1042)) + ((i5 | i6) * 521);
        int i9 = ~i4;
        switch (i8 + (((~(i4 | i7 | i5)) | (~(i6 | i9)) | (~((~i5) | i9))) * 521)) {
            case 1:
                File file = (File) objArr[0];
                int i10 = f13370d;
                f13371w = (i10 + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (file != null) {
                    f13371w = (i10 + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (file.exists()) {
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            case 2:
                PackageManager packageManager = (PackageManager) objArr[0];
                String str = (String) objArr[1];
                f13370d = (f13371w + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (Build.VERSION.SDK_INT < 33) {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 0);
                    Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
                    return packageInfo2;
                }
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(str, of);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "");
                f13371w = (f13370d + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return packageInfo;
            case 3:
                AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
                File currencyIso4217Code = getCurrencyIso4217Code(getMediationNetwork("ro.appsflyer.preinstall.path"));
                if (getMediationNetwork(currencyIso4217Code)) {
                    currencyIso4217Code = getCurrencyIso4217Code(aFg1oSDK.AFAdRevenueData("AF_PRE_INSTALL_PATH"));
                }
                if (getMediationNetwork(currencyIso4217Code)) {
                    f13370d = (f13371w + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    currencyIso4217Code = getCurrencyIso4217Code("/data/local/tmp/pre_install.appsflyer");
                    f13370d = (f13371w + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                if (getMediationNetwork(currencyIso4217Code)) {
                    currencyIso4217Code = getCurrencyIso4217Code("/etc/pre_install.appsflyer");
                }
                if (getMediationNetwork(currencyIso4217Code)) {
                    return null;
                }
                String packageName = aFg1oSDK.getMonetizationNetwork.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                String str2 = (String) getMediationNetwork(new Object[]{currencyIso4217Code, packageName}, -2094417185, 2094417192, (int) System.currentTimeMillis());
                f13370d = (f13371w + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return str2;
            case 4:
                return AFAdRevenueData(objArr);
            case 5:
                return getCurrencyIso4217Code(objArr);
            case 6:
                return getMonetizationNetwork(objArr);
            case 7:
                return getRevenue(objArr);
            case 8:
                AFg1oSDK aFg1oSDK2 = (AFg1oSDK) objArr[0];
                Map map = (Map) objArr[1];
                f13371w = (f13370d + BuildConfig.API_LEVEL) % UserVerificationMethods.USER_VERIFY_PATTERN;
                Intrinsics.checkNotNullParameter(map, "");
                AFb1mSDK k_ = AFb1jSDK.k_(aFg1oSDK2.getMonetizationNetwork.getContentResolver());
                if (k_ != null) {
                    f13371w = (f13370d + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    map.put("amazon_aid", k_.getMonetizationNetwork);
                    map.put("amazon_aid_limit", String.valueOf(k_.getMediationNetwork));
                }
                return null;
            case 9:
                return component1(objArr);
            case 10:
                f13370d = (f13371w + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
                long currentTimeMillis = System.currentTimeMillis();
                f13371w = (f13370d + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return Long.valueOf(currentTimeMillis);
            case 11:
                return areAllFieldsValid(objArr);
            case 12:
                AFg1oSDK aFg1oSDK3 = (AFg1oSDK) objArr[0];
                f13371w = (f13370d + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
                AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) aFg1oSDK3.copydefault.getValue();
                f13370d = (f13371w + 23) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return appsFlyerProperties;
            default:
                return getMediationNetwork(objArr);
        }
    }

    private final SimpleDateFormat getMonetizationNetwork() {
        f13370d = (f13371w + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFLogger.getValue();
        int i4 = f13370d + 91;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    private final void hashCode(Map<String, Object> map) {
        int i4 = f13370d + 49;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
            if (!AFg1kSDK.getMediationNetwork(this.getMonetizationNetwork)) {
                return;
            }
        } else if (!AFg1kSDK.getMediationNetwork(this.getMonetizationNetwork)) {
            return;
        }
        map.put("inst_app", Boolean.TRUE);
        f13371w = (f13370d + 85) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private void i(Map<String, Object> map) {
        getMediationNetwork(new Object[]{this, map}, -1753918152, 1753918160, System.identityHashCode(this));
    }

    private void registerClient(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        long j4 = this.areAllFieldsValid.toString;
        if (j4 != 0) {
            int i4 = f13371w + 97;
            f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                map.put("prev_session_dur", Long.valueOf(j4));
                throw null;
            }
            map.put("prev_session_dur", Long.valueOf(j4));
        }
        f13371w = (f13370d + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private static PackageInfo s_(PackageManager packageManager, String str) {
        return (PackageInfo) getMediationNetwork(new Object[]{packageManager, str}, 1014234820, -1014234818, (int) System.currentTimeMillis());
    }

    private final void toString(Map<String, Object> map) {
        f13370d = (f13371w + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
            return;
        }
        f13370d = (f13371w + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
        map.put(b9.i.f15543Y, String.valueOf(this.getMediationNetwork.getRevenue(this.getMonetizationNetwork).getRevenue));
        f13371w = (f13370d + InterfaceC1490j3.d.b.f16812d) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private void unregisterClient(Map<String, Object> map) {
        int i4 = f13370d + 27;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(AFc1pSDK.AFAdRevenueData(this.getMonetizationNetwork)));
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(AFc1pSDK.AFAdRevenueData(this.getMonetizationNetwork)));
            throw null;
        }
    }

    private static void w(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put(ge.f16487q, Locale.getDefault().getDisplayLanguage());
            f13370d = (f13371w + InterfaceC1490j3.d.b.f16812d) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } catch (Exception e4) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e4);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
            f13371w = (f13370d + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } catch (Exception e5) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e5);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
            f13370d = (f13371w + InterfaceC1490j3.d.b.f16812d) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } catch (Exception e6) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e6);
        }
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getRevenue(AFh1rSDK aFh1rSDK) {
        f13371w = (f13370d + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getCurrencyIso4217Code(map, aFh1rSDK.getMediationNetwork());
        component2(map);
        w(map);
        getMediationNetwork(new Object[]{this, map}, -1412383531, 1412383531, System.identityHashCode(this));
        getCurrencyIso4217Code(map, this.copy.AFAdRevenueData);
        getMediationNetwork(new Object[]{this, map}, -1753918152, 1753918160, System.identityHashCode(this));
        map.put("cell", MapsKt.mapOf(TuplesKt.to("mcc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mcc)), TuplesKt.to("mnc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mnc))));
        map.put("sig", component4());
        map.put("last_boot_time", Long.valueOf(component1()));
        map.put("disk", component3());
        int i4 = f13371w + 25;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void component1(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFh1vSDK aFh1vSDK = this.areAllFieldsValid;
        HashMap hashMap = new HashMap(aFh1vSDK.getRevenue);
        aFh1vSDK.getRevenue.clear();
        this.areAllFieldsValid.getCurrencyIso4217Code.getMonetizationNetwork("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (hashMap.isEmpty()) {
            f13370d = (f13371w + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return;
        }
        f13371w = (f13370d + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Map<String, Object> revenue = AFa1tSDK.getRevenue(map);
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        revenue.put("gcd", hashMap);
    }

    private final void component4(Map<String, Object> map) {
        AFg1uSDK.AFa1uSDK revenue = this.getMediationNetwork.getRevenue(this.getMonetizationNetwork);
        float f4 = revenue.getRevenue;
        String str = revenue.getMediationNetwork;
        map.put("btl", String.valueOf(f4));
        if (str != null) {
            f13371w = (f13370d + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("btch", str);
            f13371w = (f13370d + InterfaceC1490j3.d.b.f16815g) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
    }

    private void equals(Map<String, Object> map) {
        int i4 = f13371w + InterfaceC1490j3.d.b.f16810b;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        int i5 = f13371w + 99;
        f13370d = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getMonetizationNetwork(AFh1rSDK aFh1rSDK) {
        f13371w = (f13370d + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        if (aFh1rSDK.getMediationNetwork()) {
            String str = aFh1rSDK.component3;
            AFc1kSDK aFc1kSDK = this.copy;
            getMonetizationNetwork(aFh1rSDK, str, aFc1kSDK.getMediationNetwork, aFc1kSDK.getMonetizationNetwork);
            f13371w = (f13370d + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else if (!(aFh1rSDK instanceof AFh1hSDK)) {
            int i4 = f13370d + 7;
            f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                String str2 = aFh1rSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                getMediationNetwork(map, str2);
                int i5 = 48 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(map, "");
                String str3 = aFh1rSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                getMediationNetwork(map, str3);
            }
        }
        if (CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH, AFe1mSDK.INAPP}).contains(aFh1rSDK.getCurrencyIso4217Code())) {
            f13370d = (f13371w + InterfaceC1490j3.d.b.f16812d) % UserVerificationMethods.USER_VERIFY_PATTERN;
            Intrinsics.checkNotNullExpressionValue(map, "");
            equals(map);
        }
        if (aFh1rSDK.getRevenue()) {
            f13370d = (f13371w + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
            Intrinsics.checkNotNullExpressionValue(map, "");
            areAllFieldsValid(map);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        force(map);
        AFInAppEventType(map);
        getMediationNetwork(new Object[]{this, map}, -140518465, 140518471, System.identityHashCode(this));
        AFKeystoreWrapper(map);
        d(map);
        getMediationNetwork(map, aFh1rSDK.getMediationNetwork());
        e(map);
        afInfoLog(map);
        getRevenue(map, aFh1rSDK);
        map.put("af_events_api", "1");
    }

    private String areAllFieldsValid() {
        String str = null;
        if (!(!this.component4.getMediationNetwork("INSTALL_STORE"))) {
            return this.component4.AFAdRevenueData("INSTALL_STORE", (String) null);
        }
        if (copydefault()) {
            int i4 = f13370d + 123;
            f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                str = component2();
            } else {
                component2();
                throw null;
            }
        } else {
            f13370d = (f13371w + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        this.component4.getMediationNetwork("INSTALL_STORE", str);
        return str;
    }

    private static void component2(Map<String, Object> map) {
        f13370d = (f13371w + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("\u008f\u0089\u0087\u0083\u008e", null, null, 127 - ExpandableListView.getPackedPositionType(0L), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put(b9.h.f15441G, Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put(ge.f16386A1, String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i4 = f13371w + 95;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void copydefault(Map<String, Object> map) {
        f13371w = (f13370d + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i4 = f13371w + 97;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            UiModeManager uiModeManager = (UiModeManager) this.getMonetizationNetwork.getSystemService(UiModeManager.class);
            if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                return;
            }
            map.put("tv", Boolean.TRUE);
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
    
        com.appsflyer.internal.AFg1oSDK.f13370d = (com.appsflyer.internal.AFg1oSDK.f13371w + 121) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        r7.put("onelink_id", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void component3(Map<String, Object> map) {
        String string;
        String string2;
        int i4 = f13371w + 63;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
            string2 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
            int i5 = 69 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
            string2 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
    }

    private final boolean AFKeystoreWrapper() {
        if (!((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            int i4 = f13371w + 23;
            f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0 ? !((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                return !AFa1tSDK.getCurrencyIso4217Code(this.getMonetizationNetwork);
            }
        }
        f13371w = (f13370d + BuildConfig.API_LEVEL) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r3 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFInAppEventParameterName(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String component2 = this.component3.component2();
        String str = (String) getMediationNetwork(new Object[]{this.component4, component2}, 381318279, -381318268, (int) System.currentTimeMillis());
        boolean z4 = false;
        boolean z5 = (str == null || Intrinsics.areEqual(str, component2)) ? false : true;
        if (str == null) {
            f13370d = (f13371w + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (component2 != null) {
                z4 = true;
            }
        }
        if (!z5) {
            f13370d = (f13371w + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        map.put("af_latestchannel", component2);
        String areAllFieldsValid = areAllFieldsValid();
        if (areAllFieldsValid != null) {
            int i4 = f13371w + InterfaceC1490j3.d.b.f16810b;
            f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = areAllFieldsValid.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                map.put("af_installstore", lowerCase);
            } else {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                String lowerCase2 = areAllFieldsValid.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                map.put("af_installstore", lowerCase2);
                throw null;
            }
        }
        String copy = copy();
        if (copy != null) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            String lowerCase3 = copy.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_preinstall_name", lowerCase3);
        }
        String component22 = component2();
        if (component22 != null) {
            Locale locale4 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale4, "");
            String lowerCase4 = component22.toLowerCase(locale4);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
            map.put("af_currentstore", lowerCase4);
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFc1qSDK aFc1qSDK = (AFc1qSDK) objArr[0];
        String str = (String) objArr[1];
        f13371w = (f13370d + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String AFAdRevenueData = aFc1qSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
        if (AFAdRevenueData != null) {
            int i4 = f13370d + 27;
            f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                return AFAdRevenueData;
            }
            throw null;
        }
        aFc1qSDK.getMediationNetwork("CACHED_CHANNEL", str);
        f13370d = (f13371w + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r8.length() == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        r2.put("referrer", r8);
        com.appsflyer.internal.AFg1oSDK.f13370d = (com.appsflyer.internal.AFg1oSDK.f13371w + com.ironsource.InterfaceC1490j3.d.b.f16812d) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r8.length() == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            int i4 = f13371w + 53;
            f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                int i5 = 87 / 0;
            }
        }
        String AFAdRevenueData = aFg1oSDK.component4.AFAdRevenueData("extraReferrers", (String) null);
        if (AFAdRevenueData != null) {
            map.put("extraReferrers", AFAdRevenueData);
        }
        String referrer = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getReferrer(aFg1oSDK.component4);
        if (referrer != null && referrer.length() != 0 && map.get("referrer") == null) {
            f13370d = (f13371w + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("referrer", referrer);
        }
        int i6 = f13370d + 15;
        f13371w = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r0 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r0 > 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0051, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r5 - r0);
        com.appsflyer.internal.AFg1oSDK.f13371w = (com.appsflyer.internal.AFg1oSDK.f13370d + 81) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void copy(Map<String, Object> map) {
        long currencyIso4217Code;
        long currentTimeMillis;
        long seconds;
        int i4 = f13370d + 97;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            currencyIso4217Code = this.component4.getCurrencyIso4217Code("AppsFlyerTimePassedSincePrevLaunch", 1L);
            currentTimeMillis = System.currentTimeMillis();
            this.component4.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            currencyIso4217Code = this.component4.getCurrencyIso4217Code("AppsFlyerTimePassedSincePrevLaunch", 0L);
            currentTimeMillis = System.currentTimeMillis();
            this.component4.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    private final String AFInAppEventType() {
        return (String) getMediationNetwork(new Object[]{this}, -1713193940, 1713193943, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getRevenue(Map<String, Object> map, int i4, int i5) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i4));
        map.put("iaecounter", String.valueOf(i5));
        boolean z4 = false;
        if (!equals()) {
            int i6 = f13370d + 19;
            f13371w = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i6 % 2 == 0) {
                z4 = true;
            }
        }
        map.put("isFirstCall", String.valueOf(z4));
        f13371w = (f13370d + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        InputStreamReader inputStreamReader;
        File file = (File) objArr[0];
        String str = (String) objArr[1];
        try {
            try {
                if (file == null) {
                    f13370d = (f13371w + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
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
                            return property;
                        } catch (Throwable th) {
                            AFLogger.afErrorLog(th.getMessage(), th);
                            return property;
                        }
                    } catch (FileNotFoundException unused) {
                        AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                            f13370d = (f13371w + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
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
                AFLogger.afErrorLog(th4.getMessage(), th4);
            }
        } catch (Throwable th5) {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                    f13371w = (f13370d + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
                } catch (Throwable th6) {
                    AFLogger.afErrorLog(th6.getMessage(), th6);
                }
            }
            throw th5;
        }
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final Long getCurrencyIso4217Code() {
        int i4 = f13371w + 43;
        int i5 = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        f13370d = i5;
        if (i4 % 2 != 0) {
            Context context = this.toString.getMonetizationNetwork;
            if (context == null) {
                return null;
            }
            int i6 = i5 + 49;
            f13371w = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i6 % 2 == 0) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    String packageName = context.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "");
                    PackageInfo packageInfo = (PackageInfo) getMediationNetwork(new Object[]{packageManager, packageName}, 1014234820, -1014234818, (int) System.currentTimeMillis());
                    if (packageInfo != null) {
                        Long valueOf = Long.valueOf(packageInfo.firstInstallTime);
                        f13370d = (f13371w + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        return valueOf;
                    }
                }
                int i7 = f13370d + 51;
                f13371w = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i7 % 2 != 0) {
                    int i8 = 27 / 0;
                }
                return null;
            }
            context.getPackageManager();
            throw null;
        }
        Context context2 = this.toString.getMonetizationNetwork;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r1.versionCode > r10.component4.AFAdRevenueData("versionCode", 0)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getMonetizationNetwork(Map<String, Object> map) {
        PackageInfo packageInfo;
        int i4 = f13371w + 41;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i4 % 2 == 0) {
                packageInfo = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 1);
                if (packageInfo.versionCode > this.component4.AFAdRevenueData("versionCode", 1)) {
                    this.component4.getMediationNetwork("versionCode", packageInfo.versionCode);
                }
                map.put("app_version_code", String.valueOf(packageInfo.versionCode));
                Context context = this.component3.getRevenue.getMonetizationNetwork;
                map.put(CommonUrlParts.APP_VERSION, AFj1iSDK.getMediationNetwork(context, context.getPackageName()));
                map.put("targetSDKver", Integer.valueOf(this.component3.getRevenue.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
                long j4 = packageInfo.firstInstallTime;
                long j5 = packageInfo.lastUpdateTime;
                map.put("date1", getMonetizationNetwork().format(new Date(j4)));
                map.put("date2", getMonetizationNetwork().format(new Date(j5)));
                Object[] objArr = new Object[1];
                a("\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 127 - TextUtils.getTrimmedLength(""), objArr);
                String intern = ((String) objArr[0]).intern();
                SimpleDateFormat monetizationNetwork = getMonetizationNetwork();
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                map.put(intern, getMediationNetwork(monetizationNetwork));
                f13371w = (f13370d + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return;
            }
            packageInfo = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 0);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
        AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
    }

    private final String AFAdRevenueData(String str) {
        int i4 = f13370d + 5;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            return this.component3.getCurrencyIso4217Code(str);
        }
        int i5 = 38 / 0;
        return this.component3.getCurrencyIso4217Code(str);
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void AFAdRevenueData(Map<String, Object> map) {
        getMediationNetwork(new Object[]{this, map}, -1412383531, 1412383531, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getMediationNetwork(AFh1rSDK aFh1rSDK) {
        f13370d = (f13371w + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getMediationNetwork(map);
        Map<String, Object> map2 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        getMonetizationNetwork(map2);
        Map<String, Object> map3 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        AFInAppEventParameterName(map3);
        Map<String, Object> map4 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        unregisterClient(map4);
        Map<String, Object> map5 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map5, "");
        afDebugLog(map5);
        if (getMediationNetwork().contains(aFh1rSDK.getCurrencyIso4217Code())) {
            f13370d = (f13371w + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
            Map<String, Object> map6 = aFh1rSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map6, "");
            afErrorLog(map6);
            f13370d = (f13371w + 17) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final long AFAdRevenueData() {
        return ((Long) getMediationNetwork(new Object[]{this}, 1094427935, -1094427925, System.identityHashCode(this))).longValue();
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        getMediationNetwork(new Object[]{this, aFh1rSDK}, 840096269, -840096265, System.identityHashCode(this));
    }

    private static void getRevenue(Map<String, Object> map, AFh1rSDK aFh1rSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        String str = aFh1rSDK.areAllFieldsValid;
        if (str != null) {
            map.put(b9.h.f15485j0, str);
            Map map2 = aFh1rSDK.getMonetizationNetwork;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, boolean z4) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", getMediationNetwork("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", getMediationNetwork("ro.product.cpu.abi2"));
        hashMap.put("arch", getMediationNetwork("os.arch"));
        hashMap.put("build_display_id", getMediationNetwork("ro.build.display.id"));
        if (z4) {
            f13371w = (f13370d + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
            component4(hashMap);
            if (this.component3.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) <= 2) {
                hashMap.putAll(this.AFAdRevenueData.AFAdRevenueData());
            }
        }
        hashMap.put("dim", this.component2.AFAdRevenueData(this.getMonetizationNetwork));
        map.put("deviceData", hashMap);
        f13370d = (f13371w + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private void getRevenue(Map<String, Object> map, String str) {
        getMediationNetwork(new Object[]{this, map, str}, 1763970144, -1763970135, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getRevenue(Map<String, Object> map) {
        getMediationNetwork(new Object[]{this, map}, -1435534785, 1435534790, System.identityHashCode(this));
    }

    private final AppsFlyerProperties getRevenue() {
        return (AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this));
    }

    private static List<AFe1mSDK> getMediationNetwork() {
        f13371w = (f13370d + InterfaceC1490j3.d.b.f16815g) % UserVerificationMethods.USER_VERIFY_PATTERN;
        List<AFe1mSDK> listOf = CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH, AFe1mSDK.INAPP, AFe1mSDK.MANUAL_PURCHASE_VALIDATION, AFe1mSDK.ARS_VALIDATE, AFe1mSDK.PURCHASE_VALIDATE, AFe1mSDK.ADREVENUE});
        int i4 = f13371w + 75;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return listOf;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        Object m243constructorimpl;
        int i4 = f13371w + BuildConfig.API_LEVEL;
        f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            String str = this.copy.getCurrencyIso4217Code;
            if (str != null) {
                f13370d = (f13371w + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (map.get("af_deeplink") != null) {
                    int i5 = f13371w + 97;
                    f13370d = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i5 % 2 == 0) {
                        AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                        throw null;
                    }
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                } else {
                    try {
                        Result.Companion companion = Result.Companion;
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("isPush", com.ironsource.mediationsdk.metadata.a.f17681g);
                        map.put("af_deeplink", jSONObject.toString());
                        m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable d4 = Result.d(m243constructorimpl);
                    if (d4 != null) {
                        AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", d4, false, false, false, false, 120, null);
                    } else {
                        f13371w = (f13370d + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    Result.a(m243constructorimpl);
                }
            }
            this.copy.getCurrencyIso4217Code = null;
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.copy.getCurrencyIso4217Code;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (r5.length() == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String getMonetizationNetwork(String str) {
        if (((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) {
            if (str != null) {
                f13370d = (f13371w + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if (!AFKeystoreWrapper()) {
                return null;
            }
            f13371w = (f13370d + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
            String AFInAppEventParameterName2 = AFInAppEventParameterName();
            f13371w = (f13370d + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return AFInAppEventParameterName2;
        }
        if (str != null) {
            return str;
        }
        return null;
    }

    private final void getMediationNetwork(Map<String, Object> map) {
        try {
            long j4 = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j4)));
            int i4 = f13370d + InterfaceC1490j3.d.b.f16817i;
            f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                int i5 = 79 / 0;
            }
        } catch (Exception e4) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e4);
        }
    }

    private void getMonetizationNetwork(AFh1rSDK aFh1rSDK, String str, String str2, AFb1qSDK aFb1qSDK) {
        f13371w = (f13370d + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        if (aFh1rSDK.getCurrencyIso4217Code() == AFe1mSDK.CONVERSION) {
            int i4 = f13370d + 107;
            f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                toString(map);
                copydefault(map);
                hashCode(map);
                AFa1zSDK.AFAdRevenueData(this.toString, this.component3);
                int i5 = 38 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(map, "");
                toString(map);
                copydefault(map);
                hashCode(map);
                AFa1zSDK.AFAdRevenueData(this.toString, this.component3);
            }
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        copy(map);
        component3(map);
        component1((Map<String, ? extends Object>) map);
        getMonetizationNetwork(map, str2);
        getMediationNetwork(new Object[]{this, map, str}, 1763970144, -1763970135, System.identityHashCode(this));
        registerClient(map);
        if (aFb1qSDK != null) {
            aFb1qSDK.getRevenue(map);
        }
    }

    private void getMediationNetwork(Map<String, Object> map, boolean z4) {
        f13370d = (f13371w + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.getCurrencyIso4217Code);
        if (z4) {
            f13371w = (f13370d + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("platform_extension_v2", this.getRevenue.getMediationNetwork());
        }
        f13370d = (f13371w + 5) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, "");
        AFi1pSDK aFi1pSDK = aFg1oSDK.component1.getMediationNetwork;
        AFi1rSDK mediationNetwork = aFi1pSDK != null ? aFi1pSDK.getMediationNetwork() : null;
        if (mediationNetwork != null) {
            map.put("network", mediationNetwork.getCurrencyIso4217Code);
            map.put("ivc", Boolean.valueOf(mediationNetwork.getMediationNetwork()));
            if (!((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                int i4 = (f13371w + InterfaceC1490j3.d.b.f16815g) % UserVerificationMethods.USER_VERIFY_PATTERN;
                f13370d = i4;
                String str = mediationNetwork.AFAdRevenueData;
                if (str != null) {
                    int i5 = i4 + BuildConfig.API_LEVEL;
                    f13371w = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i5 % 2 != 0) {
                        map.put("operator", str);
                        int i6 = 74 / 0;
                    } else {
                        map.put("operator", str);
                    }
                }
                String str2 = mediationNetwork.getRevenue;
                if (str2 != null) {
                    int i7 = f13371w + 105;
                    f13370d = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i7 % 2 != 0) {
                        map.put(ge.f16414N0, str2);
                        return null;
                    }
                    map.put(ge.f16414N0, str2);
                    throw null;
                }
            }
        }
        return null;
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        if (((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i4 = f13370d + 89;
            f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, com.ironsource.mediationsdk.metadata.a.f17681g);
                return;
            } else {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, com.ironsource.mediationsdk.metadata.a.f17681g);
                int i5 = 33 / 0;
                return;
            }
        }
        AFf1gSDK aFf1gSDK = this.equals;
        String str2 = (String) AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFf1gSDK, this.component4}, -1198101809, 1198101809, System.identityHashCode(aFf1gSDK));
        if (!(str2 == null || str2.length() == 0)) {
            map.put("imei", str2);
        }
        String monetizationNetwork = getMonetizationNetwork(str);
        if (monetizationNetwork != null) {
            this.component4.getMediationNetwork("androidIdCached", monetizationNetwork);
            map.put("android_id", monetizationNetwork);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
            f13370d = (f13371w + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        AFb1mSDK mediationNetwork = AFb1jSDK.getMediationNetwork(this.getMonetizationNetwork);
        if (mediationNetwork != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = mediationNetwork.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str3 = mediationNetwork.getMonetizationNetwork;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            linkedHashMap.put("val", str3);
            Boolean bool2 = mediationNetwork.getMediationNetwork;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put(CommonUrlParts.HUAWEI_OAID, linkedHashMap);
        }
    }

    private static void getMonetizationNetwork(Map<String, Object> map, String str) {
        int i4 = f13370d + 117;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (str != null) {
                f13370d = (f13371w + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
                map.put("phone", str);
            }
            f13371w = (f13370d + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        throw null;
    }

    private void getMediationNetwork(Map<String, Object> map, String str) {
        int i4 = f13370d + 7;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i4 % 2 == 0) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                String AFAdRevenueData = this.component4.AFAdRevenueData("prev_event_name", (String) null);
                if (AFAdRevenueData != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prev_event_timestamp", this.component4.getCurrencyIso4217Code("prev_event_timestamp", -1L));
                    jSONObject.put("prev_event_name", AFAdRevenueData);
                    map.put("prev_event", jSONObject);
                    f13371w = (f13370d + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                this.component4.getMediationNetwork("prev_event_name", str);
                this.component4.getMonetizationNetwork("prev_event_timestamp", System.currentTimeMillis());
                return;
            }
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.component4.AFAdRevenueData("prev_event_name", (String) null);
            throw null;
        } catch (Exception e4) {
            AFLogger.afErrorLog("Error while processing previous event.", e4);
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i4 = f13370d + 65;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(aFg1oSDK.hashCode.getCurrencyIso4217Code());
            int i5 = 13 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(aFg1oSDK.hashCode.getCurrencyIso4217Code());
        }
        f13370d = (f13371w + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return null;
    }

    private static File getCurrencyIso4217Code(String str) {
        int i4 = (f13371w + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
        f13370d = i4;
        if (str != null) {
            int i5 = i4 + 105;
            f13371w = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            try {
                if (i5 % 2 == 0) {
                    if (StringsKt.W0(str).toString().length() > 0) {
                        f13370d = (f13371w + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        return new File(StringsKt.W0(str).toString());
                    }
                } else {
                    StringsKt.W0(str).toString().length();
                    throw null;
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        return null;
    }

    private static String getMonetizationNetwork(AFc1qSDK aFc1qSDK, String str) {
        return (String) getMediationNetwork(new Object[]{aFc1qSDK, str}, 381318279, -381318268, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put("open_referrer", aFh1rSDK.getMediationNetwork);
        String str = aFh1rSDK.component4;
        if (str != null) {
            int i4 = f13371w + 43;
            f13370d = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                if (StringsKt.z(str)) {
                    return;
                }
                int i5 = f13371w + 119;
                f13370d = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i5 % 2 == 0) {
                    map.put("af_web_referrer", aFh1rSDK.component4);
                    int i6 = 26 / 0;
                    return;
                } else {
                    map.put("af_web_referrer", aFh1rSDK.component4);
                    return;
                }
            }
            StringsKt.z(str);
            throw null;
        }
    }

    private String getMediationNetwork(SimpleDateFormat simpleDateFormat) {
        int i4 = f13370d + 113;
        f13371w = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            String AFAdRevenueData = this.component4.AFAdRevenueData("appsFlyerFirstInstall", (String) null);
            if (AFAdRevenueData == null) {
                if (copydefault()) {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    AFAdRevenueData = simpleDateFormat.format(new Date());
                } else {
                    f13371w = (f13370d + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    AFAdRevenueData = "";
                }
                this.component4.getMediationNetwork("appsFlyerFirstInstall", AFAdRevenueData);
            }
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "AppsFlyer: first launch date: " + AFAdRevenueData, false, 4, null);
            Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
            return AFAdRevenueData;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        this.component4.AFAdRevenueData("appsFlyerFirstInstall", (String) null);
        throw null;
    }

    private static String getMediationNetwork(String str) {
        f13371w = (f13370d + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.checkNotNull(invoke, "");
            String str2 = (String) invoke;
            f13371w = (f13370d + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private static String getMediationNetwork(File file, String str) {
        return (String) getMediationNetwork(new Object[]{file, str}, -2094417185, 2094417192, (int) System.currentTimeMillis());
    }

    private static boolean getMediationNetwork(File file) {
        return ((Boolean) getMediationNetwork(new Object[]{file}, 1334456290, -1334456289, (int) System.currentTimeMillis())).booleanValue();
    }
}
