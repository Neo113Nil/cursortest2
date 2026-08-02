package s1;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import java.util.WeakHashMap;
import t1.k;
import t1.l;
import t1.m;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1410a {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f15227a;

    static {
        Uri.parse("*");
        Uri.parse("");
        f15227a = new WeakHashMap();
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static m b(WebView webView) {
        if (!k.f15404d.b()) {
            return new m(l.f15405a.createWebView(webView));
        }
        WeakHashMap weakHashMap = f15227a;
        m mVar = (m) weakHashMap.get(webView);
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(l.f15405a.createWebView(webView));
        weakHashMap.put(webView, mVar2);
        return mVar2;
    }
}
