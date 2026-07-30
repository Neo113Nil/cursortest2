package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1jSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.oaid.OaidClient;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.l5;
import defpackage.sv0;
import defpackage.tv0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFa1bSDK {
    static String AFInAppEventParameterName;
    static Boolean valueOf;
    public final String[] AFInAppEventType;

    public AFa1bSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.AFInAppEventType = null;
            return;
        }
        Pattern compile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !compile.matcher(str).matches()) {
                AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase(Locale.getDefault()));
            }
        }
        if (arrayList.contains("all")) {
            this.AFInAppEventType = new String[]{"all"};
        } else if (arrayList.isEmpty()) {
            this.AFInAppEventType = null;
        } else {
            this.AFInAppEventType = (String[]) arrayList.toArray(new String[0]);
        }
    }

    private static boolean AFInAppEventType() {
        Boolean bool = valueOf;
        return bool == null || bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFc1uSDK.AFa1wSDK AFKeystoreWrapper(Context context) {
        Boolean bool;
        OaidClient.Info fetch;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String str = AFInAppEventParameterName;
        boolean z = str != null;
        if (!z) {
            Boolean bool2 = valueOf;
            if ((bool2 != null && bool2.booleanValue()) || (valueOf == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(appsFlyerProperties.isEnableLog());
                    fetch = oaidClient.fetch();
                } catch (Throwable unused) {
                    str = null;
                }
                if (fetch != null) {
                    String id = fetch.getId();
                    try {
                        bool = fetch.getLat();
                        str = id;
                    } catch (Throwable unused2) {
                        str = id;
                        AFLogger.afDebugLog("No OAID library");
                        bool = null;
                        if (str != null) {
                        }
                    }
                    if (str != null) {
                        return null;
                    }
                    AFc1uSDK.AFa1wSDK aFa1wSDK = new AFc1uSDK.AFa1wSDK(str, bool);
                    aFa1wSDK.values = Boolean.valueOf(z);
                    return aFa1wSDK;
                }
            }
            bool = null;
            str = null;
            if (str != null) {
            }
        }
        bool = null;
        if (str != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0143 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFc1uSDK.AFa1wSDK valueOf(Context context, Map<String, Object> map) {
        int i;
        boolean z;
        Throwable th;
        Boolean bool;
        String string;
        Boolean bool2;
        String str = null;
        if (!AFInAppEventType()) {
            return null;
        }
        AFLogger.afInfoLog("Trying to fetch GAID..");
        StringBuilder sb = new StringBuilder();
        try {
            i = sv0.d.b(context, tv0.a);
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("isGooglePlayServicesAvailable error", th2);
            i = -1;
        }
        try {
            l5.a a = l5.a(context);
            string = a.a;
            try {
                bool2 = Boolean.valueOf(a.b);
            } catch (Throwable th3) {
                bool = null;
                str = string;
                th = th3;
                z = false;
            }
        } catch (Throwable th4) {
            z = false;
            th = th4;
            bool = null;
        }
        if (string != null) {
            try {
                if (string.length() == 0) {
                }
                z = true;
            } catch (Throwable th5) {
                bool = bool2;
                str = string;
                th = th5;
                z = true;
                StringBuilder sb2 = new StringBuilder("Google Play Services is missing ");
                sb2.append(th.getMessage());
                AFLogger.afErrorLog(sb2.toString(), th);
                sb.append(th.getClass().getSimpleName());
                sb.append(" |");
                AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
                if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                    try {
                        AFa1jSDK.AFa1wSDK AFInAppEventType = AFa1jSDK.AFInAppEventType(context);
                        String str2 = AFInAppEventType.AFInAppEventParameterName;
                        bool2 = Boolean.valueOf(AFInAppEventType.AFKeystoreWrapper());
                        if (str2 != null) {
                            if (str2.length() == 0) {
                            }
                            string = str2;
                        }
                        sb.append("emptyOrNull (bypass) |");
                        string = str2;
                    } catch (Throwable th6) {
                        AFLogger.afErrorLog(th6.getMessage(), th6, true, false, false);
                        sb.append(th6.getClass().getSimpleName());
                        sb.append(" |");
                        string = AppsFlyerProperties.getInstance().getString("advertiserId");
                        Boolean valueOf2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                        if (th6.getLocalizedMessage() != null) {
                            AFLogger.afInfoLog(th6.getLocalizedMessage());
                        } else {
                            AFLogger.afInfoLog(th6.toString());
                        }
                        bool2 = valueOf2;
                    }
                } else {
                    string = str;
                    bool2 = bool;
                }
                if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                }
                if (sb.length() > 0) {
                }
                if (string != null) {
                }
                return new AFc1uSDK.AFa1wSDK(string, bool2);
            }
            if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                string = AppsFlyerProperties.getInstance().getString("advertiserId");
                bool2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                sb.append("context = android.app.ReceiverRestrictedContext |");
            }
            if (sb.length() > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i);
                sb3.append(": ");
                sb3.append((Object) sb);
                map.put("gaidError", sb3.toString());
            }
            if (string != null && bool2 != null) {
                map.put("advertiserId", string);
                map.put("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
                AppsFlyerProperties.getInstance().set("advertiserId", string);
                AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
                map.put("isGaidWithGps", String.valueOf(z));
            }
            return new AFc1uSDK.AFa1wSDK(string, bool2);
        }
        sb.append("emptyOrNull |");
        z = true;
        if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
        }
        if (sb.length() > 0) {
        }
        if (string != null) {
            map.put("advertiserId", string);
            map.put("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
            AppsFlyerProperties.getInstance().set("advertiserId", string);
            AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
            map.put("isGaidWithGps", String.valueOf(z));
        }
        return new AFc1uSDK.AFa1wSDK(string, bool2);
    }

    public static AFc1uSDK.AFa1wSDK values(ContentResolver contentResolver) {
        String str;
        if (!AFInAppEventType() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new AFc1uSDK.AFa1wSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i == 2) {
            return null;
        }
        try {
            str = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            str = BuildConfig.FLAVOR;
        }
        return new AFc1uSDK.AFa1wSDK(str, Boolean.TRUE);
    }

    public AFa1bSDK() {
    }
}
