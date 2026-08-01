package com.bytedance.sdk.openadsdk.mnm.pvs;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.mnm.pvs.NB;

/* compiled from: PAGDisplayMrcTracker.java */
/* loaded from: classes2.dex */
public class vG extends icD {
    private int Jd;

    @Override // com.bytedance.sdk.openadsdk.mnm.pvs.icD
    protected void icD(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.mnm.pvs.icD
    public int sUS() {
        return 100;
    }

    public vG(Integer num, View view, cR cRVar, NB.pvs pvsVar) {
        super(num, view, cRVar, 1000, pvsVar);
        this.Jd = -1;
        icD(view);
    }

    @Override // com.bytedance.sdk.openadsdk.mnm.pvs.icD
    protected boolean vG() {
        if (this.pvs == null || this.pvs.get() == null) {
            return false;
        }
        View view = this.pvs.get();
        if (this.Jd == -1) {
            icD(view);
        }
        return sUS.pvs(view, this.Jd == 1, this.icD.LDD());
    }

    private void icD(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.Jd = width * height >= 242500 ? 1 : 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mnm.pvs.icD
    protected void Jd() {
        super.Jd();
    }
}
