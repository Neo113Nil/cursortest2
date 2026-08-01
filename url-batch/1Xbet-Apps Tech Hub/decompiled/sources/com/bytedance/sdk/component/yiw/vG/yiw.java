package com.bytedance.sdk.component.yiw.vG;

import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.bNS;
import com.bytedance.sdk.component.icD.pvs.so;
import java.io.IOException;

/* compiled from: TncHostInterceptor.java */
/* loaded from: classes.dex */
public class yiw implements com.bytedance.sdk.component.icD.pvs.so {
    private int pvs;

    public void pvs(int i) {
        this.pvs = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    @Override // com.bytedance.sdk.component.icD.pvs.so
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bNS pvs(so.pvs pvsVar) throws IOException {
        bNS bns;
        Exception e;
        Ju pvs = pvsVar.pvs();
        if (so.pvs().pvs(this.pvs).icD() != null) {
            so.pvs().pvs(this.pvs).icD().NB();
        }
        String yiwVar = pvs.icD().toString();
        String pvs2 = so.pvs().pvs(this.pvs).pvs(yiwVar);
        if (!yiwVar.equals(pvs2)) {
            pvs = pvs.Mxy().icD(pvs2).icD();
        }
        IOException iOException = null;
        try {
            bns = pvsVar.pvs(pvs);
        } catch (Exception e2) {
            bns = null;
            e = e2;
        }
        try {
            if (bns.vG() == -1) {
                so.pvs().pvs(this.pvs).pvs(pvs, new IOException());
            }
        } catch (Exception e3) {
            e = e3;
            IOException iOException2 = new IOException(e.getMessage());
            so.pvs().pvs(this.pvs).pvs(pvs, e);
            iOException = iOException2;
            so.pvs().pvs(this.pvs).pvs(pvs, bns);
            if (iOException != null) {
            }
        }
        so.pvs().pvs(this.pvs).pvs(pvs, bns);
        if (iOException != null) {
            return bns == null ? pvsVar.pvs(pvs) : bns;
        }
        throw iOException;
    }
}
