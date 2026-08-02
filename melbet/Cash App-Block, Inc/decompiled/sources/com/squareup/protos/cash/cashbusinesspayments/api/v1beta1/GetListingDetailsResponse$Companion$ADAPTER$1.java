package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.GetListingDetailsResponse;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetListingDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetListingDetailsResponse((String) obj, (GetListingDetailsResponse.Customer) obj2, (Money) obj3, (String) obj4, (String) obj5, (String) obj6, (GetListingDetailsResponse.CoverImage) obj7, (Boolean) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(GetListingDetailsResponse.Customer.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(GetListingDetailsResponse.CoverImage.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetListingDetailsResponse getListingDetailsResponse = (GetListingDetailsResponse) obj;
        reverseProtoWriter.getClass();
        getListingDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(getListingDetailsResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 8, getListingDetailsResponse.is_paid);
        GetListingDetailsResponse.CoverImage.ADAPTER.encodeWithTag(reverseProtoWriter, 7, getListingDetailsResponse.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, getListingDetailsResponse.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, getListingDetailsResponse.location_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, getListingDetailsResponse.title);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getListingDetailsResponse.amount);
        GetListingDetailsResponse.Customer.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getListingDetailsResponse.customer);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getListingDetailsResponse.listing_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetListingDetailsResponse getListingDetailsResponse = (GetListingDetailsResponse) obj;
        getListingDetailsResponse.getClass();
        int size$okio = getListingDetailsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(8, getListingDetailsResponse.is_paid) + GetListingDetailsResponse.CoverImage.ADAPTER.encodedSizeWithTag(7, getListingDetailsResponse.image) + protoAdapter.encodedSizeWithTag(6, getListingDetailsResponse.description) + protoAdapter.encodedSizeWithTag(5, getListingDetailsResponse.location_id) + protoAdapter.encodedSizeWithTag(4, getListingDetailsResponse.title) + Money.ADAPTER.encodedSizeWithTag(3, getListingDetailsResponse.amount) + GetListingDetailsResponse.Customer.ADAPTER.encodedSizeWithTag(2, getListingDetailsResponse.customer) + protoAdapter.encodedSizeWithTag(1, getListingDetailsResponse.listing_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetListingDetailsResponse getListingDetailsResponse = (GetListingDetailsResponse) obj;
        getListingDetailsResponse.getClass();
        GetListingDetailsResponse.Customer customer = getListingDetailsResponse.customer;
        GetListingDetailsResponse.Customer customer2 = customer != null ? (GetListingDetailsResponse.Customer) GetListingDetailsResponse.Customer.ADAPTER.redact(customer) : null;
        Money money = getListingDetailsResponse.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        GetListingDetailsResponse.CoverImage coverImage = getListingDetailsResponse.image;
        GetListingDetailsResponse.CoverImage coverImage2 = coverImage != null ? (GetListingDetailsResponse.CoverImage) GetListingDetailsResponse.CoverImage.ADAPTER.redact(coverImage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getListingDetailsResponse.listing_token;
        String str2 = getListingDetailsResponse.location_id;
        Boolean bool = getListingDetailsResponse.is_paid;
        byteString.getClass();
        return new GetListingDetailsResponse(str, customer2, money2, null, str2, null, coverImage2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetListingDetailsResponse getListingDetailsResponse = (GetListingDetailsResponse) obj;
        getListingDetailsResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, getListingDetailsResponse.listing_token);
        GetListingDetailsResponse.Customer.ADAPTER.encodeWithTag(protoWriter, 2, getListingDetailsResponse.customer);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, getListingDetailsResponse.amount);
        protoAdapter.encodeWithTag(protoWriter, 4, getListingDetailsResponse.title);
        protoAdapter.encodeWithTag(protoWriter, 5, getListingDetailsResponse.location_id);
        protoAdapter.encodeWithTag(protoWriter, 6, getListingDetailsResponse.description);
        GetListingDetailsResponse.CoverImage.ADAPTER.encodeWithTag(protoWriter, 7, getListingDetailsResponse.image);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, getListingDetailsResponse.is_paid);
        protoWriter.writeBytes(getListingDetailsResponse.unknownFields());
    }
}
