package com.unity3d.player;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class Z implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ C0008c0 a;

    Z(C0008c0 c0008c0) {
        this.a = c0008c0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.reportSoftInputArea();
        this.a.h.b();
    }
}
