package com.squareup.protos.cash.cashliteflow.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PushProvisionGooglePayResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PushProvisionGooglePayResponse((String) obj, (ResponseContext) obj2, (PushProvisionStatus) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = PushProvisionStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PushProvisionGooglePayResponse pushProvisionGooglePayResponse = (PushProvisionGooglePayResponse) obj;
        reverseProtoWriter.getClass();
        pushProvisionGooglePayResponse.getClass();
        reverseProtoWriter.writeBytes(pushProvisionGooglePayResponse.unknownFields());
        PushProvisionStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, pushProvisionGooglePayResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, pushProvisionGooglePayResponse.response_context);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, pushProvisionGooglePayResponse.opaque_payment_card);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PushProvisionGooglePayResponse pushProvisionGooglePayResponse = (PushProvisionGooglePayResponse) obj;
        pushProvisionGooglePayResponse.getClass();
        return PushProvisionStatus.ADAPTER.encodedSizeWithTag(3, pushProvisionGooglePayResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(2, pushProvisionGooglePayResponse.response_context) + ProtoAdapter.STRING.encodedSizeWithTag(1, pushProvisionGooglePayResponse.opaque_payment_card) + pushProvisionGooglePayResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PushProvisionGooglePayResponse pushProvisionGooglePayResponse = (PushProvisionGooglePayResponse) obj;
        pushProvisionGooglePayResponse.getClass();
        ResponseContext responseContext = pushProvisionGooglePayResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        PushProvisionStatus pushProvisionStatus = pushProvisionGooglePayResponse.status;
        byteString.getClass();
        return new PushProvisionGooglePayResponse(null, responseContext2, pushProvisionStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PushProvisionGooglePayResponse pushProvisionGooglePayResponse = (PushProvisionGooglePayResponse) obj;
        pushProvisionGooglePayResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushProvisionGooglePayResponse.opaque_payment_card);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, pushProvisionGooglePayResponse.response_context);
        PushProvisionStatus.ADAPTER.encodeWithTag(protoWriter, 3, pushProvisionGooglePayResponse.status);
        protoWriter.writeBytes(pushProvisionGooglePayResponse.unknownFields());
    }
}
