package D0;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public class U extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public WebViewClient f282a;

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z2, boolean z3, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.f282a == null) {
            return false;
        }
        webView2.setWebViewClient(new T(this, webView));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
