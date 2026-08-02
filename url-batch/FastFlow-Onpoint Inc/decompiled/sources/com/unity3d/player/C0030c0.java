package com.unity3d.player;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: com.unity3d.player.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030c0 extends OrientationEventListener {
    public final /* synthetic */ UnityPlayer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0030c0(UnityPlayer unityPlayer, Context context, int i) {
        super(context, i);
        this.a = unityPlayer;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        UnityPlayer unityPlayer = this.a;
        unityPlayer.onOrientationChanged(unityPlayer.mNaturalOrientation, i);
    }
}
