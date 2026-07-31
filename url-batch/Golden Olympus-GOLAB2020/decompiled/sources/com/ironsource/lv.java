package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class lv {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q9 f17118a;

    public lv(@NotNull q9 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f17118a = currentTimeProvider;
    }

    public final boolean a(long j4, long j5) {
        long a4 = this.f17118a.a();
        return j5 <= 0 || j4 <= 0 || a4 < j4 || a4 - j4 > j5;
    }
}
