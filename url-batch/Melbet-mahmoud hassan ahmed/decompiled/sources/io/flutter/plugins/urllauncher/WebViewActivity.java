package io.flutter.plugins.urllauncher;

import android.annotation.TargetApi;
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

    /* renamed from: j, reason: collision with root package name */
    public static String f17606j = "close action";

    /* renamed from: k, reason: collision with root package name */
    private static String f17607k = "url";

    /* renamed from: l, reason: collision with root package name */
    private static String f17608l = "enableJavaScript";

    /* renamed from: m, reason: collision with root package name */
    private static String f17609m = "enableDomStorage";

    /* renamed from: h, reason: collision with root package name */
    private WebView f17612h;

    /* renamed from: f, reason: collision with root package name */
    private final BroadcastReceiver f17610f = new a();

    /* renamed from: g, reason: collision with root package name */
    private final WebViewClient f17611g = new b();

    /* renamed from: i, reason: collision with root package name */
    private IntentFilter f17613i = new IntentFilter(f17606j);

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (WebViewActivity.f17606j.equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT < 21) {
                return false;
            }
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (Build.VERSION.SDK_INT >= 21) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.loadUrl(str);
            return false;
        }
    }

    private class c extends WebChromeClient {

        class a extends WebViewClient {
            a() {
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(21)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f17612h.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f17612h.loadUrl(str);
                return true;
            }
        }

        private c() {
        }

        /* synthetic */ c(WebViewActivity webViewActivity, a aVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z6, boolean z7, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f17612h.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent b(Context context, String str, boolean z6, boolean z7, Bundle bundle) {
        return new Intent(context, (Class<?>) WebViewActivity.class).putExtra(f17607k, str).putExtra(f17608l, z6).putExtra(f17609m, z7).putExtra("com.android.browser.headers", bundle);
    }

    public static Map<String, String> c(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
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
        this.f17612h = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(f17607k);
        boolean booleanExtra = intent.getBooleanExtra(f17608l, false);
        boolean booleanExtra2 = intent.getBooleanExtra(f17609m, false);
        this.f17612h.loadUrl(stringExtra, c(intent.getBundleExtra("com.android.browser.headers")));
        this.f17612h.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f17612h.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f17612h.setWebViewClient(this.f17611g);
        this.f17612h.getSettings().setSupportMultipleWindows(true);
        this.f17612h.setWebChromeClient(new c(this, null));
        registerReceiver(this.f17610f, this.f17613i);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f17610f);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 != 4 || !this.f17612h.canGoBack()) {
            return super.onKeyDown(i7, keyEvent);
        }
        this.f17612h.goBack();
        return true;
    }
}
