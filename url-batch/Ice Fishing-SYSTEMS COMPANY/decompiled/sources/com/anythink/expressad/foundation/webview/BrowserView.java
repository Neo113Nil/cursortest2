package com.anythink.expressad.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.anythink.core.common.v.k;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class BrowserView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19897a = "BrowserView";

    /* renamed from: b, reason: collision with root package name */
    private String f19898b;

    /* renamed from: c, reason: collision with root package name */
    private ProgressBar f19899c;

    /* renamed from: d, reason: collision with root package name */
    private WebView f19900d;

    /* renamed from: e, reason: collision with root package name */
    private ToolBar f19901e;

    /* renamed from: f, reason: collision with root package name */
    private a f19902f;

    /* renamed from: g, reason: collision with root package name */
    private d f19903g;

    public interface a {
        void a();

        void b();

        void c();

        boolean d();

        void e();

        void f();
    }

    public BrowserView(Context context, d dVar) {
        super(context);
        this.f19903g = dVar;
        init();
    }

    public void destroy() {
        WebView webView = this.f19900d;
        if (webView != null) {
            webView.stopLoading();
            this.f19900d.setWebViewClient(null);
            this.f19900d.destroy();
            this.f19900d = null;
            removeAllViews();
        }
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f19899c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f19900d == null) {
                this.f19900d = b();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f19900d.setLayoutParams(layoutParams);
        } catch (Throwable unused) {
        }
        this.f19901e = new ToolBar(getContext());
        this.f19901e.setLayoutParams(new LinearLayout.LayoutParams(-1, v.b(getContext(), 40.0f)));
        this.f19901e.setBackgroundColor(-1);
        addView(this.f19899c);
        WebView webView = this.f19900d;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f19901e);
        this.f19899c.initResource(true);
        this.f19901e.getItem(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(false);
        this.f19901e.getItem(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
        this.f19901e.setOnItemClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.webview.BrowserView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BrowserView.this.f19900d != null) {
                    BrowserView.this.f19900d.stopLoading();
                }
                String str = (String) view.getTag();
                boolean z8 = false;
                if (TextUtils.equals(str, com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.BACKWARD)) {
                    BrowserView.this.f19901e.getItem(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(true);
                    if (BrowserView.this.f19900d != null && BrowserView.this.f19900d.canGoBack()) {
                        BrowserView.this.f19900d.goBack();
                    }
                    View item = BrowserView.this.f19901e.getItem(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.BACKWARD);
                    if (BrowserView.this.f19900d != null && BrowserView.this.f19900d.canGoBack()) {
                        z8 = true;
                    }
                    item.setEnabled(z8);
                    return;
                }
                if (TextUtils.equals(str, com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.FORWARD)) {
                    BrowserView.this.f19901e.getItem(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
                    if (BrowserView.this.f19900d != null && BrowserView.this.f19900d.canGoForward()) {
                        BrowserView.this.f19900d.goForward();
                    }
                    View item2 = BrowserView.this.f19901e.getItem(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.FORWARD);
                    if (BrowserView.this.f19900d != null && BrowserView.this.f19900d.canGoForward()) {
                        z8 = true;
                    }
                    item2.setEnabled(z8);
                    return;
                }
                if (!TextUtils.equals(str, com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.REFRESH)) {
                    if (!TextUtils.equals(str, com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.EXITS) || BrowserView.this.f19902f == null) {
                        return;
                    }
                    a unused2 = BrowserView.this.f19902f;
                    return;
                }
                BrowserView.this.f19901e.getItem(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(BrowserView.this.f19900d != null && BrowserView.this.f19900d.canGoBack());
                View item3 = BrowserView.this.f19901e.getItem(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.FORWARD);
                if (BrowserView.this.f19900d != null && BrowserView.this.f19900d.canGoForward()) {
                    z8 = true;
                }
                item3.setEnabled(z8);
                if (BrowserView.this.f19900d != null) {
                    BrowserView.this.f19900d.loadUrl(BrowserView.this.f19898b);
                }
            }
        });
    }

    public void loadUrl(String str) {
        WebView webView = this.f19900d;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void setListener(a aVar) {
        this.f19902f = aVar;
    }

    public void setWebView(WebView webView) {
        this.f19900d = webView;
    }

    public static final class DownloadListener implements android.webkit.DownloadListener {
        private d campaignEx;
        private String title;

        public DownloadListener(d dVar) {
            this.campaignEx = dVar;
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j9) {
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public DownloadListener() {
        }
    }

    private WebView b() {
        WebView webView = new WebView(getContext());
        try {
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setCacheMode(-1);
            settings.setAllowFileAccess(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    settings.setSafeBrowsingEnabled(false);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            settings.setMediaPlaybackRequiresUserGesture(false);
            try {
                settings.setAllowUniversalAccessFromFileURLs(false);
            } catch (Throwable th2) {
                th2.getMessage();
            }
            try {
                settings.setMixedContentMode(1);
            } catch (Exception e6) {
                e6.getMessage();
            }
            try {
                Method declaredMethod = WebSettings.class.getDeclaredMethod(k.b("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(settings, 0);
            } catch (Throwable unused) {
            }
            settings.setDatabaseEnabled(true);
            String path = getContext().getDir("database", 0).getPath();
            settings.setDatabasePath(path);
            settings.setGeolocationEnabled(true);
            settings.setGeolocationDatabasePath(path);
            try {
                Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(settings, Boolean.FALSE);
            } catch (Exception e9) {
                e9.getMessage();
            }
            try {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            } catch (Throwable unused2) {
            }
        } catch (Throwable th3) {
            th3.getMessage();
        }
        webView.setDownloadListener(new DownloadListener(this.f19903g));
        webView.setWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.foundation.webview.BrowserView.2
            @Override // android.webkit.WebViewClient
            public final void onLoadResource(WebView webView2, String str) {
                super.onLoadResource(webView2, str);
                if (BrowserView.this.f19902f != null) {
                    a unused3 = BrowserView.this.f19902f;
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str) {
                if (BrowserView.this.f19902f != null) {
                    a unused3 = BrowserView.this.f19902f;
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                BrowserView.this.f19898b = str;
                if (BrowserView.this.f19902f != null) {
                    a unused3 = BrowserView.this.f19902f;
                }
                BrowserView.this.f19899c.setVisible(true);
                BrowserView.this.f19899c.setProgressState(5);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, int i, String str, String str2) {
                if (BrowserView.this.f19902f != null) {
                    a unused3 = BrowserView.this.f19902f;
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (webView2 != null) {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView2.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView2);
                        }
                        webView2.destroy();
                    } catch (Throwable th4) {
                        th4.getMessage();
                        return true;
                    }
                }
                if (BrowserView.this.f19902f != null) {
                    a unused3 = BrowserView.this.f19902f;
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                BrowserView.this.f19901e.getItem(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
                BrowserView.this.f19901e.getItem(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
                if (BrowserView.this.f19902f != null) {
                    return BrowserView.this.f19902f.d();
                }
                return false;
            }
        });
        webView.setWebChromeClient(n.e() <= 10 ? new WebChromeClient() { // from class: com.anythink.expressad.foundation.webview.BrowserView.3
            @Override // android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView2, String str, String str2, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsConfirm(WebView webView2, String str, String str2, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView2, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i) {
                if (i == 100) {
                    BrowserView.this.f19899c.setProgressState(7);
                    new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.foundation.webview.BrowserView.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            BrowserView.this.f19899c.setVisible(false);
                        }
                    }, 200L);
                }
            }
        } : new WebChromeClient() { // from class: com.anythink.expressad.foundation.webview.BrowserView.4
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i) {
                if (i == 100) {
                    BrowserView.this.f19899c.setProgressState(7);
                    new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.foundation.webview.BrowserView.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            BrowserView.this.f19899c.setVisible(false);
                        }
                    }, 200L);
                }
            }
        });
        return webView;
    }

    private void a() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f19899c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f19900d == null) {
                this.f19900d = b();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f19900d.setLayoutParams(layoutParams);
        } catch (Throwable unused) {
        }
        this.f19901e = new ToolBar(getContext());
        this.f19901e.setLayoutParams(new LinearLayout.LayoutParams(-1, v.b(getContext(), 40.0f)));
        this.f19901e.setBackgroundColor(-1);
        addView(this.f19899c);
        WebView webView = this.f19900d;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f19901e);
    }

    public BrowserView(Context context) {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
