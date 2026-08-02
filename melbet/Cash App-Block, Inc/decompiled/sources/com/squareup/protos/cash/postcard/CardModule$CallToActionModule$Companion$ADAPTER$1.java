package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$CallToActionModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.CallToActionModule((Image) obj, (LocalizedString) obj2, (LocalizedString) obj3, (CardModule.Button) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(CardModule.Button.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.CallToActionModule callToActionModule = (CardModule.CallToActionModule) obj;
        reverseProtoWriter.getClass();
        callToActionModule.getClass();
        reverseProtoWriter.writeBytes(callToActionModule.unknownFields());
        CardModule.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 4, callToActionModule.button);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, callToActionModule.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, callToActionModule.title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, callToActionModule.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.CallToActionModule callToActionModule = (CardModule.CallToActionModule) obj;
        callToActionModule.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, callToActionModule.image) + callToActionModule.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return CardModule.Button.ADAPTER.encodedSizeWithTag(4, callToActionModule.button) + protoAdapter.encodedSizeWithTag(3, callToActionModule.subtitle) + protoAdapter.encodedSizeWithTag(2, callToActionModule.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.CallToActionModule callToActionModule = (CardModule.CallToActionModule) obj;
        callToActionModule.getClass();
        Image image = callToActionModule.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        LocalizedString localizedString = callToActionModule.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = callToActionModule.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        CardModule.Button button = callToActionModule.button;
        CardModule.Button button2 = button != null ? (CardModule.Button) CardModule.Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.CallToActionModule(image2, localizedString2, localizedString4, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.CallToActionModule callToActionModule = (CardModule.CallToActionModule) obj;
        callToActionModule.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, callToActionModule.image);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, callToActionModule.title);
        protoAdapter.encodeWithTag(protoWriter, 3, callToActionModule.subtitle);
        CardModule.Button.ADAPTER.encodeWithTag(protoWriter, 4, callToActionModule.button);
        protoWriter.writeBytes(callToActionModule.unknownFields());
    }
}
