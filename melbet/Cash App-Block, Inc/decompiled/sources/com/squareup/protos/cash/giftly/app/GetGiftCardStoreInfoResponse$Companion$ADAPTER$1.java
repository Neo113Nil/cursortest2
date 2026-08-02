package com.squareup.protos.cash.giftly.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetGiftCardStoreInfoResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetGiftCardStoreInfoResponse(m, arrayList, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GiftCardType.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(GiftCardCategory.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList2.add(GiftCardStoreUpsell.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetGiftCardStoreInfoResponse getGiftCardStoreInfoResponse = (GetGiftCardStoreInfoResponse) obj;
        reverseProtoWriter.getClass();
        getGiftCardStoreInfoResponse.getClass();
        reverseProtoWriter.writeBytes(getGiftCardStoreInfoResponse.unknownFields());
        GiftCardStoreUpsell.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, getGiftCardStoreInfoResponse.gift_card_upsells);
        GiftCardCategory.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getGiftCardStoreInfoResponse.gift_card_categories);
        GiftCardType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getGiftCardStoreInfoResponse.gift_card_types);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetGiftCardStoreInfoResponse getGiftCardStoreInfoResponse = (GetGiftCardStoreInfoResponse) obj;
        getGiftCardStoreInfoResponse.getClass();
        return GiftCardStoreUpsell.ADAPTER.asRepeated().encodedSizeWithTag(3, getGiftCardStoreInfoResponse.gift_card_upsells) + GiftCardCategory.ADAPTER.asRepeated().encodedSizeWithTag(2, getGiftCardStoreInfoResponse.gift_card_categories) + GiftCardType.ADAPTER.asRepeated().encodedSizeWithTag(1, getGiftCardStoreInfoResponse.gift_card_types) + getGiftCardStoreInfoResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetGiftCardStoreInfoResponse getGiftCardStoreInfoResponse = (GetGiftCardStoreInfoResponse) obj;
        getGiftCardStoreInfoResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getGiftCardStoreInfoResponse.gift_card_types, GiftCardType.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getGiftCardStoreInfoResponse.gift_card_categories, GiftCardCategory.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(getGiftCardStoreInfoResponse.gift_card_upsells, GiftCardStoreUpsell.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetGiftCardStoreInfoResponse(m1169redactElements, m1169redactElements2, m1169redactElements3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetGiftCardStoreInfoResponse getGiftCardStoreInfoResponse = (GetGiftCardStoreInfoResponse) obj;
        getGiftCardStoreInfoResponse.getClass();
        GiftCardType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getGiftCardStoreInfoResponse.gift_card_types);
        GiftCardCategory.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getGiftCardStoreInfoResponse.gift_card_categories);
        GiftCardStoreUpsell.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getGiftCardStoreInfoResponse.gift_card_upsells);
        protoWriter.writeBytes(getGiftCardStoreInfoResponse.unknownFields());
    }
}
