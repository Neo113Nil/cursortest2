package com.ironsource.b.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.ironsource.b.d.c;
import com.tapjoy.TapjoyConstants;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IronSourceUtils.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static int f6941a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static String f6942b = "";

    public static String d() {
        return "6.7.9";
    }

    public static int a() {
        return f6941a;
    }

    static void a(String str) {
        f6942b = str;
    }

    public static String b() {
        return f6942b;
    }

    public static String b(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (Throwable th) {
            if (str == null) {
                com.ironsource.b.d.d.c().a(c.a.NATIVE, "getMD5(input:null)", th);
                return "";
            }
            com.ironsource.b.d.d.c().a(c.a.NATIVE, "getMD5(input:" + str + ")", th);
            return "";
        }
    }

    private static String d(String str) {
        try {
            return String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e) {
            if (str == null) {
                com.ironsource.b.d.d.c().a(c.a.NATIVE, "getSHA256(input:null)", e);
                return "";
            }
            com.ironsource.b.d.d.c().a(c.a.NATIVE, "getSHA256(input:" + str + ")", e);
            return "";
        }
    }

    public static String c(String str) {
        return d(str);
    }

    public static int c() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static String a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE") || !activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) ? "cellular" : TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
    }

    private static String e(String str) {
        return "IS".equals(str) ? "default_is_events_url" : "RV".equals(str) ? "default_rv_events_url" : "";
    }

    private static String f(String str) {
        return "IS".equals(str) ? "default_is_opt_out_events" : "RV".equals(str) ? "default_rv_opt_out_events" : "";
    }

    private static String g(String str) {
        return "IS".equals(str) ? "default_is_events_formatter_type" : "RV".equals(str) ? "default_rv_events_formatter_type" : "";
    }

    public static synchronized void a(Context context, String str, String str2) {
        synchronized (g.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                edit.putString(e(str), str2);
                edit.commit();
            } catch (Exception e) {
                com.ironsource.b.d.d.c().a(c.a.NATIVE, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e);
            }
        }
    }

    public static synchronized void a(Context context, String str, int[] iArr) {
        synchronized (g.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i : iArr) {
                        sb.append(i);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(f(str), str2);
                edit.commit();
            } catch (Exception e) {
                com.ironsource.b.d.d.c().a(c.a.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e);
            }
        }
    }

    public static synchronized void b(Context context, String str, String str2) {
        synchronized (g.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                edit.putString(g(str), str2);
                edit.commit();
            } catch (Exception e) {
                com.ironsource.b.d.d.c().a(c.a.NATIVE, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e);
            }
        }
    }

    public static synchronized String c(Context context, String str, String str2) {
        String str3;
        synchronized (g.class) {
            try {
                str3 = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(g(str), str2);
            } catch (Exception e) {
                com.ironsource.b.d.d.c().a(c.a.NATIVE, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e);
                str3 = str2;
            }
        }
        return str3;
    }

    public static synchronized String d(Context context, String str, String str2) {
        String str3;
        synchronized (g.class) {
            try {
                str3 = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(e(str), str2);
            } catch (Exception e) {
                com.ironsource.b.d.d.c().a(c.a.NATIVE, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e);
                str3 = str2;
            }
        }
        return str3;
    }

    public static synchronized int[] a(Context context, String str) {
        int[] iArr;
        synchronized (g.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(f(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int[] iArr2 = new int[arrayList.size()];
                    for (int i = 0; i < iArr2.length; i++) {
                        try {
                            iArr2[i] = ((Integer) arrayList.get(i)).intValue();
                        } catch (Exception e) {
                            e = e;
                            iArr = iArr2;
                            com.ironsource.b.d.d.c().a(c.a.NATIVE, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e);
                            return iArr;
                        }
                    }
                    iArr = iArr2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return iArr;
    }

    public static synchronized void b(Context context, String str) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
            edit.putString("last_response", str);
            edit.apply();
        }
    }

    public static String b(Context context) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString("last_response", "");
    }

    static synchronized void a(Context context, JSONObject jSONObject) {
        synchronized (g.class) {
            if (context == null || jSONObject == null) {
                return;
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
            edit.putString("general_properties", jSONObject.toString());
            edit.apply();
        }
    }

    public static boolean c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    public static long e() {
        return System.currentTimeMillis();
    }

    public static JSONObject a(com.ironsource.b.c cVar, boolean z) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("networkInstance", "true");
            } catch (Exception e) {
                com.ironsource.b.d.d.c().a(c.a.NATIVE, "IronSourceUtils:getProviderAdditionalData(adapter: " + cVar.n() + ")", e);
            }
        }
        jSONObject.put("spId", cVar.o());
        jSONObject.put(com.umeng.analytics.pro.b.H, cVar.n());
        jSONObject.put("providerSDKVersion", cVar.s().getCoreSDKVersion());
        jSONObject.put("providerAdapterVersion", cVar.s().getVersion());
        jSONObject.put("providerPriority", cVar.t());
        return jSONObject;
    }

    public static JSONObject a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("networkInstance", "true");
            } catch (JSONException unused) {
            }
        }
        jSONObject.put(com.umeng.analytics.pro.b.H, "Mediation");
        return jSONObject;
    }

    static void e(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    static String f(Context context, String str, String str2) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(str, str2);
    }

    static void a(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    static boolean b(Context context, String str, boolean z) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getBoolean(str, z);
    }

    static void a(Context context, String str, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    static int b(Context context, String str, int i) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getInt(str, i);
    }

    static void a(Context context, String str, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    static long b(Context context, String str, long j) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getLong(str, j);
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (jSONObject == null && jSONObject2 == null) {
            return new JSONObject();
        }
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
        return jSONObject;
    }
}
