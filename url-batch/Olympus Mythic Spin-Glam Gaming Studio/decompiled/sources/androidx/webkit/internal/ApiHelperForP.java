package androidx.webkit.internal;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes5.dex */
public class ApiHelperForP {
    public static TracingController getTracingControllerInstance() {
        TracingController tracingController;
        tracingController = TracingController.getInstance();
        return tracingController;
    }

    public static ClassLoader getWebViewClassLoader() {
        ClassLoader webViewClassLoader;
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }

    public static Looper getWebViewLooper(WebView webView) {
        Looper webViewLooper;
        webViewLooper = webView.getWebViewLooper();
        return webViewLooper;
    }
}
