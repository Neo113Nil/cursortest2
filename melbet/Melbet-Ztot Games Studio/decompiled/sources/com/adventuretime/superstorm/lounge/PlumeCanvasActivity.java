package com.adventuretime.superstorm.lounge;

import android.R;
import android.app.DownloadManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.drive.DriveFile;
import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlumeCanvasActivity.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020 H\u0003J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020 H\u0002J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010+\u001a\u00020(2\u0006\u0010)\u001a\u00020\nH\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020(H\u0002J\u0010\u0010/\u001a\u0002002\u0006\u0010.\u001a\u00020(H\u0002J\u0012\u00101\u001a\u00020 2\b\u00102\u001a\u0004\u0018\u000103H\u0014J\b\u00104\u001a\u00020 H\u0014J\b\u00105\u001a\u00020 H\u0014J\b\u00106\u001a\u00020 H\u0014J\b\u00107\u001a\u00020 H\u0002J\b\u00108\u001a\u00020 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/adventuretime/superstorm/lounge/PlumeCanvasActivity;", "Landroidx/activity/ComponentActivity;", "()V", "BINDER_JS", "", "backButton", "Landroid/widget/ImageButton;", "fileChooserCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "forwardButton", "fullscreenCallback", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "fullscreenView", "Landroid/view/View;", "popupWebViews", "", "Landroid/webkit/WebView;", "prefs", "Landroid/content/SharedPreferences;", "progress", "Landroid/widget/ProgressBar;", "rootLayout", "Landroid/widget/FrameLayout;", "savedOrientation", "", "swipeRefresh", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "webView", "activeWebView", "buildLayout", "", "closePopupAt", "idx", "configureWebView", "configureWindow", "finishAndShowNative", "goBackOrPopup", "handleExternalScheme", "", "uri", "view", "handleSentinelClose", "makeWebChromeClient", "Landroid/webkit/WebChromeClient;", "isPopup", "makeWebViewClient", "Landroid/webkit/WebViewClient;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "updateNavButtons", "wireBackHandling", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PlumeCanvasActivity extends ComponentActivity {
    private ImageButton backButton;
    private ValueCallback<Uri[]> fileChooserCallback;
    private ImageButton forwardButton;
    private WebChromeClient.CustomViewCallback fullscreenCallback;
    private View fullscreenView;
    private SharedPreferences prefs;
    private ProgressBar progress;
    private FrameLayout rootLayout;
    private int savedOrientation;
    private SwipeRefreshLayout swipeRefresh;
    private WebView webView;
    private final List<WebView> popupWebViews = new ArrayList();
    private final String BINDER_JS = "(function(){var ID='pp-decline-cta';var SCHEME='k4-n5v8cz://close';function bind(){var b=document.getElementById(ID);if(b&&!b.__k4){b.__k4=1;b.addEventListener('click',function(e){try{e.preventDefault();}catch(_){}window.location.href=SCHEME;},true);}}bind();try{var root=document.body||document.documentElement;if(root){var mo=new MutationObserver(bind);mo.observe(root,{childList:true,subtree:true});}}catch(_){}})();";

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPreferences = getSharedPreferences("h8w3_k4memo", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.prefs = sharedPreferences;
        WebView webView = null;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        if (sharedPreferences.getBoolean("stop_gate", false)) {
            finish();
            return;
        }
        configureWindow();
        buildLayout();
        configureWebView();
        wireBackHandling();
        WebView webView2 = this.webView;
        if (webView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        } else {
            webView = webView2;
        }
        webView.loadUrl("file:///android_asset/q7m2k_p4x.html");
    }

    private final void configureWindow() {
        try {
            getWindow().setSoftInputMode(16);
        } catch (Throwable unused) {
        }
    }

    private final void buildLayout() {
        PlumeCanvasActivity plumeCanvasActivity = this;
        FrameLayout frameLayout = new FrameLayout(plumeCanvasActivity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(Color.parseColor("#1c0b0d"));
        this.rootLayout = frameLayout;
        float f = getResources().getDisplayMetrics().density;
        final int i = (int) (56 * f);
        final int i2 = (int) (3 * f);
        final LinearLayout linearLayout = new LinearLayout(plumeCanvasActivity);
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
        layoutParams.gravity = 48;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundColor(Color.parseColor("#1c0b0d"));
        ImageButton imageButton = new ImageButton(plumeCanvasActivity);
        imageButton.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        imageButton.setBackgroundColor(0);
        imageButton.setImageDrawable(ContextCompat.getDrawable(plumeCanvasActivity, R.drawable.ic_media_previous));
        imageButton.setContentDescription("Back");
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.adventuretime.superstorm.lounge.PlumeCanvasActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlumeCanvasActivity.buildLayout$lambda$4$lambda$3(PlumeCanvasActivity.this, view);
            }
        });
        imageButton.setEnabled(false);
        this.backButton = imageButton;
        ImageButton imageButton2 = new ImageButton(plumeCanvasActivity);
        imageButton2.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        imageButton2.setBackgroundColor(0);
        imageButton2.setImageDrawable(ContextCompat.getDrawable(plumeCanvasActivity, R.drawable.ic_media_next));
        imageButton2.setContentDescription("Forward");
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.adventuretime.superstorm.lounge.PlumeCanvasActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlumeCanvasActivity.buildLayout$lambda$7$lambda$6(PlumeCanvasActivity.this, view);
            }
        });
        imageButton2.setEnabled(false);
        this.forwardButton = imageButton2;
        ImageButton imageButton3 = this.backButton;
        FrameLayout frameLayout2 = null;
        if (imageButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backButton");
            imageButton3 = null;
        }
        linearLayout.addView(imageButton3);
        ImageButton imageButton4 = this.forwardButton;
        if (imageButton4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("forwardButton");
            imageButton4 = null;
        }
        linearLayout.addView(imageButton4);
        ProgressBar progressBar = new ProgressBar(plumeCanvasActivity, null, R.attr.progressBarStyleHorizontal);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i2);
        layoutParams2.gravity = 48;
        layoutParams2.topMargin = i;
        progressBar.setLayoutParams(layoutParams2);
        progressBar.setMax(100);
        progressBar.setAlpha(0.0f);
        this.progress = progressBar;
        this.webView = new WebView(plumeCanvasActivity);
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(plumeCanvasActivity);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.topMargin = i + i2;
        swipeRefreshLayout.setLayoutParams(layoutParams3);
        WebView webView = this.webView;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView = null;
        }
        swipeRefreshLayout.addView(webView, new ViewGroup.LayoutParams(-1, -1));
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.adventuretime.superstorm.lounge.PlumeCanvasActivity$$ExternalSyntheticLambda2
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                PlumeCanvasActivity.buildLayout$lambda$12$lambda$11(PlumeCanvasActivity.this);
            }
        });
        this.swipeRefresh = swipeRefreshLayout;
        FrameLayout frameLayout3 = this.rootLayout;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
            frameLayout3 = null;
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefresh;
        if (swipeRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeRefresh");
            swipeRefreshLayout2 = null;
        }
        frameLayout3.addView(swipeRefreshLayout2);
        FrameLayout frameLayout4 = this.rootLayout;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
            frameLayout4 = null;
        }
        ProgressBar progressBar2 = this.progress;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            progressBar2 = null;
        }
        frameLayout4.addView(progressBar2);
        FrameLayout frameLayout5 = this.rootLayout;
        if (frameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
            frameLayout5 = null;
        }
        frameLayout5.addView(linearLayout);
        FrameLayout frameLayout6 = this.rootLayout;
        if (frameLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
            frameLayout6 = null;
        }
        setContentView(frameLayout6);
        FrameLayout frameLayout7 = this.rootLayout;
        if (frameLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
        } else {
            frameLayout2 = frameLayout7;
        }
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout2, new OnApplyWindowInsetsListener() { // from class: com.adventuretime.superstorm.lounge.PlumeCanvasActivity$$ExternalSyntheticLambda3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat buildLayout$lambda$19;
                buildLayout$lambda$19 = PlumeCanvasActivity.buildLayout$lambda$19(linearLayout, this, i, i2, view, windowInsetsCompat);
                return buildLayout$lambda$19;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildLayout$lambda$4$lambda$3(PlumeCanvasActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goBackOrPopup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildLayout$lambda$7$lambda$6(PlumeCanvasActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebView activeWebView = this$0.activeWebView();
        if (!activeWebView.canGoForward()) {
            activeWebView = null;
        }
        if (activeWebView != null) {
            activeWebView.goForward();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildLayout$lambda$12$lambda$11(PlumeCanvasActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.activeWebView().reload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat buildLayout$lambda$19(LinearLayout toolbar, PlumeCanvasActivity this$0, int i, int i2, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(toolbar, "$toolbar");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        int i3 = insets.getInsets(WindowInsetsCompat.Type.systemBars()).top;
        ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = i3;
        toolbar.setLayoutParams(layoutParams2);
        ProgressBar progressBar = this$0.progress;
        SwipeRefreshLayout swipeRefreshLayout = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            progressBar = null;
        }
        ViewGroup.LayoutParams layoutParams3 = progressBar.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        int i4 = i3 + i;
        layoutParams4.topMargin = i4;
        ProgressBar progressBar2 = this$0.progress;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            progressBar2 = null;
        }
        progressBar2.setLayoutParams(layoutParams4);
        SwipeRefreshLayout swipeRefreshLayout2 = this$0.swipeRefresh;
        if (swipeRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeRefresh");
            swipeRefreshLayout2 = null;
        }
        ViewGroup.LayoutParams layoutParams5 = swipeRefreshLayout2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
        layoutParams6.topMargin = i4 + i2;
        SwipeRefreshLayout swipeRefreshLayout3 = this$0.swipeRefresh;
        if (swipeRefreshLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeRefresh");
        } else {
            swipeRefreshLayout = swipeRefreshLayout3;
        }
        swipeRefreshLayout.setLayoutParams(layoutParams6);
        return insets;
    }

    private final void configureWebView() {
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager cookieManager = CookieManager.getInstance();
        WebView webView = this.webView;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView = null;
        }
        cookieManager.setAcceptThirdPartyCookies(webView, true);
        WebView webView3 = this.webView;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView3 = null;
        }
        WebSettings settings = webView3.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(0);
        settings.setCacheMode(-1);
        WebView webView4 = this.webView;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView4 = null;
        }
        webView4.setWebViewClient(makeWebViewClient(false));
        WebView webView5 = this.webView;
        if (webView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView5 = null;
        }
        webView5.setWebChromeClient(makeWebChromeClient(false));
        WebView webView6 = this.webView;
        if (webView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        } else {
            webView2 = webView6;
        }
        webView2.setDownloadListener(new DownloadListener() { // from class: com.adventuretime.superstorm.lounge.PlumeCanvasActivity$$ExternalSyntheticLambda4
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                PlumeCanvasActivity.configureWebView$lambda$21(PlumeCanvasActivity.this, str, str2, str3, str4, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureWebView$lambda$21(PlumeCanvasActivity this$0, String str, String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setMimeType(str4);
            request.addRequestHeader(HttpHeaders.USER_AGENT, str2);
            String cookie = CookieManager.getInstance().getCookie(str);
            if (cookie == null) {
                cookie = "";
            }
            request.addRequestHeader(HttpHeaders.COOKIE, cookie);
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(str, str3, str4));
            Object systemService = this$0.getSystemService("download");
            DownloadManager downloadManager = systemService instanceof DownloadManager ? (DownloadManager) systemService : null;
            if (downloadManager != null) {
                downloadManager.enqueue(request);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebViewClient makeWebViewClient(final boolean isPopup) {
        return new WebViewClient() { // from class: com.adventuretime.superstorm.lounge.PlumeCanvasActivity$makeWebViewClient$1
            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                boolean handleSentinelClose;
                boolean handleExternalScheme;
                Uri parse = url != null ? Uri.parse(url) : null;
                if (parse == null) {
                    return false;
                }
                handleSentinelClose = PlumeCanvasActivity.this.handleSentinelClose(parse);
                if (handleSentinelClose) {
                    return true;
                }
                handleExternalScheme = PlumeCanvasActivity.this.handleExternalScheme(parse, view);
                return handleExternalScheme;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                boolean handleSentinelClose;
                boolean handleExternalScheme;
                Uri url = request != null ? request.getUrl() : null;
                if (url == null) {
                    return false;
                }
                handleSentinelClose = PlumeCanvasActivity.this.handleSentinelClose(url);
                if (handleSentinelClose) {
                    return true;
                }
                handleExternalScheme = PlumeCanvasActivity.this.handleExternalScheme(url, view);
                return handleExternalScheme;
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                ProgressBar progressBar;
                PlumeCanvasActivity.this.updateNavButtons();
                if (isPopup) {
                    return;
                }
                progressBar = PlumeCanvasActivity.this.progress;
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progress");
                    progressBar = null;
                }
                progressBar.setAlpha(1.0f);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                String str;
                ProgressBar progressBar;
                SwipeRefreshLayout swipeRefreshLayout;
                PlumeCanvasActivity.this.updateNavButtons();
                if (!isPopup) {
                    progressBar = PlumeCanvasActivity.this.progress;
                    if (progressBar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progress");
                        progressBar = null;
                    }
                    progressBar.setAlpha(0.0f);
                    try {
                        swipeRefreshLayout = PlumeCanvasActivity.this.swipeRefresh;
                        if (swipeRefreshLayout == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("swipeRefresh");
                            swipeRefreshLayout = null;
                        }
                        swipeRefreshLayout.setRefreshing(false);
                    } catch (Throwable unused) {
                    }
                }
                if (view != null) {
                    str = PlumeCanvasActivity.this.BINDER_JS;
                    view.evaluateJavascript(str, null);
                }
                try {
                    CookieManager.getInstance().flush();
                } catch (Throwable unused2) {
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                if (handler != null) {
                    handler.cancel();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebChromeClient makeWebChromeClient(final boolean isPopup) {
        return new WebChromeClient() { // from class: com.adventuretime.superstorm.lounge.PlumeCanvasActivity$makeWebChromeClient$1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView view, int newProgress) {
                ProgressBar progressBar;
                ProgressBar progressBar2;
                if (isPopup) {
                    return;
                }
                progressBar = this.progress;
                ProgressBar progressBar3 = null;
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progress");
                    progressBar = null;
                }
                progressBar.setProgress(newProgress);
                if (newProgress >= 100) {
                    progressBar2 = this.progress;
                    if (progressBar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progress");
                    } else {
                        progressBar3 = progressBar2;
                    }
                    progressBar3.setAlpha(0.0f);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
                WebViewClient makeWebViewClient;
                WebChromeClient makeWebChromeClient;
                List list;
                FrameLayout frameLayout;
                WebView webView = new WebView(this);
                PlumeCanvasActivity plumeCanvasActivity = this;
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setSupportMultipleWindows(true);
                webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                makeWebViewClient = plumeCanvasActivity.makeWebViewClient(true);
                webView.setWebViewClient(makeWebViewClient);
                makeWebChromeClient = plumeCanvasActivity.makeWebChromeClient(true);
                webView.setWebChromeClient(makeWebChromeClient);
                list = this.popupWebViews;
                list.add(webView);
                frameLayout = this.rootLayout;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
                    frameLayout = null;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.topMargin = (int) (56 * this.getResources().getDisplayMetrics().density);
                Unit unit = Unit.INSTANCE;
                frameLayout.addView(webView, layoutParams);
                Object obj = resultMsg != null ? resultMsg.obj : null;
                WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
                if (webViewTransport == null) {
                    return false;
                }
                webViewTransport.setWebView(webView);
                resultMsg.sendToTarget();
                this.updateNavButtons();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView window) {
                List list;
                if (window == null) {
                    return;
                }
                list = this.popupWebViews;
                int indexOf = list.indexOf(window);
                if (indexOf >= 0) {
                    this.closePopupAt(indexOf);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(PermissionRequest request) {
                if (request != null) {
                    request.deny();
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
                View view2;
                FrameLayout frameLayout;
                WebView webView;
                WebView webView2;
                if (view == null || callback == null) {
                    return;
                }
                view2 = this.fullscreenView;
                if (view2 != null) {
                    try {
                        callback.onCustomViewHidden();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                this.fullscreenView = view;
                this.fullscreenCallback = callback;
                PlumeCanvasActivity plumeCanvasActivity = this;
                plumeCanvasActivity.savedOrientation = plumeCanvasActivity.getRequestedOrientation();
                view.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                frameLayout = this.rootLayout;
                WebView webView3 = null;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
                    frameLayout = null;
                }
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                webView = this.webView;
                if (webView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                    webView = null;
                }
                webView.setAlpha(0.0f);
                webView2 = this.webView;
                if (webView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                } else {
                    webView3 = webView2;
                }
                webView3.setClickable(false);
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                View view;
                int i;
                WebView webView;
                WebView webView2;
                WebChromeClient.CustomViewCallback customViewCallback;
                FrameLayout frameLayout;
                view = this.fullscreenView;
                if (view == null) {
                    return;
                }
                WebView webView3 = null;
                try {
                    frameLayout = this.rootLayout;
                    if (frameLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
                        frameLayout = null;
                    }
                    frameLayout.removeView(view);
                } catch (Throwable unused) {
                }
                this.fullscreenView = null;
                try {
                    customViewCallback = this.fullscreenCallback;
                    if (customViewCallback != null) {
                        customViewCallback.onCustomViewHidden();
                    }
                } catch (Throwable unused2) {
                }
                this.fullscreenCallback = null;
                PlumeCanvasActivity plumeCanvasActivity = this;
                i = plumeCanvasActivity.savedOrientation;
                plumeCanvasActivity.setRequestedOrientation(i);
                webView = this.webView;
                if (webView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                    webView = null;
                }
                webView.setAlpha(1.0f);
                webView2 = this.webView;
                if (webView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                } else {
                    webView3 = webView2;
                }
                webView3.setClickable(true);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleSentinelClose(Uri uri) {
        if (!Intrinsics.areEqual(uri.getScheme(), "k4-n5v8cz")) {
            return false;
        }
        SharedPreferences sharedPreferences = this.prefs;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        sharedPreferences.edit().putBoolean("stop_gate", true).apply();
        try {
            CookieManager.getInstance().flush();
        } catch (Throwable unused) {
        }
        finishAndShowNative();
        return true;
    }

    private final void finishAndShowNative() {
        try {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268468224).putExtra("native_return", true);
                startActivity(launchIntentForPackage);
            } else {
                Intent putExtra = new Intent(this, Class.forName("com.adventuretime.superstorm.MainActivity")).addFlags(268468224).putExtra("native_return", true);
                Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                startActivity(putExtra);
            }
        } catch (Throwable unused) {
        }
        finish();
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean handleExternalScheme(Uri uri, WebView view) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        String lowerCase = scheme.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (lowerCase == null) {
            return false;
        }
        switch (lowerCase.hashCode()) {
            case 3026845:
                if (lowerCase.equals("blob")) {
                    return false;
                }
                break;
            case 3143036:
                if (lowerCase.equals("file")) {
                    return false;
                }
                break;
            case 3213448:
                if (lowerCase.equals(ProxyConfig.MATCH_HTTP)) {
                    return false;
                }
                break;
            case 92611469:
                if (lowerCase.equals("about")) {
                    return false;
                }
                break;
            case 99617003:
                if (lowerCase.equals(ProxyConfig.MATCH_HTTPS)) {
                    return false;
                }
                break;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addFlags(DriveFile.MODE_READ_ONLY);
            startActivity(intent);
        } catch (Throwable unused) {
        }
        return true;
    }

    private final void wireBackHandling() {
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.adventuretime.superstorm.lounge.PlumeCanvasActivity$wireBackHandling$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                PlumeCanvasActivity.this.goBackOrPopup();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goBackOrPopup() {
        if (!this.popupWebViews.isEmpty()) {
            closePopupAt(this.popupWebViews.size() - 1);
            return;
        }
        WebView webView = this.webView;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView = null;
        }
        if (webView.canGoBack()) {
            WebView webView3 = this.webView;
            if (webView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
            } else {
                webView2 = webView3;
            }
            webView2.goBack();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closePopupAt(int idx) {
        if (idx < 0 || idx >= this.popupWebViews.size()) {
            return;
        }
        WebView remove = this.popupWebViews.remove(idx);
        try {
            FrameLayout frameLayout = this.rootLayout;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
                frameLayout = null;
            }
            frameLayout.removeView(remove);
            remove.destroy();
        } catch (Throwable unused) {
        }
        updateNavButtons();
    }

    private final WebView activeWebView() {
        WebView webView = (WebView) CollectionsKt.lastOrNull((List) this.popupWebViews);
        if (webView != null) {
            return webView;
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            return webView2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webView");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNavButtons() {
        if (this.backButton == null) {
            return;
        }
        WebView activeWebView = activeWebView();
        ImageButton imageButton = this.backButton;
        ImageButton imageButton2 = null;
        if (imageButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backButton");
            imageButton = null;
        }
        boolean z = true;
        if (!(!this.popupWebViews.isEmpty()) && !activeWebView.canGoBack()) {
            z = false;
        }
        imageButton.setEnabled(z);
        ImageButton imageButton3 = this.forwardButton;
        if (imageButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("forwardButton");
        } else {
            imageButton2 = imageButton3;
        }
        imageButton2.setEnabled(activeWebView.canGoForward());
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        try {
            WebView webView = this.webView;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                webView = null;
            }
            webView.onPause();
        } catch (Throwable unused) {
        }
        try {
            CookieManager.getInstance().flush();
        } catch (Throwable unused2) {
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            WebView webView = this.webView;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                webView = null;
            }
            webView.onResume();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        WebView webView;
        try {
            Iterator<T> it = this.popupWebViews.iterator();
            while (true) {
                webView = null;
                FrameLayout frameLayout = null;
                if (!it.hasNext()) {
                    break;
                }
                WebView webView2 = (WebView) it.next();
                try {
                    FrameLayout frameLayout2 = this.rootLayout;
                    if (frameLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
                    } else {
                        frameLayout = frameLayout2;
                    }
                    frameLayout.removeView(webView2);
                    webView2.destroy();
                } catch (Throwable unused) {
                }
            }
            this.popupWebViews.clear();
            FrameLayout frameLayout3 = this.rootLayout;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
                frameLayout3 = null;
            }
            SwipeRefreshLayout swipeRefreshLayout = this.swipeRefresh;
            if (swipeRefreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("swipeRefresh");
                swipeRefreshLayout = null;
            }
            frameLayout3.removeView(swipeRefreshLayout);
            WebView webView3 = this.webView;
            if (webView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
            } else {
                webView = webView3;
            }
            webView.destroy();
        } catch (Throwable unused2) {
        }
        super.onDestroy();
    }
}
