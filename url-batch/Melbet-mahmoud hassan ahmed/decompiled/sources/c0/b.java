package c0;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b0.d;

/* loaded from: classes.dex */
public class b {

    class a extends WebMessagePort.WebMessageCallback {
        a(d.a aVar) {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            new h(webMessagePort);
            h.c(webMessage);
            throw null;
        }
    }

    /* renamed from: c0.b$b, reason: collision with other inner class name */
    class C0041b extends WebMessagePort.WebMessageCallback {
        C0041b(d.a aVar) {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            new h(webMessagePort);
            h.c(webMessage);
            throw null;
        }
    }

    class c extends WebView.VisualStateCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0.f f1705a;

        c(b0.f fVar) {
            this.f1705a = fVar;
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j7) {
            this.f1705a.onComplete(j7);
        }
    }

    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(b0.c cVar) {
        return new WebMessage(cVar.a(), h.b(cVar.b()));
    }

    public static WebMessagePort[] c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static b0.c d(WebMessage webMessage) {
        return new b0.c(webMessage.getData(), h.e(webMessage.getPorts()));
    }

    public static CharSequence e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j7, b0.f fVar) {
        webView.postVisualStateCallback(j7, new c(fVar));
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z6) {
        webSettings.setOffscreenPreRaster(z6);
    }

    public static void l(WebMessagePort webMessagePort, d.a aVar) {
        webMessagePort.setWebMessageCallback(new a(aVar));
    }

    public static void m(WebMessagePort webMessagePort, d.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new C0041b(aVar), handler);
    }
}
