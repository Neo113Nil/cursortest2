package com.squareup.protos.cash.cashinstrumentstore.api.v1.cards.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardDetailsProto$DisplaySettings$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardDetailsProto$DisplaySettings((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 5) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 6) {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj6 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings = (CardDetailsProto$DisplaySettings) obj;
        reverseProtoWriter.getClass();
        cardDetailsProto$DisplaySettings.getClass();
        reverseProtoWriter.writeBytes(cardDetailsProto$DisplaySettings.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, cardDetailsProto$DisplaySettings.cardSymbolUrl);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, cardDetailsProto$DisplaySettings.cardArtUrl);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cardDetailsProto$DisplaySettings.displayName);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cardDetailsProto$DisplaySettings.displayPanSuffix);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cardDetailsProto$DisplaySettings.colorCardProductLogoUrl);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cardDetailsProto$DisplaySettings.monochromeCardProductLogoUrl);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings = (CardDetailsProto$DisplaySettings) obj;
        cardDetailsProto$DisplaySettings.getClass();
        int size$okio = cardDetailsProto$DisplaySettings.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(7, cardDetailsProto$DisplaySettings.cardSymbolUrl) + protoAdapter.encodedSizeWithTag(6, cardDetailsProto$DisplaySettings.cardArtUrl) + protoAdapter.encodedSizeWithTag(5, cardDetailsProto$DisplaySettings.displayName) + protoAdapter.encodedSizeWithTag(4, cardDetailsProto$DisplaySettings.displayPanSuffix) + protoAdapter.encodedSizeWithTag(3, cardDetailsProto$DisplaySettings.colorCardProductLogoUrl) + protoAdapter.encodedSizeWithTag(1, cardDetailsProto$DisplaySettings.monochromeCardProductLogoUrl) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings = (CardDetailsProto$DisplaySettings) obj;
        cardDetailsProto$DisplaySettings.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cardDetailsProto$DisplaySettings.monochromeCardProductLogoUrl;
        String str2 = cardDetailsProto$DisplaySettings.colorCardProductLogoUrl;
        String str3 = cardDetailsProto$DisplaySettings.displayPanSuffix;
        String str4 = cardDetailsProto$DisplaySettings.displayName;
        String str5 = cardDetailsProto$DisplaySettings.cardArtUrl;
        String str6 = cardDetailsProto$DisplaySettings.cardSymbolUrl;
        byteString.getClass();
        return new CardDetailsProto$DisplaySettings(str, str2, str3, str4, str5, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings = (CardDetailsProto$DisplaySettings) obj;
        cardDetailsProto$DisplaySettings.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cardDetailsProto$DisplaySettings.monochromeCardProductLogoUrl);
        protoAdapter.encodeWithTag(protoWriter, 3, cardDetailsProto$DisplaySettings.colorCardProductLogoUrl);
        protoAdapter.encodeWithTag(protoWriter, 4, cardDetailsProto$DisplaySettings.displayPanSuffix);
        protoAdapter.encodeWithTag(protoWriter, 5, cardDetailsProto$DisplaySettings.displayName);
        protoAdapter.encodeWithTag(protoWriter, 6, cardDetailsProto$DisplaySettings.cardArtUrl);
        protoAdapter.encodeWithTag(protoWriter, 7, cardDetailsProto$DisplaySettings.cardSymbolUrl);
        protoWriter.writeBytes(cardDetailsProto$DisplaySettings.unknownFields());
    }
}
