package f4;

import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.installreferrer.R;
import com.chicken.road.whale.plate.PlatePageActivity;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlatePageActivity f3340a;

    public o(PlatePageActivity platePageActivity) {
        this.f3340a = platePageActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        LinearLayout linearLayout;
        PlatePageActivity platePageActivity = this.f3340a;
        WebView webView2 = platePageActivity.B;
        if (webView2 == null) {
            r6.k.j("web");
            throw null;
        }
        String str2 = PlatePageActivity.P;
        webView2.evaluateJavascript("\n(function() {\n    if (window.__plateShimInstalled) return;\n    window.__plateShimInstalled = true;\n\n    document.addEventListener('click', function(e) {\n        var target = e.target;\n        while (target && target.tagName !== 'A') target = target.parentElement;\n        if (!target || !target.tagName || target.tagName !== 'A') return;\n\n        var href = target.href || '';\n        var download = target.download || target.getAttribute('download') || 'download';\n\n        if (href.startsWith('data:')) {\n            e.preventDefault();\n            e.stopPropagation();\n            var parts = href.split(',');\n            if (parts.length === 2) {\n                " + str2 + ".save(parts[0], parts[1], download);\n            }\n            return false;\n        }\n\n        if (href.startsWith('blob:')) {\n            e.preventDefault();\n            e.stopPropagation();\n            fetch(href)\n                .then(function(response) { return response.blob(); })\n                .then(function(blob) {\n                    var reader = new FileReader();\n                    reader.onloadend = function() {\n                        var parts = ('' + reader.result).split(',');\n                        if (parts.length === 2) {\n                            " + str2 + ".save(parts[0], parts[1], download);\n                        }\n                    };\n                    reader.readAsDataURL(blob);\n                })\n                .catch(function(err) { console.error('Blob fetch error:', err); });\n            return false;\n        }\n    }, true);\n\n    window.close = function() {\n        window.location = '" + PlatePageActivity.N + "://" + PlatePageActivity.O + "';\n    };\n})();\n", null);
        if (platePageActivity.F || (linearLayout = platePageActivity.G) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f3340a.F = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        NetworkCapabilities networkCapabilities;
        boolean hasCapability;
        r6.k.f(webView, "view");
        r6.k.f(webResourceRequest, "request");
        r6.k.f(webResourceError, "error");
        if (webResourceRequest.isForMainFrame()) {
            String uri = webResourceRequest.getUrl().toString();
            r6.k.e(uri, "toString(...)");
            boolean v5 = z6.o.v(uri, "http");
            PlatePageActivity platePageActivity = this.f3340a;
            if (!v5) {
                m mVar = PlatePageActivity.Companion;
                platePageActivity.k(uri);
                return;
            }
            platePageActivity.F = true;
            platePageActivity.E = uri;
            Object systemService = platePageActivity.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager == null) {
                hasCapability = true;
            } else {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                hasCapability = (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities.hasCapability(12);
            }
            LinearLayout linearLayout = platePageActivity.G;
            if (linearLayout == null) {
                linearLayout = new LinearLayout(platePageActivity);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                linearLayout.setBackgroundColor(-16777216);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                int j8 = platePageActivity.j(24);
                linearLayout.setPadding(j8, j8, j8, j8);
                TextView textView = new TextView(platePageActivity);
                textView.setTextColor(-1);
                textView.setTextSize(20.0f);
                textView.setGravity(17);
                TextView textView2 = new TextView(platePageActivity);
                textView2.setTextColor(-3355444);
                textView2.setTextSize(15.0f);
                textView2.setGravity(17);
                textView2.setPadding(0, platePageActivity.j(8), 0, platePageActivity.j(24));
                Button button = new Button(platePageActivity);
                button.setText(platePageActivity.getString(R.string.web_error_retry));
                button.setOnClickListener(new l(platePageActivity, 1));
                linearLayout.addView(textView);
                linearLayout.addView(textView2);
                linearLayout.addView(button);
                platePageActivity.H = textView;
                platePageActivity.I = textView2;
                platePageActivity.G = linearLayout;
                FrameLayout frameLayout = platePageActivity.A;
                if (frameLayout == null) {
                    r6.k.j("root");
                    throw null;
                }
                frameLayout.addView(linearLayout);
            }
            TextView textView3 = platePageActivity.H;
            if (textView3 != null) {
                textView3.setText(platePageActivity.getString(!hasCapability ? R.string.web_error_offline_title : R.string.web_error_generic_title));
            }
            TextView textView4 = platePageActivity.I;
            if (textView4 != null) {
                textView4.setText(platePageActivity.getString(!hasCapability ? R.string.web_error_offline_body : R.string.web_error_generic_body));
            }
            linearLayout.setVisibility(0);
            linearLayout.bringToFront();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        r6.k.f(webView, "view");
        r6.k.f(webResourceRequest, "request");
        Uri url = webResourceRequest.getUrl();
        r6.k.e(url, "getUrl(...)");
        m mVar = PlatePageActivity.Companion;
        boolean p6 = z6.o.p(true, url.getScheme(), PlatePageActivity.N);
        PlatePageActivity platePageActivity = this.f3340a;
        if (!p6) {
            String uri = url.toString();
            r6.k.e(uri, "toString(...)");
            if (z6.o.v(uri, "http://") || z6.o.v(uri, "https://") || z6.o.v(uri, "data:") || z6.o.v(uri, "blob:") || z6.o.v(uri, "about:")) {
                return false;
            }
            platePageActivity.k(uri);
            return true;
        }
        if (r6.k.a(url.getHost(), PlatePageActivity.O)) {
            WebView webView2 = platePageActivity.B;
            if (webView2 == null) {
                r6.k.j("web");
                throw null;
            }
            if (webView2.canGoBack()) {
                WebView webView3 = platePageActivity.B;
                if (webView3 != null) {
                    webView3.goBack();
                    return true;
                }
                r6.k.j("web");
                throw null;
            }
        }
        return true;
    }
}
