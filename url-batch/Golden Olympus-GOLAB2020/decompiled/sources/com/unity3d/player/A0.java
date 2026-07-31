package com.unity3d.player;

import com.unity3d.player.UnityPlayer;

/* loaded from: classes2.dex */
public final class A0 extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f21992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f21993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, boolean z4) {
        super();
        this.f21993c = unityPlayerForActivityOrService;
        this.f21992b = z4;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        this.f21993c.nativeSetKeyboardIsVisible(this.f21992b);
    }
}
