package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$DividerModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.DividerModule(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.DividerModule dividerModule = (CardModule.DividerModule) obj;
        reverseProtoWriter.getClass();
        dividerModule.getClass();
        reverseProtoWriter.writeBytes(dividerModule.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.DividerModule dividerModule = (CardModule.DividerModule) obj;
        dividerModule.getClass();
        return dividerModule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((CardModule.DividerModule) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.DividerModule(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.DividerModule dividerModule = (CardModule.DividerModule) obj;
        dividerModule.getClass();
        protoWriter.writeBytes(dividerModule.unknownFields());
    }
}
