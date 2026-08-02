package Y1;

import E1.AbstractC0033i;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import io.appmetrica.analytics.impl.D0;
import io.appmetrica.analytics.impl.J0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final /* synthetic */ class X implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1804c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1806e;

    public /* synthetic */ X(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f1802a = i3;
        this.f1803b = obj;
        this.f1804c = obj2;
        this.f1805d = obj3;
        this.f1806e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1802a) {
            case 0:
                C0120q c0120q = new C0120q(2);
                b0 b0Var = (b0) this.f1803b;
                C0117n c0117n = b0Var.f1824a;
                c0117n.getClass();
                WebView viewArg = (WebView) this.f1804c;
                kotlin.jvm.internal.j.e(viewArg, "viewArg");
                Message dontResendArg = (Message) this.f1805d;
                kotlin.jvm.internal.j.e(dontResendArg, "dontResendArg");
                Message resendArg = (Message) this.f1806e;
                kotlin.jvm.internal.j.e(resendArg, "resendArg");
                A0.d dVar = c0117n.f1873a;
                dVar.getClass();
                if (!((C0107d) dVar.f17b).d(b0Var)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.onFormResubmission` failed because native instance was not in the instance manager.", "");
                    break;
                } else {
                    new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", dVar.a(), (K0.j) null).h(c2.f.L(b0Var, viewArg, dontResendArg, resendArg), new M(5, c0120q));
                    break;
                }
            case 1:
                C0120q c0120q2 = new C0120q(2);
                b0 b0Var2 = (b0) this.f1803b;
                C0117n c0117n2 = b0Var2.f1824a;
                c0117n2.getClass();
                WebView viewArg2 = (WebView) this.f1804c;
                kotlin.jvm.internal.j.e(viewArg2, "viewArg");
                SslErrorHandler handlerArg = (SslErrorHandler) this.f1805d;
                kotlin.jvm.internal.j.e(handlerArg, "handlerArg");
                SslError errorArg = (SslError) this.f1806e;
                kotlin.jvm.internal.j.e(errorArg, "errorArg");
                A0.d dVar2 = c0117n2.f1873a;
                dVar2.getClass();
                if (!((C0107d) dVar2.f17b).d(b0Var2)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.onReceivedSslError` failed because native instance was not in the instance manager.", "");
                    break;
                } else {
                    new B0.p((P1.f) dVar2.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", dVar2.a(), (K0.j) null).h(c2.f.L(b0Var2, viewArg2, handlerArg, errorArg), new M(6, c0120q2));
                    break;
                }
            case 2:
                C0120q c0120q3 = new C0120q(2);
                b0 b0Var3 = (b0) this.f1803b;
                C0117n c0117n3 = b0Var3.f1824a;
                c0117n3.getClass();
                WebView webViewArg = (WebView) this.f1804c;
                kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
                WebResourceRequest requestArg = (WebResourceRequest) this.f1805d;
                kotlin.jvm.internal.j.e(requestArg, "requestArg");
                WebResourceError errorArg2 = (WebResourceError) this.f1806e;
                kotlin.jvm.internal.j.e(errorArg2, "errorArg");
                A0.d dVar3 = c0117n3.f1873a;
                dVar3.getClass();
                if (!((C0107d) dVar3.f17b).d(b0Var3)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.onReceivedRequestError` failed because native instance was not in the instance manager.", "");
                    break;
                } else {
                    new B0.p((P1.f) dVar3.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", dVar3.a(), (K0.j) null).h(c2.f.L(b0Var3, webViewArg, requestArg, errorArg2), new M(2, c0120q3));
                    break;
                }
            case 3:
                C0120q c0120q4 = new C0120q(2);
                b0 b0Var4 = (b0) this.f1803b;
                C0117n c0117n4 = b0Var4.f1824a;
                c0117n4.getClass();
                WebView webViewArg2 = (WebView) this.f1804c;
                kotlin.jvm.internal.j.e(webViewArg2, "webViewArg");
                WebResourceRequest requestArg2 = (WebResourceRequest) this.f1805d;
                kotlin.jvm.internal.j.e(requestArg2, "requestArg");
                WebResourceResponse responseArg = (WebResourceResponse) this.f1806e;
                kotlin.jvm.internal.j.e(responseArg, "responseArg");
                A0.d dVar4 = c0117n4.f1873a;
                dVar4.getClass();
                if (!((C0107d) dVar4.f17b).d(b0Var4)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpError` failed because native instance was not in the instance manager.", "");
                    break;
                } else {
                    new B0.p((P1.f) dVar4.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", dVar4.a(), (K0.j) null).h(c2.f.L(b0Var4, webViewArg2, requestArg2, responseArg), new C0.f(25, c0120q4));
                    break;
                }
            case 4:
                D0.a((D0) this.f1803b, (String) this.f1804c, (String) this.f1805d, (String) this.f1806e);
                break;
            default:
                J0.a((J0) this.f1803b, (String) this.f1804c, (String) this.f1805d, (PluginErrorDetails) this.f1806e);
                break;
        }
    }
}
