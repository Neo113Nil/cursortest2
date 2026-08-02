package com.squareup.protos.cash.postbank.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetCustomerPrimaryDdaDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCustomerPrimaryDdaDetailsResponse((DdaAccountNumbers) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(DdaAccountNumbers.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerPrimaryDdaDetailsResponse getCustomerPrimaryDdaDetailsResponse = (GetCustomerPrimaryDdaDetailsResponse) obj;
        reverseProtoWriter.getClass();
        getCustomerPrimaryDdaDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(getCustomerPrimaryDdaDetailsResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getCustomerPrimaryDdaDetailsResponse.response_context);
        DdaAccountNumbers.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getCustomerPrimaryDdaDetailsResponse.dda_account_numbers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerPrimaryDdaDetailsResponse getCustomerPrimaryDdaDetailsResponse = (GetCustomerPrimaryDdaDetailsResponse) obj;
        getCustomerPrimaryDdaDetailsResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, getCustomerPrimaryDdaDetailsResponse.response_context) + DdaAccountNumbers.ADAPTER.encodedSizeWithTag(1, getCustomerPrimaryDdaDetailsResponse.dda_account_numbers) + getCustomerPrimaryDdaDetailsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerPrimaryDdaDetailsResponse getCustomerPrimaryDdaDetailsResponse = (GetCustomerPrimaryDdaDetailsResponse) obj;
        getCustomerPrimaryDdaDetailsResponse.getClass();
        DdaAccountNumbers ddaAccountNumbers = getCustomerPrimaryDdaDetailsResponse.dda_account_numbers;
        DdaAccountNumbers ddaAccountNumbers2 = ddaAccountNumbers != null ? (DdaAccountNumbers) DdaAccountNumbers.ADAPTER.redact(ddaAccountNumbers) : null;
        ResponseContext responseContext = getCustomerPrimaryDdaDetailsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetCustomerPrimaryDdaDetailsResponse(ddaAccountNumbers2, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerPrimaryDdaDetailsResponse getCustomerPrimaryDdaDetailsResponse = (GetCustomerPrimaryDdaDetailsResponse) obj;
        getCustomerPrimaryDdaDetailsResponse.getClass();
        DdaAccountNumbers.ADAPTER.encodeWithTag(protoWriter, 1, getCustomerPrimaryDdaDetailsResponse.dda_account_numbers);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, getCustomerPrimaryDdaDetailsResponse.response_context);
        protoWriter.writeBytes(getCustomerPrimaryDdaDetailsResponse.unknownFields());
    }
}
