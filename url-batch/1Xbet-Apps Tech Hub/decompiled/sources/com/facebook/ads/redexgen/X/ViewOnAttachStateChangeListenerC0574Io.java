package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Io, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnAttachStateChangeListenerC0574Io implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC0572Im A00;
    public final /* synthetic */ C0573In A01;

    public ViewOnAttachStateChangeListenerC0574Io(C0573In c0573In, EnumC0572Im enumC0572Im) {
        this.A01 = c0573In;
        this.A00 = enumC0572Im;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
