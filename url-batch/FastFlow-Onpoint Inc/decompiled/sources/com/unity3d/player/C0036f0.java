package com.unity3d.player;

import com.unity3d.player.UnityPlayer;

/* renamed from: com.unity3d.player.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036f0 extends UnityPlayer.a {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C0038g0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0036f0(C0038g0 c0038g0, boolean z) {
        super();
        this.c = c0038g0;
        this.b = z;
    }

    @Override // com.unity3d.player.UnityPlayer.a
    public final void a() {
        UnityPlayer.permissionResponseToNative(this.c.a, this.b);
    }
}
