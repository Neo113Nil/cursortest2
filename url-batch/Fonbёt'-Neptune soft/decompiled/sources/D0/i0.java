package D0;

import A.C0002c;
import B0.C0023a;
import I.C0079n;
import a.AbstractC0132a;
import android.content.Context;
import android.os.Build;
import android.webkit.WebViewClient;
import j.C0239o;
import java.util.HashMap;
import java.util.List;
import m0.AbstractActivityC0264d;
import s0.InterfaceC0304a;
import t0.InterfaceC0308a;
import w0.InterfaceC0316b;
import w0.InterfaceC0320f;

/* loaded from: classes.dex */
public class i0 implements InterfaceC0304a, InterfaceC0308a {

    /* renamed from: e, reason: collision with root package name */
    public C0079n f364e;

    /* renamed from: f, reason: collision with root package name */
    public O f365f;

    @Override // t0.InterfaceC0308a
    public final void a(C0239o c0239o) {
        O o2 = this.f365f;
        if (o2 != null) {
            o2.f263e = (AbstractActivityC0264d) c0239o.f3015a;
        }
    }

    @Override // t0.InterfaceC0308a
    public final void b(C0239o c0239o) {
        this.f365f.f263e = (AbstractActivityC0264d) c0239o.f3015a;
    }

    @Override // t0.InterfaceC0308a
    public final void c() {
        this.f365f.f263e = (Context) this.f364e.f689e;
    }

    @Override // t0.InterfaceC0308a
    public final void d() {
        this.f365f.f263e = (Context) this.f364e.f689e;
    }

