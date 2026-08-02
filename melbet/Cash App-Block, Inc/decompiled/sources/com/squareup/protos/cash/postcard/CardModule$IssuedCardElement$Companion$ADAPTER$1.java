package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$IssuedCardElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.IssuedCardElement((CardModule.Button) obj, (CardModule.Button) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardModule.Button.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(CardModule.Button.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.IssuedCardElement issuedCardElement = (CardModule.IssuedCardElement) obj;
        reverseProtoWriter.getClass();
        issuedCardElement.getClass();
        reverseProtoWriter.writeBytes(issuedCardElement.unknownFields());
        ProtoAdapter protoAdapter = CardModule.Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, issuedCardElement.right_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, issuedCardElement.left_button);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.IssuedCardElement issuedCardElement = (CardModule.IssuedCardElement) obj;
        issuedCardElement.getClass();
        int size$okio = issuedCardElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = CardModule.Button.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, issuedCardElement.right_button) + protoAdapter.encodedSizeWithTag(1, issuedCardElement.left_button) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.IssuedCardElement issuedCardElement = (CardModule.IssuedCardElement) obj;
        issuedCardElement.getClass();
        CardModule.Button button = issuedCardElement.left_button;
        CardModule.Button button2 = button != null ? (CardModule.Button) CardModule.Button.ADAPTER.redact(button) : null;
        CardModule.Button button3 = issuedCardElement.right_button;
        CardModule.Button button4 = button3 != null ? (CardModule.Button) CardModule.Button.ADAPTER.redact(button3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.IssuedCardElement(button2, button4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.IssuedCardElement issuedCardElement = (CardModule.IssuedCardElement) obj;
        issuedCardElement.getClass();
        ProtoAdapter protoAdapter = CardModule.Button.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, issuedCardElement.left_button);
        protoAdapter.encodeWithTag(protoWriter, 2, issuedCardElement.right_button);
        protoWriter.writeBytes(issuedCardElement.unknownFields());
    }
}
