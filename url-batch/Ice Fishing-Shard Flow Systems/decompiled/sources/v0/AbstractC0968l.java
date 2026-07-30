package v0;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;
import u0.AbstractC0941A;

/* renamed from: v0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0968l {
    @Deprecated
    public static int a(WebSettings webSettings) {
        int forceDark;
        forceDark = webSettings.getForceDark();
        return forceDark;
    }

    public static WebViewRenderProcess b(WebView webView) {
        WebViewRenderProcess webViewRenderProcess;
        webViewRenderProcess = webView.getWebViewRenderProcess();
        return webViewRenderProcess;
    }

    public static WebViewRenderProcessClient c(WebView webView) {
        WebViewRenderProcessClient webViewRenderProcessClient;
        webViewRenderProcessClient = webView.getWebViewRenderProcessClient();
        return webViewRenderProcessClient;
    }

    @Deprecated
    public static void d(WebSettings webSettings, int i2) {
        webSettings.setForceDark(i2);
    }

    public static void e(WebView webView, Executor executor, AbstractC0941A abstractC0941A) {
        webView.setWebViewRenderProcessClient(executor, abstractC0941A != null ? new K(abstractC0941A) : null);
    }

    public static void f(WebView webView, AbstractC0941A abstractC0941A) {
        webView.setWebViewRenderProcessClient(abstractC0941A != null ? new K(abstractC0941A) : null);
    }

    public static boolean g(WebViewRenderProcess webViewRenderProcess) {
        boolean terminate;
        terminate = webViewRenderProcess.terminate();
        return terminate;
    }
}
