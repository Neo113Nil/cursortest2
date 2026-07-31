package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.zak;
import com.bytedance.sdk.openadsdk.common.iqz;
import com.bytedance.sdk.openadsdk.common.mw;
import com.bytedance.sdk.openadsdk.common.phc;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.nps;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.net.URLEncoder;
import java.util.Objects;

/* loaded from: classes14.dex */
public class TTWebsiteActivity extends TTBaseActivity {
    private com.bytedance.sdk.component.bvs.nps btk;
    private int bvs;
    private ImageView cn;
    private nqi cyb;
    private iqz fb;
    private int iv;
    private float klz;
    private ImageView mw;
    private nps.zmn nps;
    private ILoader rc;
    private ImageView rt;
    private String zg;
    public mw zmn;
    private String zn = null;
    private boolean hhw = false;
    int fs = -1;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    public static void zmn(Context context, nqi nqiVar, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, str, "open_policy");
        if (!TextUtils.isEmpty(nqiVar.ew().zn())) {
            Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
            intent.putExtra("meta_index", am.zmn().zmn(nqiVar));
            com.bytedance.sdk.component.utils.fs.zmn(context, intent, null);
        }
        com.bytedance.sdk.openadsdk.component.fb.zmn.zmn(nqiVar, nqiVar.pge());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        String str;
        String str2;
        String str3 = "";
        super.onCreate(bundle);
        kgc.fs(getApplicationContext());
        if (!cn.btk()) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.rt.btk.zmn(this);
        if (bundle != null) {
            this.fs = bundle.getInt("meta_index", -1);
        }
        if (this.fs < 0) {
            this.fs = am.zmn(getIntent());
        }
        nqi zmn = am.zmn().zmn(this.fs);
        this.cyb = zmn;
        if (zmn != null) {
            try {
                str = zmn.zak();
                try {
                    str2 = this.cyb.ew().zn();
                    try {
                        str3 = this.cyb.ew().btk();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    str2 = "";
                }
            } catch (Throwable unused3) {
                str = "";
                str2 = str;
            }
            if (TextUtils.isEmpty(str2)) {
                finish();
                return;
            }
            boolean am = kgc.fb().am();
            this.hhw = am;
            nqi nqiVar = this.cyb;
            if (nqiVar != null && am) {
                fs(nqiVar, str, str2, str3);
                return;
            } else {
                zmn(nqiVar, str, str2, str3);
                return;
            }
        }
        finish();
    }

