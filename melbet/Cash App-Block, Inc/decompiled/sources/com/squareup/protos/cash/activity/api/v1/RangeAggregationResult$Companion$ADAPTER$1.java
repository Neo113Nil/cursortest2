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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/RangeAggregationResult$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationResult;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RangeAggregationResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RangeAggregationResult(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(RangeAggregationResultBucket.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RangeAggregationResult rangeAggregationResult = (RangeAggregationResult) obj;
        reverseProtoWriter.getClass();
        rangeAggregationResult.getClass();
        reverseProtoWriter.writeBytes(rangeAggregationResult.unknownFields());
        RangeAggregationResultBucket.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, rangeAggregationResult.buckets);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RangeAggregationResult rangeAggregationResult = (RangeAggregationResult) obj;
        rangeAggregationResult.getClass();
        return RangeAggregationResultBucket.ADAPTER.asRepeated().encodedSizeWithTag(1, rangeAggregationResult.buckets) + rangeAggregationResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RangeAggregationResult rangeAggregationResult = (RangeAggregationResult) obj;
        rangeAggregationResult.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(rangeAggregationResult.buckets, RangeAggregationResultBucket.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RangeAggregationResult(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RangeAggregationResult rangeAggregationResult = (RangeAggregationResult) obj;
        rangeAggregationResult.getClass();
        RangeAggregationResultBucket.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, rangeAggregationResult.buckets);
        protoWriter.writeBytes(rangeAggregationResult.unknownFields());
    }
}
