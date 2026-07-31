package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.sd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2228sd {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f31688a;

    public C2228sd(@NotNull mp1 reporter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f31688a = reporter;
    }

    public final void a(@NotNull Map<Thread, StackTraceElement[]> traces) {
        Intrinsics.checkNotNullParameter(traces, "traces");
        this.f31688a.reportAnr(traces);
    }
}
