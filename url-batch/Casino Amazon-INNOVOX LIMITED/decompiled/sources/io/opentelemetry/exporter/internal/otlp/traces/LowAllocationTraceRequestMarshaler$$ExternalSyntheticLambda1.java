package io.opentelemetry.exporter.internal.otlp.traces;

import io.opentelemetry.sdk.trace.data.SpanData;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class LowAllocationTraceRequestMarshaler$$ExternalSyntheticLambda1 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((SpanData) obj).getInstrumentationScopeInfo();
    }
}
