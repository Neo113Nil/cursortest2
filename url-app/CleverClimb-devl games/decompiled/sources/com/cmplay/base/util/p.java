package com.cmplay.base.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.aiming.mdt.utils.Constants;
import com.cmplay.base.util.u;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MarketUtil.java */
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static z f4055a;

    /* renamed from: b, reason: collision with root package name */
    private static String f4056b;

    public static boolean a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(Context context, String str) {
        try {
            if (context.getPackageManager().getPackageInfo(Constants.PKG_FB, 0).versionCode >= 3002850) {
                a(context, new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=" + str)));
            } else {
                a(context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
            a(context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    public static boolean b(Context context, String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage("com.android.vending");
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            } else {
                intent.addFlags(524288);
            }
            intent.setData(Uri.parse(str));
            return a(context, intent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void c(Context context, String str) {
        if ((!t.a(context) || TextUtils.isEmpty(str)) ? false : b(context, str)) {
            return;
        }
        d(context, str);
    }

    public static void d(Context context, String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(Uri.parse(str));
        if (t.a(context, "com.android.browser")) {
            intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
        }
        try {
            context.startActivity(intent);
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            intent.setData(Uri.parse(str));
        }
        try {
            context.startActivity(intent);
        } catch (Exception unused2) {
        }
    }

    public static boolean a(Context context, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
            if (!TextUtils.isEmpty(str2)) {
                intent.setPackage(str2);
            }
            intent.addFlags(268435456);
            return a(context, intent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean a(Context context, ArrayList<b> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator<b> it = arrayList.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next != null && a(context, next.f3963b, next.f3962a)) {
                h.a("internal_push", "goto market  Open appPkg:" + next.f3963b + "  at marketPkg：" + next.f3962a);
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("https://play.google.com") || str.startsWith("http://play.google.com") || str.startsWith("market:");
    }

    public static boolean a(final Context context, String str, final String str2, z zVar) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        h.a("internal_push_url", "smartGo2GooglePlay  url:" + str + "  defaultJumpUrl:" + str2);
        f4055a = zVar;
        if (t.a(context)) {
            if (a(str)) {
                h.a("internal_push_url", "smartGo2GooglePlay  GP打开");
                c(context, str);
                a(true);
                return false;
            }
            u uVar = new u(context);
            a.a(context, 10000, false, true);
            uVar.a(new u.b() { // from class: com.cmplay.base.util.p.1
                @Override // com.cmplay.base.util.u.b
                public void a(String str3) {
                    boolean z;
                    h.a("internal_push_url", "smartGo2GooglePlay  GetGooglePlayUrlFinished  url重定向后:" + str3);
                    if (a.a()) {
                        a.a(context);
                        if (p.a(str3) && p.b(context, str3)) {
                            z = true;
                            h.a("internal_push_url", "smartGo2GooglePlay  GetGooglePlayUrlFinished  GP打开 成功");
                        } else {
                            if (!TextUtils.isEmpty(str2)) {
                                h.a("internal_push_url", "smartGo2GooglePlay  GetGooglePlayUrlFinished  GP失败   openBrowserByUrl by defaultJumpUrl");
                                str3 = str2;
                            } else {
                                h.a("internal_push_url", "smartGo2GooglePlay  GetGooglePlayUrlFinished  GP失败   openBrowserByUrl by url");
                            }
                            p.d(context, str3);
                            z = false;
                        }
                        p.a(z);
                    }
                }
            });
            uVar.b(str);
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            h.a("internal_push_url", "smartGo2GooglePlay  没有GP  openBrowserByUrl by defaultJumpUrl");
            str = str2;
        } else {
            h.a("internal_push_url", "smartGo2GooglePlay  没有GP  openBrowserByUrl by url");
        }
        d(context, str);
        return false;
    }

    static void a(boolean z) {
        if (f4055a != null) {
            f4055a.a(z);
        }
    }

    public static String a(Context context) {
        if (f4056b == null) {
            f4056b = context.getSharedPreferences("misc", 0).getString("user-agent", null);
        }
        return f4056b;
    }

    public static void e(Context context, String str) {
        if (str == null) {
            return;
        }
        context.getSharedPreferences("misc", 0).edit().putString("user-agent", str).commit();
    }

    @SuppressLint({"NewApi"})
    public static void b(Context context) {
        if (f4056b == null) {
            try {
                f4056b = a(context);
                if (TextUtils.isEmpty(f4056b)) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        try {
                            f4056b = WebSettings.getDefaultUserAgent(context);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        e(context, f4056b);
                    }
                    try {
                        try {
                            f4056b = b(context, "android.webkit.WebSettings", "android.webkit.WebView");
                        } catch (Exception unused) {
                            f4056b = b(context, "android.webkit.WebSettingsClassic", "android.webkit.WebViewClassic");
                        }
                    } catch (Exception unused2) {
                        WebView webView = new WebView(context);
                        f4056b = webView.getSettings().getUserAgentString();
                        webView.destroy();
                    }
                    e(context, f4056b);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static String b(Context context, String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(Context.class, Class.forName(str2));
        declaredConstructor.setAccessible(true);
        try {
            return (String) cls.getMethod("getUserAgentString", new Class[0]).invoke(declaredConstructor.newInstance(context, null), new Object[0]);
        } finally {
            declaredConstructor.setAccessible(false);
        }
    }
}
