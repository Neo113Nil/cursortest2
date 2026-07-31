package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface vu {
    static /* synthetic */ void a(vu vuVar, Runnable runnable, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
        }
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        vuVar.a(runnable, j4);
    }

    void a(@NotNull Runnable runnable);

    void a(@NotNull Runnable runnable, long j4);
}
