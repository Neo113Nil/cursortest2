package ru.rustore.sdk.core.util;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import o2.AbstractC3313G;
import o2.AbstractC3344n0;
import o2.Z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class ThreadUtilsKt {
    @NotNull
    public static final AbstractC3313G asCoroutineDispatcherOrMain(@Nullable Executor executor) {
        AbstractC3313G b4;
        return (executor == null || (b4 = AbstractC3344n0.b(executor)) == null) ? Z.c() : b4;
    }
}
