package com.ironsource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.wh;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class bh implements wh {

    /* renamed from: g, reason: collision with root package name */
    private static final String f15594g = "loadWithUrl | webView is not null";

    /* renamed from: h, reason: collision with root package name */
    private static final String f15595h = "bh";

    /* renamed from: i, reason: collision with root package name */
    private static final String f15596i = "file://";

    /* renamed from: a, reason: collision with root package name */
    private final String f15597a;

    /* renamed from: b, reason: collision with root package name */
    private String f15598b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f15599c;

    /* renamed from: d, reason: collision with root package name */
    private zg f15600d;

    /* renamed from: e, reason: collision with root package name */
    private ug f15601e;

    /* renamed from: f, reason: collision with root package name */
    private Context f15602f;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15603a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f15604b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15605c;

        a(String str, JSONObject jSONObject, String str2) {
            this.f15603a = str;
            this.f15604b = jSONObject;
            this.f15605c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (bh.this.f15599c != null) {
                mh.a(fr.f16289q, new hh().a(cc.f15708A, bh.f15594g).a());
            }
            try {
                bh.this.b(this.f15603a);
                bh.this.f15599c.loadUrl(bh.this.a(this.f15604b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", bh.this.f15597a);
                bh.this.f15600d.a(this.f15605c, jSONObject);
            } catch (Exception e4) {
                o9.d().a(e4);
                bh.this.b(this.f15603a, e4.getMessage());
                mh.a(fr.f16289q, new hh().a(cc.f15708A, e4.getMessage()).a());
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15607a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15608b;

        b(String str, String str2) {
            this.f15607a = str;
            this.f15608b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (bh.this.f15599c != null) {
                    bh.this.f15599c.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", bh.this.f15597a);
                if (bh.this.f15600d != null) {
                    bh.this.f15600d.a(this.f15607a, jSONObject);
                    bh.this.f15600d.b();
                }
                bh.this.f15600d = null;
                bh.this.f15602f = null;
            } catch (Exception e4) {
                o9.d().a(e4);
                Log.e(bh.f15595h, "performCleanup | could not destroy ISNAdView webView ID: " + bh.this.f15597a);
                mh.a(fr.f16290r, new hh().a(cc.f15708A, e4.getMessage()).a());
                bh.this.b(this.f15608b, e4.getMessage());
            }
        }
    }

    class c implements wh.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15610a;

        c(String str) {
            this.f15610a = str;
        }

        @Override // com.ironsource.wh.a
        public void a(String str) {
            Logger.i(bh.f15595h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            bh.this.b(this.f15610a, str);
        }

        @Override // com.ironsource.wh.a
        public void b(String str) {
            Logger.i(bh.f15595h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) bh.this.f15599c.getParent()).removeView(bh.this.f15599c);
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
            bh.this.e();
        }
    }

    private class d extends WebChromeClient {
        private d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z4, boolean z5, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(bh.this.new d());
            webView2.setWebViewClient(new e(bh.this, null));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        /* synthetic */ d(bh bhVar, a aVar) {
            this();
        }
    }

    private class e extends WebViewClient {
        private e() {
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean didCrash;
            String str = bh.f15595h;
            StringBuilder sb = new StringBuilder();
            sb.append("Chromium process crashed - detail.didCrash(): ");
            didCrash = renderProcessGoneDetail.didCrash();
            sb.append(didCrash);
            Logger.e(str, sb.toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            Intent a4 = new OpenUrlActivity.e(new k.b()).a(str).b(false).a(context);
            a4.addFlags(268435456);
            context.startActivity(a4);
            return true;
        }

        /* synthetic */ e(bh bhVar, a aVar) {
            this();
        }
    }

    public bh(xg xgVar, Context context, String str, ug ugVar) {
        this.f15602f = context;
        zg zgVar = new zg();
        this.f15600d = zgVar;
        zgVar.g(str);
        this.f15597a = str;
        this.f15600d.a(xgVar);
        this.f15601e = ugVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() {
        a("", "");
    }

    public String b() {
        return this.f15597a;
    }

    public zg c() {
        return this.f15600d;
    }

    public ug d() {
        return this.f15601e;
    }

    @Override // com.ironsource.wh
    public WebView getPresentingView() {
        return this.f15599c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.f15600d.c(str);
    }

    private String d(String str) {
        String substring = str.substring(str.indexOf("/") + 1);
        return substring.substring(substring.indexOf("/"));
    }

    public void e(String str) {
        this.f15598b = str;
    }

    @Override // com.ironsource.wh
    public void c(JSONObject jSONObject, String str, String str2) {
        try {
            this.f15600d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e4) {
            o9.d().a(e4);
            Logger.i(f15595h, "sendMessageToAd fail message: " + e4.getMessage());
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AddJavascriptInterface"})
    public void b(String str) {
        Logger.i(f15595h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f15602f);
        this.f15599c = webView;
        webView.addJavascriptInterface(new yg(this), vg.f20037e);
        this.f15599c.setWebViewClient(new ah(new c(str)));
        this.f15599c.setWebChromeClient(new d(this, null));
        ow.a(this.f15599c);
        this.f15600d.a(this.f15599c);
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (!c(str)) {
            return str;
        }
        return f15596i + this.f15598b + d(str);
    }

    public void b(String str, String str2) {
        zg zgVar = this.f15600d;
        if (zgVar != null) {
            zgVar.a(str, str2);
        }
    }

    @Override // com.ironsource.wh
    public void b(JSONObject jSONObject, String str, String str2) {
        ig.f16710a.d(new a(str2, jSONObject, str));
    }

    @Override // com.ironsource.wh
    public synchronized void a(String str, String str2) {
        if (this.f15602f == null) {
            return;
        }
        Logger.i(f15595h, "performCleanup");
        ig.f16710a.d(new b(str, str2));
    }

    @Override // com.ironsource.wh
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, b9.c.f15317D);
            return;
        }
        Logger.i(f15595h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(b9.h.f15505t0)) {
                this.f15599c.onPause();
            } else {
                if (!str.equals(b9.h.f15507u0)) {
                    b(str3, b9.c.f15316C);
                    return;
                }
                this.f15599c.onResume();
            }
            this.f15600d.f(str2);
        } catch (Exception e4) {
            o9.d().a(e4);
            b(str3, b9.c.f15318E);
        }
    }

    @Override // com.ironsource.wh
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f15600d.e(str);
        } catch (Exception e4) {
            o9.d().a(e4);
            Logger.i(f15595h, "sendHandleGetViewVisibility fail with reason: " + e4.getMessage());
        }
    }
}
