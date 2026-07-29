package com.appsflyer;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.w;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* loaded from: classes.dex */
final class aa {
    static w a(ContentResolver contentResolver) {
        String str;
        if (contentResolver == null || j.a().a("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new w(w.a.AMAZON, Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID), false);
        }
        if (i == 2) {
            return null;
        }
        try {
            str = Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID);
        } catch (Throwable th) {
            d.a("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            str = "";
        }
        return new w(w.a.AMAZON, str, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(Context context, Map<String, Object> map) {
        String str;
        String obj;
        String a2;
        String bool;
        AdvertisingIdClient.Info advertisingIdInfo;
        d.d("Trying to fetch GAID..");
        String str2 = null;
        boolean z = true;
        boolean z2 = false;
        int i = -1;
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (Throwable th) {
            th = th;
            str = null;
        }
        if (advertisingIdInfo != null) {
            str = advertisingIdInfo.getId();
            try {
                a2 = Boolean.toString(!advertisingIdInfo.isLimitAdTrackingEnabled());
                if (str != null) {
                    try {
                        if (str.length() == 0) {
                        }
                    } catch (Throwable th2) {
                        z2 = true;
                        th = th2;
                        str2 = a2;
                        d.a(th.getMessage(), th);
                        try {
                            i = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
                        } catch (Throwable th3) {
                            d.a(th3.getMessage(), th3);
                        }
                        String simpleName = th.getClass().getSimpleName();
                        d.d("WARNING: Google Play Services is missing.");
                        if (j.a().b("enableGpsFallback", true)) {
                            try {
                                str = z.a(context).a();
                                bool = Boolean.toString(!r0.b());
                            } catch (Throwable th4) {
                                d.a(th4.getMessage(), th4);
                                StringBuilder sb = new StringBuilder();
                                sb.append(simpleName);
                                sb.append("/");
                                sb.append(th4.getClass().getSimpleName());
                                obj = sb.toString();
                                str = j.a().a("advertiserId");
                                a2 = j.a().a("advertiserIdEnabled");
                                if (th4.getLocalizedMessage() != null) {
                                    d.d(th4.getLocalizedMessage());
                                } else {
                                    d.d(th4.toString());
                                }
                            }
                            if (str != null) {
                                if (str.length() != 0) {
                                    obj = simpleName;
                                    a2 = bool;
                                    str2 = obj;
                                }
                            }
                            obj = "emptyOrNull (bypass)";
                            a2 = bool;
                            str2 = obj;
                        } else {
                            a2 = str2;
                            str2 = simpleName;
                        }
                        if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                        }
                        if (str2 != null) {
                        }
                        if (str == null) {
                        }
                    }
                }
                str2 = "emptyOrNull";
                z2 = true;
            } catch (Throwable th5) {
                th = th5;
            }
            if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                str = j.a().a("advertiserId");
                a2 = j.a().a("advertiserIdEnabled");
                str2 = "context = android.app.ReceiverRestrictedContext";
            }
            if (str2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                sb2.append(": ");
                sb2.append(str2);
                map.put("gaidError", sb2.toString());
            }
            if (str == null || a2 == null) {
            }
            map.put("advertiserId", str);
            map.put("advertiserIdEnabled", a2);
            j.a().a("advertiserId", str);
            j.a().a("advertiserIdEnabled", a2);
            map.put("isGaidWithGps", String.valueOf(z2));
            return;
        }
        str = null;
        z = false;
        str2 = "gpsAdInfo-null";
        a2 = null;
        z2 = z;
        if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
        }
        if (str2 != null) {
        }
        if (str == null) {
        }
    }
}
