package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.metrics.v1.internal.SummaryDataPoint;
import io.opentelemetry.sdk.metrics.data.ValueAtQuantile;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class ValueAtQuantileMarshaler extends MarshalerWithSize {
    private final double quantile;
    private final double value;

    static ValueAtQuantileMarshaler[] createRepeated(List<ValueAtQuantile> list) {
        int size = list.size();
        ValueAtQuantileMarshaler[] valueAtQuantileMarshalerArr = new ValueAtQuantileMarshaler[size];
        for (int i = 0; i < size; i++) {
            valueAtQuantileMarshalerArr[i] = create(list.get(i));
        }
        return valueAtQuantileMarshalerArr;
    }

    private static ValueAtQuantileMarshaler create(ValueAtQuantile valueAtQuantile) {
        return new ValueAtQuantileMarshaler(valueAtQuantile.getQuantile(), valueAtQuantile.getValue());
    }

    private ValueAtQuantileMarshaler(double d, double d2) {
        super(calculateSize(d, d2));
        this.quantile = d;
        this.value = d2;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeDouble(SummaryDataPoint.ValueAtQuantile.QUANTILE, this.quantile);
        serializer.serializeDouble(SummaryDataPoint.ValueAtQuantile.VALUE, this.value);
    }

    static int calculateSize(double d, double d2) {
        return MarshalerUtil.sizeDouble(SummaryDataPoint.ValueAtQuantile.QUANTILE, d) + MarshalerUtil.sizeDouble(SummaryDataPoint.ValueAtQuantile.VALUE, d2);
    }
}
