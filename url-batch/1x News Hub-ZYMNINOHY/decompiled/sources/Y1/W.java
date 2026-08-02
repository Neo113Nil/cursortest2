package Y1;

import E1.AbstractC0033i;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f1799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f1800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1801d;

    public /* synthetic */ W(b0 b0Var, WebView webView, String str, int i3) {
        this.f1798a = i3;
        this.f1799b = b0Var;
        this.f1800c = webView;
        this.f1801d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1798a) {
            case 0:
                C0120q c0120q = new C0120q(2);
                b0 b0Var = this.f1799b;
                C0117n c0117n = b0Var.f1824a;
                c0117n.getClass();
                WebView webViewArg = this.f1800c;
                kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
                String urlArg = this.f1801d;
                kotlin.jvm.internal.j.e(urlArg, "urlArg");
                A0.d dVar = c0117n.f1873a;
                dVar.getClass();
                if (!((C0107d) dVar.f17b).d(b0Var)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.onPageStarted` failed because native instance was not in the instance manager.", "");
                    break;
                } else {
                    new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", dVar.a(), (K0.j) null).h(c2.f.L(b0Var, webViewArg, urlArg), new C0.f(28, c0120q));
                    break;
                }
            case 1:
                C0120q c0120q2 = new C0120q(2);
                b0 b0Var2 = this.f1799b;
                C0117n c0117n2 = b0Var2.f1824a;
                c0117n2.getClass();
                WebView viewArg = this.f1800c;
                kotlin.jvm.internal.j.e(viewArg, "viewArg");
                String urlArg2 = this.f1801d;
                kotlin.jvm.internal.j.e(urlArg2, "urlArg");
                A0.d dVar2 = c0117n2.f1873a;
                dVar2.getClass();
                if (!((C0107d) dVar2.f17b).d(b0Var2)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.onLoadResource` failed because native instance was not in the instance manager.", "");
                    break;
                } else {
                    new B0.p((P1.f) dVar2.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", dVar2.a(), (K0.j) null).h(c2.f.L(b0Var2, viewArg, urlArg2), new C0.f(26, c0120q2));
                    break;
                }
            case 2:
                C0120q c0120q3 = new C0120q(2);
                b0 b0Var3 = this.f1799b;
                C0117n c0117n3 = b0Var3.f1824a;
                c0117n3.getClass();
                WebView webViewArg2 = this.f1800c;
                kotlin.jvm.internal.j.e(webViewArg2, "webViewArg");
                String urlArg3 = this.f1801d;
                kotlin.jvm.internal.j.e(urlArg3, "urlArg");
                A0.d dVar3 = c0117n3.f1873a;
                dVar3.getClass();
                if (!((C0107d) dVar3.f17b).d(b0Var3)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.onPageFinished` failed because native instance was not in the instance manager.", "");
                    break;
                } else {
                    new B0.p((P1.f) dVar3.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", dVar3.a(), (K0.j) null).h(c2.f.L(b0Var3, webViewArg2, urlArg3), new M(3, c0120q3));
                    break;
                }
            default:
                C0120q c0120q4 = new C0120q(2);
                b0 b0Var4 = this.f1799b;
                C0117n c0117n4 = b0Var4.f1824a;
                c0117n4.getClass();
                WebView viewArg2 = this.f1800c;
                kotlin.jvm.internal.j.e(viewArg2, "viewArg");
                String urlArg4 = this.f1801d;
                kotlin.jvm.internal.j.e(urlArg4, "urlArg");
                A0.d dVar4 = c0117n4.f1873a;
                dVar4.getClass();
                if (!((C0107d) dVar4.f17b).d(b0Var4)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.onPageCommitVisible` failed because native instance was not in the instance manager.", "");
                    break;
                } else {
                    new B0.p((P1.f) dVar4.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", dVar4.a(), (K0.j) null).h(c2.f.L(b0Var4, viewArg2, urlArg4), new M(1, c0120q4));
                    break;
                }
        }
    }
}
