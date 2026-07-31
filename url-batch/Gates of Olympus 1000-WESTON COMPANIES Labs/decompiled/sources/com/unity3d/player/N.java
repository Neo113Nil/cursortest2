package com.unity3d.player;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.unity3d.player.a.C0113f;

/* loaded from: classes2.dex */
public final class N extends FrameLayout {
    public final C0113f a;
    public final UnityPlayerForActivityOrService b;
    public final com.unity3d.player.a.D c;

    public N(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(unityPlayerForActivityOrService.getContext());
        Context context = unityPlayerForActivityOrService.getContext();
        this.c = new com.unity3d.player.a.D(context);
        this.b = unityPlayerForActivityOrService;
        C0113f c0113f = new C0113f(unityPlayerForActivityOrService);
        this.a = c0113f;
        c0113f.setId(context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName()));
        unityPlayerForActivityOrService.applySurfaceViewSettings(c0113f);
        c0113f.getHolder().addCallback(new M(this));
        c0113f.setFocusable(true);
        c0113f.setFocusableInTouchMode(true);
        c0113f.setContentDescription(context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", TypedValues.Custom.S_STRING, context.getPackageName())));
        addView(c0113f, new FrameLayout.LayoutParams(-1, -1, 17));
    }
}
