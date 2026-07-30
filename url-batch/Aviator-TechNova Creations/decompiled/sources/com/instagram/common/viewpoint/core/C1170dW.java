package com.instagram.common.viewpoint.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.dW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1170dW extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C1172dY A01;

    public C1170dW(C1172dY c1172dY, float f) {
        this.A01 = c1172dY;
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }
}
