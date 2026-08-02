package com.squareup.protos.cash.aegis.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AddOrWithdrawMoneyForManagedAccountResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AddOrWithdrawMoneyForManagedAccountResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        AddOrWithdrawMoneyForManagedAccountResponse addOrWithdrawMoneyForManagedAccountResponse = (AddOrWithdrawMoneyForManagedAccountResponse) obj;
        reverseProtoWriter.getClass();
        addOrWithdrawMoneyForManagedAccountResponse.getClass();
        reverseProtoWriter.writeBytes(addOrWithdrawMoneyForManagedAccountResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, addOrWithdrawMoneyForManagedAccountResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddOrWithdrawMoneyForManagedAccountResponse addOrWithdrawMoneyForManagedAccountResponse = (AddOrWithdrawMoneyForManagedAccountResponse) obj;
        addOrWithdrawMoneyForManagedAccountResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, addOrWithdrawMoneyForManagedAccountResponse.response_context) + addOrWithdrawMoneyForManagedAccountResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddOrWithdrawMoneyForManagedAccountResponse addOrWithdrawMoneyForManagedAccountResponse = (AddOrWithdrawMoneyForManagedAccountResponse) obj;
        addOrWithdrawMoneyForManagedAccountResponse.getClass();
        ResponseContext responseContext = addOrWithdrawMoneyForManagedAccountResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AddOrWithdrawMoneyForManagedAccountResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddOrWithdrawMoneyForManagedAccountResponse addOrWithdrawMoneyForManagedAccountResponse = (AddOrWithdrawMoneyForManagedAccountResponse) obj;
        addOrWithdrawMoneyForManagedAccountResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, addOrWithdrawMoneyForManagedAccountResponse.response_context);
        protoWriter.writeBytes(addOrWithdrawMoneyForManagedAccountResponse.unknownFields());
    }
}
