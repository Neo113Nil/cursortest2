package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class InitiateSessionRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitiateSessionRequest((ByteString) obj, (String) obj2, (ClientSecurityContext) obj3, (String) obj4, (String) obj5, (RequestContext) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.BYTES.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(ClientSecurityContext.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InitiateSessionRequest initiateSessionRequest = (InitiateSessionRequest) obj;
        reverseProtoWriter.getClass();
        initiateSessionRequest.getClass();
        reverseProtoWriter.writeBytes(initiateSessionRequest.unknownFields());
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, initiateSessionRequest.request_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, initiateSessionRequest.device_locale_country);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, initiateSessionRequest.device_locales);
        ClientSecurityContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, initiateSessionRequest.client_security_context);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, initiateSessionRequest.backup_tag);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, initiateSessionRequest.device_check_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiateSessionRequest initiateSessionRequest = (InitiateSessionRequest) obj;
        initiateSessionRequest.getClass();
        int encodedSizeWithTag = ProtoAdapter.BYTES.encodedSizeWithTag(1, initiateSessionRequest.device_check_token) + initiateSessionRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return RequestContext.ADAPTER.encodedSizeWithTag(6, initiateSessionRequest.request_context) + protoAdapter.encodedSizeWithTag(5, initiateSessionRequest.device_locale_country) + protoAdapter.encodedSizeWithTag(4, initiateSessionRequest.device_locales) + ClientSecurityContext.ADAPTER.encodedSizeWithTag(3, initiateSessionRequest.client_security_context) + protoAdapter.encodedSizeWithTag(2, initiateSessionRequest.backup_tag) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiateSessionRequest initiateSessionRequest = (InitiateSessionRequest) obj;
        initiateSessionRequest.getClass();
        ClientSecurityContext clientSecurityContext = initiateSessionRequest.client_security_context;
        ClientSecurityContext clientSecurityContext2 = clientSecurityContext != null ? (ClientSecurityContext) ClientSecurityContext.ADAPTER.redact(clientSecurityContext) : null;
        RequestContext requestContext = initiateSessionRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = initiateSessionRequest.device_locales;
        String str2 = initiateSessionRequest.device_locale_country;
        byteString.getClass();
        return new InitiateSessionRequest(null, null, clientSecurityContext2, str, str2, requestContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiateSessionRequest initiateSessionRequest = (InitiateSessionRequest) obj;
        initiateSessionRequest.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, initiateSessionRequest.device_check_token);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, initiateSessionRequest.backup_tag);
        ClientSecurityContext.ADAPTER.encodeWithTag(protoWriter, 3, initiateSessionRequest.client_security_context);
        protoAdapter.encodeWithTag(protoWriter, 4, initiateSessionRequest.device_locales);
        protoAdapter.encodeWithTag(protoWriter, 5, initiateSessionRequest.device_locale_country);
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 6, initiateSessionRequest.request_context);
        protoWriter.writeBytes(initiateSessionRequest.unknownFields());
    }
}
