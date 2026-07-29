package com.youappi.sdk.ui.views;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.a.a.a.b;
import com.a.a.a.c;
import com.a.a.a.d;
import com.a.a.a.e;
import com.a.a.a.f;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.gson.j;
import com.youappi.sdk.AdType;
import com.youappi.sdk.BaseAd;
import com.youappi.sdk.ads.YAInterstitialAd;
import com.youappi.sdk.logic.IAdEventListener;
import com.youappi.sdk.logic.IAssetResolver;
import com.youappi.sdk.net.model.VastError;
import com.youappi.sdk.net.model.VideoEvent;
import com.youappi.sdk.ui.model.AdViewModel;
import com.youappi.sdk.ui.model.CardViewModel;
import com.youappi.sdk.ui.model.CardWebViewConfig;
import com.youappi.sdk.utils.g;
import com.youappi.sdk.utils.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* loaded from: classes2.dex */
public class CardAdView extends RelativeLayout implements IAdView<CardViewModel, YAInterstitialAd.InterstitialAdListener> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9482a = "CardAdView";

    /* renamed from: b, reason: collision with root package name */
    private WebView f9483b;

    /* renamed from: c, reason: collision with root package name */
    private YAInterstitialAd.InterstitialAdListener f9484c;

    /* renamed from: d, reason: collision with root package name */
    private AdViewModel f9485d;
    private IAdEventListener e;
    private BaseAd.AdStateListener f;
    private Uri g;
    private String h;
    private IAssetResolver i;
    private boolean j;
    private boolean k;
    private TextView l;
    private ImageView m;

    final class a extends WebViewClient {
        a() {
        }

        private void a(VastError vastError, String str) {
            if (CardAdView.this.e != null) {
                CardAdView.this.e.onGotEvent("error", vastError, str, g.c(CardAdView.this.getContext()), 0, CardAdView.this.f9485d.getAdItem());
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            super.onPageCommitVisible(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (!CardAdView.this.f9485d.getAdItem().getCardConfig().isInjectJs()) {
                CardAdView.this.a(VideoEvent.EVENT_IMPRESSION);
            }
            if (CardAdView.this.f9483b != null && CardAdView.this.k) {
                CardAdView.this.b();
            }
            Uri parse = Uri.parse(str);
            if (parse != null) {
                if (TextUtils.equals(parse.getHost(), CardAdView.this.g.getHost() == null ? "" : CardAdView.this.g.getHost()) && TextUtils.equals(parse.getEncodedQuery(), CardAdView.this.g.getEncodedQuery()) && TextUtils.equals(parse.getPath(), CardAdView.this.g.getPath()) && TextUtils.equals(parse.getFragment(), null)) {
                    CardAdView.this.j = true;
                }
            }
            if (parse != null) {
                if (TextUtils.equals(parse.getHost(), CardAdView.this.g.getHost() == null ? "" : CardAdView.this.g.getHost()) && TextUtils.equals(parse.getEncodedQuery(), CardAdView.this.g.getEncodedQuery()) && TextUtils.equals(parse.getPath(), CardAdView.this.g.getPath()) && TextUtils.equals(parse.getFragment(), "close")) {
                    if (CardAdView.this.f9484c != null) {
                        CardAdView.this.f9484c.onCardClose(null);
                    }
                    if (CardAdView.this.f != null) {
                        CardAdView.this.g();
                    }
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            int i2 = (str == null || !(str.contains("ERR_INTERNET_DISCONNECTED") || str.contains("ERR_ADDRESS_UNREACHABLE"))) ? 2 : 1;
            a(VastError.VAST_FAILED_SHOWING_CARD, "On received errorCode: " + i2 + " url: " + str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (Build.VERSION.SDK_INT >= 23) {
                onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (Build.VERSION.SDK_INT < 21 || webResourceRequest == null || !CardAdView.this.c(webResourceRequest.getUrl().toString())) {
                return;
            }
            a(VastError.VAST_FAILED_SHOWING_CARD, "url: " + webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (sslError == null || !CardAdView.this.c(sslError.getUrl())) {
                return;
            }
            a(VastError.VAST_FAILED_SHOWING_CARD, "url: " + sslError.getUrl());
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(11)
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            Uri assetUri;
            FileInputStream fileInputStream;
            WebResourceResponse webResourceResponse = null;
            if (CardAdView.this.i != null && (assetUri = CardAdView.this.i.getAssetUri(str)) != null) {
                File file = new File(assetUri.getPath());
                if (file.exists()) {
                    try {
                        fileInputStream = new FileInputStream(file);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                        fileInputStream = null;
                    }
                    String b2 = CardAdView.this.b(str);
                    Log.w(CardAdView.f9482a, "shouldInterceptRequest : Loading local asset : mimeType = " + b2);
                    webResourceResponse = new WebResourceResponse(b2, "UTF-8", fileInputStream);
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            Log.w(CardAdView.f9482a, "shouldInterceptRequest : Loading Remote asset - " + str);
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!CardAdView.this.f9485d.getAdItem().getCardConfig().isInjectJs()) {
                CardAdView.this.a("click");
            }
            Uri parse = Uri.parse(str);
            if (parse == null || ((parse.getScheme() == null || !parse.getScheme().equals("market")) && (parse.getHost() == null || parse.getHost().equals(CardAdView.this.g.getHost())))) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            if (CardAdView.this.f9485d.getAdItem().getPromotedItem() != null && CardAdView.this.f9485d.getAdItem().getPromotedItem().getRedirectUrl() != null) {
                c.a().a(e.a(String.class).b("GET").c(CardAdView.this.f9485d.getAdItem().getPromotedItem().getRedirectUrl()).a(true).b(true).a((b) new b<String>() { // from class: com.youappi.sdk.ui.views.CardAdView.a.1
                    @Override // com.a.a.a.b
                    public boolean onNetError(d dVar) {
                        return false;
                    }

                    @Override // com.a.a.a.b
                    public boolean onNetFinished(f<String> fVar) {
                        return false;
                    }
                }).a());
            }
            if (CardAdView.this.f9484c != null) {
                CardAdView.this.f9484c.onAdClick(null);
                CardAdView.this.f9484c.onAdLeftApplication(null);
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            CardAdView.this.getContext().startActivity(intent);
            return true;
        }
    }

    public CardAdView(Context context) {
        super(context);
        this.j = false;
        this.k = false;
        d();
    }

    private int a(float f) {
        return (int) TypedValue.applyDimension(1, f, getContext().getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.e.onGotEvent(str, null, null, g.c(getContext()), 0, this.f9485d.getAdItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
        return mimeTypeFromExtension == null ? AudienceNetworkActivity.WEBVIEW_MIME_TYPE : mimeTypeFromExtension;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.j = false;
        this.k = false;
        if (((CardViewModel) this.f9485d).getCardViewConfig() != null) {
            CardWebViewConfig cardViewConfig = ((CardViewModel) this.f9485d).getCardViewConfig();
            cardViewConfig.setDeviceOrientation(g.c(getContext()).toString());
            cardViewConfig.setShowNativeControls(this.f9485d.getAdItem().getCardConfig().isShowNativeControls());
            j a2 = new com.google.gson.e().a(((CardViewModel) this.f9485d).getCardViewConfig());
            com.youappi.sdk.trackers.b.a().a(a2, ((CardViewModel) this.f9485d).getAdItem());
            com.youappi.sdk.trackers.b.a().a(this.f9483b);
            if (this.f9485d.getAdItem().getCardConfig().isInjectJs()) {
                this.f9483b.loadUrl(String.format("javascript:setConfig(%s)", a2));
                this.f9483b.loadUrl("javascript:onCardShown()");
                this.f9483b.postDelayed(new Runnable() { // from class: com.youappi.sdk.ui.views.CardAdView.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CardAdView.this.f9483b.setVisibility(0);
                    }
                }, 75L);
            }
        }
    }

    private void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        return (str == null || this.f9485d == null || this.f9485d.getAdType() != AdType.CARD || ((CardViewModel) this.f9485d).getCardUrl() == null || !str.equals(((CardViewModel) this.f9485d).getCardUrl())) ? false : true;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void d() {
        setBackgroundColor(-1);
        this.f9483b = new WebView(getContext());
        setKeepScreenOn(true);
        this.f9483b.getSettings().setCacheMode(1);
        this.f9483b.getSettings().setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f9483b.getSettings().setMixedContentMode(2);
        }
        this.f9483b.setWebViewClient(new a());
        addView(this.f9483b, new RelativeLayout.LayoutParams(-1, -1));
        e();
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(Uri.parse(str));
        getContext().startActivity(intent);
    }

    private void e() {
        this.l = new TextView(getContext());
        this.l.setVisibility(8);
        int a2 = a(30.0f);
        int a3 = a(6.0f);
        int a4 = a(10.0f);
        int a5 = a(3.0f);
        int a6 = a(3.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
        this.l.setBackgroundColor(0);
        layoutParams.topMargin = a4;
        layoutParams.leftMargin = a3;
        addView(this.l, layoutParams);
        this.l.setGravity(17);
        this.l.setText("✖");
        this.l.setContentDescription("NativeClose");
        this.l.setTextColor(-1);
        float f = a5;
        this.l.setShadowLayer(a6, f, f, -7829368);
        this.l.setTextSize(1, 20.0f);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.youappi.sdk.ui.views.CardAdView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CardAdView.this.a("close");
                CardAdView.this.g();
            }
        });
    }

    private void f() {
        this.m = new ImageView(getContext());
        this.m.setVisibility(8);
        int a2 = a(30.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
        layoutParams.addRule(11);
        int a3 = a(6.0f);
        layoutParams.topMargin = a(10.0f);
        layoutParams.rightMargin = a3;
        addView(this.m, layoutParams);
        this.m.setContentDescription("NativeOptOut");
        this.m.setImageBitmap(i.b("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"));
        this.m.setContentDescription("NativeOptOut");
        this.m.setOnClickListener(new View.OnClickListener() { // from class: com.youappi.sdk.ui.views.CardAdView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CardAdView.this.d(i.a(CardAdView.this.h));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        setKeepScreenOn(false);
        com.youappi.sdk.trackers.b.a().b();
        this.f.onAdClosed(this);
        try {
            Log.d(CardAdView.class.getSimpleName(), "Destroying WebView");
            removeView(this.f9483b);
            this.f9483b.removeAllViews();
            this.f9483b.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public CardAdView getView() {
        return this;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void loadAd() {
        Uri assetUri;
        if (this.i != null && (assetUri = this.i.getAssetUri(this.g.toString())) != null) {
            this.g = assetUri;
        }
        this.f9483b.setVisibility(4);
        this.f9483b.loadUrl(this.g.toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k = true;
        if (this.f9484c != null) {
            this.f9484c.onCardShow(null);
        }
        if (this.f9483b != null) {
            if (this.j) {
                b();
            }
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k = false;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void onPause() {
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void onResume() {
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void onStart() {
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void onUserInteraction() {
        c();
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setAdItem(CardViewModel cardViewModel) {
        this.f9485d = cardViewModel;
        if (cardViewModel != null) {
            this.g = Uri.parse(cardViewModel.getCardUrl());
        }
        if (this.f9485d.getAdItem().getCardConfig().isShowNativeControls()) {
            this.l.setVisibility(0);
            this.m.setVisibility(0);
        }
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setAssetResolver(IAssetResolver iAssetResolver) {
        this.i = iAssetResolver;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setDeviceId(String str) {
        this.h = str;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setInternalEventListener(IAdEventListener iAdEventListener) {
        this.e = iAdEventListener;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setListener(YAInterstitialAd.InterstitialAdListener interstitialAdListener) {
        this.f9484c = interstitialAdListener;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setStateListener(BaseAd.AdStateListener adStateListener) {
        this.f = adStateListener;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void show() {
        this.f9483b.setVisibility(0);
    }
}
