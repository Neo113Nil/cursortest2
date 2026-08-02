package A0;

import B0.p;
import C0.k;
import E1.AbstractC0033i;
import Y1.C0107d;
import Y1.C0117n;
import Y1.C0120q;
import Y1.M;
import Y1.b0;
import android.content.Context;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.j1;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.zc;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.impl.C0375b0;
import io.appmetrica.analytics.impl.C0815s1;
import io.appmetrica.analytics.impl.J0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import kotlin.jvm.internal.j;
import v0.h;
import v0.i;
import w0.g;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6d;

    public /* synthetic */ a(c cVar, i iVar, M m3, h hVar) {
        this.f3a = 0;
        this.f4b = cVar;
        this.f5c = iVar;
        this.f6d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3a) {
            case 0:
                i iVar = (i) this.f5c;
                String str = iVar.f10554a;
                h hVar = (h) this.f6d;
                c cVar = (c) this.f4b;
                cVar.getClass();
                Logger logger = c.f;
                try {
                    g a3 = cVar.f13c.a(str);
                    if (a3 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((k) cVar.f15e).f(new b(cVar, iVar, ((t0.c) a3).a(hVar), 0));
                    }
                    break;
                } catch (Exception e3) {
                    logger.warning("Error scheduling event " + e3.getMessage());
                    return;
                }
            case 1:
                C0120q c0120q = new C0120q(2);
                b0 b0Var = (b0) this.f4b;
                C0117n c0117n = b0Var.f1824a;
                c0117n.getClass();
                WebView viewArg = (WebView) this.f5c;
                j.e(viewArg, "viewArg");
                ClientCertRequest requestArg = (ClientCertRequest) this.f6d;
                j.e(requestArg, "requestArg");
                d dVar = c0117n.f1873a;
                dVar.getClass();
                if (!((C0107d) dVar.f17b).d(b0Var)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.onReceivedClientCertRequest` failed because native instance was not in the instance manager.", "");
                    break;
                } else {
                    new p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", dVar.a(), (K0.j) null).h(c2.f.L(b0Var, viewArg, requestArg), new C0.f(29, c0120q));
                    break;
                }
            case 2:
                C0120q c0120q2 = new C0120q(2);
                b0 b0Var2 = (b0) this.f4b;
                C0117n c0117n2 = b0Var2.f1824a;
                c0117n2.getClass();
                WebView webViewArg = (WebView) this.f5c;
                j.e(webViewArg, "webViewArg");
                WebResourceRequest requestArg2 = (WebResourceRequest) this.f6d;
                j.e(requestArg2, "requestArg");
                d dVar2 = c0117n2.f1873a;
                dVar2.getClass();
                if (!((C0107d) dVar2.f17b).d(b0Var2)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebViewClient.requestLoading` failed because native instance was not in the instance manager.", "");
                    break;
                } else {
                    new p((P1.f) dVar2.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", dVar2.a(), (K0.j) null).h(c2.f.L(b0Var2, webViewArg, requestArg2), new M(0, c0120q2));
                    break;
                }
            case 3:
                a0.a((Context) this.f4b, (AdEventListener) this.f5c, (Ad) this.f6d);
                break;
            case 4:
                e7.c((Context) this.f4b, (String) this.f5c, (Serializable) this.f6d);
                break;
            case 5:
                j1.a((Context) this.f4b, (BannerListener) this.f5c, (View) this.f6d);
                break;
            case 6:
                y6.b((y6) this.f4b, (List) this.f5c, (Map) this.f6d);
                break;
            case 7:
                ((zc) this.f4b).a((String) this.f5c, (String) this.f6d, null);
                break;
            case 8:
                J0.a((J0) this.f4b, (PluginErrorDetails) this.f5c, (String) this.f6d);
                break;
            case 9:
                C0375b0.a((C0375b0) this.f4b, (Context) this.f5c, (AppMetricaLibraryAdapterConfig) this.f6d);
                break;
            default:
                ((C0815s1) this.f4b).b((Context) this.f5c, (AppMetricaConfig) this.f6d);
                break;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i3) {
        this.f3a = i3;
        this.f4b = obj;
        this.f5c = obj2;
        this.f6d = obj3;
    }
}
