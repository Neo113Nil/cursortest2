package com.unity3d.player;

import android.content.Context;
import android.widget.FrameLayout;
import h1.C2439A;
import h1.C2442c;

/* loaded from: classes2.dex */
public final class U extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final C2439A f22080a;

    /* renamed from: b, reason: collision with root package name */
    public final UnityPlayerForActivityOrService f22081b;

    /* renamed from: c, reason: collision with root package name */
    public final C2442c f22082c;

    public U(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(unityPlayerForActivityOrService.getContext());
        Context context = unityPlayerForActivityOrService.getContext();
        this.f22082c = new C2442c(context);
        this.f22081b = unityPlayerForActivityOrService;
        C2439A c2439a = new C2439A(unityPlayerForActivityOrService);
        this.f22080a = c2439a;
        c2439a.setId(context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName()));
        unityPlayerForActivityOrService.applySurfaceViewSettings(c2439a);
        c2439a.getHolder().addCallback(new T(this));
        c2439a.setFocusable(true);
        c2439a.setFocusableInTouchMode(true);
        c2439a.setContentDescription(context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName())));
        addView(c2439a, new FrameLayout.LayoutParams(-1, -1, 17));
    }
}
