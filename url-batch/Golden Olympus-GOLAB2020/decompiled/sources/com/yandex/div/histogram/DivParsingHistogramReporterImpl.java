package com.yandex.div.histogram;

import com.yandex.div.histogram.reporter.HistogramReporter;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivParsingHistogramReporterImpl implements DivParsingHistogramReporter {

    @NotNull
    private final Function0<Executor> calculateSizeExecutor;

    @NotNull
    private final Function0<HistogramReporter> histogramReporter;

    /* JADX WARN: Multi-variable type inference failed */
    public DivParsingHistogramReporterImpl(@NotNull Function0<? extends HistogramReporter> histogramReporter, @NotNull Function0<? extends Executor> calculateSizeExecutor) {
        Intrinsics.checkNotNullParameter(histogramReporter, "histogramReporter");
        Intrinsics.checkNotNullParameter(calculateSizeExecutor, "calculateSizeExecutor");
        this.histogramReporter = histogramReporter;
        this.calculateSizeExecutor = calculateSizeExecutor;
    }
}
