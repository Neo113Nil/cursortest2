package com.squareup.protos.cash.loyalizer.app;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionSheetPlaceholder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LoyaltyPromotionSheetPlaceholder$LocationData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoyaltyPromotionSheetPlaceholder.LocationData((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoyaltyPromotionSheetPlaceholder.LocationData locationData = (LoyaltyPromotionSheetPlaceholder.LocationData) obj;
        reverseProtoWriter.getClass();
        locationData.getClass();
        reverseProtoWriter.writeBytes(locationData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, locationData.locations);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, locationData.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoyaltyPromotionSheetPlaceholder.LocationData locationData = (LoyaltyPromotionSheetPlaceholder.LocationData) obj;
        locationData.getClass();
        int size$okio = locationData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, locationData.locations) + protoAdapter.encodedSizeWithTag(1, locationData.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoyaltyPromotionSheetPlaceholder.LocationData locationData = (LoyaltyPromotionSheetPlaceholder.LocationData) obj;
        locationData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = locationData.title;
        List list = locationData.locations;
        list.getClass();
        byteString.getClass();
        return new LoyaltyPromotionSheetPlaceholder.LocationData(str, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoyaltyPromotionSheetPlaceholder.LocationData locationData = (LoyaltyPromotionSheetPlaceholder.LocationData) obj;
        locationData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, locationData.title);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, locationData.locations);
        protoWriter.writeBytes(locationData.unknownFields());
    }
}
