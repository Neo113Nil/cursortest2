package com.unity3d.player;

/* loaded from: classes2.dex */
public final class I0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22031a;

    public I0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f22031a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.f22031a;
        z4 = unityPlayerForActivityOrService.mMainDisplayOverride;
        if (z4) {
            unityPlayerForActivityOrService.getFrameLayout().removeView(this.f22031a.getView());
        } else if (unityPlayerForActivityOrService.getView().getParent() == null) {
            this.f22031a.getFrameLayout().addView(this.f22031a.getView());
        } else {
            h1.T.a(5, "Couldn't add view, because it's already assigned to another parent");
        }
    }
}
