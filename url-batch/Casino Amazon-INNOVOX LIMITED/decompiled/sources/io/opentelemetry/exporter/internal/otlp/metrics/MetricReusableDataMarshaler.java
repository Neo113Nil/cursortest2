package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.data.MetricData;
import java.util.Collection;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.BiFunction;

/* loaded from: classes3.dex */
public class MetricReusableDataMarshaler {
    private final BiFunction<Marshaler, Integer, CompletableResultCode> doExport;
    private final Deque<LowAllocationMetricsRequestMarshaler> marshalerPool = new ConcurrentLinkedDeque();
    private final MemoryMode memoryMode;

    public MetricReusableDataMarshaler(MemoryMode memoryMode, BiFunction<Marshaler, Integer, CompletableResultCode> biFunction) {
        this.memoryMode = memoryMode;
        this.doExport = biFunction;
    }

    public MemoryMode getMemoryMode() {
        return this.memoryMode;
    }

    public CompletableResultCode export(Collection<MetricData> collection) {
        if (this.memoryMode == MemoryMode.REUSABLE_DATA) {
            final LowAllocationMetricsRequestMarshaler poll = this.marshalerPool.poll();
            if (poll == null) {
                poll = new LowAllocationMetricsRequestMarshaler();
            }
            poll.initialize(collection);
            return this.doExport.apply(poll, Integer.valueOf(collection.size())).whenComplete(new Runnable() { // from class: io.opentelemetry.exporter.internal.otlp.metrics.MetricReusableDataMarshaler$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MetricReusableDataMarshaler.this.m3928xc0aa6d1a(poll);
                }
            });
        }
        return this.doExport.apply(MetricsRequestMarshaler.create(collection), Integer.valueOf(collection.size()));
    }

    /* renamed from: lambda$export$0$io-opentelemetry-exporter-internal-otlp-metrics-MetricReusableDataMarshaler, reason: not valid java name */
    /* synthetic */ void m3928xc0aa6d1a(LowAllocationMetricsRequestMarshaler lowAllocationMetricsRequestMarshaler) {
        lowAllocationMetricsRequestMarshaler.reset();
        this.marshalerPool.add(lowAllocationMetricsRequestMarshaler);
    }
}
