package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.load.Key;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.gA;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* compiled from: VastEndCardManager.java */
/* loaded from: classes2.dex */
public class mnm implements com.bytedance.sdk.openadsdk.Mxy.yiw {
    private ImageView Jd;
    private final pvs Mxy;
    private boolean NB;
    private int Wyp;
    private final cR icD;
    private final Activity pvs;
    private com.bytedance.sdk.openadsdk.core.icD.yiw sUS;
    private volatile boolean so;
    private SSWebView vG;
    private boolean yiw;

    public mnm(pvs pvsVar) {
        this.Mxy = pvsVar;
        this.icD = pvsVar.icD;
        this.pvs = pvsVar.od;
    }

    public void pvs() {
        DeviceUtils.AudioInfoReceiver.pvs(this);
        this.Wyp = DeviceUtils.yiw();
        if (this.icD.ig() != null) {
            this.sUS = new com.bytedance.sdk.openadsdk.core.icD.yiw("VAST_END_CARD", this.icD.ig()) { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.mnm.1
            };
            com.bytedance.sdk.openadsdk.core.yiw.vG vG = this.icD.ig().vG();
            if (vG != null) {
                final String NB = vG.NB();
                if (!TextUtils.isEmpty(NB)) {
                    this.NB = true;
                    this.Jd = (ImageView) this.Mxy.qD.findViewById(com.bytedance.sdk.openadsdk.utils.kj.so);
                    pvs(vG.icD(), vG.vG());
                    com.bytedance.sdk.openadsdk.sUS.Jd.pvs(NB).pvs(vG.icD()).icD(vG.vG()).NB(Pj.Jd(com.bytedance.sdk.openadsdk.core.mnm.pvs())).Jd(Pj.vG(com.bytedance.sdk.openadsdk.core.mnm.pvs())).vG(2).pvs(new com.bytedance.sdk.openadsdk.sUS.icD(this.icD, NB, new com.bytedance.sdk.component.NB.mnm<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.mnm.2
                        @Override // com.bytedance.sdk.component.NB.mnm
                        public void pvs(com.bytedance.sdk.component.NB.qh<Bitmap> qhVar) {
                            if (mnm.this.Jd == null || qhVar == null) {
                                return;
                            }
                            Bitmap icD = qhVar.icD();
                            if (icD == null) {
                                mnm.this.pvs(-1, NB);
                                return;
                            }
                            mnm.this.Jd.setImageBitmap(icD);
                            mnm.this.yiw = true;
                            mnm.this.Jd();
                        }

                        @Override // com.bytedance.sdk.component.NB.mnm
                        public void pvs(int i, String str, Throwable th) {
                            if (mnm.this.Jd != null) {
                                mnm.this.Jd.setVisibility(8);
                            }
                            mnm.this.pvs(-2, NB);
                        }
                    }));
                    return;
                }
                SSWebView sSWebView = (SSWebView) this.Mxy.qD.findViewById(com.bytedance.sdk.openadsdk.utils.kj.Mxy);
                this.vG = sSWebView;
                if (sSWebView == null) {
                    return;
                }
                NB();
                String Jd = vG.Jd();
                if (Jd != null) {
                    this.NB = true;
                    if (Jd.startsWith("http")) {
                        this.vG.a_(Jd);
                        return;
                    }
                    String pvs = com.bytedance.sdk.openadsdk.core.yiw.NB.pvs(Jd);
                    String str = TextUtils.isEmpty(pvs) ? Jd : pvs;
                    this.vG.setDefaultTextEncodingName("UTF -8");
                    this.vG.pvs(null, str, "text/html", Key.STRING_CHARSET_NAME, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jd() {
        pvs(Integer.MAX_VALUE, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final int i, final String str) {
        if (this.so) {
            return;
        }
        this.so = true;
        final String qh = this.icD.ig() != null ? this.icD.ig().qh() : "";
        if (i == Integer.MAX_VALUE) {
            com.bytedance.sdk.openadsdk.icD.vG.icD(this.icD, qh, "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(new com.bytedance.sdk.component.so.so("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.mnm.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i);
                        jSONObject.put("error_code", i);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put(ImagesContract.URL, str2);
                        }
                        com.bytedance.sdk.openadsdk.icD.vG.icD(mnm.this.icD, qh, "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void NB() {
        this.vG.g_();
        pvs(this.vG);
        this.vG.setDisplayZoomControls(false);
        this.vG.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.mnm.4
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (i == 100) {
                    mnm.this.Jd();
                }
            }
        });
        this.vG.setWebViewClient(new SSWebView.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.mnm.5
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (mnm.this.pvs(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    mnm.this.pvs(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                mnm.this.Jd();
            }
        });
    }

    private void pvs(SSWebView sSWebView) {
        sSWebView.setVerticalScrollBarEnabled(false);
        sSWebView.setHorizontalScrollBarEnabled(false);
        sSWebView.setMixedContentMode(0);
        sSWebView.setJavaScriptEnabled(true);
        sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
        sSWebView.setDomStorageEnabled(true);
        sSWebView.setDatabaseEnabled(true);
        sSWebView.setAppCacheEnabled(true);
        sSWebView.setAllowFileAccess(false);
        sSWebView.setSupportZoom(true);
        sSWebView.setBuiltInZoomControls(true);
        sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        sSWebView.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pvs(String str) {
        cR cRVar;
        if (str == null || (cRVar = this.icD) == null || cRVar.ig() == null || this.sUS == null) {
            return false;
        }
        this.icD.ig().yiw(str);
        this.sUS.onClick(this.vG);
        return true;
    }

    private void pvs(int i, int i2) {
        if (i == 0 || i2 == 0 || this.Jd == null) {
            return;
        }
        int vG = Pj.vG((Context) this.pvs);
        int Jd = Pj.Jd((Context) this.pvs);
        if (i / i2 <= vG / Jd) {
            vG = (int) Math.ceil(r5 * r4);
        } else {
            Jd = (int) Math.ceil(r5 / r4);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Jd.getLayoutParams();
        layoutParams.width = vG;
        layoutParams.height = Jd;
        layoutParams.gravity = 17;
        this.Jd.setLayoutParams(layoutParams);
        this.Jd.setOnClickListener(this.sUS);
        this.Jd.setOnTouchListener(this.sUS);
    }

    public boolean pvs(IP ip) {
        com.bytedance.sdk.openadsdk.core.yiw.vG vG;
        if (!this.NB) {
            return false;
        }
        ImageView imageView = this.Jd;
        if (imageView != null && this.yiw) {
            imageView.setVisibility(0);
        } else {
            SSWebView sSWebView = this.vG;
            if (sSWebView != null) {
                sSWebView.setVisibility(0);
                if (this.vG.getWebView() != null) {
                    this.vG.getWebView().setOnTouchListener(this.sUS);
                }
            }
        }
        cR cRVar = this.icD;
        if (cRVar == null || cRVar.ig() == null || (vG = this.icD.ig().vG()) == null) {
            return true;
        }
        vG.icD(ip != null ? ip.yiw() : -1L);
        return true;
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.icD.NB nb) {
        com.bytedance.sdk.openadsdk.core.icD.yiw yiwVar = this.sUS;
        if (yiwVar != null) {
            yiwVar.pvs(nb);
        }
    }

    public void icD() {
        DeviceUtils.AudioInfoReceiver.icD(this);
        SSWebView sSWebView = this.vG;
        if (sSWebView != null) {
            gA.pvs(sSWebView.getWebView());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.Mxy.yiw
    public void pvs(int i) {
        int i2 = this.Wyp;
        if (i2 == 0 && i > 0) {
            this.icD.ig().pvs().Mxy(this.Mxy.ny.yiw());
        } else if (i2 > 0 && i == 0) {
            this.icD.ig().pvs().so(this.Mxy.ny.yiw());
        }
        this.Wyp = i;
    }

    public boolean vG() {
        if (!this.NB) {
            return false;
        }
        ImageView imageView = this.Jd;
        if (imageView != null) {
            imageView.performClick();
            return true;
        }
        SSWebView sSWebView = this.vG;
        if (sSWebView == null) {
            return false;
        }
        this.sUS.onClick(sSWebView);
        return true;
    }
}
