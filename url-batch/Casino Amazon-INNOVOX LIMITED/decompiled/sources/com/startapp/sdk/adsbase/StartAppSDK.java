package com.startapp.sdk.adsbase;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import com.facebook.hermes.intl.Constants;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.internal.af;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.qg;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.x1;
import com.startapp.sdk.internal.x5;
import com.startapp.sdk.internal.ze;
import com.startapp.sdk.internal.zh;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.TreeMap;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class StartAppSDK {

    public static class InitParams {
        private String accountId;
        private final String appId;
        private Runnable callback;
        private final Context context;
        private SDKAdPreferences sdkAdPrefs;

        public void init() {
            pg.f382a.a(this.context, this.accountId, this.appId, this.sdkAdPrefs, this.callback);
        }

        public InitParams setAccountId(String str) {
            this.accountId = str;
            return this;
        }

        public InitParams setCallback(Runnable runnable) {
            this.callback = runnable;
            return this;
        }

        @Deprecated
        public InitParams setReturnAdsEnabled(boolean z) {
            return this;
        }

        public InitParams setSdkAdPrefs(SDKAdPreferences sDKAdPreferences) {
            this.sdkAdPrefs = sDKAdPreferences;
            return this;
        }

        private InitParams(Context context, String str) {
            this.context = context;
            this.appId = str;
        }
    }

    public static void addWrapper(Context context, String str, String str2) {
        qg qgVar = pg.f382a;
        qgVar.getClass();
        if (context == null || str == null || str2 == null) {
            return;
        }
        if (qgVar.o == null) {
            qgVar.o = new TreeMap();
        }
        qgVar.o.put(str, str2);
        af afVar = (af) com.startapp.sdk.components.a.a(context).G.a();
        TreeMap treeMap = qgVar.o;
        WeakHashMap weakHashMap = zh.f528a;
        String jSONObject = new JSONObject(treeMap).toString();
        ze edit = afVar.edit();
        edit.a("sharedPrefsWrappers", jSONObject);
        edit.f526a.putString("sharedPrefsWrappers", jSONObject);
        edit.apply();
    }

    public static void enableConsent(Context context, boolean z) {
        ((x5) com.startapp.sdk.components.a.a(context).i.a()).f = z;
    }

    public static void enableMediationMode(Context context, String str, String str2) {
        enableConsent(context, false);
        StartAppAd.disableAutoInterstitial();
        addWrapper(context, str, str2);
        pg.f382a.q = true;
    }

    @Deprecated
    public static void enableReturnAds(boolean z) {
    }

    private static void ensureValidAppId(String str) {
        if (str == null) {
            throw new NullPointerException(paramIs("appId", null, null));
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException(paramIs("appId", "empty", null));
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                throw new IllegalArgumentException(paramIs("appId", Constants.COLLATION_INVALID, str));
            }
        }
    }

    private static void ensureValidContext(Context context) {
        if (context == null) {
            throw new NullPointerException(paramIs("context", null, null));
        }
        if ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) {
            throw new IllegalArgumentException(paramIs("context", Constants.COLLATION_INVALID, "getBaseContext() == null"));
        }
        if (context.getApplicationContext() == null) {
            throw new IllegalArgumentException(paramIs("context", Constants.COLLATION_INVALID, "getApplicationContext() == null"));
        }
    }

    public static String getBidToken() {
        return x1.a(pg.f382a.t);
    }

    public static SharedPreferences getExtras(Context context) {
        return (SharedPreferences) com.startapp.sdk.components.a.a(context).I.a();
    }

    public static String getVersion() {
        return "5.3.2";
    }

    public static void inAppPurchaseMade(Context context) {
        inAppPurchaseMade(context, 0.0d);
    }

    public static void init(Context context, String str) {
        init(context, str, new SDKAdPreferences());
    }

    public static InitParams initParams(Context context, String str) {
        ensureValidContext(context);
        ensureValidAppId(str);
        return new InitParams(context, str);
    }

    private static String paramIs(String str, String str2, String str3) {
        return str + " is " + str2 + (str3 == null ? "" : ": ".concat(str3));
    }

    public static void setTestAdsEnabled(boolean z) {
        pg.f382a.t = z;
    }

    public static void setUserConsent(Context context, String str, long j, boolean z) {
        pg.f382a.getClass();
        if ("pas".equalsIgnoreCase(str)) {
            af afVar = (af) com.startapp.sdk.components.a.a(context).G.a();
            String string = afVar.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
            if (string != null) {
                if (string.equals(z ? "1" : CommonUrlParts.Values.FALSE_INTEGER)) {
                    return;
                }
            }
            String concat = (z ? "1" : CommonUrlParts.Values.FALSE_INTEGER).concat("M");
            n8 n8Var = new n8(o8.d);
            n8Var.d = "User consent: " + str;
            n8Var.e = concat;
            n8Var.a();
            ze edit = afVar.edit();
            String str2 = z ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            edit.a("USER_CONSENT_PERSONALIZED_ADS_SERVING", str2);
            edit.f526a.putString("USER_CONSENT_PERSONALIZED_ADS_SERVING", str2);
            edit.apply();
            vf.d.a(context, MetaDataRequest$RequestReason.PAS);
        }
    }

    public static void startNewSession(Context context) {
        vf.d.a(context, MetaDataRequest$RequestReason.CUSTOM);
    }

    public static void inAppPurchaseMade(Context context, double d) {
        af afVar = (af) com.startapp.sdk.components.a.a(context).G.a();
        float f = afVar.getFloat("inAppPurchaseAmount", 0.0f);
        ze edit = afVar.edit();
        float f2 = (float) (f + d);
        edit.a("inAppPurchaseAmount", Float.valueOf(f2));
        edit.f526a.putFloat("inAppPurchaseAmount", f2);
        edit.putBoolean("payingUser", true).apply();
        vf.d.a(context, MetaDataRequest$RequestReason.IN_APP_PURCHASE);
    }

    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences) {
        init(context, (String) null, str, sDKAdPreferences);
    }

    public static void init(Context context, String str, String str2) {
        init(context, str, str2, new SDKAdPreferences());
    }

    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences) {
        init(context, str, str2, sDKAdPreferences, true);
    }

    @Deprecated
    public static void init(Context context, String str, boolean z) {
        init(context, (String) null, str, z);
    }

    @Deprecated
    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z) {
        pg.f382a.a(context, str, str2, sDKAdPreferences, null);
    }

    @Deprecated
    public static void init(Context context, String str, String str2, boolean z) {
        init(context, str, str2, new SDKAdPreferences(), z);
    }

    @Deprecated
    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences, boolean z) {
        init(context, null, str, sDKAdPreferences, z);
    }
}
