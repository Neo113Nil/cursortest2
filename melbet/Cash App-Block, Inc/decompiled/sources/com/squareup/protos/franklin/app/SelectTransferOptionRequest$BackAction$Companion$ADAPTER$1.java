package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SelectTransferOptionRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SelectTransferOptionRequest$BackAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectTransferOptionRequest.BackAction(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SelectTransferOptionRequest.BackAction backAction = (SelectTransferOptionRequest.BackAction) obj;
        reverseProtoWriter.getClass();
        backAction.getClass();
        reverseProtoWriter.writeBytes(backAction.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectTransferOptionRequest.BackAction backAction = (SelectTransferOptionRequest.BackAction) obj;
        backAction.getClass();
        return backAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SelectTransferOptionRequest.BackAction) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SelectTransferOptionRequest.BackAction(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectTransferOptionRequest.BackAction backAction = (SelectTransferOptionRequest.BackAction) obj;
        backAction.getClass();
        protoWriter.writeBytes(backAction.unknownFields());
    }
}
