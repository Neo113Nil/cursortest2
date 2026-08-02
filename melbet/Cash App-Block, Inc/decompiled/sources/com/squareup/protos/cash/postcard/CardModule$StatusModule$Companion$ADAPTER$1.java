package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$StatusModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.StatusModule((CardModule.StatusElement) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardModule.StatusElement.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.StatusModule statusModule = (CardModule.StatusModule) obj;
        reverseProtoWriter.getClass();
        statusModule.getClass();
        reverseProtoWriter.writeBytes(statusModule.unknownFields());
        CardModule.StatusElement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, statusModule.element);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.StatusModule statusModule = (CardModule.StatusModule) obj;
        statusModule.getClass();
        return CardModule.StatusElement.ADAPTER.encodedSizeWithTag(1, statusModule.element) + statusModule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.StatusModule statusModule = (CardModule.StatusModule) obj;
        statusModule.getClass();
        CardModule.StatusElement statusElement = statusModule.element;
        CardModule.StatusElement statusElement2 = statusElement != null ? (CardModule.StatusElement) CardModule.StatusElement.ADAPTER.redact(statusElement) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.StatusModule(statusElement2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.StatusModule statusModule = (CardModule.StatusModule) obj;
        statusModule.getClass();
        CardModule.StatusElement.ADAPTER.encodeWithTag(protoWriter, 1, statusModule.element);
        protoWriter.writeBytes(statusModule.unknownFields());
    }
}
