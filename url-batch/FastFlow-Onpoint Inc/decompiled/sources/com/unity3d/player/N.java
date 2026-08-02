package com.unity3d.player;

import android.content.Context;
import android.widget.FrameLayout;
import com.unity3d.player.a.C0006f;

/* loaded from: classes.dex */
public final class N extends FrameLayout {
    public final C0006f a;
    public final UnityPlayerForActivityOrService b;
    public final com.unity3d.player.a.D c;

    public N(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(unityPlayerForActivityOrService.getContext());
        Context context = unityPlayerForActivityOrService.getContext();
        this.c = new com.unity3d.player.a.D(context);
        this.b = unityPlayerForActivityOrService;
        C0006f c0006f = new C0006f(unityPlayerForActivityOrService);
        this.a = c0006f;
        c0006f.setId(context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName()));
        unityPlayerForActivityOrService.applySurfaceViewSettings(c0006f);
        c0006f.getHolder().addCallback(new M(this));
        c0006f.setFocusable(true);
        c0006f.setFocusableInTouchMode(true);
        c0006f.setContentDescription(context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName())));
        addView(c0006f, new FrameLayout.LayoutParams(-1, -1, 17));
    }
}
