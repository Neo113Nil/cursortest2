package com.squareup.protos.franklin.service;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class HandleThreeDomainSecureRedirectRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HandleThreeDomainSecureRedirectRequest((RequestContext) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HandleThreeDomainSecureRedirectRequest handleThreeDomainSecureRedirectRequest = (HandleThreeDomainSecureRedirectRequest) obj;
        reverseProtoWriter.getClass();
        handleThreeDomainSecureRedirectRequest.getClass();
        reverseProtoWriter.writeBytes(handleThreeDomainSecureRedirectRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, handleThreeDomainSecureRedirectRequest.security_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, handleThreeDomainSecureRedirectRequest.transaction_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, handleThreeDomainSecureRedirectRequest.transaction_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, handleThreeDomainSecureRedirectRequest.redirect_url);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, handleThreeDomainSecureRedirectRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HandleThreeDomainSecureRedirectRequest handleThreeDomainSecureRedirectRequest = (HandleThreeDomainSecureRedirectRequest) obj;
        handleThreeDomainSecureRedirectRequest.getClass();
        int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, handleThreeDomainSecureRedirectRequest.request_context) + handleThreeDomainSecureRedirectRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, handleThreeDomainSecureRedirectRequest.security_code) + protoAdapter.encodedSizeWithTag(4, handleThreeDomainSecureRedirectRequest.transaction_id) + protoAdapter.encodedSizeWithTag(3, handleThreeDomainSecureRedirectRequest.transaction_type) + protoAdapter.encodedSizeWithTag(2, handleThreeDomainSecureRedirectRequest.redirect_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HandleThreeDomainSecureRedirectRequest handleThreeDomainSecureRedirectRequest = (HandleThreeDomainSecureRedirectRequest) obj;
        handleThreeDomainSecureRedirectRequest.getClass();
        RequestContext requestContext = handleThreeDomainSecureRedirectRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = handleThreeDomainSecureRedirectRequest.redirect_url;
        String str2 = handleThreeDomainSecureRedirectRequest.transaction_type;
        String str3 = handleThreeDomainSecureRedirectRequest.transaction_id;
        byteString.getClass();
        return new HandleThreeDomainSecureRedirectRequest(requestContext2, str, str2, str3, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HandleThreeDomainSecureRedirectRequest handleThreeDomainSecureRedirectRequest = (HandleThreeDomainSecureRedirectRequest) obj;
        handleThreeDomainSecureRedirectRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, handleThreeDomainSecureRedirectRequest.request_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, handleThreeDomainSecureRedirectRequest.redirect_url);
        protoAdapter.encodeWithTag(protoWriter, 3, handleThreeDomainSecureRedirectRequest.transaction_type);
        protoAdapter.encodeWithTag(protoWriter, 4, handleThreeDomainSecureRedirectRequest.transaction_id);
        protoAdapter.encodeWithTag(protoWriter, 5, handleThreeDomainSecureRedirectRequest.security_code);
        protoWriter.writeBytes(handleThreeDomainSecureRedirectRequest.unknownFields());
    }
}
