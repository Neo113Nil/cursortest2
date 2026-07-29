package com.applovin.impl.sdk.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.os.EnvironmentCompat;
import com.applovin.impl.sdk.d.q;
import com.cmplay.base.util.webview.util.WebUtils;
import com.tapjoy.TapjoyConstants;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f3159a = {7, 4, 2, 1, 11};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f3160b = {5, 6, 10, 3, 9, 8, 14};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f3161c = {15, 12, 13};

    /* renamed from: d, reason: collision with root package name */
    private static final String f3162d = e.class.getSimpleName();

    private static NetworkInfo a(Context context) {
        ConnectivityManager connectivityManager;
        if (!com.applovin.impl.sdk.k.a("android.permission.ACCESS_NETWORK_STATE", context) || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public static q.a a(boolean z, com.applovin.impl.sdk.j jVar) {
        q.a aVar = z ? q.a.MEDIATION_MAIN : q.a.MAIN;
        return (!((Boolean) jVar.a(com.applovin.impl.sdk.b.b.dR)).booleanValue() || ((Boolean) jVar.a(com.applovin.impl.sdk.b.b.dP)).booleanValue()) ? aVar : q.a.MAIN;
    }

    public static String a(InputStream inputStream, com.applovin.impl.sdk.j jVar) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[((Integer) jVar.a(com.applovin.impl.sdk.b.b.dT)).intValue()];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    return byteArrayOutputStream.toString("UTF-8");
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            jVar.u().b(f3162d, "Encountered error while reading stream", th);
            return null;
        }
    }

    public static String a(String str, com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(com.applovin.impl.sdk.b.b.ay), str, jVar);
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.j jVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        return str + str2;
    }

    public static JSONObject a(JSONObject jSONObject) throws JSONException {
        return (JSONObject) jSONObject.getJSONArray("results").get(0);
    }

    public static void a(int i, com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.sdk.b.b<?> bVar;
        Object obj;
        com.applovin.impl.sdk.b.c v = jVar.v();
        if (i == 401) {
            v.a(com.applovin.impl.sdk.b.b.M, "");
            bVar = com.applovin.impl.sdk.b.b.O;
            obj = "";
        } else {
            if (i != 418) {
                if ((i < 400 || i >= 500) && i != -1) {
                    return;
                }
                jVar.f();
                return;
            }
            bVar = com.applovin.impl.sdk.b.b.L;
            obj = true;
        }
        v.a(bVar, obj);
        v.a();
    }

    private static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, com.applovin.impl.sdk.j jVar) {
        if (!(com.applovin.impl.sdk.k.a("android.permission.ACCESS_NETWORK_STATE", context) && context.getSystemService("connectivity") != null)) {
            return true;
        }
        NetworkInfo a2 = a(context);
        return a2 != null ? a2.isConnected() : ((Boolean) jVar.a(com.applovin.impl.sdk.b.b.dM)).booleanValue();
    }

    public static String b(String str, com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(com.applovin.impl.sdk.b.b.az), str, jVar);
    }

    public static Map<String, String> c(com.applovin.impl.sdk.j jVar) {
        HashMap hashMap = new HashMap();
        String str = (String) jVar.a(com.applovin.impl.sdk.b.b.O);
        if (i.b(str)) {
            hashMap.put("device_token", str);
        } else if (!((Boolean) jVar.a(com.applovin.impl.sdk.b.b.eU)).booleanValue()) {
            hashMap.put(TapjoyConstants.TJC_API_KEY, jVar.s());
        }
        hashMap.put(WebUtils.SC, i.e((String) jVar.a(com.applovin.impl.sdk.b.b.Q)));
        hashMap.put("sc2", i.e((String) jVar.a(com.applovin.impl.sdk.b.b.R)));
        hashMap.put("server_installed_at", i.e((String) jVar.a(com.applovin.impl.sdk.b.b.S)));
        l.a("persisted_data", i.e((String) jVar.a(com.applovin.impl.sdk.b.d.r)), hashMap);
        return hashMap;
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        String a2 = f.a(jSONObject, "persisted_data", (String) null, jVar);
        if (i.b(a2)) {
            jVar.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<String>>) com.applovin.impl.sdk.b.d.r, (com.applovin.impl.sdk.b.d<String>) a2);
            jVar.u().b(f3162d, "Updated persisted data");
        }
    }

    public static String d(com.applovin.impl.sdk.j jVar) {
        NetworkInfo a2 = a(jVar.w());
        if (a2 == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        int type = a2.getType();
        int subtype = a2.getSubtype();
        String str = type == 1 ? TapjoyConstants.TJC_CONNECTION_TYPE_WIFI : type == 0 ? a(subtype, f3159a) ? "2g" : a(subtype, f3160b) ? "3g" : a(subtype, f3161c) ? "4g" : TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE : EnvironmentCompat.MEDIA_UNKNOWN;
        jVar.u().a(f3162d, "Network " + type + "/" + subtype + " resolved to " + str);
        return str;
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        try {
            if (jSONObject.has("settings")) {
                com.applovin.impl.sdk.b.c v = jVar.v();
                if (jSONObject.isNull("settings")) {
                    return;
                }
                v.a(jSONObject.getJSONObject("settings"));
                v.a();
                jVar.u().a(f3162d, "New settings processed");
            }
        } catch (JSONException e) {
            jVar.u().b(f3162d, "Unable to parse settings out of API response", e);
        }
    }

    public static String e(com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(com.applovin.impl.sdk.b.b.aw), "4.0/ad", jVar);
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        JSONArray a2 = f.a(jSONObject, "zones", (JSONArray) null, jVar);
        if (a2 != null) {
            Iterator<com.applovin.impl.sdk.ad.d> it = jVar.O().a(a2).iterator();
            while (it.hasNext()) {
                com.applovin.impl.sdk.ad.d next = it.next();
                if (next.d()) {
                    jVar.o().preloadAds(next);
                } else {
                    jVar.n().preloadAds(next);
                }
            }
            jVar.L().a(jVar.O().b());
            jVar.M().a(jVar.O().b());
        }
    }

    public static String f(com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(com.applovin.impl.sdk.b.b.ax), "4.0/ad", jVar);
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        JSONObject a2 = f.a(jSONObject, "variables", (JSONObject) null, jVar);
        if (a2 != null) {
            jVar.r().updateVariables(a2);
        }
    }
}
