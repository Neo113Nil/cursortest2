package com.bytedance.sdk.component.NB.Jd;

import android.graphics.Bitmap;

/* compiled from: DecoderVisitor.java */
/* loaded from: classes.dex */
public class NB extends pvs {
    private com.bytedance.sdk.component.NB.sUS icD;
    private byte[] pvs;

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public String pvs() {
        return "decode";
    }

    public NB(byte[] bArr, com.bytedance.sdk.component.NB.sUS sus) {
        this.pvs = bArr;
        this.icD = sus;
    }

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public void pvs(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        com.bytedance.sdk.component.NB.vG.sUS zM = vGVar.zM();
        com.bytedance.sdk.component.NB.vG.icD.pvs pvs = zM.pvs(vGVar);
        try {
            vGVar.OT();
            Bitmap pvs2 = pvs.pvs(this.pvs);
            if (pvs2 != null) {
                vGVar.pvs(new Ju(pvs2, this.icD, false));
                zM.pvs(vGVar.uc()).pvs(vGVar.NB(), pvs2);
                return;
            }
            pvs(1002, "decode failed bitmap null", null, vGVar);
        } catch (Throwable th) {
            pvs(1002, "decode failed:" + th.getMessage(), th, vGVar);
        }
    }

    private void pvs(int i, String str, Throwable th, com.bytedance.sdk.component.NB.vG.vG vGVar) {
        if (this.icD == null) {
            vGVar.pvs(new qh());
        } else {
            vGVar.pvs(new so(i, str, th));
        }
    }
}
