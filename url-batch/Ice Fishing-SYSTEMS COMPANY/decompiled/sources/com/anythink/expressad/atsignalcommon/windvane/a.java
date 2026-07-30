package com.anythink.expressad.atsignalcommon.windvane;

import D.y;
import android.text.TextUtils;
import android.webkit.WebView;

/* loaded from: classes.dex */
public abstract class a implements com.anythink.core.express.d.b {
    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str, String str2) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            String k6 = TextUtils.isEmpty(str2) ? y.k("javascript:window.MvBridge.fireEvent('", str, "', '');") : y.l("javascript:window.MvBridge.fireEvent('", str, "','", com.anythink.core.express.d.d.c(str2), "');");
            WindVaneWebView windVaneWebView = bVar.f18220a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(k6);
                } catch (Exception e6) {
                    e6.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.anythink.core.express.d.b
    public final void b(Object obj, String str) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                String str2 = bVar.f18226g;
            } else {
                str = com.anythink.core.express.d.d.c(str);
            }
            String l9 = y.l("javascript:window.MvBridge.onFailure(", bVar.f18226g, ",'", str, "');");
            WindVaneWebView windVaneWebView = bVar.f18220a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(l9);
                } catch (Exception e6) {
                    e6.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private static void a(WebView webView, String str, String str2) {
        String l9;
        if (TextUtils.isEmpty(str2)) {
            l9 = y.k("javascript:window.MvBridge.fireEvent('", str, "', '');");
        } else {
            l9 = y.l("javascript:window.MvBridge.fireEvent('", str, "','", com.anythink.core.express.d.d.c(str2), "');");
        }
        if (webView != null) {
            try {
                webView.loadUrl(l9);
            } catch (Exception e6) {
                e6.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
