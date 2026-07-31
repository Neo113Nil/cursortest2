package com.unity3d.player;

import android.graphics.Rect;
import com.unity3d.player.UnityPlayer;

/* renamed from: com.unity3d.player.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1789z0 extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f22287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789z0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Rect rect) {
        super();
        this.f22288c = unityPlayerForActivityOrService;
        this.f22287b = rect;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.f22288c;
        Rect rect = this.f22287b;
        unityPlayerForActivityOrService.nativeSetInputArea(rect.left, rect.top, rect.right, rect.bottom);
    }
}
