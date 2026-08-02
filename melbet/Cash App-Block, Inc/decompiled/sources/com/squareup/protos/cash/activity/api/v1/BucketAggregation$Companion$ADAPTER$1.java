package com.squareup.protos.cash.activity.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.BucketAggregation;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/BucketAggregation$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BucketAggregation$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BucketAggregation((BucketAggregation.Field) obj, (Integer) obj2, m, (BucketSort) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = BucketAggregation.Field.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(ActivitySearchAggregation.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(BucketSort.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BucketAggregation bucketAggregation = (BucketAggregation) obj;
        reverseProtoWriter.getClass();
        bucketAggregation.getClass();
        reverseProtoWriter.writeBytes(bucketAggregation.unknownFields());
        BucketSort.ADAPTER.encodeWithTag(reverseProtoWriter, 4, bucketAggregation.sort);
        ActivitySearchAggregation.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, bucketAggregation.sub_aggregations);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, bucketAggregation.size);
        BucketAggregation.Field.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bucketAggregation.field);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BucketAggregation bucketAggregation = (BucketAggregation) obj;
        bucketAggregation.getClass();
        return BucketSort.ADAPTER.encodedSizeWithTag(4, bucketAggregation.sort) + ActivitySearchAggregation.ADAPTER.asRepeated().encodedSizeWithTag(3, bucketAggregation.sub_aggregations) + ProtoAdapter.INT32.encodedSizeWithTag(2, bucketAggregation.size) + BucketAggregation.Field.ADAPTER.encodedSizeWithTag(1, bucketAggregation.field) + bucketAggregation.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BucketAggregation bucketAggregation = (BucketAggregation) obj;
        bucketAggregation.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(bucketAggregation.sub_aggregations, ActivitySearchAggregation.ADAPTER);
        BucketSort bucketSort = bucketAggregation.sort;
        BucketSort bucketSort2 = bucketSort != null ? (BucketSort) BucketSort.ADAPTER.redact(bucketSort) : null;
        ByteString byteString = ByteString.EMPTY;
        BucketAggregation.Field field = bucketAggregation.field;
        Integer num = bucketAggregation.size;
        byteString.getClass();
        return new BucketAggregation(field, num, m1169redactElements, bucketSort2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BucketAggregation bucketAggregation = (BucketAggregation) obj;
        bucketAggregation.getClass();
        BucketAggregation.Field.ADAPTER.encodeWithTag(protoWriter, 1, bucketAggregation.field);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, bucketAggregation.size);
        ActivitySearchAggregation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, bucketAggregation.sub_aggregations);
        BucketSort.ADAPTER.encodeWithTag(protoWriter, 4, bucketAggregation.sort);
        protoWriter.writeBytes(bucketAggregation.unknownFields());
    }
}
