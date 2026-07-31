package io.opentelemetry.diskbuffering.proto.metrics.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;

/* loaded from: classes3.dex */
public enum AggregationTemporality implements WireEnum {
    AGGREGATION_TEMPORALITY_UNSPECIFIED(0),
    AGGREGATION_TEMPORALITY_DELTA(1),
    AGGREGATION_TEMPORALITY_CUMULATIVE(2);

    public static final ProtoAdapter<AggregationTemporality> ADAPTER = new EnumAdapter<AggregationTemporality>() { // from class: io.opentelemetry.diskbuffering.proto.metrics.v1.AggregationTemporality.ProtoAdapter_AggregationTemporality
        {
            Syntax syntax = Syntax.PROTO_3;
            AggregationTemporality aggregationTemporality = AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public AggregationTemporality fromValue(int i) {
            return AggregationTemporality.fromValue(i);
        }
    };
    private final int value;

    AggregationTemporality(int i) {
        this.value = i;
    }

    public static AggregationTemporality fromValue(int i) {
        if (i == 0) {
            return AGGREGATION_TEMPORALITY_UNSPECIFIED;
        }
        if (i == 1) {
            return AGGREGATION_TEMPORALITY_DELTA;
        }
        if (i != 2) {
            return null;
        }
        return AGGREGATION_TEMPORALITY_CUMULATIVE;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }
}
