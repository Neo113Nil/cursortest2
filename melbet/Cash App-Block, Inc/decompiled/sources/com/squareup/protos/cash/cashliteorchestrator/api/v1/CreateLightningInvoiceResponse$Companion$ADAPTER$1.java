package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateLightningInvoiceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CreateLightningInvoiceResponse((String) obj, (String) obj2, (LightningReceiveArtifact) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LightningReceiveArtifact.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateLightningInvoiceResponse createLightningInvoiceResponse = (CreateLightningInvoiceResponse) obj;
        reverseProtoWriter.getClass();
        createLightningInvoiceResponse.getClass();
        reverseProtoWriter.writeBytes(createLightningInvoiceResponse.unknownFields());
        LightningReceiveArtifact.ADAPTER.encodeWithTag(reverseProtoWriter, 3, createLightningInvoiceResponse.lightning);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, createLightningInvoiceResponse.idempotency_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, createLightningInvoiceResponse.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateLightningInvoiceResponse createLightningInvoiceResponse = (CreateLightningInvoiceResponse) obj;
        createLightningInvoiceResponse.getClass();
        int size$okio = createLightningInvoiceResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LightningReceiveArtifact.ADAPTER.encodedSizeWithTag(3, createLightningInvoiceResponse.lightning) + protoAdapter.encodedSizeWithTag(2, createLightningInvoiceResponse.idempotency_token) + protoAdapter.encodedSizeWithTag(1, createLightningInvoiceResponse.customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateLightningInvoiceResponse createLightningInvoiceResponse = (CreateLightningInvoiceResponse) obj;
        createLightningInvoiceResponse.getClass();
        LightningReceiveArtifact lightningReceiveArtifact = createLightningInvoiceResponse.lightning;
        LightningReceiveArtifact lightningReceiveArtifact2 = lightningReceiveArtifact != null ? (LightningReceiveArtifact) LightningReceiveArtifact.ADAPTER.redact(lightningReceiveArtifact) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = createLightningInvoiceResponse.customer_token;
        String str2 = createLightningInvoiceResponse.idempotency_token;
        byteString.getClass();
        return new CreateLightningInvoiceResponse(str, str2, lightningReceiveArtifact2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateLightningInvoiceResponse createLightningInvoiceResponse = (CreateLightningInvoiceResponse) obj;
        createLightningInvoiceResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, createLightningInvoiceResponse.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, createLightningInvoiceResponse.idempotency_token);
        LightningReceiveArtifact.ADAPTER.encodeWithTag(protoWriter, 3, createLightningInvoiceResponse.lightning);
        protoWriter.writeBytes(createLightningInvoiceResponse.unknownFields());
    }
}
