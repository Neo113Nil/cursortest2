package com.yandex.div.storage.histogram;

import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class HistogramRecorder {

    @NotNull
    private final HistogramReporter histogramReporter;

    @NotNull
    private final CopyOnWriteArraySet<String> recordedHistograms;

    public HistogramRecorder(@NotNull HistogramReporterDelegate histogramReporterDelegate, @Nullable HistogramNameProvider histogramNameProvider) {
        Intrinsics.checkNotNullParameter(histogramReporterDelegate, "histogramReporterDelegate");
        this.histogramReporter = new HistogramReporter(histogramReporterDelegate);
        this.recordedHistograms = new CopyOnWriteArraySet<>();
    }
}
