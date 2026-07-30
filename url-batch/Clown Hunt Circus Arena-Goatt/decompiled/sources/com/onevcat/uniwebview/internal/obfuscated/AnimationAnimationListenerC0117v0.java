package com.onevcat.uniwebview.internal.obfuscated;

import android.view.animation.Animation;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0117v0 implements Animation.AnimationListener {
    public final /* synthetic */ com.onevcat.uniwebview.d a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public AnimationAnimationListenerC0117v0(com.onevcat.uniwebview.d dVar, boolean z, String str) {
        this.a = dVar;
        this.b = z;
        this.c = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        com.onevcat.uniwebview.d dVar = this.a;
        dVar.i = null;
        dVar.a(this.c, this.b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
