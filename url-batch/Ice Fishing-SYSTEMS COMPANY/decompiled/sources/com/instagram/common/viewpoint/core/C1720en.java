package com.instagram.common.viewpoint.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.en, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1720en extends ViewOutlineProvider {
    public final /* synthetic */ C1723eq A00;

    public C1720en(C1723eq c1723eq) {
        this.A00 = c1723eq;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 8.0f);
    }
}
