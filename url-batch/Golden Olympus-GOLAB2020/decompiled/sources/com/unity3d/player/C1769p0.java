package com.unity3d.player;

import android.view.WindowInsets;
import com.unity3d.player.UnityPlayer;

/* renamed from: com.unity3d.player.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1769p0 extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f22231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0 f22232c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1769p0(C0 c02, WindowInsets windowInsets) {
        super();
        this.f22232c = c02;
        this.f22231b = windowInsets;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        this.f22232c.f22001a.nativeOnApplyWindowInsets(this.f22231b);
    }
}
