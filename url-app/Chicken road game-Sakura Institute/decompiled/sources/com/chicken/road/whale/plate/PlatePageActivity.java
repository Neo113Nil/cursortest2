package com.chicken.road.whale.plate;

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
import b.j0;
import b.o;
import b1.b;
import com.android.installreferrer.R;
import com.chicken.road.whale.plate.PlatePageActivity;
import f4.i;
import f4.j;
import f4.l;
import f4.m;
import f4.n;
import f4.p;
import java.util.Locale;
import r6.k;
import z6.h;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class PlatePageActivity extends o {
    public static final m Companion = new m();
    public static final String N;
    public static final String O;
    public static final String P;
    public FrameLayout A;
    public WebView B;
    public boolean D;
    public String E;
    public boolean F;
    public LinearLayout G;
    public TextView H;
    public TextView I;
    public PermissionRequest J;
    public ValueCallback K;

    /* renamed from: z, reason: collision with root package name */
    public final d6.o f1766z = d6.a.d(new i(0, this));
    public String C = "";
    public final b L = i(new f.a(0), new j(this, 0));
    public final b M = i(new f.a(1), new j(this, 1));

    static {
        PlateVault plateVault = PlateVault.INSTANCE;
        N = plateVault.at(11);
        O = plateVault.at(12);
        P = plateVault.at(13);
    }

    public static String l(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        k.e(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1487394660:
                return !lowerCase.equals("image/jpeg") ? "bin" : "jpg";
            case -1487018032:
                return !lowerCase.equals("image/webp") ? "bin" : "webp";
            case -1248334925:
                return !lowerCase.equals("application/pdf") ? "bin" : "pdf";
            case -879267568:
                return !lowerCase.equals("image/gif") ? "bin" : "gif";
            case -879264467:
                return !lowerCase.equals("image/jpg") ? "bin" : "jpg";
            case -879258763:
                return !lowerCase.equals("image/png") ? "bin" : "png";
            default:
                return "bin";
        }
    }

    public final int j(int i7) {
        return (int) TypedValue.applyDimension(1, i7, getResources().getDisplayMetrics());
    }

    public final void k(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
        } catch (ActivityNotFoundException unused) {
            String string = getString(R.string.web_no_app);
            k.e(string, "getString(...)");
            Toast.makeText(this, string, 0).show();
        }
    }

    @Override // b.o, s2.b, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("extra_url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.C = stringExtra;
        this.D = getIntent().getBooleanExtra("extra_consent", false);
        if (h.G(this.C)) {
            finish();
            return;
        }
        setRequestedOrientation(1);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-16777216);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setFitsSystemWindows(true);
        if (this.D) {
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.setBackgroundColor(Color.parseColor("#222222"));
            int j8 = j(8);
            linearLayout2.setPadding(j(16), j8, j(8), j8);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            TextView textView = new TextView(this);
            textView.setText(getString(R.string.consent_title));
            textView.setTextColor(-1);
            textView.setTextSize(18.0f);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            Button button = new Button(this);
            button.setText(getString(R.string.consent_accept));
            button.setOnClickListener(new l(this, 0));
            linearLayout2.addView(textView);
            linearLayout2.addView(button);
            linearLayout.addView(linearLayout2);
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.A = frameLayout;
        WebView webView = new WebView(this);
        this.B = webView;
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 == null) {
            k.j("root");
            throw null;
        }
        frameLayout2.addView(webView);
        View view = this.A;
        if (view == null) {
            k.j("root");
            throw null;
        }
        linearLayout.addView(view);
        setContentView(linearLayout);
        WebView webView2 = this.B;
        if (webView2 == null) {
            k.j("web");
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
        k.e(userAgentString, "getUserAgentString(...)");
        settings.setUserAgentString(z6.o.t(z6.o.t(userAgentString, "; wv)", ")"), "Version/4.0 ", ""));
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        WebView webView3 = this.B;
        if (webView3 == null) {
            k.j("web");
            throw null;
        }
        cookieManager.setAcceptThirdPartyCookies(webView3, true);
        WebView webView4 = this.B;
        if (webView4 == null) {
            k.j("web");
            throw null;
        }
        webView4.addJavascriptInterface(new n(this), P);
        WebView webView5 = this.B;
        if (webView5 == null) {
            k.j("web");
            throw null;
        }
        webView5.setWebViewClient(new f4.o(this));
        WebView webView6 = this.B;
        if (webView6 == null) {
            k.j("web");
            throw null;
        }
        webView6.setWebChromeClient(new p(this));
        WebView webView7 = this.B;
        if (webView7 == null) {
            k.j("web");
            throw null;
        }
        webView7.setDownloadListener(new DownloadListener() { // from class: f4.k
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j9) {
                m mVar = PlatePageActivity.Companion;
                r6.k.c(str);
                if (z6.o.v(str, "data:") || z6.o.v(str, "blob:")) {
                    return;
                }
                try {
                    String guessFileName = URLUtil.guessFileName(str, str3, str4);
                    DownloadManager.Request mimeType = new DownloadManager.Request(Uri.parse(str)).setMimeType(str4);
                    PlatePageActivity platePageActivity = PlatePageActivity.this;
                    if (str2 == null) {
                        WebView webView8 = platePageActivity.B;
                        if (webView8 == null) {
                            r6.k.j("web");
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
                    Object systemService = platePageActivity.getSystemService("download");
                    r6.k.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                    ((DownloadManager) systemService).enqueue(destinationInExternalPublicDir);
                    String string = platePageActivity.getString(R.string.web_download_progress, guessFileName);
                    r6.k.e(string, "getString(...)");
                    Toast.makeText(platePageActivity, string, 0).show();
                } catch (Throwable th) {
                    d6.a.b(th);
                }
            }
        });
        a().a(this, new j0(1, this));
        WebView webView8 = this.B;
        if (webView8 == null) {
            k.j("web");
            throw null;
        }
        webView8.loadUrl(this.C);
        WebView webView9 = this.B;
        if (webView9 != null) {
            webView9.postDelayed(new f4.h(this, 0), 1000L);
        } else {
            k.j("web");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        WebView webView = this.B;
        if (webView != null) {
            if (webView == null) {
                k.j("web");
                throw null;
            }
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                WebView webView2 = this.B;
                if (webView2 == null) {
                    k.j("web");
                    throw null;
                }
                viewGroup.removeView(webView2);
            }
            WebView webView3 = this.B;
            if (webView3 == null) {
                k.j("web");
                throw null;
            }
            webView3.removeJavascriptInterface(P);
            WebView webView4 = this.B;
            if (webView4 == null) {
                k.j("web");
                throw null;
            }
            webView4.stopLoading();
            WebView webView5 = this.B;
            if (webView5 == null) {
                k.j("web");
                throw null;
            }
            webView5.destroy();
        }
        super.onDestroy();
    }
}
