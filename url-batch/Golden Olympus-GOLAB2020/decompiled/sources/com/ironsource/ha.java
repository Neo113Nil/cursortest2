package com.ironsource;

import com.ironsource.AbstractC1466g0;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class ha extends AbstractC1466g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(@NotNull AbstractC1584w1 adUnitData, @NotNull dw waterfallInstances) {
        super(adUnitData, waterfallInstances);
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.AbstractC1466g0
    public void a(@NotNull AbstractC1424a0 instance, @NotNull AbstractC1466g0.b loadSelection) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        IronLog.INTERNAL.verbose(instance.d().name() + " - Instance " + instance.p() + " is ready to load");
        loadSelection.a().add(instance);
    }
}
