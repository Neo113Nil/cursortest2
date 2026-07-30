package H0;

import I0.j;
import I0.m;
import I0.n;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.dynamicloading.g;
import g1.C4524d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1207a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static void a(WebView webView, String str, Set set, d dVar) {
        if (!m.f1238d.b()) {
            throw m.a();
        }
        C4524d c4 = c(webView);
        ((WebViewProviderBoundaryInterface) c4.f37858u).addWebMessageListener(str, (String[]) set.toArray(new String[0]), new g(1, new j(0, dVar)));
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static C4524d c(WebView webView) {
        return new C4524d(5, n.f1243a.createWebView(webView));
    }

    public static String d() {
        if (m.f1240f.b()) {
            return n.f1243a.getStatics().getVariationsHeader();
        }
        throw m.a();
    }

    public static WebViewClient e(WebView webView) {
        Looper webViewLooper;
        WebViewClient webViewClient;
        I0.b bVar = m.f1236b;
        if (bVar.a()) {
            webViewClient = webView.getWebViewClient();
            return webViewClient;
        }
        if (!bVar.b()) {
            throw m.a();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            webViewLooper = webView.getWebViewLooper();
            if (webViewLooper != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        }
        return ((WebViewProviderBoundaryInterface) c(webView).f37858u).getWebViewClient();
    }
}
