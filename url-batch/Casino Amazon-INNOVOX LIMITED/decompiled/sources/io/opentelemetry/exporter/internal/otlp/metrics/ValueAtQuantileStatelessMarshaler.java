package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler;
import io.opentelemetry.proto.metrics.v1.internal.SummaryDataPoint;
import io.opentelemetry.sdk.metrics.data.ValueAtQuantile;
import java.io.IOException;

/* loaded from: classes3.dex */
final class ValueAtQuantileStatelessMarshaler implements StatelessMarshaler<ValueAtQuantile> {
    static final ValueAtQuantileStatelessMarshaler INSTANCE = new ValueAtQuantileStatelessMarshaler();

    private ValueAtQuantileStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public void writeTo(Serializer serializer, ValueAtQuantile valueAtQuantile, MarshalerContext marshalerContext) throws IOException {
        serializer.serializeDouble(SummaryDataPoint.ValueAtQuantile.QUANTILE, valueAtQuantile.getQuantile());
        serializer.serializeDouble(SummaryDataPoint.ValueAtQuantile.VALUE, valueAtQuantile.getValue());
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public int getBinarySerializedSize(ValueAtQuantile valueAtQuantile, MarshalerContext marshalerContext) {
        return ValueAtQuantileMarshaler.calculateSize(valueAtQuantile.getQuantile(), valueAtQuantile.getValue());
    }
}
