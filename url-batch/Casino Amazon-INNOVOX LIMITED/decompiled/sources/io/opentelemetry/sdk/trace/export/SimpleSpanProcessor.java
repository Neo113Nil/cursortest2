package io.opentelemetry.sdk.trace.export;

import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.trace.ReadWriteSpan;
import io.opentelemetry.sdk.trace.ReadableSpan;
import io.opentelemetry.sdk.trace.SpanProcessor;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class SimpleSpanProcessor implements SpanProcessor {
    private static final Logger logger = Logger.getLogger(SimpleSpanProcessor.class.getName());
    private final boolean exportUnsampledSpans;
    private final SpanExporter spanExporter;
    private final Set<CompletableResultCode> pendingExports = Collections.newSetFromMap(new ConcurrentHashMap());
    private final AtomicBoolean isShutdown = new AtomicBoolean(false);
    private final Object exporterLock = new Object();

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public boolean isEndRequired() {
        return true;
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public boolean isStartRequired() {
        return false;
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public void onStart(Context context, ReadWriteSpan readWriteSpan) {
    }

    public static SpanProcessor create(SpanExporter spanExporter) {
        Objects.requireNonNull(spanExporter, "exporter");
        return builder(spanExporter).build();
    }

    public static SimpleSpanProcessorBuilder builder(SpanExporter spanExporter) {
        Objects.requireNonNull(spanExporter, "exporter");
        return new SimpleSpanProcessorBuilder(spanExporter);
    }

    SimpleSpanProcessor(SpanExporter spanExporter, boolean z) {
        this.spanExporter = (SpanExporter) Objects.requireNonNull(spanExporter, "spanExporter");
        this.exportUnsampledSpans = z;
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public void onEnd(ReadableSpan readableSpan) {
        final CompletableResultCode export;
        if (readableSpan != null) {
            if (this.exportUnsampledSpans || readableSpan.getSpanContext().isSampled()) {
                try {
                    List singletonList = Collections.singletonList(readableSpan.toSpanData());
                    synchronized (this.exporterLock) {
                        export = this.spanExporter.export(singletonList);
                    }
                    this.pendingExports.add(export);
                    export.whenComplete(new Runnable() { // from class: io.opentelemetry.sdk.trace.export.SimpleSpanProcessor$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            SimpleSpanProcessor.this.m3972x532b8784(export);
                        }
                    });
                } catch (RuntimeException e) {
                    logger.log(Level.WARNING, "Exporter threw an Exception", (Throwable) e);
                }
            }
        }
    }

    /* renamed from: lambda$onEnd$0$io-opentelemetry-sdk-trace-export-SimpleSpanProcessor, reason: not valid java name */
    /* synthetic */ void m3972x532b8784(CompletableResultCode completableResultCode) {
        this.pendingExports.remove(completableResultCode);
        if (completableResultCode.isSuccess()) {
            return;
        }
        logger.log(Level.FINE, "Exporter failed");
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public CompletableResultCode shutdown() {
        if (this.isShutdown.getAndSet(true)) {
            return CompletableResultCode.ofSuccess();
        }
        final CompletableResultCode completableResultCode = new CompletableResultCode();
        final CompletableResultCode forceFlush = forceFlush();
        forceFlush.whenComplete(new Runnable() { // from class: io.opentelemetry.sdk.trace.export.SimpleSpanProcessor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SimpleSpanProcessor.this.m3973xfbd6c93a(forceFlush, completableResultCode);
            }
        });
        return completableResultCode;
    }

    /* renamed from: lambda$shutdown$2$io-opentelemetry-sdk-trace-export-SimpleSpanProcessor, reason: not valid java name */
    /* synthetic */ void m3973xfbd6c93a(final CompletableResultCode completableResultCode, final CompletableResultCode completableResultCode2) {
        final CompletableResultCode shutdown = this.spanExporter.shutdown();
        shutdown.whenComplete(new Runnable() { // from class: io.opentelemetry.sdk.trace.export.SimpleSpanProcessor$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                SimpleSpanProcessor.lambda$shutdown$1(CompletableResultCode.this, shutdown, completableResultCode2);
            }
        });
    }

    static /* synthetic */ void lambda$shutdown$1(CompletableResultCode completableResultCode, CompletableResultCode completableResultCode2, CompletableResultCode completableResultCode3) {
        if (!completableResultCode.isSuccess() || !completableResultCode2.isSuccess()) {
            completableResultCode3.fail();
        } else {
            completableResultCode3.succeed();
        }
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public CompletableResultCode forceFlush() {
        return CompletableResultCode.ofAll(this.pendingExports);
    }

    public SpanExporter getSpanExporter() {
        return this.spanExporter;
    }

    public String toString() {
        return "SimpleSpanProcessor{spanExporter=" + this.spanExporter + ", exportUnsampledSpans=" + this.exportUnsampledSpans + AbstractJsonLexerKt.END_OBJ;
    }
}
