package D0;

import I.C0079n;
import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;
import java.util.Objects;
import w0.InterfaceC0320f;

/* loaded from: classes.dex */
public final class X extends U {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f289h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C0050j f290b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f291c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f292d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f293e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f294f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f295g = false;

    public X(C0050j c0050j) {
        this.f290b = c0050j;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C0056p c0056p = new C0056p(1);
        C0050j c0050j = this.f290b;
        c0050j.getClass();
        Q0.h.e(consoleMessage, "messageArg");
        O o2 = c0050j.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", o2.a(), null).h(G0.e.O(this, consoleMessage), new H(4, c0056p));
        return this.f292d;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        C0056p c0056p = new C0056p(1);
        C0050j c0050j = this.f290b;
        c0050j.getClass();
        O o2 = c0050j.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", o2.a(), null).h(i1.a.u(this), new H(6, c0056p));
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        C0056p c0056p = new C0056p(1);
        C0050j c0050j = this.f290b;
        c0050j.getClass();
        Q0.h.e(str, "originArg");
        Q0.h.e(callback, "callbackArg");
        O o2 = c0050j.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", o2.a(), null).h(G0.e.O(this, str, callback), new H(5, c0056p));
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C0056p c0056p = new C0056p(1);
        C0050j c0050j = this.f290b;
        c0050j.getClass();
        O o2 = c0050j.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", o2.a(), null).h(i1.a.u(this), new H(0, c0056p));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!this.f293e) {
            return false;
        }
        P p2 = new P(0, new V(this, jsResult, 1));
        C0050j c0050j = this.f290b;
        c0050j.getClass();
        Q0.h.e(webView, "webViewArg");
        Q0.h.e(str, "urlArg");
        Q0.h.e(str2, "messageArg");
        O o2 = c0050j.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", o2.a(), null).h(G0.e.O(this, webView, str, str2), new I(p2, 1));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!this.f294f) {
            return false;
        }
        P p2 = new P(0, new V(this, jsResult, 0));
        C0050j c0050j = this.f290b;
        c0050j.getClass();
        Q0.h.e(webView, "webViewArg");
        Q0.h.e(str, "urlArg");
        Q0.h.e(str2, "messageArg");
        O o2 = c0050j.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", o2.a(), null).h(G0.e.O(this, webView, str, str2), new I(p2, 3));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (!this.f295g) {
            return false;
        }
        P p2 = new P(0, new V(this, jsPromptResult, 2));
        C0050j c0050j = this.f290b;
        c0050j.getClass();
        Q0.h.e(webView, "webViewArg");
        Q0.h.e(str, "urlArg");
        Q0.h.e(str2, "messageArg");
        Q0.h.e(str3, "defaultValueArg");
        O o2 = c0050j.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", o2.a(), null).h(G0.e.O(this, webView, str, str2, str3), new I(p2, 0));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        C0056p c0056p = new C0056p(1);
        C0050j c0050j = this.f290b;
        c0050j.getClass();
        Q0.h.e(permissionRequest, "requestArg");
        O o2 = c0050j.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", o2.a(), null).h(G0.e.O(this, permissionRequest), new H(2, c0056p));
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i2) {
        long j2 = i2;
        C0056p c0056p = new C0056p(1);
        C0050j c0050j = this.f290b;
        c0050j.getClass();
        Q0.h.e(webView, "webViewArg");
        O o2 = c0050j.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", o2.a(), null).h(G0.e.O(this, webView, Long.valueOf(j2)), new H(1, c0056p));
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        C0056p c0056p = new C0056p(1);
        C0050j c0050j = this.f290b;
        c0050j.getClass();
        Q0.h.e(view, "viewArg");
        Q0.h.e(customViewCallback, "callbackArg");
        O o2 = c0050j.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", o2.a(), null).h(G0.e.O(this, view, customViewCallback), new H(3, c0056p));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, final ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        final boolean z2 = this.f291c;
        P p2 = new P(0, new P0.l() { // from class: D0.W
            @Override // P0.l
            public final Object i(Object obj) {
                Q q2 = (Q) obj;
                X x2 = X.this;
                x2.getClass();
                if (q2.f270d) {
                    O o2 = x2.f290b.f366a;
                    Throwable th = q2.f269c;
                    Objects.requireNonNull(th);
                    o2.getClass();
                    O.b(th);
                    return null;
                }
                List list = (List) q2.f268b;
                Objects.requireNonNull(list);
                if (!z2) {
                    return null;
                }
                Uri[] uriArr = new Uri[list.size()];
                for (int i2 = 0; i2 < list.size(); i2++) {
                    uriArr[i2] = Uri.parse((String) list.get(i2));
                }
                valueCallback.onReceiveValue(uriArr);
                return null;
            }
        });
        C0050j c0050j = this.f290b;
        c0050j.getClass();
        Q0.h.e(webView, "webViewArg");
        Q0.h.e(fileChooserParams, "paramsArg");
        O o2 = c0050j.f366a;
        o2.getClass();
        new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", o2.a(), null).h(G0.e.O(this, webView, fileChooserParams), new I(p2, 2));
        return z2;
    }
}
