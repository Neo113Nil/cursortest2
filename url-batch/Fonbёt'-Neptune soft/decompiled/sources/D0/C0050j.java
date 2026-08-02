package D0;

import I.C0079n;
import a.AbstractC0132a;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.Iterator;
import w0.InterfaceC0320f;

/* renamed from: D0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050j {

    /* renamed from: a, reason: collision with root package name */
    public final O f366a;

    public C0050j(O o2, int i2) {
        switch (i2) {
            case 1:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            case 2:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            case 3:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            case K.k.BYTES_FIELD_NUMBER /* 8 */:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            case 9:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            case 10:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            case 11:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            case 12:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            case 13:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            case 14:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
            default:
                Q0.h.e(o2, "pigeonRegistrar");
                this.f366a = o2;
                break;
        }
    }

    public void a(WebViewClient webViewClient, WebView webView, String str, boolean z2, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "webViewArg");
        Q0.h.e(str, "urlArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", o2.a(), null).h(G0.e.O(webViewClient, webView, str, Boolean.valueOf(z2)), new M(2, lVar));
    }

    public void b(WebViewClient webViewClient, WebView webView, Message message, Message message2, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "viewArg");
        Q0.h.e(message, "dontResendArg");
        Q0.h.e(message2, "resendArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", o2.a(), null).h(G0.e.O(webViewClient, webView, message, message2), new M(13, lVar));
    }

    public void c(WebViewClient webViewClient, WebView webView, String str, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "viewArg");
        Q0.h.e(str, "urlArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", o2.a(), null).h(G0.e.O(webViewClient, webView, str), new M(4, lVar));
    }

    public void d(WebViewClient webViewClient, WebView webView, String str, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "viewArg");
        Q0.h.e(str, "urlArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", o2.a(), null).h(G0.e.O(webViewClient, webView, str), new M(9, lVar));
    }

    public void e(WebViewClient webViewClient, WebView webView, String str, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "webViewArg");
        Q0.h.e(str, "urlArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", o2.a(), null).h(G0.e.O(webViewClient, webView, str), new M(10, lVar));
    }

    public void f(WebViewClient webViewClient, WebView webView, String str, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "webViewArg");
        Q0.h.e(str, "urlArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", o2.a(), null).h(G0.e.O(webViewClient, webView, str), new M(6, lVar));
    }

    public void g(WebViewClient webViewClient, WebView webView, ClientCertRequest clientCertRequest, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "viewArg");
        Q0.h.e(clientCertRequest, "requestArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", o2.a(), null).h(G0.e.O(webViewClient, webView, clientCertRequest), new M(7, lVar));
    }

    public void h(WebViewClient webViewClient, WebView webView, long j2, String str, String str2, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "webViewArg");
        Q0.h.e(str, "descriptionArg");
        Q0.h.e(str2, "failingUrlArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError", o2.a(), null).h(G0.e.O(webViewClient, webView, Long.valueOf(j2), str, str2), new M(11, lVar));
    }

    public void i(WebViewClient webViewClient, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "webViewArg");
        Q0.h.e(httpAuthHandler, "handlerArg");
        Q0.h.e(str, "hostArg");
        Q0.h.e(str2, "realmArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", o2.a(), null).h(G0.e.O(webViewClient, webView, httpAuthHandler, str, str2), new M(12, lVar));
    }

    public void j(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "webViewArg");
        Q0.h.e(webResourceRequest, "requestArg");
        Q0.h.e(webResourceResponse, "responseArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", o2.a(), null).h(G0.e.O(webViewClient, webView, webResourceRequest, webResourceResponse), new M(3, lVar));
    }

    public void k(WebViewClient webViewClient, WebView webView, String str, String str2, String str3, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "viewArg");
        Q0.h.e(str, "realmArg");
        Q0.h.e(str3, "argsArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", o2.a(), null).h(G0.e.O(webViewClient, webView, str, str2, str3), new M(5, lVar));
    }

    public void l(WebViewClient webViewClient, WebView webView, SslErrorHandler sslErrorHandler, SslError sslError, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "viewArg");
        Q0.h.e(sslErrorHandler, "handlerArg");
        Q0.h.e(sslError, "errorArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", o2.a(), null).h(G0.e.O(webViewClient, webView, sslErrorHandler, sslError), new M(14, lVar));
    }

    public void m(WebViewClient webViewClient, WebView webView, double d2, double d3, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "viewArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", o2.a(), null).h(G0.e.O(webViewClient, webView, Double.valueOf(d2), Double.valueOf(d3)), new M(0, lVar));
    }

    public l0 n() {
        DisplayManager displayManager = (DisplayManager) ((Context) this.f366a.f263e).getSystemService("display");
        ArrayList R2 = AbstractC0132a.R(displayManager);
        l0 l0Var = new l0(this);
        ArrayList R3 = AbstractC0132a.R(displayManager);
        R3.removeAll(R2);
        if (!R3.isEmpty()) {
            Iterator it = R3.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) it.next());
                displayManager.registerDisplayListener(new C0054n(R3, displayManager, 0), null);
            }
        }
        return l0Var;
    }

    public void o(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "webViewArg");
        Q0.h.e(webResourceRequest, "requestArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", o2.a(), null).h(G0.e.O(webViewClient, webView, webResourceRequest), new M(8, lVar));
    }

    public void p(WebViewClient webViewClient, WebView webView, String str, P0.l lVar) {
        Q0.h.e(webViewClient, "pigeon_instanceArg");
        Q0.h.e(webView, "webViewArg");
        Q0.h.e(str, "urlArg");
        O o2 = this.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading", o2.a(), null).h(G0.e.O(webViewClient, webView, str), new M(1, lVar));
    }
}
