package com.applovin.sdk;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.e8;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";
    private final AtomicBoolean a = new AtomicBoolean();
    private String b;
    private WebView c;
    private EventListener d;

    public interface EventListener {
        void onReceivedEvent(String str);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.a, me);
        return super.dispatchTouchEvent(me);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.d = eventListener;
        this.b = str;
        this.a.set(false);
        WebView webView = this.c;
        if (webView != null) {
            AppLovinNetworkBridge.webviewLoadUrl(webView, str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (TextUtils.isEmpty(getIntent().getStringExtra("sdk_key"))) {
            o.h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        k a2 = AppLovinSdk.getInstance(getApplicationContext()).a();
        e8.a(findViewById(android.R.id.content), a2);
        a(a2);
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        if (StringUtils.isValidString(stringExtra)) {
            this.b = stringExtra;
        }
        if (StringUtils.isValidString(this.b)) {
            this.c.loadUrl(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k kVar) {
        WebView b = n7.b(this, "WebView Activity");
        this.c = b;
        if (b == null) {
            finish();
            return;
        }
        setContentView(b);
        WebSettings settings = this.c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.c.setVerticalScrollBarEnabled(true);
        this.c.setHorizontalScrollBarEnabled(true);
        this.c.setScrollBarStyle(33554432);
        this.c.setWebViewClient(new a(kVar));
    }

    class a extends t4 {
        final /* synthetic */ k a;

        a(k kVar) {
            this.a = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(k kVar) {
            if (!((Boolean) kVar.a(x4.S5)).booleanValue() || !AppLovinWebViewActivity.this.a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.finish();
                return;
            }
            AppLovinWebViewActivity.this.a(kVar);
            if (StringUtils.isValidString(AppLovinWebViewActivity.this.b)) {
                AppLovinNetworkBridge.webviewLoadUrl(AppLovinWebViewActivity.this.c, AppLovinWebViewActivity.this.b);
            }
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(h.a, view, url);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(h.a, view, url);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError(h.a, view, errorCode, description, failingUrl);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.c == webView) {
                AppLovinWebViewActivity.this.c.destroy();
                AppLovinWebViewActivity.this.c = null;
                AppLovinWebViewActivity appLovinWebViewActivity = AppLovinWebViewActivity.this;
                final k kVar = this.a;
                appLovinWebViewActivity.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.AppLovinWebViewActivity$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLovinWebViewActivity.a.this.a(kVar);
                    }
                });
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        public boolean safedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05(WebView p0, String p1) {
            Uri parse = Uri.parse(p1);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            this.a.O();
            if (o.a()) {
                this.a.O().a("AppLovinWebViewActivity", "Handling url load: " + p1);
            }
            if (!"applovin".equalsIgnoreCase(scheme) || !"com.applovin.sdk".equalsIgnoreCase(host) || AppLovinWebViewActivity.this.d == null) {
                return super.shouldOverrideUrlLoading(p0, p1);
            }
            if (!path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                return true;
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            String str = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
            if (!StringUtils.isValidString(str)) {
                this.a.O();
                if (!o.a()) {
                    return true;
                }
                this.a.O().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                return true;
            }
            String p12 = parse.getQueryParameter(str);
            this.a.O();
            if (o.a()) {
                this.a.O().a("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str + " and value: " + p12);
            }
            AppLovinWebViewActivity.this.d.onReceivedEvent(p12);
            return true;
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(h.a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/sdk/AppLovinWebViewActivity$a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05 = safedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(h.a, webView, str, safedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05);
            return safedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05;
        }

        @Override // com.applovin.impl.t4
        protected Map a() {
            return CollectionUtils.hashMap("name", "AppLovinWebViewActivity");
        }
    }
}
