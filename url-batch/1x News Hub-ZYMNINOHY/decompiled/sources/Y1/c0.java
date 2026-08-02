package Y1;

import E1.AbstractActivityC0029e;
import U1.C0080a;
import a.AbstractC0129a;
import android.content.Context;
import b2.C0193g;

/* loaded from: classes.dex */
public class c0 implements L1.b, M1.a {

    /* renamed from: a, reason: collision with root package name */
    public L1.a f1827a;

    /* renamed from: b, reason: collision with root package name */
    public A0.d f1828b;

    @Override // M1.a
    public final void onAttachedToActivity(M1.b bVar) {
        A0.d dVar = this.f1828b;
        if (dVar != null) {
            dVar.f19d = (AbstractActivityC0029e) ((F1.c) bVar).f486a;
        }
    }

    @Override // L1.b
    public final void onAttachedToEngine(L1.a aVar) {
        this.f1827a = aVar;
        P1.f fVar = aVar.f888b;
        Context context = aVar.f887a;
        A0.d dVar = new A0.d(fVar, context, new C0122t(context.getAssets(), aVar.f890d));
        this.f1828b = dVar;
        aVar.f889c.j("plugins.flutter.io/webview", new C0124v((C0107d) dVar.f17b));
        A0.d dVar2 = this.f1828b;
        dVar2.getClass();
        C0193g c0193g = C0109f.f1848b;
        C0107d c0107d = (C0107d) dVar2.f17b;
        P1.f fVar2 = (P1.f) dVar2.f16a;
        android.support.v4.media.session.a.O(fVar2, c0107d);
        AbstractC0129a.A(fVar2, new C0117n(dVar2, 0));
        AbstractC0129a.B(fVar2, new C0113j(dVar2, 7));
        S0.a.F(fVar2, new C0117n(dVar2, 5));
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", dVar2.a(), (K0.j) null).i(new B0.g(28, new C0117n(dVar2, 2)));
        C0117n c0117n = new C0117n(dVar2, 6);
        P1.k a3 = dVar2.a();
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", a3, (K0.j) null).i(new E(15, c0117n));
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", a3, (K0.j) null).i(new M(9, c0117n));
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", dVar2.a(), (K0.j) null).i(new B0.g(23, new C0113j(dVar2, 1)));
        C2.b.H(fVar2, new C0113j(dVar2, 5));
        android.support.v4.media.session.a.P(fVar2, new C0117n(dVar2, 1));
        C0113j c0113j = new C0113j(dVar2, 6);
        P1.k a4 = dVar2.a();
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", a4, (K0.j) null).i(new E(12, c0113j));
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", a4, (K0.j) null).i(new C0.f(23, c0113j));
        C0080a c0080a = new C0080a(17);
        P1.k a5 = dVar2.a();
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", a5, (K0.j) null).i(new C0.f(10, c0080a));
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", a5, (K0.j) null).i(new C0.f(11, c0080a));
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", dVar2.a(), (K0.j) null).i(new C0.f(6, new C0080a(11)));
        android.support.v4.media.session.a.Q(fVar2, new C0117n(dVar2, 4));
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", dVar2.a(), (K0.j) null).i(new C0.f(8, new C0080a(13)));
        C2.b.G(fVar2, new C0113j(dVar2, 2));
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", dVar2.a(), (K0.j) null).i(new C0.f(4, new C0080a(14)));
        S0.a.D(fVar2, new C0113j(dVar2, 0));
        C0080a c0080a2 = new C0080a(18);
        P1.k a6 = dVar2.a();
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", a6, (K0.j) null).i(new C0.f(13, c0080a2));
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", a6, (K0.j) null).i(new C0.f(14, c0080a2));
        C0113j c0113j2 = new C0113j(dVar2, 4);
        P1.k a7 = dVar2.a();
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", a7, (K0.j) null).i(new C0.f(12, c0113j2));
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", a7, (K0.j) null).i(new E(4, c0113j2));
        AbstractC0129a.z(fVar2, new C0113j(dVar2, 3));
        S0.a.E(fVar2, new C0117n(dVar2, 3));
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", dVar2.a(), (K0.j) null).i(new C0.f(5, new C0080a(9)));
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", dVar2.a(), (K0.j) null).i(new C0.f(22, new C0080a(20)));
        new B0.p(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", dVar2.a(), (K0.j) null).i(new M(10, new C0080a(21)));
    }

    @Override // M1.a
    public final void onDetachedFromActivity() {
        this.f1828b.f19d = this.f1827a.f887a;
    }

    @Override // M1.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f1828b.f19d = this.f1827a.f887a;
    }

    @Override // L1.b
    public final void onDetachedFromEngine(L1.a aVar) {
        A0.d dVar = this.f1828b;
        if (dVar != null) {
            C0193g c0193g = C0109f.f1848b;
            P1.f fVar = (P1.f) dVar.f16a;
            android.support.v4.media.session.a.O(fVar, null);
            AbstractC0129a.A(fVar, null);
            AbstractC0129a.B(fVar, null);
            S0.a.F(fVar, null);
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", (P1.k) new C0105b(), (K0.j) null).i(null);
            C0105b c0105b = new C0105b();
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", (P1.k) c0105b, (K0.j) null).i(null);
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", (P1.k) c0105b, (K0.j) null).i(null);
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", (P1.k) new C0105b(), (K0.j) null).i(null);
            C2.b.H(fVar, null);
            android.support.v4.media.session.a.P(fVar, null);
            C0105b c0105b2 = new C0105b();
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", (P1.k) c0105b2, (K0.j) null).i(null);
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", (P1.k) c0105b2, (K0.j) null).i(null);
            C0105b c0105b3 = new C0105b();
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", (P1.k) c0105b3, (K0.j) null).i(null);
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", (P1.k) c0105b3, (K0.j) null).i(null);
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", (P1.k) new C0105b(), (K0.j) null).i(null);
            android.support.v4.media.session.a.Q(fVar, null);
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", (P1.k) new C0105b(), (K0.j) null).i(null);
            C2.b.G(fVar, null);
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", (P1.k) new C0105b(), (K0.j) null).i(null);
            S0.a.D(fVar, null);
            C0105b c0105b4 = new C0105b();
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", (P1.k) c0105b4, (K0.j) null).i(null);
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", (P1.k) c0105b4, (K0.j) null).i(null);
            C0105b c0105b5 = new C0105b();
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", (P1.k) c0105b5, (K0.j) null).i(null);
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", (P1.k) c0105b5, (K0.j) null).i(null);
            AbstractC0129a.z(fVar, null);
            S0.a.E(fVar, null);
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", (P1.k) new C0105b(), (K0.j) null).i(null);
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", (P1.k) new C0105b(), (K0.j) null).i(null);
            new B0.p(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", (P1.k) new C0105b(), (K0.j) null).i(null);
            C0107d c0107d = (C0107d) this.f1828b.f17b;
            c0107d.f1834g.removeCallbacks(c0107d.f1835h);
            c0107d.f1837j = true;
            this.f1828b = null;
        }
    }

    @Override // M1.a
    public final void onReattachedToActivityForConfigChanges(M1.b bVar) {
        this.f1828b.f19d = (AbstractActivityC0029e) ((F1.c) bVar).f486a;
    }
}
