package com.squareup.protos.cash.postbank.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetCustomerPrimaryDdaDetailsRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCustomerPrimaryDdaDetailsRequest((RequestContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerPrimaryDdaDetailsRequest getCustomerPrimaryDdaDetailsRequest = (GetCustomerPrimaryDdaDetailsRequest) obj;
        reverseProtoWriter.getClass();
        getCustomerPrimaryDdaDetailsRequest.getClass();
        reverseProtoWriter.writeBytes(getCustomerPrimaryDdaDetailsRequest.unknownFields());
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getCustomerPrimaryDdaDetailsRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerPrimaryDdaDetailsRequest getCustomerPrimaryDdaDetailsRequest = (GetCustomerPrimaryDdaDetailsRequest) obj;
        getCustomerPrimaryDdaDetailsRequest.getClass();
        return RequestContext.ADAPTER.encodedSizeWithTag(1, getCustomerPrimaryDdaDetailsRequest.request_context) + getCustomerPrimaryDdaDetailsRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerPrimaryDdaDetailsRequest getCustomerPrimaryDdaDetailsRequest = (GetCustomerPrimaryDdaDetailsRequest) obj;
        getCustomerPrimaryDdaDetailsRequest.getClass();
        RequestContext requestContext = getCustomerPrimaryDdaDetailsRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetCustomerPrimaryDdaDetailsRequest(requestContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerPrimaryDdaDetailsRequest getCustomerPrimaryDdaDetailsRequest = (GetCustomerPrimaryDdaDetailsRequest) obj;
        getCustomerPrimaryDdaDetailsRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, getCustomerPrimaryDdaDetailsRequest.request_context);
        protoWriter.writeBytes(getCustomerPrimaryDdaDetailsRequest.unknownFields());
    }
}
