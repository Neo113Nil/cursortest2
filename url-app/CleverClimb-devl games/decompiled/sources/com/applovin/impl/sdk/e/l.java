package com.applovin.impl.sdk.e;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdk;
import com.mopub.common.AdType;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class l {
    public static double a(long j) {
        double d2 = j;
        Double.isNaN(d2);
        return d2 / 1000.0d;
    }

    public static float a(float f) {
        return f * 1000.0f;
    }

    public static int a(JSONObject jSONObject) {
        int a2 = f.a(jSONObject, "video_completion_percent", -1, (com.applovin.impl.sdk.j) null);
        if (a2 < 0 || a2 > 100) {
            return 95;
        }
        return a2;
    }

    public static long a(com.applovin.impl.sdk.j jVar) {
        long longValue = ((Long) jVar.a(com.applovin.impl.sdk.b.b.eW)).longValue();
        long longValue2 = ((Long) jVar.a(com.applovin.impl.sdk.b.b.eX)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        return (longValue <= 0 || longValue2 <= 0) ? currentTimeMillis : currentTimeMillis + (longValue - longValue2);
    }

    public static Activity a(View view, com.applovin.impl.sdk.j jVar) {
        if (view == null) {
            return null;
        }
        int i = 0;
        while (i < 1000) {
            i++;
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th) {
                jVar.u().b("Utils", "Encountered error while retrieving activity from view", th);
            }
        }
        return null;
    }

    public static Bitmap a(Context context, int i, int i2) {
        FileInputStream fileInputStream = null;
        try {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i3 = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), i);
                if (options.outHeight > i2 || options.outWidth > i2) {
                    double d2 = i2;
                    double max = Math.max(options.outHeight, options.outWidth);
                    Double.isNaN(d2);
                    Double.isNaN(max);
                    i3 = (int) Math.pow(2.0d, (int) Math.ceil(Math.log(d2 / max) / Math.log(0.5d)));
                }
                new BitmapFactory.Options().inSampleSize = i3;
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
                try {
                    fileInputStream.close();
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return decodeResource;
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            fileInputStream.close();
            fileInputStream.close();
            return null;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
                fileInputStream.close();
            } catch (Exception unused4) {
            }
            throw th;
        }
    }

    public static Bitmap a(File file, int i) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        BitmapFactory.Options options;
        FileInputStream fileInputStream3 = null;
        try {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            int i2 = 1;
            options2.inJustDecodeBounds = true;
            fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.decodeStream(fileInputStream, null, options2);
                fileInputStream.close();
                if (options2.outHeight > i || options2.outWidth > i) {
                    double d2 = i;
                    double max = Math.max(options2.outHeight, options2.outWidth);
                    Double.isNaN(d2);
                    Double.isNaN(max);
                    i2 = (int) Math.pow(2.0d, (int) Math.ceil(Math.log(d2 / max) / Math.log(0.5d)));
                }
                options = new BitmapFactory.Options();
                options.inSampleSize = i2;
                fileInputStream2 = new FileInputStream(file);
            } catch (Exception unused) {
                fileInputStream2 = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception unused2) {
            fileInputStream2 = null;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream2, null, options);
            fileInputStream2.close();
            try {
                fileInputStream.close();
                fileInputStream2.close();
            } catch (Exception unused3) {
            }
            return decodeStream;
        } catch (Exception unused4) {
            try {
                fileInputStream.close();
                fileInputStream2.close();
            } catch (Exception unused5) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream3 = fileInputStream2;
            try {
                fileInputStream.close();
                fileInputStream3.close();
            } catch (Exception unused6) {
            }
            throw th;
        }
    }

    public static View a(Context context, View view) {
        View f = f(context);
        return f != null ? f : a(view);
    }

    public static View a(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View findViewById = rootView.findViewById(R.id.content);
        return findViewById != null ? findViewById : rootView;
    }

    public static com.applovin.impl.sdk.ad.d a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        return com.applovin.impl.sdk.ad.d.a(AppLovinAdSize.fromString(f.a(jSONObject, "ad_size", (String) null, jVar)), AppLovinAdType.fromString(f.a(jSONObject, "ad_type", (String) null, jVar)), f.a(jSONObject, "zone_id", (String) null, jVar), jVar);
    }

    public static com.applovin.impl.sdk.j a(AppLovinSdk appLovinSdk) {
        Field declaredField = appLovinSdk.getClass().getDeclaredField("mSdkImpl");
        declaredField.setAccessible(true);
        return (com.applovin.impl.sdk.j) declaredField.get(appLovinSdk);
    }

    public static String a(Context context) {
        Bundle d2 = d(context);
        if (d2 == null) {
            return null;
        }
        String string = d2.getString("applovin.sdk.key");
        return string != null ? string : "";
    }

    public static String a(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    public static String a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return str2.replace("{PLACEMENT}", i.e(str));
    }

    public static String a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append((Object) entry.getKey());
            sb.append('=');
            sb.append((Object) entry.getValue());
        }
        return sb.toString();
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return a(superclass, str);
        }
    }

    public static List<com.applovin.impl.sdk.c.a> a(String str, JSONObject jSONObject, String str2, String str3, com.applovin.impl.sdk.j jVar) {
        return a(str, jSONObject, str2, null, str3, jVar);
    }

    public static List<com.applovin.impl.sdk.c.a> a(String str, JSONObject jSONObject, String str2, String str3, String str4, com.applovin.impl.sdk.j jVar) {
        JSONObject a2 = f.a(jSONObject, str, new JSONObject(), jVar);
        ArrayList arrayList = new ArrayList(a2.length() + 1);
        if (i.b(str4)) {
            arrayList.add(new com.applovin.impl.sdk.c.a(str4, null));
        }
        if (a2.length() > 0) {
            if (str3 == null) {
                str3 = "";
            }
            Iterator<String> keys = a2.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        String optString = a2.optString(next);
                        if (!TextUtils.isEmpty(optString)) {
                            optString = optString.replace("{CLCODE}", str2).replace("{EVENT_ID}", str3);
                        }
                        arrayList.add(new com.applovin.impl.sdk.c.a(next.replace("{CLCODE}", str2).replace("{EVENT_ID}", str3), optString));
                    }
                } catch (Throwable th) {
                    jVar.u().b("Utils", "Failed to create and add postback url.", th);
                }
            }
        }
        return arrayList;
    }

    public static void a(AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.ad.d dVar, int i, com.applovin.impl.sdk.j jVar) {
        if (appLovinAdLoadListener != null) {
            try {
                if (appLovinAdLoadListener instanceof com.applovin.impl.sdk.m) {
                    ((com.applovin.impl.sdk.m) appLovinAdLoadListener).a(dVar, i);
                } else {
                    appLovinAdLoadListener.failedToReceiveAd(i);
                }
            } catch (Throwable th) {
                jVar.u().b("Utils", "Unable process a failure to receive an ad", th);
            }
        }
    }

    public static void a(String str, Boolean bool, Map<String, String> map) {
        if (bool.booleanValue()) {
            map.put(str, Boolean.toString(true));
        }
    }

    public static void a(String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public static boolean a() {
        Bundle d2;
        Context x = com.applovin.impl.sdk.j.x();
        return (x == null || (d2 = d(x)) == null || !d2.containsKey("applovin.sdk.verbose_logging")) ? false : true;
    }

    public static boolean a(long j, long j2) {
        return (j & j2) != 0;
    }

    public static boolean a(Context context, Uri uri, com.applovin.impl.sdk.j jVar) {
        boolean z;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            jVar.Q().b();
            context.startActivity(intent);
            z = true;
        } catch (Throwable th) {
            jVar.u().b("Utils", "Unable to open \"" + uri + "\".", th);
            z = false;
        }
        if (!z) {
            jVar.Q().c();
        }
        return z;
    }

    public static boolean a(View view, Activity activity) {
        if (activity == null || view == null) {
            return false;
        }
        return a(view, activity.findViewById(R.id.content).getRootView());
    }

    public static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (a(view, viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(com.applovin.impl.sdk.ad.g gVar, Context context, com.applovin.impl.sdk.j jVar) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        boolean z = gVar != null && (gVar.b() || gVar.e() == null || jVar.N().a(gVar.e().getLastPathSegment(), context));
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return z;
    }

    public static boolean a(AppLovinAd appLovinAd, com.applovin.impl.sdk.j jVar) {
        p u;
        String str;
        String str2;
        if (appLovinAd == null) {
            u = jVar.u();
            str = "AppLovinSdk";
            str2 = "Failing ad display - ad is null.";
        } else {
            if (e.a(jVar.w(), jVar) || ((Boolean) jVar.a(com.applovin.impl.sdk.b.b.dL)).booleanValue()) {
                return true;
            }
            u = jVar.u();
            str = "AppLovinSdk";
            str2 = "Failing ad display due to no internet connection.";
        }
        u.e(str, str2);
        return false;
    }

    public static boolean a(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static long b(float f) {
        return c(a(f));
    }

    public static MaxAdFormat b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return MaxAdFormat.BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MaxAdFormat.MREC;
        }
        if (str.equalsIgnoreCase("leaderboard") || str.equalsIgnoreCase("leader")) {
            return MaxAdFormat.LEADER;
        }
        if (str.equalsIgnoreCase(AdType.INTERSTITIAL) || str.equalsIgnoreCase("inter")) {
            return MaxAdFormat.INTERSTITIAL;
        }
        if (str.equalsIgnoreCase("rewarded") || str.equalsIgnoreCase("reward")) {
            return MaxAdFormat.REWARDED;
        }
        throw new IllegalArgumentException("Unknown format: " + str);
    }

    public static AppLovinAd b(AppLovinAd appLovinAd, com.applovin.impl.sdk.j jVar) {
        if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.h)) {
            return appLovinAd;
        }
        com.applovin.impl.sdk.ad.h hVar = (com.applovin.impl.sdk.ad.h) appLovinAd;
        AppLovinAd dequeueAd = jVar.n().dequeueAd(hVar.getAdZone());
        jVar.u().a("Utils", "Dequeued ad for dummy ad: " + dequeueAd);
        if (dequeueAd != null) {
            hVar.a(dequeueAd);
            ((AppLovinAdBase) dequeueAd).setDummyAd(hVar);
            return dequeueAd;
        }
        if (((Boolean) jVar.a(com.applovin.impl.sdk.b.b.bY)).booleanValue()) {
            return hVar.a();
        }
        return null;
    }

    public static boolean b(Context context) {
        Bundle d2;
        if (context == null) {
            context = com.applovin.impl.sdk.j.x();
        }
        return (context == null || (d2 = d(context)) == null || !d2.getBoolean("applovin.sdk.test_ads", false)) ? false : true;
    }

    private static long c(float f) {
        return Math.round(f);
    }

    public static String c(String str) {
        Uri parse = Uri.parse(str);
        return new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).build().toString();
    }

    public static boolean c(Context context) {
        Bundle d2;
        if (context == null) {
            context = com.applovin.impl.sdk.j.x();
        }
        return (context == null || (d2 = d(context)) == null || !d2.getBoolean("applovin.sdk.verbose_logging", false)) ? false : true;
    }

    public static Bundle d(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("Utils", "Unable to retrieve application metadata", e);
            return null;
        }
    }

    public static int e(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    public static View f(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        }
        return null;
    }
}
