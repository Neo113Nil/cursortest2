package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class J extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f22033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(N n4, UnityPlayer unityPlayer, int i4) {
        super();
        this.f22033c = n4;
        this.f22032b = i4;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        boolean onNodeInvoked;
        onNodeInvoked = UnityAccessibilityDelegate.onNodeInvoked(this.f22032b);
        if (onNodeInvoked) {
            this.f22033c.f22045a.sendEventForVirtualViewId(this.f22032b, 1);
        }
    }
}
