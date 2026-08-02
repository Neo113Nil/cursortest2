package com.squareup.protos.cash.sup.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CancelCheckoutResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CancelCheckoutResponse((Boolean) obj, (ResponseMetadata) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseMetadata.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CancelCheckoutResponse cancelCheckoutResponse = (CancelCheckoutResponse) obj;
        reverseProtoWriter.getClass();
        cancelCheckoutResponse.getClass();
        reverseProtoWriter.writeBytes(cancelCheckoutResponse.unknownFields());
        ResponseMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cancelCheckoutResponse.metadata);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, cancelCheckoutResponse.cancel_confirmed);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CancelCheckoutResponse cancelCheckoutResponse = (CancelCheckoutResponse) obj;
        cancelCheckoutResponse.getClass();
        return ResponseMetadata.ADAPTER.encodedSizeWithTag(2, cancelCheckoutResponse.metadata) + ProtoAdapter.BOOL.encodedSizeWithTag(1, cancelCheckoutResponse.cancel_confirmed) + cancelCheckoutResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CancelCheckoutResponse cancelCheckoutResponse = (CancelCheckoutResponse) obj;
        cancelCheckoutResponse.getClass();
        ResponseMetadata responseMetadata = cancelCheckoutResponse.metadata;
        ResponseMetadata responseMetadata2 = responseMetadata != null ? (ResponseMetadata) ResponseMetadata.ADAPTER.redact(responseMetadata) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = cancelCheckoutResponse.cancel_confirmed;
        byteString.getClass();
        return new CancelCheckoutResponse(bool, responseMetadata2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CancelCheckoutResponse cancelCheckoutResponse = (CancelCheckoutResponse) obj;
        cancelCheckoutResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, cancelCheckoutResponse.cancel_confirmed);
        ResponseMetadata.ADAPTER.encodeWithTag(protoWriter, 2, cancelCheckoutResponse.metadata);
        protoWriter.writeBytes(cancelCheckoutResponse.unknownFields());
    }
}
