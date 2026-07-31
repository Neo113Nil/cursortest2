package io.opentelemetry.sdk.metrics.export;

import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.Aggregation;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.export.PeriodicMetricReader;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class PeriodicMetricReader implements MetricReader {
    private static final Logger logger = Logger.getLogger(PeriodicMetricReader.class.getName());
    private final MetricExporter exporter;
    private final long intervalNanos;

    @Nullable
    private volatile ScheduledFuture<?> scheduledFuture;
    private final ScheduledExecutorService scheduler;
    private final Object lock = new Object();
    private volatile CollectionRegistration collectionRegistration = CollectionRegistration.noop();
    private final Scheduled scheduled = new Scheduled();

    public static PeriodicMetricReader create(MetricExporter metricExporter) {
        return builder(metricExporter).build();
    }

    public static PeriodicMetricReaderBuilder builder(MetricExporter metricExporter) {
        return new PeriodicMetricReaderBuilder(metricExporter);
    }

    PeriodicMetricReader(MetricExporter metricExporter, long j, ScheduledExecutorService scheduledExecutorService) {
        this.exporter = metricExporter;
        this.intervalNanos = j;
        this.scheduler = scheduledExecutorService;
    }

    @Override // io.opentelemetry.sdk.metrics.export.AggregationTemporalitySelector
    public AggregationTemporality getAggregationTemporality(InstrumentType instrumentType) {
        return this.exporter.getAggregationTemporality(instrumentType);
    }

    @Override // io.opentelemetry.sdk.metrics.export.MetricReader, io.opentelemetry.sdk.metrics.export.DefaultAggregationSelector
    public Aggregation getDefaultAggregation(InstrumentType instrumentType) {
        return this.exporter.getDefaultAggregation(instrumentType);
    }

    @Override // io.opentelemetry.sdk.metrics.export.MetricReader
    public MemoryMode getMemoryMode() {
        return this.exporter.getMemoryMode();
    }

    @Override // io.opentelemetry.sdk.metrics.export.MetricReader
    public CompletableResultCode forceFlush() {
        final CompletableResultCode completableResultCode = new CompletableResultCode();
        final CompletableResultCode doRun = this.scheduled.doRun();
        doRun.whenComplete(new Runnable() { // from class: io.opentelemetry.sdk.metrics.export.PeriodicMetricReader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PeriodicMetricReader.this.m3954x8974c566(doRun, completableResultCode);
            }
        });
        return completableResultCode;
    }

    /* renamed from: lambda$forceFlush$1$io-opentelemetry-sdk-metrics-export-PeriodicMetricReader, reason: not valid java name */
    /* synthetic */ void m3954x8974c566(final CompletableResultCode completableResultCode, final CompletableResultCode completableResultCode2) {
        final CompletableResultCode flush = this.exporter.flush();
        flush.whenComplete(new Runnable() { // from class: io.opentelemetry.sdk.metrics.export.PeriodicMetricReader$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                PeriodicMetricReader.lambda$forceFlush$0(CompletableResultCode.this, flush, completableResultCode2);
            }
        });
    }

    static /* synthetic */ void lambda$forceFlush$0(CompletableResultCode completableResultCode, CompletableResultCode completableResultCode2, CompletableResultCode completableResultCode3) {
        if (completableResultCode.isSuccess() && completableResultCode2.isSuccess()) {
            completableResultCode3.succeed();
        } else {
            completableResultCode3.fail();
        }
    }

    @Override // io.opentelemetry.sdk.metrics.export.MetricReader
    public CompletableResultCode shutdown() {
        final CompletableResultCode shutdown;
        Runnable runnable;
        final CompletableResultCode completableResultCode = new CompletableResultCode();
        ScheduledFuture<?> scheduledFuture = this.scheduledFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.scheduler.shutdown();
        try {
            try {
                this.scheduler.awaitTermination(5L, TimeUnit.SECONDS);
                this.scheduled.doRun().join(5L, TimeUnit.SECONDS);
                shutdown = this.scheduled.shutdown();
                runnable = new Runnable() { // from class: io.opentelemetry.sdk.metrics.export.PeriodicMetricReader$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        PeriodicMetricReader.lambda$shutdown$2(CompletableResultCode.this, completableResultCode);
                    }
                };
            } catch (InterruptedException unused) {
                this.scheduler.shutdownNow();
                Thread.currentThread().interrupt();
                shutdown = this.scheduled.shutdown();
                runnable = new Runnable() { // from class: io.opentelemetry.sdk.metrics.export.PeriodicMetricReader$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        PeriodicMetricReader.lambda$shutdown$2(CompletableResultCode.this, completableResultCode);
                    }
                };
            }
            shutdown.whenComplete(runnable);
            return completableResultCode;
        } catch (Throwable th) {
            final CompletableResultCode shutdown2 = this.scheduled.shutdown();
            shutdown2.whenComplete(new Runnable() { // from class: io.opentelemetry.sdk.metrics.export.PeriodicMetricReader$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    PeriodicMetricReader.lambda$shutdown$2(CompletableResultCode.this, completableResultCode);
                }
            });
            throw th;
        }
    }

    static /* synthetic */ void lambda$shutdown$2(CompletableResultCode completableResultCode, CompletableResultCode completableResultCode2) {
        if (!completableResultCode.isSuccess()) {
            completableResultCode2.fail();
        } else {
            completableResultCode2.succeed();
        }
    }

    @Override // io.opentelemetry.sdk.metrics.export.MetricReader
    public void register(CollectionRegistration collectionRegistration) {
        this.collectionRegistration = collectionRegistration;
        start();
    }

    public String toString() {
        return "PeriodicMetricReader{exporter=" + this.exporter + ", intervalNanos=" + this.intervalNanos + AbstractJsonLexerKt.END_OBJ;
    }

    void start() {
        synchronized (this.lock) {
            if (this.scheduledFuture != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorService = this.scheduler;
            Scheduled scheduled = this.scheduled;
            long j = this.intervalNanos;
            this.scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(scheduled, j, j, TimeUnit.NANOSECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class Scheduled implements Runnable {
        private final AtomicBoolean exportAvailable;

        private Scheduled() {
            this.exportAvailable = new AtomicBoolean(true);
        }

        @Override // java.lang.Runnable
        public void run() {
            doRun();
        }

        CompletableResultCode doRun() {
            final CompletableResultCode completableResultCode = new CompletableResultCode();
            if (this.exportAvailable.compareAndSet(true, false)) {
                try {
                    Collection<MetricData> collectAllMetrics = PeriodicMetricReader.this.collectionRegistration.collectAllMetrics();
                    if (collectAllMetrics.isEmpty()) {
                        PeriodicMetricReader.logger.log(Level.FINE, "No metric data to export - skipping export.");
                        completableResultCode.succeed();
                        this.exportAvailable.set(true);
                        return completableResultCode;
                    }
                    final CompletableResultCode export = PeriodicMetricReader.this.exporter.export(collectAllMetrics);
                    export.whenComplete(new Runnable() { // from class: io.opentelemetry.sdk.metrics.export.PeriodicMetricReader$Scheduled$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            PeriodicMetricReader.Scheduled.this.m3955x322aab83(export, completableResultCode);
                        }
                    });
                    return completableResultCode;
                } catch (Throwable th) {
                    this.exportAvailable.set(true);
                    PeriodicMetricReader.logger.log(Level.WARNING, "Exporter threw an Exception", th);
                    completableResultCode.fail();
                    return completableResultCode;
                }
            }
            PeriodicMetricReader.logger.log(Level.FINE, "Exporter busy. Dropping metrics.");
            completableResultCode.fail();
            return completableResultCode;
        }

        /* renamed from: lambda$doRun$0$io-opentelemetry-sdk-metrics-export-PeriodicMetricReader$Scheduled, reason: not valid java name */
        /* synthetic */ void m3955x322aab83(CompletableResultCode completableResultCode, CompletableResultCode completableResultCode2) {
            if (!completableResultCode.isSuccess()) {
                PeriodicMetricReader.logger.log(Level.FINE, "Exporter failed");
            }
            completableResultCode2.succeed();
            this.exportAvailable.set(true);
        }

        CompletableResultCode shutdown() {
            return PeriodicMetricReader.this.exporter.shutdown();
        }
    }
}
