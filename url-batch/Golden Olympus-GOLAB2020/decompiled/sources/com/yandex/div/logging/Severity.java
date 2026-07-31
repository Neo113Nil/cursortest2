package com.yandex.div.logging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public enum Severity {
    ERROR,
    WARNING,
    INFO,
    DEBUG,
    VERBOSE;

    public final boolean isAtLeast(@NotNull Severity minLevel) {
        Intrinsics.checkNotNullParameter(minLevel, "minLevel");
        return ordinal() >= minLevel.ordinal();
    }
}
