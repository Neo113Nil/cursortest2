package io.flutter.plugins.urllauncher;

import E.AbstractC0012m;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {
    public static final String ACTION_CLOSE = "close action";
    static final String ENABLE_DOM_EXTRA = "enableDomStorage";
    static final String ENABLE_JS_EXTRA = "enableJavaScript";
    static final String URL_EXTRA = "url";
    WebView webview;
    private final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: io.flutter.plugins.urllauncher.WebViewActivity.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (WebViewActivity.ACTION_CLOSE.equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    };
    private final WebViewClient webViewClient = new WebViewClient() { // from class: io.flutter.plugins.urllauncher.WebViewActivity.2
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }
    };
    private final IntentFilter closeIntentFilter = new IntentFilter(ACTION_CLOSE);

    public class FlutterWebChromeClient extends WebChromeClient {
        public FlutterWebChromeClient() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z4, Message message) {
            WebViewClient webViewClient = new WebViewClient() { // from class: io.flutter.plugins.urllauncher.WebViewActivity.FlutterWebChromeClient.1
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                    WebViewActivity.this.webview.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }
            };
            WebView webView2 = new WebView(WebViewActivity.this.webview.getContext());
            webView2.setWebViewClient(webViewClient);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent createIntent(Context context, String str, boolean z, boolean z4, Bundle bundle) {
        return new Intent(context, (Class<?>) WebViewActivity.class).putExtra(URL_EXTRA, str).putExtra(ENABLE_JS_EXTRA, z).putExtra(ENABLE_DOM_EXTRA, z4).putExtra("com.android.browser.headers", bundle);
    }

    public static Map<String, String> extractHeaders(Bundle bundle) {
        if (bundle == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.webview = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(URL_EXTRA);
        boolean booleanExtra = intent.getBooleanExtra(ENABLE_JS_EXTRA, false);
        boolean booleanExtra2 = intent.getBooleanExtra(ENABLE_DOM_EXTRA, false);
        this.webview.loadUrl(stringExtra, extractHeaders(intent.getBundleExtra("com.android.browser.headers")));
        this.webview.getSettings().setJavaScriptEnabled(booleanExtra);
        this.webview.getSettings().setDomStorageEnabled(booleanExtra2);
        this.webview.setWebViewClient(this.webViewClient);
        this.webview.getSettings().setSupportMultipleWindows(true);
        this.webview.setWebChromeClient(new FlutterWebChromeClient());
        BroadcastReceiver broadcastReceiver = this.broadcastReceiver;
        IntentFilter intentFilter = this.closeIntentFilter;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            AbstractC0012m.g(this, broadcastReceiver, intentFilter);
        } else if (i4 >= 26) {
            AbstractC0012m.f(this, broadcastReceiver, intentFilter);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.broadcastReceiver);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 != 4 || !this.webview.canGoBack()) {
            return super.onKeyDown(i4, keyEvent);
        }
        this.webview.goBack();
        return true;
    }
}
