package com.squareup.protos.cash.loyalizer.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData((String) obj, (String) obj2, (String) obj3, m, (AnalyticsEvent) obj4, (AnalyticsEvent) obj5, (Action) obj6, (AnalyticsEvent) obj7, (Color) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    m.add(LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj5);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj6);
                    break;
                case 8:
                    obj7 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj7);
                    break;
                case 9:
                    obj8 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData loyaltyPromotionData = (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData) obj;
        reverseProtoWriter.getClass();
        loyaltyPromotionData.getClass();
        reverseProtoWriter.writeBytes(loyaltyPromotionData.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 9, loyaltyPromotionData.icon_color);
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, loyaltyPromotionData.view_event);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 7, loyaltyPromotionData.tap);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, loyaltyPromotionData.dismiss_event);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, loyaltyPromotionData.tap_event);
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, loyaltyPromotionData.section);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, loyaltyPromotionData.title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, loyaltyPromotionData.icon_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, loyaltyPromotionData.benefit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData loyaltyPromotionData = (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData) obj;
        loyaltyPromotionData.getClass();
        int size$okio = loyaltyPromotionData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section.ADAPTER.asRepeated().encodedSizeWithTag(4, loyaltyPromotionData.section) + protoAdapter.encodedSizeWithTag(3, loyaltyPromotionData.title) + protoAdapter.encodedSizeWithTag(2, loyaltyPromotionData.icon_url) + protoAdapter.encodedSizeWithTag(1, loyaltyPromotionData.benefit) + size$okio;
        ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
        return Color.ADAPTER.encodedSizeWithTag(9, loyaltyPromotionData.icon_color) + protoAdapter2.encodedSizeWithTag(8, loyaltyPromotionData.view_event) + Action.ADAPTER.encodedSizeWithTag(7, loyaltyPromotionData.tap) + protoAdapter2.encodedSizeWithTag(6, loyaltyPromotionData.dismiss_event) + protoAdapter2.encodedSizeWithTag(5, loyaltyPromotionData.tap_event) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData loyaltyPromotionData = (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData) obj;
        loyaltyPromotionData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(loyaltyPromotionData.section, LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section.ADAPTER);
        AnalyticsEvent analyticsEvent = loyaltyPromotionData.tap_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        AnalyticsEvent analyticsEvent3 = loyaltyPromotionData.dismiss_event;
        AnalyticsEvent analyticsEvent4 = analyticsEvent3 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent3) : null;
        Action action = loyaltyPromotionData.tap;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        AnalyticsEvent analyticsEvent5 = loyaltyPromotionData.view_event;
        AnalyticsEvent analyticsEvent6 = analyticsEvent5 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent5) : null;
        Color color = loyaltyPromotionData.icon_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = loyaltyPromotionData.benefit;
        String str2 = loyaltyPromotionData.icon_url;
        String str3 = loyaltyPromotionData.title;
        byteString.getClass();
        return new LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData(str, str2, str3, m1169redactElements, analyticsEvent2, analyticsEvent4, action2, analyticsEvent6, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData loyaltyPromotionData = (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData) obj;
        loyaltyPromotionData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, loyaltyPromotionData.benefit);
        protoAdapter.encodeWithTag(protoWriter, 2, loyaltyPromotionData.icon_url);
        protoAdapter.encodeWithTag(protoWriter, 3, loyaltyPromotionData.title);
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, loyaltyPromotionData.section);
        ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, loyaltyPromotionData.tap_event);
        protoAdapter2.encodeWithTag(protoWriter, 6, loyaltyPromotionData.dismiss_event);
        Action.ADAPTER.encodeWithTag(protoWriter, 7, loyaltyPromotionData.tap);
        protoAdapter2.encodeWithTag(protoWriter, 8, loyaltyPromotionData.view_event);
        Color.ADAPTER.encodeWithTag(protoWriter, 9, loyaltyPromotionData.icon_color);
        protoWriter.writeBytes(loyaltyPromotionData.unknownFields());
    }
}
