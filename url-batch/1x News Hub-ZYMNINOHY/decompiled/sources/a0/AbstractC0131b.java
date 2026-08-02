package a0;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import b0.AbstractC0182m;
import b0.AbstractC0184o;
import b0.C0185p;
import java.util.WeakHashMap;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0131b {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f1921a;

    static {
        Uri.parse("*");
        Uri.parse("");
        f1921a = new WeakHashMap();
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static C0185p b(WebView webView) {
        if (!AbstractC0182m.f2538d.b()) {
            return new C0185p(AbstractC0184o.f2541a.createWebView(webView));
        }
        WeakHashMap weakHashMap = f1921a;
        C0185p c0185p = (C0185p) weakHashMap.get(webView);
        if (c0185p != null) {
            return c0185p;
        }
        C0185p c0185p2 = new C0185p(AbstractC0184o.f2541a.createWebView(webView));
        weakHashMap.put(webView, c0185p2);
        return c0185p2;
    }
}
