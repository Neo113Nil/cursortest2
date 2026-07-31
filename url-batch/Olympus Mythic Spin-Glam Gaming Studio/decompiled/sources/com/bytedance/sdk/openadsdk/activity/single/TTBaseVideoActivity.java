package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.cyb;
import com.bytedance.sdk.openadsdk.common.rt;
import com.bytedance.sdk.openadsdk.common.zmn;
import com.bytedance.sdk.openadsdk.component.reward.zmn.klz;
import com.bytedance.sdk.openadsdk.component.reward.zmn.olo;
import com.bytedance.sdk.openadsdk.component.reward.zmn.rc;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.model.yj;
import com.bytedance.sdk.openadsdk.core.ww;
import com.bytedance.sdk.openadsdk.fb.fs;
import com.bytedance.sdk.openadsdk.fb.iv;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.tf;
import com.bytedance.sdk.openadsdk.utils.zak;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements kjb.zmn, com.bytedance.sdk.openadsdk.core.cn.fb.fs {
    int btk;
    protected boolean bvs;
    private boolean cn;
    private int cyb;
    final kjb fb;
    com.bytedance.sdk.openadsdk.component.reward.zmn.fs fs;
    boolean hhw;
    protected boolean iv;
    private int kgc;
    protected long klz;
    protected boolean mw;
    protected tf nps;
    private final klz.fs olo;
    protected boolean rc;
    private final AtomicBoolean rt;
    int zg;
    public final String zmn;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.fs.fs zn;

    protected void am() {
    }

    public abstract boolean bjh();

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void btk() {
    }

    protected abstract void bvs();

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    public abstract FrameLayout ev();

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fb(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean fb() {
        return true;
    }

    protected abstract void fs();

    protected void fs(boolean z, boolean z2) {
    }

    public boolean kjb() {
        return false;
    }

    protected abstract void kw();

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void olo() {
    }

    protected void phc() {
    }

    public abstract boolean rp();

    protected void so() {
    }

    protected abstract void uqh();

    public Map<String, Object> ww() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void yo() {
    }

    protected abstract cyb zg();

    protected abstract void zmn(long j, long j2);

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(boolean z) {
    }

    protected abstract void zn();

    public TTBaseVideoActivity() {
        this.zmn = bjh() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.rt = new AtomicBoolean(false);
        this.fb = new kjb(Looper.getMainLooper(), this);
        this.cn = false;
        this.cyb = 0;
        this.zg = 1;
        this.olo = new klz.fs();
        this.bvs = false;
        this.kgc = -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (bundle != null) {
            z = bundle.getBoolean("enable_new_arch", false);
        } else {
            z = getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false);
        }
        this.iv = z;
        this.klz = SystemClock.elapsedRealtime();
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
        this.mw = com.bytedance.sdk.openadsdk.uqh.btk.rc();
        com.bytedance.sdk.openadsdk.utils.fs.zmn(zmn);
        this.rc = com.bytedance.sdk.openadsdk.uqh.btk.zmn("adapt_decor_size", 0) == 1;
        zmn.nu(String.valueOf(hashCode()));
        this.zg = zmn.ol();
        zmn(zmn, bundle);
        if (bundle != null) {
            iv.zmn(zmn, "activity_recreate", zmn.btk(), "activity_recreate", null);
        }
        try {
            kgc();
            zmn();
            oub();
        } catch (Throwable th) {
            iqz.zmn("TTAD.BVA", "onCreate: ", th);
            iv.zmn(zmn, "show_ad_fail", this.zmn, "init_view_crash");
            finish();
        }
    }

    private void zmn(nqi nqiVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = new com.bytedance.sdk.openadsdk.component.reward.zmn.fs(this, this.fb, nqiVar, this, 0, this.rc);
        this.fs = fsVar;
        com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(fsVar, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            zmn(intent);
            nqiVar.zmn(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.fs.yo) {
            bvs();
        }
        com.bytedance.sdk.openadsdk.component.reward.fs.fs zmn = com.bytedance.sdk.openadsdk.component.reward.fs.hhw.zmn(this.fs);
        this.zn = zmn;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.fs;
        fsVar2.f3739io = zmn;
        com.bytedance.sdk.openadsdk.utils.cyb.zmn(nqiVar, fsVar2.oub, fsVar2.btk, fsVar2.ww);
        Objects.toString(this.zn);
    }

    protected void zmn() {
        setContentView(this.fs.hgd);
        this.fs.hgd.zmn(this.zn);
        this.zn.zmn(this, this.fb);
        this.zn.iv();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        com.bytedance.sdk.openadsdk.nqi.zmn.zmn.zmn(this, fsVar.hgd, com.bytedance.sdk.openadsdk.nqi.zmn.zmn.zmn(fsVar.fs.wbj()));
    }

    @Override // android.app.Activity
    protected void onRestart() {
        nqi nqiVar;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || (nqiVar = fsVar.fs) == null) {
            return;
        }
        if (this.tf && !nqiVar.nj() && !TextUtils.isEmpty(nqi.zmn(this, nqiVar))) {
            finish();
        }
        if (nqiVar.nj()) {
            nqiVar.cn(false);
        }
    }

    private void oub() {
        com.bytedance.sdk.openadsdk.core.rt.fb zmn;
        this.zn.uqh();
        this.btk = (int) this.fs.phc.ww();
        if (this.mw) {
            com.bytedance.sdk.openadsdk.common.zmn.fs(new rt.zmn(this.fs, "TTAD.BVA", new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity.this.finish();
                }
            }, new zmn.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.2
                @Override // com.bytedance.sdk.openadsdk.common.zmn.fs
                public void zmn(boolean z, int i) {
                    TTBaseVideoActivity.this.zmn(z, i);
                }

                @Override // com.bytedance.sdk.openadsdk.common.zmn.fs
                public void zmn() {
                    TTBaseVideoActivity.this.finish();
                }
            }).zmn(nps()).zmn(zg()).zmn());
        } else {
            uqh();
        }
        mw();
        com.bytedance.sdk.openadsdk.core.model.fb exj = this.fs.fs.exj();
        if (exj == null || (zmn = exj.zmn()) == null) {
            return;
        }
        zmn.zmn(0L);
    }

    protected void hhw() {
        if (com.bytedance.sdk.openadsdk.uqh.btk.bvs() && isChangingConfigurations()) {
            iqz.zmn("BVA", "callback close is invoke by config change.");
            return;
        }
        if (!this.hhw) {
            this.hhw = true;
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
            nqi nqiVar = fsVar != null ? fsVar.fs : null;
            if (nqiVar != null && !nqiVar.yof()) {
                long bvs = nqiVar.bvs();
                if (bvs > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - bvs;
                    if (elapsedRealtime > 0) {
                        nqiVar.fs(elapsedRealtime);
                    }
                }
                this.fs.zmn(BackupConstant.CLOSE_NOT_SHOW_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, 1003);
                this.fs.rp.zmn();
            }
            zn();
            fs();
            return;
        }
        iqz.zmn("BVA", "invoke callback onAdClose has already been called ");
    }

    protected boolean nps() {
        return !bjh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(Bundle bundle) {
        if (this.iv) {
            if (bundle != null) {
                this.fkt = bundle.getString("single_process_listener_key");
            } else if (getIntent() != null) {
                this.fkt = getIntent().getStringExtra("single_process_listener_key");
            } else {
                this.fkt = "";
            }
        }
    }

    protected void zmn(@NonNull Intent intent) {
        this.fs.ve = intent.getBooleanExtra("back_up", false);
        this.fs.cd = intent.getIntExtra("extra_conversion_link", 0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        rc rcVar;
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || (rcVar = fsVar.rp) == null) {
            return;
        }
        rcVar.fs(z);
        this.fs.rp.zn(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void lt() {
        this.fs.rp.zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void rc() {
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.zn;
        if (fsVar == null) {
            return;
        }
        fsVar.rc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void klz() {
        this.fs.rt.set(true);
        rc();
    }

    public void zmn(boolean z, int i) {
        zmn(z, false, i);
    }

    public void zmn(boolean z, boolean z2, int i) {
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.zn;
        if (fsVar == null) {
            return;
        }
        fsVar.zmn(z, z2, false, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void cn() {
        this.fs.phc.oub();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public View cyb() {
        return this.fs.phc.jy();
    }

    protected void mw() {
        if (am.zn(this.fs.fs)) {
            zmn(false, fs.C0189fs.zn);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.zn;
        if (fsVar != null) {
            fsVar.zmn(this.fs.fkt.hhw());
            this.zn.nqi();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        toString();
        if (this.kgc >= 0) {
            com.bytedance.sdk.openadsdk.core.am.zmn().zn(this.kgc);
            this.kgc = -1;
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null) {
            return;
        }
        fsVar.yj.bjh();
        com.bytedance.sdk.openadsdk.utils.fb.zmn(this, this.fs.fs);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar;
        super.onResume();
        toString();
        if (this.fs == null || (fsVar = this.zn) == null) {
            return;
        }
        fsVar.cn();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.fs;
        fsVar2.cud = true;
        this.olo.zmn(this, fsVar2.kra, fsVar2.na, this.rc);
        if (vlj()) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = this.fs;
            fsVar3.ev.zmn(fsVar3.fs.bn());
        }
        this.fs.fkt.cyb();
        this.fs.yj.olo();
        this.fs.nqi.btk();
        if (this.zn.fs()) {
            this.fs.phc.zmn(this.zn);
            this.fs.phc.zmn(false, this, this.cyb != 0);
        }
        this.cyb++;
        iqz();
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = this.fs.uqh;
        if (bvsVar != null) {
            bvsVar.nps();
        }
        this.fs.bjh.zmn(this.fb);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.zn;
        if (fsVar == null) {
            return;
        }
        fsVar.olo();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.zn;
        if (fsVar == null) {
            return;
        }
        fsVar.kgc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        nqi nqiVar;
        super.onDestroy();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || this.zn == null) {
            return;
        }
        if (fsVar.xrr > 0 && (nqiVar = fsVar.fs) != null && nqiVar.yof()) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.fs.xrr);
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.fs;
            com.bytedance.sdk.openadsdk.fb.zn.zmn(valueOf, fsVar2.fs, this.zmn, fsVar2.phc.btk());
            this.fs.xrr = 0L;
        }
        this.fs.zak.fs();
        this.fb.removeCallbacksAndMessages(null);
        this.zn.kw();
        com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.fs.fs);
        com.bytedance.sdk.openadsdk.bjh.zmn.zn.fs(this.fs.fs);
        AdSlot utx = this.fs.fs.utx();
        if (!this.fs.phc.tf() && utx != null && TextUtils.isEmpty(utx.getBidAdm()) && !this.fs.fs.dbc() && !nqi.hhw(this.fs.fs)) {
            cn.fs().post(new com.bytedance.sdk.openadsdk.component.reward.rt(bjh(), utx));
        }
        com.bytedance.sdk.openadsdk.utils.cyb.zmn();
        tf tfVar = this.nps;
        if (tfVar != null) {
            tfVar.btk();
            this.nps = null;
        }
        this.olo.zmn(this);
        ww.zmn().zmn(String.valueOf(hashCode()));
        com.bytedance.sdk.openadsdk.component.fb.zmn.zmn(this.fs.fs);
    }

    public void zmn(boolean z, boolean z2) {
        if (!this.iv || TextUtils.isEmpty(this.fkt)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.am.zmn().zmn(this.fkt, z, z2);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (this.fs == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (!TextUtils.isEmpty(this.fkt)) {
            bundle.putString("single_process_listener_key", this.fkt);
        }
        bundle.putBoolean("enable_new_arch", this.iv);
        nqi nqiVar = this.fs.fs;
        int zmn = nqiVar != null ? com.bytedance.sdk.openadsdk.core.am.zmn().zmn(nqiVar) : -1;
        this.kgc = zmn;
        com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(this.fs, bundle, zmn);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        jy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void rt() {
        jy();
    }

    private void jy() {
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar;
        if (this.fs == null || (fsVar = this.zn) == null) {
            super.onBackPressed();
        } else {
            fsVar.iqz();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null) {
            return;
        }
        fsVar.bjh.zmn();
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.zn;
        if (fsVar == null) {
            return;
        }
        fsVar.zmn(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public final void iv() {
        nqi nqiVar;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || (nqiVar = fsVar.fs) == null || nqiVar.oub()) {
            return;
        }
        toString();
        this.fs.fs.zg(true);
        kw();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.fs;
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = fsVar2.uqh;
        if (bvsVar != null) {
            com.bytedance.sdk.openadsdk.component.fb.zmn.fs(fsVar2.fs, bvsVar.rc());
        }
    }

    protected void iqz() {
        if (kjb() && !this.cn) {
            this.cn = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = tTBaseVideoActivity.fs;
                    fsVar.kjb.zmn(fsVar.bjh.zmn(tTBaseVideoActivity.zg));
                    TTBaseVideoActivity.this.phc();
                }
            });
        }
    }

    protected void doe() {
        Message message = new Message();
        message.what = 400;
        if (bjh()) {
            fs(10000);
        }
        this.fb.sendMessageDelayed(message, 2000L);
    }

    protected void nqi() {
        this.fb.removeMessages(400);
    }

    private boolean vlj() {
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.fs.bvs.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.fs == null) {
            return;
        }
        if (zak.hhw()) {
            jy.fs((Activity) this);
        }
        if (!am.btk(this.fs.fs) || this.fs.nqi.fb(com.bytedance.sdk.openadsdk.component.reward.zmn.bvs.fs)) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }

    protected void zak() {
        nqi nqiVar;
        yj el;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || (nqiVar = fsVar.fs) == null || (el = nqiVar.el()) == null) {
            return;
        }
        if (el.fs() == 1 || el.fs() == 2) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.fs;
            tf tfVar = new tf(fsVar2, fsVar2.fs);
            this.nps = tfVar;
            olo oloVar = this.fs.phc;
            if (oloVar != null) {
                oloVar.zmn(tfVar);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public List<nqi> tet() {
        return this.fs.fs.tl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void yj() {
        this.bvs = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public boolean zmn(long j, boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.view.rc rcVar;
        com.bytedance.sdk.openadsdk.core.model.iqz iqzVar;
        if (this.fs == null) {
            return false;
        }
        this.rt.set(false);
        com.bytedance.sdk.openadsdk.fb.nps zg = this.fs.zg();
        FrameLayout ev = ev();
        if (ev == null) {
            return false;
        }
        this.fs.phc.zmn(ev, zg);
        Map<String, Object> ww = ww();
        zn.zmn zmnVar = new zn.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.4
            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
            public void zmn(long j2, int i) {
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar;
                com.bytedance.sdk.openadsdk.utils.rt rtVar;
                TTBaseVideoActivity.this.rt.get();
                if (TTBaseVideoActivity.this.rt.getAndSet(true)) {
                    return;
                }
                TTBaseVideoActivity.this.rt.set(true);
                TTBaseVideoActivity.this.nqi();
                TTBaseVideoActivity.this.am();
                TTBaseVideoActivity.this.fs.phc.zmn(j2, j2);
                if (TTBaseVideoActivity.this.kjb()) {
                    TTBaseVideoActivity.this.fs.uqh.fs(true);
                } else {
                    TTBaseVideoActivity.this.fs.cyb.set(true);
                }
                TTBaseVideoActivity.this.so();
                if (TTBaseVideoActivity.this.fs.fs.cd() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = TTBaseVideoActivity.this.fs;
                    if (fsVar2.zn) {
                        fsVar2.doe.zn().zmn(TTBaseVideoActivity.this.fs.fs);
                        com.bytedance.sdk.openadsdk.utils.cyb.fs();
                    }
                }
                if (!TTBaseVideoActivity.this.kjb() && TTBaseVideoActivity.this.fs.fs.lgd()) {
                    TTBaseVideoActivity.this.fs.fs.kra(1);
                    TTBaseVideoActivity.this.fs.fkt.kgc();
                }
                if (TTBaseVideoActivity.this.fs.fs.cd() == 21 && !TTBaseVideoActivity.this.fs.fs.kw()) {
                    TTBaseVideoActivity.this.fs.fs.btk(true);
                    TTBaseVideoActivity.this.fs.fkt.kgc();
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.bvs && tTBaseVideoActivity.fs.uqh.klz()) {
                    return;
                }
                if (!TTBaseVideoActivity.this.kjb()) {
                    if (com.bytedance.sdk.openadsdk.core.model.iqz.fb(TTBaseVideoActivity.this.fs.fs) || com.bytedance.sdk.openadsdk.core.model.iqz.fs(TTBaseVideoActivity.this.fs.fs) || com.bytedance.sdk.openadsdk.core.model.iqz.zg(TTBaseVideoActivity.this.fs.fs)) {
                        TTBaseVideoActivity.this.zmn(false, 5);
                        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = TTBaseVideoActivity.this.fs;
                        com.bytedance.sdk.openadsdk.utils.rt rtVar2 = fsVar3.hwg;
                        if (rtVar2 != null) {
                            rtVar2.zmn(fsVar3, 0L);
                            return;
                        }
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.iqz.zmn(TTBaseVideoActivity.this.fs.fs) && !TTBaseVideoActivity.this.fs.mw.get()) {
                        TTBaseVideoActivity.this.fs.zmn(true);
                        TTBaseVideoActivity.this.fs.ev.btk(true);
                        return;
                    }
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar4 = tTBaseVideoActivity2.fs;
                if (fsVar4.zn) {
                    if (fsVar4.fs.na()) {
                        if (TTBaseVideoActivity.this.kjb()) {
                            if (TTBaseVideoActivity.this.fs.uqh.rc() == 1) {
                                TTBaseVideoActivity.this.fs.ev.zn();
                                return;
                            }
                            return;
                        }
                        TTBaseVideoActivity.this.fs.ev.zn();
                        return;
                    }
                    TTBaseVideoActivity.this.zmn(false, 5);
                    if (!TTBaseVideoActivity.this.kjb() && com.bytedance.sdk.openadsdk.core.model.iqz.fs(TTBaseVideoActivity.this.fs.fs) && (rtVar = (fsVar = TTBaseVideoActivity.this.fs).hwg) != null) {
                        rtVar.zmn(fsVar, 0L);
                    }
                    if (nqi.btk(TTBaseVideoActivity.this.fs.fs)) {
                        return;
                    }
                    TTBaseVideoActivity.this.fs.phc.zmn("skip", true);
                    return;
                }
                tTBaseVideoActivity2.hgd();
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
            public void fs(long j2, int i) {
                com.bytedance.sdk.openadsdk.core.model.iqz iqzVar2;
                TTBaseVideoActivity.this.fs.phc.rc();
                com.bytedance.sdk.openadsdk.component.reward.view.rc rcVar2 = TTBaseVideoActivity.this.fs.fkt;
                if (rcVar2 != null && (iqzVar2 = rcVar2.cyb) != null) {
                    iqzVar2.iv();
                }
                if (TTBaseVideoActivity.this.fs.phc.hhw()) {
                    TTBaseVideoActivity.this.doe();
                    return;
                }
                TTBaseVideoActivity.this.fs.phc.iqz();
                TTBaseVideoActivity.this.am();
                if (TTBaseVideoActivity.this.fs.fs.hhw()) {
                    TTBaseVideoActivity.this.fs.uqh.zmn(true);
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.fs.zn) {
                    tTBaseVideoActivity.zmn(false, true, 3);
                    olo oloVar = TTBaseVideoActivity.this.fs.phc;
                    oloVar.zmn(1 ^ (oloVar.nu() ? 1 : 0), 2);
                    return;
                }
                tTBaseVideoActivity.finish();
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
            public void zmn() {
                TTBaseVideoActivity.this.fs.phc.rc();
                TTBaseVideoActivity.this.nqi();
                TTBaseVideoActivity.this.am();
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.fs.zn) {
                    tTBaseVideoActivity.zmn(false, true, 6);
                } else {
                    tTBaseVideoActivity.finish();
                }
                olo oloVar = TTBaseVideoActivity.this.fs.phc;
                oloVar.zmn(!oloVar.nu() ? 1 : 0, 1 ^ (TTBaseVideoActivity.this.fs.phc.nu() ? 1 : 0));
                TTBaseVideoActivity.this.fs.phc.iqz();
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
            public void zmn(long j2, long j3) {
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = TTBaseVideoActivity.this.fs;
                if (!fsVar.cud && fsVar.phc.hhw()) {
                    TTBaseVideoActivity.this.fs.phc.doe();
                }
                if (TTBaseVideoActivity.this.fs.bvs.get()) {
                    return;
                }
                if (j2 != TTBaseVideoActivity.this.fs.phc.rt()) {
                    TTBaseVideoActivity.this.nqi();
                }
                if (TTBaseVideoActivity.this.kjb() && !TTBaseVideoActivity.this.fs.phc.hhw()) {
                    TTBaseVideoActivity.this.fb.removeMessages(300);
                    return;
                }
                TTBaseVideoActivity.this.fs.phc.zmn(j2, j3);
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                long j4 = j2 / 1000;
                tTBaseVideoActivity.btk = (int) (tTBaseVideoActivity.fs.phc.ww() - j4);
                int i = (int) j4;
                if ((TTBaseVideoActivity.this.fs.olo.get() || TTBaseVideoActivity.this.fs.iv.get()) && TTBaseVideoActivity.this.fs.phc.hhw()) {
                    TTBaseVideoActivity.this.fs.phc.doe();
                }
                if (TTBaseVideoActivity.this.bjh()) {
                    TTBaseVideoActivity.this.fs.fkt.btk(i);
                }
                if (TTBaseVideoActivity.this.rp()) {
                    if (TTBaseVideoActivity.this.fs.phc.fb()) {
                        tf tfVar = TTBaseVideoActivity.this.nps;
                        if (tfVar != null) {
                            tfVar.zmn(j2);
                            return;
                        }
                        return;
                    }
                    tf tfVar2 = TTBaseVideoActivity.this.nps;
                    if (tfVar2 == null || !tfVar2.zmn()) {
                        TTBaseVideoActivity.this.zmn(j2, j3);
                        return;
                    }
                    return;
                }
                TTBaseVideoActivity.this.zmn(j2, j3);
            }
        };
        this.fs.phc.zmn(zmnVar);
        if (!this.fs.fs.hhw() && (rcVar = this.fs.fkt) != null && (iqzVar = rcVar.cyb) != null) {
            iqzVar.zmn(zmnVar);
        }
        boolean zmn = this.fs.phc.zmn(j, z, ww, this.zn);
        fs(zmn, z);
        return zmn;
    }

    public void hgd() {
        if (this.fs.fs.na()) {
            if (this.fs.fs.hhw()) {
                if (this.fs.uqh.rc() == 1) {
                    this.fs.ev.zn();
                    return;
                }
                return;
            }
            this.fs.ev.zn();
            return;
        }
        if (!nqi.btk(this.fs.fs)) {
            this.fs.phc.zmn("skip", true);
        }
        finish();
    }

    public boolean nu() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar != null) {
            return fsVar.ve;
        }
        return false;
    }
}
