package com.unity3d.player;

import android.view.WindowInsets;
import com.unity3d.player.UnityPlayer;

/* renamed from: com.unity3d.player.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0149i0 extends UnityPlayer.a {
    public final /* synthetic */ WindowInsets b;
    public final /* synthetic */ v0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0149i0(v0 v0Var, WindowInsets windowInsets) {
        super();
        this.c = v0Var;
        this.b = windowInsets;
    }

    @Override // com.unity3d.player.UnityPlayer.a
    public final void a() {
        this.c.a.nativeOnApplyWindowInsets(this.b);
    }
}
