package com.squareup.protos.cash.activity.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/RangeAggregationResultBucket$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationResultBucket;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RangeAggregationResultBucket$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RangeAggregationResultBucket((String) obj, (RangeAggregationRange) obj2, (Long) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(RangeAggregationRange.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ActivitySearchAggregationResult.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RangeAggregationResultBucket rangeAggregationResultBucket = (RangeAggregationResultBucket) obj;
        reverseProtoWriter.getClass();
        rangeAggregationResultBucket.getClass();
        reverseProtoWriter.writeBytes(rangeAggregationResultBucket.unknownFields());
        ActivitySearchAggregationResult.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, rangeAggregationResultBucket.sub_aggregation_results);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, rangeAggregationResultBucket.count);
        RangeAggregationRange.ADAPTER.encodeWithTag(reverseProtoWriter, 2, rangeAggregationResultBucket.range);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, rangeAggregationResultBucket.key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RangeAggregationResultBucket rangeAggregationResultBucket = (RangeAggregationResultBucket) obj;
        rangeAggregationResultBucket.getClass();
        return ActivitySearchAggregationResult.ADAPTER.asRepeated().encodedSizeWithTag(4, rangeAggregationResultBucket.sub_aggregation_results) + ProtoAdapter.INT64.encodedSizeWithTag(3, rangeAggregationResultBucket.count) + RangeAggregationRange.ADAPTER.encodedSizeWithTag(2, rangeAggregationResultBucket.range) + ProtoAdapter.STRING.encodedSizeWithTag(1, rangeAggregationResultBucket.key) + rangeAggregationResultBucket.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RangeAggregationResultBucket rangeAggregationResultBucket = (RangeAggregationResultBucket) obj;
        rangeAggregationResultBucket.getClass();
        RangeAggregationRange rangeAggregationRange = rangeAggregationResultBucket.range;
        RangeAggregationRange rangeAggregationRange2 = rangeAggregationRange != null ? (RangeAggregationRange) RangeAggregationRange.ADAPTER.redact(rangeAggregationRange) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(rangeAggregationResultBucket.sub_aggregation_results, ActivitySearchAggregationResult.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = rangeAggregationResultBucket.key;
        Long l = rangeAggregationResultBucket.count;
        byteString.getClass();
        return new RangeAggregationResultBucket(str, rangeAggregationRange2, l, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RangeAggregationResultBucket rangeAggregationResultBucket = (RangeAggregationResultBucket) obj;
        rangeAggregationResultBucket.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, rangeAggregationResultBucket.key);
        RangeAggregationRange.ADAPTER.encodeWithTag(protoWriter, 2, rangeAggregationResultBucket.range);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, rangeAggregationResultBucket.count);
        ActivitySearchAggregationResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, rangeAggregationResultBucket.sub_aggregation_results);
        protoWriter.writeBytes(rangeAggregationResultBucket.unknownFields());
    }
}
