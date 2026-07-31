package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.activity.single.fb;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.kjb;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.kgc;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class iv {
    protected final Activity bvs;
    protected boolean cn;
    protected boolean cyb;
    private fb.hhw fs;

    @NonNull
    protected final nqi iv;
    protected com.bytedance.sdk.openadsdk.doe.zmn.zmn kgc;
    protected final fs klz;
    protected AtomicBoolean kw = new AtomicBoolean(false);
    protected boolean mw;
    protected FrameLayout olo;
    protected final String rc;
    protected boolean rt;
    protected volatile boolean zg;
    private com.bytedance.sdk.openadsdk.core.widget.kgc zmn;
    private boolean zn;

    public boolean iv() {
        return false;
    }

    public int nps() {
        return 0;
    }

    public void zmn(int i) {
    }

    public iv(fs fsVar) {
        this.klz = fsVar;
        this.bvs = fsVar.nu;
        this.rc = fsVar.btk;
        nqi nqiVar = fsVar.fs;
        this.iv = nqiVar;
        this.rt = am.btk(nqiVar);
    }

    public void zmn() {
        if (this.rt && !this.mw) {
            this.mw = true;
        }
    }

    private void cyb() {
        if (this.klz.fs.nlo()) {
            com.bytedance.sdk.openadsdk.core.widget.kgc kgcVar = new com.bytedance.sdk.openadsdk.core.widget.kgc(this.klz, new kgc.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.iv.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.kgc.zmn
                public void zmn() {
                    iv.this.klz.ww.zmn("skipToNextAd", (JSONObject) null);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.kgc.zmn
                public void fs() {
                    fkt nps = iv.this.kgc.nps();
                    if (nps != null) {
                        nps.zmn("popupDidDismiss", (JSONObject) null);
                    }
                    iv.this.fb(true);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.kgc.zmn
                public void zn() {
                    com.bytedance.sdk.openadsdk.activity.single.zg zgVar;
                    com.bytedance.sdk.openadsdk.activity.single.fs jy;
                    fkt nps = iv.this.kgc.nps();
                    if (nps != null) {
                        nps.zmn("popupDidShow", (JSONObject) null);
                    }
                    fs fsVar = iv.this.klz;
                    if (!fsVar.rje || (zgVar = fsVar.tdm) == null || (jy = zgVar.jy()) == null) {
                        return;
                    }
                    jy.so();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.kgc.zmn
                public int fb() {
                    iv ivVar = iv.this;
                    if (ivVar.klz.rje) {
                        return ivVar.klz();
                    }
                    return ivVar.zg();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.kgc.zmn
                public void btk() {
                    iv.this.olo();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.kgc.zmn
                public void hhw() {
                    iv.this.fb(false);
                }
            });
            this.zmn = kgcVar;
            kgcVar.zmn(this.klz.hgd);
            fkt nps = this.kgc.nps();
            if (nps != null) {
                nps.zmn(new kjb() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.iv.2
                    @Override // com.bytedance.sdk.openadsdk.core.kjb
                    public void r_() {
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.kjb
                    public void m_() {
                        if (iv.this.zmn != null) {
                            iv.this.zmn.zmn(iv.this.klz.nu);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.kjb
                    public void n_() {
                        if (iv.this.zmn != null) {
                            iv.this.zmn.n_();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.kjb
                    public int o_() {
                        iv ivVar = iv.this;
                        if (ivVar.klz.rje) {
                            return ivVar.klz();
                        }
                        return ivVar.zg();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.kjb
                    public void p_() {
                        iv.this.olo();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.kjb
                    public void q_() {
                        iv.this.fb(false);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fb(boolean z) {
        com.bytedance.sdk.openadsdk.activity.single.fs jy;
        fs fsVar = this.klz;
        if (fsVar.rje) {
            com.bytedance.sdk.openadsdk.activity.single.zg zgVar = fsVar.tdm;
            if (zgVar == null || (jy = zgVar.jy()) == null) {
                return;
            }
            if (z) {
                jy.yj();
            }
            jy.zmn(1);
            return;
        }
        if (this instanceof zg) {
            zmn(0L);
        } else {
            fb.hhw hhwVar = this.fs;
            if (hhwVar != null) {
                hhwVar.zn();
            }
        }
        this.zn = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void olo() {
        com.bytedance.sdk.openadsdk.activity.single.fs jy;
        fs fsVar = this.klz;
        if (fsVar.rje) {
            com.bytedance.sdk.openadsdk.activity.single.zg zgVar = fsVar.tdm;
            if (zgVar == null || (jy = zgVar.jy()) == null) {
                return;
            }
            jy.zmn(2);
            return;
        }
        if (this instanceof zg) {
            bvs();
        } else {
            fb.hhw hhwVar = this.fs;
            if (hhwVar != null) {
                hhwVar.fs();
            }
        }
        this.zn = true;
    }

    public boolean rc() {
        return !this.zn;
    }

    public void fs(boolean z) {
        if (this.rt) {
            fs fsVar = this.klz;
            if (fsVar.vlj) {
                this.olo = (FrameLayout) fsVar.hgd.findViewById(com.bytedance.sdk.openadsdk.utils.olo.qv);
                zmn(z);
                cyb();
            }
        }
    }

    protected void zmn(boolean z) {
        FrameLayout frameLayout = this.olo;
        if (frameLayout != null) {
            fs fsVar = this.klz;
            Context context = fsVar.oub;
            nqi nqiVar = this.iv;
            int i = fsVar.kra;
            com.bytedance.sdk.openadsdk.activity.single.zg zgVar = fsVar.tdm;
            com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = new com.bytedance.sdk.openadsdk.doe.zmn.zmn(context, nqiVar, i, z, frameLayout, false, zgVar != null ? zgVar.oub() : 0);
            this.kgc = zmnVar;
            zmnVar.zmn(this.klz.ww);
            this.kgc.zmn(true, fs());
        }
    }

    protected com.bytedance.sdk.openadsdk.mw.nps fs() {
        return new com.bytedance.sdk.openadsdk.mw.nps() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.iv.3
            @Override // com.bytedance.sdk.openadsdk.mw.nps
            public void zmn() {
                iv.this.klz.ww.fs(false);
            }
        };
    }

    public void zn() {
        if (this.rt) {
            this.zg = true;
            zn(this.klz.dgt);
            this.kgc.zmn();
            kgc();
            if (am.zg(this.iv)) {
                this.klz.yj.hhw();
            }
        }
    }

    private void kgc() {
        int ba = this.iv.ba();
        if (ba == -1) {
            if (am.nps(this.iv)) {
                com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.kgc;
                if (zmnVar != null && zmnVar.btk()) {
                    this.klz.cyb.set(true);
                    this.klz.f3739io.mw();
                    return;
                } else {
                    this.klz.f3739io.phc();
                    return;
                }
            }
            this.klz.cyb.set(true);
            this.klz.f3739io.mw();
            return;
        }
        if (ba >= 0) {
            this.klz.ev.fb(false);
            if (am.nps(this.iv)) {
                com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar2 = this.kgc;
                if (zmnVar2 != null && zmnVar2.btk()) {
                    fb.hhw hhwVar = new fb.hhw(ba) { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.iv.4
                        @Override // com.bytedance.sdk.openadsdk.activity.single.fb.hhw
                        public void zmn() {
                            iv.this.klz.jy.sendEmptyMessage(600);
                        }
                    };
                    this.fs = hhwVar;
                    hhwVar.btk();
                    return;
                } else {
                    fb.hhw hhwVar2 = new fb.hhw(ba) { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.iv.5
                        @Override // com.bytedance.sdk.openadsdk.activity.single.fb.hhw
                        public void zmn() {
                            iv.this.klz.jy.sendEmptyMessage(1);
                        }
                    };
                    this.fs = hhwVar2;
                    hhwVar2.btk();
                    return;
                }
            }
            fb.hhw hhwVar3 = new fb.hhw(ba) { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.iv.6
                @Override // com.bytedance.sdk.openadsdk.activity.single.fb.hhw
                public void zmn() {
                    iv.this.klz.jy.sendEmptyMessage(600);
                }
            };
            this.fs = hhwVar3;
            hhwVar3.btk();
        }
    }

    public void fb() {
        if (!this.rt || this.kw.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.kgc;
        if (zmnVar != null) {
            zmnVar.fs();
        }
        if (this.fs == null || !rc()) {
            return;
        }
        this.fs.zn();
    }

    public void btk() {
        if (!this.rt || this.kw.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.kgc;
        if (zmnVar != null) {
            zmnVar.zn();
        }
        fb.hhw hhwVar = this.fs;
        if (hhwVar != null) {
            hhwVar.fs();
        }
    }

    public void hhw() {
        if (this.rt && !this.cyb) {
            this.cyb = true;
            com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.kgc;
            if (zmnVar != null) {
                zmnVar.fb();
            }
            FrameLayout frameLayout = this.olo;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            com.bytedance.sdk.openadsdk.core.widget.kgc kgcVar = this.zmn;
            if (kgcVar != null) {
                kgcVar.zg();
                this.zmn = null;
            }
            fb.hhw hhwVar = this.fs;
            if (hhwVar != null) {
                hhwVar.fb();
                this.fs = null;
            }
        }
    }

    public void zmn(long j) {
        fb.hhw hhwVar = this.fs;
        if (hhwVar != null) {
            hhwVar.zn();
        }
    }

    public void bvs() {
        fb.hhw hhwVar = this.fs;
        if (hhwVar != null) {
            hhwVar.fs();
        }
    }

    public int klz() {
        com.bytedance.sdk.openadsdk.activity.single.fs jy;
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar = this.klz.tdm;
        if (zgVar == null || (jy = zgVar.jy()) == null) {
            return 0;
        }
        return jy.ev();
    }

    public int zg() {
        fb.hhw hhwVar = this.fs;
        if (hhwVar != null) {
            return (int) (hhwVar.hhw() / 1000);
        }
        return 0;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.zn.btk btkVar) {
        com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar;
        if (this.rt && (zmnVar = this.kgc) != null) {
            zmnVar.zmn(btkVar);
        }
    }

    public void zn(boolean z) {
        if (this.rt && this.kgc != null && this.zg) {
            this.kgc.zmn(z);
        }
    }

    public boolean mw() {
        return this.zg;
    }

    public void rt() {
        if (this.kw.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.kgc;
            if (zmnVar != null) {
                zmnVar.zmn(true);
            }
            this.klz.yj.nps(true);
            fs fsVar = this.klz;
            fsVar.tf.zmn(true, fsVar.f3739io);
            if (this.klz.tf.btk()) {
                fs fsVar2 = this.klz;
                com.bytedance.sdk.openadsdk.utils.rt rtVar = fsVar2.hwg;
                if (rtVar != null) {
                    rtVar.zmn(fsVar2, fsVar2.nps);
                    return;
                }
                return;
            }
            fs fsVar3 = this.klz;
            fsVar3.yj.zmn(fsVar3.dgt, true);
            this.klz.yj.zn(true);
            this.klz.yj.fs(true);
            this.klz.jy.removeMessages(600);
            return;
        }
        this.klz.yj.nps();
    }

    public boolean cn() {
        com.bytedance.sdk.openadsdk.core.widget.kgc kgcVar = this.zmn;
        if (kgcVar != null) {
            return kgcVar.bvs();
        }
        return false;
    }
}
