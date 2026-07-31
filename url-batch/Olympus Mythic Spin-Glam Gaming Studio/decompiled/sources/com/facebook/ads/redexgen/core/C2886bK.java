package com.facebook.ads.redexgen.core;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.bK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2886bK implements LayoutTransition.TransitionListener {
    public final /* synthetic */ C2887bL A00;

    public C2886bK(C2887bL c2887bL) {
        this.A00 = c2887bL;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        ((AbstractC2881bF) this.A00.A00.A00).A09.setAlpha(1.0f);
        this.A00.A00.A00.A0Q.setAlpha(1.0f);
        this.A00.A00.A00.A0P.setAlpha(1.0f);
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }
}
