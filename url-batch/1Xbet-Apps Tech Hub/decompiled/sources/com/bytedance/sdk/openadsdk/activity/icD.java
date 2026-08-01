package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.Mxy.so;
import com.bytedance.sdk.openadsdk.component.reward.kj;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.model.zM;
import com.bytedance.sdk.openadsdk.core.settings.mnm;
import com.bytedance.sdk.openadsdk.layout.TTProgressIndicator;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.qh;
import com.bytedance.sdk.openadsdk.utils.sUS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AdSceneManager.java */
/* loaded from: classes2.dex */
public class icD {
    private static com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs icD;
    private static com.bytedance.sdk.openadsdk.apiImpl.icD.icD vG;
    private com.bytedance.sdk.openadsdk.activity.vG IP;
    private PAGFrameLayout Ju;
    private boolean Mxy;
    private final cR NB;
    private boolean OT;
    private Activity Wyp;
    private int ZhG;
    private PAGFrameLayout bNS;
    private Bundle cR;
    private final so dX;
    private Runnable dyT;
    private int kj;
    private PAGTextView mnm;
    private boolean ny;
    public qh pvs;
    private sUS qh;
    private AbstractC0063icD rCZ;
    private com.bytedance.sdk.openadsdk.apiImpl.icD.icD so;
    private TopProxyLayout uc;
    private int vA;
    private com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs yiw;
    private TTProgressIndicator zM;
    private final List<sUS> Jd = new ArrayList();
    private final Bundle sUS = new Bundle();

