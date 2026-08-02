package com.squareup.protos.cash.usher.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.usher.api.GetPreSignInDataRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetPreSignInDataRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPreSignInDataRequest((GetPreSignInDataRequest.ClientDeepLinkContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GetPreSignInDataRequest.ClientDeepLinkContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPreSignInDataRequest getPreSignInDataRequest = (GetPreSignInDataRequest) obj;
        reverseProtoWriter.getClass();
        getPreSignInDataRequest.getClass();
        reverseProtoWriter.writeBytes(getPreSignInDataRequest.unknownFields());
        GetPreSignInDataRequest.ClientDeepLinkContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getPreSignInDataRequest.client_deep_link_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPreSignInDataRequest getPreSignInDataRequest = (GetPreSignInDataRequest) obj;
        getPreSignInDataRequest.getClass();
        return GetPreSignInDataRequest.ClientDeepLinkContext.ADAPTER.encodedSizeWithTag(1, getPreSignInDataRequest.client_deep_link_context) + getPreSignInDataRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPreSignInDataRequest getPreSignInDataRequest = (GetPreSignInDataRequest) obj;
        getPreSignInDataRequest.getClass();
        GetPreSignInDataRequest.ClientDeepLinkContext clientDeepLinkContext = getPreSignInDataRequest.client_deep_link_context;
        GetPreSignInDataRequest.ClientDeepLinkContext clientDeepLinkContext2 = clientDeepLinkContext != null ? (GetPreSignInDataRequest.ClientDeepLinkContext) GetPreSignInDataRequest.ClientDeepLinkContext.ADAPTER.redact(clientDeepLinkContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetPreSignInDataRequest(clientDeepLinkContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPreSignInDataRequest getPreSignInDataRequest = (GetPreSignInDataRequest) obj;
        getPreSignInDataRequest.getClass();
        GetPreSignInDataRequest.ClientDeepLinkContext.ADAPTER.encodeWithTag(protoWriter, 1, getPreSignInDataRequest.client_deep_link_context);
        protoWriter.writeBytes(getPreSignInDataRequest.unknownFields());
    }
}
