package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.cash.activity.api.v1.ActivitySearchAggregationResult;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivitySearchAggregationResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        ActivitySearchAggregationResult.Result result = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivitySearchAggregationResult((String) obj, result, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                result = new ActivitySearchAggregationResult.Result.BucketResult((BucketAggregationResult) BucketAggregationResult.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                result = new ActivitySearchAggregationResult.Result.RangeResult((RangeAggregationResult) RangeAggregationResult.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                result = new ActivitySearchAggregationResult.Result.MetricResult((MetricAggregationResult) MetricAggregationResult.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivitySearchAggregationResult activitySearchAggregationResult = (ActivitySearchAggregationResult) obj;
        reverseProtoWriter.getClass();
        activitySearchAggregationResult.getClass();
        reverseProtoWriter.writeBytes(activitySearchAggregationResult.unknownFields());
        ActivitySearchAggregationResult.Result result = activitySearchAggregationResult.result;
        if (result instanceof ActivitySearchAggregationResult.Result.BucketResult) {
            BucketAggregationResult.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ActivitySearchAggregationResult.Result.BucketResult) result).getValue());
        } else if (result instanceof ActivitySearchAggregationResult.Result.RangeResult) {
            RangeAggregationResult.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ActivitySearchAggregationResult.Result.RangeResult) result).getValue());
        } else if (result instanceof ActivitySearchAggregationResult.Result.MetricResult) {
            MetricAggregationResult.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((ActivitySearchAggregationResult.Result.MetricResult) result).getValue());
        } else if (result != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, activitySearchAggregationResult.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivitySearchAggregationResult activitySearchAggregationResult = (ActivitySearchAggregationResult) obj;
        activitySearchAggregationResult.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, activitySearchAggregationResult.name) + activitySearchAggregationResult.unknownFields().getSize$okio();
        ActivitySearchAggregationResult.Result result = activitySearchAggregationResult.result;
        if (result instanceof ActivitySearchAggregationResult.Result.BucketResult) {
            return BucketAggregationResult.ADAPTER.encodedSizeWithTag(2, ((ActivitySearchAggregationResult.Result.BucketResult) result).getValue()) + encodedSizeWithTag;
        }
        if (result instanceof ActivitySearchAggregationResult.Result.RangeResult) {
            return RangeAggregationResult.ADAPTER.encodedSizeWithTag(3, ((ActivitySearchAggregationResult.Result.RangeResult) result).getValue()) + encodedSizeWithTag;
        }
        if (result instanceof ActivitySearchAggregationResult.Result.MetricResult) {
            return MetricAggregationResult.ADAPTER.encodedSizeWithTag(4, ((ActivitySearchAggregationResult.Result.MetricResult) result).getValue()) + encodedSizeWithTag;
        }
        if (result == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivitySearchAggregationResult activitySearchAggregationResult = (ActivitySearchAggregationResult) obj;
        activitySearchAggregationResult.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = activitySearchAggregationResult.name;
        ActivitySearchAggregationResult.Result result = activitySearchAggregationResult.result;
        byteString.getClass();
        return new ActivitySearchAggregationResult(str, result, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivitySearchAggregationResult activitySearchAggregationResult = (ActivitySearchAggregationResult) obj;
        activitySearchAggregationResult.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, activitySearchAggregationResult.name);
        ActivitySearchAggregationResult.Result result = activitySearchAggregationResult.result;
        if (result instanceof ActivitySearchAggregationResult.Result.BucketResult) {
            BucketAggregationResult.ADAPTER.encodeWithTag(protoWriter, 2, ((ActivitySearchAggregationResult.Result.BucketResult) result).getValue());
        } else if (result instanceof ActivitySearchAggregationResult.Result.RangeResult) {
            RangeAggregationResult.ADAPTER.encodeWithTag(protoWriter, 3, ((ActivitySearchAggregationResult.Result.RangeResult) result).getValue());
        } else if (result instanceof ActivitySearchAggregationResult.Result.MetricResult) {
            MetricAggregationResult.ADAPTER.encodeWithTag(protoWriter, 4, ((ActivitySearchAggregationResult.Result.MetricResult) result).getValue());
        } else if (result != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(activitySearchAggregationResult.unknownFields());
    }
}
