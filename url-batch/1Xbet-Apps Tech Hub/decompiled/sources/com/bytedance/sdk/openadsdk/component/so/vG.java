package com.bytedance.sdk.openadsdk.component.so;

import android.content.Context;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.icD.pvs;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.bNS;

/* compiled from: TTAppOpenVideoManager.java */
/* loaded from: classes2.dex */
public class vG implements pvs.InterfaceC0074pvs {
    private icD Jd;
    private FrameLayout icD;
    private Context pvs;
    private cR vG;

    public vG(Context context) {
        this.pvs = context.getApplicationContext();
    }

    public void pvs(FrameLayout frameLayout, cR cRVar) {
        this.icD = frameLayout;
        this.vG = cRVar;
        this.Jd = new icD(this.pvs, this.icD, this.vG);
    }

    public boolean pvs() {
        com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs = cR.pvs(CacheDirFactory.getICacheDir(0).icD(), this.vG);
        pvs.icD(this.vG.neB());
        pvs.pvs(this.icD.getWidth());
        pvs.icD(this.icD.getHeight());
        pvs.vG(this.vG.HWd());
        pvs.pvs(0L);
        pvs.pvs(true);
        return this.Jd.pvs(pvs);
    }

    public boolean icD() {
        icD icd = this.Jd;
        return (icd == null || icd.kj() == null || !this.Jd.kj().sUS()) ? false : true;
    }

    public boolean vG() {
        icD icd = this.Jd;
        return (icd == null || icd.kj() == null || !this.Jd.kj().yiw()) ? false : true;
    }

    public void pvs(vG.pvs pvsVar) {
        icD icd = this.Jd;
        if (icd != null) {
            icd.pvs(pvsVar);
        }
    }

    public void Jd() {
        try {
            if (icD()) {
                this.Jd.pvs();
            }
        } catch (Throwable th) {
            Ju.pvs("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    public void NB() {
        icD icd = this.Jd;
        if (icd != null) {
            icd.icD();
        }
    }

    public void sUS() {
        icD icd = this.Jd;
        if (icd == null) {
            return;
        }
        this.pvs = null;
        icd.vG();
        this.Jd = null;
    }

    public long yiw() {
        icD icd = this.Jd;
        if (icd != null) {
            return icd.NB();
        }
        return 0L;
    }

    public long so() {
        icD icd = this.Jd;
        if (icd != null) {
            return icd.sUS();
        }
        return 0L;
    }

    public long Mxy() {
        icD icd = this.Jd;
        if (icd != null) {
            return icd.so() + this.Jd.sUS();
        }
        return 0L;
    }

    public void pvs(int i) {
        if (this.Jd != null) {
            bNS.pvs pvsVar = new bNS.pvs();
            pvsVar.pvs(yiw());
            pvsVar.vG(Mxy());
            pvsVar.icD(so());
            pvsVar.vG(i);
            pvsVar.Jd(this.Jd.yiw());
            this.Jd.pvs(pvsVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.icD.pvs.InterfaceC0074pvs
    public long getVideoProgress() {
        return yiw();
    }
}
