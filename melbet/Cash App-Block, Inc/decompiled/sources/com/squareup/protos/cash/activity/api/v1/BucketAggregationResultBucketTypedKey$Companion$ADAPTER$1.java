package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/BucketAggregationResultBucketTypedKey$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/BucketAggregationResultBucketTypedKey;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BucketAggregationResultBucketTypedKey$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BucketAggregationResultBucketTypedKey(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BucketAggregationResultBucketTypedKey bucketAggregationResultBucketTypedKey = (BucketAggregationResultBucketTypedKey) obj;
        reverseProtoWriter.getClass();
        bucketAggregationResultBucketTypedKey.getClass();
        reverseProtoWriter.writeBytes(bucketAggregationResultBucketTypedKey.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BucketAggregationResultBucketTypedKey bucketAggregationResultBucketTypedKey = (BucketAggregationResultBucketTypedKey) obj;
        bucketAggregationResultBucketTypedKey.getClass();
        return bucketAggregationResultBucketTypedKey.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((BucketAggregationResultBucketTypedKey) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BucketAggregationResultBucketTypedKey(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BucketAggregationResultBucketTypedKey bucketAggregationResultBucketTypedKey = (BucketAggregationResultBucketTypedKey) obj;
        bucketAggregationResultBucketTypedKey.getClass();
        protoWriter.writeBytes(bucketAggregationResultBucketTypedKey.unknownFields());
    }
}
