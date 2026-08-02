package com.unity3d.player;

import com.unity3d.player.UnityPlayer;

/* loaded from: classes.dex */
public final class K0 extends UnityPlayer.a {
    public final /* synthetic */ UnityPlayerForGameActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        super();
        this.b = unityPlayerForGameActivity;
    }

    @Override // com.unity3d.player.UnityPlayer.a
    public final void a() {
        this.b.nativeUnityPlayerSetRunning(true);
    }
}
