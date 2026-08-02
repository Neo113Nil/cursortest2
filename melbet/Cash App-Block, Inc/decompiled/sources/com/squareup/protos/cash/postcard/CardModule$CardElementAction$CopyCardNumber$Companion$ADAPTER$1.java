package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$CardElementAction$CopyCardNumber$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.CardElementAction.CopyCardNumber(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.CardElementAction.CopyCardNumber copyCardNumber = (CardModule.CardElementAction.CopyCardNumber) obj;
        reverseProtoWriter.getClass();
        copyCardNumber.getClass();
        reverseProtoWriter.writeBytes(copyCardNumber.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.CardElementAction.CopyCardNumber copyCardNumber = (CardModule.CardElementAction.CopyCardNumber) obj;
        copyCardNumber.getClass();
        return copyCardNumber.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((CardModule.CardElementAction.CopyCardNumber) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.CardElementAction.CopyCardNumber(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.CardElementAction.CopyCardNumber copyCardNumber = (CardModule.CardElementAction.CopyCardNumber) obj;
        copyCardNumber.getClass();
        protoWriter.writeBytes(copyCardNumber.unknownFields());
    }
}
