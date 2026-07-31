package io.opentelemetry.exporter.internal.otlp.traces;

import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.trace.data.SpanData;
import java.util.Collection;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.BiFunction;

/* loaded from: classes3.dex */
public class SpanReusableDataMarshaler {
    private final BiFunction<Marshaler, Integer, CompletableResultCode> doExport;
    private final Deque<LowAllocationTraceRequestMarshaler> marshalerPool = new ConcurrentLinkedDeque();
    private final MemoryMode memoryMode;

    public SpanReusableDataMarshaler(MemoryMode memoryMode, BiFunction<Marshaler, Integer, CompletableResultCode> biFunction) {
        this.memoryMode = memoryMode;
        this.doExport = biFunction;
    }

    public MemoryMode getMemoryMode() {
        return this.memoryMode;
    }

    public CompletableResultCode export(Collection<SpanData> collection) {
        if (this.memoryMode == MemoryMode.REUSABLE_DATA) {
            final LowAllocationTraceRequestMarshaler poll = this.marshalerPool.poll();
            if (poll == null) {
                poll = new LowAllocationTraceRequestMarshaler();
            }
            poll.initialize(collection);
            return this.doExport.apply(poll, Integer.valueOf(collection.size())).whenComplete(new Runnable() { // from class: io.opentelemetry.exporter.internal.otlp.traces.SpanReusableDataMarshaler$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SpanReusableDataMarshaler.this.m3929x63d4c94f(poll);
                }
            });
        }
        return this.doExport.apply(TraceRequestMarshaler.create(collection), Integer.valueOf(collection.size()));
    }

    /* renamed from: lambda$export$0$io-opentelemetry-exporter-internal-otlp-traces-SpanReusableDataMarshaler, reason: not valid java name */
    /* synthetic */ void m3929x63d4c94f(LowAllocationTraceRequestMarshaler lowAllocationTraceRequestMarshaler) {
        lowAllocationTraceRequestMarshaler.reset();
        this.marshalerPool.add(lowAllocationTraceRequestMarshaler);
    }
}