    @Override // s0.InterfaceC0304a
    public final void j(C0079n c0079n) {
        int i2 = 12;
        int i3 = 10;
        final int i4 = 0;
        int i5 = 14;
        final int i6 = 1;
        int i7 = 2;
        int i8 = 3;
        int i9 = 5;
        this.f364e = c0079n;
        InterfaceC0320f interfaceC0320f = (InterfaceC0320f) c0079n.f690f;
        Context context = (Context) c0079n.f689e;
        O o2 = new O(interfaceC0320f, context, new C0058s(context.getAssets(), (n0.d) c0079n.f692h));
        this.f365f = o2;
        C0060u c0060u = new C0060u((C0044d) o2.f261c);
        HashMap hashMap = (HashMap) ((io.flutter.plugin.platform.n) c0079n.f691g).f2653a;
        if (!hashMap.containsKey("plugins.flutter.io/webview")) {
            hashMap.put("plugins.flutter.io/webview", c0060u);
        }
        O o3 = this.f365f;
        o3.getClass();
        F0.f fVar = C0047g.f353b;
        C0044d c0044d = (C0044d) o3.f261c;
        InterfaceC0320f interfaceC0320f2 = (InterfaceC0320f) o3.f260b;
        AbstractC0132a.G(interfaceC0320f2, c0044d);
        AbstractC0132a.H(interfaceC0320f2, new C0050j(o3, 1));
        AbstractC0132a.L(interfaceC0320f2, new C0050j(o3, 14));
        i1.a.E(interfaceC0320f2, new C0050j(o3, 11));
        String str = "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor";
        Object obj = null;
        new C0079n(interfaceC0320f2, str, o3.a(), obj).i(new C0.f(i8, new C0050j(o3, 5)));
        final C0050j c0050j = new C0050j(o3, 13);
        w0.k a2 = o3.a();
        new C0079n(interfaceC0320f2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", a2, obj).i(new InterfaceC0316b() { // from class: D0.N
            @Override // w0.InterfaceC0316b
            public final void g(Object obj2, P.O o4) {
                List L2;
                List L3;
                switch (i4) {
                    case 0:
                        C0050j c0050j2 = c0050j;
                        Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj3 = ((List) obj2).get(0);
                        Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                        try {
                            ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), Build.VERSION.SDK_INT >= 24 ? new h0(c0050j2) : new f0(c0050j2));
                            L2 = i1.a.u(null);
                        } catch (Throwable th) {
                            L2 = i1.a.L(th);
                        }
                        o4.b(L2);
                        return;
                    default:
                        C0050j c0050j3 = c0050j;
                        Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj2;
                        Object obj4 = list.get(0);
                        Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebViewClient");
                        WebViewClient webViewClient = (WebViewClient) obj4;
                        Object obj5 = list.get(1);
                        Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((Boolean) obj5).booleanValue();
                        try {
                            if (webViewClient instanceof f0) {
                                ((f0) webViewClient).f352c = booleanValue;
                            } else {
                                c0050j3.f366a.getClass();
                                if (!(Build.VERSION.SDK_INT >= 24) || !(webViewClient instanceof h0)) {
                                    throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                                }
                                ((h0) webViewClient).f362b = booleanValue;
                            }
                            L3 = i1.a.u(null);
                        } catch (Throwable th2) {
                            L3 = i1.a.L(th2);
                        }
                        o4.b(L3);
                        return;
                }
            }
        });
        new C0079n(interfaceC0320f2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", a2, obj).i(new InterfaceC0316b() { // from class: D0.N
            @Override // w0.InterfaceC0316b
            public final void g(Object obj2, P.O o4) {
                List L2;
                List L3;
                switch (i6) {
                    case 0:
                        C0050j c0050j2 = c0050j;
                        Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj3 = ((List) obj2).get(0);
                        Q0.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                        try {
                            ((C0044d) c0050j2.f366a.f261c).a(((Long) obj3).longValue(), Build.VERSION.SDK_INT >= 24 ? new h0(c0050j2) : new f0(c0050j2));
                            L2 = i1.a.u(null);
                        } catch (Throwable th) {
                            L2 = i1.a.L(th);
                        }
                        o4.b(L2);
                        return;
                    default:
                        C0050j c0050j3 = c0050j;
                        Q0.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj2;
                        Object obj4 = list.get(0);
                        Q0.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebViewClient");
                        WebViewClient webViewClient = (WebViewClient) obj4;
                        Object obj5 = list.get(1);
                        Q0.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((Boolean) obj5).booleanValue();
                        try {
                            if (webViewClient instanceof f0) {
                                ((f0) webViewClient).f352c = booleanValue;
                            } else {
                                c0050j3.f366a.getClass();
                                if (!(Build.VERSION.SDK_INT >= 24) || !(webViewClient instanceof h0)) {
                                    throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                                }
                                ((h0) webViewClient).f362b = booleanValue;
                            }
                            L3 = i1.a.u(null);
                        } catch (Throwable th2) {
                            L3 = i1.a.L(th2);
                        }
                        o4.b(L3);
                        return;
                }
            }
        });
        String str2 = "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor";
        new C0079n(interfaceC0320f2, str2, o3.a(), obj).i(new C0.f(i7, new C0050j(o3, 2)));
        AbstractC0132a.K(interfaceC0320f2, new C0050j(o3, 10));
        i1.a.B(interfaceC0320f2, new C0050j(o3, 3));
        C0050j c0050j2 = new C0050j(o3, 12);
        w0.k a3 = o3.a();
        new C0079n(interfaceC0320f2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", a3, obj).i(new C0.f(i9, c0050j2));
        new C0079n(interfaceC0320f2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", a3, obj).i(new H(i5, c0050j2));
        C0023a c0023a = new C0023a(6);
        w0.k a4 = o3.a();
        new C0079n(interfaceC0320f2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", a4, obj).i(new C0002c(19, c0023a));
        new C0079n(interfaceC0320f2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", a4, obj).i(new C0002c(20, c0023a));
        String str3 = "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden";
        new C0079n(interfaceC0320f2, str3, o3.a(), obj).i(new C0002c(i3, new C0023a(3)));
        i1.a.D(interfaceC0320f2, new C0050j(o3, 9));
        String str4 = "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke";
        new C0079n(interfaceC0320f2, str4, o3.a(), obj).i(new C0002c(15, new C0023a(4)));
        AbstractC0132a.I(interfaceC0320f2, new C0050j(o3, 4));
        String str5 = "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget";
        new C0079n(interfaceC0320f2, str5, o3.a(), obj).i(new C0002c(i8, new C0023a(5)));
        i1.a.A(interfaceC0320f2, new C0050j(o3, 0));
        C0023a c0023a2 = new C0023a(7);
        w0.k a5 = o3.a();
        new C0079n(interfaceC0320f2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", a5, obj).i(new C0002c(27, c0023a2));
        new C0079n(interfaceC0320f2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", a5, obj).i(new C0002c(28, c0023a2));
        C0050j c0050j3 = new C0050j(o3, 8);
        w0.k a6 = o3.a();
        new C0079n(interfaceC0320f2, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", a6, obj).i(new C0002c(25, c0050j3));
        new C0079n(interfaceC0320f2, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", a6, obj).i(new C0.f(4, c0050j3));
        AbstractC0132a.J(interfaceC0320f2, new C0050j(o3, 6));
        i1.a.C(interfaceC0320f2, new C0050j(o3, 7));
        String str6 = "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded";
        new C0079n(interfaceC0320f2, str6, o3.a(), obj).i(new C0002c(i9, new C0023a(2)));
        String str7 = "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled";
        new C0079n(interfaceC0320f2, str7, o3.a(), obj).i(new H(i2, new C0023a(8)));
        String str8 = "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported";
        new C0079n(interfaceC0320f2, str8, o3.a(), obj).i(new H(20, new C0023a(9)));
    }

    @Override // s0.InterfaceC0304a
    public final void k(C0079n c0079n) {
        O o2 = this.f365f;
        if (o2 != null) {
            F0.f fVar = C0047g.f353b;
            InterfaceC0320f interfaceC0320f = (InterfaceC0320f) o2.f260b;
            Object obj = null;
            AbstractC0132a.G(interfaceC0320f, null);
            AbstractC0132a.H(interfaceC0320f, null);
            AbstractC0132a.L(interfaceC0320f, null);
            i1.a.E(interfaceC0320f, null);
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", new C0042b(), obj).i(null);
            C0042b c0042b = new C0042b();
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", c0042b, obj).i(null);
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", c0042b, obj).i(null);
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", new C0042b(), obj).i(null);
            AbstractC0132a.K(interfaceC0320f, null);
            i1.a.B(interfaceC0320f, null);
            C0042b c0042b2 = new C0042b();
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", c0042b2, obj).i(null);
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", c0042b2, obj).i(null);
            C0042b c0042b3 = new C0042b();
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", c0042b3, obj).i(null);
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", c0042b3, obj).i(null);
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", new C0042b(), obj).i(null);
            i1.a.D(interfaceC0320f, null);
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", new C0042b(), obj).i(null);
            AbstractC0132a.I(interfaceC0320f, null);
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", new C0042b(), obj).i(null);
            i1.a.A(interfaceC0320f, null);
            C0042b c0042b4 = new C0042b();
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", c0042b4, obj).i(null);
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", c0042b4, obj).i(null);
            C0042b c0042b5 = new C0042b();
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", c0042b5, obj).i(null);
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", c0042b5, obj).i(null);
            AbstractC0132a.J(interfaceC0320f, null);
            i1.a.C(interfaceC0320f, null);
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", new C0042b(), obj).i(null);
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", new C0042b(), obj).i(null);
            new C0079n(interfaceC0320f, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", new C0042b(), obj).i(null);
            C0044d c0044d = (C0044d) this.f365f.f261c;
            c0044d.f332g.removeCallbacks(c0044d.f333h);
            c0044d.f335j = true;
            this.f365f = null;
        }
    }
}
