package com.ironsource;

import com.ironsource.mediationsdk.model.BasePlacement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class h7 extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(int i4, @NotNull String placementName, boolean z4, @Nullable mp mpVar) {
        super(i4, placementName, z4, mpVar);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.ironsource.mediationsdk.model.BasePlacement
    @NotNull
    public String toString() {
        return super.toString() + ", placementId: " + getPlacementId();
    }
}
