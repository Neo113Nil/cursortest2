package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TransferFundsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TransferFundsResponse((ResponseContext) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 5) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransferFundsResponse transferFundsResponse = (TransferFundsResponse) obj;
        reverseProtoWriter.getClass();
        transferFundsResponse.getClass();
        reverseProtoWriter.writeBytes(transferFundsResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, transferFundsResponse.status_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, transferFundsResponse.passcode_token);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, transferFundsResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransferFundsResponse transferFundsResponse = (TransferFundsResponse) obj;
        transferFundsResponse.getClass();
        int encodedSizeWithTag = ResponseContext.ADAPTER.encodedSizeWithTag(7, transferFundsResponse.response_context) + transferFundsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, transferFundsResponse.status_text) + protoAdapter.encodedSizeWithTag(3, transferFundsResponse.passcode_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TransferFundsResponse transferFundsResponse = (TransferFundsResponse) obj;
        transferFundsResponse.getClass();
        ResponseContext responseContext = transferFundsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = transferFundsResponse.status_text;
        byteString.getClass();
        return new TransferFundsResponse(responseContext2, null, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransferFundsResponse transferFundsResponse = (TransferFundsResponse) obj;
        transferFundsResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 7, transferFundsResponse.response_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, transferFundsResponse.passcode_token);
        protoAdapter.encodeWithTag(protoWriter, 5, transferFundsResponse.status_text);
        protoWriter.writeBytes(transferFundsResponse.unknownFields());
    }
}
