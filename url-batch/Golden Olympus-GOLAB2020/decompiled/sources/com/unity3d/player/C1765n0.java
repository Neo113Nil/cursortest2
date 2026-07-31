package com.unity3d.player;

import com.unity3d.player.UnityPlayer;

/* renamed from: com.unity3d.player.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1765n0 extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1767o0 f22198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1765n0(C1767o0 c1767o0, boolean z4) {
        super();
        this.f22198c = c1767o0;
        this.f22197b = z4;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        UnityPlayer.permissionResponseToNative(this.f22198c.f22229a, this.f22197b);
    }
}
