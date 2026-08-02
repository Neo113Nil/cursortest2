package com.squareup.protos.cash.grantly.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.DeliveryInstructions;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.grantly.app.UpdateShippingAddressRequest;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UpdateShippingAddressRequest$ShippingAddress$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateShippingAddressRequest.ShippingAddress((ShippingAddressSource) obj, (String) obj2, (FullName) obj3, (GlobalAddress) obj4, (Phone) obj5, (String) obj6, (DeliveryInstructions) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = ShippingAddressSource.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(FullName.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Phone.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(DeliveryInstructions.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateShippingAddressRequest.ShippingAddress shippingAddress = (UpdateShippingAddressRequest.ShippingAddress) obj;
        reverseProtoWriter.getClass();
        shippingAddress.getClass();
        reverseProtoWriter.writeBytes(shippingAddress.unknownFields());
        DeliveryInstructions.ADAPTER.encodeWithTag(reverseProtoWriter, 7, shippingAddress.delivery_instructions);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, shippingAddress.email);
        Phone.ADAPTER.encodeWithTag(reverseProtoWriter, 5, shippingAddress.phone);
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 4, shippingAddress.global_address);
        FullName.ADAPTER.encodeWithTag(reverseProtoWriter, 3, shippingAddress.full_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, shippingAddress.nickname);
        ShippingAddressSource.ADAPTER.encodeWithTag(reverseProtoWriter, 1, shippingAddress.source);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateShippingAddressRequest.ShippingAddress shippingAddress = (UpdateShippingAddressRequest.ShippingAddress) obj;
        shippingAddress.getClass();
        int encodedSizeWithTag = ShippingAddressSource.ADAPTER.encodedSizeWithTag(1, shippingAddress.source) + shippingAddress.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return DeliveryInstructions.ADAPTER.encodedSizeWithTag(7, shippingAddress.delivery_instructions) + protoAdapter.encodedSizeWithTag(6, shippingAddress.email) + Phone.ADAPTER.encodedSizeWithTag(5, shippingAddress.phone) + GlobalAddress.ADAPTER.encodedSizeWithTag(4, shippingAddress.global_address) + FullName.ADAPTER.encodedSizeWithTag(3, shippingAddress.full_name) + protoAdapter.encodedSizeWithTag(2, shippingAddress.nickname) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateShippingAddressRequest.ShippingAddress shippingAddress = (UpdateShippingAddressRequest.ShippingAddress) obj;
        shippingAddress.getClass();
        Phone phone = shippingAddress.phone;
        Phone phone2 = phone != null ? (Phone) Phone.ADAPTER.redact(phone) : null;
        DeliveryInstructions deliveryInstructions = shippingAddress.delivery_instructions;
        DeliveryInstructions deliveryInstructions2 = deliveryInstructions != null ? (DeliveryInstructions) DeliveryInstructions.ADAPTER.redact(deliveryInstructions) : null;
        ByteString byteString = ByteString.EMPTY;
        ShippingAddressSource shippingAddressSource = shippingAddress.source;
        byteString.getClass();
        return new UpdateShippingAddressRequest.ShippingAddress(shippingAddressSource, null, null, null, phone2, null, deliveryInstructions2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateShippingAddressRequest.ShippingAddress shippingAddress = (UpdateShippingAddressRequest.ShippingAddress) obj;
        shippingAddress.getClass();
        ShippingAddressSource.ADAPTER.encodeWithTag(protoWriter, 1, shippingAddress.source);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, shippingAddress.nickname);
        FullName.ADAPTER.encodeWithTag(protoWriter, 3, shippingAddress.full_name);
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 4, shippingAddress.global_address);
        Phone.ADAPTER.encodeWithTag(protoWriter, 5, shippingAddress.phone);
        protoAdapter.encodeWithTag(protoWriter, 6, shippingAddress.email);
        DeliveryInstructions.ADAPTER.encodeWithTag(protoWriter, 7, shippingAddress.delivery_instructions);
        protoWriter.writeBytes(shippingAddress.unknownFields());
    }
}
