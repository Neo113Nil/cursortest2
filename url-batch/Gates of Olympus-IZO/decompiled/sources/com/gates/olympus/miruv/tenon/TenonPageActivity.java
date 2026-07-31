package com.gates.olympus.miruv.tenon;

import D1.C0014b;
import D1.g;
import D1.h;
import D1.k;
import D1.m;
import D1.n;
import D1.p;
import D1.q;
import D1.r;
import I2.d;
import Z1.i;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.PermissionRequest;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import b.o;
import com.gates.olympus.miruv.R;
import com.gates.olympus.miruv.tenon.TenonPageActivity;
import f.C0383b;
import h2.AbstractC0447i;
import h2.AbstractC0454p;
import java.util.Locale;

/* loaded from: classes.dex */
public final class TenonPageActivity extends o {
    public static final m Companion = new m();
    public boolean B;
    public String C;
    public boolean D;

    /* renamed from: E, reason: collision with root package name */
    public LinearLayout f4424E;

    /* renamed from: F, reason: collision with root package name */
    public TextView f4425F;

    /* renamed from: G, reason: collision with root package name */
    public TextView f4426G;

    /* renamed from: H, reason: collision with root package name */
    public PermissionRequest f4427H;

    /* renamed from: I, reason: collision with root package name */
    public ValueCallback f4428I;

    /* renamed from: y, reason: collision with root package name */
    public FrameLayout f4432y;

    /* renamed from: z, reason: collision with root package name */
    public WebView f4433z;

    /* renamed from: x, reason: collision with root package name */
    public final L1.o f4431x = d.F(new g(0, this));

    /* renamed from: A, reason: collision with root package name */
    public String f4423A = "";

    /* renamed from: J, reason: collision with root package name */
    public final C0014b f4429J = i(new h(this, 0), new C0383b(0));

