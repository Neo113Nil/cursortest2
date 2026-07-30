package v0;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: v0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0962f {
    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(u0.n nVar) {
        WebMessagePort[] webMessagePortArr;
        nVar.a(0);
        String str = nVar.f8058b;
        u0.p[] pVarArr = nVar.f8057a;
        if (pVarArr == null) {
            webMessagePortArr = null;
        } else {
            int length = pVarArr.length;
            WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
            for (int i2 = 0; i2 < length; i2++) {
                webMessagePortArr2[i2] = ((B) pVarArr[i2]).c();
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return new WebMessage(str, webMessagePortArr);
    }

    public static WebMessagePort[] c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static u0.n d(WebMessage webMessage) {
        u0.p[] pVarArr;
        String data = webMessage.getData();
        WebMessagePort[] ports = webMessage.getPorts();
        if (ports == null) {
            pVarArr = null;
        } else {
            u0.p[] pVarArr2 = new u0.p[ports.length];
            for (int i2 = 0; i2 < ports.length; i2++) {
                pVarArr2[i2] = new B(ports[i2]);
            }
            pVarArr = pVarArr2;
        }
        return new u0.n(data, pVarArr);
    }

    public static CharSequence e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j, u0.w wVar) {
        webView.postVisualStateCallback(j, new C0961e());
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z7) {
        webSettings.setOffscreenPreRaster(z7);
    }

    public static void l(WebMessagePort webMessagePort, u0.o oVar) {
        webMessagePort.setWebMessageCallback(new C0960d(oVar, 0));
    }

    public static void m(WebMessagePort webMessagePort, u0.o oVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new C0960d(oVar, 1), handler);
    }
}
