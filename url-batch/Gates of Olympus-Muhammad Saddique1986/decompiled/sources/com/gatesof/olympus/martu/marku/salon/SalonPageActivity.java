package com.gatesof.olympus.martu.marku.salon;

import A2.f;
import G1.m;
import L1.g;
import L1.k;
import L1.l;
import L1.o;
import L1.p;
import R1.n;
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
import b.AbstractActivityC0319o;
import com.gatesof.olympus.martu.marku.R;
import com.gatesof.olympus.martu.marku.salon.SalonPageActivity;
import f.C0430a;
import f2.j;
import java.util.Locale;
import n2.AbstractC0730j;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class SalonPageActivity extends AbstractActivityC0319o {
    public static final k Companion = new k();

    /* renamed from: B, reason: collision with root package name */
    public boolean f5628B;
    public String C;
    public boolean D;

    /* renamed from: E, reason: collision with root package name */
    public LinearLayout f5629E;

    /* renamed from: F, reason: collision with root package name */
    public TextView f5630F;

    /* renamed from: G, reason: collision with root package name */
    public TextView f5631G;

    /* renamed from: H, reason: collision with root package name */
    public PermissionRequest f5632H;

    /* renamed from: I, reason: collision with root package name */
    public ValueCallback f5633I;

    /* renamed from: y, reason: collision with root package name */
    public FrameLayout f5637y;

    /* renamed from: z, reason: collision with root package name */
    public WebView f5638z;

    /* renamed from: x, reason: collision with root package name */
    public final n f5636x = R1.a.d(new f(2, this));

    /* renamed from: A, reason: collision with root package name */
    public String f5627A = "";

    /* renamed from: J, reason: collision with root package name */
    public final m f5634J = i(new g(this, 0), new C0430a(0));

    /* renamed from: K, reason: collision with root package name */
    public final m f5635K = i(new g(this, 1), new C0430a(1));

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
        j.e(lowerCase, "toLowerCase(...)");
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
            j.e(string, "getString(...)");
            Toast.makeText(this, string, 0).show();
        }
    }

    @Override // b.AbstractActivityC0319o, U0.b, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("extra_url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f5627A = stringExtra;
        this.f5628B = getIntent().getBooleanExtra("extra_consent", false);
        if (AbstractC0730j.K(this.f5627A)) {
            finish();
            return;
        }
        setRequestedOrientation(1);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-16777216);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setFitsSystemWindows(true);
        if (this.f5628B) {
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
            button.setOnClickListener(new L1.j(this, 0));
            linearLayout2.addView(textView);
            linearLayout2.addView(button);
            linearLayout.addView(linearLayout2);
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.f5637y = frameLayout;
        WebView webView = new WebView(this);
        this.f5638z = webView;
        FrameLayout frameLayout2 = this.f5637y;
        if (frameLayout2 == null) {
            j.j("root");
            throw null;
        }
        frameLayout2.addView(webView);
        View view = this.f5637y;
        if (view == null) {
            j.j("root");
            throw null;
        }
        linearLayout.addView(view);
        setContentView(linearLayout);
        WebView webView2 = this.f5638z;
        if (webView2 == null) {
            j.j("web");
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
        j.e(userAgentString, "getUserAgentString(...)");
        settings.setUserAgentString(AbstractC0737q.x(AbstractC0737q.x(userAgentString, "; wv)", ")"), "Version/4.0 ", ""));
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        WebView webView3 = this.f5638z;
        if (webView3 == null) {
            j.j("web");
            throw null;
        }
        cookieManager.setAcceptThirdPartyCookies(webView3, true);
        WebView webView4 = this.f5638z;
        if (webView4 == null) {
            j.j("web");
            throw null;
        }
        webView4.addJavascriptInterface(new l(this), "AndroidDownloader");
        WebView webView5 = this.f5638z;
        if (webView5 == null) {
            j.j("web");
            throw null;
        }
        webView5.setWebViewClient(new L1.n(this));
        WebView webView6 = this.f5638z;
        if (webView6 == null) {
            j.j("web");
            throw null;
        }
        webView6.setWebChromeClient(new o(this));
        WebView webView7 = this.f5638z;
        if (webView7 == null) {
            j.j("web");
            throw null;
        }
        webView7.setDownloadListener(new DownloadListener() { // from class: L1.i
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j4) {
                k kVar = SalonPageActivity.Companion;
                f2.j.c(str);
                SalonPageActivity salonPageActivity = SalonPageActivity.this;
                salonPageActivity.getClass();
                if (AbstractC0737q.z(str, "data:") || AbstractC0737q.z(str, "blob:")) {
                    return;
                }
                try {
                    String guessFileName = URLUtil.guessFileName(str, str3, str4);
                    DownloadManager.Request mimeType = new DownloadManager.Request(Uri.parse(str)).setMimeType(str4);
                    if (str2 == null) {
                        WebView webView8 = salonPageActivity.f5638z;
                        if (webView8 == null) {
                            f2.j.j("web");
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
                    Object systemService = salonPageActivity.getSystemService("download");
                    f2.j.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                    ((DownloadManager) systemService).enqueue(destinationInExternalPublicDir);
                    String string = salonPageActivity.getString(R.string.web_download_progress, guessFileName);
                    f2.j.e(string, "getString(...)");
                    Toast.makeText(salonPageActivity, string, 0).show();
                } catch (Throwable th) {
                    R1.a.b(th);
                }
            }
        });
        b().a(this, new p(this));
        WebView webView8 = this.f5638z;
        if (webView8 == null) {
            j.j("web");
            throw null;
        }
        webView8.loadUrl(this.f5627A);
        WebView webView9 = this.f5638z;
        if (webView9 != null) {
            webView9.postDelayed(new L1.f(this, 0), 1000L);
        } else {
            j.j("web");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        WebView webView = this.f5638z;
        if (webView != null) {
            if (webView == null) {
                j.j("web");
                throw null;
            }
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                WebView webView2 = this.f5638z;
                if (webView2 == null) {
                    j.j("web");
                    throw null;
                }
                viewGroup.removeView(webView2);
            }
            WebView webView3 = this.f5638z;
            if (webView3 == null) {
                j.j("web");
                throw null;
            }
            webView3.removeJavascriptInterface("AndroidDownloader");
            WebView webView4 = this.f5638z;
            if (webView4 == null) {
                j.j("web");
                throw null;
            }
            webView4.stopLoading();
            WebView webView5 = this.f5638z;
            if (webView5 == null) {
                j.j("web");
                throw null;
            }
            webView5.destroy();
        }
        super.onDestroy();
    }
}
