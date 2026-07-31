package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.ProtoEnumInfo;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.metrics.v1.internal.ExponentialHistogram;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramData;
import java.io.IOException;

/* loaded from: classes3.dex */
public class ExponentialHistogramMarshaler extends MarshalerWithSize {
    private final ProtoEnumInfo aggregationTemporality;
    private final ExponentialHistogramDataPointMarshaler[] dataPoints;

    static ExponentialHistogramMarshaler create(ExponentialHistogramData exponentialHistogramData) {
        return new ExponentialHistogramMarshaler(ExponentialHistogramDataPointMarshaler.createRepeated(exponentialHistogramData.getPoints()), MetricsMarshalerUtil.mapToTemporality(exponentialHistogramData.getAggregationTemporality()));
    }

    private ExponentialHistogramMarshaler(ExponentialHistogramDataPointMarshaler[] exponentialHistogramDataPointMarshalerArr, ProtoEnumInfo protoEnumInfo) {
        super(calculateSize(exponentialHistogramDataPointMarshalerArr, protoEnumInfo));
        this.dataPoints = exponentialHistogramDataPointMarshalerArr;
        this.aggregationTemporality = protoEnumInfo;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    protected void writeTo(Serializer serializer) throws IOException {
        serializer.serializeRepeatedMessage(ExponentialHistogram.DATA_POINTS, this.dataPoints);
        serializer.serializeEnum(ExponentialHistogram.AGGREGATION_TEMPORALITY, this.aggregationTemporality);
    }

    private static int calculateSize(ExponentialHistogramDataPointMarshaler[] exponentialHistogramDataPointMarshalerArr, ProtoEnumInfo protoEnumInfo) {
        return MarshalerUtil.sizeRepeatedMessage(ExponentialHistogram.DATA_POINTS, exponentialHistogramDataPointMarshalerArr) + MarshalerUtil.sizeEnum(ExponentialHistogram.AGGREGATION_TEMPORALITY, protoEnumInfo);
    }
}
