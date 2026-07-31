package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.tm0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hl0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kn0 f26790a;

    public hl0(@NotNull kn0 instreamVastAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        this.f26790a = instreamVastAdPlayer;
    }

    @NotNull
    public final tm0 a(@NotNull db2 uiElements, @NotNull tm0 initialControlsState) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        Intrinsics.checkNotNullParameter(initialControlsState, "initialControlsState");
        boolean z4 = this.f26790a.getVolume() == 0.0f;
        View n4 = uiElements.n();
        Float f4 = null;
        Boolean valueOf = n4 != null ? Boolean.valueOf(n4.isEnabled()) : null;
        ProgressBar j4 = uiElements.j();
        if (j4 != null) {
            int progress = j4.getProgress();
            int max = j4.getMax();
            if (max != 0) {
                f4 = Float.valueOf(progress / max);
            }
        }
        tm0.a aVar = new tm0.a();
        aVar.b(z4);
        if (valueOf != null) {
            aVar.a(valueOf.booleanValue());
        }
        if (f4 != null) {
            aVar.b(f4.floatValue());
        }
        aVar.a(initialControlsState.a());
        return new tm0(aVar);
    }
}
