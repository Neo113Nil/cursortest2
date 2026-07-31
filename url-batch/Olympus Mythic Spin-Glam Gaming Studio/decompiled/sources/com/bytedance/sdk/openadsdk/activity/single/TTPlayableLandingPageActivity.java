package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.oub;
import com.bytedance.sdk.openadsdk.core.widget.iv;
import com.bytedance.sdk.openadsdk.core.yj;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.doe.nps;
import com.bytedance.sdk.openadsdk.fb.mw;
import com.bytedance.sdk.openadsdk.fb.zn;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.yandex.div.internal.widget.DivLayoutParams;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class TTPlayableLandingPageActivity extends TTBaseLandingPageActivity implements kjb.zmn, com.bytedance.sdk.openadsdk.core.cn.fb.fs, com.bytedance.sdk.openadsdk.core.zn.fb {
    private static final nps.zmn vlj = new nps.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.1
    };
    private String am;
    private boolean bjh;
    private String cn;
    private com.bytedance.sdk.openadsdk.doe.zmn.zmn cud;
    private String cyb;
    private boolean dgt;
    TTAdDislikeToast fs;
    private com.bytedance.sdk.openadsdk.doe.zg hgd;
    private com.bytedance.sdk.component.bvs.nps hhw;
    private String iqz;
    private com.bytedance.sdk.openadsdk.core.hhw.fb iv;
    private mw jy;
    private fkt kgc;
    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn kjb;
    private com.bytedance.sdk.openadsdk.core.hhw.fb klz;
    private int kw;
    private Context mw;
    private nqi nqi;
    private ILoader nu;
    private fkt olo;
    private com.bytedance.sdk.openadsdk.fb.fb.btk oub;
    private String phc;
    private com.bytedance.sdk.openadsdk.core.hhw.fb rc;
    private boolean rp;
    private iv rt;
    yj zmn;
    private boolean nps = true;
    private boolean zg = false;
    private boolean bvs = true;
    final AtomicBoolean zn = new AtomicBoolean(false);
    private final String doe = "embeded_ad";
    private final kjb uqh = new kjb(Looper.getMainLooper(), this);
    private final AtomicBoolean zak = new AtomicBoolean(false);
    private final AtomicInteger yj = new AtomicInteger(0);
    private final AtomicInteger so = new AtomicInteger(0);
    private final AtomicInteger ev = new AtomicInteger(0);
    private boolean ww = false;
    int fb = -1;
    protected com.bytedance.sdk.openadsdk.mw.btk btk = new com.bytedance.sdk.openadsdk.mw.btk() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.8
        @Override // com.bytedance.sdk.openadsdk.mw.btk
        public void zmn() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && am.mw(TTPlayableLandingPageActivity.this.nqi) && am.rt(TTPlayableLandingPageActivity.this.nqi)) {
                TTPlayableLandingPageActivity.this.uqh.removeMessages(2);
                TTPlayableLandingPageActivity.this.uqh.sendMessage(TTPlayableLandingPageActivity.this.zmn(1, 0));
            }
        }
    };
    private int yof = 1;

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void btk() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void cn() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public View cyb() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fb(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean fb() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fkt() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fs(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fs(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void iv() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void klz() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void lt() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void olo() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void rc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public List<nqi> tet() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void tf() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void yj() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void yo() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public boolean zmn(long j, boolean z) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message zmn(int i, int i2) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.arg1 = i;
        if (i == 3) {
            obtain.arg2 = i2;
        }
        return obtain;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!cn.btk()) {
            finish();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            kgc.fs(this);
            zn();
        } catch (Throwable unused) {
        }
        fs(bundle);
        nqi nqiVar = this.nqi;
        if (nqiVar == null) {
            return;
        }
        this.dgt = nqiVar.vp();
        int cn = am.cn(this.nqi);
        if (cn == 0) {
            setRequestedOrientation(14);
        } else if (cn == 1) {
            setRequestedOrientation(1);
        } else if (cn == 2) {
            setRequestedOrientation(0);
            this.yof = 2;
        }
        this.mw = this;
        try {
            setContentView(hhw());
            bvs();
            nps();
            phc();
            this.cud.zmn(this);
            this.cud.zmn(false, (com.bytedance.sdk.openadsdk.mw.nps) null);
            zg();
            zn.zmn.zmn(SystemClock.elapsedRealtime() - elapsedRealtime, this.nqi, "embeded_ad", this.nu, this.am);
            com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.cud;
            if (zmnVar != null) {
                zmnVar.zmn();
            }
        } catch (Throwable unused2) {
            finish();
        }
    }

    private View hhw() {
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(this);
        znVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.cud = new com.bytedance.sdk.openadsdk.doe.zmn.zmn(this.mw, this.nqi, this.yof, this.ww, znVar, true);
        int fs = jy.fs(this, 5.0f);
        this.klz = new com.bytedance.sdk.openadsdk.core.hhw.fb(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(jy.fs(this, 28.0f), jy.fs(this, 28.0f));
        layoutParams.rightMargin = jy.fs(this, 56.0f);
        layoutParams.topMargin = jy.fs(this, 20.0f);
        layoutParams.gravity = 8388661;
        this.klz.setLayoutParams(layoutParams);
        this.klz.setPadding(fs, fs, fs, fs);
        this.klz.setBackground(com.bytedance.sdk.openadsdk.core.widget.fb.zmn());
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = this.klz;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        fbVar.setScaleType(scaleType);
        this.klz.setImageDrawable(rc.zmn(this, "tt_unmute_wrapper"));
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar2 = new com.bytedance.sdk.openadsdk.core.hhw.fb(this);
        this.rc = fbVar2;
        fbVar2.setPadding(fs, fs, fs, fs);
        this.rc.setScaleType(scaleType);
        this.rc.setBackground(com.bytedance.sdk.openadsdk.core.widget.fb.zmn());
        this.rc.setImageResource(doe.fb(kgc.zmn(), "tt_reward_full_feedback"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(jy.fs(this, 28.0f), jy.fs(this, 28.0f));
        layoutParams2.gravity = 8388661;
        layoutParams2.rightMargin = jy.fs(this, 16.0f);
        layoutParams2.topMargin = jy.fs(this, 20.0f);
        this.rc.setLayoutParams(layoutParams2);
        this.iv = new com.bytedance.sdk.openadsdk.core.hhw.fb(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(jy.fs(this, 28.0f), jy.fs(this, 28.0f));
        layoutParams3.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        layoutParams3.topMargin = jy.fs(this, 20.0f);
        layoutParams3.leftMargin = jy.fs(this, 16.0f);
        this.iv.setLayoutParams(layoutParams3);
        this.iv.setPadding(fs, fs, fs, fs);
        this.iv.setScaleType(ImageView.ScaleType.FIT_XY);
        this.iv.setBackground(com.bytedance.sdk.openadsdk.core.widget.fb.zmn());
        this.iv.setImageDrawable(doe.zn(this, "tt_white_lefterbackicon_titlebar"));
        this.iv.setVisibility(0);
        znVar.addView(this.klz);
        znVar.addView(this.rc);
        znVar.addView(this.iv);
        return znVar;
    }

    private void nps() {
        if (this.nqi.va() == 4) {
            this.kjb = com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this.mw, "interaction");
        }
    }

    private void zg() {
        int i = kgc.fb().kjb(String.valueOf(this.nqi.qvo())).olo;
        if (i >= 0) {
            this.uqh.sendEmptyMessageDelayed(1, i * 1000);
        } else {
            jy.zmn((View) this.iv, 0);
        }
    }

    private void fs(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            nqi zmn = com.bytedance.sdk.openadsdk.core.am.zmn().zmn(com.bytedance.sdk.openadsdk.core.am.zmn(intent));
            this.nqi = zmn;
            if (zmn != null) {
                this.iqz = zmn.rc();
                this.kw = this.nqi.mw();
                this.bjh = this.nqi.cn();
                this.cn = this.nqi.ji();
                this.cyb = this.nqi.ze();
                this.am = this.nqi.ltf();
                this.phc = this.nqi.db();
            }
        }
        if (bundle != null) {
            try {
                nqi zmn2 = com.bytedance.sdk.openadsdk.core.am.zmn().zmn(bundle.getInt("meta_index", -1));
                this.nqi = zmn2;
                if (zmn2 != null) {
                    this.cn = zmn2.ji();
                    this.cyb = this.nqi.ze();
                    this.am = this.nqi.ltf();
                    this.phc = this.nqi.db();
                    this.iqz = this.nqi.rc();
                    this.kw = this.nqi.mw();
                    this.bjh = this.nqi.cn();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.nqi == null) {
            finish();
            return;
        }
        try {
            this.ww = kgc.fb().kgc(this.nqi.utx().getCodeId());
        } catch (Throwable th) {
            iqz.zn("TTPWPActivity", th.getMessage());
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int zmn = this.nqi != null ? com.bytedance.sdk.openadsdk.core.am.zmn().zmn(this.nqi) : -1;
            this.fb = zmn;
            bundle.putInt("meta_index", zmn);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    private void bvs() {
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = this.iv;
        if (fbVar != null) {
            fbVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTPlayableLandingPageActivity$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTPlayableLandingPageActivity$2_onClick_1f1f926d6065ca9bc341c3b0e23946d4(view);
                }

                public void safedk_TTPlayableLandingPageActivity$2_onClick_1f1f926d6065ca9bc341c3b0e23946d4(View p0) {
                    if (TTPlayableLandingPageActivity.this.oub != null) {
                        TTPlayableLandingPageActivity.this.oub.nps();
                    }
                    TTPlayableLandingPageActivity.this.uqh.sendMessage(TTPlayableLandingPageActivity.this.zmn(4, 0));
                    TTPlayableLandingPageActivity.this.zmn("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar2 = this.rc;
        if (fbVar2 != null) {
            fbVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTPlayableLandingPageActivity$3;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTPlayableLandingPageActivity$3_onClick_5b798e1a9117c5c4e8f7b9b06828b558(view);
                }

                public void safedk_TTPlayableLandingPageActivity$3_onClick_5b798e1a9117c5c4e8f7b9b06828b558(View p0) {
                    TTPlayableLandingPageActivity.this.zmn();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar3 = this.klz;
        if (fbVar3 != null) {
            fbVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTPlayableLandingPageActivity$4;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTPlayableLandingPageActivity$4_onClick_b89ed39f8fc229852c66b822d4bbb2db(view);
                }

                public void safedk_TTPlayableLandingPageActivity$4_onClick_b89ed39f8fc229852c66b822d4bbb2db(View p0) {
                    TTPlayableLandingPageActivity.this.ww = !r2.ww;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.hhw(tTPlayableLandingPageActivity.ww);
                    if (TTPlayableLandingPageActivity.this.hgd != null) {
                        TTPlayableLandingPageActivity.this.hgd.zmn(TTPlayableLandingPageActivity.this.ww);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(String str) {
        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), this.nqi, "embeded_ad", str);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.fb >= 0) {
            com.bytedance.sdk.openadsdk.core.am.zmn().zn(this.fb);
            this.fb = -1;
        }
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.oub;
        if (btkVar != null) {
            btkVar.bvs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        fkt fktVar = this.olo;
        if (fktVar != null) {
            fktVar.rc();
            com.bytedance.sdk.component.bvs.nps npsVar = this.hhw;
            if (npsVar != null) {
                this.olo.fs(npsVar.getVisibility() == 0);
            }
        }
        fkt fktVar2 = this.kgc;
        if (fktVar2 != null) {
            fktVar2.rc();
        }
        com.bytedance.sdk.openadsdk.doe.zg zgVar = this.hgd;
        if (zgVar != null) {
            zgVar.zn(true);
        }
        mw mwVar = this.jy;
        if (mwVar != null) {
            mwVar.nps();
        }
        if (DeviceUtils.nps() == 0) {
            this.ww = true;
        }
        hhw(this.ww);
        com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.cud;
        if (zmnVar != null) {
            zmnVar.fs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        fkt fktVar = this.olo;
        if (fktVar != null) {
            fktVar.fs(false);
        }
        com.bytedance.sdk.openadsdk.doe.zg zgVar = this.hgd;
        if (zgVar != null) {
            zgVar.zmn(true);
            this.hgd.zn(false);
        }
        com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.cud;
        if (zmnVar != null) {
            zmnVar.zn();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.oub;
        if (btkVar != null) {
            btkVar.zg();
        }
        mw mwVar = this.jy;
        if (mwVar != null) {
            mwVar.zg();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        mw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void rt() {
        mw();
    }

    private void mw() {
        super.onBackPressed();
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.oub;
        if (btkVar != null) {
            btkVar.nps();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.core.am.zmn().zn(this.nqi);
        com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.cud;
        if (zmnVar != null) {
            zmnVar.fb();
        }
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.oub;
        if (btkVar != null) {
            btkVar.zmn(true);
            this.oub.rc();
        }
        this.uqh.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.am)) {
            zn.zmn.zmn(this.so.get(), this.yj.get(), this.nqi);
        }
        com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(this.nu);
        com.bytedance.sdk.component.bvs.nps npsVar = this.hhw;
        if (npsVar != null) {
            oub.zmn(npsVar.getWebView());
            this.hhw.cn();
        }
        this.hhw = null;
        fkt fktVar = this.olo;
        if (fktVar != null) {
            fktVar.klz();
        }
        fkt fktVar2 = this.kgc;
        if (fktVar2 != null) {
            fktVar2.klz();
        }
        com.bytedance.sdk.openadsdk.doe.zg zgVar = this.hgd;
        if (zgVar != null) {
            zgVar.hgd();
        }
        mw mwVar = this.jy;
        if (mwVar != null) {
            mwVar.fb(true);
        }
        yj yjVar = this.zmn;
        if (yjVar != null) {
            yjVar.fs();
        }
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        int i = message.what;
        if (i == 1) {
            jy.zmn((View) this.iv, 0);
            return;
        }
        if (i != 2) {
            return;
        }
        iv ivVar = this.rt;
        if (ivVar == null || !ivVar.fb()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i2 = message.arg2;
                if (i2 != 0) {
                    jSONObject.put("remove_loading_page_reason", i2);
                }
                jSONObject.put("playable_url", this.iqz);
                iv ivVar2 = this.rt;
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, ivVar2 != null ? ivVar2.getDisplayDuration() : 0L);
            } catch (JSONException e) {
                iqz.zmn("TTPWPActivity", "handleMsg json error", e);
            }
            com.bytedance.sdk.openadsdk.fb.zn.fs(this.nqi, "embeded_ad", "remove_loading_page", jSONObject);
            this.uqh.removeMessages(2);
            iv ivVar3 = this.rt;
            if (ivVar3 != null) {
                ivVar3.zn();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zn.fb
    public void btk(boolean z) {
        com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn znVar;
        this.bjh = true;
        this.rp = z;
        if (!z) {
            try {
                if (!com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_iab_cookie", true)) {
                    Toast.makeText(this.mw, "Download later", 0).show();
                } else {
                    TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
                    ((FrameLayout) findViewById(R.id.content)).addView(tTAdDislikeToast);
                    tTAdDislikeToast.show("Download later");
                }
            } catch (Throwable unused) {
            }
        }
        if (!this.rp || (znVar = this.kjb) == null) {
            return;
        }
        znVar.zmn(this.nqi);
    }

    protected void zmn() {
        if (this.nqi == null || isFinishing()) {
            return;
        }
        if (this.zn.get()) {
            kw();
            return;
        }
        if (this.zmn == null) {
            fs();
        }
        this.zmn.zmn(new yj.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.yj.zmn
            public void zmn() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.yj.zmn
            public void zmn(int i, String str) {
                if (TTPlayableLandingPageActivity.this.zn.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.zn.set(true);
                TTPlayableLandingPageActivity.this.iqz();
            }
        });
        yj yjVar = this.zmn;
        if (yjVar != null) {
            yjVar.zmn();
        }
    }

    void fs() {
        nqi nqiVar = this.nqi;
        if (nqiVar != null) {
            this.zmn = new com.bytedance.sdk.openadsdk.zn.zn(this, nqiVar.ze(), this.nqi.pa(), this.nqi);
        }
        if (this.fs == null) {
            this.fs = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(this.fs);
        }
    }

    private void kw() {
        TTAdDislikeToast tTAdDislikeToast = this.fs;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iqz() {
        TTAdDislikeToast tTAdDislikeToast = this.fs;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    protected void hhw(boolean z) {
        Drawable zmn;
        try {
            this.ww = z;
            if (z) {
                zmn = rc.zmn(this.mw, "tt_mute_wrapper");
            } else {
                zmn = rc.zmn(this.mw, "tt_unmute_wrapper");
            }
            this.klz.setImageDrawable(zmn);
            com.bytedance.sdk.openadsdk.doe.zg zgVar = this.hgd;
            if (zgVar != null) {
                zgVar.zmn(z);
            }
            com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.cud;
            if (zmnVar != null) {
                zmnVar.zmn(z);
            }
        } catch (Exception e) {
            iqz.zn("TTPWPActivity", e.getMessage());
        }
    }

    private void phc() {
        com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.zn.zmn(this, this.nqi, "embeded_ad", this.kw) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.zn.zmn, com.bytedance.sdk.openadsdk.core.zn.fs, com.bytedance.sdk.openadsdk.core.zn.zn
            public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
                nqi nqiVar = ((com.bytedance.sdk.openadsdk.core.zn.fs) this).hhw;
                if (nqiVar == null || nqiVar.hwg() != 1 || z) {
                    super.zmn(view, f, f2, f3, f4, sparseArray, z);
                    TTPlayableLandingPageActivity.this.doe();
                    TTPlayableLandingPageActivity.this.bjh = true;
                    TTPlayableLandingPageActivity.this.rp = true;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.iqz);
                    } catch (JSONException e) {
                        iqz.zmn("TTPWPActivity", "onClick JSON ERROR", e);
                    }
                    com.bytedance.sdk.openadsdk.fb.zn.fs(TTPlayableLandingPageActivity.this.nqi, ((com.bytedance.sdk.openadsdk.core.zn.fs) this).nps, "click_playable_download_button_loading", jSONObject);
                }
            }
        };
        zmnVar.zmn(this.kjb);
        com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar2 = this.cud;
        if (zmnVar2 != null) {
            zmnVar2.zmn(zmnVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doe() {
        com.bytedance.sdk.openadsdk.core.am.zmn().fs(this.nqi);
    }

    public void zn() {
        jy.zmn((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (TTPlayableLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        TTPlayableLandingPageActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                jy.zmn((Activity) TTPlayableLandingPageActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        iqz.zn("TTPWPActivity", e.getMessage());
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void xrr() {
        doe();
    }
}
