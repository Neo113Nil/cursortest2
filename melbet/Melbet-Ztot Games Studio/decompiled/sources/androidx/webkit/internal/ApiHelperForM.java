package androidx.webkit.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.tracing.Trace$$ExternalSyntheticApiModelOutline0;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;

/* loaded from: classes.dex */
public class ApiHelperForM {
    private ApiHelperForM() {
    }

    public static void postMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void close(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static void setWebMessageCallback(WebMessagePort webMessagePort, final WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        webMessagePort.setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: androidx.webkit.internal.ApiHelperForM.1
            @Override // android.webkit.WebMessagePort.WebMessageCallback
            public void onMessage(WebMessagePort webMessagePort2, WebMessage webMessage) {
                WebMessagePortCompat.WebMessageCallbackCompat.this.onMessage(new WebMessagePortImpl(webMessagePort2), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
            }
        });
    }

    public static void setWebMessageCallback(WebMessagePort webMessagePort, final WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat, Handler handler) {
        webMessagePort.setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: androidx.webkit.internal.ApiHelperForM.2
            @Override // android.webkit.WebMessagePort.WebMessageCallback
            public void onMessage(WebMessagePort webMessagePort2, WebMessage webMessage) {
                WebMessagePortCompat.WebMessageCallbackCompat.this.onMessage(new WebMessagePortImpl(webMessagePort2), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
            }
        }, handler);
    }

    public static WebMessage createWebMessage(WebMessageCompat webMessageCompat) {
        Trace$$ExternalSyntheticApiModelOutline0.m238m();
        return Trace$$ExternalSyntheticApiModelOutline0.m(webMessageCompat.getData(), WebMessagePortImpl.compatToPorts(webMessageCompat.getPorts()));
    }

    public static WebMessageCompat createWebMessageCompat(WebMessage webMessage) {
        String data;
        WebMessagePort[] ports;
        data = webMessage.getData();
        ports = webMessage.getPorts();
        return new WebMessageCompat(data, WebMessagePortImpl.portsToCompat(ports));
    }

    public static int getErrorCode(WebResourceError webResourceError) {
        int errorCode;
        errorCode = webResourceError.getErrorCode();
        return errorCode;
    }

    public static CharSequence getDescription(WebResourceError webResourceError) {
        CharSequence description;
        description = webResourceError.getDescription();
        return description;
    }

    public static void setOffscreenPreRaster(WebSettings webSettings, boolean z) {
        webSettings.setOffscreenPreRaster(z);
    }

    public static boolean getOffscreenPreRaster(WebSettings webSettings) {
        boolean offscreenPreRaster;
        offscreenPreRaster = webSettings.getOffscreenPreRaster();
        return offscreenPreRaster;
    }

    public static void postVisualStateCallback(WebView webView, long j, final WebViewCompat.VisualStateCallback visualStateCallback) {
        webView.postVisualStateCallback(j, new WebView.VisualStateCallback() { // from class: androidx.webkit.internal.ApiHelperForM.3
            @Override // android.webkit.WebView.VisualStateCallback
            public void onComplete(long j2) {
                WebViewCompat.VisualStateCallback.this.onComplete(j2);
            }
        });
    }

    public static void postWebMessage(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static WebMessagePort[] createWebMessageChannel(WebView webView) {
        WebMessagePort[] createWebMessageChannel;
        createWebMessageChannel = webView.createWebMessageChannel();
        return createWebMessageChannel;
    }
}
