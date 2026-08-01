package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.OT;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.rCZ;
import com.bytedance.sdk.openadsdk.icD.yiw;
import com.bytedance.sdk.openadsdk.mnm.pvs.NB;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.gA;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements dyT.pvs {
    private static com.bytedance.sdk.openadsdk.apiImpl.vG.icD so;
    private FrameLayout CvL;
    private boolean Gp;
    private IListenerManager OT;
    private com.bytedance.sdk.openadsdk.component.sUS.icD Wyp;
    private com.bytedance.sdk.openadsdk.component.vG ae;
    private yiw bNS;
    private boolean cR;
    private int dX;
    private int dyT;
    private AdSlot gA;
    private TTAdDislikeToast kj;
    private float mnm;
    private com.bytedance.sdk.openadsdk.apiImpl.vG.icD ny;
    private TTAdDislikeDialog qh;
    private cR rCZ;
    private String uc;
    private float vA;
    private int zM;
    protected final AtomicBoolean pvs = new AtomicBoolean(false);
    protected final dyT icD = new dyT(Looper.getMainLooper(), this);
    final AtomicBoolean vG = new AtomicBoolean(false);
    final AtomicBoolean Jd = new AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.component.so.pvs Mxy = new com.bytedance.sdk.openadsdk.component.so.pvs();
    protected boolean NB = false;
    private final AtomicBoolean Ju = new AtomicBoolean(false);
    private gA IP = gA.icD();
    private final AtomicBoolean ZhG = new AtomicBoolean(false);
    long sUS = 0;
    private final com.bytedance.sdk.openadsdk.component.pvs jlb = new com.bytedance.sdk.openadsdk.component.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.pvs, com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
        public void icD(long j, int i) {
            Object[] objArr = new Object[2];
            String str = "onError() called with: totalPlayTime = [" + j + "], percent = [" + i + "]";
            TTAppOpenAdActivity.this.zM();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.pvs, com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
        public void pvs() {
            Object[] objArr = new Object[2];
            TTAppOpenAdActivity.this.zM();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.pvs, com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
        public void pvs(long j, long j2) {
            TTAppOpenAdActivity.this.Mxy.pvs(j);
            if (!TTAppOpenAdActivity.this.NB && TTAppOpenAdActivity.this.ae != null && TTAppOpenAdActivity.this.ae.NB() != null && TTAppOpenAdActivity.this.ae.NB().icD()) {
                TTAppOpenAdActivity.this.ae.NB().Jd();
            }
            TTAppOpenAdActivity.this.kj();
        }

        @Override // com.bytedance.sdk.openadsdk.component.pvs, com.bytedance.sdk.openadsdk.component.sUS.pvs
        public void pvs(View view) {
            TTAppOpenAdActivity.this.uc();
        }

        @Override // com.bytedance.sdk.openadsdk.component.pvs, com.bytedance.sdk.openadsdk.component.sUS.pvs
        public void icD(View view) {
            TTAppOpenAdActivity.this.pvs();
        }

        @Override // com.bytedance.sdk.openadsdk.component.pvs, com.bytedance.sdk.openadsdk.component.sUS.pvs
        public void icD() {
            Object[] objArr = new Object[2];
            if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                TTAppOpenAdActivity.this.pvs("onAdTimeOver");
            } else if (TTAppOpenAdActivity.this.ny != null) {
                TTAppOpenAdActivity.this.ny.vG();
            }
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.pvs, com.bytedance.sdk.openadsdk.component.sUS.pvs
        public void pvs(int i, int i2, boolean z) {
            if (TTAppOpenAdActivity.this.ae != null) {
                TTAppOpenAdActivity.this.ae.pvs(i, i2, z);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.pvs
        public void vG() {
            TTAppOpenAdActivity.this.sUS();
            TTAppOpenAdActivity.this.IP.Jd();
            TTAppOpenAdActivity.this.mnm();
            if (TTAppOpenAdActivity.this.cR) {
                TTAppOpenAdActivity.this.qh();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.pvs
        public void Jd() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.pvs
        public void NB() {
            TTAppOpenAdActivity.this.cR();
        }

        @Override // com.bytedance.sdk.openadsdk.component.pvs
        public void pvs(int i) {
            TTAppOpenAdActivity.this.rCZ.ZhG(i);
            TTAppOpenAdActivity.this.yiw();
        }
    };
    private final Runnable dx = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.4
        @Override // java.lang.Runnable
        public void run() {
            if (TTAppOpenAdActivity.this.Ju.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.rCZ != null && TTAppOpenAdActivity.this.rCZ.SJ() && TTAppOpenAdActivity.this.rCZ.ig() != null && TTAppOpenAdActivity.this.rCZ.ig().pvs() != null) {
                TTAppOpenAdActivity.this.rCZ.ig().pvs().pvs(0L);
            }
            TTAppOpenAdActivity.this.bNS = new yiw();
            TTAppOpenAdActivity.this.bNS.pvs(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.IP.Jd();
            if (TTAppOpenAdActivity.this.Wyp != null) {
                TTAppOpenAdActivity.this.Wyp.icD();
            }
            TTAppOpenAdActivity.this.vA();
            View findViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (findViewById != null) {
                try {
                    jSONObject.put("width", findViewById.getWidth());
                    jSONObject.put("height", findViewById.getHeight());
                    jSONObject.put("alpha", findViewById.getAlpha());
                } catch (JSONException e) {
                    Log.e("TTAppOpenAdActivity", "run: ", e);
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.dyT);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.cR ? "video_normal_ad" : "image_normal_ad");
            if (com.bytedance.sdk.openadsdk.component.view.pvs.vG() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.Gp || TTAppOpenAdActivity.this.rCZ.Mnp()) {
                jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.bNS());
                TTAppOpenAdActivity.this.pvs(jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.rCZ.OUT() ? 1 : 0);
            com.bytedance.sdk.openadsdk.icD.vG.pvs(TTAppOpenAdActivity.this.rCZ, "open_ad", jSONObject2);
            com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.rCZ, new NB.pvs(TTAppOpenAdActivity.this.bNS()));
            TTAppOpenAdActivity.this.Ju.set(true);
        }
    };

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mnm.pvs(getApplicationContext());
        if (!icD(bundle)) {
            finish();
            return;
        }
        if (!Ju.NB()) {
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.icD.vG.vG(this.rCZ, "open_ad", (JSONObject) null);
        }
        this.cR = cR.NB(this.rCZ);
        Object[] objArr = new Object[2];
        String str = "onCreate: isVideo is " + this.cR;
        if (this.cR) {
            this.Mxy.pvs((float) this.rCZ.od().sUS());
        } else {
            this.Mxy.pvs(mnm.Jd().ny(String.valueOf(this.zM)));
        }
        com.bytedance.sdk.openadsdk.component.sUS.icD icd = new com.bytedance.sdk.openadsdk.component.sUS.icD(this.Mxy);
        this.Wyp = icd;
        icd.pvs(this.jlb);
        yiw();
        FrameLayout frameLayout = new FrameLayout(this);
        this.CvL = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            setContentView(this.CvL);
            this.CvL.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        int dyT = TTAppOpenAdActivity.this.rCZ.dyT();
                        TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                        tTAppOpenAdActivity.Gp = tTAppOpenAdActivity.rCZ != null && TTAppOpenAdActivity.this.rCZ.OT() == 2 && (dyT == 3 || dyT == 7);
                        if (TTAppOpenAdActivity.this.Gp) {
                            TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                            TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity2.ae = new com.bytedance.sdk.openadsdk.component.icD(tTAppOpenAdActivity3, tTAppOpenAdActivity3.rCZ, TTAppOpenAdActivity.this.CvL, TTAppOpenAdActivity.this.jlb, TTAppOpenAdActivity.this.dX, TTAppOpenAdActivity.this.cR, TTAppOpenAdActivity.this.Mxy);
                        } else {
                            TTAppOpenAdActivity tTAppOpenAdActivity4 = TTAppOpenAdActivity.this;
                            TTAppOpenAdActivity tTAppOpenAdActivity5 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity4.ae = new com.bytedance.sdk.openadsdk.component.vG(tTAppOpenAdActivity5, tTAppOpenAdActivity5.rCZ, TTAppOpenAdActivity.this.CvL, TTAppOpenAdActivity.this.jlb, TTAppOpenAdActivity.this.dX, TTAppOpenAdActivity.this.cR, TTAppOpenAdActivity.this.Mxy);
                            TTAppOpenAdActivity.this.ae.pvs(TTAppOpenAdActivity.this.vA, TTAppOpenAdActivity.this.mnm);
                        }
                        TTAppOpenAdActivity.this.ae.pvs((ViewGroup) TTAppOpenAdActivity.this.CvL);
                        TTAppOpenAdActivity.this.ae.pvs();
                        TTAppOpenAdActivity.this.ae.icD();
                    } catch (Throwable th) {
                        TTAppOpenAdActivity.this.finish();
                        com.bytedance.sdk.component.utils.Ju.pvs("TTAppOpenAdActivity", th.getMessage());
                    }
                }
            });
        } catch (Throwable unused) {
            com.bytedance.sdk.openadsdk.Wyp.vG.icD();
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sUS() {
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        this.Wyp.icD(mnm.Jd().OT(String.valueOf(this.zM)));
        this.Wyp.pvs(this.Mxy.pvs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yiw() {
        if (26 == Build.VERSION.SDK_INT) {
            if (getResources().getConfiguration().orientation == 1) {
                this.dX = 1;
            } else {
                this.dX = 2;
            }
        } else {
            this.dX = this.rCZ.rcB();
        }
        so();
    }

    private void so() {
        int min;
        int max;
        Object[] objArr = new Object[2];
        String str = "changeScreenOrientation: mOrientation=" + this.dX;
        if (Build.VERSION.SDK_INT != 26) {
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Mxy();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAppOpenAdActivity", th.getMessage());
                    return;
                }
            } else {
                Mxy();
            }
        }
        Pair<Integer, Integer> so2 = Pj.so(getApplicationContext());
        if (this.dX == 2) {
            min = Math.max(((Integer) so2.first).intValue(), ((Integer) so2.second).intValue());
            max = Math.min(((Integer) so2.first).intValue(), ((Integer) so2.second).intValue());
        } else {
            min = Math.min(((Integer) so2.first).intValue(), ((Integer) so2.second).intValue());
            max = Math.max(((Integer) so2.first).intValue(), ((Integer) so2.second).intValue());
        }
        this.mnm = max;
        this.vA = min;
        float pvs = Pj.pvs();
        if (Pj.vG((Activity) this)) {
            int i = this.dX;
            if (i == 1) {
                this.mnm -= pvs;
            } else if (i == 2) {
                this.vA -= pvs;
            }
        }
        com.bytedance.sdk.openadsdk.component.vG vGVar = this.ae;
        if (vGVar != null) {
            vGVar.pvs(this.vA, this.mnm);
        }
    }

    private void Mxy() {
        if (this.dX == 2) {
            if (NB()) {
                setRequestedOrientation(8);
            } else {
                setRequestedOrientation(0);
            }
        } else {
            setRequestedOrientation(1);
        }
        if (this.dX == 2 || !Pj.vG((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    protected void pvs() {
        if (isFinishing()) {
            return;
        }
        if (this.Jd.get()) {
            Ju();
            return;
        }
        if (this.qh == null) {
            try {
                Wyp();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th);
            }
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.qh;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.pvs();
        }
    }

    private void Wyp() {
        if (this.qh == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this, this.rCZ);
            this.qh = tTAdDislikeDialog;
            tTAdDislikeDialog.setDislikeSource("video_player");
            this.qh.setCallback(new TTAdDislikeDialog.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.3
                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                public void pvs(View view) {
                    TTAppOpenAdActivity.this.vG.set(true);
                    TTAppOpenAdActivity.this.vG();
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                public void icD(View view) {
                    TTAppOpenAdActivity.this.vG.set(false);
                    TTAppOpenAdActivity.this.icD();
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                public void pvs(int i, FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.Jd.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.Jd.set(true);
                    TTAppOpenAdActivity.this.IP();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.qh);
        if (this.kj == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.kj = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qh() {
        if (!this.cR || this.rCZ.OUT()) {
            return;
        }
        this.icD.sendEmptyMessageDelayed(100, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kj() {
        if (!this.cR || this.rCZ.OUT()) {
            return;
        }
        this.icD.removeMessages(100);
    }

    private void Ju() {
        this.kj.pvs(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IP() {
        this.kj.pvs(TTAdDislikeToast.getDislikeSendTip());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (mnm.Jd().rCZ(String.valueOf(this.zM)) == 1) {
            if (this.Mxy.icD() >= mnm.Jd().OT(String.valueOf(this.zM)) * 1000) {
                uc();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            if (!this.Gp) {
                this.IP.Jd();
            }
            cR cRVar = this.rCZ;
            if (cRVar != null && cRVar.fl() && !this.rCZ.wS()) {
                this.rCZ.yiw(true);
                cR cRVar2 = this.rCZ;
                com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar2, "open_ad", cRVar2.AMP());
            }
        } else if (this.Ju.get()) {
            if (this.IP.NB()) {
                com.bytedance.sdk.openadsdk.icD.vG.pvs(String.valueOf(this.IP.vG()), this.rCZ, "open_ad", this.bNS);
            }
            this.IP = gA.icD();
        }
        com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.rCZ, z ? 4 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        com.bytedance.sdk.openadsdk.component.vG vGVar;
        super.onResume();
        this.NB = true;
        if (this.pvs.getAndSet(true)) {
            if (this.ZhG.get()) {
                zM();
                if (this.cR && (vGVar = this.ae) != null && vGVar.NB() != null) {
                    this.ae.NB().pvs(3);
                }
                finish();
                return;
            }
            icD();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.NB = false;
        vG();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.icD.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.sUS.icD icd = this.Wyp;
        if (icd != null) {
            icd.NB();
        }
        com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.rCZ);
        if (this.cR) {
            com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(this.rCZ, this.Mxy.icD(), this.Mxy.pvs(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(this.rCZ, -1L, this.Mxy.pvs(), false);
        }
        if (this.IP.NB() && this.Ju.get()) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(String.valueOf(this.IP.vG()), this.rCZ, "open_ad", this.bNS);
            this.IP = gA.icD();
        }
        com.bytedance.sdk.openadsdk.component.vG vGVar = this.ae;
        if (vGVar != null) {
            vGVar.vG();
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("recycleRes");
        }
        so = null;
        this.ny = null;
        TTAdDislikeDialog tTAdDislikeDialog = this.qh;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.setCallback(null);
        }
        if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().dX(String.valueOf(this.zM)) == 1) {
            com.bytedance.sdk.openadsdk.component.sUS.pvs(mnm.pvs()).pvs(this.gA);
        }
    }

    void icD() {
        if (this.vG.get()) {
            return;
        }
        if (this.cR) {
            com.bytedance.sdk.openadsdk.component.vG vGVar = this.ae;
            if (vGVar != null && vGVar.NB() != null && this.ae.NB().vG()) {
                this.ae.NB().NB();
            }
            qh();
        }
        com.bytedance.sdk.openadsdk.component.sUS.icD icd = this.Wyp;
        if (icd != null) {
            icd.vG();
        }
    }

    void vG() {
        if (this.cR) {
            com.bytedance.sdk.openadsdk.component.vG vGVar = this.ae;
            if (vGVar != null && vGVar.NB() != null && this.ae.NB().icD()) {
                this.ae.NB().Jd();
            }
            kj();
        }
        com.bytedance.sdk.openadsdk.component.sUS.icD icd = this.Wyp;
        if (icd != null) {
            icd.Jd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int bNS() {
        if (this.rCZ.Mnp()) {
            return 5;
        }
        if (this.Gp) {
            return this.ae.Jd();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject pvs(JSONObject jSONObject) {
        if (bNS() == 0) {
            return this.ae.pvs(jSONObject);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mnm() {
        if (this.Ju.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.dx);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vA() {
        Object[] objArr = new Object[2];
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onAdShow");
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.vG.icD icd = this.ny;
        if (icd != null) {
            icd.pvs();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cR() {
        Object[] objArr = new Object[2];
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onAdClicked");
        } else {
            com.bytedance.sdk.openadsdk.apiImpl.vG.icD icd = this.ny;
            if (icd != null) {
                icd.onAdClicked();
            }
        }
        if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().dyT(String.valueOf(this.zM))) {
            this.ZhG.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zM() {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onAdSkip");
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.vG.icD icd = this.ny;
        if (icd != null) {
            icd.icD();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uc() {
        com.bytedance.sdk.openadsdk.component.vG vGVar;
        Object[] objArr = new Object[2];
        rCZ.vG(this.zM);
        zM();
        if (this.cR && (vGVar = this.ae) != null && vGVar.NB() != null) {
            this.ae.NB().pvs(4);
        }
        com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(this.rCZ, (int) this.Mxy.icD(), this.Wyp.pvs(), this.Mxy.pvs());
        cR cRVar = this.rCZ;
        if (cRVar != null && cRVar.SJ() && this.rCZ.ig() != null && this.rCZ.ig().pvs() != null) {
            com.bytedance.sdk.openadsdk.core.yiw.Jd pvs = this.rCZ.ig().pvs();
            com.bytedance.sdk.openadsdk.component.vG vGVar2 = this.ae;
            long yiw = (vGVar2 == null || vGVar2.NB() == null) ? 0L : this.ae.NB().yiw();
            pvs.sUS(yiw);
            pvs.NB(yiw);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final String str) {
        ae.vG(new so("AppOpenAd_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppOpenAdActivity.this.Jd().executeAppOpenAdCallback(TTAppOpenAdActivity.this.uc, str);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAppOpenAdActivity", "open_ad", "executeAppOpenAdCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    protected IListenerManager Jd() {
        if (this.OT == null) {
            this.OT = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs().pvs(7));
        }
        return this.OT;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Pj.pvs((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Pj.pvs((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.Ju.pvs("TTAppOpenAdActivity", e.getMessage());
                    }
                }
            }
        });
    }

    private boolean icD(Bundle bundle) {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.rCZ = com.bytedance.sdk.openadsdk.core.icD.pvs(new JSONObject(stringExtra));
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.Ju.pvs("TTAppOpenAdActivity", "open_ad", "initData MultiGlobalInfo throws ", e);
                    }
                }
                this.uc = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.rCZ = OT.pvs().icD();
            this.ny = OT.pvs().NB();
            OT.pvs().sUS();
        }
        pvs(getIntent());
        pvs(bundle);
        cR cRVar = this.rCZ;
        if (cRVar == null) {
            Object[] objArr = new Object[2];
            finish();
            return false;
        }
        this.gA = cRVar.jlb();
        this.rCZ.pvs(this.sUS);
        this.zM = this.rCZ.yTz();
        com.bytedance.sdk.openadsdk.utils.icD.pvs(this.rCZ);
        return true;
    }

    protected void pvs(Intent intent) {
        if (intent != null) {
            this.dyT = intent.getIntExtra(FirebaseAnalytics.Param.AD_SOURCE, 0);
            this.sUS = intent.getLongExtra("start_show_time", 0L);
        }
    }

    protected void pvs(Bundle bundle) {
        if (bundle != null) {
            if (this.ny == null) {
                this.ny = so;
                so = null;
            }
            try {
                String string = bundle.getString("material_meta");
                this.uc = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.dyT = bundle.getInt(FirebaseAnalytics.Param.AD_SOURCE, 0);
                this.sUS = bundle.getLong("start_show_time", 0L);
                this.rCZ = com.bytedance.sdk.openadsdk.core.icD.pvs(new JSONObject(string));
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAppOpenAdActivity", th.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            cR cRVar = this.rCZ;
            bundle.putString("material_meta", cRVar != null ? cRVar.wjr().toString() : null);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.uc);
            bundle.putInt(FirebaseAnalytics.Param.AD_SOURCE, this.dyT);
            bundle.putLong("start_show_time", this.sUS);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAppOpenAdActivity", th.getMessage());
        }
        so = this.ny;
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        com.bytedance.sdk.openadsdk.component.vG vGVar;
        if (message.what == 100) {
            if (this.cR && (vGVar = this.ae) != null && vGVar.NB() != null) {
                this.ae.NB().pvs(1);
            }
            zM();
            finish();
        }
    }

    protected boolean NB() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAppOpenAdActivity", e.getMessage());
            return false;
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.vG.pvs(this, this.rCZ);
    }
}
