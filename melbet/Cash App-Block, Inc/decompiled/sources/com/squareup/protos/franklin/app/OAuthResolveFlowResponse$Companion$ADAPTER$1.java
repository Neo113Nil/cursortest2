package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.OAuthResolveFlowResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OAuthResolveFlowResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OAuthResolveFlowResponse((ResponseContext) obj, (OAuthResolveFlowResponse.Status) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = OAuthResolveFlowResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OAuthResolveFlowResponse oAuthResolveFlowResponse = (OAuthResolveFlowResponse) obj;
        reverseProtoWriter.getClass();
        oAuthResolveFlowResponse.getClass();
        reverseProtoWriter.writeBytes(oAuthResolveFlowResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, oAuthResolveFlowResponse.instrument_link_token);
        OAuthResolveFlowResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, oAuthResolveFlowResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, oAuthResolveFlowResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OAuthResolveFlowResponse oAuthResolveFlowResponse = (OAuthResolveFlowResponse) obj;
        oAuthResolveFlowResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(4, oAuthResolveFlowResponse.instrument_link_token) + OAuthResolveFlowResponse.Status.ADAPTER.encodedSizeWithTag(2, oAuthResolveFlowResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(1, oAuthResolveFlowResponse.response_context) + oAuthResolveFlowResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OAuthResolveFlowResponse oAuthResolveFlowResponse = (OAuthResolveFlowResponse) obj;
        oAuthResolveFlowResponse.getClass();
        ResponseContext responseContext = oAuthResolveFlowResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        OAuthResolveFlowResponse.Status status = oAuthResolveFlowResponse.status;
        String str = oAuthResolveFlowResponse.instrument_link_token;
        byteString.getClass();
        return new OAuthResolveFlowResponse(responseContext2, status, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OAuthResolveFlowResponse oAuthResolveFlowResponse = (OAuthResolveFlowResponse) obj;
        oAuthResolveFlowResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, oAuthResolveFlowResponse.response_context);
        OAuthResolveFlowResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, oAuthResolveFlowResponse.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, oAuthResolveFlowResponse.instrument_link_token);
        protoWriter.writeBytes(oAuthResolveFlowResponse.unknownFields());
    }
}
