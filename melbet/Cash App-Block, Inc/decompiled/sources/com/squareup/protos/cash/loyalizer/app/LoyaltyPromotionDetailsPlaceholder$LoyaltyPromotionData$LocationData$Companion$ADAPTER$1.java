package com.squareup.protos.cash.loyalizer.app;

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
public final class LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$LocationData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData locationData = (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData) obj;
        reverseProtoWriter.getClass();
        locationData.getClass();
        reverseProtoWriter.writeBytes(locationData.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, locationData.locations);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData locationData = (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData) obj;
        locationData.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, locationData.locations) + locationData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData locationData = (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData) obj;
        locationData.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = locationData.locations;
        list.getClass();
        byteString.getClass();
        return new LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData locationData = (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData) obj;
        locationData.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, locationData.locations);
        protoWriter.writeBytes(locationData.unknownFields());
    }
}
