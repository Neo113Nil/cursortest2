package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ho extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(@NotNull Exception e4) {
        super("Missing Headers", e4);
        Intrinsics.checkNotNullParameter(e4, "e");
    }
}
