package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$LineItemModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.LineItemModule((CardModule.LineItemElement) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardModule.LineItemElement.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.LineItemModule lineItemModule = (CardModule.LineItemModule) obj;
        reverseProtoWriter.getClass();
        lineItemModule.getClass();
        reverseProtoWriter.writeBytes(lineItemModule.unknownFields());
        CardModule.LineItemElement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, lineItemModule.element);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.LineItemModule lineItemModule = (CardModule.LineItemModule) obj;
        lineItemModule.getClass();
        return CardModule.LineItemElement.ADAPTER.encodedSizeWithTag(1, lineItemModule.element) + lineItemModule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.LineItemModule lineItemModule = (CardModule.LineItemModule) obj;
        lineItemModule.getClass();
        CardModule.LineItemElement lineItemElement = lineItemModule.element;
        CardModule.LineItemElement lineItemElement2 = lineItemElement != null ? (CardModule.LineItemElement) CardModule.LineItemElement.ADAPTER.redact(lineItemElement) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.LineItemModule(lineItemElement2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.LineItemModule lineItemModule = (CardModule.LineItemModule) obj;
        lineItemModule.getClass();
        CardModule.LineItemElement.ADAPTER.encodeWithTag(protoWriter, 1, lineItemModule.element);
        protoWriter.writeBytes(lineItemModule.unknownFields());
    }
}
