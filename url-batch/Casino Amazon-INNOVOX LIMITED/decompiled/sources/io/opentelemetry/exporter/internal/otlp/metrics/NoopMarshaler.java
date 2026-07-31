package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;

/* loaded from: classes3.dex */
final class NoopMarshaler extends MarshalerWithSize {
    static final NoopMarshaler INSTANCE = new NoopMarshaler();

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) {
    }

    private NoopMarshaler() {
        super(0);
    }
}
