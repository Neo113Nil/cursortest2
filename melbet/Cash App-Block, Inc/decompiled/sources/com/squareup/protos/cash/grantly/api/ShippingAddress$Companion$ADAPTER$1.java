package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShippingAddress$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Long l;
        Long l2;
        Boolean bool;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Long l3 = null;
        Long l4 = null;
        Boolean bool2 = null;
        ShippingAddressSource shippingAddressSource = null;
        AddressVerificationStatus addressVerificationStatus = null;
        String str2 = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        String str3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShippingAddress(str, l3, l4, bool2, shippingAddressSource, addressVerificationStatus, str2, (FullName) obj, (GlobalAddress) obj2, (Phone) obj3, str3, (DeliveryInstructions) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    l3 = ProtoAdapter.UINT64.decode(protoReader);
                    decode = str;
                    break;
                case 3:
                    l4 = ProtoAdapter.UINT64.decode(protoReader);
                    decode = str;
                    break;
                case 4:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str;
                    break;
                case 5:
                    l = l3;
                    l2 = l4;
                    bool = bool2;
                    try {
                        shippingAddressSource = ShippingAddressSource.ADAPTER.decode(protoReader);
                        l3 = l;
                        l4 = l2;
                        bool2 = bool;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    try {
                        addressVerificationStatus = AddressVerificationStatus.ADAPTER.decode(protoReader);
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        l = l3;
                        l2 = l4;
                        bool = bool2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 7:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 8:
                    obj = TransactorKt.decodeMessageOrMerge(FullName.ADAPTER, protoReader, obj);
                    decode = str;
                    break;
                case 9:
                    obj2 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj2);
                    decode = str;
                    break;
                case 10:
                    obj3 = TransactorKt.decodeMessageOrMerge(Phone.ADAPTER, protoReader, obj3);
                    decode = str;
                    break;
                case 11:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 12:
                    obj4 = TransactorKt.decodeMessageOrMerge(DeliveryInstructions.ADAPTER, protoReader, obj4);
                    decode = str;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    l = l3;
                    l2 = l4;
                    bool = bool2;
                    decode = str;
                    l3 = l;
                    l4 = l2;
                    bool2 = bool;
                    break;
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        reverseProtoWriter.getClass();
        shippingAddress.getClass();
        reverseProtoWriter.writeBytes(shippingAddress.unknownFields());
        DeliveryInstructions.ADAPTER.encodeWithTag(reverseProtoWriter, 12, shippingAddress.delivery_instructions);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, shippingAddress.email);
        Phone.ADAPTER.encodeWithTag(reverseProtoWriter, 10, shippingAddress.phone);
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 9, shippingAddress.global_address);
        FullName.ADAPTER.encodeWithTag(reverseProtoWriter, 8, shippingAddress.full_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, shippingAddress.nickname);
        AddressVerificationStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 6, shippingAddress.verification_status);
        ShippingAddressSource.ADAPTER.encodeWithTag(reverseProtoWriter, 5, shippingAddress.source);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, shippingAddress.is_default);
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, shippingAddress.updated_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, shippingAddress.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, shippingAddress.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        shippingAddress.getClass();
        int size$okio = shippingAddress.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, shippingAddress.id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
        return DeliveryInstructions.ADAPTER.encodedSizeWithTag(12, shippingAddress.delivery_instructions) + protoAdapter.encodedSizeWithTag(11, shippingAddress.email) + Phone.ADAPTER.encodedSizeWithTag(10, shippingAddress.phone) + GlobalAddress.ADAPTER.encodedSizeWithTag(9, shippingAddress.global_address) + FullName.ADAPTER.encodedSizeWithTag(8, shippingAddress.full_name) + protoAdapter.encodedSizeWithTag(7, shippingAddress.nickname) + AddressVerificationStatus.ADAPTER.encodedSizeWithTag(6, shippingAddress.verification_status) + ShippingAddressSource.ADAPTER.encodedSizeWithTag(5, shippingAddress.source) + ProtoAdapter.BOOL.encodedSizeWithTag(4, shippingAddress.is_default) + protoAdapter2.encodedSizeWithTag(3, shippingAddress.updated_at) + protoAdapter2.encodedSizeWithTag(2, shippingAddress.created_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        shippingAddress.getClass();
        Phone phone = shippingAddress.phone;
        Phone phone2 = phone != null ? (Phone) Phone.ADAPTER.redact(phone) : null;
        DeliveryInstructions deliveryInstructions = shippingAddress.delivery_instructions;
        DeliveryInstructions deliveryInstructions2 = deliveryInstructions != null ? (DeliveryInstructions) DeliveryInstructions.ADAPTER.redact(deliveryInstructions) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = shippingAddress.id;
        Long l = shippingAddress.created_at;
        Long l2 = shippingAddress.updated_at;
        Boolean bool = shippingAddress.is_default;
        ShippingAddressSource shippingAddressSource = shippingAddress.source;
        AddressVerificationStatus addressVerificationStatus = shippingAddress.verification_status;
        byteString.getClass();
        return new ShippingAddress(str, l, l2, bool, shippingAddressSource, addressVerificationStatus, null, null, null, phone2, null, deliveryInstructions2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        shippingAddress.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, shippingAddress.id);
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, shippingAddress.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 3, shippingAddress.updated_at);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, shippingAddress.is_default);
        ShippingAddressSource.ADAPTER.encodeWithTag(protoWriter, 5, shippingAddress.source);
        AddressVerificationStatus.ADAPTER.encodeWithTag(protoWriter, 6, shippingAddress.verification_status);
        protoAdapter.encodeWithTag(protoWriter, 7, shippingAddress.nickname);
        FullName.ADAPTER.encodeWithTag(protoWriter, 8, shippingAddress.full_name);
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 9, shippingAddress.global_address);
        Phone.ADAPTER.encodeWithTag(protoWriter, 10, shippingAddress.phone);
        protoAdapter.encodeWithTag(protoWriter, 11, shippingAddress.email);
        DeliveryInstructions.ADAPTER.encodeWithTag(protoWriter, 12, shippingAddress.delivery_instructions);
        protoWriter.writeBytes(shippingAddress.unknownFields());
    }
}
