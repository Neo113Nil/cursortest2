package L1;

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
import com.gatesof.olympus.martu.marku.R;
import com.gatesof.olympus.martu.marku.salon.SalonPageActivity;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class n extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SalonPageActivity f3382a;

    public n(SalonPageActivity salonPageActivity) {
        this.f3382a = salonPageActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        LinearLayout linearLayout;
        SalonPageActivity salonPageActivity = this.f3382a;
        WebView webView2 = salonPageActivity.f5638z;
        if (webView2 == null) {
            f2.j.j("web");
            throw null;
        }
        webView2.evaluateJavascript("\n(function() {\n    if (window.__salonShimInstalled) return;\n    window.__salonShimInstalled = true;\n\n    document.addEventListener('click', function(e) {\n        var target = e.target;\n        while (target && target.tagName !== 'A') target = target.parentElement;\n        if (!target || !target.tagName || target.tagName !== 'A') return;\n\n        var href = target.href || '';\n        var download = target.download || target.getAttribute('download') || 'download';\n\n        if (href.startsWith('data:')) {\n            e.preventDefault();\n            e.stopPropagation();\n            var parts = href.split(',');\n            if (parts.length === 2) {\n                AndroidDownloader.save(parts[0], parts[1], download);\n            }\n            return false;\n        }\n\n        if (href.startsWith('blob:')) {\n            e.preventDefault();\n            e.stopPropagation();\n            fetch(href)\n                .then(function(response) { return response.blob(); })\n                .then(function(blob) {\n                    var reader = new FileReader();\n                    reader.onloadend = function() {\n                        var parts = ('' + reader.result).split(',');\n                        if (parts.length === 2) {\n                            AndroidDownloader.save(parts[0], parts[1], download);\n                        }\n                    };\n                    reader.readAsDataURL(blob);\n                })\n                .catch(function(err) { console.error('Blob fetch error:', err); });\n            return false;\n        }\n    }, true);\n\n    window.close = function() {\n        window.location = 'uniwebview://windowclose';\n    };\n})();\n", null);
        if (salonPageActivity.D || (linearLayout = salonPageActivity.f5629E) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f3382a.D = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        NetworkCapabilities networkCapabilities;
        boolean hasCapability;
        f2.j.f(webView, "view");
        f2.j.f(webResourceRequest, "request");
        f2.j.f(webResourceError, "error");
        if (webResourceRequest.isForMainFrame()) {
            String uri = webResourceRequest.getUrl().toString();
            f2.j.e(uri, "toString(...)");
            boolean z3 = AbstractC0737q.z(uri, "http");
            SalonPageActivity salonPageActivity = this.f3382a;
            if (!z3) {
                k kVar = SalonPageActivity.Companion;
                salonPageActivity.k(uri);
                return;
            }
            salonPageActivity.D = true;
            salonPageActivity.C = uri;
            Object systemService = salonPageActivity.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager == null) {
                hasCapability = true;
            } else {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                hasCapability = (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities.hasCapability(12);
            }
            LinearLayout linearLayout = salonPageActivity.f5629E;
            if (linearLayout == null) {
                linearLayout = new LinearLayout(salonPageActivity);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                linearLayout.setBackgroundColor(-16777216);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                int j3 = salonPageActivity.j(24);
                linearLayout.setPadding(j3, j3, j3, j3);
                TextView textView = new TextView(salonPageActivity);
                textView.setTextColor(-1);
                textView.setTextSize(20.0f);
                textView.setGravity(17);
                TextView textView2 = new TextView(salonPageActivity);
                textView2.setTextColor(-3355444);
                textView2.setTextSize(15.0f);
                textView2.setGravity(17);
                textView2.setPadding(0, salonPageActivity.j(8), 0, salonPageActivity.j(24));
                Button button = new Button(salonPageActivity);
                button.setText(salonPageActivity.getString(R.string.web_error_retry));
                button.setOnClickListener(new j(salonPageActivity, 1));
                linearLayout.addView(textView);
                linearLayout.addView(textView2);
                linearLayout.addView(button);
                salonPageActivity.f5630F = textView;
                salonPageActivity.f5631G = textView2;
                salonPageActivity.f5629E = linearLayout;
                FrameLayout frameLayout = salonPageActivity.f5637y;
                if (frameLayout == null) {
                    f2.j.j("root");
                    throw null;
                }
                frameLayout.addView(linearLayout);
            }
            TextView textView3 = salonPageActivity.f5630F;
            if (textView3 != null) {
                textView3.setText(salonPageActivity.getString(!hasCapability ? R.string.web_error_offline_title : R.string.web_error_generic_title));
            }
            TextView textView4 = salonPageActivity.f5631G;
            if (textView4 != null) {
                textView4.setText(salonPageActivity.getString(!hasCapability ? R.string.web_error_offline_body : R.string.web_error_generic_body));
            }
            linearLayout.setVisibility(0);
            linearLayout.bringToFront();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        f2.j.f(webView, "view");
        f2.j.f(webResourceRequest, "request");
        Uri url = webResourceRequest.getUrl();
        f2.j.e(url, "getUrl(...)");
        k kVar = SalonPageActivity.Companion;
        SalonPageActivity salonPageActivity = this.f3382a;
        salonPageActivity.getClass();
        if (!AbstractC0737q.s(url.getScheme(), "uniwebview", true)) {
            String uri = url.toString();
            f2.j.e(uri, "toString(...)");
            if (AbstractC0737q.z(uri, "http://") || AbstractC0737q.z(uri, "https://") || AbstractC0737q.z(uri, "data:") || AbstractC0737q.z(uri, "blob:") || AbstractC0737q.z(uri, "about:")) {
                return false;
            }
            salonPageActivity.k(uri);
            return true;
        }
        if (!f2.j.a(url.getHost(), "windowclose")) {
            return true;
        }
        WebView webView2 = salonPageActivity.f5638z;
        if (webView2 == null) {
            f2.j.j("web");
            throw null;
        }
        if (!webView2.canGoBack()) {
            return true;
        }
        WebView webView3 = salonPageActivity.f5638z;
        if (webView3 != null) {
            webView3.goBack();
            return true;
        }
        f2.j.j("web");
        throw null;
    }
}
