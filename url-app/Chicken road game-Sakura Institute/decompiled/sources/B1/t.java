package B1;

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
import com.chicken.road.kedro.laqer.R;
import com.chicken.road.kedro.laqer.village.VillagePageActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VillagePageActivity f1023a;

    public t(VillagePageActivity villagePageActivity) {
        this.f1023a = villagePageActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        LinearLayout linearLayout;
        VillagePageActivity villagePageActivity = this.f1023a;
        WebView webView2 = villagePageActivity.f6010C;
        if (webView2 == null) {
            Intrinsics.g("web");
            throw null;
        }
        webView2.evaluateJavascript("\n(function() {\n    if (window.__villageShimInstalled) return;\n    window.__villageShimInstalled = true;\n\n    document.addEventListener('click', function(e) {\n        var target = e.target;\n        while (target && target.tagName !== 'A') target = target.parentElement;\n        if (!target || !target.tagName || target.tagName !== 'A') return;\n\n        var href = target.href || '';\n        var download = target.download || target.getAttribute('download') || 'download';\n\n        if (href.startsWith('data:')) {\n            e.preventDefault();\n            e.stopPropagation();\n            var parts = href.split(',');\n            if (parts.length === 2) {\n                AndroidDownloader.save(parts[0], parts[1], download);\n            }\n            return false;\n        }\n\n        if (href.startsWith('blob:')) {\n            e.preventDefault();\n            e.stopPropagation();\n            fetch(href)\n                .then(function(response) { return response.blob(); })\n                .then(function(blob) {\n                    var reader = new FileReader();\n                    reader.onloadend = function() {\n                        var parts = ('' + reader.result).split(',');\n                        if (parts.length === 2) {\n                            AndroidDownloader.save(parts[0], parts[1], download);\n                        }\n                    };\n                    reader.readAsDataURL(blob);\n                })\n                .catch(function(err) { console.error('Blob fetch error:', err); });\n            return false;\n        }\n    }, true);\n\n    window.close = function() {\n        window.location = 'uniwebview://windowclose';\n    };\n})();\n", null);
        if (villagePageActivity.f6014G || (linearLayout = villagePageActivity.f6015H) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f1023a.f6014G = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        NetworkCapabilities networkCapabilities;
        boolean hasCapability;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        if (request.isForMainFrame()) {
            String uri = request.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            boolean n2 = kotlin.text.u.n(uri, "http");
            VillagePageActivity villagePageActivity = this.f1023a;
            if (!n2) {
                q qVar = VillagePageActivity.Companion;
                villagePageActivity.n(uri);
                return;
            }
            villagePageActivity.f6014G = true;
            villagePageActivity.f6013F = uri;
            Object systemService = villagePageActivity.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager == null) {
                hasCapability = true;
            } else {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                hasCapability = (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities.hasCapability(12);
            }
            LinearLayout linearLayout = villagePageActivity.f6015H;
            if (linearLayout == null) {
                linearLayout = new LinearLayout(villagePageActivity);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                linearLayout.setBackgroundColor(-16777216);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                int m4 = villagePageActivity.m(24);
                linearLayout.setPadding(m4, m4, m4, m4);
                TextView textView = new TextView(villagePageActivity);
                textView.setTextColor(-1);
                textView.setTextSize(20.0f);
                textView.setGravity(17);
                TextView textView2 = new TextView(villagePageActivity);
                textView2.setTextColor(-3355444);
                textView2.setTextSize(15.0f);
                textView2.setGravity(17);
                textView2.setPadding(0, villagePageActivity.m(8), 0, villagePageActivity.m(24));
                Button button = new Button(villagePageActivity);
                button.setText(villagePageActivity.getString(R.string.web_error_retry));
                button.setOnClickListener(new p(villagePageActivity, 1));
                linearLayout.addView(textView);
                linearLayout.addView(textView2);
                linearLayout.addView(button);
                villagePageActivity.f6016I = textView;
                villagePageActivity.f6017J = textView2;
                villagePageActivity.f6015H = linearLayout;
                FrameLayout frameLayout = villagePageActivity.B;
                if (frameLayout == null) {
                    Intrinsics.g("root");
                    throw null;
                }
                frameLayout.addView(linearLayout);
            }
            TextView textView3 = villagePageActivity.f6016I;
            if (textView3 != null) {
                textView3.setText(villagePageActivity.getString(!hasCapability ? R.string.web_error_offline_title : R.string.web_error_generic_title));
            }
            TextView textView4 = villagePageActivity.f6017J;
            if (textView4 != null) {
                textView4.setText(villagePageActivity.getString(!hasCapability ? R.string.web_error_offline_body : R.string.web_error_generic_body));
            }
            linearLayout.setVisibility(0);
            linearLayout.bringToFront();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        q qVar = VillagePageActivity.Companion;
        VillagePageActivity villagePageActivity = this.f1023a;
        villagePageActivity.getClass();
        if (!kotlin.text.u.i(true, url.getScheme(), "uniwebview")) {
            String uri = url.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            if (kotlin.text.u.n(uri, "http://") || kotlin.text.u.n(uri, "https://") || kotlin.text.u.n(uri, "data:") || kotlin.text.u.n(uri, "blob:") || kotlin.text.u.n(uri, "about:")) {
                return false;
            }
            villagePageActivity.n(uri);
            return true;
        }
        if (!Intrinsics.a(url.getHost(), "windowclose")) {
            return true;
        }
        WebView webView = villagePageActivity.f6010C;
        if (webView == null) {
            Intrinsics.g("web");
            throw null;
        }
        if (!webView.canGoBack()) {
            return true;
        }
        WebView webView2 = villagePageActivity.f6010C;
        if (webView2 != null) {
            webView2.goBack();
            return true;
        }
        Intrinsics.g("web");
        throw null;
    }
}
