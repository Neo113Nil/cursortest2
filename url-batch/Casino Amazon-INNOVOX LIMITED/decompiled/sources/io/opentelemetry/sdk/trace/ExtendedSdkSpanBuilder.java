package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.incubator.propagation.ExtendedContextPropagators;
import io.opentelemetry.api.incubator.trace.ExtendedSpanBuilder;
import io.opentelemetry.api.incubator.trace.SpanCallable;
import io.opentelemetry.api.incubator.trace.SpanRunnable;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;
import io.opentelemetry.context.propagation.ContextPropagators;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
final class ExtendedSdkSpanBuilder extends SdkSpanBuilder implements ExtendedSpanBuilder {
    @Override // io.opentelemetry.sdk.trace.SdkSpanBuilder, io.opentelemetry.api.trace.SpanBuilder
    public /* bridge */ /* synthetic */ SpanBuilder setAttribute(AttributeKey attributeKey, Object obj) {
        return setAttribute((AttributeKey<AttributeKey>) attributeKey, (AttributeKey) obj);
    }

    ExtendedSdkSpanBuilder(String str, InstrumentationScopeInfo instrumentationScopeInfo, TracerSharedState tracerSharedState, SpanLimits spanLimits) {
        super(str, instrumentationScopeInfo, tracerSharedState, spanLimits);
    }

    @Override // io.opentelemetry.sdk.trace.SdkSpanBuilder, io.opentelemetry.api.trace.SpanBuilder
    public ExtendedSpanBuilder setParent(Context context) {
        super.setParent(context);
        return this;
    }

    @Override // io.opentelemetry.sdk.trace.SdkSpanBuilder, io.opentelemetry.api.trace.SpanBuilder
    public ExtendedSpanBuilder setNoParent() {
        super.setNoParent();
        return this;
    }

    @Override // io.opentelemetry.sdk.trace.SdkSpanBuilder, io.opentelemetry.api.trace.SpanBuilder
    public ExtendedSpanBuilder setSpanKind(SpanKind spanKind) {
        super.setSpanKind(spanKind);
        return this;
    }

    @Override // io.opentelemetry.sdk.trace.SdkSpanBuilder, io.opentelemetry.api.trace.SpanBuilder
    public ExtendedSpanBuilder addLink(SpanContext spanContext) {
        super.addLink(spanContext);
        return this;
    }

    @Override // io.opentelemetry.sdk.trace.SdkSpanBuilder, io.opentelemetry.api.trace.SpanBuilder
    public ExtendedSpanBuilder addLink(SpanContext spanContext, Attributes attributes) {
        super.addLink(spanContext, attributes);
        return this;
    }

    @Override // io.opentelemetry.sdk.trace.SdkSpanBuilder, io.opentelemetry.api.trace.SpanBuilder
    public ExtendedSpanBuilder setAttribute(String str, String str2) {
        super.setAttribute(str, str2);
        return this;
    }

    @Override // io.opentelemetry.sdk.trace.SdkSpanBuilder, io.opentelemetry.api.trace.SpanBuilder
    public ExtendedSpanBuilder setAttribute(String str, long j) {
        super.setAttribute(str, j);
        return this;
    }

    @Override // io.opentelemetry.sdk.trace.SdkSpanBuilder, io.opentelemetry.api.trace.SpanBuilder
    public ExtendedSpanBuilder setAttribute(String str, double d) {
        super.setAttribute(str, d);
        return this;
    }

    @Override // io.opentelemetry.sdk.trace.SdkSpanBuilder, io.opentelemetry.api.trace.SpanBuilder
    public ExtendedSpanBuilder setAttribute(String str, boolean z) {
        super.setAttribute(str, z);
        return this;
    }

    @Override // io.opentelemetry.sdk.trace.SdkSpanBuilder, io.opentelemetry.api.trace.SpanBuilder
    public <T> ExtendedSpanBuilder setAttribute(AttributeKey<T> attributeKey, T t) {
        super.setAttribute((AttributeKey<AttributeKey<T>>) attributeKey, (AttributeKey<T>) t);
        return this;
    }

    @Override // io.opentelemetry.sdk.trace.SdkSpanBuilder, io.opentelemetry.api.trace.SpanBuilder
    public ExtendedSpanBuilder setStartTimestamp(long j, TimeUnit timeUnit) {
        super.setStartTimestamp(j, timeUnit);
        return this;
    }

    @Override // io.opentelemetry.api.incubator.trace.ExtendedSpanBuilder
    public ExtendedSpanBuilder setParentFrom(ContextPropagators contextPropagators, Map<String, String> map) {
        super.setParent(ExtendedContextPropagators.extractTextMapPropagationContext(map, contextPropagators));
        return this;
    }

    @Override // io.opentelemetry.api.incubator.trace.ExtendedSpanBuilder
    public <T, E extends Throwable> T startAndCall(SpanCallable<T, E> spanCallable) throws Throwable {
        return (T) startAndCall(spanCallable, new ExtendedSdkSpanBuilder$$ExternalSyntheticLambda0());
    }

    @Override // io.opentelemetry.api.incubator.trace.ExtendedSpanBuilder
    public <T, E extends Throwable> T startAndCall(SpanCallable<T, E> spanCallable, BiConsumer<Span, Throwable> biConsumer) throws Throwable {
        try {
            Scope makeCurrent = startSpan().makeCurrent();
            try {
                T callInSpan = spanCallable.callInSpan();
                if (makeCurrent != null) {
                    makeCurrent.close();
                }
                return callInSpan;
            } finally {
            }
        } finally {
        }
    }

    @Override // io.opentelemetry.api.incubator.trace.ExtendedSpanBuilder
    public <E extends Throwable> void startAndRun(SpanRunnable<E> spanRunnable) throws Throwable {
        startAndRun(spanRunnable, new ExtendedSdkSpanBuilder$$ExternalSyntheticLambda0());
    }

    @Override // io.opentelemetry.api.incubator.trace.ExtendedSpanBuilder
    public <E extends Throwable> void startAndRun(final SpanRunnable<E> spanRunnable, BiConsumer<Span, Throwable> biConsumer) throws Throwable {
        startAndCall(new SpanCallable() { // from class: io.opentelemetry.sdk.trace.ExtendedSdkSpanBuilder$$ExternalSyntheticLambda1
            @Override // io.opentelemetry.api.incubator.trace.SpanCallable
            public final Object callInSpan() {
                return ExtendedSdkSpanBuilder.lambda$startAndRun$0(SpanRunnable.this);
            }
        }, biConsumer);
    }

    static /* synthetic */ Object lambda$startAndRun$0(SpanRunnable spanRunnable) throws Throwable {
        spanRunnable.runInSpan();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setSpanError(Span span, Throwable th) {
        span.setStatus(StatusCode.ERROR);
        span.recordException(th);
    }
}
