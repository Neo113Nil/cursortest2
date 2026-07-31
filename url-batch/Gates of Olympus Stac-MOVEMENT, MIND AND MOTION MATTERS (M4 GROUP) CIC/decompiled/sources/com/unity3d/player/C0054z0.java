package com.unity3d.player;

/* renamed from: com.unity3d.player.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0054z0 extends V0 {
    final /* synthetic */ boolean b;
    final /* synthetic */ UnityPlayer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0054z0(UnityPlayer unityPlayer, boolean z) {
        super(unityPlayer);
        this.c = unityPlayer;
        this.b = z;
    }

    @Override // com.unity3d.player.V0
    public final void a() {
        this.c.nativeSetKeyboardIsVisible(this.b);
    }
}