    public icD(Activity activity, cR cRVar) {
        com.bytedance.sdk.openadsdk.core.model.pvs wgm;
        List<cR> vG2;
        this.NB = cRVar;
        this.Wyp = activity;
        this.dX = new so(activity.getApplicationContext());
        int i = 0;
        if ((cRVar instanceof zM) && (wgm = ((zM) cRVar).wgm()) != null) {
            boolean qh = wgm.qh();
            this.Mxy = qh;
            if (qh) {
                if (!mnm.Lxj().Mnp()) {
                    this.Mxy = false;
                }
                if (this.Mxy && (vG2 = wgm.vG()) != null) {
                    Iterator<cR> it = vG2.iterator();
                    while (it.hasNext()) {
                        this.Jd.add(pvs(this, it.next(), i));
                        this.ZhG++;
                        i++;
                    }
                }
            }
        }
        if (this.Jd.isEmpty() && !rCZ.qh(cRVar)) {
            this.Jd.add(pvs(this, cRVar, i));
            i++;
        }
        if (mnm.Lxj().IP(String.valueOf(cRVar.yTz())) || rCZ.qh(cRVar)) {
            this.Jd.add(new com.bytedance.sdk.openadsdk.activity.vG(this, cRVar, i));
        } else if (pvs()) {
            this.pvs = com.bytedance.sdk.openadsdk.utils.sUS.pvs(activity, new sUS.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.icD.1
                @Override // com.bytedance.sdk.openadsdk.utils.sUS.pvs
                public View pvs() {
                    if (icD.this.uc != null) {
                        return icD.this.uc.getCloseButton();
                    }
                    return null;
                }

                @Override // com.bytedance.sdk.openadsdk.utils.sUS.pvs
                public void icD() {
                    if (icD.this.uc != null) {
                        icD.this.uc.vG();
                    }
                }
            });
        }
    }

    private static sUS pvs(icD icd, cR cRVar, int i) {
        boolean FJ = cRVar.FJ();
        AdSlot jlb = cRVar.jlb();
        if (jlb != null) {
            FJ = jlb.getDurationSlotType() == 7;
        }
        if (FJ) {
            return new NB(icd, cRVar, i);
        }
        return new com.bytedance.sdk.openadsdk.activity.Jd(icd, cRVar, i);
    }

    public boolean pvs() {
        return this.Mxy;
    }

    public void pvs(AdActivity adActivity, Bundle bundle, com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs pvsVar, com.bytedance.sdk.openadsdk.apiImpl.icD.icD icd) {
        this.cR = bundle;
        this.vA = 1;
        this.Ju = new PAGFrameLayout(adActivity);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(adActivity);
        this.bNS = pAGFrameLayout;
        this.Ju.addView(pAGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        if (this.Mxy) {
            this.zM = new TTProgressIndicator(adActivity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, Pj.icD(adActivity, 2.0f));
            layoutParams.gravity = 80;
            this.Ju.addView(this.zM, layoutParams);
            PAGTextView pAGTextView = new PAGTextView(adActivity);
            this.mnm = pAGTextView;
            pAGTextView.setTextColor(-1);
            this.mnm.setTextSize(15.0f);
            this.mnm.setShadowLayer(1.0f, 0.0f, 1.0f, ViewCompat.MEASURED_STATE_MASK);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = Pj.icD(adActivity, 60.0f);
            layoutParams2.rightMargin = Pj.icD(adActivity, 16.0f);
            layoutParams2.gravity = 8388661;
            this.Ju.addView(this.mnm, layoutParams2);
            TopProxyLayout topProxyLayout = new TopProxyLayout(adActivity);
            this.uc = topProxyLayout;
            this.Ju.addView(topProxyLayout, new FrameLayout.LayoutParams(-1, -2));
            this.uc.pvs(this.NB);
            this.uc.setShowDislike(true);
        }
        this.yiw = pvsVar;
        this.so = icd;
        if (pvsVar == null && bundle != null) {
            this.yiw = icD;
            icD = null;
        }
        if (icd == null && bundle != null) {
            this.so = vG;
            vG = null;
        }
        icD(null, new Jd(1));
    }

    private void icD(sUS sus, Jd jd) {
        if (this.Wyp == null) {
            return;
        }
        icD();
        if (sus == null) {
            sUS sus2 = this.qh;
            int i = sus2 != null ? sus2.Mxy + 1 : 0;
            if (i < this.Jd.size()) {
                sus = this.Jd.get(i);
            }
            if (sus == null) {
                pvs(this.qh);
                return;
            }
        }
        sUS sus3 = this.qh;
        if (sus3 != null) {
            if (sus3 == sus) {
                return;
            }
            sus3.NB(this.Wyp);
            this.qh.vG(this.Wyp);
            View pvs2 = this.qh.pvs();
            if (pvs2 != null) {
                this.bNS.removeView(pvs2);
            }
            this.qh.bNS();
            this.qh.Wyp = false;
        }
        sus.Wyp = true;
        sus.pvs(this.Wyp, jd);
        View pvs3 = sus.pvs();
        if (pvs3 != null) {
            ViewParent parent = pvs3.getParent();
            if (parent != null) {
                if (parent == this.bNS) {
                    pvs3.setVisibility(0);
                } else if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(pvs3);
                }
            }
            if (pvs3.getParent() == null) {
                this.bNS.addView(pvs3, new ViewGroup.LayoutParams(-1, -1));
            }
            if (this.Wyp.getWindow().getContainer() == null) {
                this.Wyp.setContentView(this.Ju);
            }
        }
        sUS sus4 = this.qh;
        this.qh = sus;
        pvs(sus4, sus, jd);
    }

    private void pvs(sUS sus, sUS sus2, Jd jd) {
        if (this.Mxy) {
            boolean z = sus2 instanceof com.bytedance.sdk.openadsdk.activity.pvs;
            if (z) {
                this.kj++;
                pvs(0.0f);
                if (this.rCZ == null) {
                    if (sus2 instanceof com.bytedance.sdk.openadsdk.activity.Jd) {
                        this.rCZ = new pvs(this, this.NB, this.uc);
                    } else {
                        this.rCZ = new vG(this, this.NB, this.uc);
                    }
                }
                int i = 0;
                for (int i2 = sus2.Mxy; i2 < this.Jd.size(); i2++) {
                    sUS sus3 = this.Jd.get(i2);
                    if (sus3 instanceof com.bytedance.sdk.openadsdk.activity.vG) {
                        break;
                    }
                    com.bykv.vk.openvk.component.video.api.vG.icD od = sus3.so.od();
                    i = od != null ? (int) (i + od.sUS()) : (int) (i + 10);
                }
                this.rCZ.pvs(i);
                qh qhVar = this.pvs;
                if (qhVar != null && sus == null) {
                    qhVar.pvs(i * 1000);
                }
            } else if (sus2 instanceof com.bytedance.sdk.openadsdk.activity.vG) {
                TTProgressIndicator tTProgressIndicator = this.zM;
                if (tTProgressIndicator != null) {
                    Pj.yiw(tTProgressIndicator);
                    this.zM = null;
                }
                TopProxyLayout topProxyLayout = this.uc;
                if (topProxyLayout != null) {
                    Pj.yiw(topProxyLayout);
                    Pj.yiw(this.uc.getITopLayout());
                    this.uc = null;
                }
                AbstractC0063icD abstractC0063icD = this.rCZ;
                if (abstractC0063icD != null) {
                    abstractC0063icD.vG();
                }
                if (sus instanceof NB) {
                    ((NB) sus).OT();
                }
                qh qhVar2 = this.pvs;
                if (qhVar2 != null) {
                    qhVar2.vG();
                }
            }
            if (z) {
                this.mnm.setText(this.Wyp.getString(uc.icD(com.bytedance.sdk.openadsdk.core.mnm.pvs(), "tt_multiple_ad_indicator"), new Object[]{Integer.valueOf(sus2.Mxy + 1), Integer.valueOf(this.ZhG)}));
            } else {
                this.mnm.setVisibility(8);
            }
        }
        for (int i3 = sus != null ? sus.Mxy : 0; i3 < this.Jd.size(); i3++) {
            this.Jd.get(i3).pvs(sus, sus2, jd);
        }
        sus2.pvs(this.Wyp, this.cR);
        int i4 = this.vA;
        if (i4 == 2) {
            sus2.Jd(this.Wyp);
            return;
        }
        if (i4 == 3) {
            sus2.Jd(this.Wyp);
            sus2.icD(this.Wyp);
        } else if (i4 == 4) {
            sus2.NB(this.Wyp);
        } else {
            if (i4 != 5) {
                return;
            }
            sus2.vG(this.Wyp);
        }
    }

    public void pvs(AdActivity adActivity) {
        this.vA = 2;
        sUS sus = this.qh;
        if (sus != null) {
            sus.Jd(adActivity);
        }
    }

    public void icD(AdActivity adActivity) {
        this.vA = 3;
        sUS sus = this.qh;
        if (sus != null) {
            sus.icD(adActivity);
        }
        AbstractC0063icD abstractC0063icD = this.rCZ;
        if (abstractC0063icD != null) {
            abstractC0063icD.icD();
        }
        qh qhVar = this.pvs;
        if (qhVar != null) {
            qhVar.pvs();
        }
    }

    public void vG(AdActivity adActivity) {
        this.vA = 4;
        sUS sus = this.qh;
        if (sus != null) {
            sus.NB(adActivity);
        }
        AbstractC0063icD abstractC0063icD = this.rCZ;
        if (abstractC0063icD != null) {
            abstractC0063icD.pvs();
        }
        qh qhVar = this.pvs;
        if (qhVar != null) {
            qhVar.icD();
        }
    }

    public void Jd(AdActivity adActivity) {
        this.vA = 5;
        sUS sus = this.qh;
        if (sus != null) {
            sus.vG(adActivity);
        }
    }

    public void pvs(AdActivity adActivity, Bundle bundle) {
        com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs pvsVar = this.yiw;
        if (pvsVar != null) {
            icD = pvsVar;
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.icD.icD icd = this.so;
        if (icd != null) {
            vG = icd;
        }
    }

    public void NB(AdActivity adActivity) {
        this.vA = 6;
        int icD2 = icD();
        for (sUS sus : this.Jd) {
            if (sus.Mxy >= icD2) {
                sus.bNS();
            }
        }
        sUS sus2 = this.qh;
        if (sus2 != null) {
            sus2.dX();
        }
        sUS sus3 = this.qh;
        if (sus3 != null && !sus3.zM()) {
            Ju.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.icD.2
                @Override // java.lang.Runnable
                public void run() {
                    if (icD.this.NB.FJ()) {
                        kj.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()).pvs(icD.this.NB.jlb());
                    } else {
                        com.bytedance.sdk.openadsdk.component.reward.NB.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()).pvs(icD.this.NB.jlb());
                    }
                }
            });
        }
        AbstractC0063icD abstractC0063icD = this.rCZ;
        if (abstractC0063icD != null) {
            abstractC0063icD.vG();
        }
        qh qhVar = this.pvs;
        if (qhVar != null) {
            qhVar.vG();
        }
        this.qh = null;
        this.Wyp = null;
    }

    public int icD() {
        sUS sus = this.qh;
        if (sus != null) {
            return sus.Mxy;
        }
        return -1;
    }

    public void pvs(sUS sus, Jd jd) {
        sUS sus2 = this.qh;
        if (sus2 == null || sus2 == sus) {
            icD(null, jd);
        }
    }

    public void pvs(sUS sus) {
        if (sus instanceof NB) {
            ((NB) sus).OT();
        }
        Activity activity = this.Wyp;
        if (activity != null) {
            activity.finish();
        }
    }

    public Activity vG() {
        return this.Wyp;
    }

    public void pvs(sUS sus, boolean z, boolean z2, boolean z3, int i) {
        com.bytedance.sdk.openadsdk.activity.vG NB;
        sUS sus2 = this.qh;
        if ((sus2 == null || sus2 == sus) && (NB = NB()) != null) {
            Jd jd = new Jd(i);
            jd.pvs.putBoolean("isSkip", z);
            jd.pvs.putBoolean("force", z2);
            jd.pvs.putBoolean("isFromLandingPage", z3);
            icD(NB, jd);
        }
    }

    public void pvs(Activity activity) {
        sUS sus = this.qh;
        if (sus != null) {
            sus.pvs(activity);
        }
    }

    public void Jd() {
        sUS sus = this.qh;
        if (sus != null) {
            sus.vA();
        }
    }

    public com.bytedance.sdk.openadsdk.activity.vG NB() {
        com.bytedance.sdk.openadsdk.activity.vG vGVar = this.IP;
        if (vGVar != null) {
            return vGVar;
        }
        sUS sus = this.qh;
        int i = sus != null ? sus.Mxy : -1;
        int size = this.Jd.size() - 1;
        while (true) {
            if (size <= i) {
                break;
            }
            sUS sus2 = this.Jd.get(size);
            if (sus2 instanceof com.bytedance.sdk.openadsdk.activity.vG) {
                this.IP = (com.bytedance.sdk.openadsdk.activity.vG) sus2;
                break;
            }
            size--;
        }
        return this.IP;
    }

    public void pvs(float f) {
        TTProgressIndicator tTProgressIndicator = this.zM;
        if (tTProgressIndicator == null) {
            return;
        }
        tTProgressIndicator.setProgress(f);
        if (f == 0.0f && this.zM.getVisibility() == 0) {
            this.zM.setVisibility(4);
        } else {
            if (f <= 0.0f || this.zM.getVisibility() == 0) {
                return;
            }
            this.zM.setVisibility(0);
        }
    }

    public int sUS() {
        return this.kj;
    }

    public TopProxyLayout yiw() {
        return this.uc;
    }

    public void pvs(int i) {
        AbstractC0063icD abstractC0063icD = this.rCZ;
        if (abstractC0063icD == null) {
            return;
        }
        if (i == 2) {
            abstractC0063icD.pvs();
            qh qhVar = this.pvs;
            if (qhVar != null) {
                qhVar.icD();
                return;
            }
            return;
        }
        if (i == 1) {
            abstractC0063icD.icD();
            qh qhVar2 = this.pvs;
            if (qhVar2 != null) {
                qhVar2.pvs();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sUS cR() {
        return this.qh;
    }

    public sUS so() {
        int i;
        sUS sus = this.qh;
        if (sus != null && (i = sus.Mxy + 1) >= 0 && i < this.Jd.size()) {
            return this.Jd.get(i);
        }
        return null;
    }

    public Bundle Mxy() {
        return this.sUS;
    }

    public void Wyp() {
        com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs pvsVar = this.yiw;
        if (pvsVar != null) {
            pvsVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.icD.icD icd = this.so;
        if (icd != null) {
            icd.onAdClicked();
        }
    }

    public void qh() {
        com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs pvsVar = this.yiw;
        if (pvsVar != null) {
            pvsVar.icD();
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.icD.icD icd = this.so;
        if (icd != null) {
            icd.icD();
        }
    }

    public void kj() {
        if (bNS()) {
            return;
        }
        mnm();
        com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs pvsVar = this.yiw;
        if (pvsVar != null) {
            pvsVar.pvs();
        } else {
            com.bytedance.sdk.openadsdk.apiImpl.icD.icD icd = this.so;
            if (icd != null) {
                icd.pvs();
            }
        }
        Runnable runnable = this.dyT;
        if (runnable != null) {
            runnable.run();
            this.dyT = null;
        }
    }

    public boolean Ju() {
        return this.ny;
    }

    public void IP() {
        this.ny = true;
    }

    public void pvs(final sUS sus, final boolean z, final int i, final String str, final int i2, final String str2) {
        Activity activity;
        if (!this.OT) {
            this.dyT = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.icD.3
                @Override // java.lang.Runnable
                public void run() {
                    icD.this.pvs(sus, z, i, str, i2, str2);
                }
            };
            return;
        }
        if (Ju()) {
            return;
        }
        IP();
        if (this.yiw == null || (activity = this.Wyp) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.icD.4
            @Override // java.lang.Runnable
            public void run() {
                icD.this.yiw.pvs(z, i, str, i2, str2);
            }
        });
        if (pvs()) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(System.currentTimeMillis(), sus.so, sus.b_(), z ? "reward_success" : "reward_fail");
        }
    }

    public boolean bNS() {
        return this.OT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zM() {
        if (this.Jd.isEmpty()) {
            return false;
        }
        return this.Jd.get(r0.size() - 1) instanceof com.bytedance.sdk.openadsdk.activity.vG;
    }

    public void mnm() {
        this.OT = true;
    }

    /* compiled from: AdSceneManager.java */
    public static class Jd {
        public boolean Jd;
        public final int icD;
        public final Bundle pvs = new Bundle();
        public boolean vG;

        public Jd(int i) {
            this.icD = i;
        }
    }

    /* compiled from: AdSceneManager.java */
    /* renamed from: com.bytedance.sdk.openadsdk.activity.icD$icD, reason: collision with other inner class name */
    static abstract class AbstractC0063icD implements Handler.Callback {
        protected int Jd;
        private boolean Mxy;
        protected int NB;
        private boolean Wyp;
        protected final cR icD;
        protected final icD pvs;
        private final Handler sUS = new Handler(Looper.getMainLooper(), this);
        private final Context so;
        protected float vG;
        private final TopProxyLayout yiw;

        protected abstract int pvs(cR cRVar);

        public AbstractC0063icD(icD icd, cR cRVar, TopProxyLayout topProxyLayout) {
            this.pvs = icd;
            this.icD = cRVar;
            this.yiw = topProxyLayout;
            this.so = topProxyLayout.getContext();
            this.Jd = pvs(cRVar);
        }

        public void pvs() {
            this.sUS.removeMessages(this.NB);
        }

        public void icD() {
            if (this.Jd < 0 || this.Mxy || this.Wyp) {
                return;
            }
            this.sUS.removeMessages(this.NB);
            this.sUS.sendEmptyMessage(this.NB);
        }

        public void vG() {
            this.sUS.removeMessages(this.NB);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                if (this.Jd > 0) {
                    TopProxyLayout topProxyLayout = this.yiw;
                    Context context = this.so;
                    int icD = uc.icD(context, "tt_reward_full_skip");
                    int i = this.Jd;
                    this.Jd = i - 1;
                    topProxyLayout.setSkipText(context.getString(icD, Integer.valueOf(i)));
                    if (this.Jd >= 0) {
                        this.sUS.removeMessages(message.what);
                        this.sUS.sendEmptyMessageDelayed(message.what, 1000L);
                    }
                } else {
                    Jd();
                }
            } else if (message.what == 2) {
                if (this.Jd > 0) {
                    TopProxyLayout topProxyLayout2 = this.yiw;
                    StringBuilder sb = new StringBuilder();
                    int i2 = this.Jd;
                    this.Jd = i2 - 1;
                    topProxyLayout2.setSkipText(sb.append(i2).append("s").toString());
                    if (this.Jd >= 0) {
                        this.sUS.removeMessages(message.what);
                        this.sUS.sendEmptyMessageDelayed(message.what, 1000L);
                    }
                } else {
                    Jd();
                }
            }
            return true;
        }

        private void Jd() {
            if (this.pvs.zM()) {
                this.yiw.NB();
                this.Mxy = true;
            } else {
                this.Wyp = true;
                this.yiw.sUS();
            }
        }

        public void pvs(int i) {
            if (this.Mxy || this.Wyp) {
                return;
            }
            float f = i;
            this.vG = f;
            if (f > this.Jd) {
                if (this.NB == 0) {
                    this.NB = 1;
                }
            } else {
                this.NB = 2;
                this.Jd = (int) f;
            }
            this.sUS.removeCallbacksAndMessages(null);
            this.sUS.sendEmptyMessage(this.NB);
        }
    }

    /* compiled from: AdSceneManager.java */
    static class vG extends AbstractC0063icD {
        private final int sUS;
        private boolean so;
        private int yiw;

        public vG(icD icd, cR cRVar, TopProxyLayout topProxyLayout) {
            super(icd, cRVar, topProxyLayout);
            this.sUS = com.bytedance.sdk.openadsdk.core.mnm.Jd().Gp(String.valueOf(cRVar.yTz())).sUS;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.icD.AbstractC0063icD
        protected int pvs(cR cRVar) {
            return com.bytedance.sdk.openadsdk.core.mnm.Jd().qh(String.valueOf(cRVar.yTz()));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.icD.AbstractC0063icD
        public void pvs(int i) {
            boolean z = this.NB == 0;
            int i2 = this.Jd;
            super.pvs(i);
            if (!z) {
                if (this.vG < i2) {
                    this.yiw = (int) ((1.0f - (this.sUS / 100.0f)) * this.Jd);
                }
            } else if (this.NB == 1) {
                this.yiw = 3;
            } else {
                this.yiw = (int) ((1.0f - (this.sUS / 100.0f)) * this.vG);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.icD.AbstractC0063icD, android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (!this.so && this.Jd <= this.yiw) {
                this.so = true;
                sUS cR = this.pvs.cR();
                if (cR instanceof NB) {
                    ((NB) cR).OT();
                }
            }
            super.handleMessage(message);
            return true;
        }
    }

    /* compiled from: AdSceneManager.java */
    static class pvs extends AbstractC0063icD {
        public pvs(icD icd, cR cRVar, TopProxyLayout topProxyLayout) {
            super(icd, cRVar, topProxyLayout);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.icD.AbstractC0063icD
        protected int pvs(cR cRVar) {
            return com.bytedance.sdk.openadsdk.core.mnm.Jd().zM(String.valueOf(cRVar.yTz()));
        }
    }

    public so vA() {
        return this.dX;
    }

    public void pvs(View view) {
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.bNS.addView(view, 0);
    }
}
