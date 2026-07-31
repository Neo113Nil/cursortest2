package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class y8 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20380a = "NETWORK_TYPE_WIFI";

    /* renamed from: b, reason: collision with root package name */
    public static final String f20381b = "NETWORK_TYPE_VPN";

    /* renamed from: c, reason: collision with root package name */
    public static final String f20382c = "NETWORK_TYPE_ETHERNET";

    /* renamed from: d, reason: collision with root package name */
    public static final String f20383d = "NETWORK_TYPE_UNKNOWN";

    /* renamed from: e, reason: collision with root package name */
    public static final String f20384e = "notReachable";

    /* renamed from: f, reason: collision with root package name */
    public static final String f20385f = "PHONE_TYPE_NONE";

    /* renamed from: g, reason: collision with root package name */
    public static final String f20386g = "NETWORK_TYPE_GPRS";

    /* renamed from: h, reason: collision with root package name */
    public static final String f20387h = "NETWORK_TYPE_EDGE";

    /* renamed from: i, reason: collision with root package name */
    public static final String f20388i = "NETWORK_TYPE_UMTS";

    /* renamed from: j, reason: collision with root package name */
    public static final String f20389j = "NETWORK_TYPE_CDMA";

    /* renamed from: k, reason: collision with root package name */
    public static final String f20390k = "NETWORK_TYPE_EVDO_0";

    /* renamed from: l, reason: collision with root package name */
    public static final String f20391l = "NETWORK_TYPE_EVDO_A";

    /* renamed from: m, reason: collision with root package name */
    public static final String f20392m = "NETWORK_TYPE_1xRTT";

    /* renamed from: n, reason: collision with root package name */
    public static final String f20393n = "NETWORK_TYPE_HSDPA";

    /* renamed from: o, reason: collision with root package name */
    public static final String f20394o = "NETWORK_TYPE_HSUPA";

    /* renamed from: p, reason: collision with root package name */
    public static final String f20395p = "NETWORK_TYPE_HSPA";

    /* renamed from: q, reason: collision with root package name */
    public static final String f20396q = "NETWORK_TYPE_IDEN";

    /* renamed from: r, reason: collision with root package name */
    public static final String f20397r = "NETWORK_TYPE_EVDO_B";

    /* renamed from: s, reason: collision with root package name */
    public static final String f20398s = "NETWORK_TYPE_LTE";

    /* renamed from: t, reason: collision with root package name */
    public static final String f20399t = "NETWORK_TYPE_EHRPD";

    /* renamed from: u, reason: collision with root package name */
    public static final String f20400u = "NETWORK_TYPE_HSPAP";

    /* renamed from: v, reason: collision with root package name */
    public static final String f20401v = "NETWORK_TYPE_GSM";

    /* renamed from: w, reason: collision with root package name */
    public static final String f20402w = "NETWORK_TYPE_TD_SCDMA";

    /* renamed from: x, reason: collision with root package name */
    public static final String f20403x = "NETWORK_TYPE_IWLAN";

    /* renamed from: y, reason: collision with root package name */
    public static final String f20404y = "NETWORK_TYPE_LTE_CA";

    /* renamed from: z, reason: collision with root package name */
    public static final String f20405z = "NETWORK_TYPE_NR";

    @SuppressLint({"MissingPermission"})
    public static Network a(Context context) {
        if (context == null) {
            return null;
        }
        return a((ConnectivityManager) context.getSystemService("connectivity"));
    }

    public static String b(Context context) {
        return a(a(context), context);
    }

    private static String c(Context context) {
        String a4 = x8.a(context);
        return TextUtils.isEmpty(a4) ? "none" : a4;
    }

    public static String d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            Network a4 = a(connectivityManager);
            if (a4 == null) {
                return f20384e;
            }
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(a4);
                if (networkCapabilities == null) {
                    return f20383d;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return f20380a;
                }
                if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return a(activeNetworkInfo.getSubtype());
                }
            } catch (Throwable th) {
                o9.d().a(th);
                IronLog.INTERNAL.error("Error getting network capabilities: " + th);
            }
        }
        return f20383d;
    }

    public static boolean e(Context context) {
        return b(context, a(context)).equals("vpn");
    }

    private static Network a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (Throwable th) {
            o9.d().a(th);
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    private static String b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (network == null || context == null) {
            return "";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                return networkCapabilities.hasTransport(1) ? x8.f20294b : networkCapabilities.hasTransport(0) ? x8.f20299g : networkCapabilities.hasTransport(4) ? "vpn" : networkCapabilities.hasTransport(3) ? x8.f20297e : networkCapabilities.hasTransport(5) ? x8.f20300h : networkCapabilities.hasTransport(6) ? x8.f20301i : networkCapabilities.hasTransport(2) ? x8.f20296d : "";
            }
            return "";
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return "";
        }
    }

    private static String a(int i4) {
        switch (i4) {
            case 0:
                return f20385f;
            case 1:
                return f20386g;
            case 2:
                return f20387h;
            case 3:
                return f20388i;
            case 4:
                return f20389j;
            case 5:
                return f20390k;
            case 6:
                return f20391l;
            case 7:
                return f20392m;
            case 8:
                return f20393n;
            case 9:
                return f20394o;
            case 10:
                return f20395p;
            case 11:
                return f20396q;
            case 12:
                return f20397r;
            case 13:
                return f20398s;
            case 14:
                return f20399t;
            case 15:
                return f20400u;
            case 16:
                return f20401v;
            case 17:
                return f20402w;
            case 18:
                return f20403x;
            case 19:
                return f20404y;
            case 20:
                return f20405z;
            default:
                return f20383d;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String a(Network network, Context context) {
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network != null && connectivityManager != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        return x8.f20294b;
                    }
                    if (networkCapabilities.hasTransport(0)) {
                        return x8.f20293a;
                    }
                }
                return c(context);
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }
        return "none";
    }

    @SuppressLint({"MissingPermission"})
    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put(b9.i.f15583v, e(context));
                    return jSONObject;
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }
        return jSONObject;
    }
}
