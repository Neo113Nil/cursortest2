package com.unity3d.player;

import android.widget.FrameLayout;
import h1.C2441b;
import h1.C2442c;

/* loaded from: classes2.dex */
public final class K0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22038a;

    public K0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f22038a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U view = this.f22038a.getView();
        if (view != null) {
            C2442c c2442c = view.f22082c;
            FrameLayout frameLayout = view.f22081b.getFrameLayout();
            C2441b c2441b = c2442c.f36733b;
            if (c2441b != null && c2441b.getParent() != null) {
                frameLayout.removeView(c2442c.f36733b);
            }
            view.f22082c.f36733b = null;
        }
    }
}
