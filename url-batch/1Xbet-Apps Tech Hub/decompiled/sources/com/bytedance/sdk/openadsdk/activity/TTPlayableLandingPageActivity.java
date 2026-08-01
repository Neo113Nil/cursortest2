package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.adexpress.Jd.so;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.Mxy.yiw;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.OT;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.gA;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.ny;
import com.bytedance.sdk.openadsdk.core.widget.DefaultEndCardBackupLayout;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowTextView;
import com.bytedance.sdk.openadsdk.icD.Wyp;
import com.bytedance.sdk.openadsdk.icD.qh;
import com.bytedance.sdk.openadsdk.icD.vG;
import com.bytedance.sdk.openadsdk.kj.so;
import com.bytedance.sdk.openadsdk.kj.yiw;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.bNS;
import com.bytedance.sdk.openadsdk.utils.vA;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTPlayableLandingPageActivity extends TTBaseActivity implements dyT.pvs, yiw, com.bytedance.sdk.openadsdk.core.icD.Jd {
    private static final yiw.pvs sq = new yiw.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.1
        @Override // com.bytedance.sdk.openadsdk.kj.yiw.pvs
        public void pvs(String str, String str2, Throwable th) {
            Ju.pvs(str, str2, th);
        }
    };
    private boolean Gp;
    private int IP;
    private Context Ju;
    private SSWebView NB;
    private int OT;
    private ILoader OhP;
    private com.bytedance.sdk.openadsdk.icD.vG.NB SE;
    private RelativeLayout Wyp;
    private String ZhG;
    private boolean ae;
    private PAGProgressBar bNS;
    private String cR;
    private cR dX;
    private String dx;
    private com.com.bytedance.overseas.sdk.pvs.vG gA;
    private int gSd;
    TTAdDislikeToast icD;
    private ShadowImageView kj;
    private PlayableLoadingView mnm;
    private String ny;
    private so od;
    ny pvs;
    private int qD;
    private ShadowTextView qh;
    private CvL rCZ;
    private CvL uc;
    private DefaultEndCardBackupLayout vA;
    private qh yWX;
    private String zM;
    private boolean sUS = true;
    private boolean so = false;
    private boolean Mxy = true;
    final AtomicBoolean vG = new AtomicBoolean(false);
    private final String dyT = "embeded_ad";
    private final dyT CvL = new dyT(Looper.getMainLooper(), this);
    private final AtomicBoolean jlb = new AtomicBoolean(false);
    private final AtomicInteger Pj = new AtomicInteger(0);
    private final AtomicInteger cRf = new AtomicInteger(0);
    private final AtomicInteger sP = new AtomicInteger(0);
    private boolean jhZ = false;
    protected com.bytedance.sdk.openadsdk.Mxy.Jd Jd = new com.bytedance.sdk.openadsdk.Mxy.Jd() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7
        @Override // com.bytedance.sdk.openadsdk.Mxy.Jd
        public void pvs() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && rCZ.yiw(TTPlayableLandingPageActivity.this.dX) && rCZ.Mxy(TTPlayableLandingPageActivity.this.dX)) {
                TTPlayableLandingPageActivity.this.CvL.removeMessages(2);
                TTPlayableLandingPageActivity.this.CvL.sendMessage(TTPlayableLandingPageActivity.this.pvs(1, 0));
            }
        }

        @Override // com.bytedance.sdk.openadsdk.Mxy.Jd
        public void icD() {
            if (rCZ.yiw(TTPlayableLandingPageActivity.this.dX) && rCZ.so(TTPlayableLandingPageActivity.this.dX)) {
                TTPlayableLandingPageActivity.this.CvL.sendMessageDelayed(TTPlayableLandingPageActivity.this.pvs(0, 0), 1000L);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.Mxy.Jd
        public void pvs(int i) {
            if (!rCZ.yiw(TTPlayableLandingPageActivity.this.dX) || TTPlayableLandingPageActivity.this.mnm == null) {
                return;
            }
            TTPlayableLandingPageActivity.this.mnm.setProgress(i);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public Message pvs(int i, int i2) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.arg1 = i;
        if (i == 3) {
            obtain.arg2 = i2;
        }
        return obtain;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.Ju.NB()) {
            finish();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            mnm.pvs(this);
        } catch (Throwable unused) {
        }
        pvs(bundle);
        cR cRVar = this.dX;
        if (cRVar == null) {
            return;
        }
        int Wyp = rCZ.Wyp(cRVar);
        if (Wyp == 0) {
            setRequestedOrientation(14);
        } else if (Wyp == 1) {
            setRequestedOrientation(1);
        } else if (Wyp == 2) {
            setRequestedOrientation(0);
        }
        this.Ju = this;
        try {
            setContentView(Jd());
            Mxy();
            sUS();
            pvs();
            qh();
            yiw();
            if (!TextUtils.isEmpty(this.dx)) {
                this.OhP = com.bytedance.sdk.openadsdk.Jd.icD.pvs().icD();
                int pvs = com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(this.OhP, this.dx);
                this.gSd = pvs;
                this.qD = pvs > 0 ? 2 : 0;
            }
            so();
            com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.SE;
            if (nb != null) {
                nb.yiw();
            }
            vG.pvs.pvs(SystemClock.elapsedRealtime() - elapsedRealtime, this.dX, "embeded_ad", this.OhP, this.dx);
        } catch (Throwable unused2) {
            finish();
        }
    }

    private View Jd() {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this);
        pAGFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.NB = new SSWebView(this);
        this.NB.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.NB.setVisibility(4);
        this.bNS = new PAGProgressBar(this, null, R.style.Widget.ProgressBar.Horizontal);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, Pj.icD(this, 3.0f));
        layoutParams.gravity = 49;
        this.bNS.setLayoutParams(layoutParams);
        this.bNS.setProgress(1);
        this.bNS.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.so.pvs(this, "tt_browser_progress_style"));
        this.mnm = new PlayableLoadingView(this);
        this.mnm.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mnm.setClickable(true);
        this.mnm.setFocusable(true);
        this.vA = new DefaultEndCardBackupLayout(this);
        this.vA.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.kj = new ShadowImageView(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(Pj.icD(this, 28.0f), Pj.icD(this, 28.0f));
        layoutParams2.leftMargin = Pj.icD(this, 12.0f);
        layoutParams2.topMargin = Pj.icD(this, 20.0f);
        this.kj.setLayoutParams(layoutParams2);
        this.kj.setScaleType(ImageView.ScaleType.CENTER);
        this.kj.setImageDrawable(com.bytedance.sdk.openadsdk.utils.so.pvs(this, "tt_unmute_wrapper"));
        this.qh = new ShadowTextView(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, Pj.icD(this, 28.0f));
        layoutParams3.gravity = 8388661;
        layoutParams3.leftMargin = Pj.icD(this, 16.0f);
        layoutParams3.rightMargin = Pj.icD(this, 80.0f);
        layoutParams3.topMargin = Pj.icD(this, 20.0f);
        this.qh.setLayoutParams(layoutParams3);
        this.qh.setGravity(17);
        this.qh.setText(uc.pvs(this, "tt_reward_feedback"));
        this.qh.setTextColor(Color.parseColor("#ffffff"));
        this.qh.setTextSize(14.0f);
        this.Wyp = new PAGRelativeLayout(this);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(Pj.icD(this, 28.0f), Pj.icD(this, 28.0f));
        layoutParams4.gravity = 8388661;
        layoutParams4.topMargin = Pj.icD(this, 20.0f);
        layoutParams4.rightMargin = Pj.icD(this, 24.0f);
        this.Wyp.setLayoutParams(layoutParams4);
        this.Wyp.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(this, "tt_mute_btn_bg"));
        this.Wyp.setGravity(17);
        this.Wyp.setVisibility(8);
        PAGImageView pAGImageView = new PAGImageView(this);
        pAGImageView.setLayoutParams(new RelativeLayout.LayoutParams(Pj.icD(this, 12.0f), Pj.icD(this, 12.0f)));
        pAGImageView.setImageDrawable(uc.vG(this, "tt_video_close_drawable"));
        pAGImageView.setVisibility(0);
        this.Wyp.addView(pAGImageView);
        pAGFrameLayout.addView(this.NB);
        pAGFrameLayout.addView(this.bNS);
        pAGFrameLayout.addView(this.vA);
        pAGFrameLayout.addView(this.mnm);
        pAGFrameLayout.addView(this.kj);
        pAGFrameLayout.addView(this.qh);
        pAGFrameLayout.addView(this.Wyp);
        return pAGFrameLayout;
    }

    private void NB() {
        if (this.od != null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.so.icD().vA()) {
            com.bytedance.sdk.openadsdk.kj.yiw.pvs(sq);
        }
        com.bytedance.sdk.openadsdk.kj.pvs pvsVar = new com.bytedance.sdk.openadsdk.kj.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.8
            @Override // com.bytedance.sdk.openadsdk.kj.pvs
            public void pvs(int i, String str) {
                super.pvs(i, str);
                if (rCZ.mnm(TTPlayableLandingPageActivity.this.dX)) {
                    TTPlayableLandingPageActivity.this.CvL.sendMessage(TTPlayableLandingPageActivity.this.pvs(3, rCZ.pvs(i)));
                    TTPlayableLandingPageActivity.this.Wyp();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.kj.pvs
            public com.bytedance.sdk.openadsdk.kj.Jd pvs() {
                String sUS = com.bytedance.sdk.openadsdk.common.pvs.sUS();
                sUS.hashCode();
                switch (sUS) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.kj.Jd.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.kj.Jd.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.kj.Jd.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.kj.Jd.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.kj.Jd.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.kj.Jd.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.kj.pvs
            public void pvs(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.icD.vG.icD(TTPlayableLandingPageActivity.this.dX, "embeded_ad", "playable_track", jSONObject);
            }
        };
        com.bytedance.sdk.openadsdk.kj.vG vGVar = new com.bytedance.sdk.openadsdk.kj.vG() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.9
            @Override // com.bytedance.sdk.openadsdk.kj.vG
            public void pvs(String str, JSONObject jSONObject) {
                TTPlayableLandingPageActivity.this.uc.pvs(str, jSONObject);
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.cR);
            jSONObject.put("log_extra", this.zM);
            this.od = so.pvs(getApplicationContext(), this.NB.getWebView(), vGVar, pvsVar).sUS(this.ny).NB(com.bytedance.sdk.openadsdk.common.pvs.pvs(mnm.pvs())).pvs(com.bytedance.sdk.openadsdk.common.pvs.pvs()).vG(jSONObject).icD(com.bytedance.sdk.openadsdk.common.pvs.NB()).pvs("sdkEdition", com.bytedance.sdk.openadsdk.common.pvs.vG()).Jd(com.bytedance.sdk.openadsdk.common.pvs.Jd()).vG(false).pvs(this.jhZ).pvs(rCZ.Ju(this.dX)).icD(rCZ.Ju(this.dX)).Jd(true);
        } catch (Throwable unused) {
        }
        if (this.od == null) {
            Ju.pvs("Pangle", "new PlayablePlugin Object failed, mPlayablePlugin is null");
            return;
        }
        if (!TextUtils.isEmpty(rCZ.Jd(this.dX))) {
            this.od.vG(rCZ.Jd(this.dX));
        }
        Set<String> qh = this.od.qh();
        final WeakReference weakReference = new WeakReference(this.od);
        for (String str : qh) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str)) {
                this.uc.pvs().pvs(str, new com.bytedance.sdk.component.pvs.NB<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.pvs.NB
                    public JSONObject pvs(JSONObject jSONObject2, com.bytedance.sdk.component.pvs.sUS sus) {
                        try {
                            so soVar = (so) weakReference.get();
                            if (soVar == null) {
                                return null;
                            }
                            return soVar.Jd(pvs(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    private void sUS() {
        if (this.dX.jhZ() == 4) {
            this.gA = com.com.bytedance.overseas.sdk.pvs.Jd.pvs(this.Ju, this.dX, "interaction");
        }
    }

    private void yiw() {
        int i = mnm.Jd().Gp(String.valueOf(this.dX.yTz())).vA;
        if (i >= 0) {
            this.CvL.sendEmptyMessageDelayed(1, i * 1000);
        } else {
            Pj.pvs((View) this.Wyp, 0);
        }
    }

    private void pvs(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            this.IP = intent.getIntExtra("sdk_version", 1);
            this.cR = intent.getStringExtra("adid");
            this.zM = intent.getStringExtra("log_extra");
            this.OT = intent.getIntExtra(FirebaseAnalytics.Param.SOURCE, -1);
            this.Gp = intent.getBooleanExtra("ad_pending_download", false);
            this.ny = intent.getStringExtra(ImagesContract.URL);
            this.dx = intent.getStringExtra("gecko_id");
            this.ZhG = intent.getStringExtra("web_title");
            if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.dX = com.bytedance.sdk.openadsdk.core.icD.pvs(new JSONObject(stringExtra));
                    } catch (Exception e) {
                        Ju.pvs("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                    }
                }
            } else {
                this.dX = OT.pvs().icD();
                OT.pvs().sUS();
            }
        }
        if (bundle != null) {
            try {
                this.IP = bundle.getInt("sdk_version", 1);
                this.cR = bundle.getString("adid");
                this.zM = bundle.getString("log_extra");
                this.OT = bundle.getInt(FirebaseAnalytics.Param.SOURCE, -1);
                this.Gp = bundle.getBoolean("ad_pending_download", false);
                this.ny = bundle.getString(ImagesContract.URL);
                this.ZhG = bundle.getString("web_title");
                String string = bundle.getString("material_meta", null);
                if (!TextUtils.isEmpty(string)) {
                    this.dX = com.bytedance.sdk.openadsdk.core.icD.pvs(new JSONObject(string));
                }
            } catch (Throwable unused) {
            }
        }
        if (this.dX == null) {
            Ju.pvs("TTPWPActivity", "material is null, no data to display");
            finish();
        } else {
            try {
                this.jhZ = mnm.Jd().vA(this.dX.jlb().getCodeId());
            } catch (Throwable th) {
                Ju.pvs("TTPWPActivity", th.getMessage());
            }
        }
    }

    private void so() {
        SSWebView sSWebView = this.NB;
        if (sSWebView == null) {
            return;
        }
        sSWebView.setLandingPage(true);
        this.NB.setTag("landingpage");
        this.NB.setMaterialMeta(this.dX.xa());
        qh pvs = new qh(this.dX, this.NB.getWebView(), new Wyp() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.11
            @Override // com.bytedance.sdk.openadsdk.icD.Wyp
            public void pvs(int i) {
                vG.pvs.pvs(TTPlayableLandingPageActivity.this.gSd, TTPlayableLandingPageActivity.this.sP.get(), TTPlayableLandingPageActivity.this.cRf.get(), TTPlayableLandingPageActivity.this.Pj.get() - TTPlayableLandingPageActivity.this.cRf.get(), TTPlayableLandingPageActivity.this.dX, "embeded_ad", i);
            }
        }, this.qD).pvs(true);
        this.yWX = pvs;
        pvs.pvs("embeded_ad");
        this.yWX.pvs(this.SE);
        this.NB.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.NB(this.Ju, this.uc, this.cR, this.yWX, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.12
            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                TTPlayableLandingPageActivity.this.so = true;
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                if (TTPlayableLandingPageActivity.this.od != null) {
                    TTPlayableLandingPageActivity.this.od.so(str);
                }
                try {
                    TTPlayableLandingPageActivity.this.Jd.icD();
                } catch (Throwable unused) {
                }
                try {
                    if (TTPlayableLandingPageActivity.this.bNS != null) {
                        TTPlayableLandingPageActivity.this.bNS.setVisibility(8);
                    }
                    if (TTPlayableLandingPageActivity.this.sUS) {
                        TTPlayableLandingPageActivity.this.Wyp();
                        TTPlayableLandingPageActivity.this.pvs("py_loading_success");
                        if (this.vG != null) {
                            this.vG.icD(true);
                        }
                    }
                } catch (Throwable unused2) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (TTPlayableLandingPageActivity.this.ny != null && webResourceRequest != null && webResourceRequest.getUrl() != null && TTPlayableLandingPageActivity.this.ny.equals(webResourceRequest.getUrl().toString())) {
                    TTPlayableLandingPageActivity.this.sUS = false;
                }
                if (TTPlayableLandingPageActivity.this.od != null && webResourceRequest != null) {
                    try {
                        TTPlayableLandingPageActivity.this.od.pvs(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    } catch (Throwable unused) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                TTPlayableLandingPageActivity.this.sUS = false;
                if (TTPlayableLandingPageActivity.this.od == null || webResourceError == null || webResourceRequest == null) {
                    return;
                }
                TTPlayableLandingPageActivity.this.od.pvs(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (TTPlayableLandingPageActivity.this.od != null) {
                        TTPlayableLandingPageActivity.this.od.Mxy(str);
                    }
                    if (!TextUtils.isEmpty(TTPlayableLandingPageActivity.this.dx)) {
                        TTPlayableLandingPageActivity.this.Pj.incrementAndGet();
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    WebResourceResponseModel pvs2 = com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(TTPlayableLandingPageActivity.this.OhP, TTPlayableLandingPageActivity.this.dx, str);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (TTPlayableLandingPageActivity.this.SE != null) {
                        so.pvs pvs3 = com.bytedance.sdk.component.adexpress.Jd.so.pvs(str);
                        int i = (pvs2 == null || pvs2.getWebResourceResponse() == null) ? 2 : 1;
                        if (pvs3 == so.pvs.HTML) {
                            TTPlayableLandingPageActivity.this.SE.pvs(str, currentTimeMillis, currentTimeMillis2, i);
                        } else if (pvs3 == so.pvs.JS) {
                            TTPlayableLandingPageActivity.this.SE.icD(str, currentTimeMillis, currentTimeMillis2, i);
                        }
                    }
                    if (pvs2 != null && pvs2.getWebResourceResponse() != null) {
                        TTPlayableLandingPageActivity.this.cRf.incrementAndGet();
                        if (TTPlayableLandingPageActivity.this.od != null) {
                            TTPlayableLandingPageActivity.this.od.Wyp(str);
                        }
                        return pvs2.getWebResourceResponse();
                    }
                    if (pvs2 != null && pvs2.getMsg() == 2) {
                        TTPlayableLandingPageActivity.this.sP.incrementAndGet();
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Exception unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }
        });
        pvs(this.NB);
        vA.pvs(this.NB, this.ny);
        com.bytedance.sdk.openadsdk.kj.so soVar = this.od;
        if (soVar != null) {
            soVar.yiw(this.ny);
        }
        this.NB.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.Jd(this.uc, this.yWX) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.13
            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.Jd, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                try {
                    TTPlayableLandingPageActivity.this.Jd.pvs(i);
                } catch (Throwable unused) {
                }
                if (TTPlayableLandingPageActivity.this.bNS != null) {
                    if (i == 100) {
                        TTPlayableLandingPageActivity.this.so = true;
                        TTPlayableLandingPageActivity.this.bNS.setVisibility(8);
                        TTPlayableLandingPageActivity.this.Wyp();
                        return;
                    }
                    TTPlayableLandingPageActivity.this.bNS.setProgress(i);
                }
            }
        });
        this.NB.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.14
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (TTPlayableLandingPageActivity.this.yWX == null) {
                    return false;
                }
                TTPlayableLandingPageActivity.this.yWX.pvs(motionEvent);
                return false;
            }
        });
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            cR cRVar = this.dX;
            bundle.putString("material_meta", cRVar != null ? cRVar.wjr().toString() : null);
            bundle.putInt("sdk_version", this.IP);
            bundle.putString("adid", this.cR);
            bundle.putString("log_extra", this.zM);
            bundle.putInt(FirebaseAnalytics.Param.SOURCE, this.OT);
            bundle.putBoolean("ad_pending_download", this.Gp);
            bundle.putString(ImagesContract.URL, this.ny);
            bundle.putString("web_title", this.ZhG);
            bundle.putString("event_tag", "embeded_ad");
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    private void Mxy() {
        RelativeLayout relativeLayout = this.Wyp;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.SE != null) {
                        TTPlayableLandingPageActivity.this.SE.so();
                    }
                    TTPlayableLandingPageActivity.this.CvL.sendMessage(TTPlayableLandingPageActivity.this.pvs(4, 0));
                    TTPlayableLandingPageActivity.this.pvs("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        ShadowTextView shadowTextView = this.qh;
        if (shadowTextView != null) {
            shadowTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.icD();
                }
            });
        }
        ShadowImageView shadowImageView = this.kj;
        if (shadowImageView != null) {
            shadowImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.jhZ = !r2.jhZ;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.vG(tTPlayableLandingPageActivity.jhZ);
                    if (TTPlayableLandingPageActivity.this.od != null) {
                        TTPlayableLandingPageActivity.this.od.pvs(TTPlayableLandingPageActivity.this.jhZ);
                    }
                }
            });
        }
        this.NB.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        Pj.pvs((View) this.NB, 4);
        this.mnm.icD();
    }

    protected void pvs() {
        if (this.mnm == null) {
            return;
        }
        cR cRVar = this.dX;
        if (cRVar != null && !rCZ.yiw(cRVar)) {
            this.mnm.pvs();
            return;
        }
        this.mnm.icD();
        if (this.mnm.getPlayView() != null) {
            com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.icD.pvs(this, this.dX, "embeded_ad", this.OT) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.icD.pvs, com.bytedance.sdk.openadsdk.core.icD.icD, com.bytedance.sdk.openadsdk.core.icD.vG
                public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
                    if (this.sUS == null || this.sUS.zM() != 1 || z) {
                        super.pvs(view, f, f2, f3, f4, sparseArray, z);
                        TTPlayableLandingPageActivity.this.Gp = true;
                        TTPlayableLandingPageActivity.this.ae = true;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.ny);
                        } catch (JSONException e) {
                            Ju.pvs("TTPWPActivity", "onClick JSON ERROR", e);
                        }
                        com.bytedance.sdk.openadsdk.icD.vG.icD(TTPlayableLandingPageActivity.this.dX, this.yiw, "click_playable_download_button_loading", jSONObject);
                    }
                }
            };
            pvsVar.pvs(this.gA);
            this.mnm.getPlayView().setOnClickListener(pvsVar);
        }
        if (rCZ.Mxy(this.dX)) {
            this.CvL.sendMessageDelayed(pvs(2, rCZ.pvs(2)), rCZ.IP(this.dX));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wyp() {
        if (this.jlb.getAndSet(true)) {
            return;
        }
        if (rCZ.mnm(this.dX) && (!this.so || !this.sUS)) {
            if (this.vA == null || this.mnm == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.icD.pvs(this, this.dX, "embeded_ad", this.OT);
            pvsVar.pvs(this.gA);
            this.vA.pvs(this.dX, "embeded_ad", pvsVar);
            Pj.pvs((View) this.vA, 0);
            Pj.pvs((View) this.mnm, 8);
            Pj.pvs((View) this.kj, 8);
            return;
        }
        SSWebView sSWebView = this.NB;
        if (sSWebView == null || this.mnm == null) {
            return;
        }
        Pj.pvs((View) sSWebView, 0);
        Pj.pvs((View) this.mnm, 8);
    }

    private void pvs(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.pvs.vG.pvs(this.Ju).pvs(false).icD(false).pvs(sSWebView.getWebView());
        sSWebView.setUserAgentString(bNS.pvs(sSWebView.getWebView(), this.IP));
        sSWebView.setMixedContentMode(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(String str) {
        com.bytedance.sdk.openadsdk.icD.vG.pvs(System.currentTimeMillis(), this.dX, "embeded_ad", str);
    }

    private void qh() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.dX);
        this.SE = new com.bytedance.sdk.openadsdk.icD.vA(3, "embeded_ad", this.dX);
        this.uc = new CvL(this);
        this.uc.icD(this.NB).pvs(this.dX).pvs(arrayList).vG(this.cR).Jd(this.zM).icD("embeded_ad").icD(this.OT).pvs(this).pvs(this.SE).pvs(this.Jd).pvs(this.NB).NB(this.dX.Sn());
        NB();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.SE;
        if (nb != null) {
            nb.Wyp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        CvL cvL = this.uc;
        if (cvL != null) {
            cvL.Wyp();
            SSWebView sSWebView = this.NB;
            if (sSWebView != null) {
                this.uc.icD(sSWebView.getVisibility() == 0);
            }
        }
        CvL cvL2 = this.rCZ;
        if (cvL2 != null) {
            cvL2.Wyp();
        }
        com.bytedance.sdk.openadsdk.kj.so soVar = this.od;
        if (soVar != null) {
            soVar.icD(true);
        }
        qh qhVar = this.yWX;
        if (qhVar != null) {
            qhVar.yiw();
        }
        DeviceUtils.AudioInfoReceiver.pvs((com.bytedance.sdk.openadsdk.Mxy.yiw) this);
        if (DeviceUtils.yiw() == 0) {
            this.jhZ = true;
        }
        vG(this.jhZ);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        CvL cvL = this.uc;
        if (cvL != null) {
            cvL.icD(false);
        }
        com.bytedance.sdk.openadsdk.kj.so soVar = this.od;
        if (soVar != null) {
            soVar.pvs(true);
            this.od.icD(false);
        }
        DeviceUtils.AudioInfoReceiver.icD((com.bytedance.sdk.openadsdk.Mxy.yiw) this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.SE;
        if (nb != null) {
            nb.Mxy();
        }
        qh qhVar = this.yWX;
        if (qhVar != null) {
            qhVar.so();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.SE;
        if (nb != null) {
            nb.so();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.SE;
        if (nb != null) {
            nb.pvs(true);
            this.SE.kj();
        }
        this.CvL.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.dx)) {
            vG.pvs.pvs(this.cRf.get(), this.Pj.get(), this.dX);
        }
        com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(this.OhP);
        SSWebView sSWebView = this.NB;
        if (sSWebView != null) {
            gA.pvs(sSWebView.getWebView());
            this.NB.kj();
        }
        this.NB = null;
        CvL cvL = this.uc;
        if (cvL != null) {
            cvL.qh();
        }
        CvL cvL2 = this.rCZ;
        if (cvL2 != null) {
            cvL2.qh();
        }
        com.bytedance.sdk.openadsdk.kj.so soVar = this.od;
        if (soVar != null) {
            soVar.cRf();
        }
        qh qhVar = this.yWX;
        if (qhVar != null) {
            qhVar.vG(true);
        }
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        int i = message.what;
        if (i == 1) {
            Pj.pvs((View) this.Wyp, 0);
            return;
        }
        if (i != 2) {
            return;
        }
        PlayableLoadingView playableLoadingView = this.mnm;
        if (playableLoadingView == null || !playableLoadingView.vG()) {
            int i2 = message.arg1;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                if (message.arg2 != 0) {
                    jSONObject.put("remove_loading_page_reason", message.arg2);
                }
                jSONObject.put("playable_url", this.ny);
                PlayableLoadingView playableLoadingView2 = this.mnm;
                jSONObject.put(TypedValues.TransitionType.S_DURATION, playableLoadingView2 != null ? playableLoadingView2.getDisplayDuration() : 0L);
            } catch (JSONException e) {
                Ju.pvs("TTPWPActivity", "handleMsg json error", e);
            }
            com.bytedance.sdk.openadsdk.icD.vG.icD(this.dX, "embeded_ad", "remove_loading_page", jSONObject);
            this.CvL.removeMessages(2);
            PlayableLoadingView playableLoadingView3 = this.mnm;
            if (playableLoadingView3 != null) {
                playableLoadingView3.pvs();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.icD.Jd
    public void icD(boolean z) {
        com.com.bytedance.overseas.sdk.pvs.vG vGVar;
        this.Gp = true;
        this.ae = z;
        if (!z) {
            try {
                Toast.makeText(this.Ju, uc.pvs(mnm.pvs(), "tt_toast_later_download"), 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.ae || (vGVar = this.gA) == null) {
            return;
        }
        vGVar.Jd();
    }

    protected void icD() {
        if (this.dX == null || isFinishing()) {
            return;
        }
        if (this.vG.get()) {
            kj();
            return;
        }
        if (this.pvs == null) {
            vG();
        }
        this.pvs.pvs(new ny.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.ny.pvs
            public void pvs() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.ny.pvs
            public void pvs(int i, String str) {
                if (TTPlayableLandingPageActivity.this.vG.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.vG.set(true);
                TTPlayableLandingPageActivity.this.Ju();
            }
        });
        ny nyVar = this.pvs;
        if (nyVar != null) {
            nyVar.pvs();
        }
    }

    void vG() {
        if (this.dX != null) {
            this.pvs = new com.bytedance.sdk.openadsdk.dislike.icD(this, this.dX.HWd(), this.dX.Ayu(), this.dX.wjr().toString(), "playable");
        }
        if (this.icD == null) {
            this.icD = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(this.icD);
        }
    }

    private void kj() {
        TTAdDislikeToast tTAdDislikeToast = this.icD;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.pvs(TTAdDislikeToast.getDislikeTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ju() {
        TTAdDislikeToast tTAdDislikeToast = this.icD;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.pvs(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    protected void vG(boolean z) {
        Drawable pvs;
        try {
            this.jhZ = z;
            if (z) {
                pvs = com.bytedance.sdk.openadsdk.utils.so.pvs(this.Ju, "tt_mute_wrapper");
            } else {
                pvs = com.bytedance.sdk.openadsdk.utils.so.pvs(this.Ju, "tt_unmute_wrapper");
            }
            this.kj.setImageDrawable(pvs);
            com.bytedance.sdk.openadsdk.kj.so soVar = this.od;
            if (soVar != null) {
                soVar.pvs(z);
            }
        } catch (Exception e) {
            Ju.pvs("TTPWPActivity", e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.Mxy.yiw
    public void pvs(int i) {
        vG(i <= 0);
    }
}
