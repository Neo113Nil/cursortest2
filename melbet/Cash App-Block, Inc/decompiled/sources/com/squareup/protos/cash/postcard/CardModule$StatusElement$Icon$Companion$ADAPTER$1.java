package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$StatusElement$Icon$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.StatusElement.Icon((Icon) obj, (CardModule.StatusElement.Icon.IconBackground) obj2, (Image) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = CardModule.StatusElement.Icon.IconBackground.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.StatusElement.Icon icon = (CardModule.StatusElement.Icon) obj;
        reverseProtoWriter.getClass();
        icon.getClass();
        reverseProtoWriter.writeBytes(icon.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, icon.image);
        CardModule.StatusElement.Icon.IconBackground.ADAPTER.encodeWithTag(reverseProtoWriter, 2, icon.background);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, icon.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.StatusElement.Icon icon = (CardModule.StatusElement.Icon) obj;
        icon.getClass();
        return Image.ADAPTER.encodedSizeWithTag(3, icon.image) + CardModule.StatusElement.Icon.IconBackground.ADAPTER.encodedSizeWithTag(2, icon.background) + Icon.ADAPTER.encodedSizeWithTag(1, icon.icon) + icon.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.StatusElement.Icon icon = (CardModule.StatusElement.Icon) obj;
        icon.getClass();
        Icon icon2 = icon.icon;
        Icon icon3 = icon2 != null ? (Icon) Icon.ADAPTER.redact(icon2) : null;
        Image image = icon.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        CardModule.StatusElement.Icon.IconBackground iconBackground = icon.background;
        byteString.getClass();
        return new CardModule.StatusElement.Icon(icon3, iconBackground, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.StatusElement.Icon icon = (CardModule.StatusElement.Icon) obj;
        icon.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 1, icon.icon);
        CardModule.StatusElement.Icon.IconBackground.ADAPTER.encodeWithTag(protoWriter, 2, icon.background);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, icon.image);
        protoWriter.writeBytes(icon.unknownFields());
    }
}
