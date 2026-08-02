package com.squareup.protos.cash.grantly.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.DeliveryInstructions;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressRequest;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateShippingAddressRequest$ShippingAddress$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CreateShippingAddressRequest.ShippingAddress((String) obj, (ShippingAddressSource) obj2, (String) obj3, (FullName) obj4, (GlobalAddress) obj5, (Phone) obj6, (String) obj7, (DeliveryInstructions) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = ShippingAddressSource.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(FullName.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Phone.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(DeliveryInstructions.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateShippingAddressRequest.ShippingAddress shippingAddress = (CreateShippingAddressRequest.ShippingAddress) obj;
        reverseProtoWriter.getClass();
        shippingAddress.getClass();
        reverseProtoWriter.writeBytes(shippingAddress.unknownFields());
        DeliveryInstructions.ADAPTER.encodeWithTag(reverseProtoWriter, 8, shippingAddress.delivery_instructions);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, shippingAddress.email);
        Phone.ADAPTER.encodeWithTag(reverseProtoWriter, 6, shippingAddress.phone);
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 5, shippingAddress.global_address);
        FullName.ADAPTER.encodeWithTag(reverseProtoWriter, 4, shippingAddress.full_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, shippingAddress.nickname);
        ShippingAddressSource.ADAPTER.encodeWithTag(reverseProtoWriter, 2, shippingAddress.source);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, shippingAddress.customer_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateShippingAddressRequest.ShippingAddress shippingAddress = (CreateShippingAddressRequest.ShippingAddress) obj;
        shippingAddress.getClass();
        int size$okio = shippingAddress.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return DeliveryInstructions.ADAPTER.encodedSizeWithTag(8, shippingAddress.delivery_instructions) + protoAdapter.encodedSizeWithTag(7, shippingAddress.email) + Phone.ADAPTER.encodedSizeWithTag(6, shippingAddress.phone) + GlobalAddress.ADAPTER.encodedSizeWithTag(5, shippingAddress.global_address) + FullName.ADAPTER.encodedSizeWithTag(4, shippingAddress.full_name) + protoAdapter.encodedSizeWithTag(3, shippingAddress.nickname) + ShippingAddressSource.ADAPTER.encodedSizeWithTag(2, shippingAddress.source) + protoAdapter.encodedSizeWithTag(1, shippingAddress.customer_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateShippingAddressRequest.ShippingAddress shippingAddress = (CreateShippingAddressRequest.ShippingAddress) obj;
        shippingAddress.getClass();
        Phone phone = shippingAddress.phone;
        Phone phone2 = phone != null ? (Phone) Phone.ADAPTER.redact(phone) : null;
        DeliveryInstructions deliveryInstructions = shippingAddress.delivery_instructions;
        DeliveryInstructions deliveryInstructions2 = deliveryInstructions != null ? (DeliveryInstructions) DeliveryInstructions.ADAPTER.redact(deliveryInstructions) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = shippingAddress.customer_id;
        ShippingAddressSource shippingAddressSource = shippingAddress.source;
        byteString.getClass();
        return new CreateShippingAddressRequest.ShippingAddress(str, shippingAddressSource, null, null, null, phone2, null, deliveryInstructions2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateShippingAddressRequest.ShippingAddress shippingAddress = (CreateShippingAddressRequest.ShippingAddress) obj;
        shippingAddress.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, shippingAddress.customer_id);
        ShippingAddressSource.ADAPTER.encodeWithTag(protoWriter, 2, shippingAddress.source);
        protoAdapter.encodeWithTag(protoWriter, 3, shippingAddress.nickname);
        FullName.ADAPTER.encodeWithTag(protoWriter, 4, shippingAddress.full_name);
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 5, shippingAddress.global_address);
        Phone.ADAPTER.encodeWithTag(protoWriter, 6, shippingAddress.phone);
        protoAdapter.encodeWithTag(protoWriter, 7, shippingAddress.email);
        DeliveryInstructions.ADAPTER.encodeWithTag(protoWriter, 8, shippingAddress.delivery_instructions);
        protoWriter.writeBytes(shippingAddress.unknownFields());
    }
}
