package com.ironsource;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1595y0 {
    @NotNull
    String a();

    default void a(@NotNull sj adInstance, @NotNull Map<String, String> loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
    }
}
