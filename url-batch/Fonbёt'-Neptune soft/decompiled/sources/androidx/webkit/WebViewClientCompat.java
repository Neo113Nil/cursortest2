package androidx.webkit;

import B.m;
import D0.a0;
import D0.f0;
import P.O;
import V.b;
import V.d;
import V.h;
import V.l;
import a.AbstractC0132a;
import android.os.Build;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import i1.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public abstract class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f1892a = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    public static void a(O o2) {
        if (!AbstractC0132a.x("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            throw l.a();
        }
        b bVar = l.f1108c;
        if (bVar.a()) {
            if (((SafeBrowsingResponse) o2.f875f) == null) {
                m mVar = V.m.f1111a;
                o2.f875f = d.a(((WebkitToCompatConverterBoundaryInterface) mVar.f78f).convertSafeBrowsingResponse(Proxy.getInvocationHandler((SafeBrowsingResponseBoundaryInterface) o2.f876g)));
            }
            ((SafeBrowsingResponse) o2.f875f).showInterstitial(true);
            return;
        }
        if (!bVar.b()) {
            throw l.a();
        }
        if (((SafeBrowsingResponseBoundaryInterface) o2.f876g) == null) {
            m mVar2 = V.m.f1111a;
            o2.f876g = (SafeBrowsingResponseBoundaryInterface) a.a(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) mVar2.f78f).convertSafeBrowsingResponse((SafeBrowsingResponse) o2.f875f));
        }
        ((SafeBrowsingResponseBoundaryInterface) o2.f876g).showInterstitial(true);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f1892a;
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        h hVar = new h();
        hVar.f1103b = (WebResourceErrorBoundaryInterface) a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
        f0 f0Var = (f0) this;
        f0Var.f351b.f366a.c(new a0(f0Var, webView, webResourceRequest, hVar, 0));
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i2, InvocationHandler invocationHandler) {
        O o2 = new O(1, false);
        o2.f876g = (SafeBrowsingResponseBoundaryInterface) a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        a(o2);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i2, SafeBrowsingResponse safeBrowsingResponse) {
        O o2 = new O(1, false);
        o2.f875f = safeBrowsingResponse;
        a(o2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        h hVar = new h();
        hVar.f1102a = webResourceError;
        f0 f0Var = (f0) this;
        f0Var.f351b.f366a.c(new a0(f0Var, webView, webResourceRequest, hVar, 0));
    }
}
