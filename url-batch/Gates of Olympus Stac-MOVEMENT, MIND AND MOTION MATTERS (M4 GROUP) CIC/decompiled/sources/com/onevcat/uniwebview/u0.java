package com.onevcat.uniwebview;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class u0 {
    public static void a() {
        final CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(new ValueCallback() { // from class: com.onevcat.uniwebview.u0$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                u0.a(cookieManager, (Boolean) obj);
            }
        });
    }

    public static void b() {
        CookieManager.getInstance().flush();
    }

    public static final void a(CookieManager cookieManager, Boolean bool) {
        cookieManager.flush();
        o oVar = o.b;
        o oVar2 = o.b;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter("Cookie manager flush done.", "message");
        oVar2.a(n.VERBOSE, "Cookie manager flush done.");
    }

    public static void b(String url, String cookie) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        o oVar = o.b;
        String message = t0.a("Cookie set for url: ", url, ", cookie: ", cookie, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        n nVar = n.VERBOSE;
        oVar.a(nVar, message);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setCookie(url, cookie);
        cookieManager.flush();
        Intrinsics.checkNotNullParameter("Cookie manager flush done.", "message");
        oVar.a(nVar, "Cookie manager flush done.");
    }

    public static void a(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        o oVar = o.b;
        String message = t0.a("Cookie remove for url: ", url, ", key: ", str, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        n nVar = n.VERBOSE;
        oVar.a(nVar, message);
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(url);
        if (cookie == null) {
            String message2 = "The content for given url '" + url + "' is not found in cookie manager.";
            Intrinsics.checkNotNullParameter(message2, "message");
            oVar.a(n.DEBUG, message2);
            return;
        }
        String message3 = "Cookie string is found: '" + cookie + "', for url: " + url;
        Intrinsics.checkNotNullParameter(message3, "message");
        oVar.a(nVar, message3);
        Iterator<String> it = new Regex(";").split(cookie, 0).iterator();
        while (it.hasNext()) {
            List<String> split = new Regex("=").split(StringsKt.trim((CharSequence) it.next()).toString(), 0);
            if (split.size() >= 2 && (str == null || Intrinsics.areEqual(str, split.get(0)))) {
                cookieManager.setCookie(url, split.get(0) + '=');
            }
        }
    }
}
