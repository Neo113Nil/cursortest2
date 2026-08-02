package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardSeriesContainer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardSeriesContainer(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ComponentElement.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSeriesContainer cardSeriesContainer = (CardSeriesContainer) obj;
        reverseProtoWriter.getClass();
        cardSeriesContainer.getClass();
        reverseProtoWriter.writeBytes(cardSeriesContainer.unknownFields());
        ComponentElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, cardSeriesContainer.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSeriesContainer cardSeriesContainer = (CardSeriesContainer) obj;
        cardSeriesContainer.getClass();
        return ComponentElement.ADAPTER.asRepeated().encodedSizeWithTag(1, cardSeriesContainer.items) + cardSeriesContainer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardSeriesContainer cardSeriesContainer = (CardSeriesContainer) obj;
        cardSeriesContainer.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cardSeriesContainer.items, ComponentElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardSeriesContainer(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSeriesContainer cardSeriesContainer = (CardSeriesContainer) obj;
        cardSeriesContainer.getClass();
        ComponentElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, cardSeriesContainer.items);
        protoWriter.writeBytes(cardSeriesContainer.unknownFields());
    }
}
