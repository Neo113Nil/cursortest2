package com.unity3d.player;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes2.dex */
public final class C0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22001a;

    public C0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f22001a = unityPlayerForActivityOrService;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.f22001a.invokeOnMainThread((Runnable) new C1769p0(this, windowInsets));
        return windowInsets;
    }
}
