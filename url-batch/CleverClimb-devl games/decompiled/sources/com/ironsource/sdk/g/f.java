package com.ironsource.sdk.g;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import com.ironsource.sdk.data.e;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SDKUtils.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7206a = "f";

    /* renamed from: b, reason: collision with root package name */
    private static String f7207b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f7208c = true;

    /* renamed from: d, reason: collision with root package name */
    private static String f7209d = null;
    private static int e = 0;
    private static String f = null;
    private static String g = "";
    private static final AtomicInteger h = new AtomicInteger(1);

    public static String a(int i) {
        switch (i) {
            case 0:
            case 6:
            case 8:
            case 11:
                return TJAdUnitConstants.String.LANDSCAPE;
            case 1:
            case 7:
            case 9:
            case 12:
                return TJAdUnitConstants.String.PORTRAIT;
            case 2:
            case 3:
            case 4:
            case 5:
            case 10:
            default:
                return "none";
        }
    }

    public static String b(int i) {
        switch (i) {
            case 1:
                return TJAdUnitConstants.String.PORTRAIT;
            case 2:
                return TJAdUnitConstants.String.LANDSCAPE;
            default:
                return "none";
        }
    }

    public static String e() {
        return "5.51";
    }

    public static String a(String str) {
        try {
            return URLEncoder.encode(str.split(File.separator)[r1.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int a(long j) {
        return (int) ((j * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", b(com.ironsource.environment.c.f(context)));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static String a(String str, String str2) {
        return String.format("%s Failure occurred during initiation at: %s", str, str2);
    }

    public static Long a() {
        return Long.valueOf(System.currentTimeMillis());
    }

    public static String b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static String c(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void b(Context context) {
        try {
            String[] a2 = com.ironsource.environment.c.a(context);
            f7207b = a2[0];
            f7208c = Boolean.valueOf(a2[1]).booleanValue();
        } catch (Exception e2) {
            if (e2.getMessage() != null) {
                e.a(f7206a, e2.getClass().getSimpleName() + ": " + e2.getMessage());
            }
            if (e2.getCause() != null) {
                e.a(f7206a, e2.getClass().getSimpleName() + ": " + e2.getCause());
            }
        }
    }

    public static String b() {
        return f7207b;
    }

    public static boolean c() {
        return f7208c;
    }

    public static String d() {
        return !TextUtils.isEmpty(f7209d) ? f7209d : "";
    }

    public static void d(String str) {
        f7209d = str;
    }

    public static String f() {
        return f;
    }

    public static void e(String str) {
        f = str;
    }

    public static int g() {
        return e;
    }

    public static void c(int i) {
        e = i;
    }

    public static String b(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean h() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    public static int a(boolean z) {
        int i = Build.VERSION.SDK_INT >= 14 ? 2 : 0;
        if (Build.VERSION.SDK_INT >= 16) {
            i |= 1796;
        }
        return (Build.VERSION.SDK_INT < 19 || !z) ? i : i | 4096;
    }

    private static int l() {
        int i;
        int i2;
        do {
            i = h.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!h.compareAndSet(i, i2));
        return i;
    }

    public static int i() {
        if (Build.VERSION.SDK_INT < 17) {
            return l();
        }
        return View.generateViewId();
    }

    public static JSONObject j() {
        try {
            return new JSONObject(f());
        } catch (JSONException e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    public static e.d f(String str) {
        if (str.equalsIgnoreCase(e.d.RewardedVideo.toString())) {
            return e.d.RewardedVideo;
        }
        if (str.equalsIgnoreCase(e.d.Interstitial.toString())) {
            return e.d.Interstitial;
        }
        if (str.equalsIgnoreCase(e.d.OfferWall.toString())) {
            return e.d.OfferWall;
        }
        return null;
    }

    public static String k() {
        return g;
    }
}
