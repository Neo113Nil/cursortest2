package com.unity3d.player.a;

import android.view.ViewTreeObserver;
import com.unity3d.player.C0066y;

/* loaded from: classes.dex */
public final class H implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C0066y a;

    public H(C0066y c0066y) {
        this.a = c0066y;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.reportSoftInputArea();
    }
}
