package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class Y6 implements View.OnClickListener {
    public final /* synthetic */ Y9 A00;

    public Y6(Y9 y9) {
        this.A00 = y9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0D();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
