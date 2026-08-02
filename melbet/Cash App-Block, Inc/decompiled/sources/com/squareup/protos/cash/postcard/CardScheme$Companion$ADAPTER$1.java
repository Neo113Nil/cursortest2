package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CardScheme$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardScheme(m, arrayList, (CardHomeActions) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CardModule.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(CardModule.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(CardHomeActions.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardScheme cardScheme = (CardScheme) obj;
        reverseProtoWriter.getClass();
        cardScheme.getClass();
        reverseProtoWriter.writeBytes(cardScheme.unknownFields());
        CardHomeActions.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cardScheme.card_home_actions);
        ProtoAdapter protoAdapter = CardModule.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, cardScheme.overflow_modules);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, cardScheme.modules);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardScheme cardScheme = (CardScheme) obj;
        cardScheme.getClass();
        int size$okio = cardScheme.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = CardModule.ADAPTER;
        return CardHomeActions.ADAPTER.encodedSizeWithTag(3, cardScheme.card_home_actions) + protoAdapter.asRepeated().encodedSizeWithTag(2, cardScheme.overflow_modules) + protoAdapter.asRepeated().encodedSizeWithTag(1, cardScheme.modules) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardScheme cardScheme = (CardScheme) obj;
        cardScheme.getClass();
        List list = cardScheme.modules;
        ProtoAdapter protoAdapter = CardModule.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(cardScheme.overflow_modules, protoAdapter);
        CardHomeActions cardHomeActions = cardScheme.card_home_actions;
        CardHomeActions cardHomeActions2 = cardHomeActions != null ? (CardHomeActions) CardHomeActions.ADAPTER.redact(cardHomeActions) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardScheme(m1169redactElements, m1169redactElements2, cardHomeActions2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardScheme cardScheme = (CardScheme) obj;
        cardScheme.getClass();
        ProtoAdapter protoAdapter = CardModule.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, cardScheme.modules);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, cardScheme.overflow_modules);
        CardHomeActions.ADAPTER.encodeWithTag(protoWriter, 3, cardScheme.card_home_actions);
        protoWriter.writeBytes(cardScheme.unknownFields());
    }
}
