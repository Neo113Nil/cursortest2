package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.activity.icD;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.icD.so;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.bNS;
import com.bytedance.sdk.openadsdk.icD.yiw;
import com.google.android.material.card.MaterialCardViewHelper;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FullscreenAdScene.java */
/* loaded from: classes2.dex */
public class Jd extends pvs {
    int NB;
    private boolean sUS;

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    protected boolean a_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public String b_() {
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pvs, com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void pvs(Bundle bundle) {
    }

    public Jd(icD icd, cR cRVar, int i) {
        super(icd, cRVar, i);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pvs
    public void icD() {
        if (!cR.NB(this.vG.icD) && !this.vG.vG) {
            this.vG.cRf.pvs(null, "X");
        } else {
            this.vG.cRf.pvs(null, TTAdDislikeToast.getSkipText());
        }
        this.vG.cRf.NB(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pvs, com.bytedance.sdk.openadsdk.activity.sUS
    public void vG(Activity activity) {
        super.vG(activity);
        if (this.vG == null || !icD(this.vG.icD) || pvs(this.vG.icD)) {
            return;
        }
        if (this.sUS) {
            this.sUS = false;
            dyT();
        } else if (this.vG.dx.gA()) {
            dyT();
        }
    }

    private boolean pvs(cR cRVar) {
        return cRVar == null || cRVar.UYh() == 100.0f;
    }

    private boolean icD(cR cRVar) {
        if (cRVar == null) {
            return false;
        }
        return mnm.Jd().uc(String.valueOf(this.vG.sUS));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pvs
    protected void vG() {
        final View Wyp = this.vG.gSd.Wyp();
        if (Wyp != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.Jd.1
                /* JADX WARN: Removed duplicated region for block: B:21:0x00db A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onClick(View view) {
                    boolean z;
                    if (Jd.this.vG.dx.ny() && Jd.this.vG.Wyp.get()) {
                        boolean Ju = Jd.this.vG.Pj.Ju();
                        Jd.this.vG.dx.NB(Ju);
                        Jd.this.vG.gSd.sUS(8);
                        Jd.this.vG.SE.sendEmptyMessageDelayed(600, 5000L);
                        if (!cR.vG(Jd.this.vG.icD)) {
                            return;
                        }
                        if (cR.vG(Jd.this.vG.icD) && Ju) {
                            return;
                        }
                    }
                    if (Jd.this.vG.icD.Uv()) {
                        if (Jd.this.vG.icD.SJ()) {
                            if (Jd.this.vG.sP != null) {
                                Jd.this.vG.icD.cRf(2);
                                z = Jd.this.vG.sP.NB();
                            }
                        } else if (Jd.this.vG.icD.xyK() == 0 && !Jd.this.vG.dx.bNS()) {
                            Jd.this.vG.icD.cRf(11);
                            if (Jd.this.vG.dx.Jd()) {
                                Jd.this.vG.icD.cRf(12);
                            }
                            try {
                                Jd.this.vG.gSd.vA();
                                z = true;
                            } catch (Exception unused) {
                            }
                        }
                        if (z) {
                            Jd.this.vG.dx.ZhG();
                            Jd.this.vG.Pj.qh();
                            Jd.this.vG.Gp.sUS();
                            Jd.this.dyT();
                            return;
                        }
                        return;
                    }
                    z = false;
                    if (z) {
                    }
                }
            };
            Wyp.setOnClickListener(onClickListener);
            Wyp.setTag(Wyp.getId(), onClickListener);
        }
        this.vG.cRf.pvs(new com.bytedance.sdk.openadsdk.component.reward.top.icD() { // from class: com.bytedance.sdk.openadsdk.activity.Jd.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void pvs(View view) {
                if (rCZ.vG(Jd.this.vG.icD) && (rCZ.qh(Jd.this.vG.icD) || Jd.this.vG.Wyp.get())) {
                    if (Jd.this.vG.dyT.zM()) {
                        Jd.this.vG.dyT.icD(5);
                        return;
                    } else {
                        Jd.this.vG.dx.yiw();
                        return;
                    }
                }
                if (rCZ.qh(Jd.this.vG.icD) || (com.bytedance.sdk.openadsdk.core.model.mnm.pvs(Jd.this.vG.icD) && !Jd.this.vG.mnm.get())) {
                    if (!rCZ.vG(Jd.this.vG.icD) && Jd.this.vG.dyT.zM()) {
                        Jd.this.vG.dyT.icD(4);
                    }
                    Jd.this.dyT();
                    return;
                }
                if (Jd.this.vG.icD.gOj()) {
                    if (Jd.this.vG.gSd.qh() != null) {
                        Jd.this.vG.icD.cRf(2);
                        Jd.this.vG.gSd.vA();
                        return;
                    }
                    return;
                }
                if (!Jd.this.vG.vG && Jd.this.vG.icD.Uv() && !Jd.this.vG.icD.SJ()) {
                    Jd.this.vG.icD.cRf(13);
                    try {
                        Jd.this.vG.gSd.vA();
                        return;
                    } catch (Exception unused) {
                    }
                }
                bNS.pvs pvsVar = new bNS.pvs();
                pvsVar.pvs(Jd.this.vG.ny.yiw());
                pvsVar.vG(Jd.this.vG.ny.zM());
                pvsVar.icD(Jd.this.vG.ny.qh());
                pvsVar.vG(3);
                pvsVar.Jd(Jd.this.vG.ny.cR());
                com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(Jd.this.vG.ny.vG(), pvsVar, Jd.this.vG.ny.pvs());
                com.bytedance.sdk.openadsdk.core.rCZ.vG(Jd.this.vG.sUS);
                Jd.this.vG.ny.pvs("skip", false);
                Jd.this.vG.cRf.Jd(false);
                if (Jd.this.vG.vG) {
                    Jd.this.pvs(true, 4);
                } else {
                    Jd.this.dyT();
                }
                if (Jd.this.vG.icD != null && Jd.this.vG.icD.ig() != null && Jd.this.vG.ny != null) {
                    Jd.this.vG.icD.ig().pvs().sUS(Jd.this.vG.ny.yiw());
                    Jd.this.vG.icD.ig().pvs().NB(Jd.this.vG.ny.yiw());
                }
                com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(Jd.this.vG.icD, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void icD(View view) {
                Jd.this.vG.ea = !Jd.this.vG.ea;
                if (Jd.this.icD != null && Jd.this.icD.Jd() != null) {
                    Jd.this.icD.Jd().pvs(Jd.this.vG.ea);
                }
                Jd.this.vG.ny.icD(Jd.this.vG.ea);
                if (!rCZ.kj(Jd.this.vG.icD) || Jd.this.vG.Wyp.get()) {
                    if (rCZ.icD(Jd.this.vG.icD)) {
                        Jd.this.vG.jlb.pvs(Jd.this.vG.ea, true);
                    }
                    Jd.this.vG.dx.Jd(Jd.this.vG.ea);
                    if (Jd.this.vG.icD == null || Jd.this.vG.icD.ig() == null || Jd.this.vG.icD.ig().pvs() == null || Jd.this.vG.ny == null) {
                        return;
                    }
                    if (Jd.this.vG.ea) {
                        Jd.this.vG.icD.ig().pvs().so(Jd.this.vG.ny.yiw());
                    } else {
                        Jd.this.vG.icD.ig().pvs().Mxy(Jd.this.vG.ny.yiw());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void vG(View view) {
                Jd.this.vG.gA.pvs(Jd.this.icD);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void Jd(View view) {
                View view2 = Wyp;
                if (view2 != null) {
                    view2.performClick();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public boolean pvs(long j, boolean z) {
        yiw yiwVar;
        if (this.so.pvs()) {
            if (this.vG.dX != null && this.vG.dX.pvs() != null) {
                yiwVar = this.vG.dX.pvs().getAdShowTime();
            } else {
                yiwVar = new yiw();
            }
            if (this.icD != null && (this.icD instanceof so) && !this.vG.BSi) {
                this.vG.ny.pvs(((so) this.icD).gA(), yiwVar);
            } else {
                this.vG.ny.pvs(this.vG.dX.icD(), yiwVar);
            }
            HashMap hashMap = new HashMap();
            if (this.vG.dX != null) {
                hashMap.put("dynamic_show_type", Integer.valueOf(this.vG.dX.Mxy()));
                JSONObject pvs = this.vG.dX.pvs((JSONObject) null);
                if (pvs != null) {
                    Iterator<String> keys = pvs.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            hashMap.put(next, pvs.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
            this.vG.ny.pvs(new vG.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.Jd.3
                boolean pvs;

                @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
                public void pvs(long j2, int i) {
                    if (this.pvs) {
                        return;
                    }
                    this.pvs = true;
                    Jd.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                    Jd.this.Ju();
                    Jd.this.vG.ny.pvs(j2, j2);
                    Jd.this.vG.dX.icD(true);
                    if (Jd.this.vG.icD.mnm() == 21 && !Jd.this.vG.icD.Jd()) {
                        Jd.this.vG.icD.icD(true);
                        Jd.this.vG.gSd.vA();
                    }
                    if (Jd.this.vG.Ayu) {
                        icD.Jd icD = Jd.this.icD(5);
                        icD.Jd = true;
                        Jd.this.ny().pvs(Jd.this, icD);
                        return;
                    }
                    if (Jd.this.vG.vG) {
                        if (Jd.this.vG.icD.pY()) {
                            if (Jd.this.vG.dX.Mxy() == 1) {
                                Jd.this.vG.cRf.vG();
                                return;
                            }
                            return;
                        } else {
                            Jd.this.pvs(false, 5);
                            if (cR.NB(Jd.this.vG.icD)) {
                                return;
                            }
                            Jd.this.vG.ny.pvs("skip", true);
                            return;
                        }
                    }
                    if (cR.NB(Jd.this.vG.icD)) {
                        Jd.this.dyT();
                        return;
                    }
                    if (Jd.this.vG.dX == null || Jd.this.vG.dX.pvs() == null) {
                        return;
                    }
                    Jd.this.vG.dX.pvs().pvs("0", 0, 0, false);
                    if (Jd.this.vG.dX.so()) {
                        Jd.this.vG.cRf.pvs("0", "X");
                        Jd.this.vG.cRf.NB(true);
                        Jd.this.vG.cRf.vG();
                    }
                }

                @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
                public void icD(long j2, int i) {
                    Jd.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                    if (Jd.this.vG.ny.icD()) {
                        Jd.this.NB();
                        return;
                    }
                    Jd.this.vG.ny.Ju();
                    Ju.pvs("TTAD.AdScene", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                    Jd.this.vG.dX.pvs(true);
                    icD ny = Jd.this.ny();
                    Jd jd = Jd.this;
                    ny.pvs(jd, jd.icD(3));
                }

                @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
                public void pvs() {
                    Jd.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                    Jd.this.Ju();
                    Object[] objArr = new Object[2];
                    icD ny = Jd.this.ny();
                    Jd jd = Jd.this;
                    ny.pvs(jd, jd.icD(6));
                }

                @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
                public void pvs(long j2, long j3) {
                    if (!Jd.this.vG.ZsW && Jd.this.vG.ny.icD()) {
                        Jd.this.vG.ny.bNS();
                    }
                    if (Jd.this.vG.Wyp.get()) {
                        return;
                    }
                    Jd.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                    if (j2 != Jd.this.vG.ny.so()) {
                        Jd.this.Ju();
                    }
                    if (Jd.this.vG.ny.icD()) {
                        Jd.this.vG.ny.pvs(j2, j3);
                        Jd jd = Jd.this;
                        long j4 = j2 / 1000;
                        jd.NB = (int) (jd.vG.ny.Gp() - j4);
                        int i = (int) j4;
                        if ((Jd.this.vG.uc.get() || Jd.this.vG.qh.get()) && Jd.this.vG.ny.icD()) {
                            Jd.this.vG.ny.bNS();
                        }
                        if (Jd.this.vG.dX != null && Jd.this.vG.dX.pvs() != null) {
                            Jd.this.vG.dX.pvs().pvs(String.valueOf(Jd.this.NB), i, 0, false);
                        }
                        Jd.this.pvs((j2 * 1.0f) / j3);
                        if (Jd.this.vG.dX.so() || Jd.this.vG.icD.OBt()) {
                            Jd.this.Jd(i);
                            if (Jd.this.NB >= 0) {
                                Jd.this.vG.cRf.Jd(true);
                                Jd.this.vG.cRf.pvs(String.valueOf(Jd.this.NB), null);
                            }
                        }
                    }
                }
            });
            return this.vG.ny.pvs(j, z, hashMap, this.icD);
        }
        yiw yiwVar2 = new yiw();
        yiwVar2.pvs(System.currentTimeMillis(), 1.0f);
        if (this.icD != null && (this.icD instanceof so)) {
            this.vG.ny.pvs(((so) this.icD).gA(), yiwVar2);
        } else {
            this.vG.ny.pvs(this.vG.gSd.sUS(), yiwVar2);
        }
        vG.pvs pvsVar = new vG.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.Jd.4
            boolean pvs;

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs(long j2, int i) {
                if (this.pvs) {
                    return;
                }
                this.pvs = true;
                Jd.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                Jd.this.Ju();
                Jd.this.vG.ny.pvs(j2, j2);
                Jd.this.vG.zM.set(true);
                if (Jd.this.vG.icD.bGM()) {
                    Jd.this.vG.icD.cRf(1);
                    Jd.this.vG.gSd.vA();
                }
                if (Jd.this.vG.icD.mnm() == 21 && !Jd.this.vG.icD.Jd()) {
                    Jd.this.vG.icD.icD(true);
                    Jd.this.vG.gSd.vA();
                }
                if (Jd.this.vG.Ayu) {
                    icD.Jd icD = Jd.this.icD(5);
                    icD.Jd = true;
                    Jd.this.ny().pvs(Jd.this, icD);
                    return;
                }
                if (Jd.this.vG.vG) {
                    if (Jd.this.vG.icD.pY()) {
                        Jd.this.vG.cRf.vG();
                        return;
                    }
                    Jd.this.pvs(false, 5);
                    if (com.bytedance.sdk.openadsdk.core.model.mnm.icD(Jd.this.vG.icD) && Jd.this.vG.Ye != null) {
                        Jd.this.vG.Ye.pvs(0L);
                    }
                    if (cR.NB(Jd.this.vG.icD)) {
                        return;
                    }
                    Jd.this.vG.ny.pvs("skip", true);
                    return;
                }
                if (Jd.this.vG.icD.pY()) {
                    Jd.this.vG.cRf.vG();
                    return;
                }
                if (!cR.NB(Jd.this.vG.icD)) {
                    Jd.this.vG.ny.pvs("skip", true);
                }
                Jd.this.dyT();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void icD(long j2, int i) {
                Jd.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                if (Jd.this.vG.ny.icD()) {
                    Jd.this.NB();
                    return;
                }
                Jd.this.vG.ny.Ju();
                icD ny = Jd.this.ny();
                Jd jd = Jd.this;
                ny.pvs(jd, jd.icD(3));
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs() {
                Jd.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                Jd.this.Ju();
                Object[] objArr = new Object[2];
                icD ny = Jd.this.ny();
                Jd jd = Jd.this;
                ny.pvs(jd, jd.icD(6));
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs(long j2, long j3) {
                if (!Jd.this.vG.ZsW && Jd.this.vG.ny.icD()) {
                    Jd.this.vG.ny.bNS();
                }
                if (Jd.this.vG.Wyp.get()) {
                    return;
                }
                Jd.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                if (j2 != Jd.this.vG.ny.so()) {
                    Jd.this.Ju();
                }
                Jd.this.vG.ny.pvs(j2, j3);
                Jd jd = Jd.this;
                long j4 = j2 / 1000;
                jd.NB = (int) (jd.vG.ny.Gp() - j4);
                int i = (int) j4;
                if ((Jd.this.vG.uc.get() || Jd.this.vG.qh.get()) && Jd.this.vG.ny.icD()) {
                    Jd.this.vG.ny.bNS();
                }
                Jd.this.Jd(i);
                Jd.this.pvs((j2 * 1.0f) / j3);
                if (Jd.this.NB >= 0) {
                    Jd.this.vG.cRf.pvs(String.valueOf(Jd.this.NB), null);
                }
            }
        };
        this.vG.ny.pvs(pvsVar);
        if (this.vG.gSd.bNS != null) {
            this.vG.gSd.bNS.pvs(pvsVar);
        }
        return this.vG.ny.pvs(j, z, null, this.icD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jd(int i) {
        int zM = mnm.Jd().zM(String.valueOf(this.vG.sUS));
        if (!mnm.Jd().sUS(String.valueOf(this.vG.sUS)) || (!cR.NB(this.vG.icD) && !this.vG.vG)) {
            if (i >= zM) {
                if (!this.vG.rW) {
                    this.vG.pvs(true);
                }
                icD();
                return;
            }
            return;
        }
        if (!this.vG.rW) {
            this.vG.pvs(true);
        }
        if (i <= zM) {
            NB(zM - i);
            this.vG.cRf.NB(false);
        } else {
            icD();
        }
    }

    private void NB(int i) {
        this.vG.cRf.pvs(null, new SpannableStringBuilder(String.format(uc.pvs(mnm.pvs(), "tt_skip_ad_time_text"), Integer.valueOf(i))));
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void c_() {
        if (this.vG.icD.UYh() != 100.0f) {
            this.sUS = true;
        }
        Gp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pvs
    protected void yiw() {
        CvL();
        if (this.so.pvs()) {
            this.vG.dX.Wyp();
        }
    }
}