    /* renamed from: K, reason: collision with root package name */
    public final C0014b f4430K = i(new h(this, 1), new C0383b(1));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String l(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        i.e(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1487394660:
                return !lowerCase.equals("image/jpeg") ? "bin" : "jpg";
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    return "webp";
                }
                break;
            case -1248334925:
                if (lowerCase.equals("application/pdf")) {
                    return "pdf";
                }
                break;
            case -879267568:
                if (lowerCase.equals("image/gif")) {
                    return "gif";
                }
                break;
            case -879264467:
                if (!lowerCase.equals("image/jpg")) {
                }
                break;
            case -879258763:
                if (lowerCase.equals("image/png")) {
                    return "png";
                }
                break;
        }
    }

    public final int j(int i3) {
        return (int) TypedValue.applyDimension(1, i3, getResources().getDisplayMetrics());
    }

    public final void k(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
        } catch (ActivityNotFoundException unused) {
            String string = getString(R.string.web_no_app);
            i.e(string, "getString(...)");
            Toast.makeText(this, string, 0).show();
        }
    }

    @Override // b.o, S0.b, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("extra_url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f4423A = stringExtra;
        this.B = getIntent().getBooleanExtra("extra_consent", false);
        if (AbstractC0447i.t0(this.f4423A)) {
            finish();
            return;
        }
        setRequestedOrientation(1);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-16777216);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setFitsSystemWindows(true);
        if (this.B) {
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.setBackgroundColor(Color.parseColor("#222222"));
            int j3 = j(8);
            linearLayout2.setPadding(j(16), j3, j(8), j3);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            TextView textView = new TextView(this);
            textView.setText(getString(R.string.consent_title));
            textView.setTextColor(-1);
            textView.setTextSize(18.0f);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            Button button = new Button(this);
            button.setText(getString(R.string.consent_accept));
            button.setOnClickListener(new k(this, 0));
            linearLayout2.addView(textView);
            linearLayout2.addView(button);
            linearLayout.addView(linearLayout2);
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.f4432y = frameLayout;
        WebView webView = new WebView(this);
        this.f4433z = webView;
        FrameLayout frameLayout2 = this.f4432y;
        if (frameLayout2 == null) {
            i.j("root");
            throw null;
        }
        frameLayout2.addView(webView);
        View view = this.f4432y;
        if (view == null) {
            i.j("root");
            throw null;
        }
        linearLayout.addView(view);
        setContentView(linearLayout);
        WebView webView2 = this.f4433z;
        if (webView2 == null) {
            i.j("web");
            throw null;
        }
        WebSettings settings = webView2.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(2);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(false);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        String userAgentString = settings.getUserAgentString();
        i.e(userAgentString, "getUserAgentString(...)");
        settings.setUserAgentString(AbstractC0454p.g0(AbstractC0454p.g0(userAgentString, "; wv)", ")"), "Version/4.0 ", ""));
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        WebView webView3 = this.f4433z;
        if (webView3 == null) {
            i.j("web");
            throw null;
        }
        cookieManager.setAcceptThirdPartyCookies(webView3, true);
        WebView webView4 = this.f4433z;
        if (webView4 == null) {
            i.j("web");
            throw null;
        }
        webView4.addJavascriptInterface(new n(this), "AndroidDownloader");
        WebView webView5 = this.f4433z;
        if (webView5 == null) {
            i.j("web");
            throw null;
        }
        webView5.setWebViewClient(new p(this));
        WebView webView6 = this.f4433z;
        if (webView6 == null) {
            i.j("web");
            throw null;
        }
        webView6.setWebChromeClient(new q(this));
        WebView webView7 = this.f4433z;
        if (webView7 == null) {
            i.j("web");
            throw null;
        }
        webView7.setDownloadListener(new DownloadListener() { // from class: D1.l
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j4) {
                m mVar = TenonPageActivity.Companion;
                Z1.i.c(str);
                TenonPageActivity tenonPageActivity = TenonPageActivity.this;
                tenonPageActivity.getClass();
                if (AbstractC0454p.i0(str, "data:") || AbstractC0454p.i0(str, "blob:")) {
                    return;
                }
                try {
                    String guessFileName = URLUtil.guessFileName(str, str3, str4);
                    DownloadManager.Request mimeType = new DownloadManager.Request(Uri.parse(str)).setMimeType(str4);
                    if (str2 == null) {
                        WebView webView8 = tenonPageActivity.f4433z;
                        if (webView8 == null) {
                            Z1.i.j("web");
                            throw null;
                        }
                        str2 = webView8.getSettings().getUserAgentString();
                    }
                    DownloadManager.Request addRequestHeader = mimeType.addRequestHeader("User-Agent", str2);
                    String cookie = CookieManager.getInstance().getCookie(str);
                    if (cookie == null) {
                        cookie = "";
                    }
                    DownloadManager.Request destinationInExternalPublicDir = addRequestHeader.addRequestHeader("Cookie", cookie).setNotificationVisibility(1).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                    Object systemService = tenonPageActivity.getSystemService("download");
                    Z1.i.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                    ((DownloadManager) systemService).enqueue(destinationInExternalPublicDir);
                    String string = tenonPageActivity.getString(R.string.web_download_progress, guessFileName);
                    Z1.i.e(string, "getString(...)");
                    Toast.makeText(tenonPageActivity, string, 0).show();
                } catch (Throwable th) {
                    I2.l.t(th);
                }
            }
        });
        b().a(this, new r(this));
        WebView webView8 = this.f4433z;
        if (webView8 == null) {
            i.j("web");
            throw null;
        }
        webView8.loadUrl(this.f4423A);
        WebView webView9 = this.f4433z;
        if (webView9 != null) {
            webView9.postDelayed(new D1.i(this, 0), 1000L);
        } else {
            i.j("web");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        WebView webView = this.f4433z;
        if (webView != null) {
            if (webView == null) {
                i.j("web");
                throw null;
            }
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                WebView webView2 = this.f4433z;
                if (webView2 == null) {
                    i.j("web");
                    throw null;
                }
                viewGroup.removeView(webView2);
            }
            WebView webView3 = this.f4433z;
            if (webView3 == null) {
                i.j("web");
                throw null;
            }
            webView3.removeJavascriptInterface("AndroidDownloader");
            WebView webView4 = this.f4433z;
            if (webView4 == null) {
                i.j("web");
                throw null;
            }
            webView4.stopLoading();
            WebView webView5 = this.f4433z;
            if (webView5 == null) {
                i.j("web");
                throw null;
            }
            webView5.destroy();
        }
        super.onDestroy();
    }
}
