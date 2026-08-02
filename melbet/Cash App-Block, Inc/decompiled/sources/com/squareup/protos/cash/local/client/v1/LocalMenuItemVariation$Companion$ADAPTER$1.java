package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemVariation;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItemVariation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItemVariation((String) obj, (String) obj2, (LocalMoney) obj3, (LocalMenuItemDeal) obj4, (LocalMenuAvailability) obj5, m, arrayList, (LocalMenuItemVariation.ReservationVariationData) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalMenuItemDeal.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    try {
                        obj5 = LocalMenuAvailability.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 7:
                    try {
                        LocalMenuItemVariation.LocalMenuItemVariationFeature.ADAPTER.tryDecode(protoReader, arrayList);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalMenuItemVariation.ReservationVariationData.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItemVariation localMenuItemVariation = (LocalMenuItemVariation) obj;
        reverseProtoWriter.getClass();
        localMenuItemVariation.getClass();
        reverseProtoWriter.writeBytes(localMenuItemVariation.unknownFields());
        LocalMenuItemVariation.ReservationVariationData.ADAPTER.encodeWithTag(reverseProtoWriter, 8, localMenuItemVariation.reservation_variation_data);
        LocalMenuItemVariation.LocalMenuItemVariationFeature.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, localMenuItemVariation.features);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 6, localMenuItemVariation.option_value_tokens);
        LocalMenuAvailability.ADAPTER.encodeWithTag(reverseProtoWriter, 5, localMenuItemVariation.availability);
        LocalMenuItemDeal.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localMenuItemVariation.deal);
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localMenuItemVariation.price);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localMenuItemVariation.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localMenuItemVariation.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItemVariation localMenuItemVariation = (LocalMenuItemVariation) obj;
        localMenuItemVariation.getClass();
        int size$okio = localMenuItemVariation.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalMenuItemVariation.ReservationVariationData.ADAPTER.encodedSizeWithTag(8, localMenuItemVariation.reservation_variation_data) + LocalMenuItemVariation.LocalMenuItemVariationFeature.ADAPTER.asRepeated().encodedSizeWithTag(7, localMenuItemVariation.features) + protoAdapter.asRepeated().encodedSizeWithTag(6, localMenuItemVariation.option_value_tokens) + LocalMenuAvailability.ADAPTER.encodedSizeWithTag(5, localMenuItemVariation.availability) + LocalMenuItemDeal.ADAPTER.encodedSizeWithTag(4, localMenuItemVariation.deal) + LocalMoney.ADAPTER.encodedSizeWithTag(3, localMenuItemVariation.price) + protoAdapter.encodedSizeWithTag(2, localMenuItemVariation.name) + protoAdapter.encodedSizeWithTag(1, localMenuItemVariation.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItemVariation localMenuItemVariation = (LocalMenuItemVariation) obj;
        localMenuItemVariation.getClass();
        LocalMoney localMoney = localMenuItemVariation.price;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        LocalMenuItemDeal localMenuItemDeal = localMenuItemVariation.deal;
        LocalMenuItemDeal localMenuItemDeal2 = localMenuItemDeal != null ? (LocalMenuItemDeal) LocalMenuItemDeal.ADAPTER.redact(localMenuItemDeal) : null;
        LocalMenuItemVariation.ReservationVariationData reservationVariationData = localMenuItemVariation.reservation_variation_data;
        LocalMenuItemVariation.ReservationVariationData reservationVariationData2 = reservationVariationData != null ? (LocalMenuItemVariation.ReservationVariationData) LocalMenuItemVariation.ReservationVariationData.ADAPTER.redact(reservationVariationData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localMenuItemVariation.token;
        String str2 = localMenuItemVariation.name;
        LocalMenuAvailability localMenuAvailability = localMenuItemVariation.availability;
        List list = localMenuItemVariation.option_value_tokens;
        List list2 = localMenuItemVariation.features;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new LocalMenuItemVariation(str, str2, localMoney2, localMenuItemDeal2, localMenuAvailability, list, list2, reservationVariationData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItemVariation localMenuItemVariation = (LocalMenuItemVariation) obj;
        localMenuItemVariation.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localMenuItemVariation.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localMenuItemVariation.name);
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 3, localMenuItemVariation.price);
        LocalMenuItemDeal.ADAPTER.encodeWithTag(protoWriter, 4, localMenuItemVariation.deal);
        LocalMenuAvailability.ADAPTER.encodeWithTag(protoWriter, 5, localMenuItemVariation.availability);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 6, localMenuItemVariation.option_value_tokens);
        LocalMenuItemVariation.LocalMenuItemVariationFeature.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, localMenuItemVariation.features);
        LocalMenuItemVariation.ReservationVariationData.ADAPTER.encodeWithTag(protoWriter, 8, localMenuItemVariation.reservation_variation_data);
        protoWriter.writeBytes(localMenuItemVariation.unknownFields());
    }
}
