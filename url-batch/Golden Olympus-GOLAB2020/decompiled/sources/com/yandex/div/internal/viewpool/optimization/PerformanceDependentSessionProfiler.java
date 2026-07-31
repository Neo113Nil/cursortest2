package com.yandex.div.internal.viewpool.optimization;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class PerformanceDependentSessionProfiler {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean isDebuggingViewPoolOptimization;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PerformanceDependentSessionProfiler(boolean z4) {
        this.isDebuggingViewPoolOptimization = z4;
    }

    public static final /* synthetic */ PerformanceDependentSession access$getSession$p(PerformanceDependentSessionProfiler performanceDependentSessionProfiler) {
        performanceDependentSessionProfiler.getClass();
        return null;
    }
}
