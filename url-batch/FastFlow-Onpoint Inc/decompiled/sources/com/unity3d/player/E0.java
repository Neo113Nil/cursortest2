package com.unity3d.player;

import android.view.ViewGroup;
import com.unity3d.player.a.C0006f;

/* loaded from: classes.dex */
public final class E0 implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public E0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, float f) {
        this.b = unityPlayerForActivityOrService;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N view = this.b.getView();
        if (view != null) {
            float f = this.a;
            C0006f c0006f = view.a;
            c0006f.a = f;
            ViewGroup.LayoutParams layoutParams = c0006f.getLayoutParams();
            if (f <= 0.0f) {
                layoutParams.width = -1;
                layoutParams.height = -1;
            } else {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            c0006f.setLayoutParams(layoutParams);
        }
    }
}
