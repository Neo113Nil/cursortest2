package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardScheme$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardScheme(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CardModule.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardScheme cardScheme = (CardScheme) obj;
        reverseProtoWriter.getClass();
        cardScheme.getClass();
        reverseProtoWriter.writeBytes(cardScheme.unknownFields());
        CardModule.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, cardScheme.modules);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardScheme cardScheme = (CardScheme) obj;
        cardScheme.getClass();
        return CardModule.ADAPTER.asRepeated().encodedSizeWithTag(1, cardScheme.modules) + cardScheme.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardScheme cardScheme = (CardScheme) obj;
        cardScheme.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cardScheme.modules, CardModule.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardScheme(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardScheme cardScheme = (CardScheme) obj;
        cardScheme.getClass();
        CardModule.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, cardScheme.modules);
        protoWriter.writeBytes(cardScheme.unknownFields());
    }
}
