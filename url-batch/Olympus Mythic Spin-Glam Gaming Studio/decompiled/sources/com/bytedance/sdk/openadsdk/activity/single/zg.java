package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.activity.single.fs;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.cyb;
import com.bytedance.sdk.openadsdk.common.rt;
import com.bytedance.sdk.openadsdk.common.zmn;
import com.bytedance.sdk.openadsdk.component.reward.klz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.nqi;
import com.bytedance.sdk.openadsdk.core.uqh;
import com.bytedance.sdk.openadsdk.core.widget.kgc;
import com.bytedance.sdk.openadsdk.fb.iv;
import com.bytedance.sdk.openadsdk.utils.kjb;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.O6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class zg implements com.bytedance.sdk.openadsdk.core.cn.fb.fs {
    protected com.bytedance.sdk.openadsdk.component.reward.zmn.fs bvs;
    public String cn;
    private boolean fs;
    protected nqi hhw;
    public int iv;
    protected boolean kgc;
    public boolean klz;
    protected cyb kw;
    public boolean mw;
    protected final fs nps;
    public boolean olo;
    public int rc;
    public String rt;
    private boolean zmn;
    private kgc zn;
    protected final AtomicBoolean zg = new AtomicBoolean(false);
    public boolean cyb = false;

    protected boolean b_() {
        return false;
    }

    public boolean bjh() {
        return false;
    }

    protected abstract boolean c_();

    public abstract String d_();

    public abstract boolean doe();

    public abstract void e_();

    public boolean ev() {
        return false;
    }

    public abstract boolean f_();

    public void fb() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fs(int i) {
    }

    public void hgd() {
    }

    public void iqz() {
    }

    public void kjb() {
    }

    public void mw() {
    }

    public void rt() {
    }

    public boolean so() {
        return false;
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.zmn.fs uqh();

    public abstract com.bytedance.sdk.openadsdk.component.reward.view.zg zmn();

    public void zmn(Activity activity) {
    }

    public void zmn(Activity activity, Bundle bundle) {
    }

    protected abstract void zmn(Activity activity, fs.btk btkVar);

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(Bundle bundle) {
    }

    public void zmn(zg zgVar, zg zgVar2, fs.btk btkVar) {
    }

    protected void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
    }

    public abstract void zmn(String str);

    public void zmn(Map<String, Object> map, float f, float f2) {
    }

    public void zn() {
    }

    public abstract void zn(boolean z);

    public zg(fs fsVar, nqi nqiVar, int i, int i2, boolean z) {
        this.nps = fsVar;
        this.hhw = nqiVar;
        this.iv = i;
        this.rc = i2;
        this.olo = z;
    }

    public boolean nu() {
        fs fsVar = this.nps;
        return fsVar != null && fsVar.zmn(this, this.iv);
    }

    public boolean ww() {
        return this.olo;
    }

    public int oub() {
        return this.rc;
    }

    private cyb zg() {
        return new cyb(this.bvs) { // from class: com.bytedance.sdk.openadsdk.activity.single.zg.1
            @Override // com.bytedance.sdk.openadsdk.common.cyb
            protected boolean zmn() {
                return zg.this.nps.mw();
            }

            @Override // com.bytedance.sdk.openadsdk.common.cyb
            protected void zmn(boolean z) {
                zg.this.nps.fs(z);
            }

            @Override // com.bytedance.sdk.openadsdk.common.cyb
            protected boolean fs() {
                return zg.this.nps.klz().getBoolean("reward_verify", false) || zg.this.nps.olo();
            }

            @Override // com.bytedance.sdk.openadsdk.common.cyb
            protected void zn() {
                zg.this.yof();
            }

            @Override // com.bytedance.sdk.openadsdk.common.cyb
            protected void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
                zg.this.zmn(fsVar);
            }
        };
    }

    private void zmn(cyb cybVar) {
        com.bytedance.sdk.openadsdk.common.zmn.fs(new rt.zmn(this.bvs, "BVA", phc(), nqi()).zmn(b_()).zmn(cybVar).zmn(zak()).zmn());
    }

    private Runnable phc() {
        return new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.zg.2
            @Override // java.lang.Runnable
            public void run() {
                zg.this.yof();
            }
        };
    }

    private zmn.fs nqi() {
        return new zmn.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.zg.3
            @Override // com.bytedance.sdk.openadsdk.common.zmn.fs
            public void zmn(boolean z, int i) {
                zg zgVar = zg.this;
                if (zgVar instanceof zmn) {
                    ((zmn) zgVar).zmn(z, i);
                } else if (zgVar instanceof btk) {
                    zgVar.rc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.zmn.fs
            public void zmn() {
                zg.this.yof();
            }
        };
    }

    private zmn.InterfaceC0146zmn zak() {
        return new zmn.InterfaceC0146zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.zg.4
            @Override // com.bytedance.sdk.openadsdk.common.zmn.InterfaceC0146zmn
            public void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, View view) {
                zg.this.fs(fsVar);
            }
        };
    }

    protected void a_() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar;
        fs fsVar2 = this.nps;
        boolean z = fsVar2 != null && fsVar2.zn();
        if (z && (fsVar = this.bvs) != null && !(fsVar.tdm instanceof hhw)) {
            this.kw = zg();
        }
        if (z) {
            zmn(this.kw);
        }
    }

    protected void zmn(boolean z, boolean z2, boolean z3, int i) {
        this.nps.zmn(this, z, z2, z3, i);
    }

    public fs jy() {
        return this.nps;
    }

    public void kw() {
        kgc kgcVar = this.zn;
        if (kgcVar != null) {
            kgcVar.zg();
            this.zn = null;
        }
        this.zmn = false;
    }

    public final void fs(Activity activity, fs.btk btkVar) {
        if (this.zmn) {
            return;
        }
        this.zmn = true;
        zmn(activity, btkVar);
    }

    public Activity vlj() {
        return this.nps.zg();
    }

    protected void yof() {
        if (this.hhw != null) {
            com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn("videoForceBreak", this.hhw);
        }
        this.nps.nps();
    }

    public boolean dgt() {
        nqi zmn = this.nps.zmn();
        if (zmn != null) {
            List<nqi> tl = zmn.tl();
            for (int i = 0; i < tl.size(); i++) {
                nqi nqiVar = tl.get(i);
                if (nqiVar != null && nqiVar.yof()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void fs(Activity activity) {
        if (com.bytedance.sdk.openadsdk.uqh.btk.bvs() && activity != null && activity.isChangingConfigurations()) {
            fs fsVar = this.nps;
            if (fsVar == null || fsVar.zmn() == null) {
                return;
            }
            iv.zmn(this.nps.zmn(), "close_interception_config_change", this.nps.zmn().btk(), (String) null);
            return;
        }
        Objects.toString(this.nps);
        if (!this.nps.kw() && !dgt()) {
            long bvs = this.nps.zmn().bvs();
            if (bvs > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - bvs;
                if (elapsedRealtime > 0) {
                    this.hhw.fs(elapsedRealtime);
                }
            }
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs uqh = uqh();
            if (uqh != null) {
                uqh.zmn(BackupConstant.CLOSE_NOT_SHOW_ONE_TO_N_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, 1004);
                uqh.rp.zmn();
            }
        }
        cud();
        this.nps.cn();
    }

    protected void cud() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar;
        klz klzVar;
        if (!c_() || (fsVar = this.bvs) == null || (klzVar = fsVar.mpi) == null) {
            return;
        }
        klzVar.fb();
    }

    protected void gn() {
        fs fsVar = this.nps;
        if (fsVar == null || fsVar.kw()) {
            return;
        }
        this.nps.cyb();
        this.nps.phc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void tf() {
        uqd();
    }

    protected final void uqd() {
        this.nps.rt();
    }

    protected final void zmn(boolean z, int i, String str, int i2, String str2, int i3) {
        if (this.nps.olo()) {
            return;
        }
        this.nps.zmn(this, z, i, str, i2, str2, i3);
        klz.zmn(this.hhw, z, i3);
    }

    public void kra() {
        zn(0);
    }

    public void zn(final int i) {
        if (this.nps.klz().getBoolean("reward_verify", false) || this.nps.olo() || this.nps.mw()) {
            return;
        }
        this.nps.klz().putBoolean("reward_verify", true);
        if (uqh() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs uqh = uqh();
        if (com.bytedance.sdk.openadsdk.core.kgc.fb().olo(String.valueOf(uqh.hhw))) {
            zmn(true, uqh.fs.zi(), uqh.fs.rje(), 0, "", i);
        } else {
            com.bytedance.sdk.openadsdk.core.kgc.zn().zmn(na(), new nqi.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.zg.5
                @Override // com.bytedance.sdk.openadsdk.core.nqi.fs
                public void zmn(int i2, String str) {
                    zg.this.zmn(false, 0, "", i2, str, i);
                }

                @Override // com.bytedance.sdk.openadsdk.core.nqi.fs
                public void zmn(uqh.fs fsVar) {
                    zg.this.zmn(fsVar.fs, fsVar.zn.zmn(), fsVar.zn.fs(), 0, "", i);
                }
            });
        }
    }

    public JSONObject na() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("media_extra", this.cn);
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("user_id", this.rt);
            jSONObject.put("trans_id", kjb.zmn().replace("-", ""));
            if (uqh() != null) {
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs uqh = uqh();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, (int) uqh.phc.kjb());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, uqh.fs.rje());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, uqh.fs.zi());
                jSONObject.put("network", com.bytedance.sdk.component.utils.kgc.zn(uqh.oub));
                JSONObject wu = uqh.fs.wu();
                wu.put(O6.X0, com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().fs());
                jSONObject.put("extra", wu);
                jSONObject.put("video_duration", uqh.fs.mrt().hhw());
                String str = "unKnow";
                int mig = uqh.fs.mig();
                if (mig == 2) {
                    str = oub.fs();
                } else if (mig == 1) {
                    str = oub.fb();
                }
                jSONObject.put("user_agent", str);
            }
            return jSONObject;
        } catch (Throwable th) {
            iqz.zmn("Scene", "", th);
            return null;
        }
    }

    public void mhu() {
        com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn = com.bytedance.sdk.openadsdk.core.model.nqi.zmn(CacheDirFactory.getICacheDir(this.hhw.hqs()).zmn(), this.hhw);
        zmn.zmn("material_meta", this.hhw);
        zmn.zmn("ad_slot", this.hhw.utx());
        com.bytedance.sdk.openadsdk.core.cn.btk.zmn.zmn(zmn, new com.bykv.vk.openvk.zmn.zmn.zmn.btk.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.zg.6
            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i) {
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i, String str) {
            }
        });
    }

    public void btk(boolean z) {
        this.fs = z;
    }

    public boolean bxw() {
        return this.fs;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, int i, int i2) {
        this.hhw = nqiVar;
        this.iv = i;
        this.rc = i2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fkt() {
        zn(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public List<com.bytedance.sdk.openadsdk.core.model.nqi> tet() {
        return this.nps.zak();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void yo() {
        fs fsVar = this.nps;
        if (fsVar != null) {
            fsVar.zmn(this, true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public final void xrr() {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar;
        uqd();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        if (fsVar == null || (nqiVar = fsVar.fs) == null) {
            return;
        }
        nqiVar.wl();
        this.bvs.fs.fb(true);
        if (com.bytedance.sdk.openadsdk.core.model.nqi.btk(this.bvs.fs)) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.bvs;
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar2 = fsVar2.fs;
            com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar2, fsVar2.btk, nqiVar2.zvo());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void iv() {
        toString();
        gn();
    }

    public void hhw(boolean z) {
        this.kgc = z;
    }

    public void fs(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        if (fsVar == null) {
            return;
        }
        try {
            int ev = this.nps.ev();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", Math.max(ev, 0));
            com.bytedance.sdk.openadsdk.fb.zn.btk(this.hhw, fsVar.btk, jSONObject);
        } catch (Throwable unused) {
        }
        zn(fsVar);
    }

    public void zn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        if (nu()) {
            return;
        }
        fs.btk btkVar = new fs.btk(8, fsVar);
        btkVar.fb = fsVar.dgt;
        fs fsVar2 = this.nps;
        if (fsVar2 != null) {
            fsVar2.fs(this, btkVar);
        }
    }

    public boolean ve() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs uqh;
        kgc kgcVar;
        if (ww() || (uqh = uqh()) == null || !uqh.fs.nlo() || (kgcVar = this.zn) == null) {
            return false;
        }
        return kgcVar.zmn(uqh.nu);
    }

    public void cd() {
        if (ww() || uqh() == null || uqh().hgd == null || !uqh().fs.nlo()) {
            return;
        }
        kgc kgcVar = new kgc(uqh(), new kgc.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.zg.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.kgc.zmn
            public void zmn() {
                zg zgVar = zg.this;
                zgVar.zn(zgVar.uqh());
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.kgc.zmn
            public void fs() {
                fs fsVar = zg.this.nps;
                if (fsVar != null) {
                    fsVar.yj();
                }
                zg.this.fb(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.kgc.zmn
            public void zn() {
                fs fsVar = zg.this.nps;
                if (fsVar != null) {
                    fsVar.so();
                }
                zg.this.fb(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.kgc.zmn
            public int fb() {
                fs fsVar = zg.this.nps;
                if (fsVar != null) {
                    return fsVar.ev();
                }
                return 0;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.kgc.zmn
            public void btk() {
                zg.this.fb(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.kgc.zmn
            public void hhw() {
                zg.this.fb(1);
            }
        });
        this.zn = kgcVar;
        kgcVar.zmn(uqh().hgd);
    }

    public void fb(int i) {
        fs fsVar = this.nps;
        if (fsVar != null) {
            fsVar.zmn(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void lt() {
        if (uqh() != null) {
            uqh().rp.zmn();
        }
    }
}
