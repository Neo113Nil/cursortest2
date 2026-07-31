package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.bjh.fs.btk;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.olo;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.cn.fb.zmn;
import com.bytedance.sdk.openadsdk.core.iv.mw;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.core.zak;
import com.bytedance.sdk.openadsdk.fb.iv;
import com.bytedance.sdk.openadsdk.utils.bvs;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.rt;
import com.bytedance.sdk.openadsdk.utils.ww;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements kjb.zmn, zmn.InterfaceC0155zmn {
    private static com.bytedance.sdk.openadsdk.zmn.fb.fs bvs;
    private AdSlot am;
    private int bjh;
    private com.bytedance.sdk.openadsdk.fb.nps cyb;
    private com.bytedance.sdk.openadsdk.zmn.fb.fs doe;
    private ImageView ev;
    private boolean hgd;
    private int iqz;
    private float kgc;
    private boolean kjb;
    private olo klz;
    private boolean kw;
    private TTAdDislikeToast mw;
    private rt nu;
    private float olo;
    private nqi phc;
    private com.bytedance.sdk.openadsdk.component.hhw.fs rc;
    private FrameLayout rp;
    private long so;
    private int uqh;
    private com.bytedance.sdk.openadsdk.component.zn zak;
    protected boolean zg;
    protected final AtomicBoolean zmn = new AtomicBoolean(false);
    protected final kjb fs = new kjb(Looper.getMainLooper(), this);
    final AtomicBoolean zn = new AtomicBoolean(false);
    final AtomicBoolean fb = new AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.component.zg.zmn iv = new com.bytedance.sdk.openadsdk.component.zg.zmn();
    protected boolean btk = false;
    private final AtomicBoolean rt = new AtomicBoolean(false);
    private ww cn = ww.zn();
    private final AtomicBoolean nqi = new AtomicBoolean(false);
    long hhw = 0;
    private volatile boolean yj = false;
    int nps = -1;
    private final com.bytedance.sdk.openadsdk.component.zmn ww = new com.bytedance.sdk.openadsdk.component.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.zmn, com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
        public void fs(long j, int i) {
            com.bytedance.sdk.openadsdk.component.zg.zn nps;
            StringBuilder sb = new StringBuilder("onError() called with: totalPlayTime = [");
            sb.append(j);
            sb.append("], percent = [");
            sb.append(i);
            sb.append(X3.j.e);
            if (TTAppOpenAdActivity.this.zak != null && (nps = TTAppOpenAdActivity.this.zak.nps()) != null) {
                TTAppOpenAdActivity.this.zak();
                nps.zmn(true);
            }
            TTAppOpenAdActivity.this.uqh();
            iv.zmn(TTAppOpenAdActivity.this.phc, "show_ad_fail", "open_ad", "play_video_error");
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.zmn, com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
        public void zmn() {
            TTAppOpenAdActivity.this.zak();
            TTAppOpenAdActivity.this.uqh();
            iv.zmn(TTAppOpenAdActivity.this.phc, "show_ad_fail", "open_ad", "play_video_time_out");
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.zmn, com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
        public void zmn(long j, long j2) {
            TTAppOpenAdActivity.this.iv.zn(j);
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.btk && tTAppOpenAdActivity.zak != null && TTAppOpenAdActivity.this.zak.nps() != null && TTAppOpenAdActivity.this.zak.nps().btk()) {
                TTAppOpenAdActivity.this.zak.nps().zg();
            }
            TTAppOpenAdActivity.this.mw();
            if (TTAppOpenAdActivity.this.zak instanceof com.bytedance.sdk.openadsdk.component.fs) {
                ((com.bytedance.sdk.openadsdk.component.fs) TTAppOpenAdActivity.this.zak).zmn(j, j2);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.zmn, com.bytedance.sdk.openadsdk.component.hhw.zmn
        public void zmn(View view) {
            TTAppOpenAdActivity.this.bjh();
        }

        @Override // com.bytedance.sdk.openadsdk.component.zmn, com.bytedance.sdk.openadsdk.component.hhw.zmn
        public void fs(View view) {
            TTAppOpenAdActivity.this.zmn();
            com.bytedance.sdk.openadsdk.component.fb.zmn.zmn(TTAppOpenAdActivity.this.phc, TTAppOpenAdActivity.this.kw());
        }

        @Override // com.bytedance.sdk.openadsdk.component.zmn, com.bytedance.sdk.openadsdk.component.hhw.zmn
        public void fs() {
            TTAppOpenAdActivity.this.yj = true;
            if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("splash_auto_close_switch", 0) == 0) {
                TTAppOpenAdActivity.this.nps();
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.zmn, com.bytedance.sdk.openadsdk.component.hhw.zmn
        public void zmn(int i, boolean z) {
            if (TTAppOpenAdActivity.this.zak != null) {
                TTAppOpenAdActivity.this.zak.zmn(i, z);
            }
            if (TTAppOpenAdActivity.this.kw || !(TTAppOpenAdActivity.this.zak instanceof com.bytedance.sdk.openadsdk.component.fs) || TTAppOpenAdActivity.this.rc == null || TTAppOpenAdActivity.this.rc.zmn() <= 0) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.component.fs) TTAppOpenAdActivity.this.zak).zmn(TTAppOpenAdActivity.this.iv.zn(), (long) (TTAppOpenAdActivity.this.iv.fs() * 1000.0f));
        }

        @Override // com.bytedance.sdk.openadsdk.component.zmn
        public void zn() {
            TTAppOpenAdActivity.this.hhw();
            TTAppOpenAdActivity.this.cn.btk();
            TTAppOpenAdActivity.this.iqz();
            if (TTAppOpenAdActivity.this.kw) {
                TTAppOpenAdActivity.this.klz();
            }
            if (TTAppOpenAdActivity.this.zak.nps() == null || TTAppOpenAdActivity.this.zak.nps().fs() == null) {
                return;
            }
            TTAppOpenAdActivity.this.zak.nps().fs().zmn(TTAppOpenAdActivity.this);
        }

        @Override // com.bytedance.sdk.openadsdk.component.zmn
        public void fb() {
            iv.zmn(TTAppOpenAdActivity.this.phc, "show_ad_fail", "open_ad", "render_failed");
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.zmn
        public void btk() {
            TTAppOpenAdActivity.this.nqi();
        }
    };
    private final Runnable oub = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.model.fb exj;
            com.bytedance.sdk.openadsdk.core.rt.fb zmn;
            if (TTAppOpenAdActivity.this.rt.get()) {
                iv.zmn(TTAppOpenAdActivity.this.phc, "show_ad_fail", "open_ad", "repeat_play");
                return;
            }
            if (TTAppOpenAdActivity.this.phc != null && (exj = TTAppOpenAdActivity.this.phc.exj()) != null && (zmn = exj.zmn()) != null) {
                zmn.zmn(0L);
            }
            TTAppOpenAdActivity.this.cyb = new com.bytedance.sdk.openadsdk.fb.nps();
            TTAppOpenAdActivity.this.cyb.zmn(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.cn.btk();
            if (TTAppOpenAdActivity.this.rc != null) {
                TTAppOpenAdActivity.this.rc.fs();
            }
            if (TTAppOpenAdActivity.this.zak != null) {
                TTAppOpenAdActivity.this.zak.btk();
            }
            TTAppOpenAdActivity.this.doe();
            View findViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (findViewById != null) {
                try {
                    jSONObject.put("width", findViewById.getWidth());
                    jSONObject.put("height", findViewById.getHeight());
                    jSONObject.put("alpha", findViewById.getAlpha());
                } catch (JSONException e) {
                    Log.e("TTAppOpenAdActivity", "run: ", e);
                    iv.zmn(TTAppOpenAdActivity.this.phc, "show_ad_fail", "open_ad", "show_report_failed");
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.uqh);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.kw ? "video_normal_ad" : "image_normal_ad");
            if (com.bytedance.sdk.openadsdk.component.bvs.zg.zn() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.kjb || TTAppOpenAdActivity.this.phc.xup()) {
                if (TTAppOpenAdActivity.this.phc() || com.bytedance.sdk.openadsdk.component.nps.zmn.rc()) {
                    jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.kw());
                } else {
                    jSONObject2.put("dynamic_show_type", 1);
                }
                TTAppOpenAdActivity.this.zmn(jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.phc.yj() ? 1 : 0);
            JSONObject jSONObject3 = new JSONObject();
            if (TTAppOpenAdActivity.this.uqh == 1) {
                jSONObject3.putOpt("cache_duration", Long.valueOf(System.currentTimeMillis() - TTAppOpenAdActivity.this.so));
            }
            if (TTAppOpenAdActivity.this.phc != null) {
                int iv = TTAppOpenAdActivity.this.phc.iv();
                jSONObject3.putOpt("start_type", Integer.valueOf(iv == 1 ? 1 : 2));
                jSONObject3.putOpt("load_index", Integer.valueOf(iv));
            }
            jSONObject3.putOpt("start_type_backup", Integer.valueOf(com.bytedance.sdk.openadsdk.component.nps.zmn.fb()));
            jSONObject3.putOpt("app_running_time", Long.valueOf(com.bytedance.sdk.openadsdk.component.nps.zmn.fs()));
            com.bytedance.sdk.openadsdk.fb.zn.zmn(TTAppOpenAdActivity.this.phc, "open_ad", jSONObject2, jSONObject3);
            com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.phc, new btk.zmn(TTAppOpenAdActivity.this.kw()));
            com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(TTAppOpenAdActivity.this.phc);
            TTAppOpenAdActivity.this.rt.set(true);
        }
    };

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean fb() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        boolean z;
        nqi nqiVar;
        super.onCreate(bundle);
        kgc.fs(getApplicationContext());
        if (bundle != null) {
            z = bundle.getBoolean("enable_new_arch", false);
        } else {
            z = getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false);
        }
        this.hgd = z;
        iqz.zmn("BVA", "onCreate: isEnableNewArch = " + this.hgd);
        if (!fs(bundle)) {
            iv.zmn(this.phc, "show_ad_fail", "open_ad", "init_view_crash");
            finish();
            return;
        }
        if (!cn.btk()) {
            iv.zmn(this.phc, "show_ad_fail", "open_ad", "init_view_crash");
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.fb.zn.fs(this.phc, "open_ad", (JSONObject) null, (JSONObject) null);
        }
        this.kw = nqi.btk(this.phc);
        new StringBuilder("onCreate: isVideo is ").append(this.kw);
        if (this.kw && (nqiVar = this.phc) != null) {
            this.iv.zmn((float) nqiVar.mrt().hhw());
        } else {
            this.iv.zmn(kgc.fb().uqh(String.valueOf(this.iqz)));
        }
        com.bytedance.sdk.openadsdk.component.hhw.fs fsVar = new com.bytedance.sdk.openadsdk.component.hhw.fs(this.iv);
        this.rc = fsVar;
        fsVar.zmn(this.ww);
        zg();
        if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("aoa_ad_report_enable", 0) == 1) {
            iv.zmn(this.phc, "on_create", "open_ad", "activity_on_create");
        }
        FrameLayout frameLayout = new FrameLayout(this);
        this.rp = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            kgc();
            setContentView(this.rp);
            this.rp.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (TTAppOpenAdActivity.this.phc != null) {
                            int skn = TTAppOpenAdActivity.this.phc.skn();
                            if (com.bytedance.sdk.openadsdk.component.nps.zmn.rc()) {
                                TTAppOpenAdActivity.this.kjb = skn != 1;
                                TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                                tTAppOpenAdActivity.zak = new com.bytedance.sdk.openadsdk.component.fs(tTAppOpenAdActivity, tTAppOpenAdActivity.phc, TTAppOpenAdActivity.this.rp, TTAppOpenAdActivity.this.ww, TTAppOpenAdActivity.this.bjh, TTAppOpenAdActivity.this.kw, TTAppOpenAdActivity.this.iv, TTAppOpenAdActivity.this.rc);
                                if (!TTAppOpenAdActivity.this.kjb || !TTAppOpenAdActivity.this.phc()) {
                                    TTAppOpenAdActivity.this.phc.kw(1);
                                    TTAppOpenAdActivity.this.phc.iqz(1);
                                }
                            } else {
                                TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                                if (tTAppOpenAdActivity2.phc.nkt() == 2 && skn != 1) {
                                    r2 = true;
                                }
                                tTAppOpenAdActivity2.kjb = r2;
                                if (TTAppOpenAdActivity.this.kjb && TTAppOpenAdActivity.this.phc()) {
                                    TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                                    tTAppOpenAdActivity3.zak = new com.bytedance.sdk.openadsdk.component.fs(tTAppOpenAdActivity3, tTAppOpenAdActivity3.phc, TTAppOpenAdActivity.this.rp, TTAppOpenAdActivity.this.ww, TTAppOpenAdActivity.this.bjh, TTAppOpenAdActivity.this.kw, TTAppOpenAdActivity.this.iv, TTAppOpenAdActivity.this.rc);
                                } else {
                                    TTAppOpenAdActivity tTAppOpenAdActivity4 = TTAppOpenAdActivity.this;
                                    tTAppOpenAdActivity4.zak = new com.bytedance.sdk.openadsdk.component.zn(tTAppOpenAdActivity4, tTAppOpenAdActivity4.phc, TTAppOpenAdActivity.this.rp, TTAppOpenAdActivity.this.ww, TTAppOpenAdActivity.this.bjh, TTAppOpenAdActivity.this.kw, TTAppOpenAdActivity.this.iv);
                                    TTAppOpenAdActivity.this.zak.zmn(TTAppOpenAdActivity.this.kgc, TTAppOpenAdActivity.this.olo);
                                }
                            }
                            TTAppOpenAdActivity.this.zak.zmn((ViewGroup) TTAppOpenAdActivity.this.rp);
                            TTAppOpenAdActivity.this.zak.zmn();
                            TTAppOpenAdActivity.this.zak.fs();
                            TTAppOpenAdActivity tTAppOpenAdActivity5 = TTAppOpenAdActivity.this;
                            com.bytedance.sdk.openadsdk.nqi.zmn.zmn.zmn(tTAppOpenAdActivity5, tTAppOpenAdActivity5.rp, com.bytedance.sdk.openadsdk.nqi.zmn.zmn.zmn(TTAppOpenAdActivity.this.phc.wbj()));
                            return;
                        }
                        TTAppOpenAdActivity.this.finish();
                    } catch (Throwable th) {
                        iv.zmn(TTAppOpenAdActivity.this.phc, "show_ad_fail", "open_ad", "init_view_crash");
                        TTAppOpenAdActivity.this.finish();
                        iqz.zn("TTAppOpenAdActivity", th.getMessage());
                    }
                }
            });
            try {
                final View decorView = getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 35) {
                    this.zg = true;
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.3
                        /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
                        
                            r0 = r5.getBoundingRects();
                         */
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            DisplayCutout displayCutout;
                            List boundingRects;
                            int safeInsetLeft;
                            int safeInsetTop;
                            int safeInsetRight;
                            int safeInsetBottom;
                            try {
                                displayCutout = windowInsets.getDisplayCutout();
                                if (displayCutout != null && boundingRects != null && !boundingRects.isEmpty()) {
                                    View view2 = decorView;
                                    safeInsetLeft = displayCutout.getSafeInsetLeft();
                                    safeInsetTop = displayCutout.getSafeInsetTop();
                                    safeInsetRight = displayCutout.getSafeInsetRight();
                                    safeInsetBottom = displayCutout.getSafeInsetBottom();
                                    view2.setPadding(safeInsetLeft, safeInsetTop, safeInsetRight, safeInsetBottom);
                                }
                            } catch (Throwable unused) {
                                iv.zmn(TTAppOpenAdActivity.this.phc, "show_ad_fail", "open_ad", "init_view_crash");
                            }
                            return windowInsets;
                        }
                    });
                }
            } catch (Throwable unused) {
                iv.zmn(this.phc, "show_ad_fail", "open_ad", "init_view_crash");
            }
            rp();
        } catch (Throwable unused2) {
            com.bytedance.sdk.openadsdk.cyb.fb.fs();
            iv.zmn(this.phc, "show_ad_fail", "open_ad", "init_view_crash");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hhw() {
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        int kjb = kjb();
        this.rc.zmn(this.iv.fs());
        this.rc.fs(kjb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nps() {
        iqz.zmn("TTAppOpenAdActivity", "invoke callback onAdDismiss, ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.zmn.fb.fs fsVar = this.doe;
        if (fsVar != null) {
            fsVar.zn();
        }
    }

    private void zg() {
        if (26 == Build.VERSION.SDK_INT) {
            if (getResources().getConfiguration().orientation == 1) {
                this.bjh = 1;
            } else {
                this.bjh = 2;
            }
        } else {
            this.bjh = this.phc.ol();
        }
        bvs();
    }

    private void bvs() {
        int min;
        int max;
        new StringBuilder("changeScreenOrientation: mOrientation=").append(this.bjh);
        int i = Build.VERSION.SDK_INT;
        if (i != 26) {
            if (i == 27) {
                try {
                    iv();
                } catch (Throwable th) {
                    iqz.zn("TTAppOpenAdActivity", th.getMessage());
                    return;
                }
            } else {
                iv();
            }
        }
        Pair<Integer, Integer> rc = jy.rc(getApplicationContext());
        if (this.bjh == 2) {
            min = Math.max(((Integer) rc.first).intValue(), ((Integer) rc.second).intValue());
            max = Math.min(((Integer) rc.first).intValue(), ((Integer) rc.second).intValue());
        } else {
            min = Math.min(((Integer) rc.first).intValue(), ((Integer) rc.second).intValue());
            max = Math.max(((Integer) rc.first).intValue(), ((Integer) rc.second).intValue());
        }
        this.olo = max;
        this.kgc = min;
        float zmn = jy.zmn();
        if (jy.zn((Activity) this)) {
            int i2 = this.bjh;
            if (i2 == 1) {
                this.olo -= zmn;
            } else if (i2 == 2) {
                this.kgc -= zmn;
            }
        }
        com.bytedance.sdk.openadsdk.component.zn znVar = this.zak;
        if (znVar != null) {
            znVar.zmn(this.kgc, this.olo);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void iv() {
        if (this.bjh == 2) {
            if (btk()) {
                setRequestedOrientation(8);
            } else {
                setRequestedOrientation(0);
            }
        } else {
            setRequestedOrientation(1);
        }
        if (this.bjh == 2 || !jy.zn((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    protected void zmn() {
        if (isFinishing()) {
            return;
        }
        if (this.fb.get()) {
            cn();
            return;
        }
        if (this.klz == null) {
            try {
                rc();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th);
            }
        }
        olo oloVar = this.klz;
        if (oloVar != null) {
            oloVar.zmn();
        }
    }

    private void rc() {
        if (this.klz == null) {
            olo oloVar = new olo(this, this.phc);
            this.klz = oloVar;
            oloVar.setDislikeSource("video_player");
            this.klz.setCallback(new olo.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.4
                @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                public void zmn(View view) {
                    TTAppOpenAdActivity.this.zn.set(true);
                    TTAppOpenAdActivity.this.zn();
                    com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(TTAppOpenAdActivity.this.phc, 8);
                }

                @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                public void fs(View view) {
                    TTAppOpenAdActivity.this.zn.set(false);
                    TTAppOpenAdActivity.this.fs();
                    com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(TTAppOpenAdActivity.this.phc, 4);
                }

                @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                public void zmn(FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.fb.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.fb.set(true);
                    TTAppOpenAdActivity.this.cyb();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.klz);
        if (this.mw == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.mw = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void klz() {
        if (!this.kw || this.phc.yj() || this.yj) {
            return;
        }
        this.fs.sendEmptyMessageDelayed(100, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mw() {
        if (!this.kw || this.phc.yj()) {
            return;
        }
        this.fs.removeMessages(100);
    }

    private void cn() {
        this.mw.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cyb() {
        this.mw.show(TTAdDislikeToast.getDislikeSendTip());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        olo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void rt() {
        olo();
    }

    private void olo() {
        if (kgc.fb().doe(String.valueOf(this.iqz)) == 1) {
            if (this.iv.zn() >= kgc.fb().nqi(String.valueOf(this.iqz)) * 1000) {
                bjh();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            if (!this.kjb) {
                this.cn.btk();
            }
            nqi nqiVar = this.phc;
            if (nqiVar != null && nqiVar.dv() && !this.phc.kjb()) {
                this.phc.nps(true);
                nqi nqiVar2 = this.phc;
                com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar2, "open_ad", nqiVar2.rfd());
            }
        } else if (this.rt.get()) {
            if (this.cn.hhw()) {
                com.bytedance.sdk.openadsdk.fb.zn.zmn(String.valueOf(this.cn.fb()), this.phc, "open_ad", this.cyb);
            }
            this.cn = ww.zn();
        }
        com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.phc, z ? 4 : 8);
        com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(this.phc, z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        com.bytedance.sdk.openadsdk.component.zn znVar;
        super.onResume();
        this.btk = true;
        if (this.zmn.getAndSet(true)) {
            if (this.nqi.get()) {
                uqh();
                if (this.kw && (znVar = this.zak) != null && znVar.nps() != null) {
                    zak();
                    this.zak.nps().zmn(3);
                }
                iv.zmn(this.phc, "show_ad_fail", "open_ad", "activity_on_resume_skip");
                finish();
                return;
            }
            fs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.btk = false;
        zn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        AdSlot adSlot;
        super.onDestroy();
        if (this.phc != null) {
            com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn("videoForceBreak", this.phc);
        }
        this.fs.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.hhw.fs fsVar = this.rc;
        if (fsVar != null) {
            fsVar.btk();
        }
        rt rtVar = this.nu;
        if (rtVar != null) {
            rtVar.zn();
        }
        com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.phc);
        com.bytedance.sdk.openadsdk.bjh.zmn.zn.fs(this.phc);
        if (this.kw) {
            com.bytedance.sdk.openadsdk.component.fb.fs.zmn(this.phc, this.iv.fb(), this.iv.fs(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.fb.fs.zmn(this.phc, -1L, this.iv.fs(), false);
        }
        if (this.cn.hhw() && this.rt.get()) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(String.valueOf(this.cn.fb()), this.phc, "open_ad", this.cyb);
            this.cn = ww.zn();
        }
        com.bytedance.sdk.openadsdk.component.zn znVar = this.zak;
        if (znVar != null) {
            znVar.zn();
        }
        nps();
        bvs = null;
        if (this.hgd && !TextUtils.isEmpty(this.fkt)) {
            am.zmn().zmn(this.fkt, isFinishing(), isChangingConfigurations());
        }
        this.doe = null;
        olo oloVar = this.klz;
        if (oloVar != null) {
            oloVar.setCallback(null);
        }
        nqi nqiVar = this.phc;
        if (nqiVar != null && !nqi.hhw(nqiVar) && !this.phc.dbc() && (adSlot = this.am) != null) {
            adSlot.setCacheScene(1);
            com.bytedance.sdk.openadsdk.component.hhw.zmn(kgc.zmn()).zmn(this.am);
        }
        com.bytedance.sdk.openadsdk.component.fb.zmn.zmn(this.phc);
    }

    void fs() {
        if (this.zn.get()) {
            return;
        }
        if (this.kw) {
            com.bytedance.sdk.openadsdk.component.zn znVar = this.zak;
            if (znVar != null && znVar.nps() != null && this.zak.nps().hhw()) {
                this.zak.nps().rc();
            }
            klz();
        }
        com.bytedance.sdk.openadsdk.component.hhw.fs fsVar = this.rc;
        if (fsVar != null) {
            fsVar.zn();
        }
        rt rtVar = this.nu;
        if (rtVar != null) {
            rtVar.zmn();
        }
    }

    void zn() {
        if (this.kw) {
            com.bytedance.sdk.openadsdk.component.zn znVar = this.zak;
            if (znVar != null && znVar.nps() != null && this.zak.nps().btk()) {
                this.zak.nps().zg();
            }
            mw();
        }
        com.bytedance.sdk.openadsdk.component.hhw.fs fsVar = this.rc;
        if (fsVar != null) {
            fsVar.fb();
        }
        rt rtVar = this.nu;
        if (rtVar != null) {
            rtVar.fs();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int kw() {
        if (this.phc.xup()) {
            return 5;
        }
        if (this.kjb) {
            return this.zak.fb();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject zmn(JSONObject jSONObject) {
        if (kw() == 0) {
            return this.zak.zmn(jSONObject);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iqz() {
        if (this.rt.get()) {
            iv.zmn(this.phc, "show_ad_fail", "open_ad", "repeat_play");
            return;
        }
        try {
            getWindow().getDecorView().post(this.oub);
        } catch (Throwable unused) {
            iv.zmn(this.phc, "show_ad_fail", "open_ad", "show_report_failed");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean phc() {
        if (!this.phc.ev()) {
            return false;
        }
        int skn = this.phc.skn();
        return ((skn == 0 || skn == 9) && (com.bytedance.sdk.component.adexpress.zmn.fs.zn.zmn(mw.zn(), "3.1.78") || com.bytedance.sdk.component.adexpress.zmn.fs.zn.zmn(mw.fb(), "3.1.78"))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doe() {
        com.bytedance.sdk.openadsdk.zmn.fb.fs fsVar = this.doe;
        if (fsVar != null) {
            fsVar.zmn();
        } else {
            iv.zmn(this.phc, "show", 0);
        }
        com.bytedance.sdk.openadsdk.component.fb.zmn.fs(this.phc, kw());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nqi() {
        com.bytedance.sdk.openadsdk.component.zg.zn nps;
        com.bytedance.sdk.openadsdk.zmn.fb.fs fsVar = this.doe;
        if (fsVar != null) {
            fsVar.onAdClicked();
        }
        if (rc.fs().bjh(String.valueOf(this.iqz))) {
            this.nqi.set(true);
        }
        com.bytedance.sdk.openadsdk.component.zn znVar = this.zak;
        if (znVar == null || (nps = znVar.nps()) == null) {
            return;
        }
        nps.cyb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uqh() {
        com.bytedance.sdk.openadsdk.zmn.fb.fs fsVar = this.doe;
        if (fsVar != null) {
            fsVar.fs();
        } else {
            iv.zmn(this.phc, "close", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bjh() {
        com.bytedance.sdk.openadsdk.core.model.fb exj;
        com.bytedance.sdk.openadsdk.core.rt.fb zmn;
        com.bytedance.sdk.openadsdk.component.zn znVar;
        zak.zn(this.iqz);
        uqh();
        if (this.kw && (znVar = this.zak) != null && znVar.nps() != null) {
            zak();
            this.zak.nps().zmn(4);
        }
        com.bytedance.sdk.openadsdk.component.fb.fs.zmn(this.phc, (int) this.iv.zn(), this.rc.zmn(), this.iv.fs());
        nqi nqiVar = this.phc;
        if (nqiVar != null && (exj = nqiVar.exj()) != null && (zmn = exj.zmn()) != null) {
            com.bytedance.sdk.openadsdk.component.zn znVar2 = this.zak;
            long mw = (znVar2 == null || znVar2.nps() == null) ? 0L : this.zak.nps().mw();
            zmn.hhw(mw);
            zmn.btk(mw);
        }
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        jy.zmn((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.6
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                jy.zmn((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        iqz.zn("TTAppOpenAdActivity", e.getMessage());
                        iv.zmn(TTAppOpenAdActivity.this.phc, "show_ad_fail", "open_ad", "attach_to_window_failed");
                    }
                }
            }
        });
    }

    private boolean fs(Bundle bundle) {
        String stringExtra;
        this.phc = am.zmn().zmn(am.zmn(getIntent()));
        if (this.hgd) {
            if (bundle != null) {
                stringExtra = bundle.getString("single_process_listener_key");
            } else {
                stringExtra = getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
            }
            this.fkt = stringExtra;
            this.doe = (com.bytedance.sdk.openadsdk.zmn.fb.fs) am.zmn().zmn(this.fkt, com.bytedance.sdk.openadsdk.zmn.fb.fs.class);
        } else {
            this.doe = am.zmn().fb();
        }
        am.zmn().btk();
        zmn(getIntent());
        zmn(bundle);
        nqi nqiVar = this.phc;
        if (nqiVar == null) {
            finish();
            return false;
        }
        this.am = nqiVar.utx();
        this.phc.zmn(this.hhw);
        this.iqz = this.phc.qvo();
        com.bytedance.sdk.openadsdk.utils.fs.zmn(this.phc);
        return true;
    }

    private void rp() {
        if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("aoa_force_show_close_enable", false)) {
            com.bytedance.sdk.openadsdk.core.widget.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.widget.hhw(this, 33, 0.0f);
            this.ev = hhwVar;
            hhwVar.setImageDrawable(doe.zn(this, "tt_ad_close_backup"));
            this.ev.setContentDescription(doe.zmn(this, "tt_close_backup_button_text"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388661;
            layoutParams.topMargin = jy.fs(this, 27.0f);
            layoutParams.rightMargin = jy.fs(this, 9.0f);
            this.ev.setVisibility(8);
            this.rp.addView(this.ev, layoutParams);
            this.ev.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTAppOpenAdActivity$7;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTAppOpenAdActivity$7_onClick_e5d97f7475185cafbbe27e8babb499ac(view);
                }

                public void safedk_TTAppOpenAdActivity$7_onClick_e5d97f7475185cafbbe27e8babb499ac(View p0) {
                    TTAppOpenAdActivity.this.bjh();
                }
            });
            rt zmn = com.bytedance.sdk.openadsdk.utils.bvs.zmn(this, new bvs.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.8
                @Override // com.bytedance.sdk.openadsdk.utils.bvs.zmn
                public void fs() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.bvs.zmn
                public View zmn() {
                    return TTAppOpenAdActivity.this.ev;
                }
            });
            this.nu = zmn;
            zmn.zmn(com.bytedance.sdk.openadsdk.uqh.btk.zmn("aoa_force_close_delay_time", 5000));
            this.nu.zmn(new com.bytedance.sdk.openadsdk.utils.cn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.9
                @Override // com.bytedance.sdk.openadsdk.utils.cn
                public void zmn() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (TTAppOpenAdActivity.this.phc != null) {
                            jSONObject.putOpt("render_sequence", Integer.valueOf(TTAppOpenAdActivity.this.phc.skn()));
                        }
                        if (TTAppOpenAdActivity.this.zak != null) {
                            jSONObject.putOpt("dynamic_show_type", Integer.valueOf(TTAppOpenAdActivity.this.zak.fb()));
                        }
                    } catch (JSONException e) {
                        iqz.zn("TTAppOpenAdActivity", e.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.component.fb.fs.zmn("aoa_backup_close_show", TTAppOpenAdActivity.this.phc, jSONObject);
                }
            });
            this.nu.zmn((long) (Math.min(kjb(), this.iv.fs()) * 1000.0f));
        }
    }

    private int kjb() {
        nqi nqiVar = this.phc;
        if (nqiVar != null && nqiVar.fs() >= 0) {
            return this.phc.fs();
        }
        return kgc.fb().nqi(String.valueOf(this.iqz));
    }

    protected void zmn(Intent intent) {
        if (intent != null) {
            this.uqh = intent.getIntExtra("ad_source", 0);
            this.so = intent.getLongExtra("cache_time", 0L);
            this.hhw = intent.getLongExtra("start_show_time", 0L);
        }
    }

    protected void zmn(Bundle bundle) {
        if (bundle != null) {
            if (!this.hgd && this.doe == null) {
                this.doe = bvs;
                bvs = null;
            }
            try {
                int i = bundle.getInt("meta_index", -1);
                this.uqh = bundle.getInt("ad_source", 0);
                this.hhw = bundle.getLong("start_show_time", 0L);
                this.so = bundle.getLong("cache_time", 0L);
                this.phc = am.zmn().zmn(i);
            } catch (Throwable th) {
                iqz.zn("TTAppOpenAdActivity", th.getMessage());
                iv.zmn(this.phc, "show_ad_fail", "open_ad", "get_bundle_info_failed");
            }
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            this.nps = this.phc != null ? am.zmn().zmn(this.phc) : -1;
            if (!TextUtils.isEmpty(this.fkt)) {
                bundle.putString("single_process_listener_key", this.fkt);
            }
            bundle.putBoolean("enable_new_arch", this.hgd);
            bundle.putInt("meta_index", this.nps);
            bundle.putInt("ad_source", this.uqh);
            bundle.putLong("start_show_time", this.hhw);
            bundle.putLong("cache_time", this.so);
        } catch (Throwable th) {
            iqz.zn("TTAppOpenAdActivity", th.getMessage());
            iv.zmn(this.phc, "show_ad_fail", "open_ad", "save_instance_state_failed");
        }
        if (!this.hgd) {
            bvs = this.doe;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        com.bytedance.sdk.openadsdk.core.model.fb exj;
        com.bytedance.sdk.openadsdk.core.rt.fb zmn;
        com.bytedance.sdk.openadsdk.component.zn znVar;
        if (message.what == 100) {
            if (this.kw && (znVar = this.zak) != null && znVar.nps() != null) {
                zak();
                this.zak.nps().zmn(1);
            }
            nqi nqiVar = this.phc;
            if (nqiVar != null && (exj = nqiVar.exj()) != null && (zmn = exj.zmn()) != null) {
                zmn.zmn(com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.GENERAL_LINEAR_AD_ERROR);
            }
            uqh();
            iv.zmn(this.phc, "show_ad_fail", "open_ad", "play_video_time_out");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zak() {
        nqi nqiVar;
        try {
            if (this.rc == null || (nqiVar = this.phc) == null || nqiVar.el() == null) {
                return;
            }
            int fs = this.phc.el().fs();
            if (fs == 1 || fs == 2) {
                this.rc.zmn(fs, this.phc.el().zmn(), false);
                com.bytedance.sdk.openadsdk.component.zn znVar = this.zak;
                if (znVar == null || znVar.nps() == null) {
                    return;
                }
                this.zak.nps().fs().zmn(this.iv.zmn());
                this.zak.nps().fs().zmn(1.0f);
            }
        } catch (Throwable th) {
            iqz.zn("TTAppOpenAdActivity", th.getMessage());
        }
    }

    protected boolean btk() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e) {
            iqz.zn("TTAppOpenAdActivity", e.getMessage());
            return false;
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.nps >= 0) {
            am.zmn().zn(this.nps);
            this.nps = -1;
        }
        com.bytedance.sdk.openadsdk.utils.fb.zmn(this, this.phc);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.zmn.InterfaceC0155zmn
    public void zmn(int i) {
        if (i == 2 || i == 3 || i == 4) {
            zak();
        }
    }
}
