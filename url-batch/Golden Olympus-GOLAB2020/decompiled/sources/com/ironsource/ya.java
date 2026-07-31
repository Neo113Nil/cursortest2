package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ya {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20419a = "ya";

    public static JSONObject a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        String limitAdTracking = SDKUtils.getLimitAdTracking();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(f20419a, "add AID");
                jSONObject.put("deviceIds" + b9.i.f15550d + b9.i.f15530L + b9.i.f15552e, SDKUtils.encodeString(advertiserId));
            }
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(f20419a, "add LAT");
                jSONObject.put(b9.i.f15531M, Boolean.parseBoolean(limitAdTracking));
                return jSONObject;
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        return jSONObject;
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        d(context, jSONObject);
        c(jSONObject);
        b(context, jSONObject);
        g(context, jSONObject);
        e(context, jSONObject);
        b(jSONObject);
        f(context, jSONObject);
        c(context, jSONObject);
        a(context, jSONObject);
        h(context, jSONObject);
        return jSONObject;
    }

    public static JSONObject c(Context context) {
        of f4 = nm.S().f();
        za b4 = za.b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String d4 = b4.d();
            if (d4 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15564k), SDKUtils.encodeString(d4));
            }
            String c4 = b4.c();
            if (c4 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15566l), SDKUtils.encodeString(c4));
            }
            String e4 = b4.e();
            if (e4 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15568m), SDKUtils.encodeString(e4));
            }
            String f5 = b4.f();
            if (f5 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15570n), f5.replaceAll("[^0-9/.]", ""));
            }
            String f6 = b4.f();
            if (f6 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15572o), SDKUtils.encodeString(f6));
            }
            jSONObject.put(SDKUtils.encodeString(b9.i.f15574p), String.valueOf(b4.a()));
            jSONObject.put(SDKUtils.encodeString(b9.i.f15576q), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (b4.b() != null && b4.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15578r), SDKUtils.encodeString(b4.b()));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15585x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            if (a(b9.i.f15563j0)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15563j0), SDKUtils.encodeString(String.valueOf(f4.h(context))));
            }
            String g4 = C1442c4.g(context);
            if (!TextUtils.isEmpty(g4)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(g4));
            }
            String valueOf = String.valueOf(f4.h());
            if (!TextUtils.isEmpty(valueOf)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15529K), SDKUtils.encodeString(valueOf));
            }
            String valueOf2 = String.valueOf(f4.f());
            if (!TextUtils.isEmpty(valueOf2)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15533O), SDKUtils.encodeString(valueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), ep.d(context));
            jSONObject.put("mcc", x8.b(context));
            jSONObject.put("mnc", x8.c(context));
            jSONObject.put(SDKUtils.encodeString("phoneType"), x8.f(context));
            jSONObject.put(SDKUtils.encodeString(b9.i.f15536R), SDKUtils.encodeString(x8.g(context)));
            jSONObject.put(SDKUtils.encodeString(b9.i.f15540V), C1442c4.f(context));
            jSONObject.put(SDKUtils.encodeString(b9.i.f15542X), C1442c4.d(context));
            jSONObject.put(SDKUtils.encodeString(b9.i.f15541W), SDKUtils.encodeString(C1442c4.b(context)));
            jSONObject.put(SDKUtils.encodeString("stid"), ep.c(context));
            String e5 = C1442c4.e(context);
            if (!TextUtils.isEmpty(e5)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15549c0), SDKUtils.encodeString(e5));
            }
            jSONObject.put(b9.i.f15551d0, SDKUtils.encodeString(String.valueOf(f4.j())));
            jSONObject.put(b9.i.f15553e0, SDKUtils.encodeString(String.valueOf(f4.q())));
            String n4 = f4.n(context);
            if (!TextUtils.isEmpty(n4)) {
                jSONObject.put("icc", n4);
            }
            String b5 = f4.b();
            if (!TextUtils.isEmpty(b5)) {
                jSONObject.put("tz", SDKUtils.encodeString(b5));
            }
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            return jSONObject;
        } catch (Exception e6) {
            o9.d().a(e6);
            IronLog.INTERNAL.error(e6.toString());
            return jSONObject;
        }
    }

    private static void d(Context context, JSONObject jSONObject) {
        try {
            String b4 = y8.b(context);
            String d4 = y8.d(context);
            if (!TextUtils.isEmpty(d4)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15582u), SDKUtils.encodeString(d4));
            }
            if (!TextUtils.isEmpty(b4) && !b4.equals("none")) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15581t), SDKUtils.encodeString(b4));
            }
            jSONObject.put(SDKUtils.encodeString(b9.i.f15583v), y8.e(context));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private static void e(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(b9.i.f15534P), za.b(context).a(context));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private static void f(Context context, JSONObject jSONObject) {
        of f4 = nm.S().f();
        try {
            if (a(b9.i.f15565k0)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15565k0), f4.J(context));
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private static void g(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(ge.f16432W0), nm.S().f().q(context));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private static void h(Context context, JSONObject jSONObject) {
        of f4 = nm.S().f();
        try {
            if (a(b9.i.f15571n0)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15571n0), f4.d(context));
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private static void a(Context context, JSONObject jSONObject) {
        of f4 = nm.S().f();
        try {
            if (a(b9.i.f15569m0)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15569m0), f4.c(context));
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private static void b(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(b9.i.f15543Y), nm.S().f().y(context));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private static void c(Context context, JSONObject jSONObject) {
        of f4 = nm.S().f();
        try {
            if (a(b9.i.f15567l0)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15567l0), f4.l(context));
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private static void a(JSONObject jSONObject) {
        of f4 = nm.S().f();
        try {
            a(jSONObject, b9.i.f15526H, String.valueOf(f4.d()));
            a(jSONObject, b9.i.f15527I, String.valueOf(f4.k()));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private static void b(JSONObject jSONObject) {
        of f4 = nm.S().f();
        try {
            if (a(b9.i.f15561i0)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15561i0), f4.c());
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private static void c(JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(b9.i.f15586y), SDKUtils.encodeString(String.valueOf(nm.S().f().o())));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private static boolean a(String str) {
        return SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }
}
