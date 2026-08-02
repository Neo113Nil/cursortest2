package D0;

import I.C0079n;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import w0.InterfaceC0320f;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WebViewClient f310f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WebView f311g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f312h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f313i;

    public /* synthetic */ a0(WebViewClient webViewClient, WebView webView, Object obj, Object obj2, int i2) {
        this.f309e = i2;
        this.f310f = webViewClient;
        this.f311g = webView;
        this.f312h = obj;
        this.f313i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.f311g;
        Object obj = this.f313i;
        Object obj2 = this.f312h;
        WebViewClient webViewClient = this.f310f;
        switch (this.f309e) {
            case 0:
                C0056p c0056p = new C0056p(2);
                f0 f0Var = (f0) webViewClient;
                C0050j c0050j = f0Var.f351b;
                c0050j.getClass();
                Q0.h.e(webView, "webViewArg");
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj2;
                Q0.h.e(webResourceRequest, "requestArg");
                O o2 = c0050j.f366a;
                o2.getClass();
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat", o2.a(), null).h(G0.e.O(f0Var, webView, webResourceRequest, (V.h) obj), new H(18, c0056p));
                break;
            case 1:
                f0 f0Var2 = (f0) webViewClient;
                f0Var2.f351b.j(f0Var2, this.f311g, (WebResourceRequest) obj2, (WebResourceResponse) obj, new C0056p(2));
                break;
            case 2:
                f0 f0Var3 = (f0) webViewClient;
                f0Var3.f351b.b(f0Var3, this.f311g, (Message) obj2, (Message) obj, new C0056p(2));
                break;
            case 3:
                f0 f0Var4 = (f0) webViewClient;
                f0Var4.f351b.l(f0Var4, this.f311g, (SslErrorHandler) obj2, (SslError) obj, new C0056p(2));
                break;
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                h0 h0Var = (h0) webViewClient;
                h0Var.f361a.b(h0Var, this.f311g, (Message) obj2, (Message) obj, new C0056p(3));
                break;
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                h0 h0Var2 = (h0) webViewClient;
                h0Var2.f361a.l(h0Var2, this.f311g, (SslErrorHandler) obj2, (SslError) obj, new C0056p(3));
                break;
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                WebResourceError webResourceError = (WebResourceError) obj;
                C0056p c0056p2 = new C0056p(3);
                h0 h0Var3 = (h0) webViewClient;
                C0050j c0050j2 = h0Var3.f361a;
                c0050j2.getClass();
                Q0.h.e(webView, "webViewArg");
                WebResourceRequest webResourceRequest2 = (WebResourceRequest) obj2;
                Q0.h.e(webResourceRequest2, "requestArg");
                Q0.h.e(webResourceError, "errorArg");
                O o3 = c0050j2.f366a;
                o3.getClass();
                new C0079n((InterfaceC0320f) o3.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", o3.a(), null).h(G0.e.O(h0Var3, webView, webResourceRequest2, webResourceError), new H(19, c0056p2));
                break;
            default:
                h0 h0Var4 = (h0) webViewClient;
                h0Var4.f361a.j(h0Var4, this.f311g, (WebResourceRequest) obj2, (WebResourceResponse) obj, new C0056p(3));
                break;
        }
    }
}
