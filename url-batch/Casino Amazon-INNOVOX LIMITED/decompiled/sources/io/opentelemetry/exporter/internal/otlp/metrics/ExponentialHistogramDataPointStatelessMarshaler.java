package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil;
import io.opentelemetry.exporter.internal.otlp.AttributeKeyValueStatelessMarshaler;
import io.opentelemetry.proto.metrics.v1.internal.ExponentialHistogramDataPoint;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramPointData;
import java.io.IOException;

/* loaded from: classes3.dex */
final class ExponentialHistogramDataPointStatelessMarshaler implements StatelessMarshaler<ExponentialHistogramPointData> {
    static final ExponentialHistogramDataPointStatelessMarshaler INSTANCE = new ExponentialHistogramDataPointStatelessMarshaler();

    private ExponentialHistogramDataPointStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public void writeTo(Serializer serializer, ExponentialHistogramPointData exponentialHistogramPointData, MarshalerContext marshalerContext) throws IOException {
        serializer.serializeFixed64(ExponentialHistogramDataPoint.START_TIME_UNIX_NANO, exponentialHistogramPointData.getStartEpochNanos());
        serializer.serializeFixed64(ExponentialHistogramDataPoint.TIME_UNIX_NANO, exponentialHistogramPointData.getEpochNanos());
        serializer.serializeFixed64(ExponentialHistogramDataPoint.COUNT, exponentialHistogramPointData.getCount());
        serializer.serializeDouble(ExponentialHistogramDataPoint.SUM, exponentialHistogramPointData.getSum());
        if (exponentialHistogramPointData.hasMin()) {
            serializer.serializeDoubleOptional(ExponentialHistogramDataPoint.MIN, exponentialHistogramPointData.getMin());
        }
        if (exponentialHistogramPointData.hasMax()) {
            serializer.serializeDoubleOptional(ExponentialHistogramDataPoint.MAX, exponentialHistogramPointData.getMax());
        }
        serializer.serializeSInt32(ExponentialHistogramDataPoint.SCALE, exponentialHistogramPointData.getScale());
        serializer.serializeFixed64(ExponentialHistogramDataPoint.ZERO_COUNT, exponentialHistogramPointData.getZeroCount());
        serializer.serializeMessageWithContext(ExponentialHistogramDataPoint.POSITIVE, exponentialHistogramPointData.getPositiveBuckets(), ExponentialHistogramBucketsStatelessMarshaler.INSTANCE, marshalerContext);
        serializer.serializeMessageWithContext(ExponentialHistogramDataPoint.NEGATIVE, exponentialHistogramPointData.getNegativeBuckets(), ExponentialHistogramBucketsStatelessMarshaler.INSTANCE, marshalerContext);
        serializer.serializeRepeatedMessageWithContext(ExponentialHistogramDataPoint.EXEMPLARS, exponentialHistogramPointData.getExemplars(), ExemplarStatelessMarshaler.INSTANCE, marshalerContext);
        serializer.serializeRepeatedMessageWithContext(ExponentialHistogramDataPoint.ATTRIBUTES, exponentialHistogramPointData.getAttributes(), AttributeKeyValueStatelessMarshaler.INSTANCE, marshalerContext);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public int getBinarySerializedSize(ExponentialHistogramPointData exponentialHistogramPointData, MarshalerContext marshalerContext) {
        int sizeFixed64 = MarshalerUtil.sizeFixed64(ExponentialHistogramDataPoint.START_TIME_UNIX_NANO, exponentialHistogramPointData.getStartEpochNanos()) + MarshalerUtil.sizeFixed64(ExponentialHistogramDataPoint.TIME_UNIX_NANO, exponentialHistogramPointData.getEpochNanos()) + MarshalerUtil.sizeFixed64(ExponentialHistogramDataPoint.COUNT, exponentialHistogramPointData.getCount()) + MarshalerUtil.sizeDouble(ExponentialHistogramDataPoint.SUM, exponentialHistogramPointData.getSum());
        if (exponentialHistogramPointData.hasMin()) {
            sizeFixed64 += MarshalerUtil.sizeDoubleOptional(ExponentialHistogramDataPoint.MIN, exponentialHistogramPointData.getMin());
        }
        if (exponentialHistogramPointData.hasMax()) {
            sizeFixed64 += MarshalerUtil.sizeDoubleOptional(ExponentialHistogramDataPoint.MAX, exponentialHistogramPointData.getMax());
        }
        return sizeFixed64 + MarshalerUtil.sizeSInt32(ExponentialHistogramDataPoint.SCALE, exponentialHistogramPointData.getScale()) + MarshalerUtil.sizeFixed64(ExponentialHistogramDataPoint.ZERO_COUNT, exponentialHistogramPointData.getZeroCount()) + StatelessMarshalerUtil.sizeMessageWithContext(ExponentialHistogramDataPoint.POSITIVE, exponentialHistogramPointData.getPositiveBuckets(), ExponentialHistogramBucketsStatelessMarshaler.INSTANCE, marshalerContext) + StatelessMarshalerUtil.sizeMessageWithContext(ExponentialHistogramDataPoint.NEGATIVE, exponentialHistogramPointData.getNegativeBuckets(), ExponentialHistogramBucketsStatelessMarshaler.INSTANCE, marshalerContext) + StatelessMarshalerUtil.sizeRepeatedMessageWithContext(ExponentialHistogramDataPoint.EXEMPLARS, exponentialHistogramPointData.getExemplars(), ExemplarStatelessMarshaler.INSTANCE, marshalerContext) + StatelessMarshalerUtil.sizeRepeatedMessageWithContext(ExponentialHistogramDataPoint.ATTRIBUTES, exponentialHistogramPointData.getAttributes(), AttributeKeyValueStatelessMarshaler.INSTANCE, marshalerContext);
    }
}
