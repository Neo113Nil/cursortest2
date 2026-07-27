package com.chicken.road.kedro.laqer.village;

import A1.C0068m;
import B1.C0097d;
import B1.RunnableC0105l;
import B1.m;
import B1.p;
import B1.q;
import B1.r;
import B1.s;
import B1.t;
import B1.v;
import W2.B;
import W2.J;
import W2.s0;
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
import androidx.lifecycle.C0476p;
import androidx.lifecycle.C0477q;
import androidx.lifecycle.C0483x;
import b.o;
import com.chicken.road.kedro.laqer.R;
import com.chicken.road.kedro.laqer.village.VillagePageActivity;
import d3.e;
import f.C0569a;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import kotlin.text.y;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1336k;
import y2.InterfaceC1335j;

@Metadata
/* loaded from: classes.dex */
public final class VillagePageActivity extends o {
    public static final q Companion = new q();
    public FrameLayout B;

    /* renamed from: C, reason: collision with root package name */
    public WebView f6010C;

    /* renamed from: E, reason: collision with root package name */
    public boolean f6012E;

    /* renamed from: F, reason: collision with root package name */
    public String f6013F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6014G;

    /* renamed from: H, reason: collision with root package name */
    public LinearLayout f6015H;

    /* renamed from: I, reason: collision with root package name */
    public TextView f6016I;

    /* renamed from: J, reason: collision with root package name */
    public TextView f6017J;

    /* renamed from: K, reason: collision with root package name */
    public PermissionRequest f6018K;

    /* renamed from: L, reason: collision with root package name */
    public ValueCallback f6019L;

    /* renamed from: A, reason: collision with root package name */
    public final InterfaceC1335j f6009A = C1336k.a(new C0068m(2, this));

    /* renamed from: D, reason: collision with root package name */
    public String f6011D = "";

    /* renamed from: M, reason: collision with root package name */
    public final C0097d f6020M = k(new m(this, 0), new C0569a(0));

