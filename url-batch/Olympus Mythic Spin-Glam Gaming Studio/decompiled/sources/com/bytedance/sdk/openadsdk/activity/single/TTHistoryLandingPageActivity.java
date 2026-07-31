package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.cn;
import com.bytedance.sdk.openadsdk.common.klz;
import com.bytedance.sdk.openadsdk.common.mw;
import com.bytedance.sdk.openadsdk.common.olo;
import com.bytedance.sdk.openadsdk.common.phc;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.nps;
import com.bytedance.sdk.openadsdk.fb.zn;
import com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class TTHistoryLandingPageActivity extends TTBaseLandingPageActivity {
    private static final LinkedList<WeakReference<Activity>> nps = new LinkedList<>();
    private nps.zmn am;
    private int bjh;
    private Context bvs;
    private int cn;
    private com.bytedance.sdk.openadsdk.rt.zmn cud;
    private String cyb;
    private com.bytedance.sdk.openadsdk.rt.zmn.zmn dgt;
    private ILoader doe;
    private boolean ev;
    olo fs;
    private ImageView hgd;
    private String iqz;
    private cn iv;
    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn kgc;
    private String klz;
    private com.bytedance.sdk.openadsdk.core.hhw.hhw kw;
    private String mw;
    private ImageView nu;
    private nqi olo;
    private mw oub;
    private String phc;
    private Button rc;
    private int rp;
    private fkt rt;
    private com.bytedance.sdk.openadsdk.core.widget.zmn.hhw so;
    private ImageView ww;
    private com.bytedance.sdk.openadsdk.common.btk yj;
    private ImageView yof;
    private klz zak;
    private com.bytedance.sdk.component.bvs.nps zg;
    com.bytedance.sdk.openadsdk.fb.mw zmn;
    TTAdDislikeToast zn;
    private final AtomicInteger nqi = new AtomicInteger(0);
    private final AtomicInteger uqh = new AtomicInteger(0);
    private final AtomicInteger kjb = new AtomicInteger(0);
    final AtomicBoolean fb = new AtomicBoolean(false);
    final AtomicBoolean btk = new AtomicBoolean(false);
    private boolean jy = false;
    private long vlj = 0;
    int hhw = -1;
    private String gn = "DOWNLOAD";

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.cn.btk()) {
            finish();
            return;
        }
        try {
            kgc.fs(this);
        } catch (Throwable unused) {
        }
        LinkedList<WeakReference<Activity>> linkedList = nps;
        linkedList.add(new WeakReference<>(this));
        if (linkedList.size() > 30) {
            zg();
        }
        com.bytedance.sdk.openadsdk.rt.btk.zmn(this);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("material_key");
        this.iqz = intent.getStringExtra("landing_url");
        int intExtra = intent.getIntExtra("landing_index", 0);
        if (stringExtra != null && intExtra >= 0) {
            com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zmn(stringExtra, new AnonymousClass1(intExtra, bundle, elapsedRealtime));
        } else {
            finish();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity$1, reason: invalid class name */
    class AnonymousClass1 implements zn.InterfaceC0206zn {
        final /* synthetic */ Bundle fs;
        final /* synthetic */ int zmn;
        final /* synthetic */ long zn;

        AnonymousClass1(int i, Bundle bundle, long j) {
            this.zmn = i;
            this.fs = bundle;
            this.zn = j;
        }

        @Override // com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.InterfaceC0206zn
        public void zmn(final String str) {
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.1.1
                @Override // java.lang.Runnable
                public void run() {
                    List<nqi> fs = com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.fs(str);
                    TTHistoryLandingPageActivity.this.olo = (fs == null || fs.isEmpty()) ? null : fs.get(AnonymousClass1.this.zmn);
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    Bundle bundle = anonymousClass1.fs;
                    if (bundle != null) {
                        try {
                            TTHistoryLandingPageActivity.this.hhw = bundle.getInt("meta_index", -1);
                            TTHistoryLandingPageActivity tTHistoryLandingPageActivity = TTHistoryLandingPageActivity.this;
                            if (tTHistoryLandingPageActivity.hhw >= 0) {
                                tTHistoryLandingPageActivity.olo = am.zmn().zmn(TTHistoryLandingPageActivity.this.hhw);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (TTHistoryLandingPageActivity.this.olo == null) {
                        TTHistoryLandingPageActivity.this.finish();
                        return;
                    }
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity2 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity2.klz = tTHistoryLandingPageActivity2.olo.ji();
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity3 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity3.mw = tTHistoryLandingPageActivity3.olo.ze();
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity4 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity4.phc = tTHistoryLandingPageActivity4.olo.ltf();
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity5 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity5.cn = tTHistoryLandingPageActivity5.olo.mw();
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity6 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity6.cyb = tTHistoryLandingPageActivity6.olo.klz();
                    try {
                        TTHistoryLandingPageActivity tTHistoryLandingPageActivity7 = TTHistoryLandingPageActivity.this;
                        tTHistoryLandingPageActivity7.setContentView(tTHistoryLandingPageActivity7.btk());
                        TTHistoryLandingPageActivity.this.fs();
                        TTHistoryLandingPageActivity tTHistoryLandingPageActivity8 = TTHistoryLandingPageActivity.this;
                        tTHistoryLandingPageActivity8.bvs = tTHistoryLandingPageActivity8;
                        if (TTHistoryLandingPageActivity.this.zg != null) {
                            com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(TTHistoryLandingPageActivity.this.bvs).zmn(false).fs(false).zmn(TTHistoryLandingPageActivity.this.zg.getWebView());
                        }
                        TTHistoryLandingPageActivity.this.oub.zmn(true);
                        if (TTHistoryLandingPageActivity.this.zg != null && TTHistoryLandingPageActivity.this.zg.getWebView() != null) {
                            TTHistoryLandingPageActivity.this.zmn = new com.bytedance.sdk.openadsdk.fb.mw(TTHistoryLandingPageActivity.this.olo, TTHistoryLandingPageActivity.this.zg.getWebView(), new zmn(TTHistoryLandingPageActivity.this.bjh, TTHistoryLandingPageActivity.this.olo, "landingpage", TTHistoryLandingPageActivity.this), TTHistoryLandingPageActivity.this.rp).fs(true);
                            TTHistoryLandingPageActivity tTHistoryLandingPageActivity9 = TTHistoryLandingPageActivity.this;
                            tTHistoryLandingPageActivity9.am = tTHistoryLandingPageActivity9.zmn.zmn;
                            TTHistoryLandingPageActivity tTHistoryLandingPageActivity10 = TTHistoryLandingPageActivity.this;
                            tTHistoryLandingPageActivity10.yj = oub.zmn(tTHistoryLandingPageActivity10.olo, TTHistoryLandingPageActivity.this.zg, TTHistoryLandingPageActivity.this.bvs, TTHistoryLandingPageActivity.this.cyb);
                            TTHistoryLandingPageActivity tTHistoryLandingPageActivity11 = TTHistoryLandingPageActivity.this;
                            tTHistoryLandingPageActivity11.zmn.btk(tTHistoryLandingPageActivity11.jy);
                            TTHistoryLandingPageActivity.this.olo.kw(TTHistoryLandingPageActivity.this.jy);
                        }
                        TTHistoryLandingPageActivity.this.bvs();
                        if (TTHistoryLandingPageActivity.this.zg != null) {
                            TTHistoryLandingPageActivity.this.zg.setLandingPage(true);
                            TTHistoryLandingPageActivity.this.zg.setTag("landingpage");
                            TTHistoryLandingPageActivity.this.zg.setMaterialMeta(TTHistoryLandingPageActivity.this.olo.xz());
                        }
                        TTHistoryLandingPageActivity.this.zn();
                        TTHistoryLandingPageActivity.this.hhw();
                        if (TTHistoryLandingPageActivity.this.cud != null) {
                            TTHistoryLandingPageActivity.this.cud.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.1.1.1
                                @Override // android.view.View.OnClickListener
                                public void onClick(View view) {
                                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTHistoryLandingPageActivity$1$1$1;->onClick(Landroid/view/View;)V");
                                    CreativeInfoManager.onViewClicked(h.u, view);
                                    safedk_TTHistoryLandingPageActivity$1$1$1_onClick_d1c83ff17cc12049c67376aad500ec75(view);
                                }

                                public void safedk_TTHistoryLandingPageActivity$1$1$1_onClick_d1c83ff17cc12049c67376aad500ec75(View p0) {
                                    TTHistoryLandingPageActivity.this.fs("onSelectPrivacy");
                                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity12 = TTHistoryLandingPageActivity.this;
                                    TTWebsiteActivity.zmn(tTHistoryLandingPageActivity12, tTHistoryLandingPageActivity12.olo, TTHistoryLandingPageActivity.this.cyb);
                                }
                            });
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        zn.zmn.zmn(elapsedRealtime - anonymousClass12.zn, TTHistoryLandingPageActivity.this.olo, "landingpage", TTHistoryLandingPageActivity.this.doe, TTHistoryLandingPageActivity.this.phc);
                    } catch (Throwable unused2) {
                        TTHistoryLandingPageActivity.this.finish();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.InterfaceC0206zn
        public void fs(String str) {
            TTHistoryLandingPageActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs() {
        oub.zmn(this.olo, this.zg);
        this.iv = (cn) findViewById(com.bytedance.sdk.openadsdk.utils.olo.xrr);
        cn cnVar = (cn) findViewById(com.bytedance.sdk.openadsdk.utils.olo.cd);
        klz klzVar = (klz) findViewById(520093721);
        this.zak = klzVar;
        if (klzVar != null) {
            klzVar.zmn(this.olo);
            this.zak.zmn();
        }
        if (cnVar != null) {
            cnVar.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.olo.wq);
        this.hgd = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTHistoryLandingPageActivity$7;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTHistoryLandingPageActivity$7_onClick_c5d9c7c654476d973d88d586d6393f09(view);
                }

                public void safedk_TTHistoryLandingPageActivity$7_onClick_c5d9c7c654476d973d88d586d6393f09(View p0) {
                    View p02 = TTHistoryLandingPageActivity.this.zg;
                    if (p02 != null) {
                        if (TTHistoryLandingPageActivity.this.am != null) {
                            TTHistoryLandingPageActivity.this.am.zmn();
                        }
                        if (TTHistoryLandingPageActivity.this.zg.zg()) {
                            TTHistoryLandingPageActivity.this.zg.bvs();
                            if (TTHistoryLandingPageActivity.this.oub != null) {
                                TTHistoryLandingPageActivity.this.oub.zmn(TTHistoryLandingPageActivity.this.zg.getWebView(), TTHistoryLandingPageActivity.this.am);
                            }
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.olo.bmc);
        this.nu = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTHistoryLandingPageActivity$8;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTHistoryLandingPageActivity$8_onClick_b378b02cc1cca3b092fe1e448fee8f5b(view);
                }

                public void safedk_TTHistoryLandingPageActivity$8_onClick_b378b02cc1cca3b092fe1e448fee8f5b(View p0) {
                    View p02 = TTHistoryLandingPageActivity.this.zg;
                    if (p02 == null || !TTHistoryLandingPageActivity.this.zg.iv()) {
                        return;
                    }
                    TTHistoryLandingPageActivity.this.zg.rc();
                    if (TTHistoryLandingPageActivity.this.oub != null) {
                        TTHistoryLandingPageActivity.this.oub.zmn(TTHistoryLandingPageActivity.this.zg.getWebView(), TTHistoryLandingPageActivity.this.am);
                    }
                }
            });
        }
        ImageView imageView3 = (ImageView) findViewById(520093716);
        this.yof = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTHistoryLandingPageActivity$9;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTHistoryLandingPageActivity$9_onClick_1ff10741f722a2466b317def7e4469ae(view);
                }

                public void safedk_TTHistoryLandingPageActivity$9_onClick_1ff10741f722a2466b317def7e4469ae(View p0) {
                    TTHistoryLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.hhw.hhw hhwVar = (com.bytedance.sdk.openadsdk.core.hhw.hhw) findViewById(com.bytedance.sdk.openadsdk.utils.olo.ax);
        this.kw = hhwVar;
        if (hhwVar != null) {
            hhwVar.setVisibility(0);
        }
        this.ww = (ImageView) findViewById(520093740);
        final phc phcVar = new phc(this, false);
        ImageView imageView4 = this.ww;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTHistoryLandingPageActivity$10;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTHistoryLandingPageActivity$10_onClick_5aec47046e5e5bd100216aa911797c7a(view);
                }

                public void safedk_TTHistoryLandingPageActivity$10_onClick_5aec47046e5e5bd100216aa911797c7a(View p0) {
                    phcVar.setOnMenuItemClickListener(new phc.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.10.1
                        @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                        public void zmn() {
                            if (TTHistoryLandingPageActivity.this.olo != null) {
                                com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zmn(TTHistoryLandingPageActivity.this.olo);
                            }
                            com.bytedance.sdk.component.utils.fs.zmn(TTHistoryLandingPageActivity.this, new Intent(TTHistoryLandingPageActivity.this, (Class<?>) TTHistoryActivity.class), null);
                            TTHistoryLandingPageActivity.this.fs("onSelectHistory");
                            phcVar.zmn();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                        public void fs() {
                            if (TTHistoryLandingPageActivity.this.zg == null || TTHistoryLandingPageActivity.this.zg.getUrl() == null) {
                                return;
                            }
                            if (TTHistoryLandingPageActivity.this.kw != null) {
                                TTHistoryLandingPageActivity.this.kw.setVisibility(0);
                                TTHistoryLandingPageActivity.this.kw.setProgress(0);
                            }
                            TTHistoryLandingPageActivity.this.zg.nps();
                            TTHistoryLandingPageActivity.this.zg.a_(TTHistoryLandingPageActivity.this.zg.getUrl());
                            TTHistoryLandingPageActivity.this.fs("onSelectRetry");
                            phcVar.zmn();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                        public void zn() {
                            ClipboardManager clipboardManager;
                            if (TTHistoryLandingPageActivity.this.zg != null) {
                                String url = TTHistoryLandingPageActivity.this.zg.getUrl();
                                if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTHistoryLandingPageActivity.this.getSystemService("clipboard")) != null) {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                                }
                            }
                            TTHistoryLandingPageActivity.this.fs("onSelectCopyLink");
                            phcVar.zmn();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                        public void fb() {
                            if (TTHistoryLandingPageActivity.this.zg != null) {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                String url = TTHistoryLandingPageActivity.this.zg.getUrl();
                                if (!TextUtils.isEmpty(url)) {
                                    intent.setData(Uri.parse(url));
                                    com.bytedance.sdk.component.utils.fs.zmn(TTHistoryLandingPageActivity.this, intent, null);
                                }
                                TTHistoryLandingPageActivity.this.fs("onSelectOpenInBrowser");
                                phcVar.zmn();
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                        public void btk() {
                            TTHistoryLandingPageActivity.this.zmn();
                            TTHistoryLandingPageActivity.this.fs("onSelectReport");
                            phcVar.zmn();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                        public void hhw() {
                            if (com.bytedance.sdk.openadsdk.utils.fs.btk()) {
                                TTHistoryLandingPageActivity tTHistoryLandingPageActivity = TTHistoryLandingPageActivity.this;
                                IABLandingPageActivity.zmn(tTHistoryLandingPageActivity, tTHistoryLandingPageActivity.olo, TTHistoryLandingPageActivity.this.cyb);
                            } else {
                                TTHistoryLandingPageActivity tTHistoryLandingPageActivity2 = TTHistoryLandingPageActivity.this;
                                TTWebsiteActivity.zmn(tTHistoryLandingPageActivity2, tTHistoryLandingPageActivity2.olo, TTHistoryLandingPageActivity.this.cyb);
                            }
                            TTHistoryLandingPageActivity.this.fs("onSelectPrivacy");
                            phcVar.zmn();
                        }
                    });
                    phcVar.zmn(p0);
                }
            });
        }
        View findViewById = findViewById(com.bytedance.sdk.openadsdk.utils.olo.sxr);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTHistoryLandingPageActivity$11;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTHistoryLandingPageActivity$11_onClick_cfac4916498997327e9fd2abf2741c45(view);
                }

                public void safedk_TTHistoryLandingPageActivity$11_onClick_cfac4916498997327e9fd2abf2741c45(View p0) {
                    TTHistoryLandingPageActivity.this.zmn();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void zn() {
        com.bytedance.sdk.openadsdk.core.widget.zmn.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.widget.zmn.hhw(this.bvs, this.rt, this.klz, this.yj, this.zmn, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.12
            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
                CreativeInfoManager.onResourceLoaded(h.u, view, url);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTHistoryLandingPageActivity$12;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
                BrandSafetyUtils.onWebViewPageStarted(h.u, webView, str);
                safedk_TTHistoryLandingPageActivity$12_onPageStarted_016c76163800a84fef77f48751cba6fd(webView, str, bitmap);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                BrandSafetyUtils.onWebViewReceivedError(h.u, view, errorCode, description, failingUrl);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTHistoryLandingPageActivity$12;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                return CreativeInfoManager.onWebViewResponse(h.u, webView, str, safedk_TTHistoryLandingPageActivity$12_shouldInterceptRequest_d6cbfd7ede1084fa7cd6488c7c20dfd9(webView, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, view, url, shouldOverrideUrlLoading);
                return shouldOverrideUrlLoading;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTHistoryLandingPageActivity.this.kw != null && !TTHistoryLandingPageActivity.this.isFinishing()) {
                        TTHistoryLandingPageActivity.this.kw.setVisibility(8);
                    }
                } catch (Throwable unused) {
                }
                if (TTHistoryLandingPageActivity.this.zak != null) {
                    TTHistoryLandingPageActivity.this.zak.fs();
                }
            }

            public WebResourceResponse safedk_TTHistoryLandingPageActivity$12_shouldInterceptRequest_d6cbfd7ede1084fa7cd6488c7c20dfd9(WebView p0, String p1) {
                try {
                    if (!TextUtils.isEmpty(TTHistoryLandingPageActivity.this.phc)) {
                        TTHistoryLandingPageActivity.this.nqi.incrementAndGet();
                        WebResourceResponseModel zmn2 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(TTHistoryLandingPageActivity.this.doe, TTHistoryLandingPageActivity.this.phc, p1);
                        if (zmn2 != null && zmn2.getWebResourceResponse() != null) {
                            TTHistoryLandingPageActivity.this.kjb.incrementAndGet();
                            return zmn2.getWebResourceResponse();
                        }
                        if (zmn2 != null && zmn2.getMsg() == 2) {
                            TTHistoryLandingPageActivity.this.uqh.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(p0, p1);
                    }
                    return super.shouldInterceptRequest(p0, p1);
                } catch (Throwable th) {
                    iqz.zmn("TTAD.HistoryLandingPageAct", "shouldInterceptRequest url error", th);
                    return super.shouldInterceptRequest(p0, p1);
                }
            }

            public void safedk_TTHistoryLandingPageActivity$12_onPageStarted_016c76163800a84fef77f48751cba6fd(WebView p0, String p1, Bitmap p2) {
                super.onPageStarted(p0, p1, p2);
            }
        };
        this.so = hhwVar;
        hhwVar.zmn(this.olo);
        this.so.zmn("landingpage");
        com.bytedance.sdk.component.bvs.nps npsVar = this.zg;
        if (npsVar != null) {
            npsVar.setWebViewClient(this.so);
            com.bytedance.sdk.component.bvs.nps npsVar2 = this.zg;
            if (npsVar2 != null) {
                npsVar2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.iqz.zmn(npsVar2.getWebView(), BuildConfig.VERSION_CODE));
            }
            com.bytedance.sdk.component.bvs.nps npsVar3 = this.zg;
            if (npsVar3 != null) {
                npsVar3.setMixedContentMode(0);
            }
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(this.olo, "landingpage", this.rp);
        com.bytedance.sdk.component.bvs.nps npsVar4 = this.zg;
        if (npsVar4 != null) {
            com.bytedance.sdk.openadsdk.utils.nqi.zmn(npsVar4, this.iqz);
            this.zg.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zmn.btk(this.rt, this.zmn, this.yj) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.13
                @Override // android.webkit.WebChromeClient
                public void onReceivedTitle(WebView webView, String str) {
                    super.onReceivedTitle(webView, str);
                    TTHistoryLandingPageActivity.this.oub.zmn(str);
                    TTHistoryLandingPageActivity.this.oub.fs(webView.getUrl());
                    try {
                        if (TextUtils.isEmpty(str)) {
                            str = TTHistoryLandingPageActivity.this.iqz;
                        }
                        TTHistoryLandingPageActivity.this.dgt = new com.bytedance.sdk.openadsdk.rt.zmn.zmn();
                        com.bytedance.sdk.openadsdk.core.model.zmn fb = TTHistoryLandingPageActivity.this.olo.fb();
                        TTHistoryLandingPageActivity.this.dgt.zmn(com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zn(TTHistoryLandingPageActivity.this.olo.iyj()));
                        TTHistoryLandingPageActivity.this.dgt.fs(fb.fs());
                        TTHistoryLandingPageActivity.this.dgt.zn(String.valueOf(System.currentTimeMillis()));
                        TTHistoryLandingPageActivity.this.dgt.btk(webView.getUrl());
                        TTHistoryLandingPageActivity.this.dgt.fs(TTHistoryLandingPageActivity.this.olo.il());
                        TTHistoryLandingPageActivity.this.dgt.fb(str);
                        com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zmn(TTHistoryLandingPageActivity.this.dgt);
                    } catch (Exception e) {
                        iqz.zmn("TTAD.HistoryLandingPageAct", "page start: miabhistory index = " + TTHistoryLandingPageActivity.this.olo.il() + "model = " + TTHistoryLandingPageActivity.this.dgt, e);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.btk, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (TTHistoryLandingPageActivity.this.zak != null) {
                        TTHistoryLandingPageActivity.this.zak.zmn(i);
                    }
                    if (TTHistoryLandingPageActivity.this.kw != null && !TTHistoryLandingPageActivity.this.isFinishing()) {
                        if (i != 100 || !TTHistoryLandingPageActivity.this.kw.isShown()) {
                            TTHistoryLandingPageActivity.this.kw.setProgress(i);
                        } else {
                            TTHistoryLandingPageActivity.this.kw.setVisibility(8);
                        }
                    }
                    if (TTHistoryLandingPageActivity.this.oub != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - TTHistoryLandingPageActivity.this.vlj >= 200 || i == 100) {
                            TTHistoryLandingPageActivity.this.oub.zmn(webView, TTHistoryLandingPageActivity.this.am);
                            TTHistoryLandingPageActivity.this.vlj = currentTimeMillis;
                        }
                    }
                }
            });
            if (this.zg.getWebView() != null) {
                this.zg.getWebView().setOnScrollChangeListener(new fs(this.zmn));
                this.zg.getWebView().setOnTouchListener(new zn(this.zmn, this.yj) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.14
                    private long btk;
                    private float fb;
                    private final int fs = kgc.fs();
                    private float hhw = 0.0f;
                    private float nps = 0.0f;
                    private float zn;

                    @Override // com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.zn, android.view.View.OnTouchListener
                    @SuppressLint({"LongLogTag"})
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTHistoryLandingPageActivity$14;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                        return safedk_TTHistoryLandingPageActivity$14_onTouch_fabe2bac815ea91c47e565a1cd895de9(view, motionEvent);
                    }

                    @SuppressLint({"LongLogTag"})
                    public boolean safedk_TTHistoryLandingPageActivity$14_onTouch_fabe2bac815ea91c47e565a1cd895de9(View p0, MotionEvent p1) {
                        try {
                            int actionMasked = p1.getActionMasked();
                            if (actionMasked == 0) {
                                this.zn = p1.getRawX();
                                this.fb = p1.getRawY();
                                this.btk = System.currentTimeMillis();
                            } else if (actionMasked == 2) {
                                float rawX = p1.getRawX();
                                float rawY = p1.getRawY();
                                if (Math.abs(rawX - this.zn) < this.fs) {
                                    Math.abs(rawY - this.fb);
                                }
                                this.hhw += Math.abs(p1.getX() - this.zn);
                                this.nps += Math.abs(p1.getY() - this.fb);
                                System.currentTimeMillis();
                                if (rawY - this.fb > this.fs) {
                                    TTHistoryLandingPageActivity.this.oub.zmn();
                                }
                                if (rawY - this.fb < (-this.fs)) {
                                    TTHistoryLandingPageActivity.this.oub.fs();
                                }
                            }
                        } catch (Throwable th) {
                            Log.e("TTAD.HistoryLandingPageAct", "TouchRecordTool onTouch error", th);
                        }
                        return super.onTouch(p0, p1);
                    }
                });
            }
            this.zg.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.2
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (TTHistoryLandingPageActivity.this.kgc != null) {
                        TTHistoryLandingPageActivity.this.kgc.zmn(TTHistoryLandingPageActivity.this.olo);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View btk() {
        com.bytedance.sdk.openadsdk.core.model.fs ew;
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(this);
        if (Build.VERSION.SDK_INT >= 35) {
            znVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(this);
        btkVar.setOrientation(1);
        znVar.addView(btkVar, new FrameLayout.LayoutParams(-1, -1));
        this.oub = new mw(this, this.olo, this.cyb, false);
        View cnVar = new cn(this, new cn.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.common.cn.zmn
            public View zmn(Context context) {
                return TTHistoryLandingPageActivity.this.oub.fb();
            }
        });
        cnVar.setId(com.bytedance.sdk.openadsdk.utils.olo.cd);
        btkVar.addView(cnVar, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zn(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        btkVar.addView(znVar2, layoutParams);
        com.bytedance.sdk.component.bvs.nps npsVar = new com.bytedance.sdk.component.bvs.nps(this, nps.zn.LANDING_PAGE);
        this.zg = npsVar;
        npsVar.setId(com.bytedance.sdk.openadsdk.utils.olo.gn);
        znVar2.addView(npsVar, new FrameLayout.LayoutParams(-1, -1));
        cn cnVar2 = new cn(this, new cn.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.common.cn.zmn
            public View zmn(Context context) {
                return new com.bytedance.sdk.openadsdk.common.zg(context);
            }
        });
        cnVar2.setId(com.bytedance.sdk.openadsdk.utils.olo.xrr);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        znVar2.addView(cnVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.hhw.hhw(this, null, R.style.Widget.ProgressBar.Horizontal);
        hhwVar.setId(com.bytedance.sdk.openadsdk.utils.olo.ax);
        hhwVar.setProgress(1);
        hhwVar.setVisibility(8);
        hhwVar.setProgressDrawable(rc.zmn(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, jy.fs(this, 3.0f));
        layoutParams3.gravity = 49;
        znVar2.addView(hhwVar, layoutParams3);
        nqi nqiVar = this.olo;
        if (nqiVar != null && (ew = nqiVar.ew()) != null) {
            String fb = ew.fb();
            if (!TextUtils.isEmpty(fb)) {
                com.bytedance.sdk.openadsdk.rt.zmn zmnVar = new com.bytedance.sdk.openadsdk.rt.zmn(this);
                this.cud = zmnVar;
                zmnVar.setId(com.bytedance.sdk.openadsdk.utils.olo.tdm);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                this.cud.setPadding(jy.fs(this, 16.0f), jy.fs(this, 16.0f), jy.fs(this, 16.0f), jy.fs(this, 16.0f));
                this.cud.setPrivacyText(fb);
                layoutParams4.gravity = 80;
                znVar2.addView(this.cud, layoutParams4);
            }
        }
        klz klzVar = new klz(this);
        klzVar.setOnlyLoading(this.ev);
        klzVar.setId(520093721);
        znVar.addView(klzVar, new FrameLayout.LayoutParams(-1, -1));
        return znVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void hhw() {
        nqi nqiVar = this.olo;
        if (nqiVar == null || nqiVar.va() != 4) {
            return;
        }
        cn cnVar = this.iv;
        if (cnVar != null) {
            cnVar.setVisibility(0);
        }
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.olo.ouf);
        this.rc = button;
        if (button != null) {
            zmn(nps());
            if (this.kgc == null) {
                this.kgc = com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this, TextUtils.isEmpty(this.cyb) ? oub.fs(this.cn) : this.cyb);
            }
            com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.zn.zmn(this, this.olo, this.cyb, this.cn);
            zmnVar.zmn(false);
            this.rc.setOnClickListener(zmnVar);
            this.rc.setOnTouchListener(zmnVar);
            zmnVar.zn(true);
            zmnVar.zmn(this.kgc);
        }
    }

    private String nps() {
        nqi nqiVar = this.olo;
        if (nqiVar != null && !TextUtils.isEmpty(nqiVar.gt())) {
            this.gn = this.olo.gt();
        }
        return this.gn;
    }

    private void zmn(String str) {
        if (TextUtils.isEmpty(str) || this.rc == null || isFinishing()) {
            return;
        }
        this.rc.setText(str);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        hhw();
    }

    private void zg() {
        while (true) {
            LinkedList<WeakReference<Activity>> linkedList = nps;
            if (linkedList.isEmpty()) {
                return;
            }
            Activity activity = linkedList.pollFirst().get();
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
                return;
            }
        }
    }

    public static void zmn(Context context, String str, String str2, int i) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTHistoryLandingPageActivity.class);
        intent.putExtra("material_key", str);
        intent.putExtra("landing_url", str2);
        intent.putExtra("landing_index", i);
        com.bytedance.sdk.component.utils.fs.zmn(context, intent, null);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int zmn2 = this.olo != null ? am.zmn().zmn(this.olo) : -1;
            this.hhw = zmn2;
            bundle.putInt("meta_index", zmn2);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Iterator<WeakReference<Activity>> it = nps.iterator();
        while (it.hasNext()) {
            Activity activity = it.next().get();
            if (activity == this || activity == null) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bvs() {
        fkt fktVar = new fkt(this);
        this.rt = fktVar;
        fktVar.fs(this.zg).zn(this.klz).fb(this.mw).zmn(this.olo).fs(this.cn).zmn(this.olo.mig()).btk(this.olo.gor()).zmn(this.zg).fs("landingpage");
    }

    protected void zmn() {
        if (isFinishing()) {
            return;
        }
        if (this.btk.get()) {
            rc();
            return;
        }
        if (this.fs == null) {
            iv();
        }
        olo oloVar = this.fs;
        if (oloVar != null) {
            oloVar.zmn();
        }
    }

    private void iv() {
        try {
            if (this.fs == null) {
                olo oloVar = new olo(this.bvs, this.olo);
                this.fs = oloVar;
                oloVar.setDislikeSource("landing_page");
                this.fs.setCallback(new olo.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.5
                    @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                    public void zmn(View view) {
                        TTHistoryLandingPageActivity.this.fb.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                    public void fs(View view) {
                        TTHistoryLandingPageActivity.this.fb.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                    public void zmn(FilterWord filterWord) {
                        if (TTHistoryLandingPageActivity.this.btk.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTHistoryLandingPageActivity.this.btk.set(true);
                        TTHistoryLandingPageActivity.this.klz();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.fs);
            if (this.zn == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.bvs);
                this.zn = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private void rc() {
        TTAdDislikeToast tTAdDislikeToast = this.zn;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void klz() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.zn) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.hhw >= 0) {
            am.zmn().zn(this.hhw);
            this.hhw = -1;
        }
        com.bytedance.sdk.openadsdk.utils.fb.zmn(this, this.olo);
        nqi nqiVar = this.olo;
        if (nqiVar != null) {
            nqiVar.lbc(1);
        }
    }

    public static class zmn implements com.bytedance.sdk.openadsdk.fb.klz {
        private final WeakReference<TTHistoryLandingPageActivity> fb;
        private final nqi fs;
        private final int zmn;
        private final String zn;

        public zmn(int i, nqi nqiVar, String str, TTHistoryLandingPageActivity tTHistoryLandingPageActivity) {
            this.zmn = i;
            this.fs = nqiVar;
            this.zn = str;
            this.fb = new WeakReference<>(tTHistoryLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.fb.klz
        public void zmn(int i) {
            TTHistoryLandingPageActivity tTHistoryLandingPageActivity = this.fb.get();
            if (tTHistoryLandingPageActivity != null) {
                zn.zmn.zmn(this.zmn, tTHistoryLandingPageActivity.uqh.get(), tTHistoryLandingPageActivity.kjb.get(), tTHistoryLandingPageActivity.nqi.get() - tTHistoryLandingPageActivity.kjb.get(), this.fs, this.zn, i);
            }
        }
    }

    @RequiresApi
    private static class fs implements View.OnScrollChangeListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.fb.mw> zmn;

        public fs(com.bytedance.sdk.openadsdk.fb.mw mwVar) {
            this.zmn = new WeakReference<>(mwVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            com.bytedance.sdk.openadsdk.fb.mw mwVar = this.zmn.get();
            if (mwVar != null) {
                mwVar.fs(i2);
            }
        }
    }

    private static class zn implements View.OnTouchListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.common.btk> fs;
        private final WeakReference<com.bytedance.sdk.openadsdk.fb.mw> zmn;

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTHistoryLandingPageActivity$zn;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
            return safedk_TTHistoryLandingPageActivity$zn_onTouch_723b7208000ffc35eaf4a0c004d46f24(view, motionEvent);
        }

        public zn(com.bytedance.sdk.openadsdk.fb.mw mwVar, com.bytedance.sdk.openadsdk.common.btk btkVar) {
            this.zmn = new WeakReference<>(mwVar);
            this.fs = new WeakReference<>(btkVar);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean safedk_TTHistoryLandingPageActivity$zn_onTouch_723b7208000ffc35eaf4a0c004d46f24(View p0, MotionEvent p1) {
            com.bytedance.sdk.openadsdk.fb.mw mwVar = this.zmn.get();
            if (mwVar != null) {
                mwVar.zmn(p1);
            }
            com.bytedance.sdk.openadsdk.common.btk btkVar = this.fs.get();
            if (btkVar == null) {
                return false;
            }
            btkVar.zmn(p1);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(final String str) {
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("iab_more_options", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", str);
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("iab_more_options").fs(jSONObject.toString());
            }
        });
    }
}
