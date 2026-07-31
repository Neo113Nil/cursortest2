package com.yandex.div.histogram.reporter;

import V1.a;
import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.TaskExecutor;
import com.yandex.div.histogram.util.HistogramUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class HistogramReporterDelegateImpl implements HistogramReporterDelegate {

    @NotNull
    private final HistogramCallTypeProvider histogramCallTypeProvider;

    @NotNull
    private final HistogramRecordConfiguration histogramRecordConfig;

    @NotNull
    private final a histogramRecorder;

    @NotNull
    private final a taskExecutor;

    public HistogramReporterDelegateImpl(@NotNull a histogramRecorder, @NotNull HistogramCallTypeProvider histogramCallTypeProvider, @NotNull HistogramRecordConfiguration histogramRecordConfig, @NotNull a taskExecutor) {
        Intrinsics.checkNotNullParameter(histogramRecorder, "histogramRecorder");
        Intrinsics.checkNotNullParameter(histogramCallTypeProvider, "histogramCallTypeProvider");
        Intrinsics.checkNotNullParameter(histogramRecordConfig, "histogramRecordConfig");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.histogramRecorder = histogramRecorder;
        this.histogramCallTypeProvider = histogramCallTypeProvider;
        this.histogramRecordConfig = histogramRecordConfig;
        this.taskExecutor = taskExecutor;
    }

    @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
    public void reportDuration(@NotNull String histogramName, long j4, @Nullable String str) {
        Intrinsics.checkNotNullParameter(histogramName, "histogramName");
        String histogramCallType = str == null ? this.histogramCallTypeProvider.getHistogramCallType(histogramName) : str;
        if (HistogramUtils.INSTANCE.shouldRecordHistogram(histogramCallType, this.histogramRecordConfig)) {
            ((TaskExecutor) this.taskExecutor.get()).post(new HistogramReporterDelegateImpl$reportDuration$1(this, histogramName, histogramCallType, j4));
        }
    }
}
