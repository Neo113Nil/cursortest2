package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1510m2 {
    default void a() {
    }

    void a(@Nullable IronSourceError ironSourceError);

    default void b(@NotNull C1565t1 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
    }

    void c(@NotNull C1565t1 c1565t1);
}
