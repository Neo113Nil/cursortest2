package com.unity3d.player;

import android.view.WindowInsets;
import com.unity3d.player.UnityPlayer;

/* renamed from: com.unity3d.player.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187q0 extends UnityPlayer.b {
    public final /* synthetic */ WindowInsets b;
    public final /* synthetic */ D0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0187q0(D0 d0, WindowInsets windowInsets) {
        super();
        this.c = d0;
        this.b = windowInsets;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        this.c.a.nativeOnApplyWindowInsets(this.b);
    }
}