    /* renamed from: N, reason: collision with root package name */
    public final C0097d f6021N = k(new m(this, 1), new C0569a(1));

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
    public static String o(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
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

    public final void l() {
        C0477q c0477q;
        Intrinsics.checkNotNullParameter(this, "<this>");
        C0483x c0483x = this.f5561d;
        Intrinsics.checkNotNullParameter(c0483x, "<this>");
        loop0: while (true) {
            c0477q = (C0477q) c0483x.f5493a.get();
            if (c0477q == null) {
                s0 s0Var = new s0(null);
                e eVar = J.f4225a;
                c0477q = new C0477q(c0483x, f.c(b3.m.f5679a.f4364l, s0Var));
                AtomicReference atomicReference = c0483x.f5493a;
                while (!atomicReference.compareAndSet(null, c0477q)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                e eVar2 = J.f4225a;
                B.m(c0477q, b3.m.f5679a.f4364l, null, new C0476p(c0477q, null), 2);
                break loop0;
            }
            break;
        }
        B.m(c0477q, null, null, new s(this, null), 3);
    }

    public final int m(int i2) {
        return (int) TypedValue.applyDimension(1, i2, getResources().getDisplayMetrics());
    }

    public final void n(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
        } catch (ActivityNotFoundException unused) {
            String string = getString(R.string.web_no_app);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Toast.makeText(this, string, 0).show();
        }
    }

    @Override // b.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("extra_url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f6011D = stringExtra;
        this.f6012E = getIntent().getBooleanExtra("extra_consent", false);
        if (y.x(this.f6011D)) {
            finish();
            return;
        }
        setRequestedOrientation(1);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-16777216);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setFitsSystemWindows(true);
        if (this.f6012E) {
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.setBackgroundColor(Color.parseColor("#222222"));
            int m4 = m(8);
            linearLayout2.setPadding(m(16), m4, m(8), m4);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            TextView textView = new TextView(this);
            textView.setText(getString(R.string.consent_title));
            textView.setTextColor(-1);
            textView.setTextSize(18.0f);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            Button button = new Button(this);
            button.setText(getString(R.string.consent_accept));
            button.setOnClickListener(new p(this, 0));
            linearLayout2.addView(textView);
            linearLayout2.addView(button);
            linearLayout.addView(linearLayout2);
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.B = frameLayout;
        WebView webView = new WebView(this);
        this.f6010C = webView;
        FrameLayout frameLayout2 = this.B;
        if (frameLayout2 == null) {
            Intrinsics.g("root");
            throw null;
        }
        frameLayout2.addView(webView);
        View view = this.B;
        if (view == null) {
            Intrinsics.g("root");
            throw null;
        }
        linearLayout.addView(view);
        setContentView(linearLayout);
        WebView webView2 = this.f6010C;
        if (webView2 == null) {
            Intrinsics.g("web");
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
        Intrinsics.checkNotNullExpressionValue(userAgentString, "getUserAgentString(...)");
        settings.setUserAgentString(u.l(u.l(userAgentString, "; wv)", ")"), "Version/4.0 ", ""));
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        WebView webView3 = this.f6010C;
        if (webView3 == null) {
            Intrinsics.g("web");
            throw null;
        }
        cookieManager.setAcceptThirdPartyCookies(webView3, true);
        WebView webView4 = this.f6010C;
        if (webView4 == null) {
            Intrinsics.g("web");
            throw null;
        }
        webView4.addJavascriptInterface(new r(this), "AndroidDownloader");
        WebView webView5 = this.f6010C;
        if (webView5 == null) {
            Intrinsics.g("web");
            throw null;
        }
        webView5.setWebViewClient(new t(this));
        WebView webView6 = this.f6010C;
        if (webView6 == null) {
            Intrinsics.g("web");
            throw null;
        }
        webView6.setWebChromeClient(new B1.u(this));
        WebView webView7 = this.f6010C;
        if (webView7 == null) {
            Intrinsics.g("web");
            throw null;
        }
        webView7.setDownloadListener(new DownloadListener() { // from class: B1.n
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j4) {
                q qVar = VillagePageActivity.Companion;
                Intrinsics.c(str);
                VillagePageActivity villagePageActivity = VillagePageActivity.this;
                villagePageActivity.getClass();
                if (kotlin.text.u.n(str, "data:") || kotlin.text.u.n(str, "blob:")) {
                    return;
                }
                try {
                    AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                    String guessFileName = URLUtil.guessFileName(str, str3, str4);
                    DownloadManager.Request mimeType = new DownloadManager.Request(Uri.parse(str)).setMimeType(str4);
                    if (str2 == null) {
                        WebView webView8 = villagePageActivity.f6010C;
                        if (webView8 == null) {
                            Intrinsics.g("web");
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
                    Object systemService = villagePageActivity.getSystemService("download");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                    ((DownloadManager) systemService).enqueue(destinationInExternalPublicDir);
                    String string = villagePageActivity.getString(R.string.web_download_progress, guessFileName);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    Toast.makeText(villagePageActivity, string, 0).show();
                    Unit unit = Unit.f7487a;
                } catch (Throwable th) {
                    AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                    AbstractC1343r.a(th);
                }
            }
        });
        b().a(this, new v(this));
        WebView webView8 = this.f6010C;
        if (webView8 == null) {
            Intrinsics.g("web");
            throw null;
        }
        webView8.loadUrl(this.f6011D);
        WebView webView9 = this.f6010C;
        if (webView9 != null) {
            webView9.postDelayed(new RunnableC0105l(this, 0), 1000L);
        } else {
            Intrinsics.g("web");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        WebView webView = this.f6010C;
        if (webView != null) {
            if (webView == null) {
                Intrinsics.g("web");
                throw null;
            }
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                WebView webView2 = this.f6010C;
                if (webView2 == null) {
                    Intrinsics.g("web");
                    throw null;
                }
                viewGroup.removeView(webView2);
            }
            WebView webView3 = this.f6010C;
            if (webView3 == null) {
                Intrinsics.g("web");
                throw null;
            }
            webView3.removeJavascriptInterface("AndroidDownloader");
            WebView webView4 = this.f6010C;
            if (webView4 == null) {
                Intrinsics.g("web");
                throw null;
            }
            webView4.stopLoading();
            WebView webView5 = this.f6010C;
            if (webView5 == null) {
                Intrinsics.g("web");
                throw null;
            }
            webView5.destroy();
        }
        super.onDestroy();
    }
}
