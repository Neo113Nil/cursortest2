package com.bytedance.sdk.openadsdk.core.widget.zmn;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.fs.zmn.cn;
import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.rt;
import com.bytedance.sdk.component.utils.fs;
import com.bytedance.sdk.component.utils.kgc;
import com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.model.klz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.fb.fs;
import com.bytedance.sdk.openadsdk.fb.mw;
import com.bytedance.sdk.openadsdk.utils.iqz;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.utils.uqh;
import com.ironsource.C4701ic;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import io.bidmachine.util.network.NetworkUtils;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class hhw extends nps.zmn {
    private static final HashSet<String> doe;
    protected final String btk;
    protected boolean bvs;
    private final Stack<String> cn;
    private boolean cyb;
    protected final Context fb;
    private String fs;
    protected mw hhw;
    private nqi iqz;
    private klz iv;
    private com.bytedance.sdk.openadsdk.core.cn.fb.fs kgc;
    private boolean klz;
    private JSONObject kw;
    private com.bytedance.sdk.openadsdk.common.btk mw;
    protected boolean nps;
    private TTCeilingLandingPageActivity.zmn olo;
    private com.bytedance.sdk.openadsdk.rt.fb phc;
    private Map<String, Object> rc;
    private String rt;
    protected boolean zg;
    private final boolean zmn;
    protected final fkt zn;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.u);
        p0.startActivity(p1);
    }

    @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/zmn/hhw;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.u, webView, str);
        safedk_hhw_onLoadResource_c2843839a870794cde50ded19cab09dd(webView, str);
    }

    @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/zmn/hhw;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.u, webView, str);
        safedk_hhw_onPageStarted_e95c64fdbb6f400c95758bd72c64c1b7(webView, str, bitmap);
    }

    @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/zmn/hhw;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.u, webView, i, str, str2);
        safedk_hhw_onReceivedError_6b8a117d5a03dac342670f64d04eedf9(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/zmn/hhw;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.u, webView, webResourceRequest, webResourceError);
        safedk_hhw_onReceivedError_813ae98bc5db4f8e4db3a651b809fe31(webView, webResourceRequest, webResourceError);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
    @RequiresApi
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/zmn/hhw;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.u, webView, webResourceRequest, safedk_hhw_shouldInterceptRequest_245d28939941bd50a17cddfa32354a66(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/zmn/hhw;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.u, webView, str, safedk_hhw_shouldInterceptRequest_798b1e0f3efeab032adb300bd3a55ce8(webView, str));
    }

    @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/zmn/hhw;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_hhw_shouldOverrideUrlLoading_db3c249126d58e2bdadf5843020d76c3 = safedk_hhw_shouldOverrideUrlLoading_db3c249126d58e2bdadf5843020d76c3(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, webView, str, safedk_hhw_shouldOverrideUrlLoading_db3c249126d58e2bdadf5843020d76c3);
        return safedk_hhw_shouldOverrideUrlLoading_db3c249126d58e2bdadf5843020d76c3;
    }

    public void zmn(klz klzVar) {
        this.iv = klzVar;
    }

    public void zmn(Map<String, Object> map) {
        this.rc = map;
    }

    public void zmn(JSONObject jSONObject) {
        this.kw = jSONObject;
    }

    public void zmn(String str) {
        this.fs = str;
    }

    public void zmn(nqi nqiVar) {
        this.iqz = nqiVar;
    }

    public hhw(Context context, fkt fktVar, String str, com.bytedance.sdk.openadsdk.common.btk btkVar, mw mwVar, boolean z, boolean z2, TTCeilingLandingPageActivity.zmn zmnVar) {
        this(context, fktVar, str, btkVar, mwVar, z);
        this.cyb = z2;
        this.olo = zmnVar;
    }

    public hhw(Context context, fkt fktVar, String str, com.bytedance.sdk.openadsdk.common.btk btkVar, mw mwVar, boolean z) {
        this(context, fktVar, str, mwVar, z);
        this.mw = btkVar;
    }

    public hhw(Context context, fkt fktVar, String str, mw mwVar, boolean z) {
        this.nps = true;
        this.zg = true;
        this.bvs = false;
        this.fb = context;
        this.zn = fktVar;
        this.btk = str;
        this.hhw = mwVar;
        this.zmn = z;
        this.cn = new Stack<>();
    }

    public mw fs() {
        return this.hhw;
    }

    public void zmn(com.bytedance.sdk.openadsdk.rt.fb fbVar) {
        this.phc = fbVar;
    }

    @RequiresApi
    public WebResourceResponse safedk_hhw_shouldInterceptRequest_245d28939941bd50a17cddfa32354a66(WebView p0, WebResourceRequest p1) {
        nqi nqiVar;
        try {
            String host = p1.getUrl().getHost();
            if (p1.getMethod().equalsIgnoreCase(C4701ic.a) && (nqiVar = this.iqz) != null && !nqiVar.faz().isEmpty() && this.iqz.faz().containsKey(host)) {
                String str = this.iqz.faz().get(host);
                if (!TextUtils.isEmpty(str)) {
                    return zmn(p1, host, str);
                }
            }
        } catch (Throwable unused) {
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    private WebResourceResponse zmn(WebResourceRequest webResourceRequest, String str, String str2) {
        try {
            String replace = webResourceRequest.getUrl().toString().replace(str, str2);
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            klz.zmn zmn = new klz.zmn().zmn().fs(replace).zmn("pixel_web").zmn(10);
            String cookie = CookieManager.getInstance().getCookie(d.u.concat(String.valueOf(str)));
            if (cookie != null) {
                zmn.fs("Cookie", cookie);
            }
            if (requestHeaders != null) {
                for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                    zmn.fs(entry.getKey(), entry.getValue());
                }
            }
            rt fs = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().zg().zmn(zmn.fs()).fs();
            if (fs == null) {
                return null;
            }
            int zn = fs.zn();
            cn hhw = fs.hhw();
            String str3 = "";
            if (hhw.btk() != null) {
                str3 = hhw.btk().zmn();
            }
            return new WebResourceResponse(str3, hhw.hhw(), zn, fs.btk(), zmn.zmn(fs.iv(), str), hhw.zn());
        } catch (Throwable unused) {
            return null;
        }
    }

    public WebResourceResponse safedk_hhw_shouldInterceptRequest_798b1e0f3efeab032adb300bd3a55ce8(WebView p0, String p1) {
        mw mwVar = this.hhw;
        if (mwVar != null) {
            mwVar.fs(p0, p1, this.zmn);
        }
        com.bytedance.sdk.openadsdk.common.btk btkVar = this.mw;
        if (btkVar != null) {
            btkVar.zmn(p0, p1);
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    public void safedk_hhw_onLoadResource_c2843839a870794cde50ded19cab09dd(WebView p0, String p1) {
        super.onLoadResource(p0, p1);
    }

    public boolean safedk_hhw_shouldOverrideUrlLoading_db3c249126d58e2bdadf5843020d76c3(WebView p0, String p1) {
        Uri parse;
        String lowerCase;
        Intent intent;
        mw mwVar = this.hhw;
        if (mwVar != null) {
            mwVar.zmn(p1, this.zmn);
        }
        com.bytedance.sdk.openadsdk.common.btk btkVar = this.mw;
        if (btkVar != null) {
            btkVar.zmn(p0, p1, this.zmn);
        }
        com.bytedance.sdk.openadsdk.rt.fb fbVar = this.phc;
        if (fbVar != null && this.zmn) {
            fbVar.fs(p1);
        }
        if (zmn(p0, p1)) {
            return true;
        }
        nqi nqiVar = this.iqz;
        if (nqiVar != null && nqiVar.kgc() == 1 && ((com.bytedance.sdk.openadsdk.phc.zmn.zmn.fs.zmn(p1, this.iqz) || com.bytedance.sdk.openadsdk.phc.zmn.zmn.fs.zmn(this.iqz, p1)) && com.bytedance.sdk.openadsdk.phc.zmn.zmn.fs.fs(this.iqz, this.fb, true))) {
            return true;
        }
        try {
            parse = Uri.parse(p1);
            lowerCase = parse.getScheme().toLowerCase();
        } catch (Throwable unused) {
            fkt fktVar = this.zn;
            if (fktVar != null && fktVar.btk()) {
                return true;
            }
        }
        if ("bytedance".equals(lowerCase)) {
            iqz.zmn(parse, this.zn);
            return true;
        }
        if (zn(p1)) {
            return true;
        }
        if (!kgc.zmn(p1)) {
            if (com.bytedance.sdk.openadsdk.core.model.iqz.rc(this.iqz)) {
                zmn(lowerCase, p1);
                return true;
            }
            try {
                if (p1.startsWith("intent:")) {
                    intent = Intent.parseUri(p1, 1);
                } else if (p1.startsWith("android-app:")) {
                    intent = Intent.parseUri(p1, 2);
                } else {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(parse);
                    intent = intent2;
                }
                intent.addFlags(268435456);
                if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("intent_safe_jump", 0) == 1) {
                    zmn(intent, lowerCase, p1);
                } else {
                    fs(intent, lowerCase, p1);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zmn("WebChromeClient", "parseUri", th);
                zmn(lowerCase, false, 1, th.getMessage(), p1);
            }
            com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar = this.kgc;
            if (fsVar != null) {
                fsVar.lt();
            }
            return true;
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }

    private void zmn(Intent intent, final String str, final String str2) {
        com.bytedance.sdk.component.utils.fs.zmn(this.fb, intent, new fs.InterfaceC0135fs() { // from class: com.bytedance.sdk.openadsdk.core.widget.zmn.hhw.1
            @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
            public void zmn() {
                hhw.this.zmn(str, true, 0, "", str2);
            }

            @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
            public void zmn(Throwable th) {
                hhw.this.zmn(str, false, 2, th.getMessage(), str2);
            }
        });
    }

    private void fs(Intent intent, String str, String str2) {
        ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(this.fb.getApplicationContext().getPackageManager(), 65536);
        if (resolveActivityInfo != null && resolveActivityInfo.exported) {
            intent.setFlags(intent.getFlags() & (-196));
            HashSet hashSet = new HashSet();
            hashSet.add("android.intent.action.CHOOSER");
            hashSet.add("android.intent.action.SEND");
            hashSet.add("android.intent.action.SEND_MULTIPLE");
            hashSet.add("android.media.action.IMAGE_CAPTURE");
            hashSet.add("android.media.action.IMAGE_CAPTURE_SECURE");
            hashSet.add("android.media.action.VIDEO_CAPTURE");
            if (hashSet.contains(intent.getAction())) {
                zmn(str, str2, -2, "blockAllowList:" + intent.getAction());
                return;
            }
            zmn(intent, str, str2);
            return;
        }
        zmn(str, str2, -1, "exported is false");
    }

    private void zmn(final String str, final String str2, final int i, final String str3) {
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("intent_safe_jump", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.core.widget.zmn.hhw.2
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put("scheme", str);
                jSONObject.put("url", str2);
                jSONObject.put("error", i);
                jSONObject.put("msg", str3);
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("intent_safe_jump").fs(jSONObject.toString());
            }
        });
    }

    private void zmn(String str, String str2) {
        if ((btk(str) || NetworkUtils.PROTOCOL_MARKET.equals(str)) && ((this.iv != null || this.kw != null) && fs(str2))) {
            zn();
        }
        this.iv = null;
        this.kw = null;
    }

    public boolean fs(String str) {
        String str2;
        String str3;
        if (this.fb == null) {
            return false;
        }
        nqi nqiVar = this.iqz;
        if (nqiVar != null && nqiVar.pw() != null) {
            str2 = this.iqz.pw().zn();
            str3 = this.iqz.pw().zmn();
        } else {
            str2 = "";
            str3 = "";
        }
        Context context = this.fb;
        nqi nqiVar2 = this.iqz;
        return com.bytedance.sdk.openadsdk.phc.zmn.zmn.zmn.zmn(context, str, nqiVar2, oub.fs(nqiVar2), null, true) || com.bytedance.sdk.openadsdk.phc.zmn.zmn.fs.zmn(this.iqz, str2, this.fb, this.fs, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.phc.zmn.zmn.fs.zmn(this.fb, str3, str2, this.fs, this.iqz);
    }

    private boolean btk(String str) {
        if (com.bytedance.sdk.openadsdk.core.model.iqz.rc(this.iqz)) {
            return TextUtils.equals(this.iqz.dy(), str);
        }
        return false;
    }

    public void zn() {
        if (TextUtils.isEmpty(this.fs) || !com.bytedance.sdk.openadsdk.core.model.iqz.iv(this.iqz) || this.klz) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.klz klzVar = this.iv;
        if (klzVar != null) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn("click", this.iqz, klzVar, this.fs, true, this.rc, 1);
            this.klz = true;
            return;
        }
        JSONObject jSONObject = this.kw;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(this.iqz, this.fs, "click", jSONObject);
            this.klz = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        mw mwVar = this.hhw;
        if (mwVar != null) {
            mwVar.zmn(webView, str, this.zmn);
        }
        com.bytedance.sdk.openadsdk.common.btk btkVar = this.mw;
        if (btkVar != null) {
            btkVar.fs(webView, str, this.zmn);
        }
        super.onPageFinished(webView, str);
    }

    public void safedk_hhw_onPageStarted_e95c64fdbb6f400c95758bd72c64c1b7(WebView p0, String p1, Bitmap p2) {
        nqi nqiVar;
        super.onPageStarted(p0, p1, p2);
        nqi nqiVar2 = this.iqz;
        int zmn = (nqiVar2 != null && nqiVar2.lwz() && com.bytedance.sdk.openadsdk.uqh.btk.zmn("opt_web_index", false)) ? oub.zmn(p0) : -1;
        mw mwVar = this.hhw;
        if (mwVar != null) {
            mwVar.zmn(p0, p1, p2, this.zmn, zmn);
        }
        com.bytedance.sdk.openadsdk.common.btk btkVar = this.mw;
        if (btkVar != null) {
            btkVar.zn(p0, p1, this.zmn);
        }
        com.bytedance.sdk.openadsdk.rt.fb fbVar = this.phc;
        if (fbVar != null && this.zmn) {
            fbVar.zmn(p1);
        }
        if (this.zmn && (nqiVar = this.iqz) != null && nqiVar.lwz() && this.iqz.bjh().fs() >= 2) {
            if (!TextUtils.isEmpty(p1) && !p1.equals(this.rt)) {
                if (this.cn.contains(p1)) {
                    while (!p1.equals(this.cn.peek())) {
                        this.cn.pop();
                    }
                } else {
                    this.cn.push(p1);
                }
            }
            this.rt = p1;
        }
        if (!this.zg || this.bvs) {
            return;
        }
        this.bvs = true;
        fb.zmn(this.fb).zmn(true).fs(p0.getSettings().getBuiltInZoomControls()).zmn(p0);
    }

    public void safedk_hhw_onReceivedError_6b8a117d5a03dac342670f64d04eedf9(WebView p0, int p1, String p2, String p3) {
        super.onReceivedError(p0, p1, p2, p3);
    }

    @TargetApi(23)
    public void safedk_hhw_onReceivedError_813ae98bc5db4f8e4db3a651b809fe31(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        super.onReceivedError(p0, p1, p2);
        if (this.hhw == null || p2 == null) {
            return;
        }
        Uri url = p1.getUrl();
        String str = "";
        String uri = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = p1.getRequestHeaders();
        if (requestHeaders.containsKey("accept")) {
            str = requestHeaders.get("accept");
        }
        this.hhw.zmn(p0, p2.getErrorCode(), String.valueOf(p2.getDescription()), uri, str, p1.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.hhw == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String str = "";
        String uri = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (requestHeaders.containsKey("accept")) {
            str = requestHeaders.get("accept");
        }
        this.hhw.zmn(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), uri, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.hhw != null) {
            int i = 0;
            String str = "SslError: unknown";
            String str2 = null;
            if (sslError != null) {
                try {
                    i = sslError.getPrimaryError();
                    str = "SslError: ".concat(String.valueOf(sslError));
                    str2 = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str3 = str2;
            this.hhw.zmn(webView, i, str, str3, fb(str3), true);
        }
    }

    public boolean zn(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (POBCommonConstants.PLAY_STORE_DOMAIN.equals(parse.getHost())) {
                if (com.bytedance.sdk.openadsdk.core.model.iqz.rc(this.iqz) && this.kw == null && this.iv == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.fb instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(parse);
                intent.setPackage("com.android.vending");
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.fb, intent);
                zn();
                this.kw = null;
                this.iv = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        doe = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public static String fb(String str) {
        int lastIndexOf;
        String substring;
        if (str == null || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf == str.length() - 1 || (substring = str.substring(lastIndexOf)) == null || !doe.contains(substring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(substring);
    }

    private boolean zmn(WebView webView, String str) {
        if (!oub.fb(this.iqz) || this.iqz.bjh() == null || webView == null) {
            return false;
        }
        int fs = this.iqz.bjh().fs();
        int size = this.cn.size();
        if (this.cyb) {
            size++;
        }
        if (size + 1 != fs) {
            return false;
        }
        uqh.zmn(this.fb, str, this.iqz, fs.zmn.fb, true);
        TTCeilingLandingPageActivity.zmn zmnVar = this.olo;
        if (zmnVar != null) {
            zmnVar.zmn();
        }
        return true;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar) {
        this.kgc = fsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final String str, final boolean z, final int i, final String str2, final String str3) {
        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), this.iqz, this.fs, "lp_not_http_open", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.widget.zmn.hhw.3
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("schema", str);
                    jSONObject.put("jump_url", str3);
                    jSONObject.put("success", z);
                    jSONObject.put("error_type", i);
                    jSONObject.put("error_reason", str2);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.btk.btk.zmn().fs();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}
