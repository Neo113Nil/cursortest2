package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.baidu.lbsapi.auth.LBSAuthManager;
import com.baidu.location.BDLocation;
import com.baidu.mapapi.JNIInitializer;
import com.baidu.mapapi.VersionInfo;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.baidu.mshield.MH;
import com.baidu.mshield.x6.EngineImpl;
import com.baidu.platform.comapi.util.JsonBuilder;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.google.android.exoplayer2.C;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class g {
    private static String C;
    public static String F;

    /* renamed from: c, reason: collision with root package name */
    private static String f8280c;

    /* renamed from: d, reason: collision with root package name */
    private static String f8281d;

    /* renamed from: e, reason: collision with root package name */
    private static String f8282e;

    /* renamed from: f, reason: collision with root package name */
    private static String f8283f;

    /* renamed from: g, reason: collision with root package name */
    private static String f8284g;

    /* renamed from: h, reason: collision with root package name */
    private static String f8285h;

    /* renamed from: i, reason: collision with root package name */
    private static int f8286i;

    /* renamed from: j, reason: collision with root package name */
    private static int f8287j;

    /* renamed from: k, reason: collision with root package name */
    private static int f8288k;

    /* renamed from: l, reason: collision with root package name */
    private static int f8289l;

    /* renamed from: m, reason: collision with root package name */
    private static int f8290m;

    /* renamed from: n, reason: collision with root package name */
    private static int f8291n;

    /* renamed from: o, reason: collision with root package name */
    private static String f8292o;

    /* renamed from: t, reason: collision with root package name */
    private static String f8297t;

    /* renamed from: u, reason: collision with root package name */
    private static String f8298u;

    /* renamed from: x, reason: collision with root package name */
    public static Context f8301x;

    /* renamed from: a, reason: collision with root package name */
    private static com.baidu.mapsdkplatform.comjni.util.a f8278a = new com.baidu.mapsdkplatform.comjni.util.a();

    /* renamed from: b, reason: collision with root package name */
    private static String f8279b = "02";

    /* renamed from: p, reason: collision with root package name */
    private static String f8293p = "baidu";

    /* renamed from: q, reason: collision with root package name */
    private static String f8294q = "";

    /* renamed from: r, reason: collision with root package name */
    private static String f8295r = "";

    /* renamed from: s, reason: collision with root package name */
    private static String f8296s = "";

    /* renamed from: v, reason: collision with root package name */
    private static String f8299v = "-1";

    /* renamed from: w, reason: collision with root package name */
    private static String f8300w = "-1";

    /* renamed from: y, reason: collision with root package name */
    public static float f8302y = 1.0f;

    /* renamed from: z, reason: collision with root package name */
    private static String f8303z = "";
    private static Map<String, String> A = new HashMap();
    private static String B = "";
    private static boolean D = false;
    private static boolean E = false;

    public static String a() {
        return F;
    }

    public static String b() {
        return f8293p;
    }

    private static void c(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String apiVersion = VersionInfo.getApiVersion();
            f8285h = apiVersion;
            if (apiVersion != null && !apiVersion.equals("")) {
                f8285h = f8285h.replace('_', '.');
            }
            f8286i = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            f8285h = "1.0.0";
            f8286i = 1;
        }
    }

    public static int d() {
        return f8291n;
    }

    public static String e() {
        return f8297t;
    }

    public static String f() {
        return f8292o;
    }

    public static String g() {
        return f8280c;
    }

    public static String h() {
        if (A == null) {
            return null;
        }
        if (TextUtils.isEmpty(f8303z)) {
            A.put("cuid", AppMD5.encodeUrlParamsValue(c()));
        }
        A.put("zid", p());
        long time = new Date().getTime() + (r0.getSeconds() * 1000);
        A.put("ctm", AppMD5.encodeUrlParamsValue(String.format("%f", Double.valueOf((time / 1000) + ((time % 1000) / 1000.0d)))));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : A.entrySet()) {
            sb.append("&");
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    public static String i() {
        return B;
    }

    public static Map<String, String> j() {
        if (TextUtils.isEmpty(f8303z)) {
            c();
        }
        return A;
    }

    public static String k() {
        return f8282e;
    }

    public static String l() {
        return f8281d;
    }

    public static int m() {
        return f8287j;
    }

    public static int n() {
        return f8288k;
    }

    public static String o() {
        return f8285h;
    }

    private static String p() {
        String gzfi;
        Context context = f8301x;
        if (context == null || (gzfi = MH.gzfi(context, null, 3041, null, null)) == null || gzfi.length() <= 0) {
            return "";
        }
        if (!gzfi.equals(C)) {
            C = gzfi;
            SysUpdateObservable.getInstance().updateZid(C);
        }
        return gzfi;
    }

    private static boolean q() {
        if (f8301x == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        JsonBuilder jsonBuilder = new JsonBuilder();
        jsonBuilder.arrayValue();
        byte[] a8 = a(f8301x);
        if (a8 != null) {
            for (byte b8 : a8) {
                jsonBuilder.value((int) b8);
            }
        }
        jsonBuilder.endArrayValue();
        hashMap.put("cuid", f8303z);
        hashMap.put("p", f8301x.getPackageName());
        hashMap.put("s", jsonBuilder.getJson());
        hashMap.put("arv", f8283f);
        hashMap.put("arl", f8284g);
        hashMap.put("mod", f8281d);
        hashMap.put("ws", f8292o);
        if (com.baidu.mapsdkplatform.comapi.b.a() != null) {
            hashMap.put(EngineImpl.KEY_OAID, com.baidu.mapsdkplatform.comapi.b.a().getOAID());
        }
        MH.init(f8301x, hashMap);
        return true;
    }

    private static void r() {
        f8292o = "0";
    }

    public static String s() {
        JsonBuilder jsonBuilder = new JsonBuilder();
        jsonBuilder.object();
        jsonBuilder.putStringValue("cpu", f8294q);
        jsonBuilder.putStringValue("resid", f8279b);
        jsonBuilder.putStringValue("channel", f8293p);
        jsonBuilder.putStringValue("glr", f8295r);
        jsonBuilder.putStringValue("glv", f8296s);
        jsonBuilder.putStringValue("mb", l());
        jsonBuilder.putStringValue("sv", o());
        jsonBuilder.putStringValue("os", k());
        jsonBuilder.key("dpi_x").value(d());
        jsonBuilder.key("dpi_y").value(d());
        jsonBuilder.putStringValue("net", f8292o);
        jsonBuilder.putStringValue("cuid", f8303z);
        jsonBuilder.putStringValue("zid", p());
        if (f8301x == null) {
            f8301x = JNIInitializer.getCachedContext();
        }
        Context context = f8301x;
        if (context != null) {
            jsonBuilder.putStringValue("pcn", context.getPackageName());
        }
        jsonBuilder.key("screen_x").value(m());
        jsonBuilder.key("screen_y").value(n());
        jsonBuilder.endObject();
        String json = jsonBuilder.getJson();
        B = json;
        return json;
    }

    public static void t() {
        com.baidu.mapsdkplatform.comjni.util.a aVar = f8278a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public static void u() {
        F = null;
    }

    public static void v() {
        t();
    }

    public static void w() {
        A.put("net", AppMD5.encodeUrlParamsValue(f()));
        A.put("appid", AppMD5.encodeUrlParamsValue(f8299v));
        A.put("bduid", "");
        JsonBuilder jsonBuilder = new JsonBuilder();
        jsonBuilder.object();
        if (com.baidu.mapsdkplatform.comapi.b.b()) {
            f8282e = "Android" + Build.VERSION.SDK;
            f8283f = Build.VERSION.RELEASE;
            f8281d = Build.MODEL;
            f8284g = String.valueOf(Build.VERSION.SDK_INT);
        } else {
            f8282e = "Android";
            f8283f = "";
            f8281d = "";
            f8284g = "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("arv", f8283f);
        hashMap.put("arl", f8284g);
        hashMap.put("mod", f8281d);
        hashMap.put("ws", f8292o);
        if (D) {
            a((HashMap<String, String>) hashMap);
        }
        jsonBuilder.putStringValue("cpu", f8294q);
        jsonBuilder.putStringValue("resid", f8279b);
        jsonBuilder.putStringValue("channel", f8293p);
        jsonBuilder.putStringValue("glr", f8295r);
        jsonBuilder.putStringValue("glv", f8296s);
        jsonBuilder.putStringValue("mb", l());
        jsonBuilder.putStringValue("sv", o());
        jsonBuilder.putStringValue("os", k());
        jsonBuilder.key("dpi_x").value(d());
        jsonBuilder.key("dpi_y").value(d());
        jsonBuilder.putStringValue("net", f8292o);
        jsonBuilder.putStringValue("cuid", f8303z);
        Context context = f8301x;
        if (context != null) {
            jsonBuilder.putStringValue("pcn", context.getPackageName());
        }
        jsonBuilder.key("screen_x").value(m());
        jsonBuilder.key("screen_y").value(n());
        jsonBuilder.putStringValue("appid", f8299v);
        jsonBuilder.putStringValue("duid", f8300w);
        jsonBuilder.putStringValue("zid", p());
        if (!TextUtils.isEmpty(F)) {
            jsonBuilder.putStringValue(BaseParamNames.TOKEN, F);
        }
        jsonBuilder.endObject();
        SysUpdateObservable.getInstance().updatePhoneInfo(jsonBuilder.getJson());
    }

    public static void a(boolean z7) {
        Context context = f8301x;
        if (context == null) {
            return;
        }
        MH.setAppStatus(context, z7);
    }

    public static void b(boolean z7) {
        if (E == z7) {
            return;
        }
        E = z7;
        Context context = f8301x;
        if (context == null) {
            return;
        }
        MH.setAgreePolicy(context, z7);
        if (!D && z7) {
            q();
            D = true;
        }
        w();
    }

    private static void d(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        if (defaultDisplay != null) {
            f8287j = defaultDisplay.getWidth();
            f8288k = defaultDisplay.getHeight();
            defaultDisplay.getMetrics(displayMetrics);
        }
        f8302y = displayMetrics.density;
        f8289l = (int) displayMetrics.xdpi;
        f8290m = (int) displayMetrics.ydpi;
        int i8 = displayMetrics.densityDpi;
        f8291n = i8;
        if (i8 == 0) {
            f8291n = BDLocation.TypeCoarseLocation;
        }
    }

    public static void e(Context context) {
        f8301x = context;
    }

    public static byte[] a(Context context) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        SigningInfo signingInfo2;
        SigningInfo signingInfo3;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    signingInfo3 = context.getPackageManager().getPackageInfo(context.getPackageName(), C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
                    signatureArr = signingInfo3.getApkContentsSigners();
                } else {
                    signingInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
                    signatureArr = signingInfo2.getSigningCertificateHistory();
                }
            } else {
                signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                return signatureArr[0].toByteArray();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return null;
    }

    public static void b(Context context) {
        f8301x = context;
        if (context.getFilesDir() != null) {
            f8297t = context.getFilesDir().getAbsolutePath();
        }
        if (context.getCacheDir() != null) {
            f8298u = context.getCacheDir().getAbsolutePath();
        }
        MH.setAgreePolicy(f8301x, E);
        if (com.baidu.mapsdkplatform.comapi.b.b()) {
            f8282e = "Android" + Build.VERSION.SDK;
            f8283f = Build.VERSION.RELEASE;
            f8281d = Build.MODEL;
            f8284g = String.valueOf(Build.VERSION.SDK_INT);
            if (!D) {
                q();
                D = true;
            }
        } else {
            f8282e = "Android";
            f8283f = "";
            f8281d = "";
            f8284g = "";
        }
        f8280c = context.getPackageName();
        c(context);
        d(context);
        r();
        A.put("zid", p());
        A.put("resid", AppMD5.encodeUrlParamsValue(f8279b));
        A.put("channel", AppMD5.encodeUrlParamsValue(b()));
        A.put("mb", AppMD5.encodeUrlParamsValue(l()));
        A.put("sv", AppMD5.encodeUrlParamsValue(o()));
        A.put("os", AppMD5.encodeUrlParamsValue(k()));
        A.put("dpi", AppMD5.encodeUrlParamsValue(String.format("%d,%d", Integer.valueOf(d()), Integer.valueOf(d()))));
        if (!TextUtils.isEmpty(f8303z)) {
            A.put("cuid", AppMD5.encodeUrlParamsValue(f8303z));
        }
        Context context2 = f8301x;
        if (context2 != null) {
            A.put("pcn", AppMD5.encodeUrlParamsValue(context2.getPackageName()));
        }
        A.put("screen", AppMD5.encodeUrlParamsValue(String.format("%d,%d", Integer.valueOf(m()), Integer.valueOf(n()))));
        com.baidu.mapsdkplatform.comjni.util.a aVar = f8278a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public static synchronized String c() {
        String str;
        synchronized (g.class) {
            try {
                str = LBSAuthManager.getInstance(f8301x).getCUID();
                if (!TextUtils.isEmpty(str) && !str.equals(f8303z)) {
                    f8303z = str;
                    if (A != null) {
                        String c8 = c();
                        A.put("cuid", AppMD5.encodeUrlParamsValue(c8));
                    }
                    SysUpdateObservable.getInstance().updateCuid(f8303z);
                    HashMap hashMap = new HashMap();
                    hashMap.put("cuid", f8303z);
                    MH.ud(f8301x, hashMap);
                }
            } catch (Exception unused) {
                str = "";
            } catch (Throwable th) {
                throw th;
            }
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    private static boolean a(HashMap<String, String> hashMap) {
        Context context = f8301x;
        if (context == null) {
            return false;
        }
        MH.ud(context, hashMap);
        return true;
    }

    public static void a(String str) {
        f8292o = str;
        w();
    }

    public static void a(String str, String str2) {
        f8299v = str2;
        f8300w = str;
        w();
    }
}
