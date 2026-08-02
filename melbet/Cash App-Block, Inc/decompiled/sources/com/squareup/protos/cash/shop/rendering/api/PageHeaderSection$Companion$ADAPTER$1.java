package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PageHeaderSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        ErrorEvent.Usr.Companion companion = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PageHeaderSection(companion, (LocalizedString) obj, (LocalizedString) obj2, (TapAction) obj3, (Button) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    companion = new PageHeaderSection$TopContent$AvatarCarousel((AvatarCarousel) AvatarCarousel.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    companion = new PageHeaderSection$TopContent$Image((Image) Image.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PageHeaderSection pageHeaderSection = (PageHeaderSection) obj;
        reverseProtoWriter.getClass();
        pageHeaderSection.getClass();
        reverseProtoWriter.writeBytes(pageHeaderSection.unknownFields());
        ErrorEvent.Usr.Companion companion = pageHeaderSection.top_content;
        if (companion instanceof PageHeaderSection$TopContent$AvatarCarousel) {
            AvatarCarousel.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((PageHeaderSection$TopContent$AvatarCarousel) companion).value);
        } else if (companion instanceof PageHeaderSection$TopContent$Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((PageHeaderSection$TopContent$Image) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 4, pageHeaderSection.button);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, pageHeaderSection.tap_action);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, pageHeaderSection.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, pageHeaderSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        PageHeaderSection pageHeaderSection = (PageHeaderSection) obj;
        pageHeaderSection.getClass();
        int size$okio = pageHeaderSection.unknownFields().getSize$okio();
        ErrorEvent.Usr.Companion companion = pageHeaderSection.top_content;
        if (companion instanceof PageHeaderSection$TopContent$AvatarCarousel) {
            encodedSizeWithTag = AvatarCarousel.ADAPTER.encodedSizeWithTag(5, ((PageHeaderSection$TopContent$AvatarCarousel) companion).value);
        } else {
            if (!(companion instanceof PageHeaderSection$TopContent$Image)) {
                if (companion != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
                return Button.ADAPTER.encodedSizeWithTag(4, pageHeaderSection.button) + TapAction.ADAPTER.encodedSizeWithTag(3, pageHeaderSection.tap_action) + protoAdapter.encodedSizeWithTag(2, pageHeaderSection.subtitle) + protoAdapter.encodedSizeWithTag(1, pageHeaderSection.title) + size$okio;
            }
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(6, ((PageHeaderSection$TopContent$Image) companion).value);
        }
        size$okio += encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return Button.ADAPTER.encodedSizeWithTag(4, pageHeaderSection.button) + TapAction.ADAPTER.encodedSizeWithTag(3, pageHeaderSection.tap_action) + protoAdapter2.encodedSizeWithTag(2, pageHeaderSection.subtitle) + protoAdapter2.encodedSizeWithTag(1, pageHeaderSection.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PageHeaderSection pageHeaderSection = (PageHeaderSection) obj;
        pageHeaderSection.getClass();
        LocalizedString localizedString = pageHeaderSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = pageHeaderSection.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        TapAction tapAction = pageHeaderSection.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        Button button = pageHeaderSection.button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        ErrorEvent.Usr.Companion companion = pageHeaderSection.top_content;
        byteString.getClass();
        return new PageHeaderSection(companion, localizedString2, localizedString4, tapAction2, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PageHeaderSection pageHeaderSection = (PageHeaderSection) obj;
        pageHeaderSection.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, pageHeaderSection.title);
        protoAdapter.encodeWithTag(protoWriter, 2, pageHeaderSection.subtitle);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 3, pageHeaderSection.tap_action);
        Button.ADAPTER.encodeWithTag(protoWriter, 4, pageHeaderSection.button);
        ErrorEvent.Usr.Companion companion = pageHeaderSection.top_content;
        if (companion instanceof PageHeaderSection$TopContent$AvatarCarousel) {
            AvatarCarousel.ADAPTER.encodeWithTag(protoWriter, 5, ((PageHeaderSection$TopContent$AvatarCarousel) companion).value);
        } else if (companion instanceof PageHeaderSection$TopContent$Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 6, ((PageHeaderSection$TopContent$Image) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(pageHeaderSection.unknownFields());
    }
}
