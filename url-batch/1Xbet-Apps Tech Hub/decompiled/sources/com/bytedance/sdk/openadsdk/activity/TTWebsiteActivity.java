package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.Wyp;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.gA;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;
import com.google.common.net.HttpHeaders;
import java.net.URLEncoder;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class TTWebsiteActivity extends TTBaseActivity {
    private Wyp icD;
    private String pvs = null;
    private WebView vG;

    public static void pvs(Context context, cR cRVar, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.icD.vG.pvs(System.currentTimeMillis(), cRVar, str, "open_policy");
        if (TextUtils.isEmpty(mnm.Jd().gSd())) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
        if (cRVar != null) {
            intent.putExtra("_extra_meta", cRVar.pR().toString());
            intent.putExtra("_extra_glo_d", cRVar.ekB());
        }
        com.bytedance.sdk.component.utils.icD.pvs(context, intent, null);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mnm.pvs(getApplicationContext());
        if (!Ju.NB()) {
            finish();
            return;
        }
        final String stringExtra = getIntent().getStringExtra("_extra_meta");
        String stringExtra2 = getIntent().getStringExtra("_extra_glo_d");
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this);
        pAGLinearLayout.setBackgroundColor(-1);
        pAGLinearLayout.setId(520093726);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(pAGLinearLayout);
            int icD = Pj.icD(this, 5.0f);
            int icD2 = Pj.icD(this, 8.0f);
            int icD3 = Pj.icD(this, 10.0f);
            int icD4 = Pj.icD(this, 12.0f);
            int icD5 = Pj.icD(this, 14.0f);
            int icD6 = Pj.icD(this, 20.0f);
            int icD7 = Pj.icD(this, 24.0f);
            int icD8 = Pj.icD(this, 40.0f);
            int icD9 = Pj.icD(this, 44.0f);
            int icD10 = Pj.icD(this, 191.0f);
            PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(this);
            pAGRelativeLayout.setGravity(15);
            pAGRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, icD9));
            PAGImageView pAGImageView = new PAGImageView(this);
            pAGImageView.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(icD8, icD9);
            layoutParams.setMarginStart(icD2);
            pAGImageView.setLayoutParams(layoutParams);
            pAGImageView.setClickable(true);
            pAGImageView.setFocusable(true);
            pAGImageView.setPadding(icD5, icD4, icD5, icD4);
            pAGImageView.setImageDrawable(uc.vG(this, "tt_ad_arrow_backward_wrapper"));
            final PAGImageView pAGImageView2 = new PAGImageView(this);
            pAGImageView2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(icD8, icD9);
            layoutParams2.addRule(17, 520093720);
            pAGImageView2.setLayoutParams(layoutParams2);
            pAGImageView2.setClickable(true);
            pAGImageView2.setFocusable(true);
            pAGImageView2.setPadding(icD4, icD5, icD4, icD5);
            pAGImageView2.setImageDrawable(uc.vG(this, "tt_ad_xmark"));
            PAGTextView pAGTextView = new PAGTextView(this);
            pAGTextView.setId(kj.FFl);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(icD10, icD7);
            layoutParams3.setMarginStart(icD);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            pAGTextView.setLayoutParams(layoutParams3);
            pAGTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            pAGTextView.setGravity(17);
            pAGTextView.setSingleLine(true);
            pAGTextView.setTextColor(Color.parseColor("#222222"));
            pAGTextView.setTextSize(17.0f);
            PAGImageView pAGImageView3 = new PAGImageView(this);
            pAGImageView3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(icD8, icD9);
            layoutParams4.addRule(16, 520093742);
            pAGImageView3.setLayoutParams(layoutParams4);
            pAGImageView3.setPadding(icD3, icD4, icD3, icD4);
            pAGImageView3.setImageDrawable(uc.vG(this, "tt_ad_link"));
            PAGImageView pAGImageView4 = new PAGImageView(this);
            pAGImageView4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(icD8, icD9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(icD2);
            pAGImageView4.setLayoutParams(layoutParams5);
            pAGImageView4.setPadding(icD4, icD6, icD4, icD6);
            pAGImageView4.setImageDrawable(uc.vG(this, "tt_ad_threedots"));
            final PAGProgressBar pAGProgressBar = new PAGProgressBar(this, null, R.style.Widget.ProgressBar.Horizontal);
            pAGProgressBar.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, Pj.icD(this, 2.0f));
            layoutParams6.addRule(12);
            pAGProgressBar.setLayoutParams(layoutParams6);
            pAGProgressBar.setProgress(1);
            pAGProgressBar.setProgressDrawable(so.pvs(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, Pj.icD(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            pAGRelativeLayout.addView(pAGImageView);
            pAGRelativeLayout.addView(pAGImageView2);
            pAGRelativeLayout.addView(pAGTextView);
            pAGRelativeLayout.addView(pAGImageView3);
            pAGRelativeLayout.addView(pAGImageView4);
            pAGRelativeLayout.addView(pAGProgressBar);
            pAGRelativeLayout.addView(view);
            pAGLinearLayout.addView(pAGRelativeLayout);
            try {
                WebView webView = new WebView(this);
                this.vG = webView;
                webView.setBackgroundColor(-1);
                pAGLinearLayout.addView(this.vG, new ViewGroup.LayoutParams(-1, -1));
                pAGImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.vG.canGoBack()) {
                            TTWebsiteActivity.this.vG.goBack();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                pAGImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                pAGImageView2.setVisibility(4);
                pAGImageView2.setClickable(false);
                pAGTextView.setText(uc.pvs(this, "tt_privacy_title"));
                pAGImageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.vG.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.icD.pvs(TTWebsiteActivity.this, intent, null);
                    }
                });
                pAGImageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.icD == null) {
                            TTWebsiteActivity.this.icD = new Wyp(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.icD.pvs(stringExtra);
                            TTWebsiteActivity.this.icD.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.icD.show();
                    }
                });
                if (mnm.Jd() != null) {
                    this.pvs = mnm.Jd().gSd();
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        String encode = URLEncoder.encode(stringExtra2);
                        if (this.pvs.contains("?")) {
                            this.pvs += "&gdid_encrypted=" + encode;
                        } else {
                            this.pvs += "?gdid_encrypted=" + encode;
                        }
                    }
                }
                if (this.pvs != null) {
                    WebSettings settings = this.vG.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (Throwable unused) {
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
                    try {
                        this.vG.loadUrl(this.pvs, hashMap);
                    } catch (Throwable unused2) {
                        this.vG.loadUrl(this.pvs);
                    }
                    this.vG.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5
                        @Override // android.webkit.WebChromeClient
                        public void onProgressChanged(WebView webView2, int i) {
                            super.onProgressChanged(webView2, i);
                            if (pAGProgressBar == null || TTWebsiteActivity.this.isFinishing()) {
                                return;
                            }
                            if (i == 100) {
                                pAGProgressBar.setVisibility(8);
                                if (webView2.canGoBack()) {
                                    pAGImageView2.setVisibility(0);
                                    pAGImageView2.setClickable(true);
                                    return;
                                } else {
                                    pAGImageView2.setVisibility(4);
                                    pAGImageView2.setClickable(false);
                                    return;
                                }
                            }
                            pAGProgressBar.setVisibility(0);
                            pAGProgressBar.setProgress(i);
                        }
                    });
                    this.vG.setWebViewClient(new SSWebView.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.6
                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                            if (webView2 == null || webResourceRequest == null) {
                                return false;
                            }
                            webView2.loadUrl(webResourceRequest.getUrl().toString());
                            return true;
                        }

                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView webView2, String str) {
                            super.onPageFinished(webView2, str);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.TTWebsiteActivity", "onReceivedHttpError invoke....errorResponse=".concat(String.valueOf(webResourceResponse)));
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            super.onReceivedError(webView2, webResourceRequest, webResourceError);
                            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.TTWebsiteActivity", "onReceivedError invoke....onReceivedError=" + webResourceError.getErrorCode());
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, int i, String str, String str2) {
                            super.onReceivedError(webView2, i, str, str2);
                        }
                    });
                    com.bytedance.sdk.openadsdk.core.widget.pvs.vG.icD(this.vG);
                    return;
                }
                finish();
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.TTWebsiteActivity", "onCreate: ", e);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        gA.pvs(this.vG);
    }
}
