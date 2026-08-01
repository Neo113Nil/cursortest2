package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.model.vA;
import com.bytedance.sdk.openadsdk.core.video.vG.pvs;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.bNS;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: RewardFullVideoPlayerManager.java */
/* loaded from: classes2.dex */
public class IP {
    private String IP;
    final boolean Jd;
    private FrameLayout Mxy;
    private final String Wyp;
    private boolean cR;
    private long kj;
    private boolean mnm;
    private long qh;
    com.bykv.vk.openvk.component.video.api.Jd.vG sUS;
    private final cR so;
    private com.bytedance.sdk.openadsdk.icD.yiw uc;
    private final pvs vA;
    boolean vG;
    private final Activity yiw;
    private pvs.InterfaceC0085pvs zM;
    protected boolean pvs = false;
    boolean icD = false;
    protected boolean NB = false;
    private int Ju = -1;
    private HashSet<String> bNS = new HashSet<>();

    public com.bytedance.sdk.openadsdk.icD.yiw pvs() {
        return this.uc;
    }

    public IP(pvs pvsVar) {
        this.vA = pvsVar;
        this.yiw = pvsVar.od;
        this.so = pvsVar.icD;
        this.Jd = pvsVar.Jd;
        this.Wyp = pvsVar.NB;
    }

