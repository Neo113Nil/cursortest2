package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzux;
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
public final class AppletCardSection$ImageTextContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        zzux zzuxVar = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppletCardSection.ImageTextContent(zzuxVar, (LocalizedString) obj, (LocalizedString) obj2, (com.squareup.protos.cash.shop.rendering.api.TapAction) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzuxVar = new AppletCardSection$ImageTextContent$ImageContent$Image((Image) Image.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzuxVar = new AppletCardSection$ImageTextContent$ImageContent$CashCard((AppletCardSection.CashCardRenderingConfiguration) AppletCardSection.CashCardRenderingConfiguration.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppletCardSection.ImageTextContent imageTextContent = (AppletCardSection.ImageTextContent) obj;
        reverseProtoWriter.getClass();
        imageTextContent.getClass();
        reverseProtoWriter.writeBytes(imageTextContent.unknownFields());
        zzux zzuxVar = imageTextContent.image_content;
        if (zzuxVar instanceof AppletCardSection$ImageTextContent$ImageContent$Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((AppletCardSection$ImageTextContent$ImageContent$Image) zzuxVar).value);
        } else if (zzuxVar instanceof AppletCardSection$ImageTextContent$ImageContent$CashCard) {
            AppletCardSection.CashCardRenderingConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((AppletCardSection$ImageTextContent$ImageContent$CashCard) zzuxVar).value);
        } else if (zzuxVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, imageTextContent.tap_action);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, imageTextContent.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, imageTextContent.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        AppletCardSection.ImageTextContent imageTextContent = (AppletCardSection.ImageTextContent) obj;
        imageTextContent.getClass();
        int size$okio = imageTextContent.unknownFields().getSize$okio();
        zzux zzuxVar = imageTextContent.image_content;
        if (zzuxVar instanceof AppletCardSection$ImageTextContent$ImageContent$Image) {
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, ((AppletCardSection$ImageTextContent$ImageContent$Image) zzuxVar).value);
        } else {
            if (!(zzuxVar instanceof AppletCardSection$ImageTextContent$ImageContent$CashCard)) {
                if (zzuxVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
                return com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodedSizeWithTag(4, imageTextContent.tap_action) + protoAdapter.encodedSizeWithTag(3, imageTextContent.subtitle) + protoAdapter.encodedSizeWithTag(2, imageTextContent.title) + size$okio;
            }
            encodedSizeWithTag = AppletCardSection.CashCardRenderingConfiguration.ADAPTER.encodedSizeWithTag(5, ((AppletCardSection$ImageTextContent$ImageContent$CashCard) zzuxVar).value);
        }
        size$okio += encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodedSizeWithTag(4, imageTextContent.tap_action) + protoAdapter2.encodedSizeWithTag(3, imageTextContent.subtitle) + protoAdapter2.encodedSizeWithTag(2, imageTextContent.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppletCardSection.ImageTextContent imageTextContent = (AppletCardSection.ImageTextContent) obj;
        imageTextContent.getClass();
        LocalizedString localizedString = imageTextContent.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = imageTextContent.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = imageTextContent.tap_action;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction2 = tapAction != null ? (com.squareup.protos.cash.shop.rendering.api.TapAction) com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        zzux zzuxVar = imageTextContent.image_content;
        byteString.getClass();
        return new AppletCardSection.ImageTextContent(zzuxVar, localizedString2, localizedString4, tapAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppletCardSection.ImageTextContent imageTextContent = (AppletCardSection.ImageTextContent) obj;
        imageTextContent.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, imageTextContent.title);
        protoAdapter.encodeWithTag(protoWriter, 3, imageTextContent.subtitle);
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(protoWriter, 4, imageTextContent.tap_action);
        zzux zzuxVar = imageTextContent.image_content;
        if (zzuxVar instanceof AppletCardSection$ImageTextContent$ImageContent$Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 1, ((AppletCardSection$ImageTextContent$ImageContent$Image) zzuxVar).value);
        } else if (zzuxVar instanceof AppletCardSection$ImageTextContent$ImageContent$CashCard) {
            AppletCardSection.CashCardRenderingConfiguration.ADAPTER.encodeWithTag(protoWriter, 5, ((AppletCardSection$ImageTextContent$ImageContent$CashCard) zzuxVar).value);
        } else if (zzuxVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(imageTextContent.unknownFields());
    }
}
