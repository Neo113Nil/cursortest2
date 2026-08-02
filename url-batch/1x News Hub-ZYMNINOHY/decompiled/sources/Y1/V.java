package Y1;

import E1.AbstractC0033i;
import a.AbstractC0129a;
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
import b2.C0192f;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class V extends S {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f1792h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C0113j f1793b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1794c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1795d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1796e = false;
    public boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1797g = false;

    public V(C0113j c0113j) {
        this.f1793b = c0113j;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage messageArg) {
        C0120q c0120q = new C0120q(1);
        C0113j c0113j = this.f1793b;
        c0113j.getClass();
        kotlin.jvm.internal.j.e(messageArg, "messageArg");
        A0.d dVar = c0113j.f1861a;
        dVar.getClass();
        if (((C0107d) dVar.f17b).d(this)) {
            new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", dVar.a(), (K0.j) null).h(c2.f.L(this, messageArg), new C0.f(19, c0120q));
        } else {
            AbstractC0033i.q("missing-instance-error", "Callback to `WebChromeClient.onConsoleMessage` failed because native instance was not in the instance manager.", "");
        }
        return this.f1795d;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        C0120q c0120q = new C0120q(1);
        C0113j c0113j = this.f1793b;
        c0113j.getClass();
        A0.d dVar = c0113j.f1861a;
        dVar.getClass();
        if (!((C0107d) dVar.f17b).d(this)) {
            AbstractC0033i.q("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsHidePrompt` failed because native instance was not in the instance manager.", "");
        } else {
            new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", dVar.a(), (K0.j) null).h(AbstractC0129a.r(this), new C0.f(21, c0120q));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String originArg, GeolocationPermissions.Callback callbackArg) {
        C0120q c0120q = new C0120q(1);
        C0113j c0113j = this.f1793b;
        c0113j.getClass();
        kotlin.jvm.internal.j.e(originArg, "originArg");
        kotlin.jvm.internal.j.e(callbackArg, "callbackArg");
        A0.d dVar = c0113j.f1861a;
        dVar.getClass();
        if (!((C0107d) dVar.f17b).d(this)) {
            AbstractC0033i.q("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsShowPrompt` failed because native instance was not in the instance manager.", "");
        } else {
            new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", dVar.a(), (K0.j) null).h(c2.f.L(this, originArg, callbackArg), new C0.f(20, c0120q));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C0120q c0120q = new C0120q(1);
        C0113j c0113j = this.f1793b;
        c0113j.getClass();
        A0.d dVar = c0113j.f1861a;
        dVar.getClass();
        if (!((C0107d) dVar.f17b).d(this)) {
            AbstractC0033i.q("missing-instance-error", "Callback to `WebChromeClient.onHideCustomView` failed because native instance was not in the instance manager.", "");
        } else {
            new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", dVar.a(), (K0.j) null).h(AbstractC0129a.r(this), new C0.f(15, c0120q));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webViewArg, String urlArg, String messageArg, JsResult jsResult) {
        if (!this.f1796e) {
            return false;
        }
        T t3 = new T(this, jsResult, 1);
        E2.o oVar = new E2.o(1, t3);
        C0113j c0113j = this.f1793b;
        c0113j.getClass();
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(urlArg, "urlArg");
        kotlin.jvm.internal.j.e(messageArg, "messageArg");
        A0.d dVar = c0113j.f1861a;
        dVar.getClass();
        if (((C0107d) dVar.f17b).d(this)) {
            new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", dVar.a(), (K0.j) null).h(c2.f.L(this, webViewArg, urlArg, messageArg), new I(oVar, 1));
            return true;
        }
        Throwable a3 = C0192f.a(android.support.v4.media.session.a.k(new C0104a("missing-instance-error", "Callback to `WebChromeClient.onJsAlert` failed because native instance was not in the instance manager.", "")));
        A0.d dVar2 = t3.f1787b.f1793b.f1861a;
        Objects.requireNonNull(a3);
        dVar2.getClass();
        A0.d.b(a3);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webViewArg, String urlArg, String messageArg, JsResult jsResult) {
        if (!this.f) {
            return false;
        }
        T t3 = new T(this, jsResult, 0);
        E2.o oVar = new E2.o(1, t3);
        C0113j c0113j = this.f1793b;
        c0113j.getClass();
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(urlArg, "urlArg");
        kotlin.jvm.internal.j.e(messageArg, "messageArg");
        A0.d dVar = c0113j.f1861a;
        dVar.getClass();
        if (((C0107d) dVar.f17b).d(this)) {
            new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", dVar.a(), (K0.j) null).h(c2.f.L(this, webViewArg, urlArg, messageArg), new I(oVar, 3));
            return true;
        }
        Throwable a3 = C0192f.a(android.support.v4.media.session.a.k(new C0104a("missing-instance-error", "Callback to `WebChromeClient.onJsConfirm` failed because native instance was not in the instance manager.", "")));
        A0.d dVar2 = t3.f1787b.f1793b.f1861a;
        Objects.requireNonNull(a3);
        dVar2.getClass();
        A0.d.b(a3);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webViewArg, String urlArg, String messageArg, String defaultValueArg, JsPromptResult jsPromptResult) {
        if (!this.f1797g) {
            return false;
        }
        T t3 = new T(this, jsPromptResult, 2);
        E2.o oVar = new E2.o(1, t3);
        C0113j c0113j = this.f1793b;
        c0113j.getClass();
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(urlArg, "urlArg");
        kotlin.jvm.internal.j.e(messageArg, "messageArg");
        kotlin.jvm.internal.j.e(defaultValueArg, "defaultValueArg");
        A0.d dVar = c0113j.f1861a;
        dVar.getClass();
        if (((C0107d) dVar.f17b).d(this)) {
            new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", dVar.a(), (K0.j) null).h(c2.f.L(this, webViewArg, urlArg, messageArg, defaultValueArg), new I(oVar, 0));
            return true;
        }
        Throwable a3 = C0192f.a(android.support.v4.media.session.a.k(new C0104a("missing-instance-error", "Callback to `WebChromeClient.onJsPrompt` failed because native instance was not in the instance manager.", "")));
        A0.d dVar2 = t3.f1787b.f1793b.f1861a;
        Objects.requireNonNull(a3);
        dVar2.getClass();
        A0.d.b(a3);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest requestArg) {
        C0120q c0120q = new C0120q(1);
        C0113j c0113j = this.f1793b;
        c0113j.getClass();
        kotlin.jvm.internal.j.e(requestArg, "requestArg");
        A0.d dVar = c0113j.f1861a;
        dVar.getClass();
        if (!((C0107d) dVar.f17b).d(this)) {
            AbstractC0033i.q("missing-instance-error", "Callback to `WebChromeClient.onPermissionRequest` failed because native instance was not in the instance manager.", "");
        } else {
            new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", dVar.a(), (K0.j) null).h(c2.f.L(this, requestArg), new C0.f(17, c0120q));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webViewArg, int i3) {
        long j3 = i3;
        C0120q c0120q = new C0120q(1);
        C0113j c0113j = this.f1793b;
        c0113j.getClass();
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        A0.d dVar = c0113j.f1861a;
        dVar.getClass();
        if (!((C0107d) dVar.f17b).d(this)) {
            AbstractC0033i.q("missing-instance-error", "Callback to `WebChromeClient.onProgressChanged` failed because native instance was not in the instance manager.", "");
        } else {
            new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", dVar.a(), (K0.j) null).h(c2.f.L(this, webViewArg, Long.valueOf(j3)), new C0.f(16, c0120q));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View viewArg, WebChromeClient.CustomViewCallback callbackArg) {
        C0120q c0120q = new C0120q(1);
        C0113j c0113j = this.f1793b;
        c0113j.getClass();
        kotlin.jvm.internal.j.e(viewArg, "viewArg");
        kotlin.jvm.internal.j.e(callbackArg, "callbackArg");
        A0.d dVar = c0113j.f1861a;
        dVar.getClass();
        if (!((C0107d) dVar.f17b).d(this)) {
            AbstractC0033i.q("missing-instance-error", "Callback to `WebChromeClient.onShowCustomView` failed because native instance was not in the instance manager.", "");
        } else {
            new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", dVar.a(), (K0.j) null).h(c2.f.L(this, viewArg, callbackArg), new C0.f(18, c0120q));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webViewArg, final ValueCallback valueCallback, WebChromeClient.FileChooserParams paramsArg) {
        final boolean z = this.f1794c;
        l2.l lVar = new l2.l() { // from class: Y1.U
            @Override // l2.l
            public final Object invoke(Object obj) {
                N n3 = (N) obj;
                V v = V.this;
                if (n3.f1772d) {
                    A0.d dVar = v.f1793b.f1861a;
                    Throwable th = n3.f1771c;
                    Objects.requireNonNull(th);
                    dVar.getClass();
                    A0.d.b(th);
                    return null;
                }
                List list = (List) n3.f1770b;
                Objects.requireNonNull(list);
                if (!z) {
                    return null;
                }
                Uri[] uriArr = new Uri[list.size()];
                for (int i3 = 0; i3 < list.size(); i3++) {
                    uriArr[i3] = Uri.parse((String) list.get(i3));
                }
                valueCallback.onReceiveValue(uriArr);
                return null;
            }
        };
        E2.o oVar = new E2.o(1, lVar);
        C0113j c0113j = this.f1793b;
        c0113j.getClass();
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(paramsArg, "paramsArg");
        A0.d dVar = c0113j.f1861a;
        dVar.getClass();
        if (!((C0107d) dVar.f17b).d(this)) {
            lVar.invoke(new N(android.support.v4.media.session.a.k(new C0104a("missing-instance-error", "Callback to `WebChromeClient.onShowFileChooser` failed because native instance was not in the instance manager.", ""))));
            return z;
        }
        new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", dVar.a(), (K0.j) null).h(c2.f.L(this, webViewArg, paramsArg), new I(oVar, 2));
        return z;
    }
}
