package com.onevcat.uniwebview.internal.obfuscated;

import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0113u0 implements Animation.AnimationListener {
    public final /* synthetic */ com.onevcat.uniwebview.d a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    public AnimationAnimationListenerC0113u0(com.onevcat.uniwebview.d dVar, int i, int i2, int i3, int i4, String str) {
        this.a = dVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        com.onevcat.uniwebview.d dVar = this.a;
        dVar.i = null;
        dVar.a(this.b, this.c, this.d, this.e);
        com.onevcat.uniwebview.a aVar = this.a.v;
        H3 method = H3.AnimateToFinished;
        String parameters = this.f;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        aVar.j.a(method, parameters);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
