package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.sUS;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RewardFullContext.java */
/* loaded from: classes2.dex */
public class pvs {
    public boolean Ayu;
    public boolean BSi;
    public boolean Ca;
    public int CjQ;
    public final Mxy CvL;
    public boolean Cwg;
    public final so Gp;
    public boolean HWd;
    public final boolean Jd;
    public final String NB;
    public final com.bytedance.sdk.openadsdk.core.video.vG.icD OhP;
    public float OyE;
    public final kj Pj;
    public final dyT SE;
    private long Wby;
    public com.bytedance.sdk.openadsdk.utils.qh Ye;
    public final Jd ZhG;
    public com.bytedance.sdk.openadsdk.component.reward.icD.icD Zm;
    public final sUS ae;
    public com.bytedance.sdk.openadsdk.common.so cGU;
    public final qh cRf;
    public final com.bytedance.sdk.openadsdk.component.reward.view.vG dX;
    public final bNS dx;
    public final yiw dyT;
    public boolean ea;
    public com.bytedance.sdk.openadsdk.activity.sUS elv;
    public final vG gA;
    public final com.bytedance.sdk.openadsdk.component.reward.view.NB gSd;
    public final cR icD;
    public final Context jhZ;
    public com.bytedance.sdk.openadsdk.Mxy.so jlb;
    public int joF;
    public final IP ny;
    public final Activity od;
    public final int pvs;
    public final RewardFullBaseLayout qD;
    public boolean qd;
    public boolean rW;
    public final NB sP;
    public final int sUS;
    public String sq;
    private long tCd;
    public TopProxyLayout tQ;
    public int thO;
    public final boolean vG;
    public final boolean yWX;
    public final boolean yiw;
    public int so = 0;
    public int Mxy = 0;
    public final AtomicBoolean Wyp = new AtomicBoolean(false);
    public final AtomicBoolean qh = new AtomicBoolean(false);
    public final AtomicBoolean kj = new AtomicBoolean(false);
    public final AtomicBoolean Ju = new AtomicBoolean(false);
    public final AtomicBoolean IP = new AtomicBoolean(false);
    public final AtomicBoolean bNS = new AtomicBoolean(false);
    public final AtomicBoolean mnm = new AtomicBoolean(false);
    public final AtomicBoolean vA = new AtomicBoolean(false);
    public final AtomicBoolean cR = new AtomicBoolean(false);
    public final AtomicBoolean zM = new AtomicBoolean(false);
    public final AtomicBoolean uc = new AtomicBoolean(false);
    public final AtomicBoolean rCZ = new AtomicBoolean(false);
    public final AtomicBoolean OT = new AtomicBoolean(false);
    public boolean ZsW = false;
    public int cnN = 1;
    public long neB = 0;

    public pvs(Activity activity, dyT dyt, cR cRVar, com.bytedance.sdk.openadsdk.core.video.vG.icD icd, int i) {
        com.bytedance.sdk.openadsdk.component.reward.view.NB nb;
        this.od = activity;
        this.OhP = icd;
        Context pvs = com.bytedance.sdk.openadsdk.core.mnm.pvs();
        this.jhZ = pvs;
        this.icD = cRVar;
        this.pvs = i;
        this.yWX = i == 0 || i == 2;
        this.HWd = i == 0 || i == 1;
        this.SE = dyt;
        boolean z = cRVar.jlb().getDurationSlotType() == 7;
        this.Jd = z;
        this.NB = z ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.Ca = cRVar.pvs();
        this.yiw = com.bytedance.sdk.openadsdk.core.model.mnm.Mxy(cRVar);
        int yTz = cRVar.yTz();
        this.sUS = yTz;
        this.ea = com.bytedance.sdk.openadsdk.core.mnm.Jd().vA(String.valueOf(yTz));
        this.vG = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().IP(String.valueOf(yTz));
        this.CvL = i == 2 ? new Wyp(this) : new Mxy(this);
        if (i == 2) {
            nb = new com.bytedance.sdk.openadsdk.component.reward.view.sUS(this);
        } else {
            nb = cRVar.pvs() ? new com.bytedance.sdk.openadsdk.component.reward.view.NB(this) : new com.bytedance.sdk.openadsdk.component.reward.view.Jd(this);
        }
        this.gSd = nb;
        this.qD = new RewardFullBaseLayout(this);
        this.ny = new IP(this);
        this.ZhG = new Jd(this);
        this.dyT = new yiw(this);
        this.dX = new com.bytedance.sdk.openadsdk.component.reward.view.vG(this);
        this.dx = new bNS(this);
        this.Pj = new kj(this);
        this.cRf = new qh(this);
        this.sP = new NB(this);
        this.Gp = new so(this);
        this.ae = new sUS(this);
        this.gA = new vG(this);
        this.jlb = new com.bytedance.sdk.openadsdk.Mxy.so(pvs);
        this.Ye = com.bytedance.sdk.openadsdk.utils.sUS.pvs(activity, new sUS.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.pvs.1
            @Override // com.bytedance.sdk.openadsdk.utils.sUS.pvs
            public View pvs() {
                if (pvs.this.gSd != null) {
                    return pvs.this.gSd.Wyp();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.sUS.pvs
            public void icD() {
                if (pvs.this.cRf != null) {
                    pvs.this.cRf.sUS();
                }
            }
        });
    }

    public void pvs(boolean z) {
        this.rW = z;
        this.cRf.Jd(z);
    }

    public void pvs() {
        this.tCd = SystemClock.elapsedRealtime();
    }

    public void icD() {
        if (this.tCd <= 0) {
            this.tCd = SystemClock.elapsedRealtime();
        }
        this.Wby += SystemClock.elapsedRealtime() - this.tCd;
    }

    public long vG() {
        return this.Wby + (SystemClock.elapsedRealtime() - this.tCd);
    }
}
