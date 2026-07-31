package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity;
import com.bytedance.sdk.openadsdk.component.reward.rt;
import com.bytedance.sdk.openadsdk.component.reward.zmn.klz;
import com.bytedance.sdk.openadsdk.component.reward.zn.btk;
import com.bytedance.sdk.openadsdk.component.reward.zn.fs;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.hhw.zn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.ww;
import com.bytedance.sdk.openadsdk.fb.iv;
import com.bytedance.sdk.openadsdk.utils.fb;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.zak;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public abstract class TTUnifyWebActivity extends TTBaseActivity implements btk {
    protected nqi btk;
    private int bvs;
    protected fs fb;
    protected boolean fs;
    private final klz.fs hhw;
    private Context iv;
    private final AtomicBoolean nps;
    private zn zg;
    public final String zmn;
    int zn;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean fb() {
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    protected abstract fs zmn(Activity activity, Context context, nqi nqiVar, String str, zn znVar, String str2);

    protected abstract boolean zmn();

    public TTUnifyWebActivity() {
        this.zmn = zmn() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.zn = 1;
        this.hhw = new klz.fs();
        this.nps = new AtomicBoolean(false);
        this.bvs = -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        kgc.fs(getApplicationContext());
        if (!cn.btk()) {
            finish();
            return;
        }
        nqi zmn = com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(getIntent(), bundle, this);
        if (zmn == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.utils.fs.zmn(zmn);
        this.fs = com.bytedance.sdk.openadsdk.uqh.btk.zmn("adapt_decor_size", 0) == 1;
        iqz.zmn("BVA", "activity onCreate isAdaptDecorSize =" + this.fs);
        zmn.nu(String.valueOf(hashCode()));
        this.zn = zmn.ol();
        this.btk = zmn;
        zmn(zmn, bundle);
        if (bundle != null) {
            if (zmn.oub()) {
                this.nps.set(true);
            }
            iv.zmn(zmn, "activity_recreate", zmn.btk(), "activity_recreate", null);
        }
        try {
            zn();
        } catch (Throwable th) {
            iqz.zmn("TTUnifyWebActivity", "onCreate: ", th);
            iv.zmn(zmn, "show_ad_fail", this.zmn, "init_view_crash");
            finish();
        }
    }

    private void zmn(nqi nqiVar, Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            r1 = intent.getIntExtra("orientation_angle", 0) == 3;
            nqiVar.zmn(intent.getLongExtra("start_show_time", 0L));
        }
        this.iv = kgc.zmn();
        zn znVar = new zn(this);
        this.zg = znVar;
        fs zmn = zmn(this, this.iv, nqiVar, this.zmn, znVar, this.fkt);
        this.fb = zmn;
        zmn.zn(bundle);
        am.zmn().btk();
        com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(this.fb, intent, bundle);
        fs fsVar = this.fb;
        fsVar.fs = r1;
        fsVar.zmn(bundle);
    }

    protected void zn() {
        setContentView(this.zg);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        nqi nqiVar = this.btk;
        if (nqiVar != null) {
            if (this.tf && !nqiVar.nj() && !TextUtils.isEmpty(nqi.zmn(this, this.btk))) {
                finish();
            }
            if (this.btk.nj()) {
                this.btk.cn(false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.btk
    public void zmn(Bundle bundle) {
        if (bundle != null) {
            this.fkt = bundle.getString("single_process_listener_key");
        } else if (getIntent() != null) {
            this.fkt = getIntent().getStringExtra("single_process_listener_key");
        } else {
            this.fkt = "";
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        fs fsVar = this.fb;
        if (fsVar != null) {
            fsVar.zmn(z);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        iqz.zmn("BVA", "onStart mMetaIndex =" + this.bvs + " this =" + this);
        if (this.bvs >= 0) {
            am.zmn().zn(this.bvs);
            this.bvs = -1;
        }
        if (this.fb != null) {
            fb.zmn(this, this.btk);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        iqz.zmn("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.fb == null) {
            return;
        }
        this.hhw.zmn(this, this.zn, this.btk.fu(), this.fs);
        this.fb.zn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        iqz.zmn("BVA", "onPause ".concat(String.valueOf(this)));
        fs fsVar = this.fb;
        if (fsVar != null) {
            fsVar.hhw();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        fs fsVar = this.fb;
        if (fsVar != null) {
            fsVar.nps();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        iqz.zmn("BVA", "onDestroy ".concat(String.valueOf(this)));
        fs fsVar = this.fb;
        if (fsVar == null) {
            return;
        }
        fsVar.zg();
        AdSlot utx = this.btk.utx();
        if (!this.fb.cn() && utx != null && TextUtils.isEmpty(utx.getBidAdm()) && !this.btk.dbc()) {
            cn.fs().post(new rt(zmn(), utx));
        }
        this.hhw.zmn(this);
        ww.zmn().zmn(String.valueOf(hashCode()));
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        fs fsVar = this.fb;
        if (fsVar == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        fsVar.fs(bundle);
        if (!TextUtils.isEmpty(this.fkt)) {
            bundle.putString("single_process_listener_key", this.fkt);
        }
        int zmn = this.btk != null ? am.zmn().zmn(this.btk) : -1;
        this.bvs = zmn;
        com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(this.fb, bundle, zmn);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fs fsVar = this.fb;
        if (fsVar != null) {
            fsVar.bvs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (zak.hhw()) {
            jy.fs((Activity) this);
        }
    }

    public void fs() {
        finish();
    }
}
