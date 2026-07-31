package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.ProtoFieldInfo;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil;
import io.opentelemetry.exporter.internal.otlp.AttributeKeyValueStatelessMarshaler;
import io.opentelemetry.proto.metrics.v1.internal.NumberDataPoint;
import io.opentelemetry.sdk.metrics.data.DoublePointData;
import io.opentelemetry.sdk.metrics.data.LongPointData;
import io.opentelemetry.sdk.metrics.data.PointData;
import java.io.IOException;

/* loaded from: classes3.dex */
final class NumberDataPointStatelessMarshaler implements StatelessMarshaler<PointData> {
    static final NumberDataPointStatelessMarshaler INSTANCE = new NumberDataPointStatelessMarshaler();

    private NumberDataPointStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public void writeTo(Serializer serializer, PointData pointData, MarshalerContext marshalerContext) throws IOException {
        serializer.serializeFixed64(NumberDataPoint.START_TIME_UNIX_NANO, pointData.getStartEpochNanos());
        serializer.serializeFixed64(NumberDataPoint.TIME_UNIX_NANO, pointData.getEpochNanos());
        ProtoFieldInfo protoPointValueType = NumberDataPointMarshaler.toProtoPointValueType(pointData);
        if (protoPointValueType == NumberDataPoint.AS_INT) {
            serializer.serializeFixed64Optional(protoPointValueType, ((LongPointData) pointData).getValue());
        } else {
            serializer.serializeDoubleOptional(protoPointValueType, ((DoublePointData) pointData).getValue());
        }
        serializer.serializeRepeatedMessageWithContext(NumberDataPoint.EXEMPLARS, pointData.getExemplars(), ExemplarStatelessMarshaler.INSTANCE, marshalerContext);
        serializer.serializeRepeatedMessageWithContext(NumberDataPoint.ATTRIBUTES, pointData.getAttributes(), AttributeKeyValueStatelessMarshaler.INSTANCE, marshalerContext);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public int getBinarySerializedSize(PointData pointData, MarshalerContext marshalerContext) {
        int sizeDoubleOptional;
        int sizeFixed64 = MarshalerUtil.sizeFixed64(NumberDataPoint.START_TIME_UNIX_NANO, pointData.getStartEpochNanos()) + MarshalerUtil.sizeFixed64(NumberDataPoint.TIME_UNIX_NANO, pointData.getEpochNanos());
        ProtoFieldInfo protoPointValueType = NumberDataPointMarshaler.toProtoPointValueType(pointData);
        if (protoPointValueType == NumberDataPoint.AS_INT) {
            sizeDoubleOptional = MarshalerUtil.sizeFixed64Optional(protoPointValueType, ((LongPointData) pointData).getValue());
        } else {
            sizeDoubleOptional = MarshalerUtil.sizeDoubleOptional(protoPointValueType, ((DoublePointData) pointData).getValue());
        }
        return sizeFixed64 + sizeDoubleOptional + StatelessMarshalerUtil.sizeRepeatedMessageWithContext(NumberDataPoint.EXEMPLARS, pointData.getExemplars(), ExemplarStatelessMarshaler.INSTANCE, marshalerContext) + StatelessMarshalerUtil.sizeRepeatedMessageWithContext(NumberDataPoint.ATTRIBUTES, pointData.getAttributes(), AttributeKeyValueStatelessMarshaler.INSTANCE, marshalerContext);
    }
}
