package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.al;
import com.tapjoy.internal.bh;
import com.tapjoy.internal.bn;
import com.tapjoy.internal.ev;
import com.tapjoy.internal.fb;
import com.tapjoy.internal.fc;
import com.tapjoy.internal.fi;
import com.tapjoy.internal.fp;
import com.tapjoy.internal.ft;
import com.tapjoy.internal.gb;
import com.tapjoy.internal.gf;
import com.tapjoy.internal.ha;
import com.tapjoy.internal.hd;
import com.tapjoy.internal.ho;
import com.tapjoy.internal.jr;
import com.tapjoy.internal.ka;
import com.tapjoy.internal.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.w3c.dom.Document;

/* loaded from: classes2.dex */
public class TapjoyConnectCore {
    public static final float DEFAULT_CURRENCY_MULTIPLIER = 1.0f;
    private static Integer aA;
    private static Long aB;
    private static Long aC;
    private static Long aD;
    private static String aE;
    private static Integer aF;
    private static Double aG;
    private static Double aH;
    private static Long aI;
    private static Integer aJ;
    private static Integer aK;
    private static Integer aL;
    private static String aM;
    private static String aN;
    private static String aO;
    private static boolean ab;
    private static PackageManager ac;
    private static TapjoyGpsHelper ad;
    private static String ah;
    private static String ai;
    private static String aj;
    private static String ak;
    private static Integer al;
    private static String am;
    private static String an;
    private static Long ao;
    private static String ap;
    private static Integer aq;
    private static Integer ar;
    private static String as;
    private static String at;
    private static String au;
    private static String av;
    private static String aw;
    private static Set ax;
    private static Integer ay;
    private static Integer az;

    /* renamed from: d, reason: collision with root package name */
    protected static boolean f7768d;
    private static Context g;
    private static String h;
    private static TapjoyConnectCore i;
    private static TapjoyURLConnection j;
    private static TJConnectListener k;
    private static TJSetUserIDListener l;
    private long X = 0;
    private boolean Y = false;
    private boolean aa = false;
    private static Vector m = new Vector(Arrays.asList(TapjoyConstants.dependencyClassNames));
    private static String n = "";
    private static String o = "";
    private static String p = "";
    private static String q = "";
    private static String r = "";
    private static String s = "";
    private static String t = "";
    private static String u = "";
    private static String v = "";
    private static String w = "";
    private static String x = "";
    private static String y = "";
    private static int z = 1;
    private static float A = 1.0f;
    private static int B = 1;
    private static String C = "";
    private static String D = "";
    private static String E = "";
    private static String F = "";
    private static String G = "";
    private static String H = "";
    private static String I = "";
    private static String J = "";
    private static String K = "";
    private static String L = "";
    private static String M = "";
    private static String N = TapjoyConstants.TJC_PLUGIN_NATIVE;
    private static String O = "";
    private static String P = "";
    private static float Q = 1.0f;
    private static boolean R = false;
    private static String S = "";
    private static String T = "";
    private static String U = "";
    private static String V = "";
    private static String W = null;
    private static long Z = 0;

    /* renamed from: a, reason: collision with root package name */
    protected static int f7765a = 0;

    /* renamed from: b, reason: collision with root package name */
    protected static int f7766b = 0;

    /* renamed from: c, reason: collision with root package name */
    protected static String f7767c = "";
    protected static String e = "";
    protected static String f = "";
    private static Hashtable ae = TapjoyConnectFlag.CONNECT_FLAG_DEFAULTS;
    private static String af = "";
    private static Map ag = new ConcurrentHashMap();
    private static String aP = "";
    private static String aQ = "";
    private static String aR = "";
    private static boolean aS = false;
    private static TJConnectListener aT = null;
    private static boolean aU = false;

    public static String getConnectURL() {
        return TapjoyConfig.TJC_CONNECT_SERVICE_URL;
    }

    public static TapjoyConnectCore getInstance() {
        return i;
    }

    public static void requestTapjoyConnect(Context context, String str) {
        requestTapjoyConnect(context, str, null);
    }

    public static void requestTapjoyConnect(Context context, String str, Hashtable hashtable) {
        requestTapjoyConnect(context, str, hashtable, null);
    }

