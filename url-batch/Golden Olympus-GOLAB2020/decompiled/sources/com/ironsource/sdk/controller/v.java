package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.ironsource.C1427a3;
import com.ironsource.C1442c4;
import com.ironsource.C1495k1;
import com.ironsource.C1508m0;
import com.ironsource.C1554s3;
import com.ironsource.C1603z2;
import com.ironsource.InterfaceC1574u3;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.ch;
import com.ironsource.d9;
import com.ironsource.e9;
import com.ironsource.ep;
import com.ironsource.fh;
import com.ironsource.fp;
import com.ironsource.fr;
import com.ironsource.gb;
import com.ironsource.ge;
import com.ironsource.gh;
import com.ironsource.gr;
import com.ironsource.h9;
import com.ironsource.hh;
import com.ironsource.i9;
import com.ironsource.ig;
import com.ironsource.is;
import com.ironsource.jk;
import com.ironsource.kh;
import com.ironsource.kv;
import com.ironsource.l9;
import com.ironsource.lk;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mh;
import com.ironsource.nm;
import com.ironsource.nw;
import com.ironsource.o9;
import com.ironsource.of;
import com.ironsource.oh;
import com.ironsource.ow;
import com.ironsource.pm;
import com.ironsource.q9;
import com.ironsource.qo;
import com.ironsource.re;
import com.ironsource.rv;
import com.ironsource.s9;
import com.ironsource.sdk.controller.InterfaceC1562f;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.controller.m;
import com.ironsource.sdk.controller.p;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.sk;
import com.ironsource.t9;
import com.ironsource.to;
import com.ironsource.u9;
import com.ironsource.ue;
import com.ironsource.uo;
import com.ironsource.v8;
import com.ironsource.v9;
import com.ironsource.va;
import com.ironsource.ve;
import com.ironsource.vo;
import com.ironsource.wa;
import com.ironsource.wg;
import com.ironsource.wh;
import com.ironsource.wk;
import com.ironsource.x8;
import com.ironsource.y8;
import com.ironsource.y9;
import com.ironsource.za;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class v implements com.ironsource.sdk.controller.l, qo, DownloadListener {

    /* renamed from: b0, reason: collision with root package name */
    private static final String f19376b0 = "about:blank";

    /* renamed from: c0, reason: collision with root package name */
    public static int f19377c0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public static String f19378d0 = "is_store";

    /* renamed from: e0, reason: collision with root package name */
    public static String f19379e0 = "external_url";

    /* renamed from: f0, reason: collision with root package name */
    public static String f19380f0 = "secondary_web_view";

    /* renamed from: g0, reason: collision with root package name */
    private static String f19381g0 = "success";

    /* renamed from: h0, reason: collision with root package name */
    private static String f19382h0 = "fail";

    /* renamed from: A, reason: collision with root package name */
    private String f19383A;

    /* renamed from: B, reason: collision with root package name */
    private C1560d f19384B;

    /* renamed from: C, reason: collision with root package name */
    private rv f19385C;

    /* renamed from: D, reason: collision with root package name */
    private C1427a3 f19386D;

    /* renamed from: G, reason: collision with root package name */
    private wa f19389G;

    /* renamed from: H, reason: collision with root package name */
    private com.ironsource.sdk.controller.o f19390H;

    /* renamed from: I, reason: collision with root package name */
    private com.ironsource.sdk.controller.q f19391I;

    /* renamed from: J, reason: collision with root package name */
    private com.ironsource.sdk.controller.u f19392J;

    /* renamed from: K, reason: collision with root package name */
    private com.ironsource.sdk.controller.i f19393K;

    /* renamed from: L, reason: collision with root package name */
    private C1557a f19394L;

    /* renamed from: M, reason: collision with root package name */
    private com.ironsource.sdk.controller.j f19395M;

    /* renamed from: N, reason: collision with root package name */
    private C1554s3 f19396N;

    /* renamed from: O, reason: collision with root package name */
    private y9 f19397O;

    /* renamed from: P, reason: collision with root package name */
    private nw f19398P;

    /* renamed from: Q, reason: collision with root package name */
    private InterfaceC1559c f19399Q;

    /* renamed from: R, reason: collision with root package name */
    private v8 f19400R;

    /* renamed from: S, reason: collision with root package name */
    private JSONObject f19401S;

    /* renamed from: T, reason: collision with root package name */
    private l.a f19402T;

    /* renamed from: U, reason: collision with root package name */
    private l.b f19403U;

    /* renamed from: V, reason: collision with root package name */
    private l9 f19404V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f19405W;

    /* renamed from: Y, reason: collision with root package name */
    e9 f19407Y;

    /* renamed from: Z, reason: collision with root package name */
    final lk f19408Z;

    /* renamed from: a, reason: collision with root package name */
    private final ig f19409a;

    /* renamed from: a0, reason: collision with root package name */
    private to f19410a0;

    /* renamed from: b, reason: collision with root package name */
    private h9 f19411b;

    /* renamed from: f, reason: collision with root package name */
    private String f19415f;

    /* renamed from: g, reason: collision with root package name */
    private String f19416g;

    /* renamed from: h, reason: collision with root package name */
    private final gb f19417h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19418i;

    /* renamed from: j, reason: collision with root package name */
    private p f19419j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19420k;

    /* renamed from: l, reason: collision with root package name */
    private CountDownTimer f19421l;

    /* renamed from: m, reason: collision with root package name */
    public CountDownTimer f19422m;

    /* renamed from: q, reason: collision with root package name */
    private final o f19426q;

    /* renamed from: r, reason: collision with root package name */
    private View f19427r;

    /* renamed from: s, reason: collision with root package name */
    private FrameLayout f19428s;

    /* renamed from: t, reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f19429t;

    /* renamed from: u, reason: collision with root package name */
    private FrameLayout f19430u;

    /* renamed from: v, reason: collision with root package name */
    private u f19431v;

    /* renamed from: w, reason: collision with root package name */
    private String f19432w;

    /* renamed from: x, reason: collision with root package name */
    private v9 f19433x;

    /* renamed from: y, reason: collision with root package name */
    private u9 f19434y;

    /* renamed from: z, reason: collision with root package name */
    private t9 f19435z;

    /* renamed from: c, reason: collision with root package name */
    private String f19412c = v.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    private String f19413d = "IronSource";

    /* renamed from: e, reason: collision with root package name */
    private final String f19414e = "We're sorry, some error occurred. we will investigate it";

    /* renamed from: n, reason: collision with root package name */
    private int f19423n = 50;

    /* renamed from: o, reason: collision with root package name */
    private int f19424o = 50;

    /* renamed from: p, reason: collision with root package name */
    private String f19425p = b9.e.f15360b;

    /* renamed from: E, reason: collision with root package name */
    private Object f19387E = new Object();

    /* renamed from: F, reason: collision with root package name */
    private boolean f19388F = false;

    /* renamed from: X, reason: collision with root package name */
    private final of f19406X = nm.S().f();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ gh f19437a;

        b(gh ghVar) {
            this.f19437a = ghVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f19399Q.b("controller html - failed to download - " + this.f19437a.b());
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f19439a;

        c(Context context) {
            this.f19439a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.e(this.f19439a);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f19441a;

        d(Context context) {
            this.f19441a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f(this.f19441a);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ fh.e f19443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19444b;

        e(fh.e eVar, String str) {
            this.f19443a = eVar;
            this.f19444b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            s9 a4;
            fh.e eVar = this.f19443a;
            if ((eVar == fh.e.RewardedVideo || eVar == fh.e.Interstitial) && (a4 = v.this.a(eVar)) != null) {
                a4.a(this.f19443a, this.f19444b);
            }
        }
    }

    class f extends v8 {
        f(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.v8, com.ironsource.jf
        public void a() {
            if (v.this.f19418i) {
                v.this.m("none");
            }
        }

        @Override // com.ironsource.v8, com.ironsource.jf
        public void b(String str, JSONObject jSONObject) {
            if (jSONObject == null || !v.this.f19418i) {
                return;
            }
            try {
                jSONObject.put(b9.i.f15581t, str);
                v.this.e(jSONObject);
            } catch (JSONException e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }

        @Override // com.ironsource.v8, com.ironsource.jf
        public void a(String str, JSONObject jSONObject) {
            if (v.this.f19418i) {
                v.this.m(str);
            }
        }
    }

    class g implements nw {
        g() {
        }

        @Override // com.ironsource.nw
        public void a(String str, JSONObject jSONObject) {
            v.this.i(v.this.e(str, jSONObject.toString()));
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f19448a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f19449b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19450c;

        h(JSONObject jSONObject, WebView webView, String str) {
            this.f19448a = jSONObject;
            this.f19449b = webView;
            this.f19450c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(this.f19448a, this.f19449b);
            v.this.l(v.f19376b0);
            v.this.l(this.f19450c);
        }
    }

    class i extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19452a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f19399Q.b(b9.c.f15329j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j4, long j5, int i4) {
            super(j4, j5);
            this.f19452a = i4;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(v.this.f19412c, "Loading Controller Timer Finish");
            int i4 = this.f19452a;
            if (i4 == 3) {
                v.this.b(new a());
            } else {
                v.this.a(i4 + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            Logger.i(v.this.f19412c, "Loading Controller Timer Tick " + j4);
        }
    }

    class j implements s {
        j() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, fh.e eVar, va vaVar) {
            v.this.a(str, eVar, vaVar);
        }
    }

    class k implements s {
        k() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, fh.e eVar, va vaVar) {
            v.this.a(str, eVar, vaVar);
        }
    }

    class l implements s {
        l() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, fh.e eVar, va vaVar) {
            v.this.a(str, eVar, vaVar);
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ fh.e f19458a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ va f19459b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19460c;

        m(fh.e eVar, va vaVar, String str) {
            this.f19458a = eVar;
            this.f19459b = vaVar;
            this.f19460c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            va vaVar;
            fh.e eVar = fh.e.RewardedVideo;
            fh.e eVar2 = this.f19458a;
            if ((eVar != eVar2 && fh.e.Interstitial != eVar2 && fh.e.Banner != eVar2) || (vaVar = this.f19459b) == null || TextUtils.isEmpty(vaVar.h())) {
                return;
            }
            s9 a4 = v.this.a(this.f19458a);
            Log.d(v.this.f19412c, "onAdProductInitFailed (message:" + this.f19460c + ")(" + this.f19458a + ")");
            if (a4 != null) {
                a4.a(this.f19458a, this.f19459b.h(), this.f19460c);
            }
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    private class o extends WebChromeClient {
        private o() {
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(v.this.f19408Z.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z4, boolean z5, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new q(v.this, null));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            if (v.this.f19427r == null) {
                return;
            }
            v.this.f19427r.setVisibility(8);
            v.this.f19428s.removeView(v.this.f19427r);
            v.this.f19427r = null;
            v.this.f19428s.setVisibility(8);
            v.this.f19429t.onCustomViewHidden();
            v.this.f19408Z.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            v.this.f19408Z.setVisibility(8);
            if (v.this.f19427r != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            v.this.f19428s.addView(view);
            v.this.f19427r = view;
            v.this.f19429t = customViewCallback;
            v.this.f19428s.setVisibility(0);
        }

        /* synthetic */ o(v vVar, f fVar) {
            this();
        }
    }

    static class p {

        /* renamed from: a, reason: collision with root package name */
        fh.e f19464a;

        /* renamed from: b, reason: collision with root package name */
        String f19465b;

        public p(fh.e eVar, String str) {
            this.f19464a = eVar;
            this.f19465b = str;
        }

        String a() {
            return this.f19465b;
        }

        fh.e b() {
            return this.f19464a;
        }
    }

    private class q extends WebViewClient {
        private q() {
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean didCrash;
            String str = v.this.f19412c;
            StringBuilder sb = new StringBuilder();
            sb.append("Chromium process crashed - detail.didCrash(): ");
            didCrash = renderProcessGoneDetail.didCrash();
            sb.append(didCrash);
            Logger.e(str, sb.toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context q4 = v.this.q();
            q4.startActivity(new OpenUrlActivity.e(new k.b()).a(str).b(false).a(q4));
            return true;
        }

        /* synthetic */ q(v vVar, f fVar) {
            this();
        }
    }

    public class r {

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19468a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f19469b;

            a(String str, String str2) {
                this.f19468a = str;
                this.f19469b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f19468a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f19412c, "onRVShowFail(message:" + this.f19468a + ")");
                v.this.f19433x.d(this.f19469b, str);
            }
        }

        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19471a;

            b(String str) {
                this.f19471a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f19412c, "onInterstitialInitSuccess()");
                v.this.f19434y.a(fh.e.Interstitial, this.f19471a, (C1603z2) null);
            }
        }

        class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19473a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f19474b;

            c(String str, String str2) {
                this.f19473a = str;
                this.f19474b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f19473a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f19412c, "onInterstitialInitFail(message:" + str + ")");
                v.this.f19434y.a(fh.e.Interstitial, this.f19474b, str);
            }
        }

        class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s9 f19476a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ fh.e f19477b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f19478c;

            d(s9 s9Var, fh.e eVar, String str) {
                this.f19476a = s9Var;
                this.f19477b = eVar;
                this.f19478c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f19476a.c(this.f19477b, this.f19478c);
            }
        }

        class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19480a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ JSONObject f19481b;

            e(String str, JSONObject jSONObject) {
                this.f19480a = str;
                this.f19481b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f19434y.a(this.f19480a, this.f19481b);
            }
        }

        class f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19483a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f19484b;

            f(String str, String str2) {
                this.f19483a = str;
                this.f19484b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f19483a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f19434y.c(this.f19484b, str);
            }
        }

        class g implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19486a;

            g(String str) {
                this.f19486a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f19412c, "onBannerInitSuccess()");
                v.this.f19435z.a(fh.e.Banner, this.f19486a, (C1603z2) null);
            }
        }

        class h implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19488a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f19489b;

            h(String str, String str2) {
                this.f19488a = str;
                this.f19489b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f19488a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f19412c, "onBannerInitFail(message:" + str + ")");
                v.this.f19435z.a(fh.e.Banner, this.f19489b, str);
            }
        }

        class i implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19491a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ wg f19492b;

            i(String str, wg wgVar) {
                this.f19491a = str;
                this.f19492b = wgVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f19412c, "onBannerLoadSuccess()");
                v.this.f19435z.a(this.f19491a, this.f19492b);
            }
        }

        class j implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19494a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f19495b;

            j(String str, String str2) {
                this.f19494a = str;
                this.f19495b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f19412c, "onLoadBannerFail()");
                String str = this.f19494a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f19435z.a(this.f19495b, str);
            }
        }

        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.F();
            }
        }

        class l implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19498a;

            l(String str) {
                this.f19498a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (new JSONObject(this.f19498a).has(InterfaceC1562f.b.f19237b)) {
                        v.this.f19402T.a(InterfaceC1562f.a.a(this.f19498a));
                    } else {
                        v.this.f19403U.a(pm.a(this.f19498a));
                    }
                } catch (JSONException e4) {
                    o9.d().a(e4);
                    Logger.e(v.this.f19412c, "failed to parse received message");
                    IronLog.INTERNAL.error(e4.toString());
                }
            }
        }

        class m implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ fh.e f19500a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f19501b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f19502c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ JSONObject f19503d;

            m(fh.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f19500a = eVar;
                this.f19501b = str;
                this.f19502c = str2;
                this.f19503d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                s9 a4;
                fh.e eVar = this.f19500a;
                if ((eVar == fh.e.Interstitial || eVar == fh.e.RewardedVideo || eVar == fh.e.Banner) && (a4 = v.this.a(eVar)) != null) {
                    a4.a(this.f19500a, this.f19501b, this.f19502c, this.f19503d);
                }
            }
        }

        class n implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19505a;

            n(String str) {
                this.f19505a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.i(v.this.f19412c, "omidAPI(" + this.f19505a + ")");
                    v.this.f19390H.a(new gr(this.f19505a).toString(), r.this.new w());
                } catch (Exception e4) {
                    o9.d().a(e4);
                    IronLog.INTERNAL.error(e4.toString());
                    Logger.i(v.this.f19412c, "omidAPI failed with exception " + e4.getMessage());
                }
            }
        }

        class o implements Runnable {
            o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.B();
            }
        }

        class p implements Runnable {
            p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f19408Z.removeJavascriptInterface(b9.f15267e);
            }
        }

        class q implements Runnable {
            q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f19408Z.getSettings().setMixedContentMode(0);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$r, reason: collision with other inner class name */
        class RunnableC0161r implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f19510a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f19511b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1603z2 f19512c;

            RunnableC0161r(int i4, String str, C1603z2 c1603z2) {
                this.f19510a = i4;
                this.f19511b = str;
                this.f19512c = c1603z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f19510a <= 0) {
                    v.this.f19433x.c(this.f19511b);
                } else {
                    Log.d(v.this.f19412c, "onRVInitSuccess()");
                    v.this.f19433x.a(fh.e.RewardedVideo, this.f19511b, this.f19512c);
                }
            }
        }

        class s implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19514a;

            s(String str) {
                this.f19514a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    v.this.f19395M.a(new JSONObject(this.f19514a), r.this.new w());
                } catch (Exception e4) {
                    o9.d().a(e4);
                    IronLog.INTERNAL.error(e4.toString());
                    Logger.i(v.this.f19412c, "fileSystemAPI failed with exception " + e4.getMessage());
                }
            }
        }

        class t implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19516a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f19517b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f19518c;

            t(String str, String str2, int i4) {
                this.f19516a = str;
                this.f19517b = str2;
                this.f19518c = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f19516a.equalsIgnoreCase(fh.e.RewardedVideo.toString())) {
                    v.this.f19433x.a(this.f19517b, this.f19518c);
                }
            }
        }

        class u implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19520a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f19521b;

            u(String str, int i4) {
                this.f19520a = str;
                this.f19521b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f19434y.onInterstitialAdRewarded(this.f19520a, this.f19521b);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$v, reason: collision with other inner class name */
        class RunnableC0162v implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19523a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f19524b;

            RunnableC0162v(String str, String str2) {
                this.f19523a = str;
                this.f19524b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f19523a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f19412c, "onRVInitFail(message:" + str + ")");
                v.this.f19433x.a(fh.e.RewardedVideo, this.f19524b, str);
            }
        }

        public class w implements sk {
            public w() {
            }

            @Override // com.ironsource.sk
            public void a(boolean z4, @NotNull String str, gr grVar) {
                grVar.b(z4 ? v.f19381g0 : v.f19382h0, str);
                v.this.a(grVar.toString(), z4, (String) null, (String) null);
            }

            @Override // com.ironsource.sk
            public void a(boolean z4, @NotNull String str, @NotNull String str2) {
                gr grVar = new gr();
                grVar.b(z4 ? v.f19381g0 : v.f19382h0, str);
                grVar.b("data", str2);
                v.this.a(grVar.toString(), z4, (String) null, (String) null);
            }

            @Override // com.ironsource.sk
            public void a(boolean z4, @NotNull String str, JSONObject jSONObject) {
                String str2;
                try {
                    if (z4) {
                        str2 = v.f19381g0;
                    } else {
                        str2 = v.f19382h0;
                    }
                    jSONObject.put(str2, str);
                    v.this.a(jSONObject.toString(), z4, (String) null, (String) null);
                } catch (JSONException e4) {
                    o9.d().a(e4);
                    IronLog.INTERNAL.error(e4.toString());
                }
            }
        }

        public r() {
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.i(v.this.f19412c, "adClicked(" + str + ")");
            gr grVar = new gr(str);
            String d4 = grVar.d(b9.h.f15490m);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            fh.e g4 = v.this.g(d4);
            s9 a4 = v.this.a(g4);
            if (g4 == null || a4 == null) {
                return;
            }
            v.this.b(new d(a4, g4, fetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            Log.d(v.this.f19413d, "adCredited(" + str + ")");
            gr grVar = new gr(str);
            String d4 = grVar.d(b9.h.f15486k);
            int parseInt = d4 != null ? Integer.parseInt(d4) : 0;
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            String d5 = grVar.d(b9.h.f15490m);
            if (TextUtils.isEmpty(d5)) {
                Log.d(v.this.f19413d, "adCredited | product type is missing");
            }
            if (fh.e.Interstitial.toString().equalsIgnoreCase(d5)) {
                a(fetchDemandSourceId, parseInt);
            } else if (v.this.q(d5)) {
                v.this.b(new t(d5, fetchDemandSourceId, parseInt));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            Logger.i(v.this.f19412c, "adUnitsReady(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new gr(str));
            C1603z2 c1603z2 = new C1603z2(str);
            if (!c1603z2.g()) {
                v.this.a(str, false, b9.c.f15337r, (String) null);
                return;
            }
            v.this.a(str, true, (String) null, (String) null);
            String d4 = c1603z2.d();
            if (fh.e.RewardedVideo.toString().equalsIgnoreCase(d4) && v.this.q(d4)) {
                v.this.b(new RunnableC0161r(Integer.parseInt(c1603z2.c()), fetchDemandSourceId, c1603z2));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                Logger.i(v.this.f19412c, "adViewAPI(" + str + ")");
                v.this.f19394L.a(new gr(str).toString(), new w());
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
                Logger.i(v.this.f19412c, "adViewAPI failed with exception " + e4.getMessage());
            }
        }

        @JavascriptInterface
        public void androidSandboxApi(final String str) {
            ig.f16710a.b(new Runnable() { // from class: com.ironsource.sdk.controller.E
                @Override // java.lang.Runnable
                public final void run() {
                    v.r.this.b(str);
                }
            });
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(v.this.f19412c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            fh.e g4;
            try {
                Logger.i(v.this.f19412c, "cleanAdInstance(" + str + ")");
                gr grVar = new gr(str);
                String d4 = grVar.d(b9.h.f15490m);
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
                if (TextUtils.isEmpty(fetchDemandSourceId) || (g4 = v.this.g(d4)) == null) {
                    return;
                }
                v.this.f19389G.b(g4, fetchDemandSourceId);
            } catch (Exception e4) {
                o9.d().a(e4);
                v.this.a(str, false, e4.getMessage(), (String) null);
                IronLog.INTERNAL.error(e4.toString());
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> a4 = jk.e().a();
                gr grVar = new gr(str);
                if (!a4.isEmpty()) {
                    grVar.b(b9.h.f15513x0, a4.toString());
                }
                v.this.a(grVar.toString(), true, (String) null, (String) null);
            } catch (Exception e4) {
                o9.d().a(e4);
                v.this.a(str, false, e4.getMessage(), (String) null);
                IronLog.INTERNAL.error(e4.toString());
            }
        }

        void d(String str) {
            v.this.i(v.this.a(b9.g.f15403e, str, (String) null, (String) null));
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            v vVar;
            String str2;
            try {
                Logger.i(v.this.f19412c, "deleteFile(" + str + ")");
                gr grVar = new gr(str);
                String d4 = grVar.d(b9.h.f15468b);
                String d5 = grVar.d("path");
                if (d5 != null && !TextUtils.isEmpty(d4)) {
                    oh ohVar = new oh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.f19383A, d5), d4);
                    IronSourceStorageUtils.ensurePathSafety(ohVar, v.this.f19383A);
                    if (ohVar.exists()) {
                        v.this.a(str, IronSourceStorageUtils.deleteFile(ohVar), (String) null, (String) null);
                        return;
                    } else {
                        vVar = v.this;
                        str2 = b9.c.f15325f;
                        vVar.a(str, false, str2, "1");
                    }
                }
                vVar = v.this;
                str2 = b9.c.f15326g;
                vVar.a(str, false, str2, "1");
            } catch (Exception e4) {
                o9.d().a(e4);
                v.this.a(str, false, e4.getMessage(), (String) null);
                IronLog.INTERNAL.error(e4.toString());
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            v vVar;
            String str2;
            try {
                Logger.i(v.this.f19412c, "deleteFolder(" + str + ")");
                String d4 = new gr(str).d("path");
                if (d4 == null) {
                    vVar = v.this;
                    str2 = b9.c.f15326g;
                } else {
                    oh ohVar = new oh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.f19383A, d4));
                    IronSourceStorageUtils.ensurePathSafety(ohVar, v.this.f19383A);
                    if (ohVar.exists()) {
                        v.this.a(str, IronSourceStorageUtils.deleteFolder(ohVar.getPath()), (String) null, (String) null);
                        return;
                    } else {
                        vVar = v.this;
                        str2 = b9.c.f15324e;
                    }
                }
                vVar.a(str, false, str2, "1");
            } catch (Exception e4) {
                o9.d().a(e4);
                v.this.a(str, false, e4.getMessage(), (String) null);
                IronLog.INTERNAL.error(e4.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                Logger.i(v.this.f19412c, "deviceDataAPI(" + str + ")");
                v.this.f19393K.a(new gr(str).toString(), new w());
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
                Logger.i(v.this.f19412c, "deviceDataAPI failed with exception " + e4.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            Logger.i(v.this.f19412c, "displayWebView(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            gr grVar = new gr(str);
            boolean booleanValue = ((Boolean) grVar.b("display")).booleanValue();
            String d4 = grVar.d(b9.h.f15490m);
            boolean c4 = grVar.c(b9.h.f15506u);
            String d5 = grVar.d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            boolean c5 = grVar.c(b9.h.f15517z0);
            if (!booleanValue) {
                v.this.a(u.Gone);
                v.this.o();
                return;
            }
            v.this.f19388F = grVar.c(b9.h.f15508v);
            boolean c6 = grVar.c(b9.h.f15514y);
            u v4 = v.this.v();
            u uVar = u.Display;
            if (v4 == uVar) {
                Logger.i(v.this.f19412c, "State: " + v.this.f19431v);
                return;
            }
            v.this.a(uVar);
            Logger.i(v.this.f19412c, "State: " + v.this.f19431v);
            Context q4 = v.this.q();
            String t4 = v.this.t();
            int L3 = v.this.f19406X.L(q4);
            if (c4) {
                com.ironsource.sdk.controller.h hVar = new com.ironsource.sdk.controller.h(q4);
                hVar.addView(v.this.f19430u);
                hVar.a(v.this);
                return;
            }
            Intent intent = c6 ? new Intent(q4, (Class<?>) InterstitialActivity.class) : new Intent(q4, (Class<?>) ControllerActivity.class);
            fh.e eVar = fh.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(d4)) {
                if ("application".equals(t4)) {
                    t4 = SDKUtils.translateRequestedOrientation(v.this.f19406X.N(q4));
                }
                intent.putExtra(b9.h.f15490m, eVar.toString());
                v.this.f19386D.a(eVar.ordinal());
                v.this.f19386D.f(fetchDemandSourceId);
                if (v.this.q(eVar.toString())) {
                    v.this.f19433x.b(eVar, fetchDemandSourceId);
                }
            } else {
                fh.e eVar2 = fh.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(d4)) {
                    if ("application".equals(t4)) {
                        t4 = SDKUtils.translateRequestedOrientation(v.this.f19406X.N(q4));
                    }
                    intent.putExtra(b9.h.f15490m, eVar2.toString());
                }
            }
            if (d5 != null) {
                intent.putExtra("adViewId", d5);
            }
            intent.putExtra(b9.h.f15517z0, c5);
            intent.setFlags(536870912);
            intent.putExtra(b9.h.f15508v, v.this.f19388F);
            intent.putExtra(b9.h.f15429A, t4);
            intent.putExtra(b9.h.f15431B, L3);
            v vVar = v.this;
            vVar.f19419j = new p(vVar.g(d4), fetchDemandSourceId);
            q4.startActivity(intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(String str) {
            try {
                Logger.i(v.this.f19412c, "dsSharedSignalsAPI(" + str + ")");
                v.this.f19397O.a(new gr(str).toString(), new w());
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
                Logger.i(v.this.f19412c, "dsSharedSignalsAPI failed with exception " + e4.getMessage());
            }
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            Logger.i(v.this.f19412c, "fileSystemAPI(" + str + ")");
            v.this.a(new s(str));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) == false) goto L11;
         */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void getApplicationInfo(String str) {
            Logger.i(v.this.f19412c, "getApplicationInfo(" + str + ")");
            String e4 = v.this.e(str);
            String d4 = v.this.d(str);
            gr grVar = new gr(str);
            Object[] f4 = v.this.f(grVar.d(b9.h.f15490m), SDKUtils.fetchDemandSourceId(grVar));
            String str2 = (String) f4[0];
            if (((Boolean) f4[1]).booleanValue()) {
                if (!TextUtils.isEmpty(d4)) {
                    e4 = d4;
                }
                e4 = null;
            }
            if (TextUtils.isEmpty(e4)) {
                return;
            }
            v.this.i(v.this.a(e4, str2, b9.g.f15413n, b9.g.f15414o));
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            Logger.i(v.this.f19412c, "getCachedFilesMap(" + str + ")");
            String e4 = v.this.e(str);
            if (TextUtils.isEmpty(e4)) {
                return;
            }
            gr grVar = new gr(str);
            if (!grVar.a("path")) {
                v.this.a(str, false, b9.c.f15338s, (String) null);
                return;
            }
            String str2 = (String) grVar.b("path");
            if (!IronSourceStorageUtils.isPathExist(v.this.f19383A, str2)) {
                v.this.a(str, false, b9.c.f15339t, (String) null);
                return;
            }
            v.this.i(v.this.a(e4, IronSourceStorageUtils.getCachedFilesMap(v.this.f19383A, str2), b9.g.f15418s, b9.g.f15417r));
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String e4;
            Logger.i(v.this.f19412c, "getConnectivityInfo(" + str + ")");
            gr grVar = new gr(str);
            String d4 = grVar.d(v.f19381g0);
            String d5 = grVar.d(v.f19382h0);
            JSONObject jSONObject = new JSONObject();
            if (v.this.f19400R != null) {
                jSONObject = v.this.f19400R.a(v.this.f19408Z.getContext());
            }
            if (jSONObject.length() > 0) {
                e4 = v.this.e(d4, jSONObject.toString());
            } else {
                e4 = v.this.e(d5, v.this.a("errMsg", b9.c.f15314A, null, null, null, null, null, null, null, false));
            }
            v.this.i(e4);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            Logger.i(v.this.f19412c, "getControllerConfig(" + str + ")");
            String d4 = new gr(str).d(v.f19381g0);
            if (TextUtils.isEmpty(d4)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            c(controllerConfigAsJSONObject);
            v.this.i(v.this.e(d4, controllerConfigAsJSONObject.toString()));
        }

        @JavascriptInterface
        public void getDemandSourceState(String str) {
            String d4;
            Logger.i(v.this.f19412c, "getMediationState(" + str + ")");
            gr grVar = new gr(str);
            String d5 = grVar.d("demandSourceName");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            String d6 = grVar.d(b9.h.f15490m);
            if (d6 == null || d5 == null) {
                return;
            }
            try {
                fh.e productType = SDKUtils.getProductType(d6);
                if (productType != null) {
                    va a4 = v.this.f19389G.a(productType, fetchDemandSourceId);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(b9.h.f15490m, d6);
                    jSONObject.put("demandSourceName", d5);
                    jSONObject.put("demandSourceId", fetchDemandSourceId);
                    if (a4 == null || a4.a(-1)) {
                        d4 = v.this.d(str);
                    } else {
                        d4 = v.this.e(str);
                        jSONObject.put(b9.h.f15456P, a4.j());
                    }
                    a(d4, jSONObject.toString());
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                v.this.a(str, false, e4.getMessage(), (String) null);
                IronLog.INTERNAL.error(e4.toString());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) == false) goto L11;
         */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void getDeviceStatus(String str) {
            Logger.i(v.this.f19412c, "getDeviceStatus(" + str + ")");
            String e4 = v.this.e(str);
            String d4 = v.this.d(str);
            v vVar = v.this;
            Object[] d5 = vVar.d(vVar.f19408Z.getContext());
            String str2 = (String) d5[0];
            if (((Boolean) d5[1]).booleanValue()) {
                if (!TextUtils.isEmpty(d4)) {
                    e4 = d4;
                }
                e4 = null;
            }
            if (TextUtils.isEmpty(e4)) {
                return;
            }
            v.this.i(v.this.a(e4, str2, b9.g.f15411l, b9.g.f15412m));
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            Logger.i(v.this.f19412c, "getDeviceVolume(" + str + ")");
            try {
                Context context = v.this.f19408Z.getContext();
                float a4 = za.b(context).a(context);
                gr grVar = new gr(str);
                grVar.b(b9.i.f15534P, String.valueOf(a4));
                v.this.a(grVar.toString(), true, (String) null, (String) null);
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            Logger.i(v.this.f19412c, "getInitSummery(" + str + ")");
            gr grVar = new gr(str);
            grVar.a(b9.i.f15579r0, v.this.f19401S);
            v.this.a(grVar.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            mh.a(fr.f16298z, new hh().a(cc.f15753y, str).a());
            String e4 = v.this.e(str);
            String jSONObject = SDKUtils.getOrientation(v.this.f19408Z.getContext()).toString();
            if (TextUtils.isEmpty(e4)) {
                return;
            }
            v.this.i(v.this.a(e4, jSONObject, b9.g.f15395X, b9.g.f15396Y));
        }

        @JavascriptInterface
        public void getUserData(String str) {
            Logger.i(v.this.f19412c, "getUserData(" + str + ")");
            gr grVar = new gr(str);
            if (!grVar.a(b9.h.f15463W)) {
                v.this.a(str, false, b9.c.f15319F, (String) null);
                return;
            }
            String e4 = v.this.e(str);
            String d4 = grVar.d(b9.h.f15463W);
            v.this.i(v.this.e(e4, v.this.a(d4, jk.e().a(d4), null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                Logger.i(v.this.f19412c, "iabTokenAPI(" + str + ")");
                v.this.f19392J.a(new gr(str).toString(), new w());
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
                Logger.i(v.this.f19412c, "iabTokenAPI failed with exception " + e4.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.i(v.this.f19412c, "initController(" + str + ")");
            gr grVar = new gr(str);
            CountDownTimer countDownTimer = v.this.f19422m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                v.this.f19422m = null;
            }
            if (grVar.a(b9.h.f15498q)) {
                String d4 = grVar.d(b9.h.f15498q);
                if (b9.h.f15502s.equalsIgnoreCase(d4)) {
                    v.this.f19418i = true;
                    v.this.f19399Q.c();
                    return;
                }
                if (b9.h.f15500r.equalsIgnoreCase(d4)) {
                    v.this.f19399Q.b();
                    return;
                }
                if (!b9.h.f15504t.equalsIgnoreCase(d4)) {
                    Logger.i(v.this.f19412c, "No STAGE mentioned! should not get here!");
                    return;
                }
                String d5 = grVar.d("errMsg");
                v.this.f19399Q.b("controller js failed to initialize : " + d5);
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            v.this.c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            Logger.i(v.this.f19412c, "onAdWindowsClosed(" + str + ")");
            v.this.f19386D.a();
            v.this.f19386D.f(null);
            v.this.f19419j = null;
            gr grVar = new gr(str);
            String d4 = grVar.d(b9.h.f15490m);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            fh.e g4 = v.this.g(d4);
            Log.d(v.this.f19413d, "onAdClosed() with type " + g4);
            if (v.this.q(d4)) {
                v.this.a(g4, fetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            Logger.i(v.this.f19412c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            Logger.i(v.this.f19412c, "onGetApplicationInfoFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            Logger.i(v.this.f19412c, "onGetApplicationInfoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            Logger.i(v.this.f19412c, "onGetCachedFilesMapFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            Logger.i(v.this.f19412c, "onGetCachedFilesMapSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            Logger.i(v.this.f19412c, "onGetDeviceStatusFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            Logger.i(v.this.f19412c, "onGetDeviceStatusSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.i(v.this.f19412c, "onInitBannerFail(" + str + ")");
            gr grVar = new gr(str);
            String d4 = grVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.f19412c, "onInitBannerFail failed with no demand source");
                return;
            }
            wa waVar = v.this.f19389G;
            fh.e eVar = fh.e.Banner;
            va a4 = waVar.a(eVar, fetchDemandSourceId);
            if (a4 != null) {
                a4.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new h(d4, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(v.this.f19412c, "onInitBannerSuccess()");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new gr(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.f19412c, "onInitBannerSuccess failed with no demand source");
            } else if (v.this.q(fh.e.Banner.toString())) {
                v.this.b(new g(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.i(v.this.f19412c, "onInitInterstitialFail(" + str + ")");
            gr grVar = new gr(str);
            String d4 = grVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.f19412c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            wa waVar = v.this.f19389G;
            fh.e eVar = fh.e.Interstitial;
            va a4 = waVar.a(eVar, fetchDemandSourceId);
            if (a4 != null) {
                a4.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new c(d4, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(v.this.f19412c, "onInitInterstitialSuccess()");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new gr(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.f19412c, "onInitInterstitialSuccess failed with no demand source");
            } else if (v.this.q(fh.e.Interstitial.toString())) {
                v.this.b(new b(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.i(v.this.f19412c, "onInitRewardedVideoFail(" + str + ")");
            gr grVar = new gr(str);
            String d4 = grVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            wa waVar = v.this.f19389G;
            fh.e eVar = fh.e.RewardedVideo;
            va a4 = waVar.a(eVar, fetchDemandSourceId);
            if (a4 != null) {
                a4.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new RunnableC0162v(d4, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(v.this.f19412c, "onLoadBannerFail()");
            gr grVar = new gr(str);
            String d4 = grVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            v.this.a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && v.this.q(fh.e.Banner.toString())) {
                v.this.b(new j(d4, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(v.this.f19412c, "onLoadBannerSuccess()");
            gr grVar = new gr(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            String d4 = grVar.d("adViewId");
            v.this.a(str, true, (String) null, (String) null);
            wh a4 = ch.a().a(d4);
            if (a4 == null) {
                v.this.f19435z.a(fetchDemandSourceId, "not found view for the current adViewId= " + d4);
                return;
            }
            if (a4 instanceof wg) {
                wg wgVar = (wg) a4;
                if (v.this.q(fh.e.Banner.toString())) {
                    v.this.b(new i(fetchDemandSourceId, wgVar));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.i(v.this.f19412c, "onLoadInterstitialFail(" + str + ")");
            gr grVar = new gr(str);
            String d4 = grVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (v.this.q(fh.e.Interstitial.toString())) {
                v.this.b(new f(d4, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.i(v.this.f19412c, "onLoadInterstitialSuccess(" + str + ")");
            gr grVar = new gr(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            JSONObject a4 = grVar.a();
            a(fetchDemandSourceId, true);
            v.this.a(str, true, (String) null, (String) null);
            if (v.this.q(fh.e.Interstitial.toString())) {
                v.this.b(new e(fetchDemandSourceId, a4));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            Logger.i(v.this.f19412c, "onReceivedMessage(" + str + ")");
            ig.f16710a.b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.i(v.this.f19412c, "onShowInterstitialFail(" + str + ")");
            gr grVar = new gr(str);
            final String d4 = grVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            final boolean q4 = v.this.q(fh.e.Interstitial.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.F
                @Override // java.lang.Runnable
                public final void run() {
                    v.r.this.a(q4, d4, fetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            Logger.i(v.this.f19412c, "onShowInterstitialSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new gr(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.f19412c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C1427a3 c1427a3 = v.this.f19386D;
            fh.e eVar = fh.e.Interstitial;
            c1427a3.a(eVar.ordinal());
            v.this.f19386D.f(fetchDemandSourceId);
            final boolean q4 = v.this.q(eVar.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.D
                @Override // java.lang.Runnable
                public final void run() {
                    v.r.this.a(q4, fetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.i(v.this.f19412c, "onShowRewardedVideoFail(" + str + ")");
            gr grVar = new gr(str);
            String d4 = grVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
            if (v.this.q(fh.e.RewardedVideo.toString())) {
                v.this.b(new a(d4, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            Logger.i(v.this.f19412c, "onShowRewardedVideoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            Log.d(v.this.f19412c, "onVideoStatusChanged(" + str + ")");
            gr grVar = new gr(str);
            String d4 = grVar.d(b9.h.f15490m);
            if (v.this.f19385C == null || TextUtils.isEmpty(d4)) {
                return;
            }
            String d5 = grVar.d("status");
            if (b9.h.f15473d0.equalsIgnoreCase(d5)) {
                v.this.f19385C.onVideoStarted();
                return;
            }
            if (b9.h.f15475e0.equalsIgnoreCase(d5)) {
                v.this.f19385C.onVideoPaused();
                return;
            }
            if (b9.h.f15477f0.equalsIgnoreCase(d5)) {
                v.this.f19385C.onVideoResumed();
                return;
            }
            if (b9.h.f15479g0.equalsIgnoreCase(d5)) {
                v.this.f19385C.onVideoEnded();
                return;
            }
            if (b9.h.f15481h0.equalsIgnoreCase(d5)) {
                v.this.f19385C.onVideoStopped();
                return;
            }
            Logger.i(v.this.f19412c, "onVideoStatusChanged: unknown status: " + d5);
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                Logger.i(v.this.f19412c, "openUrl(" + str + ")");
                gr grVar = new gr(str);
                p.c a4 = new p.a(grVar.d("method"), new vo(v.this.f19388F, 805306368)).a(grVar.c(b9.h.f15452L0) ? v.this.f19408Z.getContext() : v.this.q(), new uo(grVar.d("url"), grVar.d(b9.h.f15462V)));
                if (a4 instanceof p.c.a) {
                    v.this.a(str, false, ((p.c.a) a4).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e4) {
                v.this.a(str, false, e4.getLocalizedMessage(), (String) null);
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            v.this.c(new o());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            try {
                Logger.i(v.this.f19412c, "permissionsAPI(" + str + ")");
                v.this.f19391I.a(new gr(str).toString(), new w());
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
                Logger.i(v.this.f19412c, "permissionsAPI failed with exception " + e4.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            Exception exc;
            String str2;
            try {
                Logger.i(v.this.f19412c, "postAdEventNotification(" + str + ")");
                gr grVar = new gr(str);
                String d4 = grVar.d(b9.h.f15485j0);
                try {
                    if (TextUtils.isEmpty(d4)) {
                        v.this.a(str, false, b9.c.f15342w, (String) null);
                        return;
                    }
                    String d5 = grVar.d(b9.h.f15487k0);
                    String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(grVar);
                    String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d5;
                    JSONObject jSONObject = (JSONObject) grVar.b(b9.h.f15489l0);
                    String d6 = grVar.d(b9.h.f15490m);
                    fh.e g4 = v.this.g(d6);
                    try {
                        if (!v.this.q(d6)) {
                            v.this.a(str, false, b9.c.f15341v, (String) null);
                            return;
                        }
                        String e4 = v.this.e(str);
                        if (TextUtils.isEmpty(e4)) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            v.this.i(v.this.a(e4, v.this.a(b9.h.f15490m, d6, b9.h.f15485j0, d4, "demandSourceName", d5, "demandSourceId", str2, null, false), b9.g.f15400c0, b9.g.f15402d0));
                        }
                        try {
                            v.this.b(new m(g4, str2, d4, jSONObject));
                        } catch (Exception e5) {
                            e = e5;
                            exc = e;
                            o9.d().a(exc);
                            IronLog.INTERNAL.error(exc.toString());
                        }
                    } catch (Exception e6) {
                        e = e6;
                    }
                } catch (Exception e7) {
                    exc = e7;
                    o9.d().a(exc);
                    IronLog.INTERNAL.error(exc.toString());
                }
            } catch (Exception e8) {
                e = e8;
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            Logger.i(v.this.f19412c, "removeCloseEventHandler(" + str + ")");
            if (v.this.f19421l != null) {
                v.this.f19421l.cancel();
            }
            v.this.f19420k = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            v.this.c(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            Logger.i(v.this.f19412c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            v.this.c(new k());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            v vVar;
            String str2;
            try {
                Logger.i(v.this.f19412c, "saveFile(" + str + ")");
                gr grVar = new gr(str);
                String d4 = grVar.d("path");
                String d5 = grVar.d(b9.h.f15468b);
                if (TextUtils.isEmpty(d5)) {
                    v.this.a(str, false, b9.c.f15326g, "1");
                    return;
                }
                oh ohVar = new oh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.f19383A, d4), SDKUtils.getFileName(d5));
                IronSourceStorageUtils.ensurePathSafety(ohVar, v.this.f19383A);
                if (v.this.f19406X.a(v.this.f19383A) <= 0) {
                    vVar = v.this;
                    str2 = d9.f15832A;
                } else if (ohVar.exists()) {
                    vVar = v.this;
                    str2 = d9.f15865z;
                } else {
                    if (x8.h(v.this.f19408Z.getContext())) {
                        v.this.a(str, true, (String) null, (String) null);
                        v.this.f19417h.a(ohVar, d5, grVar.a("connectionTimeout", 0), grVar.a("readTimeout", 0));
                        return;
                    }
                    vVar = v.this;
                    str2 = d9.f15834C;
                }
                vVar.a(str, false, str2, (String) null);
            } catch (Exception e4) {
                o9.d().a(e4);
                v.this.a(str, false, e4.getMessage(), (String) null);
                IronLog.INTERNAL.error(e4.toString());
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.i(v.this.f19412c, "setBackButtonState(" + str + ")");
            jk.e().c(new gr(str).d(b9.h.f15456P));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.i(v.this.f19412c, "setForceClose(" + str + ")");
            gr grVar = new gr(str);
            String d4 = grVar.d("width");
            String d5 = grVar.d("height");
            v.this.f19423n = Integer.parseInt(d4);
            v.this.f19424o = Integer.parseInt(d5);
            v.this.f19425p = grVar.d(b9.h.f15451L);
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            Logger.i(v.this.f19412c, "setMixedContentAlwaysAllow(" + str + ")");
            v.this.c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.i(v.this.f19412c, "setOrientation(" + str + ")");
                String d4 = new gr(str).d(b9.h.f15492n);
                v.this.n(d4);
                if (v.this.f19410a0 != null) {
                    v.this.f19410a0.onOrientationChanged(d4, v.this.f19406X.L(v.this.f19408Z.getContext()));
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.i(v.this.f19412c, "setStoreSearchKeys(" + str + ")");
            jk.e().e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) {
            Logger.i(v.this.f19412c, "setUserData(" + str + ")");
            gr grVar = new gr(str);
            if (!grVar.a(b9.h.f15463W)) {
                v.this.a(str, false, b9.c.f15319F, (String) null);
                return;
            }
            if (!grVar.a("value")) {
                v.this.a(str, false, b9.c.f15320G, (String) null);
                return;
            }
            String d4 = grVar.d(b9.h.f15463W);
            String d5 = grVar.d("value");
            jk.e().a(d4, d5);
            v.this.i(v.this.e(v.this.e(str), v.this.a(d4, d5, null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            Logger.i(v.this.f19412c, "setWebviewBackgroundColor(" + str + ")");
            v.this.p(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            Logger.i(v.this.f19412c, "stillAlive(" + str + ")");
            v.this.f19411b.a();
        }

        private void a(String str, int i4) {
            va a4;
            v vVar = v.this;
            fh.e eVar = fh.e.Interstitial;
            if (vVar.q(eVar.toString()) && (a4 = v.this.f19389G.a(eVar, str)) != null && a4.k()) {
                v.this.b(new u(str, i4));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            try {
                C1554s3.a a4 = v.this.f19396N.a(v.this.f19408Z.getContext(), InterfaceC1574u3.a(str));
                v.this.i(v.this.e(a4.f(), a4.i().toString()));
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }

        void c(String str) {
            v.this.i(v.this.a(b9.g.f15401d, str, (String) null, (String) null));
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            v.this.i(v.this.e(str, str2));
        }

        private void b(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(b9.a.f15294h, new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e4) {
                o9.d().a(e4);
                mh.a(fr.f16288p, new hh().a(cc.f15708A, e4.getMessage()).a());
                Logger.d(v.this.f19412c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(JSONObject jSONObject) {
            b(jSONObject);
            a(jSONObject, SDKUtils.getTesterParameters());
            if (v.this.f19405W) {
                return;
            }
            a(jSONObject);
        }

        private void a(String str, boolean z4) {
            va a4 = v.this.f19389G.a(fh.e.Interstitial, str);
            if (a4 != null) {
                a4.a(z4);
            }
        }

        private void a(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", v.this.f19384B.f());
            } catch (Exception e4) {
                o9.d().a(e4);
                Logger.d(v.this.f19412c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void a(JSONObject jSONObject, String str) {
            if (a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException e4) {
                    o9.d().a(e4);
                    Logger.d(v.this.f19412c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z4, String str) {
            if (z4) {
                v.this.f19434y.b(fh.e.Interstitial, str);
                v.this.f19434y.b(str);
            }
            a(str, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z4, String str, String str2) {
            if (z4) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f19434y.b(str2, str);
            }
            a(str2, false);
        }

        boolean a(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
                return false;
            }
        }
    }

    private interface s {
        void a(String str, fh.e eVar, va vaVar);
    }

    static class t {

        /* renamed from: a, reason: collision with root package name */
        String f19527a;

        /* renamed from: b, reason: collision with root package name */
        String f19528b;

        t() {
        }
    }

    public enum u {
        Display,
        Gone
    }

    /* renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    private class C0163v extends WebViewClient {
        private C0163v() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                v.this.A();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i4, String str, String str2) {
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains(b9.f15268f) && v.this.f19399Q != null) {
                v.this.f19399Q.b("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i4 + ")");
            }
            super.onReceivedError(webView, i4, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean didCrash;
            boolean didCrash2;
            String str = v.this.f19412c;
            StringBuilder sb = new StringBuilder();
            sb.append("Chromium process crashed - detail.didCrash(): ");
            didCrash = renderProcessGoneDetail.didCrash();
            sb.append(didCrash);
            Log.e(str, sb.toString());
            didCrash2 = renderProcessGoneDetail.didCrash();
            String str2 = didCrash2 ? "Render process was observed to crash" : "Render process was killed by the system";
            if (v.this.f19399Q != null) {
                v.this.f19399Q.c(str2);
            }
            v.this.w();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z4;
            Logger.i("shouldInterceptRequest", str);
            try {
                z4 = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException e4) {
                o9.d().a(e4);
                z4 = false;
            }
            if (z4) {
                String str2 = "file://" + v.this.f19383A + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException e5) {
                    o9.d().a(e5);
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (v.this.h(str)) {
                    v.this.z();
                    return true;
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        /* synthetic */ C0163v(v vVar, f fVar) {
            this();
        }
    }

    public v(Context context, wa waVar, e9 e9Var, InterfaceC1559c interfaceC1559c, ig igVar, int i4, gb gbVar, String str, l.a aVar, l.b bVar, String str2, String str3) {
        lk lkVar = new lk(context, new wk.a());
        this.f19408Z = lkVar;
        Logger.i(this.f19412c, "C'tor");
        this.f19407Y = e9Var;
        this.f19399Q = interfaceC1559c;
        this.f19409a = igVar;
        this.f19389G = waVar;
        a(context, lkVar);
        this.f19383A = str;
        this.f19386D = new C1427a3();
        this.f19401S = new JSONObject();
        this.f19417h = gbVar;
        this.f19402T = aVar;
        this.f19403U = bVar;
        boolean optBoolean = SDKUtils.getNetworkConfiguration().optBoolean(b9.a.f15295i, false);
        this.f19405W = optBoolean;
        if (optBoolean) {
            this.f19404V = new l9(new i9(SDKUtils.getControllerUrl(), this.f19383A, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new fp(SDKUtils.getControllerUrl())), new Function1() { // from class: com.ironsource.sdk.controller.B
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object c4;
                    c4 = v.this.c((oh) obj);
                    return c4;
                }
            }, gbVar, new q9.a());
        } else {
            gbVar.a(this);
            this.f19384B = new C1560d(SDKUtils.getNetworkConfiguration(), this.f19383A, SDKUtils.getControllerUrl(), gbVar);
        }
        f fVar = null;
        o oVar = new o(this, fVar);
        this.f19426q = oVar;
        lkVar.setWebViewClient(new C0163v(this, fVar));
        lkVar.setWebChromeClient(oVar);
        ow.a(lkVar);
        a(lkVar);
        lkVar.setDownloadListener(this);
        this.f19400R = c(context);
        b(context);
        b(i4);
        this.f19415f = str2;
        this.f19416g = str3;
        this.f19411b = h9.a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    private v8 c(Context context) {
        return new f(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return new gr(str).d(f19381g0);
    }

    @Override // com.ironsource.sdk.controller.l
    public void destroy() {
        this.f19408Z.destroy();
        gb gbVar = this.f19417h;
        if (gbVar != null) {
            gbVar.d();
        }
        v8 v8Var = this.f19400R;
        if (v8Var != null) {
            v8Var.b();
        }
        CountDownTimer countDownTimer = this.f19422m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public fh.c g() {
        return fh.c.Web;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j4) {
        Logger.i(this.f19412c, str + " " + str4);
    }

    public Context q() {
        return this.f19407Y.a();
    }

    public int r() {
        return f19377c0;
    }

    public FrameLayout s() {
        return this.f19430u;
    }

    public C1427a3 u() {
        return this.f19386D;
    }

    public u v() {
        return this.f19431v;
    }

    @SuppressLint({"NewApi"})
    private void G() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return new gr(str).d(f19382h0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        return new m.a(str, str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fh.e g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        fh.e eVar = fh.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        fh.e eVar2 = fh.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        fh.e eVar3 = fh.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        to toVar = this.f19410a0;
        if (toVar != null) {
            toVar.onCloseRequested();
        }
    }

    public void A() {
        i(f(b9.g.f15372A));
    }

    public void B() {
        try {
            this.f19408Z.onPause();
        } catch (Throwable th) {
            o9.d().a(th);
            Logger.i(this.f19412c, "WebViewController: onPause() - " + th);
        }
    }

    public void C() {
        this.f19385C = null;
    }

    public void D() {
        this.f19408Z.a();
        this.f19410a0 = null;
    }

    public void E() {
        this.f19408Z.requestFocus();
    }

    public void F() {
        try {
            this.f19408Z.onResume();
        } catch (Throwable th) {
            o9.d().a(th);
            Logger.i(this.f19412c, "WebViewController: onResume() - " + th);
        }
    }

    public void m(String str) {
        try {
            String d4 = y8.d(this.f19408Z.getContext());
            Logger.i(this.f19412c, "device status changed, connection type " + str);
            kh.a(str);
            kh.b(d4);
            try {
                i(e(b9.g.f15423x, a(b9.i.f15581t, str, b9.i.f15582u, d4, null, null, null, null, null, false)));
            } catch (Exception e4) {
                e = e4;
                Exception exc = e;
                o9.d().a(exc);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(exc));
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public nw p() {
        if (this.f19398P == null) {
            this.f19398P = new g();
        }
        return this.f19398P;
    }

    public String t() {
        return this.f19432w;
    }

    public void w() {
        if (this.f19419j == null) {
            return;
        }
        o();
        fh.e b4 = this.f19419j.b();
        String a4 = this.f19419j.a();
        if (q(b4.toString())) {
            a(b4, a4);
        }
    }

    public void x() {
        this.f19426q.onHideCustomView();
    }

    public boolean y() {
        return this.f19427r != null;
    }

    public void z() {
        i(f(b9.g.f15397Z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c(oh ohVar) {
        this.f19417h.a(this);
        if (ohVar == null || !ohVar.exists()) {
            a(new oh(b9.f15268f), new gh(1, "Unable to download Html file"));
            return null;
        }
        a(ohVar);
        return null;
    }

    private String d(JSONObject jSONObject) {
        za b4 = za.b(this.f19408Z.getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb.append(b9.i.f15576q);
            sb.append("=");
            sb.append(sDKVersion);
            sb.append("&");
        }
        String e4 = b4.e();
        if (!TextUtils.isEmpty(e4)) {
            sb.append(b9.i.f15568m);
            sb.append("=");
            sb.append(e4);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str = parse.getScheme() + StringUtils.PROCESS_POSTFIX_DELIMITER;
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + StringUtils.PROCESS_POSTFIX_DELIMITER + port;
            }
            sb.append("&");
            sb.append(b9.i.f15521C);
            sb.append("=");
            sb.append(str);
            sb.append("&");
            sb.append(b9.i.f15522D);
            sb.append("=");
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{b9.i.f15544Z, b9.i.f15556g}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append("&");
                        sb.append("controllerConfig");
                        sb.append("=");
                        sb.append(jSONObject2);
                    }
                } catch (JSONException e5) {
                    o9.d().a(e5);
                    IronLog.INTERNAL.error(e5.toString());
                }
            }
            sb.append("&");
            sb.append("debug");
            sb.append("=");
            sb.append(r());
        }
        return sb.toString();
    }

    private String f(String str) {
        return new m.a(str).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(new Runnable() { // from class: com.ironsource.sdk.controller.A
            @Override // java.lang.Runnable
            public final void run() {
                v.this.j(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str) {
        this.f19408Z.a(new m.b(str, r()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str) {
        try {
            Logger.i(this.f19412c, "load(): " + str);
            this.f19408Z.loadUrl(str);
        } catch (Throwable th) {
            o9.d().a(th);
            Logger.e(this.f19412c, "WebViewController::load: " + th);
        }
    }

    private void o(String str) {
        WebSettings settings;
        int i4;
        if (str.equalsIgnoreCase("0")) {
            settings = this.f19408Z.getSettings();
            i4 = 2;
        } else {
            settings = this.f19408Z.getSettings();
            i4 = -1;
        }
        settings.setCacheMode(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str) {
        gr grVar = new gr(str);
        String d4 = grVar.d(b9.h.f15459S);
        String d5 = grVar.d("adViewId");
        int parseColor = !b9.h.f15460T.equalsIgnoreCase(d4) ? Color.parseColor(d4) : 0;
        if (d5 == null) {
            this.f19408Z.setBackgroundColor(parseColor);
            return;
        }
        WebView presentingView = ch.a().a(d5).getPresentingView();
        if (presentingView != null) {
            presentingView.setBackgroundColor(parseColor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(String str) {
        boolean z4 = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.f19412c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(fh.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(fh.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(fh.e.Banner.toString()) || this.f19435z == null : this.f19433x == null) : this.f19434y != null) {
            z4 = true;
        }
        if (!z4) {
            Logger.d(this.f19412c, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z4;
    }

    com.ironsource.sdk.controller.r b(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.r(sVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        a(this.f19386D);
    }

    public boolean h(String str) {
        try {
            if (!new is(str, jk.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().c()).a()) {
                return false;
            }
            kv.a(q(), str);
            return true;
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return false;
        }
    }

    public void k(String str) {
        i(e(b9.g.f15422w, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void n(String str) {
        this.f19432w = str;
    }

    private String c(String str, String str2, String str3) {
        return new m.a(str, null, str2, str3).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        try {
            v8 v8Var = this.f19400R;
            if (v8Var == null) {
                return;
            }
            v8Var.b(context);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void d() {
        i(f(b9.g.f15419t));
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        i(f(b9.g.f15420u));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public s9 a(fh.e eVar) {
        if (eVar == fh.e.Interstitial) {
            return this.f19434y;
        }
        if (eVar == fh.e.RewardedVideo) {
            return this.f19433x;
        }
        if (eVar == fh.e.Banner) {
            return this.f19435z;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            v8 v8Var = this.f19400R;
            if (v8Var == null) {
                return;
            }
            v8Var.c(context);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = b9.c.f15345z;
        }
        i(e(b9.g.f15398a0, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    public void g(String str, String str2) {
        i(e(b9.g.f15394W, a(b9.h.f15496p, str2, b9.h.f15490m, str, null, null, null, null, null, false)));
    }

    private String b(String str) {
        String str2 = this.f19383A + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] f(String str, String str2) {
        boolean z4;
        JSONObject jSONObject = new JSONObject();
        boolean z5 = true;
        Map<String, String> map = null;
        if (TextUtils.isEmpty(str)) {
            z4 = true;
        } else {
            va a4 = this.f19389G.a(g(str), str2);
            if (a4 != null) {
                map = a4.g();
                map.put("demandSourceName", a4.f());
                map.put("demandSourceId", a4.h());
            }
            try {
                jSONObject.put(b9.h.f15490m, str);
            } catch (JSONException e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
            z4 = false;
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e5) {
                o9.d().a(e5);
                IronLog.INTERNAL.error(e5.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f19416g)) {
            try {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15554f), SDKUtils.encodeString(this.f19416g));
            } catch (JSONException e6) {
                o9.d().a(e6);
                IronLog.INTERNAL.error(e6.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f19415f)) {
            try {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15556g), SDKUtils.encodeString(this.f19415f));
            } catch (JSONException e7) {
                o9.d().a(e7);
                IronLog.INTERNAL.error(e7.toString());
            }
            z5 = z4;
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    o(entry.getValue());
                }
                try {
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e8) {
                    o9.d().a(e8);
                    IronLog.INTERNAL.error(e8.toString());
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z5)};
    }

    void c(Runnable runnable) {
        ig igVar = this.f19409a;
        if (igVar != null) {
            igVar.d(runnable);
        }
    }

    public void e(JSONObject jSONObject) {
        Logger.i(this.f19412c, "device connection info changed: " + jSONObject.toString());
        i(e(b9.g.f15424y, a(b9.i.f15559h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    private String b(String str, String str2) {
        return a(str, str2, "errMsg");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(Context context) {
        za b4 = za.b(context);
        JSONObject jSONObject = new JSONObject();
        boolean z4 = false;
        try {
            jSONObject.put(b9.i.f15587z, "none");
            jSONObject.put(b9.i.f15519A, SDKUtils.translateDeviceOrientation(this.f19406X.H(context)));
            String d4 = b4.d();
            if (d4 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15564k), SDKUtils.encodeString(d4));
            }
            String c4 = b4.c();
            if (c4 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15566l), SDKUtils.encodeString(c4));
            } else {
                z4 = true;
            }
            SDKUtils.loadGoogleAdvertiserInfo(context);
            String advertiserId = SDKUtils.getAdvertiserId();
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(this.f19412c, "add AID");
                jSONObject.put("deviceIds" + b9.i.f15550d + b9.i.f15530L + b9.i.f15552e, SDKUtils.encodeString(advertiserId));
            }
            String limitAdTracking = SDKUtils.getLimitAdTracking();
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(this.f19412c, "add LAT");
                jSONObject.put(b9.i.f15531M, Boolean.parseBoolean(limitAdTracking));
            }
            String e4 = b4.e();
            if (e4 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15568m), SDKUtils.encodeString(e4));
            } else {
                z4 = true;
            }
            String f4 = b4.f();
            if (f4 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15570n), f4.replaceAll("[^0-9/.]", ""));
            } else {
                z4 = true;
            }
            String f5 = b4.f();
            if (f5 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15572o), SDKUtils.encodeString(f5));
            }
            String valueOf = String.valueOf(b4.a());
            if (valueOf != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15574p), valueOf);
            } else {
                z4 = true;
            }
            jSONObject.put(ge.f16458g0, String.valueOf(C1495k1.a()));
            String sDKVersion = SDKUtils.getSDKVersion();
            if (sDKVersion != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15576q), SDKUtils.encodeString(sDKVersion));
            }
            if (b4.b() != null && b4.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15578r), SDKUtils.encodeString(b4.b()));
            }
            String b5 = y8.b(context);
            if (b5.equals("none")) {
                z4 = true;
            } else {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15581t), SDKUtils.encodeString(b5));
            }
            String d5 = y8.d(context);
            if (d5 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15582u), SDKUtils.encodeString(d5));
            } else {
                z4 = true;
            }
            jSONObject.put(SDKUtils.encodeString(b9.i.f15583v), y8.e(context));
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15585x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            jSONObject.put(b9.i.f15586y, SDKUtils.encodeString(String.valueOf(this.f19406X.a(this.f19383A))));
            String valueOf2 = String.valueOf(this.f19406X.s());
            if (TextUtils.isEmpty(valueOf2)) {
                z4 = true;
            } else {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15525G) + b9.i.f15550d + SDKUtils.encodeString("width") + b9.i.f15552e, SDKUtils.encodeString(valueOf2));
            }
            jSONObject.put(SDKUtils.encodeString(b9.i.f15525G) + b9.i.f15550d + SDKUtils.encodeString("height") + b9.i.f15552e, SDKUtils.encodeString(String.valueOf(this.f19406X.a())));
            String g4 = C1442c4.g(this.f19408Z.getContext());
            if (!TextUtils.isEmpty(g4)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(g4));
            }
            String valueOf3 = String.valueOf(this.f19406X.h());
            if (!TextUtils.isEmpty(valueOf3)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15529K), SDKUtils.encodeString(valueOf3));
            }
            String valueOf4 = String.valueOf(this.f19406X.f());
            if (!TextUtils.isEmpty(valueOf4)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15533O), SDKUtils.encodeString(valueOf4));
            }
            jSONObject.put(SDKUtils.encodeString(b9.i.f15534P), za.b(context).a(context));
            jSONObject.put(SDKUtils.encodeString(b9.i.f15543Y), this.f19406X.y(context));
            jSONObject.put(SDKUtils.encodeString("mcc"), x8.b(context));
            jSONObject.put(SDKUtils.encodeString("mnc"), x8.c(context));
            jSONObject.put(SDKUtils.encodeString("phoneType"), x8.f(context));
            jSONObject.put(SDKUtils.encodeString(b9.i.f15536R), SDKUtils.encodeString(x8.g(context)));
            jSONObject.put(SDKUtils.encodeString(b9.i.f15540V), C1442c4.f(context));
            jSONObject.put(SDKUtils.encodeString(b9.i.f15542X), C1442c4.d(context));
            jSONObject.put(SDKUtils.encodeString(b9.i.f15541W), SDKUtils.encodeString(C1442c4.b(context)));
            String e5 = C1442c4.e(context);
            if (!TextUtils.isEmpty(e5)) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f15549c0), SDKUtils.encodeString(e5));
            }
            c(jSONObject);
            jSONObject.put(SDKUtils.encodeString(b9.i.f15575p0), this.f19406X.C(context));
        } catch (JSONException e6) {
            o9.d().a(e6);
            IronLog.INTERNAL.error(e6.toString());
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z4)};
    }

    com.ironsource.sdk.controller.g a(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.g(new C1558b(new r()), sVar);
    }

    public void c(String str) {
        if (str.equals(b9.h.f15482i)) {
            o();
        }
        i(e(b9.g.f15425z, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void b(int i4) {
        f19377c0 = i4;
    }

    public void c(String str, String str2) {
        String str3;
        try {
            str3 = str;
            try {
                i(e(b9.g.f15415p, a(b9.h.f15468b, str3, "path", b(str2), null, null, null, null, null, false)));
            } catch (Exception e4) {
                e = e4;
                Exception exc = e;
                o9.d().a(exc);
                b(str3, str2, exc.getMessage());
            }
        } catch (Exception e5) {
            e = e5;
            str3 = str;
        }
    }

    private t a(fh.e eVar, va vaVar) {
        t tVar = new t();
        if (eVar != fh.e.RewardedVideo && eVar != fh.e.Interstitial && eVar != fh.e.Banner) {
            return tVar;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(b9.i.f15556g, this.f19415f);
        if (!TextUtils.isEmpty(this.f19416g)) {
            hashMap.put(b9.i.f15554f, this.f19416g);
        }
        if (vaVar != null) {
            if (vaVar.g() != null) {
                hashMap.putAll(vaVar.g());
                hashMap.put(b9.h.f15515y0, String.valueOf(C1508m0.f17128a.c(vaVar.h())));
            }
            hashMap.put("demandSourceName", vaVar.f());
            hashMap.put("demandSourceId", vaVar.h());
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        b9.g a4 = b9.g.a(eVar);
        String a5 = a(a4.f15426a, flatMapToJsonAsString, a4.f15427b, a4.f15428c);
        tVar.f19527a = a4.f15426a;
        tVar.f19528b = a5;
        return tVar;
    }

    private void c(JSONObject jSONObject) {
        jSONObject.put(SDKUtils.encodeString("gpi"), ep.d(this.f19408Z.getContext()));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        a(new c(context));
    }

    private String a(fh.e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        va a4 = this.f19389G.a(eVar, fetchDemandSourceId);
        if (a4 != null) {
            if (a4.g() != null) {
                hashMap.putAll(a4.g());
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        b9.g b4 = b9.g.b(eVar);
        return a(b4.f15426a, flatMapToJsonAsString, b4.f15427b, b4.f15428c);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(va vaVar) {
        Map<String, String> b4 = vaVar.b();
        if (b4 != null) {
            i(e(b9.g.f15391T, SDKUtils.flatMapToJsonAsString(b4)));
        }
        this.f19389G.b(fh.e.Interstitial, vaVar.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(va vaVar, Map<String, String> map, u9 u9Var) {
        a(vaVar, map);
    }

    void b(Runnable runnable) {
        ig igVar = this.f19409a;
        if (igVar != null) {
            igVar.c(runnable);
        }
    }

    private String a(String str, String str2) {
        return a(str, str2, b9.h.f15478g);
    }

    public void b(String str, String str2, String str3) {
        try {
            try {
                i(e(b9.g.f15416q, a(b9.h.f15468b, str, "path", b(str2), "errMsg", str3, null, null, null, false)));
            } catch (Exception e4) {
                e = e4;
                o9.d().a(e);
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    private String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                return new JSONObject(str).put(str3, str2).toString();
            } catch (JSONException e4) {
                o9.d().a(e4);
            }
        }
        return str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        i(e(b9.g.f15404e0, jSONObject != null ? jSONObject.toString() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4) {
        return new m.a(str, str2, str3, str4).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z4) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z4);
            }
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        return jSONObject.toString();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        if (this.f19405W) {
            this.f19404V.a();
            return;
        }
        this.f19384B.a(new hh());
        if (this.f19384B.k()) {
            a(1);
        }
    }

    public void a(int i4) {
        if (!this.f19405W && !this.f19384B.m()) {
            Logger.i(this.f19412c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String d4 = d(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            d4 = String.format("%s&sessionid=%s", d4, initSDKParams.get("sessionid"));
        }
        this.f19409a.d(new h(controllerConfigAsJSONObject, this.f19408Z, (this.f19405W ? this.f19404V.b() : this.f19384B.g()).toURI().toString() + "?" + d4));
        this.f19422m = new i(50000L, 1000L, i4).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.f19407Y.a(activity);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        a(new d(context));
    }

    private void a(Context context, WebView webView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f19430u = new FrameLayout(context);
        this.f19428s = new FrameLayout(context);
        this.f19428s.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f19428s.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.f19430u.addView(this.f19428s, layoutParams);
        this.f19430u.addView(frameLayout);
    }

    @SuppressLint({"NewApi"})
    private void a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    @SuppressLint({"AddJavascriptInterface"})
    private void a(WebView webView) {
        com.ironsource.sdk.controller.s sVar = new com.ironsource.sdk.controller.s(com.ironsource.sdk.controller.s.a());
        webView.addJavascriptInterface(a(sVar), b9.f15266d);
        webView.addJavascriptInterface(b(sVar), b9.f15267e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(C1427a3 c1427a3) {
        String b4;
        s9 a4;
        synchronized (this.f19387E) {
            try {
                if (c1427a3.j() && this.f19418i) {
                    Log.d(this.f19412c, "restoreState(state:" + c1427a3 + ")");
                    int c4 = c1427a3.c();
                    if (c4 != -1) {
                        fh.e eVar = fh.e.RewardedVideo;
                        if (c4 == eVar.ordinal()) {
                            Log.d(this.f19412c, "onRVAdClosed()");
                            b4 = c1427a3.b();
                            a4 = a(eVar);
                            if (a4 != null) {
                            }
                            c1427a3.a(-1);
                            c1427a3.f(null);
                        } else {
                            eVar = fh.e.Interstitial;
                            if (c4 == eVar.ordinal()) {
                                Log.d(this.f19412c, "onInterstitialAdClosed()");
                                b4 = c1427a3.b();
                                a4 = a(eVar);
                                if (a4 != null && !TextUtils.isEmpty(b4)) {
                                    a4.a(eVar, b4);
                                }
                            }
                            c1427a3.a(-1);
                            c1427a3.f(null);
                        }
                    } else {
                        Log.d(this.f19412c, "No ad was opened");
                    }
                    String d4 = c1427a3.d();
                    String f4 = c1427a3.f();
                    for (va vaVar : this.f19389G.a(fh.e.Interstitial)) {
                        if (vaVar.e() == 2) {
                            Log.d(this.f19412c, "initInterstitial(appKey:" + d4 + ", userId:" + f4 + ", demandSource:" + vaVar.f() + ")");
                            a(d4, f4, vaVar, this.f19434y);
                        }
                    }
                    String g4 = c1427a3.g();
                    String h4 = c1427a3.h();
                    for (va vaVar2 : this.f19389G.a(fh.e.RewardedVideo)) {
                        if (vaVar2.e() == 2) {
                            String f5 = vaVar2.f();
                            Log.d(this.f19412c, "onRVNoMoreOffers()");
                            this.f19433x.c(f5);
                            Log.d(this.f19412c, "initRewardedVideo(appKey:" + g4 + ", userId:" + h4 + ", demandSource:" + f5 + ")");
                            a(g4, h4, vaVar2, this.f19433x);
                        }
                    }
                    c1427a3.a(false);
                }
                this.f19386D = c1427a3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a(fh.e eVar, String str) {
        b(new e(eVar, str));
    }

    @Override // com.ironsource.qo
    public void a(oh ohVar) {
        if (this.f19405W && this.f19404V.a(ohVar)) {
            a(1);
        } else if (ohVar.getName().contains(b9.f15268f)) {
            this.f19384B.a(new n());
        } else {
            c(ohVar.getName(), ohVar.getParent());
        }
    }

    @Override // com.ironsource.qo
    public void a(oh ohVar, gh ghVar) {
        if (!this.f19405W || !this.f19404V.a(ohVar)) {
            if (ohVar.getName().contains(b9.f15268f)) {
                this.f19384B.a(new a(), new b(ghVar));
                return;
            } else {
                b(ohVar.getName(), ohVar.getParent(), ghVar.b());
                return;
            }
        }
        this.f19399Q.b("controller html - failed to download - " + ghVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(re reVar) {
        try {
            this.f19399Q.a(reVar);
        } catch (Exception e4) {
            o9.d().a(e4);
            Logger.e(this.f19412c, "handleLoadAd: " + e4);
        }
    }

    public void a(rv rvVar) {
        this.f19385C = rvVar;
    }

    public void a(C1554s3 c1554s3) {
        this.f19396N = c1554s3;
    }

    public void a(C1557a c1557a) {
        this.f19394L = c1557a;
        c1557a.a(p());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(InterfaceC1562f.c cVar, l.a aVar) {
        i(a(cVar.e(), cVar.h(), b9.g.f15392U, b9.g.f15392U));
    }

    public void a(com.ironsource.sdk.controller.i iVar) {
        this.f19393K = iVar;
    }

    public void a(com.ironsource.sdk.controller.j jVar) {
        this.f19395M = jVar;
    }

    public void a(com.ironsource.sdk.controller.o oVar) {
        this.f19390H = oVar;
    }

    public void a(com.ironsource.sdk.controller.q qVar) {
        this.f19391I = qVar;
    }

    public void a(com.ironsource.sdk.controller.u uVar) {
        this.f19392J = uVar;
    }

    public void a(u uVar) {
        this.f19431v = uVar;
    }

    public void a(to toVar) {
        this.f19410a0 = toVar;
        this.f19408Z.a(toVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ue ueVar) {
        ueVar.a(new ve() { // from class: com.ironsource.sdk.controller.C
            @Override // com.ironsource.ve
            public final void a(re reVar) {
                v.this.a(reVar);
            }
        });
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar) {
        Map<String, String> b4 = vaVar.b();
        if (b4 != null) {
            i(a(b9.g.f15390S, SDKUtils.flatMapToJsonAsString(b4), b9.g.f15387P, b9.g.f15388Q));
        }
        this.f19389G.b(fh.e.Banner, vaVar.h());
    }

    private void a(va vaVar, Map<String, String> map) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, vaVar.b()});
        if (map.containsKey("adm")) {
            this.f19411b.a(new h9.d() { // from class: com.ironsource.sdk.controller.z
                @Override // com.ironsource.h9.d
                public final void a(ue ueVar) {
                    v.this.a(ueVar);
                }
            });
        }
        this.f19386D.d(vaVar.h(), true);
        i(a(b9.g.f15376E, SDKUtils.flatMapToJsonAsString(mergeHashMaps), b9.g.f15377F, b9.g.f15378G));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, t9 t9Var) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, vaVar.b()});
        if (map != null) {
            i(a(b9.g.f15385N, SDKUtils.flatMapToJsonAsString(mergeHashMaps), b9.g.f15386O, b9.g.f15389R));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, u9 u9Var) {
        i(a(fh.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, vaVar.b()}))));
    }

    public void a(y9 y9Var) {
        this.f19397O = y9Var;
    }

    void a(Runnable runnable) {
        ig igVar = this.f19409a;
        if (igVar != null) {
            igVar.b(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, fh.e eVar, va vaVar) {
        if (q(eVar.toString())) {
            b(new m(eVar, vaVar, str));
        }
    }

    private void a(String str, fh.e eVar, va vaVar, s sVar) {
        if (TextUtils.isEmpty(str)) {
            sVar.a("Application key are missing", eVar, vaVar);
        } else {
            i(a(eVar, vaVar).f19528b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, u9 u9Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.f19386D.d(str, true);
        i(a(b9.g.f15376E, flatMapToJsonAsString, b9.g.f15377F, b9.g.f15378G));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, t9 t9Var) {
        this.f19415f = str;
        this.f19416g = str2;
        this.f19435z = t9Var;
        a(str, fh.e.Banner, vaVar, new l());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, u9 u9Var) {
        this.f19415f = str;
        this.f19416g = str2;
        this.f19434y = u9Var;
        this.f19386D.g(str);
        this.f19386D.h(this.f19416g);
        a(this.f19415f, fh.e.Interstitial, vaVar, new k());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, v9 v9Var) {
        this.f19415f = str;
        this.f19416g = str2;
        this.f19433x = v9Var;
        this.f19386D.i(str);
        this.f19386D.j(str2);
        a(str, fh.e.RewardedVideo, vaVar, new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z4, String str2, String str3) {
        String d4 = new gr(str).d(z4 ? f19381g0 : f19382h0);
        if (TextUtils.isEmpty(d4)) {
            return;
        }
        i(e(d4, a(b(str, str2), str3)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f19401S = jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, WebView webView) {
        boolean optBoolean = jSONObject.optBoolean("inspectWebview");
        if (optBoolean) {
            WebView.setWebContentsDebuggingEnabled(optBoolean);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, t9 t9Var) {
        i(a(b9.g.f15385N, jSONObject.toString(), b9.g.f15386O, b9.g.f15389R));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, u9 u9Var) {
        i(a(fh.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, v9 v9Var) {
        i(a(fh.e.RewardedVideo, jSONObject));
    }

    public void a(boolean z4, String str) {
        i(e(b9.g.f15393V, a(b9.h.f15449K, str, null, null, null, null, null, null, b9.h.f15494o, z4)));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        va a4 = this.f19389G.a(fh.e.Interstitial, str);
        return a4 != null && a4.d();
    }
}
