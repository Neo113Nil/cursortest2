package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.WorkRequest;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.icD;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.cR;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.vA;
import com.bytedance.sdk.openadsdk.core.widget.pvs;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.bNS;
import com.bytedance.sdk.openadsdk.icD.yiw;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.material.card.MaterialCardViewHelper;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardAdScene.java */
/* loaded from: classes2.dex */
public class NB extends pvs {
    private static String IP;
    private static String Ju;
    private static String bNS;
    private static String mnm;
    private static String vA;
    protected int NB;
    private String cR;
    protected int sUS;
    private int uc;
    int yiw;
    private String zM;

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    protected boolean a_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public String b_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pvs, com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void pvs(Bundle bundle) {
    }

    public NB(icD icd, cR cRVar, int i) {
        super(icd, cRVar, i);
        this.uc = -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pvs, com.bytedance.sdk.openadsdk.activity.sUS
    public void pvs(Activity activity, icD.Jd jd) {
        super.pvs(activity, jd);
        if (activity.isFinishing()) {
            return;
        }
        Intent intent = activity.getIntent();
        this.zM = intent.getStringExtra("media_extra");
        this.cR = intent.getStringExtra("user_id");
        try {
            if (mnm == null) {
                mnm = uc.pvs(this.vG.jhZ, "tt_reward_msg");
                Ju = uc.pvs(this.vG.jhZ, "tt_msgPlayable");
                bNS = uc.pvs(this.vG.jhZ, "tt_negtiveBtnBtnText");
                vA = uc.pvs(this.vG.jhZ, "tt_postiveBtnText");
                IP = uc.pvs(this.vG.jhZ, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            Ju.pvs("TTAD.RewardAdScene", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pvs
    protected void icD() {
        this.vG.cRf.pvs(null, TTAdDislikeToast.getSkipText());
        this.vG.cRf.NB(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pvs
    protected void vG() {
        final View Wyp = this.vG.gSd.Wyp();
        if (Wyp != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.NB.1
                /* JADX WARN: Removed duplicated region for block: B:21:0x00dc A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onClick(View view) {
                    boolean z;
                    if (NB.this.vG.dx.ny() && NB.this.vG.Wyp.get()) {
                        boolean Ju2 = NB.this.vG.Pj.Ju();
                        NB.this.vG.dx.NB(Ju2);
                        NB.this.vG.gSd.sUS(8);
                        NB.this.vG.SE.sendEmptyMessageDelayed(600, 5000L);
                        if (!cR.vG(NB.this.vG.icD)) {
                            return;
                        }
                        if (cR.vG(NB.this.vG.icD) && Ju2) {
                            return;
                        }
                    }
                    if (NB.this.vG.icD.Uv()) {
                        if (NB.this.vG.icD.SJ()) {
                            if (NB.this.vG.sP != null) {
                                NB.this.vG.icD.cRf(2);
                                z = NB.this.vG.sP.NB();
                            }
                        } else if (NB.this.vG.icD.xyK() == 0 && !NB.this.vG.dx.bNS()) {
                            NB.this.vG.icD.cRf(11);
                            if (NB.this.vG.dx.Jd()) {
                                NB.this.vG.icD.cRf(12);
                            }
                            try {
                                NB.this.vG.gSd.vA();
                                z = true;
                            } catch (Exception unused) {
                            }
                        }
                        if (z) {
                            NB.this.vG.dx.ZhG();
                            NB.this.vG.Pj.qh();
                            NB.this.vG.Gp.sUS();
                            if (rCZ.qh(NB.this.vG.icD) && !rCZ.vG(NB.this.vG.icD)) {
                                NB.this.pvs(true, true);
                                return;
                            } else {
                                NB.this.dyT();
                                return;
                            }
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
        this.vG.cRf.pvs(new com.bytedance.sdk.openadsdk.component.reward.top.icD() { // from class: com.bytedance.sdk.openadsdk.activity.NB.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void pvs(View view) {
                if (NB.this.vG.icD.gOj()) {
                    if (NB.this.vG.gSd.qh() != null) {
                        NB.this.vG.icD.cRf(2);
                        NB.this.vG.gSd.vA();
                        return;
                    }
                    return;
                }
                if (!NB.this.vG.vG && NB.this.vG.icD.Uv() && !NB.this.vG.icD.SJ()) {
                    NB.this.vG.icD.cRf(13);
                    try {
                        NB.this.vG.gSd.vA();
                        return;
                    } catch (Exception unused) {
                    }
                }
                NB nb = NB.this;
                nb.pvs(rCZ.qh(nb.vG.icD), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void icD(View view) {
                if (NB.this.icD != null && NB.this.icD.Jd() != null) {
                    NB.this.icD.Jd().pvs(NB.this.vG.ea);
                }
                NB.this.vG.ea = !NB.this.vG.ea;
                Object[] objArr = new Object[2];
                String str = "will set is Mute " + NB.this.vG.ea + " mLastVolume=" + NB.this.vG.jlb.pvs();
                NB.this.vG.ny.icD(NB.this.vG.ea);
                if (!rCZ.kj(NB.this.vG.icD) || NB.this.vG.Wyp.get()) {
                    if (rCZ.icD(NB.this.vG.icD)) {
                        NB.this.vG.jlb.pvs(NB.this.vG.ea, true);
                    }
                    NB.this.vG.dx.Jd(NB.this.vG.ea);
                    if (NB.this.vG.icD == null || NB.this.vG.icD.ig() == null || NB.this.vG.icD.ig().pvs() == null || NB.this.vG.ny == null) {
                        return;
                    }
                    if (NB.this.vG.ea) {
                        NB.this.vG.icD.ig().pvs().so(NB.this.vG.ny.yiw());
                    } else {
                        NB.this.vG.icD.ig().pvs().Mxy(NB.this.vG.ny.yiw());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void vG(View view) {
                NB.this.vG.gA.pvs(NB.this.icD);
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

    @Override // com.bytedance.sdk.openadsdk.activity.pvs, com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void pvs(int i) {
        if (i == 10000) {
            OT();
        }
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
            this.vG.ny.pvs(this.vG.dX.icD(), yiwVar);
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
            this.vG.ny.pvs(new vG.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.NB.3
                boolean pvs;

                @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
                public void pvs(long j2, int i) {
                    if (this.pvs) {
                        return;
                    }
                    this.pvs = true;
                    NB.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                    NB.this.Ju();
                    NB.this.vG.ny.pvs(j2, j2);
                    NB.this.vG.dX.icD(true);
                    if (NB.this.vG.icD.mnm() == 21 && !NB.this.vG.icD.Jd()) {
                        NB.this.vG.icD.icD(true);
                        NB.this.vG.gSd.vA();
                    }
                    if (NB.this.vG.Ayu) {
                        icD ny = NB.this.ny();
                        NB nb = NB.this;
                        ny.pvs(nb, nb.icD(5));
                    } else if (NB.this.vG.vG) {
                        if (NB.this.vG.icD.pY()) {
                            if (NB.this.vG.dX.Mxy() == 1) {
                                NB.this.vG.cRf.vG();
                            }
                        } else {
                            NB.this.pvs(false, 5);
                            if (!cR.NB(NB.this.vG.icD)) {
                                NB.this.vG.ny.pvs("skip", true);
                            }
                        }
                    } else if (NB.this.vG.icD.pY()) {
                        if (NB.this.vG.dX.Mxy() == 1) {
                            NB.this.vG.cRf.vG();
                        }
                    } else {
                        if (!cR.NB(NB.this.vG.icD)) {
                            NB.this.vG.ny.pvs("skip", true);
                        }
                        NB.this.dyT();
                    }
                    NB.this.NB = (int) (System.currentTimeMillis() / 1000);
                    if (NB.this.vG.Ayu) {
                        return;
                    }
                    NB.this.OT();
                }

                @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
                public void icD(long j2, int i) {
                    NB.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                    if (NB.this.vG.ny.icD()) {
                        NB.this.NB();
                        return;
                    }
                    NB.this.OT();
                    NB.this.vG.ny.Ju();
                    NB.this.vG.dX.pvs(true);
                    icD ny = NB.this.ny();
                    NB nb = NB.this;
                    ny.pvs(nb, nb.icD(3));
                }

                @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
                public void pvs() {
                    NB.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                    NB.this.Ju();
                    NB.this.OT();
                    icD ny = NB.this.ny();
                    NB nb = NB.this;
                    ny.pvs(nb, nb.icD(6));
                }

                @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
                public void pvs(long j2, long j3) {
                    if (!NB.this.vG.ZsW && NB.this.vG.ny.icD()) {
                        NB.this.vG.ny.bNS();
                    }
                    if (NB.this.vG.Wyp.get()) {
                        return;
                    }
                    NB.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                    if (j2 != NB.this.vG.ny.so()) {
                        NB.this.Ju();
                    }
                    if (NB.this.vG.ny.icD()) {
                        NB.this.vG.ny.pvs(j2, j3);
                        int Wyp = mnm.Jd().Wyp(String.valueOf(NB.this.vG.sUS));
                        boolean z2 = NB.this.vG.dX.so() && Wyp != -1 && Wyp >= 0;
                        NB nb = NB.this;
                        long j4 = j2 / 1000;
                        nb.yiw = (int) (nb.vG.ny.Gp() - j4);
                        int i = (int) j4;
                        if ((NB.this.vG.uc.get() || NB.this.vG.qh.get()) && NB.this.vG.ny.icD()) {
                            NB.this.vG.ny.bNS();
                        }
                        if (NB.this.yiw >= 0) {
                            NB.this.vG.cRf.pvs(String.valueOf(NB.this.yiw), null);
                        }
                        NB.this.vG.gSd.NB(i);
                        NB.this.pvs(j2, j3);
                        if (NB.this.vG.dX != null && NB.this.vG.dX.pvs() != null) {
                            NB.this.vG.dX.pvs().pvs(String.valueOf(NB.this.yiw), i, 0, false);
                        }
                        NB.this.pvs((j2 * 1.0f) / j3);
                        if (NB.this.yiw > 0) {
                            if (z2 && i >= Wyp && NB.this.vG.icD.mnm() != 5) {
                                NB.this.vG.pvs(true);
                                NB.this.vG.cRf.pvs(String.valueOf(NB.this.yiw), TTAdDislikeToast.getSkipText());
                                NB.this.vG.cRf.NB(true);
                                return;
                            }
                            NB.this.vG.cRf.pvs(String.valueOf(NB.this.yiw), null);
                        }
                    }
                }
            });
            boolean pvs2 = this.vG.ny.pvs(j, z, hashMap, this.icD);
            if (pvs2 && !z) {
                this.sUS = (int) (System.currentTimeMillis() / 1000);
            }
            return pvs2;
        }
        yiw yiwVar2 = new yiw();
        yiwVar2.pvs(System.currentTimeMillis(), 1.0f);
        this.vG.ny.pvs(this.vG.gSd.sUS(), yiwVar2);
        vG.pvs pvsVar = new vG.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.NB.4
            boolean pvs;

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs(long j2, int i) {
                if (this.pvs) {
                    return;
                }
                this.pvs = true;
                NB.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                NB.this.Ju();
                if (!NB.this.vG.Ayu) {
                    NB.this.OT();
                }
                NB.this.vG.ny.pvs(j2, j2);
                NB.this.vG.zM.set(true);
                if (NB.this.vG.icD.bGM()) {
                    NB.this.vG.icD.cRf(1);
                    NB.this.vG.gSd.vA();
                }
                if (NB.this.vG.icD.mnm() == 21 && !NB.this.vG.icD.Jd()) {
                    NB.this.vG.icD.icD(true);
                    NB.this.vG.gSd.vA();
                }
                NB.this.NB = (int) (System.currentTimeMillis() / 1000);
                if (NB.this.vG.Ayu) {
                    icD.Jd icD = NB.this.icD(5);
                    icD.Jd = true;
                    NB.this.ny().pvs(NB.this, icD);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.mnm.vG(NB.this.vG.icD) || com.bytedance.sdk.openadsdk.core.model.mnm.icD(NB.this.vG.icD) || com.bytedance.sdk.openadsdk.core.model.mnm.Jd(NB.this.vG.icD)) {
                    NB.this.pvs(false, 5);
                    if (!com.bytedance.sdk.openadsdk.core.model.mnm.icD(NB.this.vG.icD) || NB.this.vG.Ye == null) {
                        return;
                    }
                    NB.this.vG.Ye.pvs(0L);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.mnm.pvs(NB.this.vG.icD) && !NB.this.vG.mnm.get()) {
                    NB.this.vG.pvs(true);
                    NB.this.vG.cRf.NB(true);
                    return;
                }
                if (NB.this.vG.vG) {
                    if (NB.this.vG.icD.pY()) {
                        NB.this.vG.cRf.vG();
                        return;
                    }
                    NB.this.pvs(false, 5);
                    if (cR.NB(NB.this.vG.icD)) {
                        return;
                    }
                    NB.this.vG.ny.pvs("skip", true);
                    return;
                }
                if (NB.this.vG.icD.pY()) {
                    NB.this.vG.cRf.vG();
                    return;
                }
                if (!cR.NB(NB.this.vG.icD)) {
                    NB.this.vG.ny.pvs("skip", true);
                }
                NB.this.dyT();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void icD(long j2, int i) {
                NB.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                if (NB.this.vG.ny.icD()) {
                    NB.this.NB();
                    return;
                }
                NB.this.vG.ny.Ju();
                NB.this.OT();
                icD ny = NB.this.ny();
                NB nb = NB.this;
                ny.pvs(nb, nb.icD(3));
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs() {
                NB.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                NB.this.Ju();
                NB.this.OT();
                icD ny = NB.this.ny();
                NB nb = NB.this;
                ny.pvs(nb, nb.icD(6));
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs(long j2, long j3) {
                if (!NB.this.vG.ZsW && NB.this.vG.ny.icD()) {
                    NB.this.vG.ny.bNS();
                }
                if (NB.this.vG.Wyp.get()) {
                    return;
                }
                NB.this.pvs.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                if (j2 != NB.this.vG.ny.so()) {
                    NB.this.Ju();
                }
                NB.this.vG.ny.pvs(j2, j3);
                NB nb = NB.this;
                long j4 = j2 / 1000;
                double d = j4;
                nb.yiw = (int) (nb.vG.ny.Gp() - d);
                if (NB.this.yiw >= 0) {
                    NB.this.vG.cRf.pvs(String.valueOf(NB.this.yiw), null);
                }
                NB nb2 = NB.this;
                nb2.yiw = (int) (nb2.vG.ny.Gp() - d);
                int i = (int) j4;
                int Wyp = mnm.Jd().Wyp(String.valueOf(NB.this.vG.sUS));
                boolean z2 = Wyp >= 0;
                if ((NB.this.vG.uc.get() || NB.this.vG.qh.get()) && NB.this.vG.ny.icD()) {
                    NB.this.vG.ny.bNS();
                }
                NB.this.vG.gSd.NB(i);
                NB.this.pvs(j2, j3);
                NB.this.pvs((j2 * 1.0f) / j3);
                if (NB.this.yiw > 0) {
                    NB.this.vG.cRf.Jd(true);
                    if (z2 && i >= Wyp) {
                        NB.this.vG.pvs(true);
                        NB.this.vG.cRf.pvs(String.valueOf(NB.this.yiw), TTAdDislikeToast.getSkipText());
                        NB.this.vG.cRf.NB(true);
                        return;
                    }
                    NB.this.vG.cRf.pvs(String.valueOf(NB.this.yiw), null);
                }
            }
        };
        this.vG.ny.pvs(pvsVar);
        if (this.vG.gSd.bNS != null) {
            this.vG.gSd.bNS.pvs(pvsVar);
        }
        boolean pvs3 = this.vG.ny.pvs(j, z, null, this.icD);
        if (pvs3 && !z) {
            this.sUS = (int) (System.currentTimeMillis() / 1000);
        }
        return pvs3;
    }

    protected void pvs(long j, long j2) {
        if (this.vG.Ayu) {
            return;
        }
        long j3 = j + (this.vG.CjQ * 1000);
        if (this.uc == -1) {
            this.uc = mnm.Jd().Gp(String.valueOf(this.vG.sUS)).sUS;
        }
        if (j2 <= 0) {
            return;
        }
        if (j2 >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS && j3 >= 27000) {
            OT();
        } else if ((j3 * 100) / j2 >= this.uc) {
            OT();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void c_() {
        Gp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pvs
    protected void yiw() {
        CvL();
        if (this.so.pvs()) {
            this.vG.dX.Wyp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pvs, com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void kj() {
        OT();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if (r1 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (((1.0d - (r8.yiw / r8.vG.ny.Gp())) * 100.0d) >= r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        r2 = true;
     */
    @Override // com.bytedance.sdk.openadsdk.activity.pvs, com.bytedance.sdk.openadsdk.activity.sUS, com.bytedance.sdk.openadsdk.core.video.vG.icD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IP() {
        if (!this.so.FJ()) {
            return;
        }
        int i = mnm.Jd().Gp(String.valueOf(this.vG.sUS)).sUS;
        boolean z = false;
        if (!rCZ.kj(this.vG.icD)) {
            boolean z2 = (1.0f - (((float) this.vG.dyT.kj()) / ((float) this.vG.icD.AEt()))) * 100.0f >= ((float) i);
            int pvs = mnm.Jd().pvs(String.valueOf(this.vG.sUS));
            if (pvs == 0) {
                boolean NB = this.vG.dx.Wyp().NB();
                if (this.vG.dyT.cR()) {
                    NB = true;
                }
                if (z2) {
                }
            } else if (pvs == 1) {
                z = z2;
            }
            if (z) {
                OT();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final boolean z, boolean z2) {
        if (!z2 && ny().Mxy().getBoolean("user_has_give_up_reward", false) && rCZ.vG(this.vG.icD)) {
            gA();
            return;
        }
        if (!mnm.Jd().so(String.valueOf(this.vG.sUS))) {
            if (z) {
                dyT();
                return;
            } else {
                gA();
                return;
            }
        }
        if (ny().Mxy().getBoolean("reward_verify", false)) {
            if (rCZ.vG(this.vG.icD)) {
                gA();
                return;
            } else if (z) {
                dyT();
                return;
            } else {
                gA();
                return;
            }
        }
        this.vG.uc.set(true);
        this.vG.ny.bNS();
        if (z) {
            this.vG.dyT.bNS();
        }
        final com.bytedance.sdk.openadsdk.core.widget.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.widget.pvs(ZhG());
        this.icD.Ju = pvsVar;
        if (z) {
            this.icD.Ju.pvs(Ju).icD(IP).vG(bNS);
        } else {
            this.icD.Ju.pvs(mnm).icD(vA).vG(bNS);
        }
        this.icD.Ju.pvs(new pvs.InterfaceC0086pvs() { // from class: com.bytedance.sdk.openadsdk.activity.NB.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.InterfaceC0086pvs
            public void pvs() {
                NB.this.vG.ny.IP();
                if (z) {
                    NB.this.vG.dyT.pvs(1000L);
                }
                pvsVar.dismiss();
                NB.this.vG.uc.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.InterfaceC0086pvs
            public void icD() {
                pvsVar.dismiss();
                NB.this.ny().Mxy().putBoolean("user_has_give_up_reward", true);
                NB.this.vG.uc.set(false);
                NB.this.vG.dyT.sUS(Integer.MAX_VALUE);
                if (!z) {
                    NB.this.gA();
                    return;
                }
                if (rCZ.vG(NB.this.vG.icD)) {
                    if (!NB.this.vG.dyT.zM()) {
                        NB.this.gA();
                        return;
                    } else {
                        NB.this.vG.dyT.icD(5);
                        return;
                    }
                }
                NB.this.vG.Gp.sUS();
                if (NB.this.vG.dyT.zM()) {
                    NB.this.vG.dyT.icD(4);
                }
                NB.this.dyT();
            }
        }).show();
    }

    private JSONObject ae() {
        JSONObject jSONObject = new JSONObject();
        int uc = (int) this.vG.ny.uc();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.vG.icD.uc());
            jSONObject.put("reward_amount", this.vG.icD.rCZ());
            jSONObject.put("network", com.bytedance.sdk.component.utils.mnm.vG(this.vG.jhZ));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int sP = this.vG.icD.sP();
            String str = "unKnow";
            if (sP == 2) {
                str = jlb.icD();
            } else if (sP == 1) {
                str = jlb.vG();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.vG.icD.Je());
            jSONObject.put("media_extra", this.zM);
            jSONObject.put("video_duration", this.vG.icD.od().sUS());
            jSONObject.put("play_start_ts", this.sUS);
            jSONObject.put("play_end_ts", this.NB);
            jSONObject.put(TypedValues.TransitionType.S_DURATION, uc);
            jSONObject.put("user_id", this.cR);
            jSONObject.put("trans_id", com.bytedance.sdk.openadsdk.utils.rCZ.pvs().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            Ju.pvs("TTAD.RewardAdScene", "", th);
            return null;
        }
    }

    public void OT() {
        if (ny().Mxy().getBoolean("reward_verify", false) || ny().Ju()) {
            return;
        }
        ny().Mxy().putBoolean("reward_verify", true);
        if (mnm.Jd().mnm(String.valueOf(this.vG.sUS))) {
            pvs(true, this.vG.icD.rCZ(), this.vG.icD.uc(), 0, "");
        } else {
            mnm.vG().pvs(ae(), new vA.icD() { // from class: com.bytedance.sdk.openadsdk.activity.NB.6
                @Override // com.bytedance.sdk.openadsdk.core.vA.icD
                public void pvs(int i, String str) {
                    NB.this.pvs(false, 0, "", i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.vA.icD
                public void pvs(cR.icD icd) {
                    boolean z = icd.icD;
                    NB.this.pvs(icd.icD, icd.vG.pvs(), icd.vG.icD(), 0, "");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0076, code lost:
    
        if (r3.vG.mnm.get() == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void gA() {
        com.bytedance.sdk.openadsdk.core.yiw.pvs ig;
        bNS.pvs pvsVar = new bNS.pvs();
        pvsVar.pvs(this.vG.ny.yiw());
        pvsVar.vG(this.vG.ny.zM());
        pvsVar.icD(this.vG.ny.qh());
        pvsVar.vG(3);
        pvsVar.Jd(this.vG.ny.cR());
        com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(this.vG.ny.vG(), pvsVar, this.vG.ny.pvs());
        com.bytedance.sdk.openadsdk.core.rCZ.vG(this.vG.sUS);
        this.vG.ny.pvs("skip", false);
        if (this.vG.vG) {
            pvs(true, 4);
            if (com.bytedance.sdk.openadsdk.core.model.mnm.pvs(this.vG.icD)) {
            }
            ig = this.vG.icD.ig();
            if (ig != null) {
                com.bytedance.sdk.openadsdk.core.yiw.Jd pvs = ig.pvs();
                long yiw = this.vG.ny.yiw();
                pvs.sUS(yiw);
                pvs.NB(yiw);
            }
            com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.vG.icD, 5);
        }
        dyT();
        ig = this.vG.icD.ig();
        if (ig != null) {
        }
        com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.vG.icD, 5);
    }
}
