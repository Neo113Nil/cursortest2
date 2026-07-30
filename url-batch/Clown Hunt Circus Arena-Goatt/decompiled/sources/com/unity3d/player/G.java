package com.unity3d.player;

import android.content.res.Configuration;
import com.unity3d.player.UnityPlayer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class G extends UnityPlayer.b {
    public final /* synthetic */ Configuration b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(UnityPlayer unityPlayer, Configuration configuration) {
        super();
        this.b = configuration;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        UnityAccessibilityDelegate.onFontScaleChanged(this.b.fontScale);
    }
}
