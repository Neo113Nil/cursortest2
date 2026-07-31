package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.sdk.metrics.data.MetricData;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class LowAllocationMetricsRequestMarshaler$$ExternalSyntheticLambda1 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((MetricData) obj).getInstrumentationScopeInfo();
    }
}
