package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.activity.single.fs;
import com.bytedance.sdk.openadsdk.component.reward.zmn.hhw;
import com.bytedance.sdk.openadsdk.component.reward.zmn.olo;
import com.bytedance.sdk.openadsdk.component.reward.zmn.rc;
import com.bytedance.sdk.openadsdk.core.cn.fb.zmn;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.fb.fs;
import com.bytedance.sdk.openadsdk.utils.cyb;
import com.bytedance.sdk.openadsdk.utils.jy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class zmn extends zg implements kjb.zmn, hhw.zmn {
    private boolean am;
    private long bjh;
    protected boolean btk;
    private int doe;
    protected boolean fb;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.fs.fs fs;
    private int iqz;
    private boolean kjb;
    private boolean nqi;
    private Bundle phc;
    private long rp;
    private boolean uqh;
    private CountDownTimer zak;
    protected final kjb zmn;
    protected int zn;

    protected abstract void fs();

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fs(boolean z) {
    }

    public abstract FrameLayout nps();

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void olo() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(boolean z) {
    }

    public zmn(fs fsVar, nqi nqiVar, int i, int i2, boolean z) {
        super(fsVar, nqiVar, i, i2, z);
        this.zmn = new kjb(Looper.getMainLooper(), this);
        this.iqz = 1;
        this.doe = 0;
        this.nqi = false;
        this.fb = false;
        io();
    }

    private void io() {
        this.kjb = am.zn(this.hhw) && this.hhw.sv();
        if (this.kjb) {
            this.rp = this.hhw.ioo() * 1000;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public final void zmn(Activity activity, Bundle bundle) {
        this.phc = bundle;
        super.zmn(activity, bundle);
        zmn(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public final com.bytedance.sdk.openadsdk.component.reward.view.zg zmn() {
        return this.bvs.hgd;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void zmn(Activity activity, fs.btk btkVar) {
        try {
            this.iqz = this.hhw.ol();
            zmn(activity, this.hhw, this.phc);
            if (this.bvs.rje && this.hhw.sv()) {
                this.bvs.dgt = btkVar.fb;
            }
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
            if (fsVar.rje && this.iv > 0) {
                fsVar.dgt = btkVar.fb;
            }
            lbc();
            hwg();
            if (iqz.hhw(this.hhw)) {
                cd();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zmn("TTAD.AdScene", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.cyb.fb.fs();
            yof();
        }
    }

    private void zmn(Activity activity, nqi nqiVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = new com.bytedance.sdk.openadsdk.component.reward.zmn.fs(activity, this.zmn, nqiVar, this, 1, this.nps.fs(), this.bvs);
        this.bvs = fsVar;
        fsVar.rje = this.nps.hhw();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.bvs;
        fsVar2.zi = this.mw;
        fsVar2.nlz = fsVar2.rje && iqz.hhw(nqiVar);
        this.bvs.nkt = this.nps.fb();
        this.bvs.oep = this.nps.uqh();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = this.bvs;
        fsVar3.tdm = this;
        fsVar3.am = this.nps.doe();
        Intent intent = activity.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(this.bvs, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(intent, this.bvs);
            nqiVar.zmn(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.bvs.yo) {
            fs();
        }
        com.bytedance.sdk.openadsdk.component.reward.fs.fs zmn = com.bytedance.sdk.openadsdk.component.reward.fs.hhw.zmn(this.bvs);
        this.fs = zmn;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar4 = this.bvs;
        fsVar4.f3739io = zmn;
        fsVar4.tf.zmn(this);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar5 = this.bvs;
        if (fsVar5.rje) {
            fsVar5.phc.zmn(new zmn.InterfaceC0155zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.zmn.1
                @Override // com.bytedance.sdk.openadsdk.core.cn.fb.zmn.InterfaceC0155zmn
                public void zmn(int i) {
                    zmn zmnVar = zmn.this;
                    fs fsVar6 = zmnVar.nps;
                    if (fsVar6 == null) {
                        return;
                    }
                    fsVar6.fs(zmnVar, i);
                }
            });
            if (!this.nps.rp()) {
                this.nps.uqh().setShowSound(nqi.btk(nqiVar));
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar6 = this.bvs;
        cyb.zmn(nqiVar, fsVar6.oub, fsVar6.btk, fsVar6.ww);
        Objects.toString(this.fs);
    }

    private void lbc() {
        this.bvs.hgd.zmn(this.fs);
        this.fs.zmn(this, this.zmn);
        this.fs.iv();
    }

    private void hwg() {
        this.fs.uqh();
        this.zn = (int) this.bvs.phc.ww();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        if (fsVar.rje) {
            zmn(fsVar.rp.btk());
            zmn(this.bvs.rp.fb());
        }
        a_();
        nkt();
    }

    private void zmn(com.bytedance.sdk.openadsdk.core.zn.fs fsVar) {
        if (fsVar != null) {
            HashMap hashMap = new HashMap();
            try {
                int i = this.rc + 1;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i);
                hashMap.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            fsVar.zmn(hashMap);
        }
    }

    private boolean rje() {
        if (this.hhw.hhw()) {
            return this.bvs.bvs.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void zmn(Activity activity) {
        super.zmn(activity);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        if (fsVar == null) {
            return;
        }
        fsVar.bjh.zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void zn() {
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar;
        super.zn();
        if (this.bvs == null || (fsVar = this.fs) == null) {
            return;
        }
        fsVar.cn();
        this.bvs.cud = true;
        if (rje()) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.bvs;
            fsVar2.ev.zmn(fsVar2.fs.bn());
        }
        this.bvs.fkt.cyb();
        this.bvs.yj.olo();
        this.bvs.nqi.btk();
        if (this.fs.fs()) {
            this.bvs.phc.zmn(this.fs);
            if (this.bvs.phc.gn()) {
                zmn(this.bvs.phc.cn(), true);
            } else if (this.bvs.phc.nps() && this.nps.rp()) {
                hgd();
            } else {
                this.bvs.phc.zmn(false, this, this.doe != 0);
            }
        }
        this.doe++;
        zi();
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = this.bvs.uqh;
        if (bvsVar != null) {
            bvsVar.nps();
        }
        this.bvs.bjh.zmn(this.zmn);
        if (this.nps.rp()) {
            this.bvs.uqh.zmn(0, false);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.kjb) {
            long j = this.bjh;
            if (j != 0 && currentTimeMillis - j > this.rp) {
                jy().zmn(this, zmn(8));
                return;
            }
            if (j != 0) {
                this.rp -= currentTimeMillis - j;
            }
            zmn(this.rp);
        }
    }

    private void zmn(long j) {
        this.zak = new CountDownTimer(j, 1000L) { // from class: com.bytedance.sdk.openadsdk.activity.single.zmn.2
            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                zmn.this.rp = j2;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                fs jy = zmn.this.jy();
                zmn zmnVar = zmn.this;
                jy.zmn(zmnVar, zmnVar.zmn(8));
            }
        }.start();
    }

    private void zi() {
        if (this.hhw.hhw() && !this.nqi) {
            this.nqi = true;
            zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.zmn.3
                @Override // java.lang.Runnable
                public void run() {
                    float[] zmn;
                    if (zmn.this.nps.rp()) {
                        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = zmn.this.bvs;
                        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = zmn.this.bvs;
                        zmn = new float[]{jy.zn(fsVar.nu, fsVar.hgd.getWidth()), jy.zn(fsVar2.nu, fsVar2.hgd.getHeight())};
                    } else {
                        zmn zmnVar = zmn.this;
                        zmn = zmnVar.bvs.bjh.zmn(zmnVar.iqz);
                    }
                    if (zmn.this.bvs.kjb.zmn()) {
                        zmn zmnVar2 = zmn.this;
                        zmnVar2.bvs.kjb.zmn(zmnVar2.hhw);
                    } else {
                        zmn.this.bvs.kjb.zmn(zmn);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void fb() {
        super.fb();
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.fs;
        if (fsVar == null) {
            return;
        }
        fsVar.kgc();
    }

    private void nkt() {
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar;
        if (this.hhw.hhw() || (fsVar = this.fs) == null) {
            return;
        }
        fsVar.zmn(this.bvs.fkt.hhw());
        this.fs.nqi();
    }

    public final void zmn(boolean z, int i) {
        zmn(z, false, i);
    }

    public final void zmn(boolean z, boolean z2, int i) {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        fsVar.tf.zmn(z, z2, false, fsVar.f3739io, i);
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.fs;
        if (fsVar == null) {
            return;
        }
        fsVar.zmn(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void btk() {
        fs fsVar = this.nps;
        if (fsVar != null) {
            fsVar.zmn(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(String str, JSONObject jSONObject) {
        fs fsVar;
        if (str == null || !"skipToNextAd".equals(str) || (fsVar = this.nps) == null) {
            return;
        }
        fsVar.fs(this, zmn(7));
    }

    protected final void hhw() {
        Message message = new Message();
        message.what = 400;
        if (this.hhw.bv()) {
            fs(10000);
        }
        this.zmn.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public boolean zmn(long j, boolean z) {
        iqz iqzVar;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        if (fsVar == null) {
            return false;
        }
        fsVar.uqh.fs(false);
        this.btk = false;
        com.bytedance.sdk.openadsdk.fb.nps bvs = bvs();
        if (nps() == null) {
            return false;
        }
        this.bvs.phc.zmn(nps(), bvs);
        Map<String, Object> zg = this.hhw.hhw() ? zg() : null;
        zn.zmn zmnVar = new zn.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.zmn.4
            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
            public void zmn(long j2, int i) {
                zmn zmnVar2 = zmn.this;
                if (zmnVar2.btk) {
                    return;
                }
                zmnVar2.btk = true;
                boolean hhw = zmnVar2.hhw.hhw();
                zmn.this.zmn.removeMessages(300);
                zmn.this.kgc();
                zmn.this.bvs.phc.zmn(j2, j2);
                if (hhw) {
                    zmn.this.bvs.uqh.fs(true);
                } else {
                    zmn.this.bvs.cyb.set(true);
                }
                if (zmn.this.bvs.fs.cd() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = zmn.this.bvs;
                    if (fsVar2.zn) {
                        fsVar2.doe.zn().zmn(zmn.this.bvs.fs);
                        cyb.fs();
                    }
                }
                if (!hhw && zmn.this.bvs.fs.lgd()) {
                    zmn.this.bvs.fs.kra(1);
                    zmn.this.bvs.fkt.kgc();
                }
                if (zmn.this.bvs.fs.cd() == 21 && !zmn.this.bvs.fs.kw()) {
                    zmn.this.bvs.fs.btk(true);
                    zmn.this.bvs.fkt.kgc();
                }
                fs.btk zmn = zmn.this.zmn(5);
                zmn.btk = true;
                zmn zmnVar3 = zmn.this;
                zmnVar3.nps.zmn(zmnVar3, zmn);
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
            public void fs(long j2, int i) {
                zmn.this.bvs.phc.rc();
                iqz iqzVar2 = zmn.this.bvs.fkt.cyb;
                if (iqzVar2 != null) {
                    iqzVar2.iv();
                }
                if (zmn.this.bvs.phc.hhw()) {
                    zmn.this.hhw();
                    return;
                }
                zmn.this.bvs.phc.iqz();
                if (zmn.this.hhw.hhw()) {
                    zmn.this.bvs.uqh.zmn(true);
                }
                zmn zmnVar2 = zmn.this;
                zmnVar2.nps.zmn(zmnVar2, zmnVar2.zmn(3));
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
            public void zmn() {
                zmn.this.bvs.phc.rc();
                zmn.this.kgc();
                zmn zmnVar2 = zmn.this;
                zmnVar2.nps.zmn(zmnVar2, zmnVar2.zmn(6));
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
            public void zmn(long j2, long j3) {
                com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar;
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = zmn.this.bvs;
                if (!fsVar2.cud && fsVar2.phc.hhw()) {
                    zmn.this.bvs.phc.fs(true);
                }
                if (zmn.this.bvs.bvs.get()) {
                    return;
                }
                if (j2 != zmn.this.bvs.phc.rt()) {
                    zmn.this.kgc();
                }
                if (!zmn.this.bvs.phc.hhw()) {
                    zmn.this.zmn.removeMessages(300);
                    return;
                }
                zmn.this.bvs.phc.zmn(j2, j3);
                int i = (int) (j2 / 1000);
                if ((zmn.this.bvs.olo.get() || zmn.this.bvs.iv.get()) && zmn.this.bvs.phc.hhw()) {
                    zmn.this.bvs.phc.doe();
                }
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = zmn.this.bvs;
                if (fsVar3.fb) {
                    fsVar3.fkt.btk(i);
                }
                if (zmn.this.hhw.hhw() && (bvsVar = zmn.this.bvs.uqh) != null && bvsVar.zmn() != null) {
                    zmn.this.bvs.uqh.zmn().setTime(String.valueOf(zmn.this.zn), i, 0, false);
                    zmn.this.bvs.uqh.zmn().zmn(j2, j3);
                }
                zmn.this.zmn((j2 * 1.0f) / j3);
                zmn.this.bvs.zmn(true);
            }
        };
        this.bvs.phc.zmn(zmnVar);
        if (!this.hhw.hhw() && (iqzVar = this.bvs.fkt.cyb) != null) {
            iqzVar.zmn(zmnVar);
        }
        return this.bvs.phc.zmn(j, z, zg, this.fs);
    }

    public Map<String, Object> zg() {
        nqi nqiVar;
        HashMap hashMap = new HashMap();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        if (fsVar != null && fsVar.uqh != null && (nqiVar = this.hhw) != null && nqiVar.nkt() == 2) {
            hashMap.put("dynamic_show_type", Integer.valueOf(this.bvs.uqh.rc()));
            JSONObject zmn = this.bvs.uqh.zmn((JSONObject) null);
            if (zmn != null) {
                Iterator<String> keys = zmn.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        hashMap.put(next, zmn.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return hashMap;
    }

    public com.bytedance.sdk.openadsdk.fb.nps bvs() {
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar;
        if (this.hhw.hhw()) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
            if (fsVar != null && (bvsVar = fsVar.uqh) != null && bvsVar.zmn() != null) {
                return this.bvs.uqh.zmn().getAdShowTime();
            }
            com.bytedance.sdk.openadsdk.fb.nps npsVar = new com.bytedance.sdk.openadsdk.fb.nps();
            npsVar.zmn(System.currentTimeMillis(), 1.0f);
            return npsVar;
        }
        com.bytedance.sdk.openadsdk.fb.nps npsVar2 = new com.bytedance.sdk.openadsdk.fb.nps();
        npsVar2.zmn(System.currentTimeMillis(), 1.0f);
        return npsVar2;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg, com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void iv() {
        super.iv();
        if (this.hhw.hhw()) {
            this.bvs.uqh.mw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public final void rc() {
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.fs;
        if (fsVar == null) {
            return;
        }
        fsVar.rc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void klz() {
        fs fsVar = this.nps;
        if (fsVar == null) {
            return;
        }
        fsVar.fs(this, zmn(10));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public final void mw() {
        super.mw();
        if (this.bvs == null || com.bytedance.sdk.component.utils.fs.zmn(vlj())) {
            return;
        }
        this.bvs.yj.bjh();
        com.bytedance.sdk.openadsdk.utils.fb.zmn(vlj(), this.bvs.fs);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void rt() {
        super.rt();
        if (this.kjb) {
            this.bjh = System.currentTimeMillis();
            CountDownTimer countDownTimer = this.zak;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.fs;
        if (fsVar == null) {
            return;
        }
        fsVar.olo();
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = this.bvs.uqh;
        if (bvsVar != null) {
            bvsVar.zg();
        }
        if (this.nps.rp()) {
            this.bvs.uqh.zmn(8, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public final void cn() {
        this.bvs.phc.oub();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public final View cyb() {
        return this.bvs.phc.jy();
    }

    protected final void kgc() {
        this.zmn.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void kw() {
        super.kw();
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.fs;
        if (fsVar == null) {
            return;
        }
        fsVar.fs(this.kgc);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.hhw.zmn
    public void zmn(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar, int i) {
        zmn(z, z2, z3, i);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void iqz() {
        super.iqz();
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.fs;
        if (fsVar != null) {
            fsVar.iqz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void zmn(zg zgVar, zg zgVar2, fs.btk btkVar) {
        super.zmn(zgVar, zgVar2, btkVar);
        if (zgVar == this && (zgVar2 instanceof btk)) {
            int i = btkVar.fs;
            if (i == 3) {
                olo oloVar = this.bvs.phc;
                oloVar.zmn(!oloVar.nu() ? 1 : 0, 2);
            } else if (i == 6) {
                olo oloVar2 = this.bvs.phc;
                oloVar2.zmn(!oloVar2.nu() ? 1 : 0, !this.bvs.phc.nu() ? 1 : 0);
            } else if (i == 5 && !nqi.btk(this.bvs.fs) && btkVar.btk) {
                this.bvs.phc.zmn("skip", true);
            }
            this.bvs.ev.zmn(false);
            this.bvs.ev.fb(false);
        }
    }

    public void zmn(float f) {
        fs fsVar = this.nps;
        if (fsVar == null) {
            return;
        }
        fsVar.zmn(f);
        if (this.uqh || this.hhw.cd() == 43 || f < this.hhw.cud() / 100.0f) {
            return;
        }
        zg bjh = this.nps.bjh();
        if (bjh instanceof zmn) {
            ((zmn) bjh).phc();
        }
    }

    public void phc() {
        if (this.uqh) {
            return;
        }
        this.uqh = true;
        mhu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public boolean doe() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        return fsVar != null && fsVar.phc.tf();
    }

    protected fs.btk zmn(int i) {
        fs.btk btkVar = new fs.btk(i, this.bvs);
        btkVar.fb = this.bvs.dgt;
        return btkVar;
    }

    public void nqi() {
        this.nps.zmn(this, zmn(fs.C0189fs.fs));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void zn(boolean z) {
        rc rcVar;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        if (fsVar == null || (rcVar = fsVar.rp) == null) {
            return;
        }
        rcVar.fs(z);
        this.bvs.rp.zn(z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public com.bytedance.sdk.openadsdk.component.reward.zmn.fs uqh() {
        return this.bvs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fb(boolean z) {
        fs fsVar = this.nps;
        if (fsVar != null) {
            fsVar.zmn(this, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public boolean bjh() {
        return this.bvs.uqh.bvs();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void zmn(Map<String, Object> map, float f, float f2) {
        super.zmn(map, f, f2);
        this.nps.zmn(map, this, f, f2);
    }

    public void rp() {
        zi();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void kjb() {
        com.bytedance.sdk.openadsdk.component.reward.view.zn zmn;
        super.kjb();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        if (fsVar == null || (zmn = fsVar.uqh.zmn()) == null || !zmn.bjh()) {
            return;
        }
        lt();
    }

    public void zak() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        if (fsVar == null) {
            return;
        }
        fsVar.phc.cyb();
    }

    public void am() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        if (fsVar != null && fsVar.phc.bvs()) {
            this.bvs.phc.phc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void yj() {
        this.fb = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void zmn(nqi nqiVar, int i, int i2) {
        super.zmn(nqiVar, i, i2);
        io();
        this.nqi = false;
        this.am = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public boolean so() {
        return this.hhw.skn() == 10 && !bjh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public boolean ev() {
        return this.bvs.uqh.iv() && !bjh();
    }
}
