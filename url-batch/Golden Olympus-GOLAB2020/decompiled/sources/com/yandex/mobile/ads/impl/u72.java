package com.yandex.mobile.ads.impl;

import java.lang.Thread;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class u72 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f32852a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Thread.UncaughtExceptionHandler f32853b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final du1 f32854c;

    public u72(@NotNull mp1 reporter, @Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NotNull du1 sdkConfiguration) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.f32852a = reporter;
        this.f32853b = uncaughtExceptionHandler;
        this.f32854c = sdkConfiguration;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(@NotNull Thread thread, @NotNull Throwable throwable) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            Set<u50> o4 = this.f32854c.o();
            if (o4 == null) {
                o4 = kotlin.collections.T.e();
            }
            StackTraceElement[] stackTrace = throwable.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            if (y12.a(stackTrace, o4)) {
                this.f32852a.reportUnhandledException(throwable);
            }
            if (this.f32854c.n() || (uncaughtExceptionHandler = this.f32853b) == null) {
                return;
            }
        } catch (Throwable th) {
            try {
                Result.Companion companion = Result.Companion;
                this.f32852a.reportError("Failed to report uncaught exception", th);
                Result.m243constructorimpl(Unit.f41027a);
            } finally {
                try {
                    if (this.f32854c.n()) {
                        return;
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                }
            }
            if (this.f32854c.n() || (uncaughtExceptionHandler = this.f32853b) == null) {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, throwable);
    }
}
