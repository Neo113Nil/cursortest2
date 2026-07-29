package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.MutableContextWrapper;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.facebook.ads.AudienceNetworkActivity;
import com.ironsource.environment.d;
import com.ironsource.sdk.c.a;
import com.ironsource.sdk.data.AdUnitsState;
import com.ironsource.sdk.data.e;
import com.ironsource.sdk.f.a;
import com.mopub.common.GpsHelper;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IronSourceWebView.java */
/* loaded from: classes2.dex */
public class c extends WebView implements DownloadListener, a.c {

    /* renamed from: a, reason: collision with root package name */
    public static int f7032a = 0;
    private static String ao = "success";
    private static String ap = "fail";

    /* renamed from: b, reason: collision with root package name */
    public static String f7033b = "is_store";

    /* renamed from: c, reason: collision with root package name */
    public static String f7034c = "is_store_close";

    /* renamed from: d, reason: collision with root package name */
    public static String f7035d = "webview_type";
    public static String e = "external_url";
    public static String f = "secondary_web_view";
    public static int g = 0;
    public static int h = 1;
    public static String i = "appIds";
    public static String j = "requestId";
    public static String k = "isInstalled";
    public static String l = "result";
    private com.ironsource.sdk.f.a A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private String F;
    private String G;
    private CountDownTimer H;
    private CountDownTimer I;
    private CountDownTimer J;
    private int K;
    private int L;
    private String M;
    private a N;
    private View O;
    private FrameLayout P;
    private WebChromeClient.CustomViewCallback Q;
    private FrameLayout R;
    private d S;
    private String T;
    private com.ironsource.sdk.e.a.c U;
    private com.ironsource.sdk.e.b V;
    private com.ironsource.sdk.e.a.b W;
    private com.ironsource.sdk.e.d aa;
    private e.b ab;
    private Boolean ac;
    private String ad;
    private g ae;
    private AdUnitsState af;
    private Object ag;
    private boolean ah;
    private boolean ai;
    private com.ironsource.sdk.controller.b aj;
    private com.ironsource.sdk.controller.d ak;
    private com.ironsource.sdk.controller.e al;
    private ArrayList<String> am;
    private com.ironsource.sdk.controller.f an;
    private BroadcastReceiver aq;
    private com.ironsource.sdk.e.f ar;
    Context m;
    Handler n;
    private String o;
    private String p;
    private final String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private Map<String, String> v;
    private String w;
    private String x;
    private String y;
    private String z;

    /* compiled from: IronSourceWebView.java */
    public enum d {
        Display,
        Gone
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WebView getWebview() {
        return this;
    }

    private Map<String, String> a(e.d dVar) {
        if (dVar == e.d.OfferWall) {
            return this.v;
        }
        return null;
    }

    public c(Context context, com.ironsource.sdk.controller.b bVar) {
        super(context.getApplicationContext());
        this.o = c.class.getSimpleName();
        this.p = "IronSource";
        this.q = "We're sorry, some error occurred. we will investigate it";
        this.G = "interrupt";
        this.K = 50;
        this.L = 50;
        this.M = "top-right";
        this.ab = e.b.None;
        this.ac = null;
        this.ag = new Object();
        this.ah = false;
        this.ai = false;
        this.an = new com.ironsource.sdk.controller.f();
        this.aq = new BroadcastReceiver() { // from class: com.ironsource.sdk.controller.c.7
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (c.this.ab == e.b.Ready) {
                    String str = "none";
                    if (com.ironsource.environment.b.b(context2)) {
                        str = TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                    } else if (com.ironsource.environment.b.c(context2)) {
                        str = "3g";
                    }
                    c.this.d(str);
                }
            }
        };
        com.ironsource.sdk.g.e.a(this.o, "C'tor");
        this.am = new ArrayList<>();
        this.ad = b(context.getApplicationContext());
        this.m = context;
        this.aj = bVar;
        e(this.m);
        this.af = new AdUnitsState();
        this.A = getDownloadManager();
        this.A.a(this);
        this.N = new a();
        setWebViewClient(new f());
        setWebChromeClient(this.N);
        n();
        addJavascriptInterface(a(context), "Android");
        setDownloadListener(this);
        setOnTouchListener(new e());
        this.n = a();
    }

    C0376c a(Context context) {
        return new C0376c(context);
    }

    Handler a() {
        return new Handler(Looper.getMainLooper());
    }

    com.ironsource.sdk.f.a getDownloadManager() {
        return com.ironsource.sdk.f.a.a(this.ad);
    }

    String b(Context context) {
        return com.ironsource.sdk.g.d.a(context.getApplicationContext());
    }

    public void a(com.ironsource.sdk.controller.d dVar) {
        this.ak = dVar;
    }

    public void a(com.ironsource.sdk.controller.e eVar) {
        this.al = eVar;
    }

    /* compiled from: IronSourceWebView.java */
    private class e implements View.OnTouchListener {
        private e() {
        }

