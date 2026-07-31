package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.ProtoEnumInfo;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;

/* loaded from: classes3.dex */
final class MetricsMarshalerUtil {

    /* renamed from: io.opentelemetry.exporter.internal.otlp.metrics.MetricsMarshalerUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$sdk$metrics$data$AggregationTemporality;

        static {
            int[] iArr = new int[AggregationTemporality.values().length];
            $SwitchMap$io$opentelemetry$sdk$metrics$data$AggregationTemporality = iArr;
            try {
                iArr[AggregationTemporality.CUMULATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$metrics$data$AggregationTemporality[AggregationTemporality.DELTA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static ProtoEnumInfo mapToTemporality(AggregationTemporality aggregationTemporality) {
        int i = AnonymousClass1.$SwitchMap$io$opentelemetry$sdk$metrics$data$AggregationTemporality[aggregationTemporality.ordinal()];
        if (i == 1) {
            return io.opentelemetry.proto.metrics.v1.internal.AggregationTemporality.AGGREGATION_TEMPORALITY_CUMULATIVE;
        }
        if (i == 2) {
            return io.opentelemetry.proto.metrics.v1.internal.AggregationTemporality.AGGREGATION_TEMPORALITY_DELTA;
        }
        return io.opentelemetry.proto.metrics.v1.internal.AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED;
    }

    private MetricsMarshalerUtil() {
    }
}
