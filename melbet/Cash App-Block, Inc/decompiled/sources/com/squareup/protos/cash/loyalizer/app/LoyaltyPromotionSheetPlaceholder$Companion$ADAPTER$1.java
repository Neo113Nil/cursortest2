package com.squareup.protos.cash.loyalizer.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionSheetPlaceholder;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LoyaltyPromotionSheetPlaceholder$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoyaltyPromotionSheetPlaceholder((LoyaltyPromotionAvailability) obj, (LoyaltyPromotionSheetPlaceholder.LocationData) obj2, (AnalyticsEvent) obj3, (Color) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LoyaltyPromotionAvailability.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LoyaltyPromotionSheetPlaceholder.LocationData.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoyaltyPromotionSheetPlaceholder loyaltyPromotionSheetPlaceholder = (LoyaltyPromotionSheetPlaceholder) obj;
        reverseProtoWriter.getClass();
        loyaltyPromotionSheetPlaceholder.getClass();
        reverseProtoWriter.writeBytes(loyaltyPromotionSheetPlaceholder.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, loyaltyPromotionSheetPlaceholder.background_color);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 3, loyaltyPromotionSheetPlaceholder.dismiss_event);
        LoyaltyPromotionSheetPlaceholder.LocationData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, loyaltyPromotionSheetPlaceholder.locations);
        LoyaltyPromotionAvailability.ADAPTER.encodeWithTag(reverseProtoWriter, 1, loyaltyPromotionSheetPlaceholder.available_time);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoyaltyPromotionSheetPlaceholder loyaltyPromotionSheetPlaceholder = (LoyaltyPromotionSheetPlaceholder) obj;
        loyaltyPromotionSheetPlaceholder.getClass();
        return Color.ADAPTER.encodedSizeWithTag(4, loyaltyPromotionSheetPlaceholder.background_color) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(3, loyaltyPromotionSheetPlaceholder.dismiss_event) + LoyaltyPromotionSheetPlaceholder.LocationData.ADAPTER.encodedSizeWithTag(2, loyaltyPromotionSheetPlaceholder.locations) + LoyaltyPromotionAvailability.ADAPTER.encodedSizeWithTag(1, loyaltyPromotionSheetPlaceholder.available_time) + loyaltyPromotionSheetPlaceholder.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoyaltyPromotionSheetPlaceholder loyaltyPromotionSheetPlaceholder = (LoyaltyPromotionSheetPlaceholder) obj;
        loyaltyPromotionSheetPlaceholder.getClass();
        LoyaltyPromotionAvailability loyaltyPromotionAvailability = loyaltyPromotionSheetPlaceholder.available_time;
        LoyaltyPromotionAvailability loyaltyPromotionAvailability2 = loyaltyPromotionAvailability != null ? (LoyaltyPromotionAvailability) LoyaltyPromotionAvailability.ADAPTER.redact(loyaltyPromotionAvailability) : null;
        LoyaltyPromotionSheetPlaceholder.LocationData locationData = loyaltyPromotionSheetPlaceholder.locations;
        LoyaltyPromotionSheetPlaceholder.LocationData locationData2 = locationData != null ? (LoyaltyPromotionSheetPlaceholder.LocationData) LoyaltyPromotionSheetPlaceholder.LocationData.ADAPTER.redact(locationData) : null;
        AnalyticsEvent analyticsEvent = loyaltyPromotionSheetPlaceholder.dismiss_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        Color color = loyaltyPromotionSheetPlaceholder.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LoyaltyPromotionSheetPlaceholder(loyaltyPromotionAvailability2, locationData2, analyticsEvent2, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoyaltyPromotionSheetPlaceholder loyaltyPromotionSheetPlaceholder = (LoyaltyPromotionSheetPlaceholder) obj;
        loyaltyPromotionSheetPlaceholder.getClass();
        LoyaltyPromotionAvailability.ADAPTER.encodeWithTag(protoWriter, 1, loyaltyPromotionSheetPlaceholder.available_time);
        LoyaltyPromotionSheetPlaceholder.LocationData.ADAPTER.encodeWithTag(protoWriter, 2, loyaltyPromotionSheetPlaceholder.locations);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 3, loyaltyPromotionSheetPlaceholder.dismiss_event);
        Color.ADAPTER.encodeWithTag(protoWriter, 4, loyaltyPromotionSheetPlaceholder.background_color);
        protoWriter.writeBytes(loyaltyPromotionSheetPlaceholder.unknownFields());
    }
}
