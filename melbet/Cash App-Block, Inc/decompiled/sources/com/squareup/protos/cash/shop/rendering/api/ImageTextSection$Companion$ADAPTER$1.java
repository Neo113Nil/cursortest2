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
public final class ImageTextSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ImageTextSection((Image) obj, (LocalizedString) obj2, (LocalizedString) obj3, (Button) obj4, (AnalyticsEvent) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ImageTextSection imageTextSection = (ImageTextSection) obj;
        reverseProtoWriter.getClass();
        imageTextSection.getClass();
        reverseProtoWriter.writeBytes(imageTextSection.unknownFields());
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, imageTextSection.analytics_view_event);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 4, imageTextSection.button);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, imageTextSection.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, imageTextSection.title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, imageTextSection.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ImageTextSection imageTextSection = (ImageTextSection) obj;
        imageTextSection.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, imageTextSection.image) + imageTextSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return AnalyticsEvent.ADAPTER.encodedSizeWithTag(5, imageTextSection.analytics_view_event) + Button.ADAPTER.encodedSizeWithTag(4, imageTextSection.button) + protoAdapter.encodedSizeWithTag(3, imageTextSection.subtitle) + protoAdapter.encodedSizeWithTag(2, imageTextSection.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ImageTextSection imageTextSection = (ImageTextSection) obj;
        imageTextSection.getClass();
        Image image = imageTextSection.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        LocalizedString localizedString = imageTextSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = imageTextSection.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Button button = imageTextSection.button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        AnalyticsEvent analyticsEvent = imageTextSection.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ImageTextSection(image2, localizedString2, localizedString4, button2, analyticsEvent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ImageTextSection imageTextSection = (ImageTextSection) obj;
        imageTextSection.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, imageTextSection.image);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, imageTextSection.title);
        protoAdapter.encodeWithTag(protoWriter, 3, imageTextSection.subtitle);
        Button.ADAPTER.encodeWithTag(protoWriter, 4, imageTextSection.button);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 5, imageTextSection.analytics_view_event);
        protoWriter.writeBytes(imageTextSection.unknownFields());
    }
}
