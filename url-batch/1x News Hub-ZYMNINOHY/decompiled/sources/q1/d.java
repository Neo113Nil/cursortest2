package q1;

import U1.C0080a;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import j1.h;
import j1.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.t0;
import l1.C1105b;
import org.json.JSONObject;
import u1.C1221a;

/* loaded from: classes.dex */
public final class d extends AbstractC1180a {

    /* renamed from: g, reason: collision with root package name */
    public WebView f10236g;

    /* renamed from: h, reason: collision with root package name */
    public Long f10237h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f10238i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10239j;

    public d(String str, Map map, String str2) {
        super(str);
        this.f10237h = null;
        this.f10238i = map;
        this.f10239j = str2;
    }

    @Override // q1.AbstractC1180a
    public final void b(i iVar, t0 t0Var) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((HashMap) t0Var.f9912d);
        for (String str : unmodifiableMap.keySet()) {
            h hVar = (h) unmodifiableMap.get(str);
            hVar.getClass();
            JSONObject jSONObject2 = new JSONObject();
            r1.b.b(jSONObject2, "vendorKey", hVar.f9537a);
            r1.b.b(jSONObject2, "resourceUrl", hVar.f9538b.toString());
            r1.b.b(jSONObject2, "verificationParameters", hVar.f9539c);
            r1.b.b(jSONObject, str, jSONObject2);
        }
        c(iVar, t0Var, jSONObject);
    }

    @Override // q1.AbstractC1180a
    public final void f() {
        super.f();
        new Handler().postDelayed(new B.b(this), Math.max(4000 - (this.f10237h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f10237h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f10236g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    @Override // q1.AbstractC1180a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        c cVar;
        WebView webView;
        n1.h hVar = n1.h.f10158b;
        Context context = hVar.f10159a;
        WebView webView2 = new WebView(context);
        this.f10236g = webView2;
        boolean z = true;
        webView2.getSettings().setJavaScriptEnabled(true);
        this.f10236g.getSettings().setAllowContentAccess(false);
        this.f10236g.getSettings().setAllowFileAccess(false);
        WebView webView3 = this.f10236g;
        if (C2.b.y("WEB_MESSAGE_LISTENER")) {
            try {
                if (((ArrayList) C1105b.b(hVar.f10159a).a()).size() <= 0) {
                    z = false;
                }
            } catch (Exception unused) {
            }
            if (z) {
                C0080a.b(webView3);
                cVar = new c(this, 1);
                this.f10236g.setWebViewClient(cVar);
                this.f10230b = new C1221a(this.f10236g);
                webView = this.f10236g;
                if (webView != null) {
                    String str = this.f10239j;
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                webView.evaluateJavascript(str, null);
                            } catch (IllegalStateException unused2) {
                                webView.loadUrl("javascript: " + str);
                            }
                        }
                    } catch (Exception e3) {
                        e3.getMessage();
                    }
                }
                Map map = this.f10238i;
                for (String str2 : map.keySet()) {
                    String externalForm = ((h) map.get(str2)).f9538b.toExternalForm();
                    WebView webView4 = this.f10236g;
                    if (externalForm != null && !TextUtils.isEmpty(str2)) {
                        String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                        if (webView4 != null && !TextUtils.isEmpty(replace)) {
                            try {
                                try {
                                    webView4.evaluateJavascript(replace, null);
                                } catch (IllegalStateException unused3) {
                                    webView4.loadUrl("javascript: " + replace);
                                }
                            } catch (Exception e4) {
                                e4.getMessage();
                            }
                        }
                    }
                }
                this.f10237h = Long.valueOf(System.nanoTime());
            }
        }
        if (((ArrayList) C1105b.b(context).a()).size() > 0) {
            cVar = new c(this, 0);
            this.f10236g.setWebViewClient(cVar);
            this.f10230b = new C1221a(this.f10236g);
            webView = this.f10236g;
            if (webView != null) {
            }
            Map map2 = this.f10238i;
            while (r3.hasNext()) {
            }
            this.f10237h = Long.valueOf(System.nanoTime());
        }
        cVar = new c(this, 1);
        this.f10236g.setWebViewClient(cVar);
        this.f10230b = new C1221a(this.f10236g);
        webView = this.f10236g;
        if (webView != null) {
        }
        Map map22 = this.f10238i;
        while (r3.hasNext()) {
        }
        this.f10237h = Long.valueOf(System.nanoTime());
    }
}
