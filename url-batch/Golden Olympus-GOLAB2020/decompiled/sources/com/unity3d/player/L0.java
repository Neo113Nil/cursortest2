package com.unity3d.player;

import android.view.ViewGroup;
import h1.C2439A;

/* loaded from: classes2.dex */
public final class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f22041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22042b;

    public L0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, float f4) {
        this.f22042b = unityPlayerForActivityOrService;
        this.f22041a = f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U view = this.f22042b.getView();
        if (view != null) {
            float f4 = this.f22041a;
            C2439A c2439a = view.f22080a;
            c2439a.f36700a = f4;
            ViewGroup.LayoutParams layoutParams = c2439a.getLayoutParams();
            if (f4 <= 0.0f) {
                layoutParams.width = -1;
                layoutParams.height = -1;
            } else {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            c2439a.setLayoutParams(layoutParams);
        }
    }
}
