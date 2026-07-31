package io.opentelemetry.exporter.internal.metrics;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.exporter.internal.metrics.ExporterMetrics;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
class NoopExporterMetrics implements ExporterMetrics {
    static final NoopExporterMetrics INSTANCE = new NoopExporterMetrics();

    NoopExporterMetrics() {
    }

    @Override // io.opentelemetry.exporter.internal.metrics.ExporterMetrics
    public ExporterMetrics.Recording startRecordingExport(int i) {
        return new NoopRecording();
    }

    private static class NoopRecording extends ExporterMetrics.Recording {
        @Override // io.opentelemetry.exporter.internal.metrics.ExporterMetrics.Recording
        protected void doFinish(@Nullable String str, Attributes attributes) {
        }

        private NoopRecording() {
        }
    }
}
