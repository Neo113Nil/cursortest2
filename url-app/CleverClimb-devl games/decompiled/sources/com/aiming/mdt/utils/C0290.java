package com.aiming.mdt.utils;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.utils.C0272;
import com.tapjoy.TapjoyConstants;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.aiming.mdt.utils.ʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0290 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, Object> m981(Context context) {
        String str;
        String m982;
        ConnectivityManager connectivityManager;
        HashMap hashMap = new HashMap();
        hashMap.put("PackageName", context.getPackageName());
        hashMap.put("UserAgent", m987(context));
        if (context != null) {
            NetworkInfo networkInfo = null;
            if (context.getSystemService("connectivity") != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo != null) {
                if (networkInfo.getType() == 1) {
                    str = "2";
                } else if (networkInfo.getType() == 0) {
                    str = "6";
                }
                hashMap.put("ConnectType", str);
                C0272.C0274 m927 = C0272.m927(context);
                String m937 = m927 != null ? "" : m927.m937();
                StringBuilder sb = new StringBuilder("Gaid:");
                sb.append(m937);
                C0282.m971(sb.toString());
                hashMap.put("AdvertisingId", m937);
                m982 = m982(context);
                StringBuilder sb2 = new StringBuilder("fbId:");
                sb2.append(m982);
                C0282.m971(sb2.toString());
                if (!TextUtils.isEmpty(m982)) {
                    hashMap.put("FacebookId", m982);
                }
                hashMap.put("InstallFacebook", Boolean.valueOf(m986(context)));
                return hashMap;
            }
        }
        str = "0";
        hashMap.put("ConnectType", str);
        C0272.C0274 m9272 = C0272.m927(context);
        if (m9272 != null) {
        }
        StringBuilder sb3 = new StringBuilder("Gaid:");
        sb3.append(m937);
        C0282.m971(sb3.toString());
        hashMap.put("AdvertisingId", m937);
        m982 = m982(context);
        StringBuilder sb22 = new StringBuilder("fbId:");
        sb22.append(m982);
        C0282.m971(sb22.toString());
        if (!TextUtils.isEmpty(m982)) {
        }
        hashMap.put("InstallFacebook", Boolean.valueOf(m986(context)));
        return hashMap;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static String m982(Context context) {
        String[] strArr = {"aid"};
        Cursor cursor = null;
        try {
            try {
                if (!m986(context)) {
                    return "";
                }
                Cursor query = context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), strArr, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndex("aid"));
                            if (query != null) {
                                query.close();
                            }
                            return string;
                        }
                    } catch (Exception e) {
                        cursor = query;
                        e = e;
                        C0282.m970("DeviceUtil", e);
                        C0282.m969("Facebook ID get fail");
                        if (cursor == null) {
                            return "";
                        }
                        cursor.close();
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return "";
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static String m983(String str) {
        return (str.equals("armeabi") || str.equals("armeabi-v7a")) ? "arm" : str.equals("arm64-v8a") ? "arm64" : str;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static boolean m984(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17) {
            if (!activity.isDestroyed()) {
                return true;
            }
        } else if (!activity.isFinishing()) {
            return true;
        }
        return false;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static Map<String, Object> m985(Context context) {
        Method method;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("AndroidId", Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID));
            Class<?> cls = Class.forName("android.os.SystemProperties");
            if (cls != null && (method = cls.getMethod("get", String.class)) != null) {
                hashMap.put("ro.build.display.id", method.invoke(null, "ro.build.display.id"));
                hashMap.put("os.arch", method.invoke(null, "os.arch"));
                String obj = method.invoke(null, "ro.product.cpu.abi").toString();
                String obj2 = method.invoke(null, "ro.product.cpu.abi2").toString();
                hashMap.put("ro.product.cpu.abi", obj);
                hashMap.put("ro.product.cpu.abi2", obj2);
                String m983 = m983(obj);
                if (TextUtils.isEmpty(m983)) {
                    m983 = m983(obj2);
                }
                hashMap.put("CPUType", m983);
            }
        } catch (Exception e) {
            C0282.m972("DeviceUtil", e);
            C0076.m232().m236(e);
        }
        return hashMap;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m986(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(Constants.PKG_FB, 256) != null;
        } catch (Exception e) {
            C0282.m972("DeviceUtil", e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m987(Context context) {
        String defaultUserAgent;
        int length;
        int i;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
            }
            StringBuilder sb = new StringBuilder();
            length = defaultUserAgent.length();
            for (i = 0; i < length; i++) {
                char charAt = defaultUserAgent.charAt(i);
                if (charAt <= 31 || charAt >= 127) {
                    sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                } else {
                    sb.append(charAt);
                }
            }
            return sb.toString();
        }
        defaultUserAgent = System.getProperty("http.agent");
        StringBuilder sb2 = new StringBuilder();
        length = defaultUserAgent.length();
        while (i < length) {
        }
        return sb2.toString();
    }
}
