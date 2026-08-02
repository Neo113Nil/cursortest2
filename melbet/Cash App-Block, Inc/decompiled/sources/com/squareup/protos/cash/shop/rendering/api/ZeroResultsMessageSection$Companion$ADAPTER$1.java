package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ZeroResultsMessageSection$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ZeroResultsMessageSection((Image) obj, (LocalizedString) obj2, (LocalizedString) obj3, (Button) obj4, (AnalyticsEvent) obj5, (StyledText) obj6, (StyledText) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj6 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj6);
                    break;
                case 3:
                    obj7 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj7);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 7:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ZeroResultsMessageSection zeroResultsMessageSection = (ZeroResultsMessageSection) obj;
        reverseProtoWriter.getClass();
        zeroResultsMessageSection.getClass();
        reverseProtoWriter.writeBytes(zeroResultsMessageSection.unknownFields());
        ProtoAdapter protoAdapter = StyledText.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, zeroResultsMessageSection.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, zeroResultsMessageSection.title);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, zeroResultsMessageSection.analytics_view_item_event);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 4, zeroResultsMessageSection.button);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, zeroResultsMessageSection.l_subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, zeroResultsMessageSection.l_title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, zeroResultsMessageSection.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ZeroResultsMessageSection zeroResultsMessageSection = (ZeroResultsMessageSection) obj;
        zeroResultsMessageSection.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, zeroResultsMessageSection.image) + zeroResultsMessageSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = AnalyticsEvent.ADAPTER.encodedSizeWithTag(5, zeroResultsMessageSection.analytics_view_item_event) + Button.ADAPTER.encodedSizeWithTag(4, zeroResultsMessageSection.button) + protoAdapter.encodedSizeWithTag(7, zeroResultsMessageSection.l_subtitle) + protoAdapter.encodedSizeWithTag(6, zeroResultsMessageSection.l_title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = StyledText.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(3, zeroResultsMessageSection.subtitle) + protoAdapter2.encodedSizeWithTag(2, zeroResultsMessageSection.title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ZeroResultsMessageSection zeroResultsMessageSection = (ZeroResultsMessageSection) obj;
        zeroResultsMessageSection.getClass();
        Image image = zeroResultsMessageSection.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        LocalizedString localizedString = zeroResultsMessageSection.l_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = zeroResultsMessageSection.l_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Button button = zeroResultsMessageSection.button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        AnalyticsEvent analyticsEvent = zeroResultsMessageSection.analytics_view_item_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        StyledText styledText = zeroResultsMessageSection.title;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        StyledText styledText3 = zeroResultsMessageSection.subtitle;
        StyledText styledText4 = styledText3 != null ? (StyledText) StyledText.ADAPTER.redact(styledText3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ZeroResultsMessageSection(image2, localizedString2, localizedString4, button2, analyticsEvent2, styledText2, styledText4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ZeroResultsMessageSection zeroResultsMessageSection = (ZeroResultsMessageSection) obj;
        zeroResultsMessageSection.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, zeroResultsMessageSection.image);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 6, zeroResultsMessageSection.l_title);
        protoAdapter.encodeWithTag(protoWriter, 7, zeroResultsMessageSection.l_subtitle);
        Button.ADAPTER.encodeWithTag(protoWriter, 4, zeroResultsMessageSection.button);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 5, zeroResultsMessageSection.analytics_view_item_event);
        ProtoAdapter protoAdapter2 = StyledText.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, zeroResultsMessageSection.title);
        protoAdapter2.encodeWithTag(protoWriter, 3, zeroResultsMessageSection.subtitle);
        protoWriter.writeBytes(zeroResultsMessageSection.unknownFields());
    }
}
