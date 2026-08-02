package com.squareup.protos.cash.sup.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CancelCheckoutByPaymentTokenResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CancelCheckoutByPaymentTokenResponse((ResponseMetadata) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseMetadata.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CancelCheckoutByPaymentTokenResponse cancelCheckoutByPaymentTokenResponse = (CancelCheckoutByPaymentTokenResponse) obj;
        reverseProtoWriter.getClass();
        cancelCheckoutByPaymentTokenResponse.getClass();
        reverseProtoWriter.writeBytes(cancelCheckoutByPaymentTokenResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, cancelCheckoutByPaymentTokenResponse.sleep_duration_ms);
        ResponseMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cancelCheckoutByPaymentTokenResponse.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CancelCheckoutByPaymentTokenResponse cancelCheckoutByPaymentTokenResponse = (CancelCheckoutByPaymentTokenResponse) obj;
        cancelCheckoutByPaymentTokenResponse.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, cancelCheckoutByPaymentTokenResponse.sleep_duration_ms) + ResponseMetadata.ADAPTER.encodedSizeWithTag(1, cancelCheckoutByPaymentTokenResponse.metadata) + cancelCheckoutByPaymentTokenResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CancelCheckoutByPaymentTokenResponse cancelCheckoutByPaymentTokenResponse = (CancelCheckoutByPaymentTokenResponse) obj;
        cancelCheckoutByPaymentTokenResponse.getClass();
        ResponseMetadata responseMetadata = cancelCheckoutByPaymentTokenResponse.metadata;
        ResponseMetadata responseMetadata2 = responseMetadata != null ? (ResponseMetadata) ResponseMetadata.ADAPTER.redact(responseMetadata) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = cancelCheckoutByPaymentTokenResponse.sleep_duration_ms;
        byteString.getClass();
        return new CancelCheckoutByPaymentTokenResponse(responseMetadata2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CancelCheckoutByPaymentTokenResponse cancelCheckoutByPaymentTokenResponse = (CancelCheckoutByPaymentTokenResponse) obj;
        cancelCheckoutByPaymentTokenResponse.getClass();
        ResponseMetadata.ADAPTER.encodeWithTag(protoWriter, 1, cancelCheckoutByPaymentTokenResponse.metadata);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, cancelCheckoutByPaymentTokenResponse.sleep_duration_ms);
        protoWriter.writeBytes(cancelCheckoutByPaymentTokenResponse.unknownFields());
    }
}
