package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.metrics.v1.internal.Gauge;
import io.opentelemetry.sdk.metrics.data.GaugeData;
import io.opentelemetry.sdk.metrics.data.PointData;
import java.io.IOException;

/* loaded from: classes3.dex */
final class GaugeMarshaler extends MarshalerWithSize {
    private final NumberDataPointMarshaler[] dataPoints;

    static GaugeMarshaler create(GaugeData<? extends PointData> gaugeData) {
        return new GaugeMarshaler(NumberDataPointMarshaler.createRepeated(gaugeData.getPoints()));
    }

    private GaugeMarshaler(NumberDataPointMarshaler[] numberDataPointMarshalerArr) {
        super(calculateSize(numberDataPointMarshalerArr));
        this.dataPoints = numberDataPointMarshalerArr;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeRepeatedMessage(Gauge.DATA_POINTS, this.dataPoints);
    }

    private static int calculateSize(NumberDataPointMarshaler[] numberDataPointMarshalerArr) {
        return MarshalerUtil.sizeRepeatedMessage(Gauge.DATA_POINTS, numberDataPointMarshalerArr);
    }
}
