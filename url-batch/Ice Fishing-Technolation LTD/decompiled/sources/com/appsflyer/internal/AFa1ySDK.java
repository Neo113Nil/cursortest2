package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatDelegate;
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
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1ySDK;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFe1oSDK.AnonymousClass1;
import com.appsflyer.internal.AFj1tSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
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
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1ySDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean AFInAppEventParameterName = false;
    private static boolean AFInAppEventType = false;
    private static int AFKeystoreWrapper = 0;
    private static char[] AFLogger = null;
    private static AFa1ySDK areAllFieldsValid = null;
    static AppsFlyerInAppPurchaseValidatorListener getCurrencyIso4217Code = null;
    public static final String getMediationNetwork;
    public static final String getMonetizationNetwork;
    private static int i = 1;
    private static int registerClient;
    Application component2;
    private Map<Long, String> copydefault;
    private AFf1mSDK equals;
    private boolean hashCode;
    private volatile SharedPreferences toString;
    public volatile AppsFlyerConversionListener getRevenue = null;
    private long component3 = -1;
    long AFAdRevenueData = -1;
    private long component4 = TimeUnit.SECONDS.toMillis(5);
    boolean component1 = false;
    private final AFc1bSDK copy = new AFc1bSDK();

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i2, int i3, int i4) {
        String concat;
        int i5 = (i2 * (-755)) + (i3 * (-755));
        int i6 = ~((~i2) | (~i3));
        int i7 = i2 | i3;
        boolean z = true;
        switch (i5 + (i6 * 1512) + (((~(i7 | i4)) | i6) * (-756)) + ((i7 | (~i4)) * 756)) {
            case 1:
                AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
                String str = (String) objArr[1];
                Map map = (Map) objArr[2];
                int i8 = 2 % 2;
                int i9 = AFKeystoreWrapper + 117;
                i = i9 % 128;
                int i10 = i9 % 2;
                AFc1eSDK force = aFa1ySDK.getMonetizationNetwork().force();
                if (force.AFAdRevenueData == null) {
                    force.AFAdRevenueData = new AFb1rSDK();
                }
                AFb1rSDK aFb1rSDK = force.AFAdRevenueData;
                if (str == null || str.isEmpty()) {
                    AFLogger.afWarnLog("Partner ID is missing or `null`");
                    return null;
                }
                if (map == null || map.isEmpty()) {
                    if (aFb1rSDK.getCurrencyIso4217Code.remove(str) == null) {
                        int i11 = i + 39;
                        AFKeystoreWrapper = i11 % 128;
                        int i12 = i11 % 2;
                        concat = "Partner data is missing or `null`";
                    } else {
                        concat = "Cleared partner data for ".concat(String.valueOf(str));
                    }
                    AFLogger.afWarnLog(concat);
                    return null;
                }
                AFLogger.afDebugLog(new StringBuilder("Setting partner data for ").append(str).append(": ").append(map).toString());
                int length = new JSONObject(map).toString().length();
                if (length <= 1000) {
                    aFb1rSDK.getCurrencyIso4217Code.put(str, map);
                    aFb1rSDK.getMonetizationNetwork.remove(str);
                    return null;
                }
                AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                HashMap hashMap = new HashMap();
                hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                aFb1rSDK.getMonetizationNetwork.put(str, hashMap);
                return null;
            case 2:
                return getMonetizationNetwork(objArr);
            case 3:
                AFa1ySDK aFa1ySDK2 = (AFa1ySDK) objArr[0];
                String[] strArr = (String[]) objArr[1];
                int i13 = 2 % 2;
                int i14 = AFKeystoreWrapper + 19;
                i = i14 % 128;
                int i15 = i14 % 2;
                aFa1ySDK2.setSharingFilterForPartners(strArr);
                int i16 = AFKeystoreWrapper + 21;
                i = i16 % 128;
                int i17 = i16 % 2;
                return null;
            case 4:
                return getCurrencyIso4217Code(objArr);
            case 5:
                AFa1ySDK aFa1ySDK3 = (AFa1ySDK) objArr[0];
                Context context = (Context) objArr[1];
                String str2 = (String) objArr[2];
                int i18 = 2 % 2;
                int i19 = AFKeystoreWrapper + 77;
                i = i19 % 128;
                int i20 = i19 % 2;
                aFa1ySDK3.start(context, str2, null);
                int i21 = i + 65;
                AFKeystoreWrapper = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 6:
                return getRevenue(objArr);
            case 7:
                return AFAdRevenueData(objArr);
            case 8:
                AFa1ySDK aFa1ySDK4 = (AFa1ySDK) objArr[0];
                String str3 = (String) objArr[1];
                int i23 = 2 % 2;
                int i24 = i + 91;
                AFKeystoreWrapper = i24 % 128;
                if (i24 % 2 != 0) {
                    AFd1oSDK copy = aFa1ySDK4.getMonetizationNetwork().copy();
                    String[] strArr2 = new String[0];
                    strArr2[1] = str3;
                    copy.getRevenue("setCurrencyCode", strArr2);
                } else {
                    aFa1ySDK4.getMonetizationNetwork().copy().getRevenue("setCurrencyCode", str3);
                }
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str3);
                return null;
            case 9:
                AFa1ySDK aFa1ySDK5 = (AFa1ySDK) objArr[0];
                AFi1hSDK aFi1hSDK = (AFi1hSDK) objArr[1];
                int i25 = 2 % 2;
                AFe1aSDK aFe1aSDK = new AFe1aSDK(aFi1hSDK, aFa1ySDK5.getMonetizationNetwork().AFAdRevenueData(), aFa1ySDK5.getMonetizationNetwork(), aFa1ySDK5.getMonetizationNetwork().component3(), aFa1ySDK5.getMonetizationNetwork().AFInAppEventParameterName());
                AFe1oSDK copydefault = aFa1ySDK5.getMonetizationNetwork().copydefault();
                copydefault.getCurrencyIso4217Code.execute(copydefault.new AnonymousClass1(aFe1aSDK));
                int i26 = AFKeystoreWrapper + 77;
                i = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 10:
                return areAllFieldsValid(objArr);
            case 11:
                return component3(objArr);
            case 12:
                AFa1ySDK aFa1ySDK6 = (AFa1ySDK) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                int i28 = 2 % 2;
                aFa1ySDK6.AFAdRevenueData((Context) objArr[2]);
                final AFd1zSDK monetizationNetwork = aFa1ySDK6.getMonetizationNetwork();
                monetizationNetwork.AFInAppEventType().getMonetizationNetwork(booleanValue);
                monetizationNetwork.getMonetizationNetwork().submit(new Runnable() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFa1ySDK.getMediationNetwork(AFd1zSDK.this);
                    }
                });
                if (!booleanValue) {
                    return null;
                }
                int i29 = i + 81;
                AFKeystoreWrapper = i29 % 128;
                int i30 = i29 % 2;
                monetizationNetwork.component4().AFAdRevenueData("is_stop_tracking_used", true);
                int i31 = AFKeystoreWrapper + 73;
                i = i31 % 128;
                int i32 = i31 % 2;
                return null;
            case 13:
                return component1(objArr);
            case 14:
                AFd1zSDK aFd1zSDK = (AFd1zSDK) objArr[0];
                int i33 = 2 % 2;
                int i34 = i + 79;
                AFKeystoreWrapper = i34 % 128;
                int i35 = i34 % 2;
                aFd1zSDK.registerClient().getRevenue();
                int i36 = AFKeystoreWrapper + 121;
                i = i36 % 128;
                int i37 = i36 % 2;
                return null;
            case 15:
                return component4(objArr);
            case 16:
                return component2(objArr);
            case 17:
                AFa1ySDK aFa1ySDK7 = (AFa1ySDK) objArr[0];
                Context context2 = (Context) objArr[1];
                int i38 = 2 % 2;
                int i39 = AFKeystoreWrapper;
                int i40 = i39 + 69;
                i = i40 % 128;
                int i41 = i40 % 2;
                if (context2 instanceof Activity) {
                    return new AFh1qSDK((Activity) context2, aFa1ySDK7.getMonetizationNetwork().w());
                }
                int i42 = i39 + 105;
                i = i42 % 128;
                int i43 = i42 % 2;
                return null;
            case 18:
                AFa1ySDK aFa1ySDK8 = (AFa1ySDK) objArr[0];
                Context context3 = (Context) objArr[1];
                String str4 = (String) objArr[2];
                aFa1ySDK8.AFAdRevenueData(context3);
                AFg1sSDK aFg1sSDK = new AFg1sSDK(context3);
                if (str4 == null || str4.trim().isEmpty()) {
                    AFLogger.INSTANCE.w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
                    return null;
                }
                AFLogger.INSTANCE.i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(String.valueOf(str4)));
                AFf1aSDK revenue = aFg1sSDK.getRevenue();
                if (revenue != null && str4.equals(revenue.getRevenue)) {
                    return null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (revenue != null && currentTimeMillis - revenue.getMonetizationNetwork <= TimeUnit.SECONDS.toMillis(2L)) {
                    z = false;
                }
                AFf1aSDK aFf1aSDK = new AFf1aSDK(str4, currentTimeMillis, !z);
                aFg1sSDK.getCurrencyIso4217Code.getRevenue("afUninstallToken", aFf1aSDK.getRevenue);
                aFg1sSDK.getCurrencyIso4217Code.AFAdRevenueData("afUninstallToken_received_time", aFf1aSDK.getMonetizationNetwork);
                aFg1sSDK.getCurrencyIso4217Code.AFAdRevenueData("afUninstallToken_queued", aFf1aSDK.getMediationNetwork);
                if (!z) {
                    return null;
                }
                AFd1zSDK monetizationNetwork2 = getRevenue().getMonetizationNetwork();
                AFf1oSDK aFf1oSDK = new AFf1oSDK(str4, monetizationNetwork2);
                AFe1oSDK copydefault2 = monetizationNetwork2.copydefault();
                copydefault2.getCurrencyIso4217Code.execute(copydefault2.new AnonymousClass1(aFf1oSDK));
                return null;
            case 19:
                return copy(objArr);
            case 20:
                AFa1ySDK aFa1ySDK9 = (AFa1ySDK) objArr[0];
                Context context4 = (Context) objArr[1];
                int i44 = 2 % 2;
                AFj1gSDK aFj1gSDK = new AFj1gSDK((Intent) objArr[2]);
                if (aFj1gSDK.AFAdRevenueData("appsflyer_preinstall") != null) {
                    int i45 = i + 105;
                    AFKeystoreWrapper = i45 % 128;
                    int i46 = i45 % 2;
                    getRevenue(new Object[]{aFj1gSDK.AFAdRevenueData("appsflyer_preinstall")}, -374487647, 374487663, (int) System.currentTimeMillis());
                    int i47 = i + 29;
                    AFKeystoreWrapper = i47 % 128;
                    int i48 = i47 % 2;
                }
                AFLogger.afInfoLog("****** onReceive called *******");
                AppsFlyerProperties.getInstance();
                String AFAdRevenueData = aFj1gSDK.AFAdRevenueData("referrer");
                AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(AFAdRevenueData)));
                if (AFAdRevenueData == null) {
                    return null;
                }
                aFa1ySDK9.getMonetizationNetwork(context4).getRevenue("referrer", AFAdRevenueData);
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                appsFlyerProperties.set("AF_REFERRER", AFAdRevenueData);
                appsFlyerProperties.getRevenue = AFAdRevenueData;
                if (!AppsFlyerProperties.getInstance().getMediationNetwork()) {
                    return null;
                }
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                getRevenue(new Object[]{aFa1ySDK9, context4, AFh1tSDK.onReceive}, -268043806, 268043817, System.identityHashCode(aFa1ySDK9));
                aFa1ySDK9.AFAdRevenueData(AFAdRevenueData);
                return null;
            case 21:
                AFa1ySDK aFa1ySDK10 = (AFa1ySDK) objArr[0];
                int i49 = 2 % 2;
                int i50 = AFKeystoreWrapper + 9;
                i = i50 % 128;
                if (i50 % 2 == 0) {
                    aFa1ySDK10.setSharingFilterForPartners("all");
                    return null;
                }
                aFa1ySDK10.setSharingFilterForPartners("all");
                return null;
            case 22:
                return copydefault(objArr);
            case 23:
                return hashCode(objArr);
            case 24:
                return equals(objArr);
            default:
                return getMediationNetwork(objArr);
        }
    }

    static {
        component2();
        getMonetizationNetwork = "372";
        getMediationNetwork = "6.17.6".substring(0, "6.17.6".lastIndexOf("."));
        getCurrencyIso4217Code = null;
        areAllFieldsValid = new AFa1ySDK();
        int i2 = AFKeystoreWrapper + 87;
        i = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(String str, int[] iArr, String str2, int i2, Object[] objArr) {
        int i3 = 2 % 2;
        char[] cArr = str2;
        if (str2 != null) {
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            int i4 = $10 + 79;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 41 / 0;
                bArr = str.getBytes("ISO-8859-1");
            } else {
                bArr = str.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr3 = AFLogger;
        if (cArr3 != null) {
            int i6 = $10 + 29;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                cArr4[i8] = (char) (cArr3[i8] ^ 1825820251896122634L);
            }
            cArr3 = cArr4;
        }
        int i9 = (int) (1825820251896122634L ^ registerClient);
        if (AFInAppEventType) {
            aFk1oSDK.getMonetizationNetwork = bArr2.length;
            char[] cArr5 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            int i10 = $10 + 43;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr5[aFk1oSDK.AFAdRevenueData] = (char) (cArr3[bArr2[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] + i2] - i9);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (AFInAppEventParameterName) {
            aFk1oSDK.getMonetizationNetwork = cArr2.length;
            char[] cArr6 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr6[aFk1oSDK.AFAdRevenueData] = (char) (cArr3[cArr2[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i2] - i9);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        aFk1oSDK.getMonetizationNetwork = iArr.length;
        char[] cArr7 = new char[aFk1oSDK.getMonetizationNetwork];
        aFk1oSDK.AFAdRevenueData = 0;
        while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
            cArr7[aFk1oSDK.AFAdRevenueData] = (char) (cArr3[iArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i2] - i9);
            aFk1oSDK.AFAdRevenueData++;
        }
        objArr[0] = new String(cArr7);
    }

    public final AFd1zSDK getMonetizationNetwork() {
        int i2 = 2 % 2;
        int i3 = i + 91;
        int i4 = i3 % 128;
        AFKeystoreWrapper = i4;
        int i5 = i3 % 2;
        AFc1bSDK aFc1bSDK = this.copy;
        int i6 = i4 + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        i = i6 % 128;
        int i7 = i6 % 2;
        return aFc1bSDK;
    }

    public final void AFAdRevenueData(Context context) {
        int i2 = 2 % 2;
        int i3 = i + 27;
        int i4 = i3 % 128;
        AFKeystoreWrapper = i4;
        int i5 = i3 % 2;
        AFc1bSDK aFc1bSDK = this.copy;
        if (context != null) {
            int i6 = i4 + 101;
            i = i6 % 128;
            if (i6 % 2 != 0) {
                AFc1hSDK aFc1hSDK = aFc1bSDK.getCurrencyIso4217Code;
                if (context != null) {
                    aFc1hSDK.getMonetizationNetwork = context.getApplicationContext();
                    return;
                }
                return;
            }
            AFc1hSDK aFc1hSDK2 = aFc1bSDK.getCurrencyIso4217Code;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFf1pSDK aFf1pSDK) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 77;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            AFd1zSDK monetizationNetwork = getMonetizationNetwork();
            if (aFf1pSDK == AFf1pSDK.SUCCESS) {
                monetizationNetwork.afErrorLogForExcManagerOnly().getMonetizationNetwork();
            }
            if (monetizationNetwork.copy().AFAdRevenueData()) {
                monetizationNetwork.afInfoLog().getRevenue();
                return;
            }
            int i4 = AFKeystoreWrapper + 7;
            i = i4 % 128;
            int i5 = i4 % 2;
            monetizationNetwork.afInfoLog().getCurrencyIso4217Code();
            int i6 = i + 103;
            AFKeystoreWrapper = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 20 / 0;
                return;
            }
            return;
        }
        getMonetizationNetwork();
        AFf1pSDK aFf1pSDK2 = AFf1pSDK.SUCCESS;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r3.equals == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        r3.equals = new com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda7(r3);
        r1 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 81;
        com.appsflyer.internal.AFa1ySDK.i = r1 % 128;
        r1 = r1 % 2;
        r0 = 2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x001c, code lost:
    
        if (r3.equals == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized AFf1mSDK AFAdRevenueData() {
        int i2 = 2 % 2;
        int i3 = i + 11;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
        return this.equals;
    }

    public AFa1ySDK() {
        getMonetizationNetwork().afInfoLog().getRevenue();
        getMonetizationNetwork().afInfoLog().getMonetizationNetwork();
        AFe1oSDK copydefault = getMonetizationNetwork().copydefault();
        copydefault.getMediationNetwork.add(new AFa1zSDK());
    }

    public static AFa1ySDK getRevenue() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper;
        int i4 = i3 + 115;
        i = i4 % 128;
        int i5 = i4 % 2;
        AFa1ySDK aFa1ySDK = areAllFieldsValid;
        int i6 = i3 + 9;
        i = i6 % 128;
        if (i6 % 2 != 0) {
            return aFa1ySDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        int i2 = 2 % 2;
        if (uri != null) {
            int i3 = i + 5;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            if (!uri.toString().isEmpty()) {
                if (context == null) {
                    getMonetizationNetwork().i().getMediationNetwork(new StringBuilder("Context is \"").append(context).append("\"").toString(), DeepLinkResult.Error.NETWORK);
                    return;
                }
                AFAdRevenueData(context);
                getMonetizationNetwork().i().g_(AFa1jSDK.getMediationNetwork(getMonetizationNetwork().afVerboseLog()), Uri.parse(uri.toString()));
                int i5 = i + 73;
                AFKeystoreWrapper = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        getMonetizationNetwork().i().getMediationNetwork(new StringBuilder("Link is \"").append(uri).append("\"").toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        int i2 = 2 % 2;
        getMonetizationNetwork().force().getRevenue = new AFb1tSDK(strArr);
        int i3 = i + 39;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        int i2 = 2 % 2;
        int i3 = i + 63;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        AFAdRevenueData(context);
        PurchaseHandler component2 = getMonetizationNetwork().component2();
        if (component2.getRevenue(map, purchaseValidationCallback, "subscriptions")) {
            AFe1kSDK aFe1kSDK = new AFe1kSDK(map, purchaseValidationCallback, component2.AFAdRevenueData);
            AFe1oSDK aFe1oSDK = component2.getCurrencyIso4217Code;
            aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new AnonymousClass1(aFe1kSDK));
            int i5 = i + 43;
            AFKeystoreWrapper = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0036, code lost:
    
        if (r0.getRevenue(r5, r8, r1) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        PurchaseHandler purchaseHandler;
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        Context context = (Context) objArr[1];
        Map<String, Object> map = (Map) objArr[2];
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback = (PurchaseHandler.PurchaseValidationCallback) objArr[3];
        int i2 = 2 % 2;
        int i3 = i + 59;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            aFa1ySDK.AFAdRevenueData(context);
            purchaseHandler = aFa1ySDK.getMonetizationNetwork().component2();
            String[] strArr = new String[1];
            strArr[1] = "purchases";
        } else {
            aFa1ySDK.AFAdRevenueData(context);
            PurchaseHandler component2 = aFa1ySDK.getMonetizationNetwork().component2();
            if (component2.getRevenue(map, purchaseValidationCallback, "purchases")) {
                purchaseHandler = component2;
                AFe1cSDK aFe1cSDK = new AFe1cSDK(map, purchaseValidationCallback, purchaseHandler.AFAdRevenueData);
                AFe1oSDK aFe1oSDK = purchaseHandler.getCurrencyIso4217Code;
                aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new AnonymousClass1(aFe1cSDK));
            }
        }
        int i4 = AFKeystoreWrapper + 63;
        i = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 53;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            AFa1mSDK i4 = getMonetizationNetwork().i();
            i4.getMonetizationNetwork = str;
            i4.getMediationNetwork = map;
            int i5 = 47 / 0;
        } else {
            AFa1mSDK i6 = getMonetizationNetwork().i();
            i6.getMonetizationNetwork = str;
            i6.getMediationNetwork = map;
        }
        int i7 = i + 113;
        AFKeystoreWrapper = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 27;
        i = i3 % 128;
        int i4 = i3 % 2;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        int i5 = AFKeystoreWrapper + 45;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 89;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            getMonetizationNetwork().i().getCurrencyIso4217Code = deepLinkListener;
            getMonetizationNetwork().i().component2 = j;
        } else {
            getMonetizationNetwork().i().getCurrencyIso4217Code = deepLinkListener;
            getMonetizationNetwork().i().component2 = j;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void e_(Context context, Intent intent) {
        Uri uri;
        boolean z;
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 69;
        i = i3 % 128;
        int i4 = i3 % 2;
        AFAdRevenueData(context);
        AFa1mSDK i5 = getMonetizationNetwork().i();
        AFc1qSDK component4 = getMonetizationNetwork().component4();
        if (intent != null) {
            int i6 = AFKeystoreWrapper + 95;
            i = i6 % 128;
            int i7 = i6 % 2;
            if ("android.intent.action.VIEW".equals(intent.getAction())) {
                uri = intent.getData();
                if (uri != null) {
                    int i8 = i + 33;
                    AFKeystoreWrapper = i8 % 128;
                    int i9 = i8 % 2;
                    if (!uri.toString().isEmpty()) {
                        int i10 = i + 27;
                        AFKeystoreWrapper = i10 % 128;
                        if (i10 % 2 == 0) {
                            z = true;
                            if (component4.getMediationNetwork("ddl_sent", false) && (!z)) {
                                i5.getMediationNetwork("No direct deep link", null);
                                return;
                            } else {
                                i5.f_(AFa1jSDK.getMediationNetwork(i5.areAllFieldsValid.afVerboseLog()), intent, context);
                            }
                        }
                    }
                }
                z = false;
                if (component4.getMediationNetwork("ddl_sent", false)) {
                    i5.getMediationNetwork("No direct deep link", null);
                    return;
                }
                i5.f_(AFa1jSDK.getMediationNetwork(i5.areAllFieldsValid.afVerboseLog()), intent, context);
            }
        }
        uri = null;
        if (uri != null) {
        }
        z = false;
        if (component4.getMediationNetwork("ddl_sent", false)) {
        }
        i5.f_(AFa1jSDK.getMediationNetwork(i5.areAllFieldsValid.afVerboseLog()), intent, context);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(final Intent intent, Context context) {
        int i2 = 2 % 2;
        if (intent == null) {
            int i3 = i + 15;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            getMonetizationNetwork().i().getMediationNetwork("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            AFAdRevenueData(applicationContext);
            getMonetizationNetwork().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1ySDK.this.e_(applicationContext, intent);
                }
            });
            int i5 = i + 121;
            AFKeystoreWrapper = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i6 = i + 115;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 == 0) {
            getMonetizationNetwork().i().getMediationNetwork("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else {
            getMonetizationNetwork().i().getMediationNetwork("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 83;
        i = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            List<String> asList = Arrays.asList(strArr);
            List<List<String>> list = getMonetizationNetwork().i().getRevenue;
            if (!list.contains(asList)) {
                list.add(asList);
            }
            int i4 = AFKeystoreWrapper + 97;
            i = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        getMonetizationNetwork().i().getRevenue.contains(Arrays.asList(strArr));
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        boolean z2;
        int i2 = 2 % 2;
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        if (z) {
            z2 = false;
        } else {
            int i3 = AFKeystoreWrapper + 39;
            i = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        }
        AFb1lSDK.AFAdRevenueData = Boolean.valueOf(z2);
        AFd1zSDK monetizationNetwork = getMonetizationNetwork();
        monetizationNetwork.force().component2 = z;
        if (!z) {
            AFe1oSDK copydefault = monetizationNetwork.copydefault();
            copydefault.getCurrencyIso4217Code.execute(copydefault.new AnonymousClass1(new AFe1eSDK(getMonetizationNetwork())));
        } else {
            monetizationNetwork.force().component3 = null;
            int i5 = AFKeystoreWrapper + 25;
            i = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 111;
        i = i3 % 128;
        int i4 = i3 % 2;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
        getRevenue(new Object[]{AppsFlyerProperties.DISABLE_NETWORK_DATA, Boolean.valueOf(z)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        int i5 = i + 103;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void AFAdRevenueData(JSONObject jSONObject) {
        String str;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i3)));
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
                int i4 = AFKeystoreWrapper + 7;
                i = i4 % 128;
                int i5 = i4 % 2;
                if (str != null) {
                    break loop2;
                }
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i6 = 0;
                    while (i6 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i6) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i6) != ((Long) arrayList.get(1)).longValue()) {
                            int i7 = i + 61;
                            AFKeystoreWrapper = i7 % 128;
                            int i8 = i7 % 2;
                            if (jSONArray2.getLong(i6) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            }
                            i6++;
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
            int i9 = i + 111;
            AFKeystoreWrapper = i9 % 128;
            int i10 = i9 % 2;
            jSONObject.remove(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0078, code lost:
    
        r9 = com.appsflyer.internal.AFa1ySDK.i + 123;
        com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        r8 = new org.json.JSONArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r0 = new org.json.JSONObject();
        r8 = new org.json.JSONArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r8 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        if (r8 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0062, code lost:
    
        r0 = new org.json.JSONObject(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006b, code lost:
    
        if (r0.has(r13) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:
    
        r8 = new org.json.JSONArray((java.lang.String) r0.get(r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object component4(Object[] objArr) {
        long currentTimeMillis;
        String monetizationNetwork;
        JSONObject jSONObject;
        JSONArray jSONArray;
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 83;
        i = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
                currentTimeMillis = System.currentTimeMillis();
                monetizationNetwork = aFa1ySDK.getMonetizationNetwork(context).getMonetizationNetwork("extraReferrers", (String) null);
                int i4 = 25 / 0;
            } else {
                AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
                currentTimeMillis = System.currentTimeMillis();
                monetizationNetwork = aFa1ySDK.getMonetizationNetwork(context).getMonetizationNetwork("extraReferrers", (String) null);
            }
            if (jSONArray.length() < 5) {
                int i5 = i + 75;
                AFKeystoreWrapper = i5 % 128;
                int i6 = i5 % 2;
                jSONArray.put(currentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                int i7 = AFKeystoreWrapper + 67;
                i = i7 % 128;
                int i8 = i7 % 2;
                AFAdRevenueData(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            aFa1ySDK.getMonetizationNetwork(context).getRevenue("extraReferrers", jSONObject.toString());
            return null;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Couldn't save referrer - ").append(str).append(": ").toString(), th);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i2 = 2 % 2;
        int i3 = i + 9;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            getMonetizationNetwork().copy().getRevenue("getSdkVersion", new String[1]);
        } else {
            getMonetizationNetwork().copy().getRevenue("getSdkVersion", new String[0]);
        }
        String component4 = AFc1oSDK.component4();
        int i4 = i + 87;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        return component4;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 43;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
            int i4 = 6 / 0;
        } else {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
        }
        int i5 = i + 39;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 93;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            aFa1ySDK.getMonetizationNetwork().v().getMonetizationNetwork();
            return null;
        }
        aFa1ySDK.getMonetizationNetwork().v().getMonetizationNetwork();
        throw null;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 5;
        i = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        aFa1ySDK.setLogLevel(!booleanValue ? AFLogger.LogLevel.NONE : AFLogger.LogLevel.DEBUG);
        int i4 = i + 117;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 57;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            getMonetizationNetwork().copy().getRevenue("setImeiData", str);
            AFf1eSDK AFInAppEventType2 = getMonetizationNetwork().AFInAppEventType();
            AFf1eSDK.getCurrencyIso4217Code(new Object[]{AFInAppEventType2, str}, -1410448561, 1410448563, System.identityHashCode(AFInAppEventType2));
        } else {
            getMonetizationNetwork().copy().getRevenue("setImeiData", str);
            AFf1eSDK AFInAppEventType3 = getMonetizationNetwork().AFInAppEventType();
            AFf1eSDK.getCurrencyIso4217Code(new Object[]{AFInAppEventType3, str}, -1410448561, 1410448563, System.identityHashCode(AFInAppEventType3));
        }
        int i4 = AFKeystoreWrapper + 31;
        i = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i2 = 2 % 2;
        int i3 = i + 77;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("setOaidData", str);
        AFb1lSDK.getMonetizationNetwork = str;
        int i5 = i + 85;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 23;
        i = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("setAndroidIdData", str);
        getMonetizationNetwork().force().getCurrencyIso4217Code = str;
        int i5 = i + 29;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void getMediationNetwork(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = i + 19;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
            int i4 = 77 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
        }
        int i5 = AFKeystoreWrapper + 73;
        i = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        String str = (String) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 37;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, booleanValue);
            return null;
        }
        AppsFlyerProperties.getInstance().set(str, booleanValue);
        throw null;
    }

    private static String getCurrencyIso4217Code(String str) {
        String string;
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 59;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            string = AppsFlyerProperties.getInstance().getString(str);
            int i4 = 57 / 0;
        } else {
            string = AppsFlyerProperties.getInstance().getString(str);
        }
        int i5 = AFKeystoreWrapper + 41;
        i = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    private static boolean getMediationNetwork(String str) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 51;
        i = i3 % 128;
        int i4 = i3 % 2;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(str, false);
        int i5 = AFKeystoreWrapper + 117;
        i = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean getCurrencyIso4217Code() {
        int i2 = 2 % 2;
        if ((!getMediationNetwork(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) || ((String) getRevenue(new Object[0], 131288073, -131288051, (int) System.currentTimeMillis())) != null) {
            int i3 = AFKeystoreWrapper + 41;
            i = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = AFKeystoreWrapper + 123;
        i = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        int i2 = 2 % 2;
        int i3 = i + 67;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
            getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.valueOf(z)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        } else {
            AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
            getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.valueOf(z)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 41;
        int i4 = i3 % 128;
        i = i4;
        int i5 = i3 % 2;
        if (context != null) {
            int i6 = i4 + 35;
            AFKeystoreWrapper = i6 % 128;
            int i7 = i6 % 2;
            if (getCurrencyIso4217Code()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog(new StringBuilder("CustomerUserId set: ").append(str).append(" - Initializing AppsFlyer Tacking").toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(getMonetizationNetwork().component4());
                getRevenue(new Object[]{this, context, AFh1tSDK.setCustomerIdAndLogSession}, -268043806, 268043817, System.identityHashCode(this));
                getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
                if (referrer == null) {
                    referrer = "";
                }
                if (context instanceof Activity) {
                    ((Activity) context).getIntent();
                }
                getRevenue(context, referrer);
                return;
            }
            setCustomerUserId(str);
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i2 = 2 % 2;
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            String currencyIso4217Code = getCurrencyIso4217Code(context, "AF_STORE");
            if (currencyIso4217Code == null) {
                AFLogger.afInfoLog("No out-of-store value set");
                return null;
            }
            int i3 = AFKeystoreWrapper + 51;
            i = i3 % 128;
            int i4 = i3 % 2;
            return currencyIso4217Code;
        }
        int i5 = AFKeystoreWrapper + 99;
        i = i5 % 128;
        if (i5 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 19;
        i = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            int i5 = i + 105;
            AFKeystoreWrapper = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
    
        if (r5.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) == false) goto L6;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAppInviteOneLink(String str) {
        int i2 = 2 % 2;
        getMonetizationNetwork().copy().getRevenue("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str != null) {
            int i3 = AFKeystoreWrapper + 13;
            i = i3 % 128;
            int i4 = i3 % 2;
        }
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        int i5 = i + 101;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
        getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
        int i7 = AFKeystoreWrapper + 9;
        i = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r6 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        getMonetizationNetwork().copy().getRevenue("setAdditionalData", r6.toString());
        com.appsflyer.AppsFlyerProperties.getInstance().setCustomData(new org.json.JSONObject(r6).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r6 != null) goto L8;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAdditionalData(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = i + 81;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        int i5 = i + 43;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017f  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        long j;
        int i2 = 2 % 2;
        if (activity != null && activity.getIntent() != null) {
            getMonetizationNetwork().copy().getRevenue("sendPushNotificationData", activity.getLocalClassName(), new StringBuilder("activity_intent_").append(activity.getIntent().toString()).toString());
        } else if (activity != null) {
            int i3 = AFKeystoreWrapper + 55;
            i = i3 % 128;
            int i4 = i3 % 2;
            getMonetizationNetwork().copy().getRevenue("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            getMonetizationNetwork().copy().getRevenue("sendPushNotificationData", "activity_null");
            int i5 = AFKeystoreWrapper + 119;
            i = i5 % 128;
            int i6 = i5 % 2;
        }
        AFc1eSDK force = getMonetizationNetwork().force();
        force.getMonetizationNetwork = getRevenue(activity);
        if (force.getMonetizationNetwork != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.copydefault == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.copydefault = new ConcurrentHashMap();
                j = currentTimeMillis;
            } else {
                try {
                    long j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    Iterator<Long> it = this.copydefault.keySet().iterator();
                    j = currentTimeMillis;
                    while (it.hasNext()) {
                        try {
                            Long next = it.next();
                            JSONObject jSONObject = new JSONObject(force.getMonetizationNetwork);
                            JSONObject jSONObject2 = new JSONObject(this.copydefault.get(next));
                            Iterator<Long> it2 = it;
                            if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                AFLogger.afInfoLog(new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ").append(jSONObject2).append(", new: ").append(jSONObject).append(")").toString());
                                force.getMonetizationNetwork = null;
                                return;
                            }
                            if (currentTimeMillis - next.longValue() > j2) {
                                int i7 = i + 69;
                                AFKeystoreWrapper = i7 % 128;
                                int i8 = i7 % 2;
                                this.copydefault.remove(next);
                            }
                            if (next.longValue() <= j) {
                                j = next.longValue();
                            }
                            it = it2;
                        } catch (Throwable th) {
                            th = th;
                            AFLogger.afErrorLog(new StringBuilder("Error while handling push notification measurement: ").append(th.getClass().getSimpleName()).toString(), th);
                            if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                            }
                            this.copydefault.put(Long.valueOf(currentTimeMillis), force.getMonetizationNetwork);
                            start(activity);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = currentTimeMillis;
                }
            }
            if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                AFLogger.afInfoLog(new StringBuilder("pushes: removing oldest overflowing push (oldest push:").append(j).append(")").toString());
                this.copydefault.remove(Long.valueOf(j));
            }
            this.copydefault.put(Long.valueOf(currentTimeMillis), force.getMonetizationNetwork);
            start(activity);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i2 = 2 % 2;
        int i3 = i + 61;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            getMonetizationNetwork().copy().getRevenue("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i4 = 44 / 0;
        } else {
            getMonetizationNetwork().copy().getRevenue("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        }
        int i5 = AFKeystoreWrapper + 71;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: com.appsflyer.internal.AFa1ySDK$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getCurrencyIso4217Code = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getCurrencyIso4217Code[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        getMonetizationNetwork().copy().getRevenue("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            int i3 = AFKeystoreWrapper + 107;
            i = i3 % 128;
            int i4 = i3 % 2;
            if (AnonymousClass3.getCurrencyIso4217Code[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1dSDK.getCurrencyIso4217Code(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                int i5 = AFKeystoreWrapper + 103;
                i = i5 % 128;
                int i6 = i5 % 2;
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
        int i7 = i + 117;
        AFKeystoreWrapper = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        int i2 = 2 % 2;
        int i3 = i + 57;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("setCollectAndroidID", String.valueOf(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        int i5 = AFKeystoreWrapper + 13;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = i + 11;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        aFa1ySDK.getMonetizationNetwork().copy().getRevenue("setCollectIMEI", String.valueOf(booleanValue));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(booleanValue));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(booleanValue));
        int i5 = i + 115;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 93;
        i = i3 % 128;
        int i4 = i3 % 2;
        aFa1ySDK.getMonetizationNetwork().copy().getRevenue("setCollectOaid", String.valueOf(booleanValue));
        getMediationNetwork(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(booleanValue));
        int i5 = i + 89;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        int i2 = 2 % 2;
        int i3 = i + 25;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFa1mSDK i5 = getMonetizationNetwork().i();
        i5.component1.clear();
        i5.component1.addAll(Arrays.asList(strArr));
        int i6 = AFKeystoreWrapper + 85;
        i = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 85;
        i = i3 % 128;
        int i4 = i3 % 2;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        getMonetizationNetwork().i().component3 = strArr;
        int i5 = AFKeystoreWrapper + 103;
        i = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copy() {
        int i2 = 2 % 2;
        int i3 = i + 121;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            getMonetizationNetwork().afLogForce().AFAdRevenueData();
            throw null;
        }
        if (getMonetizationNetwork().afLogForce().AFAdRevenueData()) {
            int i4 = i + 21;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
            getMonetizationNetwork().afLogForce().getMonetizationNetwork();
        }
        AFi1pSDK d = getMonetizationNetwork().d();
        d.getMonetizationNetwork = Build.VERSION.SDK_INT >= 31 ? new AFi1mSDK(d.getMediationNetwork) : new AFi1tSDK(d.getMediationNetwork);
        getMonetizationNetwork().AFInAppEventType().getRevenue(getMonetizationNetwork().AFAdRevenueData());
        AFh1xSDK areAllFieldsValid2 = getMonetizationNetwork().areAllFieldsValid();
        areAllFieldsValid2.areAllFieldsValid = System.currentTimeMillis();
        int revenue = areAllFieldsValid2.getCurrencyIso4217Code.getMediationNetwork.getRevenue("appsFlyerCount", 0);
        if (revenue == 1) {
            int i6 = i + 89;
            AFKeystoreWrapper = i6 % 128;
            int i7 = i6 % 2;
            if (areAllFieldsValid2.getMonetizationNetwork.getMonetizationNetwork("first_launch")) {
                areAllFieldsValid2.AFAdRevenueData.putAll(areAllFieldsValid2.getCurrencyIso4217Code("first_launch"));
            }
        }
        if (revenue > 0 && areAllFieldsValid2.getMonetizationNetwork.getMonetizationNetwork("gcd")) {
            int i8 = AFKeystoreWrapper + 85;
            i = i8 % 128;
            if (i8 % 2 == 0) {
                areAllFieldsValid2.getRevenue.putAll(areAllFieldsValid2.getCurrencyIso4217Code("gcd"));
                int i9 = 79 / 0;
            } else {
                areAllFieldsValid2.getRevenue.putAll(areAllFieldsValid2.getCurrencyIso4217Code("gcd"));
            }
        }
        areAllFieldsValid2.copydefault = areAllFieldsValid2.getMonetizationNetwork.getMonetizationNetwork("prev_session_dur", 0L);
        areAllFieldsValid();
        getMonetizationNetwork().registerClient().getMediationNetwork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(boolean z) {
        int i2 = 2 % 2;
        if (!z) {
            getMonetizationNetwork().afInfoLog().AFAdRevenueData();
            int i3 = i + 7;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = AFKeystoreWrapper + 67;
        i = i5 % 128;
        if (i5 % 2 != 0) {
            getMonetizationNetwork().afInfoLog().getMediationNetwork();
        } else {
            getMonetizationNetwork().afInfoLog().getMediationNetwork();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() {
        int i2 = 2 % 2;
        getMediationNetwork(new AFh1kSDK());
        int i3 = i + 81;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        String str2;
        int i2 = 2 % 2;
        if (this.hashCode) {
            int i3 = i + 123;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }
        this.hashCode = true;
        getMonetizationNetwork().AFInAppEventType().AFAdRevenueData(str);
        if (context != null) {
            AFAdRevenueData(context);
            Application O_ = AFj1kSDK.O_(context);
            if (O_ == null) {
                return this;
            }
            int i5 = i;
            int i6 = i5 + 77;
            AFKeystoreWrapper = i6 % 128;
            if (i6 % 2 != 0) {
                this.component2 = O_;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.component2 = O_;
            int i7 = i5 + 91;
            AFKeystoreWrapper = i7 % 128;
            int i8 = i7 % 2;
            getMonetizationNetwork().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1ySDK.this.copy();
                }
            });
            AFe1oSDK copydefault = getMonetizationNetwork().copydefault();
            copydefault.getCurrencyIso4217Code.execute(copydefault.new AnonymousClass1(new AFe1eSDK(getMonetizationNetwork())));
            getMonetizationNetwork().afErrorLogForExcManagerOnly().getMonetizationNetwork(new AFd1xSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda3
                @Override // com.appsflyer.internal.AFd1xSDK.AFa1vSDK
                public final void onConfigurationChanged(boolean z) {
                    AFa1ySDK.this.getMediationNetwork(z);
                }
            });
            getMonetizationNetwork().component1().AFAdRevenueData(AFAdRevenueData());
            AFj1sSDK AFLogger2 = getMonetizationNetwork().AFLogger();
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1ySDK.this.equals();
                }
            };
            AFi1aSDK currencyIso4217Code = AFLogger2.getCurrencyIso4217Code(runnable);
            Runnable AFAdRevenueData = AFLogger2.AFAdRevenueData(currencyIso4217Code, runnable);
            AFLogger2.getRevenue.add(currencyIso4217Code);
            AFLogger2.getRevenue.add(new AFj1oSDK(AFLogger2.getCurrencyIso4217Code.AFAdRevenueData(), AFAdRevenueData));
            AFLogger2.getRevenue.add(new AFj1wSDK(AFAdRevenueData, AFLogger2.getCurrencyIso4217Code, new AFj1xSDK()));
            AFLogger2.getRevenue.add(new AFj1mSDK(AFAdRevenueData, AFLogger2.getCurrencyIso4217Code));
            AFLogger2.getRevenue.add(new AFj1rSDK(AFLogger2.getCurrencyIso4217Code.getMonetizationNetwork(), AFLogger2.getCurrencyIso4217Code.AFAdRevenueData(), AFAdRevenueData));
            AFLogger2.getMediationNetwork(AFAdRevenueData);
            for (AFj1tSDK aFj1tSDK : (AFj1tSDK[]) AFLogger2.getRevenue.toArray(new AFj1tSDK[0])) {
                aFj1tSDK.getMonetizationNetwork(AFLogger2.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork);
            }
            if (!AFLogger2.getCurrencyIso4217Code()) {
                int i9 = i + 67;
                AFKeystoreWrapper = i9 % 128;
                int i10 = i9 % 2;
                AFLogger2.getRevenue(AFLogger2.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork, AFAdRevenueData, AFLogger2.getCurrencyIso4217Code);
            }
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFd1oSDK copy = getMonetizationNetwork().copy();
        String[] strArr = new String[2];
        strArr[0] = str;
        if (appsFlyerConversionListener == null) {
            int i11 = i;
            int i12 = i11 + 45;
            AFKeystoreWrapper = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + 87;
            AFKeystoreWrapper = i14 % 128;
            int i15 = i14 % 2;
            str2 = "null";
        } else {
            str2 = "conversionDataListener";
        }
        strArr[1] = str2;
        copy.getRevenue("init", strArr);
        AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.17.6", getMonetizationNetwork));
        this.getRevenue = appsFlyerConversionListener;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFi1hSDK aFi1hSDK) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 25;
        i = i3 % 128;
        Object[] objArr = {this, aFi1hSDK};
        if (i3 % 2 == 0) {
            getRevenue(objArr, 608861720, -608861711, System.identityHashCode(this));
            throw null;
        }
        getRevenue(objArr, 608861720, -608861711, System.identityHashCode(this));
        int i4 = i + 15;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
    }

    private void areAllFieldsValid() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 73;
        i = i3 % 128;
        int i4 = i3 % 2;
        try {
            final AFi1hSDK afErrorLog = getMonetizationNetwork().afErrorLog();
            if (afErrorLog == null) {
                return;
            }
            if (!afErrorLog.getCurrencyIso4217Code()) {
                if (afErrorLog.AFAdRevenueData()) {
                    return;
                }
                getRevenue(new Object[]{this, afErrorLog}, 608861720, -608861711, System.identityHashCode(this));
            } else {
                int i5 = i + 101;
                AFKeystoreWrapper = i5 % 128;
                if (i5 % 2 == 0) {
                    afErrorLog.getMediationNetwork(new AFi1dSDK() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda0
                        @Override // com.appsflyer.internal.AFi1dSDK
                        public final void onRequestFinished() {
                            AFa1ySDK.this.AFAdRevenueData(afErrorLog);
                        }
                    });
                } else {
                    afErrorLog.getMediationNetwork(new AFi1dSDK() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda0
                        @Override // com.appsflyer.internal.AFi1dSDK
                        public final void onRequestFinished() {
                            AFa1ySDK.this.AFAdRevenueData(afErrorLog);
                        }
                    });
                    throw null;
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th)));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 69;
        i = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().e().getCurrencyIso4217Code(z);
        int i5 = AFKeystoreWrapper + 75;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 39;
        i = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            start(context, null);
            int i4 = i + 7;
            AFKeystoreWrapper = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        start(context, null);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        r13.onError(41, "No dev key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        AFAdRevenueData(r11);
        r1 = getMonetizationNetwork().areAllFieldsValid();
        r1.getRevenue(com.appsflyer.internal.AFh1vSDK.getMediationNetwork(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (r10.component2 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        r6 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 53;
        com.appsflyer.internal.AFa1ySDK.i = r6 % 128;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if ((r6 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        r6 = com.appsflyer.internal.AFj1kSDK.O_(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (r6 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        r8 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 69;
        com.appsflyer.internal.AFa1ySDK.i = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if ((r8 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        r10.component2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        r10.component2 = r6;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        com.appsflyer.internal.AFj1kSDK.O_(r11);
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        getMonetizationNetwork().copy().getRevenue(com.facebook.react.uimanager.ViewProps.START, r12);
        r5 = com.appsflyer.AFLogger.INSTANCE;
        r6 = com.appsflyer.internal.AFg1cSDK.GENERAL;
        r7 = com.appsflyer.internal.AFa1ySDK.getMonetizationNetwork;
        r5.i(r6, java.lang.String.format("Starting AppsFlyer: (v%s.%s)", "6.17.6", r7));
        com.appsflyer.AFLogger.INSTANCE.i(com.appsflyer.internal.AFg1cSDK.GENERAL, new java.lang.StringBuilder("Build Number: ").append(r7).toString());
        com.appsflyer.AppsFlyerProperties.getInstance().loadProperties(getMonetizationNetwork().component4());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00df, code lost:
    
        if (android.text.TextUtils.isEmpty(r12) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
    
        getMonetizationNetwork().AFInAppEventType().AFAdRevenueData(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011e, code lost:
    
        getMonetizationNetwork().component1().AFAdRevenueData(AFAdRevenueData());
        component1();
        c_(r10.component2.getBaseContext(), r10.copy.AFAdRevenueData().n_());
        getMonetizationNetwork().e().getMonetizationNetwork();
        r10.copy.v().AFAdRevenueData(r11, new com.appsflyer.internal.AFa1ySDK.AnonymousClass2(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x015c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fd, code lost:
    
        if (android.text.TextUtils.isEmpty(getMonetizationNetwork().AFInAppEventType().getMediationNetwork()) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ff, code lost:
    
        getRevenue(new java.lang.Object[0], -516060765, 516060769, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010f, code lost:
    
        if (r13 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0111, code lost:
    
        r11 = com.appsflyer.internal.AFa1ySDK.i + 49;
        com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r11 % 128;
        r11 = r11 % 2;
        r13.onError(41, "No dev key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002e, code lost:
    
        r11 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 31;
        com.appsflyer.internal.AFa1ySDK.i = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x002c, code lost:
    
        if (getMonetizationNetwork().v().getMediationNetwork() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (getMonetizationNetwork().v().getMediationNetwork() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
    
        if (r10.hashCode != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        getRevenue(com.facebook.react.uimanager.ViewProps.START);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (r12 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        if (r13 == null) goto L43;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        int i2 = 2 % 2;
        int i3 = i + 93;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
        }
    }

    private static void c_(Context context, PackageInfo packageInfo) {
        int i2 = 2 % 2;
        try {
            if (packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 32768) == 0) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) == 0) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                    int i3 = i + 49;
                    AFKeystoreWrapper = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                int i5 = i + 65;
                AFKeystoreWrapper = i5 % 128;
                if (i5 % 2 != 0) {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                    return;
                } else {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                    return;
                }
            }
            if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
            } else {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while checking BackupRules: ", th);
        }
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 121;
        i = i3 % 128;
        int i4 = i3 % 2;
        String currencyIso4217Code = getCurrencyIso4217Code(AppsFlyerProperties.APP_USER_ID);
        int i5 = i + 115;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            return currencyIso4217Code;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 53;
        i = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMediationNetwork(AppsFlyerProperties.APP_USER_ID, str);
        getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        int i5 = AFKeystoreWrapper + 117;
        i = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i2 = 2 % 2;
        int i3 = i + 13;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            getMonetizationNetwork().force().getMediationNetwork = AFj1dSDK.getCurrencyIso4217Code(str);
            int i4 = 11 / 0;
        } else {
            getMonetizationNetwork().force().getMediationNetwork = AFj1dSDK.getCurrencyIso4217Code(str);
        }
        int i5 = i + 25;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i2 = 2 % 2;
        int i3 = i + 3;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            getMonetizationNetwork().copy().getRevenue("setAppId", str);
        } else {
            getMonetizationNetwork().copy().getRevenue("setAppId", str);
        }
        getMediationNetwork(AppsFlyerProperties.APP_ID, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i2 = 2 % 2;
        int i3 = i + 23;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i5 = AFKeystoreWrapper + 123;
        i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i2 = 2 % 2;
        int i3 = i + 87;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i5 = i + 57;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        int i2 = 2 % 2;
        getMonetizationNetwork().copy().getRevenue("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        AFAdRevenueData(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        int i3 = i + 3;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 15;
        i = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("logSession", new String[0]);
        getMonetizationNetwork().copy().getCurrencyIso4217Code();
        getRevenue(new Object[]{this, context, AFh1tSDK.logSession}, -268043806, 268043817, System.identityHashCode(this));
        AFAdRevenueData(context, null, null);
        int i5 = AFKeystoreWrapper + 33;
        i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        r4 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 75;
        com.appsflyer.internal.AFa1ySDK.i = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        r1.AFAdRevenueData.put("api_name", r7.toString());
        r1.getRevenue(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        r1.AFAdRevenueData.put("api_name", r7.toString());
        r1.getRevenue(r2);
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r1.AFAdRevenueData() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (r1.AFAdRevenueData() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object component3(Object[] objArr) {
        AFh1xSDK areAllFieldsValid2;
        AFh1vSDK mediationNetwork;
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        Context context = (Context) objArr[1];
        AFh1tSDK aFh1tSDK = (AFh1tSDK) objArr[2];
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 77;
        i = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            aFa1ySDK.AFAdRevenueData(context);
            areAllFieldsValid2 = aFa1ySDK.getMonetizationNetwork().areAllFieldsValid();
            mediationNetwork = AFh1vSDK.getMediationNetwork(context);
            int i4 = 14 / 0;
        } else {
            aFa1ySDK.AFAdRevenueData(context);
            areAllFieldsValid2 = aFa1ySDK.getMonetizationNetwork().areAllFieldsValid();
            mediationNetwork = AFh1vSDK.getMediationNetwork(context);
        }
        areAllFieldsValid2.getMonetizationNetwork();
        int i5 = AFKeystoreWrapper + 61;
        i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        int i2 = 2 % 2;
        if (!this.hashCode) {
            getRevenue("logAdRevenue");
            return;
        }
        if (aFAdRevenueData.areAllFieldsValid()) {
            if (getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
                AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
                return;
            }
            if (!AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().AFInAppEventType().getMediationNetwork())) {
                AFAdRevenueData(new AFh1lSDK(aFAdRevenueData, map));
                return;
            }
            int i3 = AFKeystoreWrapper + 23;
            i = i3 % 128;
            int i4 = i3 % 2;
            getRevenue(new Object[0], -516060765, 516060769, (int) System.currentTimeMillis());
            return;
        }
        int i5 = AFKeystoreWrapper + 91;
        i = i5 % 128;
        int i6 = i5 % 2;
        AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = i + 87;
        AFKeystoreWrapper = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            logEvent(context, str, map, null);
            int i4 = AFKeystoreWrapper + 27;
            i = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        logEvent(context, str, map, null);
        throw null;
    }

    private void AFAdRevenueData(Context context, String str, Map<String, Object> map) {
        int i2 = 2 % 2;
        AFh1hSDK aFh1hSDK = new AFh1hSDK();
        aFh1hSDK.areAllFieldsValid = str;
        aFh1hSDK.getRevenue = map;
        getCurrencyIso4217Code(aFh1hSDK, (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this)));
        int i3 = AFKeystoreWrapper + 125;
        i = i3 % 128;
        int i4 = i3 % 2;
    }

    final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK, AFh1qSDK aFh1qSDK) {
        int i2 = 2 % 2;
        getMediationNetwork(aFh1mSDK, aFh1qSDK);
        if (getMonetizationNetwork().AFInAppEventType().getMediationNetwork() == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
            if (appsFlyerRequestListener != null) {
                int i3 = AFKeystoreWrapper + 5;
                i = i3 % 128;
                int i4 = i3 % 2;
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(getMonetizationNetwork().component4());
        if (referrer == null) {
            referrer = "";
        } else {
            int i5 = AFKeystoreWrapper + 65;
            i = i5 % 128;
            int i6 = i5 % 2;
        }
        aFh1mSDK.component1 = referrer;
        AFAdRevenueData(aFh1mSDK);
    }

    private static void getMediationNetwork(AFh1mSDK aFh1mSDK, AFh1qSDK aFh1qSDK) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 61;
        i = i3 % 128;
        int i4 = i3 % 2;
        if (aFh1qSDK != null) {
            aFh1mSDK.getMonetizationNetwork = aFh1qSDK.getCurrencyIso4217Code;
            aFh1mSDK.copydefault = aFh1qSDK.AFAdRevenueData;
        }
        int i5 = i + 41;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i2 = 2 % 2;
        int i3 = i + 91;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            AFd1oSDK copy = getMonetizationNetwork().copy();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            copy.getRevenue("anonymizeUser", strArr);
        } else {
            getMonetizationNetwork().copy().getRevenue("anonymizeUser", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        int i4 = i + 35;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i2 = 2 % 2;
        int i3 = i + 23;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("registerConversionListener", new String[0]);
        getRevenue(appsFlyerConversionListener);
        int i5 = AFKeystoreWrapper + 77;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    private void getRevenue(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i2 = 2 % 2;
        int i3 = i + 53;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        if (appsFlyerConversionListener == null) {
            return;
        }
        this.getRevenue = appsFlyerConversionListener;
        int i5 = AFKeystoreWrapper + 101;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i2 = 2 % 2;
        int i3 = i + 91;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("unregisterConversionListener", new String[0]);
        this.getRevenue = null;
        int i5 = AFKeystoreWrapper + 21;
        i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r6 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r6 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0048, code lost:
    
        com.appsflyer.internal.AFa1ySDK.getCurrencyIso4217Code = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
        r6 = com.appsflyer.internal.AFa1ySDK.i + 113;
        com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 7;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            getMonetizationNetwork().copy().getRevenue("registerValidatorListener", new String[1]);
            AFLogger.afDebugLog("registerValidatorListener called");
        } else {
            getMonetizationNetwork().copy().getRevenue("registerValidatorListener", new String[0]);
            AFLogger.afDebugLog("registerValidatorListener called");
        }
    }

    public static String getMonetizationNetwork(SimpleDateFormat simpleDateFormat, long j) {
        int i2 = 2 % 2;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        int i3 = i + 3;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 88 / 0;
        }
        return format;
    }

    private void getRevenue(Context context, String str) {
        int i2 = 2 % 2;
        AFh1eSDK aFh1eSDK = new AFh1eSDK();
        AFAdRevenueData(context);
        aFh1eSDK.areAllFieldsValid = null;
        aFh1eSDK.getRevenue = null;
        aFh1eSDK.component1 = str;
        aFh1eSDK.getMonetizationNetwork = null;
        AFAdRevenueData(aFh1eSDK);
        int i3 = AFKeystoreWrapper + 29;
        i = i3 % 128;
        int i4 = i3 % 2;
    }

    private void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        boolean z;
        int i2 = 2 % 2;
        if (aFh1mSDK.areAllFieldsValid == null) {
            int i3 = i + 73;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getCurrencyIso4217Code()) {
            int i5 = AFKeystoreWrapper + 33;
            i = i5 % 128;
            int i6 = i5 % 2;
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                int i7 = AFKeystoreWrapper + 7;
                i = i7 % 128;
                int i8 = i7 % 2;
                if (component4()) {
                    int i9 = i + 39;
                    AFKeystoreWrapper = i9 % 128;
                    int i10 = i9 % 2;
                    AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        return;
                    }
                    return;
                }
            } else {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            this.component3 = System.currentTimeMillis();
        }
        getMediationNetwork(aFh1mSDK);
    }

    private boolean component4() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 101;
        i = i3 % 128;
        int i4 = i3 % 2;
        if (this.component3 <= 0) {
            if (!(!isStopped())) {
                return false;
            }
            int i5 = AFKeystoreWrapper + 113;
            i = i5 % 128;
            int i6 = i5 % 2;
            AFLogger.afInfoLog("Sending first launch for this session!");
            int i7 = AFKeystoreWrapper + 121;
            i = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.component3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
        String monetizationNetwork = getMonetizationNetwork(simpleDateFormat, this.component3);
        String monetizationNetwork2 = getMonetizationNetwork(simpleDateFormat, this.AFAdRevenueData);
        if (currentTimeMillis >= this.component4 || isStopped()) {
            if (isStopped()) {
                return false;
            }
            AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", monetizationNetwork, monetizationNetwork2, Long.valueOf(currentTimeMillis)));
            return false;
        }
        int i9 = i + 25;
        AFKeystoreWrapper = i9 % 128;
        int i10 = i9 % 2;
        AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", monetizationNetwork, monetizationNetwork2, Long.valueOf(currentTimeMillis), Long.valueOf(this.component4)));
        return true;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
        int i2 = 2 % 2;
        int i3 = i + 31;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        aFa1ySDK.getMediationNetwork(aFh1mSDK);
        int i5 = i + 27;
        AFKeystoreWrapper = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private void AFAdRevenueData(String str) {
        int i2 = 2 % 2;
        final AFh1mSDK AFAdRevenueData = new AFh1nSDK().AFAdRevenueData(getMonetizationNetwork().AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0));
        AFAdRevenueData.component1 = str;
        if (str == null || str.length() <= 5 || !getMonetizationNetwork().AFLogger().getMediationNetwork(AFAdRevenueData)) {
            return;
        }
        int i3 = i + 15;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), new Runnable() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1ySDK.this.getCurrencyIso4217Code(AFAdRevenueData);
                }
            }, 5L, TimeUnit.MILLISECONDS);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), new Runnable() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFa1ySDK.this.getCurrencyIso4217Code(AFAdRevenueData);
            }
        }, 5L, TimeUnit.MILLISECONDS);
        int i4 = AFKeystoreWrapper + 21;
        i = i4 % 128;
        int i5 = i4 % 2;
    }

    final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        int i2 = 2 % 2;
        Context context = getMonetizationNetwork().AFInAppEventParameterName().getMonetizationNetwork;
        boolean z = true;
        if (context == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
            return;
        }
        String mediationNetwork = getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
        if (mediationNetwork != null) {
            int i3 = AFKeystoreWrapper + 49;
            i = i3 % 128;
            if (i3 % 2 == 0) {
                mediationNetwork.length();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (mediationNetwork.length() != 0) {
                AFc1qSDK monetizationNetwork = getMonetizationNetwork(context);
                AppsFlyerProperties.getInstance().saveProperties(monetizationNetwork);
                if (!getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, new StringBuilder("sendWithEvent from activity: ").append(context.getClass().getName()).toString(), true);
                }
                boolean revenue = aFh1mSDK.getRevenue();
                Map<String, ?> monetizationNetwork2 = getMonetizationNetwork(aFh1mSDK);
                if (getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
                    int i4 = i + 31;
                    AFKeystoreWrapper = i4 % 128;
                    int i5 = i4 % 2;
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyerLib.sendWithEvent");
                }
                int currencyIso4217Code = getCurrencyIso4217Code(monetizationNetwork, false);
                getRevenue(monetizationNetwork2);
                AFa1tSDK aFa1tSDK = new AFa1tSDK(getMonetizationNetwork(), aFh1mSDK.AFAdRevenueData(monetizationNetwork2).AFAdRevenueData(currencyIso4217Code), getMonetizationNetwork().e().getMediationNetwork());
                if (revenue) {
                    boolean z2 = false;
                    for (AFj1tSDK aFj1tSDK : component3()) {
                        if (aFj1tSDK.component4 == AFj1tSDK.AFa1tSDK.STARTED) {
                            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, new StringBuilder("Failed to get ").append(aFj1tSDK.component3).append(" referrer, wait ...").toString());
                            z2 = true;
                        }
                    }
                    if (getMonetizationNetwork().e().AFAdRevenueData()) {
                        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
                        z2 = true;
                    }
                    if (!getMonetizationNetwork().AFInAppEventType().getMonetizationNetwork()) {
                        z = z2;
                    }
                } else {
                    z = false;
                }
                AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), aFa1tSDK, !z ? 0L : 500L, TimeUnit.MILLISECONDS);
                return;
            }
        }
        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer will not track this event.", true);
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
        int i6 = i + 35;
        AFKeystoreWrapper = i6 % 128;
        int i7 = i6 % 2;
    }

    private void getRevenue(Map<String, Object> map) {
        int i2 = 2 % 2;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return;
        }
        int i3 = i + 115;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        if (!(!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false))) {
            return;
        }
        int i5 = AFKeystoreWrapper + 115;
        i = i5 % 128;
        int i6 = i5 % 2;
        if (map.get("advertiserId") != null) {
            try {
                if (AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().force().getCurrencyIso4217Code) && map.remove("android_id") != null) {
                    int i7 = i + 65;
                    AFKeystoreWrapper = i7 % 128;
                    int i8 = i7 % 2;
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().AFInAppEventType().AFAdRevenueData())) {
                    int i9 = AFKeystoreWrapper + 67;
                    i = i9 % 128;
                    int i10 = i9 % 2;
                    if (map.remove("imei") != null) {
                        int i11 = i + 33;
                        AFKeystoreWrapper = i11 % 128;
                        if (i11 % 2 == 0) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        } else {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                            throw null;
                        }
                    }
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
    }

    final Map<String, Object> getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        String str;
        int i2 = 2 % 2;
        Context context = getMonetizationNetwork().AFInAppEventParameterName().getMonetizationNetwork;
        AFc1qSDK monetizationNetwork = getMonetizationNetwork(context);
        AFg1nSDK component3 = getMonetizationNetwork().component3();
        boolean currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
        boolean revenue = aFh1mSDK.getRevenue();
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        long time = new Date().getTime();
        boolean z = false;
        Object[] objArr = new Object[1];
        a("\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (currencyIso4217Code) {
                int i3 = i + 63;
                AFKeystoreWrapper = i3 % 128;
                if (i3 % 2 != 0) {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", false);
                } else {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
                }
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (revenue) {
                    int i4 = i + 105;
                    AFKeystoreWrapper = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 15 / 0;
                    }
                    str = "Launch";
                } else {
                    str = aFh1mSDK.areAllFieldsValid;
                }
                aFLogger.i(aFg1cSDK, sb.append(str).toString(), true);
                int i6 = AFKeystoreWrapper + 71;
                i = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 % 3;
                }
            }
            getRevenue(new Object[]{context}, 750744286, -750744267, (int) System.currentTimeMillis());
            int currencyIso4217Code2 = getCurrencyIso4217Code(monetizationNetwork, revenue);
            if (aFh1mSDK.areAllFieldsValid != null) {
                int i8 = i + 75;
                AFKeystoreWrapper = i8 % 128;
                if (i8 % 2 == 0) {
                    z = true;
                }
            }
            int revenue2 = getRevenue(monetizationNetwork, z);
            if (!(!revenue) && currencyIso4217Code2 == 1) {
                AppsFlyerProperties.getInstance().getCurrencyIso4217Code = true;
            }
            component3.getCurrencyIso4217Code(map, currencyIso4217Code2, revenue2);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
        }
        return map;
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i2 = 2 % 2;
        try {
            List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!asList.contains("android.permission.INTERNET")) {
                int i3 = AFKeystoreWrapper + 73;
                i = i3 % 128;
                if (i3 % 2 == 0) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                    int i4 = 51 / 0;
                } else {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
            }
            if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32) {
                int i5 = AFKeystoreWrapper + 11;
                i = i5 % 128;
                int i6 = i5 % 2;
                if (!asList.contains("com.google.android.gms.permission.AD_ID")) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                }
            }
            int i7 = i + 61;
            AFKeystoreWrapper = i7 % 128;
            int i8 = i7 % 2;
            return null;
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e);
            return null;
        }
    }

    @Deprecated
    public static Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        int i2 = 2 % 2;
        if (!map.containsKey("meta")) {
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            return hashMap;
        }
        int i3 = AFKeystoreWrapper + 115;
        i = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map2 = (Map) map.get("meta");
        int i5 = i + 81;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
        return map2;
    }

    private static String getRevenue(Activity activity) {
        Intent intent;
        int i2 = 2 % 2;
        int i3 = i + 117;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i5 = AFKeystoreWrapper + 75;
                    i = i5 % 128;
                    if (i5 % 2 != 0) {
                        str = extras.getString("af");
                        if (str != null) {
                            AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(str)));
                            extras.remove("af");
                            activity.setIntent(intent.putExtras(extras));
                            int i6 = i + 45;
                            AFKeystoreWrapper = i6 % 128;
                            int i7 = i6 % 2;
                        }
                    } else {
                        String string = extras.getString("af");
                        try {
                            str.hashCode();
                            throw null;
                        } catch (Throwable th) {
                            str = string;
                            th = th;
                            AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
                            return str;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return str;
    }

    public static boolean getRevenue(Context context) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 103;
        i = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i5 = i + 83;
                AFKeystoreWrapper = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    private String getCurrencyIso4217Code(Context context, String str) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 55;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (context == null) {
            return null;
        }
        AFAdRevenueData(context);
        String currencyIso4217Code = getMonetizationNetwork().AFAdRevenueData().getCurrencyIso4217Code(str);
        int i4 = i + 89;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        int i2 = 2 % 2;
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            int i3 = i + 115;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            int i5 = AFKeystoreWrapper + 117;
            i = i5 % 128;
            if (i5 % 2 != 0) {
                jSONObject.put("c", str2);
            } else {
                jSONObject.put("c", str2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if (str3 != null) {
            int i6 = AFKeystoreWrapper + 93;
            i = i6 % 128;
            int i7 = i6 % 2;
            jSONObject.put("af_siteid", str3);
        }
        if (jSONObject.has("pid")) {
            getMediationNetwork("preInstallName", jSONObject.toString());
        } else {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        }
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        String str = (String) objArr[0];
        int i2 = 2 % 2;
        Object obj = null;
        try {
            if (new JSONObject(str).has("pid")) {
                int i3 = i + 97;
                AFKeystoreWrapper = i3 % 128;
                if (i3 % 2 == 0) {
                    getMediationNetwork("preInstallName", str);
                    return null;
                }
                getMediationNetwork("preInstallName", str);
                throw null;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            int i4 = AFKeystoreWrapper + 113;
            i = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
            return null;
        }
    }

    final void component1() {
        int i2 = 2 % 2;
        if (!AFe1bSDK.component3()) {
            AFd1zSDK monetizationNetwork = getMonetizationNetwork();
            AFe1oSDK copydefault = monetizationNetwork.copydefault();
            copydefault.getCurrencyIso4217Code.execute(copydefault.new AnonymousClass1(new AFe1bSDK(monetizationNetwork)));
            int i3 = AFKeystoreWrapper + 13;
            i = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = AFKeystoreWrapper + 107;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        int i2 = 2 % 2;
        int i3 = i + 77;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 == 0) {
            AFAdRevenueData(context);
            return getMonetizationNetwork().AFAdRevenueData().getMonetizationNetwork(context);
        }
        AFAdRevenueData(context);
        getMonetizationNetwork().AFAdRevenueData().getMonetizationNetwork(context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String AFAdRevenueData(AFc1qSDK aFc1qSDK, String str) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 71;
        i = i3 % 128;
        int i4 = i3 % 2;
        String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        if (monetizationNetwork == null) {
            aFc1qSDK.getRevenue("CACHED_CHANNEL", str);
            int i5 = AFKeystoreWrapper + 37;
            i = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
        int i7 = i + 87;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        int i2 = 2 % 2;
        int i3 = i + 21;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        AFAdRevenueData(context);
        String AFAdRevenueData = getMonetizationNetwork().AFAdRevenueData().AFAdRevenueData(context);
        int i5 = i + 19;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
        return AFAdRevenueData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r2 = android.os.StrictMode.allowThreadDiskReads();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        getRevenue().toString = r5.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        android.os.StrictMode.setThreadPolicy(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        if (getRevenue().toString == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (getRevenue().toString == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object component1(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i2 = 2 % 2;
        int i3 = i + 9;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 95 / 0;
        }
        SharedPreferences sharedPreferences = getRevenue().toString;
        int i5 = AFKeystoreWrapper + 7;
        i = i5 % 128;
        if (i5 % 2 != 0) {
            return sharedPreferences;
        }
        throw null;
    }

    public final AFc1qSDK getMonetizationNetwork(Context context) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 13;
        i = i3 % 128;
        int i4 = i3 % 2;
        AFAdRevenueData(context);
        AFc1qSDK component4 = getMonetizationNetwork().component4();
        int i5 = AFKeystoreWrapper + 85;
        i = i5 % 128;
        if (i5 % 2 != 0) {
            return component4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int getCurrencyIso4217Code(AFc1qSDK aFc1qSDK, boolean z) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 65;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            getMediationNetwork(aFc1qSDK, "appsFlyerCount", z);
            throw null;
        }
        int mediationNetwork = getMediationNetwork(aFc1qSDK, "appsFlyerCount", z);
        int i4 = i + 71;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        return mediationNetwork;
    }

    private static int getRevenue(AFc1qSDK aFc1qSDK, boolean z) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 125;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            getMediationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z);
            throw null;
        }
        int mediationNetwork = getMediationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z);
        int i4 = AFKeystoreWrapper + 33;
        i = i4 % 128;
        int i5 = i4 % 2;
        return mediationNetwork;
    }

    private static int getMediationNetwork(AFc1qSDK aFc1qSDK, String str, boolean z) {
        int revenue;
        int i2 = 2 % 2;
        int i3 = i + 15;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            revenue = aFc1qSDK.getRevenue(str, 0);
            if (!z) {
                return revenue;
            }
        } else {
            revenue = aFc1qSDK.getRevenue(str, 0);
            if (!z) {
                return revenue;
            }
        }
        int i4 = i + 13;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        int i6 = revenue + 1;
        aFc1qSDK.getMediationNetwork(str, i6);
        return i6;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) {
        int i2 = 2 % 2;
        getMonetizationNetwork().copy().getRevenue("getAppsFlyerUID", new String[0]);
        Object obj = null;
        if (context != null) {
            AFAdRevenueData(context);
            String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(getMonetizationNetwork().AFAdRevenueData().getMediationNetwork);
            int i3 = i + 117;
            AFKeystoreWrapper = i3 % 128;
            if (i3 % 2 == 0) {
                return currencyIso4217Code;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = AFKeystoreWrapper + 45;
        i = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        String obj;
        int i2 = 2 % 2;
        AFd1oSDK copy = getMonetizationNetwork().copy();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        if (map != null) {
            obj = map.toString();
        } else {
            obj = "";
        }
        strArr[5] = obj;
        copy.getRevenue("validateAndTrackInAppPurchase", strArr);
        if (!getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
            AFLogger.INSTANCE.i(AFg1cSDK.PURCHASE_VALIDATION, new StringBuilder("Validate in app called with parameters: ").append(str3).append(" ").append(str4).append(" ").append(str5).toString());
        }
        Object obj2 = null;
        if (str != null && str4 != null) {
            int i3 = i + 105;
            int i4 = i3 % 128;
            AFKeystoreWrapper = i4;
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (str2 != null && str5 != null) {
                int i5 = i4 + 5;
                i = i5 % 128;
                int i6 = i5 % 2;
                if (str3 != null) {
                    new Thread(new com.appsflyer.internal.AFa1zSDK(context.getApplicationContext(), getMonetizationNetwork().AFInAppEventType().getMediationNetwork(), str, str2, str3, str4, str5, map)).start();
                    return;
                }
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getCurrencyIso4217Code;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            int i7 = AFKeystoreWrapper + 91;
            i = i7 % 128;
            if (i7 % 2 != 0) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
            } else {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        boolean currencyIso4217Code;
        int i2 = 2 % 2;
        int i3 = i + 123;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
            int i4 = 45 / 0;
        } else {
            currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
        }
        int i5 = AFKeystoreWrapper + 55;
        i = i5 % 128;
        int i6 = i5 % 2;
        return currencyIso4217Code;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z;
        int i2 = 2 % 2;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            int i3 = i + 79;
            AFKeystoreWrapper = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
                getMonetizationNetwork().copy().getRevenue("log", String.valueOf(z));
                AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
                if (!z) {
                    getMonetizationNetwork().afInfoLog().areAllFieldsValid();
                    return;
                }
                int i4 = AFKeystoreWrapper + 27;
                i = i4 % 128;
                if (i4 % 2 != 0) {
                    getMonetizationNetwork().afInfoLog().getMonetizationNetwork();
                    return;
                } else {
                    getMonetizationNetwork().afInfoLog().getMonetizationNetwork();
                    throw null;
                }
            }
        }
        z = false;
        getMonetizationNetwork().copy().getRevenue("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (!z) {
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String str3;
        int i2 = 2 % 2;
        if (!AFk1wSDK.getCurrencyIso4217Code(str2)) {
            if (str != null) {
                str3 = str.trim();
                int i3 = i + 21;
                AFKeystoreWrapper = i3 % 128;
                int i4 = i3 % 2;
            } else {
                str3 = "";
            }
            AFe1vSDK.getMonetizationNetwork(new AFe1ySDK(str3, str2.trim()));
            int i5 = i + 63;
            AFKeystoreWrapper = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i2 = 2 % 2;
        int i3 = i + 29;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        String AFAdRevenueData = getMonetizationNetwork().AFKeystoreWrapper().AFAdRevenueData();
        if (i4 != 0) {
            int i5 = 24 / 0;
        }
        return AFAdRevenueData;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i2 = 2 % 2;
        int i3 = i + 17;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        AFe1vSDK AFKeystoreWrapper2 = getMonetizationNetwork().AFKeystoreWrapper();
        if (i4 == 0) {
            return AFKeystoreWrapper2.getCurrencyIso4217Code();
        }
        AFKeystoreWrapper2.getCurrencyIso4217Code();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i2) {
        int i3 = 2 % 2;
        int i4 = i + 65;
        AFKeystoreWrapper = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            this.component4 = TimeUnit.SECONDS.toMillis(i2);
            int i5 = AFKeystoreWrapper + 15;
            i = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.component4 = TimeUnit.SECONDS.toMillis(i2);
        obj.hashCode();
        throw null;
    }

    private AFj1tSDK[] component3() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 71;
        i = i3 % 128;
        AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) (i3 % 2 == 0 ? getMonetizationNetwork().AFLogger().getRevenue.toArray(new AFj1tSDK[0]) : getMonetizationNetwork().AFLogger().getRevenue.toArray(new AFj1tSDK[0]));
        int i4 = AFKeystoreWrapper + 107;
        i = i4 % 128;
        int i5 = i4 % 2;
        return aFj1tSDKArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        int i2 = 2 % 2;
        int i3 = i + 3;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        Objects.requireNonNull(pluginInfo);
        getMonetizationNetwork().unregisterClient().getRevenue(pluginInfo);
        int i5 = i + 115;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        int i2 = 2 % 2;
        int i3 = i + 41;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 == 0) {
            Objects.requireNonNull(appsFlyerConsent);
            getMonetizationNetwork().force().component1 = appsFlyerConsent;
        } else {
            Objects.requireNonNull(appsFlyerConsent);
            getMonetizationNetwork().force().component1 = appsFlyerConsent;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        int i2 = 2 % 2;
        AFe1oSDK copydefault = this.copy.copydefault();
        copydefault.getCurrencyIso4217Code.execute(copydefault.new AnonymousClass1(new AFf1ySDK(this.copy, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i3 = i + 111;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
        }
    }

    private static void getRevenue(String str) {
        int i2 = 2 % 2;
        AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '").append(str).append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.").toString());
        int i3 = AFKeystoreWrapper + 99;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 123;
        i = i3 % 128;
        int i4 = i3 % 2;
        AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        int i5 = AFKeystoreWrapper + 113;
        i = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setInstallId(String str) {
        int i2 = 2 % 2;
        getMonetizationNetwork().copy().getRevenue("setInstallId", new String[0]);
        if (!this.hashCode) {
            int i3 = AFKeystoreWrapper + 1;
            i = i3 % 128;
            int i4 = i3 % 2;
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
            return;
        }
        if (!getMonetizationNetwork().AFAdRevenueData().getMediationNetwork("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID")) {
            int i5 = AFKeystoreWrapper + 47;
            i = i5 % 128;
            int i6 = i5 % 2;
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
            int i7 = i + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
            AFKeystoreWrapper = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        if (str == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
            int i9 = i + 75;
            AFKeystoreWrapper = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        AFb1kSDK.getCurrencyIso4217Code(str, getMonetizationNetwork().component4());
        int i11 = AFKeystoreWrapper + 41;
        i = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 87;
        i = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().force().areAllFieldsValid = true;
        int i5 = AFKeystoreWrapper + 111;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    class AFa1zSDK implements AFe1qSDK {
        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getCurrencyIso4217Code(AFe1mSDK<?> aFe1mSDK) {
        }

        AFa1zSDK() {
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getRevenue(AFe1mSDK<?> aFe1mSDK, AFe1uSDK aFe1uSDK) {
            JSONObject monetizationNetwork;
            AFf1aSDK revenue;
            if (aFe1mSDK instanceof AFf1sSDK) {
                AFf1sSDK aFf1sSDK = (AFf1sSDK) aFe1mSDK;
                boolean z = aFe1mSDK instanceof AFf1rSDK;
                if (z && getRevenue()) {
                    AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1mSDK;
                    if (aFf1rSDK.getMonetizationNetwork == AFe1uSDK.SUCCESS || aFf1rSDK.getMediationNetwork == 1) {
                        AFg1kSDK aFg1kSDK = new AFg1kSDK(aFf1rSDK, AFa1ySDK.this.getMonetizationNetwork().component4());
                        AFe1oSDK copydefault = AFa1ySDK.this.getMonetizationNetwork().copydefault();
                        copydefault.getCurrencyIso4217Code.execute(copydefault.new AnonymousClass1(aFg1kSDK));
                    }
                }
                AFh1pSDK afWarnLog = AFa1ySDK.this.getMonetizationNetwork().afWarnLog();
                if (afWarnLog != null && z) {
                    afWarnLog.getMonetizationNetwork((AFf1rSDK) aFe1mSDK, new Function0() { // from class: com.appsflyer.internal.AFa1ySDK$AFa1zSDK$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit mediationNetwork;
                            mediationNetwork = AFa1ySDK.AFa1zSDK.this.getMediationNetwork();
                            return mediationNetwork;
                        }
                    });
                }
                if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                    AFa1ySDK aFa1ySDK = AFa1ySDK.this;
                    aFa1ySDK.getMonetizationNetwork(aFa1ySDK.component2).getRevenue("sentSuccessfully", "true");
                    if (!(aFe1mSDK instanceof AFf1oSDK) && (revenue = new AFg1sSDK(AFa1ySDK.this.component2).getRevenue()) != null && revenue.getMediationNetwork) {
                        String str = revenue.getRevenue;
                        AFLogger.INSTANCE.d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFd1zSDK monetizationNetwork2 = AFa1ySDK.getRevenue().getMonetizationNetwork();
                        AFf1oSDK aFf1oSDK = new AFf1oSDK(str, monetizationNetwork2);
                        AFe1oSDK copydefault2 = monetizationNetwork2.copydefault();
                        copydefault2.getCurrencyIso4217Code.execute(copydefault2.new AnonymousClass1(aFf1oSDK));
                    }
                    ResponseNetwork responseNetwork = ((AFe1fSDK) aFf1sSDK).areAllFieldsValid;
                    if (responseNetwork != null && (monetizationNetwork = AFa1qSDK.getMonetizationNetwork((String) responseNetwork.getBody())) != null) {
                        AFa1ySDK.this.component1 = monetizationNetwork.optBoolean("send_background", false);
                    }
                    if (z) {
                        AFa1ySDK.this.AFAdRevenueData = System.currentTimeMillis();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(aFe1mSDK instanceof AFg1kSDK) || aFe1uSDK == AFe1uSDK.SUCCESS) {
                return;
            }
            AFg1pSDK aFg1pSDK = new AFg1pSDK(AFa1ySDK.this.getMonetizationNetwork());
            AFe1oSDK copydefault3 = AFa1ySDK.this.getMonetizationNetwork().copydefault();
            copydefault3.getCurrencyIso4217Code.execute(copydefault3.new AnonymousClass1(aFg1pSDK));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit getMediationNetwork() {
            AFa1ySDK.this.getMediationNetwork(new AFh1kSDK());
            return Unit.INSTANCE;
        }

        private boolean getRevenue() {
            return AFa1ySDK.this.getRevenue != null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        AFAdRevenueData(context);
        AFh1hSDK aFh1hSDK = new AFh1hSDK();
        aFh1hSDK.areAllFieldsValid = str;
        aFh1hSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
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
            aFh1hSDK.AFAdRevenueData(singletonMap);
        }
        aFh1hSDK.getRevenue = hashMap;
        AFd1oSDK copy = getMonetizationNetwork().copy();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = new JSONObject(aFh1hSDK.getRevenue == null ? new HashMap() : aFh1hSDK.getRevenue).toString();
        copy.getRevenue("logEvent", strArr);
        if (str == null) {
            getRevenue(new Object[]{this, context, AFh1tSDK.logEvent}, -268043806, 268043817, System.identityHashCode(this));
        }
        getCurrencyIso4217Code(aFh1hSDK, (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this)));
    }

    static void component2() {
        AFLogger = new char[]{35848, 35853, 35850, 35871, 35840, 35844, 35852, 35870, 35867};
        registerClient = 1912311211;
        AFInAppEventParameterName = true;
        AFInAppEventType = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork(AFd1zSDK aFd1zSDK) {
        getRevenue(new Object[]{aFd1zSDK}, 757923489, -757923475, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        getRevenue(new Object[]{this, aFh1mSDK}, -316162006, 316162006, System.identityHashCode(this));
    }

    private static void copydefault() {
        getRevenue(new Object[0], -516060765, 516060769, (int) System.currentTimeMillis());
    }

    public static SharedPreferences d_(Context context) {
        return (SharedPreferences) getRevenue(new Object[]{context}, 1916447333, -1916447320, (int) System.currentTimeMillis());
    }

    private static void getMonetizationNetwork(String str) {
        getRevenue(new Object[]{str}, -374487647, 374487663, (int) System.currentTimeMillis());
    }

    private static void areAllFieldsValid(Context context) {
        getRevenue(new Object[]{context}, 750744286, -750744267, (int) System.currentTimeMillis());
    }

    private AFh1qSDK getMediationNetwork(Context context) {
        return (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this));
    }

    private void getMediationNetwork(Context context, AFh1tSDK aFh1tSDK) {
        getRevenue(new Object[]{this, context, aFh1tSDK}, -268043806, 268043817, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        getRevenue(new Object[]{this, str}, -1717702056, 1717702064, System.identityHashCode(this));
    }

    public static String getMediationNetwork() {
        return (String) getRevenue(new Object[0], 131288073, -131288051, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        getRevenue(new Object[]{this, context, str}, -973034294, 973034299, System.identityHashCode(this));
    }

    private void getMonetizationNetwork(AFi1hSDK aFi1hSDK) {
        getRevenue(new Object[]{this, aFi1hSDK}, 608861720, -608861711, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        getRevenue(new Object[]{this, Boolean.valueOf(z)}, -1241724786, 1241724809, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        getRevenue(new Object[]{this, Boolean.valueOf(z)}, -312979490, 312979496, System.identityHashCode(this));
    }

    private static void AFAdRevenueData(String str, boolean z) {
        getRevenue(new Object[]{str, Boolean.valueOf(z)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        getRevenue(new Object[]{this, Boolean.valueOf(z)}, -451136324, 451136331, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getRevenue(new Object[]{this, context, str}, -38035383, 38035401, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        getRevenue(new Object[]{this, context}, 537134056, -537134032, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        getRevenue(new Object[]{this, Boolean.valueOf(z), context}, -1981102572, 1981102584, System.identityHashCode(this));
    }

    public final void AFAdRevenueData(Context context, String str) {
        getRevenue(new Object[]{this, context, str}, 1454368071, -1454368056, System.identityHashCode(this));
    }

    public final void b_(Context context, Intent intent) {
        getRevenue(new Object[]{this, context, intent}, -1498667330, 1498667350, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        getRevenue(new Object[]{this, str, map}, 252063752, -252063751, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        getRevenue(new Object[]{this, context, map, purchaseValidationCallback}, 1567165248, -1567165246, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        getRevenue(new Object[]{this}, -1362959156, 1362959177, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        getRevenue(new Object[]{this, strArr}, 1586087259, -1586087256, System.identityHashCode(this));
    }
}
