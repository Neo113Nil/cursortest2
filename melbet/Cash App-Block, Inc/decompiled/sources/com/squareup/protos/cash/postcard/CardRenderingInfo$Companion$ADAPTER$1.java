package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.postcard.CardRenderingInfo;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CardRenderingInfo$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CardRenderingInfo((String) obj, (CardTheme) obj2, (CardRenderingInfo.ExpirationState) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(CardTheme.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = CardRenderingInfo.ExpirationState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardRenderingInfo cardRenderingInfo = (CardRenderingInfo) obj;
        reverseProtoWriter.getClass();
        cardRenderingInfo.getClass();
        reverseProtoWriter.writeBytes(cardRenderingInfo.unknownFields());
        CardRenderingInfo.ExpirationState.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cardRenderingInfo.expiration_state);
        CardTheme.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cardRenderingInfo.card_theme);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, cardRenderingInfo.customization_image_path);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardRenderingInfo cardRenderingInfo = (CardRenderingInfo) obj;
        cardRenderingInfo.getClass();
        return CardRenderingInfo.ExpirationState.ADAPTER.encodedSizeWithTag(3, cardRenderingInfo.expiration_state) + CardTheme.ADAPTER.encodedSizeWithTag(2, cardRenderingInfo.card_theme) + ProtoAdapter.STRING.encodedSizeWithTag(1, cardRenderingInfo.customization_image_path) + cardRenderingInfo.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardRenderingInfo cardRenderingInfo = (CardRenderingInfo) obj;
        cardRenderingInfo.getClass();
        CardTheme cardTheme = cardRenderingInfo.card_theme;
        CardTheme cardTheme2 = cardTheme != null ? (CardTheme) CardTheme.ADAPTER.redact(cardTheme) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cardRenderingInfo.customization_image_path;
        CardRenderingInfo.ExpirationState expirationState = cardRenderingInfo.expiration_state;
        byteString.getClass();
        return new CardRenderingInfo(str, cardTheme2, expirationState, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardRenderingInfo cardRenderingInfo = (CardRenderingInfo) obj;
        cardRenderingInfo.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cardRenderingInfo.customization_image_path);
        CardTheme.ADAPTER.encodeWithTag(protoWriter, 2, cardRenderingInfo.card_theme);
        CardRenderingInfo.ExpirationState.ADAPTER.encodeWithTag(protoWriter, 3, cardRenderingInfo.expiration_state);
        protoWriter.writeBytes(cardRenderingInfo.unknownFields());
    }
}
