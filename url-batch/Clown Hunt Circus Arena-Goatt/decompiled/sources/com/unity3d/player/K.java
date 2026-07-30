package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class K extends UnityPlayer.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ O c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(O o, UnityPlayer unityPlayer, int i) {
        super();
        this.c = o;
        this.b = i;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        boolean onNodeInvoked;
        onNodeInvoked = UnityAccessibilityDelegate.onNodeInvoked(this.b);
        if (onNodeInvoked) {
            this.c.a.sendEventForVirtualViewId(this.b, 1);
        }
    }
}
