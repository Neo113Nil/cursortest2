package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetFlowResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetFlowResponse((ClientScenario) obj2, (ResponseContext) obj, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = ClientScenario.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetFlowResponse getFlowResponse = (GetFlowResponse) obj;
        reverseProtoWriter.getClass();
        getFlowResponse.getClass();
        reverseProtoWriter.writeBytes(getFlowResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, getFlowResponse.token);
        ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getFlowResponse.client_scenario);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getFlowResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetFlowResponse getFlowResponse = (GetFlowResponse) obj;
        getFlowResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, getFlowResponse.token) + ClientScenario.ADAPTER.encodedSizeWithTag(2, getFlowResponse.client_scenario) + ResponseContext.ADAPTER.encodedSizeWithTag(1, getFlowResponse.response_context) + getFlowResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetFlowResponse getFlowResponse = (GetFlowResponse) obj;
        getFlowResponse.getClass();
        ResponseContext responseContext = getFlowResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        ClientScenario clientScenario = getFlowResponse.client_scenario;
        String str = getFlowResponse.token;
        byteString.getClass();
        return new GetFlowResponse(clientScenario, responseContext2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetFlowResponse getFlowResponse = (GetFlowResponse) obj;
        getFlowResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, getFlowResponse.response_context);
        ClientScenario.ADAPTER.encodeWithTag(protoWriter, 2, getFlowResponse.client_scenario);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getFlowResponse.token);
        protoWriter.writeBytes(getFlowResponse.unknownFields());
    }
}
