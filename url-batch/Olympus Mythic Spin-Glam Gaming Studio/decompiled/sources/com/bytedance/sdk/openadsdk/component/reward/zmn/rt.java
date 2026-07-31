package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public class rt {
    private String bvs;
    private final fs fs;
    private volatile long hhw;
    private com.bytedance.adsdk.ugeno.fs.zn mw;
    private volatile long nps;
    private boolean olo;
    private com.bytedance.adsdk.ugeno.fs.zn rt;
    private volatile long zg;
    final nqi zmn;
    private FrameLayout zn;
    private final AtomicBoolean fb = new AtomicBoolean(false);
    private final AtomicBoolean btk = new AtomicBoolean(false);
    private final AtomicBoolean iv = new AtomicBoolean(false);
    private long rc = 0;
    private long klz = 0;
    private String cn = null;
    private boolean cyb = false;

    public rt(fs fsVar) {
        this.fs = fsVar;
        this.zmn = fsVar.fs;
        this.bvs = fsVar.btk;
    }

    public void zmn() {
        if (this.olo) {
            return;
        }
        this.olo = true;
        fs();
    }

    void fs() {
        this.zn = (FrameLayout) this.fs.hgd.findViewById(com.bytedance.sdk.openadsdk.utils.olo.olo);
    }

    public void zn() {
        com.bytedance.sdk.openadsdk.core.mw.zg.zmn hgd;
        nqi nqiVar = this.zmn;
        if (nqiVar == null || (hgd = nqiVar.hgd()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.mw.fb.fs fsVar = new com.bytedance.sdk.openadsdk.core.mw.fb.fs(this.fs.nu, this.zmn, hgd, this.bvs, new com.bytedance.sdk.openadsdk.core.mw.nps.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.rt.1
            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.zn
            public void zmn(String str) {
                rt.this.rc = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.zn
            public void zmn(int i, String str, String str2) {
                rt.this.cn = str2;
                rt.this.fb.set(false);
                rt rtVar = rt.this;
                com.bytedance.sdk.openadsdk.fb.zn.zmn(rtVar.zmn, false, rtVar.bvs, X3.g.e, SystemClock.elapsedRealtime() - rt.this.rc, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.zn
            public void fs(String str) {
                rt.this.cn = str;
                rt rtVar = rt.this;
                com.bytedance.sdk.openadsdk.fb.zn.zmn(rtVar.zmn, false, rtVar.bvs, "success", SystemClock.elapsedRealtime() - rt.this.rc, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.fs
            public void zmn() {
                rt.this.btk();
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.fs
            public void zmn(int i, String str) {
                rt.this.fb.set(false);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                rt rtVar = rt.this;
                com.bytedance.sdk.openadsdk.fb.zn.zmn(rtVar.zmn, rtVar.bvs, elapsedRealtime - rt.this.hhw, i, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.fs
            public void zmn(com.bytedance.adsdk.ugeno.fs.zn<View> znVar) {
                rt.this.mw = znVar;
                rt.this.fb.set(true);
                rt.this.nps = SystemClock.elapsedRealtime();
                if (rt.this.fs.yj.iqz()) {
                    View iv = rt.this.fs.fkt.iv();
                    if (iv instanceof com.bytedance.sdk.openadsdk.core.hhw.fb) {
                        ((com.bytedance.sdk.openadsdk.core.hhw.fb) iv).setImageResource(doe.fb(rt.this.fs.oub, "tt_skip_btn"));
                    }
                }
                rt.this.rt();
                rt.this.bvs();
                rt rtVar = rt.this;
                com.bytedance.sdk.openadsdk.fb.zn.zmn(rtVar.zmn, rtVar.bvs, rt.this.nps - rt.this.hhw);
            }
        });
        if (this.zmn.nu() != null) {
            fsVar.zmn(new com.bytedance.sdk.openadsdk.core.mw.nps.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.rt.2
                @Override // com.bytedance.sdk.openadsdk.core.mw.nps.zmn
                public void fs() {
                }

                @Override // com.bytedance.sdk.openadsdk.core.mw.nps.zmn
                public String zmn() {
                    return Constants.NORMAL;
                }
            });
        }
        fsVar.zmn();
        fsVar.zmn(this.fs.fkt.iv());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rt() {
        com.bytedance.sdk.openadsdk.core.mw.zg.zmn nu;
        nqi nqiVar = this.zmn;
        if (nqiVar == null || (nu = nqiVar.nu()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.mw.fb.fs fsVar = new com.bytedance.sdk.openadsdk.core.mw.fb.fs(this.fs.nu, this.zmn, nu, this.bvs, new com.bytedance.sdk.openadsdk.core.mw.nps.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.rt.3
            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.fs
            public void zmn() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.zn
            public void zmn(String str) {
                rt.this.klz = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.zn
            public void zmn(int i, String str, String str2) {
                rt.this.btk.set(false);
                rt rtVar = rt.this;
                com.bytedance.sdk.openadsdk.fb.zn.zmn(rtVar.zmn, true, rtVar.bvs, X3.g.e, SystemClock.elapsedRealtime() - rt.this.klz, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.zn
            public void fs(String str) {
                rt rtVar = rt.this;
                com.bytedance.sdk.openadsdk.fb.zn.zmn(rtVar.zmn, true, rtVar.bvs, "success", SystemClock.elapsedRealtime() - rt.this.klz, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.fs
            public void zmn(int i, String str) {
                rt.this.btk.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.fs
            public void zmn(com.bytedance.adsdk.ugeno.fs.zn<View> znVar) {
                rt.this.rt = znVar;
                rt.this.btk.set(true);
            }
        });
        fsVar.zmn(new com.bytedance.sdk.openadsdk.core.mw.nps.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.rt.4
            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.zmn
            public String zmn() {
                return "overlay";
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.zmn
            public void fs() {
                rt.this.cyb = true;
                rt.this.fs.fkt.iv().performClick();
            }
        });
        fsVar.zmn();
        fsVar.zmn(this.fs.fkt.iv());
    }

    public boolean fb() {
        return this.cyb;
    }

    public void zmn(int i) {
        jy.zmn((View) this.zn, i);
    }

    public void btk() {
        this.hhw = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.fb.zn.zmn(this.zmn, this.bvs);
    }

    public void hhw() {
        this.zg = SystemClock.elapsedRealtime();
    }

    public void nps() {
        iv();
        bvs();
        com.bytedance.adsdk.ugeno.fs.zn znVar = this.mw;
        if (znVar != null) {
            this.zn.addView(znVar.rc(), new FrameLayout.LayoutParams(this.mw.hgd(), this.mw.nu()));
        }
    }

    public void zg() {
        com.bytedance.adsdk.ugeno.fs.zn znVar = this.rt;
        if (znVar != null) {
            this.zn.addView(znVar.rc(), new FrameLayout.LayoutParams(this.rt.hgd(), this.rt.nu()));
        }
    }

    public void bvs() {
        if (this.zg <= 0 || this.nps <= 0 || this.iv.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.nps - this.zg, this.zmn, this.bvs, this.cn);
    }

    public void iv() {
        com.bytedance.sdk.openadsdk.fb.zn.zn(this.zmn, this.bvs);
    }

    public void rc() {
        com.bytedance.sdk.openadsdk.fb.zn.zmn(SystemClock.elapsedRealtime() - this.zg, this.zmn, this.bvs);
    }

    public boolean klz() {
        return this.fb.get();
    }

    public boolean mw() {
        return this.btk.get();
    }
}
