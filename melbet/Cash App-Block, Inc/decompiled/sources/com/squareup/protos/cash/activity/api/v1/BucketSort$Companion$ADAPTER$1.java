package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.cash.activity.api.v1.BucketSort;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/BucketSort$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BucketSort$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BucketSort((BucketSort.Type) obj, (String) obj2, (BucketSort.Order) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = BucketSort.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = BucketSort.Order.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BucketSort bucketSort = (BucketSort) obj;
        reverseProtoWriter.getClass();
        bucketSort.getClass();
        reverseProtoWriter.writeBytes(bucketSort.unknownFields());
        BucketSort.Order.ADAPTER.encodeWithTag(reverseProtoWriter, 3, bucketSort.order);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, bucketSort.aggregation_name);
        BucketSort.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bucketSort.type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BucketSort bucketSort = (BucketSort) obj;
        bucketSort.getClass();
        return BucketSort.Order.ADAPTER.encodedSizeWithTag(3, bucketSort.order) + ProtoAdapter.STRING.encodedSizeWithTag(2, bucketSort.aggregation_name) + BucketSort.Type.ADAPTER.encodedSizeWithTag(1, bucketSort.type) + bucketSort.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BucketSort bucketSort = (BucketSort) obj;
        bucketSort.getClass();
        ByteString byteString = ByteString.EMPTY;
        BucketSort.Type type2 = bucketSort.type;
        String str = bucketSort.aggregation_name;
        BucketSort.Order order = bucketSort.order;
        byteString.getClass();
        return new BucketSort(type2, str, order, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BucketSort bucketSort = (BucketSort) obj;
        bucketSort.getClass();
        BucketSort.Type.ADAPTER.encodeWithTag(protoWriter, 1, bucketSort.type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bucketSort.aggregation_name);
        BucketSort.Order.ADAPTER.encodeWithTag(protoWriter, 3, bucketSort.order);
        protoWriter.writeBytes(bucketSort.unknownFields());
    }
}
