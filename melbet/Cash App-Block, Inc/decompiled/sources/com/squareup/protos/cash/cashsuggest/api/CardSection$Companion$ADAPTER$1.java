package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.CardSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardSection(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CardSection.CardItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSection cardSection = (CardSection) obj;
        reverseProtoWriter.getClass();
        cardSection.getClass();
        reverseProtoWriter.writeBytes(cardSection.unknownFields());
        CardSection.CardItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, cardSection.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSection cardSection = (CardSection) obj;
        cardSection.getClass();
        return CardSection.CardItem.ADAPTER.asRepeated().encodedSizeWithTag(1, cardSection.items) + cardSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardSection cardSection = (CardSection) obj;
        cardSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cardSection.items, CardSection.CardItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardSection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSection cardSection = (CardSection) obj;
        cardSection.getClass();
        CardSection.CardItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, cardSection.items);
        protoWriter.writeBytes(cardSection.unknownFields());
    }
}
