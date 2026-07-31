package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.IReporter;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.bf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1830bf implements mp1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W1.h f23730a;

    public C1830bf(@NotNull W1.h lazyReporter) {
        Intrinsics.checkNotNullParameter(lazyReporter, "lazyReporter");
        this.f23730a = lazyReporter;
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void a(@NotNull ip1 report) {
        Intrinsics.checkNotNullParameter(report, "report");
        try {
            ((IReporter) this.f23730a.getValue()).reportEvent(report.c(), report.b());
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void reportAnr(@NotNull Map<Thread, StackTraceElement[]> traces) {
        Intrinsics.checkNotNullParameter(traces, "traces");
        try {
            ((IReporter) this.f23730a.getValue()).reportAnr(traces);
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.j50
    public final void reportError(@NotNull String message, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            ((IReporter) this.f23730a.getValue()).reportError(message, error);
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void reportUnhandledException(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            ((IReporter) this.f23730a.getValue()).reportUnhandledException(throwable);
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
        }
    }
}
