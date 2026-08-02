package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import app.cash.redwood.yoga.internal.YGNode;
import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.PageHeader;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RetroOrderSelectionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        YGNode.Companion companion = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RetroOrderSelectionResponse((PageHeader) obj, companion, (LocalizedString) obj2, (Long) obj3, (AnalyticsEvent) obj4, (TappableIcon) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(PageHeader.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    companion = new RetroOrderSelectionResponse$ScreenContent$EligibleOrders((RetroOrderSelectionResponse.EligibleRetroOrdersSection) RetroOrderSelectionResponse.EligibleRetroOrdersSection.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    companion = new RetroOrderSelectionResponse$ScreenContent$TextLines((RetroOrderSelectionResponse.TextLineItemSection) RetroOrderSelectionResponse.TextLineItemSection.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(TappableIcon.ADAPTER, protoReader, obj5);
                    break;
                case 7:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RetroOrderSelectionResponse retroOrderSelectionResponse = (RetroOrderSelectionResponse) obj;
        reverseProtoWriter.getClass();
        retroOrderSelectionResponse.getClass();
        reverseProtoWriter.writeBytes(retroOrderSelectionResponse.unknownFields());
        YGNode.Companion companion = retroOrderSelectionResponse.screen_content;
        if (companion instanceof RetroOrderSelectionResponse$ScreenContent$EligibleOrders) {
            RetroOrderSelectionResponse.EligibleRetroOrdersSection.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((RetroOrderSelectionResponse$ScreenContent$EligibleOrders) companion).value);
        } else if (companion instanceof RetroOrderSelectionResponse$ScreenContent$TextLines) {
            RetroOrderSelectionResponse.TextLineItemSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((RetroOrderSelectionResponse$ScreenContent$TextLines) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        TappableIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 6, retroOrderSelectionResponse.screen_tappable_info);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, retroOrderSelectionResponse.analytic_view_event);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, retroOrderSelectionResponse.expire_at_ms);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 7, retroOrderSelectionResponse.bottom_text);
        PageHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 1, retroOrderSelectionResponse.screen_header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        RetroOrderSelectionResponse retroOrderSelectionResponse = (RetroOrderSelectionResponse) obj;
        retroOrderSelectionResponse.getClass();
        int encodedSizeWithTag2 = PageHeader.ADAPTER.encodedSizeWithTag(1, retroOrderSelectionResponse.screen_header) + retroOrderSelectionResponse.unknownFields().getSize$okio();
        YGNode.Companion companion = retroOrderSelectionResponse.screen_content;
        if (companion instanceof RetroOrderSelectionResponse$ScreenContent$EligibleOrders) {
            encodedSizeWithTag = RetroOrderSelectionResponse.EligibleRetroOrdersSection.ADAPTER.encodedSizeWithTag(2, ((RetroOrderSelectionResponse$ScreenContent$EligibleOrders) companion).value);
        } else {
            if (!(companion instanceof RetroOrderSelectionResponse$ScreenContent$TextLines)) {
                if (companion != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return TappableIcon.ADAPTER.encodedSizeWithTag(6, retroOrderSelectionResponse.screen_tappable_info) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(5, retroOrderSelectionResponse.analytic_view_event) + ProtoAdapter.INT64.encodedSizeWithTag(4, retroOrderSelectionResponse.expire_at_ms) + LocalizedString.ADAPTER.encodedSizeWithTag(7, retroOrderSelectionResponse.bottom_text) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = RetroOrderSelectionResponse.TextLineItemSection.ADAPTER.encodedSizeWithTag(3, ((RetroOrderSelectionResponse$ScreenContent$TextLines) companion).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return TappableIcon.ADAPTER.encodedSizeWithTag(6, retroOrderSelectionResponse.screen_tappable_info) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(5, retroOrderSelectionResponse.analytic_view_event) + ProtoAdapter.INT64.encodedSizeWithTag(4, retroOrderSelectionResponse.expire_at_ms) + LocalizedString.ADAPTER.encodedSizeWithTag(7, retroOrderSelectionResponse.bottom_text) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RetroOrderSelectionResponse retroOrderSelectionResponse = (RetroOrderSelectionResponse) obj;
        retroOrderSelectionResponse.getClass();
        PageHeader pageHeader = retroOrderSelectionResponse.screen_header;
        PageHeader pageHeader2 = pageHeader != null ? (PageHeader) PageHeader.ADAPTER.redact(pageHeader) : null;
        LocalizedString localizedString = retroOrderSelectionResponse.bottom_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        AnalyticsEvent analyticsEvent = retroOrderSelectionResponse.analytic_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        TappableIcon tappableIcon = retroOrderSelectionResponse.screen_tappable_info;
        TappableIcon tappableIcon2 = tappableIcon != null ? (TappableIcon) TappableIcon.ADAPTER.redact(tappableIcon) : null;
        ByteString byteString = ByteString.EMPTY;
        YGNode.Companion companion = retroOrderSelectionResponse.screen_content;
        Long l = retroOrderSelectionResponse.expire_at_ms;
        byteString.getClass();
        return new RetroOrderSelectionResponse(pageHeader2, companion, localizedString2, l, analyticsEvent2, tappableIcon2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RetroOrderSelectionResponse retroOrderSelectionResponse = (RetroOrderSelectionResponse) obj;
        retroOrderSelectionResponse.getClass();
        PageHeader.ADAPTER.encodeWithTag(protoWriter, 1, retroOrderSelectionResponse.screen_header);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 7, retroOrderSelectionResponse.bottom_text);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, retroOrderSelectionResponse.expire_at_ms);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 5, retroOrderSelectionResponse.analytic_view_event);
        TappableIcon.ADAPTER.encodeWithTag(protoWriter, 6, retroOrderSelectionResponse.screen_tappable_info);
        YGNode.Companion companion = retroOrderSelectionResponse.screen_content;
        if (companion instanceof RetroOrderSelectionResponse$ScreenContent$EligibleOrders) {
            RetroOrderSelectionResponse.EligibleRetroOrdersSection.ADAPTER.encodeWithTag(protoWriter, 2, ((RetroOrderSelectionResponse$ScreenContent$EligibleOrders) companion).value);
        } else if (companion instanceof RetroOrderSelectionResponse$ScreenContent$TextLines) {
            RetroOrderSelectionResponse.TextLineItemSection.ADAPTER.encodeWithTag(protoWriter, 3, ((RetroOrderSelectionResponse$ScreenContent$TextLines) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(retroOrderSelectionResponse.unknownFields());
    }
}
