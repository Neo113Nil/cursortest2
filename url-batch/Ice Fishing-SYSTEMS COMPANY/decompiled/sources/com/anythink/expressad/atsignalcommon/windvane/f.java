package com.anythink.expressad.atsignalcommon.windvane;

import D.y;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    private static f f18229a = new f();

    private f() {
    }

    public static f a() {
        return f18229a;
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str) {
        String l9;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                l9 = y.k("javascript:window.OW.onSuccess(", bVar.f18226g, ",'');");
            } else {
                l9 = y.l("javascript:window.OW.onSuccess(", bVar.f18226g, ",'", com.anythink.core.express.d.d.c(str), "');");
            }
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
}
