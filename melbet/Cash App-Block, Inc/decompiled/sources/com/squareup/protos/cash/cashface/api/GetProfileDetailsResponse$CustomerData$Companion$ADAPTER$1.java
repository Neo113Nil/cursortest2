package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetProfileDetailsResponse$CustomerData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetProfileDetailsResponse.CustomerData((String) obj4, (Image) obj5, (Region) obj6, (String) obj7, (Boolean) obj8, (Boolean) obj9, (Integer) obj10, (BlockState) obj11, (Boolean) obj12, (Boolean) obj13, (String) obj14, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj5 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj5);
                    break;
                case 3:
                    obj = obj4;
                    obj2 = obj6;
                    obj3 = obj7;
                    try {
                        obj4 = obj;
                        obj6 = Region.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj7 = obj3;
                    break;
                case 4:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj9 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    obj10 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 8:
                    try {
                        obj11 = BlockState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj4;
                        obj2 = obj6;
                        obj3 = obj7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 9:
                    obj12 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 10:
                    obj13 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 11:
                    obj14 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj6;
                    obj3 = obj7;
                    obj4 = obj;
                    obj6 = obj2;
                    obj7 = obj3;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetProfileDetailsResponse.CustomerData customerData = (GetProfileDetailsResponse.CustomerData) obj;
        reverseProtoWriter.getClass();
        customerData.getClass();
        reverseProtoWriter.writeBytes(customerData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, customerData.business_category);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, customerData.can_accept_payments);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, customerData.is_cash_customer);
        BlockState.ADAPTER.encodeWithTag(reverseProtoWriter, 8, customerData.blocked_state);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 7, customerData.credit_card_bps_fee_override);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, customerData.is_verified);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, customerData.is_business);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, customerData.cashtag);
        Region.ADAPTER.encodeWithTag(reverseProtoWriter, 3, customerData.region);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, customerData.photo);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, customerData.display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetProfileDetailsResponse.CustomerData customerData = (GetProfileDetailsResponse.CustomerData) obj;
        customerData.getClass();
        int size$okio = customerData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, customerData.cashtag) + Region.ADAPTER.encodedSizeWithTag(3, customerData.region) + Image.ADAPTER.encodedSizeWithTag(2, customerData.photo) + protoAdapter.encodedSizeWithTag(1, customerData.display_name) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(11, customerData.business_category) + protoAdapter2.encodedSizeWithTag(10, customerData.can_accept_payments) + protoAdapter2.encodedSizeWithTag(9, customerData.is_cash_customer) + BlockState.ADAPTER.encodedSizeWithTag(8, customerData.blocked_state) + ProtoAdapter.INT32.encodedSizeWithTag(7, customerData.credit_card_bps_fee_override) + protoAdapter2.encodedSizeWithTag(6, customerData.is_verified) + protoAdapter2.encodedSizeWithTag(5, customerData.is_business) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetProfileDetailsResponse.CustomerData customerData = (GetProfileDetailsResponse.CustomerData) obj;
        customerData.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = customerData.is_business;
        Boolean bool2 = customerData.is_verified;
        Integer num = customerData.credit_card_bps_fee_override;
        BlockState blockState = customerData.blocked_state;
        Boolean bool3 = customerData.is_cash_customer;
        Boolean bool4 = customerData.can_accept_payments;
        String str = customerData.business_category;
        byteString.getClass();
        return new GetProfileDetailsResponse.CustomerData(null, null, null, null, bool, bool2, num, blockState, bool3, bool4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetProfileDetailsResponse.CustomerData customerData = (GetProfileDetailsResponse.CustomerData) obj;
        customerData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, customerData.display_name);
        Image.ADAPTER.encodeWithTag(protoWriter, 2, customerData.photo);
        Region.ADAPTER.encodeWithTag(protoWriter, 3, customerData.region);
        protoAdapter.encodeWithTag(protoWriter, 4, customerData.cashtag);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, customerData.is_business);
        protoAdapter2.encodeWithTag(protoWriter, 6, customerData.is_verified);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, customerData.credit_card_bps_fee_override);
        BlockState.ADAPTER.encodeWithTag(protoWriter, 8, customerData.blocked_state);
        protoAdapter2.encodeWithTag(protoWriter, 9, customerData.is_cash_customer);
        protoAdapter2.encodeWithTag(protoWriter, 10, customerData.can_accept_payments);
        protoAdapter.encodeWithTag(protoWriter, 11, customerData.business_category);
        protoWriter.writeBytes(customerData.unknownFields());
    }
}
