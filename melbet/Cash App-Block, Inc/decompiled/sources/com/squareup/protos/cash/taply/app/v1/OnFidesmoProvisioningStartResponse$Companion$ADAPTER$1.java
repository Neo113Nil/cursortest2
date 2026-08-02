package com.squareup.protos.cash.taply.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OnFidesmoProvisioningStartResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OnFidesmoProvisioningStartResponse((ProvisioningEligibility) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ProvisioningEligibility.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OnFidesmoProvisioningStartResponse onFidesmoProvisioningStartResponse = (OnFidesmoProvisioningStartResponse) obj;
        reverseProtoWriter.getClass();
        onFidesmoProvisioningStartResponse.getClass();
        reverseProtoWriter.writeBytes(onFidesmoProvisioningStartResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, onFidesmoProvisioningStartResponse.response_context);
        ProvisioningEligibility.ADAPTER.encodeWithTag(reverseProtoWriter, 1, onFidesmoProvisioningStartResponse.provisioning_eligibility);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OnFidesmoProvisioningStartResponse onFidesmoProvisioningStartResponse = (OnFidesmoProvisioningStartResponse) obj;
        onFidesmoProvisioningStartResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, onFidesmoProvisioningStartResponse.response_context) + ProvisioningEligibility.ADAPTER.encodedSizeWithTag(1, onFidesmoProvisioningStartResponse.provisioning_eligibility) + onFidesmoProvisioningStartResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OnFidesmoProvisioningStartResponse onFidesmoProvisioningStartResponse = (OnFidesmoProvisioningStartResponse) obj;
        onFidesmoProvisioningStartResponse.getClass();
        ProvisioningEligibility provisioningEligibility = onFidesmoProvisioningStartResponse.provisioning_eligibility;
        ProvisioningEligibility provisioningEligibility2 = provisioningEligibility != null ? (ProvisioningEligibility) ProvisioningEligibility.ADAPTER.redact(provisioningEligibility) : null;
        ResponseContext responseContext = onFidesmoProvisioningStartResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OnFidesmoProvisioningStartResponse(provisioningEligibility2, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OnFidesmoProvisioningStartResponse onFidesmoProvisioningStartResponse = (OnFidesmoProvisioningStartResponse) obj;
        onFidesmoProvisioningStartResponse.getClass();
        ProvisioningEligibility.ADAPTER.encodeWithTag(protoWriter, 1, onFidesmoProvisioningStartResponse.provisioning_eligibility);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, onFidesmoProvisioningStartResponse.response_context);
        protoWriter.writeBytes(onFidesmoProvisioningStartResponse.unknownFields());
    }
}
