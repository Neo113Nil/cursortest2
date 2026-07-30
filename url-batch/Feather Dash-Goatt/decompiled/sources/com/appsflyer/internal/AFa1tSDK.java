package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ExpandableListView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFe1qSDK.AnonymousClass1;
import com.appsflyer.internal.AFj1zSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import defpackage.c50;
import defpackage.d50;
import defpackage.lq;
import defpackage.ry0;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFa1tSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFAdRevenueData;
    private static long AFInAppEventParameterName = 0;
    private static int AFLogger = 0;
    private static AFa1tSDK areAllFieldsValid = null;
    static AppsFlyerInAppPurchaseValidatorListener getMediationNetwork = null;
    public static final String getMonetizationNetwork;
    private static int registerClient = 1;
    Application component3;
    private AFf1uSDK copy;
    private volatile SharedPreferences equals;
    private Map<Long, String> hashCode;
    private boolean toString;
    public volatile AppsFlyerConversionListener getCurrencyIso4217Code = null;
    private long component4 = -1;
    long getRevenue = -1;
    private long component2 = 5000;
    boolean component1 = false;
    private final AFc1cSDK copydefault = new AFc1cSDK();

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    /* renamed from: com.appsflyer.internal.AFa1tSDK$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getMonetizationNetwork = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMonetizationNetwork[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        component4();
        getMonetizationNetwork = "374";
        AFAdRevenueData = "6.18";
        getMediationNetwork = null;
        areAllFieldsValid = new AFa1tSDK();
        AFLogger = (registerClient + 109) % 128;
    }

    public AFa1tSDK() {
        getRevenue().afDebugLog().getMediationNetwork();
        getRevenue().afDebugLog().AFAdRevenueData();
    }

    private static /* synthetic */ Object AFInAppEventParameterName(Object[] objArr) {
        String string;
        String str = (String) objArr[0];
        int i = AFLogger + 63;
        registerClient = i % 128;
        if (i % 2 == 0) {
            string = AppsFlyerProperties.getInstance().getString(str);
            int i2 = 32 / 0;
        } else {
            string = AppsFlyerProperties.getInstance().getString(str);
        }
        registerClient = (AFLogger + 83) % 128;
        return string;
    }

    private static /* synthetic */ Object AFInAppEventType(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        int i = registerClient + 19;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            aFa1tSDK.start(context, str, null);
            return null;
        }
        aFa1tSDK.start(context, str, null);
        throw null;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr = str;
        if (str != null) {
            $11 = ($10 + 19) % 128;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        aFk1qSDK.getMonetizationNetwork = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFk1qSDK.getMediationNetwork = 0;
        while (true) {
            int i2 = aFk1qSDK.getMediationNetwork;
            if (i2 >= cArr2.length) {
                break;
            }
            jArr[i2] = (cArr2[i2] ^ (i2 * aFk1qSDK.getMonetizationNetwork)) ^ (AFInAppEventParameterName ^ 4058599813193289363L);
            aFk1qSDK.getMediationNetwork = i2 + 1;
        }
        char[] cArr3 = new char[length];
        aFk1qSDK.getMediationNetwork = 0;
        while (true) {
            int i3 = aFk1qSDK.getMediationNetwork;
            if (i3 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            }
            int i4 = $11 + 17;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr3[i3] = (char) jArr[i3];
            } else {
                cArr3[i3] = (char) jArr[i3];
                i3++;
            }
            aFk1qSDK.getMediationNetwork = i3;
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        int i = 1;
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        Context context = (Context) objArr[2];
        int i2 = AFLogger + 115;
        registerClient = i2 % 128;
        if (i2 % 2 == 0) {
            aFa1tSDK.getMonetizationNetwork(context);
            AFd1zSDK revenue = aFa1tSDK.getRevenue();
            revenue.AFInAppEventParameterName().getRevenue(booleanValue);
            revenue.getCurrencyIso4217Code().submit(new f(i, revenue));
            throw null;
        }
        aFa1tSDK.getMonetizationNetwork(context);
        AFd1zSDK revenue2 = aFa1tSDK.getRevenue();
        revenue2.AFInAppEventParameterName().getRevenue(booleanValue);
        revenue2.getCurrencyIso4217Code().submit(new f(i, revenue2));
        if (booleanValue) {
            AFLogger = (registerClient + 111) % 128;
            revenue2.getMediationNetwork().getRevenue("is_stop_tracking_used", true);
        }
        return null;
    }

    private static void c_(Context context, PackageInfo packageInfo) {
        try {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i = registerClient;
                int i2 = i + 63;
                AFLogger = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = applicationInfo.flags;
                    throw null;
                }
                if ((applicationInfo.flags & 32768) != 0) {
                    AFLogger = (i + 91) % 128;
                    if (Build.VERSION.SDK_INT >= 31) {
                        registerClient = (AFLogger + 79) % 128;
                        if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) == 0) {
                            AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                            return;
                        }
                        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                        int i4 = AFLogger + 9;
                        registerClient = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 61 / 0;
                            return;
                        }
                        return;
                    }
                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    }
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                }
            }
            int i6 = registerClient + 73;
            AFLogger = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while checking BackupRules: ", th);
        }
    }

    private AFj1zSDK[] component1() {
        AFLogger = (registerClient + 1) % 128;
        AFj1zSDK[] aFj1zSDKArr = (AFj1zSDK[]) getRevenue().copydefault().AFAdRevenueData.toArray(new AFj1zSDK[0]);
        int i = registerClient + 11;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            return aFj1zSDKArr;
        }
        throw null;
    }

    private boolean component2() {
        String str;
        int i = registerClient + 41;
        AFLogger = i % 128;
        int i2 = i % 2;
        long j = this.component4;
        if (i2 == 0 ? j <= 0 : j <= 1) {
            if (isStopped()) {
                return false;
            }
            AFLogger = (registerClient + 41) % 128;
            AFLogger.afInfoLog("Sending first launch for this session!");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.component4;
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
        String currencyIso4217Code = getCurrencyIso4217Code(simpleDateFormat, this.component4);
        String currencyIso4217Code2 = getCurrencyIso4217Code(simpleDateFormat, this.getRevenue);
        if (currentTimeMillis >= this.component2 || isStopped()) {
            if (isStopped()) {
                return false;
            }
            AFLogger.afInfoLog("Last Launch attempt: " + currencyIso4217Code + ";\nLast successful Launch event: " + currencyIso4217Code2 + ";\nSending launch (+" + currentTimeMillis + " ms)");
            return false;
        }
        int i3 = registerClient + 21;
        AFLogger = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[3];
            objArr[1] = currencyIso4217Code;
            objArr[1] = currencyIso4217Code2;
            objArr[3] = Long.valueOf(currentTimeMillis);
            objArr[3] = Long.valueOf(this.component2);
            str = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", objArr);
        } else {
            str = "Last Launch attempt: " + currencyIso4217Code + ";\nLast successful Launch event: " + currencyIso4217Code2 + ";\nThis launch is blocked: " + currentTimeMillis + " ms < " + this.component2 + " ms";
        }
        AFLogger.afInfoLog(str);
        return true;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        Context context = (Context) objArr[0];
        registerClient = (AFLogger + 75) % 128;
        try {
            List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!asList.contains("android.permission.INTERNET")) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
            }
            if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                int i = registerClient + 109;
                AFLogger = i % 128;
                if (i % 2 != 0) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                    throw null;
                }
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32) {
                AFLogger = (registerClient + 95) % 128;
                if (!asList.contains("com.google.android.gms.permission.AD_ID")) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                    AFLogger = (registerClient + 39) % 128;
                }
            }
            return null;
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e);
            return null;
        }
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        int i = 1;
        String str = (String) objArr[1];
        AFh1sSDK monetizationNetwork = new AFh1nSDK().getMonetizationNetwork(aFa1tSDK.getRevenue().AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0));
        monetizationNetwork.component2 = str;
        if (str == null || str.length() <= 5 || !aFa1tSDK.getRevenue().copydefault().getCurrencyIso4217Code(monetizationNetwork)) {
            return null;
        }
        int i2 = AFLogger + 33;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (i3 == 0) {
            AFj1cSDK.getMonetizationNetwork(aFa1tSDK.getRevenue().getMonetizationNetwork(), new g(aFa1tSDK, i, monetizationNetwork), 5L, timeUnit);
            throw null;
        }
        AFj1cSDK.getMonetizationNetwork(aFa1tSDK.getRevenue().getMonetizationNetwork(), new g(aFa1tSDK, i, monetizationNetwork), 5L, timeUnit);
        AFLogger = (registerClient + 95) % 128;
        return null;
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        registerClient = (AFLogger + 95) % 128;
        aFa1tSDK.start(context, null);
        int i = registerClient + 105;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        AFLogger = (registerClient + 67) % 128;
        if (!(context instanceof Activity)) {
            return null;
        }
        AFh1oSDK aFh1oSDK = new AFh1oSDK((Activity) context, aFa1tSDK.getRevenue().w());
        int i = AFLogger + 73;
        registerClient = i % 128;
        if (i % 2 != 0) {
            return aFh1oSDK;
        }
        throw null;
    }

    public static SharedPreferences d_(Context context) {
        return (SharedPreferences) getMonetizationNetwork(new Object[]{context}, 1469250199, -1469250196, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void e_(Context context, Intent intent) {
        Uri uri;
        int i;
        getMonetizationNetwork(context);
        AFa1oSDK i2 = getRevenue().i();
        AFc1jSDK mediationNetwork = getRevenue().getMediationNetwork();
        boolean z = true;
        if (intent != null) {
            registerClient = (AFLogger + 1) % 128;
            if ("android.intent.action.VIEW".equals(intent.getAction())) {
                uri = intent.getData();
                registerClient = (AFLogger + 67) % 128;
                if (uri != null || uri.toString().isEmpty()) {
                    z = false;
                } else {
                    registerClient = (AFLogger + 23) % 128;
                }
                if (mediationNetwork.getRevenue("ddl_sent") || z) {
                    i2.f_(AFa1jSDK.getMediationNetwork(i2.component4.afErrorLog()), intent, context);
                    i = registerClient + 99;
                    AFLogger = i % 128;
                    if (i % 2 == 0) {
                        int i3 = 16 / 0;
                        return;
                    }
                    return;
                }
                int i4 = registerClient + 9;
                AFLogger = i4 % 128;
                if (i4 % 2 == 0) {
                    i2.AFAdRevenueData("No direct deep link", null);
                    return;
                } else {
                    i2.AFAdRevenueData("No direct deep link", null);
                    int i5 = 68 / 0;
                    return;
                }
            }
        }
        uri = null;
        if (uri != null) {
        }
        z = false;
        if (mediationNetwork.getRevenue("ddl_sent")) {
        }
        i2.f_(AFa1jSDK.getMediationNetwork(i2.component4.afErrorLog()), intent, context);
        i = registerClient + 99;
        AFLogger = i % 128;
        if (i % 2 == 0) {
        }
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        Boolean bool = (Boolean) objArr[1];
        boolean booleanValue = bool.booleanValue();
        registerClient = (AFLogger + 113) % 128;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(booleanValue)), true);
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, bool}, 1660171217, -1660171210, (int) System.currentTimeMillis());
        int i = registerClient + 65;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            int i2 = 88 / 0;
        }
        return null;
    }

    private static void getCurrencyIso4217Code(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (keys2.hasNext()) {
                int i2 = AFLogger + 27;
                registerClient = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (str != null) {
                    break loop2;
                }
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    AFLogger = (registerClient + 89) % 128;
                    int i3 = 0;
                    while (i3 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i3) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i3) != ((Long) arrayList.get(1)).longValue()) {
                            AFLogger = (registerClient + 105) % 128;
                            if (jSONArray2.getLong(i3) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            }
                            i3++;
                            str = next;
                        }
                    }
                } catch (JSONException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                }
            }
            break loop2;
        }
        if (str != null) {
            jSONObject.remove(str);
        }
        AFLogger = (registerClient + 37) % 128;
    }

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~(i4 | i2);
        int i6 = ~i2;
        int i7 = ((i3 | i5 | (~(i6 | i))) * 614) + (i2 * (-613)) + (i * 615);
        int i8 = ~i3;
        switch ((((~(i | i8 | i2)) | (~(i4 | i6 | i8))) * 614) + (((~(i4 | i8)) | i5 | (~(i8 | i2))) * (-1228)) + i7) {
            case 1:
                return getMonetizationNetwork(objArr);
            case 2:
                AFc1jSDK aFc1jSDK = (AFc1jSDK) objArr[0];
                String str = (String) objArr[1];
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                int currencyIso4217Code = aFc1jSDK.getCurrencyIso4217Code(str, 0);
                if (booleanValue) {
                    int i9 = AFLogger + 21;
                    registerClient = i9 % 128;
                    currencyIso4217Code = i9 % 2 == 0 ? currencyIso4217Code + 81 : currencyIso4217Code + 1;
                    aFc1jSDK.AFAdRevenueData(str, currencyIso4217Code);
                    registerClient = (AFLogger + 9) % 128;
                }
                return Integer.valueOf(currencyIso4217Code);
            case 3:
                return getMediationNetwork(objArr);
            case 4:
                AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
                AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) objArr[1];
                Map map = (Map) objArr[2];
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = (AppsFlyerInAppPurchaseValidationCallback) objArr[3];
                AFe1qSDK equals = aFa1tSDK.copydefault.equals();
                equals.getMonetizationNetwork.execute(equals.new AnonymousClass1(new AFe1dSDK(aFa1tSDK.copydefault, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
                AFLogger = (registerClient + 69) % 128;
                return null;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return getRevenue(objArr);
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return AFAdRevenueData(objArr);
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return getCurrencyIso4217Code(objArr);
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return component4(objArr);
            case 9:
                return component1(objArr);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return areAllFieldsValid(objArr);
            case RequestError.STOP_TRACKING /* 11 */:
                AFa1tSDK aFa1tSDK2 = (AFa1tSDK) objArr[0];
                String str2 = (String) objArr[1];
                int i10 = registerClient + 51;
                AFLogger = i10 % 128;
                if (i10 % 2 != 0) {
                    AFd1lSDK copy = aFa1tSDK2.getRevenue().copy();
                    String[] strArr = new String[0];
                    strArr[0] = str2;
                    copy.getMediationNetwork("setAndroidIdData", strArr);
                } else {
                    aFa1tSDK2.getRevenue().copy().getMediationNetwork("setAndroidIdData", str2);
                }
                aFa1tSDK2.getRevenue().e().getCurrencyIso4217Code = str2;
                return null;
            case 12:
                String str3 = (String) objArr[0];
                int i11 = AFLogger + 3;
                registerClient = i11 % 128;
                int i12 = i11 % 2;
                return Boolean.valueOf(AppsFlyerProperties.getInstance().getBoolean(str3, false));
            case 13:
                AFa1tSDK aFa1tSDK3 = (AFa1tSDK) objArr[0];
                AppsFlyerConversionListener appsFlyerConversionListener = (AppsFlyerConversionListener) objArr[2];
                int i13 = AFLogger + 53;
                registerClient = i13 % 128;
                if (i13 % 2 == 0) {
                    aFa1tSDK3.getRevenue().copy().getMediationNetwork("registerConversionListener", new String[1]);
                } else {
                    aFa1tSDK3.getRevenue().copy().getMediationNetwork("registerConversionListener", new String[0]);
                }
                aFa1tSDK3.getMonetizationNetwork(appsFlyerConversionListener);
                registerClient = (AFLogger + 23) % 128;
                return null;
            case 14:
                AFa1tSDK aFa1tSDK4 = (AFa1tSDK) objArr[0];
                Context context = (Context) objArr[1];
                Map<String, Object> map2 = (Map) objArr[2];
                PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback = (PurchaseHandler.PurchaseValidationCallback) objArr[3];
                registerClient = (AFLogger + 63) % 128;
                aFa1tSDK4.getMonetizationNetwork(context);
                PurchaseHandler component1 = aFa1tSDK4.getRevenue().component1();
                if (component1.getRevenue(map2, purchaseValidationCallback, "purchases")) {
                    AFe1eSDK aFe1eSDK = new AFe1eSDK(map2, purchaseValidationCallback, component1.getCurrencyIso4217Code);
                    AFe1qSDK aFe1qSDK = component1.AFAdRevenueData;
                    aFe1qSDK.getMonetizationNetwork.execute(aFe1qSDK.new AnonymousClass1(aFe1eSDK));
                }
                AFLogger = (registerClient + 79) % 128;
                return null;
            case 15:
                return component3(objArr);
            case 16:
                return component2(objArr);
            case 17:
                return equals(objArr);
            case 18:
                return copy(objArr);
            case 19:
                return hashCode(objArr);
            case 20:
                return toString(objArr);
            case 21:
                return copydefault(objArr);
            case 22:
                return registerClient(objArr);
            case 23:
                return AFInAppEventType(objArr);
            case 24:
                return AFInAppEventParameterName(objArr);
            default:
                AFa1tSDK aFa1tSDK5 = (AFa1tSDK) objArr[0];
                Context context2 = (Context) objArr[1];
                AFLogger = (registerClient + 73) % 128;
                aFa1tSDK5.getMonetizationNetwork(context2);
                String currencyIso4217Code2 = aFa1tSDK5.getRevenue().AFAdRevenueData().getCurrencyIso4217Code(context2);
                AFLogger = (registerClient + 81) % 128;
                return currencyIso4217Code2;
        }
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        registerClient = (AFLogger + 101) % 128;
        if (aFa1tSDK.getRevenue().afVerboseLog().getCurrencyIso4217Code()) {
            aFa1tSDK.getRevenue().afVerboseLog().getMonetizationNetwork();
            AFLogger = (registerClient + 111) % 128;
        }
        AFi1xSDK d = aFa1tSDK.getRevenue().d();
        d.getRevenue = Build.VERSION.SDK_INT >= 31 ? new AFi1tSDK(d.getCurrencyIso4217Code) : new AFi1qSDK(d.getCurrencyIso4217Code);
        aFa1tSDK.getRevenue().AFInAppEventParameterName().AFAdRevenueData(aFa1tSDK.getRevenue().AFAdRevenueData());
        AFh1uSDK component2 = aFa1tSDK.getRevenue().component2();
        component2.component3 = System.currentTimeMillis();
        int currencyIso4217Code = component2.getMediationNetwork.getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0);
        if (currencyIso4217Code == 1 && component2.AFAdRevenueData.getMonetizationNetwork("first_launch")) {
            component2.getCurrencyIso4217Code.putAll(component2.AFAdRevenueData("first_launch"));
        }
        if (currencyIso4217Code > 0) {
            registerClient = (AFLogger + 75) % 128;
            if (component2.AFAdRevenueData.getMonetizationNetwork("gcd")) {
                component2.getRevenue.putAll(component2.AFAdRevenueData("gcd"));
            }
        }
        component2.equals = component2.AFAdRevenueData.getMediationNetwork("prev_session_dur", 0L);
        aFa1tSDK.getRevenue().component3().AFAdRevenueData(aFa1tSDK.getMonetizationNetwork());
        aFa1tSDK.areAllFieldsValid();
        aFa1tSDK.getRevenue().AFKeystoreWrapper().getCurrencyIso4217Code();
        int i = AFLogger + 105;
        registerClient = i % 128;
        if (i % 2 == 0) {
            int i2 = 26 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object registerClient(Object[] objArr) {
        registerClient = (AFLogger + 115) % 128;
        AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        int i = registerClient + 5;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        AFLogger = (registerClient + 3) % 128;
        if (map != null) {
            aFa1tSDK.getRevenue().copy().getMediationNetwork("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        int i = AFLogger + 97;
        registerClient = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final Map<String, Object> AFAdRevenueData(AFh1sSDK aFh1sSDK) {
        String str;
        Context context = getRevenue().registerClient().getCurrencyIso4217Code;
        AFc1jSDK mediationNetwork = getMediationNetwork(context);
        AFg1vSDK areAllFieldsValid2 = getRevenue().areAllFieldsValid();
        boolean revenue = getRevenue().AFInAppEventParameterName().getRevenue();
        boolean AFAdRevenueData2 = aFh1sSDK.AFAdRevenueData();
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a("\ud96c\uf8bc髼볼常灓ቢ㖟ퟁ\ue9e3謆굀", ExpandableListView.getPackedPositionGroup(0L) + 8663, objArr);
        boolean z = false;
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (revenue) {
                AFLogger = (registerClient + 109) % 128;
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (AFAdRevenueData2) {
                    int i = registerClient + 73;
                    AFLogger = i % 128;
                    str = "Launch";
                    if (i % 2 != 0) {
                        int i2 = 2 / 0;
                    }
                } else {
                    str = aFh1sSDK.areAllFieldsValid;
                }
                sb.append(str);
                aFLogger.i(aFg1cSDK, sb.toString(), true);
            }
            getMonetizationNetwork(new Object[]{context}, 847967095, -847967080, (int) System.currentTimeMillis());
            int mediationNetwork2 = getMediationNetwork(mediationNetwork, AFAdRevenueData2);
            if (aFh1sSDK.areAllFieldsValid != null) {
                AFLogger = (registerClient + 71) % 128;
                z = true;
            }
            int AFAdRevenueData3 = AFAdRevenueData(mediationNetwork, z);
            if (AFAdRevenueData2 && mediationNetwork2 == 1) {
                registerClient = (AFLogger + 109) % 128;
                AppsFlyerProperties.getInstance().getMonetizationNetwork = true;
            }
            areAllFieldsValid2.getMonetizationNetwork(map, mediationNetwork2, AFAdRevenueData3);
            return map;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
            return map;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = getRevenue().i().getMediationNetwork;
        if (!list.contains(asList)) {
            int i = AFLogger + 39;
            registerClient = i % 128;
            if (i % 2 == 0) {
                list.add(asList);
                throw null;
            }
            list.add(asList);
        }
        registerClient = (AFLogger + 23) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = registerClient + 93;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            AFd1lSDK copy = getRevenue().copy();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            copy.getMediationNetwork("anonymizeUser", strArr);
        } else {
            getRevenue().copy().getMediationNetwork("anonymizeUser", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        registerClient = (AFLogger + 27) % 128;
        AFa1oSDK i = getRevenue().i();
        i.getMonetizationNetwork = str;
        i.getCurrencyIso4217Code = map;
        registerClient = (AFLogger + 107) % 128;
    }

    public final void b_(Context context, Intent intent) {
        AFj1nSDK aFj1nSDK = new AFj1nSDK(intent);
        if (aFj1nSDK.getMediationNetwork("appsflyer_preinstall") != null) {
            int i = AFLogger + 9;
            registerClient = i % 128;
            if (i % 2 == 0) {
                getMediationNetwork(aFj1nSDK.getMediationNetwork("appsflyer_preinstall"));
                throw null;
            }
            getMediationNetwork(aFj1nSDK.getMediationNetwork("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String mediationNetwork = aFj1nSDK.getMediationNetwork("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(mediationNetwork)));
        if (mediationNetwork != null) {
            registerClient = (AFLogger + 75) % 128;
            getMediationNetwork(context).getMediationNetwork("referrer", mediationNetwork);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", mediationNetwork);
            appsFlyerProperties.getRevenue = mediationNetwork;
            if (AppsFlyerProperties.getInstance().getCurrencyIso4217Code()) {
                AFLogger = (registerClient + 69) % 128;
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                getCurrencyIso4217Code(context, AFh1xSDK.onReceive);
                getMonetizationNetwork(new Object[]{this, mediationNetwork}, -1378401160, 1378401168, System.identityHashCode(this));
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        int i = AFLogger + 73;
        registerClient = i % 128;
        int i2 = i % 2;
        getRevenue().e().component1 = true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        AFLogger = (registerClient + 41) % 128;
        getRevenue().unregisterClient().getMonetizationNetwork(z);
        int i = AFLogger + 63;
        registerClient = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        int i = AFLogger + 69;
        registerClient = i % 128;
        if (i % 2 != 0) {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
        } else {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) {
        int i = AFLogger + 15;
        registerClient = i % 128;
        if (i % 2 == 0) {
            getRevenue().copy().getMediationNetwork("getAppsFlyerUID", new String[1]);
            if (context == null) {
                return null;
            }
        } else {
            getRevenue().copy().getMediationNetwork("getAppsFlyerUID", new String[0]);
            if (context == null) {
                return null;
            }
        }
        getMonetizationNetwork(context);
        String currencyIso4217Code = AFb1iSDK.getCurrencyIso4217Code(getRevenue().AFAdRevenueData().getCurrencyIso4217Code);
        registerClient = (AFLogger + 7) % 128;
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        return (String) getMonetizationNetwork(new Object[]{this, context}, 1233339105, -1233339105, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i = registerClient + 75;
        AFLogger = i % 128;
        int i2 = i % 2;
        AFe1vSDK AFInAppEventType = getRevenue().AFInAppEventType();
        if (i2 != 0) {
            AFInAppEventType.getCurrencyIso4217Code();
            throw null;
        }
        String currencyIso4217Code = AFInAppEventType.getCurrencyIso4217Code();
        int i3 = AFLogger + 55;
        registerClient = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 0;
        }
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        return (String) getMonetizationNetwork(new Object[]{this}, 595451129, -595451120, System.identityHashCode(this));
    }

    public final void getMediationNetwork(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        registerClient = (AFLogger + 103) % 128;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String revenue = getMediationNetwork(context).getRevenue("extraReferrers", (String) null);
            if (revenue == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(revenue);
                jSONArray = jSONObject2.has(str) ? new JSONArray((String) jSONObject2.get(str)) : new JSONArray();
                jSONObject = jSONObject2;
            }
            if (jSONArray.length() < 5) {
                jSONArray.put(currentTimeMillis);
                AFLogger = (registerClient + 105) % 128;
            }
            if (jSONObject.length() >= 4) {
                getCurrencyIso4217Code(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            getMediationNetwork(context).getMediationNetwork("extraReferrers", jSONObject.toString());
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            int i = (registerClient + 109) % 128;
            AFLogger = i;
            registerClient = (i + 13) % 128;
            return string;
        }
        String AFAdRevenueData2 = AFAdRevenueData(context, "AF_STORE");
        if (AFAdRevenueData2 != null) {
            return AFAdRevenueData2;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x011e, code lost:
    
        if ((r11 % 2) != 0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getRevenue(AFh1sSDK aFh1sSDK) {
        long j;
        Context context = getRevenue().registerClient().getCurrencyIso4217Code;
        boolean z = true;
        if (context == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
            return;
        }
        String monetizationNetwork = getRevenue().AFInAppEventParameterName().getMonetizationNetwork();
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1sSDK.getCurrencyIso4217Code;
        if (monetizationNetwork == null || monetizationNetwork.length() == 0) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
            aFLogger.i(aFg1cSDK, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
            aFLogger.i(aFg1cSDK, "AppsFlyer will not track this event.", true);
            if (appsFlyerRequestListener != null) {
                registerClient = (AFLogger + 39) % 128;
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        AFc1jSDK mediationNetwork = getMediationNetwork(context);
        AppsFlyerProperties.getInstance().saveProperties(mediationNetwork);
        if (!getRevenue().AFInAppEventParameterName().getRevenue()) {
            AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "sendWithEvent from activity: ".concat(context.getClass().getName()), true);
        }
        boolean AFAdRevenueData2 = aFh1sSDK.AFAdRevenueData();
        Map<String, ?> AFAdRevenueData3 = AFAdRevenueData(aFh1sSDK);
        if (getRevenue().AFInAppEventParameterName().getRevenue()) {
            AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyerLib.sendWithEvent");
        }
        int mediationNetwork2 = getMediationNetwork(mediationNetwork, false);
        getMediationNetwork(AFAdRevenueData3);
        AFa1uSDK aFa1uSDK = new AFa1uSDK(getRevenue(), aFh1sSDK.getCurrencyIso4217Code(AFAdRevenueData3).getMonetizationNetwork(mediationNetwork2), getRevenue().unregisterClient().getRevenue());
        if (AFAdRevenueData2) {
            boolean z2 = false;
            for (AFj1zSDK aFj1zSDK : component1()) {
                AFLogger = (registerClient + 27) % 128;
                if (aFj1zSDK.component2 == AFj1zSDK.AFa1ySDK.STARTED) {
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                    StringBuilder sb = new StringBuilder("Failed to get ");
                    sb.append(aFj1zSDK.AFAdRevenueData);
                    sb.append(" referrer, wait ...");
                    aFLogger2.d(aFg1cSDK2, sb.toString());
                    z2 = true;
                }
            }
            if (getRevenue().unregisterClient().getMonetizationNetwork()) {
                int i = AFLogger + 53;
                registerClient = i % 128;
                int i2 = i % 2;
                AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
                registerClient = (AFLogger + 73) % 128;
                z2 = true;
            }
            if (getRevenue().AFInAppEventParameterName().getMediationNetwork()) {
                int i3 = registerClient + 29;
                AFLogger = i3 % 128;
            } else {
                z = z2;
            }
            ScheduledExecutorService monetizationNetwork2 = getRevenue().getMonetizationNetwork();
            if (z) {
                AFLogger = (registerClient + 35) % 128;
                j = 0;
            } else {
                j = 500;
            }
            AFj1cSDK.getMonetizationNetwork(monetizationNetwork2, aFa1uSDK, j, TimeUnit.MILLISECONDS);
        }
        z = false;
        ScheduledExecutorService monetizationNetwork22 = getRevenue().getMonetizationNetwork();
        if (z) {
        }
        AFj1cSDK.getMonetizationNetwork(monetizationNetwork22, aFa1uSDK, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        registerClient = (AFLogger + 95) % 128;
        getRevenue().copy().getMediationNetwork("getSdkVersion", new String[0]);
        String areAllFieldsValid2 = AFc1kSDK.areAllFieldsValid();
        int i = AFLogger + 53;
        registerClient = i % 128;
        if (i % 2 != 0) {
            return areAllFieldsValid2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        String str2;
        if (this.toString) {
            registerClient = (AFLogger + 71) % 128;
            return this;
        }
        final int i = 1;
        this.toString = true;
        getRevenue().AFInAppEventParameterName().getRevenue(str);
        if (context != null) {
            registerClient = (AFLogger + 27) % 128;
            getMonetizationNetwork(context);
            Application O_ = AFj1pSDK.O_(context);
            if (O_ == null) {
                return this;
            }
            registerClient = (AFLogger + 47) % 128;
            this.component3 = O_;
            final int i2 = 0;
            getRevenue().getCurrencyIso4217Code().execute(new Runnable(this) { // from class: com.appsflyer.internal.c
                public final /* synthetic */ AFa1tSDK e;

                {
                    this.e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    AFa1tSDK aFa1tSDK = this.e;
                    switch (i3) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            aFa1tSDK.equals();
                            break;
                        default:
                            aFa1tSDK.copy();
                            break;
                    }
                }
            });
            getRevenue().equals().getMediationNetwork.add(new AFa1ySDK());
            AFe1qSDK equals = getRevenue().equals();
            equals.getMonetizationNetwork.execute(equals.new AnonymousClass1(new AFe1jSDK(getRevenue())));
            getRevenue().afLogForce().getMonetizationNetwork(new a(this));
            AFj1rSDK copydefault = getRevenue().copydefault();
            Runnable runnable = new Runnable(this) { // from class: com.appsflyer.internal.c
                public final /* synthetic */ AFa1tSDK e;

                {
                    this.e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i;
                    AFa1tSDK aFa1tSDK = this.e;
                    switch (i3) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            aFa1tSDK.equals();
                            break;
                        default:
                            aFa1tSDK.copy();
                            break;
                    }
                }
            };
            AFi1aSDK AFAdRevenueData2 = copydefault.AFAdRevenueData(runnable);
            Runnable currencyIso4217Code = copydefault.getCurrencyIso4217Code(AFAdRevenueData2, runnable);
            copydefault.AFAdRevenueData.add(AFAdRevenueData2);
            copydefault.AFAdRevenueData.add(new AFj1uSDK(copydefault.getCurrencyIso4217Code.AFAdRevenueData(), currencyIso4217Code));
            copydefault.AFAdRevenueData.add(new AFi1eSDK(currencyIso4217Code, copydefault.getCurrencyIso4217Code, new AFi1dSDK()));
            copydefault.AFAdRevenueData.add(new AFj1sSDK(currencyIso4217Code, copydefault.getCurrencyIso4217Code));
            copydefault.AFAdRevenueData.add(new AFj1qSDK(copydefault.getCurrencyIso4217Code.getCurrencyIso4217Code(), copydefault.getCurrencyIso4217Code.AFAdRevenueData(), currencyIso4217Code));
            copydefault.getRevenue(currencyIso4217Code);
            AFj1zSDK[] aFj1zSDKArr = (AFj1zSDK[]) copydefault.AFAdRevenueData.toArray(new AFj1zSDK[0]);
            int length = aFj1zSDKArr.length;
            while (i2 < length) {
                int i3 = registerClient + 61;
                AFLogger = i3 % 128;
                if (i3 % 2 != 0) {
                    aFj1zSDKArr[i2].getMonetizationNetwork(copydefault.getCurrencyIso4217Code.registerClient().getCurrencyIso4217Code);
                    i2 += 63;
                } else {
                    aFj1zSDKArr[i2].getMonetizationNetwork(copydefault.getCurrencyIso4217Code.registerClient().getCurrencyIso4217Code);
                    i2++;
                }
            }
            if (!copydefault.getCurrencyIso4217Code()) {
                copydefault.getMediationNetwork(copydefault.getCurrencyIso4217Code.registerClient().getCurrencyIso4217Code, currencyIso4217Code, copydefault.getCurrencyIso4217Code);
            }
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFd1lSDK copy = getRevenue().copy();
        if (appsFlyerConversionListener == null) {
            registerClient = (AFLogger + 95) % 128;
            str2 = "null";
        } else {
            str2 = "conversionDataListener";
        }
        copy.getMediationNetwork("init", str, str2);
        AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, "Initializing AppsFlyer SDK: (v6.18.0." + getMonetizationNetwork + ")");
        this.getCurrencyIso4217Code = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        int i = AFLogger + 11;
        registerClient = i % 128;
        if (i % 2 == 0) {
            getMonetizationNetwork(context);
            getRevenue().AFAdRevenueData().getMonetizationNetwork(context);
            throw null;
        }
        getMonetizationNetwork(context);
        boolean monetizationNetwork = getRevenue().AFAdRevenueData().getMonetizationNetwork(context);
        int i2 = AFLogger + 51;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        int i = registerClient + 99;
        AFLogger = i % 128;
        int i2 = i % 2;
        boolean revenue = getRevenue().AFInAppEventParameterName().getRevenue();
        if (i2 != 0) {
            int i3 = 48 / 0;
        }
        int i4 = registerClient + 83;
        AFLogger = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return revenue;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        if (!this.toString) {
            AFAdRevenueData("logAdRevenue");
            int i = registerClient + 1;
            AFLogger = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            AFLogger = (registerClient + 57) % 128;
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
        } else if (getRevenue().AFInAppEventParameterName().getRevenue()) {
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
        } else if (AFk1zSDK.getMediationNetwork(getRevenue().AFInAppEventParameterName().getMonetizationNetwork())) {
            getMonetizationNetwork(new Object[0], -1617966880, 1617966902, (int) System.currentTimeMillis());
        } else {
            getCurrencyIso4217Code(new AFh1qSDK(aFAdRevenueData, map));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        getMonetizationNetwork(context);
        AFh1lSDK aFh1lSDK = new AFh1lSDK();
        aFh1lSDK.areAllFieldsValid = str;
        aFh1lSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1cSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1lSDK.getCurrencyIso4217Code(singletonMap);
        }
        aFh1lSDK.getMediationNetwork = hashMap;
        AFd1lSDK copy = getRevenue().copy();
        Map map2 = aFh1lSDK.getMediationNetwork;
        if (map2 == null) {
            map2 = new HashMap();
        }
        copy.getMediationNetwork("logEvent", str, new JSONObject(map2).toString());
        if (str == null) {
            getCurrencyIso4217Code(context, AFh1xSDK.logEvent);
        }
        getMonetizationNetwork(aFh1lSDK, (AFh1oSDK) getMonetizationNetwork(new Object[]{this, context}, -536448515, 536448536, System.identityHashCode(this)));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        getRevenue().copy().getMediationNetwork("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        getMediationNetwork(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        AFLogger = (registerClient + 43) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        registerClient = (AFLogger + 113) % 128;
        getRevenue().copy().getMediationNetwork("logSession", new String[0]);
        getRevenue().copy().getMonetizationNetwork();
        getCurrencyIso4217Code(context, AFh1xSDK.logSession);
        getMediationNetwork(context, null, null);
        AFLogger = (registerClient + 39) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        AFLogger = (registerClient + 103) % 128;
        getRevenue().afInfoLog().getMediationNetwork();
        int i = registerClient + 19;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        AFLogger = (registerClient + 77) % 128;
        if (uri == null || uri.toString().isEmpty()) {
            AFa1oSDK i = getRevenue().i();
            StringBuilder sb = new StringBuilder("Link is \"");
            sb.append(uri);
            sb.append("\"");
            i.AFAdRevenueData(sb.toString(), DeepLinkResult.Error.NETWORK);
            AFLogger = (registerClient + 87) % 128;
            return;
        }
        if (context != null) {
            getMonetizationNetwork(context);
            getRevenue().i().g_(AFa1jSDK.getMediationNetwork(getRevenue().afErrorLog()), Uri.parse(uri.toString()));
            return;
        }
        AFa1oSDK i2 = getRevenue().i();
        StringBuilder sb2 = new StringBuilder("Context is \"");
        sb2.append(context);
        sb2.append("\"");
        i2.AFAdRevenueData(sb2.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(Intent intent, Context context) {
        if (intent == null) {
            getRevenue().i().AFAdRevenueData("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            AFLogger = (registerClient + 73) % 128;
        } else {
            if (context == null) {
                getRevenue().i().AFAdRevenueData("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            }
            Context applicationContext = context.getApplicationContext();
            getMonetizationNetwork(applicationContext);
            getRevenue().getCurrencyIso4217Code().execute(new lq(this, applicationContext, intent, 3));
            int i = registerClient + 115;
            AFLogger = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        getMonetizationNetwork(new Object[]{this, context, appsFlyerConversionListener}, 584622117, -584622104, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0044, code lost:
    
        com.appsflyer.internal.AFa1tSDK.getMediationNetwork = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        com.appsflyer.internal.AFa1tSDK.registerClient = (com.appsflyer.internal.AFa1tSDK.AFLogger + 99) % 128;
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i = registerClient + 7;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            getRevenue().copy().getMediationNetwork("registerValidatorListener", new String[0]);
            AFLogger.afDebugLog("registerValidatorListener called");
        } else {
            getRevenue().copy().getMediationNetwork("registerValidatorListener", new String[0]);
            AFLogger.afDebugLog("registerValidatorListener called");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        getMonetizationNetwork(new Object[]{this, context, map, purchaseValidationCallback}, 1377152571, -1377152557, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFLogger = (registerClient + 17) % 128;
        getMonetizationNetwork(context);
        PurchaseHandler component1 = getRevenue().component1();
        if (component1.getRevenue(map, purchaseValidationCallback, "subscriptions")) {
            AFe1oSDK aFe1oSDK = new AFe1oSDK(map, purchaseValidationCallback, component1.getCurrencyIso4217Code);
            AFe1qSDK aFe1qSDK = component1.AFAdRevenueData;
            aFe1qSDK.getMonetizationNetwork.execute(aFe1qSDK.new AnonymousClass1(aFe1oSDK));
        }
        registerClient = (AFLogger + 45) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x016d  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        long j;
        long j2;
        registerClient = (AFLogger + 39) % 128;
        if (activity != null && activity.getIntent() != null) {
            AFd1lSDK copy = getRevenue().copy();
            String localClassName = activity.getLocalClassName();
            StringBuilder sb = new StringBuilder("activity_intent_");
            sb.append(activity.getIntent().toString());
            copy.getMediationNetwork("sendPushNotificationData", localClassName, sb.toString());
        } else if (activity != null) {
            getRevenue().copy().getMediationNetwork("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            getRevenue().copy().getMediationNetwork("sendPushNotificationData", "activity_null");
        }
        AFc1gSDK e = getRevenue().e();
        String AFAdRevenueData2 = AFAdRevenueData(activity);
        e.getRevenue = AFAdRevenueData2;
        if (AFAdRevenueData2 != null) {
            AFLogger = (registerClient + 43) % 128;
            long currentTimeMillis = System.currentTimeMillis();
            if (this.hashCode == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.hashCode = new ConcurrentHashMap();
                j2 = currentTimeMillis;
                j = j2;
            } else {
                try {
                    long j3 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    j2 = currentTimeMillis;
                    for (Long l : this.hashCode.keySet()) {
                        try {
                            JSONObject jSONObject = new JSONObject(e.getRevenue);
                            JSONObject jSONObject2 = new JSONObject(this.hashCode.get(l));
                            j = currentTimeMillis;
                            try {
                                if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                    StringBuilder sb2 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                    sb2.append(jSONObject2);
                                    sb2.append(", new: ");
                                    sb2.append(jSONObject);
                                    sb2.append(")");
                                    AFLogger.afInfoLog(sb2.toString());
                                    e.getRevenue = null;
                                    return;
                                }
                                if (j - l.longValue() > j3) {
                                    AFLogger = (registerClient + 125) % 128;
                                    this.hashCode.remove(l);
                                }
                                if (l.longValue() <= j2) {
                                    j2 = l.longValue();
                                }
                                currentTimeMillis = j;
                            } catch (Throwable th) {
                                th = th;
                                AFLogger.afErrorLog("Error while handling push notification measurement: ".concat(th.getClass().getSimpleName()), th);
                                if (this.hashCode.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                                }
                                this.hashCode.put(Long.valueOf(j), e.getRevenue);
                                start(activity);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j = currentTimeMillis;
                        }
                    }
                    j = currentTimeMillis;
                } catch (Throwable th3) {
                    th = th3;
                    j = currentTimeMillis;
                    j2 = j;
                }
            }
            if (this.hashCode.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                StringBuilder sb3 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb3.append(j2);
                sb3.append(")");
                AFLogger.afInfoLog(sb3.toString());
                this.hashCode.remove(Long.valueOf(j2));
                AFLogger = (registerClient + 113) % 128;
            }
            this.hashCode.put(Long.valueOf(j), e.getRevenue);
            start(activity);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, map}, -123240693, 123240713, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        getMonetizationNetwork(new Object[]{this, str}, 2094756740, -2094756729, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        AFLogger = (registerClient + 111) % 128;
        getRevenue().copy().getMediationNetwork("setAppId", str);
        getMediationNetwork(AppsFlyerProperties.APP_ID, str);
        int i = registerClient + 37;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r5.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0059, code lost:
    
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_DOMAIN);
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_VERSION);
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_SCHEME);
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAppInviteOneLink(String str) {
        int i = registerClient + 91;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            getRevenue().copy().getMediationNetwork("setAppInviteOneLink", str);
            AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        } else {
            getRevenue().copy().getMediationNetwork("setAppInviteOneLink", str);
            AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        }
        getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
        int i2 = AFLogger + 7;
        registerClient = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        registerClient = (AFLogger + 77) % 128;
        getRevenue().copy().getMediationNetwork("setCollectAndroidID", String.valueOf(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        int i = registerClient + 47;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            int i2 = 16 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        AFLogger = (registerClient + 85) % 128;
        getRevenue().copy().getMediationNetwork("setCollectIMEI", String.valueOf(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        registerClient = (AFLogger + 115) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        AFLogger = (registerClient + 17) % 128;
        getRevenue().copy().getMediationNetwork("setCollectOaid", String.valueOf(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        int i = AFLogger + 83;
        registerClient = i % 128;
        if (i % 2 == 0) {
            int i2 = 70 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        AFLogger = (registerClient + 107) % 128;
        Objects.requireNonNull(appsFlyerConsent);
        getRevenue().e().areAllFieldsValid = appsFlyerConsent;
        registerClient = (AFLogger + 117) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        getMonetizationNetwork(new Object[]{this, str}, -1615724461, 1615724462, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        if (context != null) {
            int i = AFLogger + 17;
            registerClient = i % 128;
            if (i % 2 == 0) {
                getCurrencyIso4217Code();
                throw null;
            }
            if (!getCurrencyIso4217Code()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                registerClient = (AFLogger + 113) % 128;
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(getRevenue().getMediationNetwork());
            getCurrencyIso4217Code(context, AFh1xSDK.setCustomerIdAndLogSession);
            getRevenue().AFInAppEventParameterName().getMonetizationNetwork();
            if (referrer == null) {
                int i2 = registerClient + 57;
                AFLogger = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                referrer = "";
            }
            if (context instanceof Activity) {
                registerClient = (AFLogger + 31) % 128;
                ((Activity) context).getIntent();
            }
            getCurrencyIso4217Code(context, referrer);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        registerClient = (AFLogger + 101) % 128;
        getRevenue().copy().getMediationNetwork("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMediationNetwork(AppsFlyerProperties.APP_USER_ID, str);
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.FALSE}, 1660171217, -1660171210, (int) System.currentTimeMillis());
        int i = registerClient + 35;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            int i2 = 50 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        registerClient = (AFLogger + 7) % 128;
        setLogLevel(z ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
        int i = AFLogger + 123;
        registerClient = i % 128;
        if (i % 2 == 0) {
            int i2 = 45 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        boolean z2;
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        if (!z) {
            int i = registerClient + 81;
            AFLogger = i % 128;
            if (i % 2 == 0) {
                z2 = true;
                AFb1jSDK.getRevenue = Boolean.valueOf(z2);
                AFd1zSDK revenue = getRevenue();
                revenue.e().component4 = z;
                if (z) {
                    AFe1qSDK equals = revenue.equals();
                    equals.getMonetizationNetwork.execute(equals.new AnonymousClass1(new AFe1jSDK(getRevenue())));
                    return;
                }
                int i2 = registerClient + 29;
                AFLogger = i2 % 128;
                if (i2 % 2 != 0) {
                    revenue.e().component2 = null;
                    int i3 = 11 / 0;
                } else {
                    revenue.e().component2 = null;
                }
                int i4 = AFLogger + 15;
                registerClient = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        z2 = false;
        AFb1jSDK.getRevenue = Boolean.valueOf(z2);
        AFd1zSDK revenue2 = getRevenue();
        revenue2.e().component4 = z;
        if (z) {
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        AFLogger = (registerClient + 65) % 128;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.DISABLE_NETWORK_DATA, Boolean.valueOf(z)}, 1660171217, -1660171210, (int) System.currentTimeMillis());
        int i = AFLogger + 65;
        registerClient = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i = registerClient + 115;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            getRevenue().copy().getMediationNetwork("setExtension", str);
        } else {
            getRevenue().copy().getMediationNetwork("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String str3;
        registerClient = (AFLogger + 91) % 128;
        if (AFk1zSDK.getRevenue(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        if (str != null) {
            str3 = str.trim();
        } else {
            AFLogger = (registerClient + 15) % 128;
            str3 = "";
        }
        AFe1vSDK.getMediationNetwork(new AFe1xSDK(str3, str2.trim()));
        AFLogger = (registerClient + 15) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        registerClient = (AFLogger + 53) % 128;
        getRevenue().copy().getMediationNetwork("setImeiData", str);
        AFf1kSDK AFInAppEventParameterName2 = getRevenue().AFInAppEventParameterName();
        AFf1kSDK.getMonetizationNetwork(new Object[]{AFInAppEventParameterName2, str}, 1176564115, -1176564113, System.identityHashCode(AFInAppEventParameterName2));
        int i = registerClient + 7;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setInstallId(String str) {
        getRevenue().copy().getMediationNetwork("setInstallId", new String[0]);
        if (!this.toString) {
            int i = AFLogger + 61;
            registerClient = i % 128;
            if (i % 2 != 0) {
                AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
                return;
            } else {
                AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
                throw null;
            }
        }
        if (getRevenue().AFAdRevenueData().getMediationNetwork("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID")) {
            if (str != null) {
                AFb1iSDK.getCurrencyIso4217Code(str, getRevenue().getMediationNetwork());
                return;
            } else {
                registerClient = (AFLogger + 11) % 128;
                AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
                return;
            }
        }
        int i2 = AFLogger + 21;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
        } else {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        registerClient = (AFLogger + 97) % 128;
        getRevenue().copy().getMediationNetwork("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i = registerClient + 109;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        getMonetizationNetwork(new Object[]{this, logLevel}, -1560585851, 1560585867, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i2 = registerClient + 107;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (i3 == 0) {
            this.component2 = timeUnit.toMillis(i);
        } else {
            this.component2 = timeUnit.toMillis(i);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        AFLogger = (registerClient + 75) % 128;
        getRevenue().copy().getMediationNetwork("setOaidData", str);
        AFb1jSDK.getCurrencyIso4217Code = str;
        int i = registerClient + 65;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        String str;
        int i = registerClient + 9;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[0];
            objArr[1] = Arrays.toString(strArr);
            str = String.format("setOneLinkCustomDomain %s", objArr);
        } else {
            str = "setOneLinkCustomDomain " + Arrays.toString(strArr);
        }
        AFLogger.afDebugLog(str);
        getRevenue().i().component2 = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i = AFLogger;
        registerClient = (i + 65) % 128;
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        registerClient = (i + 83) % 128;
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r4.isEmpty() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r0 = new java.lang.StringBuilder("Setting partner data for ");
        r0.append(r3);
        r0.append(": ");
        r0.append(r4);
        com.appsflyer.AFLogger.afDebugLog(r0.toString());
        r0 = new org.json.JSONObject(r4).toString().length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r0 <= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
        r4 = new java.util.HashMap();
        r4.put("error", "limit exceeded: ".concat(java.lang.String.valueOf(r0)));
        r2.getMediationNetwork.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        r2.getMonetizationNetwork.put(r3, r4);
        r2.getMediationNetwork.remove(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r4.isEmpty() != false) goto L25;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPartnerData(String str, Map<String, Object> map) {
        String concat;
        AFc1gSDK e = getRevenue().e();
        if (e.getMediationNetwork == null) {
            e.getMediationNetwork = new AFb1qSDK();
            registerClient = (AFLogger + 49) % 128;
        }
        AFb1qSDK aFb1qSDK = e.getMediationNetwork;
        if (str == null || str.isEmpty()) {
            AFLogger.afWarnLog("Partner ID is missing or `null`");
            return;
        }
        if (map != null) {
            int i = AFLogger + 47;
            registerClient = i % 128;
            if (i % 2 == 0) {
                int i2 = 14 / 0;
            }
        }
        if (aFb1qSDK.getMonetizationNetwork.remove(str) == null) {
            int i3 = registerClient + 119;
            AFLogger = i3 % 128;
            concat = "Partner data is missing or `null`";
            if (i3 % 2 != 0) {
                int i4 = 24 / 0;
            }
        } else {
            concat = "Cleared partner data for ".concat(str);
            AFLogger = (registerClient + 87) % 128;
        }
        AFLogger.afWarnLog(concat);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i = registerClient + 83;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            getRevenue().e().AFAdRevenueData = AFj1jSDK.getCurrencyIso4217Code(str);
        } else {
            getRevenue().e().AFAdRevenueData = AFj1jSDK.getCurrencyIso4217Code(str);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        int i = registerClient + 9;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            Objects.requireNonNull(pluginInfo);
            getRevenue().AFLogger().getRevenue(pluginInfo);
            throw null;
        }
        Objects.requireNonNull(pluginInfo);
        getRevenue().AFLogger().getRevenue(pluginInfo);
        registerClient = (AFLogger + 45) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if (str != null) {
                int i = AFLogger + 57;
                registerClient = i % 128;
                if (i % 2 == 0) {
                    jSONObject.put("pid", str);
                    throw null;
                }
                jSONObject.put("pid", str);
            }
            if (str2 != null) {
                AFLogger = (registerClient + 59) % 128;
                jSONObject.put("c", str2);
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        } catch (JSONException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (jSONObject.has("pid")) {
            getMediationNetwork("preInstallName", jSONObject.toString());
        } else {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFLogger = (registerClient + 55) % 128;
        AFLogger.afDebugLog("setResolveDeepLinkURLs " + Arrays.toString(strArr));
        AFa1oSDK i = getRevenue().i();
        i.areAllFieldsValid.clear();
        i.areAllFieldsValid.addAll(Arrays.asList(strArr));
        registerClient = (AFLogger + 3) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        int i = registerClient + 5;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            setSharingFilterForPartners(strArr);
        } else {
            setSharingFilterForPartners(strArr);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = AFLogger + 75;
        registerClient = i % 128;
        if (i % 2 == 0) {
            String[] strArr = new String[1];
            strArr[1] = "all";
            setSharingFilterForPartners(strArr);
        } else {
            setSharingFilterForPartners("all");
        }
        int i2 = AFLogger + 95;
        registerClient = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        getRevenue().e().getMonetizationNetwork = new AFb1uSDK(strArr);
        int i = registerClient + 119;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        getRevenue().copy().getMediationNetwork("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        String str = null;
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            if (AnonymousClass3.getMonetizationNetwork[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1jSDK.getCurrencyIso4217Code(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                AFLogger = (registerClient + 103) % 128;
                str = "plain_el_arr";
            }
            i++;
            registerClient = (AFLogger + 1) % 128;
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (getRevenue().afInfoLog().getMonetizationNetwork()) {
            return;
        }
        if (!this.toString) {
            AFLogger = (registerClient + 47) % 128;
            AFAdRevenueData("start");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                AFLogger = (registerClient + 27) % 128;
                return;
            }
        }
        getMonetizationNetwork(context);
        final AFh1uSDK component2 = getRevenue().component2();
        component2.getRevenue(AFh1zSDK.AFAdRevenueData(context));
        if (this.component3 == null) {
            Application O_ = AFj1pSDK.O_(context);
            if (O_ == null) {
                return;
            }
            int i = registerClient + 87;
            AFLogger = i % 128;
            if (i % 2 != 0) {
                this.component3 = O_;
                throw null;
            }
            this.component3 = O_;
        }
        getRevenue().copy().getMediationNetwork("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
        String str2 = getMonetizationNetwork;
        aFLogger.i(aFg1cSDK, "Starting AppsFlyer: (v6.18.0." + str2 + ")");
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str2);
        aFLogger.i(aFg1cSDK, sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(getRevenue().getMediationNetwork());
        if (!TextUtils.isEmpty(str)) {
            registerClient = (AFLogger + 95) % 128;
            getRevenue().AFInAppEventParameterName().getRevenue(str);
        } else if (TextUtils.isEmpty(getRevenue().AFInAppEventParameterName().getMonetizationNetwork())) {
            getMonetizationNetwork(new Object[0], -1617966880, 1617966902, (int) System.currentTimeMillis());
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        getRevenue().component3().AFAdRevenueData(getMonetizationNetwork());
        component3();
        c_(this.component3.getBaseContext(), this.copydefault.AFAdRevenueData().n_());
        getRevenue().unregisterClient().getCurrencyIso4217Code();
        this.copydefault.afInfoLog().getMonetizationNetwork(context, new AFb1bSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFa1tSDK.1
            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getCurrencyIso4217Code() {
                Context context2 = AFa1tSDK.this.getRevenue().registerClient().getCurrencyIso4217Code;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1uSDK aFh1uSDK = component2;
                long currentTimeMillis = System.currentTimeMillis();
                long j = aFh1uSDK.component1;
                if (j != 0) {
                    long j2 = currentTimeMillis - j;
                    if (j2 > 0 && j2 < 1000) {
                        j2 = 1000;
                    }
                    long j3 = j2 / 1000;
                    aFh1uSDK.equals = j3;
                    aFh1uSDK.AFAdRevenueData.getRevenue("prev_session_dur", j3);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFa1tSDK.this.getRevenue().afLogForce().getCurrencyIso4217Code();
                AFd1lSDK copy = AFa1tSDK.this.getRevenue().copy();
                if (copy.component3()) {
                    copy.AFAdRevenueData();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        copy.q_(context2.getPackageName(), context2.getPackageManager());
                    }
                    copy.getCurrencyIso4217Code();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1tSDK.this.getRevenue().component4().getMediationNetwork();
                AFa1tSDK.this.getRevenue().afErrorLog().getRevenue();
                AFh1wSDK afErrorLogForExcManagerOnly = AFa1tSDK.this.getRevenue().afErrorLogForExcManagerOnly();
                if (afErrorLogForExcManagerOnly != null) {
                    afErrorLogForExcManagerOnly.getRevenue();
                }
            }

            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getMediationNetwork(AFh1oSDK aFh1oSDK) {
                Intent intent;
                component2.getMonetizationNetwork();
                AFd1zSDK revenue = AFa1tSDK.this.getRevenue();
                revenue.component3().AFAdRevenueData(AFa1tSDK.this.getMonetizationNetwork());
                AFa1tSDK.this.component3();
                int currencyIso4217Code = revenue.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (currencyIso4217Code < 2) {
                    AFa1tSDK.this.getRevenue().component4().getMonetizationNetwork();
                }
                AFh1mSDK aFh1mSDK = new AFh1mSDK();
                if (aFh1oSDK != null) {
                    AFa1tSDK.this.getRevenue().i().f_(AFa1jSDK.getRevenue(aFh1mSDK), aFh1oSDK.getMonetizationNetwork, revenue.registerClient().getCurrencyIso4217Code);
                    AFh1wSDK afErrorLogForExcManagerOnly = revenue.afErrorLogForExcManagerOnly();
                    if (afErrorLogForExcManagerOnly != null && (intent = aFh1oSDK.getMonetizationNetwork) != null) {
                        afErrorLogForExcManagerOnly.u_(intent, AFa1tSDK.this.getRevenue().i());
                    }
                }
                AFa1tSDK aFa1tSDK = AFa1tSDK.this;
                aFh1mSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
                aFa1tSDK.getMonetizationNetwork(aFh1mSDK, aFh1oSDK);
            }
        });
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(z), context}, -62521364, 62521374, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        int i = AFLogger + 97;
        registerClient = i % 128;
        if (i % 2 != 0) {
            getRevenue().i().getRevenue = deepLinkListener;
            getRevenue().i().component3 = j;
        } else {
            getRevenue().i().getRevenue = deepLinkListener;
            getRevenue().i().component3 = j;
            int i2 = 71 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = registerClient + 39;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            getRevenue().copy().getMediationNetwork("unregisterConversionListener", new String[1]);
        } else {
            getRevenue().copy().getMediationNetwork("unregisterConversionListener", new String[0]);
        }
        this.getCurrencyIso4217Code = null;
        registerClient = (AFLogger + 3) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getMonetizationNetwork(context);
        AFf1bSDK aFf1bSDK = new AFf1bSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFg1xSDK monetizationNetwork = aFf1bSDK.getMonetizationNetwork();
        if (monetizationNetwork == null || !str.equals(monetizationNetwork.AFAdRevenueData)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = monetizationNetwork == null || currentTimeMillis - monetizationNetwork.getMonetizationNetwork > 2000;
            AFg1xSDK aFg1xSDK = new AFg1xSDK(str, currentTimeMillis, !z);
            aFf1bSDK.getCurrencyIso4217Code.getMediationNetwork("afUninstallToken", aFg1xSDK.AFAdRevenueData);
            aFf1bSDK.getCurrencyIso4217Code.getRevenue("afUninstallToken_received_time", aFg1xSDK.getMonetizationNetwork);
            aFf1bSDK.getCurrencyIso4217Code.getRevenue("afUninstallToken_queued", aFg1xSDK.getMediationNetwork);
            if (z) {
                AFd1zSDK revenue = getMediationNetwork().getRevenue();
                AFf1sSDK aFf1sSDK = new AFf1sSDK(str, revenue);
                AFe1qSDK equals = revenue.equals();
                equals.getMonetizationNetwork.execute(equals.new AnonymousClass1(aFf1sSDK));
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        String obj;
        AFLogger = (registerClient + 7) % 128;
        AFd1lSDK copy = getRevenue().copy();
        if (map == null) {
            obj = "";
        } else {
            obj = map.toString();
            registerClient = (AFLogger + 37) % 128;
        }
        copy.getMediationNetwork("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, obj);
        if (!getRevenue().AFInAppEventParameterName().getRevenue()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PURCHASE_VALIDATION;
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str5);
            aFLogger.i(aFg1cSDK, sb.toString());
            AFLogger = (registerClient + 115) % 128;
        }
        if (str != null && str4 != null && str2 != null && str5 != null) {
            registerClient = (AFLogger + 43) % 128;
            if (str3 != null) {
                new Thread(new com.appsflyer.internal.AFa1ySDK(context.getApplicationContext(), getRevenue().AFInAppEventParameterName().getMonetizationNetwork(), str, str2, str3, str4, str5, map)).start();
                return;
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getMediationNetwork;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            int i = AFLogger + 99;
            registerClient = i % 128;
            if (i % 2 != 0) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
            } else {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                int i2 = 71 / 0;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(z)}, -680096747, 680096764, System.identityHashCode(this));
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    public class AFa1ySDK implements AFe1tSDK {
        public AFa1ySDK() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit getCurrencyIso4217Code() {
            AFa1tSDK.this.getRevenue(new AFh1pSDK());
            return Unit.a;
        }

        private boolean getMonetizationNetwork() {
            return AFa1tSDK.this.getCurrencyIso4217Code != null;
        }

        @Override // com.appsflyer.internal.AFe1tSDK
        public final void getMediationNetwork(AFe1uSDK<?> aFe1uSDK, AFe1rSDK aFe1rSDK) {
            JSONObject AFAdRevenueData;
            AFg1xSDK monetizationNetwork;
            if (!(aFe1uSDK instanceof AFf1rSDK)) {
                if (!(aFe1uSDK instanceof AFg1nSDK) || aFe1rSDK == AFe1rSDK.SUCCESS) {
                    return;
                }
                AFg1qSDK aFg1qSDK = new AFg1qSDK(AFa1tSDK.this.getRevenue());
                AFe1qSDK equals = AFa1tSDK.this.getRevenue().equals();
                equals.getMonetizationNetwork.execute(equals.new AnonymousClass1(aFg1qSDK));
                return;
            }
            AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1uSDK;
            boolean z = aFe1uSDK instanceof AFf1tSDK;
            if (z && getMonetizationNetwork()) {
                AFf1tSDK aFf1tSDK = (AFf1tSDK) aFe1uSDK;
                if (aFf1tSDK.AFAdRevenueData == AFe1rSDK.SUCCESS || aFf1tSDK.getCurrencyIso4217Code == 1) {
                    AFg1nSDK aFg1nSDK = new AFg1nSDK(aFf1tSDK, AFa1tSDK.this.getRevenue().getMediationNetwork());
                    AFe1qSDK equals2 = AFa1tSDK.this.getRevenue().equals();
                    equals2.getMonetizationNetwork.execute(equals2.new AnonymousClass1(aFg1nSDK));
                }
            }
            AFh1wSDK afErrorLogForExcManagerOnly = AFa1tSDK.this.getRevenue().afErrorLogForExcManagerOnly();
            int i = 0;
            if (afErrorLogForExcManagerOnly != null && z) {
                afErrorLogForExcManagerOnly.getCurrencyIso4217Code((AFf1tSDK) aFe1uSDK, new d(i, this));
            }
            if (aFe1rSDK == AFe1rSDK.SUCCESS) {
                AFa1tSDK aFa1tSDK = AFa1tSDK.this;
                aFa1tSDK.getMediationNetwork(aFa1tSDK.component3).getMediationNetwork("sentSuccessfully", "true");
                if (!(aFe1uSDK instanceof AFf1sSDK) && (monetizationNetwork = new AFf1bSDK(AFa1tSDK.this.component3).getMonetizationNetwork()) != null && monetizationNetwork.getMediationNetwork) {
                    String str = monetizationNetwork.AFAdRevenueData;
                    AFLogger.INSTANCE.d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFd1zSDK revenue = AFa1tSDK.getMediationNetwork().getRevenue();
                    AFf1sSDK aFf1sSDK = new AFf1sSDK(str, revenue);
                    AFe1qSDK equals3 = revenue.equals();
                    equals3.getMonetizationNetwork.execute(equals3.new AnonymousClass1(aFf1sSDK));
                }
                ResponseNetwork responseNetwork = ((AFe1bSDK) aFf1rSDK).component4;
                if (responseNetwork != null && (AFAdRevenueData = AFa1qSDK.AFAdRevenueData((String) responseNetwork.getBody())) != null) {
                    AFa1tSDK.this.component1 = AFAdRevenueData.optBoolean("send_background", false);
                }
                if (z) {
                    AFa1tSDK.this.getRevenue = System.currentTimeMillis();
                }
            }
        }

        @Override // com.appsflyer.internal.AFe1tSDK
        public final void getMonetizationNetwork(AFe1uSDK<?> aFe1uSDK) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copy() {
        getRevenue(new AFh1pSDK());
        int i = AFLogger + 67;
        registerClient = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        registerClient = (AFLogger + 7) % 128;
        String monetizationNetwork = aFa1tSDK.getRevenue().AFInAppEventType().getMonetizationNetwork();
        int i = registerClient + 93;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
        return monetizationNetwork;
    }

    private static void copydefault() {
        getMonetizationNetwork(new Object[0], -1617966880, 1617966902, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i = AFLogger + 107;
        registerClient = i % 128;
        if (i % 2 != 0) {
            subscribeForDeepLink(deepLinkListener, 3000L);
            int i2 = AFLogger + 31;
            registerClient = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        subscribeForDeepLink(deepLinkListener, 3000L);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() {
        getMonetizationNetwork(new Object[]{this}, -1455645768, 1455645787, System.identityHashCode(this));
    }

    private void areAllFieldsValid() {
        AFLogger = (registerClient + 117) % 128;
        try {
            final AFi1nSDK v = getRevenue().v();
            if (v == null) {
                return;
            }
            if (v.AFAdRevenueData()) {
                v.getMediationNetwork(new AFi1iSDK() { // from class: com.appsflyer.internal.b
                    @Override // com.appsflyer.internal.AFi1iSDK
                    public final void onRequestFinished() {
                        AFa1tSDK.this.getMonetizationNetwork(v);
                    }
                });
                return;
            }
            if (!v.getMediationNetwork()) {
                getRevenue(v);
            }
            int i = registerClient + 15;
            AFLogger = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th)));
        }
    }

    public static void component4() {
        AFInAppEventParameterName = 8065615358880487326L;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        AFLogger = (registerClient + 101) % 128;
        getRevenue().copy().getMediationNetwork("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        registerClient = (AFLogger + 95) % 128;
    }

    public final void component3() {
        AFLogger = (registerClient + 15) % 128;
        if (AFe1fSDK.areAllFieldsValid()) {
            int i = AFLogger + 89;
            registerClient = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            return;
        }
        AFd1zSDK revenue = getRevenue();
        AFe1qSDK equals = revenue.equals();
        equals.getMonetizationNetwork.execute(equals.new AnonymousClass1(new AFe1fSDK(revenue)));
    }

    public static AFa1tSDK getMediationNetwork() {
        int i = AFLogger + 115;
        registerClient = i % 128;
        if (i % 2 != 0) {
            return areAllFieldsValid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork(AFd1zSDK aFd1zSDK) {
        registerClient = (AFLogger + 31) % 128;
        aFd1zSDK.AFKeystoreWrapper().getMonetizationNetwork();
        registerClient = (AFLogger + 95) % 128;
    }

    private static void getMediationNetwork(String str, String str2) {
        int i = registerClient + 59;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
            throw null;
        }
    }

    private void getMediationNetwork(Context context, String str, Map<String, Object> map) {
        AFh1lSDK aFh1lSDK = new AFh1lSDK();
        aFh1lSDK.areAllFieldsValid = str;
        aFh1lSDK.getMediationNetwork = map;
        getMonetizationNetwork(aFh1lSDK, (AFh1oSDK) getMonetizationNetwork(new Object[]{this, context}, -536448515, 536448536, System.identityHashCode(this)));
        int i = registerClient + 115;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFh1sSDK aFh1sSDK) {
        registerClient = (AFLogger + 79) % 128;
        getRevenue(aFh1sSDK);
        registerClient = (AFLogger + 111) % 128;
    }

    private void getMediationNetwork(Map<String, Object> map) {
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) && !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) && map.get("advertiserId") != null) {
            registerClient = (AFLogger + 117) % 128;
            try {
                if (AFk1zSDK.getMediationNetwork(getRevenue().e().getCurrencyIso4217Code) && map.remove("android_id") != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                AFf1kSDK AFInAppEventParameterName2 = getRevenue().AFInAppEventParameterName();
                if (!AFk1zSDK.getMediationNetwork((String) AFf1kSDK.getMonetizationNetwork(new Object[]{AFInAppEventParameterName2}, -211782084, 211782085, System.identityHashCode(AFInAppEventParameterName2))) || map.remove("imei") == null) {
                    return;
                }
                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                return;
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
        int i = AFLogger + 119;
        registerClient = i % 128;
        if (i % 2 == 0) {
            int i2 = 73 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        getMonetizationNetwork(new Object[]{this, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback}, -1225547846, 1225547850, System.identityHashCode(this));
    }

    private static void getMediationNetwork(String str) {
        try {
            if (new JSONObject(str).has("pid")) {
                registerClient = (AFLogger + 113) % 128;
                getMediationNetwork("preInstallName", str);
            } else {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                registerClient = (AFLogger + 15) % 128;
            }
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFa1tSDK mediationNetwork;
        SharedPreferences sharedPreferences;
        Context context = (Context) objArr[0];
        if (getMediationNetwork().equals == null) {
            int i = registerClient + 95;
            AFLogger = i % 128;
            StrictMode.ThreadPolicy threadPolicy = i % 2;
            try {
                if (threadPolicy != 0) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    mediationNetwork = getMediationNetwork();
                    sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    threadPolicy = allowThreadDiskReads;
                } else {
                    StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                    mediationNetwork = getMediationNetwork();
                    sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    threadPolicy = allowThreadDiskReads2;
                }
                mediationNetwork.equals = sharedPreferences;
                registerClient = (AFLogger + 59) % 128;
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        return getMediationNetwork().equals;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        AFLogger = (registerClient + 57) % 128;
        logEvent(context, str, map, null);
        registerClient = (AFLogger + 103) % 128;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String str = (String) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        AFLogger = (registerClient + 19) % 128;
        AppsFlyerProperties.getInstance().set(str, booleanValue);
        int i = registerClient + 5;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final AFc1jSDK getMediationNetwork(Context context) {
        int i = AFLogger + 119;
        registerClient = i % 128;
        if (i % 2 != 0) {
            getMonetizationNetwork(context);
            AFc1jSDK mediationNetwork = getRevenue().getMediationNetwork();
            registerClient = (AFLogger + 7) % 128;
            return mediationNetwork;
        }
        getMonetizationNetwork(context);
        getRevenue().getMediationNetwork();
        throw null;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        boolean z = false;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        AFLogger.LogLevel logLevel = (AFLogger.LogLevel) objArr[1];
        AFLogger = (registerClient + 95) % 128;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            AFLogger = (registerClient + 117) % 128;
            z = true;
        }
        aFa1tSDK.getRevenue().copy().getMediationNetwork("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (!z) {
            int i = AFLogger + 121;
            registerClient = i % 128;
            if (i % 2 != 0) {
                aFa1tSDK.getRevenue().afDebugLog().AFAdRevenueData();
                return null;
            }
            aFa1tSDK.getRevenue().afDebugLog().AFAdRevenueData();
            throw null;
        }
        aFa1tSDK.getRevenue().afDebugLog().areAllFieldsValid();
        return null;
    }

    public final boolean getCurrencyIso4217Code() {
        int i = AFLogger + 53;
        registerClient = i % 128;
        if (i % 2 == 0) {
            getRevenue(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID);
            throw null;
        }
        if (getRevenue(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) && AFAdRevenueData() == null) {
            AFLogger = (registerClient + 121) % 128;
            return true;
        }
        int i2 = AFLogger + 53;
        registerClient = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
        }
        return false;
    }

    public static String AFAdRevenueData() {
        registerClient = (AFLogger + 61) % 128;
        String str = (String) getMonetizationNetwork(new Object[]{AppsFlyerProperties.APP_USER_ID}, -1072478610, 1072478634, (int) System.currentTimeMillis());
        int i = registerClient + 35;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            int i2 = 59 / 0;
        }
        return str;
    }

    private void getCurrencyIso4217Code(Context context, AFh1xSDK aFh1xSDK) {
        getMonetizationNetwork(context);
        AFh1uSDK component2 = getRevenue().component2();
        AFh1zSDK AFAdRevenueData2 = AFh1zSDK.AFAdRevenueData(context);
        if (component2.getMediationNetwork()) {
            AFLogger = (registerClient + 29) % 128;
            component2.getCurrencyIso4217Code.put("api_name", aFh1xSDK.toString());
            component2.getRevenue(AFAdRevenueData2);
            AFLogger = (registerClient + 81) % 128;
        }
        component2.getMonetizationNetwork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFf1nSDK aFf1nSDK) {
        AFLogger = (registerClient + 113) % 128;
        AFd1zSDK revenue = getRevenue();
        if (aFf1nSDK == AFf1nSDK.SUCCESS) {
            revenue.afLogForce().getRevenue();
            registerClient = (AFLogger + 105) % 128;
        }
        if (!revenue.copy().getRevenue()) {
            revenue.afDebugLog().getMonetizationNetwork();
        } else {
            revenue.afDebugLog().getMediationNetwork();
        }
    }

    public static int getMediationNetwork(AFc1jSDK aFc1jSDK, boolean z) {
        int i = AFLogger + 17;
        registerClient = i % 128;
        int i2 = i % 2;
        Object[] objArr = {aFc1jSDK, "appsFlyerCount", Boolean.valueOf(z)};
        int currentTimeMillis = (int) System.currentTimeMillis();
        if (i2 == 0) {
            ((Integer) getMonetizationNetwork(objArr, -1820164421, 1820164423, currentTimeMillis)).intValue();
            throw null;
        }
        int intValue = ((Integer) getMonetizationNetwork(objArr, -1820164421, 1820164423, currentTimeMillis)).intValue();
        AFLogger = (registerClient + 71) % 128;
        return intValue;
    }

    private static void component2(Context context) {
        getMonetizationNetwork(new Object[]{context}, 847967095, -847967080, (int) System.currentTimeMillis());
    }

    private static String AFAdRevenueData(Activity activity) {
        Intent intent;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("af");
                    if (string != null) {
                        int i = AFLogger + 115;
                        registerClient = i % 128;
                        try {
                            if (i % 2 != 0) {
                                AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                                extras.remove("af");
                                activity.setIntent(intent.putExtras(extras));
                            } else {
                                AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                                extras.remove("af");
                                activity.setIntent(intent.putExtras(extras));
                                throw null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            str = string;
                            AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
                            return str;
                        }
                    }
                    str = string;
                }
                AFLogger = (registerClient + 47) % 128;
                return str;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return str;
    }

    private static void getCurrencyIso4217Code(AFh1sSDK aFh1sSDK, AFh1oSDK aFh1oSDK) {
        int i = registerClient;
        AFLogger = (i + 85) % 128;
        if (aFh1oSDK != null) {
            AFLogger = (i + 99) % 128;
            aFh1sSDK.getMonetizationNetwork = aFh1oSDK.getCurrencyIso4217Code;
            aFh1sSDK.equals = aFh1oSDK.AFAdRevenueData;
            AFLogger = (i + 33) % 128;
        }
    }

    public static String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        int i = AFLogger + 9;
        registerClient = i % 128;
        if (i % 2 != 0) {
            return format;
        }
        throw null;
    }

    private void getCurrencyIso4217Code(Context context, String str) {
        AFh1mSDK aFh1mSDK = new AFh1mSDK();
        getMonetizationNetwork(context);
        aFh1mSDK.areAllFieldsValid = null;
        aFh1mSDK.getMediationNetwork = null;
        aFh1mSDK.component2 = str;
        aFh1mSDK.getMonetizationNetwork = null;
        getCurrencyIso4217Code(aFh1mSDK);
        registerClient = (AFLogger + 91) % 128;
    }

    private String AFAdRevenueData(Context context, String str) {
        if (context == null) {
            int i = AFLogger + 87;
            registerClient = i % 128;
            if (i % 2 == 0) {
                int i2 = 65 / 0;
            }
            return null;
        }
        getMonetizationNetwork(context);
        String monetizationNetwork = getRevenue().AFAdRevenueData().getMonetizationNetwork(str);
        int i3 = registerClient + 111;
        AFLogger = i3 % 128;
        if (i3 % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private void getCurrencyIso4217Code(AFh1sSDK aFh1sSDK) {
        boolean z;
        int i = registerClient + 95;
        int i2 = i % 128;
        AFLogger = i2;
        if (i % 2 == 0) {
            if (aFh1sSDK.areAllFieldsValid == null) {
                registerClient = (i2 + 35) % 128;
                z = true;
            } else {
                z = false;
            }
            if (getCurrencyIso4217Code()) {
                AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                return;
            }
            if (z) {
                if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                    if (component2()) {
                        AppsFlyerRequestListener appsFlyerRequestListener = aFh1sSDK.getCurrencyIso4217Code;
                        if (appsFlyerRequestListener != null) {
                            registerClient = (AFLogger + 25) % 128;
                            appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                            return;
                        }
                        return;
                    }
                } else {
                    AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                    registerClient = (AFLogger + 77) % 128;
                }
                this.component4 = System.currentTimeMillis();
            }
            getRevenue(aFh1sSDK);
            return;
        }
        String str = aFh1sSDK.areAllFieldsValid;
        throw null;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFc1jSDK aFc1jSDK = (AFc1jSDK) objArr[0];
        String str = (String) objArr[1];
        int i = registerClient + 5;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            String revenue = aFc1jSDK.getRevenue("CACHED_CHANNEL", (String) null);
            if (revenue != null) {
                return revenue;
            }
            aFc1jSDK.getMediationNetwork("CACHED_CHANNEL", str);
            AFLogger = (registerClient + 41) % 128;
            return str;
        }
        aFc1jSDK.getRevenue("CACHED_CHANNEL", (String) null);
        throw null;
    }

    private static int AFAdRevenueData(AFc1jSDK aFc1jSDK, boolean z) {
        registerClient = (AFLogger + 49) % 128;
        int intValue = ((Integer) getMonetizationNetwork(new Object[]{aFc1jSDK, "appsFlyerInAppEventCount", Boolean.valueOf(z)}, -1820164421, 1820164423, (int) System.currentTimeMillis())).intValue();
        int i = AFLogger + 19;
        registerClient = i % 128;
        if (i % 2 == 0) {
            int i2 = 63 / 0;
        }
        return intValue;
    }

    private static void AFAdRevenueData(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.SDK_LIFECYCLE;
        StringBuilder sb = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb.append(str);
        sb.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFg1cSDK, sb.toString());
        int i = registerClient + 87;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static int AFAdRevenueData(AFc1jSDK aFc1jSDK, String str, boolean z) {
        return ((Integer) getMonetizationNetwork(new Object[]{aFc1jSDK, str, Boolean.valueOf(z)}, -1820164421, 1820164423, (int) System.currentTimeMillis())).intValue();
    }

    private static void AFAdRevenueData(String str, boolean z) {
        getMonetizationNetwork(new Object[]{str, Boolean.valueOf(z)}, 1660171217, -1660171210, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(boolean z) {
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(z)}, -1121211786, 1121211791, System.identityHashCode(this));
    }

    public static String getCurrencyIso4217Code(AFc1jSDK aFc1jSDK, String str) {
        return (String) getMonetizationNetwork(new Object[]{aFc1jSDK, str}, -195097357, 195097363, (int) System.currentTimeMillis());
    }

    private AFh1oSDK getCurrencyIso4217Code(Context context) {
        return (AFh1oSDK) getMonetizationNetwork(new Object[]{this, context}, -536448515, 536448536, System.identityHashCode(this));
    }

    private static String getCurrencyIso4217Code(String str) {
        return (String) getMonetizationNetwork(new Object[]{str}, -1072478610, 1072478634, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        getMonetizationNetwork(new Object[]{this, context, str}, -1960394132, 1960394155, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        getMonetizationNetwork(new Object[]{this, context}, 614179736, -614179718, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        AFLogger = (registerClient + 11) % 128;
        if (booleanValue) {
            aFa1tSDK.getRevenue().afDebugLog().getCurrencyIso4217Code();
            int i = AFLogger + 27;
            registerClient = i % 128;
            if (i % 2 == 0) {
                int i2 = 52 / 0;
            }
            return null;
        }
        aFa1tSDK.getRevenue().afDebugLog().getRevenue();
        return null;
    }

    private void getRevenue(AFi1nSDK aFi1nSDK) {
        AFe1cSDK aFe1cSDK = new AFe1cSDK(aFi1nSDK, getRevenue().AFAdRevenueData(), getRevenue(), getRevenue().areAllFieldsValid(), getRevenue().registerClient());
        AFe1qSDK equals = getRevenue().equals();
        equals.getMonetizationNetwork.execute(equals.new AnonymousClass1(aFe1cSDK));
        int i = registerClient + 105;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final AFd1zSDK getRevenue() {
        int i = (registerClient + 47) % 128;
        AFLogger = i;
        AFc1cSDK aFc1cSDK = this.copydefault;
        int i2 = i + 97;
        registerClient = i2 % 128;
        if (i2 % 2 != 0) {
            return aFc1cSDK;
        }
        throw null;
    }

    public static boolean getRevenue(Context context) {
        registerClient = (AFLogger + 95) % 128;
        try {
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        if (c50.d.b(context, d50.a) == 0) {
            return true;
        }
        registerClient = (AFLogger + 113) % 128;
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    private static boolean getRevenue(String str) {
        return ((Boolean) getMonetizationNetwork(new Object[]{str}, -970221310, 970221322, (int) System.currentTimeMillis())).booleanValue();
    }

    public final void getMonetizationNetwork(Context context) {
        int i = AFLogger;
        registerClient = (i + 19) % 128;
        AFc1cSDK aFc1cSDK = this.copydefault;
        if (context != null) {
            AFc1fSDK aFc1fSDK = aFc1cSDK.AFAdRevenueData;
            if (context != null) {
                registerClient = (i + 57) % 128;
                aFc1fSDK.getCurrencyIso4217Code = context.getApplicationContext();
                registerClient = (AFLogger + 29) % 128;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        r3.copy = new com.appsflyer.internal.a(r3);
        com.appsflyer.internal.AFa1tSDK.registerClient = (r0 + 45) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001a, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r2 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized AFf1uSDK getMonetizationNetwork() {
        try {
            int i = AFLogger;
            int i2 = i + 13;
            registerClient = i2 % 128;
            int i3 = i2 % 2;
            AFf1uSDK aFf1uSDK = this.copy;
            if (i3 == 0) {
                int i4 = 43 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.copy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(AFi1nSDK aFi1nSDK) {
        int i = AFLogger + 17;
        registerClient = i % 128;
        int i2 = i % 2;
        getRevenue(aFi1nSDK);
        if (i2 == 0) {
            int i3 = 12 / 0;
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        String str = (String) objArr[1];
        registerClient = (AFLogger + 123) % 128;
        aFa1tSDK.getRevenue().copy().getMediationNetwork("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i = registerClient + 17;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            int i2 = 93 / 0;
        }
        return null;
    }

    public final void getMonetizationNetwork(AFh1sSDK aFh1sSDK, AFh1oSDK aFh1oSDK) {
        getCurrencyIso4217Code(aFh1sSDK, aFh1oSDK);
        if (getRevenue().AFInAppEventParameterName().getMonetizationNetwork() == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFh1sSDK.getCurrencyIso4217Code;
            if (appsFlyerRequestListener != null) {
                registerClient = (AFLogger + 31) % 128;
                appsFlyerRequestListener.onError(41, "No dev key");
                AFLogger = (registerClient + 25) % 128;
                return;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(getRevenue().getMediationNetwork());
        if (referrer == null) {
            AFLogger = (registerClient + 17) % 128;
            referrer = "";
        }
        aFh1sSDK.component2 = referrer;
        getCurrencyIso4217Code(aFh1sSDK);
    }

    private void getMonetizationNetwork(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = (registerClient + 31) % 128;
        AFLogger = i;
        if (appsFlyerConversionListener != null) {
            this.getCurrencyIso4217Code = appsFlyerConversionListener;
            return;
        }
        int i2 = i + 69;
        registerClient = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Deprecated
    public static Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        AFLogger = (registerClient + 67) % 128;
        if (map.containsKey("meta")) {
            int i = AFLogger + 73;
            registerClient = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            return (Map) map.get("meta");
        }
        HashMap hashMap = new HashMap();
        map.put("meta", hashMap);
        return hashMap;
    }

    private void getMonetizationNetwork(String str) {
        getMonetizationNetwork(new Object[]{this, str}, -1378401160, 1378401168, System.identityHashCode(this));
    }
}
