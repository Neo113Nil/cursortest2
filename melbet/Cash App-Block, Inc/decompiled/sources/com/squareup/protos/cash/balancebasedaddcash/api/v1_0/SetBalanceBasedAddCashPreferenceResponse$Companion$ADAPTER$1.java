package com.squareup.protos.cash.balancebasedaddcash.api.v1_0;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetBalanceBasedAddCashPreferenceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetBalanceBasedAddCashPreferenceResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SetBalanceBasedAddCashPreferenceResponse setBalanceBasedAddCashPreferenceResponse = (SetBalanceBasedAddCashPreferenceResponse) obj;
        reverseProtoWriter.getClass();
        setBalanceBasedAddCashPreferenceResponse.getClass();
        reverseProtoWriter.writeBytes(setBalanceBasedAddCashPreferenceResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setBalanceBasedAddCashPreferenceResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetBalanceBasedAddCashPreferenceResponse setBalanceBasedAddCashPreferenceResponse = (SetBalanceBasedAddCashPreferenceResponse) obj;
        setBalanceBasedAddCashPreferenceResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, setBalanceBasedAddCashPreferenceResponse.response_context) + setBalanceBasedAddCashPreferenceResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetBalanceBasedAddCashPreferenceResponse setBalanceBasedAddCashPreferenceResponse = (SetBalanceBasedAddCashPreferenceResponse) obj;
        setBalanceBasedAddCashPreferenceResponse.getClass();
        ResponseContext responseContext = setBalanceBasedAddCashPreferenceResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetBalanceBasedAddCashPreferenceResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetBalanceBasedAddCashPreferenceResponse setBalanceBasedAddCashPreferenceResponse = (SetBalanceBasedAddCashPreferenceResponse) obj;
        setBalanceBasedAddCashPreferenceResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, setBalanceBasedAddCashPreferenceResponse.response_context);
        protoWriter.writeBytes(setBalanceBasedAddCashPreferenceResponse.unknownFields());
    }
}
