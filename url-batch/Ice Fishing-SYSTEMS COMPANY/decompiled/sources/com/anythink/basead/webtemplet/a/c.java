package com.anythink.basead.webtemplet.a;

import D.y;
import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.basead.webtemplet.WTWebView;
import com.anythink.basead.webtemplet.e;
import com.anythink.basead.webtemplet.h;
import com.anythink.core.common.d.t;
import o1.RunnableC4826a;
import o1.RunnableC4827b;

/* loaded from: classes.dex */
public class c implements a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f11600b;

    /* renamed from: a, reason: collision with root package name */
    private final String f11601a = "c";

    private c() {
    }

    public static c a() {
        if (f11600b == null) {
            synchronized (c.class) {
                try {
                    if (f11600b == null) {
                        f11600b = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11600b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Object obj, String str, String str2) {
        e eVar = (e) obj;
        WTWebView wTWebView = eVar.f11648a;
        if (wTWebView == null || wTWebView.isDestroyed()) {
            return;
        }
        try {
            eVar.f11648a.loadUrl(a(str, str2));
        } catch (Throwable th) {
            a(str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView, String str, String str2) {
        try {
            if ((webView instanceof WTWebView) && ((WTWebView) webView).isDestroyed()) {
                return;
            }
            webView.loadUrl(a(str, str2));
        } catch (Throwable th) {
            a(str, th);
        }
    }

    private static String a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return y.k("javascript:window.ATWebTPL.fireEvent('", str, "', '');");
        }
        return y.l("javascript:window.ATWebTPL.fireEvent('", str, "','", h.e(str2), "');");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(e eVar, String str) {
        WTWebView wTWebView = eVar.f11648a;
        if (wTWebView == null || wTWebView.isDestroyed()) {
            return;
        }
        try {
            eVar.f11648a.loadUrl(str);
        } catch (Throwable th) {
            a("callSuccess", th);
        }
    }

    @Override // com.anythink.basead.webtemplet.a.a
    public final void b(Object obj, String str) {
        String l9;
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (TextUtils.isEmpty(str)) {
                l9 = y.k("javascript:window.ATWebTPL.onFailure('", eVar.f11654g, "','');");
            } else {
                l9 = y.l("javascript:window.ATWebTPL.onFailure('", eVar.f11654g, "','", h.e(str), "');");
            }
            String str2 = eVar.f11654g;
            t.b().b(new RunnableC4826a(this, eVar, l9, 1));
        }
    }

    @Override // com.anythink.basead.webtemplet.a.a
    public final void a(Object obj, String str, String str2) {
        if (!(obj instanceof e) || TextUtils.isEmpty(str)) {
            return;
        }
        t.b().b(new RunnableC4827b(this, (e) obj, str, str2, 1));
    }

    public final void a(WebView webView, String str, String str2) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        t.b().b(new RunnableC4827b(this, webView, str, str2, 0));
    }

    @Override // com.anythink.basead.webtemplet.a.a
    public final void a(Object obj, String str) {
        String l9;
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (TextUtils.isEmpty(str)) {
                l9 = y.k("javascript:window.ATWebTPL.onSuccess('", eVar.f11654g, "','');");
            } else {
                l9 = y.l("javascript:window.ATWebTPL.onSuccess('", eVar.f11654g, "','", h.e(str), "');");
            }
            String str2 = eVar.f11654g;
            t.b().b(new RunnableC4826a(this, eVar, l9, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e eVar, String str) {
        WTWebView wTWebView = eVar.f11648a;
        if (wTWebView == null || wTWebView.isDestroyed()) {
            return;
        }
        try {
            eVar.f11648a.loadUrl(str);
        } catch (Throwable th) {
            a("callFailure", th);
        }
    }

    private static void a(String str, Throwable th) {
        th.getMessage();
    }
}
