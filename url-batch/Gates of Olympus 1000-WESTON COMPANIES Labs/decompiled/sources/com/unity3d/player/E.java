package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class E extends UnityPlayer.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ H c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(H h, UnityPlayer unityPlayer, int i) {
        super();
        this.c = h;
        this.b = i;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.a
    public final void a() {
        boolean onNodeSelected;
        onNodeSelected = UnityAccessibilityDelegate.onNodeSelected(this.b);
        if (onNodeSelected) {
            this.c.a.sendEventForVirtualViewId(this.b, 1);
        }
    }
}
