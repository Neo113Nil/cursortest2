package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class H extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(UnityPlayer unityPlayer, int i4) {
        super();
        this.f22018b = i4;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        UnityAccessibilityDelegate.onNodeFocusChanged(this.f22018b, true);
    }
}
