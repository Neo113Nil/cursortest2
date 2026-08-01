package com.bytedance.sdk.openadsdk.mnm.pvs;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.mnm.pvs.NB;
import com.facebook.ads.AdError;

/* compiled from: PAGVideoMrcTracker.java */
/* loaded from: classes2.dex */
public class so extends icD {
    private int Jd;

    @Override // com.bytedance.sdk.openadsdk.mnm.pvs.icD
    public int sUS() {
        return 200;
    }

    public so(Integer num, View view, cR cRVar, NB.pvs pvsVar) {
        super(num, view, cRVar, AdError.SERVER_ERROR_CODE, pvsVar);
        this.Jd = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.mnm.pvs.icD
    protected boolean vG() {
        return sUS.pvs(this.pvs.get(), this.icD.LDD()) && this.Jd == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.mnm.pvs.icD
    protected void Jd() {
        super.Jd();
    }

    @Override // com.bytedance.sdk.openadsdk.mnm.pvs.icD
    public void pvs() {
        if (this.Jd != 1) {
            return;
        }
        super.pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.mnm.pvs.icD
    protected void icD(int i) {
        if (Mxy()) {
            return;
        }
        if (i == 6 || i == 5) {
            this.Jd = 0;
            so();
        }
        if (i == 3 || i == 2) {
            this.Jd = 2;
            so();
        }
        if (this.Jd == 1 || i != 0) {
            return;
        }
        this.Jd = 1;
        pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.mnm.pvs.icD
    public boolean kj() {
        int i = this.Jd;
        boolean z = i == 2 || i == 0;
        if (z) {
            this.vG.set(false);
        }
        return !z || super.kj();
    }
}
