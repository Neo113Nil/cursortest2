package u0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import v0.AbstractC0962f;
import v0.AbstractC0964h;
import v0.AbstractC0966j;
import v0.AbstractC0968l;
import v0.C0958b;
import v0.F;
import v0.H;
import v0.J;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f8069a = Uri.parse("*");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f8070b = Uri.parse("");

    public static v0.u a(WebView webView, String str, Set set) {
        if (!F.f8145J.b()) {
            throw F.a();
        }
        J d7 = d(webView);
        return new v0.u((ScriptHandlerBoundaryInterface) V6.b.a(ScriptHandlerBoundaryInterface.class, ((WebViewProviderBoundaryInterface) d7.f8180b).addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]))));
    }

    public static PackageInfo b(Context context) {
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT >= 26) {
            packageInfo = AbstractC0964h.a();
        } else {
            try {
                packageInfo = c();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo != null) {
            return packageInfo;
        }
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str != null) {
                return context.getPackageManager().getPackageInfo(str, 0);
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return null;
    }

    public static PackageInfo c() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static J d(WebView webView) {
        WebViewProviderBoundaryInterface createWebView = H.f8177a.createWebView(webView);
        J j = new J(5);
        j.f8180b = createWebView;
        return j;
    }

    public static void e(WebView webView, n nVar, Uri uri) {
        int i2 = nVar.f8060d;
        if (f8069a.equals(uri)) {
            uri = f8070b;
        }
        C0958b c0958b = F.f8173x;
        c0958b.getClass();
        if (i2 == 0) {
            AbstractC0962f.j(webView, AbstractC0962f.b(nVar), uri);
        } else {
            if (!c0958b.b() || (i2 != 0 && (i2 != 1 || !F.f8170u.b()))) {
                throw F.a();
            }
            ((WebViewProviderBoundaryInterface) d(webView).f8180b).postMessageToMainFrame(new V6.a(new v0.z(nVar)), uri);
        }
    }

    public static void f(HashSet hashSet, ValueCallback valueCallback) {
        C0958b c0958b = F.f8156f;
        C0958b c0958b2 = F.f8155e;
        if (c0958b.b()) {
            H.f8177a.getStatics().setSafeBrowsingAllowlist(hashSet, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        if (c0958b2.a()) {
            AbstractC0966j.d(arrayList, valueCallback);
        } else {
            if (!c0958b2.b()) {
                throw F.a();
            }
            H.f8177a.getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    public static void g(InAppWebView inAppWebView, InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient) {
        C0958b c0958b = F.f8138C;
        if (c0958b.a()) {
            AbstractC0968l.f(inAppWebView, inAppWebViewRenderProcessClient);
        } else {
            if (!c0958b.b()) {
                throw F.a();
            }
            ((WebViewProviderBoundaryInterface) d(inAppWebView).f8180b).setWebViewRendererClient(inAppWebViewRenderProcessClient != null ? new V6.a(new J(0, inAppWebViewRenderProcessClient)) : null);
        }
    }
}
