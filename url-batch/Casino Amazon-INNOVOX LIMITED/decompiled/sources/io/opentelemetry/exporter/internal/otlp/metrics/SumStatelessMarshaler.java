package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil;
import io.opentelemetry.proto.metrics.v1.internal.Sum;
import io.opentelemetry.sdk.metrics.data.PointData;
import io.opentelemetry.sdk.metrics.data.SumData;
import java.io.IOException;

/* loaded from: classes3.dex */
final class SumStatelessMarshaler implements StatelessMarshaler<SumData<? extends PointData>> {
    static final SumStatelessMarshaler INSTANCE = new SumStatelessMarshaler();
    private static final MarshalerContext.Key DATA_POINT_SIZE_CALCULATOR_KEY = MarshalerContext.key();
    private static final MarshalerContext.Key DATA_POINT_WRITER_KEY = MarshalerContext.key();

    SumStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public void writeTo(Serializer serializer, SumData<? extends PointData> sumData, MarshalerContext marshalerContext) throws IOException {
        serializer.serializeRepeatedMessageWithContext(Sum.DATA_POINTS, sumData.getPoints(), NumberDataPointStatelessMarshaler.INSTANCE, marshalerContext, DATA_POINT_WRITER_KEY);
        serializer.serializeEnum(Sum.AGGREGATION_TEMPORALITY, MetricsMarshalerUtil.mapToTemporality(sumData.getAggregationTemporality()));
        serializer.serializeBool(Sum.IS_MONOTONIC, sumData.isMonotonic());
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public int getBinarySerializedSize(SumData<? extends PointData> sumData, MarshalerContext marshalerContext) {
        return StatelessMarshalerUtil.sizeRepeatedMessageWithContext(Sum.DATA_POINTS, sumData.getPoints(), NumberDataPointStatelessMarshaler.INSTANCE, marshalerContext, DATA_POINT_SIZE_CALCULATOR_KEY) + MarshalerUtil.sizeEnum(Sum.AGGREGATION_TEMPORALITY, MetricsMarshalerUtil.mapToTemporality(sumData.getAggregationTemporality())) + MarshalerUtil.sizeBool(Sum.IS_MONOTONIC, sumData.isMonotonic());
    }
}
