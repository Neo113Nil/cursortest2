package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ZC implements View.OnClickListener {
    public final /* synthetic */ ZH A00;

    public ZC(ZH zh) {
        this.A00 = zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1153dL c1153dL;
        ZG zg;
        ZG zg2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            c1153dL = this.A00.A09;
            c1153dL.A0F().A9o();
            zg = this.A00.A04;
            if (zg == null) {
                return;
            }
            zg2 = this.A00.A04;
            zg2.ACl();
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
