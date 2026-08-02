package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Order$FeatureMetadata$ReversalMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Order.FeatureMetadata.ReversalMetadata((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Order.FeatureMetadata.ReversalMetadata reversalMetadata = (Order.FeatureMetadata.ReversalMetadata) obj;
        reverseProtoWriter.getClass();
        reversalMetadata.getClass();
        reverseProtoWriter.writeBytes(reversalMetadata.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, reversalMetadata.original_order_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Order.FeatureMetadata.ReversalMetadata reversalMetadata = (Order.FeatureMetadata.ReversalMetadata) obj;
        reversalMetadata.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, reversalMetadata.original_order_token) + reversalMetadata.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Order.FeatureMetadata.ReversalMetadata reversalMetadata = (Order.FeatureMetadata.ReversalMetadata) obj;
        reversalMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = reversalMetadata.original_order_token;
        byteString.getClass();
        return new Order.FeatureMetadata.ReversalMetadata(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Order.FeatureMetadata.ReversalMetadata reversalMetadata = (Order.FeatureMetadata.ReversalMetadata) obj;
        reversalMetadata.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reversalMetadata.original_order_token);
        protoWriter.writeBytes(reversalMetadata.unknownFields());
    }
}
