package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.protos.cash.discover.api.app.v1.model.TextCardSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TextCardSection$OverflowCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TextCardSection.OverflowCard((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TextCardSection.OverflowCard overflowCard = (TextCardSection.OverflowCard) obj;
        reverseProtoWriter.getClass();
        overflowCard.getClass();
        reverseProtoWriter.writeBytes(overflowCard.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, overflowCard.screen_header_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, overflowCard.prompt_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TextCardSection.OverflowCard overflowCard = (TextCardSection.OverflowCard) obj;
        overflowCard.getClass();
        int size$okio = overflowCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, overflowCard.screen_header_text) + protoAdapter.encodedSizeWithTag(1, overflowCard.prompt_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TextCardSection.OverflowCard overflowCard = (TextCardSection.OverflowCard) obj;
        overflowCard.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = overflowCard.prompt_text;
        String str2 = overflowCard.screen_header_text;
        byteString.getClass();
        return new TextCardSection.OverflowCard(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TextCardSection.OverflowCard overflowCard = (TextCardSection.OverflowCard) obj;
        overflowCard.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, overflowCard.prompt_text);
        protoAdapter.encodeWithTag(protoWriter, 2, overflowCard.screen_header_text);
        protoWriter.writeBytes(overflowCard.unknownFields());
    }
}
