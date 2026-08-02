package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetBitcoinDisplayPreferenceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetBitcoinDisplayPreferenceResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetBitcoinDisplayPreferenceResponse setBitcoinDisplayPreferenceResponse = (SetBitcoinDisplayPreferenceResponse) obj;
        reverseProtoWriter.getClass();
        setBitcoinDisplayPreferenceResponse.getClass();
        reverseProtoWriter.writeBytes(setBitcoinDisplayPreferenceResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setBitcoinDisplayPreferenceResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetBitcoinDisplayPreferenceResponse setBitcoinDisplayPreferenceResponse = (SetBitcoinDisplayPreferenceResponse) obj;
        setBitcoinDisplayPreferenceResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, setBitcoinDisplayPreferenceResponse.response_context) + setBitcoinDisplayPreferenceResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetBitcoinDisplayPreferenceResponse setBitcoinDisplayPreferenceResponse = (SetBitcoinDisplayPreferenceResponse) obj;
        setBitcoinDisplayPreferenceResponse.getClass();
        ResponseContext responseContext = setBitcoinDisplayPreferenceResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetBitcoinDisplayPreferenceResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetBitcoinDisplayPreferenceResponse setBitcoinDisplayPreferenceResponse = (SetBitcoinDisplayPreferenceResponse) obj;
        setBitcoinDisplayPreferenceResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, setBitcoinDisplayPreferenceResponse.response_context);
        protoWriter.writeBytes(setBitcoinDisplayPreferenceResponse.unknownFields());
    }
}
