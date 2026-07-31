package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class O extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22059b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(UnityPlayer unityPlayer, boolean z4) {
        super();
        this.f22059b = z4;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        UnityAccessibilityDelegate.onScreenReaderStatusChanged(this.f22059b);
    }
}
