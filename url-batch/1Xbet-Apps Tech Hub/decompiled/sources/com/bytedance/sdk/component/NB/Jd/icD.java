package com.bytedance.sdk.component.NB.Jd;

/* compiled from: BytesVisitor.java */
/* loaded from: classes.dex */
public class icD implements Mxy {
    private com.bytedance.sdk.component.NB.sUS icD;
    private byte[] pvs;

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public String pvs() {
        return "image_type";
    }

    public icD(byte[] bArr, com.bytedance.sdk.component.NB.sUS sus) {
        this.pvs = bArr;
        this.icD = sus;
    }

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public void pvs(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        Mxy soVar;
        int kj = vGVar.kj();
        vGVar.pvs(this.pvs.length);
        if (kj != 2) {
            if (kj == 3) {
                byte[] bArr = this.pvs;
                soVar = new Ju(bArr, this.icD, com.bytedance.sdk.component.NB.vG.vG.pvs.icD(bArr));
            } else {
                boolean icD = com.bytedance.sdk.component.NB.vG.vG.pvs.icD(this.pvs);
                if (icD) {
                    soVar = new Ju(this.pvs, this.icD, icD);
                } else if (com.bytedance.sdk.component.NB.vG.vG.pvs.pvs(this.pvs)) {
                    soVar = new NB(this.pvs, this.icD);
                } else {
                    soVar = new Ju(this.pvs, this.icD, icD);
                }
            }
        } else if (com.bytedance.sdk.component.NB.vG.vG.pvs.pvs(this.pvs)) {
            soVar = new NB(this.pvs, this.icD);
        } else if (this.icD == null) {
            soVar = new qh();
        } else {
            soVar = new so(1001, "not image format", null);
        }
        vGVar.pvs(soVar);
    }
}
