package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.android.billingclient.api.BillingClient;
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
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFe1lSDK.AnonymousClass5;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1l;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.b9;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
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
public final class AFa1tSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    static AppsFlyerInAppPurchaseValidatorListener AFAdRevenueData = null;
    private static int AFInAppEventParameterName = 0;
    private static int AFInAppEventType = 1;
    private static int[] AFKeystoreWrapper;
    private static AFa1tSDK areAllFieldsValid;
    public static final String getMonetizationNetwork;
    public static final String getRevenue;
    Application component1;
    private Map<Long, String> copydefault;
    private AFf1mSDK equals;
    private SharedPreferences hashCode;
    private boolean toString;
    public volatile AppsFlyerConversionListener getCurrencyIso4217Code = null;
    private long component2 = -1;
    long getMediationNetwork = -1;
    private long component3 = TimeUnit.SECONDS.toMillis(5);
    boolean component4 = false;
    private final AFc1eSDK copy = new AFc1eSDK();

    /* renamed from: com.appsflyer.internal.AFa1tSDK$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getRevenue = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getRevenue[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class AFa1ySDK implements Runnable {
        private final AFh1rSDK getCurrencyIso4217Code;

        AFa1ySDK(AFh1rSDK aFh1rSDK) {
            this.getCurrencyIso4217Code = aFh1rSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFa1tSDK aFa1tSDK = AFa1tSDK.this;
            AFa1tSDK.getMonetizationNetwork(new Object[]{aFa1tSDK, this.getCurrencyIso4217Code}, 974724333, -974724320, System.identityHashCode(aFa1tSDK));
        }
    }

    static {
        areAllFieldsValid();
        getMonetizationNetwork = "348";
        getRevenue = "6.17";
        AFAdRevenueData = null;
        areAllFieldsValid = new AFa1tSDK();
        AFInAppEventType = (AFInAppEventParameterName + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    public AFa1tSDK() {
        AFAdRevenueData().v().AFAdRevenueData();
        AFAdRevenueData().v().getMonetizationNetwork();
        AFe1lSDK copydefault = AFAdRevenueData().copydefault();
        copydefault.AFAdRevenueData.add(new AFa1vSDK());
    }

    private static /* synthetic */ Object AFLogger(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i4 = AFInAppEventParameterName + 69;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setUserEmails", strArr);
            aFa1tSDK.setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            return null;
        }
        aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setUserEmails", strArr);
        aFa1tSDK.setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r5 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r5 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        boolean z4 = false;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i4 = AFInAppEventParameterName + 29;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(booleanValue)));
            int i5 = 66 / 0;
        } else {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(booleanValue)));
        }
        AFb1jSDK.getRevenue = Boolean.valueOf(z4);
        AFc1dSDK AFAdRevenueData2 = aFa1tSDK.AFAdRevenueData();
        AFAdRevenueData2.afInfoLog().areAllFieldsValid = booleanValue;
        if (booleanValue) {
            AFAdRevenueData2.afInfoLog().component3 = null;
            return null;
        }
        AFe1lSDK copydefault = AFAdRevenueData2.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass5(new AFe1eSDK(aFa1tSDK.AFAdRevenueData())));
        int i6 = AFInAppEventParameterName + 57;
        AFInAppEventType = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static synchronized SharedPreferences c_(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (AFa1tSDK.class) {
            try {
                AFInAppEventParameterName = (AFInAppEventType + 63) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).hashCode == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        ((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).hashCode = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        AFInAppEventParameterName = (AFInAppEventType + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
                sharedPreferences = ((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).hashCode;
                AFInAppEventParameterName = (AFInAppEventType + InterfaceC1490j3.d.b.f16812d) % UserVerificationMethods.USER_VERIFY_PATTERN;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        if ((r4 instanceof android.app.Activity) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if ((r4 instanceof android.app.Activity) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        r0 = new com.appsflyer.internal.AFh1qSDK((android.app.Activity) r4, AFAdRevenueData().w());
        r4 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 105;
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r4 % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFh1qSDK component1(Context context) {
        int i4 = AFInAppEventType + 9;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        AppsFlyerProperties.EmailsCryptType emailsCryptType = (AppsFlyerProperties.EmailsCryptType) objArr[1];
        String[] strArr = (String[]) objArr[2];
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            AFInAppEventType = (AFInAppEventParameterName + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (AnonymousClass3.getRevenue[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1cSDK.getMonetizationNetwork(str2));
                AFInAppEventParameterName = (AFInAppEventType + InterfaceC1490j3.d.b.f16817i) % UserVerificationMethods.USER_VERIFY_PATTERN;
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
        int i4 = AFInAppEventParameterName + 87;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        String str;
        final AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        String str2 = (String) objArr[1];
        AppsFlyerConversionListener appsFlyerConversionListener = (AppsFlyerConversionListener) objArr[2];
        Context context = (Context) objArr[3];
        int i4 = AFInAppEventType + 117;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            boolean z4 = aFa1tSDK.toString;
            throw null;
        }
        if (aFa1tSDK.toString) {
            return aFa1tSDK;
        }
        aFa1tSDK.toString = true;
        aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData(str2);
        if (context != null) {
            AFInAppEventType = (AFInAppEventParameterName + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
            aFa1tSDK.getMediationNetwork(context);
            Application O_ = AFj1iSDK.O_(context);
            if (O_ == null) {
                return aFa1tSDK;
            }
            aFa1tSDK.component1 = O_;
            aFa1tSDK.AFAdRevenueData().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.a
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1tSDK.this.equals();
                }
            });
            aFa1tSDK.AFAdRevenueData().areAllFieldsValid().getMediationNetwork = System.currentTimeMillis();
            AFe1lSDK copydefault = aFa1tSDK.AFAdRevenueData().copydefault();
            copydefault.getRevenue.execute(copydefault.new AnonymousClass5(new AFe1eSDK(aFa1tSDK.AFAdRevenueData())));
            AFi1tSDK i5 = aFa1tSDK.AFAdRevenueData().i();
            i5.getMediationNetwork = Build.VERSION.SDK_INT >= 31 ? new AFi1sSDK(i5.getCurrencyIso4217Code) : new AFi1qSDK(i5.getCurrencyIso4217Code);
            aFa1tSDK.AFAdRevenueData().afRDLog().AFAdRevenueData(new AFd1vSDK.AFa1ySDK() { // from class: com.appsflyer.internal.b
                @Override // com.appsflyer.internal.AFd1vSDK.AFa1ySDK
                public final void onConfigurationChanged(boolean z5) {
                    AFa1tSDK.this.getMonetizationNetwork(z5);
                }
            });
            aFa1tSDK.AFAdRevenueData().component1().getCurrencyIso4217Code(aFa1tSDK.getMonetizationNetwork());
            AFj1sSDK AFLogger = aFa1tSDK.AFAdRevenueData().AFLogger();
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1tSDK.this.copydefault();
                }
            };
            AFi1aSDK AFAdRevenueData2 = AFLogger.AFAdRevenueData(runnable);
            Runnable AFAdRevenueData3 = AFLogger.AFAdRevenueData(AFAdRevenueData2, runnable);
            AFLogger.getMediationNetwork(AFAdRevenueData2);
            AFLogger.getMediationNetwork(new AFj1oSDK(AFLogger.getMediationNetwork.getRevenue(), AFAdRevenueData3));
            AFLogger.getMediationNetwork(new AFj1vSDK(AFAdRevenueData3, AFLogger.getMediationNetwork, new AFj1wSDK()));
            AFLogger.getMediationNetwork(new AFj1tSDK(AFAdRevenueData3, AFLogger.getMediationNetwork));
            AFLogger.getMediationNetwork(new AFj1uSDK(AFLogger.getMediationNetwork.getMonetizationNetwork(), AFLogger.getMediationNetwork.getRevenue(), AFAdRevenueData3));
            AFLogger.getMediationNetwork(AFAdRevenueData3);
            if (!AFLogger.getMonetizationNetwork()) {
                Context context2 = AFLogger.getMediationNetwork.AFInAppEventType().getMonetizationNetwork;
                AFc1dSDK aFc1dSDK = AFLogger.getMediationNetwork;
                List<ResolveInfo> queryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
                    while (it.hasNext()) {
                        AFInAppEventParameterName = (AFInAppEventType + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        ProviderInfo providerInfo = it.next().providerInfo;
                        if (providerInfo != null) {
                            arrayList.add(new AFj1rSDK(providerInfo, AFAdRevenueData3, aFc1dSDK));
                        } else {
                            AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AFLogger.getCurrencyIso4217Code.addAll(arrayList);
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
                        StringBuilder sb = new StringBuilder("Detected ");
                        sb.append(arrayList.size());
                        sb.append(" valid preinstall provider(s)");
                        aFLogger.d(aFg1cSDK, sb.toString());
                    }
                }
            }
            for (AFj1qSDK aFj1qSDK : AFLogger.getRevenue()) {
                AFInAppEventType = (AFInAppEventParameterName + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
                aFj1qSDK.getRevenue(AFLogger.getMediationNetwork.AFInAppEventType().getMonetizationNetwork);
            }
            aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData(aFa1tSDK.AFAdRevenueData().getRevenue());
            if (aFa1tSDK.AFAdRevenueData().afWarnLog().getCurrencyIso4217Code()) {
                aFa1tSDK.AFAdRevenueData().afWarnLog().getMediationNetwork();
            }
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFd1pSDK copy = aFa1tSDK.AFAdRevenueData().copy();
        if (appsFlyerConversionListener == null) {
            str = "null";
        } else {
            AFInAppEventParameterName = (AFInAppEventType + InterfaceC1490j3.d.b.f16810b) % UserVerificationMethods.USER_VERIFY_PATTERN;
            str = "conversionDataListener";
        }
        copy.getMediationNetwork(b9.a.f15292f, str2, str);
        AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.17.0", getMonetizationNetwork));
        aFa1tSDK.getCurrencyIso4217Code = appsFlyerConversionListener;
        return aFa1tSDK;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        String str = (String) objArr[1];
        Map<String, String> map = (Map) objArr[2];
        AFInAppEventType = (AFInAppEventParameterName + 123) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFa1oSDK d4 = aFa1tSDK.AFAdRevenueData().d();
        d4.getCurrencyIso4217Code = str;
        d4.getRevenue = map;
        int i4 = AFInAppEventParameterName + InterfaceC1490j3.d.b.f16812d;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        Map<String, Object> map = (Map) objArr[3];
        AFh1fSDK aFh1fSDK = new AFh1fSDK();
        aFh1fSDK.areAllFieldsValid = str;
        aFh1fSDK.getMonetizationNetwork = map;
        aFa1tSDK.getMonetizationNetwork(aFh1fSDK, aFa1tSDK.component1(context));
        int i4 = AFInAppEventParameterName + 15;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        int i4 = AFInAppEventParameterName + 1;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            aFa1tSDK.AFAdRevenueData().afDebugLog().AFAdRevenueData();
            throw null;
        }
        aFa1tSDK.AFAdRevenueData().afDebugLog().AFAdRevenueData();
        AFInAppEventParameterName = (AFInAppEventType + 17) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d_(Context context, Intent intent) {
        getMonetizationNetwork(new Object[]{this, context, intent}, 507699176, -507699170, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() {
        AFInAppEventType = (AFInAppEventParameterName + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFAdRevenueData().AFInAppEventParameterName().AFAdRevenueData();
        component2();
        int i4 = AFInAppEventType + 17;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(AFf1nSDK aFf1nSDK) {
        AFInAppEventParameterName = (AFInAppEventType + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFc1dSDK AFAdRevenueData2 = AFAdRevenueData();
        if (aFf1nSDK == AFf1nSDK.SUCCESS) {
            int i4 = AFInAppEventParameterName + 75;
            AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                AFAdRevenueData2.afRDLog().getCurrencyIso4217Code();
                throw null;
            }
            AFAdRevenueData2.afRDLog().getCurrencyIso4217Code();
        }
        if (!(!AFAdRevenueData2.copy().getMonetizationNetwork())) {
            AFAdRevenueData2.v().AFAdRevenueData();
        } else {
            AFInAppEventParameterName = (AFInAppEventType + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFAdRevenueData2.v().getMediationNetwork();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getRevenue(AFc1dSDK aFc1dSDK) {
        int i4 = AFInAppEventParameterName + 95;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i5 = i4 % 2;
        aFc1dSDK.AFInAppEventParameterName().getMediationNetwork();
        if (i5 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        AFh1iSDK aFh1iSDK = new AFh1iSDK();
        aFa1tSDK.getMediationNetwork(context);
        aFh1iSDK.areAllFieldsValid = null;
        aFh1iSDK.getMonetizationNetwork = null;
        aFh1iSDK.component3 = str;
        aFh1iSDK.getMediationNetwork = null;
        aFa1tSDK.AFAdRevenueData(aFh1iSDK);
        int i4 = AFInAppEventParameterName + InterfaceC1490j3.d.b.f16810b;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        AFInAppEventParameterName = (AFInAppEventType + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
        aFa1tSDK.start(context, str, null);
        int i4 = AFInAppEventParameterName + 65;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final AFc1dSDK AFAdRevenueData() {
        int i4 = AFInAppEventParameterName;
        AFc1eSDK aFc1eSDK = this.copy;
        int i5 = i4 + 85;
        AFInAppEventType = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return aFc1eSDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        AFInAppEventParameterName = (AFInAppEventType + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = AFAdRevenueData().d().getMediationNetwork;
        if (!list.contains(asList)) {
            list.add(asList);
        }
        AFInAppEventType = (AFInAppEventParameterName + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z4) {
        int i4 = AFInAppEventType + 1;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            AFd1pSDK copy = AFAdRevenueData().copy();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z4);
            copy.getMediationNetwork("anonymizeUser", strArr);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("anonymizeUser", String.valueOf(z4));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z4);
        AFInAppEventParameterName = (AFInAppEventType + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        getMonetizationNetwork(new Object[]{this, str, map}, 1307261109, -1307261102, System.identityHashCode(this));
    }

    public final void b_(Context context, Intent intent) {
        AFj1jSDK aFj1jSDK = new AFj1jSDK(intent);
        if (aFj1jSDK.getRevenue("appsflyer_preinstall") != null) {
            getMonetizationNetwork(new Object[]{aFj1jSDK.getRevenue("appsflyer_preinstall")}, 998031041, -998031039, (int) System.currentTimeMillis());
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String revenue = aFj1jSDK.getRevenue("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(revenue)));
        if (revenue != null) {
            int i4 = AFInAppEventParameterName + 41;
            AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                getRevenue(context).getMediationNetwork("referrer", revenue);
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                appsFlyerProperties.set("AF_REFERRER", revenue);
                appsFlyerProperties.getMediationNetwork = revenue;
                AppsFlyerProperties.getInstance().AFAdRevenueData();
                throw null;
            }
            getRevenue(context).getMediationNetwork("referrer", revenue);
            AppsFlyerProperties appsFlyerProperties2 = AppsFlyerProperties.getInstance();
            appsFlyerProperties2.set("AF_REFERRER", revenue);
            appsFlyerProperties2.getMediationNetwork = revenue;
            if (AppsFlyerProperties.getInstance().AFAdRevenueData()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                getCurrencyIso4217Code(context, AFh1xSDK.onReceive);
                getMediationNetwork(revenue);
            }
        }
        int i5 = AFInAppEventType + 63;
        AFInAppEventParameterName = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        getMonetizationNetwork(new Object[]{this}, -2040336732, 2040336751, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z4) {
        int i4 = AFInAppEventParameterName + 107;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            AFAdRevenueData().e().getCurrencyIso4217Code(z4);
            throw null;
        }
        AFAdRevenueData().e().getCurrencyIso4217Code(z4);
        int i5 = AFInAppEventType + 1;
        AFInAppEventParameterName = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z4) {
        int i4 = AFInAppEventParameterName + 43;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            getMonetizationNetwork(new Object[]{AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z4)}, -692563571, 692563575, (int) System.currentTimeMillis());
        } else {
            getMonetizationNetwork(new Object[]{AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z4)}, -692563571, 692563575, (int) System.currentTimeMillis());
            int i5 = 36 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        getMediationNetwork(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004e, code lost:
    
        return com.appsflyer.internal.AFb1iSDK.getRevenue(AFAdRevenueData().getRevenue().getMonetizationNetwork);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        r4 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 69;
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r4 % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getAppsFlyerUID(Context context) {
        int i4 = AFInAppEventParameterName + InterfaceC1490j3.d.b.f16812d;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            AFAdRevenueData().copy().getMediationNetwork("getAppsFlyerUID", new String[0]);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("getAppsFlyerUID", new String[0]);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        return (String) getMonetizationNetwork(new Object[]{this, context}, -1689317276, 1689317287, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        AFInAppEventType = (AFInAppEventParameterName + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String mediationNetwork = AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork();
        AFInAppEventType = (AFInAppEventParameterName + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return mediationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        AFInAppEventParameterName = (AFInAppEventType + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String currencyIso4217Code = AFAdRevenueData().AFKeystoreWrapper().getCurrencyIso4217Code();
        int i4 = AFInAppEventParameterName + 67;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    public final void getMediationNetwork(Context context) {
        int i4 = AFInAppEventType;
        AFInAppEventParameterName = (i4 + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFc1eSDK aFc1eSDK = this.copy;
        if (context != null) {
            int i5 = (i4 + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFInAppEventParameterName = i5;
            AFc1iSDK aFc1iSDK = aFc1eSDK.AFAdRevenueData;
            if (context != null) {
                AFInAppEventType = (i5 + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
                aFc1iSDK.getMonetizationNetwork = context.getApplicationContext();
                AFInAppEventType = (AFInAppEventParameterName + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
    }

    final synchronized AFf1mSDK getMonetizationNetwork() {
        try {
            int i4 = AFInAppEventType + 17;
            AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (this.equals == null) {
                this.equals = new AFf1mSDK() { // from class: com.appsflyer.internal.d
                    @Override // com.appsflyer.internal.AFf1mSDK
                    public final void onRemoteConfigUpdateFinished(AFf1nSDK aFf1nSDK) {
                        AFa1tSDK.this.getCurrencyIso4217Code(aFf1nSDK);
                    }
                };
                AFInAppEventParameterName = (AFInAppEventType + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.equals;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        AFInAppEventParameterName = (AFInAppEventType + BuildConfig.API_LEVEL) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            AFInAppEventType = (AFInAppEventParameterName + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return string;
        }
        String revenue = getRevenue(context, "AF_STORE");
        if (revenue == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i4 = AFInAppEventParameterName + 99;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return revenue;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i4 = AFInAppEventParameterName + 97;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            AFAdRevenueData().copy().getMediationNetwork("getSdkVersion", new String[1]);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("getSdkVersion", new String[0]);
        }
        String component1 = AFc1pSDK.component1();
        AFInAppEventParameterName = (AFInAppEventType + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return component1;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        return (AppsFlyerLib) getMonetizationNetwork(new Object[]{this, str, appsFlyerConversionListener, context}, -235242605, 235242617, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        int i4 = AFInAppEventParameterName + 77;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            getMediationNetwork(context);
            AFAdRevenueData().getRevenue();
            return AFc1pSDK.AFAdRevenueData(context);
        }
        getMediationNetwork(context);
        AFAdRevenueData().getRevenue();
        AFc1pSDK.AFAdRevenueData(context);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        return ((Boolean) getMonetizationNetwork(new Object[]{this}, -1621727139, 1621727154, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        AFInAppEventType = (AFInAppEventParameterName + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (!this.toString) {
            AFAdRevenueData("logAdRevenue");
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            int i4 = AFInAppEventType + 81;
            AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                throw null;
            }
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
            AFInAppEventType = (AFInAppEventParameterName + InterfaceC1490j3.d.b.f16817i) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return;
        }
        if (AFAdRevenueData().registerClient().AFAdRevenueData()) {
            AFInAppEventParameterName = (AFInAppEventType + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
        } else {
            if (!AFk1ySDK.getMediationNetwork(AFAdRevenueData().registerClient().getMediationNetwork())) {
                AFAdRevenueData(new AFh1lSDK(aFAdRevenueData, map));
                return;
            }
            AFInAppEventParameterName = (AFInAppEventType + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
            copy();
            int i5 = AFInAppEventParameterName + 51;
            AFInAppEventType = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 == 0) {
                int i6 = 27 / 0;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        AFInAppEventParameterName = (AFInAppEventType + InterfaceC1490j3.d.b.f16812d) % UserVerificationMethods.USER_VERIFY_PATTERN;
        logEvent(context, str, map, null);
        int i4 = AFInAppEventType + 57;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d4, double d5) {
        AFAdRevenueData().copy().getMediationNetwork("logLocation", String.valueOf(d4), String.valueOf(d5));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d5));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d4));
        getMonetizationNetwork(new Object[]{this, context, AFInAppEventType.LOCATION_COORDINATES, hashMap}, 1732368696, -1732368678, System.identityHashCode(this));
        int i4 = AFInAppEventParameterName + 93;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        AFInAppEventParameterName = (AFInAppEventType + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFAdRevenueData().copy().getMediationNetwork("logSession", new String[0]);
        AFAdRevenueData().copy().getCurrencyIso4217Code();
        getCurrencyIso4217Code(context, AFh1xSDK.logSession);
        getMonetizationNetwork(new Object[]{this, context, null, null}, 1732368696, -1732368678, System.identityHashCode(this));
        int i4 = AFInAppEventParameterName + 87;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        getMonetizationNetwork(new Object[]{this, context}, -1480636038, 1480636052, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r5 = AFAdRevenueData().d();
        r0 = new java.lang.StringBuilder("Context is \"");
        r0.append(r4);
        r0.append("\"");
        r5.AFAdRevenueData(r0.toString(), com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        getMediationNetwork(r4);
        AFAdRevenueData().d().f_(com.appsflyer.internal.AFa1jSDK.getCurrencyIso4217Code(AFAdRevenueData().afVerboseLog()), android.net.Uri.parse(r5.toString()));
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = (com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 113) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0015, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r5.toString().isEmpty() == false) goto L11;
     */
    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performOnAppAttribution(Context context, URI uri) {
        int i4 = AFInAppEventParameterName + 35;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        AFa1oSDK d4 = AFAdRevenueData().d();
        StringBuilder sb = new StringBuilder("Link is \"");
        sb.append(uri);
        sb.append("\"");
        d4.AFAdRevenueData(sb.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(final Intent intent, Context context) {
        int i4 = AFInAppEventType;
        int i5 = i4 + 55;
        AFInAppEventParameterName = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (intent == null) {
            AFAdRevenueData().d().AFAdRevenueData("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context == null) {
            AFInAppEventParameterName = (i4 + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFAdRevenueData().d().AFAdRevenueData("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        getMediationNetwork(applicationContext);
        AFAdRevenueData().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.f
            @Override // java.lang.Runnable
            public final void run() {
                AFa1tSDK.this.d_(applicationContext, intent);
            }
        });
        int i6 = AFInAppEventType + 59;
        AFInAppEventParameterName = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i4 = AFInAppEventType + 79;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            AFAdRevenueData().copy().getMediationNetwork("registerConversionListener", new String[0]);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("registerConversionListener", new String[0]);
        }
        getRevenue(appsFlyerConversionListener);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        AFAdRevenueData().copy().getMediationNetwork("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            AFAdRevenueData = appsFlyerInAppPurchaseValidatorListener;
            AFInAppEventParameterName = (AFInAppEventType + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return;
        }
        int i4 = AFInAppEventParameterName + 25;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
        } else {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r0 = new com.appsflyer.internal.AFe1cSDK(r5, r6, r4.getCurrencyIso4217Code);
        r4 = r4.getRevenue;
        r4.getRevenue.execute(new com.appsflyer.internal.AFe1lSDK.AnonymousClass5(r4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r4.AFAdRevenueData(r5, r6, com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1l.getPackageName) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r4.AFAdRevenueData(r5, r6, r2) != false) goto L9;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler component4;
        int i4 = AFInAppEventParameterName + InterfaceC1490j3.d.b.f16810b;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            getMediationNetwork(context);
            component4 = AFAdRevenueData().component4();
            String[] strArr = new String[0];
            strArr[0] = AFPurchaseConnectorA1l.getPackageName;
        } else {
            getMediationNetwork(context);
            component4 = AFAdRevenueData().component4();
        }
        int i5 = AFInAppEventParameterName + 27;
        AFInAppEventType = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r4.AFAdRevenueData(r5, r6, com.android.billingclient.api.BillingClient.FeatureType.SUBSCRIPTIONS) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r4.AFAdRevenueData(r5, r6, r0) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        r0 = new com.appsflyer.internal.AFe1hSDK(r5, r6, r4.getCurrencyIso4217Code);
        r4 = r4.getRevenue;
        r4.getRevenue.execute(new com.appsflyer.internal.AFe1lSDK.AnonymousClass5(r4, r0));
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler component4;
        int i4 = AFInAppEventParameterName + 43;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            getMediationNetwork(context);
            component4 = AFAdRevenueData().component4();
            String[] strArr = new String[0];
            strArr[1] = BillingClient.FeatureType.SUBSCRIPTIONS;
        } else {
            getMediationNetwork(context);
            component4 = AFAdRevenueData().component4();
        }
        AFInAppEventParameterName = (AFInAppEventType + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0083  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        String mediationNetwork;
        long j4;
        long j5;
        if (activity != null) {
            AFInAppEventType = (AFInAppEventParameterName + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (activity.getIntent() != null) {
                AFd1pSDK copy = AFAdRevenueData().copy();
                String localClassName = activity.getLocalClassName();
                StringBuilder sb = new StringBuilder("activity_intent_");
                sb.append(activity.getIntent().toString());
                copy.getMediationNetwork("sendPushNotificationData", localClassName, sb.toString());
                AFc1kSDK afInfoLog = AFAdRevenueData().afInfoLog();
                mediationNetwork = getMediationNetwork(activity);
                afInfoLog.getCurrencyIso4217Code = mediationNetwork;
                if (mediationNetwork == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (this.copydefault == null) {
                        AFLogger.afInfoLog("pushes: initializing pushes history..");
                        this.copydefault = new ConcurrentHashMap();
                        j5 = currentTimeMillis;
                        j4 = j5;
                    } else {
                        try {
                            long j6 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                            j5 = currentTimeMillis;
                            for (Long l4 : this.copydefault.keySet()) {
                                try {
                                    JSONObject jSONObject = new JSONObject(afInfoLog.getCurrencyIso4217Code);
                                    JSONObject jSONObject2 = new JSONObject(this.copydefault.get(l4));
                                    j4 = currentTimeMillis;
                                    try {
                                        if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                            StringBuilder sb2 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                            sb2.append(jSONObject2);
                                            sb2.append(", new: ");
                                            sb2.append(jSONObject);
                                            sb2.append(")");
                                            AFLogger.afInfoLog(sb2.toString());
                                            afInfoLog.getCurrencyIso4217Code = null;
                                            return;
                                        }
                                        if (j4 - l4.longValue() > j6) {
                                            this.copydefault.remove(l4);
                                        }
                                        if (l4.longValue() <= j5) {
                                            j5 = l4.longValue();
                                        }
                                        AFInAppEventType = (AFInAppEventParameterName + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                        currentTimeMillis = j4;
                                    } catch (Throwable th) {
                                        th = th;
                                        StringBuilder sb3 = new StringBuilder("Error while handling push notification measurement: ");
                                        sb3.append(th.getClass().getSimpleName());
                                        AFLogger.afErrorLog(sb3.toString(), th);
                                        if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                                        }
                                        this.copydefault.put(Long.valueOf(j4), afInfoLog.getCurrencyIso4217Code);
                                        start(activity);
                                        AFInAppEventParameterName = (AFInAppEventType + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    j4 = currentTimeMillis;
                                }
                            }
                            j4 = currentTimeMillis;
                        } catch (Throwable th3) {
                            th = th3;
                            j4 = currentTimeMillis;
                            j5 = j4;
                        }
                    }
                    if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                        StringBuilder sb4 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                        sb4.append(j5);
                        sb4.append(")");
                        AFLogger.afInfoLog(sb4.toString());
                        this.copydefault.remove(Long.valueOf(j5));
                    }
                    this.copydefault.put(Long.valueOf(j4), afInfoLog.getCurrencyIso4217Code);
                    start(activity);
                    AFInAppEventParameterName = (AFInAppEventType + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    return;
                }
                return;
            }
        }
        if (activity != null) {
            AFInAppEventType = (AFInAppEventParameterName + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFAdRevenueData().copy().getMediationNetwork("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            AFAdRevenueData().copy().getMediationNetwork("sendPushNotificationData", "activity_null");
        }
        AFc1kSDK afInfoLog2 = AFAdRevenueData().afInfoLog();
        mediationNetwork = getMediationNetwork(activity);
        afInfoLog2.getCurrencyIso4217Code = mediationNetwork;
        if (mediationNetwork == null) {
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, map}, -2145945282, 2145945283, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFAdRevenueData().copy().getMediationNetwork("setAndroidIdData", str);
        AFAdRevenueData().afInfoLog().AFAdRevenueData = str;
        int i4 = AFInAppEventType + 41;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFAdRevenueData().copy().getMediationNetwork("setAppId", str);
        getMonetizationNetwork(new Object[]{"appid", str}, -692563571, 692563575, (int) System.currentTimeMillis());
        AFInAppEventType = (AFInAppEventParameterName + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
    
        if (r7.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005a, code lost:
    
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_DOMAIN);
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_VERSION);
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_SCHEME);
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = (com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 29) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAppInviteOneLink(String str) {
        int i4 = AFInAppEventType + 15;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            AFd1pSDK copy = AFAdRevenueData().copy();
            String[] strArr = new String[1];
            strArr[1] = str;
            copy.getMediationNetwork("setAppInviteOneLink", strArr);
            AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        } else {
            AFAdRevenueData().copy().getMediationNetwork("setAppInviteOneLink", str);
            AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        }
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.ONELINK_ID, str}, -692563571, 692563575, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z4) {
        AFInAppEventParameterName = (AFInAppEventType + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFAdRevenueData().copy().getMediationNetwork("setCollectAndroidID", String.valueOf(z4));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z4)}, -692563571, 692563575, (int) System.currentTimeMillis());
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z4)}, -692563571, 692563575, (int) System.currentTimeMillis());
        int i4 = AFInAppEventType + InterfaceC1490j3.d.b.f16815g;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z4) {
        AFInAppEventType = (AFInAppEventParameterName + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFAdRevenueData().copy().getMediationNetwork("setCollectIMEI", String.valueOf(z4));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z4)}, -692563571, 692563575, (int) System.currentTimeMillis());
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z4)}, -692563571, 692563575, (int) System.currentTimeMillis());
        int i4 = AFInAppEventType + 117;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z4) {
        AFInAppEventType = (AFInAppEventParameterName + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFAdRevenueData().copy().getMediationNetwork("setCollectOaid", String.valueOf(z4));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z4)}, -692563571, 692563575, (int) System.currentTimeMillis());
        int i4 = AFInAppEventType + 85;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        AFInAppEventParameterName = (AFInAppEventType + 77) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Objects.requireNonNull(appsFlyerConsent);
        AFAdRevenueData().afInfoLog().component2 = appsFlyerConsent;
        AFInAppEventType = (AFInAppEventParameterName + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFAdRevenueData().copy().getMediationNetwork("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        AFInAppEventType = (AFInAppEventParameterName + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        if (context != null) {
            if (!getMediationNetwork()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component2());
            getCurrencyIso4217Code(context, AFh1xSDK.setCustomerIdAndLogSession);
            AFAdRevenueData().registerClient().getMediationNetwork();
            if (referrer == null) {
                AFInAppEventType = (AFInAppEventParameterName + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
                referrer = "";
            }
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
                AFInAppEventType = (AFInAppEventParameterName + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            getMonetizationNetwork(new Object[]{this, context, referrer}, 1659672083, -1659672066, System.identityHashCode(this));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFAdRevenueData().copy().getMediationNetwork("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.APP_USER_ID, str}, -692563571, 692563575, (int) System.currentTimeMillis());
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        AFInAppEventParameterName = (AFInAppEventType + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z4) {
        AFLogger.LogLevel logLevel;
        AFInAppEventType = (AFInAppEventParameterName + BuildConfig.API_LEVEL) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (z4) {
            logLevel = AFLogger.LogLevel.DEBUG;
            AFInAppEventParameterName = (AFInAppEventType + InterfaceC1490j3.d.b.f16810b) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z4) {
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(z4)}, 2015599714, -2015599705, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z4) {
        AFInAppEventType = (AFInAppEventParameterName + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z4)));
        getCurrencyIso4217Code(AppsFlyerProperties.DISABLE_NETWORK_DATA, z4);
        AFInAppEventParameterName = (AFInAppEventType + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i4 = AFInAppEventParameterName + InterfaceC1490j3.d.b.f16810b;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            AFd1pSDK copy = AFAdRevenueData().copy();
            String[] strArr = new String[0];
            strArr[0] = str;
            copy.getMediationNetwork("setExtension", strArr);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i5 = AFInAppEventParameterName + 1;
        AFInAppEventType = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        AFInAppEventType = (AFInAppEventParameterName + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (AFk1ySDK.getCurrencyIso4217Code(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i4 = AFInAppEventType + 27;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            throw null;
        }
        AFe1zSDK.getMediationNetwork(new AFe1vSDK(str != null ? str.trim() : "", str2.trim()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFAdRevenueData().copy().getMediationNetwork("setImeiData", str);
        AFAdRevenueData().registerClient().getMediationNetwork(str);
        AFInAppEventType = (AFInAppEventParameterName + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setInstallId(String str) {
        AFAdRevenueData().copy().getMediationNetwork("setInstallId", new String[0]);
        if (!this.toString) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
            return;
        }
        if (!AFAdRevenueData().getRevenue().getMonetizationNetwork("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID", false)) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
            return;
        }
        if (str == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
            AFInAppEventParameterName = (AFInAppEventType + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return;
        }
        AFb1iSDK.getCurrencyIso4217Code(str, AFAdRevenueData().component2());
        int i4 = AFInAppEventType + 25;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z4) {
        int i4 = AFInAppEventParameterName + 31;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            AFd1pSDK copy = AFAdRevenueData().copy();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z4);
            copy.getMediationNetwork("setIsUpdate", strArr);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("setIsUpdate", String.valueOf(z4));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z4);
        AFInAppEventType = (AFInAppEventParameterName + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z4;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            z4 = true;
        } else {
            AFInAppEventType = (AFInAppEventParameterName + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
            z4 = false;
        }
        AFAdRevenueData().copy().getMediationNetwork("log", String.valueOf(z4));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z4) {
            AFAdRevenueData().v().component4();
            return;
        }
        int i4 = AFInAppEventParameterName + 121;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            AFAdRevenueData().v().getMonetizationNetwork();
        } else {
            AFAdRevenueData().v().getMonetizationNetwork();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i4) {
        int i5 = AFInAppEventParameterName + 5;
        AFInAppEventType = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            this.component3 = TimeUnit.SECONDS.toMillis(i4);
        } else {
            this.component3 = TimeUnit.SECONDS.toMillis(i4);
            int i6 = 15 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i4 = AFInAppEventType + 85;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            AFd1pSDK copy = AFAdRevenueData().copy();
            String[] strArr = new String[1];
            strArr[1] = str;
            copy.getMediationNetwork("setOaidData", strArr);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("setOaidData", str);
        }
        AFb1jSDK.getMonetizationNetwork = str;
        AFInAppEventParameterName = (AFInAppEventType + InterfaceC1490j3.d.b.f16812d) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        String format;
        int i4 = AFInAppEventParameterName + 125;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[1] = Arrays.toString(strArr);
            format = String.format("setOneLinkCustomDomain %s", objArr);
        } else {
            format = String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr));
        }
        AFLogger.afDebugLog(format);
        AFAdRevenueData().d().component4 = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i4 = AFInAppEventParameterName + 81;
        int i5 = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFInAppEventType = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        int i6 = i5 + 25;
        AFInAppEventParameterName = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 != 0) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), false);
        } else {
            String lowerCase2 = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase2);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase2)), true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, str, map}, 841587779, -841587759, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i4 = AFInAppEventParameterName + 113;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            AFAdRevenueData().afInfoLog().getMediationNetwork = AFj1cSDK.getMonetizationNetwork(str);
        } else {
            AFAdRevenueData().afInfoLog().getMediationNetwork = AFj1cSDK.getMonetizationNetwork(str);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        int i4 = AFInAppEventType + 71;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            Objects.requireNonNull(pluginInfo);
            AFAdRevenueData().unregisterClient().AFAdRevenueData(pluginInfo);
            int i5 = 39 / 0;
        } else {
            Objects.requireNonNull(pluginInfo);
            AFAdRevenueData().unregisterClient().AFAdRevenueData(pluginInfo);
        }
        int i6 = AFInAppEventParameterName + 95;
        AFInAppEventType = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 == 0) {
            int i7 = 38 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if (str != null) {
                int i4 = AFInAppEventType + 3;
                AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 != 0) {
                    jSONObject.put("pid", str);
                    int i5 = 70 / 0;
                } else {
                    jSONObject.put("pid", str);
                }
            }
            if (str2 != null) {
                jSONObject.put("c", str2);
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        } catch (JSONException e4) {
            AFLogger.afErrorLog(e4.getMessage(), e4);
        }
        if (jSONObject.has("pid")) {
            AFInAppEventType = (AFInAppEventParameterName + 85) % UserVerificationMethods.USER_VERIFY_PATTERN;
            getMonetizationNetwork(new Object[]{"preInstallName", jSONObject.toString()}, -692563571, 692563575, (int) System.currentTimeMillis());
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        int i6 = AFInAppEventType + 5;
        AFInAppEventParameterName = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 != 0) {
            int i7 = 19 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFInAppEventType = (AFInAppEventParameterName + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFa1oSDK d4 = AFAdRevenueData().d();
        d4.component2.clear();
        d4.component2.addAll(Arrays.asList(strArr));
        AFInAppEventParameterName = (AFInAppEventType + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        AFInAppEventType = (AFInAppEventParameterName + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
        setSharingFilterForPartners(strArr);
        int i4 = AFInAppEventParameterName + 9;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i4 = AFInAppEventType + 87;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            setSharingFilterForPartners("all");
        } else {
            setSharingFilterForPartners("all");
        }
        int i5 = AFInAppEventParameterName + 27;
        AFInAppEventType = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        AFAdRevenueData().afInfoLog().getRevenue = new AFb1uSDK(strArr);
        AFInAppEventParameterName = (AFInAppEventType + 77) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        getMonetizationNetwork(new Object[]{this, emailsCryptType, strArr}, -363126917, 363126927, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        AFInAppEventType = (AFInAppEventParameterName + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
        start(context, null);
        AFInAppEventType = (AFInAppEventParameterName + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z4, Context context) {
        AFc1qSDK component2;
        boolean z5;
        getMediationNetwork(context);
        final AFc1dSDK AFAdRevenueData2 = AFAdRevenueData();
        AFAdRevenueData2.registerClient().getMediationNetwork(z4);
        AFAdRevenueData2.getMonetizationNetwork().submit(new Runnable() { // from class: com.appsflyer.internal.g
            @Override // java.lang.Runnable
            public final void run() {
                AFa1tSDK.getRevenue(AFc1dSDK.this);
            }
        });
        if (z4) {
            int i4 = AFInAppEventParameterName + 15;
            AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                component2 = AFAdRevenueData2.component2();
                z5 = false;
            } else {
                component2 = AFAdRevenueData2.component2();
                z5 = true;
            }
            component2.getCurrencyIso4217Code("is_stop_tracking_used", z5);
        }
        AFInAppEventParameterName = (AFInAppEventType + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        AFInAppEventParameterName = (AFInAppEventType + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        AFInAppEventParameterName = (AFInAppEventType + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        AFInAppEventParameterName = (AFInAppEventType + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFAdRevenueData().copy().getMediationNetwork("unregisterConversionListener", new String[0]);
        this.getCurrencyIso4217Code = null;
        int i4 = AFInAppEventType + 75;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getMediationNetwork(context);
        AFg1ySDK aFg1ySDK = new AFg1ySDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFf1aSDK revenue = aFg1ySDK.getRevenue();
        if (revenue == null || !str.equals(revenue.getRevenue)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z4 = revenue == null || currentTimeMillis - revenue.AFAdRevenueData > TimeUnit.SECONDS.toMillis(2L);
            AFf1aSDK aFf1aSDK = new AFf1aSDK(str, currentTimeMillis, !z4);
            aFg1ySDK.AFAdRevenueData.getMediationNetwork("afUninstallToken", aFf1aSDK.getRevenue);
            aFg1ySDK.AFAdRevenueData.getMonetizationNetwork("afUninstallToken_received_time", aFf1aSDK.AFAdRevenueData);
            aFg1ySDK.AFAdRevenueData.getCurrencyIso4217Code("afUninstallToken_queued", aFf1aSDK.getMediationNetwork);
            if (z4) {
                AFc1dSDK AFAdRevenueData2 = ((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData();
                AFf1tSDK aFf1tSDK = new AFf1tSDK(str, AFAdRevenueData2);
                AFe1lSDK copydefault = AFAdRevenueData2.copydefault();
                copydefault.getRevenue.execute(copydefault.new AnonymousClass5(aFf1tSDK));
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1lSDK copydefault = this.copy.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass5(new AFe1fSDK(this.copy, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        AFInAppEventType = (AFInAppEventParameterName + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z4) {
        AFInAppEventParameterName = (AFInAppEventType + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z4)), true);
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z4);
        AFInAppEventParameterName = (AFInAppEventType + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFi1fSDK aFi1fSDK) {
        AFf1wSDK aFf1wSDK = new AFf1wSDK(aFi1fSDK, AFAdRevenueData().getRevenue(), AFAdRevenueData());
        AFe1lSDK copydefault = AFAdRevenueData().copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass5(aFf1wSDK));
        int i4 = AFInAppEventType + InterfaceC1490j3.d.b.f16817i;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
    }

    private static void a(int[] iArr, int i4, Object[] objArr) {
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AFKeystoreWrapper;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = ($11 + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
                $10 = i6;
                iArr3[i5] = (int) (iArr2[i5] ^ 3670241895213185600L);
                i5++;
                $11 = (i6 + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AFKeystoreWrapper;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i7 = 0; i7 < length3; i7++) {
                iArr6[i7] = (int) (iArr5[i7] ^ 3670241895213185600L);
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1kSDK.getCurrencyIso4217Code = 0;
        $10 = ($11 + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
        while (true) {
            int i8 = aFk1kSDK.getCurrencyIso4217Code;
            if (i8 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i4);
                return;
            }
            int i9 = iArr[i8];
            char c4 = (char) (i9 >> 16);
            cArr[0] = c4;
            char c5 = (char) i9;
            cArr[1] = c5;
            char c6 = (char) (iArr[i8 + 1] >> 16);
            cArr[2] = c6;
            char c7 = (char) iArr[i8 + 1];
            cArr[3] = c7;
            aFk1kSDK.AFAdRevenueData = (c4 << 16) + c5;
            aFk1kSDK.getMonetizationNetwork = (c6 << 16) + c7;
            AFk1kSDK.getMediationNetwork(iArr4);
            for (int i10 = 0; i10 < 16; i10++) {
                $11 = ($10 + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
                int i11 = aFk1kSDK.AFAdRevenueData ^ iArr4[i10];
                aFk1kSDK.AFAdRevenueData = i11;
                int AFAdRevenueData2 = AFk1kSDK.AFAdRevenueData(i11) ^ aFk1kSDK.getMonetizationNetwork;
                int i12 = aFk1kSDK.AFAdRevenueData;
                aFk1kSDK.AFAdRevenueData = AFAdRevenueData2;
                aFk1kSDK.getMonetizationNetwork = i12;
            }
            int i13 = aFk1kSDK.AFAdRevenueData;
            int i14 = aFk1kSDK.getMonetizationNetwork;
            aFk1kSDK.AFAdRevenueData = i14;
            aFk1kSDK.getMonetizationNetwork = i13;
            int i15 = i13 ^ iArr4[16];
            aFk1kSDK.getMonetizationNetwork = i15;
            int i16 = i14 ^ iArr4[17];
            aFk1kSDK.AFAdRevenueData = i16;
            cArr[0] = (char) (i16 >>> 16);
            cArr[1] = (char) i16;
            cArr[2] = (char) (i15 >>> 16);
            cArr[3] = (char) i15;
            AFk1kSDK.getMediationNetwork(iArr4);
            int i17 = aFk1kSDK.getCurrencyIso4217Code;
            cArr2[i17 * 2] = cArr[0];
            cArr2[(i17 * 2) + 1] = cArr[1];
            cArr2[(i17 * 2) + 2] = cArr[2];
            cArr2[(i17 * 2) + 3] = cArr[3];
            aFk1kSDK.getCurrencyIso4217Code = i17 + 2;
        }
    }

    public static String getRevenue() {
        AFInAppEventType = (AFInAppEventParameterName + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String monetizationNetwork = getMonetizationNetwork(AppsFlyerProperties.APP_USER_ID);
        AFInAppEventType = (AFInAppEventParameterName + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return monetizationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        getMonetizationNetwork(new Object[]{this, strArr}, 1505056603, -1505056581, System.identityHashCode(this));
    }

    private void getRevenue(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i4 = AFInAppEventParameterName + 113;
        int i5 = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFInAppEventType = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (appsFlyerConversionListener == null) {
            AFInAppEventParameterName = (i5 + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            this.getCurrencyIso4217Code = appsFlyerConversionListener;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        getMediationNetwork(context);
        AFh1fSDK aFh1fSDK = new AFh1fSDK();
        aFh1fSDK.areAllFieldsValid = str;
        aFh1fSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
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
            aFh1fSDK.getMediationNetwork(singletonMap);
        }
        aFh1fSDK.getMonetizationNetwork = hashMap;
        AFd1pSDK copy = AFAdRevenueData().copy();
        Map map2 = aFh1fSDK.getMonetizationNetwork;
        if (map2 == null) {
            map2 = new HashMap();
        }
        copy.getMediationNetwork("logEvent", str, new JSONObject(map2).toString());
        if (str == null) {
            getCurrencyIso4217Code(context, AFh1xSDK.logEvent);
        }
        getMonetizationNetwork(aFh1fSDK, component1(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener) {
        getMonetizationNetwork(new Object[]{this, context, str, appsFlyerRequestListener}, -1542206359, 1542206364, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j4) {
        AFInAppEventType = (AFInAppEventParameterName + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFAdRevenueData().d().getMonetizationNetwork = deepLinkListener;
        AFAdRevenueData().d().component3 = j4;
        AFInAppEventParameterName = (AFInAppEventType + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        AFInAppEventParameterName = (AFInAppEventType + BuildConfig.API_LEVEL) % UserVerificationMethods.USER_VERIFY_PATTERN;
        boolean AFAdRevenueData2 = aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData();
        int i4 = AFInAppEventType + 9;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(AFAdRevenueData2);
        }
        int i5 = 9 / 0;
        return Boolean.valueOf(AFAdRevenueData2);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        getMonetizationNetwork(new Object[]{this, context, str}, -1758296594, 1758296610, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        getMonetizationNetwork(new Object[]{this, context, str, str2, str3, str4, str5, map}, 203099708, -203099705, System.identityHashCode(this));
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        Context context = (Context) objArr[0];
        AFInAppEventParameterName = (AFInAppEventType + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i4 = AFInAppEventParameterName + 35;
                AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                return i4 % 2 == 0 ? Boolean.FALSE : Boolean.TRUE;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return Boolean.TRUE;
        } catch (PackageManager.NameNotFoundException e4) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e4);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
    
        if (r3.contains("android.permission.INTERNET") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void component4(Context context) {
        List asList;
        int i4 = AFInAppEventParameterName + 5;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i4 % 2 == 0) {
                asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 13800).requestedPermissions);
                if (!asList.contains("android.permission.INTERNET")) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
                if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                    int i5 = AFInAppEventType + 23;
                    AFInAppEventParameterName = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i5 % 2 == 0) {
                        AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                    } else {
                        AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                        throw null;
                    }
                }
                if (Build.VERSION.SDK_INT > 32 && !asList.contains("com.google.android.gms.permission.AD_ID")) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                    AFInAppEventType = (AFInAppEventParameterName + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                AFInAppEventParameterName = (AFInAppEventType + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return;
            }
            asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), Base64Utils.IO_BUFFER_SIZE).requestedPermissions);
        } catch (Exception e4) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copydefault() {
        getMonetizationNetwork(new Object[]{this, new AFh1kSDK()}, 974724333, -974724320, System.identityHashCode(this));
        int i4 = AFInAppEventType + 71;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static String getRevenue(SimpleDateFormat simpleDateFormat, long j4) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j4));
        int i4 = AFInAppEventParameterName + 61;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return format;
        }
        throw null;
    }

    private static void copy() {
        int i4 = AFInAppEventType + 55;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            throw null;
        }
    }

    private static String getMonetizationNetwork(String str) {
        AFInAppEventParameterName = (AFInAppEventType + InterfaceC1490j3.d.b.f16817i) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i4 = AFInAppEventType + 1;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001a, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0018, code lost:
    
        if (r5.areAllFieldsValid == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r5.areAllFieldsValid == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        int i4 = AFInAppEventParameterName + 3;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        boolean z4 = false;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        if (getMediationNetwork()) {
            AFInAppEventParameterName = (AFInAppEventType + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z4) {
            if (!(!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true))) {
                if (component1()) {
                    int i6 = (AFInAppEventParameterName + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    AFInAppEventType = i6;
                    AppsFlyerRequestListener appsFlyerRequestListener = aFh1rSDK.getCurrencyIso4217Code;
                    if (appsFlyerRequestListener != null) {
                        AFInAppEventParameterName = (i6 + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        return;
                    }
                    return;
                }
            } else {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            this.component2 = System.currentTimeMillis();
            AFInAppEventType = (AFInAppEventParameterName + InterfaceC1490j3.d.b.f16810b) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        AFj1dSDK.getMediationNetwork(AFAdRevenueData().AFAdRevenueData(), new AFa1ySDK(aFh1rSDK), 0L, TimeUnit.MILLISECONDS);
    }

    private static void getMediationNetwork(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i4)));
                }
            } catch (JSONException e4) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e4);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (keys2.hasNext()) {
                AFInAppEventParameterName = (AFInAppEventType + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (str != null) {
                    break loop2;
                }
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i5 = 0;
                    while (i5 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i5) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i5) != ((Long) arrayList.get(1)).longValue()) {
                            AFInAppEventParameterName = (AFInAppEventType + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (jSONArray2.getLong(i5) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            }
                            i5++;
                            AFInAppEventType = (AFInAppEventParameterName + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
                            str = next;
                        }
                    }
                } catch (JSONException e5) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e5);
                }
            }
            break loop2;
        }
        if (str != null) {
            int i6 = AFInAppEventType + BuildConfig.API_LEVEL;
            AFInAppEventParameterName = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i6 % 2 != 0) {
                jSONObject.remove(str);
                int i7 = 31 / 0;
            } else {
                jSONObject.remove(str);
            }
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i4 = AFInAppEventParameterName + InterfaceC1490j3.d.b.f16812d;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (map != null) {
            aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            AFInAppEventParameterName = (AFInAppEventType + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        return null;
    }

    public static Map<String, Object> getRevenue(Map<String, Object> map) {
        Map<String, Object> map2;
        if (map.containsKey("meta")) {
            int i4 = AFInAppEventType + 117;
            AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                throw null;
            }
            map2 = (Map) map.get("meta");
        } else {
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            map2 = hashMap;
        }
        int i5 = AFInAppEventParameterName + 45;
        AFInAppEventType = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            return map2;
        }
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int i4 = AFInAppEventParameterName + 1;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
            int i5 = 44 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
        }
        AFInAppEventType = (AFInAppEventParameterName + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return null;
    }

    private String getRevenue(Context context, String str) {
        int i4 = (AFInAppEventType + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFInAppEventParameterName = i4;
        if (context == null) {
            AFInAppEventType = (i4 + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return null;
        }
        getMediationNetwork(context);
        String currencyIso4217Code = AFAdRevenueData().getRevenue().getCurrencyIso4217Code(str);
        int i5 = AFInAppEventType + 65;
        AFInAppEventParameterName = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return currencyIso4217Code;
    }

    static void areAllFieldsValid() {
        AFKeystoreWrapper = new int[]{1173848566, -581264425, 1049631762, -184971919, -1510845523, 293648529, -317712227, 1299495101, -345507000, 2098071530, -62356939, -1430410937, 823748430, 809610160, -1818352164, -849605125, 1727658104, 1621127117};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r3 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        AFAdRevenueData().v().getRevenue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        AFAdRevenueData().v().getCurrencyIso4217Code();
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = (com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 43) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void getMonetizationNetwork(boolean z4) {
        int i4 = AFInAppEventParameterName + 95;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
    }

    private boolean component1() {
        return ((Boolean) getMonetizationNetwork(new Object[]{this}, -1610644480, 1610644503, System.identityHashCode(this))).booleanValue();
    }

    private static void getCurrencyIso4217Code(String str, boolean z4) {
        int i4 = AFInAppEventParameterName + 19;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, z4);
        } else {
            AppsFlyerProperties.getInstance().set(str, z4);
            throw null;
        }
    }

    public final AFc1qSDK getRevenue(Context context) {
        int i4 = AFInAppEventParameterName + 11;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            getMediationNetwork(context);
            AFc1qSDK component2 = AFAdRevenueData().component2();
            int i5 = AFInAppEventParameterName + 121;
            AFInAppEventType = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 != 0) {
                return component2;
            }
            throw null;
        }
        getMediationNetwork(context);
        AFAdRevenueData().component2();
        throw null;
    }

    private static boolean getCurrencyIso4217Code(String str) {
        int i4 = AFInAppEventParameterName + 35;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i5 = i4 % 2;
        boolean z4 = AppsFlyerProperties.getInstance().getBoolean(str, false);
        AFInAppEventType = (AFInAppEventParameterName + 5) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return z4;
    }

    private void getCurrencyIso4217Code(Context context, AFh1xSDK aFh1xSDK) {
        getMediationNetwork(context);
        AFh1vSDK areAllFieldsValid2 = AFAdRevenueData().areAllFieldsValid();
        AFh1tSDK revenue = AFh1tSDK.getRevenue(context);
        if (areAllFieldsValid2.getCurrencyIso4217Code()) {
            int i4 = AFInAppEventType + 5;
            AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                areAllFieldsValid2.AFAdRevenueData.put("api_name", aFh1xSDK.toString());
                areAllFieldsValid2.getMediationNetwork(revenue);
            } else {
                areAllFieldsValid2.AFAdRevenueData.put("api_name", aFh1xSDK.toString());
                areAllFieldsValid2.getMediationNetwork(revenue);
                throw null;
            }
        }
        areAllFieldsValid2.AFAdRevenueData();
        AFInAppEventParameterName = (AFInAppEventType + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private static void getMonetizationNetwork(Context context) {
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (Build.VERSION.SDK_INT < 31) {
                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    } else {
                        AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                        return;
                    }
                }
                AFInAppEventType = (AFInAppEventParameterName + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) != 0) {
                    int i4 = AFInAppEventType + 119;
                    AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i4 % 2 != 0) {
                        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", false);
                        return;
                    } else {
                        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                        return;
                    }
                }
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                AFInAppEventParameterName = (AFInAppEventType + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while checking BackupRules: ", th);
        }
    }

    private void component2() {
        int i4 = AFInAppEventType + 37;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i4 % 2 == 0) {
                final AFi1fSDK force = AFAdRevenueData().force();
                if (force != null) {
                    AFInAppEventParameterName = (AFInAppEventType + 77) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (force.getMediationNetwork()) {
                        force.AFAdRevenueData(new AFi1cSDK() { // from class: com.appsflyer.internal.e
                            @Override // com.appsflyer.internal.AFi1cSDK
                            public final void onRequestFinished() {
                                AFa1tSDK.this.AFAdRevenueData(force);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            AFAdRevenueData().force();
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th)));
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        String str4 = (String) objArr[5];
        String str5 = (String) objArr[6];
        Map map = (Map) objArr[7];
        AFInAppEventParameterName = (AFInAppEventType + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
        aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, map == null ? "" : map.toString());
        if (!aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PURCHASE_VALIDATION;
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str5);
            aFLogger.i(aFg1cSDK, sb.toString());
        }
        if (str != null && str4 != null) {
            int i4 = AFInAppEventParameterName;
            AFInAppEventType = (i4 + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (str2 != null) {
                AFInAppEventType = (i4 + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (str5 != null && str3 != null) {
                    new Thread(new com.appsflyer.internal.AFa1ySDK(context.getApplicationContext(), aFa1tSDK.AFAdRevenueData().registerClient().getMediationNetwork(), str, str2, str3, str4, str5, map)).start();
                    return null;
                }
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFAdRevenueData;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
            int i5 = AFInAppEventType + 91;
            AFInAppEventParameterName = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 != 0) {
                int i6 = 74 / 0;
            }
        }
        return null;
    }

    final void component4() {
        AFInAppEventType = (AFInAppEventParameterName + 123) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (AFe1bSDK.component3()) {
            int i4 = AFInAppEventType + 93;
            AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                int i5 = 25 / 0;
                return;
            }
            return;
        }
        AFc1dSDK AFAdRevenueData2 = AFAdRevenueData();
        AFe1lSDK copydefault = AFAdRevenueData2.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass5(new AFe1bSDK(AFAdRevenueData2)));
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        String str = (String) objArr[0];
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                int i4 = AFInAppEventType + 125;
                AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            AFInAppEventType = (AFInAppEventParameterName + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
            getMonetizationNetwork(new Object[]{"preInstallName", str}, -692563571, 692563575, (int) System.currentTimeMillis());
            return null;
        } catch (JSONException e4) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e4);
            return null;
        }
    }

    private static void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK, AFh1qSDK aFh1qSDK) {
        int i4 = (AFInAppEventType + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFInAppEventParameterName = i4;
        if (aFh1qSDK != null) {
            int i5 = i4 + 79;
            AFInAppEventType = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 != 0) {
                aFh1rSDK.getMediationNetwork = aFh1qSDK.getCurrencyIso4217Code;
                aFh1rSDK.component4 = aFh1qSDK.getMediationNetwork;
            } else {
                aFh1rSDK.getMediationNetwork = aFh1qSDK.getCurrencyIso4217Code;
                aFh1rSDK.component4 = aFh1qSDK.getMediationNetwork;
                throw null;
            }
        }
    }

    public final void getMediationNetwork(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        AFInAppEventType = (AFInAppEventParameterName + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String AFAdRevenueData2 = getRevenue(context).AFAdRevenueData("extraReferrers", (String) null);
            if (AFAdRevenueData2 == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(AFAdRevenueData2);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray = new JSONArray();
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                int i4 = AFInAppEventType + 25;
                AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 != 0) {
                    jSONArray2.put(currentTimeMillis);
                    int i5 = 87 / 0;
                } else {
                    jSONArray2.put(currentTimeMillis);
                }
            }
            if (jSONObject.length() >= 4) {
                getMediationNetwork(jSONObject);
            }
            jSONObject.put(str, jSONArray2.toString());
            getRevenue(context).getMediationNetwork("extraReferrers", jSONObject.toString());
            AFInAppEventType = (AFInAppEventParameterName + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } catch (JSONException e4) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e4);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    final void getMonetizationNetwork(AFh1rSDK aFh1rSDK, AFh1qSDK aFh1qSDK) {
        getCurrencyIso4217Code(aFh1rSDK, aFh1qSDK);
        if (AFAdRevenueData().registerClient().getMediationNetwork() == null) {
            AFInAppEventParameterName = (AFInAppEventType + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFh1rSDK.getCurrencyIso4217Code;
            if (appsFlyerRequestListener != null) {
                int i4 = AFInAppEventType + 105;
                AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                appsFlyerRequestListener.onError(i4 % 2 != 0 ? 108 : 41, "No dev key");
            }
            AFInAppEventParameterName = (AFInAppEventType + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component2());
        if (referrer == null) {
            referrer = "";
        } else {
            AFInAppEventType = (AFInAppEventParameterName + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        aFh1rSDK.component3 = referrer;
        AFAdRevenueData(aFh1rSDK);
    }

    class AFa1vSDK implements AFe1qSDK {
        AFa1vSDK() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit getRevenue() {
            AFa1tSDK aFa1tSDK = AFa1tSDK.this;
            AFa1tSDK.getMonetizationNetwork(new Object[]{aFa1tSDK, new AFh1kSDK()}, 974724333, -974724320, System.identityHashCode(aFa1tSDK));
            return Unit.f41027a;
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getCurrencyIso4217Code(AFe1sSDK<?> aFe1sSDK, AFe1rSDK aFe1rSDK) {
            JSONObject revenue;
            AFf1aSDK revenue2;
            if (!(aFe1sSDK instanceof AFf1rSDK)) {
                if (!(aFe1sSDK instanceof AFg1rSDK) || aFe1rSDK == AFe1rSDK.SUCCESS) {
                    return;
                }
                AFg1pSDK aFg1pSDK = new AFg1pSDK(AFa1tSDK.this.AFAdRevenueData());
                AFe1lSDK copydefault = AFa1tSDK.this.AFAdRevenueData().copydefault();
                copydefault.getRevenue.execute(copydefault.new AnonymousClass5(aFg1pSDK));
                return;
            }
            AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1sSDK;
            boolean z4 = aFe1sSDK instanceof AFf1uSDK;
            if (z4 && getCurrencyIso4217Code()) {
                AFf1uSDK aFf1uSDK = (AFf1uSDK) aFe1sSDK;
                if (aFf1uSDK.getMediationNetwork == AFe1rSDK.SUCCESS || aFf1uSDK.getRevenue == 1) {
                    AFg1rSDK aFg1rSDK = new AFg1rSDK(aFf1uSDK, AFa1tSDK.this.AFAdRevenueData().component2());
                    AFe1lSDK copydefault2 = AFa1tSDK.this.AFAdRevenueData().copydefault();
                    copydefault2.getRevenue.execute(copydefault2.new AnonymousClass5(aFg1rSDK));
                }
            }
            AFh1uSDK afErrorLogForExcManagerOnly = AFa1tSDK.this.AFAdRevenueData().afErrorLogForExcManagerOnly();
            if (afErrorLogForExcManagerOnly != null && z4) {
                afErrorLogForExcManagerOnly.getRevenue((AFf1uSDK) aFe1sSDK, new Function0() { // from class: com.appsflyer.internal.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit revenue3;
                        revenue3 = AFa1tSDK.AFa1vSDK.this.getRevenue();
                        return revenue3;
                    }
                });
            }
            if (aFe1rSDK == AFe1rSDK.SUCCESS) {
                AFa1tSDK aFa1tSDK = AFa1tSDK.this;
                aFa1tSDK.getRevenue(aFa1tSDK.component1).getMediationNetwork("sentSuccessfully", com.ironsource.mediationsdk.metadata.a.f17681g);
                if (!(aFe1sSDK instanceof AFf1tSDK) && (revenue2 = new AFg1ySDK(AFa1tSDK.this.component1).getRevenue()) != null && revenue2.getMediationNetwork) {
                    String str = revenue2.getRevenue;
                    AFLogger.INSTANCE.d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFc1dSDK AFAdRevenueData = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData();
                    AFf1tSDK aFf1tSDK = new AFf1tSDK(str, AFAdRevenueData);
                    AFe1lSDK copydefault3 = AFAdRevenueData.copydefault();
                    copydefault3.getRevenue.execute(copydefault3.new AnonymousClass5(aFf1tSDK));
                }
                ResponseNetwork responseNetwork = ((AFe1dSDK) aFf1rSDK).component1;
                if (responseNetwork != null && (revenue = AFa1qSDK.getRevenue((String) responseNetwork.getBody())) != null) {
                    AFa1tSDK.this.component4 = revenue.optBoolean("send_background", false);
                }
                if (z4) {
                    AFa1tSDK.this.getMediationNetwork = System.currentTimeMillis();
                }
            }
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getMediationNetwork(AFe1sSDK<?> aFe1sSDK) {
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getMonetizationNetwork(AFe1sSDK<?> aFe1sSDK) {
            if (aFe1sSDK instanceof AFf1uSDK) {
                AFa1tSDK.this.AFAdRevenueData().areAllFieldsValid().getCurrencyIso4217Code(((AFf1rSDK) aFe1sSDK).component2.component2);
            }
        }

        private boolean getCurrencyIso4217Code() {
            return AFa1tSDK.this.getCurrencyIso4217Code != null;
        }
    }

    private static void AFAdRevenueData(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.SDK_LIFECYCLE;
        StringBuilder sb = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb.append(str);
        sb.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFg1cSDK, sb.toString());
        int i4 = AFInAppEventType + BuildConfig.API_LEVEL;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void getRevenue(String str) {
        getMonetizationNetwork(new Object[]{str}, 998031041, -998031039, (int) System.currentTimeMillis());
    }

    final void getRevenue(AFh1rSDK aFh1rSDK) {
        getMonetizationNetwork(new Object[]{this, aFh1rSDK}, 974724333, -974724320, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r4.remove("android_id") != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = (com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 117) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r4.remove("android_id") != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getCurrencyIso4217Code(Map<String, Object> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) || map.get("advertiserId") == null) {
            return;
        }
        AFInAppEventParameterName = (AFInAppEventType + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
        } catch (Exception e4) {
            AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e4);
            return;
        }
        if (AFk1ySDK.getMediationNetwork(AFAdRevenueData().afInfoLog().AFAdRevenueData)) {
            int i4 = AFInAppEventType + 29;
            AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                int i5 = 63 / 0;
            }
            AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e4);
            return;
        }
        if (!AFk1ySDK.getMediationNetwork(AFAdRevenueData().registerClient().getRevenue()) || map.remove("imei") == null) {
            return;
        }
        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
    }

    public static String getMonetizationNetwork(AFc1qSDK aFc1qSDK, String str) {
        int i4 = AFInAppEventType + 99;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            String AFAdRevenueData2 = aFc1qSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
            if (AFAdRevenueData2 != null) {
                return AFAdRevenueData2;
            }
            aFc1qSDK.getMediationNetwork("CACHED_CHANNEL", str);
            AFInAppEventType = (AFInAppEventParameterName + InterfaceC1490j3.d.b.f16812d) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return str;
        }
        aFc1qSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
        throw null;
    }

    private static int getMonetizationNetwork(AFc1qSDK aFc1qSDK, String str, boolean z4) {
        AFInAppEventType = (AFInAppEventParameterName + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
        int AFAdRevenueData2 = aFc1qSDK.AFAdRevenueData(str, 0);
        if (z4) {
            AFAdRevenueData2++;
            aFc1qSDK.getMediationNetwork(str, AFAdRevenueData2);
        }
        int i4 = AFInAppEventParameterName + 61;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return AFAdRevenueData2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x03dd, code lost:
    
        if (r0.toString().isEmpty() == false) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i4, int i5, int i6) {
        Uri uri;
        String concat;
        int i7 = (i4 * (-464)) + (i5 * (-929));
        int i8 = ~i4;
        int i9 = i5 | i6;
        int i10 = i7 + (((~i9) | i8) * (-465)) + ((i5 | (~(i6 | i8))) * 930) + ((i8 | i9) * 465);
        int i11 = 0;
        boolean z4 = true;
        switch (i10) {
            case 1:
                return getMonetizationNetwork(objArr);
            case 2:
                return AFAdRevenueData(objArr);
            case 3:
                return getRevenue(objArr);
            case 4:
                return getCurrencyIso4217Code(objArr);
            case 5:
                return getMediationNetwork(objArr);
            case 6:
                AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
                Context context = (Context) objArr[1];
                Intent intent = (Intent) objArr[2];
                aFa1tSDK.getMediationNetwork(context);
                AFa1oSDK d4 = aFa1tSDK.AFAdRevenueData().d();
                AFc1qSDK component2 = aFa1tSDK.AFAdRevenueData().component2();
                if (intent != null) {
                    AFInAppEventType = (AFInAppEventParameterName + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if ("android.intent.action.VIEW".equals(intent.getAction())) {
                        uri = intent.getData();
                        if (uri != null) {
                            AFInAppEventParameterName = (AFInAppEventType + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
                            break;
                        }
                        z4 = false;
                        if (component2.getMediationNetwork("ddl_sent", false)) {
                            AFInAppEventType = (AFInAppEventParameterName + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (!z4) {
                                d4.AFAdRevenueData("No direct deep link", null);
                                return null;
                            }
                        }
                        d4.e_(AFa1jSDK.getCurrencyIso4217Code(d4.areAllFieldsValid.afVerboseLog()), intent, context);
                        return null;
                    }
                }
                uri = null;
                if (uri != null) {
                }
                z4 = false;
                if (component2.getMediationNetwork("ddl_sent", false)) {
                }
                d4.e_(AFa1jSDK.getCurrencyIso4217Code(d4.areAllFieldsValid.afVerboseLog()), intent, context);
                return null;
            case 7:
                return component4(objArr);
            case 8:
                return component1(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                return component2(objArr);
            case 11:
                AFa1tSDK aFa1tSDK2 = (AFa1tSDK) objArr[0];
                Context context2 = (Context) objArr[1];
                AFInAppEventType = (AFInAppEventParameterName + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
                aFa1tSDK2.getMediationNetwork(context2);
                String currencyIso4217Code = aFa1tSDK2.AFAdRevenueData().getRevenue().getCurrencyIso4217Code(context2);
                AFInAppEventType = (AFInAppEventParameterName + 123) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return currencyIso4217Code;
            case 12:
                return component3(objArr);
            case 13:
                AFa1tSDK aFa1tSDK3 = (AFa1tSDK) objArr[0];
                AFh1rSDK aFh1rSDK = (AFh1rSDK) objArr[1];
                Context context3 = aFa1tSDK3.AFAdRevenueData().AFInAppEventType().getMonetizationNetwork;
                if (context3 == null) {
                    AFInAppEventType = (AFInAppEventParameterName + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    AFLogger.INSTANCE.d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
                    AFInAppEventParameterName = (AFInAppEventType + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    return null;
                }
                String mediationNetwork = aFa1tSDK3.AFAdRevenueData().registerClient().getMediationNetwork();
                AppsFlyerRequestListener appsFlyerRequestListener = aFh1rSDK.getCurrencyIso4217Code;
                if (mediationNetwork != null) {
                    AFInAppEventType = (AFInAppEventParameterName + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (mediationNetwork.length() != 0) {
                        AFc1qSDK revenue = aFa1tSDK3.getRevenue(context3);
                        AppsFlyerProperties.getInstance().saveProperties(revenue);
                        if (!aFa1tSDK3.AFAdRevenueData().registerClient().AFAdRevenueData()) {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                            StringBuilder sb = new StringBuilder("sendWithEvent from activity: ");
                            sb.append(context3.getClass().getName());
                            aFLogger.i(aFg1cSDK, sb.toString(), true);
                        }
                        boolean mediationNetwork2 = aFh1rSDK.getMediationNetwork();
                        Map<String, Object> mediationNetwork3 = aFa1tSDK3.getMediationNetwork(aFh1rSDK);
                        if (aFa1tSDK3.AFAdRevenueData().registerClient().AFAdRevenueData()) {
                            AFInAppEventType = (AFInAppEventParameterName + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
                            AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyerLib.sendWithEvent");
                        }
                        int intValue = ((Integer) getMonetizationNetwork(new Object[]{revenue, Boolean.FALSE}, -1175980247, 1175980268, (int) System.currentTimeMillis())).intValue();
                        aFa1tSDK3.getCurrencyIso4217Code(mediationNetwork3);
                        AFa1uSDK aFa1uSDK = new AFa1uSDK(aFa1tSDK3.AFAdRevenueData(), aFh1rSDK.getMediationNetwork(mediationNetwork3).AFAdRevenueData(intValue), aFa1tSDK3.AFAdRevenueData().e().getMonetizationNetwork());
                        if (mediationNetwork2) {
                            AFj1qSDK[] component3 = aFa1tSDK3.component3();
                            int length = component3.length;
                            int i12 = 0;
                            while (i11 < length) {
                                AFj1qSDK aFj1qSDK = component3[i11];
                                if (aFj1qSDK.component4 == AFj1qSDK.AFa1ySDK.STARTED) {
                                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                                    StringBuilder sb2 = new StringBuilder("Failed to get ");
                                    sb2.append(aFj1qSDK.component2);
                                    sb2.append(" referrer, wait ...");
                                    aFLogger2.d(aFg1cSDK2, sb2.toString());
                                    i12 = 1;
                                }
                                i11++;
                                AFInAppEventParameterName = (AFInAppEventType + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
                            }
                            if (!(!aFa1tSDK3.AFAdRevenueData().e().getCurrencyIso4217Code())) {
                                AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
                                i11 = 1;
                            } else {
                                i11 = i12;
                            }
                            if (aFa1tSDK3.AFAdRevenueData().registerClient().getMonetizationNetwork()) {
                                i11 = 1;
                            }
                        }
                        AFj1dSDK.getMediationNetwork(aFa1tSDK3.AFAdRevenueData().AFAdRevenueData(), aFa1uSDK, i11 != 0 ? 500L : 0L, TimeUnit.MILLISECONDS);
                        return null;
                    }
                }
                AFLogger aFLogger3 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK3 = AFg1cSDK.GENERAL;
                aFLogger3.i(aFg1cSDK3, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
                aFLogger3.i(aFg1cSDK3, "AppsFlyer will not track this event.", true);
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                return null;
            case 14:
                return copydefault(objArr);
            case 15:
                return equals(objArr);
            case 16:
                return toString(objArr);
            case 17:
                return hashCode(objArr);
            case 18:
                return copy(objArr);
            case 19:
                AFa1tSDK aFa1tSDK4 = (AFa1tSDK) objArr[0];
                int i13 = AFInAppEventType + 85;
                AFInAppEventParameterName = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i13 % 2 != 0) {
                    aFa1tSDK4.AFAdRevenueData().afInfoLog().component1 = false;
                } else {
                    aFa1tSDK4.AFAdRevenueData().afInfoLog().component1 = true;
                }
                return null;
            case 20:
                AFa1tSDK aFa1tSDK5 = (AFa1tSDK) objArr[0];
                String str = (String) objArr[1];
                Map map = (Map) objArr[2];
                AFc1kSDK afInfoLog = aFa1tSDK5.AFAdRevenueData().afInfoLog();
                if (afInfoLog.getMonetizationNetwork == null) {
                    afInfoLog.getMonetizationNetwork = new AFb1qSDK();
                }
                AFb1qSDK aFb1qSDK = afInfoLog.getMonetizationNetwork;
                if (str != null) {
                    AFInAppEventType = (AFInAppEventParameterName + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (!str.isEmpty()) {
                        if (map != null && !map.isEmpty()) {
                            StringBuilder sb3 = new StringBuilder("Setting partner data for ");
                            sb3.append(str);
                            sb3.append(": ");
                            sb3.append(map);
                            AFLogger.afDebugLog(sb3.toString());
                            int length2 = new JSONObject(map).toString().length();
                            if (length2 > 1000) {
                                AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                                HashMap hashMap = new HashMap();
                                hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length2)));
                                aFb1qSDK.AFAdRevenueData.put(str, hashMap);
                                return null;
                            }
                            aFb1qSDK.getCurrencyIso4217Code.put(str, map);
                            aFb1qSDK.AFAdRevenueData.remove(str);
                            return null;
                        }
                        if (aFb1qSDK.getCurrencyIso4217Code.remove(str) == null) {
                            concat = "Partner data is missing or `null`";
                        } else {
                            concat = "Cleared partner data for ".concat(str);
                            AFInAppEventType = (AFInAppEventParameterName + InterfaceC1490j3.d.b.f16810b) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        }
                        AFLogger.afWarnLog(concat);
                        return null;
                    }
                }
                AFLogger.afWarnLog("Partner ID is missing or `null`");
                return null;
            case 21:
                AFc1qSDK aFc1qSDK = (AFc1qSDK) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                AFInAppEventParameterName = (AFInAppEventType + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
                int monetizationNetwork = getMonetizationNetwork(aFc1qSDK, "appsFlyerCount", booleanValue);
                AFInAppEventParameterName = (AFInAppEventType + BuildConfig.API_LEVEL) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return Integer.valueOf(monetizationNetwork);
            case 22:
                return AFLogger(objArr);
            case ConnectionResult.API_DISABLED /* 23 */:
                AFa1tSDK aFa1tSDK6 = (AFa1tSDK) objArr[0];
                int i14 = AFInAppEventParameterName + 47;
                AFInAppEventType = i14 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i14 % 2 != 0 ? aFa1tSDK6.component2 > 0 : aFa1tSDK6.component2 > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - aFa1tSDK6.component2;
                    Locale locale = Locale.US;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
                    String revenue2 = getRevenue(simpleDateFormat, aFa1tSDK6.component2);
                    String revenue3 = getRevenue(simpleDateFormat, aFa1tSDK6.getMediationNetwork);
                    if (currentTimeMillis < aFa1tSDK6.component3 && !aFa1tSDK6.isStopped()) {
                        AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", revenue2, revenue3, Long.valueOf(currentTimeMillis), Long.valueOf(aFa1tSDK6.component3)));
                        return Boolean.TRUE;
                    }
                    if (!aFa1tSDK6.isStopped()) {
                        AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", revenue2, revenue3, Long.valueOf(currentTimeMillis)));
                    }
                } else if (!aFa1tSDK6.isStopped()) {
                    AFLogger.afInfoLog("Sending first launch for this session!");
                    AFInAppEventParameterName = (AFInAppEventType + 23) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                return Boolean.FALSE;
            default:
                int i15 = (AFInAppEventParameterName + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
                AFInAppEventType = i15;
                AFa1tSDK aFa1tSDK7 = areAllFieldsValid;
                AFInAppEventParameterName = (i15 + InterfaceC1490j3.d.b.f16815g) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return aFa1tSDK7;
        }
    }

    public final boolean getMediationNetwork() {
        AFInAppEventType = (AFInAppEventParameterName + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (!getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) {
            return false;
        }
        int i4 = AFInAppEventType + 69;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            return getRevenue() == null;
        }
        getRevenue();
        throw null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        final AppsFlyerRequestListener appsFlyerRequestListener = (AppsFlyerRequestListener) objArr[3];
        if (aFa1tSDK.AFAdRevenueData().afDebugLog().getCurrencyIso4217Code()) {
            return null;
        }
        if (!aFa1tSDK.toString) {
            AFInAppEventParameterName = (AFInAppEventType + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFAdRevenueData("start");
            if (str == null) {
                int i4 = AFInAppEventType + 19;
                AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 != 0) {
                    throw null;
                }
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                return null;
            }
        }
        aFa1tSDK.getMediationNetwork(context);
        final AFh1vSDK areAllFieldsValid2 = aFa1tSDK.AFAdRevenueData().areAllFieldsValid();
        areAllFieldsValid2.getMediationNetwork(AFh1tSDK.getRevenue(context));
        if (aFa1tSDK.component1 == null) {
            AFInAppEventType = (AFInAppEventParameterName + 23) % UserVerificationMethods.USER_VERIFY_PATTERN;
            Application O_ = AFj1iSDK.O_(context);
            if (O_ == null) {
                return null;
            }
            int i5 = AFInAppEventType + 119;
            AFInAppEventParameterName = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 != 0) {
                aFa1tSDK.component1 = O_;
                throw null;
            }
            aFa1tSDK.component1 = O_;
        }
        aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
        String str2 = getMonetizationNetwork;
        aFLogger.i(aFg1cSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.17.0", str2));
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str2);
        aFLogger.i(aFg1cSDK, sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(aFa1tSDK.AFAdRevenueData().component2());
        if (!TextUtils.isEmpty(str)) {
            AFInAppEventParameterName = (AFInAppEventType + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
            aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData(str);
            AFInAppEventParameterName = (AFInAppEventType + InterfaceC1490j3.d.b.f16815g) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else if (TextUtils.isEmpty(aFa1tSDK.AFAdRevenueData().registerClient().getMediationNetwork())) {
            copy();
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
            }
            return null;
        }
        aFa1tSDK.AFAdRevenueData().component1().getCurrencyIso4217Code(aFa1tSDK.getMonetizationNetwork());
        aFa1tSDK.component4();
        getMonetizationNetwork(aFa1tSDK.component1.getBaseContext());
        aFa1tSDK.AFAdRevenueData().e().getRevenue();
        aFa1tSDK.copy.afDebugLog().AFAdRevenueData(context, new AFb1bSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFa1tSDK.1
            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getCurrencyIso4217Code() {
                Context context2 = AFa1tSDK.this.AFAdRevenueData().AFInAppEventType().getMonetizationNetwork;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1vSDK aFh1vSDK = areAllFieldsValid2;
                long currentTimeMillis = System.currentTimeMillis();
                long j4 = aFh1vSDK.component3;
                if (j4 != 0) {
                    long j5 = currentTimeMillis - j4;
                    if (j5 > 0 && j5 < 1000) {
                        j5 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j5);
                    aFh1vSDK.toString = seconds;
                    aFh1vSDK.getCurrencyIso4217Code.getMonetizationNetwork("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFa1tSDK.this.AFAdRevenueData().afRDLog().AFAdRevenueData();
                AFd1pSDK copy = AFa1tSDK.this.AFAdRevenueData().copy();
                if (copy.component4()) {
                    copy.getMediationNetwork();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        copy.o_(context2.getPackageName(), context2.getPackageManager());
                    }
                    copy.AFAdRevenueData();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1tSDK.this.AFAdRevenueData().equals().getRevenue();
                AFa1tSDK.this.AFAdRevenueData().afVerboseLog().getMonetizationNetwork();
                AFa1tSDK.this.AFAdRevenueData().getMediationNetwork().getRevenue();
                AFh1uSDK afErrorLogForExcManagerOnly = AFa1tSDK.this.AFAdRevenueData().afErrorLogForExcManagerOnly();
                if (afErrorLogForExcManagerOnly != null) {
                    afErrorLogForExcManagerOnly.getMediationNetwork();
                }
            }

            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getRevenue(AFh1qSDK aFh1qSDK) {
                Intent intent;
                areAllFieldsValid2.AFAdRevenueData();
                AFc1dSDK AFAdRevenueData2 = AFa1tSDK.this.AFAdRevenueData();
                AFAdRevenueData2.component1().getCurrencyIso4217Code(AFa1tSDK.this.getMonetizationNetwork());
                AFa1tSDK.this.component4();
                int AFAdRevenueData3 = AFAdRevenueData2.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (AFAdRevenueData3 < 2) {
                    AFa1tSDK.this.AFAdRevenueData().equals().getCurrencyIso4217Code();
                }
                AFh1iSDK aFh1iSDK = new AFh1iSDK();
                if (aFh1qSDK != null) {
                    AFa1tSDK.this.AFAdRevenueData().d().e_(AFa1jSDK.AFAdRevenueData(aFh1iSDK), aFh1qSDK.getRevenue, AFAdRevenueData2.AFInAppEventType().getMonetizationNetwork);
                    AFh1uSDK afErrorLogForExcManagerOnly = AFAdRevenueData2.afErrorLogForExcManagerOnly();
                    if (afErrorLogForExcManagerOnly != null && (intent = aFh1qSDK.getRevenue) != null) {
                        afErrorLogForExcManagerOnly.u_(intent, AFa1tSDK.this.AFAdRevenueData().d());
                    }
                }
                AFa1tSDK aFa1tSDK2 = AFa1tSDK.this;
                aFh1iSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
                aFa1tSDK2.getMonetizationNetwork(aFh1iSDK, aFh1qSDK);
                AFa1tSDK.this.AFAdRevenueData().getMediationNetwork().getRevenue();
                AFa1tSDK.this.AFAdRevenueData().getMediationNetwork().AFAdRevenueData.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", false);
            }
        });
        int i6 = AFInAppEventParameterName + 105;
        AFInAppEventType = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static int getCurrencyIso4217Code(AFc1qSDK aFc1qSDK, boolean z4) {
        AFInAppEventType = (AFInAppEventParameterName + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
        int monetizationNetwork = getMonetizationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z4);
        int i4 = AFInAppEventParameterName + 123;
        AFInAppEventType = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    public static boolean getCurrencyIso4217Code(Context context) {
        return ((Boolean) getMonetizationNetwork(new Object[]{context}, -1675611583, 1675611591, (int) System.currentTimeMillis())).booleanValue();
    }

    private void getCurrencyIso4217Code(Context context, String str) {
        getMonetizationNetwork(new Object[]{this, context, str}, 1659672083, -1659672066, System.identityHashCode(this));
    }

    private void getCurrencyIso4217Code(Context context, String str, Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, context, str, map}, 1732368696, -1732368678, System.identityHashCode(this));
    }

    private static void getCurrencyIso4217Code(String str, String str2) {
        getMonetizationNetwork(new Object[]{str, str2}, -692563571, 692563575, (int) System.currentTimeMillis());
    }

    public static AFa1tSDK getCurrencyIso4217Code() {
        return (AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis());
    }

    private AFj1qSDK[] component3() {
        int i4 = AFInAppEventType + 121;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            AFAdRevenueData().AFLogger().getRevenue();
            throw null;
        }
        AFj1qSDK[] revenue = AFAdRevenueData().AFLogger().getRevenue();
        int i5 = AFInAppEventParameterName + 65;
        AFInAppEventType = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    private void getMediationNetwork(String str) {
        AFh1rSDK AFAdRevenueData2 = new AFh1jSDK().AFAdRevenueData(AFAdRevenueData().getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0));
        AFAdRevenueData2.component3 = str;
        if (str != null) {
            AFInAppEventType = (AFInAppEventParameterName + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (str.length() > 5) {
                AFInAppEventParameterName = (AFInAppEventType + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (AFAdRevenueData().AFLogger().getCurrencyIso4217Code(AFAdRevenueData2)) {
                    AFj1dSDK.getMediationNetwork(AFAdRevenueData().AFAdRevenueData(), new AFa1ySDK(AFAdRevenueData2), 5L, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    final Map<String, Object> getMediationNetwork(AFh1rSDK aFh1rSDK) {
        String str;
        Context context = AFAdRevenueData().AFInAppEventType().getMonetizationNetwork;
        AFc1qSDK revenue = getRevenue(context);
        AFg1qSDK component3 = AFAdRevenueData().component3();
        boolean AFAdRevenueData2 = AFAdRevenueData().registerClient().AFAdRevenueData();
        boolean mediationNetwork = aFh1rSDK.getMediationNetwork();
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a(new int[]{1293966833, -1332243105, 2001922811, -600378744, 548813369, -684723692}, 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (AFAdRevenueData2) {
                AFInAppEventParameterName = (AFInAppEventType + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (!mediationNetwork) {
                    str = aFh1rSDK.areAllFieldsValid;
                } else {
                    AFInAppEventType = (AFInAppEventParameterName + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    str = "Launch";
                }
                sb.append(str);
                aFLogger.i(aFg1cSDK, sb.toString(), true);
            }
            component4(context);
            int intValue = ((Integer) getMonetizationNetwork(new Object[]{revenue, Boolean.valueOf(mediationNetwork)}, -1175980247, 1175980268, (int) System.currentTimeMillis())).intValue();
            int currencyIso4217Code = getCurrencyIso4217Code(revenue, aFh1rSDK.areAllFieldsValid != null);
            if (mediationNetwork) {
                int i4 = AFInAppEventType;
                AFInAppEventParameterName = (i4 + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (intValue == 1) {
                    AFInAppEventParameterName = (i4 + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    AppsFlyerProperties.getInstance().getCurrencyIso4217Code = true;
                }
            }
            component3.getRevenue(map, intValue, currencyIso4217Code);
            return map;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
            return map;
        }
    }

    private static String getMediationNetwork(Activity activity) {
        Intent intent;
        int i4 = AFInAppEventType + 37;
        AFInAppEventParameterName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        String str = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (activity != null && (intent = activity.getIntent()) != null) {
            AFInAppEventType = (AFInAppEventParameterName + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i5 = AFInAppEventType + 39;
                    AFInAppEventParameterName = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i5 % 2 == 0) {
                        str = extras.getString("af");
                        if (str != null) {
                            AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(str));
                            extras.remove("af");
                            activity.setIntent(intent.putExtras(extras));
                            AFInAppEventType = (AFInAppEventParameterName + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        }
                    } else {
                        String string = extras.getString("af");
                        try {
                            throw null;
                        } catch (Throwable th) {
                            str = string;
                            th = th;
                            AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
                            return str;
                        }
                    }
                }
                return str;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return str;
    }

    public static int getMonetizationNetwork(AFc1qSDK aFc1qSDK, boolean z4) {
        return ((Integer) getMonetizationNetwork(new Object[]{aFc1qSDK, Boolean.valueOf(z4)}, -1175980247, 1175980268, (int) System.currentTimeMillis())).intValue();
    }
}
