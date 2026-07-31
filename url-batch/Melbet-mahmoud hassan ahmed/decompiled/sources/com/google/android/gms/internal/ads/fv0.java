package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.gv0;
import com.google.android.gms.internal.ads.nv0;
import com.google.android.gms.internal.ads.pv0;

@TargetApi(17)
/* loaded from: classes.dex */
public final class fv0<WebViewT extends gv0 & nv0 & pv0> {

    /* renamed from: a, reason: collision with root package name */
    private final WebViewT f5247a;

    /* renamed from: b, reason: collision with root package name */
    private final dv0 f5248b;

    /* JADX WARN: Multi-variable type inference failed */
    public fv0(gv0 gv0Var, WebViewT webviewt, dv0 dv0Var) {
        this.f5248b = webviewt;
        this.f5247a = gv0Var;
    }

    final /* synthetic */ void a(String str) {
        dv0 dv0Var = this.f5248b;
        Uri parse = Uri.parse(str);
        lu0 h12 = ((yu0) dv0Var.f4343a).h1();
        if (h12 == null) {
            io0.d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            h12.n0(parse);
        }
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            gb I = this.f5247a.I();
            if (I == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                cb c7 = I.c();
                if (c7 == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else {
                    if (this.f5247a.getContext() != null) {
                        Context context = this.f5247a.getContext();
                        WebViewT webviewt = this.f5247a;
                        return c7.g(context, str, (View) webviewt, webviewt.j());
                    }
                    str2 = "Context is null, ignoring.";
                }
            }
        }
        a3.r1.k(str2);
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            io0.g("URL is empty, ignoring message");
        } else {
            a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ev0
                @Override // java.lang.Runnable
                public final void run() {
                    fv0.this.a(str);
                }
            });
        }
    }
}
