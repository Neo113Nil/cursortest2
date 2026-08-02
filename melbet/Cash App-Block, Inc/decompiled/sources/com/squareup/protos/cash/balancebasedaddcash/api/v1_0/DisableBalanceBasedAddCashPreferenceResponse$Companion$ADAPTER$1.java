package com.squareup.protos.cash.balancebasedaddcash.api.v1_0;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DisableBalanceBasedAddCashPreferenceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DisableBalanceBasedAddCashPreferenceResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        DisableBalanceBasedAddCashPreferenceResponse disableBalanceBasedAddCashPreferenceResponse = (DisableBalanceBasedAddCashPreferenceResponse) obj;
        reverseProtoWriter.getClass();
        disableBalanceBasedAddCashPreferenceResponse.getClass();
        reverseProtoWriter.writeBytes(disableBalanceBasedAddCashPreferenceResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, disableBalanceBasedAddCashPreferenceResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DisableBalanceBasedAddCashPreferenceResponse disableBalanceBasedAddCashPreferenceResponse = (DisableBalanceBasedAddCashPreferenceResponse) obj;
        disableBalanceBasedAddCashPreferenceResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, disableBalanceBasedAddCashPreferenceResponse.response_context) + disableBalanceBasedAddCashPreferenceResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DisableBalanceBasedAddCashPreferenceResponse disableBalanceBasedAddCashPreferenceResponse = (DisableBalanceBasedAddCashPreferenceResponse) obj;
        disableBalanceBasedAddCashPreferenceResponse.getClass();
        ResponseContext responseContext = disableBalanceBasedAddCashPreferenceResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DisableBalanceBasedAddCashPreferenceResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DisableBalanceBasedAddCashPreferenceResponse disableBalanceBasedAddCashPreferenceResponse = (DisableBalanceBasedAddCashPreferenceResponse) obj;
        disableBalanceBasedAddCashPreferenceResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, disableBalanceBasedAddCashPreferenceResponse.response_context);
        protoWriter.writeBytes(disableBalanceBasedAddCashPreferenceResponse.unknownFields());
    }
}