        /* JADX WARN: Type inference failed for: r9v7, types: [com.ironsource.sdk.controller.c$e$1] */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                String str = c.this.o;
                StringBuilder sb = new StringBuilder();
                sb.append("X:");
                int i = (int) x;
                sb.append(i);
                sb.append(" Y:");
                int i2 = (int) y;
                sb.append(i2);
                com.ironsource.sdk.g.e.a(str, sb.toString());
                int g = com.ironsource.environment.c.g();
                int h = com.ironsource.environment.c.h();
                com.ironsource.sdk.g.e.a(c.this.o, "Width:" + g + " Height:" + h);
                int a2 = com.ironsource.sdk.g.f.a((long) c.this.K);
                int a3 = com.ironsource.sdk.g.f.a((long) c.this.L);
                if ("top-right".equalsIgnoreCase(c.this.M)) {
                    i = g - i;
                } else if (!"top-left".equalsIgnoreCase(c.this.M)) {
                    if ("bottom-right".equalsIgnoreCase(c.this.M)) {
                        i = g - i;
                        i2 = h - i2;
                    } else if ("bottom-left".equalsIgnoreCase(c.this.M)) {
                        i2 = h - i2;
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                }
                if (i <= a2 && i2 <= a3) {
                    c.this.E = false;
                    if (c.this.H != null) {
                        c.this.H.cancel();
                    }
                    c.this.H = new CountDownTimer(2000L, 500L) { // from class: com.ironsource.sdk.controller.c.e.1
                        @Override // android.os.CountDownTimer
                        public void onTick(long j) {
                            com.ironsource.sdk.g.e.a(c.this.o, "Close Event Timer Tick " + j);
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            com.ironsource.sdk.g.e.a(c.this.o, "Close Event Timer Finish");
                            if (c.this.E) {
                                c.this.E = false;
                            } else {
                                c.this.e(TJAdUnitConstants.String.FORCE_CLOSE);
                            }
                        }
                    }.start();
                }
            }
            return false;
        }
    }

    private void e(Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.R = new FrameLayout(context);
        this.P = new FrameLayout(context);
        this.P.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.P.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this);
        this.R.addView(this.P, layoutParams);
        this.R.addView(frameLayout);
    }

    private void n() {
        WebSettings settings = getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                getSettings().setAllowFileAccessFromFileURLs(true);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath("/data/data/org.itri.html5webview/databases/");
        settings.setDomStorageEnabled(true);
        try {
            setDisplayZoomControls(settings);
            setMediaPlaybackJellyBean(settings);
        } catch (Throwable th) {
            com.ironsource.sdk.g.e.b(this.o, "setWebSettings - " + th.toString());
        }
    }

    private void setDisplayZoomControls(WebSettings webSettings) {
        if (Build.VERSION.SDK_INT > 11) {
            webSettings.setDisplayZoomControls(false);
        }
    }

    @Override // android.webkit.WebView
    public WebBackForwardList saveState(Bundle bundle) {
        return super.saveState(bundle);
    }

    @SuppressLint({"NewApi"})
    private void setMediaPlaybackJellyBean(WebSettings webSettings) {
        if (Build.VERSION.SDK_INT >= 17) {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        }
    }

    @SuppressLint({"NewApi"})
    private void o() {
        if (Build.VERSION.SDK_INT >= 19) {
            setWebContentsDebuggingEnabled(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ironsource.sdk.controller.c$1] */
    public void b() {
        com.ironsource.sdk.g.d.a(this.ad, "", "mobileController.html");
        String d2 = com.ironsource.sdk.g.f.d();
        com.ironsource.sdk.data.f fVar = new com.ironsource.sdk.data.f(d2, "");
        this.J = new CountDownTimer(200000L, 1000L) { // from class: com.ironsource.sdk.controller.c.1
            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                com.ironsource.sdk.g.e.a(c.this.o, "Global Controller Timer Tick " + j2);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                com.ironsource.sdk.g.e.a(c.this.o, "Global Controller Timer Finish");
                c.this.D = true;
            }
        }.start();
        if (!this.A.c()) {
            com.ironsource.sdk.g.e.a(this.o, "Download Mobile Controller: " + d2);
            this.A.b(fVar);
            return;
        }
        com.ironsource.sdk.g.e.a(this.o, "Download Mobile Controller: already alive");
    }

    public void setDebugMode(int i2) {
        f7032a = i2;
    }

    public int getDebugMode() {
        return f7032a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            com.ironsource.sdk.g.e.c(this.o, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(e.d.Interstitial.toString()) ? !str.equalsIgnoreCase(e.d.RewardedVideo.toString()) ? (str.equalsIgnoreCase(e.d.OfferWall.toString()) || str.equalsIgnoreCase(e.d.OfferWallCredits.toString())) && this.aa != null : this.U != null : this.W != null) {
            z = true;
        }
        if (!z) {
            com.ironsource.sdk.g.e.c(this.o, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z;
    }

    public void setOrientationState(String str) {
        this.T = str;
    }

    public String getOrientationState() {
        return this.T;
    }

    /* compiled from: IronSourceWebView.java */
    private class f extends WebViewClient {
        private f() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            com.ironsource.sdk.g.e.a("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            com.ironsource.sdk.g.e.a("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                c.this.f();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            com.ironsource.sdk.g.e.a("onReceivedError", str2 + " " + str);
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.ironsource.sdk.g.e.a("shouldOverrideUrlLoading", str);
            try {
                if (c.this.f(str)) {
                    c.this.g();
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z;
            com.ironsource.sdk.g.e.a("shouldInterceptRequest", str);
            try {
                z = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException unused) {
                z = false;
            }
            if (z) {
                String str2 = "file://" + c.this.ad + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException unused2) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }
    }

    /* compiled from: IronSourceWebView.java */
    private class a extends WebChromeClient {
        private a() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new b());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            com.ironsource.sdk.g.e.a("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            com.ironsource.sdk.g.e.a("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            com.ironsource.sdk.g.e.a("Test", "onShowCustomView");
            c.this.setVisibility(8);
            if (c.this.O != null) {
                com.ironsource.sdk.g.e.a("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            com.ironsource.sdk.g.e.a("Test", "mCustomView == null");
            c.this.P.addView(view);
            c.this.O = view;
            c.this.Q = customViewCallback;
            c.this.P.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(c.this.getCurrentActivityContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            com.ironsource.sdk.g.e.a("Test", "onHideCustomView");
            if (c.this.O == null) {
                return;
            }
            c.this.O.setVisibility(8);
            c.this.P.removeView(c.this.O);
            c.this.O = null;
            c.this.P.setVisibility(8);
            c.this.Q.onCustomViewHidden();
            c.this.setVisibility(0);
        }
    }

    /* compiled from: IronSourceWebView.java */
    private class b extends WebViewClient {
        private b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context currentActivityContext = c.this.getCurrentActivityContext();
            Intent intent = new Intent(currentActivityContext, (Class<?>) OpenUrlActivity.class);
            intent.putExtra(c.e, str);
            intent.putExtra(c.f, false);
            currentActivityContext.startActivity(intent);
            return true;
        }
    }

    /* compiled from: IronSourceWebView.java */
    /* renamed from: com.ironsource.sdk.controller.c$c, reason: collision with other inner class name */
    public class C0376c {

        /* renamed from: a, reason: collision with root package name */
        volatile int f7055a = 0;

        @JavascriptInterface
        public void alert(String str) {
        }

        public C0376c(Context context) {
        }

        @JavascriptInterface
        public void initController(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "initController(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            if (gVar.f("stage")) {
                String i = gVar.i("stage");
                if ("ready".equalsIgnoreCase(i)) {
                    b();
                } else if ("loaded".equalsIgnoreCase(i)) {
                    a();
                } else if (!"failed".equalsIgnoreCase(i)) {
                    com.ironsource.sdk.g.e.a(c.this.o, "No STAGE mentioned! Should not get here!");
                } else {
                    c();
                }
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Build.VERSION.SDK_INT >= 16) {
                            try {
                                c.this.getSettings().setAllowFileAccessFromFileURLs(false);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
            }
        }

        void a() {
            c.this.ab = e.b.Loaded;
        }

        void b() {
            c.this.ab = e.b.Ready;
            c.this.J.cancel();
            c.this.I.cancel();
            c.this.p();
            for (com.ironsource.sdk.data.b bVar : c.this.aj.a(e.d.RewardedVideo)) {
                if (bVar.b() == 1) {
                    c.this.a(c.this.r, c.this.s, bVar, c.this.U);
                }
            }
            for (com.ironsource.sdk.data.b bVar2 : c.this.aj.a(e.d.Interstitial)) {
                if (bVar2.b() == 1) {
                    c.this.a(c.this.w, c.this.x, bVar2, c.this.W);
                }
            }
            if (c.this.B) {
                c.this.a(c.this.t, c.this.u, c.this.v, c.this.aa);
            }
            if (c.this.C) {
                c.this.a(c.this.y, c.this.z, c.this.aa);
            }
            c.this.a(c.this.af);
        }

        void c() {
            c.this.ab = e.b.Failed;
            for (com.ironsource.sdk.data.b bVar : c.this.aj.a(e.d.RewardedVideo)) {
                if (bVar.b() == 1) {
                    c.this.a(e.d.RewardedVideo, bVar.a());
                }
            }
            for (com.ironsource.sdk.data.b bVar2 : c.this.aj.a(e.d.Interstitial)) {
                if (bVar2.b() == 1) {
                    c.this.a(e.d.Interstitial, bVar2.a());
                }
            }
            if (c.this.B) {
                c.this.a(e.d.OfferWall, (String) null);
            }
            if (c.this.C) {
                c.this.a(e.d.OfferWallCredits, (String) null);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) == false) goto L11;
         */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void getDeviceStatus(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "getDeviceStatus(" + str + ")");
            String l = c.this.l(str);
            String m = c.this.m(str);
            Object[] objArr = new Object[2];
            Object[] f = c.this.f(c.this.getContext());
            String str2 = (String) f[0];
            if (((Boolean) f[1]).booleanValue()) {
                if (!TextUtils.isEmpty(m)) {
                    l = m;
                }
                l = null;
            }
            if (TextUtils.isEmpty(l)) {
                return;
            }
            c.this.i(c.this.a(l, str2, "onGetDeviceStatusSuccess", "onGetDeviceStatusFail"));
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "setMixedContentAlwaysAllow(" + str + ")");
            c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.12
                @Override // java.lang.Runnable
                public void run() {
                    if (Build.VERSION.SDK_INT >= 21) {
                        c.this.getSettings().setMixedContentMode(0);
                    }
                }
            });
        }

        @JavascriptInterface
        public void setAllowFileAccessFromFileURLs(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "setAllowFileAccessFromFileURLs(" + str + ")");
            final boolean j = new com.ironsource.sdk.data.g(str).j("allowFileAccess");
            c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.19
                @Override // java.lang.Runnable
                public void run() {
                    if (Build.VERSION.SDK_INT >= 16) {
                        try {
                            c.this.getSettings().setAllowFileAccessFromFileURLs(j);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "getControllerConfig(" + str + ")");
            String i = new com.ironsource.sdk.data.g(str).i(c.ao);
            if (TextUtils.isEmpty(i)) {
                return;
            }
            String f = com.ironsource.sdk.g.f.f();
            String k = com.ironsource.sdk.g.f.k();
            if (areTesterParametersValid(k)) {
                try {
                    f = addTesterParametersToConfig(f, k);
                } catch (JSONException unused) {
                    com.ironsource.sdk.g.e.c(c.this.o, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
            c.this.i(c.this.f(i, f));
        }

        @JavascriptInterface
        public String addTesterParametersToConfig(String str, String str2) throws JSONException {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
            jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
            return jSONObject.toString();
        }

        @JavascriptInterface
        public boolean areTesterParametersValid(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) == false) goto L11;
         */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void getApplicationInfo(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "getApplicationInfo(" + str + ")");
            String l = c.this.l(str);
            String m = c.this.m(str);
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            Object[] objArr = new Object[2];
            Object[] c2 = c.this.c(gVar.i("productType"), gVar.i("demandSourceName"));
            String str2 = (String) c2[0];
            if (((Boolean) c2[1]).booleanValue()) {
                if (!TextUtils.isEmpty(m)) {
                    l = m;
                }
                l = null;
            }
            if (TextUtils.isEmpty(l)) {
                return;
            }
            c.this.i(c.this.a(l, str2, "onGetApplicationInfoSuccess", "onGetApplicationInfoFail"));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) == false) goto L11;
         */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void checkInstalledApps(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "checkInstalledApps(" + str + ")");
            String l = c.this.l(str);
            String m = c.this.m(str);
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            Object[] d2 = c.this.d(gVar.i(c.i), gVar.i(c.j));
            String str2 = (String) d2[0];
            if (((Boolean) d2[1]).booleanValue()) {
                if (!TextUtils.isEmpty(m)) {
                    l = m;
                }
                l = null;
            }
            if (TextUtils.isEmpty(l)) {
                return;
            }
            c.this.i(c.this.a(l, str2, "onCheckInstalledAppsSuccess", "onCheckInstalledAppsFail"));
        }

        @JavascriptInterface
        public void saveFile(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "saveFile(" + str + ")");
            com.ironsource.sdk.data.f fVar = new com.ironsource.sdk.data.f(str);
            if (com.ironsource.environment.c.a(c.this.ad) <= 0) {
                c.this.a(str, false, "no_disk_space", (String) null);
                return;
            }
            if (!com.ironsource.sdk.g.f.h()) {
                c.this.a(str, false, "sotrage_unavailable", (String) null);
                return;
            }
            if (com.ironsource.sdk.g.d.a(c.this.ad, fVar)) {
                c.this.a(str, false, "file_already_exist", (String) null);
                return;
            }
            if (!com.ironsource.environment.b.d(c.this.getContext())) {
                c.this.a(str, false, "no_network_connection", (String) null);
                return;
            }
            c.this.a(str, true, (String) null, (String) null);
            String d2 = fVar.d();
            if (d2 != null) {
                String valueOf = String.valueOf(d2);
                if (!TextUtils.isEmpty(valueOf)) {
                    String b2 = fVar.b();
                    if (b2.contains("/")) {
                        String[] split = fVar.b().split("/");
                        b2 = split[split.length - 1];
                    }
                    com.ironsource.sdk.g.c.a().c(b2, valueOf);
                }
            }
            c.this.A.a(fVar);
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "adUnitsReady(" + str + ")");
            final String i = new com.ironsource.sdk.data.g(str).i("demandSourceName");
            final com.ironsource.sdk.data.a aVar = new com.ironsource.sdk.data.a(str);
            if (!aVar.b()) {
                c.this.a(str, false, "Num Of Ad Units Do Not Exist", (String) null);
                return;
            }
            c.this.a(str, true, (String) null, (String) null);
            final String c2 = aVar.c();
            if (c.this.g(c2)) {
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.20
                    @Override // java.lang.Runnable
                    public void run() {
                        int parseInt = Integer.parseInt(aVar.a());
                        if (c2.equalsIgnoreCase(e.d.RewardedVideo.toString())) {
                            if (parseInt > 0) {
                                Log.d(c.this.o, "onRVInitSuccess()");
                                c.this.U.a(e.d.RewardedVideo, i, aVar);
                            } else {
                                c.this.U.b(i);
                            }
                        }
                    }
                });
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "deleteFolder(" + str + ")");
            com.ironsource.sdk.data.f fVar = new com.ironsource.sdk.data.f(str);
            if (!com.ironsource.sdk.g.d.b(c.this.ad, fVar.b())) {
                c.this.a(str, false, "Folder not exist", "1");
            } else {
                c.this.a(str, com.ironsource.sdk.g.d.c(c.this.ad, fVar.b()), (String) null, (String) null);
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "deleteFile(" + str + ")");
            com.ironsource.sdk.data.f fVar = new com.ironsource.sdk.data.f(str);
            if (!com.ironsource.sdk.g.d.b(c.this.ad, fVar.b())) {
                c.this.a(str, false, "File not exist", "1");
            } else {
                c.this.a(str, com.ironsource.sdk.g.d.a(c.this.ad, fVar.b(), fVar.a()), (String) null, (String) null);
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            Intent intent;
            com.ironsource.sdk.g.e.a(c.this.o, "displayWebView(" + str + ")");
            c.this.a(str, true, (String) null, (String) null);
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            boolean booleanValue = ((Boolean) gVar.h(TJAdUnitConstants.String.DISPLAY)).booleanValue();
            String i = gVar.i("productType");
            boolean j = gVar.j("standaloneView");
            String i2 = gVar.i("demandSourceName");
            if (booleanValue) {
                c.this.ah = gVar.j("immersive");
                c.this.ai = gVar.j("activityThemeTranslucent");
                if (c.this.getState() == d.Display) {
                    com.ironsource.sdk.g.e.a(c.this.o, "State: " + c.this.S);
                    return;
                }
                c.this.setState(d.Display);
                com.ironsource.sdk.g.e.a(c.this.o, "State: " + c.this.S);
                Context currentActivityContext = c.this.getCurrentActivityContext();
                String orientationState = c.this.getOrientationState();
                int c2 = com.ironsource.environment.c.c(currentActivityContext);
                if (!j) {
                    if (c.this.ai) {
                        intent = new Intent(currentActivityContext, (Class<?>) InterstitialActivity.class);
                    } else {
                        intent = new Intent(currentActivityContext, (Class<?>) ControllerActivity.class);
                    }
                    boolean z = false;
                    if (e.d.RewardedVideo.toString().equalsIgnoreCase(i)) {
                        if ("application".equals(orientationState)) {
                            orientationState = com.ironsource.sdk.g.f.a(com.ironsource.environment.c.e(c.this.getCurrentActivityContext()));
                        }
                        intent.putExtra("productType", e.d.RewardedVideo.toString());
                        c.this.af.adOpened(e.d.RewardedVideo.ordinal());
                        c.this.af.setDisplayedDemandSourceName(i2);
                        z = true;
                    } else if (e.d.OfferWall.toString().equalsIgnoreCase(i)) {
                        intent.putExtra("productType", e.d.OfferWall.toString());
                        c.this.af.adOpened(e.d.OfferWall.ordinal());
                    } else if (e.d.Interstitial.toString().equalsIgnoreCase(i) && "application".equals(orientationState)) {
                        orientationState = com.ironsource.sdk.g.f.a(com.ironsource.environment.c.e(c.this.getCurrentActivityContext()));
                    }
                    if (z && c.this.g(e.d.RewardedVideo.toString())) {
                        c.this.U.c(e.d.RewardedVideo, i2);
                    }
                    intent.setFlags(536870912);
                    intent.putExtra("immersive", c.this.ah);
                    intent.putExtra("orientation_set_flag", orientationState);
                    intent.putExtra("rotation_set_flag", c2);
                    currentActivityContext.startActivity(intent);
                    return;
                }
                com.ironsource.sdk.controller.a aVar = new com.ironsource.sdk.controller.a(currentActivityContext);
                aVar.addView(c.this.R);
                aVar.a(c.this);
                return;
            }
            c.this.setState(d.Gone);
            c.this.r();
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            String l = c.this.l(str);
            String jSONObject = com.ironsource.sdk.g.f.a(c.this.getCurrentActivityContext()).toString();
            if (TextUtils.isEmpty(l)) {
                return;
            }
            c.this.i(c.this.a(l, jSONObject, "onGetOrientationSuccess", "onGetOrientationFail"));
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "setOrientation(" + str + ")");
            String i = new com.ironsource.sdk.data.g(str).i("orientation");
            c.this.setOrientationState(i);
            int c2 = com.ironsource.environment.c.c(c.this.getCurrentActivityContext());
            if (c.this.ar != null) {
                c.this.ar.a(i, c2);
            }
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "getCachedFilesMap(" + str + ")");
            String l = c.this.l(str);
            if (TextUtils.isEmpty(l)) {
                return;
            }
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            if (!gVar.f("path")) {
                c.this.a(str, false, "path key does not exist", (String) null);
                return;
            }
            String str2 = (String) gVar.h("path");
            if (!com.ironsource.sdk.g.d.b(c.this.ad, str2)) {
                c.this.a(str, false, "path file does not exist on disk", (String) null);
                return;
            }
            c.this.i(c.this.a(l, com.ironsource.sdk.g.d.d(c.this.ad, str2), "onGetCachedFilesMapSuccess", "onGetCachedFilesMapFail"));
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c.this.i(c.this.f(str, str2));
        }

        @JavascriptInterface
        public void getDemandSourceState(String str) {
            String m;
            com.ironsource.sdk.g.e.a(c.this.o, "getMediationState(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            String i = gVar.i("demandSourceName");
            String i2 = gVar.i("productType");
            if (i2 == null || i == null) {
                return;
            }
            try {
                e.d f = com.ironsource.sdk.g.f.f(i2);
                if (f != null) {
                    com.ironsource.sdk.data.b a2 = c.this.aj.a(f, i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("productType", i2);
                    jSONObject.put("demandSourceName", i);
                    if (a2 == null || a2.c(-1)) {
                        m = c.this.m(str);
                    } else {
                        m = c.this.l(str);
                        jSONObject.put("state", a2.f());
                    }
                    a(m, jSONObject.toString());
                }
            } catch (Exception e) {
                c.this.a(str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void adCredited(final String str) {
            String str2;
            String str3;
            final boolean z;
            boolean z2;
            Log.d(c.this.p, "adCredited(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            String i = gVar.i("credits");
            boolean z3 = false;
            final int parseInt = i != null ? Integer.parseInt(i) : 0;
            String i2 = gVar.i("total");
            final int parseInt2 = i2 != null ? Integer.parseInt(i2) : 0;
            final String i3 = gVar.i("demandSourceName");
            final String i4 = gVar.i("productType");
            if (gVar.j("externalPoll")) {
                str2 = c.this.y;
                str3 = c.this.z;
            } else {
                str2 = c.this.t;
                str3 = c.this.u;
            }
            final String str4 = str2;
            final String str5 = str3;
            final String str6 = null;
            if (!i4.equalsIgnoreCase(e.d.OfferWall.toString())) {
                z = false;
                z2 = false;
            } else {
                if (gVar.g(InAppPurchaseMetaData.KEY_SIGNATURE) || gVar.g(TapjoyConstants.TJC_TIMESTAMP) || gVar.g("totalCreditsFlag")) {
                    c.this.a(str, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", (String) null);
                    return;
                }
                if (gVar.i(InAppPurchaseMetaData.KEY_SIGNATURE).equalsIgnoreCase(com.ironsource.sdk.g.f.c(i2 + str4 + str5))) {
                    z3 = true;
                } else {
                    c.this.a(str, false, "Controller signature is not equal to SDK signature", (String) null);
                }
                boolean j = gVar.j("totalCreditsFlag");
                str6 = gVar.i(TapjoyConstants.TJC_TIMESTAMP);
                z = j;
                z2 = z3;
            }
            if (c.this.g(i4)) {
                final boolean z4 = z2;
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.21
                    @Override // java.lang.Runnable
                    public void run() {
                        if (i4.equalsIgnoreCase(e.d.RewardedVideo.toString())) {
                            c.this.U.a(i3, parseInt);
                            return;
                        }
                        if (i4.equalsIgnoreCase(e.d.OfferWall.toString()) && z4 && c.this.aa.onOWAdCredited(parseInt, parseInt2, z) && !TextUtils.isEmpty(str6)) {
                            if (com.ironsource.sdk.g.c.a().a(str6, str4, str5)) {
                                c.this.a(str, true, (String) null, (String) null);
                            } else {
                                c.this.a(str, false, "Time Stamp could not be stored", (String) null);
                            }
                        }
                    }
                });
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "removeCloseEventHandler(" + str + ")");
            if (c.this.H != null) {
                c.this.H.cancel();
            }
            c.this.E = true;
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onGetDeviceStatusSuccess(" + str + ")");
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onGetDeviceStatusSuccess", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onGetDeviceStatusFail(" + str + ")");
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onGetDeviceStatusFail", str);
        }

        @JavascriptInterface
        public void onInitRewardedVideoSuccess(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onInitRewardedVideoSuccess(" + str + ")");
            com.ironsource.sdk.g.c.a().a(new com.ironsource.sdk.data.d(str));
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onInitRewardedVideoSuccess", str);
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onInitRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            final String i = gVar.i("errMsg");
            final String i2 = gVar.i("demandSourceName");
            com.ironsource.sdk.data.b a2 = c.this.aj.a(e.d.RewardedVideo, i2);
            if (a2 != null) {
                a2.a(3);
            }
            if (c.this.g(e.d.RewardedVideo.toString())) {
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.22
                    @Override // java.lang.Runnable
                    public void run() {
                        String str2 = i;
                        if (str2 == null) {
                            str2 = "We're sorry, some error occurred. we will investigate it";
                        }
                        Log.d(c.this.o, "onRVInitFail(message:" + str2 + ")");
                        c.this.U.a(e.d.RewardedVideo, i2, str2);
                    }
                });
            }
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onInitRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onGetApplicationInfoSuccess(" + str + ")");
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onGetApplicationInfoSuccess", str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onGetApplicationInfoFail(" + str + ")");
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onGetApplicationInfoFail", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onShowRewardedVideoSuccess(" + str + ")");
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onShowRewardedVideoSuccess", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onShowRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            final String i = gVar.i("errMsg");
            final String i2 = gVar.i("demandSourceName");
            if (c.this.g(e.d.RewardedVideo.toString())) {
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.23
                    @Override // java.lang.Runnable
                    public void run() {
                        String str2 = i;
                        if (str2 == null) {
                            str2 = "We're sorry, some error occurred. we will investigate it";
                        }
                        Log.d(c.this.o, "onRVShowFail(message:" + i + ")");
                        c.this.U.a(i2, str2);
                    }
                });
            }
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onShowRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onGetCachedFilesMapSuccess(" + str + ")");
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onGetCachedFilesMapSuccess", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onGetCachedFilesMapFail(" + str + ")");
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onGetCachedFilesMapFail", str);
        }

        @JavascriptInterface
        public void onShowOfferWallSuccess(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onShowOfferWallSuccess(" + str + ")");
            c.this.af.adOpened(e.d.OfferWall.ordinal());
            final String b2 = com.ironsource.sdk.g.f.b(str, AudienceNetworkActivity.PLACEMENT_ID);
            if (c.this.g(e.d.OfferWall.toString())) {
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.24
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.aa.onOWShowSuccess(b2);
                    }
                });
            }
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onShowOfferWallSuccess", str);
        }

        @JavascriptInterface
        public void onShowOfferWallFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onShowOfferWallFail(" + str + ")");
            final String i = new com.ironsource.sdk.data.g(str).i("errMsg");
            if (c.this.g(e.d.OfferWall.toString())) {
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.25
                    @Override // java.lang.Runnable
                    public void run() {
                        String str2 = i;
                        if (str2 == null) {
                            str2 = "We're sorry, some error occurred. we will investigate it";
                        }
                        c.this.aa.onOWShowFail(str2);
                    }
                });
            }
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onShowOfferWallFail", str);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onInitInterstitialSuccess()");
            c.this.e("onInitInterstitialSuccess", "true");
            final String i = new com.ironsource.sdk.data.g(str).i("demandSourceName");
            if (TextUtils.isEmpty(i)) {
                com.ironsource.sdk.g.e.a(c.this.o, "onInitInterstitialSuccess failed with no demand source");
            } else if (c.this.g(e.d.Interstitial.toString())) {
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Log.d(c.this.o, "onInterstitialInitSuccess()");
                        c.this.W.a(e.d.Interstitial, i, (com.ironsource.sdk.data.a) null);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onInitInterstitialFail(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            final String i = gVar.i("errMsg");
            final String i2 = gVar.i("demandSourceName");
            if (TextUtils.isEmpty(i2)) {
                com.ironsource.sdk.g.e.a(c.this.o, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            com.ironsource.sdk.data.b a2 = c.this.aj.a(e.d.Interstitial, i2);
            if (a2 != null) {
                a2.a(3);
            }
            if (c.this.g(e.d.Interstitial.toString())) {
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.3
                    @Override // java.lang.Runnable
                    public void run() {
                        String str2 = i;
                        if (str2 == null) {
                            str2 = "We're sorry, some error occurred. we will investigate it";
                        }
                        Log.d(c.this.o, "onInterstitialInitFail(message:" + str2 + ")");
                        c.this.W.a(e.d.Interstitial, i2, str2);
                    }
                });
            }
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onInitInterstitialFail", str);
        }

        private void a(String str, boolean z) {
            com.ironsource.sdk.data.b a2 = c.this.aj.a(e.d.Interstitial, str);
            if (a2 != null) {
                a2.a(z);
            }
            if (c.this.g(e.d.Interstitial.toString())) {
                c.this.e("onInterstitialAvailability", String.valueOf(z + " with demand " + str));
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "adClicked(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            String i = gVar.i("productType");
            final String i2 = gVar.i("demandSourceName");
            if (TextUtils.isEmpty(i2)) {
                return;
            }
            final e.d h = c.this.h(i);
            final com.ironsource.sdk.e.a.a b2 = c.this.b(h);
            if (h == null || b2 == null) {
                return;
            }
            c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.4
                @Override // java.lang.Runnable
                public void run() {
                    b2.b(h, i2);
                }
            });
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onShowInterstitialSuccess(" + str + ")");
            c.this.a(str, true, (String) null, (String) null);
            final String i = new com.ironsource.sdk.data.g(str).i("demandSourceName");
            if (TextUtils.isEmpty(i)) {
                com.ironsource.sdk.g.e.a(c.this.o, "onShowInterstitialSuccess called with no demand");
                return;
            }
            c.this.af.adOpened(e.d.Interstitial.ordinal());
            c.this.af.setDisplayedDemandSourceName(i);
            if (c.this.g(e.d.Interstitial.toString())) {
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.5
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.W.c(e.d.Interstitial, i);
                        c.this.W.d(i);
                    }
                });
                c.this.e("onShowInterstitialSuccess", str);
            }
            a(i, false);
        }

        @JavascriptInterface
        public void onInitOfferWallSuccess(String str) {
            c.this.e("onInitOfferWallSuccess", "true");
            c.this.af.setOfferwallInitSuccess(true);
            if (c.this.af.reportInitOfferwall()) {
                c.this.af.setOfferwallReportInit(false);
                if (c.this.g(e.d.OfferWall.toString())) {
                    c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.6
                        @Override // java.lang.Runnable
                        public void run() {
                            Log.d(c.this.o, "onOfferWallInitSuccess()");
                            c.this.aa.onOfferwallInitSuccess();
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onInitOfferWallFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onInitOfferWallFail(" + str + ")");
            c.this.af.setOfferwallInitSuccess(false);
            final String i = new com.ironsource.sdk.data.g(str).i("errMsg");
            if (c.this.af.reportInitOfferwall()) {
                c.this.af.setOfferwallReportInit(false);
                if (c.this.g(e.d.OfferWall.toString())) {
                    c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.7
                        @Override // java.lang.Runnable
                        public void run() {
                            String str2 = i;
                            if (str2 == null) {
                                str2 = "We're sorry, some error occurred. we will investigate it";
                            }
                            Log.d(c.this.o, "onOfferWallInitFail(message:" + str2 + ")");
                            c.this.aa.onOfferwallInitFail(str2);
                        }
                    });
                }
            }
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onInitOfferWallFail", str);
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onLoadInterstitialSuccess(" + str + ")");
            final String i = new com.ironsource.sdk.data.g(str).i("demandSourceName");
            a(i, true);
            c.this.a(str, true, (String) null, (String) null);
            if (c.this.g(e.d.Interstitial.toString())) {
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.8
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.W.c(i);
                    }
                });
            }
            c.this.e("onLoadInterstitialSuccess", "true");
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onLoadInterstitialFail(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            final String i = gVar.i("errMsg");
            final String i2 = gVar.i("demandSourceName");
            c.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(i2)) {
                return;
            }
            if (c.this.g(e.d.Interstitial.toString())) {
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.9
                    @Override // java.lang.Runnable
                    public void run() {
                        String str2 = i;
                        if (str2 == null) {
                            str2 = "We're sorry, some error occurred. we will investigate it";
                        }
                        c.this.W.b(i2, str2);
                    }
                });
            }
            c.this.e("onLoadInterstitialFail", "true");
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onShowInterstitialFail(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            final String i = gVar.i("errMsg");
            final String i2 = gVar.i("demandSourceName");
            c.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(i2)) {
                return;
            }
            a(i2, false);
            if (c.this.g(e.d.Interstitial.toString())) {
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.10
                    @Override // java.lang.Runnable
                    public void run() {
                        String str2 = i;
                        if (str2 == null) {
                            str2 = "We're sorry, some error occurred. we will investigate it";
                        }
                        c.this.W.c(i2, str2);
                    }
                });
            }
            c.this.e("onShowInterstitialFail", str);
        }

        @JavascriptInterface
        public void onGenericFunctionSuccess(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onGenericFunctionSuccess(" + str + ")");
            if (c.this.V == null) {
                com.ironsource.sdk.g.e.c(c.this.o, "genericFunctionListener was not found");
            } else {
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.11
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.V.a();
                    }
                });
                c.this.a(str, true, (String) null, (String) null);
            }
        }

        @JavascriptInterface
        public void onGenericFunctionFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onGenericFunctionFail(" + str + ")");
            if (c.this.V == null) {
                com.ironsource.sdk.g.e.c(c.this.o, "genericFunctionListener was not found");
                return;
            }
            final String i = new com.ironsource.sdk.data.g(str).i("errMsg");
            c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.13
                @Override // java.lang.Runnable
                public void run() {
                    c.this.V.a(i);
                }
            });
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onGenericFunctionFail", str);
        }

        @JavascriptInterface
        public void createCalendarEvent(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "createCalendarEvent(" + str + ")");
        }

        @JavascriptInterface
        public void openUrl(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "openUrl(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            String i = gVar.i("url");
            String i2 = gVar.i(TJAdUnitConstants.String.METHOD);
            Context currentActivityContext = c.this.getCurrentActivityContext();
            try {
                if (i2.equalsIgnoreCase("external_browser")) {
                    com.ironsource.environment.e.a(currentActivityContext, i);
                } else if (i2.equalsIgnoreCase("webview")) {
                    Intent intent = new Intent(currentActivityContext, (Class<?>) OpenUrlActivity.class);
                    intent.putExtra(c.e, i);
                    intent.putExtra(c.f, true);
                    intent.putExtra("immersive", c.this.ah);
                    currentActivityContext.startActivity(intent);
                } else if (i2.equalsIgnoreCase(TapjoyConstants.TJC_STORE)) {
                    Intent intent2 = new Intent(currentActivityContext, (Class<?>) OpenUrlActivity.class);
                    intent2.putExtra(c.e, i);
                    intent2.putExtra(c.f7033b, true);
                    intent2.putExtra(c.f, true);
                    currentActivityContext.startActivity(intent2);
                }
            } catch (Exception e) {
                c.this.a(str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "setForceClose(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            String i = gVar.i("width");
            String i2 = gVar.i("height");
            c.this.K = Integer.parseInt(i);
            c.this.L = Integer.parseInt(i2);
            c.this.M = gVar.i("position");
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "setBackButtonState(" + str + ")");
            com.ironsource.sdk.g.c.a().a(new com.ironsource.sdk.data.g(str).i("state"));
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "setStoreSearchKeys(" + str + ")");
            com.ironsource.sdk.g.c.a().b(str);
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "setWebviewBackgroundColor(" + str + ")");
            c.this.setWebviewBackground(str);
        }

        @JavascriptInterface
        public void toggleUDIA(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "toggleUDIA(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            if (!gVar.f("toggle")) {
                c.this.a(str, false, "toggle key does not exist", (String) null);
                return;
            }
            int parseInt = Integer.parseInt(gVar.i("toggle"));
            if (parseInt == 0) {
                return;
            }
            String binaryString = Integer.toBinaryString(parseInt);
            if (TextUtils.isEmpty(binaryString)) {
                c.this.a(str, false, "fialed to convert toggle", (String) null);
            } else if (binaryString.toCharArray()[3] == '0') {
                com.ironsource.sdk.g.c.a().a(true);
            } else {
                com.ironsource.sdk.g.c.a().a(false);
            }
        }

        @JavascriptInterface
        public void getUDIA(String str) {
            this.f7055a = 0;
            com.ironsource.sdk.g.e.a(c.this.o, "getUDIA(" + str + ")");
            String l = c.this.l(str);
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            if (!gVar.f("getByFlag")) {
                c.this.a(str, false, "getByFlag key does not exist", (String) null);
                return;
            }
            int parseInt = Integer.parseInt(gVar.i("getByFlag"));
            if (parseInt == 0) {
                return;
            }
            String binaryString = Integer.toBinaryString(parseInt);
            if (TextUtils.isEmpty(binaryString)) {
                c.this.a(str, false, "fialed to convert getByFlag", (String) null);
                return;
            }
            char[] charArray = new StringBuilder(binaryString).reverse().toString().toCharArray();
            JSONArray jSONArray = new JSONArray();
            if (charArray[3] == '0') {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.umeng.analytics.pro.b.n, com.ironsource.sdk.g.c.a().e());
                    com.ironsource.sdk.g.c.a().f();
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            }
            if (charArray[2] == '1') {
                this.f7055a++;
                Location a2 = com.ironsource.environment.d.a(c.this.getContext());
                if (a2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("latitude", a2.getLatitude());
                        jSONObject2.put("longitude", a2.getLongitude());
                        jSONArray.put(jSONObject2);
                        this.f7055a--;
                        a(l, jSONArray);
                        com.ironsource.sdk.g.e.a(c.this.o, "done location");
                        return;
                    } catch (JSONException unused2) {
                        return;
                    }
                }
                this.f7055a--;
            }
        }

        private void a(String str, JSONArray jSONArray) {
            com.ironsource.sdk.g.e.a(c.this.o, "sendResults: " + this.f7055a);
            if (this.f7055a <= 0) {
                b(str, jSONArray);
            }
        }

        @JavascriptInterface
        public void onUDIASuccess(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onUDIASuccess(" + str + ")");
        }

        @JavascriptInterface
        public void onUDIAFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onUDIAFail(" + str + ")");
        }

        @JavascriptInterface
        public void onGetUDIASuccess(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onGetUDIASuccess(" + str + ")");
        }

        @JavascriptInterface
        public void onGetUDIAFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onGetUDIAFail(" + str + ")");
        }

        @JavascriptInterface
        public void setUserUniqueId(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "setUserUniqueId(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            if (!gVar.f("userUniqueId") || !gVar.f("productType")) {
                c.this.a(str, false, "uniqueId or productType does not exist", (String) null);
                return;
            }
            if (com.ironsource.sdk.g.c.a().b(gVar.i("userUniqueId"), gVar.i("productType"))) {
                c.this.a(str, true, (String) null, (String) null);
            } else {
                c.this.a(str, false, "setUserUniqueId failed", (String) null);
            }
        }

        @JavascriptInterface
        public void getUserUniqueId(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "getUserUniqueId(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            if (!gVar.f("productType")) {
                c.this.a(str, false, "productType does not exist", (String) null);
                return;
            }
            String l = c.this.l(str);
            if (TextUtils.isEmpty(l)) {
                return;
            }
            String i = gVar.i("productType");
            c.this.i(c.this.a(l, c.this.a("userUniqueId", com.ironsource.sdk.g.c.a().d(i), "productType", i, null, null, null, null, null, false), "onGetUserUniqueIdSuccess", "onGetUserUniqueIdFail"));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v11 java.lang.String, still in use, count: 2, list:
              (r5v11 java.lang.String) from 0x0051: INVOKE (r5v11 java.lang.String) STATIC call: android.text.TextUtils.isEmpty(java.lang.CharSequence):boolean A[MD:(java.lang.CharSequence):boolean (c), WRAPPED] (LINE:2245)
              (r5v11 java.lang.String) from 0x0064: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v11 java.lang.String) binds: [B:22:0x0062, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        @android.webkit.JavascriptInterface
        public void getAppsInstallTime(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.data.g r0 = new com.ironsource.sdk.data.g
                r0.<init>(r5)
                java.lang.String r1 = "systemApps"
                java.lang.String r0 = r0.i(r1)     // Catch: java.lang.Exception -> L1f
                com.ironsource.sdk.controller.c r1 = com.ironsource.sdk.controller.c.this     // Catch: java.lang.Exception -> L1f
                android.content.Context r1 = r1.getContext()     // Catch: java.lang.Exception -> L1f
                boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch: java.lang.Exception -> L1f
                org.json.JSONObject r0 = com.ironsource.environment.c.a(r1, r0)     // Catch: java.lang.Exception -> L1f
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1f
                r1 = 0
                goto L48
            L1f:
                r0 = move-exception
                com.ironsource.sdk.controller.c r1 = com.ironsource.sdk.controller.c.this
                java.lang.String r1 = com.ironsource.sdk.controller.c.a(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "getAppsInstallTime failed("
                r2.append(r3)
                java.lang.String r3 = r0.getLocalizedMessage()
                r2.append(r3)
                java.lang.String r3 = ")"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.ironsource.sdk.g.e.a(r1, r2)
                java.lang.String r0 = r0.getLocalizedMessage()
                r1 = 1
            L48:
                r2 = 0
                if (r1 == 0) goto L58
                com.ironsource.sdk.controller.c r1 = com.ironsource.sdk.controller.c.this
                java.lang.String r5 = com.ironsource.sdk.controller.c.b(r1, r5)
                boolean r1 = android.text.TextUtils.isEmpty(r5)
                if (r1 != 0) goto L65
                goto L64
            L58:
                com.ironsource.sdk.controller.c r1 = com.ironsource.sdk.controller.c.this
                java.lang.String r5 = com.ironsource.sdk.controller.c.a(r1, r5)
                boolean r1 = android.text.TextUtils.isEmpty(r5)
                if (r1 != 0) goto L65
            L64:
                r2 = r5
            L65:
                boolean r5 = android.text.TextUtils.isEmpty(r2)
                if (r5 != 0) goto L88
                java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset()     // Catch: java.io.UnsupportedEncodingException -> L78
                java.lang.String r5 = r5.name()     // Catch: java.io.UnsupportedEncodingException -> L78
                java.lang.String r5 = java.net.URLDecoder.decode(r0, r5)     // Catch: java.io.UnsupportedEncodingException -> L78
                goto L7d
            L78:
                r5 = move-exception
                r5.printStackTrace()
                r5 = r0
            L7d:
                com.ironsource.sdk.controller.c r0 = com.ironsource.sdk.controller.c.this
                java.lang.String r5 = com.ironsource.sdk.controller.c.a(r0, r2, r5)
                com.ironsource.sdk.controller.c r0 = com.ironsource.sdk.controller.c.this
                com.ironsource.sdk.controller.c.c(r0, r5)
            L88:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.c.C0376c.getAppsInstallTime(java.lang.String):void");
        }

        @JavascriptInterface
        public void onGetUserUniqueIdSuccess(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onGetUserUniqueIdSuccess(" + str + ")");
        }

        @JavascriptInterface
        public void onGetUserUniqueIdFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onGetUserUniqueIdFail(" + str + ")");
        }

        private void b(String str, JSONArray jSONArray) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c.this.i(c.this.a(str, jSONArray.toString(), "onGetUDIASuccess", "onGetUDIAFail"));
        }

        @JavascriptInterface
        public void onOfferWallGeneric(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onOfferWallGeneric(" + str + ")");
            if (c.this.g(e.d.OfferWall.toString())) {
                c.this.aa.onOWGeneric("", "");
            }
        }

        @JavascriptInterface
        public void setUserData(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "setUserData(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            if (!gVar.f("key")) {
                c.this.a(str, false, "key does not exist", (String) null);
                return;
            }
            if (!gVar.f("value")) {
                c.this.a(str, false, "value does not exist", (String) null);
                return;
            }
            String i = gVar.i("key");
            String i2 = gVar.i("value");
            if (com.ironsource.sdk.g.c.a().a(i, i2)) {
                c.this.i(c.this.f(c.this.l(str), c.this.a(i, i2, null, null, null, null, null, null, null, false)));
                return;
            }
            c.this.a(str, false, "SetUserData failed writing to shared preferences", (String) null);
        }

        @JavascriptInterface
        public void getUserData(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "getUserData(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            if (!gVar.f("key")) {
                c.this.a(str, false, "key does not exist", (String) null);
                return;
            }
            String l = c.this.l(str);
            String i = gVar.i("key");
            c.this.i(c.this.f(l, c.this.a(i, com.ironsource.sdk.g.c.a().c(i), null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void onGetUserCreditsFail(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onGetUserCreditsFail(" + str + ")");
            final String i = new com.ironsource.sdk.data.g(str).i("errMsg");
            if (c.this.g(e.d.OfferWall.toString())) {
                c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.14
                    @Override // java.lang.Runnable
                    public void run() {
                        String str2 = i;
                        if (str2 == null) {
                            str2 = "We're sorry, some error occurred. we will investigate it";
                        }
                        c.this.aa.onGetOWCreditsFailed(str2);
                    }
                });
            }
            c.this.a(str, true, (String) null, (String) null);
            c.this.e("onGetUserCreditsFail", str);
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "onAdWindowsClosed(" + str + ")");
            c.this.af.adClosed();
            c.this.af.setDisplayedDemandSourceName(null);
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            String i = gVar.i("productType");
            final String i2 = gVar.i("demandSourceName");
            final e.d h = c.this.h(i);
            Log.d(c.this.p, "onAdClosed() with type " + h);
            if (!c.this.g(i) || i == null) {
                return;
            }
            c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.15
                @Override // java.lang.Runnable
                public void run() {
                    if (h == e.d.RewardedVideo || h == e.d.Interstitial) {
                        com.ironsource.sdk.e.a.a b2 = c.this.b(h);
                        if (b2 != null) {
                            b2.a(h, i2);
                            return;
                        }
                        return;
                    }
                    if (h == e.d.OfferWall) {
                        c.this.aa.onOWAdClosed();
                    }
                }
            });
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            Log.d(c.this.o, "onVideoStatusChanged(" + str + ")");
            com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
            String i = gVar.i("productType");
            if (c.this.ae == null || TextUtils.isEmpty(i) || !e.d.RewardedVideo.toString().equalsIgnoreCase(i)) {
                return;
            }
            String i2 = gVar.i("status");
            if ("started".equalsIgnoreCase(i2)) {
                c.this.ae.c();
                return;
            }
            if (TJAdUnitConstants.String.VIDEO_PAUSED.equalsIgnoreCase(i2)) {
                c.this.ae.d();
                return;
            }
            if (TJAdUnitConstants.String.VIDEO_PLAYING.equalsIgnoreCase(i2)) {
                c.this.ae.e();
                return;
            }
            if ("ended".equalsIgnoreCase(i2)) {
                c.this.ae.f();
                return;
            }
            if (TJAdUnitConstants.String.VIDEO_STOPPED.equalsIgnoreCase(i2)) {
                c.this.ae.g();
                return;
            }
            com.ironsource.sdk.g.e.a(c.this.o, "onVideoStatusChanged: unknown status: " + i2);
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            try {
                com.ironsource.sdk.g.e.a(c.this.o, "postAdEventNotification(" + str + ")");
                com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
                final String i = gVar.i("eventName");
                if (TextUtils.isEmpty(i)) {
                    c.this.a(str, false, "eventName does not exist", (String) null);
                    return;
                }
                final String i2 = gVar.i("dsName");
                final JSONObject jSONObject = (JSONObject) gVar.h("extData");
                String i3 = gVar.i("productType");
                final e.d h = c.this.h(i3);
                if (c.this.g(i3)) {
                    String l = c.this.l(str);
                    if (!TextUtils.isEmpty(l)) {
                        c.this.i(c.this.a(l, c.this.a("productType", i3, "eventName", i, "demandSourceName", i2, null, null, null, false), "postAdEventNotificationSuccess", "postAdEventNotificationFail"));
                    }
                    c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.16
                        @Override // java.lang.Runnable
                        public void run() {
                            if (h == e.d.Interstitial || h == e.d.RewardedVideo) {
                                com.ironsource.sdk.e.a.a b2 = c.this.b(h);
                                if (b2 != null) {
                                    b2.a(h, i2, i, jSONObject);
                                    return;
                                }
                                return;
                            }
                            if (h == e.d.OfferWall) {
                                c.this.aa.onOfferwallEventNotificationReceived(i, jSONObject);
                            }
                        }
                    });
                    return;
                }
                c.this.a(str, false, "productType does not exist", (String) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* compiled from: IronSourceWebView.java */
        /* renamed from: com.ironsource.sdk.controller.c$c$a */
        class a {
            a() {
            }

            void a(boolean z, String str, String str2) {
                com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g();
                gVar.a(z ? c.ao : c.ap, str);
                gVar.a("data", str2);
                c.this.a(gVar.toString(), z, (String) null, (String) null);
            }

            void a(boolean z, String str, com.ironsource.sdk.data.g gVar) {
                gVar.a(z ? c.ao : c.ap, str);
                c.this.a(gVar.toString(), z, (String) null, (String) null);
            }
        }

        @JavascriptInterface
        public void moatAPI(final String str) {
            c.this.a(new Runnable() { // from class: com.ironsource.sdk.controller.c.c.17
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.ironsource.sdk.g.e.a(c.this.o, "moatAPI(" + str + ")");
                        c.this.ak.a(new com.ironsource.sdk.data.g(str).toString(), C0376c.this.new a(), c.this.getWebview());
                    } catch (Exception e) {
                        e.printStackTrace();
                        com.ironsource.sdk.g.e.a(c.this.o, "moatAPI failed with exception " + e.getMessage());
                    }
                }
            });
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            try {
                com.ironsource.sdk.g.e.a(c.this.o, "permissionsAPI(" + str + ")");
                c.this.al.a(new com.ironsource.sdk.data.g(str).toString(), new a());
            } catch (Exception e) {
                e.printStackTrace();
                com.ironsource.sdk.g.e.a(c.this.o, "permissionsAPI failed with exception " + e.getMessage());
            }
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "getDeviceVolume(" + str + ")");
            try {
                float b2 = com.ironsource.sdk.g.a.a(c.this.getCurrentActivityContext()).b(c.this.getCurrentActivityContext());
                com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
                gVar.a("deviceVolume", String.valueOf(b2));
                c.this.a(gVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void locationServicesEnabled(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "locationServicesEnabled(" + str + ")");
            try {
                boolean b2 = com.ironsource.environment.d.b(c.this.getContext());
                com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
                gVar.a("status", String.valueOf(b2));
                c.this.a(gVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getDeviceLocation(String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "getDeviceLocation(" + str + ")");
            try {
                c.this.a(c.this.a(str, com.ironsource.environment.d.a(c.this.getContext())).toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getDevicePreciseLocation(final String str) {
            com.ironsource.sdk.g.e.a(c.this.o, "getDevicePreciseLocation(" + str + ")");
            try {
                com.ironsource.environment.d.a(c.this.getContext(), new d.a() { // from class: com.ironsource.sdk.controller.c.c.18
                    @Override // com.ironsource.environment.d.a
                    public void a(Location location) {
                        c.this.a(c.this.a(str, location).toString(), true, (String) null, (String) null);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        while (this.am.size() > 0) {
            i(this.am.get(0));
            this.am.remove(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.ironsource.sdk.data.g a(String str, Location location) {
        com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
        if (location != null) {
            gVar.a(com.umeng.analytics.pro.b.H, location.getProvider());
            gVar.a("latitude", Double.toString(location.getLatitude()));
            gVar.a("longitude", Double.toString(location.getLongitude()));
            gVar.a("altitude", Double.toString(location.getAltitude()));
            gVar.a("time", Long.toString(location.getTime()));
            gVar.a("accuracy", Float.toString(location.getAccuracy()));
            gVar.a("bearing", Float.toString(location.getBearing()));
            gVar.a("speed", Float.toString(location.getSpeed()));
        } else {
            gVar.a("error", "location data is not available");
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.ironsource.sdk.e.a.a b(e.d dVar) {
        if (dVar == e.d.Interstitial) {
            return this.W;
        }
        if (dVar == e.d.RewardedVideo) {
            return this.U;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e.d h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(e.d.Interstitial.toString())) {
            return e.d.Interstitial;
        }
        if (str.equalsIgnoreCase(e.d.RewardedVideo.toString())) {
            return e.d.RewardedVideo;
        }
        if (str.equalsIgnoreCase(e.d.OfferWall.toString())) {
            return e.d.OfferWall;
        }
        return null;
    }

    public static void setEXTERNAL_URL(String str) {
        e = str;
    }

    public void setVideoEventsListener(g gVar) {
        this.ae = gVar;
    }

    public void c() {
        this.ae = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewBackground(String str) {
        String i2 = new com.ironsource.sdk.data.g(str).i("color");
        setBackgroundColor(!TJAdUnitConstants.String.TRANSPARENT.equalsIgnoreCase(i2) ? Color.parseColor(i2) : 0);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.ironsource.sdk.controller.c$2] */
    public void a(final int i2) {
        try {
            loadUrl("about:blank");
        } catch (Throwable th) {
            com.ironsource.sdk.g.e.b(this.o, "WebViewController:: load: " + th.toString());
            new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=webviewLoadBlank");
        }
        String str = "file://" + this.ad + File.separator + "mobileController.html";
        if (new File(this.ad + File.separator + "mobileController.html").exists()) {
            JSONObject j2 = com.ironsource.sdk.g.f.j();
            setWebDebuggingEnabled(j2);
            this.F = d(j2);
            String str2 = str + "?" + this.F;
            this.I = new CountDownTimer(50000L, 1000L) { // from class: com.ironsource.sdk.controller.c.2
                @Override // android.os.CountDownTimer
                public void onTick(long j3) {
                    com.ironsource.sdk.g.e.a(c.this.o, "Loading Controller Timer Tick " + j3);
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    com.ironsource.sdk.g.e.a(c.this.o, "Loading Controller Timer Finish");
                    if (i2 == 3) {
                        c.this.J.cancel();
                        for (com.ironsource.sdk.data.b bVar : c.this.aj.a(e.d.RewardedVideo)) {
                            if (bVar.b() == 1) {
                                c.this.a(e.d.RewardedVideo, bVar.a());
                            }
                        }
                        for (com.ironsource.sdk.data.b bVar2 : c.this.aj.a(e.d.Interstitial)) {
                            if (bVar2.b() == 1) {
                                c.this.a(e.d.Interstitial, bVar2.a());
                            }
                        }
                        if (c.this.B) {
                            c.this.a(e.d.OfferWall, (String) null);
                        }
                        if (c.this.C) {
                            c.this.a(e.d.OfferWallCredits, (String) null);
                            return;
                        }
                        return;
                    }
                    c.this.a(2);
                }
            }.start();
            try {
                loadUrl(str2);
            } catch (Throwable th2) {
                com.ironsource.sdk.g.e.b(this.o, "WebViewController:: load: " + th2.toString());
                new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=webviewLoadWithPath");
            }
            com.ironsource.sdk.g.e.a(this.o, "load(): " + str2);
            return;
        }
        com.ironsource.sdk.g.e.a(this.o, "load(): Mobile Controller HTML Does not exist");
        new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=htmlControllerDoesNotExistOnFileSystem");
    }

    private void setWebDebuggingEnabled(JSONObject jSONObject) {
        if (jSONObject.optBoolean("inspectWebview")) {
            o();
        }
    }

    private void a(String str, String str2, e.d dVar, com.ironsource.sdk.data.b bVar, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            a("User id or Application key are missing", dVar, bVar.a());
            return;
        }
        if (this.ab == e.b.Ready) {
            com.ironsource.sdk.g.c.a().a(str, dVar);
            com.ironsource.sdk.g.c.a().b(str2, dVar);
            i(b(dVar, bVar));
            return;
        }
        a(dVar, bVar);
        if (this.ab == e.b.Failed) {
            a(com.ironsource.sdk.g.f.a(str3, "Initiating Controller"), dVar, bVar.a());
        } else if (this.D) {
            b();
        }
    }

    public void a(String str, String str2, com.ironsource.sdk.data.b bVar, com.ironsource.sdk.e.a.c cVar) {
        this.r = str;
        this.s = str2;
        this.an.a(e.d.RewardedVideo, str, str2);
        this.U = cVar;
        this.af.setRVAppKey(str);
        this.af.setRVUserId(str2);
        a(str, str2, e.d.RewardedVideo, bVar, "Init RV");
    }

    public void a(String str, String str2, com.ironsource.sdk.data.b bVar, com.ironsource.sdk.e.a.b bVar2) {
        this.w = str;
        this.x = str2;
        this.an.a(e.d.Interstitial, str, str2);
        this.W = bVar2;
        this.af.setInterstitialAppKey(this.w);
        this.af.setInterstitialUserId(this.x);
        a(this.w, this.x, e.d.Interstitial, bVar, "Init IS");
    }

    public void a(final String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("demandSourceName", str);
        }
        String b2 = b(hashMap);
        if (!b(str)) {
            this.af.setReportLoadInterstitial(str, true);
            i(a("loadInterstitial", b2, "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
        } else if (g(e.d.Interstitial.toString())) {
            a(new Runnable() { // from class: com.ironsource.sdk.controller.c.3
                @Override // java.lang.Runnable
                public void run() {
                    c.this.W.c(str);
                }
            });
        }
    }

    public boolean b(String str) {
        com.ironsource.sdk.data.b a2 = this.aj.a(e.d.Interstitial, str);
        return a2 != null && a2.c();
    }

    public void a(JSONObject jSONObject) {
        i(a(e.d.Interstitial, jSONObject));
    }

    public void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.e.d dVar) {
        this.t = str;
        this.u = str2;
        this.an.a(e.d.OfferWall, str, str2);
        this.v = map;
        this.aa = dVar;
        this.af.setOfferWallExtraParams(this.v);
        this.af.setOfferwallReportInit(true);
        a(this.t, this.u, e.d.OfferWall, (com.ironsource.sdk.data.b) null, "Init OW");
    }

    public void a(Map<String, String> map) {
        this.v = map;
        i(b("showOfferWall", "onShowOfferWallSuccess", "onShowOfferWallFail"));
    }

    public void a(String str, String str2, com.ironsource.sdk.e.d dVar) {
        this.y = str;
        this.z = str2;
        this.an.a(e.d.OfferWallCredits, str, str2);
        this.aa = dVar;
        a(this.y, this.z, e.d.OfferWallCredits, (com.ironsource.sdk.data.b) null, "Show OW Credits");
    }

    public void b(JSONObject jSONObject) {
        b("updateConsentInfo", f("updateConsentInfo", jSONObject != null ? jSONObject.toString() : null));
    }

    private String b(e.d dVar, com.ironsource.sdk.data.b bVar) {
        if (dVar != e.d.RewardedVideo && dVar != e.d.Interstitial && dVar != e.d.OfferWall) {
            return dVar == e.d.OfferWallCredits ? a("getUserCredits", a("productType", "OfferWall", "applicationKey", this.y, "applicationUserId", this.z, null, null, null, false), "null", "onGetUserCreditsFail") : "";
        }
        HashMap hashMap = new HashMap();
        com.ironsource.sdk.data.c a2 = this.an.a(dVar);
        if (a2 != null) {
            hashMap.put("applicationKey", a2.f7150a);
            hashMap.put("applicationUserId", a2.f7151b);
        }
        if (bVar != null) {
            if (bVar.d() != null) {
                hashMap.putAll(bVar.d());
            }
            hashMap.put("demandSourceName", bVar.a());
        } else if (a(dVar) != null) {
            hashMap.putAll(a(dVar));
        }
        String b2 = b(hashMap);
        a.C0375a a3 = a.C0375a.a(dVar);
        return a(a3.f7007a, b2, a3.f7008b, a3.f7009c);
    }

    private String a(e.d dVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String optString = jSONObject.optString("demandSourceName");
        com.ironsource.sdk.data.b a2 = this.aj.a(dVar, optString);
        if (a2 != null) {
            if (a2.d() != null) {
                hashMap.putAll(a2.d());
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
        } else if (a(dVar) != null) {
            hashMap.putAll(a(dVar));
        }
        String b2 = b(hashMap);
        a.C0375a b3 = a.C0375a.b(dVar);
        return a(b3.f7007a, b2, b3.f7008b, b3.f7009c);
    }

    private String b(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), com.ironsource.sdk.g.f.b(next.getValue()));
                } catch (JSONException e2) {
                    com.ironsource.sdk.g.e.a(this.o, "flatMapToJsonAsStringfailed " + e2.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    void a(e.d dVar, com.ironsource.sdk.data.b bVar) {
        if (dVar == e.d.RewardedVideo || dVar == e.d.Interstitial) {
            if (bVar != null) {
                bVar.a(1);
            }
        } else if (dVar == e.d.OfferWall) {
            this.B = true;
        } else if (dVar == e.d.OfferWallCredits) {
            this.C = true;
        }
        com.ironsource.sdk.g.e.a(this.o, "setMissProduct(" + dVar + ")");
    }

    private void a(final String str, final e.d dVar, final String str2) {
        if (g(dVar.toString())) {
            a(new Runnable() { // from class: com.ironsource.sdk.controller.c.4
                @Override // java.lang.Runnable
                public void run() {
                    if (e.d.RewardedVideo == dVar || e.d.Interstitial == dVar) {
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        com.ironsource.sdk.e.a.a b2 = c.this.b(dVar);
                        Log.d(c.this.o, "onAdProductInitFailed (message:" + str + ")(" + dVar + ")");
                        if (b2 != null) {
                            b2.a(dVar, str2, str);
                            return;
                        }
                        return;
                    }
                    if (e.d.OfferWall == dVar) {
                        c.this.aa.onOfferwallInitFail(str);
                    } else if (e.d.OfferWallCredits == dVar) {
                        c.this.aa.onGetOWCreditsFailed(str);
                    }
                }
            });
        }
    }

    public void c(JSONObject jSONObject) {
        i(a(e.d.RewardedVideo, jSONObject));
    }

    public void a(String str, String str2) {
        i(f("assetCached", a("file", str, "path", str2, null, null, null, null, null, false)));
    }

    public void a(String str, String str2, String str3) {
        i(f("assetCachedFailed", a("file", str, "path", str2, "errMsg", str3, null, null, null, false)));
    }

    public void d() {
        if (this.ab == e.b.Ready) {
            i(n("enterBackground"));
        }
    }

    public void e() {
        if (this.ab == e.b.Ready) {
            i(n("enterForeground"));
        }
    }

    public void a(boolean z, String str) {
        i(f("viewableChange", a("webview", str, null, null, null, null, null, null, "isViewable", z)));
    }

    public void c(String str) {
        i(f("nativeNavigationPressed", a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void f() {
        i(n("pageFinished"));
    }

    public void g() {
        i(n("interceptedUrlToStore"));
    }

    private void b(String str, String str2) {
        if (!q() && k(str)) {
            this.am.add(str2);
        } else {
            i(str2);
        }
    }

    private boolean q() {
        return e.b.Ready.equals(this.ab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = "empty";
        if (getDebugMode() == e.c.MODE_0.a()) {
            str2 = "console.log(\"JS exeption: \" + JSON.stringify(e));";
        } else if (getDebugMode() >= e.c.MODE_1.a() && getDebugMode() <= e.c.MODE_3.a()) {
            str2 = "console.log(\"JS exeption: \" + JSON.stringify(e));";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("try{");
        sb.append(str);
        sb.append("}catch(e){");
        sb.append(str2);
        sb.append("}");
        final String str3 = "javascript:" + sb.toString();
        a(new Runnable() { // from class: com.ironsource.sdk.controller.c.5
            @Override // java.lang.Runnable
            public void run() {
                com.ironsource.sdk.g.e.a(c.this.o, str3);
                try {
                    if (c.this.ac != null) {
                        if (c.this.ac.booleanValue()) {
                            c.this.j(sb.toString());
                        } else {
                            c.this.loadUrl(str3);
                        }
                    } else if (Build.VERSION.SDK_INT >= 19) {
                        try {
                            try {
                                c.this.j(sb.toString());
                                c.this.ac = true;
                            } catch (NoSuchMethodError e2) {
                                com.ironsource.sdk.g.e.b(c.this.o, "evaluateJavascrip NoSuchMethodError: SDK version=" + Build.VERSION.SDK_INT + " " + e2);
                                c.this.loadUrl(str3);
                                c.this.ac = false;
                            }
                        } catch (Throwable th) {
                            com.ironsource.sdk.g.e.b(c.this.o, "evaluateJavascrip Exception: SDK version=" + Build.VERSION.SDK_INT + " " + th);
                            c.this.loadUrl(str3);
                            c.this.ac = false;
                        }
                    } else {
                        c.this.loadUrl(str3);
                        c.this.ac = false;
                    }
                } catch (Throwable th2) {
                    com.ironsource.sdk.g.e.b(c.this.o, "injectJavascript: " + th2.toString());
                    new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=injectJavaScript");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void j(String str) {
        evaluateJavascript(str, null);
    }

    private boolean k(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("updateConsentInfo");
        return arrayList.contains(str);
    }

    public Context getCurrentActivityContext() {
        return ((MutableContextWrapper) this.m).getBaseContext();
    }

    private String d(JSONObject jSONObject) {
        com.ironsource.sdk.g.a a2 = com.ironsource.sdk.g.a.a(getContext());
        StringBuilder sb = new StringBuilder();
        String g2 = com.ironsource.sdk.g.a.g();
        if (!TextUtils.isEmpty(g2)) {
            sb.append("SDKVersion");
            sb.append("=");
            sb.append(g2);
            sb.append("&");
        }
        String c2 = a2.c();
        if (!TextUtils.isEmpty(c2)) {
            sb.append("deviceOs");
            sb.append("=");
            sb.append(c2);
        }
        Uri parse = Uri.parse(com.ironsource.sdk.g.f.d());
        if (parse != null) {
            String str = parse.getScheme() + ":";
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            sb.append("&");
            sb.append("protocol");
            sb.append("=");
            sb.append(str);
            sb.append("&");
            sb.append("domain");
            sb.append("=");
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{"isSecured", "applicationKey"}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append("&");
                        sb.append("controllerConfig");
                        sb.append("=");
                        sb.append(jSONObject2);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            sb.append("&");
            sb.append("debug");
            sb.append("=");
            sb.append(getDebugMode());
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.ar != null) {
            this.ar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str, boolean z, String str2, String str3) {
        com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g(str);
        String i2 = gVar.i(ao);
        String i3 = gVar.i(ap);
        if (!z) {
            if (!TextUtils.isEmpty(i3)) {
                i2 = i3;
            }
            i2 = null;
        }
        if (TextUtils.isEmpty(i2)) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                str = new JSONObject(str).put("errMsg", str2).toString();
            } catch (JSONException unused) {
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            try {
                str = new JSONObject(str).put("errCode", str3).toString();
            } catch (JSONException unused2) {
            }
        }
        i(f(i2, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String l(String str) {
        return new com.ironsource.sdk.data.g(str).i(ao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String m(String str) {
        return new com.ironsource.sdk.data.g(str).i(ap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, com.ironsource.sdk.g.f.b(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, com.ironsource.sdk.g.f.b(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, com.ironsource.sdk.g.f.b(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, com.ironsource.sdk.g.f.b(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=" + e2.getStackTrace()[0].getMethodName());
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] f(Context context) {
        boolean z;
        com.ironsource.sdk.g.a a2 = com.ironsource.sdk.g.a.a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appOrientation", com.ironsource.sdk.g.f.a(com.ironsource.environment.c.e(getCurrentActivityContext())));
            String a3 = a2.a();
            if (a3 != null) {
                jSONObject.put(com.ironsource.sdk.g.f.b("deviceOEM"), com.ironsource.sdk.g.f.b(a3));
            }
            String b2 = a2.b();
            if (b2 != null) {
                jSONObject.put(com.ironsource.sdk.g.f.b("deviceModel"), com.ironsource.sdk.g.f.b(b2));
                z = false;
            } else {
                z = true;
            }
            try {
                com.ironsource.sdk.g.f.b(context);
                String b3 = com.ironsource.sdk.g.f.b();
                Boolean valueOf = Boolean.valueOf(com.ironsource.sdk.g.f.c());
                if (!TextUtils.isEmpty(b3)) {
                    com.ironsource.sdk.g.e.a(this.o, "add AID and LAT");
                    jSONObject.put(GpsHelper.IS_LIMIT_AD_TRACKING_ENABLED_KEY, valueOf);
                    jSONObject.put("deviceIds[AID]", com.ironsource.sdk.g.f.b(b3));
                }
                String c2 = a2.c();
                if (c2 != null) {
                    jSONObject.put(com.ironsource.sdk.g.f.b("deviceOs"), com.ironsource.sdk.g.f.b(c2));
                } else {
                    z = true;
                }
                String d2 = a2.d();
                if (d2 != null) {
                    jSONObject.put(com.ironsource.sdk.g.f.b("deviceOSVersion"), d2.replaceAll("[^0-9/.]", ""));
                } else {
                    z = true;
                }
                String valueOf2 = String.valueOf(a2.e());
                if (valueOf2 != null) {
                    jSONObject.put(com.ironsource.sdk.g.f.b("deviceApiLevel"), valueOf2);
                } else {
                    z = true;
                }
                String g2 = com.ironsource.sdk.g.a.g();
                if (g2 != null) {
                    jSONObject.put(com.ironsource.sdk.g.f.b("SDKVersion"), com.ironsource.sdk.g.f.b(g2));
                }
                if (a2.f() != null && a2.f().length() > 0) {
                    jSONObject.put(com.ironsource.sdk.g.f.b("mobileCarrier"), com.ironsource.sdk.g.f.b(a2.f()));
                }
                String a4 = com.ironsource.environment.b.a(context);
                if (TextUtils.isEmpty(a4)) {
                    z = true;
                } else {
                    jSONObject.put(com.ironsource.sdk.g.f.b("connectionType"), com.ironsource.sdk.g.f.b(a4));
                }
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put(com.ironsource.sdk.g.f.b("deviceLanguage"), com.ironsource.sdk.g.f.b(language.toUpperCase()));
                }
                if (com.ironsource.sdk.g.f.h()) {
                    jSONObject.put(com.ironsource.sdk.g.f.b("diskFreeSize"), com.ironsource.sdk.g.f.b(String.valueOf(com.ironsource.environment.c.a(this.ad))));
                } else {
                    z = true;
                }
                String valueOf3 = String.valueOf(com.ironsource.environment.c.g());
                if (TextUtils.isEmpty(valueOf3)) {
                    z = true;
                } else {
                    jSONObject.put(com.ironsource.sdk.g.f.b("deviceScreenSize") + "[" + com.ironsource.sdk.g.f.b("width") + "]", com.ironsource.sdk.g.f.b(valueOf3));
                }
                jSONObject.put(com.ironsource.sdk.g.f.b("deviceScreenSize") + "[" + com.ironsource.sdk.g.f.b("height") + "]", com.ironsource.sdk.g.f.b(String.valueOf(com.ironsource.environment.c.h())));
                String a5 = com.ironsource.environment.a.a(getContext());
                if (!TextUtils.isEmpty(a5)) {
                    jSONObject.put(com.ironsource.sdk.g.f.b("bundleId"), com.ironsource.sdk.g.f.b(a5));
                }
                String valueOf4 = String.valueOf(com.ironsource.environment.c.i());
                if (!TextUtils.isEmpty(valueOf4)) {
                    jSONObject.put(com.ironsource.sdk.g.f.b("deviceScreenScale"), com.ironsource.sdk.g.f.b(valueOf4));
                }
                String valueOf5 = String.valueOf(com.ironsource.environment.c.f());
                if (!TextUtils.isEmpty(valueOf5)) {
                    jSONObject.put(com.ironsource.sdk.g.f.b("unLocked"), com.ironsource.sdk.g.f.b(valueOf5));
                }
                float b4 = com.ironsource.sdk.g.a.a(context).b(context);
                if (!TextUtils.isEmpty(valueOf5)) {
                    jSONObject.put(com.ironsource.sdk.g.f.b("deviceVolume"), b4);
                }
                Context currentActivityContext = getCurrentActivityContext();
                if (Build.VERSION.SDK_INT >= 19 && (currentActivityContext instanceof Activity)) {
                    jSONObject.put(com.ironsource.sdk.g.f.b("immersiveMode"), com.ironsource.environment.c.a((Activity) currentActivityContext));
                }
                jSONObject.put(com.ironsource.sdk.g.f.b("batteryLevel"), com.ironsource.environment.c.k(currentActivityContext));
                jSONObject.put(com.ironsource.sdk.g.f.b("mcc"), com.ironsource.environment.b.e(currentActivityContext));
                jSONObject.put(com.ironsource.sdk.g.f.b("mnc"), com.ironsource.environment.b.f(currentActivityContext));
                jSONObject.put(com.ironsource.sdk.g.f.b("phoneType"), com.ironsource.environment.b.h(currentActivityContext));
                jSONObject.put(com.ironsource.sdk.g.f.b("simOperator"), com.ironsource.sdk.g.f.b(com.ironsource.environment.b.g(currentActivityContext)));
                jSONObject.put(com.ironsource.sdk.g.f.b("lastUpdateTime"), com.ironsource.environment.a.d(currentActivityContext));
                jSONObject.put(com.ironsource.sdk.g.f.b("firstInstallTime"), com.ironsource.environment.a.c(currentActivityContext));
                jSONObject.put(com.ironsource.sdk.g.f.b("appVersion"), com.ironsource.sdk.g.f.b(com.ironsource.environment.a.e(currentActivityContext)));
            } catch (JSONException e2) {
                e = e2;
                e.printStackTrace();
                new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=" + e.getStackTrace()[0].getMethodName());
                return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
            }
        } catch (JSONException e3) {
            e = e3;
            z = false;
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] c(String str, String str2) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        String str3 = "";
        String str4 = "";
        Map<String, String> map = null;
        if (TextUtils.isEmpty(str)) {
            z = true;
        } else {
            e.d h2 = h(str);
            if (h2 == e.d.RewardedVideo || h2 == e.d.Interstitial) {
                com.ironsource.sdk.data.c a2 = this.an.a(h2);
                String str5 = a2.f7150a;
                String str6 = a2.f7151b;
                com.ironsource.sdk.data.b a3 = this.aj.a(h2, str2);
                if (a3 != null) {
                    map = a3.d();
                    map.put("demandSourceName", str2);
                }
                str4 = str6;
                str3 = str5;
            } else if (h2 == e.d.OfferWall) {
                String str7 = this.t;
                String str8 = this.u;
                map = this.v;
                str4 = str8;
                str3 = str7;
            }
            try {
                jSONObject.put("productType", str);
            } catch (JSONException e2) {
                e2.printStackTrace();
                new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=noProductType");
            }
            z = false;
        }
        if (TextUtils.isEmpty(str4)) {
            z = true;
        } else {
            try {
                jSONObject.put(com.ironsource.sdk.g.f.b("applicationUserId"), com.ironsource.sdk.g.f.b(str4));
            } catch (JSONException e3) {
                e3.printStackTrace();
                new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=encodeAppUserId");
            }
        }
        if (TextUtils.isEmpty(str3)) {
            z = true;
        } else {
            try {
                jSONObject.put(com.ironsource.sdk.g.f.b("applicationKey"), com.ironsource.sdk.g.f.b(str3));
            } catch (JSONException e4) {
                e4.printStackTrace();
                new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=encodeAppKey");
            }
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    setWebviewCache(entry.getValue());
                }
                try {
                    jSONObject.put(com.ironsource.sdk.g.f.b(entry.getKey()), com.ironsource.sdk.g.f.b(entry.getValue()));
                } catch (JSONException e5) {
                    e5.printStackTrace();
                    new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=extraParametersToJson");
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(String str, String str2) {
        boolean z;
        boolean z2;
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
            if (!TextUtils.isEmpty(str2) && !str2.equalsIgnoreCase("null")) {
                List<ApplicationInfo> g2 = com.ironsource.environment.c.g(getContext());
                JSONArray jSONArray = new JSONArray(str);
                JSONObject jSONObject2 = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String trim = jSONArray.getString(i2).trim();
                    if (!TextUtils.isEmpty(trim)) {
                        JSONObject jSONObject3 = new JSONObject();
                        Iterator<ApplicationInfo> it = g2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = false;
                                break;
                            }
                            if (trim.equalsIgnoreCase(it.next().packageName)) {
                                jSONObject3.put(k, true);
                                jSONObject2.put(trim, jSONObject3);
                                z2 = true;
                                break;
                            }
                        }
                        if (!z2) {
                            jSONObject3.put(k, false);
                            jSONObject2.put(trim, jSONObject3);
                        }
                    }
                }
                jSONObject.put(l, jSONObject2);
                jSONObject.put(j, str2);
                z = false;
                return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
            }
            jSONObject.put("error", "requestId is null or empty");
        } else {
            jSONObject.put("error", "appIds is null or empty");
        }
        z = true;
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    @Override // com.ironsource.sdk.f.a.c
    public void a(com.ironsource.sdk.data.f fVar) {
        if (fVar.a().contains("mobileController.html")) {
            a(1);
        } else {
            a(fVar.a(), fVar.b());
        }
    }

    @Override // com.ironsource.sdk.f.a.c
    public void b(com.ironsource.sdk.data.f fVar) {
        if (fVar.a().contains("mobileController.html")) {
            this.J.cancel();
            for (com.ironsource.sdk.data.b bVar : this.aj.a(e.d.RewardedVideo)) {
                if (bVar.b() == 1) {
                    a(e.d.RewardedVideo, bVar.a());
                }
            }
            for (com.ironsource.sdk.data.b bVar2 : this.aj.a(e.d.Interstitial)) {
                if (bVar2.b() == 1) {
                    a(e.d.Interstitial, bVar2.a());
                }
            }
            if (this.B) {
                a(e.d.OfferWall, (String) null);
            }
            if (this.C) {
                a(e.d.OfferWallCredits, (String) null);
                return;
            }
            return;
        }
        a(fVar.a(), fVar.b(), fVar.c());
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        com.ironsource.sdk.g.e.a(this.o, str + " " + str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str, String str2) {
        final String i2 = new com.ironsource.sdk.data.g(str2).i("errMsg");
        if (TextUtils.isEmpty(i2)) {
            return;
        }
        a(new Runnable() { // from class: com.ironsource.sdk.controller.c.6
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.getDebugMode() == e.c.MODE_3.a()) {
                    Toast.makeText(c.this.getCurrentActivityContext(), str + " : " + i2, 1).show();
                }
            }
        });
    }

    public void setControllerKeyPressed(String str) {
        this.G = str;
    }

    public String getControllerKeyPressed() {
        String str = this.G;
        setControllerKeyPressed("interrupt");
        return str;
    }

    public void d(String str) {
        i(f("deviceStatusChanged", a("connectionType", str, null, null, null, null, null, null, null, false)));
    }

    public void e(String str) {
        if (str.equals(TJAdUnitConstants.String.FORCE_CLOSE)) {
            r();
        }
        i(f("engageEnd", a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void c(Context context) {
        context.registerReceiver(this.aq, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void d(Context context) {
        try {
            context.unregisterReceiver(this.aq);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e2) {
            Log.e(this.o, "unregisterConnectionReceiver - " + e2);
            new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=" + e2.getStackTrace()[0].getMethodName());
        }
    }

    public void h() {
        if (Build.VERSION.SDK_INT > 10) {
            try {
                onPause();
            } catch (Throwable th) {
                com.ironsource.sdk.g.e.a(this.o, "WebViewController: pause() - " + th);
                new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=webviewPause");
            }
        }
    }

    public void i() {
        if (Build.VERSION.SDK_INT > 10) {
            try {
                onResume();
            } catch (Throwable th) {
                com.ironsource.sdk.g.e.a(this.o, "WebViewController: onResume() - " + th);
                new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=webviewResume");
            }
        }
    }

    public void setOnWebViewControllerChangeListener(com.ironsource.sdk.e.f fVar) {
        this.ar = fVar;
    }

    public FrameLayout getLayout() {
        return this.R;
    }

    public boolean j() {
        return this.O != null;
    }

    public void k() {
        this.N.onHideCustomView();
    }

    private void setWebviewCache(String str) {
        if (str.equalsIgnoreCase("0")) {
            getSettings().setCacheMode(2);
        } else {
            getSettings().setCacheMode(-1);
        }
    }

    public boolean f(String str) throws Exception {
        List<String> d2 = com.ironsource.sdk.g.c.a().d();
        if (d2 == null) {
            return false;
        }
        try {
            if (d2.isEmpty()) {
                return false;
            }
            Iterator<String> it = d2.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    com.ironsource.environment.e.a(getCurrentActivityContext(), str);
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void setState(d dVar) {
        this.S = dVar;
    }

    public d getState() {
        return this.S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e.d dVar, String str) {
        String str2 = "";
        switch (dVar) {
            case RewardedVideo:
                str2 = "Init RV";
                break;
            case Interstitial:
                str2 = "Init IS";
                break;
            case OfferWall:
                str2 = "Init OW";
                break;
            case OfferWallCredits:
                str2 = "Show OW Credits";
                break;
        }
        a(com.ironsource.sdk.g.f.a(str2, "Initiating Controller"), dVar, str);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
        if (this.A != null) {
            this.A.b();
        }
        if (this.aq != null) {
            this.aq = null;
        }
        this.n = null;
        this.m = null;
    }

    private String n(String str) {
        return "SSA_CORE.SDKController.runFunction('" + str + "');";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String f(String str, String str2) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "');";
    }

    private String b(String str, String str2, String str3) {
        return "SSA_CORE.SDKController.runFunction('" + str + "','" + str2 + "','" + str3 + "');";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "','" + str3 + "','" + str4 + "');";
    }

    public AdUnitsState getSavedState() {
        return this.af;
    }

    public void a(AdUnitsState adUnitsState) {
        synchronized (this.ag) {
            if (adUnitsState.shouldRestore() && this.ab.equals(e.b.Ready)) {
                Log.d(this.o, "restoreState(state:" + adUnitsState + ")");
                int displayedProduct = adUnitsState.getDisplayedProduct();
                if (displayedProduct != -1) {
                    if (displayedProduct == e.d.RewardedVideo.ordinal()) {
                        Log.d(this.o, "onRVAdClosed()");
                        e.d dVar = e.d.RewardedVideo;
                        String displayedDemandSourceName = adUnitsState.getDisplayedDemandSourceName();
                        com.ironsource.sdk.e.a.a b2 = b(dVar);
                        if (b2 != null && !TextUtils.isEmpty(displayedDemandSourceName)) {
                            b2.a(dVar, displayedDemandSourceName);
                        }
                    } else if (displayedProduct == e.d.Interstitial.ordinal()) {
                        Log.d(this.o, "onInterstitialAdClosed()");
                        e.d dVar2 = e.d.Interstitial;
                        String displayedDemandSourceName2 = adUnitsState.getDisplayedDemandSourceName();
                        com.ironsource.sdk.e.a.a b3 = b(dVar2);
                        if (b3 != null && !TextUtils.isEmpty(displayedDemandSourceName2)) {
                            b3.a(dVar2, displayedDemandSourceName2);
                        }
                    } else if (displayedProduct == e.d.OfferWall.ordinal()) {
                        Log.d(this.o, "onOWAdClosed()");
                        if (this.aa != null) {
                            this.aa.onOWAdClosed();
                        }
                    }
                    adUnitsState.adOpened(-1);
                    adUnitsState.setDisplayedDemandSourceName(null);
                } else {
                    Log.d(this.o, "No ad was opened");
                }
                String interstitialAppKey = adUnitsState.getInterstitialAppKey();
                String interstitialUserId = adUnitsState.getInterstitialUserId();
                for (com.ironsource.sdk.data.b bVar : this.aj.a(e.d.Interstitial)) {
                    if (bVar.b() == 2) {
                        Log.d(this.o, "initInterstitial(appKey:" + interstitialAppKey + ", userId:" + interstitialUserId + ", demandSource:" + bVar.a() + ")");
                        a(interstitialAppKey, interstitialUserId, bVar, this.W);
                    }
                }
                String rVAppKey = adUnitsState.getRVAppKey();
                String rVUserId = adUnitsState.getRVUserId();
                for (com.ironsource.sdk.data.b bVar2 : this.aj.a(e.d.RewardedVideo)) {
                    if (bVar2.b() == 2) {
                        String a2 = bVar2.a();
                        Log.d(this.o, "onRVNoMoreOffers()");
                        this.U.b(a2);
                        Log.d(this.o, "initRewardedVideo(appKey:" + rVAppKey + ", userId:" + rVUserId + ", demandSource:" + a2 + ")");
                        a(rVAppKey, rVUserId, bVar2, this.U);
                    }
                }
                adUnitsState.setShouldRestore(false);
            }
            this.af = adUnitsState;
        }
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            if (this.ar.b()) {
                return true;
            }
            return super.onKeyDown(i2, keyEvent);
        }
        return super.onKeyDown(i2, keyEvent);
    }

    void a(Runnable runnable) {
        this.n.post(runnable);
    }
}
