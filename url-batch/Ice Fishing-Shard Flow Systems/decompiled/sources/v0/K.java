package v0;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import u0.AbstractC0941A;

/* loaded from: classes.dex */
public final class K extends WebViewRenderProcessClient {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0941A f8181a;

    public K(AbstractC0941A abstractC0941A) {
        this.f8181a = abstractC0941A;
    }

    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = L.f8182c;
        L l7 = (L) weakHashMap.get(webViewRenderProcess);
        if (l7 == null) {
            l7 = new L();
            l7.f8184b = new WeakReference(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, l7);
        }
        this.f8181a.onRenderProcessResponsive(webView, l7);
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = L.f8182c;
        L l7 = (L) weakHashMap.get(webViewRenderProcess);
        if (l7 == null) {
            l7 = new L();
            l7.f8184b = new WeakReference(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, l7);
        }
        this.f8181a.onRenderProcessUnresponsive(webView, l7);
    }
}
