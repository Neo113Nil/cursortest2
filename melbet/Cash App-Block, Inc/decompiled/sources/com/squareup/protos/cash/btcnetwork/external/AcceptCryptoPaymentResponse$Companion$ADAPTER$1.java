package com.squareup.protos.cash.btcnetwork.external;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AcceptCryptoPaymentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        ResponseContext responseContext = (ResponseContext) obj;
        if (responseContext != null) {
            return new AcceptCryptoPaymentResponse(responseContext, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "response_context");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AcceptCryptoPaymentResponse acceptCryptoPaymentResponse = (AcceptCryptoPaymentResponse) obj;
        reverseProtoWriter.getClass();
        acceptCryptoPaymentResponse.getClass();
        reverseProtoWriter.writeBytes(acceptCryptoPaymentResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, acceptCryptoPaymentResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AcceptCryptoPaymentResponse acceptCryptoPaymentResponse = (AcceptCryptoPaymentResponse) obj;
        acceptCryptoPaymentResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(3, acceptCryptoPaymentResponse.response_context) + acceptCryptoPaymentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AcceptCryptoPaymentResponse acceptCryptoPaymentResponse = (AcceptCryptoPaymentResponse) obj;
        acceptCryptoPaymentResponse.getClass();
        ResponseContext responseContext = (ResponseContext) ResponseContext.ADAPTER.redact(acceptCryptoPaymentResponse.response_context);
        ByteString byteString = ByteString.EMPTY;
        responseContext.getClass();
        byteString.getClass();
        return new AcceptCryptoPaymentResponse(responseContext, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AcceptCryptoPaymentResponse acceptCryptoPaymentResponse = (AcceptCryptoPaymentResponse) obj;
        acceptCryptoPaymentResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 3, acceptCryptoPaymentResponse.response_context);
        protoWriter.writeBytes(acceptCryptoPaymentResponse.unknownFields());
    }
}
