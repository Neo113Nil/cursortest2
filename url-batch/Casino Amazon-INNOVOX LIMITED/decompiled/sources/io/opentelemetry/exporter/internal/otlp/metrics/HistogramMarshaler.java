package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.ProtoEnumInfo;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.metrics.v1.internal.Histogram;
import io.opentelemetry.sdk.metrics.data.HistogramData;
import java.io.IOException;

/* loaded from: classes3.dex */
final class HistogramMarshaler extends MarshalerWithSize {
    private final ProtoEnumInfo aggregationTemporality;
    private final HistogramDataPointMarshaler[] dataPoints;

    static HistogramMarshaler create(HistogramData histogramData) {
        return new HistogramMarshaler(HistogramDataPointMarshaler.createRepeated(histogramData.getPoints()), MetricsMarshalerUtil.mapToTemporality(histogramData.getAggregationTemporality()));
    }

    private HistogramMarshaler(HistogramDataPointMarshaler[] histogramDataPointMarshalerArr, ProtoEnumInfo protoEnumInfo) {
        super(calculateSize(histogramDataPointMarshalerArr, protoEnumInfo));
        this.dataPoints = histogramDataPointMarshalerArr;
        this.aggregationTemporality = protoEnumInfo;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeRepeatedMessage(Histogram.DATA_POINTS, this.dataPoints);
        serializer.serializeEnum(Histogram.AGGREGATION_TEMPORALITY, this.aggregationTemporality);
    }

    private static int calculateSize(HistogramDataPointMarshaler[] histogramDataPointMarshalerArr, ProtoEnumInfo protoEnumInfo) {
        return MarshalerUtil.sizeRepeatedMessage(Histogram.DATA_POINTS, histogramDataPointMarshalerArr) + MarshalerUtil.sizeEnum(Histogram.AGGREGATION_TEMPORALITY, protoEnumInfo);
    }
}
