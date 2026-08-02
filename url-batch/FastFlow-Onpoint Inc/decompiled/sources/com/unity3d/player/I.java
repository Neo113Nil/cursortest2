package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class I extends UnityPlayer.a {
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(UnityPlayer unityPlayer, boolean z) {
        super();
        this.b = z;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.a
    public final void a() {
        UnityAccessibilityDelegate.sendScreenReaderStatusChangedNotification(this.b);
    }
}
