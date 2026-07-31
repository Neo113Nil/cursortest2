package com.onevcat.uniwebview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.webkit.CookieManager;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import com.unity3d.player.UnityPlayer;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/onevcat/uniwebview/UniWebViewInterface;", BuildConfig.FLAVOR, "<init>", "()V", "Companion", "com/onevcat/uniwebview/y4", "uniwebview_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class UniWebViewInterface {
    public static final y4 Companion = new y4();
    public static final long RUN_SYNC_WAIT_TIME_MS = 5000;
    private static UniWebViewNativeChannel channel;

    @JvmStatic
    public static final void addJavaScript(String str, String str2, String identifier) {
        e1.a(Companion, str, "name", str2, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface addJavaScript to: ", str, oVar, "message"));
        y4.a(str, new f1(str2, identifier));
    }

    @JvmStatic
    public static final void addPermissionTrustDomain(String str, String str2) {
        e1.a(Companion, str, "name", str2, "domain");
        o oVar = o.b;
        String message = t0.a("Interface addPermissionTrustDomain: ", str, ", domain: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(str, new g1(str2));
    }

    @JvmStatic
    public static final void addSslExceptionDomain(String str, String str2) {
        e1.a(Companion, str, "name", str2, "domain");
        o oVar = o.b;
        String message = t0.a("Interface addSslExceptionDomain: ", str, ", domain: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(str, new h1(str2));
    }

    @JvmStatic
    public static final void addUrlScheme(String str, String str2) {
        e1.a(Companion, str, "name", str2, "scheme");
        o oVar = o.b;
        String message = t0.a("Interface addUrlScheme: ", str, ", scheme: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(str, new i1(str2));
    }

    @JvmStatic
    public static final boolean animateTo(String str, int i, int i2, int i3, int i4, float f, float f2, String str2) {
        e1.a(Companion, str, "name", str2, "identifier");
        o oVar = o.b;
        String message = "Interface animateTo: {" + i + ", " + i2 + ", " + i3 + ", " + i4 + '}';
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        Boolean bool = (Boolean) y4.c(str, new j1(i, i2, i3, i4, f, f2, str2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void authenticationInit(String str, String str2, String scheme) {
        e1.a(Companion, str, "name", str2, "url");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        o oVar = o.b;
        String message = "Interface authenticationInit: " + str + ", url: " + str2 + ", scheme: " + scheme;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(new k1(str, str2, scheme));
    }

    @JvmStatic
    public static final void authenticationSetPrivateMode(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface authenticationSetPrivateMode: ", name, ", flag: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(new l1(name, z));
    }

    @JvmStatic
    public static final void authenticationStart(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface authenticationStart: ", name, oVar, "message"));
        y4.a(new m1(name));
    }

    @JvmStatic
    public static final void bringContentToFront(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        y4.a(name, n1.a);
    }

    @JvmStatic
    public static final boolean canGoBack(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface canGoBack: ", name, oVar, "message"));
        Boolean bool = (Boolean) y4.c(name, o1.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final boolean canGoForward(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface canGoForward: ", name, oVar, "message"));
        Boolean bool = (Boolean) y4.c(name, p1.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void captureSnapshot(String name, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = t0.a("Interface captureSnapshot: ", name, ". File name: ", str, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new q1(str));
    }

    @JvmStatic
    public static final void cleanCache(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface cleanCache: ", name, oVar, "message"));
        y4.a(name, r1.a);
    }

    @JvmStatic
    public static final void clearCookies() {
        Companion.getClass();
        o oVar = o.b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter("Interface clearCookies", "message");
        oVar.a(n.INFO, "Interface clearCookies");
        u0.a();
    }

    @JvmStatic
    public static final void clearHttpAuthUsernamePassword(String str, String str2) {
        e1.a(Companion, str, "host", str2, "realm");
        o oVar = o.b;
        String message = t0.a("Interface clearHttpAuthUsernamePassword. Host: ", str, ", realm: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(new s1(str, str2));
    }

    @JvmStatic
    public static final void destroy(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface destroy web view: ", name, oVar, "message"));
        y4.a(name, t1.a);
    }

    @JvmStatic
    public static final void evaluateJavaScript(String str, String str2, String identifier) {
        e1.a(Companion, str, "name", str2, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface evaluateJavaScript in: ", str, oVar, "message"));
        y4.a(str, new u1(str2, identifier));
    }

    @JvmStatic
    public static final String getCookie(String url, String key) {
        e1.a(Companion, url, "url", key, "key");
        o oVar = o.b;
        String message = t0.a("Interface getCookie from: ", url, " | key: ", key, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(key, "key");
        String cookie = CookieManager.getInstance().getCookie(url);
        if (cookie == null) {
            String message2 = "The content for given url '" + url + "' is not found in cookie manager.";
            Intrinsics.checkNotNullParameter(message2, "message");
            oVar.a(n.DEBUG, message2);
        } else {
            String message3 = "Cookie string is found: '" + cookie + "', for url: " + url;
            Intrinsics.checkNotNullParameter(message3, "message");
            n nVar = n.VERBOSE;
            oVar.a(nVar, message3);
            String message4 = "Trying to parse cookie to find value for key: " + key;
            Intrinsics.checkNotNullParameter(message4, "message");
            oVar.a(nVar, message4);
            Iterator it = CollectionsKt.reversed(new Regex(";").split(cookie, 0)).iterator();
            while (it.hasNext()) {
                List<String> split = new Regex("=").split(StringsKt.trim((CharSequence) it.next()).toString(), 0);
                if (split.size() >= 2 && Intrinsics.areEqual(split.get(0), key)) {
                    String str = split.get(1);
                    o oVar2 = o.b;
                    String message5 = t0.a("Found cookie value: ", str, " for key: ", key, oVar2);
                    Intrinsics.checkNotNullParameter(message5, "message");
                    oVar2.a(n.VERBOSE, message5);
                    return str;
                }
            }
            o oVar3 = o.b;
            String message6 = "Did not find the key '" + key + "' in cookie.";
            oVar3.getClass();
            Intrinsics.checkNotNullParameter(message6, "message");
            oVar3.a(n.VERBOSE, message6);
        }
        return BuildConfig.FLAVOR;
    }

    @JvmStatic
    public static final byte[] getRenderedData(String name, int i, int i2, int i3, int i4) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        g gVar = g.b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        s0 s0Var = (s0) gVar.a.get(name);
        if (s0Var != null && (byteArrayOutputStream = s0Var.m) != null) {
            byteArrayOutputStream.reset();
            Bitmap bitmap = s0Var.n;
            if (bitmap != null) {
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (Exception e) {
                    o oVar = o.b;
                    String message = "Creating snapshot buffer exception: " + e;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    oVar.a(n.CRITICAL, message);
                }
                y4.a(name, new v1((i != -1 && i2 == -1 && i3 == -1 && i4 == -1) ? null : new Rect(i, i2, i3 + i, i4 + i2)));
                return bArr;
            }
        }
        bArr = null;
        y4.a(name, new v1((i != -1 && i2 == -1 && i3 == -1 && i4 == -1) ? null : new Rect(i, i2, i3 + i, i4 + i2)));
        return bArr;
    }

    @JvmStatic
    public static final String getUrl(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface getUrl: ", name, oVar, "message"));
        String str = (String) y4.c(name, w1.a);
        return str == null ? BuildConfig.FLAVOR : str;
    }

    @JvmStatic
    public static final String getUserAgent(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface getUserAgent: ", name, oVar, "message"));
        String str = (String) y4.c(name, x1.a);
        return str == null ? BuildConfig.FLAVOR : str;
    }

    @JvmStatic
    public static final float getWebViewAlpha(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface getWebViewAlpha: ", name, oVar, "message"));
        Float f = (Float) y4.c(name, y1.a);
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @JvmStatic
    public static final void goBack(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface goBack: ", name, oVar, "message"));
        y4.a(name, z1.a);
    }

    @JvmStatic
    public static final void goForward(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface goForward: ", name, oVar, "message"));
        y4.a(name, a2.a);
    }

    @JvmStatic
    public static final boolean hide(String str, boolean z, int i, float f, String str2) {
        e1.a(Companion, str, "name", str2, "identifier");
        o oVar = o.b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter("Interface hide", "message");
        oVar.a(n.INFO, "Interface hide");
        Boolean bool = (Boolean) y4.c(str, new b2(z, i, f, str2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void hideAsync(String str, boolean z, int i, float f, String str2) {
        e1.a(Companion, str, "name", str2, "identifier");
        o oVar = o.b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter("Interface hideAsync", "message");
        oVar.a(n.INFO, "Interface hideAsync");
        y4.a(str, new c2(z, i, f, str2));
    }

    @JvmStatic
    public static final void hideSpinner(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface hideSpinner: ", name, oVar, "message"));
        y4.a(name, d2.a);
    }

    @JvmStatic
    public static final void init(String name, int i, int i2, int i3, int i4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface init: ", name, oVar, "message"));
        y4.a(new e2(name, i, i2, i3, i4));
    }

    @JvmStatic
    public static final boolean isAuthenticationIsSupported() {
        Companion.getClass();
        o oVar = o.b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter("Interface authenticationIsSupported.", "message");
        oVar.a(n.INFO, "Interface authenticationIsSupported.");
        Boolean bool = (Boolean) y4.c(f2.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final boolean isSafeBrowsingSupported() {
        Companion.getClass();
        Boolean bool = (Boolean) y4.c(f2.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final boolean isWebViewSupported() {
        Companion.getClass();
        Boolean bool = (Boolean) y4.c(g2.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void load(String name, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = t0.a("Interface load: ", name, ", url: ", str, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new h2(str));
    }

    @JvmStatic
    public static final void loadHTMLString(String name, String str, String str2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter("Interface loadHTMLString", "message");
        oVar.a(n.INFO, "Interface loadHTMLString");
        y4.a(name, new i2(str, str2));
    }

    @JvmStatic
    public static final void prepare() {
        Companion.getClass();
        y4.c(j2.a);
    }

    @JvmStatic
    public static final void print(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface print: ", name, oVar, "message"));
        y4.a(name, k2.a);
    }

    @JvmStatic
    public static final void registerChannel(UniWebViewNativeChannel channel2) {
        y4 y4Var = Companion;
        y4Var.getClass();
        Intrinsics.checkNotNullParameter(channel2, "channel");
        y4.a(new l2(y4Var, channel2));
    }

    @JvmStatic
    public static final void reload(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface reload: ", name, oVar, "message"));
        y4.a(name, m2.a);
    }

    @JvmStatic
    public static final void removeCookie(String str, String str2) {
        e1.a(Companion, str, "url", str2, "key");
        o oVar = o.b;
        String message = t0.a("Interface removeCookie: ", str, ", key: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        u0.a(str, str2);
    }

    @JvmStatic
    public static final void removeCookies(String url) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface remove cookies for: ", url, oVar, "message"));
        Intrinsics.checkNotNullParameter(url, "url");
        u0.a(url, (String) null);
    }

    @JvmStatic
    public static final void removePermissionTrustDomain(String str, String str2) {
        e1.a(Companion, str, "name", str2, "domain");
        o oVar = o.b;
        String message = t0.a("Interface removePermissionTrustDomain: ", str, ", domain: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(str, new n2(str2));
    }

    @JvmStatic
    public static final void removeSslExceptionDomain(String str, String str2) {
        e1.a(Companion, str, "name", str2, "domain");
        o oVar = o.b;
        String message = t0.a("Interface removeSslExceptionDomain: ", str, ", domain: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(str, new o2(str2));
    }

    @JvmStatic
    public static final void removeUrlScheme(String str, String str2) {
        e1.a(Companion, str, "name", str2, "scheme");
        o oVar = o.b;
        String message = t0.a("Interface removeUrlScheme: ", str, ", scheme: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(str, new p2(str2));
    }

    @JvmStatic
    public static final void safeBrowsingInit(String name, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = t0.a("Interface safeBrowsingInit: ", name, ", url: ", str, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(new s2(str, name));
    }

    @JvmStatic
    public static final void safeBrowsingSetToolbarColor(String name, float f, float f2, float f3) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface safeBrowsingSetToolbarColor: " + name + ", rgb: {" + f + ", " + f2 + ", " + f3 + ')';
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(new t2(name, f, f2, f3));
    }

    @JvmStatic
    public static final void safeBrowsingShow(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface safeBrowsingShow: ", name, oVar, "message"));
        y4.a(new u2(name));
    }

    @JvmStatic
    public static final float screenHeight() {
        Companion.getClass();
        return UnityPlayer.currentActivity.findViewById(android.R.id.content).getHeight();
    }

    @JvmStatic
    public static final float screenWidth() {
        Companion.getClass();
        return UnityPlayer.currentActivity.findViewById(android.R.id.content).getWidth();
    }

    @JvmStatic
    public static final void scrollTo(String name, int i, int i2, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface scrollTo: " + name + ", {" + i + ", " + i2 + "}, animated: " + z;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new v2(i, i2, z));
    }

    @JvmStatic
    public static final void setAcceptThirdPartyCookies(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setAcceptThirdPartyCookies: ", name, ", enabled: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new w2(z));
    }

    @JvmStatic
    public static final void setAllowAutoPlay(boolean z) {
        Companion.getClass();
        o oVar = o.b;
        String message = "Interface setAllowAutoPlay: " + z;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(new x2(z));
    }

    @JvmStatic
    public static final void setAllowFileAccess(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setAllowFileAccess: ", name, ", enabled: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new y2(z));
    }

    @JvmStatic
    public static final void setAllowFileAccessFromFileURLs(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setAllowFileAccessFromFileURLs: ", name, ", enabled: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new z2(z));
    }

    @JvmStatic
    public static final void setAllowHTTPAuthPopUpWindow(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setAllowHTTPAuthPopUpWindow: ", name, ", flag: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new a3(z));
    }

    @JvmStatic
    public static final void setAllowJavaScriptOpenWindow(boolean z) {
        Companion.getClass();
        o oVar = o.b;
        String message = "Interface setAllowJavaScriptOpenWindow: " + z;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(new b3(z));
    }

    @JvmStatic
    public static final void setAllowUniversalAccessFromFileURLs(boolean z) {
        Companion.getClass();
        o oVar = o.b;
        String message = "Interface setAllowUniversalAccessFromFileURLs: " + z;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(new c3(z));
    }

    @JvmStatic
    public static final void setAllowUserDismissSpinnerByGesture(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setAllowUserDismissSpinnerByGesture: ", name, ", flag: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new d3(z));
    }

    @JvmStatic
    public static final void setAllowUserEditFileNameBeforeDownloading(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setAllowUserEditFileNameBeforeDownloading: ", name, ", enabled: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new e3(z));
    }

    @JvmStatic
    public static final void setBackgroundColor(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface setBackgroundColor rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + '}';
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new f3(f, f2, f3, f4));
    }

    @JvmStatic
    public static final void setBouncesEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setBouncesEnabled: ", name, ", enabled: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new g3(z));
    }

    @JvmStatic
    public static final void setCacheMode(String name, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface setCacheMode: " + name + ", mode: " + i;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new h3(i));
    }

    @JvmStatic
    public static final void setCalloutEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setCalloutEnabled: ", name, ", flag: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new i3(z));
    }

    @JvmStatic
    public static final void setCookie(String str, String str2) {
        e1.a(Companion, str, "url", str2, "cookie");
        o oVar = o.b;
        String message = t0.a("Interface setCookie: ", str2, " | to url: ", str, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        u0.b(str, str2);
    }

    @JvmStatic
    public static final void setDefaultFontSize(String name, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface setDefaultFontSize: " + name + ", size: " + i;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new j3(i));
    }

    @JvmStatic
    public static final void setDownloadEventForContextMenuEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface SetDownloadEventForContextMenuEnabled: ", name, ", enabled: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new k3(z));
    }

    @JvmStatic
    public static final void setDragInteractionEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setDragInteractionEnabled: ", name, ", enabled: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new l3(z));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarBackgroundColor(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface setEmbeddedToolbarBackgroundColor: " + name + ", rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + ')';
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new m3(f, f2, f3, f4));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarButtonTextColor(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface setEmbeddedToolbarButtonTextColor: " + name + ", rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + ')';
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new n3(f, f2, f3, f4));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarDoneButtonText(String str, String str2) {
        e1.a(Companion, str, "name", str2, "text");
        o oVar = o.b;
        String message = t0.a("Interface setEmbeddedToolbarDoneButtonText: ", str, ", text: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(str, new o3(str2));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarGoBackButtonText(String str, String str2) {
        e1.a(Companion, str, "name", str2, "text");
        o oVar = o.b;
        String message = t0.a("Interface setEmbeddedToolbarGoBackButtonText: ", str, ", text: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(str, new p3(str2));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarGoForwardButtonText(String str, String str2) {
        e1.a(Companion, str, "name", str2, "text");
        o oVar = o.b;
        String message = t0.a("Interface setEmbeddedToolbarGoForwardButtonText: ", str, ", text: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(str, new q3(str2));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarNavigationButtonsShow(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setEmbeddedToolbarNavigationButtonsShow: ", name, ", show: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new r3(z));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarOnTop(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setEmbeddedToolbarOnTop: ", name, ", top: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new s3(z));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarTitleText(String str, String str2) {
        e1.a(Companion, str, "name", str2, "text");
        o oVar = o.b;
        String message = t0.a("Interface setEmbeddedToolbarTitleText: ", str, ", text: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(str, new t3(str2));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarTitleTextColor(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface setEmbeddedToolbarTitleTextColor: " + name + ", rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + ')';
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new u3(f, f2, f3, f4));
    }

    @JvmStatic
    public static final void setEnableKeyboardAvoidance(boolean z) {
        Companion.getClass();
        o oVar = o.b;
        String message = "Interface setEnableKeyboardAvoidance: " + z;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(new v3(z));
    }

    @JvmStatic
    public static final void setForwardWebConsoleToNativeOutput(boolean z) {
        Companion.getClass();
        o oVar = o.b;
        String message = "Interface setForwardWebConsoleToNativeOutput: " + z;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(new w3(z));
    }

    @JvmStatic
    public static final void setFrame(String name, int i, int i2, int i3, int i4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface setFrame: " + name + ", {" + i + ", " + i2 + ", " + i3 + ", " + i4 + '}';
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new x3(i, i2, i3, i4));
    }

    @JvmStatic
    public static final void setHeaderField(String str, String str2, String str3) {
        e1.a(Companion, str, "name", str2, "key");
        o oVar = o.b;
        String message = "Interface setHeaderField: " + str + ". {key: " + str2 + ", value: " + str3 + '}';
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(str, new y3(str2, str3));
    }

    @JvmStatic
    public static final void setHorizontalScrollBarEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setHorizontalScrollBarEnabled: ", name, ", enabled: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new z3(z));
    }

    @JvmStatic
    public static final void setJavaScriptEnabled(boolean z) {
        Companion.getClass();
        o oVar = o.b;
        String message = "Interface setJavaScriptEnabled: " + z;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(new a4(z));
    }

    @JvmStatic
    public static final void setLoadWithOverviewMode(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setLoadWithOverviewMode: ", name, ", flag: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new b4(z));
    }

    @JvmStatic
    public static final void setLogLevel(int i) {
        Companion.getClass();
        o.b.a = i;
    }

    @JvmStatic
    public static final void setOpenLinksInExternalBrowser(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setOpenLinksInExternalBrowser: ", name, ", enabled: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new c4(z));
    }

    @JvmStatic
    public static final void setPosition(String name, int i, int i2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface setPosition: " + name + ", {" + i + ", " + i2 + '}';
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new d4(i, i2));
    }

    @JvmStatic
    public static final void setShowEmbeddedToolbar(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setShowEmbeddedToolbar: ", name, ", show: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new e4(z));
    }

    @JvmStatic
    public static final void setShowSpinnerWhileLoading(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setShowSpinnerWhileLoading: ", name, ", show: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new f4(z));
    }

    @JvmStatic
    public static final void setSize(String name, int i, int i2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface setSize: " + name + ", {" + i + ", " + i2 + '}';
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new g4(i, i2));
    }

    @JvmStatic
    public static final void setSpinnerText(String str, String str2) {
        e1.a(Companion, str, "name", str2, "text");
        o oVar = o.b;
        String message = t0.a("Interface setSpinnerText: ", str, ", text: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(str, new h4(str2));
    }

    @JvmStatic
    public static final void setSupportMultipleWindows(String name, boolean z, boolean z2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface setSupportMultipleWindows: " + name + ", flag: " + z + ", allowJS: " + z2;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new i4(z2));
    }

    @JvmStatic
    public static final void setTextZoom(String name, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface setTextZoom: " + name + ", textZoom: " + i;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new j4(i));
    }

    @JvmStatic
    public static final void setTransparencyClickingThroughEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setTransparencyClickingThroughEnabled: ", name, ", flag: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new k4(z));
    }

    @JvmStatic
    public static final void setUseWideViewPort(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setUseWideViewPort: ", name, ", flag: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new l4(z));
    }

    @JvmStatic
    public static final void setUserAgent(String str, String str2) {
        e1.a(Companion, str, "name", str2, "userAgent");
        o oVar = o.b;
        String message = t0.a("Interface setUserAgent: ", str, ", UA: ", str2, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(str, new m4(str2));
    }

    @JvmStatic
    public static final void setUserInteractionEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setUserInteractionEnabled: ", name, ", flag: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new n4(z));
    }

    @JvmStatic
    public static final void setVerticalScrollBarEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setVerticalScrollBarEnabled: ", name, ", enabled: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new o4(z));
    }

    @JvmStatic
    public static final void setWebContentsDebuggingEnabled(boolean z) {
        Companion.getClass();
        o oVar = o.b;
        String message = "Interface setWebContentsDebuggingEnabled: " + z;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(new p4(z));
    }

    @JvmStatic
    public static final void setWebViewAlpha(String name, float f) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = "Interface setWebViewAlpha: " + name + ", alpha: " + f;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new q4(f));
    }

    @JvmStatic
    public static final void setZoomEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        String message = d1.a("Interface setZoomEnabled: ", name, ", enabled: ", z, oVar);
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        y4.a(name, new r4(z));
    }

    @JvmStatic
    public static final boolean show(String str, boolean z, int i, float f, String str2) {
        e1.a(Companion, str, "name", str2, "identifier");
        o oVar = o.b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter("Interface show", "message");
        oVar.a(n.INFO, "Interface show");
        Boolean bool = (Boolean) y4.c(str, new s4(z, i, f, str2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void showAsync(String str, boolean z, int i, float f, String str2) {
        e1.a(Companion, str, "name", str2, "identifier");
        o oVar = o.b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter("Interface showAsync", "message");
        oVar.a(n.INFO, "Interface showAsync");
        y4.a(str, new t4(z, i, f, str2));
    }

    @JvmStatic
    public static final void showSpinner(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface showSpinner: ", name, oVar, "message"));
        y4.a(name, u4.a);
    }

    @JvmStatic
    public static final void startSnapshotForRendering(String name, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface startSnapshotForRendering: ", name, oVar, "message"));
        y4.a(name, new v4(str));
    }

    @JvmStatic
    public static final void stop(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface stop: ", name, oVar, "message"));
        y4.a(name, w4.a);
    }

    @JvmStatic
    public static final void stopSnapshotForRendering(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.INFO, d.a("Interface stopSnapshotForRendering: ", name, oVar, "message"));
        y4.a(name, x4.a);
    }
}
