package com.ironsource.mediationsdk.model;

import com.ironsource.mp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class InterstitialPlacement extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialPlacement(int i4, @NotNull String placementName, boolean z4, @Nullable mp mpVar) {
        super(i4, placementName, z4, mpVar);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }
}
