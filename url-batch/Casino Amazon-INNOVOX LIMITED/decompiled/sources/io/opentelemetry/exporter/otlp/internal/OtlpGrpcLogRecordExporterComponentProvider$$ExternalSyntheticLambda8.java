package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder;
import io.opentelemetry.sdk.common.export.MemoryMode;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda8 implements Consumer {
    public final /* synthetic */ OtlpGrpcLogRecordExporterBuilder f$0;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f$0.setMemoryMode((MemoryMode) obj);
    }
}
