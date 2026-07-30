package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class Z0 implements View.OnClickListener {
    public final /* synthetic */ LS A00;

    public Z0(LS ls) {
        this.A00 = ls;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A9U();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
