package com.onevcat.uniwebview;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class P {
    public static void a() {
        final CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(new ValueCallback() { // from class: com.onevcat.uniwebview.P$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                P.a(cookieManager, (Boolean) obj);
            }
        });
    }

    public static void b() {
        CookieManager.getInstance().flush();
    }

    public static final void a(CookieManager cookieManager, Boolean bool) {
        cookieManager.flush();
        C0060l c0060l = C0060l.b;
        C0060l c0060l2 = C0060l.b;
        c0060l2.getClass();
        Intrinsics.checkNotNullParameter("Cookie manager flush done.", "message");
        c0060l2.a(EnumC0057k.VERBOSE, "Cookie manager flush done.");
    }

    public static void b(String url, String cookie) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        C0060l c0060l = C0060l.b;
        String message = O.a("Cookie set for url: ", url, ", cookie: ", cookie, c0060l);
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC0057k enumC0057k = EnumC0057k.VERBOSE;
        c0060l.a(enumC0057k, message);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setCookie(url, cookie);
        cookieManager.flush();
        Intrinsics.checkNotNullParameter("Cookie manager flush done.", "message");
        c0060l.a(enumC0057k, "Cookie manager flush done.");
    }

    public static void a(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        C0060l c0060l = C0060l.b;
        String message = O.a("Cookie remove for url: ", url, ", key: ", str, c0060l);
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC0057k enumC0057k = EnumC0057k.VERBOSE;
        c0060l.a(enumC0057k, message);
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(url);
        if (cookie == null) {
            String message2 = "The content for given url '" + url + "' is not found in cookie manager.";
            Intrinsics.checkNotNullParameter(message2, "message");
            c0060l.a(EnumC0057k.DEBUG, message2);
            return;
        }
        String message3 = "Cookie string is found: '" + cookie + "', for url: " + url;
        Intrinsics.checkNotNullParameter(message3, "message");
        c0060l.a(enumC0057k, message3);
        Iterator<String> it = new Regex(";").split(cookie, 0).iterator();
        while (it.hasNext()) {
            List<String> split = new Regex("=").split(StringsKt.trim((CharSequence) it.next()).toString(), 0);
            if (split.size() >= 2 && (str == null || Intrinsics.areEqual(str, split.get(0)))) {
                cookieManager.setCookie(url, split.get(0) + '=');
            }
        }
    }
}
