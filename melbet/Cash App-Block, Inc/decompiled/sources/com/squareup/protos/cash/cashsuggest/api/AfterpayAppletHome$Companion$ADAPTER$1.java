package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Footer;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayAppletHome$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletHome((LocalizedString) obj, (TappableIcon) obj2, m, (Footer) obj3, (AnalyticsEvent) obj4, (RetroOrderSelectionResponse) obj5, (AfterpayAppletPurchaseHistoryResponse) obj6, (AfterpayAppletHome.OnDisplayMessage) obj7, (Experiments) obj8, (AfterpayAppletActivityResponse) obj9, (AfterpayAppletActivityHistoryResponse) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    m.add(AfterpayAppletHomeSection.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Footer.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(RetroOrderSelectionResponse.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(AfterpayAppletPurchaseHistoryResponse.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj2 = TransactorKt.decodeMessageOrMerge(TappableIcon.ADAPTER, protoReader, obj2);
                    break;
                case 8:
                    obj7 = TransactorKt.decodeMessageOrMerge(AfterpayAppletHome.OnDisplayMessage.ADAPTER, protoReader, obj7);
                    break;
                case 9:
                    obj8 = TransactorKt.decodeMessageOrMerge(Experiments.ADAPTER, protoReader, obj8);
                    break;
                case 10:
                    obj9 = TransactorKt.decodeMessageOrMerge(AfterpayAppletActivityResponse.ADAPTER, protoReader, obj9);
                    break;
                case 11:
                    obj10 = TransactorKt.decodeMessageOrMerge(AfterpayAppletActivityHistoryResponse.ADAPTER, protoReader, obj10);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletHome afterpayAppletHome = (AfterpayAppletHome) obj;
        reverseProtoWriter.getClass();
        afterpayAppletHome.getClass();
        reverseProtoWriter.writeBytes(afterpayAppletHome.unknownFields());
        AfterpayAppletActivityHistoryResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 11, afterpayAppletHome.activity_history_preload);
        AfterpayAppletActivityResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 10, afterpayAppletHome.activity_preload);
        Experiments.ADAPTER.encodeWithTag(reverseProtoWriter, 9, afterpayAppletHome.experiments);
        AfterpayAppletHome.OnDisplayMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 8, afterpayAppletHome.on_display_message);
        AfterpayAppletPurchaseHistoryResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 6, afterpayAppletHome.purchase_history_preload);
        RetroOrderSelectionResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 5, afterpayAppletHome.retro_selection_preload);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 4, afterpayAppletHome.analytic_view_event);
        Footer.ADAPTER.encodeWithTag(reverseProtoWriter, 3, afterpayAppletHome.footer);
        AfterpayAppletHomeSection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, afterpayAppletHome.sections);
        TappableIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 7, afterpayAppletHome.header_tappable_info);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, afterpayAppletHome.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletHome afterpayAppletHome = (AfterpayAppletHome) obj;
        afterpayAppletHome.getClass();
        return AfterpayAppletActivityHistoryResponse.ADAPTER.encodedSizeWithTag(11, afterpayAppletHome.activity_history_preload) + AfterpayAppletActivityResponse.ADAPTER.encodedSizeWithTag(10, afterpayAppletHome.activity_preload) + Experiments.ADAPTER.encodedSizeWithTag(9, afterpayAppletHome.experiments) + AfterpayAppletHome.OnDisplayMessage.ADAPTER.encodedSizeWithTag(8, afterpayAppletHome.on_display_message) + AfterpayAppletPurchaseHistoryResponse.ADAPTER.encodedSizeWithTag(6, afterpayAppletHome.purchase_history_preload) + RetroOrderSelectionResponse.ADAPTER.encodedSizeWithTag(5, afterpayAppletHome.retro_selection_preload) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(4, afterpayAppletHome.analytic_view_event) + Footer.ADAPTER.encodedSizeWithTag(3, afterpayAppletHome.footer) + AfterpayAppletHomeSection.ADAPTER.asRepeated().encodedSizeWithTag(2, afterpayAppletHome.sections) + TappableIcon.ADAPTER.encodedSizeWithTag(7, afterpayAppletHome.header_tappable_info) + LocalizedString.ADAPTER.encodedSizeWithTag(1, afterpayAppletHome.title) + afterpayAppletHome.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletHome afterpayAppletHome = (AfterpayAppletHome) obj;
        afterpayAppletHome.getClass();
        LocalizedString localizedString = afterpayAppletHome.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        TappableIcon tappableIcon = afterpayAppletHome.header_tappable_info;
        TappableIcon tappableIcon2 = tappableIcon != null ? (TappableIcon) TappableIcon.ADAPTER.redact(tappableIcon) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(afterpayAppletHome.sections, AfterpayAppletHomeSection.ADAPTER);
        Footer footer = afterpayAppletHome.footer;
        Footer footer2 = footer != null ? (Footer) Footer.ADAPTER.redact(footer) : null;
        AnalyticsEvent analyticsEvent = afterpayAppletHome.analytic_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        RetroOrderSelectionResponse retroOrderSelectionResponse = afterpayAppletHome.retro_selection_preload;
        RetroOrderSelectionResponse retroOrderSelectionResponse2 = retroOrderSelectionResponse != null ? (RetroOrderSelectionResponse) RetroOrderSelectionResponse.ADAPTER.redact(retroOrderSelectionResponse) : null;
        AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse = afterpayAppletHome.purchase_history_preload;
        AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse2 = afterpayAppletPurchaseHistoryResponse != null ? (AfterpayAppletPurchaseHistoryResponse) AfterpayAppletPurchaseHistoryResponse.ADAPTER.redact(afterpayAppletPurchaseHistoryResponse) : null;
        AfterpayAppletHome.OnDisplayMessage onDisplayMessage = afterpayAppletHome.on_display_message;
        AfterpayAppletHome.OnDisplayMessage onDisplayMessage2 = onDisplayMessage != null ? (AfterpayAppletHome.OnDisplayMessage) AfterpayAppletHome.OnDisplayMessage.ADAPTER.redact(onDisplayMessage) : null;
        Experiments experiments = afterpayAppletHome.experiments;
        Experiments experiments2 = experiments != null ? (Experiments) Experiments.ADAPTER.redact(experiments) : null;
        AfterpayAppletActivityResponse afterpayAppletActivityResponse = afterpayAppletHome.activity_preload;
        AfterpayAppletActivityResponse afterpayAppletActivityResponse2 = afterpayAppletActivityResponse != null ? (AfterpayAppletActivityResponse) AfterpayAppletActivityResponse.ADAPTER.redact(afterpayAppletActivityResponse) : null;
        AfterpayAppletActivityHistoryResponse afterpayAppletActivityHistoryResponse = afterpayAppletHome.activity_history_preload;
        AfterpayAppletActivityHistoryResponse afterpayAppletActivityHistoryResponse2 = afterpayAppletActivityHistoryResponse != null ? (AfterpayAppletActivityHistoryResponse) AfterpayAppletActivityHistoryResponse.ADAPTER.redact(afterpayAppletActivityHistoryResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayAppletHome(localizedString2, tappableIcon2, m1169redactElements, footer2, analyticsEvent2, retroOrderSelectionResponse2, afterpayAppletPurchaseHistoryResponse2, onDisplayMessage2, experiments2, afterpayAppletActivityResponse2, afterpayAppletActivityHistoryResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletHome afterpayAppletHome = (AfterpayAppletHome) obj;
        afterpayAppletHome.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, afterpayAppletHome.title);
        TappableIcon.ADAPTER.encodeWithTag(protoWriter, 7, afterpayAppletHome.header_tappable_info);
        AfterpayAppletHomeSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, afterpayAppletHome.sections);
        Footer.ADAPTER.encodeWithTag(protoWriter, 3, afterpayAppletHome.footer);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 4, afterpayAppletHome.analytic_view_event);
        RetroOrderSelectionResponse.ADAPTER.encodeWithTag(protoWriter, 5, afterpayAppletHome.retro_selection_preload);
        AfterpayAppletPurchaseHistoryResponse.ADAPTER.encodeWithTag(protoWriter, 6, afterpayAppletHome.purchase_history_preload);
        AfterpayAppletHome.OnDisplayMessage.ADAPTER.encodeWithTag(protoWriter, 8, afterpayAppletHome.on_display_message);
        Experiments.ADAPTER.encodeWithTag(protoWriter, 9, afterpayAppletHome.experiments);
        AfterpayAppletActivityResponse.ADAPTER.encodeWithTag(protoWriter, 10, afterpayAppletHome.activity_preload);
        AfterpayAppletActivityHistoryResponse.ADAPTER.encodeWithTag(protoWriter, 11, afterpayAppletHome.activity_history_preload);
        protoWriter.writeBytes(afterpayAppletHome.unknownFields());
    }
}
