package Y1;

import E1.AbstractC0033i;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1807a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f1808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f1809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f1811e;
    public final /* synthetic */ Object f;

    public /* synthetic */ Y(b0 b0Var, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f1808b = b0Var;
        this.f1809c = webView;
        this.f = httpAuthHandler;
        this.f1810d = str;
        this.f1811e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1807a) {
            case 0:
                C0120q c0120q = new C0120q(2);
                b0 b0Var = this.f1808b;
                C0117n c0117n = b0Var.f1824a;
                c0117n.getClass();
                WebView viewArg = this.f1809c;
                kotlin.jvm.internal.j.e(viewArg, "viewArg");
                String realmArg = this.f1810d;
                kotlin.jvm.internal.j.e(realmArg, "realmArg");
                String argsArg = (String) this.f;
                kotlin.jvm.internal.j.e(argsArg, "argsArg");
                A0.d dVar = c0117n.f1873a;
                dVar.getClass();
                if (!((C0107d) dVar.f17b).d(b0Var)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.onReceivedLoginRequest` failed because native instance was not in the instance manager.", "");
                    break;
                } else {
                    new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", dVar.a(), (K0.j) null).h(c2.f.L(b0Var, viewArg, realmArg, this.f1811e, argsArg), new C0.f(27, c0120q));
                    break;
                }
            default:
                C0120q c0120q2 = new C0120q(2);
                b0 b0Var2 = this.f1808b;
                C0117n c0117n2 = b0Var2.f1824a;
                c0117n2.getClass();
                WebView webViewArg = this.f1809c;
                kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
                HttpAuthHandler handlerArg = (HttpAuthHandler) this.f;
                kotlin.jvm.internal.j.e(handlerArg, "handlerArg");
                String hostArg = this.f1810d;
                kotlin.jvm.internal.j.e(hostArg, "hostArg");
                String realmArg2 = this.f1811e;
                kotlin.jvm.internal.j.e(realmArg2, "realmArg");
                A0.d dVar2 = c0117n2.f1873a;
                dVar2.getClass();
                if (!((C0107d) dVar2.f17b).d(b0Var2)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpAuthRequest` failed because native instance was not in the instance manager.", "");
                    break;
                } else {
                    new B0.p((P1.f) dVar2.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", dVar2.a(), (K0.j) null).h(c2.f.L(b0Var2, webViewArg, handlerArg, hostArg, realmArg2), new M(4, c0120q2));
                    break;
                }
        }
    }

    public /* synthetic */ Y(b0 b0Var, WebView webView, String str, String str2, String str3) {
        this.f1808b = b0Var;
        this.f1809c = webView;
        this.f1810d = str;
        this.f1811e = str2;
        this.f = str3;
    }
}