    public static void requestTapjoyConnect(Context context, String str, Hashtable hashtable, TJConnectListener tJConnectListener) {
        try {
            fp fpVar = new fp(str);
            if (fpVar.f8114a != fp.a.SDK_ANDROID) {
                throw new IllegalArgumentException("The given API key was not for Android.");
            }
            h = str;
            v = fpVar.f8115b;
            L = fpVar.f8116c;
            M = fpVar.f8117d;
            if (hashtable != null) {
                ae.putAll(hashtable);
                gb.b().a(hashtable);
            }
            ha.a(context).j = str;
            k = tJConnectListener;
            if (i == null) {
                i = new TapjoyConnectCore();
            }
            TapjoyConnectCore tapjoyConnectCore = i;
            try {
                a(context);
                new Thread(new Runnable() { // from class: com.tapjoy.TapjoyConnectCore.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        TapjoyConnectCore.a();
                        TapjoyConnectCore.this.completeConnectCall();
                    }
                }).start();
                tapjoyConnectCore.aa = true;
            } catch (TapjoyIntegrationException e2) {
                TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, e2.getMessage()));
                d();
                ft.f8129b.notifyObservers(Boolean.FALSE);
            } catch (TapjoyException e3) {
                TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, e3.getMessage()));
                d();
                ft.f8129b.notifyObservers(Boolean.FALSE);
            }
        } catch (IllegalArgumentException e4) {
            throw new TapjoyIntegrationException(e4.getMessage());
        }
    }

    public static void requestLimitedTapjoyConnect(Context context, String str, TJConnectListener tJConnectListener) {
        try {
            fp fpVar = new fp(str);
            if (fpVar.f8114a != fp.a.SDK_ANDROID) {
                throw new IllegalArgumentException("The given API key was not for Android.");
            }
            aP = fpVar.f8115b;
            aQ = fpVar.f8116c;
            if (i == null) {
                i = new TapjoyConnectCore();
            }
            aT = tJConnectListener;
            TapjoyConnectCore tapjoyConnectCore = i;
            try {
                a(context);
                new Thread(new Runnable() { // from class: com.tapjoy.TapjoyConnectCore.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        TapjoyConnectCore.a();
                        TapjoyConnectCore.this.completeLimitedConnectCall();
                    }
                }).start();
            } catch (TapjoyIntegrationException e2) {
                TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, e2.getMessage()));
                e();
                ft.f8129b.notifyObservers(Boolean.FALSE);
            } catch (TapjoyException e3) {
                TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, e3.getMessage()));
                e();
                ft.f8129b.notifyObservers(Boolean.FALSE);
            }
            TapjoyLog.d("TapjoyConnect", "requestTapjoyConnect function complete");
        } catch (IllegalArgumentException e4) {
            TapjoyLog.d("TapjoyConnect", e4.getMessage());
            throw new TapjoyIntegrationException(e4.getMessage());
        }
    }

    private static void d() {
        if (!jr.c(M)) {
            ha.a().a(g, h, "12.3.1", TapjoyConfig.TJC_ANALYTICS_SERVICE_URL, M, L);
        }
        if (k != null) {
            k.onConnectFailure();
        }
    }

    private static void e() {
        if (aT != null) {
            aT.onConnectFailure();
        }
    }

    public void appPause() {
        this.Y = true;
    }

    public void appResume() {
        if (this.Y) {
            p();
            this.Y = false;
        }
    }

    public static Map getURLParams() {
        Map genericURLParams = getGenericURLParams();
        genericURLParams.putAll(getTimeStampAndVerifierParams());
        return genericURLParams;
    }

    public static Map getLimitedURLParams() {
        Map limitedGenericURLParams = getLimitedGenericURLParams();
        limitedGenericURLParams.putAll(getLimitedTimeStampAndVerifierParams());
        return limitedGenericURLParams;
    }

    public static Map getGenericURLParams() {
        Map f2 = f();
        TapjoyUtil.safePut(f2, TapjoyConstants.TJC_APP_ID, v, true);
        return f2;
    }

    public static Map getLimitedGenericURLParams() {
        Map f2 = f();
        TapjoyUtil.safePut(f2, TapjoyConstants.TJC_APP_ID, aP, true);
        TapjoyUtil.safePut(f2, TapjoyConstants.TJC_APP_GROUP_ID, aR, true);
        TapjoyUtil.safePut(f2, TapjoyConstants.TJC_LIMITED, "true", true);
        return f2;
    }

    private static Map f() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        TapjoyUtil.safePut(hashMap3, TapjoyConstants.TJC_PLUGIN, N, true);
        TapjoyUtil.safePut(hashMap3, "sdk_type", O, true);
        TapjoyUtil.safePut(hashMap3, TapjoyConstants.TJC_APP_ID, v, true);
        TapjoyUtil.safePut(hashMap3, TapjoyConstants.TJC_LIBRARY_VERSION, x, true);
        TapjoyUtil.safePut(hashMap3, TapjoyConstants.TJC_LIBRARY_REVISION, TapjoyRevision.GIT_REVISION, true);
        TapjoyUtil.safePut(hashMap3, TapjoyConstants.TJC_BRIDGE_VERSION, y, true);
        TapjoyUtil.safePut(hashMap3, "app_version", w, true);
        hashMap2.putAll(hashMap3);
        HashMap hashMap4 = new HashMap();
        TapjoyUtil.safePut(hashMap4, "device_name", r, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_PLATFORM, D, true);
        TapjoyUtil.safePut(hashMap4, "os_version", u, true);
        TapjoyUtil.safePut(hashMap4, "device_manufacturer", s, true);
        TapjoyUtil.safePut(hashMap4, "device_type", t, true);
        StringBuilder sb = new StringBuilder();
        sb.append(B);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_DEVICE_SCREEN_LAYOUT_SIZE, sb.toString(), true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_STORE_NAME, K, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_STORE_VIEW, String.valueOf(R), true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_CARRIER_NAME, E, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_CARRIER_COUNTRY_CODE, F, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_MOBILE_NETWORK_CODE, H, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_MOBILE_COUNTRY_CODE, G, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, Locale.getDefault().getCountry(), true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_DEVICE_LANGUAGE, Locale.getDefault().getLanguage(), true);
        I = getConnectionType();
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_CONNECTION_TYPE, I, true);
        J = getConnectionSubType();
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_CONNECTION_SUBTYPE, J, true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_DEVICE_SCREEN_DENSITY, sb2.toString(), true);
        hashMap2.putAll(hashMap4);
        HashMap hashMap5 = new HashMap();
        if (m()) {
            TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_ADVERTISING_ID, f7767c, true);
            TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_AD_TRACKING_ENABLED, String.valueOf(f7768d), true);
        }
        if ((n() && !m()) || !o()) {
            TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_ANDROID_ID, n, true);
            TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_DEVICE_MAC_ADDRESS, p, true);
        }
        TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_INSTALL_ID, q, true);
        TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_USER_ID, C, true);
        TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_ADVERTISING_ID_CHECK_DISABLED, e, true);
        TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_LEGACY_ID_FALLBACK_ALLOWED, f, true);
        if (f7765a != 0) {
            TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_PACKAGED_GOOGLE_PLAY_SERVICES_VERSION, Integer.toString(f7765a), true);
        }
        if (f7766b != 0) {
            TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_DEVICE_GOOGLE_PLAY_SERVICES_VERSION, Integer.toString(f7766b), true);
        }
        if (o == null || o.length() == 0 || System.currentTimeMillis() - Z > TapjoyConstants.SESSION_ID_INACTIVITY_TIME) {
            o = p();
        } else {
            Z = System.currentTimeMillis();
        }
        TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_SESSION_ID, o, true);
        hashMap2.putAll(hashMap5);
        HashMap hashMap6 = new HashMap();
        TapjoyUtil.safePut(hashMap6, TapjoyConstants.TJC_APP_GROUP_ID, S, true);
        TapjoyUtil.safePut(hashMap6, TapjoyConstants.TJC_STORE, T, true);
        TapjoyUtil.safePut(hashMap6, TapjoyConstants.TJC_ANALYTICS_API_KEY, U, true);
        TapjoyUtil.safePut(hashMap6, TapjoyConstants.TJC_MANAGED_DEVICE_ID, V, true);
        hashMap2.putAll(hashMap6);
        gf a2 = gf.a();
        HashMap hashMap7 = new HashMap();
        if (a2.f8180a != null) {
            TapjoyUtil.safePut(hashMap7, "gdpr", a2.f8180a.booleanValue() ? "1" : "0", true);
        }
        if (!al.a(a2.f8181b)) {
            TapjoyUtil.safePut(hashMap7, "cgdpr", a2.f8181b, true);
        }
        hashMap2.putAll(hashMap7);
        if (TapjoyCache.getInstance() != null && TapjoyCache.getInstance().getCachedOfferIDs() != null && TapjoyCache.getInstance().getCachedOfferIDs().length() > 0) {
            TapjoyUtil.safePut(hashMap2, TapjoyConstants.TJC_CACHED_OFFERS, TapjoyCache.getInstance().getCachedOfferIDs(), true);
        }
        TapjoyUtil.safePut(hashMap2, TapjoyConstants.TJC_CURRENCY_MULTIPLIER, Float.toString(Q), true);
        hashMap.putAll(hashMap2);
        HashMap hashMap8 = new HashMap();
        h();
        HashMap hashMap9 = new HashMap();
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_ANALYTICS_ID, ah, true);
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_PACKAGE_ID, ai, true);
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_PACKAGE_SIGN, aj, true);
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_DEVICE_DISPLAY_DENSITY, aJ);
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_DEVICE_DISPLAY_WIDTH, aK);
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_DEVICE_DISPLAY_HEIGHT, aL);
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_DEVICE_COUNTRY_SIM, aM, true);
        TapjoyUtil.safePut(hashMap9, "timezone", aN, true);
        hashMap8.putAll(hashMap9);
        HashMap hashMap10 = new HashMap();
        TapjoyUtil.safePut(hashMap10, TapjoyConstants.TJC_PACKAGE_VERSION, ak, true);
        TapjoyUtil.safePut(hashMap10, TapjoyConstants.TJC_PACKAGE_REVISION, al);
        TapjoyUtil.safePut(hashMap10, TapjoyConstants.TJC_PACKAGE_DATA_VERSION, am, true);
        TapjoyUtil.safePut(hashMap10, TapjoyConstants.TJC_INSTALLER, an, true);
        if (jr.c(K)) {
            TapjoyUtil.safePut(hashMap10, TapjoyConstants.TJC_STORE_NAME, aO, true);
        }
        hashMap8.putAll(hashMap10);
        hashMap8.putAll(g());
        hashMap.putAll(hashMap8);
        return hashMap;
    }

    public static Map getTimeStampAndVerifierParams() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String a2 = a(currentTimeMillis);
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_TIMESTAMP, String.valueOf(currentTimeMillis), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_VERIFIER, a2, true);
        return hashMap;
    }

    public static Map getLimitedTimeStampAndVerifierParams() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String b2 = b(currentTimeMillis);
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_TIMESTAMP, String.valueOf(currentTimeMillis), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_VERIFIER, b2, true);
        return hashMap;
    }

    private static Map g() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_INSTALLED, ao);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_REFERRER, ap, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_LEVEL, aq);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_FRIEND_COUNT, ar);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_1, as, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_2, at, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_3, au, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_4, av, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_5, aw, true);
        Iterator it = ax.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            TapjoyUtil.safePut(hashMap, "user_tags[" + i2 + "]", (String) it.next(), true);
            i2++;
        }
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_WEEKLY_FREQUENCY, ay);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_MONTHLY_FREQUENCY, az);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_TOTAL_COUNT, aA);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_TOTAL_LENGTH, aB);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_LAST_AT, aC);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_LAST_LENGTH, aD);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_CURRENCY, aE, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_TOTAL_COUNT, aF);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_TOTAL_PRICE, aG);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_LAST_PRICE, aH);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_LAST_AT, aI);
        return hashMap;
    }

    private static boolean a(Context context) {
        WifiInfo connectionInfo;
        g = context;
        ac = context.getPackageManager();
        gf.a().a(context);
        gb.a().a(context);
        ad = new TapjoyGpsHelper(g);
        if (j == null) {
            j = new TapjoyURLConnection();
        }
        if (ae == null) {
            ae = new Hashtable();
        }
        j();
        int identifier = g.getResources().getIdentifier("raw/tapjoy_config", null, g.getPackageName());
        Properties properties = new Properties();
        try {
            properties.load(g.getResources().openRawResource(identifier));
            a(properties);
        } catch (Exception unused) {
        }
        if (jr.c(getConnectFlagValue("unit_test_mode"))) {
            k();
        }
        String string = Settings.Secure.getString(g.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
        n = string;
        if (string != null) {
            n = n.toLowerCase();
        }
        try {
            boolean z2 = false;
            w = ac.getPackageInfo(g.getPackageName(), 0).versionName;
            t = TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE;
            D = TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE;
            r = Build.MODEL;
            s = Build.MANUFACTURER;
            u = Build.VERSION.RELEASE;
            x = "12.3.1";
            y = TapjoyConstants.TJC_BRIDGE_VERSION_NUMBER;
            try {
                if (Build.VERSION.SDK_INT > 3) {
                    TapjoyDisplayMetricsUtil tapjoyDisplayMetricsUtil = new TapjoyDisplayMetricsUtil(g);
                    z = tapjoyDisplayMetricsUtil.getScreenDensityDPI();
                    A = tapjoyDisplayMetricsUtil.getScreenDensityScale();
                    B = tapjoyDisplayMetricsUtil.getScreenLayoutSize();
                }
            } catch (Exception e2) {
                TapjoyLog.e("TapjoyConnect", "Error getting screen density/dimensions/layout: " + e2.toString());
            }
            if (f("android.permission.ACCESS_WIFI_STATE")) {
                try {
                    WifiManager wifiManager = (WifiManager) g.getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
                    if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                        String macAddress = connectionInfo.getMacAddress();
                        p = macAddress;
                        if (macAddress != null) {
                            p = p.replace(":", "").toLowerCase();
                        }
                    }
                } catch (Exception e3) {
                    TapjoyLog.e("TapjoyConnect", "Error getting device mac address: " + e3.toString());
                }
            } else {
                TapjoyLog.d("TapjoyConnect", "*** ignore macAddress");
            }
            TelephonyManager telephonyManager = (TelephonyManager) g.getSystemService("phone");
            if (telephonyManager != null) {
                E = telephonyManager.getNetworkOperatorName();
                F = telephonyManager.getNetworkCountryIso();
                String networkOperator = telephonyManager.getNetworkOperator();
                if (networkOperator != null && (networkOperator.length() == 5 || networkOperator.length() == 6)) {
                    G = networkOperator.substring(0, 3);
                    H = networkOperator.substring(3);
                }
            }
            SharedPreferences sharedPreferences = g.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
            String string2 = sharedPreferences.getString(TapjoyConstants.PREF_INSTALL_ID, "");
            q = string2;
            if (string2 == null || q.length() == 0) {
                try {
                    q = TapjoyUtil.SHA256(UUID.randomUUID().toString() + System.currentTimeMillis());
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString(TapjoyConstants.PREF_INSTALL_ID, q);
                    edit.apply();
                } catch (Exception e4) {
                    TapjoyLog.e("TapjoyConnect", "Error generating install id: " + e4.toString());
                }
            }
            if (getConnectFlagValue(TapjoyConnectFlag.STORE_NAME) != null && getConnectFlagValue(TapjoyConnectFlag.STORE_NAME).length() > 0) {
                K = getConnectFlagValue(TapjoyConnectFlag.STORE_NAME);
                if (!new ArrayList(Arrays.asList(TapjoyConnectFlag.STORE_ARRAY)).contains(K)) {
                    TapjoyLog.w("TapjoyConnect", "Warning -- undefined STORE_NAME: " + K);
                }
            }
            try {
                String str = K;
                Intent intent = new Intent("android.intent.action.VIEW");
                if (str.length() <= 0) {
                    intent.setData(Uri.parse("market://details"));
                    if (ac.queryIntentActivities(intent, 0).size() > 0) {
                        z2 = true;
                    }
                } else if (str.equals(TapjoyConnectFlag.STORE_GFAN)) {
                    z2 = e("com.mappn.gfan");
                } else if (str.equals(TapjoyConnectFlag.STORE_SKT)) {
                    z2 = e("com.skt.skaf.TSCINSTALL");
                }
                R = z2;
            } catch (Exception e5) {
                TapjoyLog.e("TapjoyConnect", "Error trying to detect store intent on devicee: " + e5.toString());
            }
            h();
            if (getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK) != null && getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK).length() > 0) {
                f = getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK);
            }
            if (getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) != null && getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).length() > 0) {
                e = getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK);
            }
            if (getConnectFlagValue(TapjoyConnectFlag.USER_ID) != null && getConnectFlagValue(TapjoyConnectFlag.USER_ID).length() > 0) {
                TapjoyLog.i("TapjoyConnect", "Setting userID to: " + getConnectFlagValue(TapjoyConnectFlag.USER_ID));
                setUserID(getConnectFlagValue(TapjoyConnectFlag.USER_ID), null);
            }
            P = TapjoyUtil.getRedirectDomain(getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL));
            if (ae != null) {
                i();
            }
            return true;
        } catch (PackageManager.NameNotFoundException e6) {
            throw new TapjoyException(e6.getMessage());
        }
    }

    private static void h() {
        fc a2 = ha.a(g).a(true);
        fb fbVar = a2.f8070d;
        ah = fbVar.h;
        ai = fbVar.r;
        aj = fbVar.s;
        aJ = fbVar.m;
        aK = fbVar.n;
        aL = fbVar.o;
        aM = fbVar.u;
        aN = fbVar.q;
        ev evVar = a2.e;
        ak = evVar.e;
        al = evVar.f;
        am = evVar.g;
        an = evVar.h;
        aO = evVar.i;
        fi fiVar = a2.f;
        ao = fiVar.s;
        ap = fiVar.t;
        aq = fiVar.J;
        ar = fiVar.K;
        as = fiVar.L;
        at = fiVar.M;
        au = fiVar.N;
        av = fiVar.O;
        aw = fiVar.P;
        ax = new HashSet(fiVar.Q);
        ay = fiVar.u;
        az = fiVar.v;
        aA = fiVar.x;
        aB = fiVar.y;
        aC = fiVar.z;
        aD = fiVar.A;
        aE = fiVar.B;
        aF = fiVar.C;
        aG = fiVar.D;
        aH = fiVar.F;
        aI = fiVar.E;
    }

    private static void i() {
        TapjoyLog.i("TapjoyConnect", "Connect Flags:");
        TapjoyLog.i("TapjoyConnect", "--------------------");
        for (Map.Entry entry : ae.entrySet()) {
            TapjoyLog.i("TapjoyConnect", "key: " + ((String) entry.getKey()) + ", value: " + Uri.encode(entry.getValue().toString()));
        }
        TapjoyLog.i("TapjoyConnect", "hostURL: [" + getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL) + "]");
        TapjoyLog.i("TapjoyConnect", "redirectDomain: [" + P + "]");
        TapjoyLog.i("TapjoyConnect", "--------------------");
    }

    private static void j() {
        try {
            if (ac != null) {
                ApplicationInfo applicationInfo = ac.getApplicationInfo(g.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    for (String str : TapjoyConnectFlag.FLAG_ARRAY) {
                        String string = applicationInfo.metaData.getString("tapjoy." + str);
                        if (string != null) {
                            TapjoyLog.d("TapjoyConnect", "Found manifest flag: " + str + ", " + string);
                            a(str, string);
                        }
                    }
                    TapjoyLog.d("TapjoyConnect", "Metadata successfully loaded");
                    return;
                }
                TapjoyLog.d("TapjoyConnect", "No metadata present.");
            }
        } catch (Exception e2) {
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error reading manifest meta-data -- " + e2.toString()));
        }
    }

    private static void a(Properties properties) {
        Enumeration keys = properties.keys();
        while (keys.hasMoreElements()) {
            try {
                String str = (String) keys.nextElement();
                a(str, (String) properties.get(str));
            } catch (ClassCastException unused) {
                TapjoyLog.e("TapjoyConnect", "Error parsing configuration properties in tapjoy_config.txt");
            }
        }
    }

    private static void k() {
        try {
            List<ActivityInfo> asList = Arrays.asList(ac.getPackageInfo(g.getPackageName(), 1).activities);
            if (asList != null) {
                for (ActivityInfo activityInfo : asList) {
                    if (m.contains(activityInfo.name)) {
                        int indexOf = m.indexOf(activityInfo.name);
                        try {
                            Class.forName((String) m.get(indexOf));
                            Vector vector = new Vector();
                            if ((activityInfo.configChanges & 128) != 128) {
                                vector.add("orientation");
                            }
                            if ((activityInfo.configChanges & 32) != 32) {
                                vector.add("keyboardHidden");
                            }
                            if (vector.size() != 0) {
                                if (vector.size() == 1) {
                                    throw new TapjoyIntegrationException(vector.toString() + " property is not specified in manifest configChanges for " + ((String) m.get(indexOf)));
                                }
                                throw new TapjoyIntegrationException(vector.toString() + " properties are not specified in manifest configChanges for " + ((String) m.get(indexOf)));
                            }
                            if (Build.VERSION.SDK_INT >= 13 && (activityInfo.configChanges & 1024) != 1024) {
                                TapjoyLog.w("TapjoyConnect", "WARNING -- screenSize property is not specified in manifest configChanges for " + ((String) m.get(indexOf)));
                            }
                            if (Build.VERSION.SDK_INT >= 11 && activityInfo.name.equals("com.tapjoy.TJAdUnitActivity") && (activityInfo.flags & 512) != 512) {
                                throw new TapjoyIntegrationException("'hardwareAccelerated' property not specified in manifest for " + ((String) m.get(indexOf)));
                            }
                            m.remove(indexOf);
                        } catch (ClassNotFoundException unused) {
                            throw new TapjoyIntegrationException("[ClassNotFoundException] Could not find dependency class " + ((String) m.get(indexOf)));
                        }
                    }
                }
            }
            if (m.size() != 0) {
                if (m.size() == 1) {
                    throw new TapjoyIntegrationException("Missing " + m.size() + " dependency class in manifest: " + m.toString());
                }
                throw new TapjoyIntegrationException("Missing " + m.size() + " dependency classes in manifest: " + m.toString());
            }
            l();
            try {
                try {
                    Class.forName("com.tapjoy.TJAdUnitJSBridge").getMethod(TJAdUnitConstants.String.CLOSE_REQUESTED, Boolean.class);
                    if (getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) != null && getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).equals("true")) {
                        TapjoyLog.i("TapjoyConnect", "Skipping integration check for Google Play Services and Advertising ID. Do this only if you do not have access to Google Play Services.");
                    } else {
                        ad.checkGooglePlayIntegration();
                    }
                } catch (NoSuchMethodException unused2) {
                    throw new TapjoyIntegrationException("Try configuring Proguard or other code obfuscators to ignore com.tapjoy classes. Visit http://dev.tapjoy.comfor more information.");
                }
            } catch (ClassNotFoundException unused3) {
                throw new TapjoyIntegrationException("ClassNotFoundException: com.tapjoy.TJAdUnitJSBridge was not found.");
            }
        } catch (Exception unused4) {
            throw new TapjoyIntegrationException("Error while getting package info.");
        }
    }

    private static void l() {
        Vector vector = new Vector();
        for (String str : TapjoyConstants.dependencyPermissions) {
            if (!f(str)) {
                vector.add(str);
            }
        }
        if (vector.size() != 0) {
            if (vector.size() == 1) {
                throw new TapjoyIntegrationException("Missing 1 permission in manifest: " + vector.toString());
            }
            throw new TapjoyIntegrationException("Missing " + vector.size() + " permissions in manifest: " + vector.toString());
        }
        Vector vector2 = new Vector();
        for (String str2 : TapjoyConstants.optionalPermissions) {
            if (!f(str2)) {
                vector2.add(str2);
            }
        }
        if (vector2.size() != 0) {
            if (vector2.size() == 1) {
                TapjoyLog.w("TapjoyConnect", "WARNING -- " + vector2.toString() + " permission was not found in manifest. The exclusion of this permission could cause problems.");
                return;
            }
            TapjoyLog.w("TapjoyConnect", "WARNING -- " + vector2.toString() + " permissions were not found in manifest. The exclusion of these permissions could cause problems.");
        }
    }

    private static boolean m() {
        return f7767c != null && f7767c.length() > 0;
    }

    private static boolean n() {
        return getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK) != null && getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK).equals("true");
    }

    private static boolean o() {
        return (ad.isGooglePlayServicesAvailable() && ad.isGooglePlayManifestConfigured()) || getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) == null || !getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).equals("true");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2 A[Catch: all -> 0x014a, RuntimeException -> 0x014d, IOException -> 0x0158, TRY_ENTER, TryCatch #6 {all -> 0x014a, blocks: (B:3:0x0001, B:26:0x00af, B:30:0x00b5, B:34:0x00d2, B:35:0x00f1, B:40:0x00ff, B:38:0x011f, B:43:0x00da, B:45:0x00c1, B:47:0x00c5, B:62:0x014e, B:57:0x0159), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da A[Catch: all -> 0x014a, RuntimeException -> 0x014d, IOException -> 0x0158, TryCatch #6 {all -> 0x014a, blocks: (B:3:0x0001, B:26:0x00af, B:30:0x00b5, B:34:0x00d2, B:35:0x00f1, B:40:0x00ff, B:38:0x011f, B:43:0x00da, B:45:0x00c1, B:47:0x00c5, B:62:0x014e, B:57:0x0159), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(String str, boolean z2) {
        bn bnVar;
        long j2;
        Object obj;
        bn bnVar2 = null;
        try {
            try {
                bnVar = bn.b(str);
            } catch (Throwable th) {
                th = th;
                bnVar = null;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        }
        try {
            Map d2 = bnVar.d();
            String a2 = jr.a((String) d2.get(TapjoyConstants.TJC_APP_GROUP_ID));
            String a3 = jr.a((String) d2.get(TapjoyConstants.TJC_STORE));
            String a4 = jr.a((String) d2.get(TapjoyConstants.TJC_ANALYTICS_API_KEY));
            String a5 = jr.a((String) d2.get(TapjoyConstants.TJC_MANAGED_DEVICE_ID));
            String a6 = jr.a((String) d2.get(TapjoyConstants.TJC_PACKAGE_NAMES));
            Object obj2 = d2.get("cache_max_age");
            fp fpVar = new fp(a4);
            if (fpVar.f8114a != fp.a.RPC_ANALYTICS) {
                throw new IOException("Invalid analytics_api_key");
            }
            String a7 = fp.a(fpVar.f8115b);
            String str2 = fpVar.f8116c;
            if (a2 == null) {
                a2 = a7;
            }
            ha.a().a(g, a4, "12.3.1", TapjoyConfig.TJC_ANALYTICS_SERVICE_URL, a7, str2);
            S = a2;
            T = a3;
            U = a4;
            V = a5;
            ArrayList arrayList = new ArrayList();
            if (a6 != null) {
                for (String str3 : a6.split(",")) {
                    String trim = str3.trim();
                    if (trim.length() > 0) {
                        arrayList.add(trim);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                a(arrayList);
            }
            bnVar.close();
            if (!z2) {
                if (obj2 instanceof String) {
                    j2 = Long.parseLong(((String) obj2).trim());
                } else {
                    if (obj2 instanceof Number) {
                        j2 = ((Number) obj2).longValue();
                    }
                    j2 = 0;
                    if (j2 > 0) {
                        TapjoyAppSettings.getInstance().removeConnectResult();
                    } else {
                        TapjoyAppSettings.getInstance().saveConnectResultAndParams(str, r(), (j2 * 1000) + v.b());
                    }
                    gb a8 = gb.a();
                    obj = d2.get(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS);
                    if (!(obj instanceof Map)) {
                        try {
                            a8.f8153a.a((Map) obj);
                            a8.c().edit().putString(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS, bh.a(obj)).apply();
                        } catch (Exception unused) {
                        }
                    } else if (obj == null) {
                        a8.f8153a.a((Map) null);
                        a8.c().edit().remove(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS).apply();
                    }
                }
                if (j2 > 0) {
                }
                gb a82 = gb.a();
                obj = d2.get(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS);
                if (!(obj instanceof Map)) {
                }
            }
            ka.a(null);
            return true;
        } catch (IOException e4) {
            e = e4;
            bnVar2 = bnVar;
            TapjoyLog.v("TapjoyConnect", e.getMessage());
            ka.a(bnVar2);
            return false;
        } catch (RuntimeException e5) {
            e = e5;
            bnVar2 = bnVar;
            TapjoyLog.v("TapjoyConnect", e.getMessage());
            ka.a(bnVar2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            ka.a(bnVar);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Closeable] */
    private static boolean c(String str) {
        Throwable th;
        RuntimeException e2;
        bn bnVar;
        IOException e3;
        try {
            try {
                bnVar = bn.b(str);
                try {
                    Map d2 = bnVar.d();
                    String a2 = jr.a((String) d2.get(TapjoyConstants.TJC_APP_GROUP_ID));
                    String a3 = jr.a((String) d2.get(TapjoyConstants.TJC_STORE));
                    String a4 = jr.a((String) d2.get(TapjoyConstants.TJC_ANALYTICS_API_KEY));
                    String a5 = jr.a((String) d2.get(TapjoyConstants.TJC_MANAGED_DEVICE_ID));
                    fp fpVar = new fp(a4);
                    if (fpVar.f8114a != fp.a.RPC_ANALYTICS) {
                        throw new IOException("Invalid analytics_api_key");
                    }
                    String a6 = fp.a(fpVar.f8115b);
                    if (a2 == null) {
                        a2 = a6;
                    }
                    aR = a2;
                    T = a3;
                    V = a5;
                    bnVar.close();
                    ka.a(null);
                    return true;
                } catch (IOException e4) {
                    e3 = e4;
                    TapjoyLog.v("TapjoyConnect", e3.getMessage());
                    ka.a(bnVar);
                    return false;
                } catch (RuntimeException e5) {
                    e2 = e5;
                    TapjoyLog.v("TapjoyConnect", e2.getMessage());
                    ka.a(bnVar);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                ka.a(str);
                throw th;
            }
        } catch (IOException e6) {
            e3 = e6;
            bnVar = null;
        } catch (RuntimeException e7) {
            e2 = e7;
            bnVar = null;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
            ka.a(str);
            throw th;
        }
    }

    private static synchronized void a(List list) {
        synchronized (TapjoyConnectCore.class) {
            af = "";
            for (ApplicationInfo applicationInfo : ac.getInstalledApplications(0)) {
                if ((applicationInfo.flags & 1) != 1 && list.contains(applicationInfo.packageName)) {
                    TapjoyLog.d("TapjoyConnect", "MATCH: installed packageName: " + applicationInfo.packageName);
                    if (af.length() > 0) {
                        af += ",";
                    }
                    af += applicationInfo.packageName;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Closeable] */
    public static boolean d(String str) {
        Throwable th;
        RuntimeException e2;
        bn bnVar;
        IOException e3;
        try {
            try {
                bnVar = bn.b(str);
                try {
                } catch (IOException e4) {
                    e3 = e4;
                    TapjoyLog.v("TapjoyConnect", e3.getMessage());
                    ka.a(bnVar);
                    TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Completed Pay-Per-Action call failed."));
                    return false;
                } catch (RuntimeException e5) {
                    e2 = e5;
                    TapjoyLog.v("TapjoyConnect", e2.getMessage());
                    ka.a(bnVar);
                    TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Completed Pay-Per-Action call failed."));
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                ka.a(str);
                throw th;
            }
        } catch (IOException e6) {
            e3 = e6;
            bnVar = null;
        } catch (RuntimeException e7) {
            e2 = e7;
            bnVar = null;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
            ka.a(str);
            throw th;
        }
        if (!bnVar.a()) {
            bnVar.close();
            ka.a(null);
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Completed Pay-Per-Action call failed."));
            return false;
        }
        bnVar.s();
        TapjoyLog.d("TapjoyConnect", "Successfully sent completed Pay-Per-Action to Tapjoy server.");
        bnVar.close();
        ka.a(null);
        return true;
    }

    public void release() {
        i = null;
        j = null;
        TapjoyLog.d("TapjoyConnect", "Releasing core static instance.");
    }

    public static String getAppID() {
        return v;
    }

    public static String getLimitedAppID() {
        return aP;
    }

    public static String getUserID() {
        return C;
    }

    public static String getHostURL() {
        return getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL);
    }

    public static String getPlacementURL() {
        return getConnectFlagValue(TapjoyConnectFlag.PLACEMENT_URL);
    }

    public static String getRedirectDomain() {
        return P;
    }

    public static String getCarrierName() {
        return E;
    }

    public static String getConnectionType() {
        String str = "";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) g.getSystemService("connectivity");
            if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                int type = connectivityManager.getActiveNetworkInfo().getType();
                str = (type == 1 || type == 6) ? TapjoyConstants.TJC_CONNECTION_TYPE_WIFI : TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE;
                TapjoyLog.d("TapjoyConnect", "connectivity: " + connectivityManager.getActiveNetworkInfo().getType());
                TapjoyLog.d("TapjoyConnect", "connection_type: " + str);
            }
        } catch (Exception e2) {
            TapjoyLog.e("TapjoyConnect", "getConnectionType error: " + e2.toString());
        }
        return str;
    }

    public static String getConnectionSubType() {
        String str;
        Exception e2;
        ConnectivityManager connectivityManager;
        try {
            connectivityManager = (ConnectivityManager) g.getSystemService("connectivity");
        } catch (Exception e3) {
            str = "";
            e2 = e3;
        }
        if (connectivityManager == null) {
            return "";
        }
        str = connectivityManager.getActiveNetworkInfo().getSubtypeName();
        try {
            TapjoyLog.d("TapjoyConnect", "connection_sub_type: " + str);
        } catch (Exception e4) {
            e2 = e4;
            TapjoyLog.e("TapjoyConnect", "getConnectionSubType error: " + e2.toString());
            return str;
        }
        return str;
    }

    private static boolean e(String str) {
        Iterator<ApplicationInfo> it = ac.getInstalledApplications(0).iterator();
        while (it.hasNext()) {
            if (it.next().packageName.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    private static String p() {
        TapjoyLog.i("TapjoyConnect", "generating sessionID...");
        String str = null;
        try {
            String SHA256 = TapjoyUtil.SHA256((System.currentTimeMillis() / 1000) + v);
            try {
                Z = System.currentTimeMillis();
                return SHA256;
            } catch (Exception e2) {
                e = e2;
                str = SHA256;
                TapjoyLog.e("TapjoyConnect", "unable to generate session id: " + e.toString());
                return str;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static Context getContext() {
        return g;
    }

    private static String q() {
        if (m()) {
            return f7767c;
        }
        if (n() || !o()) {
            if (p != null && p.length() > 0) {
                return p;
            }
            if (n != null && n.length() > 0) {
                return n;
            }
        }
        TapjoyLog.e("TapjoyConnect", "Error -- no valid device identifier");
        return null;
    }

    private static String a(long j2) {
        try {
            return TapjoyUtil.SHA256(v + ":" + q() + ":" + j2 + ":" + L);
        } catch (Exception e2) {
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error in computing verifier value -- " + e2.toString()));
            return "";
        }
    }

    private static String b(long j2) {
        try {
            return TapjoyUtil.SHA256(aP + ":" + q() + ":" + j2 + ":" + aQ);
        } catch (Exception e2) {
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error in computing verifier value -- " + e2.toString()));
            return "";
        }
    }

    public static String getAwardCurrencyVerifier(long j2, int i2, String str) {
        try {
            return TapjoyUtil.SHA256(v + ":" + q() + ":" + j2 + ":" + L + ":" + i2 + ":" + str);
        } catch (Exception e2) {
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error in computing awardCurrencyVerifier -- " + e2.toString()));
            return "";
        }
    }

    private static String a(long j2, String str) {
        try {
            return TapjoyUtil.SHA256(v + ":" + q() + ":" + j2 + ":" + L + ":" + str);
        } catch (Exception e2) {
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error in computing packageNamesVerifier -- " + e2.toString()));
            return "";
        }
    }

    public boolean isInitialized() {
        return this.aa;
    }

    public static void setPlugin(String str) {
        N = str;
    }

    public static void setSDKType(String str) {
        O = str;
    }

    public static void setUserID(String str, TJSetUserIDListener tJSetUserIDListener) {
        C = str;
        l = tJSetUserIDListener;
        TapjoyLog.d("TapjoyConnect", "URL parameters: " + getURLParams());
        new Thread(new Runnable() { // from class: com.tapjoy.TapjoyConnectCore.3
            @Override // java.lang.Runnable
            public final void run() {
                TapjoyLog.i("TapjoyConnect", "Setting userID to " + TapjoyConnectCore.C);
                TapjoyHttpURLResponse responseFromURL = TapjoyConnectCore.j.getResponseFromURL(TapjoyConnectCore.getHostURL() + TapjoyConstants.TJC_USER_ID_URL_PATH, TapjoyConnectCore.getURLParams());
                TapjoyConnectCore.a(responseFromURL.response != null ? TapjoyConnectCore.a(responseFromURL.response) : false);
            }
        }).start();
    }

    public static void viewDidClose(String str) {
        TapjoyLog.d("TapjoyConnect", "viewDidClose: " + str);
        ag.remove(str);
        ft.e.notifyObservers();
    }

    public static void viewWillOpen(String str, int i2) {
        TapjoyLog.d("TapjoyConnect", "viewWillOpen: " + str);
        ag.put(str, Integer.valueOf(i2));
    }

    public static boolean isViewOpen() {
        TapjoyLog.d("TapjoyConnect", "isViewOpen: " + ag.size());
        return !ag.isEmpty();
    }

    public static boolean isFullScreenViewOpen() {
        Iterator it = ag.values().iterator();
        while (it.hasNext()) {
            switch (((Integer) it.next()).intValue()) {
                case 1:
                case 2:
                    return true;
            }
        }
        return false;
    }

    public static void setViewShowing(boolean z2) {
        if (z2) {
            ag.put("", 1);
        } else {
            ag.clear();
        }
    }

    private static void a(String str, String str2) {
        if ((str.equals(TapjoyConnectFlag.SERVICE_URL) || str.equals(TapjoyConnectFlag.PLACEMENT_URL)) && !str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        ae.put(str, str2);
    }

    private static boolean f(String str) {
        return ac.checkPermission(str, g.getPackageName()) == 0;
    }

    public void actionComplete(String str) {
        TapjoyLog.i("TapjoyConnect", "actionComplete: " + str);
        Map f2 = f();
        TapjoyUtil.safePut(f2, TapjoyConstants.TJC_APP_ID, str, true);
        f2.putAll(getTimeStampAndVerifierParams());
        TapjoyLog.d("TapjoyConnect", "PPA URL parameters: " + f2);
        new Thread(new PPAThread(f2)).start();
    }

    public void completeConnectCall() {
        boolean z2;
        String connectResult;
        TapjoyLog.d("TapjoyConnect", "starting connect call...");
        String str = TapjoyConfig.TJC_CONNECT_SERVICE_URL;
        if (getHostURL() != TapjoyConfig.TJC_SERVICE_URL) {
            str = getHostURL();
        }
        if (isConnected() || (connectResult = TapjoyAppSettings.getInstance().getConnectResult(r(), v.b())) == null || !a(connectResult, true)) {
            z2 = false;
        } else {
            TapjoyLog.i("TapjoyConnect", "Connect using stored connect result");
            ab = true;
            if (k != null) {
                k.onConnectSuccess();
            }
            ft.f8128a.notifyObservers();
            z2 = true;
        }
        TapjoyHttpURLResponse responseFromURL = j.getResponseFromURL(str + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map) null, (Map) null, getURLParams());
        if (responseFromURL != null && responseFromURL.statusCode == 200) {
            if (a(responseFromURL.response, false)) {
                TapjoyLog.i("TapjoyConnect", "Successfully connected to Tapjoy");
                ab = true;
                for (Map.Entry entry : getGenericURLParams().entrySet()) {
                    TapjoyLog.d("TapjoyConnect", ((String) entry.getKey()) + ": " + ((String) entry.getValue()));
                }
                if (!z2) {
                    if (k != null) {
                        k.onConnectSuccess();
                    }
                    ft.f8128a.notifyObservers();
                }
                ft.f8129b.notifyObservers(Boolean.TRUE);
            } else {
                if (!z2) {
                    d();
                }
                ft.f8129b.notifyObservers(Boolean.FALSE);
            }
            if (af.length() > 0) {
                Map genericURLParams = getGenericURLParams();
                TapjoyUtil.safePut(genericURLParams, TapjoyConstants.TJC_PACKAGE_NAMES, af, true);
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                String a2 = a(currentTimeMillis, af);
                TapjoyUtil.safePut(genericURLParams, TapjoyConstants.TJC_TIMESTAMP, String.valueOf(currentTimeMillis), true);
                TapjoyUtil.safePut(genericURLParams, TapjoyConstants.TJC_VERIFIER, a2, true);
                TapjoyHttpURLResponse responseFromURL2 = new TapjoyURLConnection().getResponseFromURL(getHostURL() + TapjoyConstants.TJC_SDK_LESS_CONNECT, genericURLParams);
                if (responseFromURL2 == null || responseFromURL2.statusCode != 200) {
                    return;
                }
                TapjoyLog.d("TapjoyConnect", "Successfully pinged sdkless api.");
                return;
            }
            return;
        }
        if (!z2) {
            d();
        }
        ft.f8129b.notifyObservers(Boolean.FALSE);
    }

    public void completeLimitedConnectCall() {
        String str = TapjoyConfig.TJC_CONNECT_SERVICE_URL;
        if (getHostURL() != TapjoyConfig.TJC_SERVICE_URL) {
            str = getHostURL();
        }
        Map limitedURLParams = getLimitedURLParams();
        TapjoyHttpURLResponse responseFromURL = j.getResponseFromURL(str + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map) null, (Map) null, limitedURLParams);
        if (responseFromURL != null && responseFromURL.statusCode == 200) {
            if (c(responseFromURL.response)) {
                TapjoyLog.i("TapjoyConnect", "Successfully connected to Tapjoy");
                aS = true;
                for (Map.Entry entry : getLimitedGenericURLParams().entrySet()) {
                    TapjoyLog.d("TapjoyConnect", ((String) entry.getKey()) + ": " + ((String) entry.getValue()));
                }
                if (aT != null) {
                    aT.onConnectSuccess();
                }
                ft.f8128a.notifyObservers();
                ft.f8129b.notifyObservers(Boolean.TRUE);
                return;
            }
            e();
            ft.f8129b.notifyObservers(Boolean.FALSE);
            return;
        }
        e();
        ft.f8129b.notifyObservers(Boolean.FALSE);
    }

    public class PPAThread implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private Map f7772b;

        public PPAThread(Map map) {
            this.f7772b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            TapjoyHttpURLResponse responseFromURL = TapjoyConnectCore.j.getResponseFromURL(TapjoyConnectCore.getHostURL() + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map) null, (Map) null, this.f7772b);
            if (responseFromURL.response != null) {
                TapjoyConnectCore.d(responseFromURL.response);
            }
        }
    }

    public void setCurrencyMultiplier(float f2) {
        TapjoyLog.i("TapjoyConnect", "setVirtualCurrencyMultiplier: " + f2);
        Q = f2;
    }

    public float getCurrencyMultiplier() {
        return Q;
    }

    public static String getConnectFlagValue(String str) {
        return (ae == null || ae.get(str) == null) ? "" : ae.get(str).toString();
    }

    public static String getSecretKey() {
        return L;
    }

    public static String getAndroidID() {
        return n;
    }

    public static String getSha1MacAddress() {
        try {
            return TapjoyUtil.SHA1(p);
        } catch (Exception e2) {
            TapjoyLog.e("TapjoyConnect", "Error generating sha1 of macAddress: " + e2.toString());
            return null;
        }
    }

    public static String getMacAddress() {
        return p;
    }

    public static float getDeviceScreenDensityScale() {
        return A;
    }

    public static String getSupportURL(String str) {
        if (str == null) {
            str = v;
        }
        return getHostURL() + "support_requests/new?currency_id=" + str + "&app_id=" + v + "&udid=" + V + "&language_code=" + Locale.getDefault().getLanguage();
    }

    public static String getUserToken() {
        return V;
    }

    public static boolean isConnected() {
        return ab;
    }

    public static boolean isLimitedConnected() {
        return aS;
    }

    public static boolean isUnitTestMode() {
        return getConnectFlagValue("unit_test_mode") == "true";
    }

    private static String r() {
        String str = v + w + x + f7767c + q;
        try {
            return TapjoyUtil.SHA1(str);
        } catch (Exception unused) {
            return str;
        }
    }

    public static void setAdTrackingEnabled() {
        if (gf.a() != null) {
            gf a2 = gf.a();
            if (a2.f8182c == null ? false : a2.f8182c.booleanValue()) {
                f7768d = false;
                return;
            }
        }
        if (ad != null) {
            f7768d = ad.isAdTrackingEnabled();
        }
    }

    static /* synthetic */ void a() {
        if (aU) {
            return;
        }
        try {
            ad.loadAdvertisingId(!n());
            if (ad.isGooglePlayServicesAvailable() && ad.isGooglePlayManifestConfigured()) {
                f7766b = ad.getDeviceGooglePlayServicesVersion();
                f7765a = ad.getPackagedGooglePlayServicesVersion();
            }
            if (ad.isAdIdAvailable()) {
                setAdTrackingEnabled();
                f7767c = ad.getAdvertisingId();
                ha a2 = ha.a();
                String str = f7767c;
                boolean z2 = !f7768d;
                hd hdVar = a2.f;
                String a3 = hdVar.f8262c.A.a();
                hdVar.f8261b.q = str;
                hdVar.f8261b.r = Boolean.valueOf(z2);
                hdVar.f8262c.A.a(str);
                hdVar.f8262c.B.a(z2);
                ho.a(str, z2);
                if (!jr.c(a3) && !str.equals(a3)) {
                    hdVar.f8262c.a(false);
                }
            }
        } catch (Exception e2) {
            TapjoyLog.i("TapjoyConnect", "Error fetching advertising id: " + e2.toString());
            e2.printStackTrace();
        }
        aU = true;
    }

    static /* synthetic */ boolean a(String str) {
        Document buildDocument = TapjoyUtil.buildDocument(str);
        if (buildDocument == null) {
            return true;
        }
        String nodeTrimValue = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("PackageNames"));
        if (nodeTrimValue != null && nodeTrimValue.length() > 0) {
            Vector vector = new Vector();
            int i2 = 0;
            while (true) {
                int indexOf = nodeTrimValue.indexOf(44, i2);
                if (indexOf == -1) {
                    break;
                }
                TapjoyLog.d("TapjoyConnect", "parse: " + nodeTrimValue.substring(i2, indexOf).trim());
                vector.add(nodeTrimValue.substring(i2, indexOf).trim());
                i2 = indexOf + 1;
            }
            TapjoyLog.d("TapjoyConnect", "parse: " + nodeTrimValue.substring(i2).trim());
            vector.add(nodeTrimValue.substring(i2).trim());
            a(vector);
        }
        String nodeTrimValue2 = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("Success"));
        return nodeTrimValue2 != null && nodeTrimValue2.equals("true");
    }

    static /* synthetic */ void a(boolean z2) {
        if (z2) {
            TapjoyLog.i("TapjoyConnect", "Set userID is successful");
            if (l != null) {
                l.onSetUserIDSuccess();
                return;
            }
            return;
        }
        TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Failed to set userID"));
        if (l != null) {
            l.onSetUserIDFailure("Failed to set userID");
        }
    }
}
