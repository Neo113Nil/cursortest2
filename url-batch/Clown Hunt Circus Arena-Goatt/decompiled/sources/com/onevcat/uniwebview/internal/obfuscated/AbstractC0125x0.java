package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0125x0 {
    public static void a(String url, String cookie, final ValueCallback callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B b = B.b;
        String message = L.a("Cookie set for url async: ", url, ", cookie: ", cookie, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.VERBOSE, message);
        final CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setCookie(url, cookie, new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.x0$$ExternalSyntheticLambda2
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                AbstractC0125x0.b(cookieManager, callback, (Boolean) obj);
            }
        });
    }

    public static void b(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        B b = B.b;
        String message = L.a("Cookie remove for url: ", url, ", key: ", str, b);
        Intrinsics.checkNotNullParameter(message, "message");
        A a = A.VERBOSE;
        b.a(a, message);
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(url);
        if (cookie == null) {
            String message2 = "The content for given url '" + url + "' is not found in cookie manager.";
            Intrinsics.checkNotNullParameter(message2, "message");
            b.a(A.DEBUG, message2);
            return;
        }
        String message3 = "Cookie string is found: '" + cookie + "', for url: " + url;
        Intrinsics.checkNotNullParameter(message3, "message");
        b.a(a, message3);
        Iterator<String> it = new Regex(";").split(cookie, 0).iterator();
        while (it.hasNext()) {
            List<String> split = new Regex("=").split(StringsKt.trim((CharSequence) it.next()).toString(), 0);
            if (split.size() >= 2 && (str == null || Intrinsics.areEqual(str, split.get(0)))) {
                cookieManager.setCookie(url, split.get(0) + '=');
            }
        }
    }

    public static void c(String url, String cookie) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        B b = B.b;
        String message = L.a("Cookie set for url: ", url, ", cookie: ", cookie, b);
        Intrinsics.checkNotNullParameter(message, "message");
        A a = A.VERBOSE;
        b.a(a, message);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setCookie(url, cookie);
        cookieManager.flush();
        Intrinsics.checkNotNullParameter("Cookie manager flush done.", "message");
        b.a(a, "Cookie manager flush done.");
    }

    public static String a(String url, String key) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(key, "key");
        String cookie = CookieManager.getInstance().getCookie(url);
        if (cookie == null) {
            B b = B.b;
            String message = "The content for given url '" + url + "' is not found in cookie manager.";
            b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(A.DEBUG, message);
            return "";
        }
        B b2 = B.b;
        String message2 = L.a("Cookie string is found: '", cookie, "', for url: ", url, b2);
        Intrinsics.checkNotNullParameter(message2, "message");
        A a = A.VERBOSE;
        b2.a(a, message2);
        String message3 = "Trying to parse cookie to find value for key: " + key;
        Intrinsics.checkNotNullParameter(message3, "message");
        b2.a(a, message3);
        Iterator it = CollectionsKt.reversed(new Regex(";").split(cookie, 0)).iterator();
        while (it.hasNext()) {
            List<String> split = new Regex("=").split(StringsKt.trim((CharSequence) it.next()).toString(), 0);
            if (split.size() >= 2 && Intrinsics.areEqual(split.get(0), key)) {
                String str = split.get(1);
                B b3 = B.b;
                String message4 = L.a("Found cookie value: ", str, " for key: ", key, b3);
                Intrinsics.checkNotNullParameter(message4, "message");
                b3.a(A.VERBOSE, message4);
                return str;
            }
        }
        B b4 = B.b;
        String message5 = "Did not find the key '" + key + "' in cookie.";
        b4.getClass();
        Intrinsics.checkNotNullParameter(message5, "message");
        b4.a(A.VERBOSE, message5);
        return "";
    }

    public static final void b(CookieManager cookieManager, ValueCallback callback, Boolean bool) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        cookieManager.flush();
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Cookie manager flush done.", "message");
        b.a(A.VERBOSE, "Cookie manager flush done.");
        callback.onReceiveValue(Unit.INSTANCE);
    }

    public static void b() {
        CookieManager.getInstance().flush();
    }

    public static void a() {
        final CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.x0$$ExternalSyntheticLambda1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                AbstractC0125x0.a(cookieManager, (Boolean) obj);
            }
        });
    }

    public static final void a(CookieManager cookieManager, Boolean bool) {
        cookieManager.flush();
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Cookie manager flush done.", "message");
        b.a(A.VERBOSE, "Cookie manager flush done.");
    }

    public static void a(final ValueCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        final CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.x0$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                AbstractC0125x0.a(cookieManager, callback, (Boolean) obj);
            }
        });
    }

    public static final void a(CookieManager cookieManager, ValueCallback callback, Boolean bool) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        cookieManager.flush();
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Cookie manager flush done.", "message");
        b.a(A.VERBOSE, "Cookie manager flush done.");
        callback.onReceiveValue(Unit.INSTANCE);
    }
}
