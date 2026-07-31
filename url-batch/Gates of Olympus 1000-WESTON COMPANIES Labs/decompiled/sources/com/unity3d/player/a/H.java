package com.unity3d.player.a;

import android.view.ViewTreeObserver;
import com.unity3d.player.C0173y;

/* loaded from: classes2.dex */
public final class H implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C0173y a;

    public H(C0173y c0173y) {
        this.a = c0173y;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.reportSoftInputArea();
    }
}
