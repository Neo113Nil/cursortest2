package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheet;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayMerchantSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        AfterpayMerchantSheet$Content$PasteboardTextLines afterpayMerchantSheet$Content$PasteboardTextLines = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayMerchantSheet((UiAvatar) obj, (LocalizedString) obj2, (LocalizedString) obj3, afterpayMerchantSheet$Content$PasteboardTextLines, (Button) obj4, (AnalyticsEvent) obj5, (AnalyticsEvent) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    afterpayMerchantSheet$Content$PasteboardTextLines = new AfterpayMerchantSheet$Content$PasteboardTextLines((AfterpayMerchantSheet.PasteboardTextLines) AfterpayMerchantSheet.PasteboardTextLines.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj5);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayMerchantSheet afterpayMerchantSheet = (AfterpayMerchantSheet) obj;
        reverseProtoWriter.getClass();
        afterpayMerchantSheet.getClass();
        reverseProtoWriter.writeBytes(afterpayMerchantSheet.unknownFields());
        AfterpayMerchantSheet$Content$PasteboardTextLines afterpayMerchantSheet$Content$PasteboardTextLines = afterpayMerchantSheet.content;
        if (afterpayMerchantSheet$Content$PasteboardTextLines != null) {
            AfterpayMerchantSheet.PasteboardTextLines.ADAPTER.encodeWithTag(reverseProtoWriter, 4, afterpayMerchantSheet$Content$PasteboardTextLines.value);
        } else if (afterpayMerchantSheet$Content$PasteboardTextLines != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, afterpayMerchantSheet.analytic_dismiss_event);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, afterpayMerchantSheet.analytic_view_event);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 5, afterpayMerchantSheet.cta_button);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, afterpayMerchantSheet.body);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, afterpayMerchantSheet.title);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, afterpayMerchantSheet.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayMerchantSheet afterpayMerchantSheet = (AfterpayMerchantSheet) obj;
        afterpayMerchantSheet.getClass();
        int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(1, afterpayMerchantSheet.avatar) + afterpayMerchantSheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, afterpayMerchantSheet.body) + protoAdapter.encodedSizeWithTag(2, afterpayMerchantSheet.title) + encodedSizeWithTag;
        AfterpayMerchantSheet$Content$PasteboardTextLines afterpayMerchantSheet$Content$PasteboardTextLines = afterpayMerchantSheet.content;
        if (afterpayMerchantSheet$Content$PasteboardTextLines != null) {
            encodedSizeWithTag2 += AfterpayMerchantSheet.PasteboardTextLines.ADAPTER.encodedSizeWithTag(4, afterpayMerchantSheet$Content$PasteboardTextLines.value);
        } else if (afterpayMerchantSheet$Content$PasteboardTextLines != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        int encodedSizeWithTag3 = Button.ADAPTER.encodedSizeWithTag(5, afterpayMerchantSheet.cta_button) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(7, afterpayMerchantSheet.analytic_dismiss_event) + protoAdapter2.encodedSizeWithTag(6, afterpayMerchantSheet.analytic_view_event) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayMerchantSheet afterpayMerchantSheet = (AfterpayMerchantSheet) obj;
        afterpayMerchantSheet.getClass();
        UiAvatar uiAvatar = afterpayMerchantSheet.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        LocalizedString localizedString = afterpayMerchantSheet.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = afterpayMerchantSheet.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Button button = afterpayMerchantSheet.cta_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        AnalyticsEvent analyticsEvent = afterpayMerchantSheet.analytic_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        AnalyticsEvent analyticsEvent3 = afterpayMerchantSheet.analytic_dismiss_event;
        AnalyticsEvent analyticsEvent4 = analyticsEvent3 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent3) : null;
        ByteString byteString = ByteString.EMPTY;
        AfterpayMerchantSheet$Content$PasteboardTextLines afterpayMerchantSheet$Content$PasteboardTextLines = afterpayMerchantSheet.content;
        byteString.getClass();
        return new AfterpayMerchantSheet(uiAvatar2, localizedString2, localizedString4, afterpayMerchantSheet$Content$PasteboardTextLines, button2, analyticsEvent2, analyticsEvent4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayMerchantSheet afterpayMerchantSheet = (AfterpayMerchantSheet) obj;
        afterpayMerchantSheet.getClass();
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, afterpayMerchantSheet.avatar);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, afterpayMerchantSheet.title);
        protoAdapter.encodeWithTag(protoWriter, 3, afterpayMerchantSheet.body);
        Button.ADAPTER.encodeWithTag(protoWriter, 5, afterpayMerchantSheet.cta_button);
        ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, afterpayMerchantSheet.analytic_view_event);
        protoAdapter2.encodeWithTag(protoWriter, 7, afterpayMerchantSheet.analytic_dismiss_event);
        AfterpayMerchantSheet$Content$PasteboardTextLines afterpayMerchantSheet$Content$PasteboardTextLines = afterpayMerchantSheet.content;
        if (afterpayMerchantSheet$Content$PasteboardTextLines != null) {
            AfterpayMerchantSheet.PasteboardTextLines.ADAPTER.encodeWithTag(protoWriter, 4, afterpayMerchantSheet$Content$PasteboardTextLines.value);
        } else if (afterpayMerchantSheet$Content$PasteboardTextLines != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(afterpayMerchantSheet.unknownFields());
    }
}
