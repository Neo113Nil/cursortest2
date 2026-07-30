package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Db, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0367Db implements InterfaceC1173dZ {
    public final View A00;
    public final C1159dL A01;

    public C0367Db(C1159dL c1159dL, View view) {
        this.A01 = c1159dL;
        this.A00 = view;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1173dZ
    public final double A9N() {
        C1233eY result = C1232eX.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
