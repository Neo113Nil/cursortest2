package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class L extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(UnityPlayer unityPlayer, int i4, int i5) {
        super();
        this.f22039b = i4;
        this.f22040c = i5;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        UnityAccessibilityDelegate.onNodeScrolled(this.f22039b, this.f22040c);
    }
}
