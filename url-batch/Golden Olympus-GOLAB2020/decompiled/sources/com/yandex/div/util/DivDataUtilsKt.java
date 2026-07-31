package com.yandex.div.util;

import O1.C1165z4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivDataUtilsKt {
    public static final long getINVALID_STATE_ID(@NotNull C1165z4.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return -1L;
    }

    public static final long getInitialStateId(@NotNull C1165z4 c1165z4) {
        Intrinsics.checkNotNullParameter(c1165z4, "<this>");
        return c1165z4.f8711c.isEmpty() ? getINVALID_STATE_ID(C1165z4.f8706j) : ((C1165z4.c) c1165z4.f8711c.get(0)).f8722b;
    }
}
