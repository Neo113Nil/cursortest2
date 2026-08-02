package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.datadog.android.rum.model.LongTaskEvent;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UpsellSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        LongTaskEvent.Companion companion = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpsellSheet(companion, (LocalizedString) obj, (LocalizedString) obj2, (AnalyticsEvent) obj3, (AnalyticsEvent) obj4, (LocalizedString) obj5, (Button) obj6, (Button) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    companion = new UpsellSheet$TopContent$AvatarCarousel((AvatarCarousel) AvatarCarousel.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj3);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj6);
                    break;
                case 8:
                    companion = new UpsellSheet$TopContent$Avatar((UiAvatar) UiAvatar.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    companion = new UpsellSheet$TopContent$Image((Image) Image.ADAPTER.decode(protoReader));
                    break;
                case 10:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 11:
                    obj7 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj7);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpsellSheet upsellSheet = (UpsellSheet) obj;
        reverseProtoWriter.getClass();
        upsellSheet.getClass();
        reverseProtoWriter.writeBytes(upsellSheet.unknownFields());
        LongTaskEvent.Companion companion = upsellSheet.top_content;
        if (companion instanceof UpsellSheet$TopContent$AvatarCarousel) {
            AvatarCarousel.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((UpsellSheet$TopContent$AvatarCarousel) companion).value);
        } else if (companion instanceof UpsellSheet$TopContent$Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((UpsellSheet$TopContent$Avatar) companion).value);
        } else if (companion instanceof UpsellSheet$TopContent$Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((UpsellSheet$TopContent$Image) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, upsellSheet.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, upsellSheet.cta_button);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, upsellSheet.footer_text);
        ProtoAdapter protoAdapter3 = AnalyticsEvent.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, upsellSheet.analytic_dismiss_event);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, upsellSheet.analytic_view_event);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, upsellSheet.body);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, upsellSheet.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        UpsellSheet upsellSheet = (UpsellSheet) obj;
        upsellSheet.getClass();
        int size$okio = upsellSheet.unknownFields().getSize$okio();
        LongTaskEvent.Companion companion = upsellSheet.top_content;
        if (companion instanceof UpsellSheet$TopContent$AvatarCarousel) {
            encodedSizeWithTag = AvatarCarousel.ADAPTER.encodedSizeWithTag(1, ((UpsellSheet$TopContent$AvatarCarousel) companion).value);
        } else if (companion instanceof UpsellSheet$TopContent$Avatar) {
            encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(8, ((UpsellSheet$TopContent$Avatar) companion).value);
        } else {
            if (!(companion instanceof UpsellSheet$TopContent$Image)) {
                if (companion != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
                int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, upsellSheet.body) + protoAdapter.encodedSizeWithTag(2, upsellSheet.title) + size$okio;
                ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
                int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(6, upsellSheet.footer_text) + protoAdapter2.encodedSizeWithTag(5, upsellSheet.analytic_dismiss_event) + protoAdapter2.encodedSizeWithTag(4, upsellSheet.analytic_view_event) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter3 = Button.ADAPTER;
                return protoAdapter3.encodedSizeWithTag(11, upsellSheet.secondary_button) + protoAdapter3.encodedSizeWithTag(7, upsellSheet.cta_button) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(9, ((UpsellSheet$TopContent$Image) companion).value);
        }
        size$okio += encodedSizeWithTag;
        ProtoAdapter protoAdapter4 = LocalizedString.ADAPTER;
        int encodedSizeWithTag22 = protoAdapter4.encodedSizeWithTag(3, upsellSheet.body) + protoAdapter4.encodedSizeWithTag(2, upsellSheet.title) + size$okio;
        ProtoAdapter protoAdapter22 = AnalyticsEvent.ADAPTER;
        int encodedSizeWithTag32 = protoAdapter4.encodedSizeWithTag(6, upsellSheet.footer_text) + protoAdapter22.encodedSizeWithTag(5, upsellSheet.analytic_dismiss_event) + protoAdapter22.encodedSizeWithTag(4, upsellSheet.analytic_view_event) + encodedSizeWithTag22;
        ProtoAdapter protoAdapter32 = Button.ADAPTER;
        return protoAdapter32.encodedSizeWithTag(11, upsellSheet.secondary_button) + protoAdapter32.encodedSizeWithTag(7, upsellSheet.cta_button) + encodedSizeWithTag32;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpsellSheet upsellSheet = (UpsellSheet) obj;
        upsellSheet.getClass();
        LocalizedString localizedString = upsellSheet.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = upsellSheet.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        AnalyticsEvent analyticsEvent = upsellSheet.analytic_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        AnalyticsEvent analyticsEvent3 = upsellSheet.analytic_dismiss_event;
        AnalyticsEvent analyticsEvent4 = analyticsEvent3 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent3) : null;
        LocalizedString localizedString5 = upsellSheet.footer_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        Button button = upsellSheet.cta_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Button button3 = upsellSheet.secondary_button;
        Button button4 = button3 != null ? (Button) Button.ADAPTER.redact(button3) : null;
        ByteString byteString = ByteString.EMPTY;
        LongTaskEvent.Companion companion = upsellSheet.top_content;
        byteString.getClass();
        return new UpsellSheet(companion, localizedString2, localizedString4, analyticsEvent2, analyticsEvent4, localizedString6, button2, button4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpsellSheet upsellSheet = (UpsellSheet) obj;
        upsellSheet.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, upsellSheet.title);
        protoAdapter.encodeWithTag(protoWriter, 3, upsellSheet.body);
        ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, upsellSheet.analytic_view_event);
        protoAdapter2.encodeWithTag(protoWriter, 5, upsellSheet.analytic_dismiss_event);
        protoAdapter.encodeWithTag(protoWriter, 6, upsellSheet.footer_text);
        ProtoAdapter protoAdapter3 = Button.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 7, upsellSheet.cta_button);
        protoAdapter3.encodeWithTag(protoWriter, 11, upsellSheet.secondary_button);
        LongTaskEvent.Companion companion = upsellSheet.top_content;
        if (companion instanceof UpsellSheet$TopContent$AvatarCarousel) {
            AvatarCarousel.ADAPTER.encodeWithTag(protoWriter, 1, ((UpsellSheet$TopContent$AvatarCarousel) companion).value);
        } else if (companion instanceof UpsellSheet$TopContent$Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(protoWriter, 8, ((UpsellSheet$TopContent$Avatar) companion).value);
        } else if (companion instanceof UpsellSheet$TopContent$Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 9, ((UpsellSheet$TopContent$Image) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(upsellSheet.unknownFields());
    }
}
