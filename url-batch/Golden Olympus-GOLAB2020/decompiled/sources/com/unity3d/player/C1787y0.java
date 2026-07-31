package com.unity3d.player;

import com.unity3d.player.UnityPlayer;

/* renamed from: com.unity3d.player.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1787y0 extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787y0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i4, int i5) {
        super();
        this.f22285d = unityPlayerForActivityOrService;
        this.f22283b = i4;
        this.f22284c = i5;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        this.f22285d.nativeSetInputSelection(this.f22283b, this.f22284c);
    }
}
