package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bumptech.glide.load.Key;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.ae;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.icD;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.gms.common.internal.ImagesContract;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
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

/* loaded from: classes2.dex */
public class DspHtmlWebView extends SSWebView implements icD.vG {
    AtomicBoolean Jd;
    private long Ju;
    private int Mxy;
    private mnm NB;
    private List<String> Wyp;
    protected boolean icD;
    private int kj;
    protected boolean pvs;
    private icD qh;
    private vG sUS;
    private String so;
    AtomicBoolean vG;
    private cR yiw;

    public interface icD {
        void f_();

        View icD();

        View pvs();

        void pvs(int i, int i2);

        void pvs(View view, int i);
    }

    public DspHtmlWebView(Context context) {
        super(context);
        this.pvs = false;
        this.icD = false;
        this.vG = new AtomicBoolean(false);
        this.Jd = new AtomicBoolean(false);
        this.Mxy = 0;
    }

    public void pvs(cR cRVar, icD icd, String str) {
        this.qh = icd;
        this.yiw = cRVar;
        this.so = str;
        this.sUS = new vG();
        this.NB = new mnm(getContext());
        setWebViewClient(new pvs(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                DspHtmlWebView.this.kj = i;
                super.onProgressChanged(webView, i);
                if (i >= 100) {
                    DspHtmlWebView.this.pvs();
                }
            }
        });
        com.bytedance.sdk.component.utils.so.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.2
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = DspHtmlWebView.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            DspHtmlWebView.this.NB.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    private void vA() {
        if (this.Wyp == null) {
            com.bytedance.sdk.openadsdk.icD.vG.icD(this.yiw, this.so, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(new com.bytedance.sdk.component.so.so("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DspHtmlWebView.this.Wyp != null && DspHtmlWebView.this.Jd.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = DspHtmlWebView.this.Wyp.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put(ImagesContract.URL, jSONArray);
                            com.bytedance.sdk.openadsdk.icD.vG.icD(DspHtmlWebView.this.yiw, DspHtmlWebView.this.so, "dsp_html_error_url", jSONObject);
                            DspHtmlWebView.this.Wyp = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.widget.SSWebView
    public void kj() {
        super.kj();
        this.sUS.icD();
    }

    public void pvs(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.sUS.pvs(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.component.widget.SSWebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.pvs) {
            this.sUS.pvs(getWebView());
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        this.icD = z;
        this.sUS.pvs(z);
    }

    @Override // com.bytedance.sdk.component.widget.SSWebView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.kj / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.icD.vG.icD(this.yiw, this.so, "load_rate", jSONObject);
        this.sUS.pvs();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.icD.vG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs(String str) {
        String str2;
        boolean z;
        String str3;
        mnm mnmVar;
        View view;
        if (TextUtils.isEmpty(str) || this.yiw == null || !this.NB.icD()) {
            return;
        }
        int pvs2 = jlb.pvs(this.so);
        View view2 = null;
        if (com.bytedance.sdk.component.utils.mnm.pvs(str) || !(this.yiw.Zm() == null || TextUtils.isEmpty(this.yiw.Zm().pvs()))) {
            str2 = str;
        } else {
            com.bytedance.sdk.openadsdk.core.model.qh qhVar = new com.bytedance.sdk.openadsdk.core.model.qh();
            qhVar.pvs(str);
            this.yiw.pvs(qhVar);
            str2 = null;
        }
        this.yiw.pvs(true);
        cR cRVar = this.yiw;
        if (cRVar == null || cRVar.Zm() == null || TextUtils.isEmpty(this.yiw.Zm().pvs())) {
            z = false;
        } else {
            z = ae.pvs(getContext(), this.yiw, pvs2, this.so, true, (Map<String, Object>) null);
            if (!z && !TextUtils.isEmpty(this.yiw.Zm().icD())) {
                String icD2 = this.yiw.Zm().icD();
                com.bytedance.sdk.openadsdk.icD.vG.pvs(this.yiw, this.so, "open_fallback_url", (Map<String, Object>) null);
                str3 = icD2;
                if (!z) {
                    if (TextUtils.isEmpty(str3)) {
                        return;
                    } else {
                        ae.pvs(getContext(), this.yiw, pvs2, (PAGNativeAd) null, (PangleAd) null, this.so, true, str3);
                    }
                }
                if (this.NB != null) {
                    icD icd = this.qh;
                    if (icd != null) {
                        View pvs3 = icd.pvs();
                        View icD3 = this.qh.icD();
                        this.qh.pvs(this, 2);
                        view2 = icD3;
                        view = pvs3;
                    } else {
                        view = null;
                    }
                    com.bytedance.sdk.openadsdk.core.model.Wyp pvs4 = this.NB.pvs(getContext(), view2, view);
                    HashMap hashMap = new HashMap();
                    hashMap.put("click_scence", 1);
                    com.bytedance.sdk.openadsdk.icD.vG.pvs("click", this.yiw, pvs4, this.so, true, (Map<String, Object>) hashMap, this.NB.icD() ? 1 : 2);
                }
                mnmVar = this.NB;
                if (mnmVar == null) {
                    mnmVar.pvs();
                    return;
                }
                return;
            }
        }
        str3 = str2;
        if (!z) {
        }
        if (this.NB != null) {
        }
        mnmVar = this.NB;
        if (mnmVar == null) {
        }
    }

    public void bNS() {
        icD icd = this.qh;
        if (icd != null) {
            icd.f_();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.Ju);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.icD.vG.icD(this.yiw, this.so, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.icD.vG
    public void pvs(int i, int i2) {
        icD icd = this.qh;
        if (icd != null) {
            icd.pvs(i, i2);
        }
        this.Mxy = i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i2);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.Ju);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.icD.vG.icD(this.yiw, this.so, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.icD.vG
    public void icD(String str) {
        if (this.Wyp == null) {
            this.Wyp = new ArrayList();
        }
        this.Wyp.add(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.icD.vG
    public void pvs() {
        if (this.vG.compareAndSet(false, true)) {
            this.pvs = true;
            this.sUS.pvs(getWebView());
            this.sUS.pvs(this.icD);
            bNS();
            vA();
        }
    }

    public void mnm() {
        this.vG.set(false);
        String Tdd = this.yiw.Tdd();
        if (TextUtils.isEmpty(Tdd)) {
            return;
        }
        String pvs2 = com.bytedance.sdk.openadsdk.core.yiw.NB.pvs(Tdd);
        String str = TextUtils.isEmpty(pvs2) ? Tdd : pvs2;
        this.Mxy = 0;
        pvs(null, str, "text/html", Key.STRING_CHARSET_NAME, null);
        this.Ju = SystemClock.elapsedRealtime();
    }

    static class pvs extends SSWebView.pvs {
        public static final Set<String> pvs = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.pvs.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        icD.vG icD;

        public pvs(icD.vG vGVar) {
            this.icD = vGVar;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.icD.pvs(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                pvs(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            pvs(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            pvs(webResourceRequest.getUrl().toString());
        }

        private void pvs(String str) {
            int lastIndexOf;
            icD.vG vGVar;
            if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!pvs.contains(str.substring(lastIndexOf).toLowerCase()) || (vGVar = this.icD) == null) {
                    return;
                }
                vGVar.icD(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            icD.vG vGVar = this.icD;
            if (vGVar != null) {
                vGVar.pvs();
            }
        }

        private void pvs(String str, int i, String str2) {
            icD.vG vGVar = this.icD;
            if (vGVar != null) {
                vGVar.pvs(106, i);
            }
        }
    }

    public static class vG {
        protected int pvs = 0;
        private com.bytedance.sdk.openadsdk.core.yiw.sUS icD = com.bytedance.sdk.openadsdk.core.yiw.sUS.pvs();

        vG() {
        }

        public void pvs(WebView webView) {
            if (webView != null && this.pvs == 0) {
                if (this.icD == null) {
                    this.icD = com.bytedance.sdk.openadsdk.core.yiw.sUS.pvs();
                }
                this.icD.pvs(webView);
                this.icD.icD();
                this.pvs = 1;
            }
        }

        public void pvs(boolean z) {
            com.bytedance.sdk.openadsdk.core.yiw.sUS sus;
            if (this.pvs == 1 && z && (sus = this.icD) != null) {
                sus.vG();
                this.pvs = 3;
            }
        }

        public void pvs(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.yiw.sUS sus = this.icD;
            if (sus != null) {
                sus.pvs(view, friendlyObstructionPurpose);
            }
        }

        public void pvs() {
            com.bytedance.sdk.openadsdk.core.yiw.sUS sus;
            int i = this.pvs;
            if (i != 0 && i != 4 && (sus = this.icD) != null) {
                sus.Jd();
            }
            this.pvs = 4;
            this.icD = null;
        }

        public void icD() {
            pvs();
        }
    }
}
