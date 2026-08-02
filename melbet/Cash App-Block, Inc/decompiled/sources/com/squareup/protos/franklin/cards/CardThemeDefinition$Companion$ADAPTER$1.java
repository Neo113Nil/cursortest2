package com.squareup.protos.franklin.cards;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardThemeDefinition$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CardThemeDefinition((String) obj, (String) obj2, (CardTheme) obj3, (LocalizedString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(CardTheme.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardThemeDefinition cardThemeDefinition = (CardThemeDefinition) obj;
        reverseProtoWriter.getClass();
        cardThemeDefinition.getClass();
        reverseProtoWriter.writeBytes(cardThemeDefinition.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, cardThemeDefinition.localized_name);
        CardTheme.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cardThemeDefinition.card_theme);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cardThemeDefinition.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cardThemeDefinition.card_theme_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardThemeDefinition cardThemeDefinition = (CardThemeDefinition) obj;
        cardThemeDefinition.getClass();
        int size$okio = cardThemeDefinition.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizedString.ADAPTER.encodedSizeWithTag(4, cardThemeDefinition.localized_name) + CardTheme.ADAPTER.encodedSizeWithTag(3, cardThemeDefinition.card_theme) + protoAdapter.encodedSizeWithTag(2, cardThemeDefinition.name) + protoAdapter.encodedSizeWithTag(1, cardThemeDefinition.card_theme_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardThemeDefinition cardThemeDefinition = (CardThemeDefinition) obj;
        cardThemeDefinition.getClass();
        CardTheme cardTheme = cardThemeDefinition.card_theme;
        CardTheme cardTheme2 = cardTheme != null ? (CardTheme) CardTheme.ADAPTER.redact(cardTheme) : null;
        LocalizedString localizedString = cardThemeDefinition.localized_name;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cardThemeDefinition.card_theme_token;
        String str2 = cardThemeDefinition.name;
        byteString.getClass();
        return new CardThemeDefinition(str, str2, cardTheme2, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardThemeDefinition cardThemeDefinition = (CardThemeDefinition) obj;
        cardThemeDefinition.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cardThemeDefinition.card_theme_token);
        protoAdapter.encodeWithTag(protoWriter, 2, cardThemeDefinition.name);
        CardTheme.ADAPTER.encodeWithTag(protoWriter, 3, cardThemeDefinition.card_theme);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 4, cardThemeDefinition.localized_name);
        protoWriter.writeBytes(cardThemeDefinition.unknownFields());
    }
}
