package io.opentelemetry.exporter.internal.otlp.logs;

import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import java.util.Collection;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.BiFunction;

/* loaded from: classes3.dex */
public class LogReusableDataMarshaler {
    private final BiFunction<Marshaler, Integer, CompletableResultCode> doExport;
    private final Deque<LowAllocationLogsRequestMarshaler> marshalerPool = new ConcurrentLinkedDeque();
    private final MemoryMode memoryMode;

    public LogReusableDataMarshaler(MemoryMode memoryMode, BiFunction<Marshaler, Integer, CompletableResultCode> biFunction) {
        this.memoryMode = memoryMode;
        this.doExport = biFunction;
    }

    public MemoryMode getMemoryMode() {
        return this.memoryMode;
    }

    public CompletableResultCode export(Collection<LogRecordData> collection) {
        if (this.memoryMode == MemoryMode.REUSABLE_DATA) {
            final LowAllocationLogsRequestMarshaler poll = this.marshalerPool.poll();
            if (poll == null) {
                poll = new LowAllocationLogsRequestMarshaler();
            }
            poll.initialize(collection);
            return this.doExport.apply(poll, Integer.valueOf(collection.size())).whenComplete(new Runnable() { // from class: io.opentelemetry.exporter.internal.otlp.logs.LogReusableDataMarshaler$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LogReusableDataMarshaler.this.m3927x6fd1f32e(poll);
                }
            });
        }
        return this.doExport.apply(LogsRequestMarshaler.create(collection), Integer.valueOf(collection.size()));
    }

    /* renamed from: lambda$export$0$io-opentelemetry-exporter-internal-otlp-logs-LogReusableDataMarshaler, reason: not valid java name */
    /* synthetic */ void m3927x6fd1f32e(LowAllocationLogsRequestMarshaler lowAllocationLogsRequestMarshaler) {
        lowAllocationLogsRequestMarshaler.reset();
        this.marshalerPool.add(lowAllocationLogsRequestMarshaler);
    }
}
