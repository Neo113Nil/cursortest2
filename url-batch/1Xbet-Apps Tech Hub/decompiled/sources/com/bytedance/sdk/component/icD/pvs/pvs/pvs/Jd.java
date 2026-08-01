package com.bytedance.sdk.component.icD.pvs.pvs.pvs;

import android.text.TextUtils;
import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.qh;

/* compiled from: NetClient.java */
/* loaded from: classes.dex */
public class Jd extends qh {
    public pvs Mxy;
    public NB so;

    public Jd(qh.pvs pvsVar) {
        super(pvsVar);
        this.so = new NB();
        this.Mxy = new pvs(this.so.icD());
    }

    @Override // com.bytedance.sdk.component.icD.pvs.qh
    public com.bytedance.sdk.component.icD.pvs.Jd pvs() {
        return this.so;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.qh
    public com.bytedance.sdk.component.icD.pvs.icD pvs(Ju ju) {
        ju.pvs(this);
        if (ju == null || ju.icD() == null || ju.icD().pvs() == null || TextUtils.isEmpty(ju.icD().pvs().toString())) {
            return null;
        }
        if (pvs.pvs != null && pvs.pvs.icD() && this.Mxy.NB() && !"setting".equals(ju.sUS())) {
            icD icd = new icD(ju, this.Mxy);
            this.Mxy.vG().add(icd);
            return icd;
        }
        icD icd2 = new icD(ju, this.so);
        this.so.vG().add(icd2);
        return icd2;
    }
}
