package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Order$FeatureMetadata$CanceledSponsorshipMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Order.FeatureMetadata.CanceledSponsorshipMetadata((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Order.FeatureMetadata.CanceledSponsorshipMetadata canceledSponsorshipMetadata = (Order.FeatureMetadata.CanceledSponsorshipMetadata) obj;
        reverseProtoWriter.getClass();
        canceledSponsorshipMetadata.getClass();
        reverseProtoWriter.writeBytes(canceledSponsorshipMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, canceledSponsorshipMetadata.dependent_customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, canceledSponsorshipMetadata.sponsor_customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Order.FeatureMetadata.CanceledSponsorshipMetadata canceledSponsorshipMetadata = (Order.FeatureMetadata.CanceledSponsorshipMetadata) obj;
        canceledSponsorshipMetadata.getClass();
        int size$okio = canceledSponsorshipMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, canceledSponsorshipMetadata.dependent_customer_token) + protoAdapter.encodedSizeWithTag(1, canceledSponsorshipMetadata.sponsor_customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Order.FeatureMetadata.CanceledSponsorshipMetadata canceledSponsorshipMetadata = (Order.FeatureMetadata.CanceledSponsorshipMetadata) obj;
        canceledSponsorshipMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = canceledSponsorshipMetadata.sponsor_customer_token;
        String str2 = canceledSponsorshipMetadata.dependent_customer_token;
        byteString.getClass();
        return new Order.FeatureMetadata.CanceledSponsorshipMetadata(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Order.FeatureMetadata.CanceledSponsorshipMetadata canceledSponsorshipMetadata = (Order.FeatureMetadata.CanceledSponsorshipMetadata) obj;
        canceledSponsorshipMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, canceledSponsorshipMetadata.sponsor_customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, canceledSponsorshipMetadata.dependent_customer_token);
        protoWriter.writeBytes(canceledSponsorshipMetadata.unknownFields());
    }
}
