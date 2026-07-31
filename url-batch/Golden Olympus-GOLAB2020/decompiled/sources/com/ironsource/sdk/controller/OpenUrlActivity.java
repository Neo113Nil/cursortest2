package com.ironsource.sdk.controller;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.InterfaceC1472h;
import com.ironsource.b9;
import com.ironsource.is;
import com.ironsource.jk;
import com.ironsource.kv;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o8;
import com.ironsource.o9;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.wj;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public class OpenUrlActivity extends Activity {

    /* renamed from: j, reason: collision with root package name */
    private static final String f19095j = "OpenUrlActivity";

    /* renamed from: k, reason: collision with root package name */
    private static final int f19096k = SDKUtils.generateViewId();

    /* renamed from: l, reason: collision with root package name */
    private static final int f19097l = SDKUtils.generateViewId();

    /* renamed from: b, reason: collision with root package name */
    private v f19099b;

    /* renamed from: c, reason: collision with root package name */
    private ProgressBar f19100c;

    /* renamed from: d, reason: collision with root package name */
    boolean f19101d;

    /* renamed from: e, reason: collision with root package name */
    private RelativeLayout f19102e;

    /* renamed from: f, reason: collision with root package name */
    private String f19103f;

    /* renamed from: a, reason: collision with root package name */
    private WebView f19098a = null;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f19104g = new Handler(Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    private boolean f19105h = false;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f19106i = new b();

    class a implements View.OnSystemUiVisibilityChangeListener {
        a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i4) {
            if ((i4 & 4098) == 0) {
                OpenUrlActivity.this.f19104g.removeCallbacks(OpenUrlActivity.this.f19106i);
                OpenUrlActivity.this.f19104g.postDelayed(OpenUrlActivity.this.f19106i, 500L);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f19105h));
        }
    }

    private class c extends WebViewClient {
        private c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f19100c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f19100c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i4, String str, String str2) {
            super.onReceivedError(webView, i4, str, str2);
            try {
                o8 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.c()) {
                    if (featureFlagCatchUrlError.e() && OpenUrlActivity.this.f19099b != null) {
                        OpenUrlActivity.this.f19099b.d(str, str2);
                    }
                    if (featureFlagCatchUrlError.d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th) {
                o9.d().a(th);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean didCrash;
            StringBuilder sb = new StringBuilder();
            sb.append("Chromium process crashed - detail.didCrash():");
            didCrash = renderProcessGoneDetail.didCrash();
            sb.append(didCrash);
            Logger.e(OpenUrlActivity.f19095j, sb.toString());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!new is(str, jk.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().c()).a()) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            try {
                kv.a(OpenUrlActivity.this, str);
                OpenUrlActivity.this.f19099b.z();
            } catch (Exception e4) {
                o9.d().a(e4);
                StringBuilder sb = new StringBuilder();
                sb.append(e4 instanceof ActivityNotFoundException ? b9.c.f15343x : b9.c.f15344y);
                if (OpenUrlActivity.this.f19099b != null) {
                    OpenUrlActivity.this.f19099b.d(sb.toString(), str);
                }
            }
            OpenUrlActivity.this.finish();
            return true;
        }

        /* synthetic */ c(OpenUrlActivity openUrlActivity, a aVar) {
            this();
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        static final String f19110a = "is_store";

        /* renamed from: b, reason: collision with root package name */
        static final String f19111b = "external_url";

        /* renamed from: c, reason: collision with root package name */
        static final String f19112c = "secondary_web_view";

        /* renamed from: d, reason: collision with root package name */
        static final String f19113d = "immersive";

        /* renamed from: e, reason: collision with root package name */
        static final String f19114e = "no activity to handle url";

        /* renamed from: f, reason: collision with root package name */
        static final String f19115f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1472h f19116a;

        /* renamed from: b, reason: collision with root package name */
        private int f19117b;

        /* renamed from: c, reason: collision with root package name */
        private String f19118c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f19119d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f19120e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f19121f = false;

        public e(InterfaceC1472h interfaceC1472h) {
            this.f19116a = interfaceC1472h;
        }

        public Intent a(Context context) {
            Intent a4 = this.f19116a.a(context);
            a4.putExtra("external_url", this.f19118c);
            a4.putExtra("secondary_web_view", this.f19119d);
            a4.putExtra("is_store", this.f19120e);
            a4.putExtra(b9.h.f15508v, this.f19121f);
            if (!(context instanceof Activity)) {
                a4.setFlags(this.f19117b);
            }
            return a4;
        }

        @NotNull
        public e b(boolean z4) {
            this.f19119d = z4;
            return this;
        }

        @NotNull
        public e c(boolean z4) {
            this.f19120e = z4;
            return this;
        }

        @NotNull
        e a(int i4) {
            this.f19117b = i4;
            return this;
        }

        @NotNull
        public e a(String str) {
            this.f19118c = str;
            return this;
        }

        @NotNull
        e a(boolean z4) {
            this.f19121f = z4;
            return this;
        }
    }

    private void e() {
        requestWindowFeature(1);
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    private void g() {
        ViewGroup viewGroup;
        v vVar = this.f19099b;
        if (vVar != null) {
            vVar.a(false, b9.h.f15465Y);
            if (this.f19102e == null || (viewGroup = (ViewGroup) this.f19098a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(f19096k) != null) {
                viewGroup.removeView(this.f19098a);
            }
            if (viewGroup.findViewById(f19097l) != null) {
                viewGroup.removeView(this.f19100c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        v vVar;
        if (this.f19101d && (vVar = this.f19099b) != null) {
            vVar.c(b9.h.f15484j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f19098a.stopLoading();
        this.f19098a.clearHistory();
        try {
            this.f19098a.loadUrl(str);
        } catch (Throwable th) {
            o9.d().a(th);
            Logger.e(f19095j, "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f19098a.canGoBack()) {
            this.f19098a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f19095j, "onCreate()");
        try {
            this.f19099b = (v) wj.b((Context) this).a().j();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.f19103f = extras.getString("external_url");
            this.f19101d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(b9.h.f15508v, false);
            this.f19105h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.f19106i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f19102e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (this.f19105h && (i4 == 25 || i4 == 24)) {
            this.f19104g.postDelayed(this.f19106i, 500L);
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (this.f19105h && z4) {
            runOnUiThread(this.f19106i);
        }
    }

    private void a() {
        if (this.f19100c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.f19100c = progressBar;
            progressBar.setId(f19097l);
        }
        if (findViewById(f19097l) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f19100c.setLayoutParams(layoutParams);
            this.f19100c.setVisibility(4);
            this.f19102e.addView(this.f19100c);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        if (this.f19098a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f19098a = webView;
            webView.setId(f19096k);
            this.f19098a.getSettings().setJavaScriptEnabled(true);
            this.f19098a.setWebViewClient(new c(this, null));
            loadUrl(this.f19103f);
        }
        if (findViewById(f19096k) == null) {
            this.f19102e.addView(this.f19098a, new RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        v vVar = this.f19099b;
        if (vVar != null) {
            vVar.a(true, b9.h.f15465Y);
        }
    }

    private void c() {
        WebView webView = this.f19098a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void d() {
        getWindow().addFlags(16);
    }
}
