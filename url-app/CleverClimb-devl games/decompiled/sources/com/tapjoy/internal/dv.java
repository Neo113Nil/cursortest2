package com.tapjoy.internal;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class dv extends dt {
    WebView f;
    private List g;
    private final String h;

    public dv(List list, String str) {
        this.g = list;
        this.h = str;
    }

    @Override // com.tapjoy.internal.dt
    public final void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.tapjoy.internal.dv.1

            /* renamed from: b, reason: collision with root package name */
            private WebView f7963b;

            @Override // java.lang.Runnable
            public final void run() {
                this.f7963b.destroy();
            }

            {
                this.f7963b = dv.this.f;
            }
        }, 2000L);
        this.f = null;
    }

    @Override // com.tapjoy.internal.dt
    public final void a() {
        super.a();
        this.f = new WebView(df.a().f7937a);
        this.f.getSettings().setJavaScriptEnabled(true);
        a(this.f);
        dg.a();
        dg.a(this.f, this.h);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            String externalForm = ((cy) it.next()).f7913b.toExternalForm();
            dg.a();
            WebView webView = this.f;
            if (externalForm != null) {
                dg.a(webView, "var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);".replace("%SCRIPT_SRC%", externalForm));
            }
        }
    }
}
