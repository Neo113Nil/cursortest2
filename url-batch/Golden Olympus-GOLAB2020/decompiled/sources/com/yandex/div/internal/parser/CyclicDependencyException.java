package com.yandex.div.internal.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class CyclicDependencyException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CyclicDependencyException(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
