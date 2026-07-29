package com.facebook.ads.internal.q.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f5458a;

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f5459b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Set<String> f5460c = new HashSet(2);

    public enum a {
        UNKNOWN(0),
        NONE(0),
        MOBILE_INTERNET(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        MOBILE_4G(4);

        public final int g;

        a(int i) {
            this.g = i;
        }
    }

    static {
        f5459b.add("1ww8E0AYsR2oX5lndk2hwp2Uosk=\n");
        f5460c.add("toZ2GRnRjC9P5VVUdCpOrFH8lfQ=\n");
        f5460c.add("3lKvjNsfmrn+WmfDhvr2iVh/yRs=\n");
        f5460c.add("B08QtE4yLCdli4rptyqAEczXOeA=\n");
        f5460c.add("XZXI6anZbdKf+taURdnyUH5ipgM=\n");
    }

    public static com.facebook.ads.internal.p.a.a a(Context context) {
        return a(context, true);
    }

    public static com.facebook.ads.internal.p.a.a a(Context context, boolean z) {
        com.facebook.ads.internal.p.a.a aVar = new com.facebook.ads.internal.p.a.a();
        a(context, aVar, z);
        return aVar;
    }

    private static String a(Context context, String str, String str2) {
        Class<?> cls = Class.forName(str);
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(Context.class, Class.forName(str2));
        declaredConstructor.setAccessible(true);
        try {
            return (String) cls.getMethod("getUserAgentString", new Class[0]).invoke(declaredConstructor.newInstance(context, null), new Object[0]);
        } finally {
            declaredConstructor.setAccessible(false);
        }
    }

    private static void a(Context context, com.facebook.ads.internal.p.a.a aVar, boolean z) {
        com.facebook.ads.internal.g.b bVar = new com.facebook.ads.internal.g.b(context);
        aVar.c(30000);
        aVar.b(3);
        aVar.a("user-agent", c(context, z) + " [FBAN/AudienceNetworkForAndroid;FBSN/Android;FBSV/" + com.facebook.ads.internal.g.b.f5127a + ";FBAB/" + bVar.f() + ";FBAV/" + bVar.g() + ";FBBV/" + bVar.h() + ";FBVS/4.28.2;FBLC/" + Locale.getDefault().toString() + "]");
    }

    public static boolean a() {
        String urlPrefix = AdInternalSettings.getUrlPrefix();
        return !TextUtils.isEmpty(urlPrefix) && urlPrefix.endsWith(".sb");
    }

    public static com.facebook.ads.internal.p.a.a b(Context context) {
        return b(context, true);
    }

    public static com.facebook.ads.internal.p.a.a b(Context context, boolean z) {
        com.facebook.ads.internal.p.a.a aVar = new com.facebook.ads.internal.p.a.a();
        a(context, aVar, z);
        if (!a()) {
            aVar.b(f5460c);
            aVar.a(f5459b);
        }
        return aVar;
    }

    public static a c(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return a.UNKNOWN;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return a.NONE;
        }
        if (activeNetworkInfo.getType() != 0) {
            return a.MOBILE_INTERNET;
        }
        switch (activeNetworkInfo.getSubtype()) {
        }
        return a.UNKNOWN;
    }

    private static String c(Context context, boolean z) {
        if (context == null) {
            return "Unknown";
        }
        if (z) {
            return System.getProperty("http.agent");
        }
        if (f5458a != null) {
            return f5458a;
        }
        synchronized (d.class) {
            if (f5458a != null) {
                return f5458a;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    f5458a = d(context);
                    return f5458a;
                } catch (Exception unused) {
                }
            }
            try {
                try {
                    f5458a = a(context, "android.webkit.WebSettings", "android.webkit.WebView");
                } catch (Exception unused2) {
                    f5458a = a(context, "android.webkit.WebSettingsClassic", "android.webkit.WebViewClassic");
                }
            } catch (Exception unused3) {
                WebView webView = new WebView(context.getApplicationContext());
                f5458a = webView.getSettings().getUserAgentString();
                webView.destroy();
            }
            return f5458a;
        }
    }

    @TargetApi(17)
    private static String d(Context context) {
        return WebSettings.getDefaultUserAgent(context);
    }
}
