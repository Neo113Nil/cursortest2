package com.unity3d.player;

import android.view.ViewGroup;
import com.unity3d.player.a.C0143g;

/* loaded from: classes.dex */
public final class M0 implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public M0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, float f) {
        this.b = unityPlayerForActivityOrService;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V view = this.b.getView();
        if (view != null) {
            float f = this.a;
            C0143g c0143g = view.a;
            c0143g.a = f;
            ViewGroup.LayoutParams layoutParams = c0143g.getLayoutParams();
            if (f <= 0.0f) {
                layoutParams.width = -1;
                layoutParams.height = -1;
            } else {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            c0143g.setLayoutParams(layoutParams);
        }
    }
}