    public void pvs(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.icD.yiw yiwVar) {
        if (this.mnm) {
            return;
        }
        this.mnm = true;
        this.Mxy = frameLayout;
        this.uc = yiwVar;
        if (cR.NB(this.so)) {
            this.sUS = new com.bytedance.sdk.openadsdk.core.video.vG.pvs(this.yiw, this.Mxy, this.so, yiwVar);
            Jd(this.cR);
            pvs.InterfaceC0085pvs interfaceC0085pvs = this.zM;
            if (interfaceC0085pvs != null) {
                ((com.bytedance.sdk.openadsdk.core.video.vG.pvs) this.sUS).pvs(interfaceC0085pvs);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.vG vGVar = new com.bytedance.sdk.openadsdk.component.reward.vG(this.so, yiwVar);
        this.sUS = vGVar;
        pvs.InterfaceC0085pvs interfaceC0085pvs2 = this.zM;
        if (interfaceC0085pvs2 != null) {
            vGVar.pvs(interfaceC0085pvs2);
        }
    }

    public boolean icD() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        return (vGVar == null || vGVar.kj() == null || !this.sUS.kj().sUS()) ? false : true;
    }

    public com.bykv.vk.openvk.component.video.api.icD.pvs vG() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar == null) {
            return null;
        }
        if (vGVar instanceof com.bytedance.sdk.openadsdk.component.reward.vG) {
            return ((com.bytedance.sdk.openadsdk.component.reward.vG) vGVar).cR();
        }
        return vGVar.Ju();
    }

    public boolean Jd() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        return (vGVar == null || vGVar.kj() == null || !this.sUS.kj().yiw()) ? false : true;
    }

    public boolean NB() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        return vGVar != null && vGVar.mnm();
    }

    public void pvs(long j, long j2) {
        this.kj = j;
        icD(j, j2);
    }

    private void icD(long j, long j2) {
        int abs = (int) Math.abs(this.Ju - j);
        int i = this.Ju;
        if (i < 0 || abs > 500 || i > j2 || abs >= 500 || this.bNS.contains(this.IP)) {
            return;
        }
        if (this.Ju > j) {
            com.bytedance.sdk.openadsdk.core.Ju.vG().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.IP.1
                @Override // java.lang.Runnable
                public void run() {
                    IP.this.dX();
                    IP.this.vA.dX.pvs(IP.this.Ju, IP.this.IP);
                }
            }, abs);
        } else {
            dX();
            this.vA.dX.pvs(this.Ju, this.IP);
        }
        this.bNS.add(this.IP);
    }

    public void pvs(int i, String str) {
        this.Ju = i;
        this.IP = str;
    }

    public boolean sUS() {
        return this.pvs;
    }

    public long yiw() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar != null) {
            return vGVar.NB();
        }
        return this.qh;
    }

    public long so() {
        return this.kj;
    }

    public long Mxy() {
        return this.qh;
    }

    public void pvs(long j) {
        this.qh = j;
    }

    public void pvs(boolean z) {
        this.pvs = z;
    }

    public void Wyp() {
        try {
            if (icD()) {
                this.sUS.pvs();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.icD("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage());
        }
    }

    public void pvs(int i, int i2) {
        if (this.sUS != null) {
            bNS.pvs pvsVar = new bNS.pvs();
            pvsVar.icD(qh());
            pvsVar.vG(zM());
            pvsVar.pvs(yiw());
            pvsVar.pvs(i);
            pvsVar.icD(i2);
            com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.Jd(this.sUS.Ju(), pvsVar);
        }
    }

    public long qh() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar != null) {
            return vGVar.sUS();
        }
        return 0L;
    }

    private void Pj() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar == null || vGVar.kj() == null) {
            return;
        }
        this.qh = this.sUS.NB();
        if (this.sUS.kj().vG() || !this.sUS.kj().icD()) {
            this.sUS.pvs();
            this.sUS.vG();
            this.pvs = true;
        }
    }

    public void kj() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar == null) {
            return;
        }
        vGVar.vG();
        this.sUS = null;
    }

    public void Ju() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar != null) {
            vGVar.Jd();
        }
    }

    public void IP() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar != null) {
            vGVar.icD();
        }
    }

    public void bNS() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar != null) {
            vGVar.pvs();
        }
    }

    public void pvs(vG.pvs pvsVar) {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar != null) {
            vGVar.pvs(pvsVar);
        }
    }

    public void icD(boolean z) {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar != null) {
            vGVar.icD(z);
        }
    }

    public long mnm() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar != null) {
            return vGVar.so();
        }
        return 0L;
    }

    public int vA() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar != null) {
            return vGVar.Wyp();
        }
        return 0;
    }

    public int cR() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar != null) {
            return vGVar.yiw();
        }
        return 0;
    }

    public long zM() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar != null) {
            return vGVar.so() + this.sUS.sUS();
        }
        return 0L;
    }

    public void pvs(String str, boolean z) {
        if (this.sUS != null) {
            long yiw = yiw();
            if (this.so.pY()) {
                yiw = this.vA.vG();
            }
            long j = yiw;
            JSONObject pvs = jlb.pvs(this.so, this.sUS.sUS(), this.sUS.kj());
            try {
                pvs.put("auto_click", z);
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.so, this.Wyp, str, j, vA(), pvs, this.uc);
            zM();
            vA();
        }
        jlb();
    }

    public long uc() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar != null) {
            return vGVar.so();
        }
        return 0L;
    }

    public boolean rCZ() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar != null) {
            if (vGVar.kj() != null) {
                com.bykv.vk.openvk.component.video.api.pvs kj = this.sUS.kj();
                if (kj.yiw() || kj.so()) {
                    com.bykv.vk.openvk.component.video.api.Jd.vG vGVar2 = this.sUS;
                    if (vGVar2 instanceof com.bytedance.sdk.openadsdk.core.video.vG.pvs) {
                        ((com.bytedance.sdk.openadsdk.core.video.vG.pvs) vGVar2).Pj();
                    }
                    return true;
                }
            } else if (sUS()) {
                pvs(false);
                com.bykv.vk.openvk.component.video.api.Jd.vG vGVar3 = this.sUS;
                if (vGVar3 instanceof com.bytedance.sdk.openadsdk.core.video.vG.pvs) {
                    ((com.bytedance.sdk.openadsdk.core.video.vG.pvs) vGVar3).Pj();
                }
                return true;
            }
        }
        return false;
    }

    public boolean OT() {
        return this.sUS != null;
    }

    public boolean ny() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        return vGVar != null && vGVar.kj() == null;
    }

    public boolean pvs(long j, boolean z, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.icD.icD icd) {
        boolean z2 = false;
        if (!OT()) {
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.mnm.vG(this.vA.icD) || com.bytedance.sdk.openadsdk.core.model.mnm.Jd(this.vA.icD)) {
            return true;
        }
        if (!z || !ny()) {
            pvs(icd);
        }
        try {
            z2 = pvs(j, this.vA.ea);
        } catch (Exception e) {
            Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", e);
        }
        if (z2 && !z) {
            this.vA.Gp.pvs(map);
        }
        return z2;
    }

    public void pvs(com.bytedance.sdk.openadsdk.component.reward.icD.icD icd) {
        if (this.vA.Wyp.get() || !this.vA.ZsW || rCZ.qh(this.vA.icD)) {
            return;
        }
        if ((!cR.NB(this.vA.icD) && com.bytedance.sdk.openadsdk.core.mnm.Jd().Ju(String.valueOf(this.vA.sUS)) == 1 && this.vA.dX.Jd()) || com.bytedance.sdk.openadsdk.core.model.mnm.vG(this.vA.icD) || com.bytedance.sdk.openadsdk.core.model.mnm.Jd(this.vA.icD) || this.NB || !icd.sUS()) {
            return;
        }
        this.vA.SE.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
        Message obtain = Message.obtain();
        obtain.what = MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION;
        this.vA.SE.sendMessageDelayed(obtain, 5000L);
    }

    private boolean pvs(long j, boolean z) {
        if (this.sUS == null || this.so.od() == null) {
            return false;
        }
        String pvs = CacheDirFactory.getICacheDir(this.so.LHy()).pvs();
        File file = new File(pvs, this.so.od().IP());
        if (file.exists() && file.length() > 0) {
            this.icD = true;
        }
        com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs2 = cR.pvs(pvs, this.so);
        pvs2.icD(this.so.neB());
        pvs2.pvs(this.Mxy.getWidth());
        pvs2.icD(this.Mxy.getHeight());
        pvs2.vG(this.so.HWd());
        pvs2.pvs(j);
        pvs2.pvs(z);
        if (this.vA.icD.pvs() && !this.vA.dX.so() && cR.NB(this.so)) {
            pvs2.Jd = 1;
        }
        return this.sUS.pvs(pvs2);
    }

    public void vG(boolean z) {
        this.vG = z;
    }

    public boolean ZhG() {
        return this.vG;
    }

    public void dyT() {
        kj();
    }

    public void dX() {
        try {
            if (icD()) {
                this.NB = true;
                bNS();
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e.getMessage());
        }
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.video.vG.icD icd) {
        try {
            this.NB = false;
            if (sUS()) {
                Pj();
                icD(icd);
            } else if (Jd()) {
                IP();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void pvs(boolean z, com.bytedance.sdk.openadsdk.core.video.vG.icD icd, boolean z2) {
        if (!z2 || z || this.NB) {
            return;
        }
        if (Jd()) {
            IP();
            Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
        } else {
            Pj();
            icD(icd);
            Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
        }
    }

    public boolean CvL() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar == null || vGVar.kj() == null) {
            return false;
        }
        return this.sUS.kj().pvs();
    }

    protected void icD(com.bytedance.sdk.openadsdk.core.video.vG.icD icd) {
        if (!rCZ() || icd == null) {
            return;
        }
        icd.pvs(Mxy(), true);
    }

    public double Gp() {
        long Jd;
        vA Mxy = this.so.Mxy();
        if (com.bytedance.sdk.openadsdk.core.model.mnm.vG(this.so) && Mxy != null) {
            Jd = Mxy.icD();
        } else if (com.bytedance.sdk.openadsdk.core.model.mnm.Jd(this.so) && Mxy != null) {
            Jd = Mxy.Jd();
        } else {
            com.bykv.vk.openvk.component.video.api.vG.icD od = this.so.od();
            return od != null ? od.sUS() * od.OT() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        return Jd;
    }

    public void ae() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar instanceof com.bytedance.sdk.openadsdk.core.video.vG.pvs) {
            ((com.bytedance.sdk.openadsdk.core.video.vG.pvs) vGVar).dx();
        }
    }

    public View gA() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar instanceof com.bytedance.sdk.openadsdk.core.video.vG.pvs) {
            return (View) ((com.bytedance.sdk.openadsdk.core.video.vG.pvs) vGVar).cRf();
        }
        return null;
    }

    public void jlb() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar instanceof com.bytedance.sdk.openadsdk.core.video.vG.pvs) {
            ((com.bytedance.sdk.openadsdk.core.video.vG.pvs) vGVar).sP();
        }
    }

    public void dx() {
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.sUS;
        if (vGVar instanceof com.bytedance.sdk.openadsdk.core.video.vG.pvs) {
            ((com.bytedance.sdk.openadsdk.core.video.vG.pvs) vGVar).gSd();
        }
    }

    public void Jd(boolean z) {
        this.cR = z;
        if (this.sUS instanceof com.bytedance.sdk.openadsdk.core.video.vG.pvs) {
            if (z) {
                ((com.bytedance.sdk.openadsdk.core.video.vG.pvs) this.sUS).icD(this.so.od().OT());
            } else {
                this.so.od().Wyp(1);
                ((com.bytedance.sdk.openadsdk.core.video.vG.pvs) this.sUS).icD(1);
            }
        }
    }

    public void pvs(pvs.InterfaceC0085pvs interfaceC0085pvs) {
        this.zM = interfaceC0085pvs;
    }
}
