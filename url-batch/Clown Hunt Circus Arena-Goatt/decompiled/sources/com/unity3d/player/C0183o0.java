package com.unity3d.player;

import com.unity3d.player.UnityPlayer;

/* renamed from: com.unity3d.player.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183o0 extends UnityPlayer.b {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C0185p0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183o0(C0185p0 c0185p0, boolean z) {
        super();
        this.c = c0185p0;
        this.b = z;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        UnityPlayer.permissionResponseToNative(this.c.a, this.b);
    }
}
