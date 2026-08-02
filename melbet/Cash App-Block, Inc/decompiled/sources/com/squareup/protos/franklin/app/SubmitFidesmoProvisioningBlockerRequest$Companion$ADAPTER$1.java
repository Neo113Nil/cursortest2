package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SubmitFidesmoProvisioningBlockerRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitFidesmoProvisioningBlockerRequest$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SubmitFidesmoProvisioningBlockerRequest((RequestContext) obj, (SubmitFidesmoProvisioningBlockerRequest.Result) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = SubmitFidesmoProvisioningBlockerRequest.Result.ADAPTER.decode(protoReader);
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
        SubmitFidesmoProvisioningBlockerRequest submitFidesmoProvisioningBlockerRequest = (SubmitFidesmoProvisioningBlockerRequest) obj;
        reverseProtoWriter.getClass();
        submitFidesmoProvisioningBlockerRequest.getClass();
        reverseProtoWriter.writeBytes(submitFidesmoProvisioningBlockerRequest.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, submitFidesmoProvisioningBlockerRequest.device_id);
        SubmitFidesmoProvisioningBlockerRequest.Result.ADAPTER.encodeWithTag(reverseProtoWriter, 2, submitFidesmoProvisioningBlockerRequest.result);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitFidesmoProvisioningBlockerRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitFidesmoProvisioningBlockerRequest submitFidesmoProvisioningBlockerRequest = (SubmitFidesmoProvisioningBlockerRequest) obj;
        submitFidesmoProvisioningBlockerRequest.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, submitFidesmoProvisioningBlockerRequest.device_id) + SubmitFidesmoProvisioningBlockerRequest.Result.ADAPTER.encodedSizeWithTag(2, submitFidesmoProvisioningBlockerRequest.result) + RequestContext.ADAPTER.encodedSizeWithTag(1, submitFidesmoProvisioningBlockerRequest.request_context) + submitFidesmoProvisioningBlockerRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitFidesmoProvisioningBlockerRequest submitFidesmoProvisioningBlockerRequest = (SubmitFidesmoProvisioningBlockerRequest) obj;
        submitFidesmoProvisioningBlockerRequest.getClass();
        RequestContext requestContext = submitFidesmoProvisioningBlockerRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SubmitFidesmoProvisioningBlockerRequest.Result result = submitFidesmoProvisioningBlockerRequest.result;
        String str = submitFidesmoProvisioningBlockerRequest.device_id;
        byteString.getClass();
        return new SubmitFidesmoProvisioningBlockerRequest(requestContext2, result, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitFidesmoProvisioningBlockerRequest submitFidesmoProvisioningBlockerRequest = (SubmitFidesmoProvisioningBlockerRequest) obj;
        submitFidesmoProvisioningBlockerRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, submitFidesmoProvisioningBlockerRequest.request_context);
        SubmitFidesmoProvisioningBlockerRequest.Result.ADAPTER.encodeWithTag(protoWriter, 2, submitFidesmoProvisioningBlockerRequest.result);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, submitFidesmoProvisioningBlockerRequest.device_id);
        protoWriter.writeBytes(submitFidesmoProvisioningBlockerRequest.unknownFields());
    }
}
