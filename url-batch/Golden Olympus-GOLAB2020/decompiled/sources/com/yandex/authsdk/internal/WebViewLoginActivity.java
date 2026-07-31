package com.yandex.authsdk.internal;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.authsdk.YandexAuthOptions;
import java.util.UUID;
import k1.g;
import k1.h;
import k1.l;
import k1.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
public final class WebViewLoginActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private h f22307a;

    /* renamed from: b, reason: collision with root package name */
    private YandexAuthOptions f22308b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f22309c;

    private final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            h hVar = WebViewLoginActivity.this.f22307a;
            YandexAuthOptions yandexAuthOptions = null;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loginHandler");
                hVar = null;
            }
            YandexAuthOptions yandexAuthOptions2 = WebViewLoginActivity.this.f22308b;
            if (yandexAuthOptions2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
            } else {
                yandexAuthOptions = yandexAuthOptions2;
            }
            if (hVar.b(yandexAuthOptions, url)) {
                WebViewLoginActivity.this.e(url);
            } else {
                super.onPageStarted(view, url, bitmap);
            }
        }
    }

    static final class b extends s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f22311i = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            return uuid;
        }
    }

    private final void d() {
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String str) {
        h hVar = this.f22307a;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginHandler");
            hVar = null;
        }
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(url)");
        setResult(-1, hVar.c(parse));
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        YandexAuthOptions yandexAuthOptions = (YandexAuthOptions) g.e(intent, "com.yandex.authsdk.EXTRA_OPTIONS", YandexAuthOptions.class);
        if (yandexAuthOptions == null) {
            finish();
            return;
        }
        this.f22308b = yandexAuthOptions;
        this.f22307a = new h(new l(this), b.f22311i, new m());
        if (bundle == null) {
            d();
        }
        WebView webView = new WebView(this);
        webView.setWebViewClient(new a());
        webView.getSettings().setJavaScriptEnabled(true);
        h hVar = this.f22307a;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginHandler");
            hVar = null;
        }
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "intent");
        webView.loadUrl(hVar.a(intent2));
        this.f22309c = webView;
        setContentView(webView);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        WebView webView = this.f22309c;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView = null;
        }
        webView.destroy();
        super.onDestroy();
    }
}
