package X1;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* loaded from: classes.dex */
public final class j extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f1741a;

    public j(WebViewActivity webViewActivity) {
        this.f1741a = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        i iVar = new i(this);
        WebView webView2 = new WebView(this.f1741a.f9335c.getContext());
        webView2.setWebViewClient(iVar);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
