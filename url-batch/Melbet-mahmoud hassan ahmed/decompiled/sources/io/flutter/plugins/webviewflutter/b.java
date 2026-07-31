package io.flutter.plugins.webviewflutter;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import io.flutter.plugins.webviewflutter.k;
import java.util.Objects;

/* loaded from: classes.dex */
class b implements k.b {
    b() {
    }

    @Override // io.flutter.plugins.webviewflutter.k.b
    public void a(final k.n<Boolean> nVar) {
        CookieManager cookieManager = CookieManager.getInstance();
        if (Build.VERSION.SDK_INT >= 21) {
            Objects.requireNonNull(nVar);
            cookieManager.removeAllCookies(new ValueCallback() { // from class: io.flutter.plugins.webviewflutter.a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    k.n.this.a((Boolean) obj);
                }
            });
        } else {
            boolean hasCookies = cookieManager.hasCookies();
            if (hasCookies) {
                cookieManager.removeAllCookie();
            }
            nVar.a(Boolean.valueOf(hasCookies));
        }
    }

    @Override // io.flutter.plugins.webviewflutter.k.b
    public void b(String str, String str2) {
        CookieManager.getInstance().setCookie(str, str2);
    }
}
