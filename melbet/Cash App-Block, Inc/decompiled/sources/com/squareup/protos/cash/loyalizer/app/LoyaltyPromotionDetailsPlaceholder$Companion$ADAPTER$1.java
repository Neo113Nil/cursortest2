package com.squareup.protos.cash.loyalizer.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LoyaltyPromotionDetailsPlaceholder$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoyaltyPromotionDetailsPlaceholder(m, (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoyaltyPromotionDetailsPlaceholder loyaltyPromotionDetailsPlaceholder = (LoyaltyPromotionDetailsPlaceholder) obj;
        reverseProtoWriter.getClass();
        loyaltyPromotionDetailsPlaceholder.getClass();
        reverseProtoWriter.writeBytes(loyaltyPromotionDetailsPlaceholder.unknownFields());
        ProtoAdapter protoAdapter = LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, loyaltyPromotionDetailsPlaceholder.promotion);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, loyaltyPromotionDetailsPlaceholder.loyalty_promotion);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoyaltyPromotionDetailsPlaceholder loyaltyPromotionDetailsPlaceholder = (LoyaltyPromotionDetailsPlaceholder) obj;
        loyaltyPromotionDetailsPlaceholder.getClass();
        int size$okio = loyaltyPromotionDetailsPlaceholder.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, loyaltyPromotionDetailsPlaceholder.promotion) + protoAdapter.asRepeated().encodedSizeWithTag(1, loyaltyPromotionDetailsPlaceholder.loyalty_promotion) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoyaltyPromotionDetailsPlaceholder loyaltyPromotionDetailsPlaceholder = (LoyaltyPromotionDetailsPlaceholder) obj;
        loyaltyPromotionDetailsPlaceholder.getClass();
        List list = loyaltyPromotionDetailsPlaceholder.loyalty_promotion;
        ProtoAdapter protoAdapter = LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData loyaltyPromotionData = loyaltyPromotionDetailsPlaceholder.promotion;
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData loyaltyPromotionData2 = loyaltyPromotionData != null ? (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData) protoAdapter.redact(loyaltyPromotionData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LoyaltyPromotionDetailsPlaceholder(m1169redactElements, loyaltyPromotionData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoyaltyPromotionDetailsPlaceholder loyaltyPromotionDetailsPlaceholder = (LoyaltyPromotionDetailsPlaceholder) obj;
        loyaltyPromotionDetailsPlaceholder.getClass();
        ProtoAdapter protoAdapter = LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, loyaltyPromotionDetailsPlaceholder.loyalty_promotion);
        protoAdapter.encodeWithTag(protoWriter, 2, loyaltyPromotionDetailsPlaceholder.promotion);
        protoWriter.writeBytes(loyaltyPromotionDetailsPlaceholder.unknownFields());
    }
}
