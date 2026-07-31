package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class K extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22036c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f22037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(N n4, UnityPlayer unityPlayer, int i4, int i5) {
        super();
        this.f22037d = n4;
        this.f22035b = i4;
        this.f22036c = i5;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        if (this.f22035b == 4096) {
            UnityAccessibilityDelegate.onNodeIncremented(this.f22036c);
        } else {
            UnityAccessibilityDelegate.onNodeDecremented(this.f22036c);
        }
        this.f22037d.f22045a.sendEventForVirtualViewId(this.f22036c, 4);
    }
}
