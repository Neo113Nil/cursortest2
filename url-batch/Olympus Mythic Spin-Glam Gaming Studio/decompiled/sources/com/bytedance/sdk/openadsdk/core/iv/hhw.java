package com.bytedance.sdk.openadsdk.core.iv;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.iv.zn;
import com.bytedance.sdk.openadsdk.core.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class hhw extends com.bytedance.sdk.component.bvs.nps implements zn.InterfaceC0161zn {
    protected boolean btk;
    private zn bvs;
    private int cn;
    private long cyb;
    protected boolean fb;
    AtomicBoolean hhw;
    private com.bytedance.sdk.openadsdk.core.model.nqi iv;
    private int klz;
    private List<String> mw;
    AtomicBoolean nps;
    private String rc;
    private fs rt;
    private rp zg;

    public interface fs {
        void fs();

        View zmn();

        void zmn(int i, int i2);

        void zmn(View view, int i);
    }

    @Override // com.bytedance.sdk.component.bvs.nps, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.bvs.nps, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public hhw(Context context) {
        super(context, nps.zn.DSP);
        this.fb = false;
        this.btk = false;
        this.hhw = new AtomicBoolean(false);
        this.nps = new AtomicBoolean(false);
        this.klz = 0;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, fs fsVar, String str) {
        this.rt = fsVar;
        this.iv = nqiVar;
        this.rc = str;
        this.bvs = new zn();
        this.zg = new rp(getContext());
        setWebViewClient(new zmn(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.iv.hhw.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                hhw.this.cn = i;
                super.onProgressChanged(webView, i);
                if (i >= 100) {
                    hhw.this.zmn();
                }
            }
        });
        com.bytedance.sdk.component.utils.bvs.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.hhw.2
            @Override // java.lang.Runnable
            @SuppressLint({"ClickableViewAccessibility"})
            public void run() {
                WebView webView = hhw.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.iv.hhw.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/iv/hhw$2$1;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                            return safedk_hhw$2$1_onTouch_ef408abc530f228f224ba80a09f59360(view, motionEvent);
                        }

                        public boolean safedk_hhw$2$1_onTouch_ef408abc530f228f224ba80a09f59360(View p0, MotionEvent p1) {
                            hhw.this.zg.onTouchEvent(p1);
                            return false;
                        }
                    });
                }
            }
        });
    }

    private void iqz() {
        if (this.mw == null) {
            com.bytedance.sdk.openadsdk.fb.zn.fs(this.iv, this.rc, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(new com.bytedance.sdk.component.zg.fs.zn("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.iv.hhw.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (hhw.this.mw != null && hhw.this.nps.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = hhw.this.mw.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.fb.zn.fs(hhw.this.iv, hhw.this.rc, "dsp_html_error_url", jSONObject);
                            hhw.this.mw = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.bvs.nps
    public void cn() {
        this.bvs.fs();
        super.cn();
    }

    public void zmn(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.bvs.zmn(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.component.bvs.nps, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.fb) {
            this.bvs.zmn(getWebView());
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        this.btk = z;
        this.bvs.zmn(z);
    }

    @Override // com.bytedance.sdk.component.bvs.nps, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.bvs.zmn();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.cn / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.iv, this.rc, "load_rate", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.zn.InterfaceC0161zn
    public void zmn(String str) {
        boolean z;
        if (TextUtils.isEmpty(str) || this.iv == null || !this.zg.fs()) {
            return;
        }
        int zmn2 = oub.zmn(this.rc);
        View view = null;
        if (!com.bytedance.sdk.component.utils.kgc.zmn(str) && (this.iv.my() == null || TextUtils.isEmpty(this.iv.my().zmn()))) {
            com.bytedance.sdk.openadsdk.core.model.mw mwVar = new com.bytedance.sdk.openadsdk.core.model.mw();
            mwVar.zmn(str);
            this.iv.zmn(mwVar);
            str = null;
        }
        this.iv.fb(true);
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.iv;
        if (nqiVar == null || nqiVar.my() == null || TextUtils.isEmpty(this.iv.my().zmn())) {
            z = false;
        } else {
            z = nu.zmn(getContext(), this.iv, zmn2, this.rc, true, (Map<String, Object>) null);
            if (!z && !TextUtils.isEmpty(this.iv.my().fs())) {
                str = this.iv.my().fs();
                com.bytedance.sdk.openadsdk.fb.zn.zmn(this.iv, this.rc, "open_fallback_url", (Map<String, Object>) null);
            }
        }
        String str2 = str;
        if (!z) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                nu.zmn(getContext(), this.iv, zmn2, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.fb.zmn) null, this.rc, true, str2);
            }
        }
        if (this.zg != null) {
            fs fsVar = this.rt;
            if (fsVar != null) {
                view = fsVar.zmn();
                this.rt.zmn(this, 2);
            }
            com.bytedance.sdk.openadsdk.core.model.klz zmn3 = this.zg.zmn(getContext(), view);
            HashMap hashMap = new HashMap();
            hashMap.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.fb.zn.zmn("click", this.iv, zmn3, this.rc, true, (Map<String, Object>) hashMap, this.zg.fs() ? 1 : 2);
        }
        rp rpVar = this.zg;
        if (rpVar != null) {
            rpVar.zmn();
        }
    }

    public void kgc() {
        fs fsVar = this.rt;
        if (fsVar != null) {
            fsVar.fs();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.cyb);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.iv, this.rc, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.zn.InterfaceC0161zn
    public void zmn(int i, int i2) {
        fs fsVar = this.rt;
        if (fsVar != null) {
            fsVar.zmn(i, i2);
        }
        this.klz = i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i2);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.cyb);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.iv, this.rc, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.zn.InterfaceC0161zn
    public void fs(String str) {
        if (this.mw == null) {
            this.mw = new ArrayList();
        }
        this.mw.add(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.zn.InterfaceC0161zn
    public void zmn() {
        if (this.hhw.compareAndSet(false, true)) {
            this.fb = true;
            this.bvs.zmn(getWebView());
            this.bvs.zmn(this.btk);
            kgc();
            iqz();
        }
    }

    public void kw() {
        this.hhw.set(false);
        String xhx = this.iv.xhx();
        if (TextUtils.isEmpty(xhx)) {
            return;
        }
        String zmn2 = com.bytedance.sdk.openadsdk.core.rt.btk.zmn(xhx);
        String str = TextUtils.isEmpty(zmn2) ? xhx : zmn2;
        this.klz = 0;
        zmn(null, str, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
        this.cyb = SystemClock.elapsedRealtime();
    }

    static class zmn extends nps.zmn {
        public static final Set<String> zmn = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.iv.hhw.zmn.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(BrandSafetyUtils.a);
                add(".webp");
            }
        };
        zn.InterfaceC0161zn fs;

        @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(h.u, view, url);
        }

        @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(h.u, view, url);
        }

        @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/iv/hhw$zmn;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError(h.u, webView, i, str, str2);
            safedk_hhw$zmn_onReceivedError_533a9c1f062941f3aec26ad43d5d9c17(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/iv/hhw$zmn;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
            BrandSafetyUtils.onWebViewReceivedError(h.u, webView, webResourceRequest, webResourceError);
            safedk_hhw$zmn_onReceivedError_ece51f24ab78abdec3f5abafbcd1c393(webView, webResourceRequest, webResourceError);
        }

        @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(h.u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/iv/hhw$zmn;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_hhw$zmn_shouldOverrideUrlLoading_c788013cc9a4cd83d3b96350029529eb = safedk_hhw$zmn_shouldOverrideUrlLoading_c788013cc9a4cd83d3b96350029529eb(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, webView, str, safedk_hhw$zmn_shouldOverrideUrlLoading_c788013cc9a4cd83d3b96350029529eb);
            return safedk_hhw$zmn_shouldOverrideUrlLoading_c788013cc9a4cd83d3b96350029529eb;
        }

        public zmn(zn.InterfaceC0161zn interfaceC0161zn) {
            this.fs = interfaceC0161zn;
        }

        public boolean safedk_hhw$zmn_shouldOverrideUrlLoading_c788013cc9a4cd83d3b96350029529eb(WebView p0, String p1) {
            this.fs.zmn(p1);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                zmn(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            zmn(webResourceRequest.getUrl().toString());
        }

        public void safedk_hhw$zmn_onReceivedError_533a9c1f062941f3aec26ad43d5d9c17(WebView p0, int p1, String p2, String p3) {
            super.onReceivedError(p0, p1, p2, p3);
        }

        public void safedk_hhw$zmn_onReceivedError_ece51f24ab78abdec3f5abafbcd1c393(WebView p0, WebResourceRequest p1, WebResourceError p2) {
            super.onReceivedError(p0, p1, p2);
            if (p1 == null || p1.getUrl() == null) {
                return;
            }
            zmn(p1.getUrl().toString());
        }

        private void zmn(String str) {
            int lastIndexOf;
            zn.InterfaceC0161zn interfaceC0161zn;
            if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!zmn.contains(str.substring(lastIndexOf).toLowerCase()) || (interfaceC0161zn = this.fs) == null) {
                    return;
                }
                interfaceC0161zn.fs(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            zn.InterfaceC0161zn interfaceC0161zn = this.fs;
            if (interfaceC0161zn != null) {
                interfaceC0161zn.zmn();
            }
        }

        private void zmn(String str, int i, String str2) {
            zn.InterfaceC0161zn interfaceC0161zn = this.fs;
            if (interfaceC0161zn != null) {
                interfaceC0161zn.zmn(106, i);
            }
        }
    }

    public static class zn {
        protected int zmn = 0;
        private com.bytedance.sdk.openadsdk.core.rt.hhw fs = com.bytedance.sdk.openadsdk.core.rt.hhw.zmn();

        zn() {
        }

        public void zmn(WebView webView) {
            if (webView != null && this.zmn == 0) {
                if (this.fs == null) {
                    this.fs = com.bytedance.sdk.openadsdk.core.rt.hhw.zmn();
                }
                this.fs.zmn(webView);
                this.fs.fs();
                this.zmn = 1;
            }
        }

        public void zmn(boolean z) {
            com.bytedance.sdk.openadsdk.core.rt.hhw hhwVar;
            if (this.zmn == 1 && z && (hhwVar = this.fs) != null) {
                hhwVar.zn();
                this.zmn = 3;
            }
        }

        public void zmn(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.rt.hhw hhwVar = this.fs;
            if (hhwVar != null) {
                hhwVar.zmn(view, friendlyObstructionPurpose);
            }
        }

        public void zmn() {
            com.bytedance.sdk.openadsdk.core.rt.hhw hhwVar;
            int i = this.zmn;
            if (i != 0 && i != 4 && (hhwVar = this.fs) != null) {
                hhwVar.fb();
            }
            this.zmn = 4;
            this.fs = null;
        }

        public void fs() {
            zmn();
        }
    }
}
