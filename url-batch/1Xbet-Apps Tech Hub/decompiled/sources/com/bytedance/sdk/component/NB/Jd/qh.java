package com.bytedance.sdk.component.NB.Jd;

import androidx.core.view.PointerIconCompat;

/* compiled from: NetVisitor.java */
/* loaded from: classes.dex */
public class qh extends pvs {
    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public String pvs() {
        return "net_request";
    }

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public void pvs(final com.bytedance.sdk.component.NB.vG.vG vGVar) {
        final com.bytedance.sdk.component.NB.vG.sUS zM = vGVar.zM();
        com.bytedance.sdk.component.NB.Jd Jd = zM.Jd();
        vGVar.pvs(false);
        try {
            com.bytedance.sdk.component.NB.sUS pvs = Jd.pvs(new com.bytedance.sdk.component.NB.icD.vG(vGVar.pvs(), vGVar.Ju(), vGVar.IP(), vGVar.OT()));
            int icD = pvs.icD();
            vGVar.pvs(pvs.pvs());
            if (pvs.icD() == 200) {
                final byte[] bArr = (byte[]) pvs.vG();
                vGVar.pvs(new icD(bArr, pvs));
                final String Wyp = vGVar.Wyp();
                final com.bytedance.sdk.component.NB.icD uc = vGVar.uc();
                if (uc.vG()) {
                    zM.icD(vGVar.uc()).pvs(Wyp, bArr);
                }
                zM.sUS().submit(new Runnable() { // from class: com.bytedance.sdk.component.NB.Jd.qh.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (uc.Jd()) {
                            zM.vG(vGVar.uc()).pvs(Wyp, bArr);
                        }
                    }
                });
                return;
            }
            zM.so();
            String.valueOf(pvs);
            Object vG = pvs.vG();
            pvs(icD, pvs.Jd(), vG instanceof Throwable ? (Throwable) vG : null, vGVar);
        } catch (Throwable th) {
            pvs(PointerIconCompat.TYPE_WAIT, "net request failed!", th, vGVar);
        }
    }

    private void pvs(int i, String str, Throwable th, com.bytedance.sdk.component.NB.vG.vG vGVar) {
        vGVar.pvs(new so(i, str, th));
    }
}
