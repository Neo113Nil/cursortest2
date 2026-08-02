package M2;

import F2.h;
import F2.i;
import a.AbstractC0124a;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k.q0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: g, reason: collision with root package name */
    public WebView f1757g;

    /* renamed from: h, reason: collision with root package name */
    public Long f1758h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f1759i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1760j;

    public d(String str, Map map, String str2) {
        super(str);
        this.f1758h = null;
        this.f1759i = map;
        this.f1760j = str2;
    }

    @Override // M2.a
    public final void b(i iVar, q0 q0Var) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((HashMap) q0Var.f14085d);
        for (String str : unmodifiableMap.keySet()) {
            h hVar = (h) unmodifiableMap.get(str);
            hVar.getClass();
            JSONObject jSONObject2 = new JSONObject();
            N2.b.b(jSONObject2, "vendorKey", hVar.f778a);
            N2.b.b(jSONObject2, "resourceUrl", hVar.f779b.toString());
            N2.b.b(jSONObject2, "verificationParameters", hVar.f780c);
            N2.b.b(jSONObject, str, jSONObject2);
        }
        c(iVar, q0Var, jSONObject);
    }

    @Override // M2.a
    public final void f() {
        super.f();
        new Handler().postDelayed(new B.b(this), Math.max(4000 - (this.f1758h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f1758h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f1757g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    @Override // M2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        c cVar;
        WebView webView;
        J2.h hVar = J2.h.f1183b;
        Context context = hVar.f1184a;
        WebView webView2 = new WebView(context);
        this.f1757g = webView2;
        boolean z = true;
        webView2.getSettings().setJavaScriptEnabled(true);
        this.f1757g.getSettings().setAllowContentAccess(false);
        this.f1757g.getSettings().setAllowFileAccess(false);
        WebView webView3 = this.f1757g;
        if (AbstractC0124a.G("WEB_MESSAGE_LISTENER")) {
            try {
                if (((ArrayList) H2.b.a(hVar.f1184a).b()).size() <= 0) {
                    z = false;
                }
            } catch (Exception unused) {
            }
            if (z) {
                a2.i.g(webView3);
                cVar = new c(this, 1);
                this.f1757g.setWebViewClient(cVar);
                this.f1750b = new Q2.a(this.f1757g);
                webView = this.f1757g;
                if (webView != null) {
                    String str = this.f1760j;
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                webView.evaluateJavascript(str, null);
                            } catch (IllegalStateException unused2) {
                                webView.loadUrl("javascript: " + str);
                            }
                        }
                    } catch (Exception e4) {
                        e4.getMessage();
                    }
                }
                Map map = this.f1759i;
                for (String str2 : map.keySet()) {
                    String externalForm = ((h) map.get(str2)).f779b.toExternalForm();
                    WebView webView4 = this.f1757g;
                    if (externalForm != null && !TextUtils.isEmpty(str2)) {
                        String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                        if (webView4 != null && !TextUtils.isEmpty(replace)) {
                            try {
                                try {
                                    webView4.evaluateJavascript(replace, null);
                                } catch (IllegalStateException unused3) {
                                    webView4.loadUrl("javascript: " + replace);
                                }
                            } catch (Exception e5) {
                                e5.getMessage();
                            }
                        }
                    }
                }
                this.f1758h = Long.valueOf(System.nanoTime());
            }
        }
        if (((ArrayList) H2.b.a(context).b()).size() > 0) {
            cVar = new c(this, 0);
            this.f1757g.setWebViewClient(cVar);
            this.f1750b = new Q2.a(this.f1757g);
            webView = this.f1757g;
            if (webView != null) {
            }
            Map map2 = this.f1759i;
            while (r3.hasNext()) {
            }
            this.f1758h = Long.valueOf(System.nanoTime());
        }
        cVar = new c(this, 1);
        this.f1757g.setWebViewClient(cVar);
        this.f1750b = new Q2.a(this.f1757g);
        webView = this.f1757g;
        if (webView != null) {
        }
        Map map22 = this.f1759i;
        while (r3.hasNext()) {
        }
        this.f1758h = Long.valueOf(System.nanoTime());
    }
}