    private void zmn(final nqi nqiVar, String str, String str2, String str3) {
        com.bytedance.sdk.component.bvs.nps npsVar;
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(this);
        if (Build.VERSION.SDK_INT >= 35) {
            btkVar.setFitsSystemWindows(true);
        }
        btkVar.setBackgroundColor(-1);
        btkVar.setId(520093726);
        btkVar.setOrientation(1);
        btkVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(btkVar);
            int fs = jy.fs(this, 5.0f);
            int fs2 = jy.fs(this, 8.0f);
            int fs3 = jy.fs(this, 10.0f);
            int fs4 = jy.fs(this, 12.0f);
            int fs5 = jy.fs(this, 14.0f);
            int fs6 = jy.fs(this, 20.0f);
            int fs7 = jy.fs(this, 24.0f);
            int fs8 = jy.fs(this, 40.0f);
            int fs9 = jy.fs(this, 44.0f);
            int fs10 = jy.fs(this, 191.0f);
            com.bytedance.sdk.openadsdk.core.hhw.nps npsVar2 = new com.bytedance.sdk.openadsdk.core.hhw.nps(this);
            npsVar2.setGravity(15);
            npsVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, fs9));
            com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(this);
            fbVar.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(fs8, fs9);
            layoutParams.setMarginStart(fs2);
            fbVar.setLayoutParams(layoutParams);
            fbVar.setClickable(true);
            fbVar.setFocusable(true);
            fbVar.setPadding(fs5, fs4, fs5, fs4);
            fbVar.setImageDrawable(doe.zn(this, "tt_ad_arrow_backward"));
            final com.bytedance.sdk.openadsdk.core.hhw.fb fbVar2 = new com.bytedance.sdk.openadsdk.core.hhw.fb(this);
            fbVar2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(fs8, fs9);
            layoutParams2.addRule(17, 520093720);
            fbVar2.setLayoutParams(layoutParams2);
            fbVar2.setClickable(true);
            fbVar2.setFocusable(true);
            fbVar2.setPadding(fs4, fs5, fs4, fs5);
            fbVar2.setImageDrawable(doe.zn(this, "tt_ad_xmark"));
            com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(this);
            zgVar.setId(olo.ob);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(fs10, fs7);
            layoutParams3.setMarginStart(fs);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            zgVar.setLayoutParams(layoutParams3);
            zgVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            zgVar.setGravity(17);
            zgVar.setSingleLine(true);
            zgVar.setTextColor(Color.parseColor("#222222"));
            zgVar.setTextSize(17.0f);
            com.bytedance.sdk.openadsdk.core.hhw.fb fbVar3 = new com.bytedance.sdk.openadsdk.core.hhw.fb(this);
            fbVar3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(fs8, fs9);
            layoutParams4.addRule(16, 520093742);
            fbVar3.setLayoutParams(layoutParams4);
            fbVar3.setPadding(fs3, fs4, fs3, fs4);
            fbVar3.setImageDrawable(doe.zn(this, "tt_ad_link"));
            com.bytedance.sdk.openadsdk.core.hhw.fb fbVar4 = new com.bytedance.sdk.openadsdk.core.hhw.fb(this);
            fbVar4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(fs8, fs9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(fs2);
            fbVar4.setLayoutParams(layoutParams5);
            fbVar4.setPadding(fs4, fs6, fs4, fs6);
            fbVar4.setImageDrawable(doe.zn(this, "tt_ad_threedots"));
            final com.bytedance.sdk.openadsdk.core.hhw.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.hhw.hhw(this, null, R.style.Widget.ProgressBar.Horizontal);
            hhwVar.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, jy.fs(this, 2.0f));
            layoutParams6.addRule(12);
            hhwVar.setLayoutParams(layoutParams6);
            hhwVar.setProgress(1);
            hhwVar.setProgressDrawable(rc.zmn(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, jy.fs(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            npsVar2.addView(fbVar);
            npsVar2.addView(fbVar2);
            npsVar2.addView(zgVar);
            npsVar2.addView(fbVar3);
            npsVar2.addView(fbVar4);
            npsVar2.addView(hhwVar);
            npsVar2.addView(view);
            btkVar.addView(npsVar2);
            try {
                com.bytedance.sdk.component.bvs.nps npsVar3 = new com.bytedance.sdk.component.bvs.nps(this, nps.zn.PRIVACY);
                this.btk = npsVar3;
                npsVar3.setBackgroundColor(-1);
                btkVar.addView(this.btk, new ViewGroup.LayoutParams(-1, -1));
                fbVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$1;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view2);
                        safedk_TTWebsiteActivity$1_onClick_89edc6e637fcbcff33e7fc69fd6f3dab(view2);
                    }

                    public void safedk_TTWebsiteActivity$1_onClick_89edc6e637fcbcff33e7fc69fd6f3dab(View p0) {
                        if (TTWebsiteActivity.this.btk.zg()) {
                            TTWebsiteActivity.this.btk.bvs();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                fbVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$6;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view2);
                        safedk_TTWebsiteActivity$6_onClick_5fe86cc729536136ea566f5d9ce55b44(view2);
                    }

                    public void safedk_TTWebsiteActivity$6_onClick_5fe86cc729536136ea566f5d9ce55b44(View p0) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                fbVar2.setVisibility(4);
                fbVar2.setClickable(false);
                if (!TextUtils.isEmpty(str3)) {
                    zgVar.setText(str3);
                }
                fbVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$7;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view2);
                        safedk_TTWebsiteActivity$7_onClick_e597f4c433c2282136897e77673d193b(view2);
                    }

                    public void safedk_TTWebsiteActivity$7_onClick_e597f4c433c2282136897e77673d193b(View p0) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.btk.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.fs.zmn(TTWebsiteActivity.this, intent, null);
                    }
                });
                fbVar4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.8
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$8;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view2);
                        safedk_TTWebsiteActivity$8_onClick_705b858bb751b5a728e6e8767d229928(view2);
                    }

                    public void safedk_TTWebsiteActivity$8_onClick_705b858bb751b5a728e6e8767d229928(View p0) {
                        if (TTWebsiteActivity.this.fb == null) {
                            TTWebsiteActivity.this.fb = new iqz(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.fb.zmn(nqiVar);
                            TTWebsiteActivity.this.fb.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.fb.show();
                    }
                });
                this.zn = str2;
                if (!TextUtils.isEmpty(str)) {
                    String encode = URLEncoder.encode(str);
                    if (this.zn.contains("?")) {
                        this.zn += "&gdid_encrypted=" + encode;
                    } else {
                        this.zn += "?gdid_encrypted=" + encode;
                    }
                }
                if (this.zn != null && (npsVar = this.btk) != null) {
                    WebView webView = npsVar.getWebView();
                    if (webView != null) {
                        WebSettings settings = webView.getSettings();
                        settings.setMixedContentMode(0);
                        try {
                            settings.setJavaScriptEnabled(true);
                            settings.setDomStorageEnabled(true);
                            settings.setSavePassword(false);
                            settings.setAllowFileAccess(false);
                        } catch (Throwable unused) {
                        }
                    }
                    try {
                        com.bytedance.sdk.openadsdk.utils.nqi.zmn(this.btk, this.zn);
                    } catch (Exception unused2) {
                        this.btk.a_(this.zn);
                    }
                    this.btk.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.9
                        @Override // android.webkit.WebChromeClient
                        public void onProgressChanged(WebView webView2, int i) {
                            super.onProgressChanged(webView2, i);
                            if (hhwVar == null || TTWebsiteActivity.this.isFinishing()) {
                                return;
                            }
                            if (i == 100) {
                                hhwVar.setVisibility(8);
                                if (webView2.canGoBack()) {
                                    fbVar2.setVisibility(0);
                                    fbVar2.setClickable(true);
                                    return;
                                } else {
                                    fbVar2.setVisibility(4);
                                    fbVar2.setClickable(false);
                                    return;
                                }
                            }
                            hhwVar.setVisibility(0);
                            hhwVar.setProgress(i);
                        }
                    });
                    this.btk.setWebViewClient(new nps.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.10
                        @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                        public void onLoadResource(WebView view2, String url) {
                            super.onLoadResource(view2, url);
                            CreativeInfoManager.onResourceLoaded(h.u, view2, url);
                        }

                        @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                        public void onPageStarted(WebView view2, String url, Bitmap favicon) {
                            super.onPageStarted(view2, url, favicon);
                            BrandSafetyUtils.onWebViewPageStarted(h.u, view2, url);
                        }

                        @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, int i, String str4, String str5) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$10;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
                            BrandSafetyUtils.onWebViewReceivedError(h.u, webView2, i, str4, str5);
                            safedk_TTWebsiteActivity$10_onReceivedError_f60214f33ca29829f1ce812f8f0247af(webView2, i, str4, str5);
                        }

                        @Override // android.webkit.WebViewClient
                        @RequiresApi
                        public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$10;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
                            BrandSafetyUtils.onWebViewReceivedError(h.u, webView2, webResourceRequest, webResourceError);
                            safedk_TTWebsiteActivity$10_onReceivedError_8bbef163119724eb11494e9a9261f102(webView2, webResourceRequest, webResourceError);
                        }

                        @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                        public WebResourceResponse shouldInterceptRequest(WebView view2, WebResourceRequest webResourceRequest) {
                            return CreativeInfoManager.onWebViewResponseWithHeaders(h.u, view2, webResourceRequest, super.shouldInterceptRequest(view2, webResourceRequest));
                        }

                        @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView2, String str4) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$10;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                            boolean safedk_TTWebsiteActivity$10_shouldOverrideUrlLoading_5dba994421922b75d0b4e7bde692504f = safedk_TTWebsiteActivity$10_shouldOverrideUrlLoading_5dba994421922b75d0b4e7bde692504f(webView2, str4);
                            BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, webView2, str4, safedk_TTWebsiteActivity$10_shouldOverrideUrlLoading_5dba994421922b75d0b4e7bde692504f);
                            return safedk_TTWebsiteActivity$10_shouldOverrideUrlLoading_5dba994421922b75d0b4e7bde692504f;
                        }

                        public boolean safedk_TTWebsiteActivity$10_shouldOverrideUrlLoading_5dba994421922b75d0b4e7bde692504f(WebView p0, String p1) {
                            try {
                                Uri parse = Uri.parse(p1);
                                if (!com.bytedance.sdk.component.utils.kgc.zmn(p1)) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        intent.setData(parse);
                                        intent.addFlags(268435456);
                                        com.bytedance.sdk.component.utils.fs.zmn(TTWebsiteActivity.this, intent, null);
                                        return true;
                                    } catch (Throwable unused3) {
                                        return true;
                                    }
                                }
                            } catch (Throwable unused4) {
                            }
                            return super.shouldOverrideUrlLoading(p0, p1);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView webView2, String str4) {
                            super.onPageFinished(webView2, str4);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                            Objects.toString(webResourceResponse);
                        }

                        @RequiresApi
                        public void safedk_TTWebsiteActivity$10_onReceivedError_8bbef163119724eb11494e9a9261f102(WebView p0, WebResourceRequest p1, WebResourceError p2) {
                            super.onReceivedError(p0, p1, p2);
                            p2.getErrorCode();
                        }

                        public void safedk_TTWebsiteActivity$10_onReceivedError_f60214f33ca29829f1ce812f8f0247af(WebView p0, int p1, String p2, String p3) {
                            super.onReceivedError(p0, p1, p2, p3);
                        }
                    });
                    com.bytedance.sdk.openadsdk.core.widget.zmn.fb.fs(this.btk.getWebView());
                    return;
                }
                finish();
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.iqz.zmn("TTAD.TTWebsiteActivity", "onCreate: ", e);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void fs(final nqi nqiVar, String str, String str2, String str3) {
        com.bytedance.sdk.component.bvs.nps npsVar;
        if (nqiVar != null) {
            this.zg = nqiVar.ltf();
        }
        if (!TextUtils.isEmpty(this.zg)) {
            this.rc = com.bytedance.sdk.openadsdk.nps.fs.zmn().fs();
            int zmn = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(this.rc, this.zg);
            this.bvs = zmn;
            this.iv = zmn > 0 ? 2 : 0;
        }
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(this);
        if (Build.VERSION.SDK_INT >= 35) {
            btkVar.setFitsSystemWindows(true);
        }
        btkVar.setBackgroundColor(-1);
        btkVar.setId(520093726);
        btkVar.setOrientation(1);
        btkVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(btkVar);
            mw mwVar = new mw(this, nqiVar, "tag", true);
            this.zmn = mwVar;
            View fb = mwVar.fb();
            this.zmn.zmn();
            fb.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            fb.setVisibility(0);
            btkVar.addView(fb);
            final TextView textView = (TextView) fb.findViewById(olo.zmn);
            fb.findViewById(olo.fs);
            final com.bytedance.sdk.openadsdk.core.hhw.hhw hhwVar = (com.bytedance.sdk.openadsdk.core.hhw.hhw) findViewById(520093743);
            if (hhwVar != null) {
                hhwVar.setProgress(0);
                hhwVar.setMax(100);
            }
            ImageView imageView = (ImageView) findViewById(olo.wq);
            this.mw = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.11
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$11;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view);
                        safedk_TTWebsiteActivity$11_onClick_6d561f0f25a13cad0e5471ae5e431af8(view);
                    }

                    public void safedk_TTWebsiteActivity$11_onClick_6d561f0f25a13cad0e5471ae5e431af8(View p0) {
                        View p02 = TTWebsiteActivity.this.btk;
                        if (p02 != null) {
                            if (TTWebsiteActivity.this.nps != null) {
                                TTWebsiteActivity.this.nps.zmn();
                            }
                            if (TTWebsiteActivity.this.btk.zg()) {
                                TTWebsiteActivity.this.btk.bvs();
                            } else {
                                TTWebsiteActivity.this.finish();
                            }
                        }
                    }
                });
            }
            ImageView imageView2 = (ImageView) findViewById(olo.bmc);
            this.rt = imageView2;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.12
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$12;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view);
                        safedk_TTWebsiteActivity$12_onClick_6d358a81bf01bbd2283bf38ec399c22d(view);
                    }

                    public void safedk_TTWebsiteActivity$12_onClick_6d358a81bf01bbd2283bf38ec399c22d(View p0) {
                        View p02 = TTWebsiteActivity.this.btk;
                        if (p02 == null || !TTWebsiteActivity.this.btk.iv()) {
                            return;
                        }
                        TTWebsiteActivity.this.btk.rc();
                    }
                });
            }
            ImageView imageView3 = (ImageView) fb.findViewById(520093740);
            this.cn = imageView3;
            if (imageView3 != null) {
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.13
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$13;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view);
                        safedk_TTWebsiteActivity$13_onClick_2a61e82d2edb152617cefea0a2a7914f(view);
                    }

                    public void safedk_TTWebsiteActivity$13_onClick_2a61e82d2edb152617cefea0a2a7914f(View p0) {
                        final phc phcVar = new phc(TTWebsiteActivity.this, true);
                        phcVar.setOnMenuItemClickListener(new phc.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.13.1
                            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                            public void zmn() {
                                phcVar.zmn();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                            public void fs() {
                                com.bytedance.sdk.component.bvs.nps npsVar2 = TTWebsiteActivity.this.btk;
                                if (npsVar2 != null && npsVar2.getUrl() != null) {
                                    com.bytedance.sdk.openadsdk.core.hhw.hhw hhwVar2 = hhwVar;
                                    if (hhwVar2 != null) {
                                        hhwVar2.setVisibility(0);
                                        hhwVar.setProgress(0);
                                    }
                                    npsVar2.nps();
                                    String url = npsVar2.getUrl();
                                    if (url != null) {
                                        npsVar2.a_(url);
                                    }
                                    phcVar.zmn();
                                }
                                TTWebsiteActivity.this.zmn("onSelectRetry");
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                            public void zn() {
                                ClipboardManager clipboardManager;
                                if (TTWebsiteActivity.this.btk != null) {
                                    String url = TTWebsiteActivity.this.btk.getUrl();
                                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTWebsiteActivity.this.getSystemService("clipboard")) != null) {
                                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                                    }
                                }
                                TTWebsiteActivity.this.zmn("onSelectCopyLink");
                                phcVar.zmn();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                            public void fb() {
                                if (TTWebsiteActivity.this.btk != null) {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    String url = TTWebsiteActivity.this.btk.getUrl();
                                    if (!TextUtils.isEmpty(url)) {
                                        intent.setData(Uri.parse(url));
                                        com.bytedance.sdk.component.utils.fs.zmn(TTWebsiteActivity.this, intent, null);
                                    }
                                    TTWebsiteActivity.this.zmn("onSelectOpenInBrowser");
                                    phcVar.zmn();
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                            public void btk() {
                                if (TTWebsiteActivity.this.fb == null) {
                                    TTWebsiteActivity.this.fb = new iqz(TTWebsiteActivity.this);
                                    TTWebsiteActivity.this.fb.zmn(nqiVar);
                                    TTWebsiteActivity.this.fb.setCanceledOnTouchOutside(false);
                                }
                                TTWebsiteActivity.this.fb.show();
                                TTWebsiteActivity.this.zmn("onSelectReport");
                                phcVar.zmn();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                            public void hhw() {
                                TTWebsiteActivity.this.zmn("onSelectPrivacy");
                                phcVar.zmn();
                            }
                        });
                        phcVar.zmn(p0);
                    }
                });
            }
            try {
                com.bytedance.sdk.component.bvs.nps zn = this.zmn.zn();
                this.btk = zn;
                WebView webView = zn.getWebView();
                if (webView != null) {
                    this.nps = new com.bytedance.sdk.openadsdk.core.widget.zmn.nps(webView, nqiVar, this, false).zn();
                }
                this.zmn.zmn(true);
                if (this.btk.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.btk.getParent()).removeView(this.btk);
                }
                btkVar.addView(this.btk, new ViewGroup.LayoutParams(-1, -1));
                this.zn = str2;
                if (!TextUtils.isEmpty(str)) {
                    String encode = URLEncoder.encode(str);
                    if (this.zn.contains("?")) {
                        this.zn += "&gdid_encrypted=" + encode;
                    } else {
                        this.zn += "?gdid_encrypted=" + encode;
                    }
                }
                if (this.zn != null && (npsVar = this.btk) != null) {
                    WebView webView2 = npsVar.getWebView();
                    if (webView2 != null) {
                        WebSettings settings = webView2.getSettings();
                        settings.setMixedContentMode(0);
                        try {
                            settings.setJavaScriptEnabled(true);
                            settings.setDomStorageEnabled(true);
                            settings.setSavePassword(false);
                            settings.setAllowFileAccess(false);
                        } catch (Throwable unused) {
                        }
                    }
                    try {
                        com.bytedance.sdk.openadsdk.utils.nqi.zmn(this.btk, this.zn);
                    } catch (Exception unused2) {
                        this.btk.a_(this.zn);
                    }
                    this.btk.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.2
                        @Override // android.webkit.WebChromeClient
                        public void onProgressChanged(WebView webView3, int i) {
                            super.onProgressChanged(webView3, i);
                            if (hhwVar == null || TTWebsiteActivity.this.isFinishing()) {
                                return;
                            }
                            if (i == 100) {
                                hhwVar.setVisibility(8);
                                webView3.canGoBack();
                            } else {
                                hhwVar.setVisibility(0);
                                hhwVar.setProgress(i);
                            }
                        }

                        @Override // android.webkit.WebChromeClient
                        public void onReceivedTitle(WebView webView3, String str4) {
                            TextView textView2;
                            if (TextUtils.isEmpty(str4) || (textView2 = textView) == null) {
                                return;
                            }
                            textView2.setText(str4);
                            TTWebsiteActivity.this.zmn.fs(webView3.getUrl());
                        }
                    });
                    this.btk.setWebViewClient(new nps.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.3
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
                        public void onReceivedError(WebView webView3, int i, String str4, String str5) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$3;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
                            BrandSafetyUtils.onWebViewReceivedError(h.u, webView3, i, str4, str5);
                            safedk_TTWebsiteActivity$3_onReceivedError_7f36f11d8a128d5d7bee9ad078e7ff1b(webView3, i, str4, str5);
                        }

                        @Override // android.webkit.WebViewClient
                        @RequiresApi
                        public void onReceivedError(WebView webView3, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$3;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
                            BrandSafetyUtils.onWebViewReceivedError(h.u, webView3, webResourceRequest, webResourceError);
                            safedk_TTWebsiteActivity$3_onReceivedError_cbb974fa797a151c90c7b997f2d78c5f(webView3, webResourceRequest, webResourceError);
                        }

                        @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                            return CreativeInfoManager.onWebViewResponseWithHeaders(h.u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
                        }

                        @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView3, String str4) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$3;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                            boolean safedk_TTWebsiteActivity$3_shouldOverrideUrlLoading_4f5305ca63c9f44edb29d78d04bc4f4f = safedk_TTWebsiteActivity$3_shouldOverrideUrlLoading_4f5305ca63c9f44edb29d78d04bc4f4f(webView3, str4);
                            BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, webView3, str4, safedk_TTWebsiteActivity$3_shouldOverrideUrlLoading_4f5305ca63c9f44edb29d78d04bc4f4f);
                            return safedk_TTWebsiteActivity$3_shouldOverrideUrlLoading_4f5305ca63c9f44edb29d78d04bc4f4f;
                        }

                        public boolean safedk_TTWebsiteActivity$3_shouldOverrideUrlLoading_4f5305ca63c9f44edb29d78d04bc4f4f(WebView p0, String p1) {
                            try {
                                Uri parse = Uri.parse(p1);
                                if (!com.bytedance.sdk.component.utils.kgc.zmn(p1)) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        intent.setData(parse);
                                        intent.addFlags(268435456);
                                        com.bytedance.sdk.component.utils.fs.zmn(TTWebsiteActivity.this, intent, null);
                                        return true;
                                    } catch (Throwable unused3) {
                                        return true;
                                    }
                                }
                            } catch (Throwable unused4) {
                            }
                            return super.shouldOverrideUrlLoading(p0, p1);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView webView3, String str4) {
                            TTWebsiteActivity tTWebsiteActivity;
                            mw mwVar2;
                            super.onPageFinished(webView3, str4);
                            if (!TTWebsiteActivity.this.hhw || (mwVar2 = (tTWebsiteActivity = TTWebsiteActivity.this).zmn) == null) {
                                return;
                            }
                            mwVar2.zmn(webView3, tTWebsiteActivity.nps);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedHttpError(WebView webView3, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            super.onReceivedHttpError(webView3, webResourceRequest, webResourceResponse);
                            Objects.toString(webResourceResponse);
                        }

                        @RequiresApi
                        public void safedk_TTWebsiteActivity$3_onReceivedError_cbb974fa797a151c90c7b997f2d78c5f(WebView p0, WebResourceRequest p1, WebResourceError p2) {
                            super.onReceivedError(p0, p1, p2);
                            p2.getErrorCode();
                        }

                        public void safedk_TTWebsiteActivity$3_onReceivedError_7f36f11d8a128d5d7bee9ad078e7ff1b(WebView p0, int p1, String p2, String p3) {
                            super.onReceivedError(p0, p1, p2, p3);
                        }
                    });
                    if (this.btk != null && webView2 != null) {
                        webView2.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.4
                            private final int fs = kgc.fs();

                            @Override // android.view.View.OnTouchListener
                            @SuppressLint({"ClickableViewAccessibility"})
                            public boolean onTouch(View view, MotionEvent motionEvent) {
                                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity$4;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                                CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                                return safedk_TTWebsiteActivity$4_onTouch_d26c8abe0fed29c616bfe9e5bf79b686(view, motionEvent);
                            }

                            @SuppressLint({"ClickableViewAccessibility"})
                            public boolean safedk_TTWebsiteActivity$4_onTouch_d26c8abe0fed29c616bfe9e5bf79b686(View p0, MotionEvent p1) {
                                try {
                                    int actionMasked = p1.getActionMasked();
                                    if (actionMasked == 0) {
                                        TTWebsiteActivity.this.klz = p1.getRawY();
                                        return false;
                                    }
                                    if (actionMasked != 2) {
                                        return false;
                                    }
                                    float rawY = p1.getRawY();
                                    if (!TTWebsiteActivity.this.hhw) {
                                        return false;
                                    }
                                    if (rawY - TTWebsiteActivity.this.klz > this.fs) {
                                        TTWebsiteActivity.this.zmn.zmn();
                                    }
                                    if (rawY - TTWebsiteActivity.this.klz >= (-this.fs)) {
                                        return false;
                                    }
                                    TTWebsiteActivity.this.zmn.fs();
                                    return false;
                                } catch (Throwable th) {
                                    Log.e("TTAD.TTWebsiteActivity", "TouchRecordTool onTouch error", th);
                                    return false;
                                }
                            }
                        });
                    }
                    com.bytedance.sdk.openadsdk.core.widget.zmn.fb.fs(webView2);
                    return;
                }
                finish();
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.iqz.zmn("TTAD.TTWebsiteActivity", "onCreate: ", e);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.fs >= 0) {
            am.zmn().zn(this.fs);
            this.fs = -1;
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int zmn = this.cyb != null ? am.zmn().zmn(this.cyb) : -1;
            this.fs = zmn;
            bundle.putInt("meta_index", zmn);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.btk;
        if (npsVar != null) {
            zak.zmn(npsVar);
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final String str) {
        try {
            com.bytedance.sdk.openadsdk.cyb.fb.zmn(str, false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.5
                @Override // com.bytedance.sdk.openadsdk.cyb.fs
                @Nullable
                public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                    return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn(str).fs((String) null);
                }
            });
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zmn("TTAD.TTWebsiteActivity", "Failed to put iab_click_time into JSON", e);
        }
    }
}
