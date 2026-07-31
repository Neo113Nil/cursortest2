package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class sp {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f19632a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LevelPlay.AdFormat f19633b;

    public sp(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f19632a = placementName;
        this.f19633b = adFormat;
    }

    @NotNull
    public final String a() {
        return this.f19632a + '_' + this.f19633b;
    }
}
