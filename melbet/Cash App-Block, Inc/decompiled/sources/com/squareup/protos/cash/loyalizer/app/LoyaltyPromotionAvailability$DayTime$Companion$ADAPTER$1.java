package com.squareup.protos.cash.loyalizer.app;

import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionAvailability;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LoyaltyPromotionAvailability$DayTime$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoyaltyPromotionAvailability.DayTime((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoyaltyPromotionAvailability.DayTime dayTime = (LoyaltyPromotionAvailability.DayTime) obj;
        reverseProtoWriter.getClass();
        dayTime.getClass();
        reverseProtoWriter.writeBytes(dayTime.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, dayTime.time_range);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, dayTime.day);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoyaltyPromotionAvailability.DayTime dayTime = (LoyaltyPromotionAvailability.DayTime) obj;
        dayTime.getClass();
        int size$okio = dayTime.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, dayTime.time_range) + protoAdapter.encodedSizeWithTag(1, dayTime.day) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoyaltyPromotionAvailability.DayTime dayTime = (LoyaltyPromotionAvailability.DayTime) obj;
        dayTime.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = dayTime.day;
        String str2 = dayTime.time_range;
        byteString.getClass();
        return new LoyaltyPromotionAvailability.DayTime(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoyaltyPromotionAvailability.DayTime dayTime = (LoyaltyPromotionAvailability.DayTime) obj;
        dayTime.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, dayTime.day);
        protoAdapter.encodeWithTag(protoWriter, 2, dayTime.time_range);
        protoWriter.writeBytes(dayTime.unknownFields());
    }
}
