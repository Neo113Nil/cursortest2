package c4;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f2014a;

    private k1() {
    }

    @TargetApi(19)
    public static void a(WebView webView, String str) {
        if (Build.VERSION.SDK_INT >= 19 && b(webView)) {
            webView.evaluateJavascript(str, null);
        } else {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
        }
    }

    @TargetApi(19)
    private static boolean b(WebView webView) {
        boolean booleanValue;
        synchronized (k1.class) {
            if (f2014a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f2014a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    f2014a = Boolean.FALSE;
                }
            }
            booleanValue = f2014a.booleanValue();
        }
        return booleanValue;
    }
}
