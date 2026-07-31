package io.opentelemetry.exporter.internal.otlp.logs;

import io.opentelemetry.sdk.logs.data.LogRecordData;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class LowAllocationLogsRequestMarshaler$$ExternalSyntheticLambda1 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((LogRecordData) obj).getInstrumentationScopeInfo();
    }
}
