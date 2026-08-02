package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShippingRate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShippingRate((String) obj, (String) obj2, (LocalMoney) obj3, (String) obj4, (ShippingCarrier) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj5 = ShippingCarrier.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShippingRate shippingRate = (ShippingRate) obj;
        reverseProtoWriter.getClass();
        shippingRate.getClass();
        reverseProtoWriter.writeBytes(shippingRate.unknownFields());
        ShippingCarrier.ADAPTER.encodeWithTag(reverseProtoWriter, 5, shippingRate.carrier);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, shippingRate.sub_label);
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 3, shippingRate.total_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, shippingRate.label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, shippingRate.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShippingRate shippingRate = (ShippingRate) obj;
        shippingRate.getClass();
        int size$okio = shippingRate.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ShippingCarrier.ADAPTER.encodedSizeWithTag(5, shippingRate.carrier) + protoAdapter.encodedSizeWithTag(4, shippingRate.sub_label) + LocalMoney.ADAPTER.encodedSizeWithTag(3, shippingRate.total_amount) + protoAdapter.encodedSizeWithTag(2, shippingRate.label) + protoAdapter.encodedSizeWithTag(1, shippingRate.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShippingRate shippingRate = (ShippingRate) obj;
        shippingRate.getClass();
        LocalMoney localMoney = shippingRate.total_amount;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = shippingRate.token;
        String str2 = shippingRate.label;
        String str3 = shippingRate.sub_label;
        ShippingCarrier shippingCarrier = shippingRate.carrier;
        byteString.getClass();
        return new ShippingRate(str, str2, localMoney2, str3, shippingCarrier, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShippingRate shippingRate = (ShippingRate) obj;
        shippingRate.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, shippingRate.token);
        protoAdapter.encodeWithTag(protoWriter, 2, shippingRate.label);
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 3, shippingRate.total_amount);
        protoAdapter.encodeWithTag(protoWriter, 4, shippingRate.sub_label);
        ShippingCarrier.ADAPTER.encodeWithTag(protoWriter, 5, shippingRate.carrier);
        protoWriter.writeBytes(shippingRate.unknownFields());
    }
}
