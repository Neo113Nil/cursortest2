package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivHistogramsModuleKt {
    @NotNull
    public static final HistogramReporter createHistogramReporter(@NotNull HistogramReporterDelegate histogramReporterDelegate) {
        Intrinsics.checkNotNullParameter(histogramReporterDelegate, "histogramReporterDelegate");
        return new HistogramReporter(histogramReporterDelegate);
    }

    @NotNull
    public static final HistogramReporterDelegate createHistogramReporterDelegate(@NotNull HistogramConfiguration histogramConfiguration, @NotNull V1.a histogramRecorderProvider, @NotNull V1.a histogramColdTypeChecker) {
        Intrinsics.checkNotNullParameter(histogramConfiguration, "histogramConfiguration");
        Intrinsics.checkNotNullParameter(histogramRecorderProvider, "histogramRecorderProvider");
        Intrinsics.checkNotNullParameter(histogramColdTypeChecker, "histogramColdTypeChecker");
        return !histogramConfiguration.isReportingEnabled() ? HistogramReporterDelegate.NoOp.INSTANCE : new HistogramReporterDelegateImpl(histogramRecorderProvider, new HistogramCallTypeProvider(new DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1(histogramColdTypeChecker)), histogramConfiguration, histogramConfiguration.getTaskExecutorProvider());
    }
}
