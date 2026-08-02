package com.squareup.protos.cash.taply.model.v1;

import com.squareup.protos.cash.taply.model.v1.PaymentTokenDevice;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentTokenDevice$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PaymentTokenDevice((String) obj4, (Boolean) obj5, (String) obj6, (TokenProviderType) obj7, (PaymentTokenDevice.State) obj8, (PaymentTokenDeviceStateReason) obj9, (String) obj10, (Long) obj11, (Long) obj12, (String) obj13, (Boolean) obj14, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    try {
                        obj4 = obj;
                        obj7 = TokenProviderType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj5 = obj2;
                    obj6 = obj3;
                    break;
                case 5:
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    try {
                        obj4 = obj;
                        obj8 = PaymentTokenDevice.State.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                    obj5 = obj2;
                    obj6 = obj3;
                    break;
                case 6:
                    try {
                        obj9 = PaymentTokenDeviceStateReason.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        obj = obj4;
                        obj2 = obj5;
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 7:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj11 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 9:
                    obj12 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 10:
                    obj13 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    obj14 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    obj4 = obj;
                    obj5 = obj2;
                    obj6 = obj3;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentTokenDevice paymentTokenDevice = (PaymentTokenDevice) obj;
        reverseProtoWriter.getClass();
        paymentTokenDevice.getClass();
        reverseProtoWriter.writeBytes(paymentTokenDevice.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, paymentTokenDevice.sponsor_locked);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, paymentTokenDevice.display_name);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 9, paymentTokenDevice.updated_at);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 8, paymentTokenDevice.created_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, paymentTokenDevice.tag_theme_token);
        PaymentTokenDeviceStateReason.ADAPTER.encodeWithTag(reverseProtoWriter, 6, paymentTokenDevice.state_reason);
        PaymentTokenDevice.State.ADAPTER.encodeWithTag(reverseProtoWriter, 5, paymentTokenDevice.state);
        TokenProviderType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, paymentTokenDevice.token_provider_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, paymentTokenDevice.provider_device_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, paymentTokenDevice.locked);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, paymentTokenDevice.device_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentTokenDevice paymentTokenDevice = (PaymentTokenDevice) obj;
        paymentTokenDevice.getClass();
        int size$okio = paymentTokenDevice.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, paymentTokenDevice.device_id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(7, paymentTokenDevice.tag_theme_token) + PaymentTokenDeviceStateReason.ADAPTER.encodedSizeWithTag(6, paymentTokenDevice.state_reason) + PaymentTokenDevice.State.ADAPTER.encodedSizeWithTag(5, paymentTokenDevice.state) + TokenProviderType.ADAPTER.encodedSizeWithTag(4, paymentTokenDevice.token_provider_type) + protoAdapter.encodedSizeWithTag(3, paymentTokenDevice.provider_device_id) + protoAdapter2.encodedSizeWithTag(2, paymentTokenDevice.locked) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        return protoAdapter2.encodedSizeWithTag(11, paymentTokenDevice.sponsor_locked) + protoAdapter.encodedSizeWithTag(10, paymentTokenDevice.display_name) + protoAdapter3.encodedSizeWithTag(9, paymentTokenDevice.updated_at) + protoAdapter3.encodedSizeWithTag(8, paymentTokenDevice.created_at) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentTokenDevice paymentTokenDevice = (PaymentTokenDevice) obj;
        paymentTokenDevice.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = paymentTokenDevice.device_id;
        Boolean bool = paymentTokenDevice.locked;
        String str2 = paymentTokenDevice.provider_device_id;
        TokenProviderType tokenProviderType = paymentTokenDevice.token_provider_type;
        PaymentTokenDevice.State state = paymentTokenDevice.state;
        PaymentTokenDeviceStateReason paymentTokenDeviceStateReason = paymentTokenDevice.state_reason;
        String str3 = paymentTokenDevice.tag_theme_token;
        Long l = paymentTokenDevice.created_at;
        Long l2 = paymentTokenDevice.updated_at;
        String str4 = paymentTokenDevice.display_name;
        Boolean bool2 = paymentTokenDevice.sponsor_locked;
        byteString.getClass();
        return new PaymentTokenDevice(str, bool, str2, tokenProviderType, state, paymentTokenDeviceStateReason, str3, l, l2, str4, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentTokenDevice paymentTokenDevice = (PaymentTokenDevice) obj;
        paymentTokenDevice.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, paymentTokenDevice.device_id);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 2, paymentTokenDevice.locked);
        protoAdapter.encodeWithTag(protoWriter, 3, paymentTokenDevice.provider_device_id);
        TokenProviderType.ADAPTER.encodeWithTag(protoWriter, 4, paymentTokenDevice.token_provider_type);
        PaymentTokenDevice.State.ADAPTER.encodeWithTag(protoWriter, 5, paymentTokenDevice.state);
        PaymentTokenDeviceStateReason.ADAPTER.encodeWithTag(protoWriter, 6, paymentTokenDevice.state_reason);
        protoAdapter.encodeWithTag(protoWriter, 7, paymentTokenDevice.tag_theme_token);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 8, paymentTokenDevice.created_at);
        protoAdapter3.encodeWithTag(protoWriter, 9, paymentTokenDevice.updated_at);
        protoAdapter.encodeWithTag(protoWriter, 10, paymentTokenDevice.display_name);
        protoAdapter2.encodeWithTag(protoWriter, 11, paymentTokenDevice.sponsor_locked);
        protoWriter.writeBytes(paymentTokenDevice.unknownFields());
    }
}
