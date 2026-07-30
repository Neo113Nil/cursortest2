package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class EE implements InterfaceC1724er {
    public final View A00;
    public final C1839gi A01;

    public EE(C1839gi c1839gi, View view) {
        this.A01 = c1839gi;
        this.A00 = view;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1724er
    public final double A9V() {
        C1785fq result = C1784fp.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
