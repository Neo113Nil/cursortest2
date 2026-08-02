package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.cash.activity.api.v1.ActivitySearchAggregation;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivitySearchAggregation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        ActivitySearchAggregation.Aggregation aggregation = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivitySearchAggregation((String) obj, aggregation, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                aggregation = new ActivitySearchAggregation.Aggregation.Bucket((BucketAggregation) BucketAggregation.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                aggregation = new ActivitySearchAggregation.Aggregation.Range((RangeAggregation) RangeAggregation.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                aggregation = new ActivitySearchAggregation.Aggregation.Metric((MetricAggregation) MetricAggregation.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivitySearchAggregation activitySearchAggregation = (ActivitySearchAggregation) obj;
        reverseProtoWriter.getClass();
        activitySearchAggregation.getClass();
        reverseProtoWriter.writeBytes(activitySearchAggregation.unknownFields());
        ActivitySearchAggregation.Aggregation aggregation = activitySearchAggregation.aggregation;
        if (aggregation instanceof ActivitySearchAggregation.Aggregation.Bucket) {
            BucketAggregation.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ActivitySearchAggregation.Aggregation.Bucket) aggregation).getValue());
        } else if (aggregation instanceof ActivitySearchAggregation.Aggregation.Range) {
            RangeAggregation.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ActivitySearchAggregation.Aggregation.Range) aggregation).getValue());
        } else if (aggregation instanceof ActivitySearchAggregation.Aggregation.Metric) {
            MetricAggregation.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((ActivitySearchAggregation.Aggregation.Metric) aggregation).getValue());
        } else if (aggregation != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, activitySearchAggregation.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivitySearchAggregation activitySearchAggregation = (ActivitySearchAggregation) obj;
        activitySearchAggregation.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, activitySearchAggregation.name) + activitySearchAggregation.unknownFields().getSize$okio();
        ActivitySearchAggregation.Aggregation aggregation = activitySearchAggregation.aggregation;
        if (aggregation instanceof ActivitySearchAggregation.Aggregation.Bucket) {
            return BucketAggregation.ADAPTER.encodedSizeWithTag(2, ((ActivitySearchAggregation.Aggregation.Bucket) aggregation).getValue()) + encodedSizeWithTag;
        }
        if (aggregation instanceof ActivitySearchAggregation.Aggregation.Range) {
            return RangeAggregation.ADAPTER.encodedSizeWithTag(3, ((ActivitySearchAggregation.Aggregation.Range) aggregation).getValue()) + encodedSizeWithTag;
        }
        if (aggregation instanceof ActivitySearchAggregation.Aggregation.Metric) {
            return MetricAggregation.ADAPTER.encodedSizeWithTag(4, ((ActivitySearchAggregation.Aggregation.Metric) aggregation).getValue()) + encodedSizeWithTag;
        }
        if (aggregation == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivitySearchAggregation activitySearchAggregation = (ActivitySearchAggregation) obj;
        activitySearchAggregation.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = activitySearchAggregation.name;
        ActivitySearchAggregation.Aggregation aggregation = activitySearchAggregation.aggregation;
        byteString.getClass();
        return new ActivitySearchAggregation(str, aggregation, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivitySearchAggregation activitySearchAggregation = (ActivitySearchAggregation) obj;
        activitySearchAggregation.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, activitySearchAggregation.name);
        ActivitySearchAggregation.Aggregation aggregation = activitySearchAggregation.aggregation;
        if (aggregation instanceof ActivitySearchAggregation.Aggregation.Bucket) {
            BucketAggregation.ADAPTER.encodeWithTag(protoWriter, 2, ((ActivitySearchAggregation.Aggregation.Bucket) aggregation).getValue());
        } else if (aggregation instanceof ActivitySearchAggregation.Aggregation.Range) {
            RangeAggregation.ADAPTER.encodeWithTag(protoWriter, 3, ((ActivitySearchAggregation.Aggregation.Range) aggregation).getValue());
        } else if (aggregation instanceof ActivitySearchAggregation.Aggregation.Metric) {
            MetricAggregation.ADAPTER.encodeWithTag(protoWriter, 4, ((ActivitySearchAggregation.Aggregation.Metric) aggregation).getValue());
        } else if (aggregation != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(activitySearchAggregation.unknownFields());
    }
}
