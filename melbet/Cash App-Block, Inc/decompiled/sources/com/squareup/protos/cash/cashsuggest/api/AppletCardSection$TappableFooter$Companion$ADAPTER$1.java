package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import app.cash.redwood.compose.HostFocusDirectorKt;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppletCardSection$TappableFooter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        HostFocusDirectorKt hostFocusDirectorKt = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppletCardSection.TappableFooter(hostFocusDirectorKt, (LocalizedString) obj, (com.squareup.protos.cash.shop.rendering.api.TapAction) obj2, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                hostFocusDirectorKt = new AppletCardSection$TappableFooter$ImageContent$Image((Image) Image.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                hostFocusDirectorKt = new AppletCardSection$TappableFooter$ImageContent$CashCard((AppletCardSection.CashCardRenderingConfiguration) AppletCardSection.CashCardRenderingConfiguration.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppletCardSection.TappableFooter tappableFooter = (AppletCardSection.TappableFooter) obj;
        reverseProtoWriter.getClass();
        tappableFooter.getClass();
        reverseProtoWriter.writeBytes(tappableFooter.unknownFields());
        HostFocusDirectorKt hostFocusDirectorKt = tappableFooter.image_content;
        if (hostFocusDirectorKt instanceof AppletCardSection$TappableFooter$ImageContent$Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((AppletCardSection$TappableFooter$ImageContent$Image) hostFocusDirectorKt).value);
        } else if (hostFocusDirectorKt instanceof AppletCardSection$TappableFooter$ImageContent$CashCard) {
            AppletCardSection.CashCardRenderingConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((AppletCardSection$TappableFooter$ImageContent$CashCard) hostFocusDirectorKt).value);
        } else if (hostFocusDirectorKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, tappableFooter.subtitle);
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, tappableFooter.tap_action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, tappableFooter.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        AppletCardSection.TappableFooter tappableFooter = (AppletCardSection.TappableFooter) obj;
        tappableFooter.getClass();
        int size$okio = tappableFooter.unknownFields().getSize$okio();
        HostFocusDirectorKt hostFocusDirectorKt = tappableFooter.image_content;
        if (hostFocusDirectorKt instanceof AppletCardSection$TappableFooter$ImageContent$Image) {
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, ((AppletCardSection$TappableFooter$ImageContent$Image) hostFocusDirectorKt).value);
        } else {
            if (!(hostFocusDirectorKt instanceof AppletCardSection$TappableFooter$ImageContent$CashCard)) {
                if (hostFocusDirectorKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
                return protoAdapter.encodedSizeWithTag(5, tappableFooter.subtitle) + com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodedSizeWithTag(3, tappableFooter.tap_action) + protoAdapter.encodedSizeWithTag(2, tappableFooter.title) + size$okio;
            }
            encodedSizeWithTag = AppletCardSection.CashCardRenderingConfiguration.ADAPTER.encodedSizeWithTag(4, ((AppletCardSection$TappableFooter$ImageContent$CashCard) hostFocusDirectorKt).value);
        }
        size$okio += encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(5, tappableFooter.subtitle) + com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodedSizeWithTag(3, tappableFooter.tap_action) + protoAdapter2.encodedSizeWithTag(2, tappableFooter.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppletCardSection.TappableFooter tappableFooter = (AppletCardSection.TappableFooter) obj;
        tappableFooter.getClass();
        LocalizedString localizedString = tappableFooter.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = tappableFooter.tap_action;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction2 = tapAction != null ? (com.squareup.protos.cash.shop.rendering.api.TapAction) com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.redact(tapAction) : null;
        LocalizedString localizedString3 = tappableFooter.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        HostFocusDirectorKt hostFocusDirectorKt = tappableFooter.image_content;
        byteString.getClass();
        return new AppletCardSection.TappableFooter(hostFocusDirectorKt, localizedString2, tapAction2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppletCardSection.TappableFooter tappableFooter = (AppletCardSection.TappableFooter) obj;
        tappableFooter.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, tappableFooter.title);
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(protoWriter, 3, tappableFooter.tap_action);
        protoAdapter.encodeWithTag(protoWriter, 5, tappableFooter.subtitle);
        HostFocusDirectorKt hostFocusDirectorKt = tappableFooter.image_content;
        if (hostFocusDirectorKt instanceof AppletCardSection$TappableFooter$ImageContent$Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 1, ((AppletCardSection$TappableFooter$ImageContent$Image) hostFocusDirectorKt).value);
        } else if (hostFocusDirectorKt instanceof AppletCardSection$TappableFooter$ImageContent$CashCard) {
            AppletCardSection.CashCardRenderingConfiguration.ADAPTER.encodeWithTag(protoWriter, 4, ((AppletCardSection$TappableFooter$ImageContent$CashCard) hostFocusDirectorKt).value);
        } else if (hostFocusDirectorKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(tappableFooter.unknownFields());
    }
}
