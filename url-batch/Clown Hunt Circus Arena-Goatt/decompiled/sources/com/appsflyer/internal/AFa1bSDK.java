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
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class AFa1bSDK {
    static String AFInAppEventParameterName;
    static Boolean valueOf;
    public final String[] AFInAppEventType;

    public AFa1bSDK() {
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
            str = "";
        }
        return new AFc1uSDK.AFa1wSDK(str, Boolean.TRUE);
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

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0045, code lost:
    
        if (r8.length() == 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFc1uSDK.AFa1wSDK valueOf(Context context, Map<String, Object> map) {
        int i;
        boolean z;
        Throwable th;
        Boolean bool;
        Boolean bool2;
        AdvertisingIdClient.Info advertisingIdInfo;
        String str = null;
        if (!AFInAppEventType()) {
            return null;
        }
        AFLogger.afInfoLog("Trying to fetch GAID..");
        StringBuilder sb = new StringBuilder();
        try {
            i = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("isGooglePlayServicesAvailable error", th2);
            i = -1;
        }
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (Throwable th3) {
            z = false;
            th = th3;
            bool = null;
        }
        if (advertisingIdInfo != null) {
            String string = advertisingIdInfo.getId();
            try {
                bool2 = Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled());
                if (string != null) {
                    try {
                    } catch (Throwable th4) {
                        bool = bool2;
                        str = string;
                        th = th4;
                        z = true;
                        AFLogger.afErrorLog(new StringBuilder("Google Play Services is missing ").append(th.getMessage()).toString(), th);
                        sb.append(th.getClass().getSimpleName()).append(" |");
                        AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
                        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                            try {
                                AFa1jSDK.AFa1wSDK AFInAppEventType = AFa1jSDK.AFInAppEventType(context);
                                string = AFInAppEventType.AFInAppEventParameterName;
                                bool2 = Boolean.valueOf(AFInAppEventType.AFKeystoreWrapper());
                                if (string == null || string.length() == 0) {
                                    sb.append("emptyOrNull (bypass) |");
                                }
                            } catch (Throwable th5) {
                                AFLogger.afErrorLog(th5.getMessage(), th5, true, false, false);
                                sb.append(th5.getClass().getSimpleName()).append(" |");
                                string = AppsFlyerProperties.getInstance().getString("advertiserId");
                                Boolean valueOf2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                                if (th5.getLocalizedMessage() != null) {
                                    AFLogger.afInfoLog(th5.getLocalizedMessage());
                                } else {
                                    AFLogger.afInfoLog(th5.toString());
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
                            map.put("advertiserId", string);
                            map.put("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
                            AppsFlyerProperties.getInstance().set("advertiserId", string);
                            AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!bool2.booleanValue()));
                            map.put("isGaidWithGps", String.valueOf(z));
                        }
                        return new AFc1uSDK.AFa1wSDK(string, bool2);
                    }
                }
                sb.append("emptyOrNull |");
                z = true;
            } catch (Throwable th6) {
                bool = null;
                str = string;
                th = th6;
                z = false;
            }
            if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                string = AppsFlyerProperties.getInstance().getString("advertiserId");
                bool2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                sb.append("context = android.app.ReceiverRestrictedContext |");
            }
            if (sb.length() > 0) {
                map.put("gaidError", new StringBuilder().append(i).append(": ").append((Object) sb).toString());
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
        sb.append("gpsAdInfo-null |");
        throw new IllegalStateException("GpsAdIndo is null");
    }

    private static boolean AFInAppEventType() {
        Boolean bool = valueOf;
        return bool == null || bool.booleanValue();
    }

    public AFa1bSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.AFInAppEventType = null;
            return;
        }
        Pattern compile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null && compile.matcher(str).matches()) {
                arrayList.add(str.toLowerCase(Locale.getDefault()));
            } else {
                AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
            }
        }
        if (arrayList.contains("all")) {
            this.AFInAppEventType = new String[]{"all"};
        } else if (!arrayList.isEmpty()) {
            this.AFInAppEventType = (String[]) arrayList.toArray(new String[0]);
        } else {
            this.AFInAppEventType = null;
        }
    }
}
