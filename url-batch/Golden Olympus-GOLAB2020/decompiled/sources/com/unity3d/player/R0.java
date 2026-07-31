package com.unity3d.player;

import com.unity3d.player.UnityPlayer;

/* loaded from: classes2.dex */
public final class R0 extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForGameActivity f22071b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        super();
        this.f22071b = unityPlayerForGameActivity;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        this.f22071b.nativeUnityPlayerSetRunning(true);
    }
}
