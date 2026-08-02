package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.POSLocalCashRedemption;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class POSLocalCashRedemption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
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
                return new POSLocalCashRedemption((String) obj, (String) obj2, (String) obj3, (LocalMiniCard) obj4, (LocalColor) obj5, (String) obj6, m, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalMiniCard.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    m.add(POSLocalCashRedemption.Coupon.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        POSLocalCashRedemption pOSLocalCashRedemption = (POSLocalCashRedemption) obj;
        reverseProtoWriter.getClass();
        pOSLocalCashRedemption.getClass();
        reverseProtoWriter.writeBytes(pOSLocalCashRedemption.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, pOSLocalCashRedemption.check_in_token);
        POSLocalCashRedemption.Coupon.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, pOSLocalCashRedemption.coupons);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, pOSLocalCashRedemption.cashtag);
        LocalColor.ADAPTER.encodeWithTag(reverseProtoWriter, 5, pOSLocalCashRedemption.foreground_color);
        LocalMiniCard.ADAPTER.encodeWithTag(reverseProtoWriter, 4, pOSLocalCashRedemption.mini_card);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, pOSLocalCashRedemption.brand_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, pOSLocalCashRedemption.location_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, pOSLocalCashRedemption.transaction_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        POSLocalCashRedemption pOSLocalCashRedemption = (POSLocalCashRedemption) obj;
        pOSLocalCashRedemption.getClass();
        int size$okio = pOSLocalCashRedemption.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(8, pOSLocalCashRedemption.check_in_token) + POSLocalCashRedemption.Coupon.ADAPTER.asRepeated().encodedSizeWithTag(7, pOSLocalCashRedemption.coupons) + protoAdapter.encodedSizeWithTag(6, pOSLocalCashRedemption.cashtag) + LocalColor.ADAPTER.encodedSizeWithTag(5, pOSLocalCashRedemption.foreground_color) + LocalMiniCard.ADAPTER.encodedSizeWithTag(4, pOSLocalCashRedemption.mini_card) + protoAdapter.encodedSizeWithTag(3, pOSLocalCashRedemption.brand_name) + protoAdapter.encodedSizeWithTag(2, pOSLocalCashRedemption.location_token) + protoAdapter.encodedSizeWithTag(1, pOSLocalCashRedemption.transaction_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        POSLocalCashRedemption pOSLocalCashRedemption = (POSLocalCashRedemption) obj;
        pOSLocalCashRedemption.getClass();
        LocalMiniCard localMiniCard = pOSLocalCashRedemption.mini_card;
        LocalMiniCard localMiniCard2 = localMiniCard != null ? (LocalMiniCard) LocalMiniCard.ADAPTER.redact(localMiniCard) : null;
        LocalColor localColor = pOSLocalCashRedemption.foreground_color;
        LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(pOSLocalCashRedemption.coupons, POSLocalCashRedemption.Coupon.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = pOSLocalCashRedemption.transaction_id;
        String str2 = pOSLocalCashRedemption.location_token;
        String str3 = pOSLocalCashRedemption.brand_name;
        String str4 = pOSLocalCashRedemption.check_in_token;
        byteString.getClass();
        return new POSLocalCashRedemption(str, str2, str3, localMiniCard2, localColor2, null, m1169redactElements, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        POSLocalCashRedemption pOSLocalCashRedemption = (POSLocalCashRedemption) obj;
        pOSLocalCashRedemption.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, pOSLocalCashRedemption.transaction_id);
        protoAdapter.encodeWithTag(protoWriter, 2, pOSLocalCashRedemption.location_token);
        protoAdapter.encodeWithTag(protoWriter, 3, pOSLocalCashRedemption.brand_name);
        LocalMiniCard.ADAPTER.encodeWithTag(protoWriter, 4, pOSLocalCashRedemption.mini_card);
        LocalColor.ADAPTER.encodeWithTag(protoWriter, 5, pOSLocalCashRedemption.foreground_color);
        protoAdapter.encodeWithTag(protoWriter, 6, pOSLocalCashRedemption.cashtag);
        POSLocalCashRedemption.Coupon.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, pOSLocalCashRedemption.coupons);
        protoAdapter.encodeWithTag(protoWriter, 8, pOSLocalCashRedemption.check_in_token);
        protoWriter.writeBytes(pOSLocalCashRedemption.unknownFields());
    }
}
