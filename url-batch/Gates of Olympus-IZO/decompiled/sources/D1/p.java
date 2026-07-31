package D1;

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
import com.gates.olympus.miruv.R;
import com.gates.olympus.miruv.tenon.TenonPageActivity;
import h2.AbstractC0454p;

/* loaded from: classes.dex */
public final class p extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TenonPageActivity f566a;

    public p(TenonPageActivity tenonPageActivity) {
        this.f566a = tenonPageActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        LinearLayout linearLayout;
        TenonPageActivity tenonPageActivity = this.f566a;
        WebView webView2 = tenonPageActivity.f4433z;
        if (webView2 == null) {
            Z1.i.j("web");
            throw null;
        }
        webView2.evaluateJavascript("\n(function() {\n    if (window.__tenonShimInstalled) return;\n    window.__tenonShimInstalled = true;\n\n    document.addEventListener('click', function(e) {\n        var target = e.target;\n        while (target && target.tagName !== 'A') target = target.parentElement;\n        if (!target || !target.tagName || target.tagName !== 'A') return;\n\n        var href = target.href || '';\n        var download = target.download || target.getAttribute('download') || 'download';\n\n        if (href.startsWith('data:')) {\n            e.preventDefault();\n            e.stopPropagation();\n            var parts = href.split(',');\n            if (parts.length === 2) {\n                AndroidDownloader.save(parts[0], parts[1], download);\n            }\n            return false;\n        }\n\n        if (href.startsWith('blob:')) {\n            e.preventDefault();\n            e.stopPropagation();\n            fetch(href)\n                .then(function(response) { return response.blob(); })\n                .then(function(blob) {\n                    var reader = new FileReader();\n                    reader.onloadend = function() {\n                        var parts = ('' + reader.result).split(',');\n                        if (parts.length === 2) {\n                            AndroidDownloader.save(parts[0], parts[1], download);\n                        }\n                    };\n                    reader.readAsDataURL(blob);\n                })\n                .catch(function(err) { console.error('Blob fetch error:', err); });\n            return false;\n        }\n    }, true);\n\n    window.close = function() {\n        window.location = 'uniwebview://windowclose';\n    };\n})();\n", null);
        if (tenonPageActivity.D || (linearLayout = tenonPageActivity.f4424E) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f566a.D = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        NetworkCapabilities networkCapabilities;
        boolean hasCapability;
        Z1.i.f(webView, "view");
        Z1.i.f(webResourceRequest, "request");
        Z1.i.f(webResourceError, "error");
        if (webResourceRequest.isForMainFrame()) {
            String uri = webResourceRequest.getUrl().toString();
            Z1.i.e(uri, "toString(...)");
            boolean i02 = AbstractC0454p.i0(uri, "http");
            TenonPageActivity tenonPageActivity = this.f566a;
            if (!i02) {
                m mVar = TenonPageActivity.Companion;
                tenonPageActivity.k(uri);
                return;
            }
            tenonPageActivity.D = true;
            tenonPageActivity.C = uri;
            Object systemService = tenonPageActivity.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager == null) {
                hasCapability = true;
            } else {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                hasCapability = (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities.hasCapability(12);
            }
            LinearLayout linearLayout = tenonPageActivity.f4424E;
            if (linearLayout == null) {
                linearLayout = new LinearLayout(tenonPageActivity);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                linearLayout.setBackgroundColor(-16777216);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                int j3 = tenonPageActivity.j(24);
                linearLayout.setPadding(j3, j3, j3, j3);
                TextView textView = new TextView(tenonPageActivity);
                textView.setTextColor(-1);
                textView.setTextSize(20.0f);
                textView.setGravity(17);
                TextView textView2 = new TextView(tenonPageActivity);
                textView2.setTextColor(-3355444);
                textView2.setTextSize(15.0f);
                textView2.setGravity(17);
                textView2.setPadding(0, tenonPageActivity.j(8), 0, tenonPageActivity.j(24));
                Button button = new Button(tenonPageActivity);
                button.setText(tenonPageActivity.getString(R.string.web_error_retry));
                button.setOnClickListener(new k(tenonPageActivity, 1));
                linearLayout.addView(textView);
                linearLayout.addView(textView2);
                linearLayout.addView(button);
                tenonPageActivity.f4425F = textView;
                tenonPageActivity.f4426G = textView2;
                tenonPageActivity.f4424E = linearLayout;
                FrameLayout frameLayout = tenonPageActivity.f4432y;
                if (frameLayout == null) {
                    Z1.i.j("root");
                    throw null;
                }
                frameLayout.addView(linearLayout);
            }
            TextView textView3 = tenonPageActivity.f4425F;
            if (textView3 != null) {
                textView3.setText(tenonPageActivity.getString(!hasCapability ? R.string.web_error_offline_title : R.string.web_error_generic_title));
            }
            TextView textView4 = tenonPageActivity.f4426G;
            if (textView4 != null) {
                textView4.setText(tenonPageActivity.getString(!hasCapability ? R.string.web_error_offline_body : R.string.web_error_generic_body));
            }
            linearLayout.setVisibility(0);
            linearLayout.bringToFront();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Z1.i.f(webView, "view");
        Z1.i.f(webResourceRequest, "request");
        Uri url = webResourceRequest.getUrl();
        Z1.i.e(url, "getUrl(...)");
        m mVar = TenonPageActivity.Companion;
        TenonPageActivity tenonPageActivity = this.f566a;
        tenonPageActivity.getClass();
        if (!AbstractC0454p.d0(url.getScheme(), "uniwebview", true)) {
            String uri = url.toString();
            Z1.i.e(uri, "toString(...)");
            if (AbstractC0454p.i0(uri, "http://") || AbstractC0454p.i0(uri, "https://") || AbstractC0454p.i0(uri, "data:") || AbstractC0454p.i0(uri, "blob:") || AbstractC0454p.i0(uri, "about:")) {
                return false;
            }
            tenonPageActivity.k(uri);
            return true;
        }
        if (!Z1.i.a(url.getHost(), "windowclose")) {
            return true;
        }
        WebView webView2 = tenonPageActivity.f4433z;
        if (webView2 == null) {
            Z1.i.j("web");
            throw null;
        }
        if (!webView2.canGoBack()) {
            return true;
        }
        WebView webView3 = tenonPageActivity.f4433z;
        if (webView3 != null) {
            webView3.goBack();
            return true;
        }
        Z1.i.j("web");
        throw null;
    }
}
