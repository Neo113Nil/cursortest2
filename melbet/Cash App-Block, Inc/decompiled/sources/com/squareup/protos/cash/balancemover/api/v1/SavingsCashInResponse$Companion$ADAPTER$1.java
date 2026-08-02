package com.squareup.protos.cash.balancemover.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SavingsCashInResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsCashInResponse((ResponseContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsCashInResponse savingsCashInResponse = (SavingsCashInResponse) obj;
        reverseProtoWriter.getClass();
        savingsCashInResponse.getClass();
        reverseProtoWriter.writeBytes(savingsCashInResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, savingsCashInResponse.passcode_token);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, savingsCashInResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsCashInResponse savingsCashInResponse = (SavingsCashInResponse) obj;
        savingsCashInResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, savingsCashInResponse.passcode_token) + ResponseContext.ADAPTER.encodedSizeWithTag(1, savingsCashInResponse.response_context) + savingsCashInResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsCashInResponse savingsCashInResponse = (SavingsCashInResponse) obj;
        savingsCashInResponse.getClass();
        ResponseContext responseContext = savingsCashInResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = savingsCashInResponse.passcode_token;
        byteString.getClass();
        return new SavingsCashInResponse(responseContext2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsCashInResponse savingsCashInResponse = (SavingsCashInResponse) obj;
        savingsCashInResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, savingsCashInResponse.response_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, savingsCashInResponse.passcode_token);
        protoWriter.writeBytes(savingsCashInResponse.unknownFields());
    }
}
