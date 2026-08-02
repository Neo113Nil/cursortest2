package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepareUserOpResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepareUserOpResponse((ByteString) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(SignatureRequest.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepareUserOpResponse prepareUserOpResponse = (PrepareUserOpResponse) obj;
        reverseProtoWriter.getClass();
        prepareUserOpResponse.getClass();
        reverseProtoWriter.writeBytes(prepareUserOpResponse.unknownFields());
        SignatureRequest.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, prepareUserOpResponse.signature_requests);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, prepareUserOpResponse.prepared_calls);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepareUserOpResponse prepareUserOpResponse = (PrepareUserOpResponse) obj;
        prepareUserOpResponse.getClass();
        return SignatureRequest.ADAPTER.asRepeated().encodedSizeWithTag(2, prepareUserOpResponse.signature_requests) + ProtoAdapter.BYTES.encodedSizeWithTag(1, prepareUserOpResponse.prepared_calls) + prepareUserOpResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepareUserOpResponse prepareUserOpResponse = (PrepareUserOpResponse) obj;
        prepareUserOpResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(prepareUserOpResponse.signature_requests, SignatureRequest.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = prepareUserOpResponse.prepared_calls;
        byteString.getClass();
        return new PrepareUserOpResponse(byteString2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepareUserOpResponse prepareUserOpResponse = (PrepareUserOpResponse) obj;
        prepareUserOpResponse.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, prepareUserOpResponse.prepared_calls);
        SignatureRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, prepareUserOpResponse.signature_requests);
        protoWriter.writeBytes(prepareUserOpResponse.unknownFields());
    }
}
