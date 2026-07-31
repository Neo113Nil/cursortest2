package com.unity3d.player;

import com.unity3d.player.UnityPlayer;

/* loaded from: classes2.dex */
public final class P0 extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForGameActivity f22066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(UnityPlayerForGameActivity unityPlayerForGameActivity, int i4, int i5) {
        super();
        this.f22066d = unityPlayerForGameActivity;
        this.f22064b = i4;
        this.f22065c = i5;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        this.f22066d.nativeOrientationChanged(this.f22064b, this.f22065c);
    }
}
