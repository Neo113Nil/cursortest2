package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetDeliveryQuoteResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetDeliveryQuoteResponse$DeliveryQuote$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetDeliveryQuoteResponse.DeliveryQuote((String) obj, (LocalLocationSummary) obj2, (LocalFulfillment) obj3, (LocalMoney) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalLocationSummary.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetDeliveryQuoteResponse.DeliveryQuote deliveryQuote = (GetDeliveryQuoteResponse.DeliveryQuote) obj;
        reverseProtoWriter.getClass();
        deliveryQuote.getClass();
        reverseProtoWriter.writeBytes(deliveryQuote.unknownFields());
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 4, deliveryQuote.delivery_fee);
        LocalFulfillment.ADAPTER.encodeWithTag(reverseProtoWriter, 3, deliveryQuote.fulfillment);
        LocalLocationSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 2, deliveryQuote.location_summary);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, deliveryQuote.brand_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetDeliveryQuoteResponse.DeliveryQuote deliveryQuote = (GetDeliveryQuoteResponse.DeliveryQuote) obj;
        deliveryQuote.getClass();
        return LocalMoney.ADAPTER.encodedSizeWithTag(4, deliveryQuote.delivery_fee) + LocalFulfillment.ADAPTER.encodedSizeWithTag(3, deliveryQuote.fulfillment) + LocalLocationSummary.ADAPTER.encodedSizeWithTag(2, deliveryQuote.location_summary) + ProtoAdapter.STRING.encodedSizeWithTag(1, deliveryQuote.brand_token) + deliveryQuote.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetDeliveryQuoteResponse.DeliveryQuote deliveryQuote = (GetDeliveryQuoteResponse.DeliveryQuote) obj;
        deliveryQuote.getClass();
        LocalLocationSummary localLocationSummary = deliveryQuote.location_summary;
        LocalLocationSummary localLocationSummary2 = localLocationSummary != null ? (LocalLocationSummary) LocalLocationSummary.ADAPTER.redact(localLocationSummary) : null;
        LocalFulfillment localFulfillment = deliveryQuote.fulfillment;
        LocalFulfillment localFulfillment2 = localFulfillment != null ? (LocalFulfillment) LocalFulfillment.ADAPTER.redact(localFulfillment) : null;
        LocalMoney localMoney = deliveryQuote.delivery_fee;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = deliveryQuote.brand_token;
        byteString.getClass();
        return new GetDeliveryQuoteResponse.DeliveryQuote(str, localLocationSummary2, localFulfillment2, localMoney2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetDeliveryQuoteResponse.DeliveryQuote deliveryQuote = (GetDeliveryQuoteResponse.DeliveryQuote) obj;
        deliveryQuote.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deliveryQuote.brand_token);
        LocalLocationSummary.ADAPTER.encodeWithTag(protoWriter, 2, deliveryQuote.location_summary);
        LocalFulfillment.ADAPTER.encodeWithTag(protoWriter, 3, deliveryQuote.fulfillment);
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 4, deliveryQuote.delivery_fee);
        protoWriter.writeBytes(deliveryQuote.unknownFields());
    }
}
