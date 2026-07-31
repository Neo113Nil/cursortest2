package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFg1uSDK;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1rSDK implements AFg1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int e = 1;
    private static int unregisterClient;
    private final String AFAdRevenueData;
    private final Lazy AFKeystoreWrapper;
    private final AFh1xSDK areAllFieldsValid;
    private final AFc1qSDK component1;
    private final AFg1vSDK component2;
    private final AFi1pSDK component3;
    private final AFc1oSDK component4;
    private final AFc1hSDK copy;
    private final AFg1zSDK copydefault;
    private final Lazy equals;
    private final Context getCurrencyIso4217Code;
    private final AFi1kSDK getMediationNetwork;
    private final AFg1uSDK getMonetizationNetwork;
    private final AFj1lSDK getRevenue;
    private final AFf1eSDK hashCode;
    private final AFc1eSDK toString;
    private static char[] AFInAppEventParameterName = {35909, 35928, 35921, 35926, 35927, 35903, 35904, 35924, 35933, 35910, 35931, 35879, 35908, 35905, 35911};
    private static int registerClient = 1912311267;
    private static boolean AFLogger = true;
    private static boolean AFInAppEventType = true;

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
        long j;
        int i4 = ~i3;
        int i5 = (i * 522) + (i2 * (-520)) + (((~(i4 | i2)) | i) * (-1042)) + ((i2 | i3) * 521);
        int i6 = ~i;
        switch (i5 + (((~(i | i4 | i2)) | (~(i3 | i6)) | (~((~i2) | i6))) * 521)) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getCurrencyIso4217Code(objArr);
            case 3:
                return getRevenue(objArr);
            case 4:
                return getMediationNetwork(objArr);
            case 5:
                return getMonetizationNetwork(objArr);
            case 6:
                return areAllFieldsValid(objArr);
            case 7:
                return component2(objArr);
            case 8:
                return component1(objArr);
            case 9:
                return component3(objArr);
            case 10:
                return component4(objArr);
            case 11:
                AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
                AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
                int i7 = 2 % 2;
                int i8 = unregisterClient + 29;
                e = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.checkNotNullParameter(aFh1mSDK, "");
                Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map, "");
                getRevenue(new Object[]{aFg1rSDK, map}, -539509618, 539509626, System.identityHashCode(aFg1rSDK));
                Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map2, "");
                aFg1rSDK.getMediationNetwork(map2, aFh1mSDK.component4);
                Map<String, Object> map3 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map3, "");
                getRevenue(new Object[]{aFg1rSDK, map3}, 1731268052, -1731268046, System.identityHashCode(aFg1rSDK));
                Map<String, Object> map4 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map4, "");
                aFg1rSDK.AFLogger(map4);
                Map<String, Object> map5 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map5, "");
                aFg1rSDK.afInfoLog(map5);
                Map<String, Object> map6 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map6, "");
                AFe1pSDK AFAdRevenueData = aFh1mSDK.AFAdRevenueData();
                Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
                aFg1rSDK.getMediationNetwork(map6, AFAdRevenueData);
                int i10 = e + 51;
                unregisterClient = i10 % 128;
                int i11 = i10 % 2;
                return null;
            case 12:
                return toString(objArr);
            default:
                AFg1rSDK aFg1rSDK2 = (AFg1rSDK) objArr[0];
                Map map7 = (Map) objArr[1];
                int i12 = 2 % 2;
                int i13 = e + 23;
                unregisterClient = i13 % 128;
                int i14 = i13 % 2;
                Intrinsics.checkNotNullParameter(map7, "");
                long monetizationNetwork = aFg1rSDK2.component1.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
                long currentTimeMillis = System.currentTimeMillis();
                aFg1rSDK2.component1.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
                if (monetizationNetwork > 0) {
                    int i15 = unregisterClient + 35;
                    e = i15 % 128;
                    j = i15 % 2 == 0 ? TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis ^ monetizationNetwork) : TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - monetizationNetwork);
                } else {
                    int i16 = unregisterClient + 1;
                    e = i16 % 128;
                    int i17 = i16 % 2;
                    j = -1;
                }
                map7.put("timepassedsincelastlaunch", String.valueOf(j));
                return null;
        }
    }

    public AFg1rSDK(String str, Context context, AFi1kSDK aFi1kSDK, AFg1uSDK aFg1uSDK, AFj1lSDK aFj1lSDK, AFg1vSDK aFg1vSDK, AFh1xSDK aFh1xSDK, AFc1qSDK aFc1qSDK, AFc1oSDK aFc1oSDK, AFi1pSDK aFi1pSDK, AFf1eSDK aFf1eSDK, AFc1hSDK aFc1hSDK, AFg1zSDK aFg1zSDK, AFc1eSDK aFc1eSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        Intrinsics.checkNotNullParameter(aFg1uSDK, "");
        Intrinsics.checkNotNullParameter(aFj1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFi1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFg1zSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = context;
        this.getMediationNetwork = aFi1kSDK;
        this.getMonetizationNetwork = aFg1uSDK;
        this.getRevenue = aFj1lSDK;
        this.component2 = aFg1vSDK;
        this.areAllFieldsValid = aFh1xSDK;
        this.component1 = aFc1qSDK;
        this.component4 = aFc1oSDK;
        this.component3 = aFi1pSDK;
        this.hashCode = aFf1eSDK;
        this.copy = aFc1hSDK;
        this.copydefault = aFg1zSDK;
        this.toString = aFc1eSDK;
        this.equals = LazyKt.lazy(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1rSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFKeystoreWrapper = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1rSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int i = 2 % 2;
        int i2 = unregisterClient + 15;
        e = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) aFg1rSDK.equals.getValue();
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        int i5 = e + 91;
        unregisterClient = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return appsFlyerProperties;
    }

    private final SimpleDateFormat getRevenue() {
        int i = 2 % 2;
        int i2 = unregisterClient + 23;
        e = i2 % 128;
        int i3 = i2 % 2;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
        int i4 = unregisterClient + TypedValues.TYPE_TARGET;
        e = i4 % 128;
        int i5 = i4 % 2;
        return simpleDateFormat;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(AFh1mSDK aFh1mSDK) {
        int i = 2 % 2;
        int i2 = unregisterClient + 113;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
            aFh1mSDK.getRevenue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
        if (aFh1mSDK.getRevenue()) {
            AFAdRevenueData(aFh1mSDK, aFh1mSDK.component1, this.toString.getMediationNetwork, this.toString.AFAdRevenueData);
            int i3 = unregisterClient + 53;
            e = i3 % 128;
            int i4 = i3 % 2;
        } else if (!(aFh1mSDK instanceof AFh1fSDK)) {
            int i5 = e + 93;
            unregisterClient = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(map2, "");
                String str = aFh1mSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str, "");
                getMediationNetwork(map2, str);
                int i6 = 79 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(map2, "");
                String str2 = aFh1mSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                getMediationNetwork(map2, str2);
            }
        }
        if (CollectionsKt.listOf((Object[]) new AFe1pSDK[]{AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP}).contains(aFh1mSDK.AFAdRevenueData())) {
            int i7 = e + 33;
            unregisterClient = i7 % 128;
            if (i7 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(map2, "");
                equals(map2);
                int i8 = 79 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(map2, "");
                equals(map2);
            }
        }
        Intrinsics.checkNotNullExpressionValue(map2, "");
        w(map2);
        getRevenue(new Object[]{map2}, -1520031212, 1520031215, (int) System.currentTimeMillis());
        AFInAppEventParameterName(map2);
        AFKeystoreWrapper(map2);
        AFAdRevenueData(map2);
        getMonetizationNetwork(map2, aFh1mSDK.getRevenue());
        e(map2);
        d(map2);
        getMonetizationNetwork(map2, aFh1mSDK);
        map2.put("af_events_api", "1");
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = 2 % 2;
        try {
            long longValue = ((Long) getRevenue(new Object[]{aFg1rSDK}, 1297709710, -1297709700, System.identityHashCode(aFg1rSDK))).longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(longValue)));
            int i2 = e + 13;
            unregisterClient = i2 % 128;
            int i3 = i2 % 2;
            return null;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e2);
            return null;
        }
    }

    private final void getMediationNetwork(Map<String, Object> map, int i) {
        int i2 = 2 % 2;
        try {
            if (this.component4.n_().versionCode > this.component1.getRevenue("versionCode", 0)) {
                int i3 = unregisterClient + 43;
                e = i3 % 128;
                int i4 = i3 % 2;
                this.component1.getMediationNetwork("versionCode", this.component4.n_().versionCode);
            }
            map.put("app_version_code", String.valueOf(this.component4.n_().versionCode));
            map.put("app_version_name", this.component4.n_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.component4.getCurrencyIso4217Code.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
            map.put("date1", getRevenue().format(new Date(((Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this))).longValue())));
            map.put("date2", getRevenue().format(new Date(this.component4.n_().lastUpdateTime)));
            Object[] objArr = new Object[1];
            Object obj = null;
            a("\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            String intern = ((String) objArr[0]).intern();
            SimpleDateFormat revenue = getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            map.put(intern, getCurrencyIso4217Code(revenue, i));
            int i5 = e + 51;
            unregisterClient = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
    }

    private static void a(String str, int[] iArr, String str2, int i, Object[] objArr) {
        int i2 = 2 % 2;
        char[] cArr = str2;
        if (str2 != null) {
            int i3 = $10 + 51;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str2.toCharArray();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr3 = AFInAppEventParameterName;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 7;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    cArr4[i4] = (char) (cArr3[i4] + 1825820251896122634L);
                    i4 /= 0;
                } else {
                    cArr4[i4] = (char) (cArr3[i4] ^ 1825820251896122634L);
                    i4++;
                }
            }
            cArr3 = cArr4;
        }
        int i6 = (int) (1825820251896122634L ^ registerClient);
        if (AFInAppEventType) {
            int i7 = $10 + 43;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            aFk1oSDK.getMonetizationNetwork = bArr2.length;
            char[] cArr5 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr5[aFk1oSDK.AFAdRevenueData] = (char) (cArr3[bArr2[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] + i] - i6);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (AFLogger) {
            aFk1oSDK.getMonetizationNetwork = cArr2.length;
            char[] cArr6 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr6[aFk1oSDK.AFAdRevenueData] = (char) (cArr3[cArr2[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i] - i6);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        aFk1oSDK.getMonetizationNetwork = iArr.length;
        char[] cArr7 = new char[aFk1oSDK.getMonetizationNetwork];
        aFk1oSDK.AFAdRevenueData = 0;
        while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
            cArr7[aFk1oSDK.AFAdRevenueData] = (char) (cArr3[iArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i] - i6);
            aFk1oSDK.AFAdRevenueData++;
        }
        objArr[0] = new String(cArr7);
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        int i = 2 % 2;
        int i2 = unregisterClient + 25;
        e = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFAdRevenueData(map, aFh1mSDK.getRevenue());
        component2(map);
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
        getRevenue(map);
        getRevenue(new Object[]{this, map, this.toString.getCurrencyIso4217Code}, 274047423, -274047418, System.identityHashCode(this));
        i(map);
        map.put("cell", MapsKt.mapOf(TuplesKt.to("mcc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mcc)), TuplesKt.to("mnc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mnc))));
        map.put("sig", AFAdRevenueData());
        map.put("last_boot_time", Long.valueOf(component1()));
        map.put("disk", component2());
        int i4 = unregisterClient + 75;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMonetizationNetwork(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
        }
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                String obj = new StringBuilder("WARNING: currency code should be 3 characters!!! '").append(string2).append("' is not a legal value.").toString();
                Intrinsics.checkNotNullExpressionValue(obj, "");
                AFLogger.afWarnLog(obj);
            }
            map.put(FirebaseAnalytics.Param.CURRENCY, string2);
        } else {
            int i2 = unregisterClient + 67;
            e = i2 % 128;
            int i3 = i2 % 2;
        }
        Object string3 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            map.put("isUpdate", string3);
        }
        Object string4 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        Object string5 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            map.put("appUserId", string5);
            int i4 = unregisterClient + 35;
            e = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 4;
            }
        }
        Object string6 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        }
        AFb1tSDK aFb1tSDK = this.toString.getRevenue;
        if (aFb1tSDK != null) {
            int i6 = unregisterClient + 1;
            e = i6 % 128;
            if (i6 % 2 == 0) {
                String[] strArr = aFb1tSDK.AFAdRevenueData;
                throw null;
            }
            Object obj2 = aFb1tSDK.AFAdRevenueData;
            if (obj2 != null) {
                map.put("sharing_filter", obj2);
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        if (this.component4.component2()) {
            AFh1rSDK aFh1rSDK = this.component4.getMonetizationNetwork.component3;
            if (aFh1rSDK == null) {
                return;
            }
            String str = aFh1rSDK.getMediationNetwork;
            if (str != null && str.length() != 0) {
                aFh1mSDK.getMonetizationNetwork("gaidError", aFh1rSDK.getMediationNetwork);
            }
            if (aFh1rSDK.getMonetizationNetwork != null && aFh1rSDK.AFAdRevenueData != null) {
                int i2 = unregisterClient + 89;
                e = i2 % 128;
                int i3 = i2 % 2;
                aFh1mSDK.getMonetizationNetwork("advertiserId", aFh1rSDK.getMonetizationNetwork);
                aFh1mSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(aFh1rSDK.AFAdRevenueData));
                aFh1mSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(aFh1rSDK.getRevenue));
            }
        } else {
            int i4 = unregisterClient + 91;
            e = i4 % 128;
            if (i4 % 2 == 0) {
                Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
                Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
                mediationNetwork.put("ad_ids_disabled", Boolean.TRUE);
                throw null;
            }
            Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork2, "");
            mediationNetwork2.put("ad_ids_disabled", Boolean.TRUE);
            int i5 = unregisterClient + 83;
            e = i5 % 128;
            int i6 = i5 % 2;
        }
        AFh1rSDK aFh1rSDK2 = this.component4.getMonetizationNetwork.component3;
        if (aFh1rSDK2 != null) {
            int i7 = unregisterClient + 81;
            e = i7 % 128;
            int i8 = i7 % 2;
            z = Intrinsics.areEqual(aFh1rSDK2.areAllFieldsValid, Boolean.TRUE);
        } else {
            z = false;
        }
        aFh1mSDK.getMonetizationNetwork("GAID_retry", String.valueOf(z));
        if (CollectionsKt.listOf((Object[]) new AFe1pSDK[]{AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH}).contains(aFh1mSDK.AFAdRevenueData())) {
            AFd1aSDK aFd1aSDK = this.toString.component4;
            if (aFd1aSDK != null) {
                Map<String, Object> mediationNetwork3 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
                Intrinsics.checkNotNullExpressionValue(mediationNetwork3, "");
                mediationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getMediationNetwork));
            } else {
                int i9 = e + 77;
                unregisterClient = i9 % 128;
                int i10 = i9 % 2;
            }
        }
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int i = 2 % 2;
        int i2 = unregisterClient + 79;
        e = i2 % 128;
        int i3 = i2 % 2;
        Long valueOf = Long.valueOf(aFg1rSDK.component4.n_().firstInstallTime);
        int i4 = unregisterClient + 85;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return valueOf;
    }

    private String AFAdRevenueData() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = e + 31;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        String N_ = AFj1kSDK.N_(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager(), this.getCurrencyIso4217Code.getApplicationContext().getPackageName());
        int i4 = e + 71;
        unregisterClient = i4 % 128;
        int i5 = i4 % 2;
        return N_;
    }

    private static long component1() {
        int i = 2 % 2;
        int i2 = unregisterClient + 73;
        e = i2 % 128;
        int i3 = i2 % 2;
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        int i4 = unregisterClient + 3;
        e = i4 % 128;
        int i5 = i4 % 2;
        return currentTimeMillis;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final long getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = e + 103;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = e + 119;
        unregisterClient = i4 % 128;
        int i5 = i4 % 2;
        return currentTimeMillis;
    }

    private static String component2() {
        int i = 2 % 2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        int i2 = unregisterClient + 21;
        e = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private void getMonetizationNetwork(Map<String, Object> map, boolean z) {
        int i = 2 % 2;
        int i2 = e + 89;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.AFAdRevenueData);
        if (z) {
            map.put("platform_extension_v2", this.getMediationNetwork.getCurrencyIso4217Code());
            int i4 = e + 89;
            unregisterClient = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0096, code lost:
    
        r1.putAll(r7.getRevenue.getMediationNetwork());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        if (r7.component4.getMediationNetwork.getRevenue("appsFlyerCount", 0) <= 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0066, code lost:
    
        if (r7.component4.getMediationNetwork.getRevenue("appsFlyerCount", 1) <= 4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007e, code lost:
    
        r9 = com.appsflyer.internal.AFg1rSDK.unregisterClient + 63;
        com.appsflyer.internal.AFg1rSDK.e = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0087, code lost:
    
        if ((r9 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0089, code lost:
    
        r1.putAll(r7.getRevenue.getMediationNetwork());
        r9 = 65 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFAdRevenueData(Map<String, Object> map, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", getCurrencyIso4217Code("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", getCurrencyIso4217Code("ro.product.cpu.abi2"));
        hashMap.put("arch", getCurrencyIso4217Code("os.arch"));
        hashMap.put("build_display_id", getCurrencyIso4217Code("ro.build.display.id"));
        if (z) {
            int i2 = unregisterClient + 55;
            e = i2 % 128;
            if (i2 % 2 == 0) {
                getRevenue(new Object[]{this, hashMap}, -753773633, 753773645, System.identityHashCode(this));
            } else {
                getRevenue(new Object[]{this, hashMap}, -753773633, 753773645, System.identityHashCode(this));
            }
        }
        hashMap.put("dim", this.component2.getMediationNetwork(this.getCurrencyIso4217Code));
        map.put("deviceData", hashMap);
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1qSDK aFi1qSDK = this.component3.getMonetizationNetwork;
        AFi1rSDK monetizationNetwork = aFi1qSDK != null ? aFi1qSDK.getMonetizationNetwork() : null;
        if (monetizationNetwork != null) {
            map.put("network", monetizationNetwork.getCurrencyIso4217Code);
            map.put("ivc", Boolean.valueOf(monetizationNetwork.getMediationNetwork()));
            boolean z = false;
            if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                int i2 = unregisterClient + 41;
                e = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 / 3;
                }
            } else {
                z = true;
            }
            if (z) {
                int i4 = e + 69;
                unregisterClient = i4 % 128;
                int i5 = i4 % 2;
                String str = monetizationNetwork.getMonetizationNetwork;
                if (str != null) {
                    map.put("operator", str);
                } else {
                    int i6 = e + 99;
                    unregisterClient = i6 % 128;
                    int i7 = i6 % 2;
                }
                String str2 = monetizationNetwork.getRevenue;
                if (str2 != null) {
                    map.put("carrier", str2);
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map, int i, int i2) {
        boolean z;
        int i3 = 2 % 2;
        int i4 = unregisterClient + 121;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(i));
            map.put("iaecounter", String.valueOf(i2));
            areAllFieldsValid();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i));
        map.put("iaecounter", String.valueOf(i2));
        if (areAllFieldsValid()) {
            z = false;
        } else {
            int i5 = unregisterClient + 103;
            e = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        map.put("isFirstCall", String.valueOf(z));
        int i7 = unregisterClient + 103;
        e = i7 % 128;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        Object m213constructorimpl;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String str = aFg1rSDK.toString.getMonetizationNetwork;
        if (str != null) {
            int i2 = unregisterClient + 83;
            e = i2 % 128;
            if (i2 % 2 == 0) {
                map.get("af_deeplink");
                throw null;
            }
            if (map.get("af_deeplink") != null) {
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    AFg1rSDK aFg1rSDK2 = aFg1rSDK;
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    m213constructorimpl = Result.m213constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m213constructorimpl = Result.m213constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m216exceptionOrNullimpl = Result.m216exceptionOrNullimpl(m213constructorimpl);
                if (m216exceptionOrNullimpl != null) {
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", m216exceptionOrNullimpl, false, false, false, false, 120, null);
                    int i3 = e + 33;
                    unregisterClient = i3 % 128;
                    int i4 = i3 % 2;
                }
                Result.m212boximpl(m213constructorimpl);
            }
        }
        aFg1rSDK.toString.getMonetizationNetwork = null;
        return null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        int i = 2 % 2;
        int i2 = unregisterClient + 125;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map, "");
            map.put("open_referrer", aFh1mSDK.getMonetizationNetwork);
            String str = aFh1mSDK.copydefault;
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        map2.put("open_referrer", aFh1mSDK.getMonetizationNetwork);
        String str2 = aFh1mSDK.copydefault;
        if (!(str2 == null || StringsKt.isBlank(str2))) {
            map2.put("af_web_referrer", aFh1mSDK.copydefault);
        }
        int i3 = unregisterClient + 7;
        e = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = 2 % 2;
        AFg1uSDK.AFa1zSDK currencyIso4217Code = aFg1rSDK.getMonetizationNetwork.getCurrencyIso4217Code(aFg1rSDK.getCurrencyIso4217Code);
        float f = currencyIso4217Code.getMonetizationNetwork;
        String str = currencyIso4217Code.AFAdRevenueData;
        map.put("btl", String.valueOf(f));
        Object obj = null;
        if (str != null) {
            int i2 = e + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
            unregisterClient = i2 % 128;
            if (i2 % 2 == 0) {
                map.put("btch", str);
            } else {
                map.put("btch", str);
                throw null;
            }
        }
        int i3 = e + 67;
        unregisterClient = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private void component3(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = unregisterClient + 81;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            int i3 = unregisterClient + 85;
            e = i3 % 128;
            int i4 = i3 % 2;
            map.put("onelink_ver", string2);
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFh1xSDK aFh1xSDK = aFg1rSDK.areAllFieldsValid;
        HashMap hashMap = new HashMap(aFh1xSDK.getRevenue);
        aFh1xSDK.getRevenue.clear();
        aFh1xSDK.getMonetizationNetwork.AFAdRevenueData("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (hashMap.isEmpty()) {
            return null;
        }
        int i2 = unregisterClient + 21;
        int i3 = i2 % 128;
        e = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        unregisterClient = i5 % 128;
        if (i5 % 2 == 0) {
            Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork((Map<String, Object>) map);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            mediationNetwork.put("gcd", hashMap);
            return null;
        }
        Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork((Map<String, Object>) map);
        Intrinsics.checkNotNullExpressionValue(mediationNetwork2, "");
        mediationNetwork2.put("gcd", hashMap);
        int i6 = 34 / 0;
        return null;
    }

    private void getMediationNetwork(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = unregisterClient + 7;
        e = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.component1.getMonetizationNetwork("prev_event_name", (String) null);
                throw null;
            }
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            String monetizationNetwork = this.component1.getMonetizationNetwork("prev_event_name", (String) null);
            if (monetizationNetwork != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.component1.getMonetizationNetwork("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", monetizationNetwork);
                map.put("prev_event", jSONObject);
                int i3 = e + 107;
                unregisterClient = i3 % 128;
                int i4 = i3 % 2;
            }
            this.component1.getRevenue("prev_event_name", str);
            this.component1.AFAdRevenueData("prev_event_timestamp", System.currentTimeMillis());
        } catch (Exception e2) {
            AFLogger.afErrorLog("Error while processing previous event.", e2);
        }
    }

    private String component4() {
        int i = 2 % 2;
        int i2 = unregisterClient + 61;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            String monetizationNetwork = this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
            if (monetizationNetwork == null) {
                String component3 = component3();
                if (component3 != null) {
                    this.component1.getRevenue("INSTALL_STORE", component3);
                }
                int i3 = unregisterClient + 67;
                e = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 79 / 0;
                }
                return component3;
            }
            int i5 = unregisterClient + 37;
            e = i5 % 128;
            if (i5 % 2 != 0) {
                return monetizationNetwork;
            }
            obj.hashCode();
            throw null;
        }
        this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
        obj.hashCode();
        throw null;
    }

    private String component3() {
        int i = 2 % 2;
        int i2 = unregisterClient + 107;
        e = i2 % 128;
        int i3 = i2 % 2;
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        int i4 = e + 43;
        unregisterClient = i4 % 128;
        if (i4 % 2 == 0) {
            return getMediationNetwork("AF_STORE");
        }
        getMediationNetwork("AF_STORE");
        throw null;
    }

    private String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat, int i) {
        int i2 = 2 % 2;
        int i3 = e + 57;
        unregisterClient = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
            throw null;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String monetizationNetwork = this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
        if (monetizationNetwork == null) {
            int i4 = unregisterClient + 99;
            e = i4 % 128;
            if (i4 % 2 != 0 ? i > 1 : i > 0) {
                monetizationNetwork = "";
            } else {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                monetizationNetwork = simpleDateFormat.format(new Date());
            }
            this.component1.getRevenue("appsFlyerFirstInstall", monetizationNetwork);
            int i5 = e + 77;
            unregisterClient = i5 % 128;
            int i6 = i5 % 2;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "AppsFlyer: first launch date: " + monetizationNetwork, false, 4, null);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        return monetizationNetwork;
    }

    private boolean areAllFieldsValid() {
        int i = 2 % 2;
        int i2 = e + 45;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        boolean parseBoolean = Boolean.parseBoolean(this.component1.getMonetizationNetwork("sentSuccessfully", (String) null));
        int i4 = e + 73;
        unregisterClient = i4 % 128;
        int i5 = i4 % 2;
        return parseBoolean;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        int i;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int i2 = 2 % 2;
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getString("preInstallName");
        if (string != null) {
            i = unregisterClient + 39;
            e = i % 128;
        } else {
            String monetizationNetwork = aFg1rSDK.component1.getMonetizationNetwork("preInstallName", (String) null);
            if (monetizationNetwork != null) {
                ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).set("preInstallName", monetizationNetwork);
                int i3 = e + 71;
                unregisterClient = i3 % 128;
                if (i3 % 2 == 0) {
                    return monetizationNetwork;
                }
                throw null;
            }
            string = aFg1rSDK.AFInAppEventType();
            if (string == null) {
                int i4 = e + 45;
                unregisterClient = i4 % 128;
                if (i4 % 2 != 0) {
                    string = aFg1rSDK.getMediationNetwork("AF_PRE_INSTALL_NAME");
                    int i5 = 98 / 0;
                } else {
                    string = aFg1rSDK.getMediationNetwork("AF_PRE_INSTALL_NAME");
                }
            }
            if (string != null) {
                aFg1rSDK.component1.getRevenue("preInstallName", string);
                ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).set("preInstallName", string);
            }
            i = e + 15;
            unregisterClient = i % 128;
        }
        int i6 = i % 2;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String AFAdRevenueData;
        AFb1jSDK mediationNetwork;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object obj = null;
        if (((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i2 = unregisterClient + 33;
            e = i2 % 128;
            if (i2 % 2 != 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                return null;
            }
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            obj.hashCode();
            throw null;
        }
        String monetizationNetwork = aFg1rSDK.hashCode.getMonetizationNetwork(aFg1rSDK.component1);
        String str2 = monetizationNetwork;
        if (str2 != null) {
            int i3 = unregisterClient + 79;
            e = i3 % 128;
            int i4 = i3 % 2;
            if (str2.length() != 0) {
                int i5 = unregisterClient + 71;
                e = i5 % 128;
                int i6 = i5 % 2;
                map.put("imei", monetizationNetwork);
                AFAdRevenueData = aFg1rSDK.AFAdRevenueData(str);
                if (AFAdRevenueData == null) {
                    aFg1rSDK.component1.getRevenue("androidIdCached", AFAdRevenueData);
                    map.put("android_id", AFAdRevenueData);
                } else {
                    AFLogger.afInfoLog("Android ID was not collected.");
                }
                mediationNetwork = AFb1lSDK.getMediationNetwork(aFg1rSDK.getCurrencyIso4217Code);
                if (mediationNetwork != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Boolean bool = mediationNetwork.getMonetizationNetwork;
                    Intrinsics.checkNotNullExpressionValue(bool, "");
                    linkedHashMap.put("isManual", bool);
                    String str3 = mediationNetwork.getRevenue;
                    Intrinsics.checkNotNullExpressionValue(str3, "");
                    linkedHashMap.put("val", str3);
                    Boolean bool2 = mediationNetwork.getCurrencyIso4217Code;
                    if (bool2 != null) {
                        linkedHashMap.put("isLat", bool2);
                    }
                    map.put("oaid", linkedHashMap);
                }
                return null;
            }
        }
        int i7 = unregisterClient + 33;
        e = i7 % 128;
        int i8 = i7 % 2;
        AFAdRevenueData = aFg1rSDK.AFAdRevenueData(str);
        if (AFAdRevenueData == null) {
        }
        mediationNetwork = AFb1lSDK.getMediationNetwork(aFg1rSDK.getCurrencyIso4217Code);
        if (mediationNetwork != null) {
        }
        return null;
    }

    private final String AFAdRevenueData(String str) {
        int i = 2 % 2;
        int i2 = unregisterClient + 95;
        e = i2 % 128;
        if (i2 % 2 != 0 ? ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) : ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) {
            int i3 = unregisterClient + 43;
            e = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str2 = str;
            if (!(!(str2 == null || str2.length() == 0))) {
                if (!AFKeystoreWrapper()) {
                    return null;
                }
                int i4 = unregisterClient + 75;
                e = i4 % 128;
                int i5 = i4 % 2;
                return copy();
            }
        }
        if (str == null) {
            return null;
        }
        int i6 = unregisterClient + 23;
        e = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String copy() {
        String str;
        int i = 2 % 2;
        int i2 = e + 103;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
        } catch (Exception e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2);
            str = i3;
        }
        if (i3 == 0) {
            String monetizationNetwork = this.component1.getMonetizationNetwork("androidIdCached", (String) null);
            String string = Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
            str = monetizationNetwork;
            if (string != null) {
                int i4 = unregisterClient + 99;
                e = i4 % 128;
                if (i4 % 2 != 0) {
                    return string;
                }
                obj.hashCode();
                throw null;
            }
            if (str == 0) {
                return null;
            }
            int i5 = e + 63;
            unregisterClient = i5 % 128;
            if (i5 % 2 != 0) {
                AFLogger.afDebugLog("use cached AndroidId: " + str);
                int i6 = 53 / 0;
            } else {
                AFLogger.afDebugLog("use cached AndroidId: " + str);
            }
            return str;
        }
        this.component1.getMonetizationNetwork("androidIdCached", (String) null);
        Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
        throw null;
    }

    private static void component2(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = unregisterClient + 123;
        e = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("\u008f\u0089\u0087\u0083\u008e", null, null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + WorkQueueKt.MASK, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i4 = unregisterClient + 71;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void AFAdRevenueData(AFh1mSDK aFh1mSDK, String str, String str2, AFb1rSDK aFb1rSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        if (aFh1mSDK.AFAdRevenueData() == AFe1pSDK.CONVERSION) {
            int i2 = unregisterClient + 73;
            e = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                areAllFieldsValid(map);
                toString(map);
                copydefault(map);
                AFa1vSDK.getMonetizationNetwork(this.copy, this.component4);
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(map, "");
            areAllFieldsValid(map);
            toString(map);
            copydefault(map);
            AFa1vSDK.getMonetizationNetwork(this.copy, this.component4);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
        component3(map);
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
        getMonetizationNetwork(map, str2);
        getRevenue(map, str);
        copy(map);
        if (aFb1rSDK == null) {
            int i3 = unregisterClient + 25;
            e = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = e + 103;
            unregisterClient = i5 % 128;
            if (i5 % 2 == 0) {
                aFb1rSDK.getCurrencyIso4217Code(map);
            } else {
                aFb1rSDK.getCurrencyIso4217Code(map);
                throw null;
            }
        }
    }

    private final void areAllFieldsValid(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = e + 125;
        unregisterClient = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
                return;
            }
            int i3 = unregisterClient + 9;
            e = i3 % 128;
            if (i3 % 2 != 0) {
                map.put("batteryLevel", String.valueOf(this.getMonetizationNetwork.getCurrencyIso4217Code(this.getCurrencyIso4217Code).getMonetizationNetwork));
                return;
            } else {
                map.put("batteryLevel", String.valueOf(this.getMonetizationNetwork.getCurrencyIso4217Code(this.getCurrencyIso4217Code).getMonetizationNetwork));
                throw null;
            }
        }
        ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled();
        obj.hashCode();
        throw null;
    }

    private final void toString(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = unregisterClient + 93;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            UiModeManager uiModeManager = (UiModeManager) this.getCurrencyIso4217Code.getSystemService(UiModeManager.class);
            if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                return;
            }
            int i3 = unregisterClient + 33;
            e = i3 % 128;
            if (i3 % 2 == 0) {
                map.put("tv", Boolean.TRUE);
                int i4 = 55 / 0;
                return;
            } else {
                map.put("tv", Boolean.TRUE);
                return;
            }
        }
        throw null;
    }

    private void equals(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = unregisterClient + 41;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void copydefault(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = unregisterClient + 45;
        e = i2 % 128;
        int i3 = i2 % 2;
        if (AFg1iSDK.getMonetizationNetwork(this.getCurrencyIso4217Code)) {
            map.put("inst_app", Boolean.TRUE);
            int i4 = e + 61;
            unregisterClient = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void getMonetizationNetwork(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = e + 77;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            int i4 = unregisterClient + 81;
            e = i4 % 128;
            int i5 = i4 % 2;
            map.put("phone", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getRevenue(Map<String, Object> map, String str) {
        boolean z;
        String monetizationNetwork;
        String str2;
        int i;
        int i2 = 2 % 2;
        int i3 = unregisterClient + 75;
        e = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String str3 = str;
        if (str3 != null) {
            int i4 = e + 33;
            unregisterClient = i4 % 128;
            int i5 = i4 % 2;
            if (str3.length() != 0) {
                z = false;
                if (!z) {
                    int i6 = e + 61;
                    unregisterClient = i6 % 128;
                    if (i6 % 2 != 0) {
                        map.put("referrer", str);
                        obj.hashCode();
                        throw null;
                    }
                    map.put("referrer", str);
                    int i7 = e + 41;
                    unregisterClient = i7 % 128;
                    int i8 = i7 % 2;
                }
                monetizationNetwork = this.component1.getMonetizationNetwork("extraReferrers", (String) null);
                if (monetizationNetwork != null) {
                    map.put("extraReferrers", monetizationNetwork);
                }
                String referrer = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getReferrer(this.component1);
                str2 = referrer;
                if (str2 != null) {
                    int i9 = e + 65;
                    unregisterClient = i9 % 128;
                    int i10 = i9 % 2;
                    if (str2.length() != 0) {
                        if (map.get("referrer") == null) {
                            map.put("referrer", referrer);
                            return;
                        }
                        return;
                    }
                }
                i = e + 97;
                unregisterClient = i % 128;
                if (i % 2 == 0) {
                    int i11 = 2 / 5;
                    return;
                }
                return;
            }
        }
        z = true;
        if (!z) {
        }
        monetizationNetwork = this.component1.getMonetizationNetwork("extraReferrers", (String) null);
        if (monetizationNetwork != null) {
        }
        String referrer2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getReferrer(this.component1);
        str2 = referrer2;
        if (str2 != null) {
        }
        i = e + 97;
        unregisterClient = i % 128;
        if (i % 2 == 0) {
        }
    }

    private void copy(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = unregisterClient + 113;
        e = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        long j = this.areAllFieldsValid.copydefault;
        if (j != 0) {
            int i4 = unregisterClient + 59;
            e = i4 % 128;
            if (i4 % 2 != 0) {
                map.put("prev_session_dur", Long.valueOf(j));
            } else {
                map.put("prev_session_dur", Long.valueOf(j));
                throw null;
            }
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        Map map = (Map) objArr[0];
        int i = 2 % 2;
        int i2 = unregisterClient + 45;
        e = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFa1vSDK aFa1vSDK = AFa1vSDK.INSTANCE;
        String monetizationNetwork = AFa1vSDK.getMonetizationNetwork();
        AFa1vSDK aFa1vSDK2 = AFa1vSDK.INSTANCE;
        String currencyIso4217Code = AFa1vSDK.getCurrencyIso4217Code();
        Object obj = null;
        if (monetizationNetwork != null) {
            int i4 = e + 93;
            unregisterClient = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (currencyIso4217Code != null && Integer.parseInt(currencyIso4217Code) > 0) {
                int i5 = e + 1;
                unregisterClient = i5 % 128;
                int i6 = i5 % 2;
                map.put("reinstallCounter", currencyIso4217Code);
                map.put("originalAppsflyerId", monetizationNetwork);
            }
        }
        int i7 = e + 13;
        unregisterClient = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private void AFInAppEventParameterName(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = e + 11;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.copydefault.AFAdRevenueData());
        int i4 = unregisterClient + 65;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void AFKeystoreWrapper(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = e + 37;
        unregisterClient = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
        String str = string;
        if (str != null) {
            int i3 = e + 113;
            unregisterClient = i3 % 128;
            if (i3 % 2 != 0) {
                str.length();
                throw null;
            }
            if (str.length() == 0) {
                return;
            }
            int i4 = unregisterClient + 11;
            e = i4 % 128;
            if (i4 % 2 != 0) {
                map.put(AppsFlyerProperties.EXTENSION, string);
            } else {
                map.put(AppsFlyerProperties.EXTENSION, string);
                obj.hashCode();
                throw null;
            }
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        boolean z = false;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String component3 = aFg1rSDK.component4.component3();
        String AFAdRevenueData = AFAdRevenueData(aFg1rSDK.component1, component3);
        boolean z2 = (AFAdRevenueData == null || Intrinsics.areEqual(AFAdRevenueData, component3)) ? false : true;
        if (AFAdRevenueData == null && component3 != null) {
            z = true;
        }
        if (z2 || z) {
            map.put("af_latestchannel", component3);
        }
        String component4 = aFg1rSDK.component4();
        if (component4 != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = component4.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String str = (String) getRevenue(new Object[]{aFg1rSDK}, -994471321, 994471330, System.identityHashCode(aFg1rSDK));
        if (str != null) {
            int i2 = unregisterClient + 125;
            e = i2 % 128;
            int i3 = i2 % 2;
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase2 = str.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
        }
        String component32 = aFg1rSDK.component3();
        Object obj = null;
        if (component32 == null) {
            return null;
        }
        int i4 = unregisterClient + 29;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            String lowerCase3 = component32.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_currentstore", lowerCase3);
            return null;
        }
        Locale locale4 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale4, "");
        String lowerCase4 = component32.toLowerCase(locale4);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
        map.put("af_currentstore", lowerCase4);
        obj.hashCode();
        throw null;
    }

    private void AFLogger(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = e + 93;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.component4.getMonetizationNetwork(this.getCurrencyIso4217Code)));
        int i4 = unregisterClient + 19;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        Map map = (Map) objArr[0];
        int i = 2 % 2;
        int i2 = unregisterClient + 65;
        e = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            int i4 = e + 25;
            unregisterClient = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e2);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e3);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            return null;
        } catch (Exception e4) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e4);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.component4.getMediationNetwork);
        if (currencyIso4217Code != null) {
            map.put("uid", currencyIso4217Code);
            Boolean valueOf = Boolean.valueOf(this.component4.getMediationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false));
            Intrinsics.checkNotNullExpressionValue(valueOf, "");
            if (valueOf.booleanValue()) {
                int i2 = e + 53;
                unregisterClient = i2 % 128;
                if (i2 % 2 != 0) {
                    map.put("custom_install_id", Boolean.TRUE);
                    throw null;
                }
                map.put("custom_install_id", Boolean.TRUE);
            }
            int i3 = unregisterClient + 5;
            e = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r1 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r1 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        r5.put("tokenRefreshConfigured", java.lang.Boolean.FALSE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = unregisterClient + 63;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            boolean monetizationNetwork = AFg1sSDK.getMonetizationNetwork(this.getCurrencyIso4217Code);
            AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork);
            int i3 = 64 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            boolean monetizationNetwork2 = AFg1sSDK.getMonetizationNetwork(this.getCurrencyIso4217Code);
            AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork2);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1sSDK.AFAdRevenueData(this.component1)));
        int i4 = unregisterClient + 51;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    private void i(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = e + 47;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFb1jSDK l_ = AFb1lSDK.l_(this.getCurrencyIso4217Code.getContentResolver());
        if (l_ == null) {
            int i4 = unregisterClient + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
            e = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = e + 33;
            unregisterClient = i6 % 128;
            int i7 = i6 % 2;
            map.put("amazon_aid", l_.getRevenue);
            map.put("amazon_aid_limit", String.valueOf(l_.getCurrencyIso4217Code));
        }
    }

    private void d(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = unregisterClient + 115;
        e = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component1.getMonetizationNetwork("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used", false)));
        }
        int i4 = unregisterClient + 83;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void w(Map<String, Object> map) {
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = e + 87;
        unregisterClient = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.hashCode.getMediationNetwork();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String mediationNetwork = this.hashCode.getMediationNetwork();
        String str = mediationNetwork;
        if (str != null) {
            int i4 = unregisterClient + 71;
            e = i4 % 128;
            if (i4 % 2 == 0) {
                str.length();
                obj.hashCode();
                throw null;
            }
            if (str.length() != 0) {
                z = false;
                if (!z) {
                    map.put("appsflyerKey", mediationNetwork);
                }
                i = unregisterClient + 43;
                e = i % 128;
                if (i % 2 != 0) {
                    int i5 = 60 / 0;
                    return;
                }
                return;
            }
        }
        z = true;
        if (!z) {
        }
        i = unregisterClient + 43;
        e = i % 128;
        if (i % 2 != 0) {
        }
    }

    private void afInfoLog(Map<String, Object> map) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            int i2 = unregisterClient + 55;
            e = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.getCurrencyIso4217Code.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                str = this.component4.AFAdRevenueData(this.getCurrencyIso4217Code);
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                int i4 = unregisterClient + 17;
                e = i4 % 128;
                if (i4 % 2 != 0) {
                    map.put("fb", str);
                } else {
                    map.put("fb", str);
                    throw null;
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
        int i = 2 % 2;
        int i2 = unregisterClient + 113;
        e = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1pSDK, "");
        if (!copydefault().contains(aFe1pSDK)) {
            int i4 = unregisterClient + 39;
            e = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (!this.toString.getMediationNetwork()) {
            AFb1gSDK aFb1gSDK = this.toString.copydefault;
            if (aFb1gSDK != null) {
                map.put("app_set_id", MapsKt.mapOf(TuplesKt.to("scope", Integer.valueOf(aFb1gSDK.getMonetizationNetwork)), TuplesKt.to("id", aFb1gSDK.getMediationNetwork)));
                return;
            }
            return;
        }
        map.put("app_set_id", MapsKt.mapOf(TuplesKt.to("app_set_id_disabled", Boolean.TRUE)));
        if (this.toString.copydefault != null) {
            int i6 = unregisterClient + 85;
            e = i6 % 128;
            int i7 = i6 % 2;
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
            int i8 = unregisterClient + 1;
            e = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
        int i10 = unregisterClient + 41;
        e = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static List<AFe1pSDK> copydefault() {
        int i = 2 % 2;
        int i2 = e + 107;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        List<AFe1pSDK> listOf = CollectionsKt.listOf((Object[]) new AFe1pSDK[]{AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.ADREVENUE});
        int i4 = unregisterClient + 41;
        e = i4 % 128;
        int i5 = i4 % 2;
        return listOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r5 = com.appsflyer.internal.AFg1rSDK.unregisterClient + 23;
        com.appsflyer.internal.AFg1rSDK.e = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        r5.getRevenue("CACHED_CHANNEL", r6);
        r5 = com.appsflyer.internal.AFg1rSDK.e + 99;
        com.appsflyer.internal.AFg1rSDK.unregisterClient = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if ((r5 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFAdRevenueData(AFc1qSDK aFc1qSDK, String str) {
        String monetizationNetwork;
        int i = 2 % 2;
        int i2 = unregisterClient + 17;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
            int i3 = 81 / 0;
        } else {
            monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        }
    }

    private static String getCurrencyIso4217Code(String str) {
        int i = 2 % 2;
        int i2 = unregisterClient + 19;
        e = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.checkNotNull(invoke, "");
            String str2 = (String) invoke;
            int i4 = e + 117;
            unregisterClient = i4 % 128;
            int i5 = i4 % 2;
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private final String getMediationNetwork(String str) {
        int i = 2 % 2;
        int i2 = e + 73;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        String currencyIso4217Code = this.component4.getCurrencyIso4217Code(str);
        int i4 = unregisterClient + 57;
        e = i4 % 128;
        int i5 = i4 % 2;
        return currencyIso4217Code;
    }

    private final String AFInAppEventType() {
        int i = 2 % 2;
        File revenue = getRevenue(getCurrencyIso4217Code("ro.appsflyer.preinstall.path"));
        if (getMediationNetwork(revenue)) {
            int i2 = e + 121;
            unregisterClient = i2 % 128;
            if (i2 % 2 != 0) {
                revenue = getRevenue(getMediationNetwork("AF_PRE_INSTALL_PATH"));
                int i3 = 28 / 0;
            } else {
                revenue = getRevenue(getMediationNetwork("AF_PRE_INSTALL_PATH"));
            }
        }
        if (getMediationNetwork(revenue)) {
            revenue = getRevenue("/data/local/tmp/pre_install.appsflyer");
        }
        if (getMediationNetwork(revenue)) {
            int i4 = unregisterClient + 25;
            e = i4 % 128;
            if (i4 % 2 == 0) {
                getRevenue("/etc/pre_install.appsflyer");
                throw null;
            }
            revenue = getRevenue("/etc/pre_install.appsflyer");
        }
        if (!getMediationNetwork(revenue)) {
            String packageName = this.getCurrencyIso4217Code.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            String mediationNetwork = getMediationNetwork(revenue, packageName);
            int i5 = e + 33;
            unregisterClient = i5 % 128;
            int i6 = i5 % 2;
            return mediationNetwork;
        }
        int i7 = unregisterClient + TypedValues.TYPE_TARGET;
        int i8 = i7 % 128;
        e = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 37;
        unregisterClient = i10 % 128;
        int i11 = i10 % 2;
        return null;
    }

    private static File getRevenue(String str) {
        int i = 2 % 2;
        int i2 = unregisterClient + 9;
        int i3 = i2 % 128;
        e = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (str != null) {
            int i5 = i3 + 71;
            unregisterClient = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    StringsKt.trim((CharSequence) str).toString().length();
                    obj.hashCode();
                    throw null;
                }
                if (StringsKt.trim((CharSequence) str).toString().length() > 0) {
                    return new File(StringsKt.trim((CharSequence) str).toString());
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        int i6 = unregisterClient + 41;
        e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 94 / 0;
        }
        return null;
    }

    private static boolean getMediationNetwork(File file) {
        int i = 2 % 2;
        int i2 = unregisterClient + 55;
        int i3 = i2 % 128;
        e = i3;
        int i4 = i2 % 2;
        if (file == null) {
            return true;
        }
        int i5 = i3 + 43;
        unregisterClient = i5 % 128;
        if (i5 % 2 == 0) {
            return !file.exists();
        }
        file.exists();
        throw null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0054 -> B:23:0x007f). Please report as a decompilation issue!!! */
    private static String getMediationNetwork(File file, String str) {
        InputStreamReader inputStreamReader;
        int i = 2 % 2;
        try {
            try {
                if (file == null) {
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
                        int i2 = e + 73;
                        unregisterClient = i2 % 128;
                        int i3 = i2 % 2;
                        return property;
                    } catch (FileNotFoundException unused) {
                        AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                            int i4 = e + 93;
                            unregisterClient = i4 % 128;
                            int i5 = i4 % 2;
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

    private final boolean AFKeystoreWrapper() {
        boolean z;
        int i = 2 % 2;
        int i2 = e + 29;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        if ((!((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) && !((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            z = false;
        } else {
            int i4 = unregisterClient + 67;
            e = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        if (!z) {
            AFa1ySDK.getRevenue();
            if (AFa1ySDK.getRevenue(this.getCurrencyIso4217Code)) {
                return false;
            }
        }
        return true;
    }

    private static void getMonetizationNetwork(Map<String, Object> map, AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        String str = aFh1mSDK.areAllFieldsValid;
        if (str != null) {
            map.put("eventName", str);
            map.put("eventValue", new JSONObject(aFh1mSDK.getRevenue == null ? new HashMap() : aFh1mSDK.getRevenue).toString());
        }
    }

    private static void unregisterClient(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
    }

    private void registerClient(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 1731268052, -1731268046, System.identityHashCode(this));
    }

    private static void AFInAppEventType(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
    }

    private void hashCode(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, String str) {
        getRevenue(new Object[]{this, map, str}, 274047423, -274047418, System.identityHashCode(this));
    }

    private String equals() {
        return (String) getRevenue(new Object[]{this}, -994471321, 994471330, System.identityHashCode(this));
    }

    private void component1(Map<String, ? extends Object> map) {
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
    }

    private final void component4(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -753773633, 753773645, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 528204691, -528204690, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final Long getMonetizationNetwork() {
        return (Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this));
    }

    private final void getMediationNetwork(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -539509618, 539509626, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        getRevenue(new Object[]{this, aFh1mSDK}, 572486758, -572486747, System.identityHashCode(this));
    }

    private final AppsFlyerProperties getMediationNetwork() {
        return (AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this));
    }
}
