package com.unity3d.player;

import android.content.Context;
import android.widget.FrameLayout;
import com.unity3d.player.a.C0143g;

/* loaded from: classes.dex */
public final class V extends FrameLayout {
    public final C0143g a;
    public final UnityPlayerForActivityOrService b;
    public final com.unity3d.player.a.C c;

    public V(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(unityPlayerForActivityOrService.getContext());
        Context context = unityPlayerForActivityOrService.getContext();
        this.c = new com.unity3d.player.a.C(context);
        this.b = unityPlayerForActivityOrService;
        C0143g c0143g = new C0143g(unityPlayerForActivityOrService);
        this.a = c0143g;
        c0143g.setId(context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName()));
        unityPlayerForActivityOrService.applySurfaceViewSettings(c0143g);
        c0143g.getHolder().addCallback(new U(this));
        c0143g.setFocusable(true);
        c0143g.setFocusableInTouchMode(true);
        c0143g.setContentDescription(context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName())));
        addView(c0143g, new FrameLayout.LayoutParams(-1, -1, 17));
    }
}
