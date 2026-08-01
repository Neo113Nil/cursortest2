package com.bytedance.sdk.openadsdk.core.widget.pvs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.mnm;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.model.Wyp;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.icD.qh;
import com.bytedance.sdk.openadsdk.utils.bNS;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: TTWebViewClient.java */
/* loaded from: classes2.dex */
public class NB extends SSWebView.pvs {
    private static final HashSet<String> mnm;
    private JSONObject IP;
    protected final Context Jd;
    private com.bytedance.sdk.openadsdk.common.icD Ju;
    protected boolean Mxy;
    protected final String NB;
    private Wyp Wyp;
    private cR bNS;
    private String icD;
    private boolean kj;
    private final boolean pvs;
    private Map<String, Object> qh;
    protected qh sUS;
    protected boolean so;
    protected final CvL vG;
    protected boolean yiw;

    public void pvs(Wyp wyp) {
        this.Wyp = wyp;
    }

    public void pvs(Map<String, Object> map) {
        this.qh = map;
    }

    public void pvs(JSONObject jSONObject) {
        this.IP = jSONObject;
    }

    public void pvs(String str) {
        this.icD = str;
    }

    public void pvs(cR cRVar) {
        this.bNS = cRVar;
    }

    public NB(Context context, CvL cvL, String str, com.bytedance.sdk.openadsdk.common.icD icd, qh qhVar, boolean z) {
        this(context, cvL, str, qhVar, z);
        this.Ju = icd;
    }

    public NB(Context context, CvL cvL, String str, qh qhVar, boolean z) {
        this.yiw = true;
        this.so = true;
        this.Mxy = false;
        this.Jd = context;
        this.vG = cvL;
        this.NB = str;
        this.sUS = qhVar;
        this.pvs = z;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        qh qhVar = this.sUS;
        if (qhVar != null) {
            qhVar.icD(webView, str, this.pvs);
        }
        com.bytedance.sdk.openadsdk.common.icD icd = this.Ju;
        if (icd != null) {
            icd.pvs(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        String lowerCase;
        qh qhVar = this.sUS;
        if (qhVar != null) {
            qhVar.pvs(str, this.pvs);
        }
        com.bytedance.sdk.openadsdk.common.icD icd = this.Ju;
        if (icd != null) {
            icd.pvs(webView, str, this.pvs);
        }
        try {
            parse = Uri.parse(str);
            lowerCase = parse.getScheme().toLowerCase();
        } catch (Throwable unused) {
            CvL cvL = this.vG;
            if (cvL != null && cvL.Jd()) {
                return true;
            }
        }
        if ("bytedance".equals(lowerCase)) {
            bNS.pvs(parse, this.vG);
            return true;
        }
        if (vG(str)) {
            return true;
        }
        if (!mnm.pvs(str)) {
            if (com.bytedance.sdk.openadsdk.core.model.mnm.yiw(this.bNS)) {
                pvs(lowerCase, str);
                return true;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.addFlags(268435456);
                this.Jd.startActivity(intent);
            } catch (Throwable unused2) {
            }
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    private void pvs(String str, String str2) {
        if ((NB(str) || "market".equals(str)) && ((this.Wyp != null || this.IP != null) && icD(str2))) {
            icD();
        }
        this.Wyp = null;
        this.IP = null;
    }

    public boolean icD(String str) {
        String str2;
        String str3;
        if (this.Jd == null) {
            return false;
        }
        cR cRVar = this.bNS;
        if (cRVar == null || cRVar.Ca() == null) {
            str2 = "";
            str3 = "";
        } else {
            str2 = this.bNS.Ca().vG();
            str3 = this.bNS.Ca().pvs();
        }
        return com.com.bytedance.overseas.sdk.pvs.pvs.pvs(str, this.Jd, this.icD, this.bNS, (Map<String, Object>) null) || com.com.bytedance.overseas.sdk.pvs.pvs.pvs(this.bNS, str2, this.Jd, this.icD, (Map<String, Object>) null) || com.com.bytedance.overseas.sdk.pvs.icD.pvs(this.Jd, str3, str2, this.icD, this.bNS);
    }

    private boolean NB(String str) {
        if (com.bytedance.sdk.openadsdk.core.model.mnm.yiw(this.bNS)) {
            return TextUtils.equals(this.bNS.zn(), str);
        }
        return false;
    }

    public void icD() {
        if (TextUtils.isEmpty(this.icD) || !com.bytedance.sdk.openadsdk.core.model.mnm.sUS(this.bNS) || this.kj) {
            return;
        }
        Wyp wyp = this.Wyp;
        if (wyp != null) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs("click", this.bNS, wyp, this.icD, true, this.qh, 1);
            this.kj = true;
            return;
        }
        JSONObject jSONObject = this.IP;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.bNS, this.icD, "click", jSONObject);
            this.kj = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        qh qhVar = this.sUS;
        if (qhVar != null) {
            qhVar.pvs(webView, str, this.pvs);
        }
        com.bytedance.sdk.openadsdk.common.icD icd = this.Ju;
        if (icd != null) {
            icd.icD(webView, str, this.pvs);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        qh qhVar = this.sUS;
        if (qhVar != null) {
            qhVar.pvs(webView, str, bitmap, this.pvs);
        }
        com.bytedance.sdk.openadsdk.common.icD icd = this.Ju;
        if (icd != null) {
            icd.vG(webView, str, this.pvs);
        }
        Object[] objArr = new Object[4];
        Boolean.valueOf(this.so);
        Boolean.valueOf(this.Mxy);
        if (!this.so || this.Mxy) {
            return;
        }
        this.Mxy = true;
        vG.pvs(this.Jd).pvs(true).icD(webView.getSettings().getBuiltInZoomControls()).pvs(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.sUS == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String uri = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.sUS.pvs(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), uri, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "", webResourceRequest != null && webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.sUS == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String uri = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.sUS.pvs(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), uri, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "", webResourceRequest != null && webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.sUS != null) {
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
            this.sUS.pvs(webView, i, str, str3, Jd(str3), true);
        }
    }

    public boolean vG(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if ("play.google.com".equals(parse.getHost())) {
                if (com.bytedance.sdk.openadsdk.core.model.mnm.yiw(this.bNS) && this.IP == null && this.Wyp == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.Jd instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(parse);
                intent.setPackage("com.android.vending");
                this.Jd.startActivity(intent);
                icD();
                this.IP = null;
                this.Wyp = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        mnm = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    protected static String Jd(String str) {
        int lastIndexOf;
        String substring;
        if (str == null || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf == str.length() - 1 || (substring = str.substring(lastIndexOf)) == null || !mnm.contains(substring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(String.valueOf(substring));
    }

    @Override // com.bytedance.sdk.component.widget.SSWebView.pvs, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.NB.NB.pvs().icD();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}
