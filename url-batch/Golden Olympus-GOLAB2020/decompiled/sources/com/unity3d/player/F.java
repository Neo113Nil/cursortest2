package com.unity3d.player;

import android.content.res.Configuration;
import com.unity3d.player.UnityPlayer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class F extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Configuration f22011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(UnityPlayer unityPlayer, Configuration configuration) {
        super();
        this.f22011b = configuration;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        UnityAccessibilityDelegate.onFontScaleChanged(this.f22011b.fontScale);
    }
}
