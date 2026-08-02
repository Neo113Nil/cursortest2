package com.squareup.protos.cash.referly.api.incentives.client;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PromotionsHomeData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PromotionsHomeData((String) obj, (String) obj2, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(ActivePromotion.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(AvailablePromotion.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PromotionsHomeData promotionsHomeData = (PromotionsHomeData) obj;
        reverseProtoWriter.getClass();
        promotionsHomeData.getClass();
        reverseProtoWriter.writeBytes(promotionsHomeData.unknownFields());
        AvailablePromotion.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, promotionsHomeData.available_promotions);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, promotionsHomeData.available_promotions_section_title);
        ActivePromotion.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, promotionsHomeData.active_promotions);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, promotionsHomeData.active_promotions_section_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PromotionsHomeData promotionsHomeData = (PromotionsHomeData) obj;
        promotionsHomeData.getClass();
        int size$okio = promotionsHomeData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return AvailablePromotion.ADAPTER.asRepeated().encodedSizeWithTag(4, promotionsHomeData.available_promotions) + protoAdapter.encodedSizeWithTag(3, promotionsHomeData.available_promotions_section_title) + ActivePromotion.ADAPTER.asRepeated().encodedSizeWithTag(2, promotionsHomeData.active_promotions) + protoAdapter.encodedSizeWithTag(1, promotionsHomeData.active_promotions_section_title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PromotionsHomeData promotionsHomeData = (PromotionsHomeData) obj;
        promotionsHomeData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(promotionsHomeData.active_promotions, ActivePromotion.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(promotionsHomeData.available_promotions, AvailablePromotion.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = promotionsHomeData.active_promotions_section_title;
        String str2 = promotionsHomeData.available_promotions_section_title;
        byteString.getClass();
        return new PromotionsHomeData(str, str2, m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PromotionsHomeData promotionsHomeData = (PromotionsHomeData) obj;
        promotionsHomeData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, promotionsHomeData.active_promotions_section_title);
        ActivePromotion.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, promotionsHomeData.active_promotions);
        protoAdapter.encodeWithTag(protoWriter, 3, promotionsHomeData.available_promotions_section_title);
        AvailablePromotion.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, promotionsHomeData.available_promotions);
        protoWriter.writeBytes(promotionsHomeData.unknownFields());
    }
}
