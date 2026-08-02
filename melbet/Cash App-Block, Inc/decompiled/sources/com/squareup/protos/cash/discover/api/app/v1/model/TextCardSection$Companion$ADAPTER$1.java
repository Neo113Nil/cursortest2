package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.TextCardSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TextCardSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TextCardSection(m, (Integer) obj, (TextCardSection.OverflowCard) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(TextCardSection.TextCard.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(TextCardSection.OverflowCard.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TextCardSection textCardSection = (TextCardSection) obj;
        reverseProtoWriter.getClass();
        textCardSection.getClass();
        reverseProtoWriter.writeBytes(textCardSection.unknownFields());
        TextCardSection.OverflowCard.ADAPTER.encodeWithTag(reverseProtoWriter, 3, textCardSection.overflow);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, textCardSection.max_items);
        TextCardSection.TextCard.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, textCardSection.cards);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TextCardSection textCardSection = (TextCardSection) obj;
        textCardSection.getClass();
        return TextCardSection.OverflowCard.ADAPTER.encodedSizeWithTag(3, textCardSection.overflow) + ProtoAdapter.INT32.encodedSizeWithTag(2, textCardSection.max_items) + TextCardSection.TextCard.ADAPTER.asRepeated().encodedSizeWithTag(1, textCardSection.cards) + textCardSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TextCardSection textCardSection = (TextCardSection) obj;
        textCardSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(textCardSection.cards, TextCardSection.TextCard.ADAPTER);
        TextCardSection.OverflowCard overflowCard = textCardSection.overflow;
        TextCardSection.OverflowCard overflowCard2 = overflowCard != null ? (TextCardSection.OverflowCard) TextCardSection.OverflowCard.ADAPTER.redact(overflowCard) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = textCardSection.max_items;
        byteString.getClass();
        return new TextCardSection(m1169redactElements, num, overflowCard2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TextCardSection textCardSection = (TextCardSection) obj;
        textCardSection.getClass();
        TextCardSection.TextCard.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, textCardSection.cards);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, textCardSection.max_items);
        TextCardSection.OverflowCard.ADAPTER.encodeWithTag(protoWriter, 3, textCardSection.overflow);
        protoWriter.writeBytes(textCardSection.unknownFields());
    }
}
