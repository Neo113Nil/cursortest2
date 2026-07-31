package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ed {
    @NotNull
    public final dd a(@NotNull fd listener, @NotNull C1525o1 adTools, @NotNull C1460f1 adProperties, @NotNull qd fullscreenAdUnitFactory) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        return new dd(listener, adTools, adProperties, null, fullscreenAdUnitFactory, 8, null);
    }
}
