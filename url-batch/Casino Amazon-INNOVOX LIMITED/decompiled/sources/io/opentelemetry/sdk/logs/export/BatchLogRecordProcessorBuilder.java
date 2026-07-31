package io.opentelemetry.sdk.logs.export;

import androidx.work.WorkRequest;
import io.opentelemetry.api.internal.Utils;
import io.opentelemetry.api.metrics.MeterProvider;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class BatchLogRecordProcessorBuilder {
    static final int DEFAULT_EXPORT_TIMEOUT_MILLIS = 30000;
    static final int DEFAULT_MAX_EXPORT_BATCH_SIZE = 512;
    static final int DEFAULT_MAX_QUEUE_SIZE = 2048;
    static final long DEFAULT_SCHEDULE_DELAY_MILLIS = 1000;
    private static final Logger logger = Logger.getLogger(BatchLogRecordProcessorBuilder.class.getName());
    private final LogRecordExporter logRecordExporter;
    private long scheduleDelayNanos = TimeUnit.MILLISECONDS.toNanos(1000);
    private int maxQueueSize = 2048;
    private int maxExportBatchSize = 512;
    private long exporterTimeoutNanos = TimeUnit.MILLISECONDS.toNanos(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    private MeterProvider meterProvider = MeterProvider.noop();

    BatchLogRecordProcessorBuilder(LogRecordExporter logRecordExporter) {
        this.logRecordExporter = (LogRecordExporter) Objects.requireNonNull(logRecordExporter, "logRecordExporter");
    }

    public BatchLogRecordProcessorBuilder setScheduleDelay(long j, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit, "unit");
        Utils.checkArgument(j >= 0, "delay must be non-negative");
        this.scheduleDelayNanos = timeUnit.toNanos(j);
        return this;
    }

    public BatchLogRecordProcessorBuilder setScheduleDelay(Duration duration) {
        Objects.requireNonNull(duration, "delay");
        return setScheduleDelay(duration.toNanos(), TimeUnit.NANOSECONDS);
    }

    long getScheduleDelayNanos() {
        return this.scheduleDelayNanos;
    }

    public BatchLogRecordProcessorBuilder setExporterTimeout(long j, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit, "unit");
        Utils.checkArgument(j >= 0, "timeout must be non-negative");
        this.exporterTimeoutNanos = j == 0 ? Long.MAX_VALUE : timeUnit.toNanos(j);
        return this;
    }

    public BatchLogRecordProcessorBuilder setExporterTimeout(Duration duration) {
        Objects.requireNonNull(duration, "timeout");
        return setExporterTimeout(duration.toNanos(), TimeUnit.NANOSECONDS);
    }

    long getExporterTimeoutNanos() {
        return this.exporterTimeoutNanos;
    }

    public BatchLogRecordProcessorBuilder setMaxQueueSize(int i) {
        Utils.checkArgument(i > 0, "maxQueueSize must be positive.");
        this.maxQueueSize = i;
        return this;
    }

    int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public BatchLogRecordProcessorBuilder setMaxExportBatchSize(int i) {
        Utils.checkArgument(i > 0, "maxExportBatchSize must be positive.");
        this.maxExportBatchSize = i;
        return this;
    }

    public BatchLogRecordProcessorBuilder setMeterProvider(MeterProvider meterProvider) {
        Objects.requireNonNull(meterProvider, "meterProvider");
        this.meterProvider = meterProvider;
        return this;
    }

    int getMaxExportBatchSize() {
        return this.maxExportBatchSize;
    }

    public BatchLogRecordProcessor build() {
        if (this.maxExportBatchSize > this.maxQueueSize) {
            logger.log(Level.WARNING, "maxExportBatchSize should not exceed maxQueueSize. Setting maxExportBatchSize to {0} instead of {1}", new Object[]{Integer.valueOf(this.maxQueueSize), Integer.valueOf(this.maxExportBatchSize)});
            this.maxExportBatchSize = this.maxQueueSize;
        }
        return new BatchLogRecordProcessor(this.logRecordExporter, this.meterProvider, this.scheduleDelayNanos, this.maxQueueSize, this.maxExportBatchSize, this.exporterTimeoutNanos);
    }
}
