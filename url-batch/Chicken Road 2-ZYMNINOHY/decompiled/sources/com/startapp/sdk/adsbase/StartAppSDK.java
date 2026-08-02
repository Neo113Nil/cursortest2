package com.startapp.sdk.adsbase;

import E.AbstractC0005f;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.internal.d2;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.fh;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.gh;
import com.startapp.sdk.internal.mg;
import com.startapp.sdk.internal.rf;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.si;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.TreeMap;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class StartAppSDK {

    public static class InitParams {
        private String accountId;
        private final String appId;
        private Runnable callback;
        private final Context context;
        private SDKAdPreferences sdkAdPrefs;

        public void init() {
            fh.f6918a.a(this.context, this.accountId, this.appId, this.sdkAdPrefs, this.callback);
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
        gh ghVar = fh.f6918a;
        ghVar.getClass();
        if (context == null || str == null || str2 == null) {
            return;
        }
        if (ghVar.o == null) {
            ghVar.o = new TreeMap();
        }
        ghVar.o.put(str, str2);
        sf sfVar = (sf) com.startapp.sdk.components.a.a(context).f6547G.a();
        TreeMap treeMap = ghVar.o;
        WeakHashMap weakHashMap = si.f7575a;
        String jSONObject = new JSONObject(treeMap).toString();
        rf edit = sfVar.edit();
        edit.a("sharedPrefsWrappers", jSONObject);
        edit.f7532a.putString("sharedPrefsWrappers", jSONObject);
        edit.apply();
    }

    public static void enableConsent(Context context, boolean z) {
        ((g6) com.startapp.sdk.components.a.a(context).f6569j.a()).f6977f = z;
    }

    public static void enableMediationMode(Context context, String str, String str2) {
        enableConsent(context, false);
        StartAppAd.disableAutoInterstitial();
        addWrapper(context, str, str2);
        fh.f6918a.f7014q = true;
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
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt < '0' || charAt > '9') {
                throw new IllegalArgumentException(paramIs("appId", "invalid", str));
            }
        }
    }

    private static void ensureValidContext(Context context) {
        if (context == null) {
            throw new NullPointerException(paramIs("context", null, null));
        }
        if ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) {
            throw new IllegalArgumentException(paramIs("context", "invalid", "getBaseContext() == null"));
        }
        if (context.getApplicationContext() == null) {
            throw new IllegalArgumentException(paramIs("context", "invalid", "getApplicationContext() == null"));
        }
    }

    public static String getBidToken() {
        return d2.a(fh.f6918a.f7017t);
    }

    public static SharedPreferences getExtras(Context context) {
        return (SharedPreferences) com.startapp.sdk.components.a.a(context).f6549I.a();
    }

    public static String getVersion() {
        return "5.3.0";
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
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" is ");
        sb.append(str2);
        sb.append(str3 == null ? "" : ": ".concat(str3));
        return sb.toString();
    }

    public static void setTestAdsEnabled(boolean z) {
        fh.f6918a.f7017t = z;
    }

    public static void setUserConsent(Context context, String str, long j4, boolean z) {
        fh.f6918a.getClass();
        if ("pas".equalsIgnoreCase(str)) {
            sf sfVar = (sf) com.startapp.sdk.components.a.a(context).f6547G.a();
            String string = sfVar.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
            String str2 = CommonUrlParts.Values.FALSE_INTEGER;
            if (string != null) {
                if (string.equals(z ? "1" : CommonUrlParts.Values.FALSE_INTEGER)) {
                    return;
                }
            }
            String concat = (z ? "1" : CommonUrlParts.Values.FALSE_INTEGER).concat("M");
            d9 d9Var = new d9(e9.f6838d);
            d9Var.f6792d = AbstractC0005f.n("User consent: ", str);
            d9Var.f6793e = concat;
            d9Var.a();
            rf edit = sfVar.edit();
            if (z) {
                str2 = "1";
            }
            edit.a("USER_CONSENT_PERSONALIZED_ADS_SERVING", str2);
            edit.f7532a.putString("USER_CONSENT_PERSONALIZED_ADS_SERVING", str2);
            edit.apply();
            mg.f7288d.a(context, MetaDataRequest$RequestReason.PAS);
        }
    }

    public static void startNewSession(Context context) {
        mg.f7288d.a(context, MetaDataRequest$RequestReason.CUSTOM);
    }

    public static void inAppPurchaseMade(Context context, double d4) {
        sf sfVar = (sf) com.startapp.sdk.components.a.a(context).f6547G.a();
        float f4 = sfVar.getFloat("inAppPurchaseAmount", 0.0f);
        rf edit = sfVar.edit();
        float f5 = (float) (f4 + d4);
        edit.a("inAppPurchaseAmount", Float.valueOf(f5));
        edit.f7532a.putFloat("inAppPurchaseAmount", f5);
        edit.a("payingUser", Boolean.TRUE);
        edit.f7532a.putBoolean("payingUser", true);
        edit.apply();
        mg.f7288d.a(context, MetaDataRequest$RequestReason.IN_APP_PURCHASE);
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
        fh.f6918a.a(context, str, str2, sDKAdPreferences, null);
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
