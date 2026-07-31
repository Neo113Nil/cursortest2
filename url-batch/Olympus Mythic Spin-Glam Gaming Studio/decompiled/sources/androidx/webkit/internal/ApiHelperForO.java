package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes5.dex */
public class ApiHelperForO {
    public static WebViewClient getWebViewClient(WebView webView) {
        WebViewClient webViewClient;
        webViewClient = webView.getWebViewClient();
        return webViewClient;
    }

    public static PackageInfo getCurrentWebViewPackage() {
        PackageInfo currentWebViewPackage;
        currentWebViewPackage = WebView.getCurrentWebViewPackage();
        return currentWebViewPackage;
    }
}
