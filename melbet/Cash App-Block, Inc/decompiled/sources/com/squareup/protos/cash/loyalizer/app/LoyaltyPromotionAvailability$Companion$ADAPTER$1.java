package com.squareup.protos.cash.loyalizer.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionAvailability;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LoyaltyPromotionAvailability$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoyaltyPromotionAvailability((String) obj, m, (LoyaltyPromotionAvailability.Alignment) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(LoyaltyPromotionAvailability.DayTime.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = LoyaltyPromotionAvailability.Alignment.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoyaltyPromotionAvailability loyaltyPromotionAvailability = (LoyaltyPromotionAvailability) obj;
        reverseProtoWriter.getClass();
        loyaltyPromotionAvailability.getClass();
        reverseProtoWriter.writeBytes(loyaltyPromotionAvailability.unknownFields());
        LoyaltyPromotionAvailability.Alignment.ADAPTER.encodeWithTag(reverseProtoWriter, 3, loyaltyPromotionAvailability.alignment);
        LoyaltyPromotionAvailability.DayTime.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, loyaltyPromotionAvailability.day_time);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, loyaltyPromotionAvailability.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoyaltyPromotionAvailability loyaltyPromotionAvailability = (LoyaltyPromotionAvailability) obj;
        loyaltyPromotionAvailability.getClass();
        return LoyaltyPromotionAvailability.Alignment.ADAPTER.encodedSizeWithTag(3, loyaltyPromotionAvailability.alignment) + LoyaltyPromotionAvailability.DayTime.ADAPTER.asRepeated().encodedSizeWithTag(2, loyaltyPromotionAvailability.day_time) + ProtoAdapter.STRING.encodedSizeWithTag(1, loyaltyPromotionAvailability.title) + loyaltyPromotionAvailability.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoyaltyPromotionAvailability loyaltyPromotionAvailability = (LoyaltyPromotionAvailability) obj;
        loyaltyPromotionAvailability.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(loyaltyPromotionAvailability.day_time, LoyaltyPromotionAvailability.DayTime.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = loyaltyPromotionAvailability.title;
        LoyaltyPromotionAvailability.Alignment alignment = loyaltyPromotionAvailability.alignment;
        byteString.getClass();
        return new LoyaltyPromotionAvailability(str, m1169redactElements, alignment, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoyaltyPromotionAvailability loyaltyPromotionAvailability = (LoyaltyPromotionAvailability) obj;
        loyaltyPromotionAvailability.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, loyaltyPromotionAvailability.title);
        LoyaltyPromotionAvailability.DayTime.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, loyaltyPromotionAvailability.day_time);
        LoyaltyPromotionAvailability.Alignment.ADAPTER.encodeWithTag(protoWriter, 3, loyaltyPromotionAvailability.alignment);
        protoWriter.writeBytes(loyaltyPromotionAvailability.unknownFields());
    }
}
