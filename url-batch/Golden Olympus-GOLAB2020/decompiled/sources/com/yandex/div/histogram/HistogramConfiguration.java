package com.yandex.div.histogram;

import V1.a;
import com.yandex.div.internal.util.DoubleCheckProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface HistogramConfiguration extends HistogramRecordConfiguration {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final HistogramConfiguration DEFAULT = new DefaultHistogramConfiguration();

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata
    public static class DefaultHistogramConfiguration implements HistogramConfiguration {
        private final boolean isColdRecordingEnabled;
        private final boolean isCoolRecordingEnabled;
        private final boolean isReportingEnabled;
        private final boolean isSizeRecordingEnabled;
        private final boolean isWarmRecordingEnabled;

        @NotNull
        private final a histogramBridge = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1.INSTANCE);

        @NotNull
        private final a cpuUsageHistogramReporter = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1.INSTANCE);

        @NotNull
        private final a taskExecutorProvider = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1.INSTANCE);

        @NotNull
        private final a renderConfiguration = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1.INSTANCE);

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        public a getCpuUsageHistogramReporter() {
            return this.cpuUsageHistogramReporter;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        public a getHistogramBridge() {
            return this.histogramBridge;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        @NotNull
        public a getRenderConfiguration() {
            return this.renderConfiguration;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        public a getTaskExecutorProvider() {
            return this.taskExecutorProvider;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public boolean isColdRecordingEnabled() {
            return this.isColdRecordingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public boolean isCoolRecordingEnabled() {
            return this.isCoolRecordingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        public boolean isReportingEnabled() {
            return this.isReportingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public boolean isSizeRecordingEnabled() {
            return this.isSizeRecordingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public boolean isWarmRecordingEnabled() {
            return this.isWarmRecordingEnabled;
        }
    }

    @NotNull
    a getCpuUsageHistogramReporter();

    @NotNull
    a getHistogramBridge();

    @NotNull
    a getTaskExecutorProvider();

    boolean isReportingEnabled();
}
