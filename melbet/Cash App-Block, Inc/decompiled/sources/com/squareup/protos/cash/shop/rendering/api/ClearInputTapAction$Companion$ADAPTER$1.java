package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClearInputTapAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClearInputTapAction(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClearInputTapAction clearInputTapAction = (ClearInputTapAction) obj;
        reverseProtoWriter.getClass();
        clearInputTapAction.getClass();
        reverseProtoWriter.writeBytes(clearInputTapAction.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClearInputTapAction clearInputTapAction = (ClearInputTapAction) obj;
        clearInputTapAction.getClass();
        return clearInputTapAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ClearInputTapAction) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ClearInputTapAction(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClearInputTapAction clearInputTapAction = (ClearInputTapAction) obj;
        clearInputTapAction.getClass();
        protoWriter.writeBytes(clearInputTapAction.unknownFields());
    }
}
